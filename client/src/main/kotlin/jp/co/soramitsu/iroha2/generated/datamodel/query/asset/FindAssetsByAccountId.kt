//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.query.asset

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.account.Id
import jp.co.soramitsu.iroha2.generated.datamodel.expression.EvaluatesTo
import kotlin.Unit

/**
 * FindAssetsByAccountId
 *
 * Generated from 'iroha_data_model::query::asset::FindAssetsByAccountId' regular structure
 */
public class FindAssetsByAccountId(
  public val accountId: EvaluatesTo<Id>
) {
  public companion object : ScaleReader<FindAssetsByAccountId>, ScaleWriter<FindAssetsByAccountId> {
    public override fun read(reader: ScaleCodecReader): FindAssetsByAccountId =
        FindAssetsByAccountId(Id.read(reader))

    public override fun write(writer: ScaleCodecWriter, instance: FindAssetsByAccountId): Unit {
      Id.write(writer, instance.accountId)
    }
  }
}
