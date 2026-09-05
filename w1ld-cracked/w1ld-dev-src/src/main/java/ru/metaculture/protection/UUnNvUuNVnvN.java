package ru.metaculture.protection;

import java.util.List;
import lombok.Generated;
import net.minecraft.class_437;

public final class UUnNvUuNVnvN {
   private final vUNUUVnnUUN UuUVuuUu;
   private final UUnunVVvvNN C00OOC00oO;
   private final VVvNNnuVNun uUnuvNvvNU;
   private NVUVNNunvvNN vVvUvVVuuNvV;

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean UuUVuuUu(
      vNvvVnNuUVvv var1,
      uVUvuUUNVUv var2,
      CCCo0o0cCCo var3,
      nUvnuVnNUU var4,
      OO0OCoOC var5,
      NNnNvVnvu.uunvUUVnuNn var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11
   ) {
      var1.VVuuUN(var7);
      var1.vNUvnnVnUvu(var8);
      this.vVvUvVVuuNvV = null;
      if (var1.nnuUVNUuvvVU() && var11 >= 0 && var11 <= 8) {
         var1.uNNnnnuuuN(var11);
         return true;
      } else if (var6 == NNnNvVnvu.uunvUUVnuNn.MAIN && var11 == 0 && UuUVuuUu(var2, var4, var9, var10)) {
         var1.uVUuuVnNVU(false);
         var1.vuuuNvNuv(false);
         var1.UuUVuuUu(null);
         var1.UuUVuuUu(var7, var8, var2, var4);
         return true;
      } else if (var6 == NNnNvVnvu.uunvUUVnuNn.THEME && var11 == 0 && var1.nvvVNNnnUvVN() && C00OOC00oO(var2, var4, var9, var10)) {
         var1.uVUuuVnNVU(false);
         var1.vuuuNvNuv(false);
         var1.UuUVuuUu(null);
         var1.C00OOC00oO(var7, var8, var2, var4);
         return true;
      } else if (var11 == 0 && uVNuNVvuvNNU.UuUVuuUu(var9, var10, var6)) {
         var1.uVUuuVnNVU(false);
         var1.vuuuNvNuv(false);
         var1.UuUVuuUu(null);
         return true;
      } else {
         if (var6 == NNnNvVnvu.uunvUUVnuNn.MAIN && var11 == 0 && var1.UnvuVuVnNuvu()) {
            if (C0CoOc0Oo.C00OOC00oO(var2, var4, var9, var10)) {
               var1.uNNnnnuuuN(C0CoOc0Oo.UuUVuuUu(var2, var4, var9));
               var1.UvnvNVnnnnNU();
               return true;
            }

            if (C0CoOc0Oo.uUnuvNvvNU(var2, var4, var9, var10)) {
               var1.nuUnNvnuUu(C0CoOc0Oo.C00OOC00oO(var2, var4, var10));
               var1.uVUVnuvnuVuv();
               return true;
            }
         }

         List var12 = var6 == NNnNvVnvu.uunvUUVnuNn.THEME
            ? this.UuUVuuUu.UuUVuuUu(var1, var2, var4, var5)
            : this.UuUVuuUu.UuUVuuUu(var1, var2, var3, var4, var9);
         NVUVNNunvvNN var13 = vvvVWvvWWW.UuUVuuUu(var12, var9, var10, var11);
         if (var13 != null) {
            this.vVvUvVVuuNvV = var13;
            var1.VVuuUN(var13.UuUVuuUu(var9));
            var1.vNUvnnVnUvu(var13.C00OOC00oO(var10));
            boolean var16 = false /* VF: Semaphore variable */;

            try {
               var16 = true;
               var13.UuUVuuUu(var1);
               var16 = false;
            } finally {
               if (var16) {
                  var1.VVuuUN(var7);
                  var1.vNUvnnVnUvu(var8);
               }
            }

            var1.VVuuUN(var7);
            var1.vNUvnnVnUvu(var8);
            uVNuNVvuvNNU.vVvUvVVuuNvV();
            return true;
         } else {
            if (var11 == 0) {
               var1.uVUuuVnNVU(false);
               var1.vuuuNvNuv(false);
               var1.UuUVuuUu(null);
               var1.NuunnvnN();
               if (var6 == NNnNvVnvu.uunvUUVnuNn.MAIN) {
                  if (this.uUnuvNvvNU(var2, var4, var9, var10)) {
                     var1.UuUVuuUu(var7, var8, var2);
                  }

                  return true;
               }

               if (var6 == NNnNvVnvu.uunvUUVnuNn.THEME && var1.nvvVNNnnUvVN() && this.vVvUvVVuuNvV(var2, var4, var9, var10)) {
                  var1.C00OOC00oO(var7, var8, var2);
                  return true;
               }
            }

            return var6 != NNnNvVnvu.uunvUUVnuNn.NONE;
         }
      }
   }

