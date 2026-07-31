package ru.metaculture.protection;

import net.minecraft.util.math.MathHelper;

public class O0000O00OOO000 {
   private static final double O00000000 = 0.1;

   public static double O00000000() {
      return Math.min((double)O0000O00O0O000.O00000000().O0000000000(), 0.1);
   }

   public static float O00000000(float f, float g, float h) {
      return (1.0F - MathHelper.clamp((float)(O00000000() * h), 0.0F, 1.0F)) * f + MathHelper.clamp((float)(O00000000() * h), 0.0F, 1.0F) * g;
   }

   public static float O000000000(float f, float g, float h) {
      float var3 = (g - f) * MathHelper.clamp((float)(O00000000() * 15.0), 0.0F, 1.0F);
      if (var3 > 0.0F) {
         var3 = Math.max(h, var3);
         var3 = Math.min(g - f, var3);
      } else if (var3 < 0.0F) {
         var3 = Math.min(-h, var3);
         var3 = Math.max(g - f, var3);
      }

      return f + var3;
   }

   public static double O00000000(double d, double e, double f) {
      return e + (d - e) * f;
   }

   public static float O00000000(float f, float g, float h, double d) {
      float var5 = g - f;
      if (h < 1.0F) {
         h = 1.0F;
      }

      if (h > 100.0F) {
         h = 16.666666F;
      }

      double var6 = Math.max(d * h / 16.666666F, 0.5);
      if (var5 > d) {
         if ((g = (float)(g - var6)) < f) {
            g = f;
         }
      } else if (var5 < -d) {
         if ((g = (float)(g + var6)) > f) {
            g = f;
         }
      } else {
         g = f;
      }

      return g;
   }

   public static float O00000000(float f, float g, float h, float i, float j) {
      float var5 = (g - f) * MathHelper.clamp(j, 0.0F, 1.0F);
      if (var5 < 0.0F) {
         var5 = MathHelper.clamp(var5, -i, -h);
      } else {
         var5 = MathHelper.clamp(var5, h, i);
      }

      return Math.abs(var5) > Math.abs(g - f) ? g : f + var5;
   }

   public static double O000000000(double d, double e, double f) {
      boolean var6 = d > e;
      if (f < 0.0) {
         f = 0.0;
      } else if (f > 1.0) {
         f = 1.0;
      }

      double var7 = Math.max(d, e) - Math.min(d, e);
      double var9 = var7 * f;
      if (var9 < 0.1) {
         var9 = 0.1;
      }

      if (var6) {
         e += var9;
      } else {
         e -= var9;
      }

      return e;
   }
}
