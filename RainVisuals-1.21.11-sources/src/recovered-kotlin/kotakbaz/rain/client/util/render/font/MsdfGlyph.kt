package kotakbaz.rain.client.util.render.font

import org.joml.Vector3f
import org.joml.Vector4f
import oxxxde.ان
import oxxxde.بد
import oxxxde.جِ
import oxxxde.دح
import oxxxde.سئ
import oxxxde.غ

// $VF: Compiled from heavy
public class MsdfGlyph(data: دح, atlasWidth: Float, atlasHeight: Float) {
   private final var outlineColorCached: Boolean
   private final val width: Float
   private final var cachedOutlineColor: Int
   private final val minU: Float
   private final val topPosition: Float
   private final val advance: Float
   private final var cachedColor: Int
   private final val minV: Float
   private final var colorCached: Boolean
   private final val colorBuffer: FloatArray
   private final val outlineColorBuffer: FloatArray
   private final val currentPos: Vector3f
   public final val code: Int
   private final val maxU: Float
   private final val maxV: Float
   private final val height: Float

   private fun addVertex(
      meshBuilder: ان,
      x: Float,
      y: Float,
      z: Float,
      u: Float,
      v: Float,
      smoothness: Float,
      thickness: Float,
      outlineThickness: Float,
      fadeMin: Float,
      fadeMax: Float,
      fadeLeft: Float,
      fadeRight: Float,
      eTexture: سئ,
      eColor: سئ,
      eStyle: سئ,
      eOutlineColor: سئ,
      eFade: سئ,
      eScissor: سئ,
      scX: Float,
      scY: Float,
      scZ: Float,
      scW: Float
   ) {
      this.currentPos.set(x, y, z)
      بد.INSTANCE.transformPosition(this.currentPos)
      meshBuilder.vertex(this.currentPos.x, this.currentPos.y, this.currentPos.z)
         .elementFloat(eTexture, u, v)
         .elementFloat(eColor, this.colorBuffer[0], this.colorBuffer[1], this.colorBuffer[2], this.colorBuffer[3])
         .elementFloat(eStyle, thickness, smoothness, outlineThickness)
         .elementFloat(eOutlineColor, this.outlineColorBuffer[0], this.outlineColorBuffer[1], this.outlineColorBuffer[2], this.outlineColorBuffer[3])
         .elementFloat(eFade, fadeMin, fadeMax, fadeLeft, fadeRight)
         .elementFloat(eScissor, scX, scY, scZ, scW)
      }

   public fun apply(
      buffer: ان,
      x: Float,
      y: Float,
      z: Float,
      size: Float,
      color: Int,
      thickness: Float,
      smoothness: Float,
      outlineThickness: Float,
      outlineColor: Int,
      fadeMin: Float,
      fadeMax: Float,
      fadeLeft: Float,
      fadeRight: Float,
      eTexture: سئ,
      eColor: سئ,
      eStyle: سئ,
      eOutlineColor: سئ,
      eFade: سئ,
      eScissor: سئ
   ): Float {
      val localY: Float = y - this.topPosition * size
      val w: Float = this.width * size
      val h: Float = this.height * size
      if (!this.colorCached || this.cachedColor != color) {
         this.cachedColor = color
         this.colorCached = true
         this.normalizeArgb(color, this.colorBuffer)
      }

      if (!this.outlineColorCached || this.cachedOutlineColor != outlineColor) {
         this.cachedOutlineColor = outlineColor
         this.outlineColorCached = true
         this.normalizeArgb(outlineColor, this.outlineColorBuffer)
      }

      val scissor: Vector4f = جِ.INSTANCE.getCurrentScissorValues()
      this.addVertex(
         buffer,
         x,
         localY,
         z,
         this.minU,
         this.minV,
         smoothness,
         thickness,
         outlineThickness,
         fadeMin,
         fadeMax,
         fadeLeft,
         fadeRight,
         eTexture,
         eColor,
         eStyle,
         eOutlineColor,
         eFade,
         eScissor,
         scissor.x,
         scissor.y,
         scissor.z,
         scissor.w
      )
      this.addVertex(
         buffer,
         x,
         localY + h,
         z,
         this.minU,
         this.maxV,
         smoothness,
         thickness,
         outlineThickness,
         fadeMin,
         fadeMax,
         fadeLeft,
         fadeRight,
         eTexture,
         eColor,
         eStyle,
         eOutlineColor,
         eFade,
         eScissor,
         scissor.x,
         scissor.y,
         scissor.z,
         scissor.w
      )
      this.addVertex(
         buffer,
         x + w,
         localY + h,
         z,
         this.maxU,
         this.maxV,
         smoothness,
         thickness,
         outlineThickness,
         fadeMin,
         fadeMax,
         fadeLeft,
         fadeRight,
         eTexture,
         eColor,
         eStyle,
         eOutlineColor,
         eFade,
         eScissor,
         scissor.x,
         scissor.y,
         scissor.z,
         scissor.w
      )
      this.addVertex(
         buffer,
         x + w,
         localY,
         z,
         this.maxU,
         this.minV,
         smoothness,
         thickness,
         outlineThickness,
         fadeMin,
         fadeMax,
         fadeLeft,
         fadeRight,
         eTexture,
         eColor,
         eStyle,
         eOutlineColor,
         eFade,
         eScissor,
         scissor.x,
         scissor.y,
         scissor.z,
         scissor.w
      )
      return this.advance * size
   }

