package l;

public class Helper32 extends Helper27 {
   private final float easeAmount;

   public Helper32(int var1, double var2, float var4) {
      super(var1, var2);
      this.easeAmount = var4;
   }

   public Helper32(int var1, double var2, float var4, Helper449 var5) {
      super(var1, var2, var5);
      this.easeAmount = var4;
   }

   @Override
   protected boolean method471() {
      return true;
   }

   @Override
   protected double method473(double var1) {
      float var3 = this.easeAmount + 1.0F;
      return Math.max(0.0, 1.0 + var3 * Math.pow(var1 - 1.0, 3.0) + this.easeAmount * Math.pow(var1 - 1.0, 2.0));
   }
}
