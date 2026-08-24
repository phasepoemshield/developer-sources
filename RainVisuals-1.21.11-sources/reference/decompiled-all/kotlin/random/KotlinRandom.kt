package kotlin.random

// $VF: Compiled from PlatformRandom.kt
private class KotlinRandom(impl: Random) : java.util.Random {
   public final val impl: Random
   private final var seedInitialized: Boolean

   public override fun nextInt(bound: Int): Int {
      return this.impl.nextInt(bound)
   }

   public override fun nextLong(): Long {
      return this.impl.nextLong()
   }

   public override fun nextBoolean(): Boolean {
      return this.impl.nextBoolean()
   }

   public override fun nextBytes(bytes: ByteArray) {
      this.impl.nextBytes(bytes)
   }

   public override fun nextFloat(): Float {
      return this.impl.nextFloat()
   }

   public override fun setSeed(seed: Long) {
      if (!this.seedInitialized) {
         this.seedInitialized = true
      } else {
         throw UnsupportedOperationException("Setting seed is not supported.")
      }
   }

   protected override fun next(bits: Int): Int {
      return this.impl.nextBits(bits)
   }

   public override fun nextInt(): Int {
      return this.impl.nextInt()
   }

   public override fun nextDouble(): Double {
      return this.impl.nextDouble()
   }

   init {
      this.impl = impl
   }

   // $VF: Compiled from PlatformRandom.kt
   private companion object {
      private const val serialVersionUID: Long = 0L
   }
}
