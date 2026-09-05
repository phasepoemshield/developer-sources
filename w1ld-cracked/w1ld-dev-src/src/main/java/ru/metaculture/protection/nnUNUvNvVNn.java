package ru.metaculture.protection;

import lombok.Generated;

public final class nnUNUvNvVNn {
   private static final float UuUVuuUu = 0.004166667F;
   private static final float C00OOC00oO = 0.25F;
   private static final int uUnuvNvvNU = 60;
   private float vVvUvVVuuNvV;
   private float uNNnnnuuuN;
   private float nuUnNvnuUu;
   private long VVuuUN = Long.MIN_VALUE;

   public nnUNUvNvVNn(float var1) {
      this.vVvUvVVuuNvV = var1;
   }

   public float UuUVuuUu(float var1, Cc0cOoOcC0o var2) {
      vvUnNVVnV var3 = vvUnNVVnV.UuUVuuUu();
      long var4 = var3.vVvUvVVuuNvV();
      if (var4 == this.VVuuUN) {
         return this.vVvUvVVuuNvV;
      } else {
         this.VVuuUN = var4;
         float var6 = var3.uUnuvNvvNU();
         if (!Float.isFinite(var6) || var6 <= 0.0F) {
            var6 = 0.004166667F;
         } else if (var6 > 0.25F) {
            var6 = 0.25F;
         }

         this.nuUnNvnuUu += var6;
         int var7 = 0;

         while (this.nuUnNvnuUu >= 0.004166667F && var7 < 60) {
            this.uUnuvNvvNU(var1, var2);
            this.nuUnNvnuUu -= 0.004166667F;
            var7++;
            if (this.C00OOC00oO(var1, var2)) {
               this.UuUVuuUu(var1);
               break;
            }
         }

         if (var7 == 60) {
            this.nuUnNvnuUu = 0.0F;
         }

         return this.vVvUvVVuuNvV;
      }
   }

   private void uUnuvNvvNU(float var1, Cc0cOoOcC0o var2) {
      this.uNNnnnuuuN = this.uNNnnnuuuN + ((var1 - this.vVvUvVVuuNvV) * var2.NVNnnvnuunNv() - this.uNNnnnuuuN * var2.uVunuUNVVUUV());
      this.vVvUvVVuuNvV = this.vVvUvVVuuNvV + this.uNNnnnuuuN;
   }

   public void UuUVuuUu(float var1) {
      this.vVvUvVVuuNvV = var1;
      this.uNNnnnuuuN = 0.0F;
      this.nuUnNvnuUu = 0.0F;
   }

   public boolean C00OOC00oO(float var1, Cc0cOoOcC0o var2) {
      return Math.abs(var1 - this.vVvUvVVuuNvV) <= var2.UNnVVNvvnVvU() && Math.abs(this.uNNnnnuuuN) <= var2.uNnUnnuNUnNu();
   }

   @Generated
   public float UuUVuuUu() {
      return this.vVvUvVVuuNvV;
   }

   @Generated
   public float C00OOC00oO() {
      return this.uNNnnnuuuN;
   }

   @Generated
   public float uUnuvNvvNU() {
      return this.nuUnNvnuUu;
   }

   @Generated
   public long vVvUvVVuuNvV() {
      return this.VVuuUN;
   }

   @Generated
   public void C00OOC00oO(float var1) {
      this.vVvUvVVuuNvV = var1;
   }

   @Generated
   public void uUnuvNvvNU(float var1) {
      this.uNNnnnuuuN = var1;
   }

   @Generated
   public void vVvUvVVuuNvV(float var1) {
      this.nuUnNvnuUu = var1;
   }

   @Generated
   public void UuUVuuUu(long var1) {
      this.VVuuUN = var1;
   }
}
