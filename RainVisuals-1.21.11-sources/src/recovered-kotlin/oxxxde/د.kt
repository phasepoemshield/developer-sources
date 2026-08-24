package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.TextSetting

// $VF: Compiled from heavy
public object د : Module("NameProtect", PLAYER, "Визуальная смена никнейма") {
   @JvmStatic
   private TextSetting protectedText = Module.text$default(INSTANCE, "Текст", "rainvisuals.pro", 16, null, 8, null);

   public fun protectString(value: String): String {
      if (this.isEnabled() && value.length() != 0) {
         val var10000: java.lang.String = ضك.getMc().getSession().getUsername()
         return if (var10000.length() != 0 && StringsKt.indexOf$default(value, var10000, 0, true, 2, null) >= 0)
            StringsKt.replace(value, var10000, protectedText.getValue(), true)
            else
            value
         } else {
         return value
      }
   }
}
