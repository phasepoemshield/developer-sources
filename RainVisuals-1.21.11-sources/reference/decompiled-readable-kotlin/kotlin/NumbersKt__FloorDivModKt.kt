@file:JvmMultifileClass
@file:JvmName("NumbersKt")

package kotlin

import kotlin.internal.InlineOnly
import kotlin.internal.IntrinsicConstEvaluation

// $VF: Compiled from FloorDivMod.kt
@InlineOnly
@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
public inline fun Byte.mod(other: Long): Long {
   return `$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 63)
}

@InlineOnly
@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
public inline fun Byte.floorDiv(other: Int): Int {
   var var3: Int = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor other) < 0 && `$this$floorDiv` / other * other != `$this$floorDiv`) {
      var3--
   }

   return var3
}

@SinceKotlin(version = "1.5")
@InlineOnly
@IntrinsicConstEvaluation
public inline fun Int.floorDiv(other: Short): Int {
   var var4: Int = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor other) < 0 && `$this$floorDiv` / other * other != `$this$floorDiv`) {
      var4--
   }

   return var4
}

@IntrinsicConstEvaluation
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Byte.floorDiv(other: Long): Long {
   val var3: Long = `$this$floorDiv`
   var var5: Long = `$this$floorDiv` / other
   if ((var3 xor other) < 0L && `$this$floorDiv` / other * other != var3) {
      var5 += -1L
   }

   return var5
}

@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
@InlineOnly
public inline fun Short.floorDiv(other: Byte): Int {
   var var4: Int = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor other) < 0 && `$this$floorDiv` / other * other != `$this$floorDiv`) {
      var4--
   }

   return var4
}

open fun NumbersKt__FloorDivModKt() {
}

@IntrinsicConstEvaluation
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Short.mod(other: Byte): Byte {
   return (byte)(`$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 31))
}

@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Byte.mod(other: Short): Short {
   return (short)(`$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 31))
}

@InlineOnly
@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
public inline fun Int.mod(other: Long): Long {
   return `$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 63)
}

@SinceKotlin(version = "1.5")
@InlineOnly
@IntrinsicConstEvaluation
public inline fun Float.mod(other: Double): Double {
   val var3: Double = `$this$mod` % other
   return if (`$this$mod` % other != 0.0 && Math.signum((double)`$this$mod` % other) != Math.signum(other))
      `$this$mod` % other + other
      else
      `$this$mod` % other
   }

@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
@InlineOnly
public inline fun Long.mod(other: Int): Int {
   return (int)(`$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 63))
}

@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
@InlineOnly
public inline fun Double.mod(other: Double): Double {
   val r: Double = `$this$mod` % other
   return if (`$this$mod` % other != 0.0 && Math.signum(`$this$mod` % other) != Math.signum(other)) `$this$mod` % other + other else `$this$mod` % other
}

@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Int.floorDiv(other: Int): Int {
   var q: Int = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor other) < 0 && `$this$floorDiv` / other * other != `$this$floorDiv`) {
      q--
   }

   return q
}

@IntrinsicConstEvaluation
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Byte.mod(other: Byte): Byte {
   return (byte)(`$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 31))
}

@InlineOnly
@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
public inline fun Double.mod(other: Float): Double {
   val var7: Double = `$this$mod` % other
   return if (`$this$mod` % other != 0.0 && Math.signum(`$this$mod` % (double)other) != Math.signum((double)other))
      `$this$mod` % other + other
      else
      `$this$mod` % other
   }

@InlineOnly
@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
public inline fun Long.mod(other: Byte): Byte {
   return (byte)(`$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 63))
}

@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Int.mod(other: Int): Int {
   return `$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 31)
}

@InlineOnly
@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
public inline fun Long.floorDiv(other: Short): Long {
   val var5: Long = other
   var var7: Long = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor var5) < 0L && `$this$floorDiv` / other * var5 != `$this$floorDiv`) {
      var7 += -1L
   }

   return var7
}

@IntrinsicConstEvaluation
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Short.mod(other: Int): Int {
   return `$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 31)
}

@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
@InlineOnly
public inline fun Short.mod(other: Long): Long {
   return `$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 63)
}