   public static boolean UuUVuuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1, float var2, float var3) {
      if (var0 != null && var1 != null) {
         float var4 = Math.max(14.0F, var1.UuUVuuUu(22.0F));
         float var5 = var0.UuUVuuUu() + var1.vVvUvVVuuNvV() - var4;
         float var6 = var0.C00OOC00oO() + var1.uNNnnnuuuN() - var4;
         return var2 >= var5 && var3 >= var6 && var2 < var0.UuUVuuUu() + var1.vVvUvVVuuNvV() && var3 < var0.C00OOC00oO() + var1.uNNnnnuuuN();
      } else {
         return false;
      }
   }

   public static boolean C00OOC00oO(uVUvuUUNVUv var0, nUvnuVnNUU var1, float var2, float var3) {
      if (var0 != null && var1 != null) {
         float var4 = Math.max(12.0F, var1.C00OOC00oO(18.0F));
         float var5 = var0.UvUvUNuvNU() + var1.uVunuUNVVUUV() - var4;
         float var6 = var0.c0oOOCcCoC0() + var1.UNnVVNvvnVvU() - var4;
         return var2 >= var5 && var3 >= var6 && var2 < var0.UvUvUNuvNU() + var1.uVunuUNVVUUV() && var3 < var0.c0oOOCcCoC0() + var1.UNnVVNvvnVvU();
      } else {
         return false;
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, float var2, float var3, float var4, float var5) {
      float var6 = this.vVvUvVVuuNvV == null ? var4 : this.vVvUvVVuuNvV.UuUVuuUu(var4);
      float var7 = this.vVvUvVVuuNvV == null ? var5 : this.vVvUvVVuuNvV.C00OOC00oO(var5);
      var1.VVuuUN(var6);
      var1.vNUvnnVnUvu(var7);
      boolean var8 = uVNuNVvuvNNU.C00OOC00oO();
      boolean var9 = var1.Oco0Oococc() != null;
      boolean var10 = var1.nNVVUnuVVVuV() || var1.vnVuunuNN() || var1.UvUNuNvvNVNv();
      boolean var11 = var1.NVNnnvnuunNv();
      boolean var12 = var1.nuunNvv();
      boolean var13 = var1.uUVVvVVNvvn();
      boolean var14 = var1.nNnVnUNVV();
      boolean var15 = var1.vvUVNVvvNUv();
      boolean var16 = NvuUvVNVuuu.vVvUvVVuuNvV(var1);
      boolean var17 = var8 || var11 || var12 || var13 || var14 || var15 || var9 || var10 || var16;
      var1.UuUVuuUu(null);
      var1.uUnuvNvvNU(null);
      if (var9) {
         var1.uUVvnUuNvvN();
      }

      if (var10) {
         this.C00OOC00oO.UuUVuuUu(var1);
      }

      var1.VVuuUN(var2);
      var1.vNUvnnVnUvu(var3);
      this.vVvUvVVuuNvV = null;
      return var17;
   }

   public void UuUVuuUu(vNvvVnNuUVvv var1) {
      uVNuNVvuvNNU.C00OOC00oO();
      var1.NVNnnvnuunNv();
      var1.nuunNvv();
      var1.uUVVvVVNvvn();
      var1.nNnVnUNVV();
      var1.vvUVNVvvNUv();
      var1.UuUVuuUu(null);
      var1.uUnuvNvvNU(null);
      var1.NuunnvnN();
      NvuUvVNVuuu.uUnuvNvvNU(var1);
      this.vVvUvVVuuNvV = null;
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, uVUvuUUNVUv var2, nUvnuVnNUU var3, float var4, float var5, float var6, float var7) {
      var1.VVuuUN(var4);
      var1.vNUvnnVnUvu(var5);
      float var8 = this.vVvUvVVuuNvV == null ? var6 : this.vVvUvVVuuNvV.UuUVuuUu(var6);
      float var9 = this.vVvUvVVuuNvV == null ? var7 : this.vVvUvVVuuNvV.C00OOC00oO(var7);
      if (uVNuNVvuvNNU.C00OOC00oO(var8, var9)) {
         return true;
      } else if (var1.UuuuNNunN()) {
         var1.uNNnnnuuuN(C0CoOc0Oo.UuUVuuUu(var2, var3, var8));
         return true;
      } else if (var1.NNVNuUvVn()) {
         var1.nuUnNvnuUu(C0CoOc0Oo.C00OOC00oO(var2, var3, var9));
         return true;
      } else if (var1.VnnnvUunNvuu()) {
         var1.vVvUvVVuuNvV(var4, var5);
         return true;
      } else if (var1.nUununvNvvn()) {
         var1.uNNnnnuuuN(var4, var5);
         return true;
      } else if (var1.uNnNUNvuVnu()) {
         var1.nuUnNvnuUu(var4, var5);
         return true;
      } else if (var1.CC0COO()) {
         var1.uUnuvNvvNU(var4, var5);
         return true;
      } else if (var1.nNVVUnuVVVuV() || var1.vnVuunuNN() || var1.UvUNuNvvNVNv()) {
         this.C00OOC00oO.UuUVuuUu(var1, var8, var9);
         return true;
      } else if (var1.Oco0Oococc() != null) {
         this.C00OOC00oO.UuUVuuUu(var1, var8);
         return true;
      } else {
         return NvuUvVNVuuu.UuUVuuUu(var1, var8, var9);
      }
   }

   public boolean UuUVuuUu(
      vNvvVnNuUVvv var1, uVUvuUUNVUv var2, CCCo0o0cCCo var3, nUvnuVnNUU var4, NNnNvVnvu.uunvUUVnuNn var5, float var6, float var7, double var8, double var10
   ) {
      if (var5 == NNnNvVnvu.uunvUUVnuNn.THEME) {
         var1.UuUVuuUu((float)var10 * var4.UuUVuuUu(36.0F), var4);
         return true;
      } else if (var5 != NNnNvVnvu.uunvUUVnuNn.MAIN) {
         return false;
      } else if (!nunvNNUnvU.UuUVuuUu(var6, var7, var2.vNVuvnUUnuUn(), var2.UvnvNVnnnnNU(), var2.uVUVnuvnuVuv(), var2.NVNnnvnuunNv())) {
         return this.uNNnnnuuuN(var2, var4, var6, var7);
      } else if (var1.vvNvvuUUUVvv()) {
         O0oC0cc0O0Oo var14 = O0oC0cc0O0Oo.resolve(var1.UuUVuuUu(vnvnUnVnuunn.uVUVnuvnuVuv()), var2, var4);
         nUUNvUVNv.UuUVuuUu(var2, var4, var14.localX(var6), var14.localY(var7), var10);
         return true;
      } else if (!var1.UnvuVuVnNuvu()) {
         if (var1.UNvvunVVn() && this.UuUVuuUu(var1, var2, var4, var6, var7, var10)) {
            return true;
         } else if (NvuUvVNVuuu.UuUVuuUu(var1, var3, var4, var6, var7, var10)) {
            return true;
         } else {
            var1.C00OOC00oO((float)var10 * var4.UuUVuuUu(36.0F), var4);
            return true;
         }
      } else {
         if (C0CoOc0Oo.UuUVuuUu(var2, var4, var6, var7)) {
            float var12 = (float)var10 * var4.UuUVuuUu(36.0F);
            float var13 = (float)var8 * var4.UuUVuuUu(64.0F);
            if (Math.abs(var13) <= 0.001F && (class_437.method_25442() || class_437.method_25441())) {
               var13 = (float)var10 * var4.UuUVuuUu(96.0F);
               var12 = 0.0F;
            }

            var1.C00OOC00oO(var12, var13);
         }

         return true;
      }
   }

   private boolean UuUVuuUu(vNvvVnNuUVvv var1, uVUvuUUNVUv var2, nUvnuVnNUU var3, float var4, float var5, double var6) {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         AutoBuy var8 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AutoBuy.class);
         return var8 != null && NvuUvVNVuuu.C00OOC00oO(var8)
            ? NvuUvVNVuuu.UuUVuuUu(var1, new CCCo0o0cCCo(List.of(NvuUvVNVuuu.UuUVuuUu(var8, var2, var3)), 0.0F), var3, var4, var5, var6)
            : false;
      } else {
         return false;
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, int var2) {
      return NvuUvVNVuuu.UuUVuuUu(var1, var2) ? true : this.uUnuvNvvNU.UuUVuuUu(var1, var2);
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, char var2) {
      return NvuUvVNVuuu.UuUVuuUu(var1, var2) ? true : this.uUnuvNvvNU.UuUVuuUu(var1, var2);
   }

   public void UuUVuuUu(vNvvVnNuUVvv var1, float var2) {
      if (!var1.CC0COO() && !var1.uNnNUNvuVnu()) {
         if (!var1.nNVVUnuVVVuV() && !var1.vnVuunuNN() && !var1.UvUNuNvvNVNv()) {
            this.C00OOC00oO.UuUVuuUu(var1, var2);
         } else {
            this.C00OOC00oO.UuUVuuUu(var1, var2, var1.NnuUnUNnu());
         }
      }
   }

   private boolean uUnuvNvvNU(uVUvuUUNVUv var1, nUvnuVnNUU var2, float var3, float var4) {
      return nunvNNUnvU.UuUVuuUu(var3, var4, var1.uVUuuVnNVU(), var1.vuuuNvNuv(), var1.UuuNnUvUuv(), var1.nvUVNnuu())
         || this.nuUnNvnuUu(var1, var2, var3, var4);
   }

   private boolean vVvUvVVuuNvV(uVUvuUUNVUv var1, nUvnuVnNUU var2, float var3, float var4) {
      return nunvNNUnvU.UuUVuuUu(var3, var4, var1.UvUvUNuvNU(), var1.c0oOOCcCoC0(), var2.uVunuUNVVUUV(), var2.UNnVVNvvnVvU());
   }

   private boolean uNNnnnuuuN(uVUvuUUNVUv var1, nUvnuVnNUU var2, float var3, float var4) {
      return nunvNNUnvU.UuUVuuUu(var3, var4, var1.UuUVuuUu(), var1.C00OOC00oO(), var2.vVvUvVVuuNvV(), var2.uNNnnnuuuN());
   }

   private boolean nuUnNvnuUu(uVUvuUUNVUv var1, nUvnuVnNUU var2, float var3, float var4) {
      if (!nunvNNUnvU.UuUVuuUu(var3, var4, var1.uUnuvNvvNU(), var1.vVvUvVVuuNvV(), var1.uNNnnnuuuN(), var1.nuUnNvnuUu())) {
         return false;
      } else if (nunvNNUnvU.UuUVuuUu(
         var3, var4, var1.uUnuvNvvNU() + var2.UuUVuuUu(16.0F), var1.vVvUvVVuuNvV() + var2.UuUVuuUu(16.0F), var2.UuUVuuUu(40.0F), var2.UuUVuuUu(40.0F)
      )) {
         return false;
      } else {
         float var5 = uUuuVVUuuVuN.uUnuvNvvNU(var1, var2);
         float var6 = uUuuVVUuuVuN.C00OOC00oO(var2);
         if (nunvNNUnvU.UuUVuuUu(var3, var4, var5, uUuuVVUuuVuN.vVvUvVVuuNvV(var1, var2), var6, var6)) {
            return false;
         } else {
            float var7 = var5;
            float var8 = var1.vVvUvVVuuNvV() + var2.UuUVuuUu(89.0F);

            for (int var9 = 0; var9 < oOOOo0.values().length; var9++) {
               if (nunvNNUnvU.UuUVuuUu(var3, var4, var7, var8 + var9 * var2.UuUVuuUu(56.0F), var6, var6)) {
                  return false;
               }
            }

            float var10 = uUuuVVUuuVuN.nuUnNvnuUu(var1, var2);
            return !nunvNNUnvU.UuUVuuUu(var3, var4, var7, var10, var6, var6);
         }
      }
   }

   @Generated
   public UUnNvUuNVnvN(vUNUUVnnUUN var1, UUnunVVvvNN var2, VVvNNnuVNun var3) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
   }
}
