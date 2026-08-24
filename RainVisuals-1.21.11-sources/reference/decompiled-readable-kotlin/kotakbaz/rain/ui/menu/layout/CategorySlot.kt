package kotakbaz.rain.ui.menu.layout

import oxxxde.طس

// $VF: Compiled from heavy
public data class CategorySlot(x: Float, y: Float, size: Float) {
   public final val y: Float
   public final val size: Float
   public final val x: Float

   public fun copy(x: Float = ..., y: Float = ..., size: Float = ...): طس {
      return CategorySlot(x, y, size)
   }

   public operator fun component2(): Float {
      return this.y
   }

   public operator fun component1(): Float {
      return this.x
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is CategorySlot
            && java.lang.Float.compare(this.x, (other as CategorySlot).x) == 0
            && java.lang.Float.compare(this.y, (other as CategorySlot).y) == 0
            && java.lang.Float.compare(this.size, (other as CategorySlot).size) == 0
         }
   }

   public override fun hashCode(): Int {
      return (java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)) * 31 + java.lang.Float.hashCode(this.size)
   }

   public operator fun component3(): Float {
      return this.size
   }

   public override fun toString(): String {
      return "CategorySlot(x=${this.x}, y=${this.y}, size=${this.size})"
   }

   init {
      this.x = x
      this.y = y
      this.size = size
   }
}
