package ru.metaculture.protection;

public class uNvVuUvnU extends UUVVvUvuNNn {
   private final float uNNnnnuuuN;

   public uNvVuUvnU(int var1, double var2, float var4) {
      super(var1, var2);
      this.uNNnnnuuuN = var4;
   }

   public uNvVuUvnU(int var1, double var2, float var4, uununU var5) {
      super(var1, var2, var5);
      this.uNNnnnuuuN = var4;
   }

   @Override
   protected boolean VVuuUN() {
      return true;
   }

   @Override
   protected double C00OOC00oO(double var1) {
      double var3 = var1 / this.C00OOC00oO;
      float var5 = this.uNNnnnuuuN + 1.0F;
      return Math.max(0.0, 1.0 + var5 * Math.pow(var3 - 1.0, 3.0) + this.uNNnnnuuuN * Math.pow(var3 - 1.0, 2.0));
   }
}
