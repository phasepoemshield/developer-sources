package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.class_310;

public final class vwwWWWVv {
   private final VvuVNnN UuUVuuUu;

   public nUvnuVnNUU UuUVuuUu(class_310 var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3) {
      nUvnuVnNUU var4 = nUvnuVnNUU.UuUVuuUu(var1, this.UuUVuuUu);
      if (var1 != null && var1.method_22683() != null) {
         float var5 = var1.method_22683().method_4489();
         float var6 = var1.method_22683().method_4506();
         if (!(var5 <= 0.0F) && !(var6 <= 0.0F)) {
            var2.UuUVuuUu(var4, var5, var6);
            var2.C00OOC00oO(var4, var5, var6);
            this.UuUVuuUu(var4, var2, var3);
            return var4;
         } else {
            this.UuUVuuUu(var4, var2, var3);
            return var4;
         }
      } else {
         this.UuUVuuUu(var4, var2, var3);
         return var4;
      }
   }

   public nUvnuVnNUU UuUVuuUu(float var1, float var2, vNvvVnNuUVvv var3, uVUvuUUNVUv var4) {
      nUvnuVnNUU var5 = nUvnuVnNUU.UuUVuuUu(var1, var2, 1.0F, this.UuUVuuUu);
      if (!(var1 <= 0.0F) && !(var2 <= 0.0F)) {
         var3.UuUVuuUu(var5, var1, var2);
         var3.C00OOC00oO(var5, var1, var2);
         this.UuUVuuUu(var5, var3, var4);
         return var5;
      } else {
         this.UuUVuuUu(var5, var3, var4);
         return var5;
      }
   }

   public nUvnuVnNUU UuUVuuUu(class_310 var1, float var2, float var3, vNvvVnNuUVvv var4, uVUvuUUNVUv var5) {
      nUvnuVnNUU var6 = var1 == null ? nUvnuVnNUU.UuUVuuUu(var2, var3, this.UuUVuuUu) : nUvnuVnNUU.UuUVuuUu(var1, this.UuUVuuUu);
      if (!(var2 <= 0.0F) && !(var3 <= 0.0F)) {
         var4.UuUVuuUu(var6, var2, var3);
         var4.C00OOC00oO(var6, var2, var3);
         this.UuUVuuUu(var6, var4, var5);
         return var6;
      } else {
         this.UuUVuuUu(var6, var4, var5);
         return var6;
      }
   }

   public void UuUVuuUu(nUvnuVnNUU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3) {
      this.C00OOC00oO(var1, var2, var3);
      this.uUnuvNvvNU(var1, var2, var3);
   }

   private void C00OOC00oO(nUvnuVnNUU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3) {
      float var4 = this.UuUVuuUu(var2.UnnnvvU());
      float var5 = this.UuUVuuUu(var2.VUUnuVvVu());
      float var6 = this.UuUVuuUu(var4, var1.vVvUvVVuuNvV());
      float var7 = this.UuUVuuUu(var4 + var1.nuUnNvnuUu());
      float var8 = this.UuUVuuUu(var5 + var1.nuUnNvnuUu());
      float var9 = this.UuUVuuUu(var7, var1.vNUvnnVnUvu());
      float var10 = this.UuUVuuUu(var7 + var9 + var1.VVuuUN());
      float var12 = Math.max(0.0F, this.UuUVuuUu(var4 + var6 - var1.nuUnNvnuUu()) - var10);
      float var13 = Math.max(0.0F, this.UuUVuuUu(var5 + var1.uNNnnnuuuN() - var1.nuUnNvnuUu()) - var8);
      float var14 = this.UuUVuuUu(var8, var1.nvUVNnuu());
      float var15 = this.UuUVuuUu(0.0F, var1.UuuNnUvUuv());
      float var16 = Math.max(0.0F, this.UuUVuuUu(var12 - var15 - var1.VVuuUN()));
      float var17 = this.UuUVuuUu(var10 + var16 + var1.VVuuUN());
      float var18 = this.UuUVuuUu(var8 + var14 + var1.VVuuUN());
      float var19 = Math.max(0.0F, this.UuUVuuUu(var8 + var13) - var18);
      float var20 = this.UuUVuuUu(var10 + var1.UnUNVVVNuv());
      float var21 = this.UuUVuuUu(var18 + var1.UnUNVVVNuv());
      var3.UuUVuuUu(var4);
      var3.C00OOC00oO(var5);
      var3.uUnuvNvvNU(var7);
      var3.vVvUvVVuuNvV(var8);
      var3.uNNnnnuuuN(var9);
      var3.nuUnNvnuUu(var13);
      var3.VVuuUN(var10);
      var3.vNUvnnVnUvu(var8);
      var3.uVUuuVnNVU(var10);
      var3.vuuuNvNuv(var8);
      var3.nvUVNnuu(var14);
      var3.UuuNnUvUuv(var16);
      var3.nUUVuvU(var17);
      var3.UnUNVVVNuv(var15);
      var3.vNVuvnUUnuUn(var10);
      var3.UvnvNVnnnnNU(var18);
      var3.uVUVnuvnuVuv(var12);
      var3.NVNnnvnuunNv(var19);
      var3.uVunuUNVVUUV(var20);
      var3.UNnVVNvvnVvU(var21);
      var3.uNnUnnuNUnNu(Math.max(0.0F, this.UuUVuuUu(var10 + var12 - var1.UnUNVVVNuv()) - var20));
      var3.NnUuNNU(Math.max(0.0F, this.UuUVuuUu(var18 + var19 - var1.UnUNVVVNuv()) - var21));
      var3.nNvNUVU(var3.uVunuUNVVUUV());
      var3.UnUNuUU(this.UuUVuuUu(var3.nNvNUVU() + var1.vNVuvnUUnuUn() + var1.VVuuUN()));
      var3.uUVuVvuNUvnu(this.UuUVuuUu(var3.UnUNuUU() + var1.vNVuvnUUnuUn() + var1.VVuuUN()));
   }

   private void uUnuvNvvNU(nUvnuVnNUU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3) {
      var3.UvUvUNuvNU(this.UuUVuuUu(var2.VvVuvUvvNNVv()));
      var3.c0oOOCcCoC0(this.UuUVuuUu(var2.UnnNNvuvvUU()));
      var3.VVnVNnunVvu(this.UuUVuuUu(var3.UvUvUNuvNU() + var1.C00OOC00oO(7.0F)));
      var3.unNNVVNnvvV(this.UuUVuuUu(var3.c0oOOCcCoC0() + var1.C00OOC00oO(63.0F)));
   }

   private float UuUVuuUu(float var1) {
      return Math.round(var1);
   }

   private float UuUVuuUu(float var1, float var2) {
      return Math.max(0.0F, this.UuUVuuUu(var1 + var2) - this.UuUVuuUu(var1));
   }

   @Generated
   public vwwWWWVv(VvuVNnN var1) {
      this.UuUVuuUu = var1;
   }
}
