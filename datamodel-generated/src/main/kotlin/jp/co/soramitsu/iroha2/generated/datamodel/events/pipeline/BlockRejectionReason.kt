// Do not change. Autogenerated code
package jp.co.soramitsu.iroha2.generated.datamodel.events.pipeline

import kotlin.Int
import kotlin.String

/**
 * BlockRejectionReason
 *
 * Matched to enum in Rust
 */
public abstract class BlockRejectionReason {
  public companion object {
    public const val IROHA_FULL_NAME: String =
        "iroha_data_model::events::pipeline::BlockRejectionReason"
  }

  /**
   * 'ConsensusBlockRejection' variant
   */
  public class ConsensusBlockRejection : BlockRejectionReason() {
    public companion object {
      public const val DISCRIMINANT: Int = 0
    }
  }
}