package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class O000000O0O0OOO implements MinecraftAccessor {
   private static final long O00000000 = 520L;
   private static float O000000000;
   private static float O0000000000;
   private static float O00000000000;
   private static float O000000000000;
   private static float O0000000000000;
   private static Vec3d O000000000000O;
   private static Vec3d O00000000000O;
   private static int O00000000000O0;
   private static boolean O00000000000OO;
   private static long O0000000000O00;
   private static int O0000000000O0O;
   private static int O0000000000OO = ThreadLocalRandom.current().nextInt(7, 15);
   private static boolean O0000000000OO0;
   private static long O0000000000OOO;
   private static int O000000000O = Integer.MIN_VALUE;
   private static boolean O000000000O0;
   private static long O000000000O00;

   public static void O00000000(LivingEntity livingEntity) {
      if (a_.player != null && a_.world != null && livingEntity != null) {
         O000000000O0 = false;
         long var1 = System.currentTimeMillis();
         O000000000(livingEntity);
         O000000000000O = livingEntity.getPos()
            .add(
               Math.sin(var1 / 900.0) * 0.2F,
               livingEntity.getHeight() / 2.0F + livingEntity.getHeight() / 2.5F * Math.sin(var1 / 700.0),
               Math.cos(var1 / 700.0) * 0.12F
            );
         O00000000000O = a_.player.getEyePos();
         Vec3d var3 = O000000000000O.subtract(O00000000000O).normalize();
         float var4 = (float)Math.toDegrees(Math.atan2(-var3.x, var3.z));
         float var5 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var3.y, Math.hypot(var3.x, var3.z))), -90.0, 90.0);
         float var6 = O00000000(3.0, 11.0, 90.0);
         float var7 = O000000000(3.0, 11.0, 100.0);
         O000000000000 = var6;
         O0000000000000 = var7;
         float[] var8 = AttackAura.O000000000(livingEntity);
         float[] var9 = new float[]{var8[0], var8[1], var8[0] + var8[1]};
         boolean var10 = O000000O00OOOO.O00000000(livingEntity, false, true, true, -200L, var9);
         if (var10) {
            O000000000 = 1.0F;
         }

         if (O0000000000OO0) {
            if (var1 > O0000000000OOO) {
               O0000000000OO0 = false;
            } else {
               O0000000000 = a_.player.getYaw() - (ThreadLocalRandom.current().nextBoolean() ? -O00000000(20.0F, 40.0F) : O00000000(20.0F, 30.0F));
               O00000000000 = O00000000(85.0F, 90.0F);
            }
         }

         if (O000000000 != 0.0F) {
            if (!O0000000000OO0) {
               O0000000000 = var4;
               O00000000000 = var5;
            }

            O000000000--;
         }

         if (O00000000000OO && var1 >= O0000000000O00) {
            O00000000000OO = false;
         }

         O000000O0O0O0.O00000000(
            new O000000O0O00OO(O0000000000 + var6, MathHelper.clamp(O00000000000 + var7, -90.0F, 90.0F)),
            O00000000(40.124813F, 55.41284F),
            O0000000000OO0 ? 360.0F : O00000000(4.412848F, 12.412894F),
            O00000000(40.124813F, 140.41284F),
            O00000000(40.124813F, 140.41284F),
            0,
            1,
            false
         );
      }
   }

   public static void O00000000() {
      O00000000000OO = true;
      O0000000000O00 = System.currentTimeMillis() + 150L;
      O00000000000O0 = (O00000000000O0 + 1) % 2;
      O0000000000O0O++;
      if (O0000000000O0O >= O0000000000OO) {
         O0000000000O0O = 0;
         O0000000000OO = ThreadLocalRandom.current().nextInt(4, 6);
         O0000000000OO0 = true;
         O0000000000OOO = System.currentTimeMillis() + ThreadLocalRandom.current().nextInt(60, 110);
      }
   }

   public static void O000000000() {
      if (a_.player != null && (O000000000000() || O000000000O0)) {
         if (!O000000000O0) {
            O000000000O0 = true;
            O000000000O00 = System.currentTimeMillis();
         }

         O00000000000();
         O00000000(false);
      } else {
         O00000000(true);
      }
   }

   public static void O0000000000() {
      if (O000000000O0) {
         if (a_.player == null) {
            O00000000(true);
         } else {
            O00000000000();
         }
      }
   }

   private static void O00000000000() {
      long var0 = System.currentTimeMillis();
      float var2 = MathHelper.clamp((float)(var0 - O000000000O00) / 520.0F, 0.0F, 1.0F);
      float var3 = 1.0F - var2;
      float var4 = var3 * var3;
      float var5 = O00000000(3.0, 11.0, 90.0) * var4;
      float var6 = O000000000(3.0, 11.0, 100.0) * var4;
      float var7 = O00000000(5.0F, 42.0F, var4);
      float var8 = O00000000(3.0F, 18.0F, var4);
      float var9 = O00000000(4.0F, 32.0F, var4);
      O000000O0O0O0.O00000000(
         new O000000O0O00OO(O000000O0O00O.O0000000000 + var5, MathHelper.clamp(O000000O0O00O.O00000000000 + var6, -90.0F, 90.0F)),
         var7,
         var8,
         var9,
         var9,
         0,
         1,
         false
      );
      if (var2 >= 1.0F) {
         O00000000(true);
      }
   }

   private static void O00000000(boolean bl) {
      O000000000 = 0.0F;
      O000000000000 = 0.0F;
      O0000000000000 = 0.0F;
      O000000000000O = null;
      O00000000000O = null;
      O00000000000O0 = 0;
      O00000000000OO = false;
      O0000000000O00 = 0L;
      O0000000000O0O = 0;
      O0000000000OO = ThreadLocalRandom.current().nextInt(7, 15);
      O0000000000OO0 = false;
      O0000000000OOO = 0L;
      O000000000O = Integer.MIN_VALUE;
      if (bl) {
         O000000000O0 = false;
         O000000000O00 = 0L;
         if (a_.player != null) {
            O0000000000 = a_.player.getYaw();
            O00000000000 = a_.player.getPitch();
         }
      }
   }

   private static void O000000000(LivingEntity livingEntity) {
      if (O000000000O != livingEntity.getId()) {
         O000000000O = livingEntity.getId();
         O000000000 = 0.0F;
         O0000000000OO0 = false;
         O0000000000 = a_.player.getYaw();
         O00000000000 = a_.player.getPitch();
      }
   }

   private static boolean O000000000000() {
      return O000000000O != Integer.MIN_VALUE
         || O000000000000O != null
         || O00000000000O != null
         || O000000000 != 0.0F
         || O00000000000OO
         || O0000000000OO0
         || O000000000000 != 0.0F
         || O0000000000000 != 0.0F;
   }

   private static float O00000000(float f, float g) {
      return ThreadLocalRandom.current().nextFloat(f, g);
   }

   private static float O00000000(float f, float g, float h) {
      return f + (g - f) * h;
   }

   private static float O00000000(double d, double e, double f) {
      return (float)(Math.sin(System.currentTimeMillis() / f) * O00000000((float)d, (float)e));
   }

   private static float O000000000(double d, double e, double f) {
      return (float)(Math.cos(System.currentTimeMillis() / f) * O00000000((float)d, (float)e));
   }
}
