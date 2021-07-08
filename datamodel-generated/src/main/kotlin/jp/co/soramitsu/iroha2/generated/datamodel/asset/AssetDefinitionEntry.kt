// Do not change. Autogenerated code
package jp.co.soramitsu.iroha2.generated.datamodel.asset

import jp.co.soramitsu.iroha2.generated.datamodel.account.Id
import kotlin.String

/**
 * AssetDefinitionEntry
 *
 * Matched to regular structure in Rust
 */
public class AssetDefinitionEntry(
  private val definition: AssetDefinition,
  private val registeredBy: Id
) {
  public companion object {
    public const val IROHA_FULL_NAME: String = "iroha_data_model::asset::AssetDefinitionEntry"
  }
}