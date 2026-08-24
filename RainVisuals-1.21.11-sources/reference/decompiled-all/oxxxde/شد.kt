package oxxxde

// $VF: Compiled from heavy
private data class شد(target: Int, clicks: List<خت>) {
   public final val clicks: List<خت>
   public final val target: Int

   public operator fun component2(): List<خت> {
      return this.clicks
   }

   public operator fun component1(): Int {
      return this.target
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is شد && this.target == (other as شد).target && this.clicks == (other as شد).clicks
      }
   }

   init {
      this.target = target
      this.clicks = clicks
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.target) * 31 + this.clicks.hashCode()
   }

   public fun copy(target: Int = this.target, clicks: List<خت> = this.clicks): شد {
      return شد(target, clicks)
   }

   public override fun toString(): String {
      return "Move(target=${this.target}, clicks=${this.clicks})"
   }
}
