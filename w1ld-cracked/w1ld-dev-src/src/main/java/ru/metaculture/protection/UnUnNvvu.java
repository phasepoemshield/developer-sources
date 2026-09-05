package ru.metaculture.protection;

public final class UnUnNvvu {
   private float UuUVuuUu;
   private float C00OOC00oO;

   public UnUnNvvu(float var1, float var2) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
   }

   public void UuUVuuUu(float var1, float var2, float var3) {
      this.UuUVuuUu = this.C00OOC00oO(var1, this.UuUVuuUu, var3);
      this.C00OOC00oO = this.C00OOC00oO(var2, this.C00OOC00oO, var3);
   }

   public void UuUVuuUu(float var1, float var2) {
      this.UuUVuuUu = this.C00OOC00oO(this.UuUVuuUu, var1, 1.0F);
      this.C00OOC00oO = this.C00OOC00oO(this.C00OOC00oO, var2, 1.0F);
   }

   public float C00OOC00oO(float var1, float var2, float var3) {
      if (var3 < 0.0F) {
         var3 = 0.0F;
      }

      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = var1 - var2;
      float var5 = Math.abs(var4) * var3;
      return var5 < 0.1F ? var1 : var2 + (var4 > 0.0F ? var5 : -var5);
   }

   public float UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public void UuUVuuUu(float var1) {
      this.UuUVuuUu = var1;
   }

   public float C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public void C00OOC00oO(float var1) {
      this.C00OOC00oO = var1;
   }
}
