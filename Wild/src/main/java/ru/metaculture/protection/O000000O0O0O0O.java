package ru.metaculture.protection;

import java.security.SecureRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class O000000O0O0O0O implements MinecraftAccessor {
   private static final SecureRandom O00000000 = new SecureRandom();
   private static final long O000000000 = 3500L;
   private static final int O0000000000 = 31;
   private static final long O00000000000 = 250L;
   private static final long O000000000000 = 238L;
   private static int O0000000000000;
   private static int O000000000000O = -1;
   private static boolean O00000000000O;

   private O000000O0O0O0O() {
   }

   public static void O00000000(LivingEntity livingEntity) {
      if (a_.player != null && livingEntity != null) {
         O00000000000O = true;
         O000000O0O00OO var1 = new O000000O0O00OO(a_.player);
         O000000O0O00OO var2 = O000000000(livingEntity);
         float[] var3 = AttackAura.O000000000(livingEntity);
         boolean var4 = O000000O00OOOO.O00000000(livingEntity, false, false, true, 0L, var3);
         boolean var5 = O000000O00OOOO.O00000000(livingEntity, false, false, true, -50L, var3);
         O000000O0O00OO var6;
         if (a_.interactionManager == null) {
            var6 = O000000O0OO.O00000000(var1, var2, livingEntity, true, var5);
         } else {
            var6 = O00000000(var1, var2, livingEntity, var4, var5);
         }

         O00000000(var6);
      }
   }

   public static void O00000000() {
      if (O00000000000O && a_.player != null) {
         O000000O0O00OO var0 = new O000000O0O00OO(a_.player);
         O000000O0O00OO var1 = new O000000O0O00OO(O000000O0O00O.O0000000000, O000000O0O00O.O00000000000);
         if (var0.O00000000(var1) < 1.0F) {
            O00000000000O = false;
         } else {
            O00000000(O00000000(var0, var1, null, false, false));
         }
      }
   }

   public static void O000000000() {
      O0000000000000++;
   }

   public static void O0000000000() {
      O0000000000000 = 0;
      O000000000000O = -1;
      O00000000000O = false;
   }

   private static O000000O0O00OO O00000000(O000000O0O00OO o000000O0O00OO, O000000O0O00OO o000000O0O00OO2, LivingEntity livingEntity, boolean bl, boolean bl2) {
      long var5 = (long)O000000O00OOOO.O0000000000OO();
      O000000O0O00OO var7 = O00000000(o000000O0O00OO, o000000O0O00OO2);
      float var8 = var7.O00000000;
      float var9 = var7.O000000000;
      float var10 = (float)Math.hypot(Math.abs(var8), Math.abs(var9));
      if (var10 < 1.0E-4F) {
         var10 = 1.0E-4F;
      }

      boolean var11 = O0000000000000 > 0 && O0000000000000 % 31 == 0 && var5 < 250L;
      if (var11) {
         if (var5 >= 238L && O000000000000O != O0000000000000) {
            a_.player.swingHand(Hand.MAIN_HAND);
            O000000000000O = O0000000000000;
         }

         float var12 = o000000O0O00OO.O00000000 + MathHelper.clamp(var8, -22.0F, 22.0F);
         return new O000000O0O00OO(var12, -85.0F);
      } else {
         return livingEntity != null
            ? O00000000(o000000O0O00OO, var8, var9, var10, livingEntity, bl, bl2, var5)
            : O00000000(o000000O0O00OO, var8, var9, var10, var5);
      }
   }

   private static O000000O0O00OO O00000000(O000000O0O00OO o000000O0O00OO, float f, float g, float h, LivingEntity livingEntity, boolean bl, boolean bl2, long l) {
      boolean var9 = a_.player.distanceTo(livingEntity) <= AttackAura.O00000000(livingEntity);
      boolean var10 = l < 180L;
      float var11 = O00000000(18.0F, 28.0F);
      float var12 = O00000000(2.8F, 6.2F);
      if (bl2) {
         var11 = Math.max(var11, O00000000(34.0F, 52.0F));
         var12 = Math.max(var12, O00000000(4.2F, 7.8F));
      }

      if (var10) {
         var11 = Math.max(var11, O00000000(44.0F, 72.0F));
         var12 = Math.max(var12, O00000000(5.4F, 10.0F));
      }

      if (Math.abs(f) > 40.0F) {
         var11 += O00000000(10.0F, 18.0F);
      }

      if (Math.abs(f) > 75.0F) {
         var11 += O00000000(12.0F, 24.0F);
      }

      if (Math.abs(g) > 20.0F) {
         var12 += O00000000(1.4F, 3.2F);
      }

      if (Math.abs(g) > 35.0F) {
         var12 += O00000000(1.6F, 3.8F);
      }

      float var13 = O00000000(f, h, var11);
      float var14 = O00000000(g, h, var12);
      float var15 = MathHelper.clamp(f, -var13, var13);
      float var16 = MathHelper.clamp(g, -var14, var14);
      float var17 = bl ? 1.0F : (bl2 ? O00000000(0.88F, 0.97F) : (var10 ? O00000000(0.74F, 0.88F) : O00000000(0.56F, 0.74F)));
      if (var9 && !bl2 && !var10) {
         var17 = Math.max(var17, O00000000(0.68F, 0.82F));
      }

      float var18 = var9 ? 1.25F : 0.9F;
      if (bl2) {
         var18 = Math.max(var18, 1.4F);
      }

      if (var10) {
         var18 = Math.max(var18, 1.55F);
      }

      float var19 = O00000000(l, O0000000000000, var18, Math.abs(f));
      float var20 = O000000000(l, O0000000000000, var18, Math.abs(g));
      if (Math.abs(f) < 4.0F) {
         var19 *= 0.35F;
      }

      if (Math.abs(g) < 2.5F) {
         var20 *= 0.25F;
      }

      float var21 = O000000000(var17, o000000O0O00OO.O00000000, o000000O0O00OO.O00000000 + var15) + var19;
      float var22 = O000000000(var17, o000000O0O00OO.O000000000, o000000O0O00OO.O000000000 + var16) + var20;
      return new O000000O0O00OO(var21, MathHelper.clamp(var22, -90.0F, 90.0F));
   }

   private static O000000O0O00OO O00000000(O000000O0O00OO o000000O0O00OO, float f, float g, float h, long l) {
      O000000O0O00OO var6 = switch (O0000000000000 % 4) {
         case 0 -> new O000000O0O00OO((float)Math.cos((float)l / 40.0F + O0000000000000 % 6), (float)Math.sin((float)l / 40.0F + O0000000000000 % 6));
         case 1 -> new O000000O0O00OO((float)Math.sin((float)l / 40.0F + O0000000000000 % 6), (float)Math.cos((float)l / 40.0F + O0000000000000 % 6));
         case 2 -> new O000000O0O00OO((float)Math.sin((float)l / 40.0F + O0000000000000 % 6), (float)(-Math.cos((float)l / 40.0F + O0000000000000 % 6)));
         default -> new O000000O0O00OO((float)(-Math.cos((float)l / 40.0F + O0000000000000 % 6)), (float)Math.sin((float)l / 40.0F + O0000000000000 % 6));
      };
      float var7 = MathHelper.clamp((float)l / 3500.0F, 0.0F, 1.0F);
      float var8 = l >= 3500L ? 0.0F : 1.0F - var7 * 0.55F;
      float var9 = var8 > 0.0F ? O00000000(12.0F, 22.0F) * var6.O00000000 * var8 : 0.0F;
      float var10 = O00000000(0.35F, 1.35F) * (float)Math.cos(System.currentTimeMillis() / 420.0 + O0000000000000);
      float var11 = var8 > 0.0F ? (O00000000(2.2F, 5.8F) * var6.O000000000 + var10) * var8 : 0.0F;
      float var12 = l < 180L ? O00000000(0.0F, 3.5F) : (l < 600L ? O00000000(4.0F, 10.0F) : (l >= 3500L ? O00000000(12.0F, 28.0F) : O00000000(6.0F, 14.0F)));
      float var13 = l < 180L ? O00000000(0.0F, 1.0F) : (l < 600L ? O00000000(1.2F, 3.0F) : (l >= 3500L ? O00000000(3.0F, 6.8F) : O00000000(1.5F, 4.2F)));
      float var14 = O00000000(f, h, var12);
      float var15 = O00000000(g, h, var13);
      float var16 = MathHelper.clamp(f, -var14, var14);
      float var17 = MathHelper.clamp(g, -var15, var15);
      float var18 = l < 180L ? 0.0F : (l < 600L ? O00000000(0.08F, 0.22F) : (l >= 3500L ? O00000000(0.54F, 0.78F) : O00000000(0.2F, 0.42F)));
      float var19 = O000000000(var18, o000000O0O00OO.O00000000, o000000O0O00OO.O00000000 + var16) + var9;
      float var20 = O000000000(var18, o000000O0O00OO.O000000000, o000000O0O00OO.O000000000 + var17) + var11;
      return new O000000O0O00OO(var19, MathHelper.clamp(var20, -90.0F, 90.0F));
   }

   private static O000000O0O00OO O000000000(LivingEntity livingEntity) {
      Vec3d var1 = O000000O0O000.O000000000(livingEntity.getBoundingBox());
      Vec3d var2 = var1.subtract(a_.player.getEyePos());
      return new O000000O0O00OO(
         (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(var2.z, var2.x)) - 90.0),
         (float)MathHelper.wrapDegrees(Math.toDegrees(-Math.atan2(var2.y, Math.hypot(var2.x, var2.z))))
      );
   }

   private static O000000O0O00OO O00000000(O000000O0O00OO o000000O0O00OO, O000000O0O00OO o000000O0O00OO2) {
      return new O000000O0O00OO(
         MathHelper.wrapDegrees(o000000O0O00OO2.O00000000 - o000000O0O00OO.O00000000),
         MathHelper.clamp(MathHelper.wrapDegrees(o000000O0O00OO2.O000000000 - o000000O0O00OO.O000000000), -90.0F, 90.0F)
      );
   }

   private static void O00000000(O000000O0O00OO o000000O0O00OO) {
      O000000O0O0O0.O00000000(o000000O0O00OO, 360.0F, 360.0F, 45.0F, 45.0F, 0, 15, false);
   }

   private static float O00000000(long l, int i, float f, float g) {
      float var5 = (float)Math.sin((float)l / 38.0F + i * 0.37F) * O00000000(0.45F, 1.25F)
         + (float)Math.cos((float)l / 71.0F + i * 0.18F) * O00000000(0.18F, 0.55F);
      if (O00000000(g > 24.0F ? 0.22F : 0.08F)) {
         var5 += O00000000(-1.55F, 1.55F);
      }

      return var5 * f;
   }

   private static float O000000000(long l, int i, float f, float g) {
      float var5 = (float)Math.sin((float)l / 52.0F + i * 0.21F) * O00000000(0.1F, 0.42F)
         + (float)Math.cos((float)l / 93.0F + i * 0.11F) * O00000000(0.08F, 0.28F);
      if (O00000000(g > 8.0F ? 0.18F : 0.06F)) {
         var5 += O00000000(-0.55F, 0.55F);
      }

      return var5 * f;
   }

   private static float O00000000(float f, float g, float h) {
      return Math.abs(f / g) * h;
   }

   private static boolean O00000000(float f) {
      return O00000000.nextFloat() < f;
   }

   private static float O00000000(float f, float g) {
      return O000000000(O00000000.nextFloat(), f, g);
   }

   private static float O000000000(float f, float g, float h) {
      return g + f * (h - g);
   }
}
