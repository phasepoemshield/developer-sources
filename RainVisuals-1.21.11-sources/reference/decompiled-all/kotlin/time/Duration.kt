package kotlin.time

import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly
import kotlin.jvm.internal.Intrinsics
import kotlin.math.MathKt

// $VF: Compiled from Duration.kt
@JvmInline
@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = [ExperimentalTime::class])
public value class Duration : java.lang.Comparable<Duration> {
   private final val rawValue: Long

   @JvmStatic
   public fun isPositive(): Boolean {
      return arg0 > 0L
   }

   public final val absoluteValue: Duration
      public final get() {
         return if (isNegative_impl/* $VF was: isNegative-impl */(arg0)) unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(arg0) else arg0
      }


   public final val inWholeMicroseconds: Long
      public final get() {
         return toLong_impl/* $VF was: toLong-impl */(arg0, DurationUnit.MICROSECONDS)
      }


   @JvmStatic
   private fun isInNanos(): Boolean {
      return ((int)arg0 and 1) == 0
   }

   @JvmStatic
   public fun toIsoString(): String {
      val var2: StringBuilder = StringBuilder()
      if (isNegative_impl/* $VF was: isNegative-impl */(arg0)) {
         var2.append('-')
      }

      var2.append("PT")
      val `arg0$iv`: Long = absoluteValue
      val var10000: Long = inWholeHours
      val var10001: Int = minutesComponent
      val nanoseconds: Int = nanosecondsComponent
      val seconds: Int = secondsComponent
      var hours: Long = var10000
      if (isInfinite_impl/* $VF was: isInfinite-impl */(arg0)) {
         hours = 9999999999999L
      }

      val hasHours: Boolean = hours != 0L
      val hasSeconds: Boolean = seconds != 0 || nanoseconds != 0
      val hasMinutes: Boolean = var10001 != 0 || (seconds != 0 || nanoseconds != 0) && hasHours
      if (hasHours) {
         var2.append(hours).append('H')
      }

      if (hasMinutes) {
         var2.append(var10001).append('M')
      }

      if (hasSeconds || !hasHours && !hasMinutes) {
         appendFractional_impl/* $VF was: appendFractional-impl */(arg0, var2, seconds, nanoseconds, 9, "S", true)
      }

      val var19: java.lang.String = var2.toString()
      return var19
   }

   @JvmStatic
   public fun isNegative(): Boolean {
      return arg0 < 0L
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      return other is Duration && arg0 == (other as Duration).unbox_impl/* $VF was: unbox-impl */()
   }

   @JvmStatic
   public inline fun <T> toComponents(action: (Long, Int) -> Any): Any {
      contract {
         callsInPlace(action, InvocationKind.EXACTLY_ONCE)
      }

      return (T)action(inWholeSeconds, nanosecondsComponent)
   }

   @JvmStatic
   public fun toString(unit: DurationUnit, decimals: Int = ...): String {
      if (decimals < 0) {
         throw IllegalArgumentException(("decimals must be not negative, but was $decimals").toString())
      } else {
         val var6: Double = toDouble_impl/* $VF was: toDouble-impl */(arg0, unit)
         return if (java.lang.Double.isInfinite(var6))
            java.lang.String.valueOf(var6)
            else
            "${DurationJvmKt.formatToExactDecimals(var6, RangesKt.coerceAtMost(decimals, 12))}${DurationUnitKt.shortName(unit)}"
         }
   }

   @JvmStatic
   public operator fun times(scale: Double): Duration {
      val intScale: Int = MathKt.roundToInt(scale)
      if (intScale == scale) {
         return times_UwyO8pc/* $VF was: times-UwyO8pc */(arg0, intScale)
      } else {
         val unit: DurationUnit = storageUnit
         return DurationKt.toDuration(toDouble_impl/* $VF was: toDouble-impl */(arg0, unit) * scale, unit)
      }
   }

   @JvmStatic
   fun `equals-impl0`(p2: Long, p1: Long): Boolean {
      p1 == p2
   }

   public final val inWholeSeconds: Long
      public final get() {
         return toLong_impl/* $VF was: toLong-impl */(arg0, DurationUnit.SECONDS)
      }


   override fun equals(other: Any): Boolean {
      equals_impl/* $VF was: equals-impl */(this.rawValue, other)
   }

   public final val inWholeDays: Long
      public final get() {
         return toLong_impl/* $VF was: toLong-impl */(arg0, DurationUnit.DAYS)
      }


   @JvmStatic
   public open fun toString(): String {
      val var10000: java.lang.String
      if (arg0 == 0L) {
         var10000 = "0s"
      } else if (arg0 == INFINITE) {
         var10000 = "Infinity"
      } else if (arg0 == NEG_INFINITE) {
         var10000 = "-Infinity"
      } else {
         val isNegative: Boolean = isNegative_impl/* $VF was: isNegative-impl */(arg0)
         val var5: StringBuilder = StringBuilder()
         if (isNegative) {
            var5.append('-')
         }

         val `arg0$iv`: Long = absoluteValue
         val var23: Long = inWholeDays
         val var10001: Int = hoursComponent
         val var10002: Int = minutesComponent
         val nanoseconds: Int = nanosecondsComponent
         val seconds: Int = secondsComponent
         val hasDays: Boolean = var23 != 0L
         val hasHours: Boolean = var10001 != 0
         val hasMinutes: Boolean = var10002 != 0
         val hasSeconds: Boolean = seconds != 0 || nanoseconds != 0
         var components: Int = 0
         if (hasDays) {
            var5.append(var23).append('d')
            components++
         }

         if (hasHours || hasDays && (hasMinutes || hasSeconds)) {
            if (components++ > 0) {
               var5.append(' ')
            }

            var5.append(var10001).append('h')
         }

         if (hasMinutes || hasSeconds && (hasHours || hasDays)) {
            if (components++ > 0) {
               var5.append(' ')
            }

            var5.append(var10002).append('m')
         }

         if (hasSeconds) {
            if (components++ > 0) {
               var5.append(' ')
            }

            if (seconds != 0 || hasDays || hasHours || hasMinutes) {
               appendFractional_impl/* $VF was: appendFractional-impl */(arg0, var5, seconds, nanoseconds, 9, "s", false)
            } else if (nanoseconds >= 1000000) {
               appendFractional_impl/* $VF was: appendFractional-impl */(arg0, var5, nanoseconds / 1000000, nanoseconds % 1000000, 6, "ms", false)
            } else if (nanoseconds >= 1000) {
               appendFractional_impl/* $VF was: appendFractional-impl */(arg0, var5, nanoseconds / 1000, nanoseconds % 1000, 3, "us", false)
            } else {
               var5.append(nanoseconds).append("ns")
            }
         }

         if (isNegative && components > 1) {
            var5.insert(1, '(').append(')')
         }

         var10000 = var5.toString()
      }

      return var10000
   }

   @PublishedApi
   internal final val hoursComponent: Int
      internal final get() {
         return if (isInfinite_impl/* $VF was: isInfinite-impl */(arg0)) 0 else (int)(inWholeHours % 24)
      }


   @JvmStatic
   public fun toDouble(unit: DurationUnit): Double {
      return if (arg0 == INFINITE)
         java.lang.Double.POSITIVE_INFINITY
         else
         (if (arg0 == NEG_INFINITE) java.lang.Double.NEGATIVE_INFINITY else DurationUnitKt.convertDurationUnit((double)((double)value), storageUnit, unit))
      }

   @JvmStatic
   public fun toInt(unit: DurationUnit): Int {
      return (int)RangesKt.coerceIn(toLong_impl/* $VF was: toLong-impl */(arg0, unit), -2147483648L, 2147483647L)
   }

   @JvmStatic
   public operator fun div(scale: Double): Duration {
      val intScale: Int = MathKt.roundToInt(scale)
      if (intScale == scale && intScale != 0) {
         return div_UwyO8pc/* $VF was: div-UwyO8pc */(arg0, intScale)
      } else {
         val unit: DurationUnit = storageUnit
         return DurationKt.toDuration(toDouble_impl/* $VF was: toDouble-impl */(arg0, unit) / scale, unit)
      }
   }

   fun `compareTo-LRDsOJo`(other: Long): Int {
      compareTo_LRDsOJo/* $VF was: compareTo-LRDsOJo */(this.rawValue, other)
   }

   public final val inWholeNanoseconds: Long
      public final get() {
         val value: Long = value
         return if (isInNanos_impl/* $VF was: isInNanos-impl */(arg0))
            value
            else
            (
               if (value > 9223372036854L)
                  java.lang.Long.MAX_VALUE
                  else
                  (if (value < -9223372036854L) java.lang.Long.MIN_VALUE else DurationKt.access$millisToNanos(value))
            )
         }


   @JvmStatic
   public fun isInfinite(): Boolean {
      return arg0 == INFINITE || arg0 == NEG_INFINITE
   }

   @JvmStatic
   public inline fun <T> toComponents(action: (Long, Int, Int, Int, Int) -> Any): Any {
      contract {
         callsInPlace(action, InvocationKind.EXACTLY_ONCE)
      }

      return (T)action(inWholeDays, hoursComponent, minutesComponent, secondsComponent, nanosecondsComponent)
   }

   public final val inWholeMilliseconds: Long
      public final get() {
         return if (isInMillis_impl/* $VF was: isInMillis-impl */(arg0) && isFinite_impl/* $VF was: isFinite-impl */(arg0))
            value
            else
            toLong_impl/* $VF was: toLong-impl */(arg0, DurationUnit.MILLISECONDS)
         }


   @JvmStatic
   private fun isInMillis(): Boolean {
      return ((int)arg0 and 1) == 1
   }

   @JvmStatic
   public fun isFinite(): Boolean {
      return !isInfinite_impl/* $VF was: isInfinite-impl */(arg0)
   }

   private final val storageUnit: DurationUnit
      private final get() {
         return if (isInNanos_impl/* $VF was: isInNanos-impl */(arg0)) DurationUnit.NANOSECONDS else DurationUnit.MILLISECONDS
      }


   @JvmStatic
   public operator fun unaryMinus(): Duration {
      return DurationKt.access$durationOf(-value, (int)arg0 and 1)
   }

   override fun hashCode(): Int {
      hashCode_impl/* $VF was: hashCode-impl */(this.rawValue)
   }

   private final val value: Long
      private final get() {
         return arg0 shr 1
      }


   public final val inWholeHours: Long
      public final get() {
         return toLong_impl/* $VF was: toLong-impl */(arg0, DurationUnit.HOURS)
      }


   @JvmStatic
   fun `constructor-impl`(rawValue: Long): Long {
      if (durationAssertionsEnabled) {
         if (isInNanos_impl/* $VF was: isInNanos-impl */(rawValue)) {
            if (!LongRange(-4611686018426999999L, 4611686018426999999L).contains(value)) {
               throw AssertionError("${value} ns is out of nanoseconds range")
            }
         } else {
            if (!LongRange(-4611686018427387903L, 4611686018427387903L).contains(value)) {
               throw AssertionError("${value} ms is out of milliseconds range")
            }

            if (LongRange(-4611686018426L, 4611686018426L).contains(value)) {
               throw AssertionError("${value} ms is denormalized")
            }
         }
      }

      rawValue
   }

   @JvmStatic
   public operator fun plus(other: Duration): Duration {
      if (isInfinite_impl/* $VF was: isInfinite-impl */(arg0)) {
         if (!isFinite_impl/* $VF was: isFinite-impl */(other) && (arg0 xor other) < 0L) {
            throw IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.")
         } else {
            return arg0
         }
      } else if (isInfinite_impl/* $VF was: isInfinite-impl */(other)) {
         return other
      } else {
         val var8: Long
         if (((int)arg0 and 1) == ((int)other and 1)) {
            val var7: Long = value + value
            var8 = if (isInNanos_impl/* $VF was: isInNanos-impl */(arg0))
               DurationKt.access$durationOfNanosNormalized(var7)
               else
               DurationKt.access$durationOfMillisNormalized(var7)
            } else {
            var8 = if (isInMillis_impl/* $VF was: isInMillis-impl */(arg0))
               addValuesMixedRanges_UwyO8pc/* $VF was: addValuesMixedRanges-UwyO8pc */(arg0, value, value)
               else
               addValuesMixedRanges_UwyO8pc/* $VF was: addValuesMixedRanges-UwyO8pc */(arg0, value, value)
            }

         return var8
      }
   }

   @JvmStatic
   public fun toLong(unit: DurationUnit): Long {
      return if (arg0 == INFINITE)
         java.lang.Long.MAX_VALUE
         else
         (if (arg0 == NEG_INFINITE) java.lang.Long.MIN_VALUE else DurationUnitKt.convertDurationUnit(value, storageUnit, unit))
      }

   private final val unitDiscriminator: Int
      private final inline get() {
         return (int)arg0 and 1
      }


   override fun toString(): java.lang.String {
      toString_impl/* $VF was: toString-impl */(this.rawValue)
   }

   @JvmStatic
   public inline fun <T> toComponents(action: (Long, Int, Int, Int) -> Any): Any {
      contract {
         callsInPlace(action, InvocationKind.EXACTLY_ONCE)
      }

      return (T)action(inWholeHours, minutesComponent, secondsComponent, nanosecondsComponent)
   }

   @JvmStatic
   private fun StringBuilder.appendFractional(whole: Int, fractional: Int, fractionalSize: Int, unit: String, isoZeroes: Boolean) {
      `$this$appendFractional`.append(whole)
      if (fractional != 0) {
         var fracString: java.lang.String
         var var10000: Int
         run label41@{
            `$this$appendFractional`.append('.')
            fracString = StringsKt.padStart(java.lang.String.valueOf(fractional), fractionalSize, '0')
            val `$this$indexOfLast$iv`: java.lang.CharSequence = fracString
            var var12: Int = fracString.length() + -1
            if (0 <= var12) {
               do {
                  val `index$iv`: Int = var12--
                  if (`$this$indexOfLast$iv`.charAt(`index$iv`) != '0') {
                     var10000 = `index$iv`
                     return@label41
                  }
               } while (0 <= var12)
            }

            var10000 = -1
         }

         val nonZeroDigits: Int = var10000 + 1
         if (!isoZeroes && var10000 + 1 < 3) {
         }
      }

      `$this$appendFractional`.append(unit)
   }

   @JvmStatic
   public operator fun div(other: Duration): Double {
      val coarserUnit: DurationUnit = ComparisonsKt.maxOf(storageUnit, storageUnit)
      return toDouble_impl/* $VF was: toDouble-impl */(arg0, coarserUnit) / toDouble_impl/* $VF was: toDouble-impl */(other, coarserUnit)
   }

   @JvmStatic
   public inline fun <T> toComponents(action: (Long, Int, Int) -> Any): Any {
      contract {
         callsInPlace(action, InvocationKind.EXACTLY_ONCE)
      }

      return (T)action(inWholeMinutes, secondsComponent, nanosecondsComponent)
   }

   @PublishedApi
   internal final val secondsComponent: Int
      internal final get() {
         return if (isInfinite_impl/* $VF was: isInfinite-impl */(arg0)) 0 else (int)(inWholeSeconds % 60)
      }


   @JvmStatic
   internal fun truncateTo(unit: DurationUnit): Duration {
      val storageUnit: DurationUnit = storageUnit
      return if (unit.compareTo(storageUnit) > 0 && !isInfinite_impl/* $VF was: isInfinite-impl */(arg0))
         DurationKt.toDuration(value - value % DurationUnitKt.convertDurationUnit(1L, unit, storageUnit), storageUnit)
         else
         arg0
      }

   @JvmStatic
   public operator fun times(scale: Int): Duration {
      if (isInfinite_impl/* $VF was: isInfinite-impl */(arg0)) {
         if (scale == 0) {
            throw IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.")
         } else {
            return if (scale > 0) arg0 else unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(arg0)
         }
      } else if (scale == 0) {
         return ZERO
      } else {
         val value: Long = value
         val result: Long = value * scale
         val var10000: Long
         if (isInNanos_impl/* $VF was: isInNanos-impl */(arg0)) {
            if (LongRange(-2147483647L, 2147483647L).contains(value)) {
               var10000 = DurationKt.access$durationOfNanos(result)
            } else if (result / scale == value) {
               var10000 = DurationKt.access$durationOfNanosNormalized(result)
            } else {
               val millis: Long = DurationKt.access$nanosToMillis(value)
               val totalMillis: Long = millis * scale + DurationKt.access$nanosToMillis((value - DurationKt.access$millisToNanos(millis)) * (long)scale)
               var10000 = if (millis * scale / scale == millis && (totalMillis xor millis * scale) >= 0L)
                  DurationKt.access$durationOfMillis(RangesKt.coerceIn((long)totalMillis, LongRange(-4611686018427387903L, 4611686018427387903L)))
                  else
                  (if (MathKt.getSign(value) * MathKt.getSign(scale) > 0) INFINITE else NEG_INFINITE)
               }
         } else {
            var10000 = if (result / scale == value)
               DurationKt.access$durationOfMillis(RangesKt.coerceIn((long)result, LongRange(-4611686018427387903L, 4611686018427387903L)))
               else
               (if (MathKt.getSign(value) * MathKt.getSign(scale) > 0) INFINITE else NEG_INFINITE)
            }

         return var10000
      }
   }

   public final val inWholeMinutes: Long
      public final get() {
         return toLong_impl/* $VF was: toLong-impl */(arg0, DurationUnit.MINUTES)
      }


   @JvmStatic
   public open fun hashCode(): Int {
      return java.lang.Long.hashCode(arg0)
   }

   @PublishedApi
   internal final val nanosecondsComponent: Int
      internal final get() {
         return if (isInfinite_impl/* $VF was: isInfinite-impl */(arg0))
            0
            else
            (if (isInMillis_impl/* $VF was: isInMillis-impl */(arg0)) (int)DurationKt.access$millisToNanos(value % (long)1000) else (int)(value % 1000000000))
         }


   @JvmStatic
   public operator fun minus(other: Duration): Duration {
      return plus_LRDsOJo/* $VF was: plus-LRDsOJo */(arg0, unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(other))
   }

   @JvmStatic
   private fun addValuesMixedRanges(thisMillis: Long, otherNanos: Long): Duration {
      val otherMillis: Long = DurationKt.access$nanosToMillis(otherNanos)
      return if (LongRange(-4611686018426L, 4611686018426L).contains(thisMillis + otherMillis))
         DurationKt.access$durationOfNanos(
            DurationKt.access$millisToNanos(thisMillis + otherMillis) + (otherNanos - DurationKt.access$millisToNanos(otherMillis))
         )
         else
         DurationKt.access$durationOfMillis(RangesKt.coerceIn(thisMillis + otherMillis, -4611686018427387903L, 4611686018427387903L))
      }

   @JvmStatic
   public open operator fun compareTo(other: Duration): Int {
      if ((arg0 xor other) >= 0L && ((int)(arg0 xor other) and 1) != 0) {
         return if (isNegative_impl/* $VF was: isNegative-impl */(arg0)) -(((int)arg0 and 1) - ((int)other and 1)) else ((int)arg0 and 1) - ((int)other and 1)
      } else {
         return Intrinsics.compare(arg0, other)
      }
   }

   @JvmStatic
   public operator fun div(scale: Int): Duration {
      if (scale == 0) {
         val var10000: Long
         if (isPositive_impl/* $VF was: isPositive-impl */(arg0)) {
            var10000 = INFINITE
         } else {
            if (!isNegative_impl/* $VF was: isNegative-impl */(arg0)) {
               throw IllegalArgumentException("Dividing zero duration by zero yields an undefined result.")
            }

            var10000 = NEG_INFINITE
         }

         return var10000
      } else if (isInNanos_impl/* $VF was: isInNanos-impl */(arg0)) {
         return DurationKt.access$durationOfNanos(value / (long)scale)
      } else {
         label39@
         if (isInfinite_impl/* $VF was: isInfinite-impl */(arg0)) {
            return times_UwyO8pc/* $VF was: times-UwyO8pc */(arg0, MathKt.getSign(scale))
         } else {
            val result: Long = value / scale
            return if (LongRange(-4611686018426L, 4611686018426L).contains(result))
               DurationKt.access$durationOfNanos(
                  DurationKt.access$millisToNanos(result) + DurationKt.access$millisToNanos(value - result * (long)scale) / (long)scale
               )
               else
               DurationKt.access$durationOfMillis(result)
            }
      }
   }

   @PublishedApi
   internal final val minutesComponent: Int
      internal final get() {
         return if (isInfinite_impl/* $VF was: isInfinite-impl */(arg0)) 0 else (int)(inWholeMinutes % 60)
      }


   // $VF: Compiled from Duration.kt
   public companion object {
      public final val INFINITE: Duration
      internal final val NEG_INFINITE: Duration
      public final val ZERO: Duration

      @InlineOnly
      public final val seconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$seconds`, DurationUnit.SECONDS)
         }


      @InlineOnly
      public final val minutes: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$minutes`, DurationUnit.MINUTES)
         }


      @InlineOnly
      public final val nanoseconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$nanoseconds`, DurationUnit.NANOSECONDS)
         }


      @InlineOnly
      public final val milliseconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$milliseconds`, DurationUnit.MILLISECONDS)
         }


      @InlineOnly
      public final val milliseconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$milliseconds`, DurationUnit.MILLISECONDS)
         }


      @InlineOnly
      public final val minutes: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$minutes`, DurationUnit.MINUTES)
         }


      @InlineOnly
      public final val days: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$days`, DurationUnit.DAYS)
         }


      public fun parseIsoString(value: String): Duration {
         try {
            return DurationKt.access$parseDuration(value, true)
         } catch (var5: IllegalArgumentException) {
            throw IllegalArgumentException("Invalid ISO duration string format: '$value'.", var5)
         }
      }

      @InlineOnly
      public final val nanoseconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$nanoseconds`, DurationUnit.NANOSECONDS)
         }


      @InlineOnly
      public final val seconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$seconds`, DurationUnit.SECONDS)
         }


      @InlineOnly
      public final val milliseconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$milliseconds`, DurationUnit.MILLISECONDS)
         }


      @InlineOnly
      public final val hours: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$hours`, DurationUnit.HOURS)
         }


      public fun parseOrNull(value: String): Duration? {
         var var2: Duration
         try {
            var2 = Duration.box_impl/* $VF was: box-impl */(DurationKt.access$parseDuration(value, false))
         } catch (var4: IllegalArgumentException) {
            var2 = null
         }

         return var2
      }

      @InlineOnly
      public final val nanoseconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$nanoseconds`, DurationUnit.NANOSECONDS)
         }


      @InlineOnly
      public final val seconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$seconds`, DurationUnit.SECONDS)
         }


      @ExperimentalTime
      public fun convert(value: Double, sourceUnit: DurationUnit, targetUnit: DurationUnit): Double {
         return DurationUnitKt.convertDurationUnit((double)value, sourceUnit, targetUnit)
      }

      @InlineOnly
      public final val microseconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$microseconds`, DurationUnit.MICROSECONDS)
         }


      @InlineOnly
      public final val days: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$days`, DurationUnit.DAYS)
         }


      @InlineOnly
      public final val hours: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$hours`, DurationUnit.HOURS)
         }


      @InlineOnly
      public final val minutes: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$minutes`, DurationUnit.MINUTES)
         }


      @InlineOnly
      public final val hours: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$hours`, DurationUnit.HOURS)
         }


      @InlineOnly
      public final val microseconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$microseconds`, DurationUnit.MICROSECONDS)
         }


      public fun parse(value: String): Duration {
         try {
            return DurationKt.access$parseDuration(value, false)
         } catch (var5: IllegalArgumentException) {
            throw IllegalArgumentException("Invalid duration string format: '$value'.", var5)
         }
      }

      public fun parseIsoStringOrNull(value: String): Duration? {
         var var2: Duration
         try {
            var2 = Duration.box_impl/* $VF was: box-impl */(DurationKt.access$parseDuration(value, true))
         } catch (var4: IllegalArgumentException) {
            var2 = null
         }

         return var2
      }

      @InlineOnly
      public final val days: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$days`, DurationUnit.DAYS)
         }


      @InlineOnly
      public final val microseconds: Duration
         public final inline get() {
            return DurationKt.toDuration(`$this$microseconds`, DurationUnit.MICROSECONDS)
         }

   }
}
