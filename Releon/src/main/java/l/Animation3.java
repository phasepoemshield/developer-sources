package l;

public class Animation3 extends Helper467 {
   public Animation3() {
   }

   @Override
   public double method411(double var1) {
      double var3 = var1 / this.ms;
      return var3 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var3, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0 * var3 + 2.0, 2.0)) + 1.0) / 2.0;
   }
}
