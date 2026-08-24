package oxxxde

// $VF: Compiled from heavy
private data class طآ(x: Float, y: Float, width: Float, height: Float) {
   public final val height: Float
   public final val x: Float
   public final val y: Float
   public final val width: Float

   public fun contains(px: Float, py: Float): Boolean {
      return this.width > 0.0F && this.height > 0.0F && px >= this.x && px <= this.x + this.width && py >= this.y && py <= this.y + this.height
   }

   public operator fun component3(): Float {
      return this.width
   }

   public fun copy(x: Float = this.x, y: Float = this.y, width: Float = this.width, height: Float = this.height): طآ {
      return طآ(x, y, width, height)
   }

   public override fun toString(): String {
      return "PopupRect(x=${this.x}, y=${this.y}, width=${this.width}, height=${this.height})"
   }

   public operator fun component1(): Float {
      return this.x
   }

   public operator fun component2(): Float {
      return this.y
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

   public operator fun component4(): Float {
      return this.height
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is طآ
            && java.lang.Float.compare(this.x, (other as طآ).x) == 0
            && java.lang.Float.compare(this.y, (other as طآ).y) == 0
            && java.lang.Float.compare(this.width, (other as طآ).width) == 0
            && java.lang.Float.compare(this.height, (other as طآ).height) == 0
         }
   }
}
