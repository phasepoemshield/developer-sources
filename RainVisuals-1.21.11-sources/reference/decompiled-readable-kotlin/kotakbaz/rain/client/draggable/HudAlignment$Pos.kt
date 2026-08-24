package kotakbaz.rain.client.draggable

import oxxxde.دآ

// $VF: Compiled from heavy
public data class `HudAlignment$Pos`(x: Float, y: Float) {
   public final val x: Float
   public final val y: Float

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.x) * 31 + java.lang.Float.hashCode(this.y)
   }

   public operator fun component2(): Float {
      return this.y
   }

   public override fun toString(): String {
      return "Pos(x=${this.x}, y=${this.y})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is HudAlignment$Pos
            && java.lang.Float.compare(this.x, (other as HudAlignment$Pos).x) == 0
            && java.lang.Float.compare(this.y, (other as HudAlignment$Pos).y) == 0
         }
   }

   public operator fun component1(): Float {
      return this.x
   }

   init {
      this.x = x
      this.y = y
   }

   public fun copy(x: Float = ..., y: Float = ...): دآ {
      return HudAlignment$Pos(x, y)
   }
}
