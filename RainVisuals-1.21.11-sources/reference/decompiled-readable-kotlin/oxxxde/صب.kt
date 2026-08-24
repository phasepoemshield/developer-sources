package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.SliderSetting

// $VF: Compiled from heavy
public object صب : Module("ScoreBoard", RENDER, "Настройки скорборда") {
   @JvmStatic
   private BooleanSetting noNumber = Module.boolean$default(صب.INSTANCE, "Убрать числа", true, null, 4, null);
   @JvmStatic
   private SliderSetting scoreboardScale = Module.slider$default(صب.INSTANCE, "Размер", 1.0F, 0.1F, 3.0F, 0.01F, null, 32, null);
   @JvmStatic
   private BooleanSetting noScoreboard = Module.boolean$default(صب.INSTANCE, "Убрать скорборд", false, null, 4, null);

   public final val scoreboardScale: طُ

   public final val noScoreboard: خذ

   public final val noNumber: خذ
}