@IntrinsicConstEvaluation
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Int.floorDiv(other: Byte): Int {
   var var4: Int = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor other) < 0 && `$this$floorDiv` / other * other != `$this$floorDiv`) {
      var4--
   }

   return var4
}

@InlineOnly
@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
public inline fun Short.floorDiv(other: Int): Int {
   var var3: Int = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor other) < 0 && `$this$floorDiv` / other * other != `$this$floorDiv`) {
      var3--
   }

   return var3
}

@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Byte.floorDiv(other: Byte): Int {
   var var4: Int = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor other) < 0 && `$this$floorDiv` / other * other != `$this$floorDiv`) {
      var4--
   }

   return var4
}

@SinceKotlin(version = "1.5")
@InlineOnly
@IntrinsicConstEvaluation
public inline fun Short.floorDiv(other: Short): Int {
   var var4: Int = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor other) < 0 && `$this$floorDiv` / other * other != `$this$floorDiv`) {
      var4--
   }

   return var4
}

@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
@InlineOnly
public inline fun Long.floorDiv(other: Long): Long {
   var q: Long = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor other) < 0L && `$this$floorDiv` / other * other != `$this$floorDiv`) {
      q += -1L
   }

   return q
}

@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Short.floorDiv(other: Long): Long {
   val var3: Long = `$this$floorDiv`
   var var5: Long = `$this$floorDiv` / other
   if ((var3 xor other) < 0L && `$this$floorDiv` / other * other != var3) {
      var5 += -1L
   }

   return var5
}

@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Long.mod(other: Long): Long {
   return `$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 63)
}

@InlineOnly
@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
public inline fun Long.floorDiv(other: Int): Long {
   val var5: Long = other
   var var7: Long = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor var5) < 0L && `$this$floorDiv` / other * var5 != `$this$floorDiv`) {
      var7 += -1L
   }

   return var7
}

@InlineOnly
@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
public inline fun Int.mod(other: Short): Short {
   return (short)(`$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 31))
}

@IntrinsicConstEvaluation
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Int.mod(other: Byte): Byte {
   return (byte)(`$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 31))
}

@IntrinsicConstEvaluation
@InlineOnly
@SinceKotlin(version = "1.5")
public inline fun Float.mod(other: Float): Float {
   val r: Float = `$this$mod` % other
   return if (`$this$mod` % other != 0.0F && Math.signum(`$this$mod` % other) != Math.signum(other)) `$this$mod` % other + other else `$this$mod` % other
}

@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
@InlineOnly
public inline fun Long.mod(other: Short): Short {
   return (short)(`$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 63))
}

@InlineOnly
@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
public inline fun Short.mod(other: Short): Short {
   return (short)(`$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 31))
}

@IntrinsicConstEvaluation
@SinceKotlin(version = "1.5")
@InlineOnly
public inline fun Long.floorDiv(other: Byte): Long {
   val var5: Long = other
   var var7: Long = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor var5) < 0L && `$this$floorDiv` / other * var5 != `$this$floorDiv`) {
      var7 += -1L
   }

   return var7
}

@SinceKotlin(version = "1.5")
@InlineOnly
@IntrinsicConstEvaluation
public inline fun Byte.floorDiv(other: Short): Int {
   var var4: Int = `$this$floorDiv` / other
   if ((`$this$floorDiv` xor other) < 0 && `$this$floorDiv` / other * other != `$this$floorDiv`) {
      var4--
   }

   return var4
}

@SinceKotlin(version = "1.5")
@IntrinsicConstEvaluation
@InlineOnly
public inline fun Int.floorDiv(other: Long): Long {
   val var3: Long = `$this$floorDiv`
   var var5: Long = `$this$floorDiv` / other
   if ((var3 xor other) < 0L && `$this$floorDiv` / other * other != var3) {
      var5 += -1L
   }

   return var5
}

@SinceKotlin(version = "1.5")
@InlineOnly
@IntrinsicConstEvaluation
public inline fun Byte.mod(other: Int): Int {
   return `$this$mod` % other + (other and ((`$this$mod` % other xor other) and (`$this$mod` % other or -(`$this$mod` % other))) shr 31)
}
