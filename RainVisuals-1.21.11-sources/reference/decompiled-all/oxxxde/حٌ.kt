package oxxxde

// $VF: Compiled from heavy
private data class حٌ(progress: Float = 0.0F, lastUpdateAt: Long = 0L) {
   public final var lastUpdateAt: Long
   public final var progress: Float

   public fun copy(progress: Float = this.progress, lastUpdateAt: Long = this.lastUpdateAt): حٌ {
      return حٌ(progress, lastUpdateAt)
   }

   public operator fun component2(): Long {
      return this.lastUpdateAt
   }

   fun حٌ() {
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
         return other is حٌ && java.lang.Float.compare(this.progress, (other as حٌ).progress) == 0 && this.lastUpdateAt == (other as حٌ).lastUpdateAt
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Float.hashCode(this.progress) * 31 + java.lang.Long.hashCode(this.lastUpdateAt)
   }
}
