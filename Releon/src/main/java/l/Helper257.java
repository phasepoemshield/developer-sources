package l;

final class Helper257 {
   final double x;
   final double y;
   final double z;
   final long startMs;
   final long lifeMs;
   final float scaleFrom;
   final float scaleTo;
   final long seed;

   Helper257(double var1, double var3, double var5, long var7, long var9, float var11, float var12) {
      this.x = var1;
      this.y = var3;
      this.z = var5;
      this.startMs = var7;
      this.lifeMs = var9;
      this.scaleFrom = var11;
      this.scaleTo = var12;
      this.seed = var7 ^ Double.doubleToLongBits(var1 * 31.0 + var3 * 17.0 + var5 * 13.0);
   }
}
