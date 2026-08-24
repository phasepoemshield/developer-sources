package kotakbaz.rain.ui.mainmenu.changelog

import oxxxde.دا

// $VF: Compiled from heavy
public data class ChangeLogItem(type: String, text: String) {
   public final val text: String
   public final val type: String

   public operator fun component2(): String {
      return this.text
   }

   init {
      this.type = type
      this.text = text
   }

   public operator fun component1(): String {
      return this.type
   }

   public override fun hashCode(): Int {
      return this.type.hashCode() * 31 + this.text.hashCode()
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is ChangeLogItem && this.type == (other as ChangeLogItem).type && this.text == (other as ChangeLogItem).text
      }
   }

   public override fun toString(): String {
      return "ChangeLogItem(type=${this.type}, text=${this.text})"
   }

   public fun copy(type: String = ..., text: String = ...): دا {
      return ChangeLogItem(type, text)
   }
}
