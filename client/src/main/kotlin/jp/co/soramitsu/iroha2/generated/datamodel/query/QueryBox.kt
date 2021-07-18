//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.query

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.Int
import kotlin.Unit

/**
 * QueryBox
 *
 * Generated from 'iroha_data_model::query::QueryBox' enum
 */
public sealed class QueryBox {
  /**
   * @return Discriminator of variant in enum
   */
  public abstract fun discriminant(): Int

  /**
   * 'FindAllAccounts' variant
   */
  public class FindAllAccounts(
    private val findAllAccounts:
        jp.co.soramitsu.iroha2.generated.datamodel.query.account.FindAllAccounts
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAllAccounts>, ScaleWriter<FindAllAccounts> {
      public const val DISCRIMINANT: Int = 0

      public override fun read(reader: ScaleCodecReader): FindAllAccounts =
          FindAllAccounts(FindAllAccounts.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAllAccounts): Unit {
        FindAllAccounts.write(writer, instance.findAllAccounts)
      }
    }
  }

  /**
   * 'FindAccountById' variant
   */
  public class FindAccountById(
    private val findAccountById:
        jp.co.soramitsu.iroha2.generated.datamodel.query.account.FindAccountById
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAccountById>, ScaleWriter<FindAccountById> {
      public const val DISCRIMINANT: Int = 1

      public override fun read(reader: ScaleCodecReader): FindAccountById =
          FindAccountById(FindAccountById.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAccountById): Unit {
        FindAccountById.write(writer, instance.findAccountById)
      }
    }
  }

  /**
   * 'FindAccountKeyValueByIdAndKey' variant
   */
  public class FindAccountKeyValueByIdAndKey(
    private val findAccountKeyValueByIdAndKey:
        jp.co.soramitsu.iroha2.generated.datamodel.query.account.FindAccountKeyValueByIdAndKey
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAccountKeyValueByIdAndKey>,
        ScaleWriter<FindAccountKeyValueByIdAndKey> {
      public const val DISCRIMINANT: Int = 2

      public override fun read(reader: ScaleCodecReader): FindAccountKeyValueByIdAndKey =
          FindAccountKeyValueByIdAndKey(FindAccountKeyValueByIdAndKey.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAccountKeyValueByIdAndKey):
          Unit {
        FindAccountKeyValueByIdAndKey.write(writer, instance.findAccountKeyValueByIdAndKey)
      }
    }
  }

  /**
   * 'FindAccountsByName' variant
   */
  public class FindAccountsByName(
    private val findAccountsByName:
        jp.co.soramitsu.iroha2.generated.datamodel.query.account.FindAccountsByName
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAccountsByName>, ScaleWriter<FindAccountsByName> {
      public const val DISCRIMINANT: Int = 3

      public override fun read(reader: ScaleCodecReader): FindAccountsByName =
          FindAccountsByName(FindAccountsByName.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAccountsByName): Unit {
        FindAccountsByName.write(writer, instance.findAccountsByName)
      }
    }
  }

  /**
   * 'FindAccountsByDomainName' variant
   */
  public class FindAccountsByDomainName(
    private val findAccountsByDomainName:
        jp.co.soramitsu.iroha2.generated.datamodel.query.account.FindAccountsByDomainName
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAccountsByDomainName>,
        ScaleWriter<FindAccountsByDomainName> {
      public const val DISCRIMINANT: Int = 4

      public override fun read(reader: ScaleCodecReader): FindAccountsByDomainName =
          FindAccountsByDomainName(FindAccountsByDomainName.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAccountsByDomainName):
          Unit {
        FindAccountsByDomainName.write(writer, instance.findAccountsByDomainName)
      }
    }
  }

  /**
   * 'FindAllAssets' variant
   */
  public class FindAllAssets(
    private val findAllAssets: jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAllAssets
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAllAssets>, ScaleWriter<FindAllAssets> {
      public const val DISCRIMINANT: Int = 5

      public override fun read(reader: ScaleCodecReader): FindAllAssets =
          FindAllAssets(FindAllAssets.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAllAssets): Unit {
        FindAllAssets.write(writer, instance.findAllAssets)
      }
    }
  }

  /**
   * 'FindAllAssetsDefinitions' variant
   */
  public class FindAllAssetsDefinitions(
    private val findAllAssetsDefinitions:
        jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAllAssetsDefinitions
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAllAssetsDefinitions>,
        ScaleWriter<FindAllAssetsDefinitions> {
      public const val DISCRIMINANT: Int = 6

      public override fun read(reader: ScaleCodecReader): FindAllAssetsDefinitions =
          FindAllAssetsDefinitions(FindAllAssetsDefinitions.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAllAssetsDefinitions):
          Unit {
        FindAllAssetsDefinitions.write(writer, instance.findAllAssetsDefinitions)
      }
    }
  }

