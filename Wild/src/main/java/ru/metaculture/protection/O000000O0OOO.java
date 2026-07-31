package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class O000000O0OOO implements MinecraftAccessor {
   private static final int O00000000 = 15;
   private static boolean O000000000;
   private static int O0000000000 = -1;
   private static float O00000000000;
   private static float O000000000000;

   public static void O00000000(LivingEntity livingEntity) {
      if (a_.player == null) {
         O000000000();
      } else if (a_.world != null && livingEntity != null) {
         Box var1 = livingEntity.getBoundingBox();
         Vec3d var2 = a_.player.getEyePos();
         boolean var3 = AttackAura.O000000000OOO.O0000000000();
         if (O0000000000 != livingEntity.getId()) {
            O0000000000 = livingEntity.getId();
            O00000000000 = O000000O0O00O.O0000000000;
            O000000000000 = O000000O0O00O.O00000000000;
         }

         Vec3d var4 = livingEntity.getPos()
            .add(0.0, MathHelper.clamp(var2.y - livingEntity.getY(), 0.0, livingEntity.getHeight()), 0.0)
            .subtract(var2)
            .normalize();
         float var5 = (float)Math.toDegrees(Math.atan2(-var4.x, var4.z));
         float var6 = (float)MathHelper.clamp(Math.toDegrees(Math.asin(-var4.y)), -90.0, 90.0);
         float var7 = Float.MAX_VALUE;
         float var8 = -Float.MAX_VALUE;
         float var9 = Float.MAX_VALUE;
         float var10 = -Float.MAX_VALUE;
         double[][] var11 = new double[][]{
            {var1.minX, var1.minY, var1.minZ},
            {var1.minX, var1.minY, var1.maxZ},
            {var1.minX, var1.maxY, var1.minZ},
            {var1.minX, var1.maxY, var1.maxZ},
            {var1.maxX, var1.minY, var1.minZ},
            {var1.maxX, var1.minY, var1.maxZ},
            {var1.maxX, var1.maxY, var1.minZ},
            {var1.maxX, var1.maxY, var1.maxZ}
         };

         for (double[] var15 : var11) {
            Vec3d var16 = new Vec3d(var15[0], var15[1], var15[2]).subtract(var2);
            float var17 = (float)Math.toDegrees(Math.atan2(-var16.x, var16.z));
            float var18 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var16.y, Math.hypot(var16.x, var16.z))), -90.0, 90.0);
            float var19 = MathHelper.wrapDegrees(var17 - var5);
            float var20 = var18 - var6;
            var7 = Math.min(var7, var19);
            var8 = Math.max(var8, var19);
            var9 = Math.min(var9, var20);
            var10 = Math.max(var10, var20);
         }

         float var36 = 22.0F;
         float var37 = MathHelper.clamp(MathHelper.wrapDegrees(O000000O0O00O.O0000000000 - var5), var7 - var36, var8 + var36);
         float var38;
         if (var3) {
            float var39 = (float)(System.currentTimeMillis() % 2000L) / 2000.0F;
            float var41 = (float)Math.sin(var39 * Math.PI * 2.0);
            float var43 = (var10 - var9) * 0.75F + O0000O000OOOOO.O00000000000(15.0F, 30.0F);
            float var45 = (var9 + var10) * 0.5F;
            var38 = var45 + var41 * var43 + O0000O000OOOOO.O00000000000(-4.0F, 4.0F);
         } else {
            var38 = MathHelper.clamp(O000000O0O00O.O00000000000 - var6, var9 - var36, var10 + var36);
         }

         float var40 = var5 + var37;
         float var42 = MathHelper.clamp(var6 + var38, -90.0F, 90.0F);
         float var44 = O000000O0O00O.O0000000000;
         float var46 = O000000O0O00O.O00000000000;
         float var47 = Math.abs(MathHelper.wrapDegrees(var44 - O00000000000));
         float var48 = Math.abs(var46 - O000000000000);
         O00000000000 = var44;
         O000000000000 = var46;
         float[] var21 = AttackAura.O000000000(livingEntity);
         float[] var22 = new float[]{var21[0], var21[1], var21[0] + var21[1]};
         boolean var23 = O000000O00OOOO.O00000000(livingEntity, false, true, true, -50L, var22)
            && O000000O0O.O00000000((Entity)livingEntity) < AttackAura.O00000000(livingEntity);
         if (!var23) {
            float var49 = O0000O000OOOOO.O00000000000(0.3F, 0.6F);
            float var50 = O0000O000OOOOO.O00000000000(0.2F, 0.4F);
            float var51 = var49 + var47 * 3.5F;
            float var52 = var50 + var48 * 3.5F;
            float var53 = MathHelper.wrapDegrees(var40 - a_.player.getYaw());
            float var29 = var42 - a_.player.getPitch();
            float var30 = MathHelper.clamp(var53, -var51, var51);
            float var31 = var3 ? MathHelper.clamp(var29, -var52 * 5.0F, var52 * 5.0F) : MathHelper.clamp(var29, -var52, var52);
            float var32 = a_.player.getYaw() + var30;
            float var33 = MathHelper.clamp(a_.player.getPitch() + var31, -90.0F, 90.0F);
            float var34 = Math.max(var51 * 18.5F, 6.0F);
            float var35 = Math.max(var52 * 18.5F, 4.0F);
            O00000000(new O000000O0O00OO(var32, var33), var34, var35);
         } else {
            float var24 = a_.player.getYaw();
            float var25 = a_.player.getPitch();
            float var26 = MathHelper.wrapDegrees(var24 - var5);
            float var27 = var25 - var6;
            boolean var28 = var26 >= var7 && var26 <= var8 && var27 >= var9 && var27 <= var10;
            if (!var28) {
               O00000000(var1, var2, var24, var25);
            } else {
               O00000000(new O000000O0O00OO(var24, var25), 6.0F, 4.0F);
            }
         }
      } else {
         O00000000();
      }
   }

   public static void O00000000() {
      if (!O000000000) {
         O000000000();
      } else {
         if (a_.player != null) {
            O000000O0O00O.O0000000000 = a_.player.getYaw();
            O000000O0O00O.O00000000000 = a_.player.getPitch();
         }

         O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
         O000000O0O0O0.O0000000000000 = 0;
         O000000O0O0O0.O00000000000OO = false;
         O000000O0O0O0.O00000000000O0 = null;
         O000000O0O0O0.O00000000000O = 0;
         O000000O0O00O.O00000000 = O000000O0O00O.O000000000;
         O000000000();
      }
   }

   private static void O00000000(Box box, Vec3d vec3d, float f, float g) {
      boolean var4 = ThreadLocalRandom.current().nextBoolean();
      float var5 = var4 ? O0000O000OOOOO.O00000000000(0.05F, 0.2F) : O0000O000OOOOO.O00000000000(0.8F, 0.95F);
      float var6 = (float)(ThreadLocalRandom.current().nextDouble() * ThreadLocalRandom.current().nextDouble());
      float var7 = 0.5F + var6 * 0.5F;
      float var8 = O0000O000OOOOO.O00000000000(-1.0F, 1.0F) * O0000O000OOOOO.O00000000000(0.0F, 1.0F);
      float var9 = (var8 + 1.0F) / 2.0F;
      double var10 = box.minX + (box.maxX - box.minX) * var5;
      double var12 = box.minY + (box.maxY - box.minY) * var7;
      double var14 = box.minZ + (box.maxZ - box.minZ) * var9;
      Vec3d var16 = new Vec3d(var10, var12, var14).subtract(vec3d);
      float var17 = (float)Math.toDegrees(Math.atan2(-var16.x, var16.z));
      float var18 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var16.y, Math.hypot(var16.x, var16.z))), -90.0, 90.0);
      float var19 = Math.abs(MathHelper.wrapDegrees(var17 - f));
      float var20 = Math.abs(var18 - g);
      float var21 = O0000O000OOOOO.O00000000000(15.0F, 25.0F) + var19 / 90.0F * O0000O000OOOOO.O00000000000(30.0F, 40.0F);
      float var22 = O0000O000OOOOO.O00000000000(10.0F, 18.0F) + var20 / 90.0F * O0000O000OOOOO.O00000000000(20.0F, 27.0F);
      O00000000(new O000000O0O00OO(var17, var18), var21, var22);
   }

   private static void O00000000(O000000O0O00OO o000000O0O00OO, float f, float g) {
      O000000000 = O000000O0O0O0.O0000000000000 <= 15;
      O000000O0O0O0.O00000000(
         o000000O0O00OO, f, g, O0000O000OOOOO.O00000000(25, 45), O0000O000OOOOO.O00000000(10, 25), O0000O000OOOOO.O00000000(0, 2), 15, false
      );
   }

   private static void O000000000() {
      O000000000 = false;
      O0000000000 = -1;
      O00000000000 = 0.0F;
      O000000000000 = 0.0F;
   }
}
