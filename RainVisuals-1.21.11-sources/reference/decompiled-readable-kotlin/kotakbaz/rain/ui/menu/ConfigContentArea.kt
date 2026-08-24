package kotakbaz.rain.ui.menu

import oxxxde.ذأ

// $VF: Compiled from heavy
private data class ConfigContentArea(left: Float, top: Float, width: Float, height: Float) {
   public final val width: Float
   public final val height: Float
   public final val top: Float
   public final val left: Float

   public operator fun component2(): Float {
      return this.top
   }

   public fun copy(left: Float = ..., top: Float = ..., width: Float = ..., height: Float = ...): ذأ {
      return ConfigContentArea(left, top, width, height)
   }

   public override fun toString(): String {
      return "ConfigContentArea(left=${this.left}, top=${this.top}, width=${this.width}, height=${this.height})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is ConfigContentArea
            && java.lang.Float.compare(this.left, (other as ConfigContentArea).left) == 0
            && java.lang.Float.compare(this.top, (other as ConfigContentArea).top) == 0
            && java.lang.Float.compare(this.width, (other as ConfigContentArea).width) == 0
            && java.lang.Float.compare(this.height, (other as ConfigContentArea).height) == 0
         }
   }

   public operator fun component4(): Float {
      return this.height
   }

   public operator fun component3(): Float {
      return this.width
   }

   public operator fun component1(): Float {
      return this.left
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

   public fun contains(mouseX: Float, mouseY: Float): Boolean {
      return mouseX >= this.left && mouseX <= this.left + this.width && mouseY >= this.top && mouseY <= this.top + this.height
   }
}
