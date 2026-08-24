package oxxxde

import java.util.function.LongSupplier

// $VF: Compiled from heavy
public class دد(timeSource: LongSupplier = oxxxde/دد##Lambda_0_74()) {
   private final val timeSource: LongSupplier
   private final var lastRunNanos: Long

   public fun shouldExecute(fps: Int): Boolean {
      if (fps <= 0) {
         return true
      } else {
         val intervalNanos: Long = 1000000000L / fps
         val now: Long = this.timeSource.getAsLong()
         if (now - this.lastRunNanos >= intervalNanos) {
            this.lastRunNanos = now
            return true
         } else {
            return false
         }
      }
   }

   init {
      this.timeSource = timeSource
   }

   fun دد() {
      this(null, 1, null)
   }

   public fun reset() {
      this.lastRunNanos = 0L
   }
}