  /**
   * 'FindAssetById' variant
   */
  public class FindAssetById(
    private val findAssetById: jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAssetById
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAssetById>, ScaleWriter<FindAssetById> {
      public const val DISCRIMINANT: Int = 7

      public override fun read(reader: ScaleCodecReader): FindAssetById =
          FindAssetById(FindAssetById.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAssetById): Unit {
        FindAssetById.write(writer, instance.findAssetById)
      }
    }
  }

  /**
   * 'FindAssetsByName' variant
   */
  public class FindAssetsByName(
    private val findAssetsByName:
        jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAssetsByName
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAssetsByName>, ScaleWriter<FindAssetsByName> {
      public const val DISCRIMINANT: Int = 8

      public override fun read(reader: ScaleCodecReader): FindAssetsByName =
          FindAssetsByName(FindAssetsByName.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAssetsByName): Unit {
        FindAssetsByName.write(writer, instance.findAssetsByName)
      }
    }
  }

  /**
   * 'FindAssetsByAccountId' variant
   */
  public class FindAssetsByAccountId(
    private val findAssetsByAccountId:
        jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAssetsByAccountId
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAssetsByAccountId>, ScaleWriter<FindAssetsByAccountId>
        {
      public const val DISCRIMINANT: Int = 9

      public override fun read(reader: ScaleCodecReader): FindAssetsByAccountId =
          FindAssetsByAccountId(FindAssetsByAccountId.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAssetsByAccountId): Unit {
        FindAssetsByAccountId.write(writer, instance.findAssetsByAccountId)
      }
    }
  }

  /**
   * 'FindAssetsByAssetDefinitionId' variant
   */
  public class FindAssetsByAssetDefinitionId(
    private val findAssetsByAssetDefinitionId:
        jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAssetsByAssetDefinitionId
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAssetsByAssetDefinitionId>,
        ScaleWriter<FindAssetsByAssetDefinitionId> {
      public const val DISCRIMINANT: Int = 10

      public override fun read(reader: ScaleCodecReader): FindAssetsByAssetDefinitionId =
          FindAssetsByAssetDefinitionId(FindAssetsByAssetDefinitionId.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAssetsByAssetDefinitionId):
          Unit {
        FindAssetsByAssetDefinitionId.write(writer, instance.findAssetsByAssetDefinitionId)
      }
    }
  }

  /**
   * 'FindAssetsByDomainName' variant
   */
  public class FindAssetsByDomainName(
    private val findAssetsByDomainName:
        jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAssetsByDomainName
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAssetsByDomainName>,
        ScaleWriter<FindAssetsByDomainName> {
      public const val DISCRIMINANT: Int = 11

      public override fun read(reader: ScaleCodecReader): FindAssetsByDomainName =
          FindAssetsByDomainName(FindAssetsByDomainName.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAssetsByDomainName): Unit {
        FindAssetsByDomainName.write(writer, instance.findAssetsByDomainName)
      }
    }
  }

  /**
   * 'FindAssetsByAccountIdAndAssetDefinitionId' variant
   */
  public class FindAssetsByAccountIdAndAssetDefinitionId(
    private val findAssetsByAccountIdAndAssetDefinitionId:
        jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAssetsByAccountIdAndAssetDefinitionId
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAssetsByAccountIdAndAssetDefinitionId>,
        ScaleWriter<FindAssetsByAccountIdAndAssetDefinitionId> {
      public const val DISCRIMINANT: Int = 12

      public override fun read(reader: ScaleCodecReader): FindAssetsByAccountIdAndAssetDefinitionId
          =
          FindAssetsByAccountIdAndAssetDefinitionId(FindAssetsByAccountIdAndAssetDefinitionId.read(reader))

      public override fun write(writer: ScaleCodecWriter,
          instance: FindAssetsByAccountIdAndAssetDefinitionId): Unit {
        FindAssetsByAccountIdAndAssetDefinitionId.write(writer,
            instance.findAssetsByAccountIdAndAssetDefinitionId)
      }
    }
  }

