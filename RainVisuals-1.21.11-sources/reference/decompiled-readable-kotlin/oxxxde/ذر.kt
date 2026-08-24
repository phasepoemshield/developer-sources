package oxxxde

import kotakbaz.rain.client.util.render.display.AdvancedRectRenderer
import kotakbaz.rain.client.util.render.display.BasicRectRenderer
import kotakbaz.rain.client.util.render.display.BlurredRectRenderer
import kotakbaz.rain.client.util.render.display.KawaseRenderer
import kotakbaz.rain.client.util.render.display.TextureRectRenderer
import kotakbaz.rain.client.util.render.engine.dispatcher.RenderDispatcher

// $VF: Compiled from heavy
public object ذر {
   @JvmStatic
   private RenderDispatcher DISPATCHER = ظق.INSTANCE.dispatcher;
   @JvmStatic
   private BasicRectRenderer BASIC_RECT = BasicRectRenderer(ذر.ADVANCED_RECT);
   @JvmStatic
   private AdvancedRectRenderer ADVANCED_RECT = AdvancedRectRenderer();
   @JvmStatic
   private KawaseRenderer KAWASE = KawaseRenderer();
   @JvmStatic
   private BlurredRectRenderer BLURRED_RECT = BlurredRectRenderer(ذر.TEXTURE_RECT, KAWASE);
   @JvmStatic
   private TextureRectRenderer TEXTURE_RECT = TextureRectRenderer(ADVANCED_RECT);

   public final val BLURRED_RECT: جء

   public final val ADVANCED_RECT: زج

   public final val DISPATCHER: بئ

   public final val TEXTURE_RECT: جث

   public final val KAWASE: اْ

   public final val BASIC_RECT: ضِ
}
