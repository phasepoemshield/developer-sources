package kotlin.time

import kotlin.internal.InlineOnly
import kotlin.math.MathKt

// $VF: Compiled from Duration.kt
internal const val NANOS_IN_MILLIS: Int = 1000000
internal const val MAX_MILLIS: Long = 4611686018427387903L
internal const val MAX_NANOS: Long = 4611686018426999999L
private const val MAX_NANOS_IN_MILLIS: Long = 4611686018426L

@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.6")
@InlineOnly
public inline operator fun Double.times(duration: Duration): Duration {
   return Duration.times_UwyO8pc/* $VF was: times-UwyO8pc */(duration, `$this$times_u2dkIfJnKk`)
}

private fun parseDuration(value: String, strictIso: Boolean): Duration {
   val length: Int = value.length()
   if (length == 0) {
      throw IllegalArgumentException("The string is empty")
   } else {
      var var23: Int = 0
      var result: Long = Duration.Companion.ZERO
      val hasSign: Char = value.charAt(0)
      if (hasSign == '+' || hasSign == '-') {
         var23++
      }

      val var27: Boolean = var23 > 0
      val isNegative: Boolean = var23 > 0 && StringsKt.startsWith$default(value, '-', false, 2, null)
      if (length <= var23) {
         throw IllegalArgumentException("No components")
      } else {
         if (value.charAt(var23) != 'P') {
            if (strictIso) {
               throw IllegalArgumentException()
            }

            if (StringsKt.regionMatches(value, var23, "Infinity", 0, Math.max(length - var23, "Infinity".length()), true)) {
               result = Duration.Companion.INFINITE
            } else {
               var var28: DurationUnit = null
               var var29: Boolean = false
               var var30: Boolean = !var27
               if (var27 && value.charAt(var23) == '(' && StringsKt.last(value) == ')') {
                  var30 = true
                  var23++
                  if (var23 == --length) {
                     throw IllegalArgumentException("No components")
                  }
               }

               while (var23 < length) {
                  if (var29 && var30) {
                     val var31: java.lang.String = value
                                          var23 = var39
                  }

                  var29 = true
                  val var52: java.lang.String = value
                                    var var70: java.lang.String = value.substring(var23, var62)
                  if (var70.length() == 0) {
                     throw IllegalArgumentException()
                  }

                  var23 = var23 + var70.length()
                  val var58: java.lang.String = value
                                    var70 = value.substring(var23, var66)
                  var23 = var23 + var70.length()
                  val var42: DurationUnit = DurationUnitKt.durationUnitByShortName(var70)
                  if (var28 != null && var28.compareTo(var42) <= 0) {
                     throw IllegalArgumentException("Unexpected order of duration components")
                  }

                  var28 = var42
                  val var47: Int = StringsKt.indexOf$default(var70, '.', 0, false, 6, null)
                  if (var47 > 0) {
                     val var72: java.lang.String = var70.substring(0, var47)
                     result = Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(result, toDuration(java.lang.Long.parseLong(var72), var42))
                     val var73: java.lang.String = var70.substring(var47)
                     result = Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(result, toDuration(java.lang.Double.parseDouble(var73), var42))
                     if (var23 < length) {
                        throw IllegalArgumentException("Fractional component must be last")
                     }
                  } else {
                     result = Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(result, toDuration(java.lang.Long.parseLong(var70), var42))
                  }
               }
            }
         } else {
            if (++var23 == length) {
               throw IllegalArgumentException()
            }

            val prevUnit: java.lang.String = "+-."
            var afterFirst: Boolean = false
            var allowSpaces: DurationUnit = null

            while (var23 < length) {
               if (value.charAt(var23) == 'T') {
                  if (afterFirst || ++var23 == length) {
                     throw IllegalArgumentException()
                  }

                  afterFirst = true
               } else {
                  val whole: java.lang.String = value
                                    val var10000: java.lang.String = value.substring(var23, `$i$f$skipWhile`)
                  if (var10000.length() == 0) {
                     throw IllegalArgumentException()
                  }

                  var23 += var10000.length()
                  val var37: java.lang.CharSequence = value
                  if (var23 < 0 || var23 > StringsKt.getLastIndex(value)) {
                     throw IllegalArgumentException("Missing unit for value $var10000")
                  }

                  val var33: Char = var37.charAt(var23)
                  var23++
                  val var38: DurationUnit = DurationUnitKt.durationUnitByIsoChar(var33, afterFirst)
                  if (allowSpaces != null && allowSpaces.compareTo(var38) <= 0) {
                     throw IllegalArgumentException("Unexpected order of duration components")
                  }

                  allowSpaces = var38
                  val var43: Int = StringsKt.indexOf$default(var10000, '.', 0, false, 6, null)
                  if (var38 === DurationUnit.SECONDS && var43 > 0) {
                     val var69: java.lang.String = var10000.substring(0, var43)
                     result = Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(result, toDuration(parseOverLongIsoComponent(var69), var38))
                     val var10001: java.lang.String = var10000.substring(var43)
                     result = Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(result, toDuration(java.lang.Double.parseDouble(var10001), var38))
                  } else {
                     result = Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(result, toDuration(parseOverLongIsoComponent(var10000), var38))
                  }
               }
            }
         }

         return if (isNegative) Duration.unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(result) else result
      }
   }
}

private fun millisToNanos(millis: Long): Long {
   return millis * 1000000
}

