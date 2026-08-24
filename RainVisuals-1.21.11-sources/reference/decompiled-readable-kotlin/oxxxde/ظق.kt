package oxxxde

import java.util.ArrayList
import kotakbaz.rain.client.util.render.engine.Renderable
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.engine.dispatcher.RenderDispatcher

// $VF: Compiled from heavy
public object ظق {
   @JvmStatic
   private RenderDispatcher dispatcher = RenderDispatcher();
   private final val renderers: MutableList<طء> = ArrayList() as java.util.List

   public fun flushPipelineArray(pipelines: Array<out صؤ>) {
      dispatcher.flushPipelineArray(pipelines)
   }

   public fun flushAll() {
      dispatcher.flushAll()
   }

   public fun loadRender() {
      for (`element$iv` in renderers) {
         (`element$iv` as Renderable).load()
      }
   }

   @JvmStatic
   public fun hasQueuedGuiOrWindow(): Boolean {
      return dispatcher.hasQueued(ClientRenderPipeline.GUI_RECT)
         || dispatcher.hasQueued(ClientRenderPipeline.GUI_SPECIAL)
         || dispatcher.hasQueued(ClientRenderPipeline.GUI_TEXT)
         || dispatcher.hasQueued(ClientRenderPipeline.WINDOW_RECT)
         || dispatcher.hasQueued(ClientRenderPipeline.WINDOW_SPECIAL)
         || dispatcher.hasQueued(ClientRenderPipeline.WINDOW_TEXT)
      }

   public final val dispatcher: بئ

   public fun loadShaders(vararg renderable: طء) {
      CollectionsKt.addAll(renderers, renderable)
   }

   public fun flushPipelines(vararg pipelines: صؤ) {
      dispatcher.flushPipelineArray(pipelines)
   }
}
