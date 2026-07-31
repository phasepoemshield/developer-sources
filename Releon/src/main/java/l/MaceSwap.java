package l;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.Box;

@Environment(EnvType.CLIENT)
public class MaceSwap extends Helper242 {
   private final Setting2 radius = new Setting2("Радиус", "").method2079(0, 15);
   private boolean holdingMace = false;
   private int previousSlot = -1;
   private boolean wasOnGround = true;
   private boolean windChargeUsed = false;

   public MaceSwap() {
      super("MaceSwap", "Mace Swap", Helper269.COMBAT);
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         boolean var2 = mc.player.isOnGround();
         double var3 = mc.player.getVelocity().y;
         if (this.wasOnGround && !var2 && var3 > 0.5) {
            this.windChargeUsed = true;
         }

         if (var2) {
            if (this.holdingMace) {
               this.method3712();
            }

            this.method3713();
         }

         this.wasOnGround = var2;
         if (!this.holdingMace && this.windChargeUsed && this.method3710(this.radius.method2082())) {
            int var5 = this.method3711();
            if (var5 != -1 && mc.player.getInventory().selectedSlot != var5) {
               this.previousSlot = mc.player.getInventory().selectedSlot;
               mc.player.getInventory().setSelectedSlot(var5);
               this.holdingMace = true;
            }
         }
      }
   }

   private boolean method3710(float var1) {
      Box var2 = mc.player.getBoundingBox().expand(var1, var1, var1);

      for (LivingEntity var4 : mc.world.getEntitiesByClass(LivingEntity.class, var2, var0 -> {
         if (var0 == mc.player) {
            return false;
         } else if (!var0.isAlive()) {
            return false;
         } else {
            return var0 instanceof ArmorStandEntity ? false : !(var0 instanceof PlayerEntity var1x && var1x.isCreative());
         }
      })) {
         if (mc.player.distanceTo(var4) <= var1) {
            return true;
         }
      }

      return false;
   }

   private int method3711() {
      for (int var1 = 0; var1 < 9; var1++) {
         ItemStack var2 = mc.player.getInventory().getStack(var1);
         if (!var2.isEmpty() && var2.getItem() == Items.MACE) {
            return var1;
         }
      }

      return -1;
   }

   private void method3712() {
      if (mc.player != null && this.previousSlot >= 0 && this.previousSlot <= 8) {
         mc.player.getInventory().setSelectedSlot(this.previousSlot);
      }
   }

   private void method3713() {
      this.holdingMace = false;
      this.previousSlot = -1;
      this.windChargeUsed = false;
      this.wasOnGround = true;
   }
}
