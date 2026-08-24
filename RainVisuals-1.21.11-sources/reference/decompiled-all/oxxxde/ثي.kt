package oxxxde

import net.minecraft.item.ItemStack

// $VF: Compiled from heavy
public data class ثي : دغ {
   private ItemStack stack;

   public override fun toString(): String {
      return "Item(stack=${this.stack})"
   }

   fun ثي(stack: ItemStack) {
      this.stack = stack
   }

   fun copy(stack: ItemStack): ثي {
      ثي(stack)
   }

   public override operator fun equals(other: Any?): Boolean {
      label22@
      if (this === other) {
         return true
      } else {
         return other is ثي && this.stack == (other as ثي).stack
      }
   }

   fun component1(): ItemStack {
      this.stack
   }

   fun getStack(): ItemStack {
      this.stack
   }

   public override fun hashCode(): Int {
      return this.stack.hashCode()
   }
}
