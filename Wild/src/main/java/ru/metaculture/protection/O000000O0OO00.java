package ru.metaculture.protection;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class O000000O0OO00 implements MinecraftAccessor {
   private static long O00000000;

   public static void O00000000(LivingEntity livingEntity, O0000000O0OOOO o0000000O0OOOO) {
      if (livingEntity != null && a_.player != null && a_.world != null) {
         Vec3d var2 = livingEntity.getPos()
            .add(0.0, MathHelper.clamp(a_.player.getEyePos().y - livingEntity.getY(), 0.0, 1.0), 0.0)
            .subtract(a_.player.getEyePos())
            .normalize();
         float var3 = (float)Math.toDegrees(Math.atan2(-var2.x, var2.z));
         float var4 = a_.player.getYaw();
         float var5 = MathHelper.wrapDegrees(var3 - var4);
         float var6 = MathHelper.clamp(AttackAura.O000000000OO0O.O0000000000(), 0.02F, 0.4F);
         float var7 = O00000000();
         float var8 = 1.0F - (float)Math.pow(1.0F - var6, var7);
         float var9 = var4 + var5 * var8;
         a_.player.setYaw(var9);
         a_.player.headYaw = var9;
         o0000000O0OOOO.O00000000(var9);
      }
   }

   private static float O00000000() {
      long var0 = System.nanoTime();
      if (O00000000 == 0L) {
         O00000000 = var0;
         return 1.0F;
      } else {
         float var2 = (float)(var0 - O00000000) / 1.6666667E7F;
         O00000000 = var0;
         return MathHelper.clamp(var2, 0.25F, 4.0F);
      }
   }
}
