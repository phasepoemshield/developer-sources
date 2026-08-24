package kotakbaz.rain.ui.mainmenu

import kotakbaz.rain.client.util.render.font.Font
import oxxxde.تض
import oxxxde.جً
import oxxxde.عا

// $VF: Compiled from heavy
private data class `RainMainMenuScreen$ButtonDef`(rect: عا, text: String, icon: String, font: جً, action: () -> Unit) {
   public final val text: String
   private RainMainMenuScreen$DesignRect rect;
   public final val icon: String
   private Font font;
   public final val action: () -> Unit

   public fun copy(rect: عا = ..., text: String = ..., icon: String = ..., font: جً = ..., action: () -> Unit = ...): تض {
      return RainMainMenuScreen$ButtonDef(rect, text, icon, font, action)
   }

   public operator fun component2(): String {
      return this.text
   }

   public operator fun component3(): String {
      return this.icon
   }

   public operator fun component5(): () -> Unit {
      return this.action
   }

   init {
      this.rect = rect
      this.text = text
      this.icon = icon
      this.font = font
      this.action = action
   }

   public final val font: جً

   public final val rect: عا

   public operator fun component4(): جً {
      return this.font
   }

   public override fun toString(): String {
      return "ButtonDef(rect=${this.rect}, text=${this.text}, icon=${this.icon}, font=${this.font}, action=${this.action})"
   }

   public operator fun component1(): عا {
      return this.rect
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is RainMainMenuScreen$ButtonDef
            && this.rect == (other as RainMainMenuScreen$ButtonDef).rect
            && this.text == (other as RainMainMenuScreen$ButtonDef).text
            && this.icon == (other as RainMainMenuScreen$ButtonDef).icon
            && this.font == (other as RainMainMenuScreen$ButtonDef).font
            && this.action == (other as RainMainMenuScreen$ButtonDef).action
         }
   }

   public override fun hashCode(): Int {
      return (((this.rect.hashCode() * 31 + this.text.hashCode()) * 31 + this.icon.hashCode()) * 31 + this.font.hashCode()) * 31 + this.action.hashCode()
   }
}
