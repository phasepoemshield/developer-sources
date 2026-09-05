package ru.metaculture.protection;

import net.minecraft.class_1294;
import net.minecraft.class_1702;
import net.minecraft.class_310;
import net.minecraft.class_5134;
import net.minecraft.class_746;

public final class VNNvvvUUVU {
   private static final VNNvvvUUVU UuUVuuUu = new VNNvvvUUVU();
   private final VVnnnnN C00OOC00oO = new VVnnnnN();
   private final VVnnnnN uUnuvNvvNU = new VVnnnnN();
   private final VVnnnnN vVvUvVVuuNvV = new VVnnnnN();
   private final VVnnnnN uNNnnnuuuN = new VVnnnnN();
   private final VVnnnnN nuUnNvnuUu = new VVnnnnN();
   private final VVnnnnN VVuuUN = new VVnnnnN();
   private final VVnnnnN vNUvnnVnUvu = new VVnnnnN();
   private float uVUuuVnNVU = -1.0F;
   private long vuuuNvNuv;
   private boolean nvUVNnuu;

   public static VNNvvvUUVU UuUVuuUu() {
      return UuUVuuUu;
   }

   public void UuUVuuUu(UnVNvNnU var1, nnvNuuNvvuu var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      class_310 var9 = class_310.method_1551();
      if (var9 != null && var9.field_1724 != null && var9.field_1687 != null) {
         class_746 var10 = var9.field_1724;
         boolean var11 = UVNVVUnUnUU.C00OOC00oO().UuUVuuUu.C00OOC00oO("Здоровье");
         boolean var12 = UVNVVUnUnUU.C00OOC00oO().UuUVuuUu.C00OOC00oO("Голод");
         boolean var13 = UVNVVUnUnUU.C00OOC00oO().UuUVuuUu.C00OOC00oO("Броня");
         boolean var14 = UVNVVUnUnUU.C00OOC00oO().UuUVuuUu.C00OOC00oO("Воздух");
         boolean var15 = UVNVVUnUnUU.C00OOC00oO().UuUVuuUu.C00OOC00oO("Поглощение");
         if (var11 || var12 || var13 || var14) {
            float var16;
            try {
               var16 = (float)var10.method_45325(class_5134.field_23716);
            } catch (Throwable var53) {
               var16 = 20.0F;
            }

            if (var16 <= 0.0F || Float.isNaN(var16) || Float.isInfinite(var16)) {
               var16 = 20.0F;
            }

            float var17 = 0.0F;
            float var18 = 0.0F;

            try {
               var17 = var10.method_6032();
               var18 = var10.method_6067();
            } catch (Throwable var52) {
            }

            float var19 = Math.max(0.0F, Math.min(var16, var17));
            float var20 = Math.max(0.0F, var18);
            float var21 = 20.0F;
            class_1702 var22 = var10.method_7344();
            float var23 = var22 == null ? 20.0F : Math.max(0.0F, Math.min(var21, (float)var22.method_7586()));
            int var24 = 0;

            try {
               var24 = var10.method_6096();
            } catch (Throwable var51) {
            }

            float var25 = 20.0F;
            int var26 = 0;
            int var27 = 300;

            try {
               var26 = var10.method_5669();
               int var28 = var10.method_5748();
               if (var28 > 0) {
                  var27 = var28;
               }
            } catch (Throwable var50) {
            }

            boolean var54 = var26 >= var27;
            float var29 = Math.min(var6, var7);
            if (!this.nvUVNnuu) {
               this.C00OOC00oO.nuUnNvnuUu(var19);
               this.uUnuvNvvNU.nuUnNvnuUu(var23);
               this.vVvUvVVuuNvV.nuUnNvnuUu(var24);
               this.uNNnnnuuuN.nuUnNvnuUu(var20);
               this.nuUnNvnuUu.nuUnNvnuUu(var26);
               this.vNUvnnVnUvu.nuUnNvnuUu(var24 > 0 ? 1.0 : 0.0);
               this.VVuuUN.nuUnNvnuUu(var54 ? 0.0 : 1.0);
               this.uVUuuVnNVU = var19;
               this.nvUVNnuu = true;
            }

            if (this.uVUuuVnNVU >= 0.0F && var19 < this.uVUuuVnNVU - 0.05F) {
               this.vuuuNvNuv = System.currentTimeMillis();
            }

            this.uVUuuVnNVU = var19;
            this.C00OOC00oO.UuUVuuUu();
            this.C00OOC00oO.UuUVuuUu(var19, 0.22, VvVUUNUu.nvUVNnuu, true);
            this.uUnuvNvvNU.UuUVuuUu();
            this.uUnuvNvvNU.UuUVuuUu(var23, 0.22, VvVUUNUu.nvUVNnuu, true);
            this.vVvUvVVuuNvV.UuUVuuUu();
            this.vVvUvVVuuNvV.UuUVuuUu(var24, 0.22, VvVUUNUu.nvUVNnuu, true);
            this.uNNnnnuuuN.UuUVuuUu();
            this.uNNnnnuuuN.UuUVuuUu(var20, 0.22, VvVUUNUu.nvUVNnuu, true);
            this.nuUnNvnuUu.UuUVuuUu();
            this.nuUnNvnuUu.UuUVuuUu(var26, 0.18, VvVUUNUu.nvUVNnuu, true);
            this.vNUvnnVnUvu.UuUVuuUu();
            this.vNUvnnVnUvu.UuUVuuUu(var24 > 0 ? 1.0 : 0.0, 0.3, VvVUUNUu.UnUNVVVNuv, true);
            this.VVuuUN.UuUVuuUu();
            this.VVuuUN.UuUVuuUu(var54 ? 0.0 : 1.0, 0.3, VvVUUNUu.UnUNVVVNuv, true);
            float var30 = 6.0F * var29;
            float var31 = (var5 - var30) * 0.5F;
            float var32 = 12.0F * var29;
            float var33 = 4.0F * var29;
            float var34 = var4 - var33 - var32;
            boolean var35 = var13 && this.vNUvnnVnUvu.uNNnnnuuuN() > 0.01F || var14 && this.VVuuUN.uNNnnnuuuN() > 0.01F;
            float var36 = var34 - var33 - var32;
            long var37 = System.currentTimeMillis();
            float var39 = 0.0F;
            if (var11 && var19 / Math.max(1.0F, var16) < 0.2F && var19 > 0.0F && Menu.UuUVuuUu(Menu.UUuUnNVNuuv)) {
               var39 = (float)Math.sin(var37 / 90.0) * 1.2F * var29;
            }

            boolean var40 = var10.method_6059(class_1294.field_5924);
            float var41 = 0.0F;
            if (var11 && var40 && Menu.UuUVuuUu(Menu.uUVvnUuNvvN)) {
               var41 = 0.5F + 0.5F * (float)Math.sin(var37 / 230.0);
            }

            float var42 = 0.0F;
            if (var11 && Menu.UuUVuuUu(Menu.UuNnnVnuNNV)) {
               long var43 = var37 - this.vuuuNvNuv;
               if (this.vuuuNvNuv > 0L && var43 < 180L) {
                  var42 = 1.0F - (float)var43 / 180.0F;
               }
            }

            float var55 = 0.0F;
            if (var12 && var23 / var21 < 0.3F && var23 > 0.0F && Menu.UuUVuuUu(Menu.vvUVNVvvNUv)) {
               var55 = 0.4F + 0.6F * (float)Math.sin(var37 / 200.0);
            }

            if (var11) {
               float var44 = this.C00OOC00oO.uNNnnnuuuN() / Math.max(1.0F, var16);
               float var45 = this.uNNnnnuuuN.uNNnnnuuuN() / Math.max(1.0F, var16);
               int var46 = VnVnuUn.uUnuvNvvNU(255, 90, 96, (int)(255.0F * var8));
               int var47 = VnVnuUn.uUnuvNvvNU(220, 36, 50, (int)(255.0F * var8));
               if (var41 > 0.0F) {
                  int var48 = VnVnuUn.uUnuvNvvNU(255, 220, 110, (int)(255.0F * var8));
                  var46 = UuUVuuUu(var46, var48, var41 * 0.55F);
                  var47 = UuUVuuUu(var47, var48, var41 * 0.55F);
               }

               this.UuUVuuUu(var1, var2, var3 + var39, var34, var31, var32, var44, 10, var46, var47, var8, var29);
               if (var42 > 0.0F) {
                  int var69 = VnVnuUn.uUnuvNvvNU(255, 250, 250, (int)(220.0F * var42 * var8));
                  var1.UuUVuuUu(var3 + var39, var34, var31, var32, var32 * 0.45F, var69);
               }

               if (var15 && var45 > 0.001F) {
                  int var70 = VnVnuUn.uUnuvNvvNU(255, 220, 110, (int)(220.0F * var8));
                  int var49 = VnVnuUn.uUnuvNvvNU(255, 180, 60, (int)(220.0F * var8));
                  this.uUnuvNvvNU(var1, var2, var3 + var39, var34, var31, var32, var45, 10, var70, var49, 0.92F, var29);
               }
            }

            if (var12) {
               float var56 = this.uUnuvNvvNU.uNNnnnuuuN() / var21;
               int var59 = VnVnuUn.uUnuvNvvNU(220, 158, 92, (int)(255.0F * var8));
               int var62 = VnVnuUn.uUnuvNvvNU(150, 92, 44, (int)(255.0F * var8));
               if (var55 > 0.0F) {
                  int var65 = VnVnuUn.uUnuvNvvNU(255, 120, 60, (int)(255.0F * var8));
                  var59 = UuUVuuUu(var59, var65, var55 * 0.6F);
                  var62 = UuUVuuUu(var62, var65, var55 * 0.6F);
               }

               float var66 = var3 + var31 + var30;
               this.UuUVuuUu(var1, var2, var66, var34, var31, var32, var56, 10, var59, var62, var8, var29);
            }

            if (var35) {
               if (var13 && this.vNUvnnVnUvu.uNNnnnuuuN() > 0.01F) {
                  float var57 = this.vNUvnnVnUvu.uNNnnnuuuN();
                  float var60 = this.vVvUvVVuuNvV.uNNnnnuuuN() / var25;
                  int var63 = VnVnuUn.uUnuvNvvNU(180, 200, 230, (int)(255.0F * var8 * var57));
                  int var67 = VnVnuUn.uUnuvNvvNU(110, 130, 170, (int)(255.0F * var8 * var57));
                  this.UuUVuuUu(var1, var2, var3, var36 + (1.0F - var57) * var32 * 0.5F, var31, var32, var60, 10, var63, var67, var8 * var57, var29);
               }

               if (var14 && this.VVuuUN.uNNnnnuuuN() > 0.01F) {
                  float var58 = this.VVuuUN.uNNnnnuuuN();
                  float var61 = this.nuUnNvnuUu.uNNnnnuuuN() / Math.max(1.0F, (float)var27);
                  int var64 = VnVnuUn.uUnuvNvvNU(120, 200, 255, (int)(255.0F * var8 * var58));
                  int var68 = VnVnuUn.uUnuvNvvNU(60, 130, 220, (int)(255.0F * var8 * var58));
                  float var71 = var3 + var31 + var30;
                  this.UuUVuuUu(var1, var2, var71, var36 + (1.0F - var58) * var32 * 0.5F, var31, var32, var61, 10, var64, var68, var8 * var58, var29);
               }
            }
         }
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, nnvNuuNvvuu var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, int var10, float var11, float var12
   ) {
      var7 = Math.max(0.0F, Math.min(1.0F, var7));
      float var13 = var6 * 0.45F;
      if (var2.nvUVNnuu()) {
         this.C00OOC00oO(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      } else {
         if (var2.UuuNnUvUuv() || var2.nUUVuvU()) {
            var2.C00OOC00oO(var1, var3, var4, var5, var6, var13, var11);
         } else if (var2.vVvUvVVuuNvV()) {
            var1.UuUVuuUu(var3, var4, var5, var6, var13, (var2.UnUNVVVNuv() ? 6.0F : 4.0F) * var12, 1.0F, var2.nvUVNnuu(var11));
            int var14 = var2.UuUVuuUu(var11);
            var1.UuUVuuUu(var3, var4, var5, var6, var13, var14);
            if (var2.uNNnnnuuuN()) {
               var1.UuUVuuUu(var3, var4, var5, var6, var13, var2.vVvUvVVuuNvV(var11), var2.uUnuvNvvNU());
            }
         } else {
            int var26 = var2.UuUVuuUu(var11);
            var1.UuUVuuUu(var3, var4, var5, var6, var13, var26);
            if (var2.uNNnnnuuuN()) {
               var1.UuUVuuUu(var3, var4, var5, var6, var13, var2.vVvUvVVuuNvV(var11), var2.uUnuvNvvNU());
            }
         }

         float var27 = 1.5F * var12;
         float var15 = (var5 - var27 * (var8 - 1)) / var8;
         float var16 = var6 - 4.0F * var12;
         float var17 = var4 + (var6 - var16) * 0.5F;
         float var18 = var16 * 0.4F;
         float var19 = var7 * var8;

         for (int var20 = 0; var20 < var8; var20++) {
            float var21 = var3 + var20 * (var15 + var27);
            float var22 = Math.max(0.0F, Math.min(1.0F, var19 - var20));
            int var23 = var2.C00OOC00oO(var2.vuuuNvNuv(var11));
            var1.UuUVuuUu(var21, var17, var15, var16, var18, var23);
            if (var22 > 0.01F) {
               float var24 = var15 * var22;
               var1.UuUVuuUu(var21, var17, var24, var16, var18, var10, var9);
            }
         }

         var1.uUnuvNvvNU();
      }
   }

   private void C00OOC00oO(
      UnVNvNnU var1, nnvNuuNvvuu var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, int var10, float var11, float var12
   ) {
      float var13 = var6 * 0.5F;
      var2.C00OOC00oO(var1, var3, var4, var5, var6, var13, var11);
      float var14 = Math.max(1.5F * var12, 1.0F);
      float var15 = var3 + var14;
      float var16 = var4 + var14;
      float var17 = Math.max(1.0F, var5 - var14 * 2.0F);
      float var18 = Math.max(1.0F, var6 - var14 * 2.0F);
      float var19 = var17 * var7;
      float var20 = var18 * 0.5F;
      if (var19 > 0.5F) {
         var1.UuUVuuUu(var15, var16, var17, var18, var20, var20, var20, var20);
         var1.UuUVuuUu(var15, var16, var19, var18, var20, var10, var9);
         var1.UuUVuuUu(
            var15 + var20 * 0.6F,
            var16 + var18 * 0.16F,
            Math.max(0.0F, var19 - var20),
            Math.max(1.0F, var18 * 0.22F),
            var18 * 0.11F,
            VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(48.0F * var11))
         );
         var1.nuUnNvnuUu();
      }

      float var21 = var17 / Math.max(1, var8);
      int var22 = VnVnuUn.UuUVuuUu(var2.vNUvnnVnUvu(1.0F), (int)(36.0F * var11));

      for (int var23 = 1; var23 < var8; var23++) {
         float var24 = var15 + var21 * var23;
         var1.UuUVuuUu(var24 - 0.35F * var12, var16 + var18 * 0.18F, 0.7F * var12, var18 * 0.64F, 0.35F * var12, var22);
      }

      var1.uUnuvNvvNU();
   }

   private void uUnuvNvvNU(
      UnVNvNnU var1, nnvNuuNvvuu var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, int var10, float var11, float var12
   ) {
      var7 = Math.max(0.0F, Math.min(1.0F, var7));
      if (var2.nvUVNnuu()) {
         float var25 = Math.max(2.6F * var12, 1.5F);
         float var26 = var3 + var25;
         float var27 = var4 + var25;
         float var28 = Math.max(1.0F, var5 - var25 * 2.0F);
         float var29 = Math.max(1.0F, var6 - var25 * 2.0F);
         float var30 = var28 * var7;
         if (var30 > 0.5F) {
            var1.UuUVuuUu(var26, var27, var28, var29, var29 * 0.5F, var29 * 0.5F, var29 * 0.5F, var29 * 0.5F);
            int var31 = VnVnuUn.UuUVuuUu(var9, (int)(VnVnuUn.UuUVuuUu(var9) * var11));
            int var32 = VnVnuUn.UuUVuuUu(var10, (int)(VnVnuUn.UuUVuuUu(var10) * var11));
            var1.UuUVuuUu(var26, var27, var30, var29, var29 * 0.5F, var32, var31);
            var1.nuUnNvnuUu();
         }

         var1.uUnuvNvvNU();
      } else {
         float var13 = 1.5F * var12;
         float var14 = (var5 - var13 * (var8 - 1)) / var8;
         float var15 = var6 - 4.0F * var12;
         float var16 = var4 + (var6 - var15) * 0.5F;
         float var17 = var15 * 0.4F;
         float var18 = var7 * var8;

         for (int var19 = 0; var19 < var8; var19++) {
            float var20 = Math.max(0.0F, Math.min(1.0F, var18 - var19));
            if (!(var20 <= 0.01F)) {
               float var21 = var3 + var19 * (var14 + var13);
               int var22 = VnVnuUn.UuUVuuUu(var9, (int)(VnVnuUn.UuUVuuUu(var9) * var11));
               int var23 = VnVnuUn.UuUVuuUu(var10, (int)(VnVnuUn.UuUVuuUu(var10) * var11));
               var1.UuUVuuUu(var21, var16, var14 * var20, var15, var17, var23, var22);
            }
         }

         var1.uUnuvNvvNU();
      }
   }

   private static int UuUVuuUu(int var0, int var1, float var2) {
      var2 = Math.max(0.0F, Math.min(1.0F, var2));
      int var3 = var0 >>> 24 & 0xFF;
      int var4 = var0 >>> 16 & 0xFF;
      int var5 = var0 >>> 8 & 0xFF;
      int var6 = var0 & 0xFF;
      int var7 = var1 >>> 24 & 0xFF;
      int var8 = var1 >>> 16 & 0xFF;
      int var9 = var1 >>> 8 & 0xFF;
      int var10 = var1 & 0xFF;
      int var11 = Math.round(var3 + (var7 - var3) * var2);
      int var12 = Math.round(var4 + (var8 - var4) * var2);
      int var13 = Math.round(var5 + (var9 - var5) * var2);
      int var14 = Math.round(var6 + (var10 - var6) * var2);
      return (var11 & 0xFF) << 24 | (var12 & 0xFF) << 16 | (var13 & 0xFF) << 8 | var14 & 0xFF;
   }
}
