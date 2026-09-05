package ru.metaculture.protection;

public class NnvNuVNNVNvu extends UUVVvUvuNNn {
   float uNNnnnuuuN;
   float nuUnNvnuUu;
   boolean VVuuUN;

   public NnvNuVNNVNvu(int var1, double var2, float var4, float var5, boolean var6) {
      super(var1, var2);
      this.uNNnnnuuuN = var4;
      this.nuUnNvnuUu = var5;
      this.VVuuUN = var6;
   }

   public NnvNuVNNVNvu(int var1, double var2, float var4, float var5, boolean var6, uununU var7) {
      super(var1, var2, var7);
      this.uNNnnnuuuN = var4;
      this.nuUnNvnuUu = var5;
      this.VVuuUN = var6;
   }

   @Override
   protected double C00OOC00oO(double var1) {
      double var3 = Math.pow(var1 / this.C00OOC00oO, this.nuUnNvnuUu);
      double var5 = this.uNNnnnuuuN * 0.1F;
      return Math.pow(2.0, -10.0 * (this.VVuuUN ? Math.sqrt(var3) : var3)) * Math.sin((var3 - var5 / 4.0) * ((Math.PI * 2) / var5)) + 1.0;
   }
}
