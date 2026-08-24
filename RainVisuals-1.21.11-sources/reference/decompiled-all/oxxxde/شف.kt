package oxxxde

// $VF: Compiled from heavy
private data class شف(leadingEdgeY: Double, trailOffset: Double) {
   public final val leadingEdgeY: Double
   public final val trailOffset: Double

   public override fun hashCode(): Int {
      return java.lang.Double.hashCode(this.leadingEdgeY) * 31 + java.lang.Double.hashCode(this.trailOffset)
   }

   init {
      this.leadingEdgeY = leadingEdgeY
      this.trailOffset = trailOffset
   }

   public fun copy(leadingEdgeY: Double = this.leadingEdgeY, trailOffset: Double = this.trailOffset): شف {
      return شف(leadingEdgeY, trailOffset)
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
         return other is شف
            && java.lang.Double.compare(this.leadingEdgeY, (other as شف).leadingEdgeY) == 0
            && java.lang.Double.compare(this.trailOffset, (other as شف).trailOffset) == 0
         }
   }
}
