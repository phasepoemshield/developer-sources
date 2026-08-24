package oxxxde

// $VF: Compiled from heavy
public class تً {
   public final var valid: Boolean

   public final var second: تِ
      private set

   public final var seenGeneration: Int
   public final val animation: ري
   public final var cachedWidthFirst: Float

   public final var first: صه
      private set

   public final var progress: Float
   private final var sizeDirty: Boolean
   private final var cachedTextSizeBits: Int
   public final var cachedWidthLeading: Float
   public final var cachedWidthSecond: Float

   fun getAnimation(): ري {
      this.animation
   }

   fun getSecond(): تِ {
      this.second
   }

   fun setSecond(`<set-?>`: تِ) {
      this.second = `<set-?>`
   }

   public fun updateSize(textSize: Float) {
      val textSizeBits: Int = java.lang.Float.floatToRawIntBits(textSize)
      if (this.sizeDirty || this.cachedTextSizeBits != textSizeBits) {
         this.cachedTextSizeBits = textSizeBits
         this.sizeDirty = false
         val leadingSize: Float = طغ.INSTANCE.rowLeadingSize(textSize)
         val leadingGap: دغ = this.first.getLeading()
         val var10001: Float
         if (leadingGap is طظ) {
            var10001 = جً.getWidth$default(رَ.INSTANCE.getICON(), (leadingGap as طظ).text, leadingSize, 0.0F, 4, null)
         } else if (leadingGap is ضإ) {
            var10001 = leadingSize
         } else if (leadingGap is جا) {
            var10001 = leadingSize
         } else if (leadingGap is ثي) {
            var10001 = leadingSize
         } else {
            if (leadingGap != null) {
               throw NoWhenBranchMatchedException()
            }

            var10001 = 0.0F
         }

         this.cachedWidthLeading = var10001
         this.cachedWidthFirst = this.cachedWidthLeading
            + (if (this.first.getLeading() != null) طغ.INSTANCE.rowLeadingGap() else 0.0F)
            + جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), this.first.text, textSize, 0.0F, 4, null)
            this.cachedWidthSecond = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), this.second.text, textSize, 0.0F, 4, null)
      }
   }

   fun تً(second: صه, first: تِ) {
      this.first = first
      this.second = second
      this.valid = true
      this.sizeDirty = true
      this.animation = ري(0.0F)
   }

   public fun totalWidth(gapBetweenColumns: Float): Float {
      return this.cachedWidthFirst + gapBetweenColumns + this.cachedWidthSecond
   }

   fun getFirst(): صه {
      this.first
   }

   fun setFirst(`<set-?>`: صه) {
      this.first = `<set-?>`
   }

   private fun leadingWidthChanged(previous: دغ?, current: دغ?): Boolean {
      return if (previous == null || current == null)
         previous != current
         else
         (previous is طظ || current is طظ) && (previous !is طظ || current !is طظ || !((previous as طظ).text == (current as طظ).text))
      }

   public fun updateData(first: صه, second: تِ) {
      if (!(this.first.text == first.text) || !(this.second.text == second.text) || this.leadingWidthChanged(this.first.getLeading(), first.getLeading())) {
         this.sizeDirty = true
      }

      this.first = first
      this.second = second
   }
}
