package oxxxde

// $VF: Compiled from heavy
internal data class سخ(visuals: Map<Int, سق>, missingItems: List<طف>) {
   public final val visuals: Map<Int, سق>
   public final val missingItems: List<طف>

   public fun copy(visuals: Map<Int, سق> = this.visuals, missingItems: List<طف> = this.missingItems): سخ {
      return سخ(visuals, missingItems)
   }

   public override fun hashCode(): Int {
      return this.visuals.hashCode() * 31 + this.missingItems.hashCode()
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is سخ && this.visuals == (other as سخ).visuals && this.missingItems == (other as سخ).missingItems
      }
   }

   init {
      this.visuals = visuals
      this.missingItems = missingItems
   }

   public override fun toString(): String {
      return "InventoryAnalysis(visuals=${this.visuals}, missingItems=${this.missingItems})"
   }

   public operator fun component1(): Map<Int, سق> {
      return this.visuals
   }

   public operator fun component2(): List<طف> {
      return this.missingItems
   }
}
