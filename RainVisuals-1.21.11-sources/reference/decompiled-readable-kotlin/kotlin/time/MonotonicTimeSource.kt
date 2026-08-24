package kotlin.time

import kotlin.time.TimeSource.Monotonic.ValueTimeMark

// $VF: Compiled from MonoTimeSource.kt
@SinceKotlin(version = "1.3")
internal object MonotonicTimeSource : TimeSource.WithComparableMarks {
   private final val zero: Long = System.nanoTime()

   public open fun markNow(): ValueTimeMark {
      return TimeSource.Monotonic.ValueTimeMark.constructor_impl/* $VF was: constructor-impl */(this.read())
   }

   public fun adjustReading(timeMark: ValueTimeMark, duration: Duration): ValueTimeMark {
      return TimeSource.Monotonic.ValueTimeMark.constructor_impl/* $VF was: constructor-impl */(
         LongSaturatedMathKt.saturatingAdd_NuflL3o/* $VF was: saturatingAdd-NuflL3o */(timeMark, DurationUnit.NANOSECONDS, duration)
      )
   }

   public override fun toString(): String {
      return "TimeSource(System.nanoTime())"
   }

   private fun read(): Long {
      return System.nanoTime() - zero
   }

   public fun elapsedFrom(timeMark: ValueTimeMark): Duration {
      return LongSaturatedMathKt.saturatingDiff(this.read(), timeMark, DurationUnit.NANOSECONDS)
   }

   public fun differenceBetween(one: ValueTimeMark, another: ValueTimeMark): Duration {
      return LongSaturatedMathKt.saturatingOriginsDiff(one, another, DurationUnit.NANOSECONDS)
   }
}
