package kotakbaz.rain.module.setting.settings

import kotakbaz.rain.module.setting.Setting
import oxxxde.ذُ

// $VF: Compiled from heavy
public class BindSetting(name: String, initialValue: Int = -1, configKey: String = name) : Setting(name, initialValue, configKey) {
   public fun clear() {
      this.set(-1)
   }

   public open fun setVisible(condition: () -> Boolean): ذُ {
      super.setVisible(condition)
      return this
   }

   public fun setKey(key: Int) {
      this.set(key)
   }

   public fun hasBind(): Boolean {
      return this.getValue().intValue() != -1
   }
}
