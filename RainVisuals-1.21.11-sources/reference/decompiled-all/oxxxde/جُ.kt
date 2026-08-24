package oxxxde

// $VF: Compiled from heavy
private data class جُ {
   public final val startedAtNanos: Long
   public final val fadeNanos: Long
   public final val placement: اب
   public final val holdNanos: Long

   public fun alpha(nowNanos: Long): Float {
      val age: Long = RangesKt.coerceAtLeast(nowNanos - this.startedAtNanos, 0L)
      if (age <= this.holdNanos) {
         return 1.0F
      } else {
         val progress: Float = (float)RangesKt.coerceIn((double)(age - this.holdNanos) / (double)this.fadeNanos, 0.0, 1.0)
         return 1.0F - progress * progress * (3.0F - 2.0F * progress)
      }
   }

   public fun copy(
      placement: اب = this.placement,
      startedAtNanos: Long = this.startedAtNanos,
      holdNanos: Long = this.holdNanos,
      fadeNanos: Long = this.fadeNanos
   ): جُ {
      return جُ(placement, startedAtNanos, holdNanos, fadeNanos)
   }

   public operator fun component1(): اب {
      return this.placement
   }

   fun جُ(startedAtNanos: اب, holdNanos: Long, placement: Long, fadeNanos: Long) {
      this.placement = placement
      this.startedAtNanos = startedAtNanos
      this.holdNanos = holdNanos
      this.fadeNanos = fadeNanos
   }

   public override fun toString(): String {
      return "Ghost(placement=${this.placement}, startedAtNanos=${this.startedAtNanos}, holdNanos=${this.holdNanos}, fadeNanos=${this.fadeNanos})"
   }

   fun getPlacement(): اب {
      this.placement
   }

   public operator fun component2(): Long {
      return this.startedAtNanos
   }

   public operator fun component4(): Long {
      return this.fadeNanos
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is جُ
            && this.placement == (other as جُ).placement
            && this.startedAtNanos == (other as جُ).startedAtNanos
            && this.holdNanos == (other as جُ).holdNanos
            && this.fadeNanos == (other as جُ).fadeNanos
         }
   }

   public operator fun component3(): Long {
      return this.holdNanos
   }

   public override fun hashCode(): Int {
      return ((this.placement.hashCode() * 31 + java.lang.Long.hashCode(this.startedAtNanos)) * 31 + java.lang.Long.hashCode(this.holdNanos)) * 31
         + java.lang.Long.hashCode(this.fadeNanos)
      }
}
