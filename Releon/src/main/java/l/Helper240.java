package l;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;

class Helper240 {
   final ItemStack stack;
   final Vec3d pos;
   final int predictedTicks;
   final int entityId;
   final long creationTime;

   Helper240(ItemStack var1, Vec3d var2, int var3, int var4) {
      this.stack = var1;
      this.pos = var2.add(0.0, 0.25, 0.0);
      this.predictedTicks = var3;
      this.entityId = var4;
      this.creationTime = Helper160.mc.world.getTime();
   }
}
