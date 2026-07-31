package ru.metaculture.protection;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class O000000O0OO00O implements MinecraftAccessor {
   private static final int O00000000 = 18;
   private static final long O000000000 = 700L;
   private static float O0000000000 = 34.0F;
   private static float O00000000000 = 22.0F;
   private static final O000000OO0000 O000000000000 = new O000000OO0000();
   private static O000000OO000.W45 O0000000000000;
   private static final O000000O0OO00O.W42 O000000000000O = new O000000O0OO00O.W42();
   private static int O00000000000O = -1;
   private static int O00000000000O0;
   private static int O00000000000OO;
   private static String O0000000000O00 = "Neuro idle";
   private static long O0000000000O0O;
   private static boolean O0000000000OO;

   private O000000O0OO00O() {
   }

   public static void O00000000(LivingEntity livingEntity, boolean bl, boolean bl2) {
      O00000000(livingEntity, bl, bl2, false);
   }

   public static void O00000000(LivingEntity livingEntity, boolean bl, boolean bl2, boolean bl3) {
      if (a_.player != null && a_.world != null && livingEntity != null) {
         O00000000000OO++;
         O00000000(livingEntity);
         O000000O0O00OO var4 = O00000000(livingEntity, O000000000000O);
         O000000O0O00OO var5 = new O000000O0O00OO(a_.player);
         float var6 = MathHelper.wrapDegrees(var4.O00000000 - var5.O00000000);
         float var7 = var4.O000000000 - var5.O000000000;
         float var8 = (float)Math.hypot(var6, var7);
         boolean var9 = bl && !bl2;
         O00000000(var8, var6, var7, var9, bl2);
         if (O00000000(livingEntity, var8, var9)) {
            O00000000(livingEntity, var6, var7, var9);
         }

         O000000OO000.W46 var10 = O00000000000();
         float var11 = O000000000(var8, var9, bl2, var10 != null);
         float var12 = O00000000(var10, var8, var9, bl2);
         O000000O0OO00O.W41 var13 = O00000000(var10, var6, var7, var8, var11, var9);
         O000000O0OO00O.W43 var14 = O00000000(var6, var7, var13, var8, var12, var9, bl2);
         float var15 = var14.targetYawVelocity;
         float var16 = var14.targetPitchVelocity;
         float var17 = var14.yaw;
         float var18 = var14.pitch;
         float var19 = var5.O00000000 + var17;
         float var20 = MathHelper.clamp(var5.O000000000 + var18, -90.0F, 90.0F);
         float var21 = Math.max(0.18F, Math.abs(var17));
         float var22 = Math.max(0.14F, Math.abs(var18));
         O0000000000OO = O000000O0O0O0.O0000000000000 <= 18;
         O000000O0O0O0.O00000000(new O000000O0O00OO(var19, var20), var21, var22, 30.0F, 30.0F, 1, 18, false);
         if (var10 != null) {
            O00000000000O0++;
         }

         O000000000000O.O000000000O = var6;
         O000000000000O.O000000000O0 = var7;
         O000000000000O.O000000000000 = true;
         O0000000000O00 = "Neuro humanize " + O000000000000.O00000000() + "p";
         O00000000(
            bl3,
            "aim target="
               + livingEntity.getId()
               + " type="
               + O000000000000()
               + " sample="
               + O00000000000O0
               + "/"
               + O0000000000000()
               + " yawErr="
               + O000000000(var6)
               + " pitchErr="
               + O000000000(var7)
               + " yawBase="
               + O000000000(var15)
               + " pitchBase="
               + O000000000(var16)
               + " humanYaw="
               + O000000000(var13.yaw)
               + " humanPitch="
               + O000000000(var13.pitch)
               + " yawStep="
               + O000000000(var17)
               + " pitchStep="
               + O000000000(var18)
               + " speed="
               + O000000000(var12)
               + " focus="
               + O000000000(O000000000000O.O000000000000O)
               + "/"
               + O000000000(O000000000000O.O00000000000O0)
               + "/"
               + O000000000(O000000000000O.O00000000000O)
               + " cfg="
               + O000000000(O000000000000O())
               + "/"
               + O000000000(O00000000000OO())
               + " hold="
               + O000000000000O.O00000000000
               + " attack="
               + var9
               + " blocked="
               + bl2
         );
      } else {
         O00000000(AttackAura.O00000000O00.O0000000000());
         O0000000000O00 = "Neuro idle";
         O00000000(bl3, "idle target=" + (livingEntity == null ? "null" : livingEntity.getId()));
      }
   }

   public static void O00000000() {
      O0000000000000 = null;
      O00000000000O = -1;
      O00000000000O0 = 0;
      O000000000000O.O00000000();
      O0000000000OO = false;
      O0000000000O00 = "Neuro reset";
   }

   public static void O00000000(boolean bl) {
      if (!O0000000000OO) {
         O00000000();
      } else {
         if (a_.player != null) {
            O0000000000 = a_.player.getYaw();
            O00000000000 = a_.player.getPitch();
            if (bl) {
               a_.player.setYaw(a_.player.getYaw());
               a_.player.setPitch(a_.player.getPitch());
               a_.player.headYaw = a_.player.getYaw();
            }
         }

         O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
         O000000O0O0O0.O0000000000000 = 0;
         O000000O0O0O0.O00000000000OO = false;
         O000000O0O0O0.O00000000000O0 = null;
         O000000O0O0O0.O00000000000O = 0;
         O000000O0O00O.O00000000 = bl ? false : O000000O0O00O.O000000000;
         O00000000();
      }
   }

   public static void O000000000() {
      O00000000();
   }

   public static String O0000000000() {
      return O0000000000O00 + " / " + O000000000000.O000000000();
   }

   private static boolean O00000000(LivingEntity livingEntity, float f, boolean bl) {
      if (O000000000000.O00000000() == 0) {
         O0000000000000 = null;
         O00000000000O = -1;
         O00000000000O0 = 0;
         return false;
      } else if (O0000000000000 == null || livingEntity.getId() != O00000000000O) {
         return true;
      } else if (O0000000000000.O0000000000O0 == null || O00000000000O0 >= O0000000000000.O0000000000O0.size()) {
         return true;
      } else {
         return bl && !"Attack".equalsIgnoreCase(O0000000000000.O00000000) && O00000000000O0 > 2
            ? true
            : f < 5.0F && "Flick".equalsIgnoreCase(O0000000000000.O00000000) && O00000000000O0 > 2;
      }
   }

   private static void O00000000(LivingEntity livingEntity, float f, float g, boolean bl) {
      O0000000000000 = O000000000000.O00000000(MathHelper.clamp(f, -45.0F, 45.0F), MathHelper.clamp(g, -30.0F, 30.0F), bl);
      O00000000000O = livingEntity.getId();
      O00000000000O0 = 0;
   }

   private static O000000OO000.W46 O00000000000() {
      return O0000000000000 != null && O0000000000000.O0000000000O0 != null && !O0000000000000.O0000000000O0.isEmpty()
         ? O0000000000000.O0000000000O0.get(Math.min(O00000000000O0, O0000000000000.O0000000000O0.size() - 1))
         : null;
   }

   private static float O00000000(float f, boolean bl, boolean bl2, boolean bl3) {
      float var4 = Math.abs(f);
      if (var4 < 0.001F) {
         return 0.0F;
      } else {
         float var5 = bl ? 0.62F : 0.42F;
         float var6 = bl ? 34.0F : 22.0F;
         float var7 = bl ? 0.31F : 0.25F;
         if (bl2) {
            var6 *= 1.12F;
            var7 *= 1.08F;
         }

         if (bl3) {
            var6 *= 0.82F;
            var7 *= 0.88F;
         }

         if (var4 > 95.0F) {
            var7 += bl ? 0.08F : 0.05F;
         }

         float var8 = var4 * var7 + var5;
         if (var4 < 3.0F) {
            var8 = Math.max(var5 * 0.45F, var4 * 0.68F);
         }

         var8 = MathHelper.clamp(var8, var5 * 0.45F, var6);
         var8 = Math.min(var8, var4);
         return Math.signum(f) * var8;
      }
   }

   private static O000000O0OO00O.W43 O00000000(float f, float g, O000000O0OO00O.W41 o00000000, float h, float i, boolean bl, boolean bl2) {
      float var7 = O000000000000O.O000000000O00 + o00000000.yaw * 0.72F;
      float var8 = O000000000000O.O000000000O000 + o00000000.pitch * 0.68F;
      float var9 = O00000000(var7, true, h, i, bl, bl2);
      float var10 = O00000000(var8, false, h, i, bl, bl2);
      float var11 = O000000000(3.4F, 2.75F, 3.15F) * (bl ? 1.12F : 1.0F);
      float var12 = O000000000(2.4F, 1.95F, 2.25F) * (bl ? 1.1F : 1.0F);
      if (bl2) {
         var11 *= 0.78F;
         var12 *= 0.78F;
      }

      O000000000000O.O000000000O00O = O00000000(O000000000000O.O000000000O00O, var9, var11);
      O000000000000O.O000000000O0O = O00000000(O000000000000O.O000000000O0O, var10, var12);
      float var13 = O00000000(O000000000000O.O000000000O00O, f, true, h);
      float var14 = O00000000(O000000000000O.O000000000O0O, g, false, h);
      O000000000000O.O000000000O00O = var13 * 0.86F + O000000000000O.O000000000O00O * 0.14F;
      O000000000000O.O000000000O0O = var14 * 0.86F + O000000000000O.O000000000O0O * 0.14F;
      return new O000000O0OO00O.W43(var13, var14, var9, var10);
   }

   private static float O00000000(float f, boolean bl, float g, float h, boolean bl2, boolean bl3) {
      float var6 = Math.abs(f);
      if (var6 < 0.001F) {
         return 0.0F;
      } else {
         float var7 = (bl ? 34.0F : 22.0F) * O000000000(0.72F, 0.64F, 0.72F);
         float var8 = (float)Math.sqrt(var6) * (bl ? 2.15F : 1.55F);
         float var9 = var6 * (bl ? 0.052F : 0.04F);
         float var10 = var8 + var9;
         if (var6 < 7.0F) {
            var10 = var6 * O000000000(0.54F, 0.43F, 0.48F) + (bl ? 0.12F : 0.08F);
         }

         if (O000000000000O.O00000000000 > 0 && g < 30.0F) {
            var10 *= bl2 ? 0.62F : 0.42F;
         }

         if (bl3) {
            var10 *= 0.76F;
         }

         var10 *= h;
         var10 = MathHelper.clamp(var10, 0.0F, var7);
         return Math.signum(f) * Math.min(var10, var6 + (g < 7.0F ? (bl ? 0.8F : 0.45F) : 0.0F));
      }
   }

   private static float O00000000(float f, float g, float h) {
      float var3 = g - f;
      float var4 = h + Math.abs(f) * 0.16F;
      return f + MathHelper.clamp(var3, -var4, var4);
   }

   private static float O00000000(O000000OO000.W46 o000000000, float f, boolean bl, boolean bl2) {
      float var4 = f > 80.0F ? 1.08F : 0.96F;
      if (o000000000 != null) {
         float var5 = Math.abs(o000000000.O00000000000)
            + Math.abs(o000000000.O000000000000)
            + Math.abs(o000000000.O0000000000000) * 0.035F
            + Math.abs(o000000000.O000000000000O) * 0.03F;
         var4 = 0.78F + MathHelper.clamp(var5 / 7.0F, 0.0F, 1.0F) * 0.48F;
         if (o000000000.O00000000000O > 0.72F) {
            var4 -= 0.04F;
         }
      } else {
         var4 += (float)Math.sin(O00000000000OO * 0.31F) * 0.04F;
      }

      float var9 = O000000000000O();
      var4 += (float)Math.sin(O000000000000O.O000000000 * 0.23F + O000000000000O.O0000000000O00) * 0.065F * var9;
      var4 += (float)Math.sin(O000000000000O.O000000000 * 0.071F + O000000000000O.O0000000000O00 * 0.43F) * 0.035F * var9;
      if (O000000000000O.O00000000000 > 0 && f < 28.0F) {
         var4 *= bl ? 0.74F : 0.58F;
      }

      if (bl) {
         var4 += 0.08F;
      }

      if (bl2) {
         var4 -= 0.12F;
      }

      return MathHelper.clamp(var4, 0.72F, 1.28F);
   }

   private static float O000000000(float f, boolean bl, boolean bl2, boolean bl3) {
      float var4;
      if (f > 90.0F) {
         var4 = 0.52F;
      } else if (f > 35.0F) {
         var4 = 0.74F;
      } else if (f > 8.0F) {
         var4 = 1.0F;
      } else {
         var4 = 0.86F;
      }

      if (bl) {
         var4 *= 1.08F;
      }

      if (bl2) {
         var4 *= 0.55F;
      }

      if (!bl3) {
         var4 *= 0.45F;
      }

      return MathHelper.clamp(var4 * O000000000000O(), 0.0F, 2.25F);
   }

   private static O000000O0OO00O.W41 O00000000(O000000OO000.W46 o000000000, float f, float g, float h, float i, boolean bl) {
      float var6 = O00000000(f);
      float var7 = O00000000(g);
      float var8 = 0.0F;
      float var9 = 0.0F;
      if (o000000000 != null) {
         float var10 = O00000000000O0();
         float var11 = Math.abs(o000000000.O00000000000) * var6 * 0.14F
            + o000000000.O00000000000 * 0.045F
            + Math.signum(o000000000.O00000000000) * Math.min(Math.abs(o000000000.O0000000000000) * 0.012F, 0.42F);
         float var12 = Math.abs(o000000000.O000000000000) * var7 * 0.115F
            + o000000000.O000000000000 * 0.036F
            + Math.signum(o000000000.O000000000000) * Math.min(Math.abs(o000000000.O000000000000O) * 0.01F, 0.34F);
         var8 += MathHelper.clamp(var11 * var10, -4.2F, 4.2F);
         var9 += MathHelper.clamp(var12 * var10, -2.75F, 2.75F);
         if (O0000000000000 != null && o000000000.O00000000000O > 0.82F && h < 10.0F) {
            var8 += var6 * MathHelper.clamp(Math.abs(O0000000000000.O000000000000O) * 0.28F * var10, 0.0F, bl ? 1.65F : 0.95F);
            var9 += var7 * MathHelper.clamp(Math.abs(O0000000000000.O00000000000O) * 0.22F * var10, 0.0F, bl ? 1.05F : 0.65F);
         }
      }

      float var20 = O00000000000O();
      float var21 = (
            (float)Math.sin(O000000000000O.O000000000 * 0.81F + O000000000000O.O0000000000O0O) * 0.26F
               + (float)Math.sin(O000000000000O.O000000000 * 1.37F + O000000000000O.O0000000000O0O * 0.7F) * 0.11F
         )
         * var6
         * var20;
      float var22 = (
            (float)Math.sin(O000000000000O.O000000000 * 0.67F + O000000000000O.O0000000000O0O * 1.3F) * 0.18F
               + (float)Math.sin(O000000000000O.O000000000 * 1.11F + O000000000000O.O0000000000O0O * 0.4F) * 0.075F
         )
         * var7
         * var20;
      float var13 = (float)Math.sin(O000000000000O.O000000000 * 0.097F + O000000000000O.O0000000000OO) * 0.34F;
      float var14 = (float)Math.sin(O000000000000O.O000000000 * 0.083F + O000000000000O.O0000000000OO * 0.62F) * 0.22F;
      float var15 = MathHelper.clamp(Math.abs(g) * 0.008F, 0.0F, 0.32F) * var6;
      float var16 = MathHelper.clamp(Math.abs(f) * 0.005F, 0.0F, 0.22F) * var7;
      float var17 = h < 7.0F ? 1.28F : (h < 18.0F ? 1.12F : (h > 65.0F ? 0.72F : 1.0F));
      var8 += var21 + var13 + var15 + O000000000000O.O0000000000OO0;
      var9 += var22 + var14 + var16 + O000000000000O.O0000000000OOO;
      return new O000000O0OO00O.W41(var8 * i * var17, var9 * i * var17);
   }

   private static float O00000000(float f, float g, boolean bl, float h) {
      float var4 = Math.abs(g);
      if (var4 < 0.001F) {
         return 0.0F;
      } else {
         float var5 = bl ? 39.44F : 24.64F;
         if (var4 > 2.8F && Math.signum(f) != Math.signum(g)) {
            f = Math.signum(g) * Math.min(var4, bl ? 0.34F : 0.24F);
         }

         float var6 = h < 7.0F ? (bl ? 0.95F : 0.55F) : 0.0F;
         float var7 = Math.min(var5, var4 + var6);
         f = MathHelper.clamp(f, -var7, var7);
         if (h > 5.0F && Math.abs(f) > var4) {
            f = g;
         }

         return f;
      }
   }

   private static float O00000000(float f) {
      return f < 0.0F ? -1.0F : 1.0F;
   }

   private static String O000000000000() {
      return O0000000000000 == null ? "synthetic" : O0000000000000.O00000000;
   }

   private static int O0000000000000() {
      return O0000000000000 != null && O0000000000000.O0000000000O0 != null ? O0000000000000.O0000000000O0.size() : 0;
   }

   private static void O00000000(LivingEntity livingEntity) {
      if (O000000000000O.O00000000 != livingEntity.getId()) {
         O000000000000O.O00000000();
         O000000000000O.O00000000 = livingEntity.getId();
         float var1 = O00000000000OO();
         float var2 = O0000000000O0();
         O000000000000O.O000000000000O = O00000000(-0.16F * var1, 0.16F * var1);
         O000000000000O.O00000000000O = O00000000(-0.1F * var1, 0.12F * var1);
         O000000000000O.O00000000000O0 = O00000000(0.58F - 0.06F * var2, 0.58F + 0.1F * var2);
         O000000000000O.O00000000000OO = O00000000(-0.24F * var1, 0.24F * var1);
         O000000000000O.O0000000000O = O00000000(-0.16F * var1, 0.18F * var1);
         O000000000000O.O0000000000O0 = O00000000(0.58F - 0.1F * var2, 0.58F + 0.16F * var2);
         O000000000000O.O0000000000 = O000000000(false);
         O000000000000O.O0000000000O00 = O00000000(0.0F, (float) (Math.PI * 2));
         O000000000000O.O0000000000O0O = O00000000(0.0F, (float) (Math.PI * 2));
         O000000000000O.O0000000000OO = O00000000(0.0F, (float) (Math.PI * 2));
      }
   }

   private static void O00000000(float f, float g, float h, boolean bl, boolean bl2) {
      O000000000000O.O000000000++;
      if (!O000000000000O.O0000000000000) {
         O000000000000O.O000000000O00 = g;
         O000000000000O.O000000000O000 = h;
         O000000000000O.O0000000000000 = true;
      } else {
         float var5 = O000000000(0.66F, 0.48F, 0.55F);
         if (bl) {
            var5 += 0.08F;
         }

         if (bl2) {
            var5 *= 0.72F;
         }

         O000000000000O.O000000000O00 = O000000000000O.O000000000O00
            + MathHelper.wrapDegrees(g - O000000000000O.O000000000O00) * MathHelper.clamp(var5, 0.18F, 0.86F);
         O000000000000O.O000000000O000 = O000000000000O.O000000000O000 + (h - O000000000000O.O000000000O000) * MathHelper.clamp(var5, 0.18F, 0.86F);
      }

      if (O000000000000O.O0000000000-- <= 0) {
         float var8 = O00000000000OO();
         float var6 = O0000000000O0();
         O000000000000O.O00000000000OO = O00000000(-0.3F * var8, 0.3F * var8);
         O000000000000O.O0000000000O = O00000000(-0.2F * var8, 0.22F * var8);
         O000000000000O.O0000000000O0 = O00000000(0.58F - 0.12F * var6, bl ? 0.58F + 0.22F * var6 : 0.58F + 0.16F * var6);
         O000000000000O.O0000000000 = O000000000(bl);
      }

      float var9 = (bl ? 0.16F : 0.095F) * O0000000000O();
      O000000000000O.O000000000000O = O000000000000O.O000000000000O + (O000000000000O.O00000000000OO - O000000000000O.O000000000000O) * var9;
      O000000000000O.O00000000000O = O000000000000O.O00000000000O + (O000000000000O.O0000000000O - O000000000000O.O00000000000O) * var9;
      O000000000000O.O00000000000O0 = O000000000000O.O00000000000O0 + (O000000000000O.O0000000000O0 - O000000000000O.O00000000000O0) * var9;
      if (O000000000000O.O00000000000 > 0) {
         O000000000000O.O00000000000--;
      } else if (!bl2 && f > 2.2F && f < 24.0F) {
         float var10 = bl ? 0.012F : 0.034F;
         if (ThreadLocalRandom.current().nextFloat() < var10) {
            O000000000000O.O00000000000 = ThreadLocalRandom.current().nextInt(1, bl ? 3 : 4);
         }
      }

      if (O000000000000O.O000000000000 && f < 32.0F) {
         float var11 = Math.abs(g) - Math.abs(O000000000000O.O000000000O);
         float var7 = Math.abs(h) - Math.abs(O000000000000O.O000000000O0);
         if (var11 > 0.8F) {
            O000000000000O.O0000000000OO0 = O000000000000O.O0000000000OO0 - Math.signum(g) * MathHelper.clamp(var11 * 0.075F, 0.0F, 0.52F);
         }

         if (var7 > 0.65F) {
            O000000000000O.O0000000000OOO = O000000000000O.O0000000000OOO - Math.signum(h) * MathHelper.clamp(var7 * 0.055F, 0.0F, 0.34F);
         }
      }

      O000000000000O.O0000000000OO0 *= bl ? 0.76F : 0.68F;
      O000000000000O.O0000000000OOO *= bl ? 0.74F : 0.66F;
   }

   private static void O00000000(boolean bl, String string) {
      if (bl) {
         long var2 = System.currentTimeMillis();
         String var4 = "[Neuro] " + string;

         try {
            Path var5 = O000000OO0000.O00000000000().resolve("neuro_debug.log");
            Files.createDirectories(var5.getParent());
            Files.writeString(var5, var2 + " " + var4 + System.lineSeparator(), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
         } catch (Throwable var6) {
         }

         if (var2 - O0000000000O0O >= 700L) {
            O0000000000O0O = var2;
            ChatUtil.O00000000(var4);
         }
      }
   }

   private static String O000000000(float f) {
      return String.format(Locale.ROOT, "%.2f", f);
   }

   private static O000000O0O00OO O00000000(LivingEntity livingEntity, O000000O0OO00O.W42 o000000000) {
      Vec3d var2 = a_.player.getEyePos();
      Box var3 = livingEntity.getBoundingBox();
      Vec3d var4 = livingEntity.getPos();
      Vec3d var5 = a_.player.getPos().subtract(var4);
      double var6 = Math.hypot(var5.x, var5.z);
      double var8 = var6 > 1.0E-4 ? var5.x / var6 : 0.0;
      double var10 = var6 > 1.0E-4 ? var5.z / var6 : 1.0;
      double var12 = var6 > 1.0E-4 ? var5.z / var6 : 1.0;
      double var14 = var6 > 1.0E-4 ? -var5.x / var6 : 0.0;
      double var16 = o000000000.O000000000000O * Math.max(0.25, (double)livingEntity.getWidth());
      double var18 = o000000000.O00000000000O * Math.max(0.25, (double)livingEntity.getWidth());
      double var20 = var3.minY + livingEntity.getHeight() * 0.22;
      double var22 = var3.minY + livingEntity.getHeight() * 0.84;
      Vec3d var24 = new Vec3d(
         MathHelper.clamp(var4.x + var12 * var16 + var8 * var18, var3.minX, var3.maxX),
         MathHelper.clamp(var3.minY + livingEntity.getHeight() * o000000000.O00000000000O0, var20, var22),
         MathHelper.clamp(var4.z + var14 * var16 + var10 * var18, var3.minZ, var3.maxZ)
      );
      Vec3d var25 = var24.subtract(var2);
      float var26 = (float)Math.toDegrees(Math.atan2(-var25.x, var25.z));
      float var27 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var25.y, Math.hypot(var25.x, var25.z))), -90.0, 90.0);
      return new O000000O0O00OO(var26, var27);
   }

   private static float O00000000(float f, float g) {
      return f + ThreadLocalRandom.current().nextFloat() * (g - f);
   }

   private static int O000000000(boolean bl) {
      float var1 = O0000000000O();
      int var2 = Math.max(2, Math.round((bl ? 5.0F : 7.0F) / var1));
      int var3 = Math.max(var2 + 1, Math.round((bl ? 14.0F : 22.0F) / var1));
      return ThreadLocalRandom.current().nextInt(var2, var3 + 1);
   }

   private static float O000000000000O() {
      return O000000000(1.05F, 1.45F, 1.75F);
   }

   private static float O00000000000O() {
      return O000000000(0.78F, 1.18F, 1.42F);
   }

   private static float O00000000000O0() {
      return O000000000(1.0F, 1.35F, 1.65F);
   }

   private static float O00000000000OO() {
      return O000000000(0.9F, 1.32F, 1.58F);
   }

   private static float O0000000000O() {
      return O000000000(0.82F, 1.08F, 1.32F);
   }

   private static float O0000000000O0() {
      return O000000000(0.78F, 1.08F, 1.32F);
   }

   private static float O000000000(float f, float g, float h) {
      String var4 = AttackAura.O00000000O.O0000000000();

      float var3 = switch (var4) {
         case "Stable" -> f;
         case "Dynamic" -> h;
         default -> g;
      };
      return MathHelper.clamp(var3 * AttackAura.O00000000O0.O0000000000(), 0.0F, 3.0F);
   }

   record W41(float yaw, float pitch) {
   }

   static final class W42 {
      int O00000000 = -1;
      int O000000000;
      int O0000000000;
      int O00000000000;
      boolean O000000000000;
      boolean O0000000000000;
      float O000000000000O;
      float O00000000000O;
      float O00000000000O0 = 0.58F;
      float O00000000000OO;
      float O0000000000O;
      float O0000000000O0 = 0.58F;
      float O0000000000O00;
      float O0000000000O0O;
      float O0000000000OO;
      float O0000000000OO0;
      float O0000000000OOO;
      float O000000000O;
      float O000000000O0;
      float O000000000O00;
      float O000000000O000;
      float O000000000O00O;
      float O000000000O0O;

      void O00000000() {
         this.O00000000 = -1;
         this.O000000000 = 0;
         this.O0000000000 = 0;
         this.O00000000000 = 0;
         this.O000000000000 = false;
         this.O0000000000000 = false;
         this.O000000000000O = 0.0F;
         this.O00000000000O = 0.0F;
         this.O00000000000O0 = 0.58F;
         this.O00000000000OO = 0.0F;
         this.O0000000000O = 0.0F;
         this.O0000000000O0 = 0.58F;
         this.O0000000000O00 = 0.0F;
         this.O0000000000O0O = 0.0F;
         this.O0000000000OO = 0.0F;
         this.O0000000000OO0 = 0.0F;
         this.O0000000000OOO = 0.0F;
         this.O000000000O = 0.0F;
         this.O000000000O0 = 0.0F;
         this.O000000000O00 = 0.0F;
         this.O000000000O000 = 0.0F;
         this.O000000000O00O = 0.0F;
         this.O000000000O0O = 0.0F;
      }
   }

   record W43(float yaw, float pitch, float targetYawVelocity, float targetPitchVelocity) {
   }
}
