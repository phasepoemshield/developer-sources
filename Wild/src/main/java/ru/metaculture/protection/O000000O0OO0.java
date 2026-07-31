package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class O000000O0OO0 implements MinecraftAccessor {
   public static void O00000000(LivingEntity livingEntity) {
      if (livingEntity != null && a_.player != null) {
         Vec3d var1 = O000000O0O.O000000000(livingEntity);
         float var2 = (float)Math.toDegrees(Math.atan2(-var1.x, var1.z));
         float var3 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var1.y, Math.hypot(var1.x, var1.z))), -90.0, 70.0);
         float var4 = a_.player.getYaw();
         float var5 = a_.player.getPitch();
         float var6 = MathHelper.wrapDegrees(var2 - var4);
         float var7 = var3 - var5;
         float var8 = var6 / 3.0F;
         float var9 = var7 / 6.0F;
         float var10 = 1.0F + (float)ThreadLocalRandom.current().nextDouble(-1.0, 1.5);
         float var11 = 1.0F + (float)ThreadLocalRandom.current().nextDouble(-0.4, 1.333);
         float var12 = var8 * var10;
         float var13 = var9 * var11;
         if (a_.player.isSwimming()) {
            O000000O0O0O0.O00000000(new O000000O0O00OO(var2, var3), 360.0F, 360.0F, 20.0F, 20.0F, 2, 15, false);
         } else {
            O000000O0O0O0.O00000000(new O000000O0O00OO(var4 + var12, var5 + var13), 360.0F, 360.0F, 20.0F, 20.0F, 2, 15, false);
         }
      }
   }
}
