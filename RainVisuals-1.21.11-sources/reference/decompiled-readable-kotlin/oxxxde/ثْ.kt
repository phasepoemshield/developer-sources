package oxxxde

import java.awt.Color

// $VF: Compiled from heavy
public object ثْ {
   public const val BLUR_MIX: Float = 0.95F

   public final val titleBase: Color
      public final get() {
         return طغ.INSTANCE.TITLE_COLOR
      }


   public fun icon(alpha: Float = (float)this.iconBase.getAlpha() / 255.0F): Color {
      return بح.INSTANCE.setAlpha(this.iconBase, alpha)
   }

   public final val surfaceBase: Color
      public final get() {
         return طغ.INSTANCE.HEADER_COLOR
      }


   public fun value(alpha: Float = (float)this.valueBase.getAlpha() / 255.0F): Color {
      return بح.INSTANCE.setAlpha(this.valueBase, alpha)
   }

   public fun surface(alpha: Float = ((float)this.surfaceBase.getAlpha() + 5.0F) / 255.0F): Color {
      return بح.INSTANCE.setAlpha(this.surfaceBase, alpha)
   }

   public final val iconBase: Color
      public final get() {
         return طغ.INSTANCE.ICON_COLOR
      }


   public fun panel(alpha: Float = (float)this.panelBase.getAlpha() / 255.0F): Color {
      return بح.INSTANCE.setAlpha(this.panelBase, alpha)
   }

   public final val panelBase: Color
      public final get() {
         return طغ.INSTANCE.PANEL_COLOR
      }


   public fun title(alpha: Float = (float)this.titleBase.getAlpha() / 255.0F): Color {
      return بح.INSTANCE.setAlpha(this.titleBase, alpha)
   }

   public final val valueBase: Color
      public final get() {
         return طغ.INSTANCE.VALUE_COLOR
      }

}