  /**
   * 'FindAssetsByDomainNameAndAssetDefinitionId' variant
   */
  public class FindAssetsByDomainNameAndAssetDefinitionId(
    private val findAssetsByDomainNameAndAssetDefinitionId:
        jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAssetsByDomainNameAndAssetDefinitionId
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAssetsByDomainNameAndAssetDefinitionId>,
        ScaleWriter<FindAssetsByDomainNameAndAssetDefinitionId> {
      public const val DISCRIMINANT: Int = 13

      public override fun read(reader: ScaleCodecReader): FindAssetsByDomainNameAndAssetDefinitionId
          =
          FindAssetsByDomainNameAndAssetDefinitionId(FindAssetsByDomainNameAndAssetDefinitionId.read(reader))

      public override fun write(writer: ScaleCodecWriter,
          instance: FindAssetsByDomainNameAndAssetDefinitionId): Unit {
        FindAssetsByDomainNameAndAssetDefinitionId.write(writer,
            instance.findAssetsByDomainNameAndAssetDefinitionId)
      }
    }
  }

  /**
   * 'FindAssetQuantityById' variant
   */
  public class FindAssetQuantityById(
    private val findAssetQuantityById:
        jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAssetQuantityById
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAssetQuantityById>, ScaleWriter<FindAssetQuantityById>
        {
      public const val DISCRIMINANT: Int = 14

      public override fun read(reader: ScaleCodecReader): FindAssetQuantityById =
          FindAssetQuantityById(FindAssetQuantityById.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAssetQuantityById): Unit {
        FindAssetQuantityById.write(writer, instance.findAssetQuantityById)
      }
    }
  }

  /**
   * 'FindAssetKeyValueByIdAndKey' variant
   */
  public class FindAssetKeyValueByIdAndKey(
    private val findAssetKeyValueByIdAndKey:
        jp.co.soramitsu.iroha2.generated.datamodel.query.asset.FindAssetKeyValueByIdAndKey
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAssetKeyValueByIdAndKey>,
        ScaleWriter<FindAssetKeyValueByIdAndKey> {
      public const val DISCRIMINANT: Int = 15

      public override fun read(reader: ScaleCodecReader): FindAssetKeyValueByIdAndKey =
          FindAssetKeyValueByIdAndKey(FindAssetKeyValueByIdAndKey.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAssetKeyValueByIdAndKey):
          Unit {
        FindAssetKeyValueByIdAndKey.write(writer, instance.findAssetKeyValueByIdAndKey)
      }
    }
  }

  /**
   * 'FindAllDomains' variant
   */
  public class FindAllDomains(
    private val findAllDomains:
        jp.co.soramitsu.iroha2.generated.datamodel.query.domain.FindAllDomains
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAllDomains>, ScaleWriter<FindAllDomains> {
      public const val DISCRIMINANT: Int = 16

      public override fun read(reader: ScaleCodecReader): FindAllDomains =
          FindAllDomains(FindAllDomains.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAllDomains): Unit {
        FindAllDomains.write(writer, instance.findAllDomains)
      }
    }
  }

  /**
   * 'FindDomainByName' variant
   */
  public class FindDomainByName(
    private val findDomainByName:
        jp.co.soramitsu.iroha2.generated.datamodel.query.domain.FindDomainByName
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindDomainByName>, ScaleWriter<FindDomainByName> {
      public const val DISCRIMINANT: Int = 17

      public override fun read(reader: ScaleCodecReader): FindDomainByName =
          FindDomainByName(FindDomainByName.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindDomainByName): Unit {
        FindDomainByName.write(writer, instance.findDomainByName)
      }
    }
  }

  /**
   * 'FindAllPeers' variant
   */
  public class FindAllPeers(
    private val findAllPeers: jp.co.soramitsu.iroha2.generated.datamodel.query.peer.FindAllPeers
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindAllPeers>, ScaleWriter<FindAllPeers> {
      public const val DISCRIMINANT: Int = 18

      public override fun read(reader: ScaleCodecReader): FindAllPeers =
          FindAllPeers(FindAllPeers.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindAllPeers): Unit {
        FindAllPeers.write(writer, instance.findAllPeers)
      }
    }
  }

  /**
   * 'FindTransactionsByAccountId' variant
   */
  public class FindTransactionsByAccountId(
    private val findTransactionsByAccountId:
        jp.co.soramitsu.iroha2.generated.datamodel.query.transaction.FindTransactionsByAccountId
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindTransactionsByAccountId>,
        ScaleWriter<FindTransactionsByAccountId> {
      public const val DISCRIMINANT: Int = 19

      public override fun read(reader: ScaleCodecReader): FindTransactionsByAccountId =
          FindTransactionsByAccountId(FindTransactionsByAccountId.read(reader))

      public override fun write(writer: ScaleCodecWriter, instance: FindTransactionsByAccountId):
          Unit {
        FindTransactionsByAccountId.write(writer, instance.findTransactionsByAccountId)
      }
    }
  }

