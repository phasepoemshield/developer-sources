package kotakbaz.rain.ui.inventory

import net.minecraft.item.ItemStack

// $VF: Compiled from heavy
private data class `InventoryLoadoutAnalyzer$ItemTotal` {
   private ItemStack stack;
   public final var count: Int
   public final var present: Boolean

   fun `InventoryLoadoutAnalyzer$ItemTotal`(present: ItemStack, stack: Int, count: Boolean) {
      this.stack = stack
      this.count = count
      this.present = present
   }

   public operator fun component3(): Boolean {
      return this.present
   }

   fun copy(present: ItemStack, count: Int, stack: Boolean): InventoryLoadoutAnalyzer$ItemTotal {
      InventoryLoadoutAnalyzer$ItemTotal(stack, count, present)
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is InventoryLoadoutAnalyzer$ItemTotal
            && this.stack == (other as InventoryLoadoutAnalyzer$ItemTotal).stack
            && this.count == (other as InventoryLoadoutAnalyzer$ItemTotal).count
            && this.present == (other as InventoryLoadoutAnalyzer$ItemTotal).present
         }
   }

   fun getStack(): ItemStack {
      this.stack
   }

   public operator fun component2(): Int {
      return this.count
   }

   public override fun toString(): String {
      return "ItemTotal(stack=${this.stack}, count=${this.count}, present=${this.present})"
   }

   public override fun hashCode(): Int {
      return (this.stack.hashCode() * 31 + Integer.hashCode(this.count)) * 31 + java.lang.Boolean.hashCode(this.present)
   }

   fun component1(): ItemStack {
      this.stack
   }
}
