package kotakbaz.rain.module.modules.render

import oxxxde.حٌ

// $VF: Compiled from heavy
private data class `ModuleCustomHitBox$DamageAnimation`(progress: Float = 0.0F, lastUpdateAt: Long = 0L) {
   public final var lastUpdateAt: Long
   public final var progress: Float

   public fun copy(progress: Float = ..., lastUpdateAt: Long = ...): حٌ {
      return ModuleCustomHitBox$DamageAnimation(progress, lastUpdateAt)
   }

   public operator fun component2(): Long {
      return this.lastUpdateAt
   }

   fun `ModuleCustomHitBox$DamageAnimation`() {
      this(0.0F, 0L, 3, null)
   }

   public override fun toString(): String {
      return "DamageAnimation(progress=${this.progress}, lastUpdateAt=${this.lastUpdateAt})"
   }

   public operator fun component1(): Float {
      return this.progress
   }

   init {
      this.progress = progress
      this.lastUpdateAt = lastUpdateAt
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is ModuleCustomHitBox$DamageAnimation
            && java.lang.Float.compare(this.progress, (other as ModuleCustomHitBox$DamageAnimation).progress) == 0
            && this.lastUpdateAt == (other as ModuleCustomHitBox$DamageAnimation).lastUpdateAt
         }
   }

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.progress) * 31 + java.lang.Long.hashCode(this.lastUpdateAt)
   }
}
