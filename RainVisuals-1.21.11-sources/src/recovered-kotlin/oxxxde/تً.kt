package oxxxde

import kotakbaz.rain.client.util.animations.AnimationUtil
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.module.modules.hud.container.Data$First
import kotakbaz.rain.module.modules.hud.container.Data$Leading
import kotakbaz.rain.module.modules.hud.container.Data$Second

// $VF: Compiled from heavy
public class تً(first: صه, second: تِ) {
   public final var valid: Boolean
   private Data$Second second;
   public final var seenGeneration: Int
   private AnimationUtil animation;
   public final var cachedWidthFirst: Float
   private Data$First first;
   public final var progress: Float
   private final var sizeDirty: Boolean
   private final var cachedTextSizeBits: Int
   public final var cachedWidthLeading: Float
   public final var cachedWidthSecond: Float

   public final val animation: ري

   public final var second: تِ

   public fun updateSize(textSize: Float) {
      val textSizeBits: Int = java.lang.Float.floatToRawIntBits(textSize)
      if (this.sizeDirty || this.cachedTextSizeBits != textSizeBits) {
         this.cachedTextSizeBits = textSizeBits
         this.sizeDirty = false
         val leadingSize: Float = طغ.INSTANCE.rowLeadingSize(textSize)
         val leadingGap: Data$Leading = this.first.leading
         val var10001: Float
         if (leadingGap is Data$Leading.Glyph) {
            var10001 = Font.getWidth$default(رَ.INSTANCE.ICON, (leadingGap as Data$Leading.Glyph).text, leadingSize, 0.0F, 4, null)
         } else if (leadingGap is Data$Leading.Texture) {
            var10001 = leadingSize
         } else if (leadingGap is Data$Leading.ResourceTexture) {
            var10001 = leadingSize
         } else if (leadingGap is Data$Leading.Item) {
            var10001 = leadingSize
         } else {
            if (leadingGap != null) {
               throw NoWhenBranchMatchedException()
            }

            var10001 = 0.0F
         }

         this.cachedWidthLeading = var10001
         this.cachedWidthFirst = this.cachedWidthLeading
            + (if (this.first.leading != null) طغ.INSTANCE.rowLeadingGap() else 0.0F)
            + Font.getWidth$default(رَ.INSTANCE.GS_MEDIUM, this.first.text, textSize, 0.0F, 4, null)
            this.cachedWidthSecond = Font.getWidth$default(رَ.INSTANCE.GS_MEDIUM, this.second.text, textSize, 0.0F, 4, null)
      }
   }

   init {
      this.first = first
      this.second = second
      this.valid = true
      this.sizeDirty = true
      this.animation = AnimationUtil(0.0F)
   }

   public fun totalWidth(gapBetweenColumns: Float): Float {
      return this.cachedWidthFirst + gapBetweenColumns + this.cachedWidthSecond
   }

   public final var first: صه

   private fun leadingWidthChanged(previous: دغ?, current: دغ?): Boolean {
      return if (previous == null || current == null)
         previous != current
         else
         (previous is Data$Leading.Glyph || current is Data$Leading.Glyph)
            && (
               previous !is Data$Leading.Glyph
                  || current !is Data$Leading.Glyph
                  || !((previous as Data$Leading.Glyph).text == (current as Data$Leading.Glyph).text)
            )
         }

   public fun updateData(first: صه, second: تِ) {
      if (!(this.first.text == first.text) || !(this.second.text == second.text) || this.leadingWidthChanged(this.first.leading, first.leading)) {
         this.sizeDirty = true
      }

      this.first = first
      this.second = second
   }
}
