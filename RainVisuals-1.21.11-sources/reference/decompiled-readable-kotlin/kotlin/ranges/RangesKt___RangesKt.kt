@file:JvmMultifileClass
@file:JvmName("RangesKt")

package kotlin.ranges

import java.util.NoSuchElementException
import kotlin.internal.InlineOnly
import kotlin.jvm.internal.Intrinsics
import kotlin.random.Random
import kotlin.random.RandomKt

// $VF: Compiled from _Ranges.kt
internal fun Float.toShortExactOrNull(): Short? {
   return if (-32768.0F <= `$this$toShortExactOrNull` && `$this$toShortExactOrNull` <= 32767.0F) (short)((int)`$this$toShortExactOrNull`) else null
}

@SinceKotlin(version = "1.9")
@JvmName(name = "byteRangeContains")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public operator fun OpenEndRange<Byte>.contains(value: Short): Boolean {
   val it: java.lang.Byte = RangesKt.toByteExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

@SinceKotlin(version = "1.9")
@JvmName(name = "shortRangeContains")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public operator fun OpenEndRange<Short>.contains(value: Int): Boolean {
   val it: java.lang.Short = RangesKt.toShortExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

public infix fun Byte.downTo(to: Byte): IntProgression {
   return IntProgression.Companion.fromClosedRange(`$this$downTo`, to, -1)
}

@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@JvmName(name = "byteRangeContains")
public operator fun OpenEndRange<Byte>.contains(value: Long): Boolean {
   val it: java.lang.Byte = RangesKt.toByteExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

public infix fun Byte.until(to: Long): LongRange {
   return if (to <= java.lang.Long.MIN_VALUE) LongRange.Companion.EMPTY else LongRange(`$this$until`, to - 1L)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@JvmName(name = "doubleRangeContains")
@SinceKotlin(version = "1.9")
public operator fun OpenEndRange<Double>.contains(value: Float): Boolean {
   return `$this$contains`.contains((double)value)
}

@SinceKotlin(version = "1.7")
public fun CharProgression.first(): Char {
   if (`$this$first`.isEmpty()) {
      throw NoSuchElementException("Progression $`$this$first` is empty.")
   } else {
      return `$this$first`.first
   }
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline operator fun LongRange.contains(element: Long?): Boolean {
   return element != null && `$this$contains`.contains(element.longValue())
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@JvmName(name = "intRangeContains")
@SinceKotlin(version = "1.9")
public operator fun OpenEndRange<Int>.contains(value: Byte): Boolean {
   return `$this$contains`.contains(Integer.valueOf(value))
}

public infix fun Int.downTo(to: Int): IntProgression {
   return IntProgression.Companion.fromClosedRange(`$this$downTo`, to, -1)
}

@JvmName(name = "longRangeContains")
public operator fun ClosedRange<Long>.contains(value: Int): Boolean {
   return `$this$contains`.contains((long)value)
}

public infix fun Long.downTo(to: Int): LongProgression {
   return LongProgression.Companion.fromClosedRange(`$this$downTo`, (long)to, -1L)
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun IntRange.random(): Int {
   return RangesKt.random(`$this$random`, Random.Default)
}

public fun Float.coerceIn(minimumValue: Float, maximumValue: Float): Float {
   if (minimumValue > maximumValue) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
   } else if (`$this$coerceIn` < minimumValue) {
      return minimumValue
   } else {
      return if (`$this$coerceIn` > maximumValue) maximumValue else `$this$coerceIn`
   }
}

public infix fun Char.until(to: Char): CharRange {
   return if (Intrinsics.compare(to, 0) <= 0) CharRange.Companion.EMPTY else CharRange(`$this$until`, (char)(to + -1))
}

public infix fun IntProgression.step(step: Int): IntProgression {
   RangesKt.checkStepIsPositive(step > 0, step)
   return IntProgression.Companion.fromClosedRange(`$this$step`.first, `$this$step`.last, if (`$this$step`.step > 0) step else -step)
}

@JvmName(name = "shortRangeContains")
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public operator fun OpenEndRange<Short>.contains(value: Byte): Boolean {
   return `$this$contains`.contains((short)value)
}

@InlineOnly
public inline operator fun IntRange.contains(value: Short): Boolean {
   return RangesKt.intRangeContains(`$this$contains`, (short)value)
}

public fun <T : Comparable<Any>> Any.coerceAtMost(maximumValue: Any): Any {
   return (T)(if (`$this$coerceAtMost`.compareTo(maximumValue) > 0) maximumValue else `$this$coerceAtMost`)
}

@SinceKotlin(version = "1.4")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline fun LongRange.randomOrNull(): Long? {
   return RangesKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

@SinceKotlin(version = "1.7")
public fun IntProgression.last(): Int {
   if (`$this$last`.isEmpty()) {
      throw NoSuchElementException("Progression $`$this$last` is empty.")
   } else {
      return `$this$last`.last
   }
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun CharRange.randomOrNull(random: Random): Char? {
   return if (`$this$randomOrNull`.isEmpty()) null else (char)random.nextInt(`$this$randomOrNull`.getFirst(), `$this$randomOrNull`.getLast() + 1)
}

internal fun Long.toByteExactOrNull(): Byte? {
   return if (LongRange(-128L, 127L).contains(`$this$toByteExactOrNull`)) (byte)((int)`$this$toByteExactOrNull`) else null
}

@SinceKotlin(version = "1.9")
@JvmName(name = "longRangeContains")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public operator fun OpenEndRange<Long>.contains(value: Byte): Boolean {
   return `$this$contains`.contains((long)value)
}

public infix fun Int.until(to: Byte): IntRange {
   return IntRange(`$this$until`, to + -1)
}

@JvmName(name = "longRangeContains")
public operator fun ClosedRange<Long>.contains(value: Byte): Boolean {
   return `$this$contains`.contains((long)value)
}

@JvmName(name = "shortRangeContains")
public operator fun ClosedRange<Short>.contains(value: Byte): Boolean {
   return `$this$contains`.contains((short)value)
}

public fun <T : Comparable<Any>> Any.coerceIn(range: ClosedRange<Any>): Any {
   if (range is ClosedFloatingPointRange) {
      return (T)RangesKt.coerceIn(`$this$coerceIn`, range as ClosedFloatingPointRange)
   } else if (range.isEmpty()) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
   } else {
      return (T)(if (`$this$coerceIn`.compareTo(range.start) < 0)
         range.start
         else
         (if (`$this$coerceIn`.compareTo(range.endInclusive) > 0) range.endInclusive else `$this$coerceIn`))
   }
}

@JvmName(name = "byteRangeContains")
public operator fun ClosedRange<Byte>.contains(value: Long): Boolean {
   val it: java.lang.Byte = RangesKt.toByteExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

public fun Long.coerceAtLeast(minimumValue: Long): Long {
   return if (`$this$coerceAtLeast` < minimumValue) minimumValue else `$this$coerceAtLeast`
}

public infix fun Long.until(to: Byte): LongRange {
   return LongRange(`$this$until`, to - 1L)
}

@SinceKotlin(version = "1.7")
public fun CharProgression.lastOrNull(): Char? {
   return if (`$this$lastOrNull`.isEmpty()) null else `$this$lastOrNull`.last
}

public infix fun Long.until(to: Int): LongRange {
   return LongRange(`$this$until`, to - 1L)
}

public fun Double.coerceIn(minimumValue: Double, maximumValue: Double): Double {
   if (minimumValue > maximumValue) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
   } else if (`$this$coerceIn` < minimumValue) {
      return minimumValue
   } else {
      return if (`$this$coerceIn` > maximumValue) maximumValue else `$this$coerceIn`
   }
}

public infix fun Int.until(to: Int): IntRange {
   return if (to <= Integer.MIN_VALUE) IntRange.Companion.EMPTY else IntRange(`$this$until`, to + -1)
}

public infix fun Int.downTo(to: Short): IntProgression {
   return IntProgression.Companion.fromClosedRange(`$this$downTo`, to, -1)
}

internal fun Int.toByteExactOrNull(): Byte? {
   return if (IntRange(-128, 127).contains(`$this$toByteExactOrNull`)) (byte)`$this$toByteExactOrNull` else null
}

public fun IntProgression.reversed(): IntProgression {
   return IntProgression.Companion.fromClosedRange(`$this$reversed`.last, `$this$reversed`.first, -`$this$reversed`.step)
}

public infix fun Short.until(to: Short): IntRange {
   return IntRange(`$this$until`, to + -1)
}

@SinceKotlin(version = "1.3")
public fun CharRange.random(random: Random): Char {
   try {
      return (char)random.nextInt(`$this$random`.getFirst(), `$this$random`.getLast() + 1)
   } catch (var3: IllegalArgumentException) {
      throw NoSuchElementException(var3.getMessage())
   }
}

public fun Long.coerceAtMost(maximumValue: Long): Long {
   return if (`$this$coerceAtMost` > maximumValue) maximumValue else `$this$coerceAtMost`
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@JvmName(name = "intRangeContains")
@SinceKotlin(version = "1.9")
public operator fun OpenEndRange<Int>.contains(value: Short): Boolean {
   return `$this$contains`.contains(Integer.valueOf(value))
}

public infix fun Int.until(to: Long): LongRange {
   return if (to <= java.lang.Long.MIN_VALUE) LongRange.Companion.EMPTY else LongRange(`$this$until`, to - 1L)
}

public infix fun Byte.until(to: Int): IntRange {
   return if (to <= Integer.MIN_VALUE) IntRange.Companion.EMPTY else IntRange(`$this$until`, to + -1)
}

@JvmName(name = "longRangeContains")
public operator fun ClosedRange<Long>.contains(value: Short): Boolean {
   return `$this$contains`.contains((long)value)
}

public fun Short.coerceIn(minimumValue: Short, maximumValue: Short): Short {
   if (minimumValue > maximumValue) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
   } else if (`$this$coerceIn` < minimumValue) {
      return minimumValue
   } else {
      return if (`$this$coerceIn` > maximumValue) maximumValue else `$this$coerceIn`
   }
}

public infix fun Long.downTo(to: Byte): LongProgression {
   return LongProgression.Companion.fromClosedRange(`$this$downTo`, (long)to, -1L)
}

@JvmName(name = "doubleRangeContains")
public operator fun ClosedRange<Double>.contains(value: Float): Boolean {
   return `$this$contains`.contains((double)value)
}

public infix fun Long.downTo(to: Long): LongProgression {
   return LongProgression.Companion.fromClosedRange(`$this$downTo`, to, -1L)
}

internal fun Float.toIntExactOrNull(): Int? {
   return if (-2.1474836E9F <= `$this$toIntExactOrNull` && `$this$toIntExactOrNull` <= 2.1474836E9F) (int)`$this$toIntExactOrNull` else null
}

@SinceKotlin(version = "1.1")
public fun <T : Comparable<Any>> Any.coerceIn(range: ClosedFloatingPointRange<Any>): Any {
   if (range.isEmpty()) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
   } else {
      return (T)(if (range.lessThanOrEquals(`$this$coerceIn`, range.getStart()) && !range.lessThanOrEquals(range.getStart(), `$this$coerceIn`))
         range.getStart()
         else
         (
            if (range.lessThanOrEquals(range.getEndInclusive(), `$this$coerceIn`) && !range.lessThanOrEquals(`$this$coerceIn`, range.getEndInclusive()))
               range.getEndInclusive()
               else
               `$this$coerceIn`
         ))
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.4")
@InlineOnly
public inline fun IntRange.randomOrNull(): Int? {
   return RangesKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

@JvmName(name = "byteRangeContains")
public operator fun ClosedRange<Byte>.contains(value: Int): Boolean {
   val it: java.lang.Byte = RangesKt.toByteExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

@JvmName(name = "intRangeContains")
public operator fun ClosedRange<Int>.contains(value: Byte): Boolean {
   return `$this$contains`.contains(Integer.valueOf(value))
}

public fun Short.coerceAtLeast(minimumValue: Short): Short {
   return if (`$this$coerceAtLeast` < minimumValue) minimumValue else `$this$coerceAtLeast`
}

@SinceKotlin(version = "1.7")
public fun IntProgression.first(): Int {
   if (`$this$first`.isEmpty()) {
      throw NoSuchElementException("Progression $`$this$first` is empty.")
   } else {
      return `$this$first`.first
   }
}

@JvmName(name = "intRangeContains")
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public operator fun OpenEndRange<Int>.contains(value: Long): Boolean {
   val it: Int = RangesKt.toIntExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

public infix fun Long.until(to: Long): LongRange {
   return if (to <= java.lang.Long.MIN_VALUE) LongRange.Companion.EMPTY else LongRange(`$this$until`, to - 1L)
}

open fun RangesKt___RangesKt() {
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun CharRange.random(): Char {
   return RangesKt.random(`$this$random`, Random.Default)
}

@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@JvmName(name = "shortRangeContains")
public operator fun OpenEndRange<Short>.contains(value: Long): Boolean {
   val it: java.lang.Short = RangesKt.toShortExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

@JvmName(name = "shortRangeContains")
public operator fun ClosedRange<Short>.contains(value: Long): Boolean {
   val it: java.lang.Short = RangesKt.toShortExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

public fun Short.coerceAtMost(maximumValue: Short): Short {
   return if (`$this$coerceAtMost` > maximumValue) maximumValue else `$this$coerceAtMost`
}

@JvmName(name = "intRangeContains")
public operator fun ClosedRange<Int>.contains(value: Long): Boolean {
   val it: Int = RangesKt.toIntExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

public infix fun Byte.until(to: Short): IntRange {
   return IntRange(`$this$until`, to + -1)
}

public fun Byte.coerceAtLeast(minimumValue: Byte): Byte {
   return if (`$this$coerceAtLeast` < minimumValue) minimumValue else `$this$coerceAtLeast`
}

@SinceKotlin(version = "1.3")
public fun LongRange.random(random: Random): Long {
   try {
      return RandomKt.nextLong(random, `$this$random`)
   } catch (var3: IllegalArgumentException) {
      throw NoSuchElementException(var3.getMessage())
   }
}

public fun LongProgression.reversed(): LongProgression {
   return LongProgression.Companion.fromClosedRange(`$this$reversed`.last, `$this$reversed`.first, -`$this$reversed`.step)
}

public infix fun Byte.downTo(to: Int): IntProgression {
   return IntProgression.Companion.fromClosedRange(`$this$downTo`, to, -1)
}

@SinceKotlin(version = "1.7")
public fun CharProgression.firstOrNull(): Char? {
   return if (`$this$firstOrNull`.isEmpty()) null else `$this$firstOrNull`.first
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline fun LongRange.random(): Long {
   return RangesKt.random(`$this$random`, Random.Default)
}

public fun Double.coerceAtLeast(minimumValue: Double): Double {
   return if (`$this$coerceAtLeast` < minimumValue) minimumValue else `$this$coerceAtLeast`
}

internal fun Long.toShortExactOrNull(): Short? {
   return if (LongRange(-32768L, 32767L).contains(`$this$toShortExactOrNull`)) (short)((int)`$this$toShortExactOrNull`) else null
}

internal fun Float.toByteExactOrNull(): Byte? {
   return if (-128.0F <= `$this$toByteExactOrNull` && `$this$toByteExactOrNull` <= 127.0F) (byte)((int)`$this$toByteExactOrNull`) else null
}

public infix fun Short.downTo(to: Int): IntProgression {
   return IntProgression.Companion.fromClosedRange(`$this$downTo`, to, -1)
}

internal fun Long.toIntExactOrNull(): Int? {
   return if (LongRange(-2147483648L, 2147483647L).contains(`$this$toIntExactOrNull`)) (int)`$this$toIntExactOrNull` else null
}

@SinceKotlin(version = "1.7")
public fun IntProgression.lastOrNull(): Int? {
   return if (`$this$lastOrNull`.isEmpty()) null else `$this$lastOrNull`.last
}

public infix fun Byte.downTo(to: Short): IntProgression {
   return IntProgression.Companion.fromClosedRange(`$this$downTo`, to, -1)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@JvmName(name = "byteRangeContains")
@SinceKotlin(version = "1.9")
public operator fun OpenEndRange<Byte>.contains(value: Int): Boolean {
   val it: java.lang.Byte = RangesKt.toByteExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

internal fun Float.toLongExactOrNull(): Long? {
   return if (-9.223372E18F <= `$this$toLongExactOrNull` && `$this$toLongExactOrNull` <= 9.223372E18F) (long)`$this$toLongExactOrNull` else null
}

public infix fun Int.downTo(to: Long): LongProgression {
   return LongProgression.Companion.fromClosedRange((long)`$this$downTo`, to, -1L)
}

public fun Long.coerceIn(range: ClosedRange<Long>): Long {
   if (range is ClosedFloatingPointRange) {
      return RangesKt.coerceIn(`$this$coerceIn`, range as ClosedFloatingPointRange<java.lang.Long>).longValue()
   } else if (range.isEmpty()) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
   } else {
      return if (`$this$coerceIn` < (range.start as java.lang.Number).longValue())
         (range.start as java.lang.Number).longValue()
         else
         (
            if (`$this$coerceIn` > (range.endInclusive as java.lang.Number).longValue())
               (range.endInclusive as java.lang.Number).longValue()
               else
               `$this$coerceIn`
         )
      }
}

@InlineOnly
public inline operator fun IntRange.contains(value: Byte): Boolean {
   return RangesKt.intRangeContains(`$this$contains`, value)
}

@JvmName(name = "floatRangeContains")
public operator fun ClosedRange<Float>.contains(value: Double): Boolean {
   return `$this$contains`.contains((float)value)
}

public fun Int.coerceAtLeast(minimumValue: Int): Int {
   return if (`$this$coerceAtLeast` < minimumValue) minimumValue else `$this$coerceAtLeast`
}

@SinceKotlin(version = "1.7")
public fun LongProgression.last(): Long {
   if (`$this$last`.isEmpty()) {
      throw NoSuchElementException("Progression $`$this$last` is empty.")
   } else {
      return `$this$last`.last
   }
}

public infix fun LongProgression.step(step: Long): LongProgression {
   RangesKt.checkStepIsPositive(step > 0L, step)
   return LongProgression.Companion.fromClosedRange(`$this$step`.first, `$this$step`.last, if (`$this$step`.step > 0L) step else -step)
}

@InlineOnly
public inline operator fun LongRange.contains(value: Byte): Boolean {
   return RangesKt.longRangeContains(`$this$contains`, value)
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun LongRange.randomOrNull(random: Random): Long? {
   return if (`$this$randomOrNull`.isEmpty()) null else RandomKt.nextLong(random, `$this$randomOrNull`)
}

@SinceKotlin(version = "1.7")
public fun CharProgression.last(): Char {
   if (`$this$last`.isEmpty()) {
      throw NoSuchElementException("Progression $`$this$last` is empty.")
   } else {
      return `$this$last`.last
   }
}

@SinceKotlin(version = "1.7")
public fun LongProgression.firstOrNull(): Long? {
   return if (`$this$firstOrNull`.isEmpty()) null else `$this$firstOrNull`.first
}

@InlineOnly
public inline operator fun IntRange.contains(value: Long): Boolean {
   return RangesKt.intRangeContains(`$this$contains`, (long)value)
}

public infix fun Short.until(to: Byte): IntRange {
   return IntRange(`$this$until`, to + -1)
}

@SinceKotlin(version = "1.7")
public fun LongProgression.first(): Long {
   if (`$this$first`.isEmpty()) {
      throw NoSuchElementException("Progression $`$this$first` is empty.")
   } else {
      return `$this$first`.first
   }
}

public infix fun Long.until(to: Short): LongRange {
   return LongRange(`$this$until`, to - 1L)
}

internal fun Double.toIntExactOrNull(): Int? {
   return if (-2.1474836E9F <= `$this$toIntExactOrNull` && `$this$toIntExactOrNull` <= 2.147483647E9) (int)`$this$toIntExactOrNull` else null
}

@SinceKotlin(version = "1.3")
public fun IntRange.random(random: Random): Int {
   try {
      return RandomKt.nextInt(random, `$this$random`)
   } catch (var3: IllegalArgumentException) {
      throw NoSuchElementException(var3.getMessage())
   }
}

public fun Double.coerceAtMost(maximumValue: Double): Double {
   return if (`$this$coerceAtMost` > maximumValue) maximumValue else `$this$coerceAtMost`
}

@JvmName(name = "intRangeContains")
public operator fun ClosedRange<Int>.contains(value: Short): Boolean {
   return `$this$contains`.contains(Integer.valueOf(value))
}

public infix fun Byte.downTo(to: Long): LongProgression {
   return LongProgression.Companion.fromClosedRange((long)`$this$downTo`, to, -1L)
}

public infix fun Long.downTo(to: Short): LongProgression {
   return LongProgression.Companion.fromClosedRange(`$this$downTo`, (long)to, -1L)
}

public fun Int.coerceIn(range: ClosedRange<Int>): Int {
   if (range is ClosedFloatingPointRange) {
      return RangesKt.coerceIn(`$this$coerceIn`, range as ClosedFloatingPointRange<Integer>).intValue()
   } else if (range.isEmpty()) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: $range${46}")
   } else {
      return if (`$this$coerceIn` < (range.start as java.lang.Number).intValue())
         (range.start as java.lang.Number).intValue()
         else
         (if (`$this$coerceIn` > (range.endInclusive as java.lang.Number).intValue()) (range.endInclusive as java.lang.Number).intValue() else `$this$coerceIn`)
      }
}

@SinceKotlin(version = "1.7")
public fun IntProgression.firstOrNull(): Int? {
   return if (`$this$firstOrNull`.isEmpty()) null else `$this$firstOrNull`.first
}

@JvmName(name = "byteRangeContains")
public operator fun ClosedRange<Byte>.contains(value: Short): Boolean {
   val it: java.lang.Byte = RangesKt.toByteExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

public infix fun Byte.until(to: Byte): IntRange {
   return IntRange(`$this$until`, to + -1)
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline operator fun CharRange.contains(element: Char?): Boolean {
   return element != null && `$this$contains`.contains(element.charValue())
}

internal fun Short.toByteExactOrNull(): Byte? {
   return if (RangesKt.intRangeContains(IntRange(-128, 127), (short)`$this$toByteExactOrNull`)) (byte)`$this$toByteExactOrNull` else null
}

public fun Int.coerceAtMost(maximumValue: Int): Int {
   return if (`$this$coerceAtMost` > maximumValue) maximumValue else `$this$coerceAtMost`
}

internal fun Double.toByteExactOrNull(): Byte? {
   return if (-128.0 <= `$this$toByteExactOrNull` && `$this$toByteExactOrNull` <= 127.0) (byte)((int)`$this$toByteExactOrNull`) else null
}

@JvmName(name = "longRangeContains")
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public operator fun OpenEndRange<Long>.contains(value: Int): Boolean {
   return `$this$contains`.contains((long)value)
}

@InlineOnly
public inline operator fun LongRange.contains(value: Short): Boolean {
   return RangesKt.longRangeContains(`$this$contains`, (short)value)
}

public infix fun Char.downTo(to: Char): CharProgression {
   return CharProgression.Companion.fromClosedRange(`$this$downTo`, to, -1)
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@InlineOnly
public inline fun CharRange.randomOrNull(): Char? {
   return RangesKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

public fun <T : Comparable<Any>> Any.coerceAtLeast(minimumValue: Any): Any {
   return (T)(if (`$this$coerceAtLeast`.compareTo(minimumValue) < 0) minimumValue else `$this$coerceAtLeast`)
}

public fun Long.coerceIn(minimumValue: Long, maximumValue: Long): Long {
   if (minimumValue > maximumValue) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
   } else if (`$this$coerceIn` < minimumValue) {
      return minimumValue
   } else {
      return if (`$this$coerceIn` > maximumValue) maximumValue else `$this$coerceIn`
   }
}

public infix fun Short.downTo(to: Byte): IntProgression {
   return IntProgression.Companion.fromClosedRange(`$this$downTo`, to, -1)
}

public infix fun Short.until(to: Long): LongRange {
   return if (to <= java.lang.Long.MIN_VALUE) LongRange.Companion.EMPTY else LongRange(`$this$until`, to - 1L)
}

@SinceKotlin(version = "1.7")
public fun LongProgression.lastOrNull(): Long? {
   return if (`$this$lastOrNull`.isEmpty()) null else `$this$lastOrNull`.last
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.9")
@JvmName(name = "longRangeContains")
public operator fun OpenEndRange<Long>.contains(value: Short): Boolean {
   return `$this$contains`.contains((long)value)
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline operator fun IntRange.contains(element: Int?): Boolean {
   return element != null && `$this$contains`.contains(element.intValue())
}

public infix fun Short.until(to: Int): IntRange {
   return if (to <= Integer.MIN_VALUE) IntRange.Companion.EMPTY else IntRange(`$this$until`, to + -1)
}

@JvmName(name = "shortRangeContains")
public operator fun ClosedRange<Short>.contains(value: Int): Boolean {
   val it: java.lang.Short = RangesKt.toShortExactOrNull(value)
   return it != null && `$this$contains`.contains(it)
}

internal fun Double.toShortExactOrNull(): Short? {
   return if (-32768.0 <= `$this$toShortExactOrNull` && `$this$toShortExactOrNull` <= 32767.0) (short)((int)`$this$toShortExactOrNull`) else null
}

public fun Byte.coerceIn(minimumValue: Byte, maximumValue: Byte): Byte {
   if (minimumValue > maximumValue) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
   } else if (`$this$coerceIn` < minimumValue) {
      return minimumValue
   } else {
      return if (`$this$coerceIn` > maximumValue) maximumValue else `$this$coerceIn`
   }
}

internal fun Double.toLongExactOrNull(): Long? {
   return if (-9.223372E18F <= `$this$toLongExactOrNull` && `$this$toLongExactOrNull` <= 9.223372E18F) (long)`$this$toLongExactOrNull` else null
}

public fun <T : Comparable<Any>> Any.coerceIn(minimumValue: Any?, maximumValue: Any?): Any {
   if (minimumValue != null && maximumValue != null) {
      if (minimumValue.compareTo(maximumValue) > 0) {
         throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue.")
      }

      if (`$this$coerceIn`.compareTo(minimumValue) < 0) {
         return (T)minimumValue
      }

      if (`$this$coerceIn`.compareTo(maximumValue) > 0) {
         return (T)maximumValue
      }
   } else {
      if (minimumValue != null && `$this$coerceIn`.compareTo(minimumValue) < 0) {
         return (T)minimumValue
      }

      if (maximumValue != null && `$this$coerceIn`.compareTo(maximumValue) > 0) {
         return (T)maximumValue
      }
   }

   return (T)`$this$coerceIn`
}

public fun Float.coerceAtMost(maximumValue: Float): Float {
   return if (`$this$coerceAtMost` > maximumValue) maximumValue else `$this$coerceAtMost`
}

public fun Float.coerceAtLeast(minimumValue: Float): Float {
   return if (`$this$coerceAtLeast` < minimumValue) minimumValue else `$this$coerceAtLeast`
}

public infix fun Short.downTo(to: Long): LongProgression {
   return LongProgression.Companion.fromClosedRange((long)`$this$downTo`, to, -1L)
}

public fun Int.coerceIn(minimumValue: Int, maximumValue: Int): Int {
   if (minimumValue > maximumValue) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: maximum $maximumValue is less than minimum $minimumValue${46}")
   } else if (`$this$coerceIn` < minimumValue) {
      return minimumValue
   } else {
      return if (`$this$coerceIn` > maximumValue) maximumValue else `$this$coerceIn`
   }
}

public infix fun Int.downTo(to: Byte): IntProgression {
   return IntProgression.Companion.fromClosedRange(`$this$downTo`, to, -1)
}

public fun CharProgression.reversed(): CharProgression {
   return CharProgression.Companion.fromClosedRange(`$this$reversed`.last, `$this$reversed`.first, -`$this$reversed`.step)
}

@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public fun IntRange.randomOrNull(random: Random): Int? {
   return if (`$this$randomOrNull`.isEmpty()) null else RandomKt.nextInt(random, `$this$randomOrNull`)
}

public infix fun CharProgression.step(step: Int): CharProgression {
   RangesKt.checkStepIsPositive(step > 0, step)
   return CharProgression.Companion.fromClosedRange(`$this$step`.first, `$this$step`.last, if (`$this$step`.step > 0) step else -step)
}

public infix fun Short.downTo(to: Short): IntProgression {
   return IntProgression.Companion.fromClosedRange(`$this$downTo`, to, -1)
}

public fun Byte.coerceAtMost(maximumValue: Byte): Byte {
   return if (`$this$coerceAtMost` > maximumValue) maximumValue else `$this$coerceAtMost`
}

@InlineOnly
public inline operator fun LongRange.contains(value: Int): Boolean {
   return RangesKt.longRangeContains(`$this$contains`, (int)value)
}

internal fun Int.toShortExactOrNull(): Short? {
   return if (IntRange(-32768, 32767).contains(`$this$toShortExactOrNull`)) (short)`$this$toShortExactOrNull` else null
}

public infix fun Int.until(to: Short): IntRange {
   return IntRange(`$this$until`, to + -1)
}
