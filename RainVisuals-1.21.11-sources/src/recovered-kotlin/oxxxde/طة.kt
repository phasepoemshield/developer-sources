package oxxxde

import java.awt.Color

// $VF: Compiled from heavy
private class طة {
   private final val values: Array<Color?>
   private final val keys: IntArray = IntArray(2048)

   init {
      this.values = arrayOfNulls(2048)
   }

   public fun get(color: Color, alpha: Int): Color {
      if (color.getAlpha() == alpha) {
         return color
      } else {
         val argb: Int = alpha shl 24 or color.getRGB() and 16777215
         val index: Int = ((argb xor argb ushr 16) * -2048144789 xor (argb xor argb ushr 16) * -2048144789 ushr 13) and 2047
         val cached: Color = this.values[((argb xor argb ushr 16) * -2048144789 xor (argb xor argb ushr 16) * -2048144789 ushr 13) and 2047]
         if (this.values[((argb xor argb ushr 16) * -2048144789 xor (argb xor argb ushr 16) * -2048144789 ushr 13) and 2047] != null
            && this.keys[index] == argb) {
            return cached
         } else {
            val created: Color = Color(argb, true)
            this.keys[index] = argb
            this.values[index] = created
            return created
         }
      }
   }
}
