package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector2f;
import org.joml.Vector4f;

public final class O000000O0O implements MinecraftAccessor {
   public static double O00000000(Entity entity) {
      return O000000000(entity).length();
   }

   public static O000000O0O00OO O00000000() {
      return new O000000O0O00OO(a_.player.getYaw(), a_.player.getPitch());
   }

   public static boolean O00000000(Entity entity, float f, boolean bl) {
      return O00000000(entity) < f;
   }

   public static Vec3d O000000000(Entity entity) {
      Vec3d var1 = a_.player.getEyePos();
      return O00000000(var1, entity).subtract(var1);
   }

   public static Vec3d O00000000(Vec3d vec3d, Box box) {
      return new Vec3d(
         O0000O00OO0OO0.O00000000000(vec3d.x, box.minX, box.maxX),
         O0000O00OO0OO0.O00000000000(vec3d.y, box.minY, box.maxY),
         O0000O00OO0OO0.O00000000000(vec3d.z, box.minZ, box.maxZ)
      );
   }

   public static Vec3d O00000000(Vec3d vec3d, Entity entity) {
      return O00000000(vec3d, entity.getBoundingBox());
   }

   public static Vec3d O00000000(LivingEntity livingEntity) {
      double var1 = livingEntity.getWidth() / 2.0F;
      double var3 = MathHelper.clamp(livingEntity.getY() - 6.0, 0.0, livingEntity.getHeight());
      double var5 = MathHelper.clamp(a_.player.getX() - livingEntity.getX(), -var1, var1);
      double var7 = MathHelper.clamp(a_.player.getZ() - livingEntity.getZ(), -var1, var1);
      return new Vec3d(
         livingEntity.getX() - a_.player.getX() + var5, livingEntity.getY() - a_.player.getY() - 0.8F, livingEntity.getZ() - a_.player.getZ() + var7
      );
   }

   public static Vec3d O000000000(LivingEntity livingEntity) {
      double var1 = MathHelper.clamp(livingEntity.getY() - livingEntity.getY(), 0.0, livingEntity.getHeight());
      double var3 = MathHelper.clamp(a_.player.getX() - livingEntity.getX(), 0.0, 0.0);
      double var5 = MathHelper.clamp(a_.player.getZ() - livingEntity.getZ(), 0.0, 0.0);
      return new Vec3d(
         livingEntity.getX() - a_.player.getX() + var3, livingEntity.getY() - a_.player.getY() - 0.8F, livingEntity.getZ() - a_.player.getZ() + var5
      );
   }

   public static Vec3d O0000000000(LivingEntity livingEntity) {
      double var1 = MathHelper.clamp(livingEntity.getEyeY() - livingEntity.getY(), 0.0, livingEntity.getHeight());
      double var3 = MathHelper.clamp(a_.player.getX() - livingEntity.getX(), 0.0, 0.0);
      double var5 = MathHelper.clamp(a_.player.getZ() - livingEntity.getZ(), 0.0, 0.0);
      return new Vec3d(
         livingEntity.getX() - a_.player.getX() + var3, livingEntity.getY() - a_.player.getEyeY() + var1, livingEntity.getZ() - a_.player.getZ() + var5
      );
   }

   public static Vec3d O00000000000(LivingEntity livingEntity) {
      double var1 = livingEntity.getWidth() / 2.0F;
      double var3 = MathHelper.clamp(livingEntity.getEyeY() - livingEntity.getY(), 0.0, livingEntity.getHeight());
      double var5 = MathHelper.clamp(a_.player.getX() - livingEntity.getX(), -var1, var1);
      double var7 = MathHelper.clamp(a_.player.getZ() - livingEntity.getZ(), -var1, var1);
      return new Vec3d(
         livingEntity.getX() - a_.player.getX() + var5, livingEntity.getY() - a_.player.getEyeY() + var3, livingEntity.getZ() - a_.player.getZ() + var7
      );
   }

   public static double O00000000(float f, float g, float h) {
      if (g < 0.0F) {
         f += 180.0F;
      }

      float var3 = 1.0F;
      if (g < 0.0F) {
         var3 = -0.5F;
      }

      if (g > 0.0F) {
         var3 = 0.5F;
      }

      if (h > 0.0F) {
         f -= 90.0F * var3;
      }

      if (h < 0.0F) {
         f += 90.0F * var3;
      }

      return Math.toRadians(f);
   }

