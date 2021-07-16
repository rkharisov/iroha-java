//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.isi

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.Unit
import kotlin.collections.MutableList

/**
 * SequenceBox
 *
 * Generated from 'iroha_data_model::isi::SequenceBox' regular structure
 */
public class SequenceBox(
  public val instructions: MutableList<Instruction>
) {
  public companion object : ScaleReader<SequenceBox>, ScaleWriter<SequenceBox> {
    public override fun read(reader: ScaleCodecReader): SequenceBox =
        SequenceBox(reader.read(io.emeraldpay.polkaj.scale.reader.ListReader(Instruction)))

    public override fun write(writer: ScaleCodecWriter, instance: SequenceBox): Unit {
      writer.write(io.emeraldpay.polkaj.scale.writer.ListWriter, instance.instructions)
    }
  }
}
