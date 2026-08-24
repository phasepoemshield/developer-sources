package oxxxde

import java.awt.Color
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public object بؤ : Module("CustomFog", RENDER, "Настройка цвета и дальности тумана") {
   @JvmStatic
   private SliderSetting fogDistance = Module.slider$default(بؤ.INSTANCE, "Дистанция", -8.0F, -8.0F, 25.0F, 1.0F, null, 32, null);
   @JvmStatic
   private ColorSetting fogColor;
   @JvmStatic
   private SliderSetting fogDensity = Module.slider$default(بؤ.INSTANCE, "Плотность", 100.0F, 0.0F, 100.0F, 1.0F, null, 32, null);
   @JvmStatic
   private BooleanSetting useClientColor = Module.boolean$default(بؤ.INSTANCE, "Цвет клиента", false, null, 4, null).setVisible({ 
      ظث.INSTANCE.isEnabled()
   });

   public final val fogDensity: طُ

   public fun resolvedFogColor(): Color {
      return if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else fogColor.getValue()
   }

   public final val fogDistance: طُ

   public final val fogColor: رت

   @JvmStatic
   fun {
      val var10000: Module = INSTANCE
      val var10002: Color = Color.WHITE
      fogColor = Module.color$default(var10000, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
      })
   }

   public fun useCustomFog(): Boolean {
      return this.isEnabled()
   }

   public fun fogSkyArgb(original: Int): Int {
      return if (!this.useCustomFog()) original else this.resolvedFogColor().getRGB()
   }
}
