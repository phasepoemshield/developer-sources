package kotakbaz.rain.ui.inventory

import oxxxde.ظآ

// $VF: Compiled from heavy
internal data class UiRect(x: Float, y: Float, width: Float, height: Float) {
   public final val height: Float
   public final val y: Float
   public final val width: Float
   public final val x: Float

   public operator fun component4(): Float {
      return this.height
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is UiRect
            && java.lang.Float.compare(this.x, (other as UiRect).x) == 0
            && java.lang.Float.compare(this.y, (other as UiRect).y) == 0
            && java.lang.Float.compare(this.width, (other as UiRect).width) == 0
            && java.lang.Float.compare(this.height, (other as UiRect).height) == 0
         }
   }

   public operator fun component2(): Float {
      return this.y
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height)
      }

   public override fun toString(): String {
      return "UiRect(x=${this.x}, y=${this.y}, width=${this.width}, height=${this.height})"
   }

   public fun copy(x: Float = ..., y: Float = ..., width: Float = ..., height: Float = ...): ظآ {
      return UiRect(x, y, width, height)
   }

   public fun contains(pointX: Float, pointY: Float): Boolean {
      return pointX <= this.x + this.width && this.x <= pointX && pointY <= this.y + this.height && this.y <= pointY
   }

   init {
      this.x = x
      this.y = y
      this.width = width
      this.height = height
   }

   public operator fun component3(): Float {
      return this.width
   }

   public operator fun component1(): Float {
      return this.x
   }
}
