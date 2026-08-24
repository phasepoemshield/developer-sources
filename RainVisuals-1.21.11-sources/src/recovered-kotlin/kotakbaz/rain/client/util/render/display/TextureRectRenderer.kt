package kotakbaz.rain.client.util.render.display

import java.awt.Color
import kotakbaz.rain.client.util.color.QuadColor
import org.joml.Vector4f
import oxxxde.جث
import oxxxde.زج
import oxxxde.سة
import oxxxde.شظ
import oxxxde.صؤ
import oxxxde.طج

// $VF: Compiled from heavy
public class TextureRectRenderer(advanced: زج) {
   @JvmStatic
   public شظ Companion = شظ(null);
   private QuadColor cachedColor;
   private AdvancedRectRenderer advanced;
   private final var cachedPixelGridSize: Float
   private final var cachedBorderColor: Color
   @JvmStatic
   private Color TRANSPARENT = Color(0, 0, 0, 0);
   private final val cachedRadius: Vector4f
   private final var cachedBorderWidth: Float

   public fun draw(
      x: Float,
      y: Float,
      width: Float,
      height: Float,
      color: Color,
      radius: Vector4f,
      mix: Float = 0.0F,
      u: Float = 0.0F,
      v: Float = 0.0F,
      texW: Float = 1.0F,
      texH: Float = 1.0F,
      alpha: Float = 1.0F
   ) {
      this.cachedColor.set(color)
      this.draw(x, y, width, height, this.cachedColor, radius, mix, u, v, texW, texH, alpha)
   }

   init {
      this.advanced = advanced
      this.cachedBorderColor = TRANSPARENT
      val var10003: Color = Color.WHITE
      this.cachedColor = QuadColor(var10003)
      this.cachedRadius = Vector4f()
   }

   public fun texture(glTex: طج): جث {
      this.advanced.texture(glTex)
      return this
   }

   public fun pixelated(gridSize: Float): جث {
      this.cachedPixelGridSize = RangesKt.coerceAtLeast(gridSize, 0.0F)
      return this
   }

   public fun draw(
      x: Float,
      y: Float,
      width: Float,
      height: Float,
      color: سة,
      radius: Vector4f,
      mix: Float,
      u: Float,
      v: Float,
      texW: Float,
      texH: Float,
      alpha: Float
   ) {
      this.advanced
         .pixelated(this.cachedPixelGridSize)
         .border(this.cachedBorderWidth, this.cachedBorderColor)
         .drawTexture(x, y, width, height, color, mix, alpha, u, v, texW, texH, radius)
         this.advanced.pixelated(0.0F)
      this.advanced.border(0.0F, TRANSPARENT)
      this.cachedBorderWidth = 0.0F
      this.cachedBorderColor = TRANSPARENT
      this.cachedPixelGridSize = 0.0F
   }

   public fun border(width: Float, color: Color): جث {
      this.cachedBorderWidth = width
      this.cachedBorderColor = color
      return this
   }

   public fun priority(pipeline: صؤ): جث {
      this.advanced.priority(pipeline)
      return this
   }

   public fun draw(
      x: Float,
      y: Float,
      width: Float,
      height: Float,
      color: Color,
      radius: Float,
      mix: Float = 0.0F,
      u: Float = 0.0F,
      v: Float = 0.0F,
      texW: Float = 1.0F,
      texH: Float = 1.0F,
      alpha: Float = 1.0F
   ) {
      this.cachedColor.set(color)
      this.cachedRadius.set(radius, radius, radius, radius)
      this.draw(x, y, width, height, this.cachedColor, this.cachedRadius, mix, u, v, texW, texH, alpha)
   }

   public fun texture(id: Int): جث {
      this.advanced.texture(id)
      return this
   }
}
