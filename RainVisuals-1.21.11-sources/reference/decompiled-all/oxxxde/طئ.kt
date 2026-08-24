package oxxxde

import java.awt.Color
import java.util.concurrent.ConcurrentLinkedQueue

// $VF: Compiled from heavy
public object طئ {
   private final val pending: ConcurrentLinkedQueue<حع> = ConcurrentLinkedQueue()
   private const val LOGO_SMOOTHNESS: Float = 0.5F

   public fun renderQueuedFrom(pipelines: Array<out صؤ>) {
      val queuedCount: Int = pending.size()

      repeat(queuedCount) { var3 ->
         val var10000: حع = pending.poll()
         if (var10000 != null) {
            if (!ArraysKt.contains(pipelines, var10000.getPipeline())) {
               pending.add(var10000)
            } else {
               جً.drawCenteredText$default(
                  رَ.INSTANCE.getLOGO().priority(var10000.getPipeline()).smoothness(0.5F).spacing(0.0F).resetFade(),
                  "a",
                  var10000.x,
                  var10000.y,
                  var10000.size,
                  Color(var10000.argb, true),
                  0.0F,
                  32,
                  null
               )
            }
         }
      }
   }

   @JvmStatic
   public fun hasPending(): Boolean {
      return !pending.isEmpty()
   }

   @JvmStatic
   public fun enqueueA(x: Float, y: Float, size: Float, argb: Int) {
      enqueueA(x, y, size, argb, صؤ.GUI_SPECIAL)
   }

   public fun renderQueued(vararg pipelines: صؤ) {
      this.renderQueuedFrom(pipelines)
   }

   @JvmStatic
   public fun enqueueA(x: Float, y: Float, size: Float, argb: Int, pipeline: صؤ) {
      if (!(size <= 0.0F) && argb ushr 24 != 0) {
         pending.add(حع(x, y, size, argb, pipeline))
      }
   }
}