  /**
   * 'FindPermissionTokensByAccountId' variant
   */
  public class FindPermissionTokensByAccountId(
    private val findPermissionTokensByAccountId:
        jp.co.soramitsu.iroha2.generated.datamodel.query.permissions.FindPermissionTokensByAccountId
  ) {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<FindPermissionTokensByAccountId>,
        ScaleWriter<FindPermissionTokensByAccountId> {
      public const val DISCRIMINANT: Int = 20

      public override fun read(reader: ScaleCodecReader): FindPermissionTokensByAccountId =
          FindPermissionTokensByAccountId(FindPermissionTokensByAccountId.read(reader))

      public override fun write(writer: ScaleCodecWriter,
          instance: FindPermissionTokensByAccountId): Unit {
        FindPermissionTokensByAccountId.write(writer, instance.findPermissionTokensByAccountId)
      }
    }
  }

  public companion object : ScaleReader<QueryBox>, ScaleWriter<QueryBox> {
    public override fun read(reader: ScaleCodecReader): QueryBox = when(val discriminant =
        reader.readUByte()) {
    	0 -> FindAllAccounts.read(reader)
    	1 -> FindAccountById.read(reader)
    	2 -> FindAccountKeyValueByIdAndKey.read(reader)
    	3 -> FindAccountsByName.read(reader)
    	4 -> FindAccountsByDomainName.read(reader)
    	5 -> FindAllAssets.read(reader)
    	6 -> FindAllAssetsDefinitions.read(reader)
    	7 -> FindAssetById.read(reader)
    	8 -> FindAssetsByName.read(reader)
    	9 -> FindAssetsByAccountId.read(reader)
    	10 -> FindAssetsByAssetDefinitionId.read(reader)
    	11 -> FindAssetsByDomainName.read(reader)
    	12 -> FindAssetsByAccountIdAndAssetDefinitionId.read(reader)
    	13 -> FindAssetsByDomainNameAndAssetDefinitionId.read(reader)
    	14 -> FindAssetQuantityById.read(reader)
    	15 -> FindAssetKeyValueByIdAndKey.read(reader)
    	16 -> FindAllDomains.read(reader)
    	17 -> FindDomainByName.read(reader)
    	18 -> FindAllPeers.read(reader)
    	19 -> FindTransactionsByAccountId.read(reader)
    	20 -> FindPermissionTokensByAccountId.read(reader)
    	else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")}

    public override fun write(writer: ScaleCodecWriter, instance: QueryBox): Unit {
      writer.directWrite(instance.discriminant())
      when(val discriminant = instance.discriminant()) {
      	0 -> FindAllAccounts.write(writer, instance as FindAllAccounts)
      	1 -> FindAccountById.write(writer, instance as FindAccountById)
      	2 -> FindAccountKeyValueByIdAndKey.write(writer, instance as FindAccountKeyValueByIdAndKey)
      	3 -> FindAccountsByName.write(writer, instance as FindAccountsByName)
      	4 -> FindAccountsByDomainName.write(writer, instance as FindAccountsByDomainName)
      	5 -> FindAllAssets.write(writer, instance as FindAllAssets)
      	6 -> FindAllAssetsDefinitions.write(writer, instance as FindAllAssetsDefinitions)
      	7 -> FindAssetById.write(writer, instance as FindAssetById)
      	8 -> FindAssetsByName.write(writer, instance as FindAssetsByName)
      	9 -> FindAssetsByAccountId.write(writer, instance as FindAssetsByAccountId)
      	10 -> FindAssetsByAssetDefinitionId.write(writer, instance as FindAssetsByAssetDefinitionId)
      	11 -> FindAssetsByDomainName.write(writer, instance as FindAssetsByDomainName)
      	12 -> FindAssetsByAccountIdAndAssetDefinitionId.write(writer, instance as
          FindAssetsByAccountIdAndAssetDefinitionId)
      	13 -> FindAssetsByDomainNameAndAssetDefinitionId.write(writer, instance as
          FindAssetsByDomainNameAndAssetDefinitionId)
      	14 -> FindAssetQuantityById.write(writer, instance as FindAssetQuantityById)
      	15 -> FindAssetKeyValueByIdAndKey.write(writer, instance as FindAssetKeyValueByIdAndKey)
      	16 -> FindAllDomains.write(writer, instance as FindAllDomains)
      	17 -> FindDomainByName.write(writer, instance as FindDomainByName)
      	18 -> FindAllPeers.write(writer, instance as FindAllPeers)
      	19 -> FindTransactionsByAccountId.write(writer, instance as FindTransactionsByAccountId)
      	20 -> FindPermissionTokensByAccountId.write(writer, instance as
          FindPermissionTokensByAccountId)
      	else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")}
    }
  }
}
