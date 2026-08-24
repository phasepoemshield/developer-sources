package oxxxde

import java.awt.Color

// $VF: Compiled from heavy
public object بح {
   private const val ALPHA_CACHE_MASK: Int = 2047
   private const val ALPHA_CACHE_SIZE: Int = 2048
   private final val alphaCache: ThreadLocal<طة> = ThreadLocal.withInitial(oxxxde/بح##Lambda_0_131())

   public fun normalize(color: Color): FloatArray {
      return floatArrayOf(color.getRed() / 255.0F, color.getGreen() / 255.0F, color.getBlue() / 255.0F, color.getAlpha() / 255.0F)
   }

   public fun normalizeInto(color: Color, buffer: FloatArray) {
      buffer[0] = color.getRed() / 255.0F
      buffer[1] = color.getGreen() / 255.0F
      buffer[2] = color.getBlue() / 255.0F
      buffer[3] = color.getAlpha() / 255.0F
   }

   public fun multiplyAlpha(color: Color, factor: Float): Color {
      return alphaCache.get().get(color, RangesKt.coerceIn((int)((float)color.getAlpha() * factor), 0, 255))
   }

   public fun interpolateColor(current: Color, target: Color, delta: Float): Color {
      val t: Float = RangesKt.coerceIn(delta, 0.0F, 1.0F)
      return Color(
         RangesKt.coerceIn((int)((float)current.getRed() + (float)(target.getRed() - current.getRed()) * t), 0, 255),
         RangesKt.coerceIn((int)((float)current.getGreen() + (float)(target.getGreen() - current.getGreen()) * t), 0, 255),
         RangesKt.coerceIn((int)((float)current.getBlue() + (float)(target.getBlue() - current.getBlue()) * t), 0, 255),
         RangesKt.coerceIn((int)((float)current.getAlpha() + (float)(target.getAlpha() - current.getAlpha()) * t), 0, 255)
      )
   }

   public fun setAlpha(color: Color, alpha: Float): Color {
      return alphaCache.get().get(color, RangesKt.coerceIn((int)(RangesKt.coerceIn(alpha, 0.0F, 1.0F) * 255.0F), 0, 255))
   }
}
