package kotakbaz.rain.module.modules.hud

import java.awt.Color
import kotakbaz.rain.client.util.render.font.Font
import oxxxde.جً

// $VF: Compiled from heavy
private class `WatermarkModule$WatermarkPart`(text: String, font: جً, size: Float, color: Color, topOffset: Float, spacingAfter: Float) {
   public final val color: Color
   public final var text: String
   public final var topOffset: Float
   public final var spacingAfter: Float
   public final var measuredWidth: Float
   public final var size: Float
   public final var measuredText: String?
   private Font font;
   public final var measuredSizeBits: Int

   init {
      this.text = text
      this.font = font
      this.size = size
      this.color = color
      this.topOffset = topOffset
      this.spacingAfter = spacingAfter
   }

   public final val font: جً
}
