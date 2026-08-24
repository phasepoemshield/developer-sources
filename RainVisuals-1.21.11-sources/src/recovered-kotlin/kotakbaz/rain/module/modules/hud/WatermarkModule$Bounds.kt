package kotakbaz.rain.module.modules.hud

import oxxxde.ط

// $VF: Compiled from heavy
public data class `WatermarkModule$Bounds`(x: Float, y: Float, width: Float, height: Float) {
   public final var width: Float
   public final var x: Float
   public final var height: Float
   public final var y: Float

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)) * 31 + java.lang.Float.hashCode(this.width)) * 31
         + java.lang.Float.hashCode(this.height)
      }

   public final val centerX: Float
      public final get() {
         return this.x + this.width / 2.0F
      }


   public operator fun component2(): Float {
      return this.y
   }

   public fun copy(x: Float = ..., y: Float = ..., width: Float = ..., height: Float = ...): ط {
      return WatermarkModule$Bounds(x, y, width, height)
   }

   public override fun toString(): String {
      return "Bounds(x=${this.x}, y=${this.y}, width=${this.width}, height=${this.height})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is WatermarkModule$Bounds
            && java.lang.Float.compare(this.x, (other as WatermarkModule$Bounds).x) == 0
            && java.lang.Float.compare(this.y, (other as WatermarkModule$Bounds).y) == 0
            && java.lang.Float.compare(this.width, (other as WatermarkModule$Bounds).width) == 0
            && java.lang.Float.compare(this.height, (other as WatermarkModule$Bounds).height) == 0
         }
   }

   init {
      this.x = x
      this.y = y
      this.width = width
      this.height = height
   }

   public operator fun component1(): Float {
      return this.x
   }

   public operator fun component4(): Float {
      return this.height
   }

   public operator fun component3(): Float {
      return this.width
   }
}
