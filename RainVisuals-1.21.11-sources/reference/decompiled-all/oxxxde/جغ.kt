package oxxxde

// $VF: Compiled from heavy
private data class جغ(icon: String, text: String, value: String) {
   public final val text: String
   public final val value: String
   public final val icon: String

   public operator fun component1(): String {
      return this.icon
   }

   public override fun hashCode(): Int {
      return (this.icon.hashCode() * 31 + this.text.hashCode()) * 31 + this.value.hashCode()
   }

   public operator fun component2(): String {
      return this.text
   }

   public override fun toString(): String {
      return "AvatarPopupRow(icon=${this.icon}, text=${this.text}, value=${this.value})"
   }

   public operator fun component3(): String {
      return this.value
   }

   init {
      this.icon = icon
      this.text = text
      this.value = value
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is جغ && this.icon == (other as جغ).icon && this.text == (other as جغ).text && this.value == (other as جغ).value
      }
   }

   public fun copy(icon: String = this.icon, text: String = this.text, value: String = this.value): جغ {
      return جغ(icon, text, value)
   }
}
