package kotakbaz.rain.module.modules.hud.container

import java.awt.Color
import oxxxde.تِ
import oxxxde.طغ

// $VF: Compiled from heavy
public data class `Data$Second`(text: String, color: Color = طغ.INSTANCE.VALUE_COLOR) {
   public final val text: String
   public final val color: Color

   public override fun toString(): String {
      return "Second(text=${this.text}, color=${this.color})"
   }

   init {
      this.text = text
      this.color = color
   }

   public operator fun component1(): String {
      return this.text
   }

   public override fun hashCode(): Int {
      return this.text.hashCode() * 31 + this.color.hashCode()
   }

   public fun copy(text: String = ..., color: Color = ...): تِ {
      return Data$Second(text, color)
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is Data$Second && this.text == (other as Data$Second).text && this.color == (other as Data$Second).color
      }
   }

   public operator fun component2(): Color {
      return this.color
   }
}
