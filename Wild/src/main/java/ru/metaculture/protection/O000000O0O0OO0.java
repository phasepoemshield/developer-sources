package ru.metaculture.protection;

import net.minecraft.client.render.Camera;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.wild.mixin.acceser.GameRendererAccessor;

public final class O000000O0O0OO0 implements MinecraftAccessor {
   private O000000O0O0OO0() {
   }

   public static double O00000000(LivingEntity livingEntity) {
      if (a_.player != null && livingEntity != null) {
         Vec3d var1 = a_.player.getEyePos();
         Vec3d var2 = O00000000();
         Box var3 = livingEntity.getBoundingBox();
         double var4 = var3.minX;
         double var6 = var3.minY;
         double var8 = var3.minZ;
         double var10 = var3.maxX;
         double var12 = var3.maxY;
         double var14 = var3.maxZ;
         double var16 = (var4 + var10) * 0.5;
         double var18 = (var8 + var14) * 0.5;
         double var20 = 180.0;

         for (int var22 = 0; var22 < 2; var22++) {
            double var23 = var22 == 0 ? var4 : var10;

            for (int var25 = 0; var25 < 2; var25++) {
               double var26 = var25 == 0 ? var6 : var12;

               for (int var28 = 0; var28 < 2; var28++) {
                  double var29 = var28 == 0 ? var8 : var14;
                  var20 = Math.min(var20, O00000000(var1, var2, new Vec3d(var23, var26, var29)));
               }
            }
         }

         var20 = Math.min(var20, O00000000(var1, var2, var3.getCenter()));
         var20 = Math.min(var20, O00000000(var1, var2, new Vec3d(var16, livingEntity.getEyeY(), var18)));
         var20 = Math.min(var20, O00000000(var1, var2, new Vec3d(var16, var12, var18)));
         var20 = Math.min(var20, O00000000(var1, var2, new Vec3d(var16, var6, var18)));
         var20 = Math.min(var20, O00000000(var1, var2, new Vec3d(var4, O00000000(var3), var18)));
         var20 = Math.min(var20, O00000000(var1, var2, new Vec3d(var10, O00000000(var3), var18)));
         var20 = Math.min(var20, O00000000(var1, var2, new Vec3d(var16, O00000000(var3), var8)));
         return Math.min(var20, O00000000(var1, var2, new Vec3d(var16, O00000000(var3), var14)));
      } else {
         return 180.0;
      }
   }

   public static boolean O00000000(LivingEntity livingEntity, float f) {
      return livingEntity != null && !(f <= 0.0F) ? O00000000(livingEntity) <= f * 0.5F : false;
   }

   public static float O00000000(float f, int i) {
      if (a_ != null && a_.gameRenderer != null && i > 0 && !(f <= 0.0F)) {
         Camera var2 = a_.gameRenderer.getCamera();
         float var3 = ((GameRendererAccessor)a_.gameRenderer).invokeGetFov(var2, 1.0F, true);
         float var4 = i * 0.5F;
         float var5 = (float)Math.toRadians(var3 * 0.5F);
         float var6 = (float)Math.toRadians(f * 0.5F);
         return var5 <= 1.0E-4F ? 0.0F : var4 / (float)Math.tan(var5) * (float)Math.tan(var6);
      } else {
         return 0.0F;
      }
   }

   public static void O00000000(RenderManager o0000O00OO0O0, float f, int i, int j) {
      if (o0000O00OO0O0 != null && i > 0 && j > 0) {
         float var4 = O00000000(f, j);
         if (!(var4 <= 1.0F)) {
            float var5 = i * 0.5F;
            float var6 = j * 0.5F;
            int var7 = O00000000(255, 255, 255, 210);
            o0000O00OO0O0.O00000000(var5 - var4, var6 - var4, var4 * 2.0F, var4 * 2.0F, var4, var7, 1.2F);
         }
      }
   }

   private static Vec3d O00000000() {
      if (a_.gameRenderer != null && a_.gameRenderer.getCamera() != null) {
         Camera var0 = a_.gameRenderer.getCamera();
         Vector3f var1 = new Vector3f(0.0F, 0.0F, -1.0F);
         new Quaternionf(var0.getRotation()).transform(var1);
         return new Vec3d(var1.x, var1.y, var1.z).normalize();
      } else {
         return a_.player != null ? a_.player.getRotationVec(1.0F).normalize() : new Vec3d(0.0, 0.0, 1.0);
      }
   }

   private static double O00000000(Box box) {
      return (box.minY + box.maxY) * 0.5;
   }

   private static double O00000000(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
      Vec3d var3 = vec3d3.subtract(vec3d);
      double var4 = var3.length();
      if (var4 < 1.0E-6) {
         return 0.0;
      } else {
         var3 = var3.multiply(1.0 / var4);
         double var6 = MathHelper.clamp(vec3d2.dotProduct(var3), -1.0, 1.0);
         return Math.toDegrees(Math.acos(var6));
      }
   }

   private static int O00000000(int i, int j, int k, int l) {
      return (l & 0xFF) << 24 | (i & 0xFF) << 16 | (j & 0xFF) << 8 | k & 0xFF;
   }
}
