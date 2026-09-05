package ru.metaculture.protection;

public abstract class UUVVvUvuNNn {
   public UVUuUnnvn UuUVuuUu = new UVUuUnnvn();
   protected int C00OOC00oO;
   protected double uUnuvNvvNU;
   protected uununU vVvUvVVuuNvV;

   public UUVVvUvuNNn(int var1, double var2) {
      this.C00OOC00oO = var1;
      this.uUnuvNvvNU = var2;
      this.vVvUvVVuuNvV = uununU.FORWARDS;
   }

   public UUVVvUvuNNn(int var1, double var2, uununU var4) {
      this.C00OOC00oO = var1;
      this.uUnuvNvvNU = var2;
      this.vVvUvVVuuNvV = var4;
   }

   public boolean UuUVuuUu(uununU var1) {
      return this.vVvUvVVuuNvV() && this.vVvUvVVuuNvV.equals(var1);
   }

   public double UuUVuuUu() {
      return 1.0 - (double)this.UuUVuuUu.uUnuvNvvNU() / this.C00OOC00oO * this.uUnuvNvvNU;
   }

   public double C00OOC00oO() {
      return this.uUnuvNvvNU;
   }

   public void UuUVuuUu(double var1) {
      this.uUnuvNvvNU = var1;
   }

   public void uUnuvNvvNU() {
      this.UuUVuuUu.C00OOC00oO();
   }

   public boolean vVvUvVVuuNvV() {
      return this.UuUVuuUu.UuUVuuUu((double)this.C00OOC00oO);
   }

   public void uNNnnnuuuN() {
      this.C00OOC00oO(this.vVvUvVVuuNvV.UuUVuuUu());
   }

   public uununU nuUnNvnuUu() {
      return this.vVvUvVVuuNvV;
   }

   public void C00OOC00oO(uununU var1) {
      if (this.vVvUvVVuuNvV != var1) {
         this.vVvUvVVuuNvV = var1;
         this.UuUVuuUu.UuUVuuUu(System.currentTimeMillis() - (this.C00OOC00oO - Math.min((long)this.C00OOC00oO, this.UuUVuuUu.uUnuvNvvNU())));
      }
   }

   public void UuUVuuUu(int var1) {
      this.C00OOC00oO = var1;
   }

   protected boolean VVuuUN() {
      return false;
   }

   public long vNUvnnVnUvu() {
      return this.UuUVuuUu.uUnuvNvvNU();
   }

   public float uVUuuVnNVU() {
      if (this.vVvUvVVuuNvV == uununU.FORWARDS) {
         return this.vVvUvVVuuNvV() ? (float)this.uUnuvNvvNU : (float)(this.C00OOC00oO(this.UuUVuuUu.uUnuvNvvNU()) * this.uUnuvNvvNU);
      } else if (this.vVvUvVVuuNvV()) {
         return 0.0F;
      } else if (this.VVuuUN()) {
         double var1 = Math.min((long)this.C00OOC00oO, Math.max(0L, this.C00OOC00oO - this.UuUVuuUu.uUnuvNvvNU()));
         return (float)(this.C00OOC00oO(var1) * this.uUnuvNvvNU);
      } else {
         return (float)((1.0 - this.C00OOC00oO(this.UuUVuuUu.uUnuvNvvNU())) * this.uUnuvNvvNU);
      }
   }

   protected abstract double C00OOC00oO(double var1);
}
