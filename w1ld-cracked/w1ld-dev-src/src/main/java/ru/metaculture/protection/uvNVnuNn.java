package ru.metaculture.protection;

public class uvNVnuNn {
   private VUuNVnvnVun UuUVuuUu;
   private long C00OOC00oO;
   private long uUnuvNvvNU;
   private long vVvUvVVuuNvV;
   private double uNNnnnuuuN;
   private double nuUnNvnuUu;
   private double VVuuUN;
   private boolean vNUvnnVnUvu;

   public uvNVnuNn(VUuNVnvnVun var1, long var2) {
      this.UuUVuuUu = var1;
      this.vVvUvVVuuNvV = System.currentTimeMillis();
      this.C00OOC00oO = var2;
   }

   public void UuUVuuUu(double var1) {
      this.uUnuvNvvNU = System.currentTimeMillis();
      if (this.C00OOC00oO <= 0L) {
         this.nuUnNvnuUu = var1;
         this.uNNnnnuuuN = var1;
         this.VVuuUN = var1;
         this.vNUvnnVnUvu = true;
      } else {
         if (this.nuUnNvnuUu != var1) {
            this.nuUnNvnuUu = var1;
            this.C00OOC00oO();
         } else {
            this.vNUvnnVnUvu = this.uUnuvNvvNU - this.vVvUvVVuuNvV >= this.C00OOC00oO;
            if (this.vNUvnnVnUvu) {
               this.VVuuUN = var1;
               return;
            }
         }

         double var3 = this.UuUVuuUu();
         double var5 = this.UuUVuuUu.UuUVuuUu().apply(var3);
         if (this.VVuuUN > var1) {
            this.VVuuUN = this.uNNnnnuuuN - (this.uNNnnnuuuN - var1) * var5;
         } else {
            this.VVuuUN = this.uNNnnnuuuN + (var1 - this.uNNnnnuuuN) * var5;
         }

         if (var3 >= 1.0) {
            this.VVuuUN = var1;
            this.vNUvnnVnUvu = true;
         }
      }
   }

   public double UuUVuuUu() {
      if (this.C00OOC00oO <= 0L) {
         return 1.0;
      } else {
         double var1 = (double)(System.currentTimeMillis() - this.vVvUvVVuuNvV) / this.C00OOC00oO;
         return Math.max(0.0, Math.min(1.0, var1));
      }
   }

   public void C00OOC00oO() {
      this.vVvUvVVuuNvV = System.currentTimeMillis();
      this.uNNnnnuuuN = this.VVuuUN;
      this.vNUvnnVnUvu = false;
   }

   public VUuNVnvnVun uUnuvNvvNU() {
      return this.UuUVuuUu;
   }

   public void UuUVuuUu(VUuNVnvnVun var1) {
      this.UuUVuuUu = var1;
   }

   public long vVvUvVVuuNvV() {
      return this.C00OOC00oO;
   }

   public void UuUVuuUu(long var1) {
      this.C00OOC00oO = var1;
   }

   public long uNNnnnuuuN() {
      return this.uUnuvNvvNU;
   }

   public void C00OOC00oO(long var1) {
      this.uUnuvNvvNU = var1;
   }

   public long nuUnNvnuUu() {
      return this.vVvUvVVuuNvV;
   }

   public void uUnuvNvvNU(long var1) {
      this.vVvUvVVuuNvV = var1;
   }

   public double VVuuUN() {
      return this.uNNnnnuuuN;
   }

   public void C00OOC00oO(double var1) {
      this.uNNnnnuuuN = var1;
   }

   public double vNUvnnVnUvu() {
      return this.nuUnNvnuUu;
   }

   public void uUnuvNvvNU(double var1) {
      this.nuUnNvnuUu = var1;
   }

   public double uVUuuVnNVU() {
      return this.VVuuUN;
   }

   public void vVvUvVVuuNvV(double var1) {
      this.VVuuUN = var1;
   }

   public boolean vuuuNvNuv() {
      return this.vNUvnnVnUvu;
   }

   public void UuUVuuUu(boolean var1) {
      this.vNUvnnVnUvu = var1;
   }
}