   init {
      this.code = data.unicode
      this.advance = data.advance
      this.currentPos = Vector3f()
      this.colorBuffer = FloatArray(4)
      this.outlineColorBuffer = FloatArray(4)
      val atlasBounds: FontData.BoundsData = data.atlasBounds
      if (atlasBounds != null) {
         this.minU = atlasBounds.left / atlasWidth
         this.maxU = atlasBounds.right / atlasWidth
         this.minV = 1.0F - atlasBounds.top / atlasHeight
         this.maxV = 1.0F - atlasBounds.bottom / atlasHeight
      } else {
         this.minU = 0.0F
         this.maxU = 0.0F
         this.minV = 0.0F
         this.maxV = 0.0F
      }

      val planeBounds: FontData.BoundsData = data.planeBounds
      if (planeBounds != null) {
         this.width = planeBounds.right - planeBounds.left
         this.height = planeBounds.top - planeBounds.bottom
         this.topPosition = planeBounds.top
      } else {
         this.width = 0.0F
         this.height = 0.0F
         this.topPosition = 0.0F
      }
   }

   public fun width(size: Float): Float {
      return this.advance * size
   }

   private fun normalizeArgb(argb: Int, out: FloatArray) {
      out[0] = (argb shr 16 and 255) / 255.0F
      out[1] = (argb shr 8 and 255) / 255.0F
      out[2] = (argb and 255) / 255.0F
      out[3] = (argb ushr 24 and 255) / 255.0F
   }

   // $VF: Compiled from heavy
   public data class ColoredGlyph(c: Char, color: Int) {
      public final val color: Int
      public final val c: Char

      init {
         this.c = c
         this.color = color
      }

      public operator fun component1(): Char {
         return this.c
      }

      public fun copy(c: Char = ..., color: Int = ...): غ {
         return MsdfGlyph.ColoredGlyph(c, color)
      }

      public operator fun component2(): Int {
         return this.color
      }

      public override operator fun equals(other: Any?): Boolean {
         label28@
         if (this === other) {
            return true
         } else {
            return other is MsdfGlyph.ColoredGlyph && this.c == (other as MsdfGlyph.ColoredGlyph).c && this.color == (other as MsdfGlyph.ColoredGlyph).color
         }
      }

      public override fun hashCode(): Int {
         return Character.hashCode(this.c) * 31 + Integer.hashCode(this.color)
      }

      public override fun toString(): String {
         return "ColoredGlyph(c=${this.c}, color=${this.color})"
      }
   }
}
