// Do not change. Autogenerated code
package jp.co.soramitsu.iroha2.generated.datamodel

import kotlin.Int
import kotlin.String

/**
 * Parameter
 *
 * Matched to enum in Rust
 */
public abstract class Parameter {
  public companion object {
    public const val IROHA_FULL_NAME: String = "iroha_data_model::Parameter"
  }

  /**
   * 'MaximumFaultyPeersAmount' variant
   */
  public class MaximumFaultyPeersAmount(
    private val maximumFaultyPeersAmount: Int
  ) : Parameter() {
    public companion object {
      public const val DISCRIMINANT: Int = 0
    }
  }

  /**
   * 'BlockTime' variant
   */
  public class BlockTime(
    private val blockTime: Int
  ) : Parameter() {
    public companion object {
      public const val DISCRIMINANT: Int = 1
    }
  }

  /**
   * 'CommitTime' variant
   */
  public class CommitTime(
    private val commitTime: Int
  ) : Parameter() {
    public companion object {
      public const val DISCRIMINANT: Int = 2
    }
  }

  /**
   * 'TransactionReceiptTime' variant
   */
  public class TransactionReceiptTime(
    private val transactionReceiptTime: Int
  ) : Parameter() {
    public companion object {
      public const val DISCRIMINANT: Int = 3
    }
  }
}