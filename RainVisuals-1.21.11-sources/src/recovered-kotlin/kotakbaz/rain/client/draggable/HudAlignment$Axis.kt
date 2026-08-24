package kotakbaz.rain.client.draggable

import oxxxde.رً

// $VF: Compiled from heavy
private data class `HudAlignment$Axis`(pos: Float, guide: Float?) {
   public final val pos: Float
   public final val guide: Float?

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.pos) * 31 + (if (this.guide == null) 0 else this.guide.hashCode())
   }

   public operator fun component1(): Float {
      return this.pos
   }

   public override fun toString(): String {
      return "Axis(pos=${this.pos}, guide=${this.guide})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is HudAlignment$Axis
            && java.lang.Float.compare(this.pos, (other as HudAlignment$Axis).pos) == 0
            && this.guide == (other as HudAlignment$Axis).guide
         }
   }

   public operator fun component2(): Float? {
      return this.guide
   }

   public fun copy(pos: Float = ..., guide: Float? = ...): رً {
      return HudAlignment$Axis(pos, guide)
   }

   init {
      this.pos = pos
      this.guide = guide
   }
}
