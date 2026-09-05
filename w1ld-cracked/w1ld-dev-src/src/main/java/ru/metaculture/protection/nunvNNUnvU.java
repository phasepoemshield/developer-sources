package ru.metaculture.protection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import lombok.Generated;

public final class nunvNNUnvU {
   private static final Map<Long, nunvNNUnvU.nvnNNunvv> UuUVuuUu = new HashMap<>();
   private static final float C00OOC00oO = 1.08F;
   private static float uUnuvNvvNU = 1.08F;
   private static long vVvUvVVuuNvV;

   public static void UuUVuuUu(nUvnuVnNUU var0) {
      float var1 = var0 == null ? 1.0F : Math.max(1.0F, var0.C00OOC00oO());
      uUnuvNvvNU = var1 * 1.08F;
   }

   public static int UuUVuuUu(nUVuuNUVnV var0) {
      return UuUVuuUu(var0 == null ? null : var0.nuUnNvnuUu());
   }

   public static int UuUVuuUu(NUunUunuNV var0) {
      return var0 == null ? -1 : var0.NVNnnvnuunNv();
   }

   public static int C00OOC00oO(nUVuuNUVnV var0) {
      return C00OOC00oO(var0 == null ? null : var0.nuUnNvnuUu());
   }

   public static int C00OOC00oO(NUunUunuNV var0) {
      return var0 == null ? -1711276033 : var0.uVUVnuvnuVuv();
   }

   public static int uUnuvNvvNU(NUunUunuNV var0) {
      return var0 == null ? 1728053247 : var0.UvnvNVnnnnNU();
   }

   public static int uUnuvNvvNU(nUVuuNUVnV var0) {
      return vVvUvVVuuNvV(var0 == null ? null : var0.nuUnNvnuUu());
   }

   public static int vVvUvVVuuNvV(NUunUunuNV var0) {
      return var0 == null ? -1 : var0.NVNnnvnuunNv();
   }

   public static int uNNnnnuuuN(NUunUunuNV var0) {
      if (var0 != null && var0.uNnUnnuNUnNu()) {
         return -131586;
      } else {
         return var0 == null ? -1 : var0.NVNnnvnuunNv();
      }
   }

   public static int nuUnNvnuUu(NUunUunuNV var0) {
      if (var0 != null && var0.uNnUnnuNUnNu()) {
         return -723465;
      } else {
         return var0 == null ? -1711276033 : NUunUunuNV.UuUVuuUu(var0.NVNnnvnuunNv(), var0.uVUVnuvnuVuv(), 0.1F);
      }
   }

