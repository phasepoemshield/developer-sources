package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.wild.module.api.Module;

final class nNnnnNvVnvV {
   private static final float UuUVuuUu = 20.0F;
   private static final float C00OOC00oO = 8.0F;
   private static final float uUnuvNvvNU = 4.0F;
   private static final float vVvUvVVuuNvV = 20.0F;
   private static final float uNNnnnuuuN = 4.0F;
   private static final float nuUnNvnuUu = 4.0F;
   private static final float VVuuUN = 4.0F;
   private final oOOOo0 vNUvnnVnUvu;
   private final VwVVvwWW uVUuuVnNVU = new VwVVvwWW();
   private float vuuuNvNuv;
   private float nvUVNnuu;
   private float UuuNnUvUuv;
   private float nUUVuvU;

   nNnnnNvVnvV(oOOOo0 var1) {
      this.vNUvnnVnUvu = var1;
   }

   void UuUVuuUu(float var1, float var2, float var3, float var4) {
      this.vuuuNvNuv = var1;
      this.nvUVNnuu = var2;
      this.UuuNnUvUuv = var3;
      this.nUUVuvU = var4;
   }

   void UuUVuuUu(UnVNvNnU var1, int var2, int var3, float var4) {
      int var5 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.uNNnnnuuuN(1, 1), (int)(30.0F * var4));
      int var6 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(1, 1), (int)(160.0F * var4));
      int var7 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(1, 1), (int)(190.0F * var4));
      int var8 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(220.0F * var4));
      int var9 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(90.0F * var4));
      int var10 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.VVuuUN(1, 1), (int)(220.0F * var4));
      if (UUVNUUUnNUv.VVuuUN.uUnuvNvvNU()) {
         var1.UuUVuuUu(this.vuuuNvNuv, this.nvUVNnuu, this.UuuNnUvUuv, this.nUUVuvU, 8.0F, var4);
      }

      var1.UuUVuuUu(this.vuuuNvNuv, this.nvUVNnuu, this.UuuNnUvUuv, this.nUUVuvU, 8.0F, var5, 1.0F);
      var1.UuUVuuUu(this.vuuuNvNuv, this.nvUVNnuu, this.UuuNnUvUuv, this.nUUVuvU, 8.0F, var7);
      var1.UuUVuuUu(
         this.vuuuNvNuv,
         this.nvUVNnuu,
         this.UuuNnUvUuv,
         20.0F,
         8.0F,
         8.0F,
         0.0F,
         0.0F,
         UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(15.0F * var4))
      );
      var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, this.vuuuNvNuv + 4.0F + 5.0F, this.nvUVNnuu + 6.0F + 6.5F, 16.0F, this.vNUvnnVnUvu.C00OOC00oO(), var10);
      var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, this.vuuuNvNuv + 4.0F + 100.0F, this.nvUVNnuu + 6.0F + 6.5F, 16.0F, this.vNUvnnVnUvu.UuUVuuUu(), var10);
      float var11 = this.vuuuNvNuv + 4.0F;
      float var12 = this.nvUVNnuu + 20.0F + 4.0F;
      float var13 = this.UuuNnUvUuv - 8.0F;
      float var14 = this.nUUVuvU - 20.0F - 8.0F;
      boolean var15 = UuvVnuU.UuUVuuUu(var2, var3, var11, var12, var13, var14);
      this.uVUuuVnNVU.UuUVuuUu(var15);
      this.uVUuuVnNVU.vVvUvVVuuNvV(6.0F);
      List var16 = this.UuUVuuUu();
      float var17 = 0.0F;

      for (Module var19 : var16) {
         uVVuNvUUV var20 = nnUVNuUunvv.UuUVuuUu(var19);
         var20.UuUVuuUu();
         float var21 = UUnVvnuUnnVV.UuUVuuUu(var1, var19.nuUnNvnuUu(), var13 - 10.0F);
         float var22 = var21 > 0.0F ? var21 + 4.0F : 0.0F;
         float var23 = var22 * var20.uNNnnnuuuN();
         var17 += 20.0F + var23 + 4.0F;
      }

      var17 = Math.max(0.0F, var17 - 4.0F);
      this.uVUuuVnNVU.UuUVuuUu(var17, var14);
      this.uVUuuVnNVU.uUnuvNvvNU();
      var1.UuUVuuUu(var11, var12, var13, var14, 0.0F, 0.0F, 0.0F, 0.0F);
      float var41 = var12 + this.uVUuuVnNVU.vNUvnnVnUvu();

      for (Module var43 : var16) {
         uVVuNvUUV var44 = nnUVNuUunvv.UuUVuuUu(var43);
         float var45 = var44.uNNnnnuuuN();
         float var46 = UUnVvnuUnnVV.UuUVuuUu(var1, var43.nuUnNvnuUu(), var13 - 10.0F);
         float var24 = var46 > 0.0F ? var46 + 4.0F : 0.0F;
         float var25 = var24 * var45;
         float var29 = 20.0F + var25;
         if (!(var41 + var29 < var12 - 20.0F) && !(var41 > var12 + var14 + 20.0F)) {
            int var30 = var43.nuUnNvnuUu ? VnVnuUn.uNNnnnuuuN(var6, var8, 0.1F) : var6;
            var1.UuUVuuUu(var11, var41, var13, var29, 4.0F, var30);
            float var31 = var41 + 5.0F + 6.5F;
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var11 + 6.0F, var31, 13.0F, var43.vVvUvVVuuNvV, var43.nuUnNvnuUu ? var10 : var9);
            if (var43.nvUVNnuu || var43.uNNnnnuuuN != -1) {
               String var32 = var43.nvUVNnuu ? "..." : UNuNUNVv.C00OOC00oO(var43.uNNnnnuuuN);
               float var33 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var32, 10.0F).UuUVuuUu + 6.0F;
               float var34 = var11 + var13 - var33 - 16.0F;
               var1.UuUVuuUu(var34, var41 + 4.0F, var33, 10.0F, 3.0F, var6);
               var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var34 + 3.0F, var41 + 4.0F + 6.8F, 10.0F, var32, var9);
            }

            if (!var43.nuUnNvnuUu().isEmpty()) {
               float var47 = var11 + var13 - 12.0F;
               float var49 = var31 + 1.0F;
               var1.UuUVuuUu(vNvnnVvvVUu.uUnuvNvvNU, var47, var49, 13.0F, "X", VnVnuUn.uNNnnnuuuN(var9, 0, var45));
            }

            if (var25 > 0.5F && var46 > 0.0F) {
               float var48 = var11 + 5.0F;
               float var50 = var41 + 20.0F + 2.0F;
               float var51 = var13 - 10.0F;
               var1.UuUVuuUu(var11, var41 + 20.0F, var13, var25, 0.0F, 0.0F, 4.0F, 4.0F);
               float var36 = 0.0F;

               for (nvUuvVvuuN var38 : var43.nuUnNvnuUu()) {
                  if (!var38.C00OOC00oO.get()) {
                     float var39 = UUnVvnuUnnVV.UuUVuuUu(var1, var38, var48, var50 + var36, var51, var2, var3, var4 * var45, var5, var8, var9, var10, var6);
                     var36 += var39 + UUnVvnuUnnVV.UuUVuuUu();
                  }
               }

               var1.nuUnNvnuUu();
            }

            var41 += var29 + 4.0F;
         } else {
            var41 += var29 + 4.0F;
         }
      }

      var1.nuUnNvnuUu();
   }

   boolean UuUVuuUu(UnVNvNnU var1, int var2, int var3, int var4) {
      float var5 = this.vuuuNvNuv + 4.0F;
      float var6 = this.nvUVNnuu + 20.0F + 4.0F;
      float var7 = this.UuuNnUvUuv - 8.0F;
      float var8 = this.nUUVuvU - 20.0F - 8.0F;
      if (!UuvVnuU.UuUVuuUu(var2, var3, var5, var6, var7, var8)) {
         return false;
      } else {
         List var9 = this.UuUVuuUu();
         float var10 = var6 + this.uVUuuVnNVU.vNUvnnVnUvu();

         for (Module var12 : var9) {
            uVVuNvUUV var13 = nnUVNuUunvv.UuUVuuUu(var12);
            float var14 = var13.uNNnnnuuuN();
            float var15 = UUnVvnuUnnVV.UuUVuuUu(var1, var12.nuUnNvnuUu(), var7 - 10.0F);
            float var16 = var15 > 0.0F ? var15 + 4.0F : 0.0F;
            float var17 = var16 * var14;
            float var21 = 20.0F;
            if (UuvVnuU.UuUVuuUu(var2, var3, var5, var10, var7, var21)) {
               if (var4 == 1 && !var12.nuUnNvnuUu().isEmpty()) {
                  nnUVNuUunvv.C00OOC00oO(var12);
                  return true;
               }

               if (var4 == 2) {
                  if (UUVNUUUnNUv.UnUNuUU != null && UUVNUUUnNUv.UnUNuUU != var12) {
                     UUVNUUUnNUv.UnUNuUU.nvUVNnuu = false;
                  }

                  var12.nvUVNnuu = !var12.nvUVNnuu;
                  UUVNUUUnNUv.UnUNuUU = var12.nvUVNnuu ? var12 : null;
                  return true;
               }

               if (var4 == 0) {
                  var12.a_();
                  return true;
               }
            }

            if (var17 > 0.5F) {
               float var22 = var5 + 5.0F;
               float var23 = var10 + 20.0F + 2.0F;
               float var24 = var7 - 10.0F;
               float var25 = 0.0F;

               for (nvUuvVvuuN var27 : var12.nuUnNvnuUu()) {
                  if (!var27.C00OOC00oO.get()) {
                     float var28 = UUnVvnuUnnVV.UuUVuuUu(var1, var27, var24);
                     if (UUnVvnuUnnVV.UuUVuuUu(var1, var27, var22, var23 + var25, var24, var2, var3, var4)) {
                        return true;
                     }

                     var25 += var28 + UUnVvnuUnnVV.UuUVuuUu();
                  }
               }
            }

            float var29 = 20.0F + var17;
            var10 += var29 + 4.0F;
         }

         return false;
      }
   }

   boolean UuUVuuUu(float var1, float var2, double var3) {
      float var5 = this.vuuuNvNuv + 4.0F;
      float var6 = this.nvUVNnuu + 20.0F + 4.0F;
      float var7 = this.UuuNnUvUuv - 8.0F;
      float var8 = this.nUUVuvU - 20.0F - 8.0F;
      if (UuvVnuU.UuUVuuUu(var1, var2, var5, var6, var7, var8)) {
         this.uVUuuVnNVU.UuUVuuUu(var3);
         return true;
      } else {
         return false;
      }
   }

   private List<Module> UuUVuuUu() {
      if (NVnVnNnN.UuUVuuUu.C00OOC00oO == null) {
         return Collections.emptyList();
      } else {
         ArrayList var1 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(this.vNUvnnVnUvu);
         String var2 = UUVNUUUnNUv.VVnVNnunVvu == null ? "" : UUVNUUUnNUv.VVnVNnunVvu.trim().toLowerCase();
         return (List<Module>)(var2.isEmpty()
            ? var1
            : var1.stream().filter(var1x -> var1x.vVvUvVVuuNvV != null && var1x.vVvUvVVuuNvV.toLowerCase().contains(var2)).toList());
      }
   }
}
