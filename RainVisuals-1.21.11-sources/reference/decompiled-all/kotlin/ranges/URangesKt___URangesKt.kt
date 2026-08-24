@file:JvmMultifileClass
@file:JvmName("URangesKt")

package kotlin.ranges

import java.util.NoSuchElementException
import kotlin.internal.InlineOnly
import kotlin.jvm.internal.Intrinsics
import kotlin.random.Random
import kotlin.random.URandomKt

// $VF: Compiled from _URanges.kt
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun ULongRange.random(random: Random): ULong {
   try {
      return URandomKt.nextULong(random, `$this$random`)
   } catch (var3: IllegalArgumentException) {
      throw NoSuchElementException(var3.getMessage())
   }
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun UInt.coerceIn(range: ClosedRange<UInt>): UInt {
   if (range is ClosedFloatingPointRange) {
      return RangesKt.coerceIn(UInt.box_impl/* $VF was: box-impl */(`$this$coerceIn_u2dwuiCnnA`), range as ClosedFloatingPointRange<UInt>)
         .unbox_impl/* $VF was: unbox-impl */()
      } else if (range.isEmpty()) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: $range${46}")
   } else {
      return if (Integer.compareUnsigned(`$this$coerceIn_u2dwuiCnnA`, (range.start as UInt).unbox_impl/* $VF was: unbox-impl */()) < 0)
         (range.start as UInt).unbox_impl/* $VF was: unbox-impl */()
         else
         (
            if (Integer.compareUnsigned(`$this$coerceIn_u2dwuiCnnA`, (range.endInclusive as UInt).unbox_impl/* $VF was: unbox-impl */()) > 0)
               (range.endInclusive as UInt).unbox_impl/* $VF was: unbox-impl */()
               else
               `$this$coerceIn_u2dwuiCnnA`
         )
      }
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun UInt.coerceAtLeast(minimumValue: UInt): UInt {
   return if (Integer.compareUnsigned(`$this$coerceAtLeast_u2dJ1ME1BU`, minimumValue) < 0) minimumValue else `$this$coerceAtLeast_u2dJ1ME1BU`
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun UIntRange.random(): UInt {
   return URangesKt.random(`$this$random`, Random.Default)
}

@SinceKotlin(version = "1.7")
public fun UIntProgression.last(): UInt {
   if (`$this$last`.isEmpty()) {
      throw NoSuchElementException("Progression $`$this$last` is empty.")
   } else {
      return `$this$last`.last
   }
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@InlineOnly
@SinceKotlin(version = "1.5")
public inline operator fun ULongRange.contains(element: ULong?): Boolean {
   return element != null && `$this$contains_u2dGYNo2lE`.contains_VKZWuLQ/* $VF was: contains-VKZWuLQ */(element.unbox_impl/* $VF was: unbox-impl */())
}

@SinceKotlin(version = "1.7")
public fun ULongProgression.last(): ULong {
   if (`$this$last`.isEmpty()) {
      throw NoSuchElementException("Progression $`$this$last` is empty.")
   } else {
      return `$this$last`.last
   }
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public operator fun UIntRange.contains(value: UByte): Boolean {
   return `$this$contains_u2d68kG9v0`.contains_WZ4Q5Ns/* $VF was: contains-WZ4Q5Ns */(UInt.constructor_impl/* $VF was: constructor-impl */(value and 255))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public infix fun UShort.until(to: UShort): UIntRange {
   return if (Intrinsics.compare(to and 65535, 0 and 65535) <= 0)
      UIntRange.Companion.EMPTY
      else
      UIntRange(
         UInt.constructor_impl/* $VF was: constructor-impl */(`$this$until_u2d5PvTz6A` and 65535),
         UInt.constructor_impl/* $VF was: constructor-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(to and 65535) - 1),
         null
      )
   }

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun UInt.coerceIn(minimumValue: UInt, maximumValue: UInt): UInt {
   if (Integer.compareUnsigned(minimumValue, maximumValue) > 0) {
      throw IllegalArgumentException(
         "Cannot coerce value to an empty range: maximum ${UInt.toString_impl/* $VF was: toString-impl */(maximumValue)} is less than minimum ${UInt.toString_impl/* $VF was: toString-impl */(
            minimumValue
         )}${46}"
      )
   } else if (Integer.compareUnsigned(`$this$coerceIn_u2dWZ9TVnA`, minimumValue) < 0) {
      return minimumValue
   } else {
      return if (Integer.compareUnsigned(`$this$coerceIn_u2dWZ9TVnA`, maximumValue) > 0) maximumValue else `$this$coerceIn_u2dWZ9TVnA`
   }
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public infix fun UInt.downTo(to: UInt): UIntProgression {
   return UIntProgression.Companion.fromClosedRange_Nkh28Cs/* $VF was: fromClosedRange-Nkh28Cs */(`$this$downTo_u2dJ1ME1BU`, to, -1)
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun UInt.coerceAtMost(maximumValue: UInt): UInt {
   return if (Integer.compareUnsigned(`$this$coerceAtMost_u2dJ1ME1BU`, maximumValue) > 0) maximumValue else `$this$coerceAtMost_u2dJ1ME1BU`
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun ULong.coerceAtMost(maximumValue: ULong): ULong {
   return if (java.lang.Long.compareUnsigned(`$this$coerceAtMost_u2deb3DHEI`, maximumValue) > 0) maximumValue else `$this$coerceAtMost_u2deb3DHEI`
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun ULong.coerceIn(minimumValue: ULong, maximumValue: ULong): ULong {
   if (java.lang.Long.compareUnsigned(minimumValue, maximumValue) > 0) {
      throw IllegalArgumentException(
         "Cannot coerce value to an empty range: maximum ${ULong.toString_impl/* $VF was: toString-impl */(maximumValue)} is less than minimum ${ULong.toString_impl/* $VF was: toString-impl */(
            minimumValue
         )}."
      )
   } else if (java.lang.Long.compareUnsigned(`$this$coerceIn_u2dsambcqE`, minimumValue) < 0) {
      return minimumValue
   } else {
      return if (java.lang.Long.compareUnsigned(`$this$coerceIn_u2dsambcqE`, maximumValue) > 0) maximumValue else `$this$coerceIn_u2dsambcqE`
   }
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun ULong.coerceAtLeast(minimumValue: ULong): ULong {
   return if (java.lang.Long.compareUnsigned(`$this$coerceAtLeast_u2deb3DHEI`, minimumValue) < 0) minimumValue else `$this$coerceAtLeast_u2deb3DHEI`
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun UByte.coerceAtMost(maximumValue: UByte): UByte {
   return if (Intrinsics.compare(`$this$coerceAtMost_u2dKr8caGY` and 255, maximumValue and 255) > 0) maximumValue else `$this$coerceAtMost_u2dKr8caGY`
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun UByte.coerceIn(minimumValue: UByte, maximumValue: UByte): UByte {
   if (Intrinsics.compare(minimumValue and 255, maximumValue and 255) > 0) {
      throw IllegalArgumentException(
         "Cannot coerce value to an empty range: maximum ${UByte.toString_impl/* $VF was: toString-impl */(maximumValue)} is less than minimum ${UByte.toString_impl/* $VF was: toString-impl */(
            minimumValue
         )}."
      )
   } else if (Intrinsics.compare(`$this$coerceIn_u2db33U2AM` and 255, minimumValue and 255) < 0) {
      return minimumValue
   } else {
      return if (Intrinsics.compare(`$this$coerceIn_u2db33U2AM` and 255, maximumValue and 255) > 0) maximumValue else `$this$coerceIn_u2db33U2AM`
   }
}

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
public inline fun UIntRange.randomOrNull(): UInt? {
   return URangesKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun ULongProgression.reversed(): ULongProgression {
   return ULongProgression.Companion
      .fromClosedRange_7ftBX0g/* $VF was: fromClosedRange-7ftBX0g */(`$this$reversed`.last, `$this$reversed`.first, -`$this$reversed`.step)
   }

@SinceKotlin(version = "1.5")
@InlineOnly
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline operator fun UIntRange.contains(element: UInt?): Boolean {
   return element != null && `$this$contains_u2dbiwQdVI`.contains_WZ4Q5Ns/* $VF was: contains-WZ4Q5Ns */(element.unbox_impl/* $VF was: unbox-impl */())
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public operator fun UIntRange.contains(value: UShort): Boolean {
   return `$this$contains_u2dZsK3CEQ`.contains_WZ4Q5Ns/* $VF was: contains-WZ4Q5Ns */(UInt.constructor_impl/* $VF was: constructor-impl */(value and 65535))
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public infix fun UInt.until(to: UInt): UIntRange {
   return if (Integer.compareUnsigned(to, 0) <= 0)
      UIntRange.Companion.EMPTY
      else
      UIntRange(`$this$until_u2dJ1ME1BU`, UInt.constructor_impl/* $VF was: constructor-impl */(to + -1), null)
   }

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
public inline fun ULongRange.randomOrNull(): ULong? {
   return URangesKt.randomOrNull(`$this$randomOrNull`, Random.Default)
}

@SinceKotlin(version = "1.7")
public fun UIntProgression.firstOrNull(): UInt? {
   return if (`$this$firstOrNull`.isEmpty()) null else UInt.box_impl/* $VF was: box-impl */(`$this$firstOrNull`.first)
}

@SinceKotlin(version = "1.7")
public fun UIntProgression.lastOrNull(): UInt? {
   return if (`$this$lastOrNull`.isEmpty()) null else UInt.box_impl/* $VF was: box-impl */(`$this$lastOrNull`.last)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public infix fun UByte.until(to: UByte): UIntRange {
   return if (Intrinsics.compare(to and 255, 0 and 255) <= 0)
      UIntRange.Companion.EMPTY
      else
      UIntRange(
         UInt.constructor_impl/* $VF was: constructor-impl */(`$this$until_u2dKr8caGY` and 255),
         UInt.constructor_impl/* $VF was: constructor-impl */(UInt.constructor_impl/* $VF was: constructor-impl */(to and 255) - 1),
         null
      )
   }

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun UByte.coerceAtLeast(minimumValue: UByte): UByte {
   return if (Intrinsics.compare(`$this$coerceAtLeast_u2dKr8caGY` and 255, minimumValue and 255) < 0) minimumValue else `$this$coerceAtLeast_u2dKr8caGY`
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public operator fun ULongRange.contains(value: UShort): Boolean {
   return `$this$contains_u2duhHAxoY`.contains_VKZWuLQ/* $VF was: contains-VKZWuLQ */(
      ULong.constructor_impl/* $VF was: constructor-impl */((long)value and 65535L)
   )
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public operator fun ULongRange.contains(value: UByte): Boolean {
   return `$this$contains_u2dULb_u2dyJY`.contains_VKZWuLQ/* $VF was: contains-VKZWuLQ */(
      ULong.constructor_impl/* $VF was: constructor-impl */((long)value and 255L)
   )
}

@SinceKotlin(version = "1.7")
public fun ULongProgression.lastOrNull(): ULong? {
   return if (`$this$lastOrNull`.isEmpty()) null else ULong.box_impl/* $VF was: box-impl */(`$this$lastOrNull`.last)
}

@SinceKotlin(version = "1.7")
public fun UIntProgression.first(): UInt {
   if (`$this$first`.isEmpty()) {
      throw NoSuchElementException("Progression $`$this$first` is empty.")
   } else {
      return `$this$first`.first
   }
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun UIntProgression.reversed(): UIntProgression {
   return UIntProgression.Companion
      .fromClosedRange_Nkh28Cs/* $VF was: fromClosedRange-Nkh28Cs */(`$this$reversed`.last, `$this$reversed`.first, -`$this$reversed`.step)
   }

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public infix fun ULongProgression.step(step: Long): ULongProgression {
   RangesKt.checkStepIsPositive(step > 0L, step)
   return ULongProgression.Companion
      .fromClosedRange_7ftBX0g/* $VF was: fromClosedRange-7ftBX0g */(`$this$step`.first, `$this$step`.last, if (`$this$step`.step > 0L) step else -step)
   }

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public infix fun ULong.until(to: ULong): ULongRange {
   return if (java.lang.Long.compareUnsigned(to, 0L) <= 0)
      ULongRange.Companion.EMPTY
      else
      ULongRange(
         `$this$until_u2deb3DHEI`,
         ULong.constructor_impl/* $VF was: constructor-impl */(to - ULong.constructor_impl/* $VF was: constructor-impl */((long)1 and 4294967295L)),
         null
      )
   }

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public infix fun ULong.downTo(to: ULong): ULongProgression {
   return ULongProgression.Companion.fromClosedRange_7ftBX0g/* $VF was: fromClosedRange-7ftBX0g */(`$this$downTo_u2deb3DHEI`, to, -1L)
}

@SinceKotlin(version = "1.7")
public fun ULongProgression.first(): ULong {
   if (`$this$first`.isEmpty()) {
      throw NoSuchElementException("Progression $`$this$first` is empty.")
   } else {
      return `$this$first`.first
   }
}

open fun URangesKt___URangesKt() {
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public operator fun UIntRange.contains(value: ULong): Boolean {
   return ULong.constructor_impl/* $VF was: constructor-impl */(value ushr 32) == 0L
      && `$this$contains_u2dfz5IDCE`.contains_WZ4Q5Ns/* $VF was: contains-WZ4Q5Ns */(UInt.constructor_impl/* $VF was: constructor-impl */((int)value))
   }

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public infix fun UByte.downTo(to: UByte): UIntProgression {
   return UIntProgression.Companion
      .fromClosedRange_Nkh28Cs/* $VF was: fromClosedRange-Nkh28Cs */(
         UInt.constructor_impl/* $VF was: constructor-impl */(`$this$downTo_u2dKr8caGY` and 255),
         UInt.constructor_impl/* $VF was: constructor-impl */(to and 255),
         -1
      )
   }

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun UIntRange.random(random: Random): UInt {
   try {
      return URandomKt.nextUInt(random, `$this$random`)
   } catch (var3: IllegalArgumentException) {
      throw NoSuchElementException(var3.getMessage())
   }
}

@InlineOnly
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public inline fun ULongRange.random(): ULong {
   return URangesKt.random(`$this$random`, Random.Default)
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
public fun ULongRange.randomOrNull(random: Random): ULong? {
   return if (`$this$randomOrNull`.isEmpty()) null else ULong.box_impl/* $VF was: box-impl */(URandomKt.nextULong(random, `$this$randomOrNull`))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public infix fun UIntProgression.step(step: Int): UIntProgression {
   RangesKt.checkStepIsPositive(step > 0, step)
   return UIntProgression.Companion
      .fromClosedRange_Nkh28Cs/* $VF was: fromClosedRange-Nkh28Cs */(`$this$step`.first, `$this$step`.last, if (`$this$step`.step > 0) step else -step)
   }

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class, ExperimentalUnsignedTypes::class])
public fun UIntRange.randomOrNull(random: Random): UInt? {
   return if (`$this$randomOrNull`.isEmpty()) null else UInt.box_impl/* $VF was: box-impl */(URandomKt.nextUInt(random, `$this$randomOrNull`))
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public infix fun UShort.downTo(to: UShort): UIntProgression {
   return UIntProgression.Companion
      .fromClosedRange_Nkh28Cs/* $VF was: fromClosedRange-Nkh28Cs */(
         UInt.constructor_impl/* $VF was: constructor-impl */(`$this$downTo_u2d5PvTz6A` and 65535),
         UInt.constructor_impl/* $VF was: constructor-impl */(to and 65535),
         -1
      )
   }

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun ULong.coerceIn(range: ClosedRange<ULong>): ULong {
   if (range is ClosedFloatingPointRange) {
      return RangesKt.coerceIn(ULong.box_impl/* $VF was: box-impl */(`$this$coerceIn_u2dJPwROB0`), range as ClosedFloatingPointRange<ULong>)
         .unbox_impl/* $VF was: unbox-impl */()
      } else if (range.isEmpty()) {
      throw IllegalArgumentException("Cannot coerce value to an empty range: $range.")
   } else {
      return if (java.lang.Long.compareUnsigned(`$this$coerceIn_u2dJPwROB0`, (range.start as ULong).unbox_impl/* $VF was: unbox-impl */()) < 0)
         (range.start as ULong).unbox_impl/* $VF was: unbox-impl */()
         else
         (
            if (java.lang.Long.compareUnsigned(`$this$coerceIn_u2dJPwROB0`, (range.endInclusive as ULong).unbox_impl/* $VF was: unbox-impl */()) > 0)
               (range.endInclusive as ULong).unbox_impl/* $VF was: unbox-impl */()
               else
               `$this$coerceIn_u2dJPwROB0`
         )
      }
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun UShort.coerceAtMost(maximumValue: UShort): UShort {
   return if (Intrinsics.compare(`$this$coerceAtMost_u2d5PvTz6A` and 65535, maximumValue and 65535) > 0) maximumValue else `$this$coerceAtMost_u2d5PvTz6A`
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public operator fun ULongRange.contains(value: UInt): Boolean {
   return `$this$contains_u2dGab390E`.contains_VKZWuLQ/* $VF was: contains-VKZWuLQ */(
      ULong.constructor_impl/* $VF was: constructor-impl */((long)value and 4294967295L)
   )
}

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public fun UShort.coerceAtLeast(minimumValue: UShort): UShort {
   return if (Intrinsics.compare(`$this$coerceAtLeast_u2d5PvTz6A` and 65535, minimumValue and 65535) < 0) minimumValue else `$this$coerceAtLeast_u2d5PvTz6A`
}

@SinceKotlin(version = "1.7")
public fun ULongProgression.firstOrNull(): ULong? {
   return if (`$this$firstOrNull`.isEmpty()) null else ULong.box_impl/* $VF was: box-impl */(`$this$firstOrNull`.first)
}

@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public fun UShort.coerceIn(minimumValue: UShort, maximumValue: UShort): UShort {
   if (Intrinsics.compare(minimumValue and 65535, maximumValue and 65535) > 0) {
      throw IllegalArgumentException(
         "Cannot coerce value to an empty range: maximum ${UShort.toString_impl/* $VF was: toString-impl */(maximumValue)} is less than minimum ${UShort.toString_impl/* $VF was: toString-impl */(
            minimumValue
         )}."
      )
   } else if (Intrinsics.compare(`$this$coerceIn_u2dVKSA0NQ` and 65535, minimumValue and 65535) < 0) {
      return minimumValue
   } else {
      return if (Intrinsics.compare(`$this$coerceIn_u2dVKSA0NQ` and 65535, maximumValue and 65535) > 0) maximumValue else `$this$coerceIn_u2dVKSA0NQ`
   }
}
