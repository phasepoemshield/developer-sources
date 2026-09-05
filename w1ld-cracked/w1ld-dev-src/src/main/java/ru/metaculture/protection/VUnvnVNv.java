package ru.metaculture.protection;

public class VUnvnVNv extends UUVVvUvuNNn {
   public VUnvnVNv(int var1, double var2) {
      super(var1, var2);
   }

   public VUnvnVNv(int var1, double var2, uununU var4) {
      super(var1, var2, var4);
   }

   @Override
   protected double C00OOC00oO(double var1) {
      double var3 = var1 / this.C00OOC00oO;
      return var3 < 0.5 ? 2.0 * Math.pow(var3, 2.0) : 1.0 - Math.pow(-2.0 * var3 + 2.0, 2.0) / 2.0;
   }
}
