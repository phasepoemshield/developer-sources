package kotlin.random

// $VF: Compiled from PlatformRandom.kt
internal abstract class AbstractPlatformRandom : Random {
   public override fun nextBoolean(): Boolean {
      return this.impl.nextBoolean()
   }

   public override fun nextBytes(array: ByteArray): ByteArray {
      this.impl.nextBytes(array)
      return array
   }

   public override fun nextInt(): Int {
      return this.impl.nextInt()
   }

   public override fun nextFloat(): Float {
      return this.impl.nextFloat()
   }

   public override fun nextLong(): Long {
      return this.impl.nextLong()
   }

   public override fun nextDouble(): Double {
      return this.impl.nextDouble()
   }

   public override fun nextInt(until: Int): Int {
      return this.impl.nextInt(until)
   }

   public abstract val impl: java.util.Random

   public override fun nextBits(bitCount: Int): Int {
      return RandomKt.takeUpperBits(this.impl.nextInt(), bitCount)
   }
}
