package oxxxde

// $VF: Compiled from heavy
public class ظٍ(name: String, modes: List<String>, initialIndex: Int = 0, configKey: String = name) : ظي(name, modes, initialIndex, configKey) {
   public open fun setVisible(condition: () -> Boolean): ظٍ {
      super.setVisible(condition)
      return this
   }
}
