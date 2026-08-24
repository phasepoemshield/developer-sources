package kotakbaz.rain.module.modules.render

import oxxxde.رْ

// $VF: Compiled from heavy
private data class `ViewModelModule$HandHitbox`(left: Double, top: Double, right: Double, bottom: Double) {
   public final val left: Double
   public final val bottom: Double
   public final val top: Double
   public final val right: Double

   public fun copy(left: Double = ..., top: Double = ..., right: Double = ..., bottom: Double = ...): رْ {
      return ViewModelModule$HandHitbox(left, top, right, bottom)
   }

   public final val centerX: Double
      public final get() {
         return (this.left + this.right) * 0.5
      }


   public operator fun component3(): Double {
      return this.right
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is ViewModelModule$HandHitbox
            && java.lang.Double.compare(this.left, (other as ViewModelModule$HandHitbox).left) == 0
            && java.lang.Double.compare(this.top, (other as ViewModelModule$HandHitbox).top) == 0
            && java.lang.Double.compare(this.right, (other as ViewModelModule$HandHitbox).right) == 0
            && java.lang.Double.compare(this.bottom, (other as ViewModelModule$HandHitbox).bottom) == 0
         }
   }

   public final val centerY: Double
      public final get() {
         return (this.top + this.bottom) * 0.5
      }


   public override fun hashCode(): Int {
      return ((java.lang.Double.hashCode(this.left) * 31 + java.lang.Double.hashCode(this.top)) * 31 + java.lang.Double.hashCode(this.right)) * 31
         + java.lang.Double.hashCode(this.bottom)
      }

   public operator fun component1(): Double {
      return this.left
   }

   public override fun toString(): String {
      return "HandHitbox(left=${this.left}, top=${this.top}, right=${this.right}, bottom=${this.bottom})"
   }

   public operator fun component4(): Double {
      return this.bottom
   }

   public operator fun component2(): Double {
      return this.top
   }

   public fun contains(x: Double, y: Double): Boolean {
      return x <= this.right && this.left <= x && y <= this.bottom && this.top <= y
   }

   init {
      this.left = left
      this.top = top
      this.right = right
      this.bottom = bottom
   }
}
