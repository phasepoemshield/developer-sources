package ru.metaculture.protection;

public class Ii11lii1l1l1 {
   long UuUVuuUu;
   public float C00OOC00oO;
   public float uUnuvNvvNU;
   public float vVvUvVVuuNvV;

   public Ii11lii1l1l1(float var1, float var2, float var3) {
      this.C00OOC00oO = var1;
      this.uUnuvNvvNU = var2;
      this.vVvUvVVuuNvV = var3;
      this.UuUVuuUu = System.currentTimeMillis();
   }

   public float UuUVuuUu() {
      if (Math.abs(this.C00OOC00oO - this.uUnuvNvvNU) < 1.0E-4) {
         this.C00OOC00oO = this.uUnuvNvvNU;
      }

      int var1;
      if ((var1 = (int)(Math.min((float)(System.currentTimeMillis() - this.UuUVuuUu), 400.0F) / 5.0F)) > 0) {
         this.UuUVuuUu = System.currentTimeMillis();
      }

      for (int var2 = 0; var2 < var1; var2++) {
         this.C00OOC00oO = UuvVnuU.VVuuUN(this.C00OOC00oO, this.uUnuvNvvNU, this.vVvUvVVuuNvV);
      }

      return this.C00OOC00oO;
   }

   public float C00OOC00oO() {
      if (Math.abs(this.C00OOC00oO - this.uUnuvNvvNU) > 1.0E-4) {
         int var1 = (int)(Math.min((float)(System.currentTimeMillis() - this.UuUVuuUu), 400.0F) / 5.0F);
         if (var1 > 0) {
            this.UuUVuuUu = System.currentTimeMillis();
         }

         for (int var2 = 0; var2 < var1; var2++) {
            this.C00OOC00oO = (float)this.UuUVuuUu(this.C00OOC00oO, this.uUnuvNvvNU, this.vVvUvVVuuNvV);
         }
      }

      return UuvVnuU.UuUVuuUu(this.C00OOC00oO);
   }

   public void UuUVuuUu(float var1) {
      this.C00OOC00oO = var1;
      this.UuUVuuUu = System.currentTimeMillis();
   }

   double UuUVuuUu(float var1, float var2, float var3) {
      float var4 = (var2 - var1 + 180.0F) % 360.0F - 180.0F;
      return var4 * var3 + var1;
   }
}
