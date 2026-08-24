package oxxxde

// $VF: Compiled from heavy
public data class ذإ(text: String, alpha: Float, offsetY: Float) {
   public final val offsetY: Float
   public final val text: String
   public final val alpha: Float

   public operator fun component2(): Float {
      return this.alpha
   }

   init {
      this.text = text
      this.alpha = alpha
      this.offsetY = offsetY
   }

   public operator fun component3(): Float {
      return this.offsetY
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is ذإ
            && this.text == (other as ذإ).text
            && java.lang.Float.compare(this.alpha, (other as ذإ).alpha) == 0
            && java.lang.Float.compare(this.offsetY, (other as ذإ).offsetY) == 0
         }
   }

   public override fun toString(): String {
      return "Layer(text=${this.text}, alpha=${this.alpha}, offsetY=${this.offsetY})"
   }

   public override fun hashCode(): Int {
      return (this.text.hashCode() * 31 + java.lang.Float.hashCode(this.alpha)) * 31 + java.lang.Float.hashCode(this.offsetY)
   }

   public operator fun component1(): String {
      return this.text
   }

   public fun copy(text: String = this.text, alpha: Float = this.alpha, offsetY: Float = this.offsetY): ذإ {
      return ذإ(text, alpha, offsetY)
   }
}
