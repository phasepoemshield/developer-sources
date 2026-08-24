package kotakbaz.rain.module.modules.hud.container

import oxxxde.دغ
import oxxxde.صه

// $VF: Compiled from heavy
public data class `Data$First`(text: String, leading: دغ? = ...) {
   public final val text: String
   private Data$Leading leading;

   public final val leading: دغ?

   public override fun toString(): String {
      return "First(text=${this.text}, leading=${this.leading})"
   }

   public operator fun component1(): String {
      return this.text
   }

   public fun copy(text: String = ..., leading: دغ? = ...): صه {
      return Data$First(text, leading)
   }

   init {
      super()
      this.text = text
      this.leading = leading
   }

   public operator fun component2(): دغ? {
      return this.leading
   }

   public override fun hashCode(): Int {
      return this.text.hashCode() * 31 + (if (this.leading == null) 0 else this.leading.hashCode())
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is Data$First && this.text == (other as Data$First).text && this.leading == (other as Data$First).leading
      }
   }
}
