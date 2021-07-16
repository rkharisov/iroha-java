//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.permissions

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.Value
import kotlin.String
import kotlin.Unit
import kotlin.collections.MutableMap

/**
 * PermissionToken
 *
 * Generated from 'iroha_data_model::permissions::PermissionToken' regular structure
 */
public class PermissionToken(
  public val name: String,
  public val params: MutableMap<String, Value>
) {
  public companion object : ScaleReader<PermissionToken>, ScaleWriter<PermissionToken> {
    public override fun read(reader: ScaleCodecReader): PermissionToken =
        PermissionToken(reader.readString(),
    String.read(reader))

    public override fun write(writer: ScaleCodecWriter, instance: PermissionToken): Unit {
      writer.writeAsList(instance.name.encodeToByteArray())
      String.write(writer, instance.params)
    }
  }
}
