package oxxxde

import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline

// $VF: Compiled from heavy
public object حئ {
   @JvmStatic
   private ClientRenderPipeline[] HUD_PIPELINES = arrayOf(ClientRenderPipeline.HUD_RECT, ClientRenderPipeline.HUD_SPECIAL, ClientRenderPipeline.HUD_TEXT);
   @JvmStatic
   private ClientRenderPipeline[] GUI_PIPELINES = arrayOf(ClientRenderPipeline.GUI_RECT, ClientRenderPipeline.GUI_SPECIAL, ClientRenderPipeline.GUI_TEXT);
   @JvmStatic
   private ClientRenderPipeline[] WINDOW_PIPELINES = arrayOf(
      ClientRenderPipeline.WINDOW_RECT,
      ClientRenderPipeline.WINDOW_SPECIAL,
      ClientRenderPipeline.WINDOW_TEXT
   );

   public fun getPipelines(renderIn: ذث): List<صؤ> {
      var var10000: java.util.List
      when (طٌ.$EnumSwitchMapping$0[renderIn.ordinal()]) {
         1 -> var10000 = ArraysKt.asList(HUD_PIPELINES)
         2 -> var10000 = ArraysKt.asList(GUI_PIPELINES)
         3 -> var10000 = ArraysKt.asList(WINDOW_PIPELINES)
         else -> throw NoWhenBranchMatchedException()
      }

      return var10000
   }
}
