package kotlin.time

// $VF: Compiled from TimeSource.kt
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = [ExperimentalTime::class])
public interface TimeMark {
   public open operator fun plus(duration: Duration): TimeMark {
   }

   public open operator fun minus(duration: Duration): TimeMark {
   }

   public open fun hasNotPassedNow(): Boolean {
   }

   public open fun hasPassedNow(): Boolean {
   }

   public abstract fun elapsedNow(): Duration {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from TimeSource.kt
   internal class DefaultImpls {
      @JvmStatic
      fun hasNotPassedNow(`$this`: TimeMark): Boolean {
         Duration.isNegative_impl/* $VF was: isNegative-impl */(`$this`.elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */())
      }

      @JvmStatic
      fun `plus-LRDsOJo`(duration: TimeMark, `$this`: Long): TimeMark {
         AdjustedTimeMark(`$this`, duration, null) as TimeMark
      }

      @JvmStatic
      fun `minus-LRDsOJo`(duration: TimeMark, `$this`: Long): TimeMark {
         `$this`.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(Duration.unaryMinus_UwyO8pc/* $VF was: unaryMinus-UwyO8pc */(duration))
      }

      @JvmStatic
      fun hasPassedNow(`$this`: TimeMark): Boolean {
         !Duration.isNegative_impl/* $VF was: isNegative-impl */(`$this`.elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */())
      }
   }
}
