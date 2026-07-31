package ru.metaculture.protection;

public final class O00000OO0000OO {
   private static final float O00000000 = 1.5F;
   private static final float O000000000 = 0.875F;
   private static final float O0000000000 = 0.5625F;
   private static final float O00000000000 = -0.25F;
   private static final float O000000000000 = 0.25F;
   private static final float O0000000000000 = 0.0F;
   private static final float O000000000000O = 0.375F;
   private static final float O00000000000O = -0.25F;
   private static final float O00000000000O0 = 0.25F;
   private static final float O00000000000OO = 0.375F;
   private static final float O0000000000O = 0.75F;
   private static final float O0000000000O0 = -0.5F;
   private static final float O0000000000O00 = -0.25F;
   private static final float O0000000000O0O = 0.25F;
   private static final float O0000000000OO = 0.5F;
   private static final float O0000000000OO0 = -0.25F;
   private static final float O0000000000OOO = 0.25F;
   private static final float O000000000O = 0.75F;
   private static final float O000000000O0 = 1.0F;

   private O00000OO0000OO() {
   }

   public static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, float l, float m, float n) {
      if (o0000O00OO0O0 != null && !(l <= 1.0F) && !(m <= 1.0F) && !(n <= 0.001F)) {
         O000000000(o0000O00OO0O0, f, g, h, i, j, k, l, m, n);
         O00000000(o0000O00OO0O0, j, k, l, m, n);
      }
   }

   public static float[] O00000000(float f, float g, float h, float i, float j, float k) {
      return new float[]{f + j * h, g - k * i};
   }

   public static float[] O000000000(float f, float g, float h, float i, float j, float k) {
      float var6 = O00000000(j / 30.0F * 0.42F, -0.48F, 0.48F);
      float var7 = O00000000(0.875F - k / 90.0F * 0.38F, 0.08F, 0.98F);
      return O00000000(f, g, h, i, var6, var7);
   }

   public static float O00000000(float f, float g) {
      return f - 0.875F * g;
   }

   public static float O000000000(float f, float g) {
      return f - 0.5625F * g;
   }

   public static boolean O0000000000(float f, float g) {
      if (g < 0.0F || g > 1.0F) {
         return false;
      } else if (O0000000000(f, g, -0.25F, 0.25F, 0.75F, 1.0F)) {
         return true;
      } else if (O0000000000(f, g, -0.25F, 0.25F, 0.375F, 0.75F)) {
         return true;
      } else if (O0000000000(f, g, -0.5F, -0.25F, 0.375F, 0.75F)) {
         return true;
      } else if (O0000000000(f, g, 0.25F, 0.5F, 0.375F, 0.75F)) {
         return true;
      } else {
         if (g <= 0.375F) {
            if (f >= -0.25F && f < 0.0F) {
               return true;
            }

            if (f >= 0.0F && f <= 0.25F) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean O0000000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && f <= i && g >= j && g <= k;
   }

   private static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j) {
      int var6 = O00000000(86, 112, 162, Math.round(82.0F * j));
      int var7 = O00000000(58, 78, 118, Math.round(95.0F * j));
      int var8 = O00000000(155, 188, 238, Math.round(65.0F * j));
      O00000000(o0000O00OO0O0, f, g, h, i, -0.25F, 0.0F, 0.0F, 0.375F, var7, var8);
      O00000000(o0000O00OO0O0, f, g, h, i, 0.0F, 0.25F, 0.0F, 0.375F, var7, var8);
      O00000000(o0000O00OO0O0, f, g, h, i, -0.25F, 0.25F, 0.375F, 0.75F, var6, var8);
      O00000000(o0000O00OO0O0, f, g, h, i, -0.5F, -0.25F, 0.375F, 0.75F, var6, var8);
      O00000000(o0000O00OO0O0, f, g, h, i, 0.25F, 0.5F, 0.375F, 0.75F, var6, var8);
      O00000000(o0000O00OO0O0, f, g, h, i, -0.25F, 0.25F, 0.75F, 1.0F, var6, var8);
   }

   private static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, float l, float m, int n, int o) {
      float var11 = f + j * h;
      float var12 = g - m * i;
      float var13 = (k - j) * h;
      float var14 = (m - l) * i;
      o0000O00OO0O0.O00000000(var11, var12, var13, var14, 1.5F, o, 1.0F);
      o0000O00OO0O0.O00000000(var11, var12, var13, var14, 1.5F, n);
   }

   public static void O00000000(
      RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, float l, float m, float n, float o, float p, float q
   ) {
      if (o0000O00OO0O0 != null && !(q <= 0.001F)) {
         float[] var13 = O000000000(f, g, h, i, 0.0F, 0.0F);
         float[] var14 = O000000000(f, g, h, i, j, k);
         float var15 = O00000000(0.875F - m / 90.0F * 0.38F, 0.08F, 0.98F);
         float var16 = O00000000(0.875F - l / 90.0F * 0.38F, 0.08F, 0.98F);
         float var17 = g - Math.max(var15, var16) * i;
         float var18 = g - Math.min(var15, var16) * i;
         float var19 = Math.max(3.0F, var18 - var17);
         o0000O00OO0O0.O00000000(f + -0.25F * h, var17, 0.5F * h, var19, 1.5F, O00000000(95, 210, 255, Math.round(18.0F * q)));
         o0000O00OO0O0.O00000000(f + -0.25F * h, var17, 0.5F * h, var19, 1.5F, O00000000(95, 210, 255, Math.round(55.0F * q)), 1.0F);
         O00000000(o0000O00OO0O0, var13[0], var13[1], O00000000(95, 210, 255, Math.round(200.0F * q)), 5.0F);
         if (Math.abs(j) > 0.05F || Math.abs(k) > 0.05F) {
            O00000000(o0000O00OO0O0, var13[0], var13[1], var14[0], var14[1], O00000000(95, 210, 255, Math.round(100.0F * q)), 1.2F);
            O00000000(o0000O00OO0O0, var14[0], var14[1], O00000000(95, 210, 255, Math.round(220.0F * q)), 4.5F);
         }

         if (n > 0.001F) {
            float var20 = O00000000(j / 30.0F * 0.42F + n * 0.55F, -0.48F, 0.48F);
            float var21 = O00000000(0.875F - k / 90.0F * 0.38F, 0.08F, 0.98F);
            float[] var22 = O00000000(f, g, h, i, var20, var21);
            O00000000(o0000O00OO0O0, var14[0], var14[1], var22[0], var22[1], O00000000(255, 190, 90, Math.round(160.0F * q)), 1.4F);
            O00000000(o0000O00OO0O0, var22[0], var22[1], O00000000(255, 190, 90, Math.round(220.0F * q)), 4.0F);
         }

         O00000000(o0000O00OO0O0, o, p, O00000000(255, 90, 110, Math.round(230.0F * q)), 6.0F);
         o0000O00OO0O0.O00000000(o - 5.0F, p - 5.0F, 10.0F, 10.0F, 1.5F, O00000000(255, 90, 110, Math.round(30.0F * q)));
      }
   }

   private static void O00000000(RenderManager o0000O00OO0O0, float f, float g, int i, float h) {
      o0000O00OO0O0.O00000000(f - h, g - 0.75F, h * 2.0F, 1.5F, 0.0F, i);
      o0000O00OO0O0.O00000000(f - 0.75F, g - h, 1.5F, h * 2.0F, 0.0F, i);
      o0000O00OO0O0.O00000000(f - 1.5F, g - 1.5F, 3.0F, 3.0F, 0.0F, O00000000(255, 255, 255, 220));
   }

   private static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, int j, float k) {
      float var7 = h - f;
      float var8 = i - g;
      float var9 = (float)Math.hypot(var7, var8);
      if (!(var9 < 1.0F)) {
         float var10 = (f + h) * 0.5F;
         float var11 = (g + i) * 0.5F;
         float var12 = (float)Math.toDegrees(Math.atan2(var8, var7));
         o0000O00OO0O0.O00000000(var10, var11);
         o0000O00OO0O0.O000000000(var12);
         o0000O00OO0O0.O00000000(-var9 * 0.5F, -k * 0.5F, var9, k, 0.0F, j);
         o0000O00OO0O0.O00000000000O();
         o0000O00OO0O0.O00000000000O();
      }
   }

   private static void O000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k, float l, float m, float n) {
      float var10 = k - m;
      o0000O00OO0O0.O000000000(
         j - l * 0.52F, var10 - 4.0F, l * 1.04F, m + 10.0F, 1.5F, O00000000(70, 95, 140, Math.round(10.0F * n)), O00000000(10, 14, 22, Math.round(4.0F * n))
      );
      o0000O00OO0O0.O00000000(j - l * 0.25F, k - 1.0F, l * 0.5F, 6.0F, 1.5F, 10.0F, 1.0F, O00000000(95, 160, 255, Math.round(20.0F * n)));
      o0000O00OO0O0.O00000000(f + 10.0F, k, h - 20.0F, 1.0F, 0.0F, O00000000(120, 170, 255, Math.round(45.0F * n)));
   }

   private static int O00000000(int i, int j, int k, int l) {
      return (l & 0xFF) << 24 | (i & 0xFF) << 16 | (j & 0xFF) << 8 | k & 0xFF;
   }

   private static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }
}
