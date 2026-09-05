package ru.metaculture.protection;

public final class VnuuvvUv {
   private final VVnnnnN UuUVuuUu = new VVnnnnN();
   private String C00OOC00oO;
   private String uUnuvNvvNU;
   private int vVvUvVVuuNvV = -1;
   private double uNNnnnuuuN = Double.NaN;

   public void UuUVuuUu(String var1) {
      this.UuUVuuUu(var1, Double.NaN);
   }

   public void UuUVuuUu(String var1, double var2) {
      if (var1 == null) {
         var1 = "";
      }

      if (this.C00OOC00oO == null) {
         this.C00OOC00oO = var1;
         this.uUnuvNvvNU = null;
         this.uNNnnnuuuN = var2;
         this.UuUVuuUu.nuUnNvnuUu(1.0);
      } else if (!var1.equals(this.C00OOC00oO)) {
         if (this.UuUVuuUu.uNNnnnuuuN() >= 0.999F) {
            this.uUnuvNvvNU = this.C00OOC00oO;
            if (!Double.isNaN(var2) && !Double.isNaN(this.uNNnnnuuuN)) {
               this.vVvUvVVuuNvV = var2 >= this.uNNnnnuuuN ? 1 : -1;
            }

            this.UuUVuuUu.nuUnNvnuUu(0.0);
         }

         this.C00OOC00oO = var1;
         if (!Double.isNaN(var2)) {
            this.uNNnnnuuuN = var2;
         }
      }

      this.UuUVuuUu.UuUVuuUu();
      this.UuUVuuUu.UuUVuuUu(1.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
   }

   public void UuUVuuUu(
      UnVNvNnU var1, nUVnuvUu var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11
   ) {
      String var12 = this.C00OOC00oO == null ? "" : this.C00OOC00oO;
      float var13 = vVVUUuunVVV.C00OOC00oO(var2, var12, var10);
      this.uUnuvNvvNU(var1, var2, var3, var4, var5, var6, var7, var8 - var13 * 0.5F, var9, var10, var11);
   }

   public void C00OOC00oO(
      UnVNvNnU var1, nUVnuvUu var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11
   ) {
      this.uUnuvNvvNU(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   private void uUnuvNvvNU(
      UnVNvNnU var1, nUVnuvUu var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11
   ) {
      float var12 = this.UuUVuuUu.uNNnnnuuuN();
      String var13 = this.C00OOC00oO == null ? "" : this.C00OOC00oO;
      if (!(var12 >= 0.999F) && this.uUnuvNvvNU != null) {
         String var14 = this.uUnuvNvvNU;
         int var15 = var13.length();
         int var16 = var14.length();
         int var17 = Math.min(var15, var16);
         int var18 = 0;

         while (var18 < var17 && var13.charAt(var18) == var14.charAt(var18)) {
            var18++;
         }

         int var19 = 0;

         while (var19 < var17 - var18 && var13.charAt(var15 - 1 - var19) == var14.charAt(var16 - 1 - var19)) {
            var19++;
         }

         String var20 = var13.substring(0, var18);
         String var21 = var13.substring(var18, var15 - var19);
         String var22 = var14.substring(var18, var16 - var19);
         String var23 = var13.substring(var15 - var19);
         float var24 = vVVUUuunVVV.C00OOC00oO(var2, var20, var10);
         float var25 = vVVUUuunVVV.C00OOC00oO(var2, var21, var10);
         if (!var20.isEmpty()) {
            var1.UuUVuuUu(var2, var8, var9, var10, var20, var11);
         }

         float var26 = var8 + var24;
         int var28 = VnVnuUn.UuUVuuUu(var11);
         int var29 = VnVnuUn.UuUVuuUu(var11, (int)(var28 * var12));
         int var30 = VnVnuUn.UuUVuuUu(var11, (int)(var28 * (1.0F - var12)));
         var1.UuUVuuUu(var3, var4, var5, var6, var7, var7, var7, var7);
         if (!var22.isEmpty()) {
            var1.UuUVuuUu(var2, var26, var9 - this.vVvUvVVuuNvV * var10 * var12, var10, var22, var30);
         }

         if (!var21.isEmpty()) {
            var1.UuUVuuUu(var2, var26, var9 + this.vVvUvVVuuNvV * var10 * (1.0F - var12), var10, var21, var29);
         }

         var1.nuUnNvnuUu();
         if (!var23.isEmpty()) {
            var1.UuUVuuUu(var2, var26 + var25, var9, var10, var23, var11);
         }
      } else {
         var1.UuUVuuUu(var2, var8, var9, var10, var13, var11);
      }
   }
}
