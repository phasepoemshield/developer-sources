package oxxxde

import java.awt.Color
import java.util.concurrent.ConcurrentLinkedQueue
import kotakbaz.rain.client.util.render.DeferredGuiIconRenderer$Request
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.font.Font

// $VF: Compiled from heavy
public object طئ {
   private final val pending: ConcurrentLinkedQueue<حع> = ConcurrentLinkedQueue()
   private const val LOGO_SMOOTHNESS: Float = 0.5F

   public fun renderQueuedFrom(pipelines: Array<out صؤ>) {
      val queuedCount: Int = pending.size()

      repeat(queuedCount) { var3 ->
         val var10000: DeferredGuiIconRenderer$Request = pending.poll()
         if (var10000 != null) {
            if (!ArraysKt.contains(pipelines, var10000.pipeline)) {
               pending.add(var10000)
            } else {
               Font.drawCenteredText$default(
                  رَ.INSTANCE.LOGO.priority(var10000.pipeline).smoothness(0.5F).spacing(0.0F).resetFade(),
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
      enqueueA(x, y, size, argb, ClientRenderPipeline.GUI_SPECIAL)
   }

   public fun renderQueued(vararg pipelines: صؤ) {
      this.renderQueuedFrom(pipelines)
   }

   @JvmStatic
   public fun enqueueA(x: Float, y: Float, size: Float, argb: Int, pipeline: صؤ) {
      if (!(size <= 0.0F) && argb ushr 24 != 0) {
         pending.add(DeferredGuiIconRenderer$Request(x, y, size, argb, pipeline))
      }
   }
}
