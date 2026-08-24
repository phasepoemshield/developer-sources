@file:JvmMultifileClass
@file:JvmName("RangesKt")

package kotlin.ranges

import kotlin.internal.InlineOnly

// $VF: Compiled from Ranges.kt
public operator fun <T : Comparable<Any>> Any.rangeTo(that: Any): ClosedRange<Any> {
   return ComparableRange(`$this$rangeTo`, that)
}

@SinceKotlin(version = "1.1")
public operator fun Double.rangeTo(that: Double): ClosedFloatingPointRange<Double> {
   return ClosedDoubleRange(`$this$rangeTo`, that)
}

open fun RangesKt__RangesKt() {
}

@SinceKotlin(version = "1.9")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public inline operator fun <T : Any, R> Any.contains(element: Any?): Boolean where R : OpenEndRange<Any>, R : Iterable<Any> {
   return element != null && `$this$contains`.contains(element as java.lang.Comparable)
}

@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public operator fun Float.rangeUntil(that: Float): OpenEndRange<Float> {
   return OpenEndFloatRange(`$this$rangeUntil`, that)
}

@SinceKotlin(version = "1.3")
@InlineOnly
public inline operator fun <T : Any, R> Any.contains(element: Any?): Boolean where R : ClosedRange<Any>, R : Iterable<Any> {
   return element != null && `$this$contains`.contains(element as java.lang.Comparable)
}

internal fun checkStepIsPositive(isPositive: Boolean, step: Number) {
   if (!isPositive) {
      throw IllegalArgumentException("Step must be positive, was: $step.")
   }
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.9")
public operator fun Double.rangeUntil(that: Double): OpenEndRange<Double> {
   return OpenEndDoubleRange(`$this$rangeUntil`, that)
}

@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
@SinceKotlin(version = "1.9")
public operator fun <T : Comparable<Any>> Any.rangeUntil(that: Any): OpenEndRange<Any> {
   return ComparableOpenEndRange(`$this$rangeUntil`, that)
}

@SinceKotlin(version = "1.1")
public operator fun Float.rangeTo(that: Float): ClosedFloatingPointRange<Float> {
   return ClosedFloatRange(`$this$rangeTo`, that)
}
