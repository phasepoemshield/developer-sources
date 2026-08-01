package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class O000000O0OO0O0 implements MinecraftAccessor {
   private static float O00000000;
   private static float O000000000;
   private static int O0000000000;
   private static boolean O00000000000;
   private static long O000000000000;
   private static float O0000000000000 = 2.5F;
   private static float O000000000000O = 1.2F;
   private static boolean O00000000000O;
   private static long O00000000000O0;
   private static long O00000000000OO = System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(8500L, 14000L);

   public static void O00000000() {
      O00000000000 = false;
      O0000000000 = 0;
      O00000000000O = false;
      O000000000000 = 0L;
      O00000000000OO = System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(8500L, 14000L);
   }

   public static void O00000000(LivingEntity livingEntity) {
      if (a_.player != null) {
         long var1 = System.currentTimeMillis();
         if (!O00000000000) {
            O00000000 = a_.player.getYaw();
            O000000000 = a_.player.getPitch();
            O00000000000 = true;
         }

         if (var1 >= O000000000000) {
            O0000000000000 = O0000O000OOOOO.O00000000000(1.6F, 4.6F);
            O000000000000O = O0000O000OOOOO.O00000000000(0.8F, 2.4F);
            O000000000000 = var1 + ThreadLocalRandom.current().nextLong(140L, 260L);
         }

         if (!O00000000000O && var1 >= O00000000000OO) {
            O00000000000O = true;
            O00000000000O0 = var1 + ThreadLocalRandom.current().nextLong(170L, 290L);
            O00000000000OO = var1 + ThreadLocalRandom.current().nextLong(7800L, 13500L);
         }

         if (O00000000000O && var1 >= O00000000000O0) {
            O00000000000O = false;
         }

         Vec3d var3 = O000000O0O.O000000000(livingEntity);
         float var4 = (float)Math.toDegrees(Math.atan2(-var3.x, var3.z));
         float var5 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var3.y, Math.hypot(var3.x, var3.z))), -90.0, 90.0);
         float[] var6 = AttackAura.O000000000(livingEntity);
         float[] var7 = new float[]{var6[0], var6[1], var6[0] + var6[1]};
         boolean var8 = O000000O00OOOO.O00000000(livingEntity, false, true, true, -45L, var7);
         if (var8) {
            O0000000000 = 2;
         }

         boolean var9 = O0000000000 > 0;
         if (O0000000000 > 0) {
            O0000000000--;
         }

         float var10 = MathHelper.wrapDegrees(var4 - O00000000);
         float var11 = var5 - O000000000;
         float var12 = var9 ? MathHelper.clamp(var10 * 0.92F, -56.0F, 56.0F) : MathHelper.clamp(var10 * 0.34F, -17.0F, 17.0F);
         float var13 = var9 ? MathHelper.clamp(var11 * 0.84F, -46.0F, 46.0F) : MathHelper.clamp(var11 * 0.3F, -12.0F, 12.0F);
         O00000000 += var12;
         O000000000 += var13;
         float var14 = (float)Math.sin(var1 / 65.0);
         float var15 = (float)Math.cos(var1 / 48.0);
         O00000000 = O00000000 + var14 * O0000000000000;
         O000000000 = O000000000 + var15 * O000000000000O;
         if (O00000000000O) {
            O000000000 = MathHelper.clamp(O000000000 - O0000O000OOOOO.O00000000000(7.5F, 12.5F), -89.0F, 89.0F);
         }

         float var16 = O00000000;
         float var17 = MathHelper.clamp(O000000000, -89.5F, 89.5F);
         float var18 = var9 ? O0000O000OOOOO.O00000000000(66.0F, 94.0F) : O0000O000OOOOO.O00000000000(26.0F, 44.0F);
         float var19 = var9 ? O0000O000OOOOO.O00000000000(104.0F, 146.0F) : O0000O000OOOOO.O00000000000(34.0F, 58.0F);
         O000000O0O0O0.O00000000(
            new O000000O0O00OO(var16, var17),
            var18,
            var19,
            O0000O000OOOOO.O00000000(30, 48),
            O0000O000OOOOO.O00000000(16, 34),
            O0000O000OOOOO.O00000000(0, 3),
            15,
            false
         );
      }
   }
}
