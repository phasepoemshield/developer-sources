package kotlin.time

// $VF: Compiled from TimeSource.kt
private class AdjustedTimeMark(mark: TimeMark, adjustment: Duration) : AdjustedTimeMark(mark, adjustment), TimeMark {
   public final val adjustment: Duration
   public final val mark: TimeMark

   fun AdjustedTimeMark(mark: TimeMark, adjustment: Long) {
      this.mark = mark
      this.adjustment = adjustment
   }

   public override fun elapsedNow(): Duration {
      return Duration.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(this.mark.elapsedNow_UwyO8pc/* $VF was: elapsedNow-UwyO8pc */(), this.adjustment)
   }

   override fun hasPassedNow(): Boolean {
      TimeMark.DefaultImpls.hasPassedNow(this)
   }

   override fun hasNotPassedNow(): Boolean {
      TimeMark.DefaultImpls.hasNotPassedNow(this)
   }

   public override operator fun plus(duration: Duration): TimeMark {
      return AdjustedTimeMark(this.mark, Duration.plus_LRDsOJo/* $VF was: plus-LRDsOJo */(this.adjustment, duration), null)
   }

   override fun `minus-LRDsOJo`(duration: Long): TimeMark {
      TimeMark.DefaultImpls.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(this, duration)
   }
}
