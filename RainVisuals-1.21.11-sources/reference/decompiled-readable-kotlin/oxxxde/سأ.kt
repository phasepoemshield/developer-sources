package oxxxde

import java.awt.Color

// $VF: Compiled from heavy
public object سأ {
   private fun alphaByState(disabledAlpha: Float, enabledAlpha: Float, enableProgress: Float, alpha: Float): Float {
      return (disabledAlpha + (enabledAlpha - disabledAlpha) * enableProgress) * alpha
   }

   public fun render(
      rowX: Float,
      rowY: Float,
      rowWidth: Float,
      rowHeight: Float,
      padding: Float,
      progress: Float,
      alpha: Float,
      enableProgress: Float,
      pipeline: صؤ
   ) {
      val toggleHeight: Float = rowHeight * 0.55F
      val toggleWidth: Float = rowHeight * 0.55F * 1.7F
      val toggleX: Float = rowX + rowWidth - padding - rowHeight * 0.55F * 1.7F
      val toggleY: Float = rowY + (rowHeight - toggleHeight) * 0.5F
      val stateProgress: Float = RangesKt.coerceIn(enableProgress, 0.0F, 1.0F)
      val renderAlpha: Float = RangesKt.coerceIn(alpha, 0.0F, 1.0F)
      val toggleBg: Color = بح.INSTANCE
         .interpolateColor(
            ثْ.INSTANCE.value(this.alphaByState(0.06F, 0.12F, stateProgress, renderAlpha)),
            ثْ.INSTANCE.title(this.alphaByState(0.14F, 0.28F, stateProgress, renderAlpha)),
            progress
         )
         val knobColor: Color = ثْ.INSTANCE.title(this.alphaByState(0.45F, 0.9F, stateProgress, renderAlpha))
      ذر.INSTANCE.BASIC_RECT.priority(pipeline).color(toggleBg).round(toggleHeight / 2.8F).draw(toggleX, toggleY, toggleWidth, toggleHeight)
      ذر.INSTANCE.BASIC_RECT
         .priority(pipeline)
         .color(knobColor)
         .round((toggleHeight - 2.0F) / 3.0F)
         .draw(toggleX + 1.0F + (toggleWidth - (toggleHeight - 2.0F) - 2.0F) * progress, toggleY + 1.0F, toggleHeight - 2.0F, toggleHeight - 2.0F)
      }
}
