package ru.metaculture.protection;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

final class UUnVvnuUnnVV {
   private static final float UuUVuuUu = 12.0F;
   private static final float C00OOC00oO = 10.0F;
   private static final float uUnuvNvvNU = 4.0F;
   private static final float vVvUvVVuuNvV = 12.0F;
   private static final float uNNnnnuuuN = 10.0F;
   private static final float nuUnNvnuUu = 3.0F;
   private static final float VVuuUN = 8.0F;
   private static final float vNUvnnVnUvu = 13.0F;
   private static final float uVUuuVnNVU = 4.0F;
   private static final float vuuuNvNuv = 5.0F;
   private static final Map<String, Float> nvUVNnuu = new HashMap<>();
   private static final Map<String, Float> UuuNnUvUuv = new HashMap<>();
   private static final Map<String, Float> nUUVuvU = new HashMap<>();

   private UUnVvnuUnnVV() {
   }

   static float UuUVuuUu(UnVNvNnU var0, nvUuvVvuuN var1, float var2) {
      if (var1 instanceof VnnUVUVvV) {
         return ((VnnUVUVvV)var1).uUnuvNvvNU();
      } else if (var1 instanceof vvNnnUNnVvn) {
         return 13.0F;
      } else if (var1 instanceof vNnVvvNU) {
         return 14.0F;
      } else if (var1 instanceof nNUuNvVn) {
         return 22.0F;
      } else if (var1 instanceof UvNnUnuNUUU var5) {
         float var6 = UuUVuuUu(var0, var5.vVvUvVVuuNvV.toArray(new String[0]), var2);
         return 10.0F + var6 * 15.0F;
      } else if (var1 instanceof uVNuNUVvn) {
         return 12.0F;
      } else if (var1 instanceof NVuVVUNUvV) {
         return 14.0F;
      } else if (var1 instanceof VnnUvVNuNuVv) {
         return 14.0F;
      } else if (var1 instanceof VUVnvvnNN var3) {
         float var4 = UuUVuuUu(var0, var3.vVvUvVVuuNvV.stream().map(var0x -> var0x.UuUVuuUu).toArray(String[]::new), var2);
         return 10.0F + var4 * 15.0F;
      } else {
         return 12.0F;
      }
   }

   static float UuUVuuUu(UnVNvNnU var0, Iterable<nvUuvVvuuN> var1, float var2) {
      float var3 = 0.0F;

      for (nvUuvVvuuN var5 : var1) {
         if (var5 != null && !var5.C00OOC00oO.get()) {
            var3 += UuUVuuUu(var0, var5, var2) + 4.0F;
         }
      }

      return Math.max(0.0F, var3 - 4.0F);
   }

