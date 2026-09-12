package Nursultan;

import minecraft.class04995;

public class class11300 {
   public static int L(int var0, float var1) {
      return Math.round(Math.clamp(var1, 0.0F, 100.0F) / 100.0F * 255.0F) << 24 | var0 & 16777215;
   }

   public static float[] L(int var0) {
      float var1 = (float)u(var0) / 255.0F;
      float var2 = (float)N(var0) / 255.0F;
      float var3 = (float)i(var0) / 255.0F;
      float var4 = Math.max(var1, Math.max(var2, var3));
      float var5 = Math.min(var1, Math.min(var2, var3));
      float var6 = (var4 + var5) / 2.0F;
      if (var4 == var5) {
         return new float[]{0.0F, 0.0F, var6};
      } else {
         float var7 = var4 - var5;
         float var8 = var6 > 0.5F ? var7 / (2.0F - var4 - var5) : var7 / (var4 + var5);
         float var9;
         if (var4 == var1) {
            var9 = ((var2 - var3) / var7 + (var2 < var3 ? 6.0F : 0.0F)) / 6.0F;
         } else if (var4 == var2) {
            var9 = ((var3 - var1) / var7 + 2.0F) / 6.0F;
         } else {
            var9 = ((var1 - var2) / var7 + 4.0F) / 6.0F;
         }

         return new float[]{var9 * 360.0F, var8, var6};
      }
   }

   private static float L(float var0, float var1, float var2) {
      float var3 = var2;
      if (var2 < 0.0F) {
         var3 = var2 + 1.0F;
      }

      if (var3 > 1.0F) {
         var3--;
      }

      if (var3 < 0.16666667F) {
         return var0 + (var1 - var0) * 6.0F * var3;
      } else if (var3 < 0.5F) {
         return var1;
      } else {
         return var3 < 0.6666667F ? var0 + (var1 - var0) * (0.6666667F - var3) * 6.0F : var0;
      }
   }

   private class11300() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static int i(int var0) {
      return var0 & 0xFF;
   }

   public static int u(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int u(int var0, float var1) {
      return N(var0, Math.round((float)y(var0) * Math.clamp(var1, 0.0F, 1.0F)));
   }

   public static int y(int var0, int var1, int var2, int var3) {
      return var3 << 24 | var0 << 16 | var1 << 8 | var2;
   }

   public static int y(int var0, float var1) {
      int var2 = u(var0);
      int var3 = N(var0);
      int var4 = i(var0);
      int var5 = y(var0);
      return y(Math.max((int)((float)var2 * var1), 0), Math.max((int)((float)var3 * var1), 0), Math.max((int)((float)var4 * var1), 0), var5);
   }

   public static int y(float var0, float var1, float var2) {
      float var3 = (var0 % 360.0F + 360.0F) % 360.0F / 360.0F;
      if (var1 == 0.0F) {
         int var9 = Math.round(var2 * 255.0F);
         return var9 << 16 | var9 << 8 | var9;
      } else {
         float var4 = var2 < 0.5F ? var2 * (1.0F + var1) : var2 + var1 - var2 * var1;
         float var5 = 2.0F * var2 - var4;
         int var6 = Math.round(L(var5, var4, var3 + 0.33333334F) * 255.0F);
         int var7 = Math.round(L(var5, var4, var3) * 255.0F);
         int var8 = Math.round(L(var5, var4, var3 - 0.33333334F) * 255.0F);
         return (var6 & 0xFF) << 16 | (var7 & 0xFF) << 8 | var8 & 0xFF;
      }
   }

   public static int y(int var0, int var1) {
      return y(var0, var0, var0, var1);
   }

   public static int y(int var0) {
      return var0 >>> 24;
   }

   public static int N(int var0, int var1, float var2) {
      int var3 = u(var0);
      int var4 = N(var0);
      int var5 = i(var0);
      int var6 = y(var0);
      int var7 = u(var1);
      int var8 = N(var1);
      int var9 = i(var1);
      int var10 = y(var1);
      return y(class04995.N(var2, var3, var7), class04995.N(var2, var4, var8), class04995.N(var2, var5, var9), class04995.N(var2, var6, var10));
   }

   public static int N(float var0, float var1, float var2) {
      return 0xFF000000 | (int)(var0 * 255.0F) << 16 | (int)(var1 * 255.0F) << 8 | (int)(var2 * 255.0F);
   }

   public static int N(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int N(float var0) {
      int var1 = Math.round(var0 * 85.0F);
      int var2;
      int var3;
      if (var1 < 43) {
         var2 = 255;
         var3 = Math.round((float)var1 * 5.94F);
      } else {
         var2 = Math.round(255.0F - (float)(var1 - 43) * 6.07F);
         var3 = 255;
      }

      return 0xFF000000 | (var2 & 0xFF) << 16 | (var3 & 0xFF) << 8;
   }

   public static int N(int var0, int var1, int var2, int var3) {
      int var4 = (int)((System.currentTimeMillis() / (long)var0 + (long)var1) % 360L);
      var4 = (var4 >= 180 ? 360 - var4 : var4) * 2;
      return N(var2, var3, (float)var4 / 360.0F);
   }

   public static int N(int var0, float var1) {
      int var2 = u(var0);
      int var3 = N(var0);
      int var4 = i(var0);
      int var5 = y(var0);
      int var6 = (int)(1.0 / (1.0 - (double)var1));
      if (var2 == 0 && var3 == 0 && var4 == 0) {
         return y(var6, var6, var6, var5);
      } else {
         if (var2 > 0 && var2 < var6) {
            var2 = var6;
         }

         if (var3 > 0 && var3 < var6) {
            var3 = var6;
         }

         if (var4 > 0 && var4 < var6) {
            var4 = var6;
         }

         return y(Math.min((int)((float)var2 / var1), 255), Math.min((int)((float)var3 / var1), 255), Math.min((int)((float)var4 / var1), 255), var5);
      }
   }

   public static boolean N(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 0xFF;
      int var4 = var0 >> 8 & 0xFF;
      int var5 = var0 & 0xFF;
      int var6 = var1 >> 16 & 0xFF;
      int var7 = var1 >> 8 & 0xFF;
      int var8 = var1 & 0xFF;
      return Math.abs(var3 - var6) <= var2 && Math.abs(var4 - var7) <= var2 && Math.abs(var5 - var8) <= var2;
   }

   public static int N(int var0, int var1) {
      return Math.clamp((long)var1, 0, 255) << 24 | var0 & 16777215;
   }
}
