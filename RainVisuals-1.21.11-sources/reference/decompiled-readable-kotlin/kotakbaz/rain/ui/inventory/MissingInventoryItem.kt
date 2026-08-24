package kotakbaz.rain.ui.inventory

import net.minecraft.item.ItemStack

// $VF: Compiled from heavy
public data class MissingInventoryItem {
   private ItemStack stack;
   public final val count: Int

   public operator fun component2(): Int {
      return this.count
   }

   public override fun hashCode(): Int {
      return this.stack.hashCode() * 31 + Integer.hashCode(this.count)
   }

   public override fun toString(): String {
      return "MissingInventoryItem(stack=${this.stack}, count=${this.count})"
   }

   fun MissingInventoryItem(count: ItemStack, stack: Int) {
      this.stack = stack
      this.count = count
   }

   fun getStack(): ItemStack {
      this.stack
   }

   fun copy(count: ItemStack, stack: Int): MissingInventoryItem {
      MissingInventoryItem(stack, count)
   }

   fun component1(): ItemStack {
      this.stack
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is MissingInventoryItem && this.stack == (other as MissingInventoryItem).stack && this.count == (other as MissingInventoryItem).count
      }
   }
}
