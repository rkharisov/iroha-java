//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.query.asset

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.Unit

/**
 * FindAllAssets
 *
 * Generated from 'iroha_data_model::query::asset::FindAllAssets' regular structure
 */
public class FindAllAssets {
  public companion object : ScaleReader<FindAllAssets>, ScaleWriter<FindAllAssets> {
    public override fun read(reader: ScaleCodecReader): FindAllAssets = FindAllAssets()

    public override fun write(writer: ScaleCodecWriter, instance: FindAllAssets): Unit {
    }
  }
}
