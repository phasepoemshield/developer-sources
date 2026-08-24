package kotlin.random

import java.io.Serializable

// $VF: Compiled from Random.kt
@SinceKotlin(version = "1.3")
public abstract class Random {
   public abstract fun nextBits(bitCount: Int): Int {
   }

   public open fun nextInt(until: Int): Int {
      return this.nextInt(0, until)
   }

   public open fun nextLong(from: Long, until: Long): Long {
      RandomKt.checkRangeBounds(from, until)
      val n: Long = until - from
      if (until - from <= 0L) {
         val var14: Long
         do {
            var14 = this.nextLong()
         } while (from > var14 || var14 >= until)

         return var14
      } else {
         var rnd: Long = 0L
         if ((n and -n) == n) {
            rnd = if ((int)n != 0)
               this.nextBits(RandomKt.fastLog2((int)n)) and 4294967295L
               else
               (
                  if ((int)(n ushr 32) == 1)
                     this.nextInt() and 4294967295L
                     else
                     ((long)this.nextBits(RandomKt.fastLog2((int)(n ushr 32))) shl 32) + (this.nextInt() and 4294967295L)
               )
            } else {
            val var15: Long = 0L

            val var18: Long
            do {
               var18 = this.nextLong() ushr 1
            } while (var18 - var18 % n + (n - 1L) < 0L)

            rnd = var18 % n
         }

         return from + rnd
      }
   }

   public open fun nextInt(): Int {
      return this.nextBits(32)
   }

   public open fun nextBytes(array: ByteArray): ByteArray {
      return this.nextBytes(array, 0, array.length)
   }

   public open fun nextDouble(from: Double, until: Double): Double {
      var var10000: Double
      RandomKt.checkRangeBounds(from, until)
      val size: Double = until - from
      label46@
      if (java.lang.Double.isInfinite(until - from)
         && !java.lang.Double.isInfinite(from)
         && !java.lang.Double.isNaN(from)
         && !java.lang.Double.isInfinite(until)
         && !java.lang.Double.isNaN(until)) {
         val var12: Double = this.nextDouble() * (until / 2 - from / 2)
         var10000 = from + var12 + var12
         break@label46
      } else {
         var10000 = from + this.nextDouble() * size
      }

      return if (var10000 >= until) Math.nextAfter(until, java.lang.Double.NEGATIVE_INFINITY) else var10000
   }

   public open fun nextLong(): Long {
      return ((long)this.nextInt() shl 32) + this.nextInt()
   }

   public open fun nextLong(until: Long): Long {
      return this.nextLong(0L, until)
   }

   public open fun nextDouble(): Double {
      return PlatformRandomKt.doubleFromParts(this.nextBits(26), this.nextBits(27))
   }

   public open fun nextDouble(until: Double): Double {
      return this.nextDouble(0.0, until)
   }

   public open fun nextBytes(size: Int): ByteArray {
      return this.nextBytes(ByteArray(size))
   }

   public open fun nextInt(from: Int, until: Int): Int {
      RandomKt.checkRangeBounds(from, until)
      val n: Int = until - from
      if (until - from <= 0 && until - from != Integer.MIN_VALUE) {
         val var7: Int
         do {
            var7 = this.nextInt()
         } while (from > var7 || var7 >= until)

         return var7
      } else {
         val var10000: Int
         if ((n and -n) == n) {
            var10000 = this.nextBits(RandomKt.fastLog2(n))
         } else {
            val bits: Int
            do {
               bits = this.nextInt() ushr 1
            } while (bits - bits % n + n + -1 < 0)

            var10000 = bits % n
         }

         return from + var10000
      }
   }

   public open fun nextBytes(array: ByteArray, fromIndex: Int = 0, toIndex: Int = array.length): ByteArray {
      if (!IntRange(0, array.length).contains(fromIndex) || !IntRange(0, array.length).contains(toIndex)) {
         throw IllegalArgumentException(("fromIndex ($fromIndex) or toIndex ($toIndex) are out of range: 0..${array.length}.").toString())
      } else if (fromIndex > toIndex) {
         throw IllegalArgumentException(("fromIndex ($fromIndex) must be not greater than toIndex ($toIndex).").toString())
      } else {
         val var11: Int = (toIndex - fromIndex) / 4
         var var12: Int = fromIndex

         repeat(var11) { remainder ->
            val v: Int = this.nextInt()
            array[var12] = (byte)v
            array[var12 + 1] = (byte)(v ushr 8)
            array[var12 + 2] = (byte)(v ushr 16)
            array[var12 + 3] = (byte)(v ushr 24)
            var12 += 4
         }

         val var17: Int = toIndex - var12
         val vr: Int = this.nextBits((toIndex - var12) * 8)

         repeat(var17) { var18 ->
            array[var12 + var18] = (byte)(vr ushr var18 * 8)
         }

         return array
      }
   }

   public open fun nextFloat(): Float {
      return this.nextBits(24) / 1.6777216E7F
   }

   public open fun nextBoolean(): Boolean {
      return this.nextBits(1) != 0
   }

   // $VF: Compiled from Random.kt
   public companion object Default : Random, Serializable {
      private final val defaultRandom: Random

      public override fun nextInt(until: Int): Int {
         return Random.defaultRandom.nextInt(until)
      }

      public override fun nextFloat(): Float {
         return Random.defaultRandom.nextFloat()
      }

      public override fun nextDouble(from: Double, until: Double): Double {
         return Random.defaultRandom.nextDouble(from, until)
      }

      private fun writeReplace(): Any {
         return Random.Default.Serialized.INSTANCE
      }

      public override fun nextDouble(): Double {
         return Random.defaultRandom.nextDouble()
      }

      public override fun nextBytes(array: ByteArray): ByteArray {
         return Random.defaultRandom.nextBytes(array)
      }

      public override fun nextLong(until: Long): Long {
         return Random.defaultRandom.nextLong(until)
      }

      public override fun nextInt(from: Int, until: Int): Int {
         return Random.defaultRandom.nextInt(from, until)
      }

      public override fun nextLong(from: Long, until: Long): Long {
         return Random.defaultRandom.nextLong(from, until)
      }

      public override fun nextDouble(until: Double): Double {
         return Random.defaultRandom.nextDouble(until)
      }

      public override fun nextBytes(array: ByteArray, fromIndex: Int, toIndex: Int): ByteArray {
         return Random.defaultRandom.nextBytes(array, fromIndex, toIndex)
      }

      public override fun nextInt(): Int {
         return Random.defaultRandom.nextInt()
      }

      public override fun nextBytes(size: Int): ByteArray {
         return Random.defaultRandom.nextBytes(size)
      }

      public override fun nextBits(bitCount: Int): Int {
         return Random.defaultRandom.nextBits(bitCount)
      }

      public override fun nextLong(): Long {
         return Random.defaultRandom.nextLong()
      }

      public override fun nextBoolean(): Boolean {
         return Random.defaultRandom.nextBoolean()
      }

      // $VF: Compiled from Random.kt
      private object Serialized : Serializable {
         private const val serialVersionUID: Long = 0L

         private fun readResolve(): Any {
            return Random.Default
         }
      }
   }
}
