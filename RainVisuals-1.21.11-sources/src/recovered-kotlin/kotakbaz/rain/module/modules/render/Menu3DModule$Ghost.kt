package kotakbaz.rain.module.modules.render

import oxxxde.اب
import oxxxde.جُ

// $VF: Compiled from heavy
private data class `Menu3DModule$Ghost`(placement: اب, startedAtNanos: Long, holdNanos: Long, fadeNanos: Long) {
   public final val startedAtNanos: Long
   public final val fadeNanos: Long
   private Menu3DModule$Placement placement;
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

   public fun copy(placement: اب = ..., startedAtNanos: Long = ..., holdNanos: Long = ..., fadeNanos: Long = ...): جُ {
      return Menu3DModule$Ghost(placement, startedAtNanos, holdNanos, fadeNanos)
   }

   public operator fun component1(): اب {
      return this.placement
   }

   init {
      this.placement = placement
      this.startedAtNanos = startedAtNanos
      this.holdNanos = holdNanos
      this.fadeNanos = fadeNanos
   }

   public override fun toString(): String {
      return "Ghost(placement=${this.placement}, startedAtNanos=${this.startedAtNanos}, holdNanos=${this.holdNanos}, fadeNanos=${this.fadeNanos})"
   }

   public final val placement: اب

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
         return other is Menu3DModule$Ghost
            && this.placement == (other as Menu3DModule$Ghost).placement
            && this.startedAtNanos == (other as Menu3DModule$Ghost).startedAtNanos
            && this.holdNanos == (other as Menu3DModule$Ghost).holdNanos
            && this.fadeNanos == (other as Menu3DModule$Ghost).fadeNanos
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
