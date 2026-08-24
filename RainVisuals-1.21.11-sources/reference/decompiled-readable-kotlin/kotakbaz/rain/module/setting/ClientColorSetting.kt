package kotakbaz.rain.module.setting

import java.awt.Color
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import oxxxde.خذ
import oxxxde.رت
import oxxxde.ظث

// $VF: Compiled from heavy
public class ClientColorSetting(useClientColorSetting: خذ, colorSetting: رت) {
   private ColorSetting colorSetting;
   private BooleanSetting useClientColorSetting;

   public fun shouldUseClientColor(): Boolean {
      return ظث.INSTANCE.isEnabled() && this.useClientColorSetting.getValue()
   }

   init {
      this.useClientColorSetting = useClientColorSetting
      this.colorSetting = colorSetting
   }

   public final val value: Color
      public final get() {
         return if (this.shouldUseClientColor()) ظث.INSTANCE.getClientColor() else this.colorSetting.getValue()
      }

}
