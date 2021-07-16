//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.isi

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.Int
import kotlin.Unit

/**
 * Instruction
 *
 * Generated from 'iroha_data_model::isi::Instruction' enum
 */
public sealed class Instruction {
  /**
   * @return Discriminator of variant in enum
   */
  public abstract fun discriminant(): Int

  /**
   * 'Register' variant
   */
  public class Register(
    private val register: RegisterBox
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Register>, ScaleWriter<Register> {
      public const val DISCRIMINANT: Int = 0

      public override fun read(reader: ScaleCodecReader): Register {
      }

      public override fun write(writer: ScaleCodecWriter, instance: Register): Unit {
      }
    }
  }

  /**
   * 'Unregister' variant
   */
  public class Unregister(
    private val unregister: UnregisterBox
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Unregister>, ScaleWriter<Unregister> {
      public const val DISCRIMINANT: Int = 1

      public override fun read(reader: ScaleCodecReader): Unregister {
      }

      public override fun write(writer: ScaleCodecWriter, instance: Unregister): Unit {
      }
    }
  }

  /**
   * 'Mint' variant
   */
  public class Mint(
    private val mint: MintBox
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Mint>, ScaleWriter<Mint> {
      public const val DISCRIMINANT: Int = 2

      public override fun read(reader: ScaleCodecReader): Mint {
      }

      public override fun write(writer: ScaleCodecWriter, instance: Mint): Unit {
      }
    }
  }

  /**
   * 'Burn' variant
   */
  public class Burn(
    private val burn: BurnBox
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Burn>, ScaleWriter<Burn> {
      public const val DISCRIMINANT: Int = 3

      public override fun read(reader: ScaleCodecReader): Burn {
      }

      public override fun write(writer: ScaleCodecWriter, instance: Burn): Unit {
      }
    }
  }

  /**
   * 'Transfer' variant
   */
  public class Transfer(
    private val transfer: TransferBox
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Transfer>, ScaleWriter<Transfer> {
      public const val DISCRIMINANT: Int = 4

      public override fun read(reader: ScaleCodecReader): Transfer {
      }

      public override fun write(writer: ScaleCodecWriter, instance: Transfer): Unit {
      }
    }
  }

  /**
   * 'If' variant
   */
  public class If(
    private val `if`: jp.co.soramitsu.iroha2.generated.datamodel.isi.If
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<If>, ScaleWriter<If> {
      public const val DISCRIMINANT: Int = 5

      public override fun read(reader: ScaleCodecReader): If {
      }

      public override fun write(writer: ScaleCodecWriter, instance: If): Unit {
      }
    }
  }

  /**
   * 'Pair' variant
   */
  public class Pair(
    private val pair: jp.co.soramitsu.iroha2.generated.datamodel.isi.Pair
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Pair>, ScaleWriter<Pair> {
      public const val DISCRIMINANT: Int = 6

      public override fun read(reader: ScaleCodecReader): Pair {
      }

      public override fun write(writer: ScaleCodecWriter, instance: Pair): Unit {
      }
    }
  }

  /**
   * 'Sequence' variant
   */
  public class Sequence(
    private val sequence: SequenceBox
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Sequence>, ScaleWriter<Sequence> {
      public const val DISCRIMINANT: Int = 7

      public override fun read(reader: ScaleCodecReader): Sequence {
      }

      public override fun write(writer: ScaleCodecWriter, instance: Sequence): Unit {
      }
    }
  }

  /**
   * 'Fail' variant
   */
  public class Fail(
    private val fail: FailBox
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Fail>, ScaleWriter<Fail> {
      public const val DISCRIMINANT: Int = 8

      public override fun read(reader: ScaleCodecReader): Fail {
      }

      public override fun write(writer: ScaleCodecWriter, instance: Fail): Unit {
      }
    }
  }

  /**
   * 'SetKeyValue' variant
   */
  public class SetKeyValue(
    private val setKeyValue: SetKeyValueBox
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<SetKeyValue>, ScaleWriter<SetKeyValue> {
      public const val DISCRIMINANT: Int = 9

      public override fun read(reader: ScaleCodecReader): SetKeyValue {
      }

      public override fun write(writer: ScaleCodecWriter, instance: SetKeyValue): Unit {
      }
    }
  }

  /**
   * 'RemoveKeyValue' variant
   */
  public class RemoveKeyValue(
    private val removeKeyValue: RemoveKeyValueBox
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<RemoveKeyValue>, ScaleWriter<RemoveKeyValue> {
      public const val DISCRIMINANT: Int = 10

      public override fun read(reader: ScaleCodecReader): RemoveKeyValue {
      }

      public override fun write(writer: ScaleCodecWriter, instance: RemoveKeyValue): Unit {
      }
    }
  }

  /**
   * 'Grant' variant
   */
  public class Grant(
    private val grant: GrantBox
  ) : Instruction() {
    public override fun discriminant(): Int = DISCRIMINANT

    public companion object : ScaleReader<Grant>, ScaleWriter<Grant> {
      public const val DISCRIMINANT: Int = 11

      public override fun read(reader: ScaleCodecReader): Grant {
      }

      public override fun write(writer: ScaleCodecWriter, instance: Grant): Unit {
      }
    }
  }

  public companion object : ScaleReader<Instruction>, ScaleWriter<Instruction> {
    public override fun read(reader: ScaleCodecReader): Instruction = when(val discriminant =
        reader.readUByte()) {
    	0 -> Register.read(reader)
    	1 -> Unregister.read(reader)
    	2 -> Mint.read(reader)
    	3 -> Burn.read(reader)
    	4 -> Transfer.read(reader)
    	5 -> If.read(reader)
    	6 -> Pair.read(reader)
    	7 -> Sequence.read(reader)
    	8 -> Fail.read(reader)
    	9 -> SetKeyValue.read(reader)
    	10 -> RemoveKeyValue.read(reader)
    	11 -> Grant.read(reader)
    	else -> throw RuntimeException("Unresolved discriminant of the enum variant $discriminant")}

    public override fun write(writer: ScaleCodecWriter, instance: Instruction): Unit {
      writer.directWrite(instance.discriminant())
      when(val discriminant = instance.discriminant()) {
      	0 -> Register.write(writer, instance as Register)
      	1 -> Unregister.write(writer, instance as Unregister)
      	2 -> Mint.write(writer, instance as Mint)
      	3 -> Burn.write(writer, instance as Burn)
      	4 -> Transfer.write(writer, instance as Transfer)
      	5 -> If.write(writer, instance as If)
      	6 -> Pair.write(writer, instance as Pair)
      	7 -> Sequence.write(writer, instance as Sequence)
      	8 -> Fail.write(writer, instance as Fail)
      	9 -> SetKeyValue.write(writer, instance as SetKeyValue)
      	10 -> RemoveKeyValue.write(writer, instance as RemoveKeyValue)
      	11 -> Grant.write(writer, instance as Grant)
      	else -> throw RuntimeException("Unresolved discriminant of the enum variant $discriminant")}
    }
  }
}
