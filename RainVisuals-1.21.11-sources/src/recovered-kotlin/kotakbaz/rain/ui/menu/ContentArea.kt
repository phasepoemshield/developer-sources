package kotakbaz.rain.ui.menu

import oxxxde.شخ

// $VF: Compiled from heavy
private data class ContentArea(left: Float, top: Float, width: Float, height: Float) {
   public final val height: Float
   public final val width: Float
   public final val left: Float
   public final val top: Float

   public operator fun component3(): Float {
      return this.width
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.left) * 31 + java.lang.Float.hashCode(this.top)) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height)
      }

   init {
      this.left = left
      this.top = top
      this.width = width
      this.height = height
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is ContentArea
            && java.lang.Float.compare(this.left, (other as ContentArea).left) == 0
            && java.lang.Float.compare(this.top, (other as ContentArea).top) == 0
            && java.lang.Float.compare(this.width, (other as ContentArea).width) == 0
            && java.lang.Float.compare(this.height, (other as ContentArea).height) == 0
         }
   }

   public override fun toString(): String {
      return "ContentArea(left=${this.left}, top=${this.top}, width=${this.width}, height=${this.height})"
   }

   public operator fun component4(): Float {
      return this.height
   }

   public fun copy(left: Float = ..., top: Float = ..., width: Float = ..., height: Float = ...): شخ {
      return ContentArea(left, top, width, height)
   }

   public operator fun component1(): Float {
      return this.left
   }

   public operator fun component2(): Float {
      return this.top
   }
}
