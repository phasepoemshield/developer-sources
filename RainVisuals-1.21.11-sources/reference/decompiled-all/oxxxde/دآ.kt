package oxxxde

// $VF: Compiled from heavy
public data class دآ(x: Float, y: Float) {
   public final val x: Float
   public final val y: Float

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)
   }

   public operator fun component2(): Float {
      return this.y
   }

   public override fun toString(): String {
      return "Pos(x=${this.x}, y=${this.y})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is دآ && java.lang.Float.compare(this.x, (other as دآ).x) == 0 && java.lang.Float.compare(this.y, (other as دآ).y) == 0
      }
   }

   public operator fun component1(): Float {
      return this.x
   }

   init {
      this.x = x
      this.y = y
   }

   public fun copy(x: Float = this.x, y: Float = this.y): دآ {
      return دآ(x, y)
   }
}
