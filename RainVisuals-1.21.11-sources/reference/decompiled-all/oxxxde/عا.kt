package oxxxde

// $VF: Compiled from heavy
private data class عا(x: Float, y: Float, width: Float, height: Float) {
   public final val y: Float
   public final val height: Float
   public final val width: Float
   public final val x: Float

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is عا
            && java.lang.Float.compare(this.x, (other as عا).x) == 0
            && java.lang.Float.compare(this.y, (other as عا).y) == 0
            && java.lang.Float.compare(this.width, (other as عا).width) == 0
            && java.lang.Float.compare(this.height, (other as عا).height) == 0
         }
   }

   public fun copy(x: Float = this.x, y: Float = this.y, width: Float = this.width, height: Float = this.height): عا {
      return عا(x, y, width, height)
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height)
      }

   init {
      this.x = x
      this.y = y
      this.width = width
      this.height = height
   }

   public operator fun component2(): Float {
      return this.y
   }

   public operator fun component4(): Float {
      return this.height
   }

   public operator fun component1(): Float {
      return this.x
   }

   public operator fun component3(): Float {
      return this.width
   }

   public override fun toString(): String {
      return "DesignRect(x=${this.x}, y=${this.y}, width=${this.width}, height=${this.height})"
   }
}