   static float UuUVuuUu(
      UnVNvNnU var0, nvUuvVvuuN var1, float var2, float var3, float var4, int var5, int var6, float var7, int var8, int var9, int var10, int var11, int var12
   ) {
      if (var7 <= 0.01F) {
         return 0.0F;
      } else if (var1 instanceof VnnUVUVvV) {
         return ((VnnUVUVvV)var1).uUnuvNvvNU();
      } else if (var1 instanceof vvNnnUNnVvn var33) {
         float var40 = var2 + var4 - 8.0F;
         float var47 = var3 + 2.0F;
         var0.UuUVuuUu(var40, var47, 8.0F, 8.0F, 2.5F, var8, 0.4F);
         var0.UuUVuuUu(var40, var47, 8.0F, 8.0F, 2.5F, var12);
         if (var33.uUnuvNvvNU()) {
            var0.UuUVuuUu(var40 + 2.0F, var47 + 2.0F, 4.0F, 4.0F, 2.0F, var9);
         }

         UuUVuuUu(
            var0,
            var1.UuUVuuUu,
            var2,
            var3 + 2.0F + 6.5F,
            12.0F,
            var11,
            var2,
            var3 + 1.0F,
            Math.max(12.0F, var40 - var2 - 4.0F),
            11.0F,
            UuvVnuU.UuUVuuUu(var5, var6, var2, var3, var4, 13.0F)
         );
         return 13.0F;
      } else if (var1 instanceof nNUuNvVn var32) {
         float var39 = var3 + 12.0F;
         float var46 = var2 + 4.0F;
         float var55 = var4 - 8.0F;
         float var61 = var32.uNNnnnuuuN;
         float var64 = var32.nuUnNvnuUu;
         float var67 = UuvVnuU.vuuuNvNuv(var32.vVvUvVVuuNvV, var61, var64);
         float var71 = var64 - var61 > 1.0E-5F ? (var67 - var61) / (var64 - var61) : 0.0F;
         uVVuNvUUV var74 = UUVNUUUnNUv.UuUVuuUu(var32);
         var74.UuUVuuUu();
         var74.UuUVuuUu(var71, 0.18F, VnuVvnV.UnUNVVVNuv, true);
         float var76 = var74.uNNnnnuuuN();
         float var77 = var55 * var76;
         String var24 = UuUVuuUu(var67, var32.vuuuNvNuv);
         float var25 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var24, 10.0F).UuUVuuUu;
         UuUVuuUu(
            var0,
            var1.UuUVuuUu,
            var2,
            var3 + 2.0F + 6.5F,
            12.0F,
            var11,
            var2,
            var3 + 1.0F,
            Math.max(12.0F, var4 - var25 - 10.0F),
            11.0F,
            UuvVnuU.UuUVuuUu(var5, var6, var2, var3, var4, 22.0F)
         );
         var0.UuUVuuUu(var46, var39, var55, 4.0F, 2.0F, var12);
         if (var77 > 0.5F) {
            var0.UuUVuuUu(var46, var39, var77, 4.0F, 2.0F, var9);
         }

         float var26 = var46 + var77 - 2.5F;
         var0.UuUVuuUu(var26, var39 - 0.5F, 5.0F, 5.0F, 2.0F, var11);
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2 + var4 - var25, var3 + 2.0F + 6.5F, 10.0F, var24, var10);
         return 22.0F;
      } else if (var1 instanceof vNnVvvNU var31) {
         String var38 = var31.uNNnnnuuuN();
         float var45 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var38, 10.0F).UuUVuuUu;
         float var54 = Math.max(32.0F, var45 + 12.0F);
         float var60 = var2 + var4 - var54;
         UuUVuuUu(
            var0,
            var1.UuUVuuUu,
            var2,
            var3 + 2.0F + 6.5F,
            12.0F,
            var11,
            var2,
            var3 + 1.0F,
            Math.max(12.0F, var60 - var2 - 4.0F),
            11.0F,
            UuvVnuU.UuUVuuUu(var5, var6, var2, var3, var4, 14.0F)
         );
         var0.UuUVuuUu(var60, var3 + 1.0F, var54, 11.0F, 3.0F, var8, 0.4F);
         var0.UuUVuuUu(var60, var3 + 1.0F, var54, 11.0F, 3.0F, var12);
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var60 + var54 * 0.5F - var45 * 0.5F, var3 + 2.0F + 6.5F, 10.0F, var38, var10);
         return 14.0F;
      } else if (var1 instanceof UvNnUnuNUUU var30) {
         UuUVuuUu(
            var0, var1.UuUVuuUu, var2, var3 + 2.0F + 6.5F, 12.0F, var11, var2, var3 + 1.0F, var4, 11.0F, UuvVnuU.UuUVuuUu(var5, var6, var2, var3, var4, 14.0F)
         );
         float var37 = var2;
         float var44 = var3 + 12.0F;

         for (String var59 : var30.vVvUvVVuuNvV) {
            float var63 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var59, 10.0F).UuUVuuUu + 20.0F;
            if (var37 + var63 > var2 + var4 && var37 > var2) {
               var37 = var2;
               var44 += 15.0F;
            }

            boolean var66 = var59.equals(var30.uNNnnnuuuN);
            String var70 = var1.UuUVuuUu + ":" + var59;
            nvUVNnuu.putIfAbsent(var70, var66 ? 1.0F : 0.0F);
            float var72 = nvUVNnuu.get(var70);
            var72 = VuUVnvUuVN.UuUVuuUu(var72, var66 ? 1.0F : 0.0F, 10.0F);
            nvUVNnuu.put(var70, var72);
            int var75 = VnVnuUn.uNNnnnuuuN(var12, var9, var72 * 0.45F);
            int var23 = VnVnuUn.uNNnnnuuuN(var10, var11, var72);
            var0.UuUVuuUu(var37, var44, var63, 12.0F, 3.0F, var8, 0.4F);
            var0.UuUVuuUu(var37, var44, var63, 12.0F, 3.0F, var75);
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var37 + 10.0F, var44 + 2.0F + 5.5F, 10.0F, var59, var23);
            var37 += var63 + 3.0F;
         }

         float var53 = UuUVuuUu(var0, var30.vVvUvVVuuNvV.toArray(new String[0]), var4);
         return 10.0F + var53 * 15.0F;
      } else if (var1 instanceof uVNuNUVvn var29) {
         String var36 = var29.VVuuUN ? "..." : UNuNUNVv.C00OOC00oO(var29.vVvUvVVuuNvV);
         float var43 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var36, 10.0F).UuUVuuUu;
         float var51 = Math.max(22.0F, var43 + 8.0F);
         float var58 = var2 + var4 - var51;
         UuUVuuUu(
            var0,
            var1.UuUVuuUu,
            var2,
            var3 + 2.0F + 6.5F,
            12.0F,
            var11,
            var2,
            var3 + 1.0F,
            Math.max(12.0F, var58 - var2 - 4.0F),
            11.0F,
            UuvVnuU.UuUVuuUu(var5, var6, var2, var3, var4, 12.0F)
         );
         var0.UuUVuuUu(var58, var3 + 1.0F, var51, 11.0F, 3.0F, var8, 0.4F);
         var0.UuUVuuUu(var58, var3 + 1.0F, var51, 11.0F, 3.0F, var12);
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var58 + var51 * 0.5F - var43 * 0.5F, var3 + 2.0F + 6.5F, 10.0F, var36, var29.VVuuUN ? var9 : var10);
         return 12.0F;
      } else if (var1 instanceof NVuVVUNUvV var28) {
         float var35 = var4 * 0.35F;
         float var42 = var2 + var4 - var35;
         float var50 = var3 + 1.0F;
         UuUVuuUu(
            var0,
            var1.UuUVuuUu,
            var2,
            var3 + 2.0F + 6.5F,
            12.0F,
            var11,
            var2,
            var3 + 1.0F,
            Math.max(12.0F, var42 - var2 - 4.0F),
            11.0F,
            UuvVnuU.UuUVuuUu(var5, var6, var2, var3, var4, 14.0F)
         );
         var0.UuUVuuUu(var42, var50, var35, 11.0F, 3.0F, var8, 0.4F);
         var0.UuUVuuUu(var42, var50, var35, 11.0F, 3.0F, var12);
         String var57 = var28.uNNnnnuuuN == null ? "" : var28.uNNnnnuuuN;
         if (!var57.isEmpty()) {
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var42 + 4.0F, var50 + 2.0F + 5.5F, 10.0F, var57, var11);
         }

         return 14.0F;
      } else if (var1 instanceof VnnUvVNuNuVv var27) {
         float var34 = 36.0F;
         float var41 = 11.0F;
         float var49 = var2 + var4 - var34;
         float var56 = var3 + 1.5F;
         int var62 = var27.vNUvnnVnUvu();
         UuUVuuUu(
            var0,
            var1.UuUVuuUu,
            var2,
            var3 + 2.0F + 6.5F,
            12.0F,
            var11,
            var2,
            var3 + 1.0F,
            Math.max(12.0F, var49 - var2 - 6.0F),
            11.0F,
            UuvVnuU.UuUVuuUu(var5, var6, var2, var3, var4, 14.0F)
         );
         var0.UuUVuuUu(var49, var56, var34, var41, 3.0F, var8, 0.4F);
         var0.UuUVuuUu(var49, var56, var34, var41, 3.0F, var12);
         var0.UuUVuuUu(var49 + 2.0F, var56 + 2.0F, var34 - 4.0F, var41 - 4.0F, 2.0F, UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var62, (int)(255.0F * var7)));
         String var65 = String.format("#%02X%02X%02X", VnVnuUn.C00OOC00oO(var62), VnVnuUn.uUnuvNvvNU(var62), VnVnuUn.vVvUvVVuuNvV(var62));
         float var69 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var65, 10.0F).UuUVuuUu;
         var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var49 - var69 - 4.0F, var3 + 2.0F + 6.5F, 10.0F, var65, var10);
         return 14.0F;
      } else if (var1 instanceof VUVnvvnNN var13) {
         UuUVuuUu(
            var0, var1.UuUVuuUu, var2, var3 + 2.0F + 6.5F, 12.0F, var11, var2, var3 + 1.0F, var4, 11.0F, UuvVnuU.UuUVuuUu(var5, var6, var2, var3, var4, 14.0F)
         );
         float var14 = var2;
         float var15 = var3 + 12.0F;

         for (vvNnnUNnVvn var17 : var13.vVvUvVVuuNvV) {
            float var18 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var17.UuUVuuUu, 10.0F).UuUVuuUu + 20.0F;
            if (var14 + var18 > var2 + var4 && var14 > var2) {
               var14 = var2;
               var15 += 15.0F;
            }

            String var19 = var1.UuUVuuUu + ":" + var17.UuUVuuUu;
            UuuNnUvUuv.putIfAbsent(var19, var17.uUnuvNvvNU() ? 1.0F : 0.0F);
            float var20 = UuuNnUvUuv.get(var19);
            var20 = VuUVnvUuVN.UuUVuuUu(var20, var17.uUnuvNvvNU() ? 1.0F : 0.0F, 10.0F);
            UuuNnUvUuv.put(var19, var20);
            int var21 = VnVnuUn.uNNnnnuuuN(var12, var9, var20 * 0.45F);
            int var22 = VnVnuUn.uNNnnnuuuN(var10, var11, var20);
            var0.UuUVuuUu(var14, var15, var18, 12.0F, 3.0F, var8, 0.4F);
            var0.UuUVuuUu(var14, var15, var18, 12.0F, 3.0F, var21);
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var14 + 10.0F, var15 + 2.0F + 5.5F, 10.0F, var17.UuUVuuUu, var22);
            var14 += var18 + 3.0F;
         }

         float var48 = UuUVuuUu(var0, var13.vVvUvVVuuNvV.stream().map(var0x -> var0x.UuUVuuUu).toArray(String[]::new), var4);
         return 10.0F + var48 * 15.0F;
      } else {
         return 12.0F;
      }
   }

   static boolean UuUVuuUu(UnVNvNnU var0, nvUuvVvuuN var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      if (var1 instanceof vvNnnUNnVvn) {
         float var8 = var2 + var4 - 8.0F;
         float var9 = var3 + 2.0F;
         if (var7 == 0 && UuvVnuU.UuUVuuUu(var5, var6, var8, var9, 8.0F, 8.0F)) {
            vvNnnUNnVvn var34 = (vvNnnUNnVvn)var1;
            var34.C00OOC00oO(!var34.uUnuvNvvNU());
            C00OOC00oO();
            return true;
         }
      }

      if (var1 instanceof nNUuNvVn) {
         float var14 = var3 + 12.0F;
         float var21 = var2 + 4.0F;
         float var10 = var4 - 8.0F;
         if (var7 == 0 && UuvVnuU.UuUVuuUu(var5, var6, var21, var14, var10, 6.0F)) {
            nNUuNvVn var40 = (nNUuNvVn)var1;
            UUVNUUUnNUv.nNvNUVU = var40;
            UUVNUUUnNUv.uUVuVvuNUvnu = var21;
            UUVNUUUnNUv.UvUvUNuvNU = var14;
            UUVNUUUnNUv.c0oOOCcCoC0 = var10;
            UuUVuuUu(var40, var5);
            C00OOC00oO();
            return true;
         }
      }

      if (var1 instanceof vNnVvvNU var15) {
         String var22 = var15.uNNnnnuuuN();
         float var28 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var22, 10.0F).UuUVuuUu;
         float var11 = Math.max(32.0F, var28 + 12.0F);
         float var12 = var2 + var4 - var11;
         if (var7 == 0 && UuvVnuU.UuUVuuUu(var5, var6, var12, var3 + 1.0F, var11, 11.0F)) {
            var15.vVvUvVVuuNvV();
            return true;
         }
      }

      if (var1 instanceof UvNnUnuNUUU var16) {
         float var23 = var2;
         float var29 = var3 + 12.0F;

         for (String var41 : var16.vVvUvVVuuNvV) {
            float var13 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var41, 10.0F).UuUVuuUu + 20.0F;
            if (var23 + var13 > var2 + var4 && var23 > var2) {
               var23 = var2;
               var29 += 15.0F;
            }

            if (var7 == 0 && UuvVnuU.UuUVuuUu(var5, var6, var23, var29, var13, 12.0F)) {
               var16.uNNnnnuuuN = var41;
               var16.vNUvnnVnUvu = var16.vVvUvVVuuNvV.indexOf(var41);
               C00OOC00oO();
               return true;
            }

            var23 += var13 + 3.0F;
         }
      }

      if (var1 instanceof uVNuNUVvn var17) {
         String var24 = var17.VVuuUN ? "..." : UNuNUNVv.C00OOC00oO(var17.vVvUvVVuuNvV);
         float var30 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var24, 10.0F).UuUVuuUu;
         float var36 = Math.max(22.0F, var30 + 8.0F);
         float var42 = var2 + var4 - var36;
         if (UuvVnuU.UuUVuuUu(var5, var6, var42, var3 + 1.0F, var36, 11.0F) && var7 == 0) {
            if (UUVNUUUnNUv.uNnUnnuNUnNu != var17) {
               if (UUVNUUUnNUv.uNnUnnuNUnNu != null) {
                  UUVNUUUnNUv.uNnUnnuNUnNu.VVuuUN = false;
               }

               UUVNUUUnNUv.uNnUnnuNUnNu = var17;
               var17.VVuuUN = true;
            }

            return true;
         }
      }

      if (var1 instanceof NVuVVUNUvV) {
         float var18 = var4 * 0.55F;
         float var25 = var2 + var4 - var18;
         float var31 = var3 + 1.0F;
         if (var7 == 0 && UuvVnuU.UuUVuuUu(var5, var6, var25, var31, var18, 11.0F)) {
            NVuVVUNUvV var39 = (NVuVVUNUvV)var1;
            if (UUVNUUUnNUv.NnUuNNU != var39) {
               if (UUVNUUUnNUv.NnUuNNU != null) {
                  UUVNUUUnNUv.NnUuNNU.vNUvnnVnUvu = false;
               }

               UUVNUUUnNUv.NnUuNNU = var39;
               var39.vNUvnnVnUvu = true;
            }

            return true;
         }
      }

      if (var1 instanceof VnnUvVNuNuVv var19) {
         float var26 = 36.0F;
         float var32 = 11.0F;
         float var37 = var2 + var4 - var26;
         float var43 = var3 + 1.5F;
         if (var7 == 0 && UuvVnuU.UuUVuuUu(var5, var6, var37, var43, var26, var32)) {
            UuUVuuUu(var19, var37, var43);
            return true;
         }
      }

      if (var1 instanceof VUVnvvnNN var20) {
         float var27 = var2;
         float var33 = var3 + 12.0F;

         for (vvNnnUNnVvn var44 : var20.vVvUvVVuuNvV) {
            float var45 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var44.UuUVuuUu, 10.0F).UuUVuuUu + 20.0F;
            if (var27 + var45 > var2 + var4 && var27 > var2) {
               var27 = var2;
               var33 += 15.0F;
            }

            if (var7 == 0 && UuvVnuU.UuUVuuUu(var5, var6, var27, var33, var45, 12.0F)) {
               var44.C00OOC00oO(!var44.uUnuvNvvNU());
               C00OOC00oO();
               return true;
            }

            var27 += var45 + 3.0F;
         }
      }

      return false;
   }

   static float UuUVuuUu() {
      return 4.0F;
   }

   private static float UuUVuuUu(UnVNvNnU var0, String[] var1, float var2) {
      float var3 = 1.0F;
      float var4 = 0.0F;

      for (String var8 : var1) {
         float var9 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var8, 10.0F).UuUVuuUu + 20.0F;
         if (var4 + var9 > var2 && var4 > 0.0F) {
            var3++;
            var4 = 0.0F;
         }

         var4 += var9 + 3.0F;
      }

      return var3;
   }

   private static void UuUVuuUu(nNUuNvVn var0, float var1) {
      float var2 = var0.uNNnnnuuuN;
      float var3 = var0.nuUnNvnuUu;
      float var4 = (var1 - UUVNUUUnNUv.uUVuVvuNUvnu) / UUVNUUUnNUv.c0oOOCcCoC0;
      var4 = UuvVnuU.vuuuNvNuv(var4, 0.0F, 1.0F);
      float var5 = var2 + (var3 - var2) * var4;
      float var6 = var0.VVuuUN;
      if (var6 > 1.0E-5F) {
         var5 = Math.round(var5 / var6) * var6;
      }

      var0.vVvUvVVuuNvV = UuvVnuU.vuuuNvNuv(var5, var2, var3);
   }

   private static void UuUVuuUu(VnnUvVNuNuVv var0, float var1, float var2) {
      if (UUVNUUUnNUv.vNVuvnUUnuUn == var0) {
         UUVNUUUnNUv.nuUnNvnuUu.C00OOC00oO(uununU.BACKWARDS);
         UUVNUUUnNUv.vNVuvnUUnuUn = null;
         UUVNUUUnNUv.UvnvNVnnnnNU = 0.0F;
         UUVNUUUnNUv.uVUVnuvnuVuv = 0.0F;
      } else {
         UUVNUUUnNUv.vNVuvnUUnuUn = var0;
         UUVNUUUnNUv.nuUnNvnuUu.C00OOC00oO(uununU.FORWARDS);
         float var3 = 160.0F;
         float var4 = 119.0F;
         float var5 = O000c0oocoo.a_.method_22683().method_4486();
         float var6 = O000c0oocoo.a_.method_22683().method_4502();
         float var7 = var1 + 40.0F;
         float var8 = var2 - 4.0F;
         if (var7 + var3 > var5 - 6.0F) {
            var7 = var1 - var3 - 6.0F;
         }

         var7 = UuvVnuU.vuuuNvNuv(var7, 6.0F, var5 - var3 - 6.0F);
         var8 = UuvVnuU.vuuuNvNuv(var8, 6.0F, var6 - var4 - 6.0F);
         UUVNUUUnNUv.UvnvNVnnnnNU = var7;
         UUVNUUUnNUv.uVUVnuvnuVuv = var8;
      }
   }

   private static String UuUVuuUu(float var0, boolean var1) {
      if (var1) {
         return String.format("%.1f%%", var0);
      } else if (Math.abs(var0 - Math.round(var0)) < 0.001F) {
         return String.format("%.0f", var0);
      } else {
         DecimalFormat var2 = new DecimalFormat("#.#");
         return var2.format(var0);
      }
   }

   private static void C00OOC00oO() {
      if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }

   private static void UuUVuuUu(
      UnVNvNnU var0, String var1, float var2, float var3, float var4, int var5, float var6, float var7, float var8, float var9, boolean var10
   ) {
      if (var1 != null && !var1.isEmpty() && !(var8 <= 3.0F) && !(var9 <= 2.0F)) {
         float var11 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var1, var4).UuUVuuUu;
         if (var11 <= var8 - 1.0F) {
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, var3, var4, var1, var5);
         } else {
            String var12 = var1 + "|" + var4;
            nUUVuvU.putIfAbsent(var12, 0.0F);
            float var13 = var10 ? 1.0F : 0.0F;
            float var14 = VuUVnvUuVN.UuUVuuUu(nUUVuvU.get(var12), var13, 12.0F);
            nUUVuvU.put(var12, var14);
            float var15 = var11 - var8;
            float var16 = (float)((Math.sin(System.currentTimeMillis() * 0.0035) + 1.0) * 0.5);
            float var17 = var15 * var16 * var14;
            var0.UuUVuuUu(var6, var7, var8, var9, 0.0F, 0.0F, 0.0F, 0.0F);
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2 - var17, var3, var4, var1, var5);
            var0.nuUnNvnuUu();
         }
      }
   }
}
