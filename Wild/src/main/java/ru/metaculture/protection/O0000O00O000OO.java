package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

public final class O0000O00O000OO implements MinecraftAccessor {
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

   public static boolean O00000000() {
      return a_.player != null && a_.player.input != null && a_.player.input.playerInput != null
         ? a_.player.input.playerInput.forward()
            || a_.player.input.playerInput.backward()
            || a_.player.input.playerInput.left()
            || a_.player.input.playerInput.right()
         : false;
   }

   public static double[] O00000000(double d) {
      float[] var2 = O000000000();
      return O00000000(var2[0], var2[1], d);
   }

   public static double[] O00000000(float f, float g, double d) {
      float var4 = a_.player.getYaw();
      if (f != 0.0F) {
         if (g > 0.0F) {
            var4 += f > 0.0F ? -45.0F : 45.0F;
         } else if (g < 0.0F) {
            var4 += f > 0.0F ? 45.0F : -45.0F;
         }

         g = 0.0F;
         f = f > 0.0F ? 1.0F : -1.0F;
      }

      double var5 = Math.sin(Math.toRadians(var4 + 90.0F));
      double var7 = Math.cos(Math.toRadians(var4 + 90.0F));
      double var9 = f * d * var7 + g * d * var5;
      double var11 = f * d * var5 - g * d * var7;
      return new double[]{var9, var11};
   }

   public static void O00000000(O0000000O0OO0 o0000000O0OO0, float f) {
      float var2 = o0000000O0OO0.O0000000000();
      float var3 = o0000000O0OO0.O00000000000();
      double var4 = MathHelper.wrapDegrees(Math.toDegrees(O00000000(a_.player.isFlyingVehicle() ? a_.player.getYaw() : f, var2, var3)));
      if (var2 != 0.0F || var3 != 0.0F) {
         float var6 = 0.0F;
         float var7 = 0.0F;
         float var8 = Float.MAX_VALUE;

         for (float var9 = -1.0F; var9 <= 1.0F; var9++) {
            for (float var10 = -1.0F; var10 <= 1.0F; var10++) {
               if (var10 != 0.0F || var9 != 0.0F) {
                  double var11 = MathHelper.wrapDegrees(Math.toDegrees(O00000000(a_.player.getYaw(), var9, var10)));
                  double var13 = Math.abs(var4 - var11);
                  if (var13 < var8) {
                     var8 = (float)var13;
                     var6 = var9;
                     var7 = var10;
                  }
               }
            }
         }

         o0000000O0OO0.O00000000(var6);
         o0000000O0OO0.O000000000(var7);
      }
   }

   public static float[] O000000000() {
      float var0 = 0.0F;
      float var1 = 0.0F;
      long var2 = a_.getWindow().getHandle();
      if (InputUtil.isKeyPressed(var2, a_.options.forwardKey.getDefaultKey().getCode())) {
         var0++;
      }

      if (InputUtil.isKeyPressed(var2, a_.options.backKey.getDefaultKey().getCode())) {
         var0--;
      }

      if (InputUtil.isKeyPressed(var2, a_.options.leftKey.getDefaultKey().getCode())) {
         var1++;
      }

      if (InputUtil.isKeyPressed(var2, a_.options.rightKey.getDefaultKey().getCode())) {
         var1--;
      }

      return new float[]{var0, var1};
   }

