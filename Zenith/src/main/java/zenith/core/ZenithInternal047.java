package zenith;

import java.util.Objects;
import net.minecraft.util.PlayerInput;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public final class ZenithInternal047 implements ZenithInternal076 {
   public static boolean IlIllI1lI11Ill11llII1111l() {
      return l11I1I1ll1Illll1I1l1111l1II.player.input.movementForward != 0.0F
         || l11I1I1ll1Illll1I1l1111l1II.player.input.movementSideways != 0.0F
         || l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput.jump();
   }

   public static double[] StringHolder_8(double d0, float f) {
      float f1 = l11I1I1ll1Illll1I1l1111l1II.player.input.movementForward;
      float f2 = l11I1I1ll1Illll1I1l1111l1II.player.input.movementSideways;
      if (f1 != 0.0F) {
         if (f2 > 0.0F) {
            f += f1 > 0.0F ? -25.0F : 45.0F;
         } else if (f2 < 0.0F) {
            f += f1 > 0.0F ? 25.0F : -25.0F;
         }

         f2 = 0.0F;
         f1 = f1 > 0.0F ? 1.0F : -1.0F;
      }

      double d1 = Math.sin(Math.toRadians((double)(f + 90.0F)));
      double d2 = Math.cos(Math.toRadians((double)(f + 90.0F)));
      double d3 = (double)f1 * d0 * d2 + (double)f2 * d0 * d1;
      double d4 = (double)f1 * d0 * d1 - (double)f2 * d0 * d2;
      return new double[]{d3, d4};
   }

   public static double[] StringHolder_8(double d0, float f, net.minecraft.util.math.Vec3d Vec3d, double d1) {
      float f1 = l11I1I1ll1Illll1I1l1111l1II.player.input.movementForward;
      float f2 = l11I1I1ll1Illll1I1l1111l1II.player.input.movementSideways;
      double d2 = Vec3d.x;
      double d3 = Vec3d.z;
      if (d1 < 1.0E-8) {
         return new double[]{0.0, 0.0};
      } else {
         if (f1 != 0.0F) {
            if (f2 > 0.0F) {
               f += f1 > 0.0F ? -45.0F : 45.0F;
            } else if (f2 < 0.0F) {
               f += f1 > 0.0F ? 45.0F : -45.0F;
            }

            f2 = 0.0F;
            f1 = f1 > 0.0F ? 1.0F : -1.0F;
         }

         double d4 = Math.sin(Math.toRadians((double)(f + 90.0F)));
         double d5 = Math.cos(Math.toRadians((double)(f + 90.0F)));
         double d6 = (double)f1 * d0 * d5 + (double)f2 * d0 * d4;
         double d7 = (double)f1 * d0 * d4 - (double)f2 * d0 * d5;
         double d8 = d2 - d6;
         double d9 = d3 - d7;
         if (Math.signum(d2) != Math.signum(d8)) {
            double d10 = Math.abs(d2) / (Math.abs(d6) + 1.0E-8);
            d6 *= d10 * 0.9;
         }

         if (Math.signum(d3) != Math.signum(d9)) {
            double d11 = Math.abs(d3) / (Math.abs(d7) + 1.0E-8);
            d7 *= d11 * 0.9;
         }

         return new double[]{d6, d7, 1.0};
      }
   }

   public static double[] byteHolder(double d0) {
      return StringHolder_8(d0, l11I1I1ll1Illll1I1l1111l1II.player.getYaw());
   }

   public static void StringHolder_4(double d0) {
      double[] adouble = byteHolder(d0);
      Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player)
         .setVelocity(adouble[0], l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().getY(), adouble[1]);
   }

   public static void EventImpl_24(double d0, double d1) {
      double[] adouble = byteHolder(d0);
      Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).setVelocity(adouble[0], d1, adouble[1]);
   }

   public static double StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, float f) {
      float f1 = (float)Math.atan2(-Vec3d.x, Vec3d.z);
      double d0 = Math.toRadians((double)MathHelper.wrapDegrees(f));
      return Math.toDegrees(MathHelper.wrapDegrees((double)f1 - d0));
   }

   public static PlayerInput StringHolder_8(PlayerInput PlayerInput, double d0, float f) {
      boolean flag = PlayerInput.forward();
      boolean flag1 = PlayerInput.backward();
      boolean flag2 = PlayerInput.left();
      boolean flag3 = PlayerInput.right();
      if (d0 >= (double)(-90.0F + f) && d0 <= (double)(90.0F - f)) {
         flag = true;
      } else if (d0 < (double)(-90.0F - f) || d0 > (double)(90.0F + f)) {
         flag1 = true;
      }

      if (d0 >= (double)(0.0F + f) && d0 <= (double)(180.0F - f)) {
         flag3 = true;
      } else if (d0 >= (double)(-180.0F + f) && d0 <= (double)(0.0F - f)) {
         flag2 = true;
      }

      return new PlayerInput(flag, flag1, flag2, flag3, PlayerInput.jump(), PlayerInput.sneak(), PlayerInput.sprint());
   }

   public static void StringHolder_8(PlayerInputHolder ili11i1il11, float f, float f1) {
      float f2 = l11I1I1ll1Illll1I1l1111l1II.player.input.movementForward;
      float f3 = l11I1I1ll1Illll1I1l1111l1II.player.input.movementSideways;
      double d0 = MathHelper.wrapDegrees(Math.toDegrees(ZenithInternal028(l11I1I1ll1Illll1I1l1111l1II.player.isGliding() ? f : f1, f2, f3)));
      if (f2 != 0.0F || f3 != 0.0F) {
         float f4 = 0.0F;
         float f5 = 0.0F;
         float f6 = Float.MAX_VALUE;

         for (float f7 = -1.0F; f7 <= 1.0F; f7++) {
            for (float f8 = -1.0F; f8 <= 1.0F; f8++) {
               if (f8 != 0.0F || f7 != 0.0F) {
                  double d1 = MathHelper.wrapDegrees(Math.toDegrees(ZenithInternal028(f, f7, f8)));
                  double d2 = Math.abs(d0 - d1);
                  if (d2 < (double)f6) {
                     f6 = (float)d2;
                     f4 = f7;
                     f5 = f8;
                  }
               }
            }
         }

         ili11i1il11.StringHolder_8(f4, f5);
      }
   }

   public static double ZenithInternal028(float f, float f1, float f2) {
      if (f1 < 0.0F) {
         f += 180.0F;
      }

      float f3 = 1.0F;
      if (f1 < 0.0F) {
         f3 = -0.5F;
      }

      if (f1 > 0.0F) {
         f3 = 0.5F;
      }

      if (f2 > 0.0F) {
         f -= 90.0F * f3;
      }

      if (f2 < 0.0F) {
         f += 90.0F * f3;
      }

      return Math.toRadians((double)f);
   }

   public static PlayerInput StringHolder_8(PlayerInput PlayerInput, double d0) {
      return StringHolder_8(PlayerInput, d0, 20.0F);
   }

   public static double ZenithInternal064(Entity Entity) {
      double d0 = Entity.getX() - Entity.prevX;
      double d1 = Entity.getY() - Entity.prevY;
      double d2 = Entity.getZ() - Entity.prevZ;
      return Math.sqrt(d0 * d0 + d2 * d2 + d1 * d1);
   }

   private ZenithInternal047() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
