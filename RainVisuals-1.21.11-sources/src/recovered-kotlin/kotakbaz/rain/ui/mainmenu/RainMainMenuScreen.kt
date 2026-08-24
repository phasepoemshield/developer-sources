package kotakbaz.rain.ui.mainmenu

import java.awt.Color
import kotakbaz.rain.client.render.texture.texture.GLTexture
import kotakbaz.rain.client.util.render.display.TextureRectRenderer
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.ui.api.PipelinedRender
import kotlin.math.MathKt
import org.joml.Vector4f
import oxxxde.اس
import oxxxde.بد
import oxxxde.ثْ
import oxxxde.ذر
import oxxxde.رَ
import oxxxde.زْ
import oxxxde.شس

// $VF: Compiled from heavy
public class RainMainMenuScreen(pipelines: اس) {
   private PipelinedRender pipelines;

   init {
      this.pipelines = pipelines
   }

   private fun renderAvatar(layout: زْ, alpha: Float, hoverProgress: Float, popupProgress: Float) {
      val var10000: GLTexture = شس.INSTANCE.get("interface_avatar")
      if (var10000 != null) {
         if (!(layout.avatarSize <= 0.0F)) {
            val baseSize: Float = RangesKt.coerceAtLeast(MathKt.roundToInt(layout.avatarSize), 1)
            val size: Float = baseSize * (1.0F + RangesKt.coerceIn(hoverProgress, 0.0F, 1.0F) * 0.06F)
            val avatarX: Float = layout.avatarX + layout.avatarSize * 0.5F - size * 0.5F
            val avatarY: Float = layout.avatarY + layout.avatarSize * 0.5F - size * 0.5F
            val radius: Float = RangesKt.coerceAtLeast(size * 0.5F - 1.0F, 0.0F)
            val var24: TextureRectRenderer = ذر.INSTANCE.TEXTURE_RECT.priority(this.pipelines.iconsPipeline()).texture(var10000.getTexId())
            val var10005: Color = Color.WHITE
            var24.draw(avatarX, avatarY, size, size, var10005, radius, 0.0F, 0.0F, 1.0F, 1.0F, -1.0F, alpha)
            val gearSize: Float = RangesKt.coerceAtLeast(baseSize * 0.34F, 5.0F)
            val gearWidth: Float = Font.getWidth$default(رَ.INSTANCE.ICON, "f", gearSize, 0.0F, 4, null)
            val gearHeight: Float = رَ.INSTANCE.ICON.getHeight(gearSize)
            val gearCenterX: Float = avatarX + size * 0.78F
            val gearCenterY: Float = avatarY + size * 0.78F
            val gearX: Float = gearCenterX - gearWidth * 0.5F
            val gearY: Float = gearCenterY - gearHeight * 0.5F
            val gearRotation: Float = RangesKt.coerceIn(popupProgress, 0.0F, 1.0F) * (float) Math.PI
            val shadowAlpha: Int = RangesKt.coerceIn(MathKt.roundToInt(alpha * 0.58F * 255.0F), 0, 255)
            val iconAlpha: Int = RangesKt.coerceIn(MathKt.roundToInt(alpha * 255.0F), 0, 255)
            بد.INSTANCE.pushMatrix()
            بد.matrix4fStack.translate(gearCenterX, gearCenterY, 0.0F)
            بد.matrix4fStack.rotateZ(gearRotation)
            بد.matrix4fStack.translate(-gearCenterX, -gearCenterY, 0.0F)
            Font.drawText$default(
               رَ.INSTANCE.ICON.priority(this.pipelines.iconsPipeline()),
               "f",
               gearX + 0.35F,
               gearY + 0.35F,
               gearSize,
               Color(0, 0, 0, shadowAlpha),
               0.0F,
               0.0F,
               0.0F,
               0,
               0.0F,
               992,
               null
            )
            Font.drawText$default(
               رَ.INSTANCE.ICON.priority(this.pipelines.iconsPipeline()),
               "f",
               gearX,
               gearY,
               gearSize,
               Color(205, 205, 205, iconAlpha),
               0.0F,
               0.0F,
               0.0F,
               0,
               0.0F,
               992,
               null
            )
            بد.INSTANCE.popMatrix()
         }
      }
   }

   public fun render(layout: زْ, alpha: Float, avatarHoverProgress: Float, avatarPopupProgress: Float) {
      ذر.INSTANCE.BLURRED_RECT
         .priority(this.pipelines.rectPipeline())
         .round(layout.radius)
         .color(ثْ.INSTANCE.panel((float)ثْ.INSTANCE.panelBase.getAlpha() / 255.0F * alpha))
         .mix(0.95F)
         .draw(layout.x, layout.y, layout.width, layout.height)
         ذر.INSTANCE.BLURRED_RECT
         .priority(this.pipelines.rectPipeline())
         .round(Vector4f(layout.radius, 0.0F, layout.radius, 0.0F))
         .color(ثْ.INSTANCE.surface(((float)ثْ.INSTANCE.surfaceBase.getAlpha() + 5.0F) / 255.0F * alpha))
         .mix(0.95F)
         .draw(layout.x, layout.y, layout.panelWidth, layout.height)
         Font.drawCenteredText$default(
         رَ.INSTANCE.LOGO.priority(this.pipelines.iconsPipeline()).smoothness(0.5F).spacing(0.0F).resetFade(),
         "a",
         layout.x + layout.panelWidth * 0.56F,
         layout.logoY,
         layout.logoSize,
         ثْ.INSTANCE.title(0.9F * alpha),
         0.0F,
         32,
         null
      )
      ذر.INSTANCE.BLURRED_RECT
         .priority(this.pipelines.rectPipeline())
         .round(1.0F)
         .color(ثْ.INSTANCE.title(0.45F * alpha))
         .mix(0.95F)
         .draw(layout.x + layout.uiPadding * 2.0F, layout.y + layout.headerHeight * 0.9F, layout.panelWidth - layout.uiPadding * 4.0F, 1.0F)
         this.renderAvatar(layout, alpha, avatarHoverProgress, avatarPopupProgress)
   }
}
