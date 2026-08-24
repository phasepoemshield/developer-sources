package oxxxde

import java.awt.Color

// $VF: Compiled from heavy
public object طغ {
   public const val ROW_LEADING_GAP: Float = 6.0F
   public const val ROW_DIVIDER_WIDTH: Float = 1.2F
   public const val ELEMENT_ANIMATION_DURATION: Float = 80.0F
   public final val HEADER_COLOR: Color = Color(255, 255, 255, 25)
   public final val VALUE_COLOR: Color = Color(128, 128, 128, 255)
   public const val ROW_TEXT_SIZE: Float = 7.0F
   public final val ICON_COLOR: Color = Color(128, 128, 128, 255)
   public final val PANEL_COLOR: Color = Color(8, 8, 8, 255)
   public const val MARGIN: Float = 6.0F
   public const val CONTAINER_ANIMATION_DURATION: Float = 80.0F
   public final val TITLE_COLOR: Color = Color(236, 236, 240, 255)
   public const val HEADER_TEXT_SIZE: Float = 9.0F

   public fun rowDividerWidth(): Float {
      return this.scaled(1.2F)
   }

   public fun scaled(value: Float): Float {
      return value * this.scale()
   }

   public fun rowTextSize(): Float {
      return this.scaled(7.0F)
   }

   public fun margin(): Float {
      return this.scaled(6.0F)
   }

   public fun scale(): Float {
      return سر.INSTANCE.hudScale()
   }

   public fun rowLeadingSize(textSize: Float): Float {
      return textSize + this.scaled(1.0F)
   }

   public fun headerTextSize(): Float {
      return this.scaled(9.0F)
   }

   public fun rowLeadingGap(): Float {
      return this.scaled(6.0F)
   }
}
