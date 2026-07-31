package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class O000000OO0 implements MinecraftAccessor {
   private static int O00000000;
   private static int O000000000 = -1;
   private static int O0000000000;
   private static long O00000000000;
   private static boolean O000000000000;
   private static long O0000000000000;
   private static int O000000000000O;
   private static long O00000000000O;

   private O000000OO0() {
   }

   public static void O00000000(LivingEntity livingEntity) {
      if (a_.player != null && a_.world != null && livingEntity != null) {
         O000000OO00 var1 = O000000OO00.O00000000();
         long var2 = System.currentTimeMillis();
         if (O000000000 != livingEntity.getId()) {
            O000000000 = livingEntity.getId();
            O00000000 = 0;
            O0000000000 = 0;
            O00000000000 = 0L;
         }

         if (var1.O00000000000O != null && !var1.O00000000000O.equals("Custom")) {
            O00000000(var1, livingEntity, var2);

            try {
               boolean var20 = O0000000000(livingEntity);
               float[] var21 = O00000000(var1, var20);
               int var22 = Math.round(var1.O000000000O0O);
               O000000O0O0O0.O00000000(
                  new O000000O0O0O0.W37(var21[0], var21[1], var22, var22, var1.O000000000O0O0), () -> O00000000(var1.O00000000000O, livingEntity)
               );
            } finally {
               O000000O0O0O.O000000000();
            }
         } else {
            Vec3d var4 = O00000000(livingEntity, var1, var2);
            Vec3d var5 = var4.subtract(a_.player.getEyePos());
            float var6 = (float)Math.toDegrees(Math.atan2(-var5.x, var5.z));
            float var7 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var5.y, Math.hypot(var5.x, var5.z))), -90.0, 90.0);
            boolean var8 = O0000000000(livingEntity);
            if ("Static".equals(var1.O000000000OO0)) {
               var7 *= 0.4F;
            } else if ("Locked".equals(var1.O000000000OO0)) {
               var7 = 0.0F;
            }

            if (var1.O00000000O000 && O00000000(var2, var1)) {
               var7 = -var1.O00000000O0000;
            }

            float var9 = (float)(Math.cos(var2 / 40.0) * var1.O0000000000OOO) + O00000000(-var1.O0000000000OOO, var1.O0000000000OOO) * 0.5F;
            float var10 = (float)(Math.sin(var2 / 70.0) * var1.O000000000O) + O00000000(-var1.O000000000O, var1.O000000000O) * 0.5F;
            float var11 = var6 + var1.O000000000OO00 + var9;
            float var12 = var7 + var1.O000000000OO0O + var10;
            var12 = MathHelper.clamp(var12, var1.O000000000OOO, var1.O000000000OOO0);
            var12 = MathHelper.clamp(var12, -90.0F, 90.0F);
            float[] var13 = O00000000(var1, var8);
            float var14 = var13[0];
            float var15 = var13[1];
            O000000O0O00OO var16 = new O000000O0O00OO(var11, var12);
            int var17 = Math.round(var1.O000000000O0O);
            O000000O0O0O0.O00000000(var16, var14, var15, var17, var17, ThreadLocalRandom.current().nextInt(1, 3), 5, var1.O000000000O0O0);
         }
      }
   }

   private static void O00000000(O000000OO00 o000000OO00, LivingEntity livingEntity, long l) {
      O000000O0O0O.O000000000();
      O000000O0O0O.O00000000 = true;
      float var4 = o000000OO00.O000000000OO00;
      float var5 = o000000OO00.O000000000OO0O;
      boolean var6 = o000000OO00.O00000000O00O != null && !o000000OO00.O00000000O00O.isEmpty()
         || !"Multipoint".equals(o000000OO00.O00000000000OO)
         || o000000OO00.O000000000O00O > 0.001F
         || o000000OO00.O000000000OOOO > 0.001F;
      if (var6) {
         Box var7 = livingEntity.getBoundingBox();
         Vec3d var8 = O000000O0O000.O00000000(var7, false);
         Vec3d var9 = O00000000(livingEntity, var7, o000000OO00, l);
         float[] var10 = O00000000(var8);
         float[] var11 = O00000000(var9);
         var4 += MathHelper.wrapDegrees(var11[0] - var10[0]);
         var5 += var11[1] - var10[1];
      }

      O000000O0O0O.O00000000000 = o000000OO00.O000000000OOO;
      O000000O0O0O.O000000000000 = o000000OO00.O000000000OOO0;
      O000000O0O0O.O00000000(var4 * o000000OO00.O00000000O0, var5 * o000000OO00.O00000000O0, o000000OO00.O00000000O);
   }

   private static float[] O00000000(Vec3d vec3d) {
      Vec3d var1 = vec3d.subtract(a_.player.getEyePos());
      float var2 = (float)Math.toDegrees(Math.atan2(-var1.x, var1.z));
      float var3 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var1.y, Math.hypot(var1.x, var1.z))), -90.0, 90.0);
      return new float[]{var2, var3};
   }

   private static Vec3d O00000000(LivingEntity livingEntity, Box box, O000000OO00 o000000OO00, long l) {
      Vec3d var5;
      if (o000000OO00.O00000000O00O != null && !o000000OO00.O00000000O00O.isEmpty()) {
         var5 = O000000000(livingEntity, box, o000000OO00, l);
      } else {
         String var6 = o000000OO00.O00000000000OO;

         var5 = switch (var6) {
            case "Center" -> box.getCenter();
            case "Eyes" -> new Vec3d(livingEntity.getX(), livingEntity.getEyeY(), livingEntity.getZ());
            case "Closest" -> O000000O0O.O00000000(a_.player.getEyePos(), livingEntity);
            default -> O000000O0O000.O00000000(box, false);
         };
      }

      double var13 = 0.0;
      double var8 = 0.0;
      if (o000000OO00.O000000000O00O > 0.001F) {
         Vec3d var10 = O000000000(livingEntity);
         double var11 = o000000OO00.O000000000O00O * Math.sin(l / 300.0);
         var13 = var10.x * var11;
         var8 = var10.z * var11;
      }

      Vec3d var14 = var5.add(var13, 0.0, var8);
      if (o000000OO00.O000000000OOOO > 0.001F) {
         Vec3d var15 = livingEntity.getVelocity();
         var14 = var14.add(var15.x * o000000OO00.O000000000OOOO * 3.0, 0.0, var15.z * o000000OO00.O000000000OOOO * 3.0);
      }

      return var14;
   }

   private static void O00000000(String string, LivingEntity livingEntity) {
      switch (string) {
         case "FunTime":
            O000000O0O0OOO.O00000000(livingEntity);
            break;
         case "Smooth":
            O000000O0OO0.O00000000(livingEntity);
            break;
         default:
            float[] var4 = AttackAura.O000000000(livingEntity);
            float[] var5 = new float[]{var4[0], var4[1], var4[0] + var4[1]};
            boolean var6 = O000000O00OOOO.O00000000(livingEntity, false, true, true, -50L, var5);
            switch (string) {
               case "Snap":
                  O000000O0OO0OO.O00000000(livingEntity, var6, "Fast");
                  break;
               case "Holy":
                  O000000O0OO0OO.O000000000(livingEntity, var6);
                  break;
               case "Spooky":
                  O000000O0OO0OO.O00000000(livingEntity, var6);
                  break;
               case "Matrix":
                  if (O0000O00O00O0.O00000000("spookytime")) {
                     O000000O0OO0OO.O00000000(livingEntity, var6);
                  } else if (O0000O00O00O0.O00000000("holy")) {
                     O000000O0OO0OO.O000000000(livingEntity, var6);
                  } else if (O0000O00O00O0.O00000000("ares")) {
                     O000000O0OO0OO.O0000000000(livingEntity, var6);
                  } else {
                     O000000O0OO0OO.O00000000(livingEntity, var6);
                  }
            }
      }
   }

   private static boolean O00000000(long l, O000000OO00 o000000OO00) {
      long var3 = (long)(o000000OO00.O00000000O000O * 1000.0F);
      if (!O000000000000 && l - O00000000000O >= var3) {
         O000000000000 = true;
         O0000000000000 = l;
         O000000000000O = ThreadLocalRandom.current().nextInt(200, 320);
         O00000000000O = l;
      }

      if (O000000000000 && l - O0000000000000 >= O000000000000O) {
         O000000000000 = false;
      }

      return O000000000000;
   }

   private static Vec3d O00000000(LivingEntity livingEntity, O000000OO00 o000000OO00, long l) {
      Box var4 = livingEntity.getBoundingBox();
      Vec3d var5;
      if (o000000OO00.O00000000O00O != null && !o000000OO00.O00000000O00O.isEmpty()) {
         var5 = O000000000(livingEntity, var4, o000000OO00, l);
      } else {
         String var6 = o000000OO00.O00000000000OO;

         var5 = switch (var6) {
            case "Center" -> var4.getCenter();
            case "Eyes" -> new Vec3d(livingEntity.getX(), livingEntity.getEyeY(), livingEntity.getZ());
            case "Closest" -> O000000O0O.O00000000(a_.player.getEyePos(), livingEntity);
            default -> O000000O0O000.O00000000(var4, false);
         };
      }

      double var19 = Math.max(0.2, (double)o000000OO00.O000000000O000);
      double var8 = o000000OO00.O000000000O0 * Math.sin(l / (250.0 / var19));
      double var10 = o000000OO00.O000000000O00 * Math.cos(l / (520.0 / var19));
      double var12 = 0.0;
      double var14 = 0.0;
      if (o000000OO00.O000000000O00O > 0.001F) {
         Vec3d var16 = O000000000(livingEntity);
         double var17 = o000000OO00.O000000000O00O * Math.sin(l / 300.0);
         var12 = var16.x * var17;
         var14 = var16.z * var17;
      }

      Vec3d var20 = var5.add(var8 + var12, var10, var14);
      if (o000000OO00.O000000000OOOO > 0.001F) {
         Vec3d var21 = livingEntity.getVelocity();
         var20 = var20.add(var21.x * o000000OO00.O000000000OOOO * 3.0, 0.0, var21.z * o000000OO00.O000000000OOOO * 3.0);
      }

      return var20;
   }

   private static Vec3d O000000000(LivingEntity livingEntity, Box box, O000000OO00 o000000OO00, long l) {
      int var5 = o000000OO00.O00000000O00O.size();
      long var6 = (long)(o000000OO00.O000000000OO * 1000.0F / Math.max(0.1F, o000000OO00.O00000000O00));
      if ("Cycle".equals(o000000OO00.O000000000O0OO)) {
         if (l >= O00000000000) {
            O0000000000 = (O0000000000 + 1) % var5;
            O00000000000 = l + var6;
         }

         return O00000000(livingEntity, box, o000000OO00.O00000000O00O.get(Math.min(O0000000000, var5 - 1)));
      } else if ("Random".equals(o000000OO00.O000000000O0OO)) {
         if (l >= O00000000000) {
            O0000000000 = ThreadLocalRandom.current().nextInt(var5);
            O00000000000 = l + var6;
         }

         return O00000000(livingEntity, box, o000000OO00.O00000000O00O.get(Math.min(O0000000000, var5 - 1)));
      } else {
         Vec3d var8 = a_.player.getEyePos();
         Vec3d var9 = a_.player.getRotationVec(1.0F).normalize();
         Vec3d var10 = null;
         double var11 = Double.MAX_VALUE;

         for (O000000OO00.W44 var14 : o000000OO00.O00000000O00O) {
            Vec3d var15 = O00000000(livingEntity, box, var14);
            Vec3d var16 = var15.subtract(var8).normalize();
            double var17 = Math.acos(MathHelper.clamp(var9.dotProduct(var16), -1.0, 1.0));
            if (var17 < var11) {
               var11 = var17;
               var10 = var15;
            }
         }

         return var10 != null ? var10 : box.getCenter();
      }
   }

   private static Vec3d O00000000(LivingEntity livingEntity, Box box, O000000OO00.W44 o00000000) {
      Vec3d var3 = O000000000(livingEntity);
      double var4 = (box.minX + box.maxX) * 0.5;
      double var6 = (box.minZ + box.maxZ) * 0.5;
      double var8 = box.maxX - box.minX;
      double var10 = box.maxY - box.minY;
      return new Vec3d(var4 + var3.x * (o00000000.O00000000 * var8), box.minY + o00000000.O000000000 * var10, var6 + var3.z * (o00000000.O00000000 * var8));
   }

   private static Vec3d O000000000(LivingEntity livingEntity) {
      Vec3d var1 = livingEntity.getPos().subtract(a_.player.getPos());
      double var2 = Math.hypot(var1.x, var1.z);
      return var2 < 1.0E-4 ? new Vec3d(1.0, 0.0, 0.0) : new Vec3d(-var1.z / var2, 0.0, var1.x / var2);
   }

   private static boolean O0000000000(LivingEntity livingEntity) {
      float[] var1 = AttackAura.O000000000(livingEntity);
      float[] var2 = new float[]{var1[0], var1[1], var1[0] + var1[1]};
      boolean var3 = O000000O00OOOO.O00000000(livingEntity, false, true, true, -50L, var2);
      if (var3 && O000000O0O.O00000000((Entity)livingEntity) < AttackAura.O00000000(livingEntity)) {
         O00000000 = 2;
      }

      if (O00000000 <= 0) {
         return false;
      } else {
         O00000000--;
         return true;
      }
   }

   private static float[] O00000000(O000000OO00 o000000OO00, boolean bl) {
      float var2 = bl ? o000000OO00.O0000000000OO : O00000000(o000000OO00.O0000000000O, o000000OO00.O0000000000O0);
      float var3 = bl ? o000000OO00.O0000000000OO0 : O00000000(o000000OO00.O0000000000O00, o000000OO00.O0000000000O0O);
      if ("Static".equals(o000000OO00.O000000000OO0)) {
         var3 *= 0.3F;
      }

      return new float[]{var2, var3};
   }

   private static float O00000000(float f, float g) {
      if (g < f) {
         float var2 = f;
         f = g;
         g = var2;
      }

      return g == f ? f : f + ThreadLocalRandom.current().nextFloat() * (g - f);
   }
}
