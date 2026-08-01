package l;

import fat.releon.teremok.impl.combat.Aura;
import java.util.Objects;
import net.minecraft.entity.Entity;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class Helper165 implements Helper160 {
   public static boolean method1351() {
      return mc.player.input.movementForward != 0.0F || mc.player.input.movementSideways != 0.0F;
   }

   public static double[] method1352(double var0) {
      return method1363(mc.player.input.movementForward, mc.player.input.movementSideways, var0);
   }

   public static final boolean method1353(int var0) {
      boolean var1 = mc.options.forwardKey.isPressed();
      boolean var2 = mc.options.leftKey.isPressed();
      boolean var3 = mc.options.backKey.isPressed();
      boolean var4 = mc.options.rightKey.isPressed();
      return var0 == 0 ? var1 : (var0 == 1 ? var2 : (var0 == 2 ? var3 : var0 == 3 && var4));
   }

   public static final boolean method1354() {
      return method1353(0);
   }

   public static final boolean method1355() {
      return method1353(1);
   }

   public static final boolean method1356() {
      return method1353(2);
   }

   public static final boolean method1357() {
      return method1353(3);
   }

   public static final float method1358(float var0) {
      return var0
         + (
            !method1355() || !method1357() || method1354() && method1356() || !method1354() && !method1356()
               ? (
                  !method1354() || !method1356() || method1355() && method1357() || !method1355() && !method1357()
                     ? (
                        (!method1355() || !method1357() || method1354() && method1356()) && (!method1354() || !method1356() || method1355() && method1357())
                           ? (
                              !method1355() && !method1357() && !method1356()
                                 ? 0
                                 : (
                                       method1354() && !method1356()
                                          ? 45
                                          : (
                                             !method1356() || method1354()
                                                ? (!method1354() && !method1356() || method1354() && method1356() ? 90 : 0)
                                                : (!method1355() && !method1357() ? 180 : 135)
                                          )
                                    )
                                    * (method1355() ? -1 : 1)
                           )
                           : 0
                     )
                     : (method1355() ? -90 : (method1357() ? 90 : 0))
               )
               : (method1354() ? 0 : (method1356() ? 180 : 0))
         );
   }

   public static double[] method1359(double var0) {
      float var2 = mc.player.input.movementForward;
      float var3 = mc.player.input.movementSideways;
      float var4 = Helper351.INSTANCE.method3483().method3333();
      if (var2 != 0.0F) {
         if (var3 > 0.0F) {
            var4 += var2 > 0.0F ? -45 : 45;
         } else if (var3 < 0.0F) {
            var4 += var2 > 0.0F ? 45 : -45;
         }

         var3 = 0.0F;
         if (var2 > 0.0F) {
            var2 = 1.0F;
         } else if (var2 < 0.0F) {
            var2 = -1.0F;
         }
      }

      double var5 = Math.sin(Math.toRadians(var4 + 90.0F));
      double var7 = Math.cos(Math.toRadians(var4 + 90.0F));
      double var9 = var2 * var0 * var7 + var3 * var0 * var5;
      double var11 = var2 * var0 * var5 - var3 * var0 * var7;
      return new double[]{var9, var11};
   }

   public static float method1360(float var0, float var1, double var2, double var4, double var6, double var8, float var10) {
      if (Aura.fakeRotate && Aura.getInstance().getTarget() != null) {
         var0 = Helper351.INSTANCE.method3528().method3333();
      } else {
         var0 = Helper351.INSTANCE.method3483().method3333();
      }

      double var11 = var6 - var2;
      double var13 = var8 - var4;
      float var15 = (float)(var11 * var11 + var13 * var13);
      float var16 = var1;
      float var17 = mc.player.handSwingProgress;
      if (var15 > 0.0025000002F) {
         float var18 = (float)MathHelper.atan2(var13, var11) * (180.0F / (float)Math.PI) - 90.0F;
         float var19 = MathHelper.abs(MathHelper.wrapDegrees(var0) - var18);
         if (95.0F < var19 && var19 < 265.0F) {
            var16 = var18 - 180.0F;
         } else {
            var16 = var18;
         }
      }

      if (mc.player != null && mc.player.handSwingProgress - 0.2F > 0.0F && !Aura.getInstance().getAimMode().method2385("LonyGrief")) {
         var16 = var0;
      }

      float var23 = MathHelper.wrapDegrees(var16 - var1);
      var16 = var1 + var23 * 0.3F;
      float var24 = MathHelper.wrapDegrees(var0 - var16);
      float var20 = 52.0F;
      if (Math.abs(var24) > var20) {
         var16 += var24 - MathHelper.sign(var24) * var20;
      }

      return var16;
   }

   public static double method1361() {
      return 1488.0;
   }

   public static String method1362() {
      return SelfDestruct.unhooked ? "fabric" : "lunarclient:v2.21.5-2540";
   }

   public static double[] method1363(float var0, float var1, double var2) {
      float var4 = Helper351.INSTANCE.method3483().method3333();
      if (var0 != 0.0F) {
         if (var1 > 0.0F) {
            var4 += var0 > 0.0F ? -45.0F : 45.0F;
         } else if (var1 < 0.0F) {
            var4 += var0 > 0.0F ? 45.0F : -45.0F;
         }

         var1 = 0.0F;
         var0 = var0 > 0.0F ? 1.0F : -1.0F;
      }

      double var5 = Math.sin(Math.toRadians(var4 + 90.0F));
      double var7 = Math.cos(Math.toRadians(var4 + 90.0F));
      double var9 = var0 * var2 * var7 + var1 * var2 * var5;
      double var11 = var0 * var2 * var5 - var1 * var2 * var7;
      return new double[]{var9, var11};
   }

   public static double method1364(Entity var0) {
      return Math.sqrt(var0.squaredDistanceTo(new Vec3d(var0.prevX, var0.prevY, var0.prevZ)));
   }

   public static void method1365(double var0) {
      double[] var2 = method1352(var0);
      Objects.requireNonNull(mc.player).setVelocity(var2[0], mc.player.getVelocity().getY(), var2[1]);
   }

   public static void method1366(double var0, double var2) {
      double[] var4 = method1352(var0);
      Objects.requireNonNull(mc.player).setVelocity(var4[0], var2, var4[1]);
   }

   public static double method1367(Vec3d var0, float var1) {
      float var2 = (float)Math.atan2(-var0.x, var0.z);
      double var3 = Math.toRadians(MathHelper.wrapDegrees(var1));
      return Math.toDegrees(MathHelper.wrapDegrees(var2 - var3));
   }

   public static PlayerInput method1368(PlayerInput var0, double var1, float var3) {
      boolean var4 = var0.forward();
      boolean var5 = var0.backward();
      boolean var6 = var0.left();
      boolean var7 = var0.right();
      if (var1 >= -90.0F + var3 && var1 <= 90.0F - var3) {
         var4 = true;
      } else if (var1 < -90.0F - var3 || var1 > 90.0F + var3) {
         var5 = true;
      }

      if (var1 >= 0.0F + var3 && var1 <= 180.0F - var3) {
         var7 = true;
      } else if (var1 >= -180.0F + var3 && var1 <= 0.0F - var3) {
         var6 = true;
      }

      return new PlayerInput(var4, var5, var6, var7, var0.jump(), var0.sneak(), var0.sprint());
   }

   public static PlayerInput method1369(PlayerInput var0, double var1) {
      return method1368(var0, var1, 20.0F);
   }

   private Helper165() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
