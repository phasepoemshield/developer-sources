package ru.metaculture.protection;

public final class vVnuUUVvvnV {
   private final Cc0cOoOcC0o UuUVuuUu;
   private float C00OOC00oO;
   private float uUnuvNvvNU;

   public vVnuUUVvvnV(Cc0cOoOcC0o var1) {
      this.UuUVuuUu = var1;
   }

   public void UuUVuuUu(float var1) {
      this.C00OOC00oO = var1;
      this.uUnuvNvvNU = 0.0F;
   }

   public float UuUVuuUu(float var1, float var2) {
      if (Float.isNaN(var1) || Float.isInfinite(var1)) {
         var1 = this.C00OOC00oO;
      }

      if (!Float.isNaN(var2) && !Float.isInfinite(var2) && !(var2 <= 0.0F)) {
         float var3 = Math.max(0.05F, Math.min(4.0F, var2 * 60.0F));
         this.uUnuvNvvNU = this.uUnuvNvvNU + (var1 - this.C00OOC00oO) * this.UuUVuuUu.NVNnnvnuunNv() * var3;
         this.uUnuvNvvNU = this.uUnuvNvvNU * (float)Math.pow(this.UuUVuuUu.uVunuUNVVUUV(), var3);
         this.C00OOC00oO = this.C00OOC00oO + this.uUnuvNvvNU * var3;
         if (!Float.isNaN(this.C00OOC00oO) && !Float.isInfinite(this.C00OOC00oO) && !Float.isNaN(this.uUnuvNvvNU) && !Float.isInfinite(this.uUnuvNvvNU)) {
            if (Math.abs(var1 - this.C00OOC00oO) <= this.UuUVuuUu.UNnVVNvvnVvU() && Math.abs(this.uUnuvNvvNU) <= this.UuUVuuUu.uNnUnnuNUnNu()) {
               this.C00OOC00oO = var1;
               this.uUnuvNvvNU = 0.0F;
            }

            return this.C00OOC00oO;
         } else {
            this.C00OOC00oO = var1;
            this.uUnuvNvvNU = 0.0F;
            return this.C00OOC00oO;
         }
      } else {
         return this.C00OOC00oO;
      }
   }

   public float UuUVuuUu() {
      return this.C00OOC00oO;
   }

   public float C00OOC00oO() {
      return this.uUnuvNvvNU;
   }
}
