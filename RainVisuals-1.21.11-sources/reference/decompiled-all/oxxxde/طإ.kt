package oxxxde

import java.awt.Color

// $VF: Compiled from heavy
public data class طإ(text: String, color: Color? = null, isAction: Boolean = false) {
   public final val isAction: Boolean
   public final val color: Color?
   public final val text: String

   public operator fun component1(): String {
      return this.text
   }

   init {
      this.text = text
      this.color = color
      this.isAction = isAction
   }

   public fun copy(text: String = this.text, color: Color? = this.color, isAction: Boolean = this.isAction): طإ {
      return طإ(text, color, isAction)
   }

   public operator fun component3(): Boolean {
      return this.isAction
   }

   public operator fun component2(): Color? {
      return this.color
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is طإ && this.text == (other as طإ).text && this.color == (other as طإ).color && this.isAction == (other as طإ).isAction
      }
   }

   public override fun toString(): String {
      return "MessageSegment(text=${this.text}, color=${this.color}, isAction=${this.isAction})"
   }

   public override fun hashCode(): Int {
      return (this.text.hashCode() * 31 + (if (this.color == null) 0 else this.color.hashCode())) * 31 + java.lang.Boolean.hashCode(this.isAction)
   }
}
