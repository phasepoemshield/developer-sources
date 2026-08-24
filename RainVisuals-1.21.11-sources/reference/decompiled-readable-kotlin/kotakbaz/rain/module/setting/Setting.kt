package kotakbaz.rain.module.setting

import kotakbaz.rain.Rain
import oxxxde.رف

// $VF: Compiled from Setting.kt
public abstract class Setting<T> {
   public final var value: Any
      private set

   private final var visibility: () -> Boolean
   public final val name: String
   public final val configKey: String

   public fun isVisible(): Boolean {
      return this.visibility()
   }

   open fun Setting(name: java.lang.String, initialValue: T, configKey: java.lang.String) {
      super()
      this.name = name
      this.configKey = configKey
      if (StringsKt.isBlank(this.configKey)) {
         throw IllegalArgumentException("configKey cannot be blank".toString())
      } else {
         this.visibility = { 
            true
         }
         this.value = (T)initialValue
      }
   }

   public open fun setVisible(condition: () -> Boolean): رف<Any> {
      this.visibility = condition
      return this
   }

   public open fun addVisibleCondition(condition: () -> Boolean): رف<Any> {
      this.visibility = { 
         `$previous`() && `$condition`()
      }
      return this
   }

   protected open fun onChange(value: Any) {
   }

   public fun set(value: Any) {
      if (!(this.value == value)) {
         this.value = (T)value
         this.onChange((T)value)
         Rain.INSTANCE.requestSave()
      }
   }
}
