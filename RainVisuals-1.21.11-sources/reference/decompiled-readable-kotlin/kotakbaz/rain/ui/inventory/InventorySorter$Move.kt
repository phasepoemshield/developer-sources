package kotakbaz.rain.ui.inventory

import oxxxde.خت
import oxxxde.شد

// $VF: Compiled from heavy
private data class `InventorySorter$Move`(target: Int, clicks: List<خت>) {
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
         return other is InventorySorter$Move && this.target == (other as InventorySorter$Move).target && this.clicks == (other as InventorySorter$Move).clicks
      }
   }

   init {
      this.target = target
      this.clicks = clicks
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.target) * 31 + this.clicks.hashCode()
   }

   public fun copy(target: Int = ..., clicks: List<خت> = ...): شد {
      return InventorySorter$Move(target, clicks)
   }

   public override fun toString(): String {
      return "Move(target=${this.target}, clicks=${this.clicks})"
   }
}
