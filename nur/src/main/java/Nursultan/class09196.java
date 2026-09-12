package Nursultan;

public record class09196(float deltaH, float ratioS, float ratioL, int alpha) {
   public static Object i_0;

   public float L() {
      return this.deltaH;
   }

   static {
      Z();
   }

   private static void Z() {
      i_0 = 0.001F;
   }

   public float u() {
      return this.ratioL;
   }

   public int y() {
      return this.alpha;
   }

   public int N(int var1) {
      float[] var2 = class11300.L(var1);
      float var3 = var2[0] + this.deltaH;
      float var4 = Math.clamp(var2[1] * this.ratioS, 0.0F, 1.0F);
      float var5 = Math.clamp(var2[2] * this.ratioL, 0.0F, 1.0F);
      int var6 = class11300.y(var3, var4, var5);
      return this.alpha << 24 | var6 & 16777215;
   }

   public static class09196 N(int var0, int var1) {
      float[] var2 = class11300.L(var0);
      float[] var3 = class11300.L(var1);
      float var4 = var3[0] - var2[0];
      float var5 = var2[1] > 0.001F ? var3[1] / var2[1] : var3[1];
      float var6 = var2[2] > 0.001F ? var3[2] / var2[2] : var3[2];
      int var7 = var1 >>> 24 & 0xFF;
      return new class09196(var4, var5, var6, var7);
   }

   public float N() {
      return this.ratioS;
   }
}
