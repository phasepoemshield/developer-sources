package ru.metaculture.protection;

import java.util.function.Supplier;

public class nNUuNvVn extends nvUuvVvuuN {
   public float vVvUvVVuuNvV;
   public float uNNnnnuuuN;
   public float nuUnNvnuUu;
   public float VVuuUN;
   public float vNUvnnVnUvu;
   public boolean uVUuuVnNVU;
   public boolean vuuuNvNuv;
   public String nvUVNnuu;
   public String[] UuuNnUvUuv;
   private final float nUUVuvU;

   public nNUuNvVn(String var1, float var2, float var3, float var4, float var5, boolean var6) {
      this.UuUVuuUu = var1;
      this.uNNnnnuuuN = var3;
      this.vVvUvVVuuNvV = var2;
      this.nuUnNvnuUu = var4;
      this.VVuuUN = var5;
      this.nvUVNnuu = this.nvUVNnuu;
      this.vuuuNvNuv = var6;
      this.nUUVuvU = var2;
   }

   public float uUnuvNvvNU() {
      return this.vVvUvVVuuNvV;
   }

   public void UuUVuuUu(float var1) {
      if (!Float.isNaN(var1) && !Float.isInfinite(var1)) {
         this.vVvUvVVuuNvV = Math.max(this.uNNnnnuuuN, Math.min(this.nuUnNvnuUu, var1));
      }
   }

   public nNUuNvVn UuUVuuUu(Supplier<Boolean> var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   @Override
   public void C00OOC00oO() {
      this.UuUVuuUu(this.nUUVuvU);
      this.uVUuuVnNVU = false;
   }

   public nNUuNvVn UuUVuuUu(String... var1) {
      this.UuuNnUvUuv = var1;
      return this;
   }

   public boolean vVvUvVVuuNvV() {
      return this.UuuNnUvUuv != null && this.UuuNnUvUuv.length > 0;
   }

   public String C00OOC00oO(float var1) {
      if (!this.vVvUvVVuuNvV()) {
         return null;
      } else {
         int var2 = Math.round(this.nuUnNvnuUu - this.uNNnnnuuuN);
         int var3 = Math.round(var1 - this.uNNnnnuuuN);
         if (var2 > 0 && this.UuuNnUvUuv.length == var2 + 1) {
            var3 = Math.max(0, Math.min(this.UuuNnUvUuv.length - 1, var3));
            return this.UuuNnUvUuv[var3];
         } else {
            float var4 = this.nuUnNvnuUu - this.uNNnnnuuuN <= 0.0F ? 0.0F : (var1 - this.uNNnnnuuuN) / (this.nuUnNvnuUu - this.uNNnnnuuuN);
            int var5 = Math.max(0, Math.min(this.UuuNnUvUuv.length - 1, Math.round(var4 * (this.UuuNnUvUuv.length - 1))));
            return this.UuuNnUvUuv[var5];
         }
      }
   }
}
