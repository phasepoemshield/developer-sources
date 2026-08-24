package kotakbaz.rain.ui.menu

import oxxxde.شذ

// $VF: Compiled from heavy
private data class `PointsCategoryComponent$PanelArea`(left: Float, top: Float, width: Float, height: Float) {
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
         return other is PointsCategoryComponent$PanelArea
            && java.lang.Float.compare(this.left, (other as PointsCategoryComponent$PanelArea).left) == 0
            && java.lang.Float.compare(this.top, (other as PointsCategoryComponent$PanelArea).top) == 0
            && java.lang.Float.compare(this.width, (other as PointsCategoryComponent$PanelArea).width) == 0
            && java.lang.Float.compare(this.height, (other as PointsCategoryComponent$PanelArea).height) == 0
         }
   }

   public operator fun component3(): Float {
      return this.width
   }

   public override fun toString(): String {
      return "PanelArea(left=${this.left}, top=${this.top}, width=${this.width}, height=${this.height})"
   }

   public fun copy(left: Float = ..., top: Float = ..., width: Float = ..., height: Float = ...): شذ {
      return PointsCategoryComponent$PanelArea(left, top, width, height)
   }

   public operator fun component2(): Float {
      return this.top
   }

   public operator fun component1(): Float {
      return this.left
   }
}
