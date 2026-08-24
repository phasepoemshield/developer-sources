package oxxxde

import java.awt.Color

// $VF: Compiled from heavy
public class رت(name: String, initialValue: Color = Color.WHITE, configKey: String = name) : رف(name, initialValue, configKey) {
   public open fun setVisible(condition: () -> Boolean): رت {
      super.setVisible(condition)
      return this
   }

   public fun setColor(color: Color) {
      this.set(color)
   }
}
