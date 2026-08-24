package oxxxde

import net.minecraft.item.ItemStack

// $VF: Compiled from heavy
private class ظت {
   public final var remainingAmount: Int
   private ItemStack stack;
   public final val createdAt: Long

   fun ظت(remainingAmount: ItemStack, stack: Int, createdAt: Long) {
      this.stack = stack
      this.remainingAmount = remainingAmount
      this.createdAt = createdAt
   }

   fun getStack(): ItemStack {
      this.stack
   }
}