@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.6")
public fun Int.toDuration(unit: DurationUnit): Duration {
   return if (unit.compareTo(DurationUnit.SECONDS) <= 0)
      durationOfNanos(DurationUnitKt.convertDurationUnitOverflow((long)`$this$toDuration`, unit, DurationUnit.NANOSECONDS))
      else
      toDuration((long)`$this$toDuration`, unit)
   }

@InlineOnly
@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.6")
public inline operator fun Int.times(duration: Duration): Duration {
   return Duration.times_UwyO8pc/* $VF was: times-UwyO8pc */(duration, `$this$times_u2dmvk6XK0`)
}

@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = [ExperimentalTime::class])
public fun Double.toDuration(unit: DurationUnit): Duration {
   val valueInNs: Double = DurationUnitKt.convertDurationUnit((double)`$this$toDuration`, unit, DurationUnit.NANOSECONDS)
   if (java.lang.Double.isNaN(valueInNs)) {
      throw IllegalArgumentException("Duration value cannot be NaN.".toString())
   } else {
      val var9: Long = MathKt.roundToLong(valueInNs)
      return if (LongRange(-4611686018426999999L, 4611686018426999999L).contains(var9))
         durationOfNanos(var9)
         else
         durationOfMillisNormalized(MathKt.roundToLong(DurationUnitKt.convertDurationUnit((double)`$this$toDuration`, unit, DurationUnit.MILLISECONDS)))
      }
}

@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = [ExperimentalTime::class])
public fun Long.toDuration(unit: DurationUnit): Duration {
   val maxNsInUnit: Long = DurationUnitKt.convertDurationUnitOverflow(4611686018426999999L, DurationUnit.NANOSECONDS, unit)
   return if (LongRange(-maxNsInUnit, maxNsInUnit).contains(`$this$toDuration`))
      durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(`$this$toDuration`, unit, DurationUnit.NANOSECONDS))
      else
      durationOfMillis(
         RangesKt.coerceIn(DurationUnitKt.convertDurationUnit(`$this$toDuration`, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)
      )
   }

private fun nanosToMillis(nanos: Long): Long {
   return nanos / 1000000
}

private fun durationOfMillis(normalMillis: Long): Duration {
   return Duration.constructor_impl/* $VF was: constructor-impl */((normalMillis shl 1) + 1L)
}

private inline fun String.skipWhile(startIndex: Int, predicate: (Char) -> Boolean): Int {
   var i: Int = startIndex

   while (i < `$this$skipWhile`.length() && predicate(`$this$skipWhile`.charAt(i))) {
      i++
   }

   return i
}

private fun durationOfNanosNormalized(nanos: Long): Duration {
   return if (LongRange(-4611686018426999999L, 4611686018426999999L).contains(nanos)) durationOfNanos(nanos) else durationOfMillis(nanosToMillis(nanos))
}

private fun durationOfNanos(normalNanos: Long): Duration {
   return Duration.constructor_impl/* $VF was: constructor-impl */(normalNanos shl 1)
}

private inline fun String.substringWhile(startIndex: Int, predicate: (Char) -> Boolean): String {
   val `$this$skipWhile$iv`: java.lang.String = `$this$substringWhile`
   var `i$iv`: Int = startIndex

   while (`i$iv` < `$this$skipWhile$iv`.length() && predicate(`$this$skipWhile$iv`.charAt(`i$iv`))) {
      `i$iv`++
   }

   val var10000: java.lang.String = `$this$substringWhile`.substring(startIndex, `i$iv`)
   return var10000
}

private fun durationOfMillisNormalized(millis: Long): Duration {
   return if (LongRange(-4611686018426L, 4611686018426L).contains(millis))
      durationOfNanos(millisToNanos(millis))
      else
      durationOfMillis(RangesKt.coerceIn(millis, -4611686018427387903L, 4611686018427387903L))
   }

private fun parseOverLongIsoComponent(value: String): Long {
   val length: Int = value.length()
   var startIndex: Int = 0
   if (length > 0 && StringsKt.contains$default("+-", value.charAt(0), false, 2, null)) {
      startIndex++
   }

   if (length - startIndex > 16) {
      val `$this$all$iv`: java.lang.Iterable = IntRange(startIndex, StringsKt.getLastIndex(value))
      var var10000: Boolean
      if (`$this$all$iv` is java.util.Collection && (`$this$all$iv` as java.util.Collection).isEmpty()) {
         var10000 = true
      } else {
         val var5: java.util.Iterator = `$this$all$iv`.iterator()

         while (true) {
            if (!var5.hasNext()) {
               var10000 = true
               break
            }

            if (!CharRange('0', '9').contains(value.charAt((var5 as IntIterator).nextInt()))) {
               var10000 = false
               break
            }
         }
      }

      if (var10000) {
         return if (value.charAt(0) == '-') java.lang.Long.MIN_VALUE else java.lang.Long.MAX_VALUE
      }
   }

   return if (StringsKt.startsWith$default(value, "+", false, 2, null)) java.lang.Long.parseLong(StringsKt.drop(value, 1)) else java.lang.Long.parseLong(value)
}

private fun durationOf(normalValue: Long, unitDiscriminator: Int): Duration {
   return Duration.constructor_impl/* $VF was: constructor-impl */((normalValue shl 1) + (long)unitDiscriminator)
}