   public static int VVuuUN(NUunUunuNV var0) {
      if (var0 == null) {
         return NUunUunuNV.UuUVuuUu(255, 255, 255, 178);
      } else if (!var0.uNnUnnuNUnNu()) {
         if (uVUuuVnNVU(var0)) {
            int var1 = var0.nuUnNvnuUu() >>> 24 & 0xFF;
            return NUunUunuNV.UuUVuuUu(var0.nuUnNvnuUu(), NUunUunuNV.UuUVuuUu(var0.UNnVVNvvnVvU(), var1), 0.13F);
         } else {
            return var0.nuUnNvnuUu();
         }
      } else {
         return NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, 178), NUunUunuNV.UuUVuuUu(var0.uVunuUNVVUUV(), 178), 0.055F);
      }
   }

   public static int vNUvnnVnUvu(NUunUunuNV var0) {
      if (var0 == null) {
         return NUunUunuNV.UuUVuuUu(255, 255, 255, 196);
      } else if (!var0.uNnUnnuNUnNu()) {
         if (uVUuuVnNVU(var0)) {
            int var1 = var0.VVuuUN() >>> 24 & 0xFF;
            return NUunUunuNV.UuUVuuUu(var0.VVuuUN(), NUunUunuNV.UuUVuuUu(var0.uVunuUNVVUUV(), var1), 0.1F);
         } else {
            return var0.VVuuUN();
         }
      } else {
         return NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, 196), NUunUunuNV.UuUVuuUu(var0.uVunuUNVVUUV(), 196), 0.045F);
      }
   }

   public static int UuUVuuUu(NUunUunuNV var0, float var1) {
      if (var0 == null) {
         return NUunUunuNV.UuUVuuUu(255, 255, 255, 174);
      } else {
         float var2 = VVuuUN(var1);
         if (!var0.uNnUnnuNUnNu()) {
            return NUunUunuNV.UuUVuuUu(var0.vNUvnnVnUvu(), var0.vuuuNvNuv(), var2);
         } else {
            int var3 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, 214), NUunUunuNV.UuUVuuUu(255, 255, 255, 236), var2);
            return NUunUunuNV.UuUVuuUu(var3, NUunUunuNV.UuUVuuUu(var0.uVunuUNVVUUV(), var3 >>> 24 & 0xFF), 0.045F + 0.035F * var2);
         }
      }
   }

   public static int C00OOC00oO(NUunUunuNV var0, float var1) {
      float var2 = VVuuUN(var1);
      if (var0 == null || var0.uNnUnnuNUnNu()) {
         return NUunUunuNV.UuUVuuUu(255, 255, 255, Math.round(153.0F * var2));
      } else {
         return uVUuuVnNVU(var0)
            ? NUunUunuNV.UuUVuuUu(var0.uVunuUNVVUUV(), Math.round(52.0F * var2))
            : NUunUunuNV.UuUVuuUu(var0.NVNnnvnuunNv(), Math.round(10.0F * var2));
      }
   }

   public static int uUnuvNvvNU(NUunUunuNV var0, float var1) {
      float var2 = VVuuUN(var1);
      return var0 != null && var0.uNnUnnuNUnNu()
         ? NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(32.0F * var2))
         : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(180.0F * var2));
   }

   public static int UuUVuuUu(NUunUunuNV var0, int var1, float var2) {
      float var3 = VVuuUN(var2);
      return var0 != null && var0.uNnUnnuNUnNu()
         ? NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(32.0F * var3))
         : NUunUunuNV.UuUVuuUu(var1, Math.round(255.0F * var3));
   }

   public static void UuUVuuUu(
      UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      if (var0 != null && var1 != null && var2 != null && !(var10 <= 0.0F)) {
         if (var2.uNnUnnuNUnNu()) {
            var0.UuUVuuUu(var3, var4, var5, var6, var7, var8, var9, NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(32.0F * VVuuUN(var10))));
         } else {
            var0.UuUVuuUu(var3, var4, var5, var6, var7, var8, var9, NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(180.0F * VVuuUN(var10))));
         }
      }
   }

   public static int UuUVuuUu(VUVnvvnNN var0, float var1, nUvnuVnNUU var2) {
      float var3 = var2.UuUVuuUu(3.0F);
      float var4 = 0.0F;
      int var5 = 1;

      for (int var6 = 0; var6 < var0.vVvUvVVuuNvV.size(); var6++) {
         float var7 = UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, UuUVuuUu(var0.vVvUvVVuuNvV.get(var6)), 8.0F);
         float var8 = Math.max(var2.UuUVuuUu(18.0F), var7 + var2.UuUVuuUu(8.0F));
         if (var4 > 0.0F && var4 + var8 > var1) {
            var5++;
            var4 = 0.0F;
         }

         var4 += var8 + var3;
      }

      return var5;
   }

   public static String UuUVuuUu(vvNnnUNnVvn var0) {
      return var0.nuUnNvnuUu == -1 ? var0.UuUVuuUu : var0.UuUVuuUu + " [" + (var0.VVuuUN ? "H " : "") + UuNVnuUvunN.UuUVuuUu(var0.nuUnNvnuUu) + "]";
   }

   public static void UuUVuuUu(UnVNvNnU var0, nUvnuVnNUU var1, nUVnuvUu var2, float var3, float var4, float var5, String var6, int var7) {
      float var8 = UuUVuuUu(var1, var5);
      var0.UuUVuuUu(var2, var3, var4 + var8, var8 * 2.0F, var6, var7);
   }

   public static void UuUVuuUu(UnVNvNnU var0, nUvnuVnNUU var1, nUVnuvUu var2, float var3, float var4, float var5, float var6, String var7, int var8) {
      UuUVuuUu(var0, var1, var2, var3, UuUVuuUu(var1, var2, var4, var5, var6), var6, var7, var8);
   }

   public static void UuUVuuUu(
      UnVNvNnU var0, nUvnuVnNUU var1, nUVnuvUu var2, float var3, float var4, float var5, float var6, String var7, int var8, String var9
   ) {
      float var10 = UuUVuuUu(var1, var6);
      var0.UuUVuuUu(var2, var3, UuUVuuUu(var1, var2, var4, var5, var6) + var10, var10 * 2.0F, var7, var8, var9);
   }

   public static void UuUVuuUu(UnVNvNnU var0, nUvnuVnNUU var1, nUVnuvUu var2, float var3, float var4, float var5, float var6, float var7, String var8, int var9) {
      if (var8 != null && !var8.isEmpty()) {
         float var10 = UuUVuuUu(var1, var7);
         int var11 = var8.codePointAt(0);
         float var12 = var3 + var5 * 0.5F - vNvnnVvvVUu.C00OOC00oO(var2, var11, var10);
         float var13 = var4 + var6 * 0.5F + vNvnnVvvVUu.UuUVuuUu(var2, var11, var10);
         var0.UuUVuuUu(var2, var12, var13, var10 * 2.0F, var8, var9);
      }
   }

   public static float UuUVuuUu(nUVnuvUu var0, String var1, float var2) {
      return UnVNvNnU.UuUVuuUu(var0, var1 == null ? "" : var1, var2 * 2.0F * uUnuvNvvNU).UuUVuuUu;
   }

   public static float UuUVuuUu(nUvnuVnNUU var0, nUVnuvUu var1, String var2, float var3) {
      return UnVNvNnU.UuUVuuUu(var1, var2 == null ? "" : var2, UuUVuuUu(var0, var3) * 2.0F).UuUVuuUu;
   }

   public static float UuUVuuUu(nUvnuVnNUU var0, nUVnuvUu var1, float var2) {
      float var3 = UuUVuuUu(var0, var2);
      return Math.max(var3, UnVNvNnU.UuUVuuUu(var1, "Ag", var3 * 2.0F).C00OOC00oO);
   }

   public static float UuUVuuUu(nUvnuVnNUU var0, nUVnuvUu var1, float var2, float var3, float var4) {
      return var2 + (var3 - UuUVuuUu(var0, var1, var4)) * 0.5F;
   }

   private static float UuUVuuUu(nUvnuVnNUU var0, float var1) {
      float var2 = var0 == null ? 1.0F : Math.max(1.0F, var0.C00OOC00oO());
      return var1 * var2 * 1.08F;
   }

   public static boolean UuUVuuUu(vNvvVnNuUVvv var0, float var1, float var2, float var3, float var4) {
      return UuUVuuUu(var0.unnUnUNVnN(), var0.NnuUnUNnu(), var1, var2, var3, var4);
   }

   public static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var1 >= var3 && var0 < var2 + var4 && var1 < var3 + var5;
   }

   public static float UuUVuuUu(float var0) {
      return UuUVuuUu(var0, 0.0F, 0.03F, 0.012F);
   }

   public static float UuUVuuUu(float var0, float var1) {
      return UuUVuuUu(var0, var1, 0.03F, 0.012F);
   }

   public static float UuUVuuUu(float var0, float var1, float var2, float var3) {
      float var4 = C00OOC00oO(var0);
      float var5 = Math.min(Math.max(0.0F, var3), Math.abs(var1) * 0.16F);
      return 1.0F + var4 * var2 + var5;
   }

   public static float C00OOC00oO(float var0) {
      float var1 = UUNnvUVnnnnN.C00OOC00oO(var0);
      return 1.0F - (float)Math.exp(-3.25F * var1);
   }

   public static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5, Runnable var6) {
      UuUVuuUu(var0, var1, var2, var3, var4, var5, var5, var5, var5, var6);
   }

   public static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, Runnable var9) {
      if (var0 != null && var9 != null && !(var3 <= 0.0F) && !(var4 <= 0.0F)) {
         var0.uUnuvNvvNU();
         var0.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8);

         try {
            var9.run();
         } finally {
            var0.uUnuvNvvNU();
            var0.nuUnNvnuUu();
         }
      }
   }

   public static void UuUVuuUu(UnVNvNnU var0, nUVuuNUVnV var1, float var2, float var3, float var4, float var5) {
      UuUVuuUu(var0, var1.uNNnnnuuuN(), var1.nuUnNvnuUu(), var2, var3, var4, var5);
   }

   public static void UuUVuuUu(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6) {
      var0.C00OOC00oO(var3, var4, var5, var5, var1.UuUVuuUu(3.0F), var2.uVunuUNVVUUV(), var2.UNnVVNvvnVvU());
      var0.C00OOC00oO(var3 + var5 + var6, var4, var5, var5, var1.UuUVuuUu(3.0F), -24930, -32126);
      var0.C00OOC00oO(var3, var4 + var5 + var6, var5, var5, var1.UuUVuuUu(3.0F), -24854, -32032);
      var0.C00OOC00oO(var3 + var5 + var6, var4 + var5 + var6, var5, var5, var1.UuUVuuUu(3.0F), -6357069, -8192089);
   }

   public static void UuUVuuUu(UnVNvNnU var0, nUVuuNUVnV var1, String var2, float var3, float var4, float var5) {
      nUvnuVnNUU var6 = var1.uNNnnnuuuN();
      NUunUunuNV var7 = var1.nuUnNvnuUu();
      String var8 = var2 == null ? "" : var2;
      float var9 = Math.min(var5 * 0.55F, UuUVuuUu(var6, vNvnnVvvVUu.UuUVuuUu, var8, 10.0F));
      float var10 = Math.max(var6.UuUVuuUu(34.0F), var9 + var6.UuUVuuUu(12.0F));
      float var11 = var3 + var5 - var10;
      var0.UuUVuuUu(var11, var4, var10, var6.UuUVuuUu(16.0F), var6.UuUVuuUu(4.0F), var7.uVUuuVnNVU());
      var0.UuUVuuUu(var11, var4, var10, var6.UuUVuuUu(16.0F), var6.UuUVuuUu(4.0F), var7.nvUVNnuu(), 0.5F);
      UuUVuuUu(
         var0,
         var6,
         vNvnnVvvVUu.UuUVuuUu,
         var11 + var6.UuUVuuUu(6.0F),
         var4,
         var6.UuUVuuUu(16.0F),
         10.0F,
         UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var8, 10.0F, var10 - var6.UuUVuuUu(12.0F)),
         var7.uVUVnuvnuVuv()
      );
   }

   public static void UuUVuuUu(UnVNvNnU var0, nUVuuNUVnV var1, float var2, float var3) {
      nUvnuVnNUU var4 = var1.uNNnnnuuuN();
      NUunUunuNV var5 = var1.nuUnNvnuUu();
      var0.UuUVuuUu(var2, var3, var4.UuUVuuUu(8.0F), var4.UuUVuuUu(8.0F), var4.UuUVuuUu(2.0F), uNNnnnuuuN(var5));
      var0.UuUVuuUu(
         var2 + var4.UuUVuuUu(2.5F),
         var3 + var4.UuUVuuUu(2.0F),
         var4.UuUVuuUu(1.0F),
         var4.UuUVuuUu(4.0F),
         var4.UuUVuuUu(1.0F),
         NUunUunuNV.UuUVuuUu(21, 22, 26, 61)
      );
      var0.UuUVuuUu(
         var2 + var4.UuUVuuUu(4.5F),
         var3 + var4.UuUVuuUu(2.0F),
         var4.UuUVuuUu(1.0F),
         var4.UuUVuuUu(4.0F),
         var4.UuUVuuUu(1.0F),
         NUunUunuNV.UuUVuuUu(21, 22, 26, 61)
      );
   }

   public static List<String> UuUVuuUu(nUVnuvUu var0, String var1, float var2, float var3, int var4) {
      ArrayList var5 = new ArrayList();
      if (var1 != null && !var1.isBlank()) {
         StringBuilder var6 = new StringBuilder();

         for (String var10 : var1.split("\\s+")) {
            String var11 = var6.isEmpty() ? var10 : var6 + " " + var10;
            if (!(UuUVuuUu(var0, var11, var2) <= var3) && !var6.isEmpty()) {
               var5.add(var6.toString());
               var6 = new StringBuilder(var10);
               if (var5.size() == var4) {
                  break;
               }
            } else {
               var6 = new StringBuilder(var11);
            }
         }

         if (var5.size() < var4 && !var6.isEmpty()) {
            var5.add(var6.toString());
         }

         if (!var5.isEmpty()) {
            int var12 = var5.size() - 1;
            var5.set(var12, UuUVuuUu(var0, (String)var5.get(var12), var2, var3));
         }

         return var5;
      } else {
         return var5;
      }
   }

   public static String UuUVuuUu(nUVnuvUu var0, String var1, float var2, float var3) {
      String var4 = var1 == null ? "" : var1;
      if (UuUVuuUu(var0, var4, var2) <= var3) {
         return var4;
      } else {
         String var5 = "...";

         while (!var4.isEmpty() && UuUVuuUu(var0, var4 + var5, var2) > var3) {
            var4 = var4.substring(0, var4.length() - 1);
         }

         return var4 + var5;
      }
   }

   public static String UuUVuuUu(nUvnuVnNUU var0, nUVnuvUu var1, String var2, float var3, float var4) {
      String var5 = var2 == null ? "" : var2;
      if (UuUVuuUu(var0, var1, var5, var3) <= var4) {
         return var5;
      } else {
         String var6 = "...";

         while (!var5.isEmpty() && UuUVuuUu(var0, var1, var5 + var6, var3) > var4) {
            var5 = var5.substring(0, var5.length() - 1);
         }

         return var5 + var6;
      }
   }

   public static String uUnuvNvvNU(float var0) {
      return Math.abs(var0 - Math.round(var0)) < 0.001F ? Integer.toString(Math.round(var0)) : String.format(Locale.ROOT, "%.1f", var0);
   }

   public static String C00OOC00oO(float var0, float var1) {
      int var2 = uNNnnnuuuN(var1);
      return var2 > 0 && !(Math.abs(var0 - Math.round(var0)) < 0.001F)
         ? String.format(Locale.ROOT, "%." + var2 + "f", var0)
         : Integer.toString(Math.round(var0));
   }

   private static int uNNnnnuuuN(float var0) {
      if (Float.isFinite(var0) && !(var0 <= 0.0F)) {
         try {
            int var1 = new BigDecimal(Float.toString(Math.abs(var0))).stripTrailingZeros().scale();
            return Math.min(4, Math.max(0, var1));
         } catch (NumberFormatException var2) {
            return 1;
         }
      } else {
         return 1;
      }
   }

   public static float UuUVuuUu(nNUuNvVn var0) {
      float var1 = Math.max(1.0E-4F, var0.nuUnNvnuUu - var0.uNNnnnuuuN);
      return Math.max(0.0F, Math.min(1.0F, (var0.vVvUvVVuuNvV - var0.uNNnnnuuuN) / var1));
   }

   public static float UuUVuuUu(VnnUvVNuNuVv var0) {
      float var1 = Math.max(1.0E-4F, var0.VVuuUN - var0.nuUnNvnuUu);
      return Math.max(0.0F, Math.min(1.0F, (var0.uNNnnnuuuN - var0.nuUnNvnuUu) / var1));
   }

   public static int C00OOC00oO(float var0, float var1, float var2, float var3) {
      var0 %= 360.0F;
      if (var0 < 0.0F) {
         var0 += 360.0F;
      }

      float var4 = (1.0F - Math.abs(2.0F * var2 - 1.0F)) * var1;
      float var5 = var4 * (1.0F - Math.abs(var0 / 60.0F % 2.0F - 1.0F));
      float var6 = var2 - var4 * 0.5F;
      float var7;
      float var8;
      float var9;
      if (var0 < 60.0F) {
         var7 = var4;
         var8 = var5;
         var9 = 0.0F;
      } else if (var0 < 120.0F) {
         var7 = var5;
         var8 = var4;
         var9 = 0.0F;
      } else if (var0 < 180.0F) {
         var7 = 0.0F;
         var8 = var4;
         var9 = var5;
      } else if (var0 < 240.0F) {
         var7 = 0.0F;
         var8 = var5;
         var9 = var4;
      } else if (var0 < 300.0F) {
         var7 = var5;
         var8 = 0.0F;
         var9 = var4;
      } else {
         var7 = var4;
         var8 = 0.0F;
         var9 = var5;
      }

      return NUunUunuNV.UuUVuuUu(
         Math.round((var7 + var6) * 255.0F),
         Math.round((var8 + var6) * 255.0F),
         Math.round((var9 + var6) * 255.0F),
         Math.round(Math.max(0.0F, Math.min(1.0F, var3)) * 255.0F)
      );
   }

   public static int UuUVuuUu(float var0, float var1, float var2) {
      return uUnuvNvvNU(var0, var1, var2, 1.0F);
   }

   public static int uUnuvNvvNU(float var0, float var1, float var2, float var3) {
      var0 %= 1.0F;
      if (var0 < 0.0F) {
         var0++;
      }

      var1 = VVuuUN(var1);
      var2 = VVuuUN(var2);
      int var4 = (int)(var0 * 6.0F);
      float var5 = var0 * 6.0F - var4;
      float var6 = var2 * (1.0F - var1);
      float var7 = var2 * (1.0F - var5 * var1);
      float var8 = var2 * (1.0F - (1.0F - var5) * var1);
      float var9;
      float var10;
      float var11;
      switch (var4 % 6) {
         case 0:
            var9 = var2;
            var10 = var8;
            var11 = var6;
            break;
         case 1:
            var9 = var7;
            var10 = var2;
            var11 = var6;
            break;
         case 2:
            var9 = var6;
            var10 = var2;
            var11 = var8;
            break;
         case 3:
            var9 = var6;
            var10 = var7;
            var11 = var2;
            break;
         case 4:
            var9 = var8;
            var10 = var6;
            var11 = var2;
            break;
         default:
            var9 = var2;
            var10 = var6;
            var11 = var7;
      }

      return NUunUunuNV.UuUVuuUu(Math.round(var9 * 255.0F), Math.round(var10 * 255.0F), Math.round(var11 * 255.0F), Math.round(VVuuUN(var3) * 255.0F));
   }

   public static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5) {
      float var6 = var4 / 6.0F;
      int[] var7 = new int[]{
         UuUVuuUu(0.0F, 1.0F, 1.0F),
         UuUVuuUu(0.16666667F, 1.0F, 1.0F),
         UuUVuuUu(0.33333334F, 1.0F, 1.0F),
         UuUVuuUu(0.5F, 1.0F, 1.0F),
         UuUVuuUu(0.6666667F, 1.0F, 1.0F),
         UuUVuuUu(0.8333333F, 1.0F, 1.0F),
         UuUVuuUu(1.0F, 1.0F, 1.0F)
      };
      var0.uUnuvNvvNU();
      var0.UuUVuuUu(var1, var2, var3, var4, var5, var5, var5, var5);

      try {
         for (int var8 = 0; var8 < 6; var8++) {
            float var9 = var2 + var8 * var6;
            var0.C00OOC00oO(var1, var9, var3, var6 + 1.0F, 0.0F, var7[var8], var7[var8 + 1]);
         }
      } finally {
         var0.uUnuvNvvNU();
         var0.nuUnNvnuUu();
      }
   }

   public static float C00OOC00oO(nUvnuVnNUU var0) {
      return Math.max(15.0F, Math.min(20.0F, var0.UuUVuuUu(18.0F)));
   }

   public static float uUnuvNvvNU(nUvnuVnNUU var0) {
      return C00OOC00oO(var0) + Math.max(12.0F, var0.UuUVuuUu(18.0F));
   }

   public static void UuUVuuUu(
      UnVNvNnU var0,
      nUvnuVnNUU var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      Runnable var11
   ) {
      UuUVuuUu(var0, var1, null, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static void UuUVuuUu(
      UnVNvNnU var0,
      nUvnuVnNUU var1,
      NUunUunuNV var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      Runnable var12
   ) {
      if (var0 != null && var12 != null && !(var5 <= 1.0F) && !(var6 <= 1.0F)) {
         if (!Menu.UuUVuuUu(Menu.UUVNuUNUvUnV)) {
            var0.uUnuvNvvNU();
            var0.UuUVuuUu(var3, var4, var5, var6, var7, var8, var9, var10);

            try {
               var12.run();
            } finally {
               var0.uUnuvNvvNU();
               var0.nuUnNvnuUu();
            }
         } else {
            long var13 = vVvUvVVuuNvV(var3, var4, var5, var6);
            nunvNNUnvU.NVnVnNnN var15 = UuUVuuUu(var1, var13, var11, 1.8F, 30.0F, 150.0F);
            float var16 = var15.C00OOC00oO;
            float var17 = var15.vVvUvVVuuNvV;
            if (var16 < 0.006F) {
               var0.uUnuvNvvNU();
               var0.UuUVuuUu(var3, var4, var5, var6, var7, var8, var9, var10);

               try {
                  var12.run();
               } finally {
                  var0.uUnuvNvvNU();
                  var0.nuUnNvnuUu();
               }
            } else {
               UnVNvNnU.uunvUUVnuNn var18 = var0.UuUVuuUu(var3, var4, var5, var6);
               if (var18 == null) {
                  var0.uUnuvNvvNU();
                  var0.UuUVuuUu(var3, var4, var5, var6, var7, var8, var9, var10);

                  try {
                     var12.run();
                  } finally {
                     var0.uUnuvNvvNU();
                     var0.nuUnNvnuUu();
                  }
               } else {
                  try {
                     var12.run();
                  } finally {
                     var0.UuUVuuUu(var18);
                  }

                  float var19 = var1.UuUVuuUu(48.0F);
                  float var20 = Math.min(1.0F, var16 / Math.max(var19 * 0.08F, 1.0F));
                  float var21 = C00OOC00oO(var1) * var20;
                  float var22 = Math.min(1.0F, var16 / Math.max(var1.UuUVuuUu(26.0F), 1.0F));
                  float var23 = Math.min(var1.UuUVuuUu(15.0F), var16 * 0.6F) * var22;
                  var0.UuUVuuUu(var18, var3, var4, var5, var6, var7, var8, var9, var10, var21, var23, var16, var22, 0.0F, var17);
               }
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void UuUVuuUu(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      long var9 = vVvUvVVuuNvV(var3 + 41.7F, var4 + 19.3F, var5 + 3.1F, var6 + 2.4F);
      nunvNNUnvU.NVnVnNnN var11 = UuUVuuUu(var1, var9, var8, 4.05F, 28.0F, 88.0F);
      float var12 = Math.min(1.0F, var11.C00OOC00oO / Math.max(var1.UuUVuuUu(48.0F), 1.0F));
      float var13 = 0.0F;
      if (!(var12 <= 1.0E-4F) && !(var5 <= 1.0F) && !(var6 <= 1.0F)) {
         float var14 = var11.vVvUvVVuuNvV;
         float var15 = uUnuvNvvNU(Math.max(var12, var13 * 0.9F), 4.2F);
         float var16 = var1.UuUVuuUu(1.1F) + var1.UuUVuuUu(5.1F) * var15 + var1.UuUVuuUu(2.7F) * var13;
         float var17 = var1.UuUVuuUu(0.95F) + var1.UuUVuuUu(7.15F) * uUnuvNvvNU(var12, 4.18F);
         float var18 = Math.min(var6 * 0.14F, var1.UuUVuuUu(6.5F) + var1.UuUVuuUu(10.5F) * var15);
         float var19 = Math.min(var6 * 0.1F, var1.UuUVuuUu(4.2F) + var1.UuUVuuUu(7.1F) * var15);
         float var20 = (float)Math.pow(Math.max(var12 * 0.24F + var15 * 0.76F, 0.0F), 0.82F);
         float var21 = (float)Math.pow(Math.max(var12 * 0.32F + var15 * 0.68F, 0.0F), 1.02F);
         float var22 = (float)Math.pow(Math.max(0.0F, var13), 0.82F);
         int var23 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var2.nuUnNvnuUu(), var2.UNnVVNvvnVvU(), 0.08F), Math.round(18.0F * var20));
         int var24 = NUunUunuNV.UuUVuuUu(var2.nuUnNvnuUu(), Math.round(10.0F * var21));
         int var25 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var2.nuUnNvnuUu(), var2.uVunuUNVVUUV(), 0.11F), Math.round(14.0F * var22));
         int var26 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var2.uVUuuVnNVU(), var2.UNnVVNvvnVvU(), 0.24F), Math.round(16.0F * var22));
         var0.uUnuvNvvNU();
         var0.uUnuvNvvNU(var3, var4, var5, var6, var16);
         var0.UuUVuuUu(var3, var4, var5, var6, var7, var7, var7, var7);
         boolean var33 = false /* VF: Semaphore variable */;

         try {
            var33 = true;
            if (var12 > 1.0E-4F) {
               for (int var27 = 0; var27 < 3; var27++) {
                  float var28 = (var27 + 1.0F) / 3.0F;
                  float var29 = var14 * var17 * var28;
                  float var30 = var12 * (0.019F - var27 * 0.0048F);
                  var0.C00OOC00oO(var3, var4 + var29, var5, var6, var7, var30);
               }
            }

            if (var13 > 1.0E-4F) {
               float var35 = Math.min(Math.min(var5, var6) * 0.18F, var1.UuUVuuUu(1.15F) + var1.UuUVuuUu(2.4F) * var22);
               var0.C00OOC00oO(var3, var4, var5, var6, var7, 0.016F + var13 * 0.016F);
               if (var5 - var35 * 2.0F > 1.0F && var6 - var35 * 1.35F > 1.0F) {
                  var0.C00OOC00oO(
                     var3 + var35,
                     var4 + var35 * 0.65F,
                     var5 - var35 * 2.0F,
                     var6 - var35 * 1.35F,
                     Math.max(var1.UuUVuuUu(2.0F), var7 - var35 * 0.4F),
                     var13 * 0.014F
                  );
               }

               var0.UuUVuuUu(var3, var4, var5, var6, var7, var25);
               var0.UuUVuuUu(var3, var4, var5, var6, var7, var26, 0.5F);
            }

            if (var12 > 1.0E-4F) {
               if (var14 > 0.0F) {
                  var0.C00OOC00oO(var3, var4, var5, var18, var7, var23, NUunUunuNV.UuUVuuUu(0, 0, 0, 0));
                  var0.C00OOC00oO(var3, var4 + var6 - var19, var5, var19, var7, NUunUunuNV.UuUVuuUu(0, 0, 0, 0), var24);
                  var33 = false;
               } else {
                  var0.C00OOC00oO(var3, var4 + var6 - var18, var5, var18, var7, NUunUunuNV.UuUVuuUu(0, 0, 0, 0), var23);
                  var0.C00OOC00oO(var3, var4, var5, var19, var7, var24, NUunUunuNV.UuUVuuUu(0, 0, 0, 0));
                  var33 = false;
               }
            } else {
               var33 = false;
            }
         } finally {
            if (var33) {
               var0.uUnuvNvvNU();
               var0.nuUnNvnuUu();
            }
         }

         var0.uUnuvNvvNU();
         var0.nuUnNvnuUu();
      }
   }

   public static void C00OOC00oO(
      UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      UuUVuuUu(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, 0L, -1.0F, -1.0F, null);
   }

   public static void UuUVuuUu(
      UnVNvNnU var0,
      nUvnuVnNUU var1,
      NUunUunuNV var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      long var11,
      float var13,
      float var14,
      uVNuNVvuvNNU.nvnNNunvv var15
   ) {
      if (var0 != null && var1 != null && var2 != null && !(var5 <= 0.0F) && !(var6 <= 0.0F) && !(var8 <= 0.0F)) {
         float var16 = 0.0F;
         if (var11 != 0L && var15 != null) {
            var16 = uVNuNVvuvNNU.UuUVuuUu(var11, var3, var4, var5, var6, var7, var8, Math.max(var1.UuUVuuUu(4.5F), 5.0F), var13, var14, var15);
         }

         long var17 = vVvUvVVuuNvV(var3 + 73.1F, var4 + 11.7F, var5 + 5.4F, var6 + 3.2F);
         nunvNNUnvU.NVnVnNnN var19 = UuUVuuUu(var1, var17, var9, 3.4F, 24.0F, 78.0F);
         float var20 = var19.vVvUvVVuuNvV;
         float var21 = Math.min(1.0F, var19.C00OOC00oO / Math.max(var1.UuUVuuUu(48.0F), 1.0F));
         float var23 = Math.max(var21, Math.max(var10 * 0.72F, var16 * 0.85F));
         float var24 = 0.82F + 0.18F * vVvUvVVuuNvV((float)System.currentTimeMillis() * 7.0E-4F + var7 * 0.015F);
         float var25 = var23 * var24;
         float var26 = var16 * (0.84F + 0.16F * var24);
         float var27 = Math.max(var5 * 0.5F, var1.UuUVuuUu(1.6F));
         float var28 = Math.min(var1.UuUVuuUu(1.15F), Math.max(var1.UuUVuuUu(0.85F), var5 * 0.26F));
         float var29 = var3 + var28;
         float var30 = Math.max(var1.UuUVuuUu(0.8F), var5 - var28 * 2.0F);
         float var31 = var4 + var1.UuUVuuUu(1.2F);
         float var32 = Math.max(var1.UuUVuuUu(8.0F), var6 - var1.UuUVuuUu(2.4F));
         float var33 = var1.UuUVuuUu(0.9F) * var16;
         float var34 = var3 - var33;
         float var35 = var5 + var33 * 2.0F;
         float var36 = Math.max(var35 * 0.5F, var1.UuUVuuUu(1.7F));
         var0.UuUVuuUu(var3, var4, var5, var6, var27, NUunUunuNV.UuUVuuUu(var2.vNUvnnVnUvu(), var2.vuuuNvNuv(), 0.26F + var23 * 0.22F));
         var0.UuUVuuUu(
            var29,
            var31,
            var30,
            var32,
            var30 * 0.5F,
            NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(0, 0, 0, 24), NUunUunuNV.UuUVuuUu(var2.UNnVVNvvnVvU(), 42), 0.1F + var25 * 0.18F + var16 * 0.08F)
         );
         var0.UuUVuuUu(var3, var4, var5, var6, var27, NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), Math.round(14.0F * var23 + 10.0F * var26)), 0.5F);
         C00OOC00oO(var0, var1, var2, var3, var7, var5, var8, var21, var20);
         int var37 = NUunUunuNV.UuUVuuUu(var2.nUUVuvU(), NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), 140), 0.12F + var25 * 0.28F + var16 * 0.08F);
         int var38 = NUunUunuNV.UuUVuuUu(var2.UuuNnUvUuv(), NUunUunuNV.UuUVuuUu(var2.UNnVVNvvnVvU(), 154), 0.26F + var25 * 0.46F + var16 * 0.1F);
         var0.UuUVuuUu(
            var34 - var1.UuUVuuUu(0.25F),
            var7 + var1.UuUVuuUu(0.7F),
            var35 + var1.UuUVuuUu(0.5F),
            Math.max(var1.UuUVuuUu(12.0F), var8 - var1.UuUVuuUu(1.4F)),
            var36,
            var1.UuUVuuUu(3.0F + var25 * 4.5F + var16 * 2.1F),
            var1.UuUVuuUu(0.9F),
            var2.uNnUnnuNUnNu()
               ? NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(15.0F * var25 + 8.0F * var26))
               : NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), Math.round(20.0F * var25 + 12.0F * var26))
         );
         var0.C00OOC00oO(var34, var7, var35, var8, var36, var37, var38);
         float var39 = Math.max(var1.UuUVuuUu(0.75F), var35 * 0.22F);
         float var40 = Math.max(var1.UuUVuuUu(0.8F), var35 - var39 * 2.0F);
         float var41 = Math.min(Math.max(var1.UuUVuuUu(5.0F), var8 * (0.28F + var25 * 0.08F)), Math.max(var1.UuUVuuUu(6.0F), var8 - var1.UuUVuuUu(2.2F)));
         var0.C00OOC00oO(
            var34 + var39,
            var7 + var1.UuUVuuUu(1.15F),
            var40,
            var41,
            var40 * 0.5F,
            NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), Math.round(26.0F * var25 + 14.0F * var26)),
            NUunUunuNV.UuUVuuUu(255, 255, 255, 0)
         );
         float var42 = Math.max(var1.UuUVuuUu(1.0F), var35 * 0.28F);
         float var43 = Math.max(var1.UuUVuuUu(0.75F), var35 - var42 * 2.0F);
         float var44 = var7 + var1.UuUVuuUu(2.0F);
         float var45 = Math.max(var1.UuUVuuUu(7.0F), var8 - var1.UuUVuuUu(4.0F));
         var0.C00OOC00oO(
            var34 + var42,
            var44,
            var43,
            var45,
            var43 * 0.5F,
            NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), Math.round(18.0F * var25 + 10.0F * var26)),
            NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), var2.UNnVVNvvnVvU(), 0.55F), Math.round(48.0F * var25 + 20.0F * var26))
         );
         var0.UuUVuuUu(
            var34,
            var7,
            var35,
            var8,
            var36,
            NUunUunuNV.UuUVuuUu(
               NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), var2.uVunuUNVVUUV(), 0.14F + var25 * 0.1F + var16 * 0.06F), Math.round(38.0F * var25 + 14.0F * var26)
            ),
            0.5F
         );
      }
   }

   public static void C00OOC00oO(UnVNvNnU var0, nUvnuVnNUU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (!(var7 <= 1.0E-4F) && !(var5 <= 0.0F) && !(var6 <= 0.0F)) {
         float var9 = Math.max(var1.UuUVuuUu(0.95F), var5 * 0.26F);
         float var10 = var3 + var9;
         float var11 = Math.max(var1.UuUVuuUu(0.75F), var5 - var9 * 2.0F);
         float var12 = var1.UuUVuuUu(1.8F) + var1.UuUVuuUu(7.5F) * var7;
         float var13 = var1.UuUVuuUu(1.4F) + var1.UuUVuuUu(4.5F) * var7;
         float var14 = var8 > 0.0F ? var4 - var12 : var4 + var6 - var13;
         float var15 = var12 + var13;
         float var16 = (float)Math.pow(var7, 0.82F);
         int var17 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var2.UNnVVNvvnVvU(), var2.uVunuUNVVUUV(), 0.56F), Math.round(11.0F * var16));
         int var18 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), var2.uVunuUNVVUUV(), 0.16F), Math.round(18.0F * var16));
         var0.vVvUvVVuuNvV();

         try {
            if (var8 > 0.0F) {
               var0.C00OOC00oO(var10, var14, var11, var15 * 0.72F, var11 * 0.5F, var17, var18);
               var0.C00OOC00oO(var10, var14 + var15 * 0.72F, var11, var15 * 0.28F, var11 * 0.5F, var18, NUunUunuNV.UuUVuuUu(255, 255, 255, 0));
            } else {
               var0.C00OOC00oO(var10, var14, var11, var15 * 0.28F, var11 * 0.5F, NUunUunuNV.UuUVuuUu(255, 255, 255, 0), var18);
               var0.C00OOC00oO(var10, var14 + var15 * 0.28F, var11, var15 * 0.72F, var11 * 0.5F, var18, var17);
            }
         } finally {
            var0.uUnuvNvvNU();
            var0.uNNnnnuuuN();
         }
      }
   }

   private static float UuUVuuUu(nUvnuVnNUU var0, float var1, float var2) {
      float var3 = Math.min(1.0F, Math.abs(var1) / Math.max(var0.UuUVuuUu(var2), 0.5F));
      return var3 <= 0.0F ? 0.0F : (float)Math.pow(var3, 0.82F);
   }

   private static nunvNNUnvU.NVnVnNnN UuUVuuUu(nUvnuVnNUU var0, long var1, float var3, float var4, float var5, float var6) {
      long var7 = System.currentTimeMillis();
      nunvNNUnvU.nvnNNunvv var9 = UuUVuuUu.computeIfAbsent(var1, var0x -> new nunvNNUnvU.nvnNNunvv());
      float var10 = var9.nuUnNvnuUu == 0L ? 16.0F : Math.min(80.0F, Math.max(1.0F, (float)(var7 - var9.nuUnNvnuUu)));
      var9.nuUnNvnuUu = var7;
      float var11 = var0.UuUVuuUu(48.0F);
      float var12 = var0.UuUVuuUu(0.028F);
      float var13 = Math.abs(var3) * var12;
      float var14 = var11 * (1.0F - (float)Math.exp(-var13 / var11));
      float var15 = var3 < -0.001F ? -1.0F : (var3 > 0.001F ? 1.0F : 0.0F);
      if (var15 != 0.0F) {
         var9.vVvUvVVuuNvV = var15;
      }

      float var16 = var14 > var9.UuUVuuUu ? var5 : var6;
      var9.UuUVuuUu = UUNnvUVnnnnN.C00OOC00oO(var9.UuUVuuUu, var14, var10, var16);
      var9.uNNnnnuuuN = var3;
      if (var9.UuUVuuUu <= 0.006F && Math.abs(var3) <= 0.5F) {
         UuUVuuUu.remove(var1);
         UuUVuuUu(var7);
         return new nunvNNUnvU.NVnVnNnN(0.0F, 0.0F, 0.0F, var9.vVvUvVVuuNvV == 0.0F ? 1.0F : var9.vVvUvVVuuNvV);
      } else {
         UuUVuuUu(var7);
         return new nunvNNUnvU.NVnVnNnN(0.0F, var9.UuUVuuUu, 0.0F, var9.vVvUvVVuuNvV == 0.0F ? 1.0F : var9.vVvUvVVuuNvV);
      }
   }

   private static void UuUVuuUu(
      UnVNvNnU var0,
      nUvnuVnNUU var1,
      NUunUunuNV var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      int var13 = NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), NUunUunuNV.UuUVuuUu(255, 255, 255, 255), 0.24F);
      int var14 = NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), var2.UNnVVNvvnVvU(), 0.52F);
      float var15 = Math.max(0.5F, var1.UuUVuuUu(0.7F));
      float var16 = var3 + var15;
      float var17 = var4 + var15;
      float var18 = Math.max(1.0F, var5 - var15 * 2.0F);
      float var19 = Math.max(1.0F, var6 - var15 * 2.0F);
      float var20 = var1.UuUVuuUu(1.0F);
      float var21 = var16 + var20;
      float var22 = var17 + var20;
      float var23 = Math.max(1.0F, var18 - var20 * 2.0F);
      float var24 = Math.max(1.0F, var19 - var20 * 2.0F);
      float var25 = Math.max(0.0F, var7 - var15);
      float var26 = Math.max(0.0F, var8 - var15);
      float var27 = Math.max(0.0F, var9 - var15);
      float var28 = Math.max(0.0F, var10 - var15);
      float var29 = Math.max(0.0F, var25 - var20);
      float var30 = Math.max(0.0F, var26 - var20);
      float var31 = Math.max(0.0F, var27 - var20);
      float var32 = Math.max(0.0F, var28 - var20);
      float var33 = Math.max(var1.UuUVuuUu(1.1F), Math.min(var1.UuUVuuUu(2.0F), var5 - var1.UuUVuuUu(1.4F)));
      float var34 = var3 + var5 - var33 - var1.UuUVuuUu(0.7F);
      float var35 = var4 + var1.UuUVuuUu(5.0F);
      float var36 = Math.max(1.0F, var6 - var1.UuUVuuUu(10.0F));
      float var37 = 0.72F + 0.28F * vVvUvVVuuNvV((float)System.currentTimeMillis() * 7.8E-4F + var4 * 0.018F);
      float var38 = (float)Math.pow(Math.max(0.0F, Math.min(1.0F, var12)), 0.72F);
      float var39 = (float)Math.pow(var38, 1.18F);
      float var40 = var39 * (0.78F + 0.22F * var37);
      float var41 = var40 * (0.82F + 0.18F * var37);
      float var42 = Math.min(var36, Math.max(var1.UuUVuuUu(10.0F), var36 * (0.18F + var12 * 0.08F)));
      float var43 = Math.max(0.0F, var36 - var42);
      float var44 = var35 + var43 * vVvUvVVuuNvV((float)System.currentTimeMillis() * 9.2E-4F + var11 * 0.17F + var3 * 0.01F);
      var0.uUnuvNvvNU();
      var0.vVvUvVVuuNvV();

      try {
         var0.UuUVuuUu(
            var16, var17, var18, var19, var25, var26, var27, var28, NUunUunuNV.UuUVuuUu(var13, Math.round(42.0F * var38)), Math.max(0.75F, var1.UuUVuuUu(0.7F))
         );
         var0.UuUVuuUu(var21, var22, var23, var24, var29, var30, var31, var32, NUunUunuNV.UuUVuuUu(var14, Math.round(18.0F * var39)), 0.5F);
         var0.UuUVuuUu(
            var34,
            var35,
            var33,
            var36,
            var33 * 0.5F,
            var1.UuUVuuUu(4.2F + 6.8F * var40),
            var1.UuUVuuUu(0.85F),
            NUunUunuNV.UuUVuuUu(var14, Math.round(16.0F * var40))
         );
         var0.C00OOC00oO(
            var34,
            var35,
            var33,
            var36,
            var33 * 0.5F,
            NUunUunuNV.UuUVuuUu(var13, Math.round(34.0F * var40)),
            NUunUunuNV.UuUVuuUu(var14, Math.round(18.0F * var39))
         );
         var0.C00OOC00oO(
            var34,
            var44,
            var33,
            var42,
            var33 * 0.5F,
            NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), Math.round(22.0F * var41)),
            NUunUunuNV.UuUVuuUu(255, 255, 255, 0)
         );
      } finally {
         var0.uUnuvNvvNU();
         var0.uNNnnnuuuN();
      }
   }

   private static float nuUnNvnuUu(float var0) {
      float var1 = Math.max(0.0F, Math.min(1.0F, (var0 - 0.035F) / 0.5F));
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, Math.min(1.0F, (var2 - var0) / Math.max(1.0E-5F, var1 - var0)));
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   private static float uUnuvNvvNU(float var0, float var1, float var2) {
      float var3 = Math.max(0.0F, var0);
      if (var3 <= 0.0F) {
         return 0.0F;
      } else {
         float var4 = var3 / Math.max(var2, 1.0E-5F);
         var4 /= 1.0F + var4;
         float var5 = var3 / (var3 + Math.max(var1, 1.0E-5F) * 2.35F);
         return Math.max(0.0F, Math.min(1.0F, var4 * (0.58F + 0.92F * var5) * 1.42F));
      }
   }

   private static float uUnuvNvvNU(float var0, float var1) {
      float var2 = Math.max(0.0F, Math.min(1.0F, var0));
      if (var2 <= 0.0F) {
         return 0.0F;
      } else {
         double var3 = Math.expm1(Math.max(1.0E-4F, var1));
         return var3 <= 1.0E-7 ? var2 : (float)(Math.expm1(var1 * var2) / var3);
      }
   }

   public static float vVvUvVVuuNvV(float var0) {
      float var1 = var0 - (float)Math.floor(var0);
      return 0.5F - 0.5F * (float)Math.cos(var1 * Math.PI * 2.0);
   }

   private static long vVvUvVVuuNvV(float var0, float var1, float var2, float var3) {
      long var4 = 1469598103934665603L;
      var4 = (var4 ^ Math.round(var0 * 2.0F)) * 1099511628211L;
      var4 = (var4 ^ Math.round(var1 * 2.0F)) * 1099511628211L;
      var4 = (var4 ^ Math.round(var2 * 2.0F)) * 1099511628211L;
      return (var4 ^ Math.round(var3 * 2.0F)) * 1099511628211L;
   }

   private static float VVuuUN(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   private static boolean uVUuuVnNVU(NUunUunuNV var0) {
      return var0 != null && (var0.uVunuUNVVUUV() & 16777215) == 61695 && (var0.UNnVVNvvnVvU() & 16777215) == 17663;
   }

   private static void UuUVuuUu(long var0) {
      if (var0 - vVvUvVVuuNvV >= 1800L) {
         vVvUvVVuuNvV = var0;
         Iterator var2 = UuUVuuUu.entrySet().iterator();

         while (var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            nunvNNUnvU.nvnNNunvv var4 = (nunvNNUnvU.nvnNNunvv)var3.getValue();
            if (var4 == null || var0 - var4.nuUnNvnuUu > 2600L) {
               var2.remove();
            }
         }
      }
   }

   @Generated
   private nunvNNUnvU() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static final class NVnVnNnN {
      private final float UuUVuuUu;
      final float C00OOC00oO;
      private final float uUnuvNvvNU;
      final float vVvUvVVuuNvV;

      NVnVnNnN(float var1, float var2, float var3, float var4) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
      }
   }

   static final class nvnNNunvv {
      float UuUVuuUu;
      private float C00OOC00oO;
      private float uUnuvNvvNU;
      float vVvUvVVuuNvV = 1.0F;
      float uNNnnnuuuN;
      long nuUnNvnuUu;
   }
}
