package jp.co.soramitsu.iroha2.parse

import jp.co.soramitsu.iroha2.type.*

class TypeResolver(private val schemaParser: SchemaParser) {

    private val resolvers = listOf<Resolver<*>>(
        BooleanResolver,
        MapResolver,
        OptionResolver,
        VectorResolver,
        ArrayResolver,
        EnumResolver,
        TupleStructResolver,
        StructResolver,
        StringResolver,
        CompactResolver,
        UIntResolver,
    )

    fun resolve(name: String, typeValue: Any): TypeNest {
        val candidates = resolvers
            .asSequence()
            .mapNotNull { it.resolve(name, typeValue, schemaParser) }
            .map { TypeNest(it.name, it) }
            .toSet()
        if (candidates.size != 1) {
            throw RuntimeException(
                "Expected exactly one candidate for ($name: $typeValue)," +
                        " but got ${candidates.size}: $candidates"
            )
        }
        return candidates.first()
    }
}

interface Resolver<T : Type> {
    fun resolve(name: String, typeValue: Any, schemaParser: SchemaParser): T?
}

object BooleanResolver : Resolver<BooleanType> {
    override fun resolve(name: String, typeValue: Any, schemaParser: SchemaParser): BooleanType? {
        return if (name == "bool") {
            BooleanType
        } else null
    }
}

object MapResolver : Resolver<MapType> {
    override fun resolve(name: String, typeValue: Any, schemaParser: SchemaParser): MapType? {
        if (!name.startsWith("BTreeMap<")) return null
        val wildcards = name.removePrefix("BTreeMap")
            .removeSurrounding("<", ">")
            .split(',')
        if (wildcards.size != 2) return null
        return MapType(
            name,
            schemaParser.getOrCreate(wildcards[0]),
            schemaParser.getOrCreate(wildcards[1])
        )
    }
}

abstract class WrapperResolver<T : Type>(private val wrapperName: String) : Resolver<T> {
    override fun resolve(name: String, typeValue: Any, schemaParser: SchemaParser): T? {
        if (!name.startsWith("$wrapperName<")) return null
        val innerTypeName = name.removeSurrounding("$wrapperName<", ">")
        val innerType = schemaParser.getOrCreate(innerTypeName)
        return createWrapper(name, innerType)
    }

    abstract fun createWrapper(name: String, innerType: TypeNest): T

}

object OptionResolver : WrapperResolver<OptionType>("Option") {
    override fun createWrapper(name: String, innerType: TypeNest) = OptionType(name, innerType)
}

object VectorResolver : WrapperResolver<VecType>("Vec") {
    override fun createWrapper(name: String, innerType: TypeNest) = VecType(name, innerType)
}

object ArrayResolver : Resolver<ArrayType> {

    private val REGEX by lazy { "\\[(\\S+); (\\d+)\\]".toRegex() }

    override fun resolve(name: String, typeValue: Any, schemaParser: SchemaParser): ArrayType? {
        if (!name.startsWith("[")) return null;
        val groups = REGEX.find(name)?.groupValues ?: return null
        return ArrayType(name, schemaParser.getOrCreate(groups[1]), groups[2].toUInt())
    }

}

object EnumResolver : Resolver<EnumType> {
    override fun resolve(name: String, typeValue: Any, schemaParser: SchemaParser): EnumType? {
        return if (typeValue is Map<*, *> && typeValue["Enum"] != null) {
            val components = (typeValue["Enum"] as Map<String, List<Map<String, Any>>>)["variants"]
                ?: return null
            val variants = components.map {
                val variantProperty = it["ty"] as String?
                EnumType.Variant(
                    it["name"]!! as String,
                    (it["discriminant"]!! as Double).toInt(),
                    variantProperty?.let(schemaParser::getOrCreate)
                )
            }
            EnumType(name, variants)
        } else null
    }
}

object TupleStructResolver : Resolver<TupleStructType> {
    override fun resolve(
        name: String,
        typeValue: Any,
        schemaParser: SchemaParser
    ): TupleStructType? {
        return if (typeValue is Map<*, *> && typeValue["TupleStruct"] != null) {
            val components = (typeValue["TupleStruct"] as Map<String, List<String>>)["types"]!!
            val children = components.map { schemaParser.getOrCreate(it) }
            TupleStructType(name, children)
        } else null
    }
}

object StructResolver : Resolver<StructType> {
    override fun resolve(name: String, typeValue: Any, schemaParser: SchemaParser): StructType? {
        return if (typeValue is Map<*, *> && typeValue["Struct"] != null) {
            val components =
                (typeValue["Struct"] as Map<String, List<Map<String, String>>>)["declarations"]!!
            val children = LinkedHashMap<String, TypeNest>()
            for (singleMapping in components) {
                val fieldName = singleMapping["name"]!!
                val fieldType = singleMapping["ty"]!!
                children[fieldName] = schemaParser.getOrCreate(fieldType)
            }
            StructType(name, children)
        } else null
    }
}

object StringResolver : Resolver<StringType> {
    override fun resolve(name: String, typeValue: Any, schemaParser: SchemaParser): StringType? {
        return if (name.startsWith("String")) {
            StringType
        } else null
    }
}

object CompactResolver : WrapperResolver<CompactType>("iroha_schema::Compact") {
    override fun createWrapper(name: String, innerType: TypeNest) = CompactType(name, innerType)
}

object UIntResolver : Resolver<UIntType> {
    override fun resolve(name: String, typeValue: Any, schemaParser: SchemaParser): UIntType? {
        return when (name) {
            "u8" -> U8Type
            "u16" -> U16Type
            "u32" -> U32Type
            "u64" -> U64Type
            "u128" -> U128Type
            "u256" -> U256Type
            else -> null
        }
    }
}

class TypeNest(val name: String, var value: Type?) {
    fun requireValue() = value ?: throw IllegalArgumentException("TypeReference is null")
    override fun toString(): String {
        return "TypeNest(name='$name', value=$value)"
    }
}