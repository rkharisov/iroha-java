//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.query.account

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import jp.co.soramitsu.iroha2.generated.datamodel.expression.EvaluatesTo
import kotlin.String
import kotlin.Unit

/**
 * FindAccountsByDomainName
 *
 * Generated from 'iroha_data_model::query::account::FindAccountsByDomainName' regular structure
 */
public class FindAccountsByDomainName(
  public val domainName: EvaluatesTo<String>
) {
  public companion object : ScaleReader<FindAccountsByDomainName>,
      ScaleWriter<FindAccountsByDomainName> {
    public override fun read(reader: ScaleCodecReader): FindAccountsByDomainName =
        FindAccountsByDomainName(String.read(reader))

    public override fun write(writer: ScaleCodecWriter, instance: FindAccountsByDomainName): Unit {
      String.write(writer, instance.domainName)
    }
  }
}
