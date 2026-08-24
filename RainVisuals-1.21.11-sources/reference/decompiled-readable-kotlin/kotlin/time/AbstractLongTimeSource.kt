package kotlin.time

import kotlin.jvm.functions.Function0
import kotlin.math.MathKt

// $VF: Compiled from TimeSources.kt
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalTime::class])
public abstract class AbstractLongTimeSource : TimeSource.WithComparableMarks {
   protected final val unit: DurationUnit

   private final val zero: Long
      private final get() {
         return (this.zero$delegate.value as java.lang.Number).longValue()
      }


   private fun adjustedRead(): Long {
      return this.read() - this.zero
   }

   public override fun markNow(): ComparableTimeMark {
      return AbstractLongTimeSource.LongTimeMark(this.adjustedRead(), this, Duration.Companion.ZERO, null)
   }

   protected abstract fun read(): Long {
   }

   open fun AbstractLongTimeSource(unit: DurationUnit) {
      this.unit = unit
      this.zero$delegate = LazyKt.lazy(      // $VF: Compiled from TimeSources.kt
{
         AbstractLongTimeSource.this.read()
      } as Function0)
   }

   // $VF: Compiled from TimeSources.kt
   private class LongTimeMark(startedAt: Long, timeSource: AbstractLongTimeSource, offset: Duration) : AbstractLongTimeSource.LongTimeMark(
            startedAt, timeSource, offset
         ),
      ComparableTimeMark {
      private final val timeSource: AbstractLongTimeSource
      private final val offset: Duration
      private final val startedAt: Long

      public override operator fun equals(other: Any?): Boolean {
         return other is AbstractLongTimeSource.LongTimeMark
            && this.timeSource == (other as AbstractLongTimeSource.LongTimeMark).timeSource
            && Duration.equals_impl0/* $VF was: equals-impl0 */(
               this.minus_UwyO8pc/* $VF was: minus-UwyO8pc */(other as ComparableTimeMark), Duration.Companion.ZERO
            )
         }

      override fun `minus-LRDsOJo`(duration: Long): ComparableTimeMark {
         ComparableTimeMark.DefaultImpls.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(this, duration)
      }

      override fun hasNotPassedNow(): Boolean {
         ComparableTimeMark.DefaultImpls.hasNotPassedNow(this)
      }

      override fun compareTo(other: ComparableTimeMark): Int {
         ComparableTimeMark.DefaultImpls.compareTo(this, other)
      }

      public override fun toString(): String {
         return "LongTimeMark(${this.startedAt}${DurationUnitKt.shortName(this.timeSource.unit)} + ${Duration.toString_impl/* $VF was: toString-impl */(
            this.offset
         )}, ${this.timeSource})"
      }

      public override fun hashCode(): Int {
         return Duration.hashCode_impl/* $VF was: hashCode-impl */(this.offset) * 37 + java.lang.Long.hashCode(this.startedAt)
      }

      fun LongTimeMark(startedAt: Long, offset: AbstractLongTimeSource, timeSource: Long) {
         this.startedAt = startedAt
         this.timeSource = timeSource
         this.offset = offset
      }

      public override operator fun minus(other: ComparableTimeMark): Duration {
         if (other is AbstractLongTimeSource.LongTimeMark && this.timeSource == (other as AbstractLongTimeSource.LongTimeMark).timeSource) {
            return Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(
               LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, (other as AbstractLongTimeSource.LongTimeMark).startedAt, this.timeSource.unit),
               Duration.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(this.offset, (other as AbstractLongTimeSource.LongTimeMark).offset)
            )
         } else {
            throw IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: $this and $other")
         }
      }

      public override fun elapsedNow(): Duration {
         return Duration.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(
            LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.unit), this.offset
         )
      }

      public override operator fun plus(duration: Duration): ComparableTimeMark {
         val unit: DurationUnit = this.timeSource.unit
         if (Duration.isInfinite_impl/* $VF was: isInfinite-impl */(duration)) {
            return AbstractLongTimeSource.LongTimeMark(
               LongSaturatedMathKt.saturatingAdd_NuflL3o/* $VF was: saturatingAdd-NuflL3o */(this.startedAt, unit, duration),
               this.timeSource,
               Duration.Companion.ZERO,
               null
            )
         } else {
            val durationInUnit: Long = Duration.truncateTo_UwyO8pc$kotlin_stdlib/* $VF was: truncateTo-UwyO8pc$kotlin_stdlib */(duration, unit)
            val rest: Long = Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(
               Duration.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(duration, durationInUnit), this.offset
            )
            var sum: Long = LongSaturatedMathKt.saturatingAdd_NuflL3o/* $VF was: saturatingAdd-NuflL3o */(this.startedAt, unit, durationInUnit)
            val restInUnit: Long = Duration.truncateTo_UwyO8pc$kotlin_stdlib/* $VF was: truncateTo-UwyO8pc$kotlin_stdlib */(rest, unit)
            sum = LongSaturatedMathKt.saturatingAdd_NuflL3o/* $VF was: saturatingAdd-NuflL3o */(sum, unit, restInUnit)
            var restUnderUnit: Long = Duration.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(rest, restInUnit)
            val restUnderUnitNs: Long = inWholeNanoseconds
            if (sum != 0L && restUnderUnitNs != 0L && (sum xor restUnderUnitNs) < 0L) {
               val newValue: Long = DurationKt.toDuration(MathKt.getSign(restUnderUnitNs), unit)
               sum = LongSaturatedMathKt.saturatingAdd_NuflL3o/* $VF was: saturatingAdd-NuflL3o */(sum, unit, newValue)
               restUnderUnit = Duration.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(restUnderUnit, newValue)
            }

            return AbstractLongTimeSource.LongTimeMark(
               sum, this.timeSource, if ((sum - 1L or 1L) == java.lang.Long.MAX_VALUE) Duration.Companion.ZERO else restUnderUnit, null
            )
         }
      }

      override fun hasPassedNow(): Boolean {
         ComparableTimeMark.DefaultImpls.hasPassedNow(this)
      }
   }
}
