package ru.metaculture.protection;

public class NVNuuvUNNuVN {
   private double UuUVuuUu;
   private double C00OOC00oO;

   public NVNuuvUNNuVN(double var1, double var3) {
      this.C00OOC00oO(var1);
      this.uUnuvNvvNU(var3);
   }

   public NVNuuvUNNuVN(NVNuuvUNNuVN var1) {
      this.C00OOC00oO(var1.C00OOC00oO());
      this.uUnuvNvvNU(var1.uUnuvNvvNU());
   }

   public NVNuuvUNNuVN UuUVuuUu() {
      return new NVNuuvUNNuVN(this);
   }

   public NVNuuvUNNuVN UuUVuuUu(double var1, double var3) {
      this.C00OOC00oO(var1);
      this.uUnuvNvvNU(var3);
      return this;
   }

   public NVNuuvUNNuVN C00OOC00oO(double var1, double var3) {
      this.C00OOC00oO(this.C00OOC00oO() * var1);
      this.uUnuvNvvNU(this.uUnuvNvvNU() * var3);
      return this;
   }

   public NVNuuvUNNuVN UuUVuuUu(double var1) {
      this.C00OOC00oO(this.C00OOC00oO() * var1);
      this.uUnuvNvvNU(this.uUnuvNvvNU() * var1);
      return this;
   }

   public NVNuuvUNNuVN uUnuvNvvNU(double var1, double var3) {
      this.C00OOC00oO(this.C00OOC00oO() + var1);
      this.uUnuvNvvNU(this.uUnuvNvvNU() + var3);
      return this;
   }

   public NVNuuvUNNuVN UuUVuuUu(NVNuuvUNNuVN var1) {
      this.C00OOC00oO(var1.C00OOC00oO());
      this.uUnuvNvvNU(var1.uUnuvNvvNU());
      return this;
   }

   public NVNuuvUNNuVN C00OOC00oO(NVNuuvUNNuVN var1) {
      this.C00OOC00oO(this.C00OOC00oO() + var1.C00OOC00oO());
      this.uUnuvNvvNU(this.uUnuvNvvNU() + var1.uUnuvNvvNU());
      return this;
   }

   public double C00OOC00oO() {
      return this.UuUVuuUu;
   }

   public double uUnuvNvvNU() {
      return this.C00OOC00oO;
   }

   public void C00OOC00oO(double var1) {
      this.UuUVuuUu = var1;
   }

   public void uUnuvNvvNU(double var1) {
      this.C00OOC00oO = var1;
   }
}
