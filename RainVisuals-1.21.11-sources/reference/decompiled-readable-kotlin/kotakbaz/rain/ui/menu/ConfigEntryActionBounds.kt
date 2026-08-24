package kotakbaz.rain.ui.menu

import oxxxde.زص

// $VF: Compiled from heavy
public data class ConfigEntryActionBounds(left: Float, top: Float, width: Float, height: Float) {
   public final val left: Float
   public final val width: Float
   public final val height: Float
   public final val top: Float

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is ConfigEntryActionBounds
            && java.lang.Float.compare(this.left, (other as ConfigEntryActionBounds).left) == 0
            && java.lang.Float.compare(this.top, (other as ConfigEntryActionBounds).top) == 0
            && java.lang.Float.compare(this.width, (other as ConfigEntryActionBounds).width) == 0
            && java.lang.Float.compare(this.height, (other as ConfigEntryActionBounds).height) == 0
         }
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.left) * 31 + java.lang.Float.hashCode(this.top)) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height)
      }

   public operator fun component1(): Float {
      return this.left
   }

   public override fun toString(): String {
      return "ConfigEntryActionBounds(left=${this.left}, top=${this.top}, width=${this.width}, height=${this.height})"
   }

   init {
      this.left = left
      this.top = top
      this.width = width
      this.height = height
   }

   public operator fun component4(): Float {
      return this.height
   }

   public final val right: Float
      public final get() {
         return this.left + this.width
      }


   public fun contains(mouseX: Float, mouseY: Float): Boolean {
      return mouseX >= this.left && mouseX <= this.right && mouseY >= this.top && mouseY <= this.top + this.height
   }

   public operator fun component3(): Float {
      return this.width
   }

   public fun copy(left: Float = ..., top: Float = ..., width: Float = ..., height: Float = ...): زص {
      return ConfigEntryActionBounds(left, top, width, height)
   }

   public operator fun component2(): Float {
      return this.top
   }
}
