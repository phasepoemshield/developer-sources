package ru.metaculture.protection;

import lombok.Generated;

public class VVnnnnN {
   private long UuUVuuUu;
   private double C00OOC00oO;
   private double uUnuvNvvNU;
   private double vVvUvVVuuNvV;
   private double uNNnnnuuuN;
   private double nuUnNvnuUu;
   private nVunNUvNVN VVuuUN = VvVUUNUu.nuUnNvnuUu;
   private boolean vNUvnnVnUvu = false;
   private Runnable uVUuuVnNVU;

   public VVnnnnN UuUVuuUu(double var1, double var3) {
      return this.UuUVuuUu(var1, var3, VvVUUNUu.nuUnNvnuUu, false);
   }

   public VVnnnnN UuUVuuUu(double var1, double var3, nVunNUvNVN var5) {
      return this.UuUVuuUu(var1, var3, var5, false);
   }

   public VVnnnnN UuUVuuUu(double var1, double var3, boolean var5) {
      return this.UuUVuuUu(var1, var3, VvVUUNUu.nuUnNvnuUu, var5);
   }

   public VVnnnnN UuUVuuUu(double var1, double var3, nVunNUvNVN var5, boolean var6) {
      double var7 = Math.max(0.0, var3 * 1000.0);
      if (var7 <= 0.0) {
         this.UuUVuuUu(var5).UuUVuuUu(0.0).UuUVuuUu(0L).C00OOC00oO(var1).uUnuvNvvNU(var1).vVvUvVVuuNvV(var1);
         return this;
      } else if (this.vuuuNvNuv() != var1 || this.VVuuUN() == 0L && this.nvUVNnuu() != var1) {
         if (this.UuUVuuUu(var6, var1)) {
            if (this.UnUNVVVNuv()) {
               System.out.println("Animate cancelled due to target val equals from val");
            }
         } else {
            this.UuUVuuUu(var5).UuUVuuUu(var7).UuUVuuUu(System.currentTimeMillis()).C00OOC00oO(this.nvUVNnuu()).uUnuvNvvNU(var1);
            if (this.UnUNVVVNuv()) {
               System.out
                  .println(
                     "#animate {\n    to value: " + this.vuuuNvNuv() + "\n    from value: " + this.nvUVNnuu() + "\n    duration: " + this.vNUvnnVnUvu() + "\n}"
                  );
            }
         }

         return this;
      } else {
         this.UuUVuuUu(var5).UuUVuuUu(var7);
         return this;
      }
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
      if (!(this.vNUvnnVnUvu() <= 0.0) && this.VVuuUN() != 0L) {
         double var1 = (System.currentTimeMillis() - this.VVuuUN()) / this.vNUvnnVnUvu();
         return Math.max(0.0, Math.min(1.0, var1));
      } else {
         return 1.0;
      }
   }

   public boolean UuUVuuUu(boolean var1, double var2) {
      return var1 && this.C00OOC00oO() && (var2 == this.uVUuuVnNVU() || var2 == this.vuuuNvNuv() || var2 == this.nvUVNnuu());
   }

   public double UuUVuuUu(double var1, double var3, double var5) {
      return var1 + (var3 - var1) * var5;
   }

   public VVnnnnN UuUVuuUu(long var1) {
      this.UuUVuuUu = var1;
      return this;
   }

   public VVnnnnN UuUVuuUu(double var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   public VVnnnnN C00OOC00oO(double var1) {
      this.uUnuvNvvNU = var1;
      return this;
   }

   public VVnnnnN uUnuvNvvNU(double var1) {
      this.vVvUvVVuuNvV = var1;
      return this;
   }

   public VVnnnnN vVvUvVVuuNvV(double var1) {
      this.uNNnnnuuuN = var1;
      return this;
   }

   public VVnnnnN uNNnnnuuuN(double var1) {
      this.nuUnNvnuUu = var1;
      return this;
   }

   public VVnnnnN UuUVuuUu(nVunNUvNVN var1) {
      this.VVuuUN = var1;
      return this;
   }

   public VVnnnnN UuUVuuUu(boolean var1) {
      this.vNUvnnVnUvu = var1;
      return this;
   }

   public VVnnnnN UuUVuuUu(Runnable var1) {
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
      this.UuUVuuUu(var1, 0.0);
      this.UuUVuuUu();
      this.vVvUvVVuuNvV(var1);
   }

   @Generated
   public long VVuuUN() {
      return this.UuUVuuUu;
   }

   @Generated
   public double vNUvnnVnUvu() {
      return this.C00OOC00oO;
   }

   @Generated
   public double uVUuuVnNVU() {
      return this.uUnuvNvvNU;
   }

   @Generated
   public double vuuuNvNuv() {
      return this.vVvUvVVuuNvV;
   }

   @Generated
   public double nvUVNnuu() {
      return this.uNNnnnuuuN;
   }

   @Generated
   public double UuuNnUvUuv() {
      return this.nuUnNvnuUu;
   }

   @Generated
   public nVunNUvNVN nUUVuvU() {
      return this.VVuuUN;
   }

   @Generated
   public boolean UnUNVVVNuv() {
      return this.vNUvnnVnUvu;
   }

   @Generated
   public Runnable vNVuvnUUnuUn() {
      return this.uVUuuVnNVU;
   }
}
