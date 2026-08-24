package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting

// $VF: Compiled from heavy
public object شص : Module("NoFluid", RENDER, "Убирает размытие под жидкостями") {
   @JvmStatic
   private BooleanSetting lava = Module.boolean$default(شص.INSTANCE, "Под лавой", true, null, 4, null);
   @JvmStatic
   private BooleanSetting water = Module.boolean$default(INSTANCE, "Под водой", true, null, 4, null);

   public fun shouldClearWaterFog(): Boolean {
      return this.isEnabled() && water.getValue()
   }

   public final val lava: خذ

   public fun shouldClearLavaFog(): Boolean {
      return this.isEnabled() && lava.getValue()
   }

   public final val water: خذ

   public fun shouldClearWaterOverlay(): Boolean {
      return this.isEnabled() && water.getValue()
   }
}
