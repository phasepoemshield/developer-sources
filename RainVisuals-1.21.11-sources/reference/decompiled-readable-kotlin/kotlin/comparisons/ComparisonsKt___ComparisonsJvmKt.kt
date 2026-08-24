@file:JvmMultifileClass
@file:JvmName("ComparisonsKt")

package kotlin.comparisons

import kotlin.internal.InlineOnly

// $VF: Compiled from _ComparisonsJvm.kt
@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun maxOf(a: Int, b: Int, c: Int): Int {
   return Math.max(a, Math.max(b, c))
}

@SinceKotlin(version = "1.4")
public fun <T : Comparable<Any>> minOf(a: Any, vararg other: Any): Any {
   var min: java.lang.Comparable = a

   for (e in other) {
      min = ComparisonsKt.minOf(min, e)
   }

   return (T)min
}

@SinceKotlin(version = "1.4")
public fun minOf(a: Byte, other: ByteArray): Byte {
   var min: Byte = a

   for (e in other) {
      min = (byte)Math.min(min, e)
   }

   return min
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun minOf(a: Byte, b: Byte): Byte {
   return (byte)Math.min(a, b)
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun minOf(a: Int, b: Int, c: Int): Int {
   return Math.min(a, Math.min(b, c))
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun maxOf(a: Float, b: Float): Float {
   return Math.max(a, b)
}

@SinceKotlin(version = "1.4")
public fun maxOf(a: Short, other: ShortArray): Short {
   var max: Short = a

   for (e in other) {
      max = (short)Math.max(max, e)
   }

   return max
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun minOf(a: Long, b: Long): Long {
   return Math.min(a, b)
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun maxOf(a: Short, b: Short): Short {
   return (short)Math.max(a, b)
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun minOf(a: Short, b: Short): Short {
   return (short)Math.min(a, b)
}

@SinceKotlin(version = "1.4")
public fun minOf(a: Short, other: ShortArray): Short {
   var min: Short = a

   for (e in other) {
      min = (short)Math.min(min, e)
   }

   return min
}

open fun ComparisonsKt___ComparisonsJvmKt() {
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun minOf(a: Double, b: Double): Double {
   return Math.min(a, b)
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun minOf(a: Float, b: Float, c: Float): Float {
   return Math.min(a, Math.min(b, c))
}

@SinceKotlin(version = "1.4")
public fun maxOf(a: Long, other: LongArray): Long {
   var max: Long = a

   for (e in other) {
      max = Math.max(max, e)
   }

   return max
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun maxOf(a: Float, b: Float, c: Float): Float {
   return Math.max(a, Math.max(b, c))
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun minOf(a: Short, b: Short, c: Short): Short {
   return (short)Math.min(a, Math.min(b, c))
}

@SinceKotlin(version = "1.4")
public fun maxOf(a: Double, other: DoubleArray): Double {
   var max: Double = a

   for (e in other) {
      max = Math.max(max, e)
   }

   return max
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun minOf(a: Int, b: Int): Int {
   return Math.min(a, b)
}

@SinceKotlin(version = "1.4")
public fun maxOf(a: Float, other: FloatArray): Float {
   var max: Float = a

   for (e in other) {
      max = Math.max(max, e)
   }

   return max
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun minOf(a: Byte, b: Byte, c: Byte): Byte {
   return (byte)Math.min(a, Math.min(b, c))
}

@SinceKotlin(version = "1.1")
public fun <T : Comparable<Any>> minOf(a: Any, b: Any): Any {
   return (T)(if (a.compareTo(b) <= 0) a else b)
}

@SinceKotlin(version = "1.4")
public fun maxOf(a: Byte, other: ByteArray): Byte {
   var max: Byte = a

   for (e in other) {
      max = (byte)Math.max(max, e)
   }

   return max
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun maxOf(a: Long, b: Long, c: Long): Long {
   return Math.max(a, Math.max(b, c))
}

@SinceKotlin(version = "1.4")
public fun maxOf(a: Int, other: IntArray): Int {
   var max: Int = a

   for (e in other) {
      max = Math.max(max, e)
   }

   return max
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun minOf(a: Float, b: Float): Float {
   return Math.min(a, b)
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun maxOf(a: Byte, b: Byte, c: Byte): Byte {
   return (byte)Math.max(a, Math.max(b, c))
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun maxOf(a: Byte, b: Byte): Byte {
   return (byte)Math.max(a, b)
}

@SinceKotlin(version = "1.4")
public fun minOf(a: Int, other: IntArray): Int {
   var min: Int = a

   for (e in other) {
      min = Math.min(min, e)
   }

   return min
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun maxOf(a: Int, b: Int): Int {
   return Math.max(a, b)
}

@SinceKotlin(version = "1.4")
public fun minOf(a: Long, other: LongArray): Long {
   var min: Long = a

   for (e in other) {
      min = Math.min(min, e)
   }

   return min
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun minOf(a: Double, b: Double, c: Double): Double {
   return Math.min(a, Math.min(b, c))
}

@SinceKotlin(version = "1.1")
public fun <T : Comparable<Any>> maxOf(a: Any, b: Any, c: Any): Any {
   return (T)ComparisonsKt.maxOf(a, ComparisonsKt.maxOf(b, c))
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline fun maxOf(a: Double, b: Double, c: Double): Double {
   return Math.max(a, Math.max(b, c))
}

@SinceKotlin(version = "1.1")
public fun <T : Comparable<Any>> maxOf(a: Any, b: Any): Any {
   return (T)(if (a.compareTo(b) >= 0) a else b)
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun maxOf(a: Double, b: Double): Double {
   return Math.max(a, b)
}

@SinceKotlin(version = "1.4")
public fun minOf(a: Float, other: FloatArray): Float {
   var min: Float = a

   for (e in other) {
      min = Math.min(min, e)
   }

   return min
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun maxOf(a: Short, b: Short, c: Short): Short {
   return (short)Math.max(a, Math.max(b, c))
}

@SinceKotlin(version = "1.4")
public fun minOf(a: Double, other: DoubleArray): Double {
   var min: Double = a

   for (e in other) {
      min = Math.min(min, e)
   }

   return min
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun minOf(a: Long, b: Long, c: Long): Long {
   return Math.min(a, Math.min(b, c))
}

@SinceKotlin(version = "1.1")
public fun <T : Comparable<Any>> minOf(a: Any, b: Any, c: Any): Any {
   return (T)ComparisonsKt.minOf(a, ComparisonsKt.minOf(b, c))
}

@SinceKotlin(version = "1.1")
@InlineOnly
public inline fun maxOf(a: Long, b: Long): Long {
   return Math.max(a, b)
}

@SinceKotlin(version = "1.4")
public fun <T : Comparable<Any>> maxOf(a: Any, vararg other: Any): Any {
   var max: java.lang.Comparable = a

   for (e in other) {
      max = ComparisonsKt.maxOf(max, e)
   }

   return (T)max
}
