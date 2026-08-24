package kotlin.random

import java.io.Serializable

// $VF: Compiled from XorWowRandom.kt
internal class XorWowRandom internal constructor(x: Int, y: Int, z: Int, w: Int, v: Int, addend: Int) : Random, Serializable {
   private final var y: Int
   private final var addend: Int
   private final var z: Int
   private final var v: Int
   private final var w: Int
   private final var x: Int

   internal constructor(seed1: Int, seed2: Int) : this(seed1, seed2, 0, 0, seed1.inv(), seed1 shl 10 xor seed2 ushr 4)
   public override fun nextBits(bitCount: Int): Int {
      return RandomKt.takeUpperBits(this.nextInt(), bitCount)
   }

   init {
      this.x = x
      this.y = y
      this.z = z
      this.w = w
      this.v = v
      this.addend = addend
      if ((this.x or this.y or this.z or this.w or this.v) == 0) {
         throw IllegalArgumentException("Initial state must have at least one non-zero element.".toString())
      } else {
         val var11: Byte = 64

         repeat(var11) { var8 ->
            this.nextInt()
         }
      }
   }

   public override fun nextInt(): Int {
      val var3: Int = this.x xor this.x ushr 2
      this.x = this.y
      this.y = this.z
      this.z = this.w
      val v0: Int = this.v
      this.w = this.v
      val var4: Int = var3 xor var3 shl 1 xor v0 xor v0 shl 4
      this.v = var3 xor var3 shl 1 xor v0 xor v0 shl 4
      this.addend += 362437
      return var4 + this.addend
   }

   // $VF: Compiled from XorWowRandom.kt
   private companion object {
      private const val serialVersionUID: Long = 0L
   }
}
