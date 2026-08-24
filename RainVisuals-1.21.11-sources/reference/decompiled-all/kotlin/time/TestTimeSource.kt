package kotlin.time

// $VF: Compiled from TimeSources.kt
@WasExperimental(markerClass = [ExperimentalTime::class])
@SinceKotlin(version = "1.9")
public class TestTimeSource : AbstractLongTimeSource(DurationUnit.NANOSECONDS) {
   private final var reading: Long

   protected override fun read(): Long {
      return this.reading
   }

   public operator fun plusAssign(duration: Duration) {
      val longDelta: Long = Duration.toLong_impl/* $VF was: toLong-impl */(duration, this.getUnit())
      if ((longDelta - 1L or 1L) != java.lang.Long.MAX_VALUE) {
         val var11: Long = this.reading + longDelta
         if ((this.reading xor longDelta) >= 0L && (this.reading xor this.reading + longDelta) < 0L) {
            this.overflow_LRDsOJo/* $VF was: overflow-LRDsOJo */(duration)
         }

         this.reading = var11
      } else {
         val var12: Long = Duration.div_UwyO8pc/* $VF was: div-UwyO8pc */(duration, 2)
         if ((Duration.toLong_impl/* $VF was: toLong-impl */(var12, this.getUnit()) - 1L or 1L) != java.lang.Long.MAX_VALUE) {
            try {
               this.plusAssign_LRDsOJo/* $VF was: plusAssign-LRDsOJo */(var12)
               this.plusAssign_LRDsOJo/* $VF was: plusAssign-LRDsOJo */(Duration.minus_LRDsOJo/* $VF was: minus-LRDsOJo */(duration, var12))
            } catch (var10: IllegalStateException) {
               this.reading = this.reading
               throw var10
            }
         } else {
            this.overflow_LRDsOJo/* $VF was: overflow-LRDsOJo */(duration)
         }
      }
   }

   private fun overflow(duration: Duration) {
      throw IllegalStateException(
         "TestTimeSource will overflow if its reading ${this.reading}${DurationUnitKt.shortName(this.getUnit())} is advanced by ${Duration.toString_impl/* $VF was: toString-impl */(
            duration
         )}."
      )
   }
}
