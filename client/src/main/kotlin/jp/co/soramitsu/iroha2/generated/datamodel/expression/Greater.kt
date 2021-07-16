//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.expression

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.UInt
import kotlin.Unit

/**
 * Greater
 *
 * Generated from 'iroha_data_model::expression::Greater' regular structure
 */
public class Greater(
  public val left: EvaluatesTo<UInt>,
  public val right: EvaluatesTo<UInt>
) {
  public companion object : ScaleReader<Greater>, ScaleWriter<Greater> {
    public override fun read(reader: ScaleCodecReader): Greater = Greater(UInt.read(reader),
    UInt.read(reader))

    public override fun write(writer: ScaleCodecWriter, instance: Greater): Unit {
      UInt.write(writer, instance.left)
      UInt.write(writer, instance.right)
    }
  }
}
