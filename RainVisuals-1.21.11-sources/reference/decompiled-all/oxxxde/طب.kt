package oxxxde

import java.awt.Color

// $VF: Compiled from heavy
public class طب {
   private final val colorSetting: رت
   private final val useClientColorSetting: خذ

   public fun shouldUseClientColor(): Boolean {
      return ظث.INSTANCE.isEnabled() && this.useClientColorSetting.getValue()
   }

   fun طب(colorSetting: خذ, useClientColorSetting: رت) {
      this.useClientColorSetting = useClientColorSetting
      this.colorSetting = colorSetting
   }

   public final val value: Color
      public final get() {
         return if (this.shouldUseClientColor()) ظث.INSTANCE.getClientColor() else this.colorSetting.getValue()
      }

}
