package oxxxde

import java.awt.Color

// $VF: Compiled from heavy
public object ظء {
   @JvmStatic
   public fun draw(textureId: Int, x: Float, y: Float, width: Float, height: Float, alpha: Float) {
      if (textureId > 0 && !(width <= 1.0F) && !(height <= 1.0F) && !(alpha <= 0.01F)) {
         val var10000: جث = ذر.INSTANCE.getTEXTURE_RECT().priority(صؤ.GUI_SPECIAL).texture(textureId)
         val var10005: Color = Color.WHITE
         var10000.draw(x, y, width, height, var10005, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, RangesKt.coerceIn(alpha, 0.0F, 1.0F))
      }
   }
}
