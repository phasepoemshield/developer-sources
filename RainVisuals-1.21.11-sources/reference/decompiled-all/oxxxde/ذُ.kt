package oxxxde

// $VF: Compiled from heavy
public class ذُ(name: String, initialValue: Int = -1, configKey: String = name) : رف(name, initialValue, configKey) {
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
