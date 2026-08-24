package oxxxde

// $VF: Compiled from heavy
private data class تض {
   public final val text: String
   public final val rect: عا
   public final val icon: String
   public final val font: جً
   public final val action: () -> Unit

   public fun copy(rect: عا = this.rect, text: String = this.text, icon: String = this.icon, font: جً = this.font, action: () -> Unit = this.action): تض {
      return تض(rect, text, icon, font, action)
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

   fun تض(font: عا, action: java.lang.String, icon: java.lang.String, text: جً, rect: () -> Unit) {
      this.rect = rect
      this.text = text
      this.icon = icon
      this.font = font
      this.action = action
   }

   fun getFont(): جً {
      this.font
   }

   fun getRect(): عا {
      this.rect
   }

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
         return other is تض
            && this.rect == (other as تض).rect
            && this.text == (other as تض).text
            && this.icon == (other as تض).icon
            && this.font == (other as تض).font
            && this.action == (other as تض).action
         }
   }

   public override fun hashCode(): Int {
      return (((this.rect.hashCode() * 31 + this.text.hashCode()) * 31 + this.icon.hashCode()) * 31 + this.font.hashCode()) * 31 + this.action.hashCode()
   }
}
