package kotlin.time

// $VF: Compiled from TimeSource.kt
@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.9")
public interface ComparableTimeMark : TimeMark, java.lang.Comparable<ComparableTimeMark> {
   public abstract operator fun minus(other: ComparableTimeMark): Duration {
   }

   public abstract override fun hashCode(): Int {
   }

   public open operator fun compareTo(other: ComparableTimeMark): Int {
   }

   public abstract override operator fun equals(other: Any?): Boolean {
   }

   public open operator fun minus(duration: Duration): ComparableTimeMark {
   }

   public abstract operator fun plus(duration: Duration): ComparableTimeMark {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from TimeSource.kt
   internal class DefaultImpls {
      @JvmStatic
      fun compareTo(`$this`: ComparableTimeMark, other: ComparableTimeMark): Int {
         Duration.compareTo_LRDsOJo/* $VF was: compareTo-LRDsOJo */(`$this`.minus_UwyO8pc/* $VF was: minus-UwyO8pc */(other), Duration.Companion.ZERO)
      }

      @JvmStatic
      fun hasNotPassedNow(`$this`: ComparableTimeMark): Boolean {
         TimeMark.DefaultImpls.hasNotPassedNow(`$this`)
      }

      @JvmStatic
      fun hasPassedNow(`$this`: ComparableTimeMark): Boolean {
         TimeMark.DefaultImpls.hasPassedNow(`$this`)
      }

      @JvmStatic
      fun `minus-LRDsOJo`(`$this`: ComparableTimeMark, duration: Long): ComparableTimeMark {
         `$this`.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(Duration.unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(duration))
      }
   }
}
