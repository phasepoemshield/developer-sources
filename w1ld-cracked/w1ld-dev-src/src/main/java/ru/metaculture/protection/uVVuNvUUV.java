package ru.metaculture.protection;

public class uVVuNvUUV {
   private long UuUVuuUu;
   private double C00OOC00oO;
   private double uUnuvNvvNU;
   private double vVvUvVVuuNvV;
   private double uNNnnnuuuN;
   private double nuUnNvnuUu;
   private UnnNnNvU VVuuUN = VnuVvnV.UNnVVNvvnVvU;
   private boolean vNUvnnVnUvu = false;
   private Runnable uVUuuVnNVU;

   public uVVuNvUUV UuUVuuUu(double var1, double var3) {
      return this.UuUVuuUu(var1, var3, VnuVvnV.UNnVVNvvnVvU, false);
   }

   public uVVuNvUUV UuUVuuUu(double var1, double var3, UnnNnNvU var5) {
      return this.UuUVuuUu(var1, var3, var5, false);
   }

   public uVVuNvUUV UuUVuuUu(double var1, double var3, boolean var5) {
      return this.UuUVuuUu(var1, var3, VnuVvnV.UNnVVNvvnVvU, var5);
   }

   public uVVuNvUUV UuUVuuUu(double var1, double var3, UnnNnNvU var5, boolean var6) {
      if (this.UuUVuuUu(var6, var1)) {
         if (this.UnUNVVVNuv()) {
            System.out.println("Animate cancelled due to target val equals from val");
         }
      } else {
         this.UuUVuuUu(var5).UuUVuuUu(var3 * 1000.0).UuUVuuUu(System.currentTimeMillis()).C00OOC00oO(this.nvUVNnuu()).uUnuvNvvNU(var1);
         if (this.UnUNVVVNuv()) {
            System.out
               .println(
                  "#animate {\n    to value: " + this.vuuuNvNuv() + "\n    from value: " + this.nvUVNnuu() + "\n    duration: " + this.vNUvnnVnUvu() + "\n}"
               );
         }
      }

      return this;
   }

   public boolean UuUVuuUu() {
      this.uNNnnnuuuN(this.nvUVNnuu());
      boolean var1 = this.C00OOC00oO();
      if (var1) {
         this.vVvUvVVuuNvV(this.UuUVuuUu(this.uVUuuVnNVU(), this.vuuuNvNuv(), this.nUUVuvU().ease(this.vVvUvVVuuNvV())));
      } else {
         this.UuUVuuUu(0L);
         this.vVvUvVVuuNvV(this.vuuuNvNuv());
         if (this.uVUuuVnNVU != null) {
            this.uVUuuVnNVU.run();
            this.uVUuuVnNVU = null;
         }
      }

      return var1;
   }

   public boolean C00OOC00oO() {
      return !this.uUnuvNvvNU();
   }

   public boolean uUnuvNvvNU() {
      return this.vVvUvVVuuNvV() >= 1.0;
   }

   public double vVvUvVVuuNvV() {
      return this.C00OOC00oO == 0.0 ? 1.0 : (System.currentTimeMillis() - this.VVuuUN()) / this.vNUvnnVnUvu();
   }

   public boolean UuUVuuUu(boolean var1, double var2) {
      return var1 && this.C00OOC00oO() && (var2 == this.uVUuuVnNVU() || var2 == this.vuuuNvNuv() || var2 == this.nvUVNnuu());
   }

   public double UuUVuuUu(double var1, double var3, double var5) {
      return var1 + (var3 - var1) * var5;
   }

   public uVVuNvUUV UuUVuuUu(long var1) {
      this.UuUVuuUu = var1;
      return this;
   }

   public uVVuNvUUV UuUVuuUu(double var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   public uVVuNvUUV C00OOC00oO(double var1) {
      this.uUnuvNvvNU = var1;
      return this;
   }

   public uVVuNvUUV uUnuvNvvNU(double var1) {
      this.vVvUvVVuuNvV = var1;
      return this;
   }

   public uVVuNvUUV vVvUvVVuuNvV(double var1) {
      this.uNNnnnuuuN = var1;
      return this;
   }

   public uVVuNvUUV uNNnnnuuuN(double var1) {
      this.nuUnNvnuUu = var1;
      return this;
   }

   public uVVuNvUUV UuUVuuUu(UnnNnNvU var1) {
      this.VVuuUN = var1;
      return this;
   }

   public uVVuNvUUV UuUVuuUu(boolean var1) {
      this.vNUvnnVnUvu = var1;
      return this;
   }

   public uVVuNvUUV UuUVuuUu(Runnable var1) {
      this.uVUuuVnNVU = var1;
      return this;
   }

   public float uNNnnnuuuN() {
      return (float)this.nvUVNnuu();
   }

   public float nuUnNvnuUu() {
      return (float)this.UuuNnUvUuv();
   }

   public void nuUnNvnuUu(double var1) {
      this.UuUVuuUu(var1, 1.0E-13);
      this.UuUVuuUu();
      this.vVvUvVVuuNvV(var1);
   }

   public long VVuuUN() {
      return this.UuUVuuUu;
   }

   public double vNUvnnVnUvu() {
      return this.C00OOC00oO;
   }

   public double uVUuuVnNVU() {
      return this.uUnuvNvvNU;
   }

   public double vuuuNvNuv() {
      return this.vVvUvVVuuNvV;
   }

   public double nvUVNnuu() {
      return this.uNNnnnuuuN;
   }

   public double UuuNnUvUuv() {
      return this.nuUnNvnuUu;
   }

   public UnnNnNvU nUUVuvU() {
      return this.VVuuUN;
   }

   public boolean UnUNVVVNuv() {
      return this.vNUvnnVnUvu;
   }
}
