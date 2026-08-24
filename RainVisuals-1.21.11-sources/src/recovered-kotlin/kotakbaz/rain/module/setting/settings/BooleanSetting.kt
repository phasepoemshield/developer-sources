package kotakbaz.rain.module.setting.settings

import java.util.ArrayList
import kotakbaz.rain.module.setting.Setting
import kotlin.jvm.functions.Function1
import oxxxde.خذ

// $VF: Compiled from heavy
public class BooleanSetting(name: String, initialValue: Boolean = false, configKey: String = name) : Setting(name, initialValue, configKey) {
   private final val listeners: ArrayList<(Boolean) -> Unit> = ArrayList()

   public fun onChange(listener: (Boolean) -> Unit): خذ {
      this.listeners.add(listener)
      return this
   }

   protected open fun onChange(value: Boolean) {
      for (`element$iv` in this.listeners) {
         (`element$iv` as Function1)(value)
      }
   }

   public open fun setVisible(condition: () -> Boolean): خذ {
      super.setVisible(condition)
      return this
   }

   public fun toggle() {
      this.set(!this.getValue())
   }
}
