package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class O000000O0OO0O implements MinecraftAccessor {
   static float O00000000;
   static float O000000000;
   static float O0000000000;
   public static long O00000000000 = 0L;
   public static long O000000000000 = ThreadLocalRandom.current().nextLong(90000L, 180000L);
   public static boolean O0000000000000 = false;
   public static long O000000000000O = 0L;
   public static int O00000000000O = 0;

   public static void O00000000(LivingEntity livingEntity) {
      long var1 = System.currentTimeMillis();
      if (!O0000000000000 && var1 - O00000000000 >= O000000000000) {
         O0000000000000 = true;
         O000000000000O = var1;
         O00000000000O = ThreadLocalRandom.current().nextInt(300, 400);
         O00000000000 = var1;
         O000000000000 = ThreadLocalRandom.current().nextLong(9100L, 11200L);
      }

      boolean var3 = false;
      if (O0000000000000 && var1 - O000000000000O >= O00000000000O) {
         O0000000000000 = false;
      }

      if (var1 - O000000000000O >= O00000000000O + 70L) {
         var3 = true;
      }

      Vec3d var4 = O000000O0O.O000000000(livingEntity);
      float var5 = (float)Math.toDegrees(Math.atan2(-var4.x, var4.z));
      float var6 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var4.y, Math.hypot(var4.x, var4.z))), -90.0, 90.0);
      float[] var7 = AttackAura.O000000000(livingEntity);
      float[] var8 = new float[]{var7[0], var7[1], var7[0] + var7[1]};
      boolean var9 = O000000O00OOOO.O00000000(livingEntity, false, true, true, -50L, var8);
      float var10 = a_.player.getYaw();
      float var11 = Math.abs(MathHelper.wrapDegrees(var10 - var5));
      float var12 = O0000O000OOOOO.O00000000000(62.0F, 84.0F);
      float var13 = !var3 ? O0000O000OOOOO.O00000000000(120.0F, 170.0F) : O0000O000OOOOO.O00000000000(9.0F, 13.0F);
      if (var9) {
         O00000000 = 2.0F;
      }

      boolean var14 = false;
      if (O00000000 > 0.0F) {
         var14 = true;
         O00000000--;
      }

      float var15 = (float)Math.cos(System.currentTimeMillis() / 40.0);
      float var16 = (float)Math.sin(System.currentTimeMillis() / 70.0);
      if (var14) {
         O000000000 = var5;
         O0000000000 = var6;
      }

      float var17 = var15 * O0000O000OOOOO.O00000000000(9.0F, 17.0F);
      float var18 = var16 * O0000O000OOOOO.O00000000000(4.0F, 13.0F);
      float var19 = O0000000000000 ? -O0000O000OOOOO.O00000000000(85.0F, 90.0F) : O0000000000;
      O000000O0O0O0.O00000000(
         new O000000O0O00OO(O000000000 + var17, var19 + var18),
         var12,
         var13,
         O0000O000OOOOO.O00000000(35, 45),
         O0000O000OOOOO.O00000000(19, 45),
         O0000O000OOOOO.O00000000(0, 3),
         15,
         false
      );
   }
}
