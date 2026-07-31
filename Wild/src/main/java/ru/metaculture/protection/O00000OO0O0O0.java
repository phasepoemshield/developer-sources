package ru.metaculture.protection;

public final class O00000OO0O0O0 {
   private static final float O00000000 = 0.001F;
   private final float O000000000;
   private final float O0000000000;
   private final float O00000000000;

   public O00000OO0O0O0(float f, float g, float h) {
      if (!Float.isFinite(f) || f < 0.0F) {
         throw new IllegalArgumentException("positionMargin must be a non-negative finite value");
      } else if (!Float.isFinite(g) || g < 0.0F) {
         throw new IllegalArgumentException("cursorHorizontalOffset must be a non-negative finite value");
      } else if (Float.isFinite(h) && !(h < 0.0F)) {
         this.O000000000 = f;
         this.O0000000000 = g;
         this.O00000000000 = h;
      } else {
         throw new IllegalArgumentException("cursorVerticalOffset must be a non-negative finite value");
      }
   }

   public O00000OO0O0O0.W234 O00000000(double d, double e, float f, float g, int i, int j) {
      return this.O00000000(d, e, f, g, i, j, 1.0F);
   }

   public O00000OO0O0O0.W234 O00000000(double d, double e, float f, float g, int i, int j, float h) {
      float var10 = Math.max(1, i);
      float var11 = Math.max(1, j);
      float var12 = Math.max(0.0F, f);
      float var13 = Math.max(0.0F, g);
      float var14 = O00000000(h);
      float var15 = this.O00000000(d, var10);
      float var16 = this.O00000000(e, var11);
      float var17 = this.O00000000(var15, var12, var10, var14);
      float var18 = this.O000000000(var16, var13, var11, var14);
      return new O00000OO0O0O0.W234(var17, var18);
   }

   private float O00000000(float f, float g, float h, float i) {
      float var5 = this.O000000000;
      float var6 = O000000000(f, var5, Math.max(var5, h - var5));
      float var7 = this.O00000000(h, var5, i);
      float var8 = this.O0000000000(g, h, var5, i);
      if (var8 < var7) {
         float var12 = Math.max(var5, h - var5 - g);
         float var13 = h * 0.5F - g * 0.5F;
         return O000000000(var13, var5, var12);
      } else {
         float var9 = var6 + this.O0000000000;
         if (var9 >= var7 && var9 <= var8) {
            return var9;
         } else {
            float var10 = var6 - this.O0000000000 - g;
            if (var10 >= var7 && var10 <= var8) {
               return var10;
            } else {
               float var11 = var6 - g * 0.5F;
               return O000000000(var11, var7, var8);
            }
         }
      }
   }

   private float O000000000(float f, float g, float h, float i) {
      float var5 = this.O000000000;
      float var6 = O000000000(f, var5, Math.max(var5, h - var5));
      float var7 = this.O00000000(h, var5, i);
      float var8 = this.O00000000000(g, h, var5, i);
      if (var8 < var7) {
         float var12 = Math.max(var5, h - var5 - g);
         float var13 = h * 0.5F - g * 0.5F;
         return O000000000(var13, var5, var12);
      } else {
         float var9 = var6 + this.O00000000000;
         if (var9 >= var7 && var9 <= var8) {
            return var9;
         } else {
            float var10 = var6 - this.O00000000000 - g;
            if (var10 >= var7 && var10 <= var8) {
               return var10;
            } else {
               float var11 = var6 - g * 0.5F;
               return O000000000(var11, var7, var8);
            }
         }
      }
   }

   private float O00000000(float f, float g, float h) {
      float var4 = O00000000(h);
      if (Float.isFinite(var4) && !(var4 <= 0.001F)) {
         float var5 = f * 0.5F;
         return var5 + (g - var5) / var4;
      } else {
         return g;
      }
   }

   private float O0000000000(float f, float g, float h, float i) {
      float var5 = O00000000(i);
      if (Float.isFinite(var5) && !(var5 <= 0.001F)) {
         float var6 = g * 0.5F;
         float var7 = g - h;
         return var6 + (var7 - var6) / var5 - f;
      } else {
         return g - h - f;
      }
   }

   private float O00000000000(float f, float g, float h, float i) {
      float var5 = O00000000(i);
      if (Float.isFinite(var5) && !(var5 <= 0.001F)) {
         float var6 = g * 0.5F;
         float var7 = g - h;
         return var6 + (var7 - var6) / var5 - f;
      } else {
         return g - h - f;
      }
   }

   private float O00000000(double d, float f) {
      float var4 = O00000000(d);
      if (Float.isNaN(var4)) {
         return f * 0.5F;
      } else {
         float var5 = this.O000000000;
         return O000000000(var4, var5, Math.max(var5, f - var5));
      }
   }

   private static float O00000000(double d) {
      if (!Double.isFinite(d)) {
         return Float.NaN;
      } else if (d > Float.MAX_VALUE) {
         return Float.MAX_VALUE;
      } else {
         return d < -Float.MAX_VALUE ? -Float.MAX_VALUE : (float)d;
      }
   }

   private static float O00000000(float f) {
      if (!Float.isFinite(f)) {
         return 1.0F;
      } else {
         return f <= 0.001F ? 1.0F : f;
      }
   }

   private static float O000000000(float f, float g, float h) {
      if (f < g) {
         return g;
      } else {
         return f > h ? h : f;
      }
   }

   public record W234(float x, float y) {
      public W234(float x, float y) {
         if (Float.isFinite(x) && Float.isFinite(y)) {
            this.x = x;
            this.y = y;
         } else {
            throw new IllegalArgumentException("Popup placement coordinates must be finite");
         }
      }
   }
}
