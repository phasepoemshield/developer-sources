package oxxxde

import java.awt.Color
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.ColorSetting

// $VF: Compiled from heavy
public object ظث : Module("ClientColor", RENDER, "Настройка цветов для всех модулей") {
   @JvmStatic
   private ColorSetting clientColor;

   public fun getClientColor(): Color {
      return clientColor.getValue()
   }

   @JvmStatic
   fun {
      val var10000: Module = INSTANCE
      val var10002: Color = Color.WHITE
      clientColor = Module.color$default(var10000, "Цвет клиента", var10002, null, 4, null)
   }
}
