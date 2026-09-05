package ru.metaculture.protection;

public final class nnunnunvvuv {
   private double UuUVuuUu;
   private double C00OOC00oO;
   private double uUnuvNvvNU;
   private double vVvUvVVuuNvV;
   private double uNNnnnuuuN;
   private double nuUnNvnuUu;
   private double VVuuUN;
   private double vNUvnnVnUvu;
   private double uVUuuVnNVU;
   private double vuuuNvNuv;
   private double nvUVNnuu;
   private double UuuNnUvUuv;

   public void UuUVuuUu(c0O00CcoCc0c.NVnVnNnN var1) {
      this.UuUVuuUu(var1.x(), var1.y(), var1.z(), var1.yaw(), var1.width(), var1.height());
   }

   public void UuUVuuUu(double var1, double var3, double var5, float var7, float var8, float var9) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var3;
      this.uUnuvNvvNU = var5;
      double var10 = Math.toRadians(var7);
      this.vVvUvVVuuNvV = Math.cos(var10);
      this.uNNnnnuuuN = Math.sin(var10);
      this.nuUnNvnuUu = -Math.sin(var10);
      this.VVuuUN = Math.cos(var10);
      this.vNUvnnVnUvu = var8 * 0.5;
      this.uVUuuVnNVU = var9 * 0.5;
   }

   public double UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public double C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public double uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public double vVvUvVVuuNvV() {
      return this.vNUvnnVnUvu;
   }

   public double uNNnnnuuuN() {
      return this.uVUuuVnNVU;
   }

   public double UuUVuuUu(double var1, double var3) {
      return this.UuUVuuUu + this.vVvUvVVuuNvV * var1 + this.nuUnNvnuUu * var3;
   }

   public double UuUVuuUu(double var1) {
      return this.C00OOC00oO + var1;
   }

   public double C00OOC00oO(double var1, double var3) {
      return this.uUnuvNvvNU + this.uNNnnnuuuN * var1 + this.VVuuUN * var3;
   }

   public boolean UuUVuuUu(double var1, double var3, double var5, double var7, double var9, double var11) {
      double var13 = var7 * this.nuUnNvnuUu + var11 * this.VVuuUN;
      if (Math.abs(var13) < 1.0E-6) {
         return false;
      } else {
         double var15 = ((this.UuUVuuUu - var1) * this.nuUnNvnuUu + (this.uUnuvNvvNU - var5) * this.VVuuUN) / var13;
         if (var15 <= 0.0) {
            return false;
         } else {
            double var17 = var1 + var7 * var15 - this.UuUVuuUu;
            double var19 = var3 + var9 * var15 - this.C00OOC00oO;
            double var21 = var5 + var11 * var15 - this.uUnuvNvvNU;
            this.vuuuNvNuv = var17 * this.vVvUvVVuuNvV + var21 * this.uNNnnnuuuN;
            this.nvUVNnuu = var19;
            this.UuuNnUvUuv = var15;
            return true;
         }
      }
   }

   public double nuUnNvnuUu() {
      return this.vuuuNvNuv;
   }

   public double VVuuUN() {
      return this.nvUVNnuu;
   }

   public double vNUvnnVnUvu() {
      return this.UuuNnUvUuv;
   }

   public float uVUuuVnNVU() {
      return (float)((this.vuuuNvNuv + this.vNUvnnVnUvu) / (this.vNUvnnVnUvu * 2.0));
   }

   public float vuuuNvNuv() {
      return (float)((this.uVUuuVnNVU - this.nvUVNnuu) / (this.uVUuuVnNVU * 2.0));
   }

   public double nvUVNnuu() {
      return Math.min(0.45, Math.min(this.vNUvnnVnUvu, this.uVUuuVnNVU) * 0.14);
   }

   public static double uUnuvNvvNU(double var0, double var2) {
      return Math.min(0.4, Math.min(var0, var2) * 0.22);
   }

   public double UuuNnUvUuv() {
      return Math.min(0.55, this.uVUuuVnNVU * 0.24);
   }

   public double nUUVuvU() {
      return this.UuuNnUvUuv() * 16.0 / 9.0;
   }

   public double UnUNVVVNuv() {
      return this.nUUVuvU() + this.UuuNnUvUuv() * 0.18;
   }

   public double vNVuvnUUnuUn() {
      return this.uVUuuVnNVU + this.nvUVNnuu() * 0.5;
   }

   public double UvnvNVnnnnNU() {
      return this.vNVuvnUUnuUn() + this.UuuNnUvUuv();
   }

   public double UuUVuuUu(int var1) {
      return -this.vNUvnnVnUvu + var1 * this.UnUNVVVNuv();
   }

   public boolean uVUVnuvnuVuv() {
      return this.nvUVNnuu >= this.vNVuvnUUnuUn() && this.nvUVNnuu <= this.UvnvNVnnnnNU() && Math.abs(this.vuuuNvNuv) <= this.vNUvnnVnUvu;
   }

   public int NVNnnvnuunNv() {
      double var1 = this.vuuuNvNuv + this.vNUvnnVnUvu;
      if (var1 < 0.0) {
         return -1;
      } else {
         int var3 = (int)(var1 / this.UnUNVVVNuv());
         return var1 - var3 * this.UnUNVVVNuv() <= this.nUUVuvU() ? var3 : -1;
      }
   }

   public double uVunuUNVVUUV() {
      return this.vNUvnnVnUvu * 0.5;
   }

   public double UNnVVNvvnVvU() {
      return -this.uVUuuVnNVU - 0.06;
   }

   public double uNnUnnuNUnNu() {
      return -this.uVUuuVnNVU - 0.14;
   }

   public double NnUuNNU() {
      return this.uNnUnnuNUnNu() - 0.12;
   }

   public double nNvNUVU() {
      return Math.min(0.6, Math.min(this.vNUvnnVnUvu, this.uVUuuVnNVU));
   }

   public boolean UnUNuUU() {
      return Math.abs(this.vuuuNvNuv) <= this.vNUvnnVnUvu && Math.abs(this.nvUVNnuu) <= this.uVUuuVnNVU;
   }

   public boolean uUVuVvuNUvnu() {
      return Math.abs(this.vuuuNvNuv) <= this.uVunuUNVVUUV() && this.nvUVNnuu <= this.UNnVVNvvnVvU() && this.nvUVNnuu >= this.NnUuNNU();
   }

   public boolean UvUvUNuvNU() {
      double var1 = this.nNvNUVU();
      return this.vuuuNvNuv >= this.vNUvnnVnUvu - var1
         && this.vuuuNvNuv <= this.vNUvnnVnUvu
         && this.nvUVNnuu >= -this.uVUuuVnNVU
         && this.nvUVNnuu <= -this.uVUuuVnNVU + var1;
   }
}
