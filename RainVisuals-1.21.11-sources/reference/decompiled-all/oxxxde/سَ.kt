package oxxxde

import net.minecraft.item.ItemStack

// $VF: Compiled from heavy
private class سَ {
   public final var name: String
   public final var remainingTicks: Int
   private ItemStack stack;

   fun setStack(`<set-?>`: ItemStack?) {
      this.stack = `<set-?>`
   }

   fun سَ() {
      this(null, null, 0, 7, null)
   }

   fun سَ(stack: ItemStack?, name: java.lang.String, remainingTicks: Int) {
      super()
      this.stack = stack
      this.name = name
      this.remainingTicks = remainingTicks
   }

   fun getStack(): ItemStack? {
      this.stack
   }
}
