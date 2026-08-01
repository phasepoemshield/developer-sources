package ru.metaculture.protection;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class O000000O0OOO0 implements MinecraftAccessor {
   private static final int O00000000 = 15;
   private static final int O000000000 = 6;
   private static final float O0000000000 = 0.28F;
   private static final float O00000000000 = 0.4F;
   private static final float O000000000000 = 0.24F;
   private static final float O0000000000000 = 20.0F;
   private static final float O000000000000O = 42.0F;
   private static final float O00000000000O = 5.0F;
   private static final float O00000000000O0 = 10.0F;
   private static final float O00000000000OO = 1.6F;
   private static final float O0000000000O00 = 0.95F;
   private static final float O0000000000O0O = 0.85F;
   private static final float O0000000000OO = 0.65F;
   private static final float O0000000000OO0 = 65.0F;
   private static final float O0000000000OOO = 0.34F;
   private static final float O000000000O = 0.7F;
   private static int O000000000O0 = Integer.MIN_VALUE;
   private static final float[] O000000000O00 = new float[6];
   private static final float[] O000000000O000 = new float[6];
   private static final float[] O000000000O00O = new float[6];
   private static int O000000000O0O;
   private static int O000000000O0O0;
   private static float O000000000O0OO = 0.5F;
   private static float O000000000OO = 0.55F;
   private static float O000000000OO0 = 0.5F;
   private static float O000000000OO00 = 0.5F;
   private static float O000000000OO0O = 0.55F;
   private static float O000000000OOO = 0.5F;
   private static float O000000000OOO0 = 1.2F;
   private static long O000000000OOOO;
   private static float O00000000O = 12.400001F;
   private static float O00000000O0 = 4.5F;
   private static float O00000000O00 = O00000000O;
   private static float O00000000O000 = O00000000O0;

   public static void O00000000(LivingEntity livingEntity) {
      if (a_.player == null) {
         O00000000000();
      } else if (a_.world != null && livingEntity != null) {
         long var1 = System.currentTimeMillis();
         Box var3 = livingEntity.getBoundingBox();
         Vec3d var4 = a_.player.getEyePos();
         boolean var5 = O00000000(var4, var3);
         if (O000000000O0 != livingEntity.getId()) {
            O000000000O0 = livingEntity.getId();
            O0000000000();
            O00000000(var3, var4, var1, var5);
            O000000000O0OO = O000000000OO00;
            O000000000OO = O000000000OO0O;
            O000000000OO0 = O000000000OOO;
            O00000000O = O00000000O00;
            O00000000O0 = O00000000O000;
         }

         if (var1 >= O000000000OOOO || O000000000() < 0.05F) {
            O00000000(var3, var4, var1, var5);
         }

         O00000000O = O00000000O + (O00000000O00 - O00000000O) * 0.65F;
         O00000000O0 = O00000000O0 + (O00000000O000 - O00000000O0) * 0.65F;
         float var6 = var5 ? 1.36F : 1.6F;
         O000000000O0OO = O000000000O0OO + (O000000000OO00 - O000000000O0OO) * O000000000OOO0;
         O000000000OO = O000000000OO + (O000000000OO0O - O000000000OO) * (O000000000OOO0 * var6);
         O000000000OO0 = O000000000OO0 + (O000000000OOO - O000000000OO0) * O000000000OOO0;
         Vec3d var7 = O00000000(var3);
         Vec3d var8 = var7.subtract(var4);
         float var9 = (float)Math.toDegrees(Math.atan2(-var8.x, var8.z));
         float var10 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var8.y, Math.hypot(var8.x, var8.z))), -89.0, 89.0);
         O000000O0O0O0.O00000000(new O000000O0O00OO(var9, var10), O00000000O, O00000000O0, 30.0F, 30.0F, 1, 15, false);
      } else {
         O00000000();
      }
   }

   private static boolean O00000000(Vec3d vec3d, Box box) {
      double var2 = vec3d.x - MathHelper.clamp(vec3d.x, box.minX, box.maxX);
      double var4 = vec3d.z - MathHelper.clamp(vec3d.z, box.minZ, box.maxZ);
      return Math.sqrt(var2 * var2 + var4 * var4) < 0.95F;
   }

   private static float O000000000() {
      float var0 = O000000000OO00 - O000000000O0OO;
      float var1 = O000000000OO0O - O000000000OO;
      float var2 = O000000000OOO - O000000000OO0;
      return (float)Math.sqrt(var0 * var0 + var1 * var1 + var2 * var2);
   }

   private static Vec3d O00000000(Box box) {
      double var1 = box.minX + (box.maxX - box.minX) * O000000000O0OO;
      double var3 = box.minY + (box.maxY - box.minY) * O000000000OO;
      double var5 = box.minZ + (box.maxZ - box.minZ) * O000000000OO0;
      return new Vec3d(var1, var3, var5);
   }

   private static void O00000000(Box box, Vec3d vec3d, long l, boolean bl) {
      O000000000OOOO = l + O00000000(bl ? 360L : 280L, bl ? 760L : 640L);
      O000000000OOO0 = (float)ThreadLocalRandom.current().nextDouble(bl ? 0.15 : 0.18, bl ? 0.28 : 0.36);
      float var5 = bl ? 0.24F : 0.4F;
      O00000000(bl);
      List var6 = O000000O0O000.O00000000(box);
      if (var6 != null && !var6.isEmpty()) {
         double var7 = box.maxX - box.minX;
         double var9 = box.maxY - box.minY;
         double var11 = box.maxZ - box.minZ;
         if (bl) {
            float var13 = a_.player.getYaw();
            float var14 = a_.player.getPitch();
            float var15 = 0.5F;
            float var16 = 0.5F;
            float var17 = 0.5F;
            float var18 = Float.MAX_VALUE;
            boolean var19 = false;

            for (int var20 = 0; var20 < 14; var20++) {
               Vec3d var21 = (Vec3d)var6.get(ThreadLocalRandom.current().nextInt(var6.size()));
               float var22 = O00000000(var7 <= 1.0E-4 ? 0.5F : (float)((var21.x - box.minX) / var7), var5);
               float var23 = O00000000(O00000000(var9 <= 1.0E-4 ? 0.5F : (float)((var21.y - box.minY) / var9), var5));
               float var24 = O00000000(var11 <= 1.0E-4 ? 0.5F : (float)((var21.z - box.minZ) / var11), var5);
               float var25 = O00000000(box, vec3d, var22, var23, var24, var13, var14);
               if (!O00000000(var22, var23, var24) && var25 < 65.0F) {
                  O000000000OO00 = var22;
                  O000000000OO0O = var23;
                  O000000000OOO = var24;
                  O000000000(var22, var23, var24);
                  return;
               }

               if (var25 < var18) {
                  var18 = var25;
                  var15 = var22;
                  var16 = var23;
                  var17 = var24;
                  var19 = true;
               }
            }

            if (var19) {
               O000000000OO00 = var15;
               O000000000OO0O = var16;
               O000000000OOO = var17;
               O000000000(O000000000OO00, O000000000OO0O, O000000000OOO);
               return;
            }
         } else {
            for (int var26 = 0; var26 < 12; var26++) {
               Vec3d var27 = (Vec3d)var6.get(ThreadLocalRandom.current().nextInt(var6.size()));
               float var28 = O00000000(var7 <= 1.0E-4 ? 0.5F : (float)((var27.x - box.minX) / var7), var5);
               float var29 = O00000000(var9 <= 1.0E-4 ? 0.5F : (float)((var27.y - box.minY) / var9), var5);
               float var30 = O00000000(var11 <= 1.0E-4 ? 0.5F : (float)((var27.z - box.minZ) / var11), var5);
               if (!O00000000(var28, var29, var30)) {
                  O000000000OO00 = var28;
                  O000000000OO0O = var29;
                  O000000000OOO = var30;
                  O000000000(var28, var29, var30);
                  return;
               }
            }
         }

         O00000000(box, (Vec3d)var6.get(ThreadLocalRandom.current().nextInt(var6.size())), var5, bl);
         O000000000(O000000000OO00, O000000000OO0O, O000000000OOO);
      } else {
         O00000000(box, O000000O0O000.O00000000(box, false), var5, bl);
         O000000000(O000000000OO00, O000000000OO0O, O000000000OOO);
      }
   }

   private static float O00000000(Box box, Vec3d vec3d, float f, float g, float h, float i, float j) {
      double var7 = box.minX + (box.maxX - box.minX) * f;
      double var9 = box.minY + (box.maxY - box.minY) * g;
      double var11 = box.minZ + (box.maxZ - box.minZ) * h;
      double var13 = var7 - vec3d.x;
      double var15 = var9 - vec3d.y;
      double var17 = var11 - vec3d.z;
      float var19 = (float)Math.toDegrees(Math.atan2(-var13, var17));
      float var20 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var15, Math.hypot(var13, var17))), -89.0, 89.0);
      float var21 = Math.abs(MathHelper.wrapDegrees(var19 - i));
      float var22 = Math.abs(var20 - j);
      return var21 * 1.25F + var22 * 0.9F;
   }

   private static float O00000000(float f) {
      return MathHelper.clamp(f, 0.34F, 0.7F);
   }

   private static void O00000000(boolean bl) {
      float var1 = bl ? 0.85F : 1.0F;
      O00000000O00 = (float)ThreadLocalRandom.current().nextDouble(20.0, 42.0) * var1;
      O00000000O000 = (float)ThreadLocalRandom.current().nextDouble(5.0, 10.0) * var1;
   }

   private static float O00000000(float f, float g) {
      double var2 = (ThreadLocalRandom.current().nextDouble() - ThreadLocalRandom.current().nextDouble()) * g;
      return MathHelper.clamp(f + (float)var2, 0.05F, 0.95F);
   }

   private static void O00000000(Box box, Vec3d vec3d, float f, boolean bl) {
      double var4 = box.maxX - box.minX;
      double var6 = box.maxY - box.minY;
      double var8 = box.maxZ - box.minZ;
      O000000000OO00 = O00000000(var4 <= 1.0E-4 ? 0.5F : (float)MathHelper.clamp((vec3d.x - box.minX) / var4, 0.0, 1.0), f);
      float var10 = O00000000(var6 <= 1.0E-4 ? 0.5F : (float)MathHelper.clamp((vec3d.y - box.minY) / var6, 0.0, 1.0), f);
      O000000000OO0O = bl ? O00000000(var10) : var10;
      O000000000OOO = O00000000(var8 <= 1.0E-4 ? 0.5F : (float)MathHelper.clamp((vec3d.z - box.minZ) / var8, 0.0, 1.0), f);
   }

   private static boolean O00000000(float f, float g, float h) {
      for (int var3 = 0; var3 < O000000000O0O; var3++) {
         float var4 = f - O000000000O00[var3];
         float var5 = g - O000000000O000[var3];
         float var6 = h - O000000000O00O[var3];
         if (var4 * var4 + var5 * var5 + var6 * var6 < 0.0784F) {
            return true;
         }
      }

      return false;
   }

   private static void O000000000(float f, float g, float h) {
      O000000000O00[O000000000O0O0] = f;
      O000000000O000[O000000000O0O0] = g;
      O000000000O00O[O000000000O0O0] = h;
      O000000000O0O0 = (O000000000O0O0 + 1) % 6;
      if (O000000000O0O < 6) {
         O000000000O0O++;
      }
   }

   private static void O0000000000() {
      O000000000O0O = 0;
      O000000000O0O0 = 0;
   }

   private static long O00000000(long l, long m) {
      return ThreadLocalRandom.current().nextLong(l, m);
   }

   public static void O00000000() {
      O000000000O0 = Integer.MIN_VALUE;
      O0000000000();
   }

   private static void O00000000000() {
      O00000000();
      O00000000O = 31.0F;
      O00000000O0 = 7.5F;
      O00000000O00 = O00000000O;
      O00000000O000 = O00000000O0;
      O000000000OOOO = 0L;
   }
}
