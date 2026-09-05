package ru.metaculture.protection;

import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3966;

public class CO0oc0oC implements O000c0oocoo {
   private static final int UuUVuuUu = 15;
   private static final float C00OOC00oO = 20.0F;
   private static final float uUnuvNvvNU = 50.0F;
   private static final float vVvUvVVuuNvV = 70.0F;
   private static final float uNNnnnuuuN = 120.0F;
   private static final String[] nuUnNvnuUu = new String[]{"Human Track", "Wave Drift", "Pulse Jerk", "Overstep", "Anchor Hold"};
   private static final String[] VVuuUN = new String[]{"Closest Box", "Upper Body", "Velocity Lead", "Side Sweep", "Sticky Point"};
   private static int vNUvnnVnUvu = -1;
   private static int uVUuuVnNVU = -1;
   private static int vuuuNvNuv = -1;
   private static int nUUVuvU;
   private static int UnUNVVVNuv;
   private static int vNVuvnUUnuUn;
   private static int UvnvNVnnnnNU;
   private static int uVUVnuvnuVuv;
   private static int NVNnnvnuunNv = 5;
   private static boolean uVunuUNVVUUV;
   private static float UNnVVNvvnVvU;
   private static float uNnUnnuNUnNu;
   private static float NnUuNNU;
   private static float nNvNUVU;
   private static float UnUNuUU;
   private static float uUVuVvuNUvnu;
   private static float UvUvUNuvNU;
   private static float c0oOOCcCoC0;
   private static int VVnVNnunVvu = 1;
   private static float unNNVVNnvvV;
   private static float NuunnvnN;
   private static float NVUunUNUN;
   private static float UUVNuUNUvUnV;
   private static float vuvnUnVnUNnV;
   private static int nnuUVNUuvvVU = 1;

