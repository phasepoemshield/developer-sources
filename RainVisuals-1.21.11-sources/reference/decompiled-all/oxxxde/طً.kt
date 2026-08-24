package oxxxde

// $VF: Compiled from heavy
private data class طً(x: Float, y: Float, width: Float, height: Float) {
   public final val y: Float
   public final val width: Float
   public final val height: Float
   public final val x: Float

   public override fun toString(): String {
      return "Rect(x=${this.x}, y=${this.y}, width=${this.width}, height=${this.height})"
   }

   public operator fun component4(): Float {
      return this.height
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height)
      }

   public operator fun component1(): Float {
      return this.x
   }

   init {
      this.x = x
      this.y = y
      this.width = width
      this.height = height
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is طً
            && java.lang.Float.compare(this.x, (other as طً).x) == 0
            && java.lang.Float.compare(this.y, (other as طً).y) == 0
            && java.lang.Float.compare(this.width, (other as طً).width) == 0
            && java.lang.Float.compare(this.height, (other as طً).height) == 0
         }
   }

   public operator fun component2(): Float {
      return this.y
   }

   public fun copy(x: Float = this.x, y: Float = this.y, width: Float = this.width, height: Float = this.height): طً {
      return طً(x, y, width, height)
   }

   public operator fun component3(): Float {
      return this.width
   }
}
