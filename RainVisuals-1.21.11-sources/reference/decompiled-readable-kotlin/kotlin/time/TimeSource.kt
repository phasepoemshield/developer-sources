package kotlin.time

// $VF: Compiled from TimeSource.kt
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalTime::class])
public interface TimeSource {
   @JvmStatic
   TimeSource.Companion Companion = TimeSource.Companion.$$INSTANCE;

   public abstract fun markNow(): TimeMark {
   }

   // $VF: Compiled from TimeSource.kt
   public companion object

   // $VF: Compiled from TimeSource.kt
   public object Monotonic : TimeSource.WithComparableMarks {
      public override fun toString(): String {
         return MonotonicTimeSource.INSTANCE.toString()
      }

      public open fun markNow(): kotlin.time.TimeSource.Monotonic.ValueTimeMark {
         return MonotonicTimeSource.INSTANCE.markNow_z9LOYto/* $VF was: markNow-z9LOYto */()
      }

      // $VF: Compiled from TimeSource.kt
      @JvmInline
      @WasExperimental(markerClass = [ExperimentalTime::class])
      @SinceKotlin(version = "1.9")
      public value class ValueTimeMark : ComparableTimeMark {
         internal final val reading: Long

         @JvmStatic
         public open operator fun plus(duration: Duration): kotlin.time.TimeSource.Monotonic.ValueTimeMark {
            return MonotonicTimeSource.INSTANCE.adjustReading_6QKq23U/* $VF was: adjustReading-6QKq23U */(arg0, duration)
         }

         @JvmStatic
         public open operator fun equals(other: Any?): Boolean {
            return other is TimeSource.Monotonic.ValueTimeMark && arg0 == (other as TimeSource.Monotonic.ValueTimeMark).unbox_impl/* $VF was: unbox-impl */()
         }

         @JvmStatic
         public open fun hasPassedNow(): Boolean {
            return !Duration.isNegative_impl/* $VF was: isNegative-impl */(elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */(arg0))
         }

         override fun hashCode(): Int {
            hashCode_impl/* $VF was: hashCode-impl */(this.reading)
         }

         override fun toString(): java.lang.String {
            toString_impl/* $VF was: toString-impl */(this.reading)
         }

         @JvmStatic
         public open fun elapsedNow(): Duration {
            return MonotonicTimeSource.INSTANCE.elapsedFrom_6eNON_k/* $VF was: elapsedFrom-6eNON_k */(arg0)
         }

         @JvmStatic
         public open operator fun minus(other: ComparableTimeMark): Duration {
            if (other !is TimeSource.Monotonic.ValueTimeMark) {
               throw IllegalArgumentException(
                  "Subtracting or comparing time marks from different time sources is not possible: ${toString_impl/* $VF was: toString-impl */(arg0)} and $other"
               )
            } else {
               return minus_6eNON_k/* $VF was: minus-6eNON_k */(arg0, (other as TimeSource.Monotonic.ValueTimeMark).unbox_impl/* $VF was: unbox-impl */())
            }
         }

         override fun `elapsedNow-UwyO8pc`(): Long {
            elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */(this.reading)
         }

         fun `plus-LRDsOJo`(duration: Long): Long {
            plus_LRDsOJo/* $VF was: plus-LRDsOJo */(this.reading, duration)
         }

         override fun hasNotPassedNow(): Boolean {
            hasNotPassedNow_impl/* $VF was: hasNotPassedNow-impl */(this.reading)
         }

         override fun compareTo(other: ComparableTimeMark): Int {
            ComparableTimeMark.DefaultImpls.compareTo(this, other)
         }

         override fun `minus-UwyO8pc`(other: ComparableTimeMark): Long {
            minus_UwyO8pc/* $VF was: minus-UwyO8pc */(this.reading, other)
         }

         @JvmStatic
         fun `compareTo-impl`(arg0: Long, other: ComparableTimeMark): Int {
            box_impl/* $VF was: box-impl */(arg0).compareTo(other)
         }

         @JvmStatic
         fun `equals-impl0`(p2: Long, p1: Long): Boolean {
            p1 == p2
         }

         @JvmStatic
         fun `constructor-impl`(reading: Long): Long {
            reading
         }

         @JvmStatic
         public open fun hashCode(): Int {
            return java.lang.Long.hashCode(arg0)
         }

         @JvmStatic
         public open fun hasNotPassedNow(): Boolean {
            return Duration.isNegative_impl/* $VF was: isNegative-impl */(elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */(arg0))
         }

         override fun hasPassedNow(): Boolean {
            hasPassedNow_impl/* $VF was: hasPassedNow-impl */(this.reading)
         }

         @JvmStatic
         public open fun toString(): String {
            return "ValueTimeMark(reading=$arg0)"
         }

         @JvmStatic
         public operator fun minus(other: kotlin.time.TimeSource.Monotonic.ValueTimeMark): Duration {
            return MonotonicTimeSource.INSTANCE.differenceBetween_fRLX17w/* $VF was: differenceBetween-fRLX17w */(arg0, other)
         }

         @JvmStatic
         public operator fun compareTo(other: kotlin.time.TimeSource.Monotonic.ValueTimeMark): Int {
            return Duration.compareTo_LRDsOJo/* $VF was: compareTo-LRDsOJo */(minus_6eNON_k/* $VF was: minus-6eNON_k */(arg0, other), Duration.Companion.ZERO)
         }

         @JvmStatic
         public open operator fun minus(duration: Duration): kotlin.time.TimeSource.Monotonic.ValueTimeMark {
            return MonotonicTimeSource.INSTANCE
               .adjustReading_6QKq23U/* $VF was: adjustReading-6QKq23U */(arg0, Duration.unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(duration))
            }

         override fun equals(other: Any): Boolean {
            equals_impl/* $VF was: equals-impl */(this.reading, other)
         }

         fun `minus-LRDsOJo`(duration: Long): Long {
            minus_LRDsOJo/* $VF was: minus-LRDsOJo */(this.reading, duration)
         }
      }
   }

   // $VF: Compiled from TimeSource.kt
   @SinceKotlin(version = "1.9")
   @WasExperimental(markerClass = [ExperimentalTime::class])
   public interface WithComparableMarks : TimeSource {
      public abstract fun markNow(): ComparableTimeMark {
      }
   }
}
