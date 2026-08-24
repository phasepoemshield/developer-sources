package kotakbaz.rain.module.setting

import oxxxde.ظٍ

// $VF: Compiled from heavy
public class ModSetting(name: String, modes: List<String>, initialIndex: Int = 0, configKey: String = name) : ModeSetting(name, modes, initialIndex, configKey) {
   public open fun setVisible(condition: () -> Boolean): ظٍ {
      super.setVisible(condition)
      return this
   }
}
