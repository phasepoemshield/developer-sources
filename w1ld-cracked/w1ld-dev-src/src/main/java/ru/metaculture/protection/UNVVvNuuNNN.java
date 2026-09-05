package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.class_310;

public final class UNVVvNuuNNN {
   public static final float UuUVuuUu = 186.0F;
   private static final long C00OOC00oO = 5200L;
   private static final int uUnuvNvvNU = -1577754;
   private static final int vVvUvVVuuNvV = -3945532;

   public void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nvUuvVvuuN var3, float var4, float var5, float var6, nUVuuNUVnV var7) {
      switch (var3) {
         case vvNnnUNnVvn var10:
            this.UuUVuuUu(var1, var2, var10, var4, var5, var6, var7);
            break;
         case nNUuNvVn var11:
            this.UuUVuuUu(var1, var2, var11, var4, var5, var6, var7);
            break;
         case VnnUvVNuNuVv var12:
            this.UuUVuuUu(var1, var2, var12, var4, var5, var6, var7);
            break;
         case UvNnUnuNUUU var13:
            this.UuUVuuUu(var1, var2, var13, var4, var5, var6, var7);
            break;
         case ili11Iii1Ii var14:
            this.UuUVuuUu(var1, var2, var14, var4, var5, var6, var7);
            break;
         case VUVnvvnNN var15:
            this.UuUVuuUu(var1, var2, var15, var4, var5, var6, var7);
            break;
         case nuunVnvU var16:
            this.UuUVuuUu(var1, var2, var16, var16.UuUVuuUu, var16.VVuuUN.isEmpty() ? "none" : var16.uNNnnnuuuN(), var4, var5, var6, var7);
            break;
         case uVNuNUVvn var17:
            String var20 = var2.VUNvNUuNVnn() == var17 ? "..." : (var17.vVvUvVVuuNvV == -1 ? "n/a" : UuNVnuUvunN.UuUVuuUu(var17.vVvUvVVuuNvV));
            this.UuUVuuUu(var1, var2, var17, var17.UuUVuuUu, var20, var4, var5, var6, var7);
            break;
         case NVuVVUNUvV var18:
            String var21 = var2.NuUuUvUUvU() == var18 ? var18.uNNnnnuuuN + "|" : var18.uNNnnnuuuN;
            this.UuUVuuUu(var1, var2, var18, var18.UuUVuuUu, var21.isEmpty() ? "empty" : var21, var4, var5, var6, var7);
            break;
         case vNnVvvNU var19:
            this.UuUVuuUu(var1, var2, var19, var19.UuUVuuUu, var19.uNNnnnuuuN(), var4, var5, var6, var7);
            break;
         default:
      }
   }

   public float UuUVuuUu(nvUuvVvuuN var1, nUvnuVnNUU var2, vNvvVnNuUVvv var3) {
      return switch (var1) {
         case nNUuNvVn var6 -> var2.UuUVuuUu(22.0F);
         case ili11Iii1Ii var7 -> var2.UuUVuuUu(18.0F);
         case VnnUvVNuNuVv var8 -> {
            float var11 = var3.UuUVuuUu(vnvnUnVnuunn.vNUvnnVnUvu(var8));
            yield var2.UuUVuuUu(16.0F) + var2.UuUVuuUu(186.0F) * var11;
         }
         case VnnUVUVvV var9 -> var2.UuUVuuUu(var9.uUnuvNvvNU());
         case VUVnvvnNN var10 -> this.UuUVuuUu(var10, var2);
         default -> var2.UuUVuuUu(14.0F);
      };
   }

   public float UuUVuuUu(nvUuvVvuuN var1, nUvnuVnNUU var2) {
      return switch (var1) {
         case nNUuNvVn var5 -> var2.UuUVuuUu(22.0F);
         case ili11Iii1Ii var6 -> var2.UuUVuuUu(18.0F);
         case VnnUvVNuNuVv var7 -> var2.UuUVuuUu(22.0F);
         case VnnUVUVvV var8 -> var2.UuUVuuUu(var8.uUnuvNvvNU());
         case VUVnvvnNN var9 -> this.UuUVuuUu(var9, var2);
         default -> var2.UuUVuuUu(14.0F);
      };
   }

   private float UuUVuuUu(VUVnvvnNN var1, nUvnuVnNUU var2) {
      float var3 = (var2.vNVuvnUUnuUn() - var2.UuUVuuUu(32.0F)) * 0.7F;
      int var4 = nunvNNUnvU.UuUVuuUu(var1, var3, var2);
      float var5 = var2.UuUVuuUu(14.0F);
      float var6 = var2.UuUVuuUu(3.0F);
      return var2.UuUVuuUu(2.0F) + var4 * var5 + (var4 > 1 ? (var4 - 1) * var6 : 0.0F);
   }

   public static float UuUVuuUu(float var0) {
      return var0 * 0.4F;
   }

   public static float UuUVuuUu(float var0, float var1) {
      return var0 + var1 - UuUVuuUu(var1);
   }

   public static float UuUVuuUu(UvNnUnuNUUU var0, float var1, nUvnuVnNUU var2) {
      float var3 = var1 * 0.52F;
      float var4 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var0.uNNnnnuuuN, 10.0F);
      return Math.max(var2.UuUVuuUu(52.0F), Math.min(var3, var4 + var2.UuUVuuUu(26.0F)));
   }

   public static float UuUVuuUu(UvNnUnuNUUU var0, float var1, float var2, nUvnuVnNUU var3) {
      return var1 + var2 - UuUVuuUu(var0, var2, var3);
   }

   public static float UuUVuuUu(float var0, nUvnuVnNUU var1) {
      return var0 - var1.UuUVuuUu(1.0F);
   }

   public static float UuUVuuUu(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(16.0F);
   }

   public static float C00OOC00oO(float var0) {
      return var0;
   }

   public static float C00OOC00oO(float var0, float var1) {
      return var0;
   }

   public static float UuUVuuUu(ili11Iii1Ii var0, float var1, nUvnuVnNUU var2) {
      String var3 = var0 == null ? "None" : var0.vNUvnnVnUvu();
      float var4 = var1 * 0.62F;
      float var5 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var3, 10.0F);
      return Math.max(var2.UuUVuuUu(86.0F), Math.min(var4, var5 + var2.UuUVuuUu(38.0F)));
   }

   public static float UuUVuuUu(ili11Iii1Ii var0, float var1, float var2, nUvnuVnNUU var3) {
      return var1 + var2 - UuUVuuUu(var0, var2, var3);
   }

   public static float C00OOC00oO(float var0, nUvnuVnNUU var1) {
      return var0 - var1.UuUVuuUu(1.0F);
   }

   public static float C00OOC00oO(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(18.0F);
   }

   public static float UuUVuuUu(ili11Iii1Ii var0, nUvnuVnNUU var1) {
      int var2 = var0 == null ? 1 : Math.max(1, var0.uUnuvNvvNU().size());
      return var1.UuUVuuUu(8.0F) + var2 * uUnuvNvvNU(var1) + var1.UuUVuuUu(6.0F);
   }

   public static float uUnuvNvvNU(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(58.0F);
   }

   public static float UuUVuuUu(float var0, float var1, nUvnuVnNUU var2) {
      return var0 + var1 - var2.UuUVuuUu(12.0F) - var2.UuUVuuUu(3.0F);
   }

   public static float uUnuvNvvNU(float var0, nUvnuVnNUU var1) {
      return var0 - var1.UuUVuuUu(1.0F);
   }

   public static float vVvUvVVuuNvV(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(18.0F);
   }

   public static float C00OOC00oO(float var0, float var1, nUvnuVnNUU var2) {
      return var0 + var1 - var2.UuUVuuUu(12.0F) - var2.UuUVuuUu(3.0F);
   }

   public static float vVvUvVVuuNvV(float var0, nUvnuVnNUU var1) {
      return var0 - var1.UuUVuuUu(2.0F);
   }

   public static float uNNnnnuuuN(nUvnuVnNUU var0) {
      return var0.UuUVuuUu(18.0F);
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, vvNnnUNnVvn var3, float var4, float var5, float var6, nUVuuNUVnV var7) {
      nUvnuVnNUU var8 = var7.uNNnnnuuuN();
      NUunUunuNV var9 = var7.nuUnNvnuUu();
      float var10 = var2.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(var3), var3.uUnuvNvvNU() ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      float var11 = var8.UuUVuuUu(12.0F);
      float var12 = var4 + var6 - var11;
      boolean var13 = var2.UNNunNuUNVuU() == var3;
      String var14 = var13 ? var3.UuUVuuUu + " ..." : nunvNNUnvU.UuUVuuUu(var3);
      this.UuUVuuUu(var1, var8, var14, var4, var5, var8.UuUVuuUu(14.0F), 12.0F, var12 - var4 - var8.UuUVuuUu(8.0F), nunvNNUnvU.UuUVuuUu(var9));
      String var15 = vnvnUnVnuunn.uUnuvNvvNU(var3);
      float var16 = var2.UuUVuuUu(
         var15,
         nunvNNUnvU.UuUVuuUu(var2, var12 - var8.UuUVuuUu(3.0F), var5 - var8.UuUVuuUu(2.0F), var11 + var8.UuUVuuUu(6.0F), var11 + var8.UuUVuuUu(6.0F))
            ? 1.0F
            : 0.0F,
         Cc0cOoOcC0o.vuuuNvNuv()
      );
      float var17 = nunvNNUnvU.UuUVuuUu(var16, var2.C00OOC00oO(var15));
      float var18 = var5 + var8.UuUVuuUu(1.0F);
      float var19 = Math.max(0.0F, Math.min(1.0F, var10));
      var1.UuUVuuUu(var17, var12 + var11 * 0.5F, var18 + var11 * 0.5F);

      try {
         float var20 = var19 * var19 * (3.0F - 2.0F * var19);
         float var21 = Math.max(0.5F, var8.UuUVuuUu(1.0F));
         var1.UuUVuuUu(var12, var18, var11, var11, var8.UuUVuuUu(4.0F), NUunUunuNV.UuUVuuUu(var9.uVUuuVnNVU(), var9.nvUVNnuu(), var16 * 0.4F));
         var1.UuUVuuUu(
            var12 + var21,
            var18 + var21,
            var11 - var21 * 2.0F,
            var11 - var21 * 2.0F,
            Math.max(0.0F, var8.UuUVuuUu(3.0F) - var21),
            NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), Math.round(18.0F + 78.0F * var19))
         );
         var1.UuUVuuUu(
            var12,
            var18,
            var11,
            var11,
            var8.UuUVuuUu(4.0F),
            NUunUunuNV.UuUVuuUu(var9.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), 104), Math.max(var19 * 0.52F, var16)),
            0.5F
         );
         if (var19 > 0.001F) {
            float var22 = 7.0F;
            float var23 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "j", var22);
            var1.UuUVuuUu(0.66F + 0.34F * var20, var12 + var11 * 0.5F, var18 + var11 * 0.5F);

            try {
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var8,
                  vNvnnVvvVUu.vNUvnnVnUvu,
                  var12 + (var11 - var23) * 0.5F,
                  var18,
                  var11,
                  var22,
                  "j",
                  NUunUunuNV.UuUVuuUu(var9.NVNnnvnuunNv(), Math.round(238.0F * var19))
               );
            } finally {
               var1.uVUuuVnNVU();
            }
         }
      } finally {
         var1.uVUuuVnNVU();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nNUuNvVn var3, float var4, float var5, float var6, nUVuuNUVnV var7) {
      nUvnuVnNUU var8 = var7.uNNnnnuuuN();
      NUunUunuNV var9 = var7.nuUnNvnuUu();
      float var10 = (var3.vVvUvVVuuNvV - var3.uNNnnnuuuN) / (var3.nuUnNvnuUu - var3.uNNnnnuuuN);
      String var11 = vnvnUnVnuunn.UuUVuuUu(var3) + "_prog";
      float var12 = var2.UuUVuuUu(var11, var10, Cc0cOoOcC0o.vuuuNvNuv());
      float var13 = var2.UuUVuuUu(vnvnUnVnuunn.VVuuUN(var3));
      float var14 = Math.max(0.0F, Math.min(1.0F, var12 + (var10 - var12) * var13 * 0.85F));
      String var15 = vnvnUnVnuunn.C00OOC00oO(var3);
      float var16 = var2.UuUVuuUu(
         var15, nunvNNUnvU.UuUVuuUu(var2, var4, var5 + var8.UuUVuuUu(11.0F), var6, var8.UuUVuuUu(14.0F)) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv()
      );
      long var17 = System.currentTimeMillis();
      float var19 = (float)(var17 % 1000L) / 1000.0F;
      float var20 = var10 - var12;
      float var21 = var3.uNNnnnuuuN + var14 * (var3.nuUnNvnuUu - var3.uNNnnnuuuN);
      String var22 = var3.vVvUvVVuuNvV() ? var3.C00OOC00oO(var3.vVvUvVVuuNvV) : nunvNNUnvU.C00OOC00oO(var21, var3.VVuuUN);
      float var23 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var22, 12.0F);
      int var24 = NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var9), var9.uVunuUNVVUUV(), var13 * 0.8F);
      float var25 = var4 + var6 - var23;
      this.UuUVuuUu(var1, var8, var3.UuUVuuUu, var4, var5, var8.UuUVuuUu(14.0F), 12.0F, var25 - var4 - var8.UuUVuuUu(8.0F), nunvNNUnvU.UuUVuuUu(var9));
      nunvNNUnvU.UuUVuuUu(var1, var8, vNvnnVvvVUu.vVvUvVVuuNvV, var25, var5, var8.UuUVuuUu(14.0F), 12.0F, var22, var24);
      float var26 = var5 + var8.UuUVuuUu(17.0F);
      float var27 = var8.UuUVuuUu(5.0F);
      float var28 = var27 * 0.5F;
      float var29 = var6 * var14;
      var1.UuUVuuUu(var4, var26, var6, var27, var28, NUunUunuNV.UuUVuuUu(var9.uVUuuVnNVU(), var9.nvUVNnuu(), var16 * 0.42F));
      int var30 = var3.vVvUvVVuuNvV() ? var3.UuuNnUvUuv.length - 1 : 5;

      for (int var31 = 1; var31 < var30; var31++) {
         float var32 = var4 + var6 * var31 / var30 - var8.UuUVuuUu(0.5F);
         var1.UuUVuuUu(var32, var26 + var8.UuUVuuUu(1.0F), var8.UuUVuuUu(1.0F), var27 - var8.UuUVuuUu(2.0F), var8.UuUVuuUu(0.5F), var9.nvUVNnuu());
      }

      if (var29 > 1.0F) {
         var1.UuUVuuUu(var4, var26, var29, var27, var28, var9.UNnVVNvvnVvU(), var9.uVunuUNVVUUV());
         float var48 = 0.75F + 0.25F * (float)Math.sin(var19 * Math.PI * 2.0);
         float var50 = var14 * (1.0F + var13 * 0.6F);
         int var33 = var9.uNnUnnuNUnNu()
            ? NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round((18.0F + var13 * 10.0F) * var48 * var50))
            : NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), Math.round((22.0F + var13 * 18.0F) * var48 * var50));
         var1.UuUVuuUu(
            var4,
            var26,
            var29,
            var27,
            var28,
            var8.UuUVuuUu((var9.uNnUnnuNUnNu() ? 7 : 10) + var13 * 6.0F) * var48 * var50,
            var8.UuUVuuUu(var9.uNnUnnuNUnNu() ? 1.5F : 2.0F),
            var33
         );
         float var34 = var8.UuUVuuUu(8.0F + var13 * 6.0F);
         float var35 = Math.max(var4, var4 + var29 - var34);
         var1.UuUVuuUu(
            var35,
            var26 - var8.UuUVuuUu(0.5F),
            Math.min(var34, var29),
            var27 + var8.UuUVuuUu(1.0F),
            var28,
            NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), 0),
            NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), Math.round((40.0F + var13 * 35.0F) * var48 * var50))
         );
      }

      float var49 = Math.abs(var20);
      float var51 = var13 * Math.min(0.3F, var49 * 8.0F);
      float var52 = Math.min(0.5F, var49 * 5.0F + var51);
      float var53 = var8.UuUVuuUu(5.5F);
      float var54 = var53 * 2.0F;
      float var36 = nunvNNUnvU.UuUVuuUu(var16, var2.C00OOC00oO(var15), 0.018F, 0.006F);
      float var37 = 1.0F + var13 * 0.12F;
      float var38 = var54 * (1.0F + var52) * var36 * var37;
      float var39 = var54 * (1.0F - var52 * 0.35F) * var36 * var37;
      float var40 = var39 * 0.5F;
      float var41 = var4 + var6 * var14;
      float var42 = Math.signum(var20) * Math.min(var8.UuUVuuUu(1.5F), var49 * var8.UuUVuuUu(20.0F));
      var41 += var42;
      float var43 = var41 - var38 * 0.5F;
      float var44 = var26 + (var27 - var39) * 0.5F;
      if (var13 > 0.01F) {
         float var45 = 0.6F + 0.4F * (float)Math.sin(var19 * Math.PI * 3.0);
         float var46 = var8.UuUVuuUu(14.0F) * var13 * var45;
         int var47 = var9.uNnUnnuNUnNu()
            ? NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(22.0F * var13 * var45))
            : NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), Math.round(35.0F * var13 * var45));
         var1.UuUVuuUu(
            var43 - var8.UuUVuuUu(2.0F),
            var44 - var8.UuUVuuUu(2.0F),
            var38 + var8.UuUVuuUu(4.0F),
            var39 + var8.UuUVuuUu(4.0F),
            var40 + var8.UuUVuuUu(2.0F),
            var46,
            var8.UuUVuuUu(2.0F),
            var47
         );
      }

      if (var14 > 0.01F) {
         float var56 = 0.5F + 0.5F * (float)Math.sin(var19 * Math.PI * 2.0);
         int var59 = var9.uNnUnnuNUnNu()
            ? NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(14.0F * var14 * var56))
            : NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), Math.round(18.0F * var14 * var56));
         var1.UuUVuuUu(
            var43 - var8.UuUVuuUu(1.0F),
            var44 - var8.UuUVuuUu(1.0F),
            var38 + var8.UuUVuuUu(2.0F),
            var39 + var8.UuUVuuUu(2.0F),
            var40 + var8.UuUVuuUu(1.0F),
            var8.UuUVuuUu(8.0F) * var56 * var14,
            var8.UuUVuuUu(1.0F),
            var59
         );
      }

      var1.UuUVuuUu(
         var43 + var8.UuUVuuUu(0.5F),
         var44 + var8.UuUVuuUu(1.0F),
         var38,
         var39,
         var40,
         var8.UuUVuuUu(3.0F),
         var8.UuUVuuUu(0.5F),
         var9.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(46, 59, 70, 40) : NUunUunuNV.UuUVuuUu(0, 0, 0, 50)
      );
      var1.C00OOC00oO(var43, var44, var38, var39, var40, nunvNNUnvU.uNNnnnuuuN(var9), nunvNNUnvU.nuUnNvnuUu(var9));
      if (var14 > 0.01F) {
         float var57 = Math.max(var14, var13);
         var1.UuUVuuUu(
            var43 + var8.UuUVuuUu(1.0F),
            var44 + var8.UuUVuuUu(1.0F),
            var38 - var8.UuUVuuUu(2.0F),
            var39 - var8.UuUVuuUu(2.0F),
            Math.max(0.0F, var40 - var8.UuUVuuUu(1.0F)),
            NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), Math.round((80.0F + var13 * 40.0F) * var57)),
            0.7F
         );
      }

      var1.UuUVuuUu(
         var41 - var53 * 0.4F,
         var44 + var8.UuUVuuUu(1.0F),
         var53 * 0.8F,
         var39 * 0.3F,
         var40 * 0.4F,
         var9.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(46, 59, 70, 16) : NUunUunuNV.UuUVuuUu(var9.NVNnnvnuunNv(), 18)
      );
      float var58 = var26 - var8.UuUVuuUu(3.0F);
      float var60 = var27 + var8.UuUVuuUu(6.0F);
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, VnnUvVNuNuVv var3, float var4, float var5, float var6, nUVuuNUVnV var7) {
      nUvnuVnNUU var8 = var7.uNNnnnuuuN();
      NUunUunuNV var9 = var7.nuUnNvnuUu();
      float var10 = var2.UuUVuuUu(vnvnUnVnuunn.vNUvnnVnUvu(var3));
      float var11 = var2.UuUVuuUu(vnvnUnVnuunn.nvUVNnuu(var3), var3.vVvUvVVuuNvV(), Cc0cOoOcC0o.vuuuNvNuv());
      float var12 = var2.UuUVuuUu(vnvnUnVnuunn.UuuNnUvUuv(var3), var3.vNVuvnUUnuUn, Cc0cOoOcC0o.vuuuNvNuv());
      int var13 = nunvNNUnvU.uUnuvNvvNU(var11, var3.nUUVuvU, var3.UnUNVVVNuv, var12);
      float var14 = var8.UuUVuuUu(12.0F);
      float var15 = var4 + var6 - var14;
      float var16 = var5 + var8.UuUVuuUu(1.0F);
      float var17 = var8.UuUVuuUu(3.0F);
      this.UuUVuuUu(var1, var8, var3.UuUVuuUu, var4, var5, var8.UuUVuuUu(14.0F), 12.0F, var15 - var4 - var8.UuUVuuUu(8.0F), nunvNNUnvU.UuUVuuUu(var9));
      String var18 = vnvnUnVnuunn.uUnuvNvvNU(var3);
      float var19 = var2.UuUVuuUu(
         var18,
         nunvNNUnvU.UuUVuuUu(var2, var15 - var8.UuUVuuUu(3.0F), var16 - var8.UuUVuuUu(3.0F), var14 + var8.UuUVuuUu(6.0F), var14 + var8.UuUVuuUu(6.0F))
            ? 1.0F
            : 0.0F,
         Cc0cOoOcC0o.vuuuNvNuv()
      );
      var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var19, var2.C00OOC00oO(var18)), var15 + var14 * 0.5F, var16 + var14 * 0.5F);

      try {
         var1.UuUVuuUu(var15, var16, var14, var14, var17, var17, var17, var17);

         try {
            this.UuUVuuUu(var1, var15, var16, var14, var14, this.UuUVuuUu(var8, 0.74F), 1.0F);
         } finally {
            var1.nuUnNvnuUu();
         }

         var1.UuUVuuUu(var15, var16, var14, var14, var17, var13);
         var1.UuUVuuUu(var15, var16, var14, var14 * 0.55F, var17, var17, 0.0F, 0.0F, NUunUunuNV.UuUVuuUu(-1, 60), NUunUunuNV.UuUVuuUu(-1, 60), 0, 0);
         int var20 = NUunUunuNV.UuUVuuUu(var9.uNnUnnuNUnNu() ? -16777216 : -1, 102);
         var1.UuUVuuUu(var15, var16, var14, var14, var17, NUunUunuNV.UuUVuuUu(var20, NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), 180), var19), 0.5F);
      } finally {
         var1.uVUuuVnNVU();
      }

      if (var10 > 0.01F) {
         this.UuUVuuUu(var1, var2, var3, var4, var5 + var8.UuUVuuUu(16.0F), var6, var10, var7);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, VnnUvVNuNuVv var3, float var4, float var5, float var6, float var7, nUVuuNUVnV var8) {
      nUvnuVnNUU var9 = var8.uNNnnnuuuN();
      NUunUunuNV var10 = var8.nuUnNvnuUu();
      float var11 = var9.UuUVuuUu(186.0F) * var7;
      float var12 = var9.UuUVuuUu(5.0F);
      float var13 = var9.UuUVuuUu(12.0F);
      float var14 = var9.UuUVuuUu(5.0F);
      float var15 = var9.UuUVuuUu(9.0F);
      float var16 = var9.UuUVuuUu(16.0F);
      float var17 = var9.UuUVuuUu(16.0F);
      float var18 = var9.UuUVuuUu(14.0F);
      float var19 = var9.UuUVuuUu(12.0F);
      float var20 = var6 - var13 - var14;
      float var21 = var11 - var12 * 2.0F - var15 - var16 - var17 - var18 - var19 - var14 * 5.0F;
      float var22 = var5 + var12;
      float var23 = var4 + var20 + var14;
      float var24 = var22 + var21 + var14;
      float var25 = var24 + var15 + var14;
      float var26 = var25 + var16 + var14;
      float var27 = var26 + var17 + var14;
      float var28 = var27 + var18 + var14;
      float var29 = var9.UuUVuuUu(5.0F);
      if (var2.NvNUuuuvUvu() == var3 && var7 > 0.025F) {
         var2.uUVVvVVNvvn(var4);
         var2.vvUVNVvvNUv(var22);
         var2.UuNnnVnuNNV(Math.max(0.0F, var20));
         var2.uUVvnUuNvvN(Math.max(0.0F, var21));
         var2.UUuUnNVNuuv(var23);
         var2.NVuNUuVnVUN(var22);
         var2.NVuunNnvvvVu(Math.max(0.0F, var13));
         var2.vNnNuuvVn(Math.max(0.0F, var21));
         var2.VUuuVUnun(var4);
         var2.vVVuuVVv(var24);
         var2.VuunNUUUvu(Math.max(0.0F, var6));
         var2.NNUUNUuVNNVn(Math.max(0.0F, var15));
         var2.VvVvnNUnvuvV(var4);
         var2.ccOO0COcoco0(var25);
         var2.NUVvUUVuVNVv(Math.max(0.0F, var6));
         var2.nNuVunNUVu(Math.max(0.0F, var16));
         var2.UNvvunVVn(var4);
         var2.UnvuVuVnNuvu(var26);
         var2.UvNNVUVNVuvV(Math.max(0.0F, var6));
         var2.NnunUUnU(Math.max(0.0F, var17));
         var2.nvuVvuNnNUnv(var4);
         var2.NnVnNVN(var27);
         var2.vnvvNvUnVv(Math.max(0.0F, var6));
         var2.OCOocoOoOO(Math.max(0.0F, var18));
      }

      if (!(var21 <= 1.0F) && !(var20 <= 1.0F)) {
         var1.uNNnnnuuuN(var7);

         try {
            float var30 = var2.UuUVuuUu(vnvnUnVnuunn.nvUVNnuu(var3), var3.vVvUvVVuuNvV(), Cc0cOoOcC0o.vuuuNvNuv());
            float var31 = var2.UuUVuuUu(vnvnUnVnuunn.UuuNnUvUuv(var3), var3.vNVuvnUUnuUn, Cc0cOoOcC0o.vuuuNvNuv());
            int var32 = nunvNNUnvU.UuUVuuUu(var30, 1.0F, 1.0F);
            int var33 = NUunUunuNV.UuUVuuUu(255, 255, 255, 255);
            int var34 = NUunUunuNV.UuUVuuUu(0, 0, 0, 255);
            int var35 = NUunUunuNV.UuUVuuUu(0, 0, 0, 0);
            var1.UuUVuuUu(
               var4 - var9.UuUVuuUu(3.0F),
               var5 + var9.UuUVuuUu(1.0F),
               var6 + var9.UuUVuuUu(6.0F),
               var11 - var9.UuUVuuUu(2.0F),
               var9.UuUVuuUu(7.0F),
               NUunUunuNV.UuUVuuUu(var10.vNUvnnVnUvu(), var10.uVUuuVnNVU(), var7)
            );
            var1.UuUVuuUu(
               var4 - var9.UuUVuuUu(3.0F),
               var5 + var9.UuUVuuUu(1.0F),
               var6 + var9.UuUVuuUu(6.0F),
               var11 - var9.UuUVuuUu(2.0F),
               var9.UuUVuuUu(7.0F),
               var10.nvUVNnuu(),
               0.5F
            );
            var1.uUnuvNvvNU();
            var1.UuUVuuUu(var4, var22, var20, var21, var29, var29, var29, var29);
            boolean var58 = false /* VF: Semaphore variable */;

            try {
               var58 = true;
               var1.UuUVuuUu(var4, var22, var20, var21, var33, var32, var32, var33);
               var1.UuUVuuUu(var4, var22, var20, var21, var35, var35, var34, var34);
               var58 = false;
            } finally {
               if (var58) {
                  var1.uUnuvNvvNU();
                  var1.nuUnNvnuUu();
               }
            }

            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
            var1.UuUVuuUu(var4, var22, var20, var21, var29, var10.UuuNnUvUuv(), 0.5F);
            nunvNNUnvU.UuUVuuUu(var1, var23, var22, var13, var21, var29);
            var1.UuUVuuUu(var23, var22, var13, var21, var29, var10.UuuNnUvUuv(), 0.5F);
            float var36 = var2.UuUVuuUu(vnvnUnVnuunn.uVUuuVnNVU(var3), var3.nUUVuvU, Cc0cOoOcC0o.vuuuNvNuv());
            float var37 = var2.UuUVuuUu(vnvnUnVnuunn.vuuuNvNuv(var3), 1.0F - var3.UnUNVVVNuv, Cc0cOoOcC0o.vuuuNvNuv());
            float var38 = var4 + var36 * var20;
            float var39 = var22 + var37 * var21;
            float var40 = var9.UuUVuuUu(5.0F);
            int var41 = nunvNNUnvU.UuUVuuUu(var30, var36, 1.0F - var37);
            var1.UuUVuuUu(
               var38 - var40,
               var39 - var40,
               var40 * 2.0F,
               var40 * 2.0F,
               var40,
               var9.UuUVuuUu(4.0F),
               var9.UuUVuuUu(1.0F),
               var10.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(0, 0, 0, 34) : NUunUunuNV.UuUVuuUu(var41, 40)
            );
            var1.UuUVuuUu(var38 - var40, var39 - var40, var40 * 2.0F, var40 * 2.0F, var40, var10.NVNnnvnuunNv(), 1.5F);
            var1.UuUVuuUu(
               var38 - var40 + 1.0F,
               var39 - var40 + 1.0F,
               var40 * 2.0F - 2.0F,
               var40 * 2.0F - 2.0F,
               Math.max(0.0F, var40 - 1.0F),
               NUunUunuNV.UuUVuuUu(0, 0, 0, 80),
               0.5F
            );
            float var42 = var22 + var30 * var21;
            float var43 = var9.UuUVuuUu(4.0F);
            float var44 = var13 + var9.UuUVuuUu(2.0F);
            var1.UuUVuuUu(var23 - var9.UuUVuuUu(1.0F), var42 - var43 * 0.5F, var44, var43, var9.UuUVuuUu(2.0F), var10.NVNnnvnuunNv());
            var1.UuUVuuUu(var23 - var9.UuUVuuUu(1.0F), var42 - var43 * 0.5F, var44, var43, var9.UuUVuuUu(2.0F), NUunUunuNV.UuUVuuUu(0, 0, 0, 60), 0.5F);
            var1.UuUVuuUu(var4, var24, var6, var15, var9.UuUVuuUu(3.0F), var9.UuUVuuUu(3.0F), var9.UuUVuuUu(3.0F), var9.UuUVuuUu(3.0F));

            try {
               this.UuUVuuUu(var1, var4, var24, var6, var15, this.UuUVuuUu(var9, 1.0F), 1.0F);
               int var45 = nunvNNUnvU.uUnuvNvvNU(var30, var3.nUUVuvU, var3.UnUNVVVNuv, 0.0F);
               int var46 = nunvNNUnvU.uUnuvNvvNU(var30, var3.nUUVuvU, var3.UnUNVVVNuv, 1.0F);
               var1.UuUVuuUu(var4, var24, var6, var15, var9.UuUVuuUu(3.0F), var45, var46);
            } finally {
               var1.nuUnNvnuUu();
            }

            var1.UuUVuuUu(var4, var24, var6, var15, var9.UuUVuuUu(3.0F), var10.UuuNnUvUuv(), 0.5F);
            float var62 = var4 + var31 * var6;
            var1.UuUVuuUu(
               var62 - var9.UuUVuuUu(2.0F),
               var24 - var9.UuUVuuUu(2.0F),
               var9.UuUVuuUu(4.0F),
               var15 + var9.UuUVuuUu(4.0F),
               var9.UuUVuuUu(2.0F),
               var9.UuUVuuUu(4.0F),
               var9.UuUVuuUu(1.0F),
               NUunUunuNV.UuUVuuUu(0, 0, 0, 70)
            );
            var1.UuUVuuUu(
               var62 - var9.UuUVuuUu(1.5F),
               var24 - var9.UuUVuuUu(1.0F),
               var9.UuUVuuUu(3.0F),
               var15 + var9.UuUVuuUu(2.0F),
               var9.UuUVuuUu(1.5F),
               var10.NVNnnvnuunNv()
            );
            var1.UuUVuuUu(
               var62 - var9.UuUVuuUu(1.5F),
               var24 - var9.UuUVuuUu(1.0F),
               var9.UuUVuuUu(3.0F),
               var15 + var9.UuUVuuUu(2.0F),
               var9.UuUVuuUu(1.5F),
               NUunUunuNV.UuUVuuUu(0, 0, 0, 80),
               0.5F
            );
            this.UuUVuuUu(var1, var9, var10, var4, var25, var6, var16, var30, var3.nUUVuvU, var3.UnUNVVVNuv, var31);
            this.UuUVuuUu(var1, var9, var10, var3, var4, var26, var6, var17, var31);
            int var63 = nunvNNUnvU.uUnuvNvvNU(var30, var3.nUUVuvU, var3.UnUNVVVNuv, var31);
            int var47 = var2.C00OOC00oO(var3);
            this.UuUVuuUu(var1, var2, var9, var10, var3, var4, var27, var6, var18, var63, var47);
            this.UuUVuuUu(var1, var2, var9, var10, var3, var4, var28, var6, var19, var63, var31);
         } finally {
            var1.vuuuNvNuv();
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      nUvnuVnNUU var3,
      NUunUunuNV var4,
      VnnUvVNuNuVv var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11
   ) {
      float var12 = var3.UuUVuuUu(4.0F);
      float var13 = (var8 - var12) * 0.5F;
      float var15 = var6 + var13 + var12;
      float var16 = Math.min(var9, var13);
      float var17 = var16 * 0.5F;
      float var18 = var6 + (var13 - var16) * 0.5F;
      float var19 = var15 + (var13 - var16) * 0.5F;
      if (var2.NvNUuuuvUvu() == var5) {
         var2.o0Ooc0COOoc(var15);
         var2.nvvnUnUn(var13);
      }

      float[] var20 = this.UuUVuuUu(var1, var18, var7, var16, var16);
      float[] var21 = this.UuUVuuUu(var1, var19, var7, var16, var16);
      float var22 = this.UuUVuuUu(var1, var17);
      float var23 = var1.nUUVuvU();
      boolean var24 = var2.NvNUuuuvUvu() == var5 && !var2.NvUVUvVVnUu();
      var1.uUnuvNvvNU();
      if (!var24
         || !nvVnuNNvUuvv.UuUVuuUu(
            var20[0],
            var20[1],
            var20[2],
            var20[3],
            var10,
            var11,
            var4.uVunuUNVVUUV(),
            var4.UNnVVNvvnVvU(),
            var2.unnUnUNVnN(),
            var2.NnuUnUNnu(),
            var22,
            var23,
            true
         )) {
         if ((var10 >>> 24 & 0xFF) < 250) {
            var1.UuUVuuUu(var18, var7, var16, var16, var17, var17, var17, var17);
            boolean var32 = false /* VF: Semaphore variable */;

            try {
               var32 = true;
               this.UuUVuuUu(var1, var18, var7, var16, var16, this.UuUVuuUu(var3, 1.0F), 1.0F);
               var32 = false;
            } finally {
               if (var32) {
                  var1.nuUnNvnuUu();
               }
            }

            var1.nuUnNvnuUu();
         }

         var1.C00OOC00oO(var18 + var17, var7 + var17, var17, 0.0F, 1.0F, var10);
      }

      if (!var24
         || !nvVnuNNvUuvv.UuUVuuUu(
            var21[0],
            var21[1],
            var21[2],
            var21[3],
            var11,
            var10,
            var4.UNnVVNvvnVvU(),
            var4.uVunuUNVVUUV(),
            var2.unnUnUNVnN(),
            var2.NnuUnUNnu(),
            var22,
            var23,
            false
         )) {
         if ((var11 >>> 24 & 0xFF) < 250) {
            var1.UuUVuuUu(var19, var7, var16, var16, var17, var17, var17, var17);
            boolean var29 = false /* VF: Semaphore variable */;

            try {
               var29 = true;
               this.UuUVuuUu(var1, var19, var7, var16, var16, this.UuUVuuUu(var3, 1.0F), 1.0F);
               var29 = false;
            } finally {
               if (var29) {
                  var1.nuUnNvnuUu();
               }
            }

            var1.nuUnNvnuUu();
         }

         var1.C00OOC00oO(var19 + var17, var7 + var17, var17, 0.0F, 1.0F, var11);
      }

      var1.UuUVuuUu(var18, var7, var16, var16, var17, var4.UuuNnUvUuv(), 0.5F);
      var1.UuUVuuUu(var19, var7, var16, var16, var17, var4.UuuNnUvUuv(), 0.5F);
      float var25 = var15 - var12 * 0.5F;
      var1.C00OOC00oO(
         var25 - var3.UuUVuuUu(0.5F),
         var7 + var3.UuUVuuUu(2.0F),
         var3.UuUVuuUu(1.0F),
         var9 - var3.UuUVuuUu(4.0F),
         var3.UuUVuuUu(0.5F),
         NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 120),
         NUunUunuNV.UuUVuuUu(var4.UNnVVNvvnVvU(), 90)
      );
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      nUvnuVnNUU var3,
      NUunUunuNV var4,
      VnnUvVNuNuVv var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      float var11
   ) {
      float var12 = var8 * 0.62F;
      float var13 = var8 * 0.32F;
      float var15 = var6 + var8 - var13;
      float var16 = var9 + var3.UuUVuuUu(4.0F);
      float var17 = var7 - var3.UuUVuuUu(2.0F);
      float var18 = var3.UuUVuuUu(3.0F);
      if (var2.NvNUuuuvUvu() == var5) {
         var2.UnUUVuVunvVu(var6);
         var2.nnvuvUNuUnN(var17);
         var2.UVnuVUUVnnU(var12);
         var2.VunnVNvNV(var16);
         var2.NvUVUvVVnUu(var15);
         var2.unnUnUNVnN(var17);
         var2.NnuUnUNnu(var13);
         var2.UnnnvvU(var16);
      }

      boolean var19 = var2.vnUUvvnUVUu() == var5;
      boolean var20 = var2.UvnnnuuNvUvv() == var5;
      boolean var21 = System.currentTimeMillis() / 500L % 2L == 0L;
      int var22 = NUunUunuNV.UuUVuuUu(var4.uVUuuVnNVU(), NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 36), var19 ? 1.0F : 0.0F);
      var1.UuUVuuUu(var6, var17, var12, var16, var18, var22);
      if (var19) {
         var1.UuUVuuUu(var6, var17, var12, var16, var18, NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 220), 1.0F);
      } else {
         var1.UuUVuuUu(var6, var17, var12, var16, var18, var4.UuuNnUvUuv(), 0.5F);
      }

      String var23;
      if (var19) {
         String var24 = var2.vNVvnNNnVV();
         var23 = "#" + (var24 == null ? "" : var24) + (var21 ? "|" : " ");
      } else {
         var23 = String.format("#%02X%02X%02X", var10 >>> 16 & 0xFF, var10 >>> 8 & 0xFF, var10 & 0xFF);
      }

      int var30 = var19 ? var4.NVNnnvnuunNv() : var4.uVUVnuvnuVuv();
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.UuUVuuUu,
         var6 + var3.UuUVuuUu(6.0F),
         var17,
         var16,
         8.0F,
         nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var23, 8.0F, var12 - var3.UuUVuuUu(12.0F)),
         var30
      );
      int var25 = NUunUunuNV.UuUVuuUu(var4.uVUuuVnNVU(), NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 36), var20 ? 1.0F : 0.0F);
      var1.UuUVuuUu(var15, var17, var13, var16, var18, var25);
      if (var20) {
         var1.UuUVuuUu(var15, var17, var13, var16, var18, NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 220), 1.0F);
      } else {
         var1.UuUVuuUu(var15, var17, var13, var16, var18, var4.UuuNnUvUuv(), 0.5F);
      }

      String var26;
      if (var20) {
         String var27 = var2.uVUUnuunuv();
         var26 = (var27 == null ? "" : var27) + (var21 ? "|" : " ") + "%";
      } else {
         var26 = Math.round(var11 * 100.0F) + "%";
      }

      int var31 = var20 ? var4.NVNnnvnuunNv() : var4.uVUVnuvnuVuv();
      float var28 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var26, 8.0F);
      float var29 = var15 + (var13 - var28) * 0.5F;
      nunvNNUnvU.UuUVuuUu(var1, var3, vNvnnVvvVUu.UuUVuuUu, var29, var17, var16, 8.0F, var26, var31);
   }

   private float[] UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      float[] var6 = var1.nvUVNnuu().uNNnnnuuuN();
      float var7 = this.UuUVuuUu(var6, var2, var3);
      float var8 = this.C00OOC00oO(var6, var2, var3);
      float var9 = this.UuUVuuUu(var6, var2 + var4, var3);
      float var10 = this.C00OOC00oO(var6, var2 + var4, var3);
      float var11 = this.UuUVuuUu(var6, var2 + var4, var3 + var5);
      float var12 = this.C00OOC00oO(var6, var2 + var4, var3 + var5);
      float var13 = this.UuUVuuUu(var6, var2, var3 + var5);
      float var14 = this.C00OOC00oO(var6, var2, var3 + var5);
      float var15 = Math.min(Math.min(var7, var9), Math.min(var11, var13));
      float var16 = Math.min(Math.min(var8, var10), Math.min(var12, var14));
      float var17 = Math.max(Math.max(var7, var9), Math.max(var11, var13));
      float var18 = Math.max(Math.max(var8, var10), Math.max(var12, var14));
      return new float[]{var15, var16, Math.max(0.0F, var17 - var15), Math.max(0.0F, var18 - var16)};
   }

   private float UuUVuuUu(UnVNvNnU var1, float var2) {
      float[] var3 = var1.nvUVNnuu().uNNnnnuuuN();
      float var4 = (float)Math.sqrt(var3[0] * var3[0] + var3[3] * var3[3]);
      float var5 = (float)Math.sqrt(var3[1] * var3[1] + var3[4] * var3[4]);
      return var2 * Math.max(0.001F, (var4 + var5) * 0.5F);
   }

   private float UuUVuuUu(float[] var1, float var2, float var3) {
      return var1[0] * var2 + var1[1] * var3 + var1[2];
   }

   private float C00OOC00oO(float[] var1, float var2, float var3) {
      return var1[3] * var2 + var1[4] * var3 + var1[5];
   }

   private void UuUVuuUu(
      UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11
   ) {
      float var12 = var2.UuUVuuUu(3.0F);
      byte var13 = 5;
      float var14 = (var6 - var12 * (var13 - 1)) / var13;
      float var15 = var2.UuUVuuUu(4.0F);
      float[] var16 = new float[]{0.0F, 0.5F, -0.083333336F, 0.083333336F, 0.33333334F};
      float var17 = Math.max(0.65F, var9);
      float var18 = Math.max(0.72F, var10);

      for (int var19 = 0; var19 < var13; var19++) {
         float var20 = var4 + var19 * (var14 + var12);
         float var21 = var8 + var16[var19];
         var1.UuUVuuUu(var20, var5, var14, var7, var15, var15, var15, var15);

         try {
            if (var11 < 0.995F) {
               this.UuUVuuUu(var1, var20, var5, var14, var7, this.UuUVuuUu(var2, 0.92F), 1.0F);
            }

            var1.UuUVuuUu(var20, var5, var14, var7, var15, nunvNNUnvU.uUnuvNvvNU(var21, var17, var18, var11));
         } finally {
            var1.nuUnNvnuUu();
         }

         var1.UuUVuuUu(var20, var5, var14, var7, var15, var19 == 0 ? NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 120) : var3.UuuNnUvUuv(), 0.5F);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, VnnUvVNuNuVv var4, float var5, float var6, float var7, float var8, float var9) {
      byte var10 = 9;
      float var11 = var2.UuUVuuUu(3.0F);
      float var12 = (var7 - var11 * (var10 - 1)) / var10;
      float var13 = var2.UuUVuuUu(4.0F);
      int var14 = var4.uVUuuVnNVU();

      for (int var15 = 0; var15 < var10; var15++) {
         float var16 = var5 + var15 * (var12 + var11);
         boolean var17 = var15 == 8;
         boolean var18 = !var17 && var15 < var4.UvnvNVnnnnNU.size();
         var1.UuUVuuUu(var16, var6, var12, var8, var13, var13, var13, var13);

         try {
            this.UuUVuuUu(var1, var16, var6, var12, var8, this.UuUVuuUu(var2, 0.92F), var18 ? 0.8F : 0.35F);
            if (var18) {
               var1.UuUVuuUu(var16, var6, var12, var8, var13, var4.UvnvNVnnnnNU.get(var15));
            } else {
               var1.UuUVuuUu(var16, var6, var12, var8, var13, var17 ? NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 18) : var3.uVUuuVnNVU());
            }
         } finally {
            var1.nuUnNvnuUu();
         }

         if (var17) {
            float var19 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "O", 8.0F);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var2,
               vNvnnVvvVUu.vNUvnnVnUvu,
               var16 + (var12 - var19) * 0.5F,
               var6,
               var8,
               8.0F,
               "O",
               NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), Math.round(160.0F + 70.0F * var9))
            );
         }

         boolean var23 = var18 && var4.UvnvNVnnnnNU.get(var15) == var14;
         if (var23) {
            float var20 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "j", 7.0F);
            nunvNNUnvU.UuUVuuUu(
               var1, var2, vNvnnVvvVUu.vNUvnnVnUvu, var16 + (var12 - var20) * 0.5F, var6, var8, 7.0F, "j", NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), 220)
            );
         }

         int var24 = var23 ? NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 160) : (var17 ? NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 95) : var3.UuuNnUvUuv());
         var1.UuUVuuUu(var16, var6, var12, var8, var13, var24, var23 ? 0.8F : 0.5F);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (!(var4 <= 0.0F) && !(var5 <= 0.0F) && !(var6 <= 0.0F)) {
         boolean var8 = false;

         for (float var9 = var3; var9 < var3 + var5; var9 += var6) {
            boolean var10 = var8;
            float var11 = Math.min(var6, var3 + var5 - var9);

            for (float var12 = var2; var12 < var2 + var4; var12 += var6) {
               float var13 = Math.min(var6, var2 + var4 - var12);
               var1.UuUVuuUu(var12, var9, var13, var11, NUunUunuNV.UuUVuuUu(var10 ? -1577754 : -3945532, Math.round(255.0F * var7)));
               var10 = !var10;
            }

            var8 = !var8;
         }
      }
   }

   private float UuUVuuUu(nUvnuVnNUU var1, float var2) {
      return Math.max(4.5F, var1.UuUVuuUu(6.0F * var2));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, UvNnUnuNUUU var3, float var4, float var5, float var6, nUVuuNUVnV var7) {
      nUvnuVnNUU var8 = var7.uNNnnnuuuN();
      NUunUunuNV var9 = var7.nuUnNvnuUu();
      float var10 = var2.UuUVuuUu(vnvnUnVnuunn.uNNnnnuuuN(var3));
      float var11 = UuUVuuUu(var3, var6, var8);
      float var12 = UuUVuuUu(var3, var4, var6, var8);
      float var13 = UuUVuuUu(var8);
      float var14 = UuUVuuUu(var5, var8);
      float var15 = var8.UuUVuuUu(5.0F);
      this.UuUVuuUu(var1, var8, var3.UuUVuuUu, var4, var5, var8.UuUVuuUu(14.0F), 12.0F, var12 - var4 - var8.UuUVuuUu(8.0F), nunvNNUnvU.UuUVuuUu(var9));
      String var16 = vnvnUnVnuunn.uUnuvNvvNU(var3);
      float var17 = var2.UuUVuuUu(var16, nunvNNUnvU.UuUVuuUu(var2, var12, var14, var11, var13) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      float var18 = nunvNNUnvU.UuUVuuUu(var17, var2.C00OOC00oO(var16));
      var1.UuUVuuUu(var18, var12 + var11 * 0.5F, var14 + var13 * 0.5F);
      boolean var27 = false /* VF: Semaphore variable */;

      try {
         var27 = true;
         var1.UuUVuuUu(var12, var14, var11, var13, var15, NUunUunuNV.UuUVuuUu(var9.uVUuuVnNVU(), var9.nvUVNnuu(), Math.max(var10, var17 * 0.58F)));
         var1.UuUVuuUu(
            var12,
            var14,
            var11,
            var13,
            var15,
            NUunUunuNV.UuUVuuUu(var9.UuuNnUvUuv(), NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), 120), Math.max(var10, var17)),
            0.5F
         );
         var1.C00OOC00oO(
            var12 + var8.UuUVuuUu(1.5F),
            var14 + var8.UuUVuuUu(3.0F),
            var8.UuUVuuUu(1.5F),
            var13 - var8.UuUVuuUu(6.0F),
            var8.UuUVuuUu(1.0F),
            NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), 200),
            NUunUunuNV.UuUVuuUu(var9.UNnVVNvvnVvU(), 180)
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var8,
            vNvnnVvvVUu.UuUVuuUu,
            var12 + var8.UuUVuuUu(7.0F),
            var14,
            var13,
            10.0F,
            nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var3.uNNnnnuuuN, 10.0F, var11 - var8.UuUVuuUu(22.0F)),
            nunvNNUnvU.UuUVuuUu(var9)
         );
         float var19 = var12 + var11 - var8.UuUVuuUu(12.0F);
         float var20 = var14 + var13 * 0.5F;
         int var21 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), 160), var9.uVunuUNVVUUV(), Math.max(var10, var17 * 0.5F));
         float var22 = 1.0F - 2.0F * var10;
         if (Math.abs(var22) > 0.01F) {
            var1.UuUVuuUu(var22, var19, var20);

            try {
               nunvNNUnvU.UuUVuuUu(var1, var8, vNvnnVvvVUu.vNUvnnVnUvu, var19, var14, var13, 7.0F, "k", var21);
            } finally {
               var1.uVUuuVnNVU();
            }

            var27 = false;
         } else {
            var27 = false;
         }
      } finally {
         if (var27) {
            var1.uVUuuVnNVU();
         }
      }

      var1.uVUuuVnNVU();
      if (var10 > 0.01F) {
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var10, var7);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, UvNnUnuNUUU var3, float var4, float var5, float var6, float var7, nUVuuNUVnV var8) {
      nUvnuVnNUU var9 = var8.uNNnnnuuuN();
      NUunUunuNV var10 = var8.nuUnNvnuUu();
      float var11 = UuUVuuUu(var6);
      float var12 = UuUVuuUu(var4, var6);
      float var13 = var5 + var9.UuUVuuUu(14.0F) + var9.UuUVuuUu(4.0F);
      float var14 = var9.UuUVuuUu(18.0F);
      float var15 = var9.UuUVuuUu(3.0F);
      float var16 = var15 * 2.0F + var3.vVvUvVVuuNvV.size() * var14;
      float var17 = var9.UuUVuuUu(6.0F);
      var1.uNNnnnuuuN(var7);

      try {
         var1.UuUVuuUu(var12, var13, var11, var16 * var7, var17, var10.uVUuuVnNVU());
         var1.UuUVuuUu(var12, var13, var11, var16 * var7, var17, var10.UuuNnUvUuv(), 0.5F);
         if (var7 > 0.5F) {
            for (int var18 = 0; var18 < var3.vVvUvVVuuNvV.size(); var18++) {
               String var19 = var3.vVvUvVVuuNvV.get(var18);
               boolean var20 = var18 == var3.vNUvnnVnUvu;
               float var21 = var13 + var15 + var18 * var14;
               if (var20) {
                  var1.UuUVuuUu(
                     var12 + var9.UuUVuuUu(2.0F),
                     var21,
                     var11 - var9.UuUVuuUu(4.0F),
                     var14,
                     var9.UuUVuuUu(4.0F),
                     NUunUunuNV.UuUVuuUu(var10.UNnVVNvvnVvU(), 35),
                     NUunUunuNV.UuUVuuUu(var10.uVunuUNVVUUV(), 20)
                  );
               }

               String var22 = vnvnUnVnuunn.uUnuvNvvNU(var3, var18);
               boolean var23 = nunvNNUnvU.UuUVuuUu(var2, var12, var21, var11, var14);
               float var24 = var2.UuUVuuUu(var22, var23 ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
               if (var24 > 0.01F && !var20) {
                  var1.UuUVuuUu(
                     var12 + var9.UuUVuuUu(2.0F),
                     var21,
                     var11 - var9.UuUVuuUu(4.0F),
                     var14,
                     var9.UuUVuuUu(4.0F),
                     NUunUunuNV.UuUVuuUu(var10.vNUvnnVnUvu(), var10.vuuuNvNuv(), var24)
                  );
               }

               int var25 = var20 ? var10.uVunuUNVVUUV() : (var24 > 0.2F ? nunvNNUnvU.UuUVuuUu(var10) : nunvNNUnvU.C00OOC00oO(var10));
               if (var20) {
                  var1.C00OOC00oO(
                     var12 + var9.UuUVuuUu(4.0F),
                     var21 + var9.UuUVuuUu(3.0F),
                     var9.UuUVuuUu(1.5F),
                     var14 - var9.UuUVuuUu(6.0F),
                     var9.UuUVuuUu(1.0F),
                     NUunUunuNV.UuUVuuUu(var10.uVunuUNVVUUV(), 200),
                     NUunUunuNV.UuUVuuUu(var10.UNnVVNvvnVvU(), 180)
                  );
               }

               var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var24, var2.C00OOC00oO(var22), 0.012F, 0.004F), var12 + var11 * 0.5F, var21 + var14 * 0.5F);

               try {
                  nunvNNUnvU.UuUVuuUu(
                     var1,
                     var9,
                     vNvnnVvvVUu.UuUVuuUu,
                     var12 + var9.UuUVuuUu(10.0F),
                     var21,
                     var14,
                     10.0F,
                     nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var19, 10.0F, var11 - var9.UuUVuuUu(18.0F)),
                     var25
                  );
               } finally {
                  var1.uVUuuVnNVU();
               }
            }
         }
      } finally {
         var1.vuuuNvNuv();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, ili11Iii1Ii var3, float var4, float var5, float var6, nUVuuNUVnV var7) {
      nUvnuVnNUU var8 = var7.uNNnnnuuuN();
      NUunUunuNV var9 = var7.nuUnNvnuUu();
      var3.uUnuvNvvNU();
      float var10 = var8.UuUVuuUu(18.0F);
      float var11 = var2.UuUVuuUu(vnvnUnVnuunn.uNNnnnuuuN(var3));
      float var12 = UuUVuuUu(var3, var6, var8);
      float var13 = UuUVuuUu(var3, var4, var6, var8);
      float var14 = C00OOC00oO(var5, var8);
      float var15 = C00OOC00oO(var8);
      float var16 = var8.UuUVuuUu(6.0F);
      this.UuUVuuUu(var1, var8, var3.UuUVuuUu, var4, var5, var10, 12.0F, var13 - var4 - var8.UuUVuuUu(8.0F), nunvNNUnvU.UuUVuuUu(var9));
      String var17 = vnvnUnVnuunn.uUnuvNvvNU(var3);
      float var18 = var2.UuUVuuUu(var17, nunvNNUnvU.UuUVuuUu(var2, var13, var14, var12, var15) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      float var19 = Math.max(var11, var18);
      var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var18, var2.C00OOC00oO(var17), 0.014F, 0.004F), var13 + var12 * 0.5F, var14 + var15 * 0.5F);
      boolean var31 = false /* VF: Semaphore variable */;

      try {
         var31 = true;
         var1.UuUVuuUu(var13, var14, var12, var15, var16, NUunUunuNV.UuUVuuUu(var9.uVUuuVnNVU(), var9.nvUVNnuu(), var19 * 0.7F));
         var1.UuUVuuUu(var13, var14, var12, var15, var16, NUunUunuNV.UuUVuuUu(var9.UuuNnUvUuv(), NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), 120), var19), 0.5F);
         float var20 = var8.UuUVuuUu(12.0F);
         float var21 = var13 + var8.UuUVuuUu(4.0F);
         float var22 = var14 + (var15 - var20) * 0.5F;
         var1.C00OOC00oO(
            var21, var22, var20, var20, var8.UuUVuuUu(4.0F), NUunUunuNV.UuUVuuUu(var9.uVunuUNVVUUV(), 190), NUunUunuNV.UuUVuuUu(var9.UNnVVNvvnVvU(), 150)
         );
         float var23 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "w", 7.0F);
         nunvNNUnvU.UuUVuuUu(var1, var8, vNvnnVvvVUu.vNUvnnVnUvu, var21 + (var20 - var23) * 0.5F, var22, var20, 7.0F, "w", var9.NVNnnvnuunNv());
         float var24 = var13 + var12 - var8.UuUVuuUu(11.0F);
         float var25 = 1.0F - 2.0F * var11;
         if (Math.abs(var25) > 0.01F) {
            var1.UuUVuuUu(var25, var24, var14 + var15 * 0.5F);
            boolean var34 = false /* VF: Semaphore variable */;

            try {
               var34 = true;
               nunvNNUnvU.UuUVuuUu(
                  var1, var8, vNvnnVvvVUu.vNUvnnVnUvu, var24, var14, var15, 7.0F, "k", NUunUunuNV.UuUVuuUu(var9.uVUVnuvnuVuv(), var9.uVunuUNVVUUV(), var19)
               );
               var34 = false;
            } finally {
               if (var34) {
                  var1.uVUuuVnNVU();
               }
            }

            var1.uVUuuVnNVU();
         }

         String var26 = var3.vNUvnnVnUvu();
         int var27 = var3.vuuuNvNuv()
            ? NUunUunuNV.UuUVuuUu(nunvNNUnvU.uUnuvNvvNU(var9), var9.UNnVVNvvnVvU(), 0.45F)
            : NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var9), nunvNNUnvU.UuUVuuUu(var9), var18 * 0.48F + var11 * 0.22F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var8,
            vNvnnVvvVUu.UuUVuuUu,
            var13 + var8.UuUVuuUu(20.0F),
            var14,
            var15,
            10.0F,
            nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var26, 10.0F, var12 - var8.UuUVuuUu(36.0F)),
            var27
         );
         var31 = false;
      } finally {
         if (var31) {
            var1.uVUuuVnNVU();
         }
      }

      var1.uVUuuVnNVU();
      if (var11 > 0.01F) {
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var11, var7);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, ili11Iii1Ii var3, float var4, float var5, float var6, float var7, nUVuuNUVnV var8) {
      nUvnuVnNUU var9 = var8.uNNnnnuuuN();
      NUunUunuNV var10 = var8.nuUnNvnuUu();
      var3.uUnuvNvvNU();
      float var11 = C00OOC00oO(var6);
      float var12 = C00OOC00oO(var4, var6);
      float var13 = var5 + var9.UuUVuuUu(18.0F) + var9.UuUVuuUu(5.0F);
      float var14 = uUnuvNvvNU(var9);
      float var15 = var9.UuUVuuUu(4.0F);
      float var16 = var15 * 2.0F + var3.vVvUvVVuuNvV.size() * var14;
      float var17 = var9.UuUVuuUu(8.0F);
      var1.uNNnnnuuuN(var7);

      try {
         var1.UuUVuuUu(
            var12,
            var13,
            var11,
            var16 * var7,
            var17,
            var9.UuUVuuUu(14.0F),
            var9.UuUVuuUu(1.0F),
            NUunUunuNV.UuUVuuUu(var10.uVunuUNVVUUV(), Math.round(34.0F * var7))
         );
         var1.UuUVuuUu(var12, var13, var11, var16 * var7, var17, NUunUunuNV.UuUVuuUu(var10.uVUuuVnNVU(), var10.nvUVNnuu(), 0.28F));
         var1.UuUVuuUu(
            var12, var13, var11, var16 * var7, var17, NUunUunuNV.UuUVuuUu(var10.UuuNnUvUuv(), NUunUunuNV.UuUVuuUu(var10.uVunuUNVVUUV(), 112), var7), 0.55F
         );
         if (var7 > 0.45F) {
            for (int var18 = 0; var18 < var3.vVvUvVVuuNvV.size(); var18++) {
               String var19 = var3.vVvUvVVuuNvV.get(var18);
               boolean var20 = var3.C00OOC00oO(var19);
               float var21 = var13 + var15 + var18 * var14;
               String var22 = vnvnUnVnuunn.uUnuvNvvNU(var3, var18);
               float var23 = var2.UuUVuuUu(var22, nunvNNUnvU.UuUVuuUu(var2, var12, var21, var11, var14) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
               float var24 = var12 + var9.UuUVuuUu(7.0F);
               float var25 = var21 + var9.UuUVuuUu(6.0F);
               float var26 = var9.UuUVuuUu(76.0F);
               float var27 = var14 - var9.UuUVuuUu(12.0F);
               if (var20) {
                  var1.UuUVuuUu(
                     var12 + var9.UuUVuuUu(3.0F),
                     var21 + var9.UuUVuuUu(1.0F),
                     var11 - var9.UuUVuuUu(6.0F),
                     var14 - var9.UuUVuuUu(2.0F),
                     var9.UuUVuuUu(6.0F),
                     NUunUunuNV.UuUVuuUu(var10.UNnVVNvvnVvU(), 42),
                     NUunUunuNV.UuUVuuUu(var10.uVunuUNVVUUV(), 24)
                  );
                  var1.UuUVuuUu(
                     var12 + var9.UuUVuuUu(5.0F),
                     var21 + var9.UuUVuuUu(4.0F),
                     var11 - var9.UuUVuuUu(10.0F),
                     var14 - var9.UuUVuuUu(8.0F),
                     var9.UuUVuuUu(7.0F),
                     var9.UuUVuuUu(10.0F),
                     var9.UuUVuuUu(1.0F),
                     NUunUunuNV.UuUVuuUu(var10.uVunuUNVVUUV(), Math.round(24.0F * var7))
                  );
               } else if (var23 > 0.01F) {
                  var1.UuUVuuUu(
                     var12 + var9.UuUVuuUu(3.0F),
                     var21 + var9.UuUVuuUu(1.0F),
                     var11 - var9.UuUVuuUu(6.0F),
                     var14 - var9.UuUVuuUu(2.0F),
                     var9.UuUVuuUu(6.0F),
                     NUunUunuNV.UuUVuuUu(var10.vNUvnnVnUvu(), var10.nvUVNnuu(), var23)
                  );
               }

               this.UuUVuuUu(var1, var2, var8, var3, var19, var24, var25, var26, var27, var7);
               float var28 = var24 + var26 + var9.UuUVuuUu(10.0F);
               int var29 = var20 ? var10.uVunuUNVVUUV() : NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var10), nunvNNUnvU.UuUVuuUu(var10), var23 * 0.55F);
               String var30 = this.UuUVuuUu(var3, var19);
               var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var23, var2.C00OOC00oO(var22), 0.01F, 0.003F), var12 + var11 * 0.5F, var21 + var14 * 0.5F);
               boolean var37 = false /* VF: Semaphore variable */;

               try {
                  var37 = true;
                  nunvNNUnvU.UuUVuuUu(
                     var1,
                     var9,
                     vNvnnVvvVUu.UuUVuuUu,
                     var28,
                     var21 + var9.UuUVuuUu(8.0F),
                     var9.UuUVuuUu(16.0F),
                     10.0F,
                     nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var19, 10.0F, var12 + var11 - var9.UuUVuuUu(12.0F) - var28),
                     var29
                  );
                  nunvNNUnvU.UuUVuuUu(
                     var1,
                     var9,
                     vNvnnVvvVUu.UuUVuuUu,
                     var28,
                     var21 + var9.UuUVuuUu(29.0F),
                     var9.UuUVuuUu(14.0F),
                     8.0F,
                     nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var30, 8.0F, var12 + var11 - var9.UuUVuuUu(12.0F) - var28),
                     NUunUunuNV.UuUVuuUu(var10.UvnvNVnnnnNU(), var10.UNnVVNvvnVvU(), var20 ? 0.55F : var23 * 0.38F)
                  );
                  var37 = false;
               } finally {
                  if (var37) {
                     var1.uVUuuVnNVU();
                  }
               }

               var1.uVUuuVnNVU();
            }
         }
      } finally {
         var1.vuuuNvNuv();
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, ili11Iii1Ii var4, String var5, float var6, float var7, float var8, float var9, float var10
   ) {
      nUvnuVnNUU var11 = var3.uNNnnnuuuN();
      NUunUunuNV var12 = var3.nuUnNvnuUu();
      float var13 = var11.UuUVuuUu(5.0F);
      var1.UuUVuuUu(var6, var7, var8, var9, var13, NUunUunuNV.UuUVuuUu(var12.vNUvnnVnUvu(), var12.uVUuuVnNVU(), 0.5F));
      boolean var14 = false;
      if (!"None".equalsIgnoreCase(var5) && uNNnUu.UuUVuuUu().uNNnnnuuuN(var5)) {
         class_310 var15 = class_310.method_1551();
         int var16 = var15 == null ? Math.max(1, Math.round(var6 + var8)) : Math.max(1, var15.method_22683().method_4489());
         int var17 = var15 == null ? Math.max(1, Math.round(var7 + var9)) : Math.max(1, var15.method_22683().method_4506());
         nuVVnvn var18 = uNNnUu.UuUVuuUu().uUnuvNvvNU(var5);
         VnuVUNUv var19 = VnuVUNUv.UuUVuuUu(var18 == null ? null : var18.C00OOC00oO());
         if (var19 == VnuVUNUv.PREVIEW_ONLY) {
            var19 = var4.vuuuNvNuv;
         }

         if (var18 != null) {
            uNvUNnnVVVnU.UuUVuuUu(var1, var3, var5, var19, var18, var6, var7, var8, var9, var16, var17, var2.unnUnUNVnN(), var2.NnuUnUNnu(), var10);
            var14 = true;
         }
      }

      if (!var14) {
         if ("None".equalsIgnoreCase(var5)) {
            var1.UuUVuuUu(
               var6 + var11.UuUVuuUu(5.0F),
               var7 + var11.UuUVuuUu(5.0F),
               var8 - var11.UuUVuuUu(10.0F),
               var9 - var11.UuUVuuUu(10.0F),
               var11.UuUVuuUu(4.0F),
               var12.nUUVuvU(),
               0.6F
            );
         } else {
            var1.C00OOC00oO(var6, var7, var8, var9, var13, NUunUunuNV.UuUVuuUu(var12.uVunuUNVVUUV(), 72), NUunUunuNV.UuUVuuUu(var12.UNnVVNvvnVvU(), 48));
         }
      }

      var1.UuUVuuUu(var6, var7, var8, var9, var13, NUunUunuNV.UuUVuuUu(var12.uVunuUNVVUUV(), Math.round(70.0F * var10)), 0.55F);
   }

   private String UuUVuuUu(ili11Iii1Ii var1, String var2) {
      if ("None".equalsIgnoreCase(var2)) {
         return var1.vuuuNvNuv.C00OOC00oO() + " slot hidden";
      } else {
         nuVVnvn var3 = uNNnUu.UuUVuuUu().uUnuvNvvNU(var2);
         VnuVUNUv var4 = VnuVUNUv.UuUVuuUu(var3 == null ? null : var3.C00OOC00oO());
         if (var4 == VnuVUNUv.PREVIEW_ONLY) {
            var4 = var1.vuuuNvNuv;
         }

         int var5 = uNNnUu.UuUVuuUu().vNUvnnVnUvu(var2).size();
         uNNnUu.nvnNNunvv var6 = uNNnUu.UuUVuuUu().nuUnNvnuUu(var2);
         uNNnUu.NVnVnNnN var7 = uNNnUu.UuUVuuUu().VVuuUN(var2);
         return var6.name().toLowerCase(Locale.ROOT) + " / " + var4.C00OOC00oO() + " / " + var5 + " uniforms / " + var7.name().toLowerCase(Locale.ROOT);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, VUVnvvnNN var3, float var4, float var5, float var6, nUVuuNUVnV var7) {
      nUvnuVnNUU var8 = var7.uNNnnnuuuN();
      NUunUunuNV var9 = var7.nuUnNvnuUu();
      float var10 = this.UuUVuuUu((nvUuvVvuuN)var3, var8);
      float var11 = var8.UuUVuuUu(14.0F);
      float var12 = var8.UuUVuuUu(3.0F);
      float var13 = var8.UuUVuuUu(3.0F);
      float var14 = var6 * 0.7F;
      float var15 = var4 + var6 - var14;
      this.UuUVuuUu(var1, var8, var3.UuUVuuUu, var4, var5, var10, 12.0F, var15 - var4 - var8.UuUVuuUu(8.0F), nunvNNUnvU.UuUVuuUu(var9));
      float var16 = 0.0F;
      int var17 = 0;
      float var18 = var8.UuUVuuUu(3.0F);

      for (int var19 = 0; var19 < var3.vVvUvVVuuNvV.size(); var19++) {
         vvNnnUNnVvn var20 = var3.vVvUvVVuuNvV.get(var19);
         float var21 = var2.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(var3, var19), var20.uUnuvNvvNU() ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
         float var22 = Math.max(0.0F, Math.min(1.0F, var21));
         boolean var23 = var2.UNNunNuUNVuU() == var20;
         String var24 = nunvNNUnvU.UuUVuuUu(var20);
         float var25 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var24, 8.0F);
         float var26 = Math.max(var8.UuUVuuUu(18.0F), var25 + var8.UuUVuuUu(8.0F));
         if (var16 > 0.0F && var16 + var26 > var14) {
            var17++;
            var16 = 0.0F;
         }

         float var27 = var15 + var16;
         float var28 = var5 + var8.UuUVuuUu(1.0F) + var17 * (var11 + var18);
         boolean var29 = nunvNNUnvU.UuUVuuUu(var2, var27, var28 - var8.UuUVuuUu(1.0F), var26, var11 + var8.UuUVuuUu(2.0F));
         String var30 = vnvnUnVnuunn.C00OOC00oO(var3, var19);
         float var31 = var2.UuUVuuUu(var30, var29 ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
         var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var31, var2.C00OOC00oO(var30), 0.026F, 0.008F), var27 + var26 * 0.5F, var28 + var11 * 0.5F);

         try {
            float var32 = Math.max(0.5F, var8.UuUVuuUu(0.75F));
            float var33 = Math.max(0.0F, var26 - var32 * 2.0F);
            float var34 = Math.max(0.0F, var11 - var32 * 2.0F);
            int var35 = NUunUunuNV.UuUVuuUu(var9.uVUuuVnNVU(), var9.nvUVNnuu(), Math.min(1.0F, 0.2F + var31 * 0.38F + var22 * 0.14F));
            int var36 = NUunUunuNV.UuUVuuUu(
               NUunUunuNV.UuUVuuUu(var9.VVuuUN(), var9.nuUnNvnuUu(), var9.uNnUnnuNUnNu() ? 0.46F : 0.82F), var9.uNnUnnuNUnNu() ? 164 : 208
            );
            int var37 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var9.UNnVVNvvnVvU(), var9.uVunuUNVVUUV(), 0.5F), var9.uNnUnnuNUnNu() ? 58 : 72);
            int var38 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var9.UNnVVNvvnVvU(), var9.uVunuUNVVUUV(), 0.5F), var9.uNnUnnuNUnNu() ? 96 : 112);
            var1.UuUVuuUu(var27, var28, var26, var11, var13, var35);
            var1.UuUVuuUu(var27 + var32, var28 + var32, var33, var34, Math.max(0.0F, var13 - var32), NUunUunuNV.UuUVuuUu(var36, var37, var22 * 0.48F));
            var1.UuUVuuUu(var27, var28, var26, var11, var13, NUunUunuNV.UuUVuuUu(var9.nvUVNnuu(), var38, Math.max(var22 * 0.58F, var31 * 0.72F)), 0.5F);
            int var39 = NUunUunuNV.UuUVuuUu(
               NUunUunuNV.UuUVuuUu(nunvNNUnvU.uUnuvNvvNU(var9), nunvNNUnvU.C00OOC00oO(var9), nunvNNUnvU.C00OOC00oO(var31)), nunvNNUnvU.UuUVuuUu(var9), var22
            );
            String var40 = var23 ? "..." : nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var24, 8.0F, var26 - var8.UuUVuuUu(6.0F));
            float var41 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var40, 8.0F);
            nunvNNUnvU.UuUVuuUu(var1, var8, vNvnnVvvVUu.UuUVuuUu, var27 + (var26 - var41) * 0.5F, var28, var11, 8.0F, var40, var39);
         } finally {
            var1.uVUuuVnNVU();
         }

         var16 += var26 + var12;
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nvUuvVvuuN var3, String var4, String var5, float var6, float var7, float var8, nUVuuNUVnV var9) {
      nUvnuVnNUU var10 = var9.uNNnnnuuuN();
      NUunUunuNV var11 = var9.nuUnNvnuUu();
      float var12 = var10.UuUVuuUu(14.0F);
      String var13 = var5 == null ? "" : var5;
      float var14 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var13, 10.0F);
      float var15 = Math.min(var8 * 0.5F, var14);
      float var16 = Math.max(var10.UuUVuuUu(36.0F), var15 + var10.UuUVuuUu(14.0F));
      float var17 = var10.UuUVuuUu(16.0F);
      float var18 = var6 + var8 - var16;
      float var19 = var7 + (var12 - var17) * 0.5F;
      float var20 = var10.UuUVuuUu(5.0F);
      this.UuUVuuUu(var1, var10, var4, var6, var7, var12, 12.0F, var18 - var6 - var10.UuUVuuUu(8.0F), nunvNNUnvU.UuUVuuUu(var11));
      String var21 = vnvnUnVnuunn.uUnuvNvvNU(var3);
      float var22 = var2.UuUVuuUu(var21, nunvNNUnvU.UuUVuuUu(var2, var18, var19, var16, var17) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      var1.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var22, var2.C00OOC00oO(var21)), var18 + var16 * 0.5F, var19 + var17 * 0.5F);

      try {
         var1.UuUVuuUu(var18, var19, var16, var17, var20, NUunUunuNV.UuUVuuUu(var11.uVUuuVnNVU(), var11.nvUVNnuu(), var22 * 0.72F));
         var1.UuUVuuUu(var18, var19, var16, var17, var20, NUunUunuNV.UuUVuuUu(var11.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var11.uVunuUNVVUUV(), 95), var22), 0.5F);
         String var23 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var13, 10.0F, var16 - var10.UuUVuuUu(8.0F));
         float var24 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var23, 10.0F);
         float var25 = var18 + (var16 - var24) * 0.5F;
         nunvNNUnvU.UuUVuuUu(
            var1,
            var10,
            vNvnnVvvVUu.UuUVuuUu,
            var25,
            var19,
            var17,
            10.0F,
            var23,
            NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var11), nunvNNUnvU.UuUVuuUu(var11), var22 * 0.46F)
         );
      } finally {
         var1.uVUuuVnNVU();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, String var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      if (var3 != null && !var3.isEmpty() && !(var8 <= 1.0F) && !(var6 <= 1.0F)) {
         float var10 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var3, var7);
         if (var10 <= var8) {
            nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var4, var5, var6, var7, var3, var9);
         } else {
            float var11 = var10 - var8;
            float var12 = var11 * this.UuUVuuUu();
            var1.UuUVuuUu(var4, var5, Math.max(1.0F, var8), var6, 0.0F, 0.0F, 0.0F, 0.0F);
            nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var4 - var12, var5, var6, var7, var3, var9);
            var1.nuUnNvnuUu();
         }
      }
   }

   private float UuUVuuUu() {
      float var1 = (float)(System.currentTimeMillis() % 5200L) / 5200.0F;
      if (var1 < 0.22F) {
         return 0.0F;
      } else if (var1 < 0.46F) {
         return this.uUnuvNvvNU((var1 - 0.22F) / 0.24F);
      } else if (var1 < 0.62F) {
         return 1.0F;
      } else {
         return var1 < 0.86F ? 1.0F - this.uUnuvNvvNU((var1 - 0.62F) / 0.24F) : 0.0F;
      }
   }

   private float uUnuvNvvNU(float var1) {
      float var2 = Math.max(0.0F, Math.min(1.0F, var1));
      return var2 * var2 * var2 * (var2 * (var2 * 6.0F - 15.0F) + 10.0F);
   }
}
