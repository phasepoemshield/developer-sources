package ru.metaculture.protection;

public class VUvNnVnU {
   private long UuUVuuUu;
   private double C00OOC00oO;
   private double uUnuvNvvNU;
   private double vVvUvVVuuNvV;
   private double uNNnnnuuuN;
   private UnnNnNvU nuUnNvnuUu;
   private nvvvUNUnuVv VVuuUN;
   private vUNvNVUvUVuU vNUvnnVnUvu;
   private boolean uVUuuVnNVU;

   public VUvNnVnU() {
      this.nuUnNvnuUu = VnuVvnV.nuUnNvnuUu;
      this.VVuuUN = new VVUvVVvNNNUU();
      this.vNUvnnVnUvu = vUNvNVUvUVuU.EASING;
      this.uVUuuVnNVU = false;
   }

   public VUvNnVnU UuUVuuUu(double var1, double var3) {
      return this.UuUVuuUu(var1, var3, VnuVvnV.nuUnNvnuUu, false);
   }

   public VUvNnVnU UuUVuuUu(double var1, double var3, UnnNnNvU var5) {
      return this.UuUVuuUu(var1, var3, var5, false);
   }

   public VUvNnVnU UuUVuuUu(double var1, double var3, nvvvUNUnuVv var5) {
      return this.UuUVuuUu(var1, var3, var5, false);
   }

   public VUvNnVnU UuUVuuUu(double var1, double var3, boolean var5) {
      return this.UuUVuuUu(var1, var3, VnuVvnV.nuUnNvnuUu, var5);
   }

   public VUvNnVnU UuUVuuUu(double var1, double var3, UnnNnNvU var5, boolean var6) {
      if (this.UuUVuuUu(var6, var1)) {
         if (this.vuuuNvNuv()) {
            System.out.println("Animate cancelled due to target val equals from val");
         }

         return this;
      } else {
         this.UuUVuuUu(vUNvNVUvUVuU.EASING)
            .UuUVuuUu(var5)
            .UuUVuuUu(var3 * 1000.0)
            .UuUVuuUu(System.currentTimeMillis())
            .C00OOC00oO(this.uVUuuVnNVU())
            .uUnuvNvvNU(var1);
         if (this.vuuuNvNuv()) {
            System.out
               .println(
                  "#animate {\n    to value: " + this.vNUvnnVnUvu() + "\n    from value: " + this.uVUuuVnNVU() + "\n    duration: " + this.nuUnNvnuUu() + "\n}"
               );
         }

         return this;
      }
   }

   public VUvNnVnU UuUVuuUu(double var1, double var3, nvvvUNUnuVv var5, boolean var6) {
      if (this.UuUVuuUu(var6, var1)) {
         if (this.vuuuNvNuv()) {
            System.out.println("Animate cancelled due to target val equals from val");
         }

         return this;
      } else {
         this.UuUVuuUu(vUNvNVUvUVuU.BEZIER)
            .UuUVuuUu(var5)
            .UuUVuuUu(var3 * 1000.0)
            .UuUVuuUu(System.currentTimeMillis())
            .C00OOC00oO(this.uVUuuVnNVU())
            .uUnuvNvvNU(var1);
         if (this.vuuuNvNuv()) {
            System.out
               .println(
                  "#animate {\n    to value: "
                     + this.vNUvnnVnUvu()
                     + "\n    from value: "
                     + this.uVUuuVnNVU()
                     + "\n    duration: "
                     + this.nuUnNvnuUu()
                     + "\n    type: "
                     + this.nvUVNnuu().name()
                     + "\n}"
               );
         }

         return this;
      }
   }

   public boolean UuUVuuUu() {
      boolean var1 = this.C00OOC00oO();
      if (var1) {
         if (this.nvUVNnuu().equals(vUNvNVUvUVuU.BEZIER)) {
            this.vVvUvVVuuNvV(this.UuUVuuUu(this.VVuuUN(), this.vNUvnnVnUvu(), this.nUUVuvU().UuUVuuUu(this.vVvUvVVuuNvV())));
         } else {
            this.vVvUvVVuuNvV(this.UuUVuuUu(this.VVuuUN(), this.vNUvnnVnUvu(), this.UuuNnUvUuv().ease(this.vVvUvVVuuNvV())));
         }
      } else {
         this.UuUVuuUu(0L);
         this.vVvUvVVuuNvV(this.vNUvnnVnUvu());
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
      return (System.currentTimeMillis() - this.uNNnnnuuuN()) / this.nuUnNvnuUu();
   }

   public boolean UuUVuuUu(boolean var1, double var2) {
      return var1 && this.C00OOC00oO() && (var2 == this.VVuuUN() || var2 == this.vNUvnnVnUvu() || var2 == this.uVUuuVnNVU());
   }

   public double UuUVuuUu(double var1, double var3, double var5) {
      return var1 + (var3 - var1) * var5;
   }

   public long uNNnnnuuuN() {
      return this.UuUVuuUu;
   }

   public double nuUnNvnuUu() {
      return this.C00OOC00oO;
   }

   public double VVuuUN() {
      return this.uUnuvNvvNU;
   }

   public double vNUvnnVnUvu() {
      return this.vVvUvVVuuNvV;
   }

   public double uVUuuVnNVU() {
      return this.uNNnnnuuuN;
   }

   public boolean vuuuNvNuv() {
      return this.uVUuuVnNVU;
   }

   public vUNvNVUvUVuU nvUVNnuu() {
      return this.vNUvnnVnUvu;
   }

   public UnnNnNvU UuuNnUvUuv() {
      return this.nuUnNvnuUu;
   }

   public nvvvUNUnuVv nUUVuvU() {
      return this.VVuuUN;
   }

   public VUvNnVnU UuUVuuUu(long var1) {
      this.UuUVuuUu = var1;
      return this;
   }

   public VUvNnVnU UuUVuuUu(double var1) {
      this.C00OOC00oO = var1;
      return this;
   }

   public VUvNnVnU C00OOC00oO(double var1) {
      this.uUnuvNvvNU = var1;
      return this;
   }

   public VUvNnVnU uUnuvNvvNU(double var1) {
      this.vVvUvVVuuNvV = var1;
      return this;
   }

   public VUvNnVnU vVvUvVVuuNvV(double var1) {
      this.uNNnnnuuuN = var1;
      return this;
   }

   public VUvNnVnU UuUVuuUu(UnnNnNvU var1) {
      this.nuUnNvnuUu = var1;
      return this;
   }

   public VUvNnVnU UuUVuuUu(boolean var1) {
      this.uVUuuVnNVU = var1;
      return this;
   }

   public VUvNnVnU UuUVuuUu(nvvvUNUnuVv var1) {
      this.VVuuUN = var1;
      return this;
   }

   public VUvNnVnU UuUVuuUu(vUNvNVUvUVuU var1) {
      this.vNUvnnVnUvu = var1;
      return this;
   }
}
