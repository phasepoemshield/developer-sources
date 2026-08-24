package kotakbaz.rain.module.modules.render

import oxxxde.ثخ

// $VF: Compiled from heavy
private data class `HitColorModule$DamageAnimation`(progress: Float = 0.0F, lastUpdateAt: Long = 0L) {
   public final var lastUpdateAt: Long
   public final var progress: Float

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.progress) * 31 + java.lang.Long.hashCode(this.lastUpdateAt)
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is HitColorModule$DamageAnimation
            && java.lang.Float.compare(this.progress, (other as HitColorModule$DamageAnimation).progress) == 0
            && this.lastUpdateAt == (other as HitColorModule$DamageAnimation).lastUpdateAt
         }
   }

   public operator fun component2(): Long {
      return this.lastUpdateAt
   }

   fun `HitColorModule$DamageAnimation`() {
      this(0.0F, 0L, 3, null)
   }

   public operator fun component1(): Float {
      return this.progress
   }

   public override fun toString(): String {
      return "DamageAnimation(progress=${this.progress}, lastUpdateAt=${this.lastUpdateAt})"
   }

   public fun copy(progress: Float = ..., lastUpdateAt: Long = ...): ثخ {
      return HitColorModule$DamageAnimation(progress, lastUpdateAt)
   }

   init {
      super()
      this.progress = progress
      this.lastUpdateAt = lastUpdateAt
   }
}
