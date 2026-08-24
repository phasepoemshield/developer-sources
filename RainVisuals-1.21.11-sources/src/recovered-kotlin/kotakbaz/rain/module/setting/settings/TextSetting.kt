package kotakbaz.rain.module.setting.settings

import kotakbaz.rain.module.setting.Setting
import oxxxde.عت

// $VF: Compiled from heavy
public class TextSetting(name: String, initialValue: String = "", maxLength: Int = 20, configKey: String = name) : Setting(name, initialValue, configKey) {
   private final var validator: (String) -> Boolean
   public final var maxLength: Int

   public fun setMaxLength(maxLength: Int): عت {
      this.maxLength = RangesKt.coerceAtLeast(maxLength, 0)
      return this
   }

   public fun normalize(text: String): String {
      return StringsKt.take(text, RangesKt.coerceAtLeast(this.maxLength, 0))
   }

   public fun setText(text: String) {
      val normalized: java.lang.String = this.normalize(text)
      if (this.accepts(normalized)) {
         this.set(normalized)
      }
   }

   public open fun setVisible(condition: () -> Boolean): عت {
      super.setVisible(condition)
      return this
   }

   init {
      this.maxLength = maxLength
      this.validator = { it: java.lang.String ->
         true
      }
   }

   public fun setValidator(validator: (String) -> Boolean): عت {
      this.validator = validator
      return this
   }

   public fun accepts(text: String): Boolean {
      return this.validator(text)
   }
}
