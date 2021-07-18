//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlin.collections.MutableList

/**
 * Value
 *
 * Generated from 'iroha_data_model::Value' enum
 */
public sealed class Value {
  /**
   * @return Discriminator of variant in enum
   */
  public abstract fun discriminant(): Int

  /**
   * 'U32' variant
   */
  public class U32(
    private val u32: UInt
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<U32>, ScaleWriter<U32> {
      public const val DISCRIMINANT: Int = 0

      public override fun read(reader: ScaleCodecReader): U32 =
          U32(jp.co.soramitsu.iroha2.scale.UInt32Reader.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: U32): Unit {
        UInt.write(writer, instance.u32)
      }
    }
  }

  /**
   * 'Bool' variant
   */
  public class Bool(
    private val bool: Boolean
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Bool>, ScaleWriter<Bool> {
      public const val DISCRIMINANT: Int = 1

      public override fun read(reader: ScaleCodecReader): Bool =
          Bool(jp.co.soramitsu.iroha2.scale.BooleanReader.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: Bool): Unit {
        writer.writeByte(if (instance.bool) {1} else {0})
      }
    }
  }

  /**
   * 'String' variant
   */
  public class String(
    private val string: kotlin.String
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<String>, ScaleWriter<String> {
      public const val DISCRIMINANT: Int = 2

      public override fun read(reader: ScaleCodecReader): String =
          String(jp.co.soramitsu.iroha2.scale.StringReader.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: String): Unit {
        writer.writeAsList(instance.string.encodeToByteArray())
      }
    }
  }

  /**
   * 'Vec' variant
   */
  public class Vec(
    private val vec: MutableList<Value>
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Vec>, ScaleWriter<Vec> {
      public const val DISCRIMINANT: Int = 3

      public override fun read(reader: ScaleCodecReader): Vec =
          Vec(io.emeraldpay.polkaj.scale.reader.ListReader(jp.co.soramitsu.iroha2.generated.datamodel.Value).read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: Vec): Unit {
        writer.write(io.emeraldpay.polkaj.scale.writer.ListWriter(Value), instance.vec)
      }
    }
  }

  /**
   * 'Id' variant
   */
  public class Id(
    private val idBox: IdBox
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Id>, ScaleWriter<Id> {
      public const val DISCRIMINANT: Int = 4

      public override fun read(reader: ScaleCodecReader): Id = Id(IdBox.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: Id): Unit {
        IdBox.write(writer, instance.idBox)
      }
    }
  }

  /**
   * 'Identifiable' variant
   */
  public class Identifiable(
    private val identifiableBox: IdentifiableBox
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Identifiable>, ScaleWriter<Identifiable> {
      public const val DISCRIMINANT: Int = 5

      public override fun read(reader: ScaleCodecReader): Identifiable =
          Identifiable(IdentifiableBox.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: Identifiable): Unit {
        IdentifiableBox.write(writer, instance.identifiableBox)
      }
    }
  }

  /**
   * 'PublicKey' variant
   */
  public class PublicKey(
    private val publicKey: jp.co.soramitsu.iroha2.generated.crypto.PublicKey
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<PublicKey>, ScaleWriter<PublicKey> {
      public const val DISCRIMINANT: Int = 6

      public override fun read(reader: ScaleCodecReader): PublicKey =
          PublicKey(PublicKey.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: PublicKey): Unit {
        PublicKey.write(writer, instance.publicKey)
      }
    }
  }

  /**
   * 'Parameter' variant
   */
  public class Parameter(
    private val parameter: jp.co.soramitsu.iroha2.generated.datamodel.Parameter
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Parameter>, ScaleWriter<Parameter> {
      public const val DISCRIMINANT: Int = 7

      public override fun read(reader: ScaleCodecReader): Parameter =
          Parameter(Parameter.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: Parameter): Unit {
        Parameter.write(writer, instance.parameter)
      }
    }
  }

  /**
   * 'SignatureCheckCondition' variant
   */
  public class SignatureCheckCondition(
    private val signatureCheckCondition:
        jp.co.soramitsu.iroha2.generated.datamodel.account.SignatureCheckCondition
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<SignatureCheckCondition>,
        ScaleWriter<SignatureCheckCondition> {
      public const val DISCRIMINANT: Int = 8

      public override fun read(reader: ScaleCodecReader): SignatureCheckCondition =
          SignatureCheckCondition(SignatureCheckCondition.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: SignatureCheckCondition): Unit {
        SignatureCheckCondition.write(writer, instance.signatureCheckCondition)
      }
    }
  }

  /**
   * 'TransactionValue' variant
   */
  public class TransactionValue(
    private val transactionValue:
        jp.co.soramitsu.iroha2.generated.datamodel.transaction.TransactionValue
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<TransactionValue>, ScaleWriter<TransactionValue> {
      public const val DISCRIMINANT: Int = 9

      public override fun read(reader: ScaleCodecReader): TransactionValue =
          TransactionValue(TransactionValue.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: TransactionValue): Unit {
        TransactionValue.write(writer, instance.transactionValue)
      }
    }
  }

  /**
   * 'PermissionToken' variant
   */
  public class PermissionToken(
    private val permissionToken:
        jp.co.soramitsu.iroha2.generated.datamodel.permissions.PermissionToken
  ) : Value() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<PermissionToken>, ScaleWriter<PermissionToken> {
      public const val DISCRIMINANT: Int = 10

      public override fun read(reader: ScaleCodecReader): PermissionToken =
          PermissionToken(PermissionToken.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: PermissionToken): Unit {
        PermissionToken.write(writer, instance.permissionToken)
      }
    }
  }

  public companion object : ScaleReader<Value>, ScaleWriter<Value> {
    public override fun read(reader: ScaleCodecReader): Value = when(val discriminant =
        reader.readUByte()) {
    	0 -> U32.read(reader)
    	1 -> Bool.read(reader)
    	2 -> String.read(reader)
    	3 -> Vec.read(reader)
    	4 -> Id.read(reader)
    	5 -> Identifiable.read(reader)
    	6 -> PublicKey.read(reader)
    	7 -> Parameter.read(reader)
    	8 -> SignatureCheckCondition.read(reader)
    	9 -> TransactionValue.read(reader)
    	10 -> PermissionToken.read(reader)
    	else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")}

    public override fun write(writer: ScaleCodecWriter, instance: Value): Unit {
      writer.directWrite(instance.discriminant())
      when(val discriminant = instance.discriminant()) {
      	0 -> U32.write(writer, instance as U32)
      	1 -> Bool.write(writer, instance as Bool)
      	2 -> String.write(writer, instance as String)
      	3 -> Vec.write(writer, instance as Vec)
      	4 -> Id.write(writer, instance as Id)
      	5 -> Identifiable.write(writer, instance as Identifiable)
      	6 -> PublicKey.write(writer, instance as PublicKey)
      	7 -> Parameter.write(writer, instance as Parameter)
      	8 -> SignatureCheckCondition.write(writer, instance as SignatureCheckCondition)
      	9 -> TransactionValue.write(writer, instance as TransactionValue)
      	10 -> PermissionToken.write(writer, instance as PermissionToken)
      	else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")}
    }
  }
}
