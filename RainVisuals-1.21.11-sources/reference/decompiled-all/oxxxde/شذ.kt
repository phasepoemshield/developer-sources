package oxxxde

// $VF: Compiled from heavy
private data class شذ(left: Float, top: Float, width: Float, height: Float) {
   public final val top: Float
   public final val height: Float
   public final val left: Float
   public final val width: Float

   public operator fun component4(): Float {
      return this.height
   }

   init {
      this.left = left
      this.top = top
      this.width = width
      this.height = height
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.left) * 31 + java.lang.Float.hashCode(this.top)) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height)
      }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is شذ
            && java.lang.Float.compare(this.left, (other as شذ).left) == 0
            && java.lang.Float.compare(this.top, (other as شذ).top) == 0
            && java.lang.Float.compare(this.width, (other as شذ).width) == 0
            && java.lang.Float.compare(this.height, (other as شذ).height) == 0
         }
   }

   public operator fun component3(): Float {
      return this.width
   }

   public override fun toString(): String {
      return "PanelArea(left=${this.left}, top=${this.top}, width=${this.width}, height=${this.height})"
   }

   public fun copy(left: Float = this.left, top: Float = this.top, width: Float = this.width, height: Float = this.height): شذ {
      return شذ(left, top, width, height)
   }

   public operator fun component2(): Float {
      return this.top
   }

   public operator fun component1(): Float {
      return this.left
   }
}
