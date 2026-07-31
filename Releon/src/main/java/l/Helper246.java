package l;

final class Helper246 {
   final double x;
   final double y;
   final double z;
   float alpha;
   final long time;

   Helper246(double var1, double var3, double var5) {
      this.x = var1;
      this.y = var3;
      this.z = var5;
      this.time = System.currentTimeMillis();
   }

   double method2362(double var1, double var3, double var5) {
      double var7 = this.x - var1;
      double var9 = this.y - var3;
      double var11 = this.z - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }
}
