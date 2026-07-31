package l;

public class Helper354 {
   private static final Helper354 INSTANCE = new Helper354();
   private static final int SIN_TABLE_SIZE = 65536;
   private static final float[] SIN_TABLE = new float[65536];
   private static final float SIN_TO_INDEX = 10430.378F;
   private static final int SQRT_TABLE_SIZE = 10000;
   private static final float[] SQRT_TABLE = new float[10000];

   private Helper354() {
   }

   public static Helper354 method3555() {
      return INSTANCE;
   }

   public static float method3556(float var0) {
      return SIN_TABLE[(int)(var0 * 10430.378F) & 65535];
   }

   public static float method3557(float var0) {
      return SIN_TABLE[(int)((var0 + (Math.PI / 2)) * 10430.378F) & 65535];
   }

   public static float method3558(float var0) {
      if (var0 < 0.0F) {
         return 0.0F;
      } else {
         return var0 >= 10000.0F ? (float)Math.sqrt(var0) : SQRT_TABLE[(int)var0];
      }
   }

   public static double method3559(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = var6 - var0;
      double var14 = var8 - var2;
      double var16 = var10 - var4;
      return var12 * var12 + var14 * var14 + var16 * var16;
   }

   public static double method3560(double var0, double var2, double var4, double var6) {
      double var8 = var4 - var0;
      double var10 = var6 - var2;
      return var8 * var8 + var10 * var10;
   }

   public static float method3561(float var0) {
      float var1 = var0 % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   public static float method3562(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   public static float method3563(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   public static int method3564(int var0, int var1, int var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   public static boolean method3565(double var0, double var2, double var4) {
      return var0 >= var2 && var0 <= var4;
   }

   static {
      for (int var0 = 0; var0 < 65536; var0++) {
         SIN_TABLE[var0] = (float)Math.sin(var0 / 10430.378F);
      }

      for (int var1 = 0; var1 < 10000; var1++) {
         SQRT_TABLE[var1] = (float)Math.sqrt(var1);
      }
   }
}
