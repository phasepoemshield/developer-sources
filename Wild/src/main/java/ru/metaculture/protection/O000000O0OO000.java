package ru.metaculture.protection;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class O000000O0OO000 implements MinecraftAccessor {
   private static final int O00000000 = 15;
   private static final float O000000000 = 20.0F;
   private static float O0000000000 = 50.0F;
   private static float O00000000000 = 70.0F;
   private static final float O000000000000 = 120.0F;
   private static final String[] O0000000000000 = new String[]{"Human Track", "Wave Drift", "Pulse Jerk", "Overstep", "Anchor Hold"};
   private static final String[] O000000000000O = new String[]{"Closest Box", "Upper Body", "Velocity Lead", "Side Sweep", "Sticky Point"};
   private static int O00000000000O = -1;
   private static int O00000000000O0 = -1;
   private static int O00000000000OO = -1;
   private static int O0000000000O00;
   private static int O0000000000O0O;
   private static int O0000000000OO;
   private static int O0000000000OO0;
   private static int O0000000000OOO;
   private static int O000000000O = 5;
   private static boolean O000000000O0;
   private static float O000000000O00;
   private static float O000000000O000;
   private static float O000000000O00O;
   private static float O000000000O0O;
   private static float O000000000O0O0;
   private static float O000000000O0OO;
   private static float O000000000OO;
   private static float O000000000OO0;
   private static int O000000000OO00 = 1;
   private static float O000000000OO0O;
   private static float O000000000OOO;
   private static float O000000000OOO0;
   private static float O000000000OOOO;
   private static float O00000000O;
   private static int O00000000O0 = 1;

   public static void O00000000(LivingEntity livingEntity) {
      if (a_.player == null) {
         O00000000000();
      } else if (a_.world != null && livingEntity != null) {
         if (O00000000000O != livingEntity.getId()) {
            O00000000000();
            O00000000000O = livingEntity.getId();
            O000000000();
            O0000000000();
         }

         if (O00000000000O0 < 0 || O0000000000O00 >= O0000000000OO) {
            O000000000();
         }

         if (O00000000000OO < 0 || O0000000000O0O >= O0000000000OO0) {
            O0000000000();
         }

         O0000000000O00++;
         O0000000000O0O++;
         O0000000000OOO++;
         Vec3d var1 = O000000000(livingEntity).subtract(a_.player.getEyePos());
         float var2 = (float)Math.toDegrees(Math.atan2(-var1.x, var1.z));
         float var3 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var1.y, Math.hypot(var1.x, var1.z))), -90.0, 90.0);
         O000000O0O00OO var4 = new O000000O0O00OO(a_.player);
         float var5 = MathHelper.wrapDegrees(var2 - var4.O00000000);
         float var6 = var3 - var4.O000000000;
         float var7 = AttackAura.O00000000(livingEntity) + AttackAura.O000000000O0.O0000000000();
         EntityHitResult var8 = O000000O0O00.O000000000(var4.O00000000, var4.O000000000, var7, livingEntity, false);
         boolean var9 = var8 != null && var8.getEntity() == livingEntity;
         float var12 = O0000000000O00 + O00000000000O0 * 17.0F;
         float var10;
         float var11;
         switch (O00000000000O0) {
            case 0:
               var10 = O00000000(20.0F, 50.0F, O0000O000OOOOO.O0000000000(24.0F, 35.0F) * (var9 ? 0.92F : 1.14F));
               var11 = O00000000(70.0F, 120.0F, O0000O000OOOOO.O0000000000(76.0F, 96.0F) * (var9 ? 0.96F : 1.1F));
               var5 = var5 * (var9 ? 0.36F : 0.66F)
                  + O000000000O0O0 * (var9 ? 0.55F : 0.95F)
                  + O000000000(var12, 14.0F, 0.42F)
                  + O0000O000OOOOO.O0000000000(-0.18F, 0.18F);
               var6 = var6 * (var9 ? 0.4F : 0.7F) + O000000000O0OO * (var9 ? 0.45F : 0.85F) + O000000000(var12, 17.0F, 0.24F);
               break;
            case 1:
               var10 = O00000000(20.0F, 50.0F, O0000O000OOOOO.O0000000000(24.0F, 40.0F) * (var9 ? 0.9F : 1.18F));
               var11 = O00000000(70.0F, 120.0F, O0000O000OOOOO.O0000000000(90.0F, 118.0F) * (var9 ? 0.9F : 1.0F));
               var5 = var5 * (var9 ? 0.3F : 0.62F) + O000000000(var12, 3.5F, 3.1F) + O000000000(var12, 10.5F, 1.7F) + O000000000O0O0;
               var6 = var6 * (var9 ? 0.56F : 0.86F) + O000000000(var12, 4.8F, 2.4F) + O000000000O0OO * 0.7F;
               break;
            case 2:
               var10 = O00000000(20.0F, 50.0F, O0000O000OOOOO.O0000000000(38.0F, 50.0F));
               var11 = O00000000(70.0F, 120.0F, O0000O000OOOOO.O0000000000(72.0F, 96.0F));
               O00000000(0.42F, 0.66F, 5.6F, 1.6F);
               O00000000(4, 4.1F, 1.0F);
               var5 = var5 * (var9 ? 0.28F : 0.84F) + O000000000O00 + O000000000OO;
               var6 = var6 * (var9 ? 0.38F : 0.72F) + O000000000O000 + O000000000OO0;
               break;
            case 3:
               var10 = O00000000(20.0F, 50.0F, O0000O000OOOOO.O0000000000(30.0F, 46.0F) * (var9 ? 0.92F : 1.12F));
               var11 = O00000000(70.0F, 120.0F, O0000O000OOOOO.O0000000000(98.0F, 120.0F) * (var9 ? 0.94F : 1.0F));
               var5 = var5 * (var9 ? 0.54F : 0.88F) + O000000000(var5, 8.0F, 2.2F, 5.6F) - O000000000(var12, 6.5F, 1.1F);
               var6 = var6 * (var9 ? 0.32F : 0.66F) + O000000000(var6, 5.0F, 1.0F, 2.9F) + O000000000(var12, 6.8F, 0.55F);
               break;
            case 4:
            default:
               var10 = O00000000(20.0F, 50.0F, var9 ? O0000O000OOOOO.O0000000000(20.0F, 29.0F) : O0000O000OOOOO.O0000000000(34.0F, 49.0F));
               var11 = O00000000(70.0F, 120.0F, var9 ? O0000O000OOOOO.O0000000000(92.0F, 115.0F) : O0000O000OOOOO.O0000000000(78.0F, 100.0F));
               O00000000(var9);
               var5 = var5 * (var9 ? 0.2F : 0.78F) + O000000000O00O + O0000000000(var12, 18.0F, 1.15F);
               var6 = var6 * (var9 ? 0.58F : 0.54F) + O000000000O0O - O0000000000(var12, 15.0F, 0.7F);
         }

         var5 = O00000000(var5, O000000000OO0O, var9, true, var12);
         var6 = O00000000(var6, O000000000OOO, var9, false, var12);
         O000000000OO0O = var5;
         O000000000OOO = var6;
         float var13 = MathHelper.clamp(var5, -var10, var10);
         float var14 = MathHelper.clamp(var6, -var11, var11);
         if (!var9) {
            var13 = O00000000000(var13, var5, 2.2F);
            var14 = O00000000000(var14, var6, 1.8F);
         }

         if (var9 && Math.abs(var13) < 0.18F) {
            var13 = 0.0F;
         }

         if (var9 && Math.abs(var14) < 0.12F) {
            var14 = 0.0F;
         }

         O000000000O0 = O000000O0O0O0.O0000000000000 <= 15;
         O000000O0O0O0.O00000000(
            new O000000O0O00OO(var4.O00000000 + var13, MathHelper.clamp(var4.O000000000 + var14, -90.0F, 90.0F)), var10, var11, 30.0F, 30.0F, 2, 15, false
         );
      } else {
         O00000000();
      }
   }

   public static void O00000000() {
      if (!O000000000O0) {
         O00000000000();
      } else {
         if (a_.player != null) {
            O0000000000 = a_.player.getYaw();
            O00000000000 = a_.player.getPitch();
         }

         O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
         O000000O0O0O0.O0000000000000 = 0;
         O000000O0O0O0.O00000000000OO = false;
         O000000O0O0O0.O00000000000O0 = null;
         O000000O0O0O0.O00000000000O = 0;
         O000000O0O00O.O00000000 = O000000O0O00O.O000000000;
         O00000000000();
      }
   }

   private static void O000000000() {
      int var0 = O00000000000O0;

      do {
         O00000000000O0 = O0000O000OOOOO.O00000000(0, 4);
      } while (O00000000000O0 == var0 && var0 >= 0);

      O0000000000O00 = 0;

      O0000000000OO = switch (O00000000000O0) {
         case 0 -> O0000O000OOOOO.O00000000(78, 128);
         case 1 -> O0000O000OOOOO.O00000000(62, 104);
         case 2 -> O0000O000OOOOO.O00000000(48, 78);
         case 3 -> O0000O000OOOOO.O00000000(56, 92);
         default -> O0000O000OOOOO.O00000000(74, 122);
      };
      O0000000000OOO = 0;
      O000000000O = O00000000000O0 == 4 ? O0000O000OOOOO.O00000000(6, 13) : O0000O000OOOOO.O00000000(2, 7);
      O000000000O00 = 0.0F;
      O000000000O000 = 0.0F;
      O000000000O00O = O0000O000OOOOO.O0000000000(-1.2F, 1.2F);
      O000000000O0O = O0000O000OOOOO.O0000000000(-0.75F, 0.75F);
      O000000000O0O0 = O0000O000OOOOO.O0000000000(-1.15F, 1.15F);
      O000000000O0OO = O0000O000OOOOO.O0000000000(-0.65F, 0.65F);
      O000000000OO = 0.0F;
      O000000000OO0 = 0.0F;
      O000000000OO00 = O0000O000OOOOO.O00000000(0, 1) == 0 ? -1 : 1;
      ChatUtil.O00000000("[LonyGrief] rotate -> " + O0000000000000[O00000000000O0]);
   }

   private static void O0000000000() {
      int var0 = O00000000000OO;

      do {
         O00000000000OO = O0000O000OOOOO.O00000000(0, 4);
      } while (O00000000000OO == var0 && var0 >= 0);

      O0000000000O0O = 0;

      O0000000000OO0 = switch (O00000000000OO) {
         case 0 -> O0000O000OOOOO.O00000000(90, 150);
         case 1 -> O0000O000OOOOO.O00000000(80, 136);
         case 2 -> O0000O000OOOOO.O00000000(58, 108);
         case 3 -> O0000O000OOOOO.O00000000(68, 118);
         default -> O0000O000OOOOO.O00000000(96, 168);
      };
      O000000000OOO0 = O0000O000OOOOO.O0000000000(0.34F, 0.66F);
      O000000000OOOO = O0000O000OOOOO.O0000000000(0.38F, 0.78F);
      O00000000O = O0000O000OOOOO.O0000000000(0.34F, 0.66F);
      O00000000O0 = O0000O000OOOOO.O00000000(0, 1) == 0 ? -1 : 1;
      ChatUtil.O00000000("[LonyGrief] vector -> " + O000000000000O[O00000000000OO]);
   }

   private static void O00000000(float f, float g, float h, float i) {
      if (O0000000000OOO >= O000000000O) {
         O000000000O00 = O0000O000OOOOO.O0000000000(-h, h);
         O000000000O000 = O0000O000OOOOO.O0000000000(-i, i);
         O0000000000OOO = 0;
         O000000000O = O0000O000OOOOO.O00000000(3, 8);
      } else {
         O000000000O00 *= f;
         O000000000O000 *= g;
      }
   }

   private static void O00000000(boolean bl) {
      if (O0000000000OOO >= O000000000O) {
         float var1 = bl ? 2.4F : 3.8F;
         float var2 = bl ? 1.6F : 2.6F;
         O000000000O00O = O0000O000OOOOO.O0000000000(-var1, var1);
         O000000000O0O = O0000O000OOOOO.O0000000000(-var2, var2);
         O0000000000OOO = 0;
         O000000000O = O0000O000OOOOO.O00000000(5, 11);
      }
   }

   private static void O00000000(int i, float f, float g) {
      if (O0000000000O00 % i == 0) {
         O000000000OO00 = -O000000000OO00;
         O000000000OO = f * O000000000OO00;
         O000000000OO0 = O0000O000OOOOO.O0000000000(-g, g);
      } else {
         O000000000OO *= 0.5F;
         O000000000OO0 *= 0.64F;
      }
   }

   private static Vec3d O000000000(LivingEntity livingEntity) {
      Box var1 = livingEntity.getBoundingBox();
      float var2 = O0000000000O0O + O00000000000OO * 13.0F;

      return switch (O00000000000OO) {
         case 0 -> O000000O0O000.O00000000(var1, false).add(O000000000(var2, 18.0F, 0.025F), O000000000(var2, 21.0F, 0.035F), O000000000(var2, 20.0F, 0.025F));
         case 1 -> O00000000(var1, 0.5F + O000000000(var2, 24.0F, 0.13F), 0.72F + O000000000(var2, 31.0F, 0.08F), 0.5F + O000000000(var2, 27.0F, 0.13F));
         case 2 -> O00000000(var1, 0.5F + O000000000(var2, 30.0F, 0.08F), 0.52F + O000000000(var2, 25.0F, 0.1F), 0.5F + O000000000(var2, 34.0F, 0.08F))
            .add(livingEntity.getVelocity().multiply(O0000O000OOOOO.O0000000000(1.1F, 2.4F)));
         case 3 -> O00000000(livingEntity, var1, var2);
         default -> O00000000(
            var1,
            O000000000OOO0 + O000000000(var2, 36.0F, 0.035F),
            O000000000OOOO + O000000000(var2, 29.0F, 0.045F),
            O00000000O + O000000000(var2, 33.0F, 0.035F)
         );
      };
   }

   private static Vec3d O00000000(LivingEntity livingEntity, Box box, float f) {
      Vec3d var3 = O00000000(box, 0.5F, 0.55F + O000000000(f, 28.0F, 0.12F), 0.5F);
      Vec3d var4 = a_.player.getPos().subtract(livingEntity.getPos());
      Vec3d var5 = new Vec3d(-var4.z, 0.0, var4.x);
      if (var5.lengthSquared() < 1.0E-4) {
         var5 = new Vec3d(1.0, 0.0, 0.0);
      } else {
         var5 = var5.normalize();
      }

      double var6 = Math.max(livingEntity.getWidth() * 0.38, 0.12);
      double var8 = O0000000000(f, 42.0F, 1.0F) * var6 * O00000000O0;
      return var3.add(var5.multiply(var8));
   }

   private static Vec3d O00000000(Box box, float f, float g, float h) {
      float var4 = MathHelper.clamp(f, 0.08F, 0.92F);
      float var5 = MathHelper.clamp(g, 0.12F, 0.92F);
      float var6 = MathHelper.clamp(h, 0.08F, 0.92F);
      return new Vec3d(O00000000(box.minX, box.maxX, var4), O00000000(box.minY, box.maxY, var5), O00000000(box.minZ, box.maxZ, var6));
   }

   private static double O00000000(double d, double e, float f) {
      return d + (e - d) * f;
   }

   private static float O00000000(float f, float g, boolean bl, boolean bl2, float h) {
      float var5 = Math.abs(f);
      float var6 = bl2 ? 55.0F : 42.0F;
      float var7 = MathHelper.clamp((float)Math.pow(MathHelper.clamp(var5 / var6, 0.0F, 1.0F), 0.72), 0.22F, 1.0F);
      float var8 = f * var7;
      float var9 = bl2 ? (bl ? 0.46F : 0.68F) : (bl ? 0.52F : 0.72F);
      float var10 = bl2
         ? O000000000(h, 19.0F, bl ? 0.22F : 0.48F) + O0000O000OOOOO.O0000000000(-0.08F, 0.08F)
         : O000000000(h, 23.0F, bl ? 0.16F : 0.34F) + O0000O000OOOOO.O0000000000(-0.05F, 0.05F);
      return O0000O000OOOOO.O000000000(g, var8, var9) + var10;
   }

   private static float O00000000(float f, float g, float h) {
      return MathHelper.clamp(h, f, g);
   }

   private static float O000000000(float f, float g, float h) {
      return (float)Math.sin(f / g) * h;
   }

   private static float O0000000000(float f, float g, float h) {
      float var3 = f % g;
      return (var3 / g * 2.0F - 1.0F) * h;
   }

   private static float O000000000(float f, float g, float h, float i) {
      return Math.abs(f) <= g ? 0.0F : O00000000(f) * O0000O000OOOOO.O0000000000(h, i);
   }

   private static float O00000000000(float f, float g, float h) {
      return !(Math.abs(g) <= h) && !(Math.abs(f) >= h) ? O00000000(g) * h : f;
   }

   private static float O00000000(float f) {
      return f < 0.0F ? -1.0F : 1.0F;
   }

   private static void O00000000000() {
      O00000000000O = -1;
      O00000000000O0 = -1;
      O00000000000OO = -1;
      O0000000000O00 = 0;
      O0000000000O0O = 0;
      O0000000000OO = 0;
      O0000000000OO0 = 0;
      O0000000000OOO = 0;
      O000000000O = 5;
      O000000000O00 = 0.0F;
      O000000000O000 = 0.0F;
      O000000000O00O = 0.0F;
      O000000000O0O = 0.0F;
      O000000000O0O0 = 0.0F;
      O000000000O0OO = 0.0F;
      O000000000OO = 0.0F;
      O000000000OO0 = 0.0F;
      O000000000OO00 = 1;
      O000000000OO0O = 0.0F;
      O000000000OOO = 0.0F;
      O000000000OOO0 = 0.5F;
      O000000000OOOO = 0.55F;
      O00000000O = 0.5F;
      O00000000O0 = 1;
      O000000000O0 = false;
   }
}
