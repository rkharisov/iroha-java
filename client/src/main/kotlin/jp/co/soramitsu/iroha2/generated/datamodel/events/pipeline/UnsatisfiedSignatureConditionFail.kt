//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.events.pipeline

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.String
import kotlin.Unit

/**
 * UnsatisfiedSignatureConditionFail
 *
 * Generated from 'iroha_data_model::events::pipeline::UnsatisfiedSignatureConditionFail' regular
 * structure
 */
public class UnsatisfiedSignatureConditionFail(
  public val reason: String
) {
  public companion object : ScaleReader<UnsatisfiedSignatureConditionFail>,
      ScaleWriter<UnsatisfiedSignatureConditionFail> {
    public override fun read(reader: ScaleCodecReader): UnsatisfiedSignatureConditionFail =
        UnsatisfiedSignatureConditionFail(jp.co.soramitsu.iroha2.scale.StringReader.read(reader))

    public override fun write(writer: ScaleCodecWriter,
        instance: UnsatisfiedSignatureConditionFail): Unit {
      writer.writeAsList(instance.reason.encodeToByteArray())
    }
  }
}
