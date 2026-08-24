package kotakbaz.rain.module.modules.hud

import java.awt.Color
import oxxxde.طإ

// $VF: Compiled from heavy
public data class `NotifyModule$MessageSegment`(text: String, color: Color? = null, isAction: Boolean = false) {
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

   public fun copy(text: String = ..., color: Color? = ..., isAction: Boolean = ...): طإ {
      return NotifyModule$MessageSegment(text, color, isAction)
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
         return other is NotifyModule$MessageSegment
            && this.text == (other as NotifyModule$MessageSegment).text
            && this.color == (other as NotifyModule$MessageSegment).color
            && this.isAction == (other as NotifyModule$MessageSegment).isAction
         }
   }

   public override fun toString(): String {
      return "MessageSegment(text=${this.text}, color=${this.color}, isAction=${this.isAction})"
   }

   public override fun hashCode(): Int {
      return (this.text.hashCode() * 31 + (if (this.color == null) 0 else this.color.hashCode())) * 31 + java.lang.Boolean.hashCode(this.isAction)
   }
}
