package kotlin.time

// $VF: Compiled from TimeSources.kt
/** @deprecated */
@Deprecated(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@SinceKotlin(version = "1.3")
@ExperimentalTime
public abstract class AbstractDoubleTimeSource : TimeSource.WithComparableMarks {
   protected final val unit: DurationUnit

   open fun AbstractDoubleTimeSource(unit: DurationUnit) {
      this.unit = unit
   }

   protected abstract fun read(): Double {
   }

   public override fun markNow(): ComparableTimeMark {
      return AbstractDoubleTimeSource.DoubleTimeMark(this.read(), this, Duration.Companion.ZERO, null)
   }

   // $VF: Compiled from TimeSources.kt
   private class DoubleTimeMark(startedAt: Double, timeSource: AbstractDoubleTimeSource, offset: Duration) : AbstractDoubleTimeSource.DoubleTimeMark(
            startedAt, timeSource, offset
         ),
      ComparableTimeMark {
      private final val offset: Duration
      private final val startedAt: Double
      private final val timeSource: AbstractDoubleTimeSource

      fun DoubleTimeMark(timeSource: Double, offset: AbstractDoubleTimeSource, startedAt: Long) {
         this.startedAt = startedAt
         this.timeSource = timeSource
         this.offset = offset
      }

      override fun compareTo(other: ComparableTimeMark): Int {
         ComparableTimeMark.DefaultImpls.compareTo(this, other)
      }

      public override operator fun minus(other: ComparableTimeMark): Duration {
         if (other !is AbstractDoubleTimeSource.DoubleTimeMark || !(this.timeSource == (other as AbstractDoubleTimeSource.DoubleTimeMark).timeSource)) {
            throw IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: $this and $other")
         } else if (Duration.equals_impl0/* $VF was: equals-impl0 */(this.offset, (other as AbstractDoubleTimeSource.DoubleTimeMark).offset)
            && Duration.isInfinite_impl/* $VF was: isInfinite-impl */(this.offset)) {
            return Duration.Companion.ZERO
         } else {
            val offsetDiff: Long = Duration.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(this.offset, (other as AbstractDoubleTimeSource.DoubleTimeMark).offset)
            val startedAtDiff: Long = DurationKt.toDuration(this.startedAt - (other as AbstractDoubleTimeSource.DoubleTimeMark).startedAt, this.timeSource.unit)
            return if (Duration.equals_impl0/* $VF was: equals-impl0 */(startedAtDiff, Duration.unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(offsetDiff)))
               Duration.Companion.ZERO
               else
               Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(startedAtDiff, offsetDiff)
            }
      }

      override fun `minus-LRDsOJo`(duration: Long): ComparableTimeMark {
         ComparableTimeMark.DefaultImpls.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(this, duration)
      }

      public override fun hashCode(): Int {
         return Duration.hashCode_impl/* $VF was: hashCode-impl */(
            Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(DurationKt.toDuration(this.startedAt, this.timeSource.unit), this.offset)
         )
      }

      public override operator fun equals(other: Any?): Boolean {
         return other is AbstractDoubleTimeSource.DoubleTimeMark
            && this.timeSource == (other as AbstractDoubleTimeSource.DoubleTimeMark).timeSource
            && Duration.equals_impl0/* $VF was: equals-impl0 */(
               this.minus_UwyO8pc/* $VF was: minus-UwyO8pc */(other as ComparableTimeMark), Duration.Companion.ZERO
            )
         }

      override fun hasPassedNow(): Boolean {
         ComparableTimeMark.DefaultImpls.hasPassedNow(this)
      }

      public override fun elapsedNow(): Duration {
         return Duration.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(
            DurationKt.toDuration(this.timeSource.read() - this.startedAt, this.timeSource.unit), this.offset
         )
      }

      override fun hasNotPassedNow(): Boolean {
         ComparableTimeMark.DefaultImpls.hasNotPassedNow(this)
      }

      public override fun toString(): String {
         return "DoubleTimeMark(${this.startedAt}${DurationUnitKt.shortName(this.timeSource.unit)} + ${Duration.toString_impl/* $VF was: toString-impl */(
            this.offset
         )}, ${this.timeSource})"
      }

      public override operator fun plus(duration: Duration): ComparableTimeMark {
         return AbstractDoubleTimeSource.DoubleTimeMark(
            this.startedAt, this.timeSource, Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(this.offset, duration), null
         )
      }
   }
}
