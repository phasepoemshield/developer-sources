package oxxxde

import net.minecraft.item.ItemStack

// $VF: Compiled from heavy
private data class حه {
   public final val projectile: ذظ
   private ItemStack stack;

   public override fun toString(): String {
      return "HeldWeapon(stack=${this.stack}, projectile=${this.projectile})"
   }

   fun copy(stack: ItemStack, projectile: ذظ): حه {
      حه(stack, projectile)
   }

   fun حه(stack: ItemStack, projectile: ذظ) {
      this.stack = stack
      this.projectile = projectile
   }

   fun component1(): ItemStack {
      this.stack
   }

   fun getStack(): ItemStack {
      this.stack
   }

   public override fun hashCode(): Int {
      return this.stack.hashCode() * 31 + this.projectile.hashCode()
   }

   fun getProjectile(): ذظ {
      this.projectile
   }

   public operator fun component2(): ذظ {
      return this.projectile
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is حه && this.stack == (other as حه).stack && this.projectile === (other as حه).projectile
      }
   }
}
