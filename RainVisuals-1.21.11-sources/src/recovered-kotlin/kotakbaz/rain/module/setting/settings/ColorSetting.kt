package kotakbaz.rain.module.setting.settings

import java.awt.Color
import kotakbaz.rain.module.setting.Setting
import oxxxde.رت

// $VF: Compiled from heavy
public class ColorSetting(name: String, initialValue: Color = Color.WHITE, configKey: String = name) : Setting(name, initialValue, configKey) {
   public open fun setVisible(condition: () -> Boolean): رت {
      super.setVisible(condition)
      return this
   }

   public fun setColor(color: Color) {
      this.set(color)
   }
}
