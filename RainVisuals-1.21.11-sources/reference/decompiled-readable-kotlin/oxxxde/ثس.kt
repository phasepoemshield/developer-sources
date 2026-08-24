package oxxxde

import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.BindSetting
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import kotakbaz.rain.module.setting.settings.TextSetting
import kotakbaz.rain.ui.menu.settings.ModuleSettingComponent
import kotakbaz.rain.ui.menu.settings.impl.ColorSettingComponent

// $VF: Compiled from heavy
public object ثس {
   public fun create(setting: رف<*>): آ<*>? {
      return if (setting is BooleanSetting)
         ذس(setting as BooleanSetting)
         else
         (
            if (setting is SliderSetting)
               طخ(setting as SliderSetting)
               else
               (
                  if (setting is ModeSetting)
                     حق(setting as ModeSetting)
                     else
                     (
                        if (setting is TextSetting)
                           ذآ(setting as TextSetting)
                           else
                           (
                              if (setting is BindSetting)
                                 ذ(setting as BindSetting)
                                 else
                                 (ColorSettingComponent(setting as ColorSetting) as? ModuleSettingComponent)
                           )
                     )
               )
         )
      }
}
