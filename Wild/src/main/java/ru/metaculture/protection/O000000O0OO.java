package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class O000000O0OO implements MinecraftAccessor {
   private static final int O00000000 = 2;
   private static long O000000000 = -1L;
   private static boolean O0000000000;
   private static final O000000O0O0O0.W34 O00000000000 = O000000O0OO::O0000000000;

   private O000000O0OO() {
   }

   public static void O00000000(LivingEntity livingEntity) {
      if (a_.player != null && livingEntity != null) {
         O0000000000 = true;
         O000000O0O00OO var1 = new O000000O0O00OO(a_.player);
         O000000O0O00OO var2 = O000000000(livingEntity);
         boolean var3 = O000000O0O0OO.O00000000(livingEntity, 2);
         O00000000(O00000000(var1, var2, livingEntity, true, var3));
      }
   }

   public static void O00000000() {
      if (O0000000000) {
         O000000O0O0O0.O00000000(O00000000000);
      }
   }

   public static O000000O0O00OO O00000000(O000000O0O00OO o000000O0O00OO, O000000O0O00OO o000000O0O00OO2, LivingEntity livingEntity, boolean bl, boolean bl2) {
      if (a_.player == null) {
         return o000000O0O00OO;
      } else if (bl && livingEntity != null && bl2) {
         O000000000 = -1L;
         return O00000000(o000000O0O00OO, o000000O0O00OO2, 130.0F, 130.0F, 0.85F, 0.0F, 0.0F);
      } else {
         O000000O0O00OO var5 = new O000000O0O00OO(O000000O0O00O.O0000000000, O000000O0O00O.O00000000000);
         O000000O0O00OO var6 = O00000000(o000000O0O00OO, var5);
         float var7 = Math.max((float)Math.hypot(Math.abs(var6.O00000000), Math.abs(var6.O000000000)), 1.0E-4F);
         float var8 = (float)(O00000000(4.0F, 15.0F) * Math.sin(System.currentTimeMillis() / 95.0));
         float var9 = (float)(O00000000(6.0F, 7.0F) * Math.cos(System.currentTimeMillis() / 45.0));
         if (bl && livingEntity != null) {
            O000000000 = -1L;
         } else {
            if (O000000000 < 0L) {
               O000000000 = System.currentTimeMillis();
            }

            float var10 = 1.0F - MathHelper.clamp((float)(System.currentTimeMillis() - O000000000) / 1000.0F, 0.0F, 1.0F);
            var8 *= var10;
            var9 *= var10;
         }

         float var12 = Math.abs(var6.O00000000 / var7) * (!O000000O00OOOO.O000000000(535L) ? 0.0F : 45.0F);
         float var11 = Math.abs(var6.O000000000 / var7) * (!O000000O00OOOO.O000000000(535L) ? 0.0F : 45.0F);
         return new O000000O0O00OO(
            O00000000(0.85F, o000000O0O00OO.O00000000, o000000O0O00OO.O00000000 + MathHelper.clamp(var6.O00000000, -var12, var12) + var8),
            MathHelper.clamp(
               O00000000(0.85F, o000000O0O00OO.O000000000, o000000O0O00OO.O000000000 + MathHelper.clamp(var6.O000000000, -var11, var11) + var9), -90.0F, 90.0F
            )
         );
      }
   }

   public static void O000000000() {
      O000000000 = -1L;
      O0000000000 = false;
      O000000O0O0O0.O000000000(O00000000000);
   }

   private static O000000O0O0O0.W35 O0000000000() {
      if (O0000000000 && a_.player != null) {
         O000000O0O00OO var0 = new O000000O0O00OO(a_.player);
         O000000O0O00OO var1 = new O000000O0O00OO(O000000O0O00O.O0000000000, O000000O0O00O.O00000000000);
         if (var0.O00000000(var1) < 1.0F) {
            O000000000();
            return O000000O0O0O0.W35.O00000000();
         } else {
            O000000O0O00OO var2 = O00000000(var0, var1, null, false, false);
            return new O000000O0O0O0.W35(var2, 360.0F, 360.0F, false);
         }
      } else {
         O000000000();
         return O000000O0O0O0.W35.O00000000();
      }
   }

   private static O000000O0O00OO O000000000(LivingEntity livingEntity) {
      Vec3d var1 = O000000O0O000.O000000000(livingEntity.getBoundingBox());
      Vec3d var2 = var1.subtract(a_.player.getEyePos());
      return new O000000O0O00OO(
         (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(var2.z, var2.x)) - 90.0),
         (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var2.y, Math.hypot(var2.x, var2.z))), -90.0, 90.0)
      );
   }

   private static void O00000000(O000000O0O00OO o000000O0O00OO) {
      O000000O0O0O0.O00000000(o000000O0O00OO, 360.0F, 360.0F, 45.0F, 45.0F, 0, 15, false, O00000000000);
   }

   private static O000000O0O00OO O00000000(O000000O0O00OO o000000O0O00OO, O000000O0O00OO o000000O0O00OO2, float f, float g, float h, float i, float j) {
      O000000O0O00OO var7 = O00000000(o000000O0O00OO, o000000O0O00OO2);
      float var8 = Math.max((float)Math.hypot(Math.abs(var7.O00000000), Math.abs(var7.O000000000)), 1.0E-4F);
      float var9 = Math.abs(var7.O00000000 / var8) * f;
      float var10 = Math.abs(var7.O000000000 / var8) * g;
      return new O000000O0O00OO(
         O00000000(h, o000000O0O00OO.O00000000, o000000O0O00OO.O00000000 + MathHelper.clamp(var7.O00000000, -var9, var9) + i),
         MathHelper.clamp(
            O00000000(h, o000000O0O00OO.O000000000, o000000O0O00OO.O000000000 + MathHelper.clamp(var7.O000000000, -var10, var10) + j), -90.0F, 90.0F
         )
      );
   }

   private static O000000O0O00OO O00000000(O000000O0O00OO o000000O0O00OO, O000000O0O00OO o000000O0O00OO2) {
      return new O000000O0O00OO(
         MathHelper.wrapDegrees(o000000O0O00OO2.O00000000 - o000000O0O00OO.O00000000),
         MathHelper.clamp(MathHelper.wrapDegrees(o000000O0O00OO2.O000000000 - o000000O0O00OO.O000000000), -90.0F, 90.0F)
      );
   }

   private static float O00000000(float f, float g) {
      return (float)ThreadLocalRandom.current().nextDouble(f, g);
   }

   private static float O00000000(float f, float g, float h) {
      return g + f * (h - g);
   }
}
