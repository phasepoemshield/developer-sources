package kotakbaz.rain.client.util.render.display

import java.awt.Color
import kotakbaz.rain.client.util.color.QuadColor
import kotakbaz.rain.client.util.render.engine.controls.RectType
import org.joml.Vector4f
import org.joml.Vector4fc
import oxxxde.رؤ
import oxxxde.رص
import oxxxde.زج
import oxxxde.صؤ
import oxxxde.ضِ

// $VF: Compiled from heavy
public class BasicRectRenderer(advanced: زج) {
   private QuadColor cachedColor;
   private AdvancedRectRenderer advanced;
   private final var cachedBorderColor: Color
   @JvmStatic
   private Color TRANSPARENT = Color(0, 0, 0, 0);
   private final var cachedBorderWidth: Float
   @JvmStatic
   public رؤ Companion = رؤ(null);
   private final val cachedRadius: Vector4f

   public fun borderColor(color: Color): ضِ {
      this.cachedBorderColor = color
      return this
   }

   public fun draw(x: Float, y: Float, width: Float, height: Float) {
      this.advanced.type(RectType.BASIC)
      this.advanced.drawRect(x, y, width, height, this.cachedColor, this.cachedRadius, this.cachedBorderWidth, this.cachedBorderColor)
      this.cachedBorderWidth = 0.0F
      this.cachedBorderColor = TRANSPARENT
   }

   public fun round(r: Float): ضِ {
      this.advanced.round(r)
      this.cachedRadius.set(r, r, r, r)
      return this
   }

   init {
      this.advanced = advanced
      this.cachedRadius = Vector4f()
      val var10003: Color = Color.WHITE
      this.cachedColor = QuadColor(var10003)
      this.cachedBorderColor = TRANSPARENT
   }

   public fun priority(pipeline: صؤ): ضِ {
      this.advanced.priority(pipeline)
      return this
   }

   public fun border(width: Float, color: Color): ضِ {
      this.cachedBorderWidth = width
      this.cachedBorderColor = color
      return this
   }

   public fun round(r: Vector4f): ضِ {
      this.advanced.round(r)
      this.cachedRadius.set(r as Vector4fc)
      return this
   }

   public fun borderWidth(width: Float): ضِ {
      this.cachedBorderWidth = width
      return this
   }

   public fun color(c1: Color, c2: Color, c3: Color, c4: Color): ضِ {
      this.advanced.color(c1, c2, c3, c4)
      this.cachedColor.set(c1, c2, c3, c4)
      return this
   }

   public fun color(color: Color): ضِ {
      this.advanced.color(color)
      this.cachedColor.set(color)
      return this
   }

   public fun draw(x: Float, y: Float, width: Float, height: Float, radius: Float, color: Color) {
      this.cachedColor.set(color)
      this.cachedRadius.set(radius, radius, radius, radius)
      this.advanced.type(RectType.BASIC)
      this.advanced.drawRect(x, y, width, height, this.cachedColor, this.cachedRadius, this.cachedBorderWidth, this.cachedBorderColor)
      this.cachedBorderWidth = 0.0F
      this.cachedBorderColor = TRANSPARENT
   }

   public fun type(type: رص): ضِ {
      this.advanced.type(type)
      return this
   }
}
