package oxxxde

import java.awt.Color
import net.minecraft.client.gl.Framebuffer
import org.joml.Vector4f
import org.joml.Vector4fc

// $VF: Compiled from heavy
public class جء {
   private final var cachedBorderColor: Color
   private final val textureRect: جث
   private final var cachedBorderWidth: Float
   private final var cachedMix: Float
   private final val cachedColor: سة
   private final val kawase: اْ
   private final var currentPipeline: صؤ
   private final val cachedRadius: Vector4f
   @JvmStatic
   public رة Companion = رة(null);
   @JvmStatic
   private Color TRANSPARENT = Color(0, 0, 0, 0);

   public fun borderWidth(width: Float): جء {
      this.cachedBorderWidth = width
      return this
   }

   public fun draw(x: Float, y: Float, width: Float, height: Float, radius: Vector4f, color: Color, mix: Float) {
      this.cachedColor.set(color)
      this.draw(x, y, width, height, radius, this.cachedColor, mix)
   }

   public fun color(c1: Color, c2: Color, c3: Color, c4: Color): جء {
      this.cachedColor.set(c1, c2, c3, c4)
      return this
   }

   public fun draw(x: Float, y: Float, width: Float, height: Float, radius: Float) {
      this.cachedRadius.set(radius, radius, radius, radius)
      this.draw(x, y, width, height, this.cachedRadius, this.cachedColor, this.cachedMix, this.cachedBorderWidth, this.cachedBorderColor)
      this.cachedBorderWidth = 0.0F
      this.cachedBorderColor = TRANSPARENT
   }

   public fun draw(x: Float, y: Float, width: Float, height: Float, radius: Float, color: Color, mix: Float) {
      this.cachedColor.set(color)
      this.cachedRadius.set(radius, radius, radius, radius)
      this.draw(x, y, width, height, this.cachedRadius, this.cachedColor, mix)
   }

   public fun round(radius: Vector4f): جء {
      this.cachedRadius.set(radius as Vector4fc)
      return this
   }

   public fun mix(mix: Float): جء {
      this.cachedMix = mix
      return this
   }

   public fun draw(x: Float, y: Float, width: Float, height: Float, radius: Vector4f, color: Color, mix: Float, borderWidth: Float, borderColor: Color) {
      this.cachedColor.set(color)
      this.draw(x, y, width, height, radius, this.cachedColor, mix, borderWidth, borderColor)
   }

   public fun priority(pipeline: صؤ): جء {
      this.currentPipeline = pipeline
      return this
   }

   public fun draw(x: Float, y: Float, width: Float, height: Float, radius: Vector4f, color: سة, mix: Float) {
      this.draw(x, y, width, height, radius, color, mix, this.cachedBorderWidth, this.cachedBorderColor)
      this.cachedBorderWidth = 0.0F
      this.cachedBorderColor = TRANSPARENT
   }

   public fun color(color: Color): جء {
      this.cachedColor.set(color)
      return this
   }

   public fun round(radius: Float): جء {
      this.cachedRadius.set(radius, radius, radius, radius)
      return this
   }

   public fun draw(x: Float, y: Float, width: Float, height: Float, radius: Vector4f, color: سة, mix: Float, borderWidth: Float, borderColor: Color) {
      if (this.kawase.hasFramebuffer()) {
         val textureId: Int = this.kawase.texture().texture().getGlId()
         val fbo: Framebuffer = this.kawase.framebuffer()
         val scale: Float = ضك.getMc().getWindow().getScaleFactor()
         val screenW: Float = fbo.textureWidth / scale
         val screenH: Float = fbo.textureHeight / scale
         this.textureRect
            .priority(this.currentPipeline)
            .texture(textureId)
            .border(borderWidth, borderColor)
            .draw(
               x,
               y,
               width,
               height,
               color,
               radius,
               mix,
               x / screenW,
               1.0F - (y + height) / screenH,
               width / screenW,
               height / screenH,
               (float)color.color1.getAlpha() / 255.0F
            )
         }
   }

   public fun border(width: Float, color: Color): جء {
      this.cachedBorderWidth = width
      this.cachedBorderColor = color
      return this
   }

   public fun drawWithBorder(x: Float, y: Float, width: Float, height: Float, radius: Float, color: Color, mix: Float, borderWidth: Float, borderColor: Color) {
      this.cachedColor.set(color)
      this.cachedRadius.set(radius, radius, radius, radius)
      this.draw(x, y, width, height, this.cachedRadius, this.cachedColor, mix, borderWidth, borderColor)
   }

   public fun draw(x: Float, y: Float, width: Float, height: Float) {
      this.draw(x, y, width, height, this.cachedRadius, this.cachedColor, this.cachedMix, this.cachedBorderWidth, this.cachedBorderColor)
      this.cachedBorderWidth = 0.0F
      this.cachedBorderColor = TRANSPARENT
   }

   fun جء(textureRect: جث, kawase: اْ) {
      this.textureRect = textureRect
      this.kawase = kawase
      this.currentPipeline = صؤ.LOW
      this.cachedRadius = Vector4f()
      val var10003: Color = Color.WHITE
      this.cachedColor = سة(var10003)
      this.cachedMix = 0.2F
      this.cachedBorderColor = TRANSPARENT
   }

   public fun borderColor(color: Color): جء {
      this.cachedBorderColor = color
      return this
   }
}
