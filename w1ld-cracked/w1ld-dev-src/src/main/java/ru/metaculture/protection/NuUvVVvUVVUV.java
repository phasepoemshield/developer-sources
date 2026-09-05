package ru.metaculture.protection;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public final class NuUvVVvUVVUV implements O000c0oocoo {
   private static final int UuUVuuUu = 18;
   private static final long C00OOC00oO = 700L;
   private static final float uUnuvNvvNU = 34.0F;
   private static final float vVvUvVVuuNvV = 22.0F;
   private static final NUNNNUuUNnVv uNNnnnuuuN = new NUNNNUuUNnVv();
   private static NUnUuVuNv.NVnVnNnN nuUnNvnuUu;
   private static final NuUvVVvUVVUV.nvnNNunvv VVuuUN = new NuUvVVvUVVUV.nvnNNunvv();
   private static int vNUvnnVnUvu = -1;
   private static int uVUuuVnNVU;
   private static int vuuuNvNuv;
   private static String nUUVuvU = "Neuro idle";
   private static long UnUNVVVNuv;
   private static boolean vNVuvnUUnuUn;

   private NuUvVVvUVVUV() {
   }

   public static void UuUVuuUu(class_1309 var0, boolean var1, boolean var2) {
      UuUVuuUu(var0, var1, var2, false);
   }

   public static void UuUVuuUu(class_1309 var0, boolean var1, boolean var2, boolean var3) {
      if (a_.field_1724 != null && a_.field_1687 != null && var0 != null) {
         vuuuNvNuv++;
         UuUVuuUu(var0);
         uuUuvNuNVNVU var4 = UuUVuuUu(var0, VVuuUN);
         uuUuvNuNVNVU var5 = new uuUuvNuNVNVU(a_.field_1724);
         float var6 = class_3532.method_15393(var4.UuUVuuUu - var5.UuUVuuUu);
         float var7 = var4.C00OOC00oO - var5.C00OOC00oO;
         float var8 = (float)Math.hypot(var6, var7);
         boolean var9 = var1 && !var2;
         UuUVuuUu(var8, var6, var7, var9, var2);
         if (UuUVuuUu(var0, var8, var9)) {
            UuUVuuUu(var0, var6, var7, var9);
         }

         NUnUuVuNv.nvnNNunvv var10 = vVvUvVVuuNvV();
         float var11 = C00OOC00oO(var8, var9, var2, var10 != null);
         float var12 = UuUVuuUu(var10, var8, var9, var2);
         NuUvVVvUVVUV.NVnVnNnN var13 = UuUVuuUu(var10, var6, var7, var8, var11, var9);
         NuUvVVvUVVUV.VvunVVUvUNnv var14 = UuUVuuUu(var6, var7, var13, var8, var12, var9, var2);
         float var15 = var14.targetYawVelocity;
         float var16 = var14.targetPitchVelocity;
         float var17 = var14.yaw;
         float var18 = var14.pitch;
         float var19 = var5.UuUVuuUu + var17;
         float var20 = class_3532.method_15363(var5.C00OOC00oO + var18, -90.0F, 90.0F);
         float var21 = Math.max(0.18F, Math.abs(var17));
         float var22 = Math.max(0.14F, Math.abs(var18));
         vNVuvnUUnuUn = COC0OCc.nuUnNvnuUu <= 18;
         COC0OCc.UuUVuuUu(new uuUuvNuNVNVU(var19, var20), var21, var22, 30.0F, 30.0F, 1, 18, false);
         if (var10 != null) {
            uVUuuVnNVU++;
         }

         VVuuUN.NVNnnvnuunNv = var6;
         VVuuUN.uVunuUNVVUUV = var7;
         VVuuUN.uNNnnnuuuN = true;
         nUUVuvU = "Neuro humanize " + uNNnnnuuuN.UuUVuuUu() + "p";
         UuUVuuUu(
            var3,
            "aim target="
               + var0.method_5628()
               + " type="
               + uNNnnnuuuN()
               + " sample="
               + uVUuuVnNVU
               + "/"
               + nuUnNvnuUu()
               + " yawErr="
               + C00OOC00oO(var6)
               + " pitchErr="
               + C00OOC00oO(var7)
               + " yawBase="
               + C00OOC00oO(var15)
               + " pitchBase="
               + C00OOC00oO(var16)
               + " humanYaw="
               + C00OOC00oO(var13.yaw)
               + " humanPitch="
               + C00OOC00oO(var13.pitch)
               + " yawStep="
               + C00OOC00oO(var17)
               + " pitchStep="
               + C00OOC00oO(var18)
               + " speed="
               + C00OOC00oO(var12)
               + " focus="
               + C00OOC00oO(VVuuUN.VVuuUN)
               + "/"
               + C00OOC00oO(VVuuUN.uVUuuVnNVU)
               + "/"
               + C00OOC00oO(VVuuUN.vNUvnnVnUvu)
               + " cfg="
               + C00OOC00oO(VVuuUN())
               + "/"
               + C00OOC00oO(vuuuNvNuv())
               + " hold="
               + VVuuUN.vVvUvVVuuNvV
               + " attack="
               + var9
               + " blocked="
               + var2
         );
      } else {
         UuUVuuUu(AttackAura.nVVUuvuNnUN.uUnuvNvvNU());
         nUUVuvU = "Neuro idle";
         UuUVuuUu(var3, "idle target=" + (var0 == null ? "null" : var0.method_5628()));
      }
   }

   public static void UuUVuuUu() {
      nuUnNvnuUu = null;
      vNUvnnVnUvu = -1;
      uVUuuVnNVU = 0;
      VVuuUN.UuUVuuUu();
      vNVuvnUUnuUn = false;
      nUUVuvU = "Neuro reset";
   }

   public static void UuUVuuUu(boolean var0) {
      if (!vNVuvnUUnuUn) {
         UuUVuuUu();
      } else {
         if (a_.field_1724 != null) {
            uUnuvNvvNU = a_.field_1724.method_36454();
            vVvUvVVuuNvV = a_.field_1724.method_36455();
            if (var0) {
               a_.field_1724.method_36456(a_.field_1724.method_36454());
               a_.field_1724.method_36457(a_.field_1724.method_36455());
               a_.field_1724.field_6241 = a_.field_1724.method_36454();
            }
         }

         COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
         COC0OCc.nuUnNvnuUu = 0;
         COC0OCc.vuuuNvNuv = false;
         COC0OCc.uVUuuVnNVU = null;
         COC0OCc.vNUvnnVnUvu = 0;
         NNvvnnunn.UuUVuuUu = var0 ? false : NNvvnnunn.C00OOC00oO;
         UuUVuuUu();
      }
   }

   public static void C00OOC00oO() {
      UuUVuuUu();
   }

   public static String uUnuvNvvNU() {
      return nUUVuvU + " / " + uNNnnnuuuN.C00OOC00oO();
   }

   private static boolean UuUVuuUu(class_1309 var0, float var1, boolean var2) {
      if (uNNnnnuuuN.UuUVuuUu() == 0) {
         nuUnNvnuUu = null;
         vNUvnnVnUvu = -1;
         uVUuuVnNVU = 0;
         return false;
      } else if (nuUnNvnuUu == null || var0.method_5628() != vNUvnnVnUvu) {
         return true;
      } else if (nuUnNvnuUu.UuuNnUvUuv == null || uVUuuVnNVU >= nuUnNvnuUu.UuuNnUvUuv.size()) {
         return true;
      } else {
         return var2 && !"Attack".equalsIgnoreCase(nuUnNvnuUu.UuUVuuUu) && uVUuuVnNVU > 2
            ? true
            : var1 < 5.0F && "Flick".equalsIgnoreCase(nuUnNvnuUu.UuUVuuUu) && uVUuuVnNVU > 2;
      }
   }

   private static void UuUVuuUu(class_1309 var0, float var1, float var2, boolean var3) {
      nuUnNvnuUu = uNNnnnuuuN.UuUVuuUu(class_3532.method_15363(var1, -45.0F, 45.0F), class_3532.method_15363(var2, -30.0F, 30.0F), var3);
      vNUvnnVnUvu = var0.method_5628();
      uVUuuVnNVU = 0;
   }

   private static NUnUuVuNv.nvnNNunvv vVvUvVVuuNvV() {
      return nuUnNvnuUu != null && nuUnNvnuUu.UuuNnUvUuv != null && !nuUnNvnuUu.UuuNnUvUuv.isEmpty()
         ? nuUnNvnuUu.UuuNnUvUuv.get(Math.min(uVUuuVnNVU, nuUnNvnuUu.UuuNnUvUuv.size() - 1))
         : null;
   }

   private static float UuUVuuUu(float var0, boolean var1, boolean var2, boolean var3) {
      float var4 = Math.abs(var0);
      if (var4 < 0.001F) {
         return 0.0F;
      } else {
         float var5 = var1 ? 0.62F : 0.42F;
         float var6 = var1 ? 34.0F : 22.0F;
         float var7 = var1 ? 0.31F : 0.25F;
         if (var2) {
            var6 *= 1.12F;
            var7 *= 1.08F;
         }

         if (var3) {
            var6 *= 0.82F;
            var7 *= 0.88F;
         }

         if (var4 > 95.0F) {
            var7 += var1 ? 0.08F : 0.05F;
         }

         float var8 = var4 * var7 + var5;
         if (var4 < 3.0F) {
            var8 = Math.max(var5 * 0.45F, var4 * 0.68F);
         }

         var8 = class_3532.method_15363(var8, var5 * 0.45F, var6);
         var8 = Math.min(var8, var4);
         return Math.signum(var0) * var8;
      }
   }

   private static NuUvVVvUVVUV.VvunVVUvUNnv UuUVuuUu(float var0, float var1, NuUvVVvUVVUV.NVnVnNnN var2, float var3, float var4, boolean var5, boolean var6) {
      float var7 = VVuuUN.UNnVVNvvnVvU + var2.yaw * 0.72F;
      float var8 = VVuuUN.uNnUnnuNUnNu + var2.pitch * 0.68F;
      float var9 = UuUVuuUu(var7, true, var3, var4, var5, var6);
      float var10 = UuUVuuUu(var8, false, var3, var4, var5, var6);
      float var11 = C00OOC00oO(3.4F, 2.75F, 3.15F) * (var5 ? 1.12F : 1.0F);
      float var12 = C00OOC00oO(2.4F, 1.95F, 2.25F) * (var5 ? 1.1F : 1.0F);
      if (var6) {
         var11 *= 0.78F;
         var12 *= 0.78F;
      }

      VVuuUN.NnUuNNU = UuUVuuUu(VVuuUN.NnUuNNU, var9, var11);
      VVuuUN.nNvNUVU = UuUVuuUu(VVuuUN.nNvNUVU, var10, var12);
      float var13 = UuUVuuUu(VVuuUN.NnUuNNU, var0, true, var3);
      float var14 = UuUVuuUu(VVuuUN.nNvNUVU, var1, false, var3);
      VVuuUN.NnUuNNU = var13 * 0.86F + VVuuUN.NnUuNNU * 0.14F;
      VVuuUN.nNvNUVU = var14 * 0.86F + VVuuUN.nNvNUVU * 0.14F;
      return new NuUvVVvUVVUV.VvunVVUvUNnv(var13, var14, var9, var10);
   }

   private static float UuUVuuUu(float var0, boolean var1, float var2, float var3, boolean var4, boolean var5) {
      float var6 = Math.abs(var0);
      if (var6 < 0.001F) {
         return 0.0F;
      } else {
         float var7 = (var1 ? 34.0F : 22.0F) * C00OOC00oO(0.72F, 0.64F, 0.72F);
         float var8 = (float)Math.sqrt(var6) * (var1 ? 2.15F : 1.55F);
         float var9 = var6 * (var1 ? 0.052F : 0.04F);
         float var10 = var8 + var9;
         if (var6 < 7.0F) {
            var10 = var6 * C00OOC00oO(0.54F, 0.43F, 0.48F) + (var1 ? 0.12F : 0.08F);
         }

         if (VVuuUN.vVvUvVVuuNvV > 0 && var2 < 30.0F) {
            var10 *= var4 ? 0.62F : 0.42F;
         }

         if (var5) {
            var10 *= 0.76F;
         }

         var10 *= var3;
         var10 = class_3532.method_15363(var10, 0.0F, var7);
         return Math.signum(var0) * Math.min(var10, var6 + (var2 < 7.0F ? (var1 ? 0.8F : 0.45F) : 0.0F));
      }
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      float var3 = var1 - var0;
      float var4 = var2 + Math.abs(var0) * 0.16F;
      return var0 + class_3532.method_15363(var3, -var4, var4);
   }

   private static float UuUVuuUu(NUnUuVuNv.nvnNNunvv var0, float var1, boolean var2, boolean var3) {
      float var4 = var1 > 80.0F ? 1.08F : 0.96F;
      if (var0 != null) {
         float var5 = Math.abs(var0.vVvUvVVuuNvV) + Math.abs(var0.uNNnnnuuuN) + Math.abs(var0.nuUnNvnuUu) * 0.035F + Math.abs(var0.VVuuUN) * 0.03F;
         var4 = 0.78F + class_3532.method_15363(var5 / 7.0F, 0.0F, 1.0F) * 0.48F;
         if (var0.vNUvnnVnUvu > 0.72F) {
            var4 -= 0.04F;
         }
      } else {
         var4 += (float)Math.sin(vuuuNvNuv * 0.31F) * 0.04F;
      }

      float var9 = VVuuUN();
      var4 += (float)Math.sin(VVuuUN.C00OOC00oO * 0.23F + VVuuUN.nUUVuvU) * 0.065F * var9;
      var4 += (float)Math.sin(VVuuUN.C00OOC00oO * 0.071F + VVuuUN.nUUVuvU * 0.43F) * 0.035F * var9;
      if (VVuuUN.vVvUvVVuuNvV > 0 && var1 < 28.0F) {
         var4 *= var2 ? 0.74F : 0.58F;
      }

      if (var2) {
         var4 += 0.08F;
      }

      if (var3) {
         var4 -= 0.12F;
      }

      return class_3532.method_15363(var4, 0.72F, 1.28F);
   }

   private static float C00OOC00oO(float var0, boolean var1, boolean var2, boolean var3) {
      float var4;
      if (var0 > 90.0F) {
         var4 = 0.52F;
      } else if (var0 > 35.0F) {
         var4 = 0.74F;
      } else if (var0 > 8.0F) {
         var4 = 1.0F;
      } else {
         var4 = 0.86F;
      }

      if (var1) {
         var4 *= 1.08F;
      }

      if (var2) {
         var4 *= 0.55F;
      }

      if (!var3) {
         var4 *= 0.45F;
      }

      return class_3532.method_15363(var4 * VVuuUN(), 0.0F, 2.25F);
   }

   private static NuUvVVvUVVUV.NVnVnNnN UuUVuuUu(NUnUuVuNv.nvnNNunvv var0, float var1, float var2, float var3, float var4, boolean var5) {
      float var6 = UuUVuuUu(var1);
      float var7 = UuUVuuUu(var2);
      float var8 = 0.0F;
      float var9 = 0.0F;
      if (var0 != null) {
         float var10 = uVUuuVnNVU();
         float var11 = Math.abs(var0.vVvUvVVuuNvV) * var6 * 0.14F
            + var0.vVvUvVVuuNvV * 0.045F
            + Math.signum(var0.vVvUvVVuuNvV) * Math.min(Math.abs(var0.nuUnNvnuUu) * 0.012F, 0.42F);
         float var12 = Math.abs(var0.uNNnnnuuuN) * var7 * 0.115F
            + var0.uNNnnnuuuN * 0.036F
            + Math.signum(var0.uNNnnnuuuN) * Math.min(Math.abs(var0.VVuuUN) * 0.01F, 0.34F);
         var8 += class_3532.method_15363(var11 * var10, -4.2F, 4.2F);
         var9 += class_3532.method_15363(var12 * var10, -2.75F, 2.75F);
         if (nuUnNvnuUu != null && var0.vNUvnnVnUvu > 0.82F && var3 < 10.0F) {
            var8 += var6 * class_3532.method_15363(Math.abs(nuUnNvnuUu.VVuuUN) * 0.28F * var10, 0.0F, var5 ? 1.65F : 0.95F);
            var9 += var7 * class_3532.method_15363(Math.abs(nuUnNvnuUu.vNUvnnVnUvu) * 0.22F * var10, 0.0F, var5 ? 1.05F : 0.65F);
         }
      }

      float var20 = vNUvnnVnUvu();
      float var21 = (
            (float)Math.sin(VVuuUN.C00OOC00oO * 0.81F + VVuuUN.UnUNVVVNuv) * 0.26F
               + (float)Math.sin(VVuuUN.C00OOC00oO * 1.37F + VVuuUN.UnUNVVVNuv * 0.7F) * 0.11F
         )
         * var6
         * var20;
      float var22 = (
            (float)Math.sin(VVuuUN.C00OOC00oO * 0.67F + VVuuUN.UnUNVVVNuv * 1.3F) * 0.18F
               + (float)Math.sin(VVuuUN.C00OOC00oO * 1.11F + VVuuUN.UnUNVVVNuv * 0.4F) * 0.075F
         )
         * var7
         * var20;
      float var13 = (float)Math.sin(VVuuUN.C00OOC00oO * 0.097F + VVuuUN.vNVuvnUUnuUn) * 0.34F;
      float var14 = (float)Math.sin(VVuuUN.C00OOC00oO * 0.083F + VVuuUN.vNVuvnUUnuUn * 0.62F) * 0.22F;
      float var15 = class_3532.method_15363(Math.abs(var2) * 0.008F, 0.0F, 0.32F) * var6;
      float var16 = class_3532.method_15363(Math.abs(var1) * 0.005F, 0.0F, 0.22F) * var7;
      float var17 = var3 < 7.0F ? 1.28F : (var3 < 18.0F ? 1.12F : (var3 > 65.0F ? 0.72F : 1.0F));
      var8 += var21 + var13 + var15 + VVuuUN.UvnvNVnnnnNU;
      var9 += var22 + var14 + var16 + VVuuUN.uVUVnuvnuVuv;
      return new NuUvVVvUVVUV.NVnVnNnN(var8 * var4 * var17, var9 * var4 * var17);
   }

   private static float UuUVuuUu(float var0, float var1, boolean var2, float var3) {
      float var4 = Math.abs(var1);
      if (var4 < 0.001F) {
         return 0.0F;
      } else {
         float var5 = var2 ? 39.44F : 24.64F;
         if (var4 > 2.8F && Math.signum(var0) != Math.signum(var1)) {
            var0 = Math.signum(var1) * Math.min(var4, var2 ? 0.34F : 0.24F);
         }

         float var6 = var3 < 7.0F ? (var2 ? 0.95F : 0.55F) : 0.0F;
         float var7 = Math.min(var5, var4 + var6);
         var0 = class_3532.method_15363(var0, -var7, var7);
         if (var3 > 5.0F && Math.abs(var0) > var4) {
            var0 = var1;
         }

         return var0;
      }
   }

   private static float UuUVuuUu(float var0) {
      return var0 < 0.0F ? -1.0F : 1.0F;
   }

   private static String uNNnnnuuuN() {
      return nuUnNvnuUu == null ? "synthetic" : nuUnNvnuUu.UuUVuuUu;
   }

   private static int nuUnNvnuUu() {
      return nuUnNvnuUu != null && nuUnNvnuUu.UuuNnUvUuv != null ? nuUnNvnuUu.UuuNnUvUuv.size() : 0;
   }

   private static void UuUVuuUu(class_1309 var0) {
      if (VVuuUN.UuUVuuUu != var0.method_5628()) {
         VVuuUN.UuUVuuUu();
         VVuuUN.UuUVuuUu = var0.method_5628();
         float var1 = vuuuNvNuv();
         float var2 = UuuNnUvUuv();
         VVuuUN.VVuuUN = UuUVuuUu(-0.16F * var1, 0.16F * var1);
         VVuuUN.vNUvnnVnUvu = UuUVuuUu(-0.1F * var1, 0.12F * var1);
         VVuuUN.uVUuuVnNVU = UuUVuuUu(0.58F - 0.06F * var2, 0.58F + 0.1F * var2);
         VVuuUN.vuuuNvNuv = UuUVuuUu(-0.24F * var1, 0.24F * var1);
         VVuuUN.nvUVNnuu = UuUVuuUu(-0.16F * var1, 0.18F * var1);
         VVuuUN.UuuNnUvUuv = UuUVuuUu(0.58F - 0.1F * var2, 0.58F + 0.16F * var2);
         VVuuUN.uUnuvNvvNU = C00OOC00oO(false);
         VVuuUN.nUUVuvU = UuUVuuUu(0.0F, (float) (Math.PI * 2));
         VVuuUN.UnUNVVVNuv = UuUVuuUu(0.0F, (float) (Math.PI * 2));
         VVuuUN.vNVuvnUUnuUn = UuUVuuUu(0.0F, (float) (Math.PI * 2));
      }
   }

   private static void UuUVuuUu(float var0, float var1, float var2, boolean var3, boolean var4) {
      VVuuUN.C00OOC00oO++;
      if (!VVuuUN.nuUnNvnuUu) {
         VVuuUN.UNnVVNvvnVvU = var1;
         VVuuUN.uNnUnnuNUnNu = var2;
         VVuuUN.nuUnNvnuUu = true;
      } else {
         float var5 = C00OOC00oO(0.66F, 0.48F, 0.55F);
         if (var3) {
            var5 += 0.08F;
         }

         if (var4) {
            var5 *= 0.72F;
         }

         VVuuUN.UNnVVNvvnVvU = VVuuUN.UNnVVNvvnVvU + class_3532.method_15393(var1 - VVuuUN.UNnVVNvvnVvU) * class_3532.method_15363(var5, 0.18F, 0.86F);
         VVuuUN.uNnUnnuNUnNu = VVuuUN.uNnUnnuNUnNu + (var2 - VVuuUN.uNnUnnuNUnNu) * class_3532.method_15363(var5, 0.18F, 0.86F);
      }

      if (VVuuUN.uUnuvNvvNU-- <= 0) {
         float var8 = vuuuNvNuv();
         float var6 = UuuNnUvUuv();
         VVuuUN.vuuuNvNuv = UuUVuuUu(-0.3F * var8, 0.3F * var8);
         VVuuUN.nvUVNnuu = UuUVuuUu(-0.2F * var8, 0.22F * var8);
         VVuuUN.UuuNnUvUuv = UuUVuuUu(0.58F - 0.12F * var6, var3 ? 0.58F + 0.22F * var6 : 0.58F + 0.16F * var6);
         VVuuUN.uUnuvNvvNU = C00OOC00oO(var3);
      }

      float var9 = (var3 ? 0.16F : 0.095F) * nvUVNnuu();
      VVuuUN.VVuuUN = VVuuUN.VVuuUN + (VVuuUN.vuuuNvNuv - VVuuUN.VVuuUN) * var9;
      VVuuUN.vNUvnnVnUvu = VVuuUN.vNUvnnVnUvu + (VVuuUN.nvUVNnuu - VVuuUN.vNUvnnVnUvu) * var9;
      VVuuUN.uVUuuVnNVU = VVuuUN.uVUuuVnNVU + (VVuuUN.UuuNnUvUuv - VVuuUN.uVUuuVnNVU) * var9;
      if (VVuuUN.vVvUvVVuuNvV > 0) {
         VVuuUN.vVvUvVVuuNvV--;
      } else if (!var4 && var0 > 2.2F && var0 < 24.0F) {
         float var10 = var3 ? 0.012F : 0.034F;
         if (ThreadLocalRandom.current().nextFloat() < var10) {
            VVuuUN.vVvUvVVuuNvV = ThreadLocalRandom.current().nextInt(1, var3 ? 3 : 4);
         }
      }

      if (VVuuUN.uNNnnnuuuN && var0 < 32.0F) {
         float var11 = Math.abs(var1) - Math.abs(VVuuUN.NVNnnvnuunNv);
         float var7 = Math.abs(var2) - Math.abs(VVuuUN.uVunuUNVVUUV);
         if (var11 > 0.8F) {
            VVuuUN.UvnvNVnnnnNU = VVuuUN.UvnvNVnnnnNU - Math.signum(var1) * class_3532.method_15363(var11 * 0.075F, 0.0F, 0.52F);
         }

         if (var7 > 0.65F) {
            VVuuUN.uVUVnuvnuVuv = VVuuUN.uVUVnuvnuVuv - Math.signum(var2) * class_3532.method_15363(var7 * 0.055F, 0.0F, 0.34F);
         }
      }

      VVuuUN.UvnvNVnnnnNU *= var3 ? 0.76F : 0.68F;
      VVuuUN.uVUVnuvnuVuv *= var3 ? 0.74F : 0.66F;
   }

   private static void UuUVuuUu(boolean var0, String var1) {
      if (var0) {
         long var2 = System.currentTimeMillis();
         String var4 = "[Neuro] " + var1;

         try {
            Path var5 = NUNNNUuUNnVv.vVvUvVVuuNvV().resolve("neuro_debug.log");
            Files.createDirectories(var5.getParent());
            Files.writeString(var5, var2 + " " + var4 + System.lineSeparator(), StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
         } catch (Throwable var6) {
         }

         if (var2 - UnUNVVVNuv >= 700L) {
            UnUNVVVNuv = var2;
            vVnvuVVUunuv.UuUVuuUu(var4);
         }
      }
   }

   private static String C00OOC00oO(float var0) {
      return String.format(Locale.ROOT, "%.2f", var0);
   }

   private static uuUuvNuNVNVU UuUVuuUu(class_1309 var0, NuUvVVvUVVUV.nvnNNunvv var1) {
      class_243 var2 = a_.field_1724.method_33571();
      class_238 var3 = var0.method_5829();
      class_243 var4 = var0.method_19538();
      class_243 var5 = a_.field_1724.method_19538().method_1020(var4);
      double var6 = Math.hypot(var5.field_1352, var5.field_1350);
      double var8 = var6 > 1.0E-4 ? var5.field_1352 / var6 : 0.0;
      double var10 = var6 > 1.0E-4 ? var5.field_1350 / var6 : 1.0;
      double var12 = var6 > 1.0E-4 ? var5.field_1350 / var6 : 1.0;
      double var14 = var6 > 1.0E-4 ? -var5.field_1352 / var6 : 0.0;
      double var16 = var1.VVuuUN * Math.max(0.25, (double)var0.method_17681());
      double var18 = var1.vNUvnnVnUvu * Math.max(0.25, (double)var0.method_17681());
      double var20 = var3.field_1322 + var0.method_17682() * 0.22;
      double var22 = var3.field_1322 + var0.method_17682() * 0.84;
      class_243 var24 = new class_243(
         class_3532.method_15350(var4.field_1352 + var12 * var16 + var8 * var18, var3.field_1323, var3.field_1320),
         class_3532.method_15350(var3.field_1322 + var0.method_17682() * var1.uVUuuVnNVU, var20, var22),
         class_3532.method_15350(var4.field_1350 + var14 * var16 + var10 * var18, var3.field_1321, var3.field_1324)
      );
      class_243 var25 = var24.method_1020(var2);
      float var26 = (float)Math.toDegrees(Math.atan2(-var25.field_1352, var25.field_1350));
      float var27 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var25.field_1351, Math.hypot(var25.field_1352, var25.field_1350))), -90.0, 90.0);
      return new uuUuvNuNVNVU(var26, var27);
   }

   private static float UuUVuuUu(float var0, float var1) {
      return var0 + ThreadLocalRandom.current().nextFloat() * (var1 - var0);
   }

   private static int C00OOC00oO(boolean var0) {
      float var1 = nvUVNnuu();
      int var2 = Math.max(2, Math.round((var0 ? 5.0F : 7.0F) / var1));
      int var3 = Math.max(var2 + 1, Math.round((var0 ? 14.0F : 22.0F) / var1));
      return ThreadLocalRandom.current().nextInt(var2, var3 + 1);
   }

   private static float VVuuUN() {
      return C00OOC00oO(1.05F, 1.45F, 1.75F);
   }

   private static float vNUvnnVnUvu() {
      return C00OOC00oO(0.78F, 1.18F, 1.42F);
   }

   private static float uVUuuVnNVU() {
      return C00OOC00oO(1.0F, 1.35F, 1.65F);
   }

   private static float vuuuNvNuv() {
      return C00OOC00oO(0.9F, 1.32F, 1.58F);
   }

   private static float nvUVNnuu() {
      return C00OOC00oO(0.82F, 1.08F, 1.32F);
   }

   private static float UuuNnUvUuv() {
      return C00OOC00oO(0.78F, 1.08F, 1.32F);
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      String var4 = AttackAura.vuvnUnVnUNnV.uUnuvNvvNU();

      float var3 = switch (var4) {
         case "Stable" -> var0;
         case "Dynamic" -> var2;
         default -> var1;
      };
      return class_3532.method_15363(var3 * AttackAura.nnuUVNUuvvVU.uUnuvNvvNU(), 0.0F, 3.0F);
   }

   record NVnVnNnN(float yaw, float pitch) {
   }

   record VvunVVUvUNnv(float yaw, float pitch, float targetYawVelocity, float targetPitchVelocity) {
   }

   static final class nvnNNunvv {
      int UuUVuuUu = -1;
      int C00OOC00oO;
      int uUnuvNvvNU;
      int vVvUvVVuuNvV;
      boolean uNNnnnuuuN;
      boolean nuUnNvnuUu;
      float VVuuUN;
      float vNUvnnVnUvu;
      float uVUuuVnNVU = 0.58F;
      float vuuuNvNuv;
      float nvUVNnuu;
      float UuuNnUvUuv = 0.58F;
      float nUUVuvU;
      float UnUNVVVNuv;
      float vNVuvnUUnuUn;
      float UvnvNVnnnnNU;
      float uVUVnuvnuVuv;
      float NVNnnvnuunNv;
      float uVunuUNVVUUV;
      float UNnVVNvvnVvU;
      float uNnUnnuNUnNu;
      float NnUuNNU;
      float nNvNUVU;

      void UuUVuuUu() {
         this.UuUVuuUu = -1;
         this.C00OOC00oO = 0;
         this.uUnuvNvvNU = 0;
         this.vVvUvVVuuNvV = 0;
         this.uNNnnnuuuN = false;
         this.nuUnNvnuUu = false;
         this.VVuuUN = 0.0F;
         this.vNUvnnVnUvu = 0.0F;
         this.uVUuuVnNVU = 0.58F;
         this.vuuuNvNuv = 0.0F;
         this.nvUVNnuu = 0.0F;
         this.UuuNnUvUuv = 0.58F;
         this.nUUVuvU = 0.0F;
         this.UnUNVVVNuv = 0.0F;
         this.vNVuvnUUnuUn = 0.0F;
         this.UvnvNVnnnnNU = 0.0F;
         this.uVUVnuvnuVuv = 0.0F;
         this.NVNnnvnuunNv = 0.0F;
         this.uVunuUNVVUUV = 0.0F;
         this.UNnVVNvvnVvU = 0.0F;
         this.uNnUnnuNUnNu = 0.0F;
         this.NnUuNNU = 0.0F;
         this.nNvNUVU = 0.0F;
      }
   }
}
