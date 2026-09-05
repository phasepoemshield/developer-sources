package ru.metaculture.protection;

public final class nUuuVnUnNvn {
   private static final float UuUVuuUu = (float) (Math.PI * 2);
   private static final float C00OOC00oO = 0.05F;
   private final float uUnuvNvvNU;
   private final float vVvUvVVuuNvV;
   private final float uNNnnnuuuN;
   private final float nuUnNvnuUu;
   private float VVuuUN;
   private float vNUvnnVnUvu;

   public nUuuVnUnNvn(vuVvuunNvVv.NVnVnNnN var1) {
      this.uUnuvNvvNU = (float) (Math.PI * 2) * var1.frequencyHz();
      this.vVvUvVVuuNvV = Math.max(0.05F, var1.dampingRatio());
      this.uNNnnnuuuN = var1.settleDistance();
      this.nuUnNvnuUu = var1.settleDistance() * this.uUnuvNvvNU;
   }

   public void UuUVuuUu(float var1) {
      this.VVuuUN = var1;
      this.vNUvnnVnUvu = 0.0F;
   }

   public float UuUVuuUu(float var1, float var2) {
      if (!Float.isFinite(var1)) {
         return this.VVuuUN;
      } else if (var2 > 0.0F && Float.isFinite(var2)) {
         float var3 = var2;

         while (var3 > 0.0F) {
            float var4 = Math.min(var3, 0.05F);
            this.C00OOC00oO(var1, var4);
            var3 -= var4;
         }

         if (Float.isFinite(this.VVuuUN) && Float.isFinite(this.vNUvnnVnUvu)) {
            if (Math.abs(this.VVuuUN - var1) <= this.uNNnnnuuuN && Math.abs(this.vNUvnnVnUvu) <= this.nuUnNvnuUu) {
               this.UuUVuuUu(var1);
            }

            return this.VVuuUN;
         } else {
            this.UuUVuuUu(var1);
            return this.VVuuUN;
         }
      } else {
         return this.VVuuUN;
      }
   }

   private void C00OOC00oO(float var1, float var2) {
      float var3 = this.VVuuUN - var1;
      float var4 = this.vNUvnnVnUvu;
      float var5 = this.uUnuvNvvNU;
      float var6 = this.vVvUvVVuuNvV;
      if (var6 < 0.999F) {
         float var7 = var5 * (float)Math.sqrt(1.0F - var6 * var6);
         float var8 = (float)Math.exp(-var6 * var5 * var2);
         float var9 = (float)Math.cos(var7 * var2);
         float var10 = (float)Math.sin(var7 * var2);
         float var11 = (var4 + var6 * var5 * var3) / var7;
         float var12 = var8 * (var3 * var9 + var11 * var10);
         float var13 = -var6 * var5 * var12 + var8 * var7 * (var11 * var9 - var3 * var10);
         this.VVuuUN = var1 + var12;
         this.vNUvnnVnUvu = var13;
      } else if (var6 < 1.001F) {
         float var14 = (float)Math.exp(-var5 * var2);
         float var16 = var4 + var5 * var3;
         float var18 = var14 * (var3 + var16 * var2);
         float var20 = -var5 * var18 + var14 * var16;
         this.VVuuUN = var1 + var18;
         this.vNUvnnVnUvu = var20;
      } else {
         float var15 = var5 * (float)Math.sqrt(var6 * var6 - 1.0F);
         float var17 = -var6 * var5 + var15;
         float var19 = -var6 * var5 - var15;
         float var21 = (var4 - var17 * var3) / (var19 - var17);
         float var22 = var3 - var21;
         float var23 = (float)Math.exp(var17 * var2);
         float var24 = (float)Math.exp(var19 * var2);
         this.VVuuUN = var1 + var22 * var23 + var21 * var24;
         this.vNUvnnVnUvu = var22 * var17 * var23 + var21 * var19 * var24;
      }
   }

   public float UuUVuuUu() {
      return this.VVuuUN;
   }

   public float C00OOC00oO() {
      return this.vNUvnnVnUvu;
   }
}
