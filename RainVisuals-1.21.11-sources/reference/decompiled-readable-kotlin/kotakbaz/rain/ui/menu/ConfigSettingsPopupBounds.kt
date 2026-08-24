package kotakbaz.rain.ui.menu

import oxxxde.بل

// $VF: Compiled from heavy
private data class ConfigSettingsPopupBounds(left: Float, top: Float, width: Float, height: Float) {
   public final val height: Float
   public final val left: Float
   public final val top: Float
   public final val width: Float

   public fun copy(left: Float = ..., top: Float = ..., width: Float = ..., height: Float = ...): بل {
      return ConfigSettingsPopupBounds(left, top, width, height)
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

   public operator fun component1(): Float {
      return this.left
   }

   public operator fun component3(): Float {
      return this.width
   }

   public operator fun component4(): Float {
      return this.height
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is ConfigSettingsPopupBounds
            && java.lang.Float.compare(this.left, (other as ConfigSettingsPopupBounds).left) == 0
            && java.lang.Float.compare(this.top, (other as ConfigSettingsPopupBounds).top) == 0
            && java.lang.Float.compare(this.width, (other as ConfigSettingsPopupBounds).width) == 0
            && java.lang.Float.compare(this.height, (other as ConfigSettingsPopupBounds).height) == 0
         }
   }

   public operator fun component2(): Float {
      return this.top
   }

   public fun contains(mouseX: Float, mouseY: Float): Boolean {
      return mouseX >= this.left && mouseX <= this.left + this.width && mouseY >= this.top && mouseY <= this.top + this.height
   }

   public override fun toString(): String {
      return "ConfigSettingsPopupBounds(left=${this.left}, top=${this.top}, width=${this.width}, height=${this.height})"
   }
}
