package oxxxde

// $VF: Compiled from heavy
public data class صه {
   public final val text: String
   public final val leading: دغ?

   fun getLeading(): دغ? {
      this.leading
   }

   public override fun toString(): String {
      return "First(text=${this.text}, leading=${this.leading})"
   }

   public operator fun component1(): String {
      return this.text
   }

   public fun copy(text: String = this.text, leading: دغ? = this.leading): صه {
      return صه(text, leading)
   }

   fun صه(text: java.lang.String, leading: دغ?) {
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
         return other is صه && this.text == (other as صه).text && this.leading == (other as صه).leading
      }
   }
}
