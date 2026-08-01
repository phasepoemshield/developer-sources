package ru.metaculture.protection;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Axis;

public final class O000000O0OO0OO implements MinecraftAccessor {
   static int O00000000;
   static float O000000000;
   static O0000O00O0000 O0000000000 = new O0000O00O0000();
   static O0000O00O0000 O00000000000 = new O0000O00O0000();

   public static void O00000000(LivingEntity livingEntity, boolean bl, float f, boolean bl2) {
      long var4 = System.currentTimeMillis();
      if (!AttackAura.O00000000OO0O && var4 - AttackAura.O00000000OO000 >= AttackAura.O00000000OO00O) {
         AttackAura.O00000000OO0O = true;
         AttackAura.O00000000OO0O0 = var4;
         AttackAura.O00000000OO0OO = ThreadLocalRandom.current().nextInt(270, 390);
         AttackAura.O00000000OO000 = var4;
         AttackAura.O00000000OO00O = ThreadLocalRandom.current().nextLong(6500L, 7200L);
      }

      boolean var6 = false;
      if (AttackAura.O00000000OO0O && var4 - AttackAura.O00000000OO0O0 >= AttackAura.O00000000OO0OO) {
         AttackAura.O00000000OO0O = false;
      }

      if (var4 - AttackAura.O00000000OO0O0 >= AttackAura.O00000000OO0OO + 40L) {
         var6 = true;
      }

      Vec3d var7 = a_.player.getEyePos();
      float var8 = (float)Math.cos(System.currentTimeMillis() / 450.0);
      float var9 = 0.06F * var8;
      float var10 = (float)Math.cos(System.currentTimeMillis() / 500.0);
      float var11 = 0.06F * var10;
      float var12 = (float)Math.cos(System.currentTimeMillis() / 14000.0);
      float var13 = (float)Math.cos(System.currentTimeMillis() / 2500L);
      float var14 = 0.5F * var12;
      Vec3d var15 = O000000O0O.O000000000(livingEntity);
      float var16 = O000000O0O00O.O0000000000;
      if (bl && O000000O0O.O00000000((Entity)livingEntity) < f && !bl2) {
         O000000000 = O0000O000OOOOO.O00000000000(6.0F, 7.0F);
      }

      float var17 = O0000O000OOOOO.O00000000000(22.0F, 28.0F);
      float var18 = 0.0F;
      float var19 = O0000O000OOOOO.O00000000000(0.0F, 3.5F);
      float var20 = (float)Math.cos(System.currentTimeMillis() / 40.0);
      float var21 = (float)Math.sin(System.currentTimeMillis() / 70.0);
      if (O000000000 > 0.0F) {
         var17 = O0000O000OOOOO.O00000000000(70.0F, 120.0F);
         var16 = (float)Math.toDegrees(Math.atan2(-var15.x, var15.z));
         var18 = (var20 + var21) * O00000000(1.0F, 2.0F);
         O000000000--;
      }

      float var22 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var15.y, Math.hypot(var15.x, var15.z))), -90.0, 90.0);
      float var23 = var20 * O00000000(13.0F, 15.0F) + var18;
      float var24 = var21 * O00000000(5.0F, 7.0F) + var18;
      float var26 = AttackAura.O00000000OO0O ? -O0000O000OOOOO.O00000000000(80.0F, 90.0F) : var22;
      O000000O0O00OO var27 = new O000000O0O00OO(var16 + var23, var26 + var24);
      O000000O0O0O0.O00000000(
         var27,
         var17,
         AttackAura.O00000000OO0O ? O00000000(120.0F, 170.0F) : (var6 ? O00000000(120.0F, 170.0F) : O00000000(6.0F, 8.0F)),
         25.0F,
         25.0F,
         0,
         15,
         false
      );
   }

   public static void O00000000(BlockPos blockPos, Direction direction) {
      Vec3d var2 = a_.player.getEyePos();
      double var3 = blockPos.getX() + 0.5 + direction.getOffsetX() * 0.5;
      double var5 = blockPos.getY() + 0.5 + direction.getOffsetY() * 0.5;
      double var7 = blockPos.getZ() + 0.5 + direction.getOffsetZ() * 0.5;
      if (direction.getAxis() != Axis.X) {
         var3 = MathHelper.clamp(var2.x, blockPos.getX() + 0.15, blockPos.getX() + 0.85);
      }

      if (direction.getAxis() != Axis.Y) {
         var5 = MathHelper.clamp(var2.y - 1.2, blockPos.getY() + 0.15, blockPos.getY() + 0.85);
      }

      if (direction.getAxis() != Axis.Z) {
         var7 = MathHelper.clamp(var2.z, blockPos.getZ() + 0.15, blockPos.getZ() + 0.85);
      }

      Vec3d var9 = new Vec3d(var3, var5, var7).subtract(var2);
      float var10 = (float)Math.toDegrees(Math.atan2(-var9.x, var9.z));
      float var11 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var9.y, Math.hypot(var9.x, var9.z))), -90.0, 90.0);
      O000000O0O0O0.O00000000(
         new O000000O0O00OO(var10, var11),
         O0000O000OOOOO.O00000000000(250.0F, 360.0F),
         O0000O000OOOOO.O00000000000(250.0F, 360.0F),
         180.0F,
         180.0F,
         0,
         5,
         false
      );
   }

   public static void O00000000(LivingEntity livingEntity) {
      Vec3d var1 = a_.player.getEyePos();
      Vec3d var2 = livingEntity.getPos().add(0.0, livingEntity.getHeight() * 0.8, 0.0);
      Vec3d var3 = var2.subtract(var1).normalize();
      float var4 = (float)Math.toDegrees(Math.atan2(-var3.x, var3.z));
      float var5 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var3.y, Math.hypot(var3.x, var3.z))), -90.0, 90.0);
      double var6 = Math.max(0.0, a_.player.getY() - livingEntity.getY());
      float var8;
      float var9;
      if (var6 > 2.5) {
         var8 = 15.0F;
         var9 = 10.0F;
      } else if (var6 > 1.0) {
         var8 = 45.0F;
         var9 = 35.0F;
      } else {
         var8 = 90.0F;
         var9 = 80.0F;
      }

      float var10 = ThreadLocalRandom.current().nextFloat(-1.0F, 1.0F);
      O000000O0O0O0.O00000000(new O000000O0O00OO(var4 + var10, var5 + var10), var8, var9, 30.0F, 30.0F, 1, 15, false);
   }

   public static float O00000000(float f, float g) {
      return O0000O0O00000.O00000000(g, f, new SecureRandom().nextFloat());
   }

   public static void O00000000(LivingEntity livingEntity, boolean bl) {
      Vec3d var2 = O000000O0O000.O00000000(livingEntity.getBoundingBox(), false);
      Vec3d var3 = var2.subtract(a_.player.getEyePos());
      float var4 = (float)Math.toDegrees(Math.atan2(-var3.x, var3.z));
      float var5 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var3.y, Math.hypot(var3.x, var3.z))), -89.0, 89.0);
      O000000O0O00OO var6 = new O000000O0O00OO(var4, var5);
      O000000O0O0O0.O00000000(var6, O0000O000OOOOO.O00000000(120, 180), O0000O000OOOOO.O00000000000(30.0F, 63.0F), 30.0F, 30.0F, 1, 15, false);
   }

   public static void O000000000(LivingEntity livingEntity, boolean bl) {
      float var2 = 0.3F * (float)Math.cos(System.currentTimeMillis() / 2200.0);
      float var3 = 0.03F * (float)Math.sin(System.currentTimeMillis() / 900.0) + 0.06F * (float)Math.cos(System.currentTimeMillis() / 1200.0);
      float var4 = 0.2F * (float)Math.cos(System.currentTimeMillis() / 700.0) + 0.04F * (float)Math.sin(System.currentTimeMillis() / 900.0);
      Vec3d var5 = a_.player.getEyePos();
      Vec3d var6 = livingEntity.getPos().add(var4, livingEntity.getHeight() - 0.35F - var2, var3).subtract(var5).normalize();
      boolean var7 = false;
      if (bl) {
         O00000000 = 4;
      }

      if (O00000000 > 0) {
         var7 = true;
         O00000000--;
      }

      float var8 = (float)Math.toDegrees(Math.atan2(-var6.x, var6.z));
      float var9 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var6.y, Math.hypot(var6.x, var6.z))), -90.0, 90.0);
      float var10 = 0.0F;
      if (var7) {
         var10 = (float)(3.0 * Math.sin(System.currentTimeMillis() / 30.0))
            + (float)(O0000O000OOOOO.O00000000(3, 4) * Math.cos(System.currentTimeMillis() / 60.0));
      }

      O000000O0O00OO var11 = new O000000O0O00OO(
         var8 + var10 + ThreadLocalRandom.current().nextFloat(-2.0F, 2.0F), var9 + ThreadLocalRandom.current().nextFloat(-2.0F, 2.0F) + var10
      );
      O000000O0O0O0.O00000000(
         var11,
         (float)O0000O000OOOOO.O00000000(50.0, 70.0, 70L, O0000000000),
         (float)O0000O000OOOOO.O00000000(10.0, 20.0, 65L, O00000000000),
         30.0F,
         30.0F,
         1,
         15,
         false
      );
   }

   public static void O0000000000(LivingEntity livingEntity, boolean bl) {
      Vec3d var2 = a_.player.getEyePos();
      Vec3d var3 = livingEntity.getPos().add(0.0, livingEntity.getHeight() / 2.0F, 0.0).subtract(var2).normalize();
      float var4 = (float)Math.toDegrees(Math.atan2(-var3.x, var3.z));
      float var5 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var3.y, Math.hypot(var3.x, var3.z))), -90.0, 90.0);
      float var6 = 180.0F;
      float var7 = 45.0F;
      O000000O0O00OO var8 = new O000000O0O00OO(
         var4 + ThreadLocalRandom.current().nextFloat(-2.0F, 2.0F), var5 + ThreadLocalRandom.current().nextFloat(-1.0F, 1.0F)
      );
      O000000O0O0O0.O00000000(var8, var7, var6, var7, var6, 0, 15, false);
   }

   public static void O00000000000(LivingEntity livingEntity, boolean bl) {
      float var2 = 0.02F * (float)Math.sin(System.currentTimeMillis() / 1200.0);
      float var3 = 0.03F * (float)Math.sin(System.currentTimeMillis() / 900.0) + 0.02F * (float)Math.cos(System.currentTimeMillis() / 1200.0);
      float var4 = 0.4F * (float)Math.cos(System.currentTimeMillis() / 700L) + 0.04F * (float)Math.sin(System.currentTimeMillis() / 900.0);
      Vec3d var5 = O000000O0O.O0000000000(livingEntity).add(var3, 0.0, var4);
      boolean var6 = false;
      if (bl) {
         O00000000 = 2;
      }

      if (O00000000 > 0) {
         var6 = true;
         O00000000--;
      }

      float var7 = (float)Math.toDegrees(Math.atan2(-var5.x, var5.z));
      float var8 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var5.y, Math.hypot(var5.x, var5.z))), -90.0, 90.0);
      float var9 = 0.0F;
      if (var6) {
         var9 = O0000O000OOOOO.O0000000000(-3.0F, 4.0F) + (float)(2.0 * Math.sin(System.currentTimeMillis() / 30.0));
      }

      float var10 = O0000O000OOOOO.O0000000000(-3.0F, 3.0F) + (float)(3.0 * Math.cos(System.currentTimeMillis() / 40.0));
      float var11 = O0000O000OOOOO.O0000000000(-1.0F, 1.0F) + (float)(4.0 * Math.sin(System.currentTimeMillis() / 240.0));
      O000000O0O00OO var12 = new O000000O0O00OO(var7 + var10 + var9, var8 + var11);
      O000000O0O0O0.O00000000(var12, O0000O000OOOOO.O00000000(38, 43), O0000O000OOOOO.O00000000000(3.0F, 5.0F), 30.0F, 30.0F, 1, 15, false);
   }

   public static void O000000000000(LivingEntity livingEntity, boolean bl) {
   }

   public static void O00000000(LivingEntity livingEntity, boolean bl, String string) {
      float var3 = 0.25F * (float)Math.cos(System.currentTimeMillis() / 1500L);
      float var4 = 0.2F * (float)Math.cos(System.currentTimeMillis() / 700L);
      float var5 = 0.2F * (float)Math.cos(System.currentTimeMillis() / 900L);
      Vec3d var6 = a_.player.getEyePos();
      Vec3d var7 = livingEntity.getPos().add(var5, MathHelper.clamp(var6.y - livingEntity.getPos().y, 0.0, 0.8) - var3, var4).subtract(var6).normalize();
      if (string.contains("Fast")) {
         float var8 = O000000O0O00O.O0000000000;
         float var9 = O000000O0O00O.O00000000000;
         float var10 = O0000O000OOOOO.O0000000000(190.0F, 245.0F);
         if (bl) {
            var8 = (float)Math.toDegrees(Math.atan2(-var7.x, var7.z));
            var9 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var7.y, Math.hypot(var7.x, var7.z))), -90.0, 90.0);
         }

         float var11 = 0.0F;
         float var12 = 0.0F;
         O000000O0O0O0.O00000000(new O000000O0O00OO(var8 + var11, var9 + var12), var10, var10, 40.0F, 40.0F, 1, 7, false);
      } else if (string.contains("Smooth")) {
         float var13 = O000000O0O00O.O0000000000;
         float var15 = O000000O0O00O.O00000000000;
         float var17 = 24.0F;
         if (bl) {
            O00000000 = 3;
            var17 = 88.0F;
         }

         if (O00000000 > 0) {
            var13 = (float)Math.toDegrees(Math.atan2(-var7.x, var7.z));
            var15 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var7.y, Math.hypot(var7.x, var7.z))), -90.0, 90.0);
            O00000000--;
         }

         float var19 = 0.0F;
         float var21 = 0.0F;
         O000000O0O0O0.O00000000(new O000000O0O00OO(var13 + var19, var15 + var21), var17, var17, 40.0F, 40.0F, 1, 7, false);
      } else if (string.contains("Random")) {
         float var14 = O000000O0O00O.O0000000000;
         float var16 = O000000O0O00O.O00000000000;
         float var18 = O0000O000OOOOO.O0000000000(30.0F, 35.0F);
         if (bl) {
            O00000000 = O0000O000OOOOO.O00000000(2, 4);
         }

         if (O00000000 > 0) {
            var18 = O0000O000OOOOO.O0000000000(140.0F, 220.0F);
            var14 = (float)Math.toDegrees(Math.atan2(-var7.x, var7.z));
            var16 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var7.y, Math.hypot(var7.x, var7.z))), -90.0, 90.0);
            O00000000--;
         }

         float var20 = ThreadLocalRandom.current().nextFloat(-3.0F, 3.0F)
            + (float)(O0000O000OOOOO.O0000000000(4.0F, 5.0F) * Math.cos(System.currentTimeMillis() / 150.0))
            + (float)(O0000O000OOOOO.O0000000000(4.0F, 5.0F) * Math.sin(System.currentTimeMillis() / 50.0))
            + (float)(O0000O000OOOOO.O0000000000(5.0F, 8.0F) * Math.sin(System.currentTimeMillis() / 130.0))
               * (float)(O0000O000OOOOO.O0000000000(4.0F, 7.0F) * Math.cos(System.currentTimeMillis() / 650.0))
            + (float)(O0000O000OOOOO.O0000000000(12.0F, 18.0F) * Math.sin(System.currentTimeMillis() / 80.0))
               * (float)(O0000O000OOOOO.O0000000000(2.0F, 3.0F) * Math.cos(System.currentTimeMillis() / 2650.0));
         float var22 = ThreadLocalRandom.current().nextFloat(-1.0F, 1.0F)
            + (float)(O0000O000OOOOO.O0000000000(2.0F, 3.0F) * Math.cos(System.currentTimeMillis() / 170.0))
            + (float)(O0000O000OOOOO.O0000000000(3.0F, 4.0F) * Math.sin(System.currentTimeMillis() / 70.0))
            + (float)(O0000O000OOOOO.O0000000000(1.0F, 2.0F) * Math.sin(System.currentTimeMillis() / 110.0))
               * (float)(O0000O000OOOOO.O0000000000(1.0F, 2.0F) * Math.cos(System.currentTimeMillis() / 350.0));
         O000000O0O0O0.O00000000(new O000000O0O00OO(var14 + var20 / 4.0F, var16 + var22), var18, var18, 40.0F, 40.0F, 1, 7, false);
      }
   }

   public static void O000000000(LivingEntity livingEntity, boolean bl, String string) {
      float var3 = 0.25F * (float)Math.cos(System.currentTimeMillis() / 1500L);
      float var4 = 0.2F * (float)Math.cos(System.currentTimeMillis() / 700L);
      float var5 = 0.2F * (float)Math.cos(System.currentTimeMillis() / 900L);
      Vec3d var6 = a_.player.getEyePos();
      Vec3d var7 = livingEntity.getPos().add(var5, MathHelper.clamp(var6.y - livingEntity.getPos().y, 0.0, 0.8) - var3, var4).subtract(var6).normalize();
      if (string.contains("Fast")) {
         float var8 = O000000O0O00O.O0000000000;
         float var9 = O000000O0O00O.O00000000000;
         float var10 = O0000O000OOOOO.O0000000000(280.0F, 360.0F);
         if (bl) {
            var8 = (float)Math.toDegrees(Math.atan2(-var7.x, var7.z));
            var9 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var7.y, Math.hypot(var7.x, var7.z))), -90.0, 90.0);
         }

         O000000O0O0O0.O00000000(new O000000O0O00OO(var8, var9), var10, var10, 40.0F, 40.0F, 1, 7, false);
      } else if (string.contains("Smooth")) {
         float var13 = O000000O0O00O.O0000000000;
         float var15 = O000000O0O00O.O00000000000;
         float var17 = 24.0F;
         if (bl) {
            O00000000 = 2;
            var17 = 130.0F;
         }

         if (O00000000 > 0) {
            var13 = (float)Math.toDegrees(Math.atan2(-var7.x, var7.z));
            var15 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var7.y, Math.hypot(var7.x, var7.z))), -90.0, 90.0);
            O00000000--;
         }

         O000000O0O0O0.O00000000(new O000000O0O00OO(var13, var15), var17, var17, 40.0F, 40.0F, 1, 7, false);
      } else if (string.contains("Random")) {
         float var14 = O000000O0O00O.O0000000000;
         float var16 = O000000O0O00O.O00000000000;
         float var18 = O0000O000OOOOO.O0000000000(30.0F, 35.0F);
         if (bl) {
            O00000000 = 2;
         }

         if (O00000000 > 0) {
            var18 = O0000O000OOOOO.O0000000000(200.0F, 280.0F);
            var14 = (float)Math.toDegrees(Math.atan2(-var7.x, var7.z));
            var16 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var7.y, Math.hypot(var7.x, var7.z))), -90.0, 90.0);
            O00000000--;
         }

         float var11 = ThreadLocalRandom.current().nextFloat(-3.0F, 3.0F)
            + (float)(O0000O000OOOOO.O0000000000(4.0F, 5.0F) * Math.cos(System.currentTimeMillis() / 150.0))
            + (float)(O0000O000OOOOO.O0000000000(4.0F, 5.0F) * Math.sin(System.currentTimeMillis() / 50.0))
            + (float)(O0000O000OOOOO.O0000000000(5.0F, 8.0F) * Math.sin(System.currentTimeMillis() / 130.0))
               * (float)(O0000O000OOOOO.O0000000000(4.0F, 7.0F) * Math.cos(System.currentTimeMillis() / 650.0))
            + (float)(O0000O000OOOOO.O0000000000(12.0F, 18.0F) * Math.sin(System.currentTimeMillis() / 80.0))
               * (float)(O0000O000OOOOO.O0000000000(2.0F, 3.0F) * Math.cos(System.currentTimeMillis() / 2650.0));
         float var12 = ThreadLocalRandom.current().nextFloat(-1.0F, 1.0F)
            + (float)(O0000O000OOOOO.O0000000000(2.0F, 3.0F) * Math.cos(System.currentTimeMillis() / 170.0))
            + (float)(O0000O000OOOOO.O0000000000(3.0F, 4.0F) * Math.sin(System.currentTimeMillis() / 70.0))
            + (float)(O0000O000OOOOO.O0000000000(1.0F, 2.0F) * Math.sin(System.currentTimeMillis() / 110.0))
               * (float)(O0000O000OOOOO.O0000000000(1.0F, 2.0F) * Math.cos(System.currentTimeMillis() / 350.0));
         O000000O0O0O0.O00000000(new O000000O0O00OO(var14 + var11 / 4.0F, var16 + var12), var18, var18, 40.0F, 40.0F, 1, 7, false);
      }
   }

   @Generated
   private O000000O0OO0OO() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
