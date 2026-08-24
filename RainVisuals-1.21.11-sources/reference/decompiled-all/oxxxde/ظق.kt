package oxxxde

import java.util.ArrayList

// $VF: Compiled from heavy
public object ظق {
   public final val dispatcher: بئ = بئ()
   private final val renderers: MutableList<طء> = ArrayList() as java.util.List

   public fun flushPipelineArray(pipelines: Array<out صؤ>) {
      dispatcher.flushPipelineArray(pipelines)
   }

   public fun flushAll() {
      dispatcher.flushAll()
   }

   public fun loadRender() {
      for (`element$iv` in renderers) {
         (`element$iv` as طء).load()
      }
   }

   @JvmStatic
   public fun hasQueuedGuiOrWindow(): Boolean {
      return dispatcher.hasQueued(صؤ.GUI_RECT)
         || dispatcher.hasQueued(صؤ.GUI_SPECIAL)
         || dispatcher.hasQueued(صؤ.GUI_TEXT)
         || dispatcher.hasQueued(صؤ.WINDOW_RECT)
         || dispatcher.hasQueued(صؤ.WINDOW_SPECIAL)
         || dispatcher.hasQueued(صؤ.WINDOW_TEXT)
      }

   fun getDispatcher(): بئ {
      dispatcher
   }

   public fun loadShaders(vararg renderable: طء) {
      CollectionsKt.addAll(renderers, renderable)
   }

   public fun flushPipelines(vararg pipelines: صؤ) {
      dispatcher.flushPipelineArray(pipelines)
   }
}