   public static Vec3d O00000000(Vec3d vec3d, Entity entity, float f) {
      if (entity == null) {
         return Vec3d.ZERO;
      } else {
         Box var3 = entity.getBoundingBox().expand(-f);
         Vec3d var4 = var3.getCenter();
         Vec3d var5 = null;
         double var6 = Double.MAX_VALUE;

         for (double var8 = 0.0; var8 <= (var3.maxX - var3.minX) / 2.0; var8 += 0.1) {
            for (double var10 = 0.0; var10 <= (var3.maxY - var3.minY) / 2.0; var10 += 0.1) {
               for (double var12 = 0.0; var12 <= (var3.maxZ - var3.minZ) / 2.0; var12 += 0.1) {
                  for (int var17 : new int[]{-1, 1}) {
                     for (int var21 : new int[]{-1, 1}) {
                        for (int var25 : new int[]{-1, 1}) {
                           double var26 = var4.x + var17 * var8;
                           double var28 = var4.y + var21 * var10;
                           double var30 = var4.z + var25 * var12;
                           Vec3d var32 = new Vec3d(var26, var28, var30);
                           Vector2f var33 = O00000000(var32);
                           if (O000000O0O00.O00000000(6.0, var33.x, var33.y, a_.player, false) instanceof EntityHitResult var35
                              && var35.getEntity().equals(entity)) {
                              double var36 = vec3d.distanceTo(var32);
                              if (var36 < var6) {
                                 var6 = var36;
                                 var5 = var32;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (var5 != null) {
            return var5;
         } else {
            double var38 = O0000O00OO0OO0.O00000000000(vec3d.x, var3.minX, var3.maxX);
            double var39 = O0000O00OO0OO0.O00000000000(vec3d.y, var3.minY, var3.maxY);
            double var40 = O0000O00OO0OO0.O00000000000(vec3d.z, var3.minZ, var3.maxZ);
            return new Vec3d(var38, var39, var40);
         }
      }
   }

   public static Vector2f O00000000(Vec3d vec3d) {
      return O00000000(a_.player.getPos().add(0.0, a_.player.getEyeY(), 0.0), vec3d);
   }

   public static Vector2f O00000000(Vec3d vec3d, Vec3d vec3d2) {
      double var2 = 180.0 / Math.PI;
      Vec3d var4 = vec3d2.subtract(vec3d);
      double var5 = Math.hypot(var4.x, var4.z);
      float var7 = (float)(O0000O00OO0OO0.O0000000000(var4.z, var4.x) * (180.0 / Math.PI)) - 90.0F;
      float var8 = (float)(-(O0000O00OO0OO0.O0000000000(var4.y, var5) * (180.0 / Math.PI)));
      return new Vector2f(var7, var8);
   }

   public static Vec3d O0000000000(Entity entity) {
      float var1 = a_.getRenderTickCounter().getTickProgress(false);
      return O00000000(a_.player.getCameraPosVec(var1), entity, Math.min(entity.getWidth(), entity.getHeight()) / 4.0F);
   }

   public static Vector4f O000000000000(LivingEntity livingEntity) {
      float var1 = a_.getRenderTickCounter().getTickProgress(false);
      Vec3d var2 = a_.player.getCameraPosVec(var1);
      Vec3d var3 = O0000000000((Entity)livingEntity).subtract(var2);
      float var4 = O0000O00OO0OO0.O000000000000O((float)(Math.toDegrees(Math.atan2(var3.z, var3.x)) - 90.0));
      float var5 = (float)(-Math.toDegrees(Math.atan2(var3.y, Math.sqrt(var3.x * var3.x + var3.z * var3.z))));
      float var6 = O0000O00OO0OO0.O000000000000O(var4 - a_.player.getYaw());
      float var7 = var5 - a_.player.getPitch();
      return new Vector4f(var4, var5, var6, var7);
   }

   public static double O0000000000000(LivingEntity livingEntity) {
      Vector4f var1 = O000000000000(livingEntity);
      float var2 = var1.z;
      float var3 = var1.w;
      return Math.sqrt(var2 * var2 + var3 * var3);
   }

   @Generated
   private O000000O0O() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
