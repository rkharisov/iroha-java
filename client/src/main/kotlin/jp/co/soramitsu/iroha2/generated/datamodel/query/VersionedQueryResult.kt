//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.query

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.Int
import kotlin.Unit

/**
 * VersionedQueryResult
 *
 * Generated from 'iroha_data_model::query::VersionedQueryResult' enum
 */
public sealed class VersionedQueryResult {
  /**
   * @return Discriminator of variant in enum
   */
  public abstract fun discriminant(): Int

  /**
   * 'V1' variant
   */
  public class V1(
    private val v1: _VersionedQueryResultV1
  ) : VersionedQueryResult() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<V1>, ScaleWriter<V1> {
      public const val DISCRIMINANT: Int = 1

      public override fun read(reader: ScaleCodecReader): V1 {
      }

      public override fun write(writer: ScaleCodecWriter, instance: V1): Unit {
      }
    }
  }

  public companion object : ScaleReader<VersionedQueryResult>, ScaleWriter<VersionedQueryResult> {
    public override fun read(reader: ScaleCodecReader): VersionedQueryResult = when(val discriminant
        = reader.readUByte()) {
    	1 -> V1.read(reader)
    	else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")}

    public override fun write(writer: ScaleCodecWriter, instance: VersionedQueryResult): Unit {
      writer.directWrite(instance.discriminant())
      when(val discriminant = instance.discriminant()) {
      	1 -> V1.write(writer, instance as V1)
      	else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")}
    }
  }
}
