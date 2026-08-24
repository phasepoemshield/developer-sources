package kotakbaz.rain.module.modules.render

import oxxxde.شف

// $VF: Compiled from heavy
private data class `TargetEspModule$RingSweepState`(leadingEdgeY: Double, trailOffset: Double) {
   public final val leadingEdgeY: Double
   public final val trailOffset: Double

   public override fun hashCode(): Int {
      return java.lang.Double.hashCode(this.leadingEdgeY) * 31 + java.lang.Double.hashCode(this.trailOffset)
   }

   init {
      this.leadingEdgeY = leadingEdgeY
      this.trailOffset = trailOffset
   }

   public fun copy(leadingEdgeY: Double = ..., trailOffset: Double = ...): شف {
      return TargetEspModule$RingSweepState(leadingEdgeY, trailOffset)
   }

   public override fun toString(): String {
      return "RingSweepState(leadingEdgeY=${this.leadingEdgeY}, trailOffset=${this.trailOffset})"
   }

   public operator fun component2(): Double {
      return this.trailOffset
   }

   public operator fun component1(): Double {
      return this.leadingEdgeY
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is TargetEspModule$RingSweepState
            && java.lang.Double.compare(this.leadingEdgeY, (other as TargetEspModule$RingSweepState).leadingEdgeY) == 0
            && java.lang.Double.compare(this.trailOffset, (other as TargetEspModule$RingSweepState).trailOffset) == 0
         }
   }
}
