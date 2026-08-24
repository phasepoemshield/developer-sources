package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting

// $VF: Compiled from heavy
public object رع : Module("SaturationHud", HUD, "Показывает запас насыщения над полосой еды") {
   @JvmStatic
   private BooleanSetting showEmpty = رع.INSTANCE.boolean("Отображать пустоту", true, "showEmpty");

   public fun shouldRenderEmptySlots(): Boolean {
      return showEmpty.getValue()
   }
}
