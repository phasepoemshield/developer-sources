package kotakbaz.rain.module.modules.render

import kotakbaz.rain.module.modules.render.predicts.PredictedProjectile
import net.minecraft.item.ItemStack
import oxxxde.ذظ

// $VF: Compiled from heavy
private data class `PredictsModule$HeldWeapon` {
   private PredictedProjectile projectile;
   private ItemStack stack;

   public override fun toString(): String {
      return "HeldWeapon(stack=${this.stack}, projectile=${this.projectile})"
   }

   fun copy(stack: ItemStack, projectile: PredictedProjectile): PredictsModule$HeldWeapon {
      PredictsModule$HeldWeapon(stack, projectile)
   }

   fun `PredictsModule$HeldWeapon`(stack: ItemStack, projectile: PredictedProjectile) {
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

   public final val projectile: ذظ

   public operator fun component2(): ذظ {
      return this.projectile
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is PredictsModule$HeldWeapon
            && this.stack == (other as PredictsModule$HeldWeapon).stack
            && this.projectile === (other as PredictsModule$HeldWeapon).projectile
         }
   }
}