   private static void O00000000(float f, float g) {
      if (a_.player != null && a_.player.input != null && a_.player.input.playerInput != null) {
         boolean var2 = f > 0.0F;
         boolean var3 = f < 0.0F;
         boolean var4 = g > 0.0F;
         boolean var5 = g < 0.0F;
         boolean var6 = a_.player.input.playerInput.jump();
         boolean var7 = a_.player.input.playerInput.sneak();
         boolean var8 = a_.player.input.playerInput.sprint();
         a_.player.input.playerInput = new PlayerInput(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   public static void O00000000(float f, Vec3d vec3d) {
      float[] var2 = O000000000();
      float var3 = var2[0];
      float var4 = var2[1];
      if (var3 == 0.0F && var4 == 0.0F) {
         a_.options.forwardKey.setPressed(false);
         a_.options.backKey.setPressed(false);
         a_.options.leftKey.setPressed(false);
         a_.options.rightKey.setPressed(false);
      } else {
         Box var5 = AttackAura.O00000000OO0.getBoundingBox();
         double var6 = MathHelper.lerp(Math.random(), var5.minX, var5.maxX);
         double var8 = MathHelper.lerp(Math.random(), var5.minY, var5.maxY);
         double var10 = MathHelper.lerp(Math.random(), var5.minZ, var5.maxZ);
         var8 = MathHelper.clamp(var8, AttackAura.O00000000OO0.getY() + 0.2, AttackAura.O00000000OO0.getY() + AttackAura.O00000000OO0.getHeight() - 0.2);
         Vec3d var12 = new Vec3d(var6, var8, var10);
         Vec3d var13 = var12.subtract(a_.player.getEyePos()).normalize();
         float var14 = (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(var13.z, var13.x)) - 90.0);
         double var15 = MathHelper.wrapDegrees(Math.toDegrees(O00000000(a_.player.isFlyingVehicle() ? a_.player.getYaw() : var14, var3, var4)));
         float var17 = 0.0F;
         float var18 = 0.0F;
         float var19 = Float.MAX_VALUE;

         for (float var20 = -1.0F; var20 <= 1.0F; var20++) {
            for (float var21 = -1.0F; var21 <= 1.0F; var21++) {
               if (var21 != 0.0F || var20 != 0.0F) {
                  double var22 = MathHelper.wrapDegrees(Math.toDegrees(O00000000(a_.player.getYaw(), var20, var21)));
                  double var24 = Math.abs(var15 - var22);
                  if (var24 < var19) {
                     var19 = (float)var24;
                     var17 = var20;
                     var18 = var21;
                  }
               }
            }
         }

         a_.options.forwardKey.setPressed(var17 > 0.0F);
         a_.options.backKey.setPressed(var17 < 0.0F);
         a_.options.leftKey.setPressed(var18 > 0.0F);
         a_.options.rightKey.setPressed(var18 < 0.0F);
      }
   }

   public static void O00000000(float f) {
      float[] var1 = O000000000();
      float var2 = var1[0];
      float var3 = var1[1];
      if (var2 == 0.0F && var3 == 0.0F) {
         a_.options.forwardKey.setPressed(false);
         a_.options.backKey.setPressed(false);
         a_.options.leftKey.setPressed(false);
         a_.options.rightKey.setPressed(false);
      } else {
         double var4 = MathHelper.wrapDegrees(Math.toDegrees(O00000000(a_.player.isFlyingVehicle() ? a_.player.getYaw() : f, var2, var3)));
         float var6 = 0.0F;
         float var7 = 0.0F;
         float var8 = Float.MAX_VALUE;

         for (float var9 = -1.0F; var9 <= 1.0F; var9++) {
            for (float var10 = -1.0F; var10 <= 1.0F; var10++) {
               if (var10 != 0.0F || var9 != 0.0F) {
                  double var11 = MathHelper.wrapDegrees(Math.toDegrees(O00000000(a_.player.getYaw(), var9, var10)));
                  double var13 = Math.abs(var4 - var11);
                  if (var13 < var8) {
                     var8 = (float)var13;
                     var6 = var9;
                     var7 = var10;
                  }
               }
            }
         }

         a_.options.forwardKey.setPressed(var6 > 0.0F);
         a_.options.backKey.setPressed(var6 < 0.0F);
         a_.options.leftKey.setPressed(var7 > 0.0F);
         a_.options.rightKey.setPressed(var7 < 0.0F);
      }
   }

   public static void O000000000(double d) {
      if (a_.player != null) {
         float var2 = a_.player.getYaw();
         double var3 = Math.toRadians(var2);
         double var5 = 0.0;
         double var7 = 0.0;
         Vec2f var9 = a_.player.input.getMovementInput();
         float var10 = var9.y;
         float var11 = var9.x;
         if (var10 > 0.0F) {
            var5 -= Math.sin(var3) * d;
            var7 += Math.cos(var3) * d;
         }

         if (var10 < 0.0F) {
            var5 += Math.sin(var3) * d;
            var7 -= Math.cos(var3) * d;
         }

         if (var11 > 0.0F) {
            var5 += Math.cos(var3) * d;
            var7 += Math.sin(var3) * d;
         }

         if (var11 < 0.0F) {
            var5 -= Math.cos(var3) * d;
            var7 -= Math.sin(var3) * d;
         }

         if (var11 > 0.0F && var10 > 0.0F) {
            var5 = Math.cos(Math.toRadians(var2 + 45.0F)) * d;
            var7 = Math.sin(Math.toRadians(var2 + 45.0F)) * d;
         }

         if (var11 < 0.0F && var10 > 0.0F) {
            var5 = -Math.cos(Math.toRadians(var2 - 45.0F)) * d;
            var7 = -Math.sin(Math.toRadians(var2 - 45.0F)) * d;
         }

         if (var11 > 0.0F && var10 < 0.0F) {
            var5 = -Math.cos(Math.toRadians(var2 + 135.0F)) * d;
            var7 = -Math.sin(Math.toRadians(var2 + 135.0F)) * d;
         }

         if (var11 < 0.0F && var10 < 0.0F) {
            var5 = Math.cos(Math.toRadians(var2 - 135.0F)) * d;
            var7 = Math.sin(Math.toRadians(var2 - 135.0F)) * d;
         }

         a_.player.setVelocity(var5, a_.player.getVelocity().y, var7);
      }
   }

   public static float[] O00000000(float f, float g, float h, float i) {
      double var4 = O00000000(i, f, g);
      double var6 = Math.toRadians(h);
      double var8 = var4 - var6;
      float var10 = (float)Math.cos(var8);
      float var11 = (float)Math.sin(var8);
      float var12 = Math.max(Math.abs(f), Math.abs(g));
      float var13 = (float)Math.hypot(var10, var11);
      if (var13 != 0.0F) {
         var10 = var10 / var13 * var12;
         var11 = var11 / var13 * var12;
      }

      return new float[]{var10, var11};
   }

   @Generated
   private O0000O00O000OO() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