   public static void UuUVuuUu(class_1309 var0) {
      if (a_.field_1724 == null) {
         vVvUvVVuuNvV();
      } else if (a_.field_1687 != null && var0 != null) {
         if (vNUvnnVnUvu != var0.method_5628()) {
            vVvUvVVuuNvV();
            vNUvnnVnUvu = var0.method_5628();
            C00OOC00oO();
            uUnuvNvvNU();
         }

         if (uVUuuVnNVU < 0 || nUUVuvU >= vNVuvnUUnuUn) {
            C00OOC00oO();
         }

         if (vuuuNvNuv < 0 || UnUNVVVNuv >= UvnvNVnnnnNU) {
            uUnuvNvvNU();
         }

         nUUVuvU++;
         UnUNVVVNuv++;
         uVUVnuvnuVuv++;
         class_243 var1 = C00OOC00oO(var0).method_1020(a_.field_1724.method_33571());
         float var2 = (float)Math.toDegrees(Math.atan2(-var1.field_1352, var1.field_1350));
         float var3 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var1.field_1351, Math.hypot(var1.field_1352, var1.field_1350))), -90.0, 90.0);
         uuUuvNuNVNVU var4 = new uuUuvNuNVNVU(a_.field_1724);
         float var5 = class_3532.method_15393(var2 - var4.UuUVuuUu);
         float var6 = var3 - var4.C00OOC00oO;
         float var7 = AttackAura.UuUVuuUu(var0) + AttackAura.uVunuUNVVUUV.uUnuvNvvNU();
         class_3966 var8 = VuUVUvnU.C00OOC00oO(var4.UuUVuuUu, var4.C00OOC00oO, var7, var0, false);
         boolean var9 = var8 != null && var8.method_17782() == var0;
         float var12 = nUUVuvU + uVUuuVnNVU * 17.0F;
         float var10;
         float var11;
         switch (uVUuuVnNVU) {
            case 0:
               var10 = UuUVuuUu(20.0F, 50.0F, VnNnNnvuvn.uUnuvNvvNU(24.0F, 35.0F) * (var9 ? 0.92F : 1.14F));
               var11 = UuUVuuUu(70.0F, 120.0F, VnNnNnvuvn.uUnuvNvvNU(76.0F, 96.0F) * (var9 ? 0.96F : 1.1F));
               var5 = var5 * (var9 ? 0.36F : 0.66F) + UnUNuUU * (var9 ? 0.55F : 0.95F) + C00OOC00oO(var12, 14.0F, 0.42F) + VnNnNnvuvn.uUnuvNvvNU(-0.18F, 0.18F);
               var6 = var6 * (var9 ? 0.4F : 0.7F) + uUVuVvuNUvnu * (var9 ? 0.45F : 0.85F) + C00OOC00oO(var12, 17.0F, 0.24F);
               break;
            case 1:
               var10 = UuUVuuUu(20.0F, 50.0F, VnNnNnvuvn.uUnuvNvvNU(24.0F, 40.0F) * (var9 ? 0.9F : 1.18F));
               var11 = UuUVuuUu(70.0F, 120.0F, VnNnNnvuvn.uUnuvNvvNU(90.0F, 118.0F) * (var9 ? 0.9F : 1.0F));
               var5 = var5 * (var9 ? 0.3F : 0.62F) + C00OOC00oO(var12, 3.5F, 3.1F) + C00OOC00oO(var12, 10.5F, 1.7F) + UnUNuUU;
               var6 = var6 * (var9 ? 0.56F : 0.86F) + C00OOC00oO(var12, 4.8F, 2.4F) + uUVuVvuNUvnu * 0.7F;
               break;
            case 2:
               var10 = UuUVuuUu(20.0F, 50.0F, VnNnNnvuvn.uUnuvNvvNU(38.0F, 50.0F));
               var11 = UuUVuuUu(70.0F, 120.0F, VnNnNnvuvn.uUnuvNvvNU(72.0F, 96.0F));
               UuUVuuUu(0.42F, 0.66F, 5.6F, 1.6F);
               UuUVuuUu(4, 4.1F, 1.0F);
               var5 = var5 * (var9 ? 0.28F : 0.84F) + UNnVVNvvnVvU + UvUvUNuvNU;
               var6 = var6 * (var9 ? 0.38F : 0.72F) + uNnUnnuNUnNu + c0oOOCcCoC0;
               break;
            case 3:
               var10 = UuUVuuUu(20.0F, 50.0F, VnNnNnvuvn.uUnuvNvvNU(30.0F, 46.0F) * (var9 ? 0.92F : 1.12F));
               var11 = UuUVuuUu(70.0F, 120.0F, VnNnNnvuvn.uUnuvNvvNU(98.0F, 120.0F) * (var9 ? 0.94F : 1.0F));
               var5 = var5 * (var9 ? 0.54F : 0.88F) + C00OOC00oO(var5, 8.0F, 2.2F, 5.6F) - C00OOC00oO(var12, 6.5F, 1.1F);
               var6 = var6 * (var9 ? 0.32F : 0.66F) + C00OOC00oO(var6, 5.0F, 1.0F, 2.9F) + C00OOC00oO(var12, 6.8F, 0.55F);
               break;
            case 4:
            default:
               var10 = UuUVuuUu(20.0F, 50.0F, var9 ? VnNnNnvuvn.uUnuvNvvNU(20.0F, 29.0F) : VnNnNnvuvn.uUnuvNvvNU(34.0F, 49.0F));
               var11 = UuUVuuUu(70.0F, 120.0F, var9 ? VnNnNnvuvn.uUnuvNvvNU(92.0F, 115.0F) : VnNnNnvuvn.uUnuvNvvNU(78.0F, 100.0F));
               UuUVuuUu(var9);
               var5 = var5 * (var9 ? 0.2F : 0.78F) + NnUuNNU + uUnuvNvvNU(var12, 18.0F, 1.15F);
               var6 = var6 * (var9 ? 0.58F : 0.54F) + nNvNUVU - uUnuvNvvNU(var12, 15.0F, 0.7F);
         }

         var5 = UuUVuuUu(var5, unNNVVNnvvV, var9, true, var12);
         var6 = UuUVuuUu(var6, NuunnvnN, var9, false, var12);
         unNNVVNnvvV = var5;
         NuunnvnN = var6;
         float var13 = class_3532.method_15363(var5, -var10, var10);
         float var14 = class_3532.method_15363(var6, -var11, var11);
         if (!var9) {
            var13 = vVvUvVVuuNvV(var13, var5, 2.2F);
            var14 = vVvUvVVuuNvV(var14, var6, 1.8F);
         }

         if (var9 && Math.abs(var13) < 0.18F) {
            var13 = 0.0F;
         }

         if (var9 && Math.abs(var14) < 0.12F) {
            var14 = 0.0F;
         }

         uVunuUNVVUUV = COC0OCc.nuUnNvnuUu <= 15;
         COC0OCc.UuUVuuUu(
            new uuUuvNuNVNVU(var4.UuUVuuUu + var13, class_3532.method_15363(var4.C00OOC00oO + var14, -90.0F, 90.0F)), var10, var11, 30.0F, 30.0F, 2, 15, false
         );
      } else {
         UuUVuuUu();
      }
   }

   public static void UuUVuuUu() {
      if (!uVunuUNVVUUV) {
         vVvUvVVuuNvV();
      } else {
         if (a_.field_1724 != null) {
            uUnuvNvvNU = a_.field_1724.method_36454();
            vVvUvVVuuNvV = a_.field_1724.method_36455();
         }

         COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
         COC0OCc.nuUnNvnuUu = 0;
         COC0OCc.vuuuNvNuv = false;
         COC0OCc.uVUuuVnNVU = null;
         COC0OCc.vNUvnnVnUvu = 0;
         NNvvnnunn.UuUVuuUu = NNvvnnunn.C00OOC00oO;
         vVvUvVVuuNvV();
      }
   }

   private static void C00OOC00oO() {
      int var0 = uVUuuVnNVU;

      do {
         uVUuuVnNVU = VnNnNnvuvn.UuUVuuUu(0, 4);
      } while (uVUuuVnNVU == var0 && var0 >= 0);

      nUUVuvU = 0;

      vNVuvnUUnuUn = switch (uVUuuVnNVU) {
         case 0 -> VnNnNnvuvn.UuUVuuUu(78, 128);
         case 1 -> VnNnNnvuvn.UuUVuuUu(62, 104);
         case 2 -> VnNnNnvuvn.UuUVuuUu(48, 78);
         case 3 -> VnNnNnvuvn.UuUVuuUu(56, 92);
         default -> VnNnNnvuvn.UuUVuuUu(74, 122);
      };
      uVUVnuvnuVuv = 0;
      NVNnnvnuunNv = uVUuuVnNVU == 4 ? VnNnNnvuvn.UuUVuuUu(6, 13) : VnNnNnvuvn.UuUVuuUu(2, 7);
      UNnVVNvvnVvU = 0.0F;
      uNnUnnuNUnNu = 0.0F;
      NnUuNNU = VnNnNnvuvn.uUnuvNvvNU(-1.2F, 1.2F);
      nNvNUVU = VnNnNnvuvn.uUnuvNvvNU(-0.75F, 0.75F);
      UnUNuUU = VnNnNnvuvn.uUnuvNvvNU(-1.15F, 1.15F);
      uUVuVvuNUvnu = VnNnNnvuvn.uUnuvNvvNU(-0.65F, 0.65F);
      UvUvUNuvNU = 0.0F;
      c0oOOCcCoC0 = 0.0F;
      VVnVNnunVvu = VnNnNnvuvn.UuUVuuUu(0, 1) == 0 ? -1 : 1;
      vVnvuVVUunuv.UuUVuuUu("[LonyGrief] rotate -> " + nuUnNvnuUu[uVUuuVnNVU]);
   }

   private static void uUnuvNvvNU() {
      int var0 = vuuuNvNuv;

      do {
         vuuuNvNuv = VnNnNnvuvn.UuUVuuUu(0, 4);
      } while (vuuuNvNuv == var0 && var0 >= 0);

      UnUNVVVNuv = 0;

      UvnvNVnnnnNU = switch (vuuuNvNuv) {
         case 0 -> VnNnNnvuvn.UuUVuuUu(90, 150);
         case 1 -> VnNnNnvuvn.UuUVuuUu(80, 136);
         case 2 -> VnNnNnvuvn.UuUVuuUu(58, 108);
         case 3 -> VnNnNnvuvn.UuUVuuUu(68, 118);
         default -> VnNnNnvuvn.UuUVuuUu(96, 168);
      };
      NVUunUNUN = VnNnNnvuvn.uUnuvNvvNU(0.34F, 0.66F);
      UUVNuUNUvUnV = VnNnNnvuvn.uUnuvNvvNU(0.38F, 0.78F);
      vuvnUnVnUNnV = VnNnNnvuvn.uUnuvNvvNU(0.34F, 0.66F);
      nnuUVNUuvvVU = VnNnNnvuvn.UuUVuuUu(0, 1) == 0 ? -1 : 1;
      vVnvuVVUunuv.UuUVuuUu("[LonyGrief] vector -> " + VVuuUN[vuuuNvNuv]);
   }

   private static void UuUVuuUu(float var0, float var1, float var2, float var3) {
      if (uVUVnuvnuVuv >= NVNnnvnuunNv) {
         UNnVVNvvnVvU = VnNnNnvuvn.uUnuvNvvNU(-var2, var2);
         uNnUnnuNUnNu = VnNnNnvuvn.uUnuvNvvNU(-var3, var3);
         uVUVnuvnuVuv = 0;
         NVNnnvnuunNv = VnNnNnvuvn.UuUVuuUu(3, 8);
      } else {
         UNnVVNvvnVvU *= var0;
         uNnUnnuNUnNu *= var1;
      }
   }

   private static void UuUVuuUu(boolean var0) {
      if (uVUVnuvnuVuv >= NVNnnvnuunNv) {
         float var1 = var0 ? 2.4F : 3.8F;
         float var2 = var0 ? 1.6F : 2.6F;
         NnUuNNU = VnNnNnvuvn.uUnuvNvvNU(-var1, var1);
         nNvNUVU = VnNnNnvuvn.uUnuvNvvNU(-var2, var2);
         uVUVnuvnuVuv = 0;
         NVNnnvnuunNv = VnNnNnvuvn.UuUVuuUu(5, 11);
      }
   }

   private static void UuUVuuUu(int var0, float var1, float var2) {
      if (nUUVuvU % var0 == 0) {
         VVnVNnunVvu = -VVnVNnunVvu;
         UvUvUNuvNU = var1 * VVnVNnunVvu;
         c0oOOCcCoC0 = VnNnNnvuvn.uUnuvNvvNU(-var2, var2);
      } else {
         UvUvUNuvNU *= 0.5F;
         c0oOOCcCoC0 *= 0.64F;
      }
   }

   private static class_243 C00OOC00oO(class_1309 var0) {
      class_238 var1 = var0.method_5829();
      float var2 = UnUNVVVNuv + vuuuNvNuv * 13.0F;

      return switch (vuuuNvNuv) {
         case 0 -> nVvuVvVNVUun.UuUVuuUu(var1, false)
            .method_1031(C00OOC00oO(var2, 18.0F, 0.025F), C00OOC00oO(var2, 21.0F, 0.035F), C00OOC00oO(var2, 20.0F, 0.025F));
         case 1 -> UuUVuuUu(var1, 0.5F + C00OOC00oO(var2, 24.0F, 0.13F), 0.72F + C00OOC00oO(var2, 31.0F, 0.08F), 0.5F + C00OOC00oO(var2, 27.0F, 0.13F));
         case 2 -> UuUVuuUu(var1, 0.5F + C00OOC00oO(var2, 30.0F, 0.08F), 0.52F + C00OOC00oO(var2, 25.0F, 0.1F), 0.5F + C00OOC00oO(var2, 34.0F, 0.08F))
            .method_1019(var0.method_18798().method_1021(VnNnNnvuvn.uUnuvNvvNU(1.1F, 2.4F)));
         case 3 -> UuUVuuUu(var0, var1, var2);
         default -> UuUVuuUu(
            var1, NVUunUNUN + C00OOC00oO(var2, 36.0F, 0.035F), UUVNuUNUvUnV + C00OOC00oO(var2, 29.0F, 0.045F), vuvnUnVnUNnV + C00OOC00oO(var2, 33.0F, 0.035F)
         );
      };
   }

   private static class_243 UuUVuuUu(class_1309 var0, class_238 var1, float var2) {
      class_243 var3 = UuUVuuUu(var1, 0.5F, 0.55F + C00OOC00oO(var2, 28.0F, 0.12F), 0.5F);
      class_243 var4 = a_.field_1724.method_19538().method_1020(var0.method_19538());
      class_243 var5 = new class_243(-var4.field_1350, 0.0, var4.field_1352);
      if (var5.method_1027() < 1.0E-4) {
         var5 = new class_243(1.0, 0.0, 0.0);
      } else {
         var5 = var5.method_1029();
      }

      double var6 = Math.max(var0.method_17681() * 0.38, 0.12);
      double var8 = uUnuvNvvNU(var2, 42.0F, 1.0F) * var6 * nnuUVNUuvvVU;
      return var3.method_1019(var5.method_1021(var8));
   }

   private static class_243 UuUVuuUu(class_238 var0, float var1, float var2, float var3) {
      float var4 = class_3532.method_15363(var1, 0.08F, 0.92F);
      float var5 = class_3532.method_15363(var2, 0.12F, 0.92F);
      float var6 = class_3532.method_15363(var3, 0.08F, 0.92F);
      return new class_243(
         UuUVuuUu(var0.field_1323, var0.field_1320, var4), UuUVuuUu(var0.field_1322, var0.field_1325, var5), UuUVuuUu(var0.field_1321, var0.field_1324, var6)
      );
   }

   private static double UuUVuuUu(double var0, double var2, float var4) {
      return var0 + (var2 - var0) * var4;
   }

   private static float UuUVuuUu(float var0, float var1, boolean var2, boolean var3, float var4) {
      float var5 = Math.abs(var0);
      float var6 = var3 ? 55.0F : 42.0F;
      float var7 = class_3532.method_15363((float)Math.pow(class_3532.method_15363(var5 / var6, 0.0F, 1.0F), 0.72), 0.22F, 1.0F);
      float var8 = var0 * var7;
      float var9 = var3 ? (var2 ? 0.46F : 0.68F) : (var2 ? 0.52F : 0.72F);
      float var10 = var3
         ? C00OOC00oO(var4, 19.0F, var2 ? 0.22F : 0.48F) + VnNnNnvuvn.uUnuvNvvNU(-0.08F, 0.08F)
         : C00OOC00oO(var4, 23.0F, var2 ? 0.16F : 0.34F) + VnNnNnvuvn.uUnuvNvvNU(-0.05F, 0.05F);
      return VnNnNnvuvn.C00OOC00oO(var1, var8, var9) + var10;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return class_3532.method_15363(var2, var0, var1);
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return (float)Math.sin(var0 / var1) * var2;
   }

   private static float uUnuvNvvNU(float var0, float var1, float var2) {
      float var3 = var0 % var1;
      return (var3 / var1 * 2.0F - 1.0F) * var2;
   }

   private static float C00OOC00oO(float var0, float var1, float var2, float var3) {
      return Math.abs(var0) <= var1 ? 0.0F : UuUVuuUu(var0) * VnNnNnvuvn.uUnuvNvvNU(var2, var3);
   }

   private static float vVvUvVVuuNvV(float var0, float var1, float var2) {
      return !(Math.abs(var1) <= var2) && !(Math.abs(var0) >= var2) ? UuUVuuUu(var1) * var2 : var0;
   }

   private static float UuUVuuUu(float var0) {
      return var0 < 0.0F ? -1.0F : 1.0F;
   }

   private static void vVvUvVVuuNvV() {
      vNUvnnVnUvu = -1;
      uVUuuVnNVU = -1;
      vuuuNvNuv = -1;
      nUUVuvU = 0;
      UnUNVVVNuv = 0;
      vNVuvnUUnuUn = 0;
      UvnvNVnnnnNU = 0;
      uVUVnuvnuVuv = 0;
      NVNnnvnuunNv = 5;
      UNnVVNvvnVvU = 0.0F;
      uNnUnnuNUnNu = 0.0F;
      NnUuNNU = 0.0F;
      nNvNUVU = 0.0F;
      UnUNuUU = 0.0F;
      uUVuVvuNUvnu = 0.0F;
      UvUvUNuvNU = 0.0F;
      c0oOOCcCoC0 = 0.0F;
      VVnVNnunVvu = 1;
      unNNVVNnvvV = 0.0F;
      NuunnvnN = 0.0F;
      NVUunUNUN = 0.5F;
      UUVNuUNUvUnV = 0.55F;
      vuvnUnVnUNnV = 0.5F;
      nnuUVNUuvvVU = 1;
      uVunuUNVVUUV = false;
   }
}
