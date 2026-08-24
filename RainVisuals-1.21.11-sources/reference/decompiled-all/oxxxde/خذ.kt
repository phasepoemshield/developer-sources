package oxxxde

import java.util.ArrayList
import kotlin.jvm.functions.Function1

// $VF: Compiled from heavy
public class خذ(name: String, initialValue: Boolean = false, configKey: String = name) : رف(name, initialValue, configKey) {
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
