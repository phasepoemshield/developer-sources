package oxxxde

// $VF: Compiled from heavy
public data class طظ(text: String) : دغ {
   public final val text: String

   public operator fun component1(): String {
      return this.text
   }

   public fun copy(text: String = this.text): طظ {
      return طظ(text)
   }

   public override fun toString(): String {
      return "Glyph(text=${this.text})"
   }

   init {
      this.text = text
   }

   public override fun hashCode(): Int {
      return this.text.hashCode()
   }

   public override operator fun equals(other: Any?): Boolean {
      label22@
      if (this === other) {
         return true
      } else {
         return other is طظ && this.text == (other as طظ).text
      }
   }
}
