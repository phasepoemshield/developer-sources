package ru.metaculture.protection;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.Random;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import net.minecraft.entity.Entity;
import org.joml.Vector3d;

public class O0000O00OO0OO0 {
   public static MinecraftClient O00000000 = MinecraftClient.getInstance();
   private static final Random O0000000000 = new Random();
   public static int O000000000 = 2;
   private static final double O00000000000 = Double.longBitsToDouble(4805340802404319232L);
   private static final double[] O000000000000 = new double[257];
   private static final double[] O0000000000000 = new double[257];

   public static double O00000000(double d, double e, double f) {
      return e + d * (f - e);
   }

   public static double O00000000(double d, int i) {
      return new BigDecimal(d).setScale(i, RoundingMode.HALF_EVEN).doubleValue();
   }

   public static float O00000000(float f, float g, float h) {
      return (f - g) / (h - g);
   }

   public static double O00000000(double d, double e) {
      return Math.random() * (e - d) + d;
   }

   public static float O00000000(float f, float g) {
      return (float)(Math.random() * (g - f) + f);
   }

   public static boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && g >= i && f < h + j && g < i + k;
   }

   public static double O00000000(double d) {
      return new BigDecimal(d).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
   }

   public static double O000000000(double d, double e, double f) {
      return d + (e - d) * f;
   }

   public static float O00000000(float f) {
      if ((f = f % 360.0F) >= 180.0F) {
         f -= 360.0F;
      }

      if (f < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   public static float O000000000(float f, float g) {
      return (float)(f + Math.random() * (g - f));
   }

   public static double O000000000(double d) {
      return d * d;
   }

   public static double O000000000(double d, double e) {
      return Math.sqrt(O000000000(d) - O000000000(e));
   }

   public static float O000000000(float f) {
      return f * 9.0F / 16.0F;
   }

   public static float O0000000000(float f) {
      return f * 16.0F / 9.0F;
   }

   public static int O00000000(int i) {
      Window var1 = MinecraftClient.getInstance().getWindow();
      return (int)((double)i * var1.getScaleFactor() / O000000000);
   }

   public static double O0000000000(double d, double e) {
      double var4 = e * e + d * d;
      if (Double.isNaN(var4)) {
         return Double.NaN;
      } else {
         boolean var6 = d < 0.0;
         if (var6) {
            d = -d;
         }

         boolean var7 = e < 0.0;
         if (var7) {
            e = -e;
         }

         boolean var8 = d > e;
         if (var8) {
            double var9 = e;
            e = d;
            d = var9;
         }

         double var28 = O0000000000(var4);
         e *= var28;
         d *= var28;
         double var11 = O00000000000 + d;
         int var13 = (int)Double.doubleToRawLongBits(var11);
         double var14 = O000000000000[var13];
         double var16 = O0000000000000[var13];
         double var18 = var11 - O00000000000;
         double var20 = d * var16 - e * var18;
         double var22 = (6.0 + var20 * var20) * var20 * 0.16666666666666666;
         double var24 = var14 + var22;
         if (var8) {
            var24 = (Math.PI / 2) - var24;
         }

         if (var7) {
            var24 = Math.PI - var24;
         }

         if (var6) {
            var24 = -var24;
         }

         return var24;
      }
   }

   public static double O0000000000(double d) {
      double var2 = 0.5 * d;
      long var4 = Double.doubleToRawLongBits(d);
      var4 = 6910469410427058090L - (var4 >> 1);
      d = Double.longBitsToDouble(var4);
      return d * (1.5 - var2 * d * d);
   }

   public static double O00000000000(double d, double e) {
      return Math.abs(e - d) > Math.abs(d - e) ? Math.abs(d - e) : Math.abs(e - d);
   }

   public static double O000000000(double d, int i) {
      return d < 0.5 ? 2.0 * d * d : 1.0 - Math.pow(-2.0 * d + 2.0, i) / 2.0;
   }

   public static float O00000000(float f, int i) {
      if (i < 0) {
         throw new IllegalArgumentException("Decimal places must be non-negative");
      } else {
         double var2 = Math.pow(10.0, i);
         return (float)(Math.round(f * var2) / var2);
      }
   }

   public static double O00000000(Vector3d vector3d, Vector3d vector3d2) {
      double var2 = vector3d2.x - vector3d.x;
      double var4 = vector3d2.z - vector3d.z;
      return Math.sqrt(var2 * var2 + var4 * var4);
   }

   public float O00000000000(float f) {
      Window var2 = MinecraftClient.getInstance().getWindow();
      return f * (int)((double)f * var2.getScaleFactor() / O000000000);
   }

   public static int O00000000000(double d) {
      int var2 = (int)d;
      return d > var2 ? var2 + 1 : var2;
   }

   public double O000000000000(double d) {
      Window var3 = MinecraftClient.getInstance().getWindow();
      return d * (int)(d * var3.getScaleFactor() / O000000000);
   }

   public static float O000000000000(float f) {
      return O0000000000000(f) * O00000000();
   }

   public static float O00000000() {
      return (float)(O000000000() * 0.15);
   }

   public static float O000000000() {
      float var0;
      return (var0 = (float)((Double)O00000000.options.getMouseSensitivity().getValue() * 0.6 + 0.2)) * var0 * var0 * 8.0F;
   }

   public static float O0000000000000(float f) {
      return Math.round(f / O00000000());
   }

   public static double O00000000(Entity entity) {
      double var1 = entity.getZ() - entity.lastZ;
      double var3 = entity.getX() - entity.lastX;
      double var5 = entity.getY() - entity.lastY;
      double var7 = Math.sqrt(var3 * var3 + var1 * var1 + var5 * var5);
      return var7 * 15.3571428571;
   }

   public static float O000000000000O(float f) {
      if ((f = (float)(f % 360.0)) >= 180.0F) {
         f -= 360.0F;
      }

      if (f < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   public static float O00000000(float f, float g, float h, float i, float j) {
      if (h - g == 0.0F) {
         throw new IllegalArgumentException("Диапазон входных значений не может быть равен нулю.");
      } else {
         float var5 = (h - f) / (h - g) * (j - i) + i;
         return Math.max(i, Math.min(j, var5));
      }
   }

   public static float O000000000(float f, float g, float h, float i, float j) {
      if (h - g == 0.0F) {
         throw new IllegalArgumentException("Диапазон входных значений не может быть равен нулю.");
      } else {
         float var5 = (f - g) / (h - g) * (j - i) + i;
         return Math.max(i, Math.min(j, var5));
      }
   }

   public static float O000000000(float f, float g, float h) {
      if (!(f < g) && !(f > h)) {
         float var3 = h - g;
         return (f - g) / var3 * 100.0F;
      } else {
         return 0.0F;
      }
   }

   public static float O0000000000(float f, float g, float h) {
      if (!(f < g) && !(f > h)) {
         float var3 = h - g;
         return (f - g) / var3 * 101.0F;
      } else {
         return 0.0F;
      }
   }

   public static float O00000000000(float f, float g, float h) {
      if (!(f < g) && !(f > h)) {
         float var3 = h - g;
         return (f - g) / var3 * 191.0F;
      } else {
         return 0.0F;
      }
   }

   public static float O000000000000(float f, float g, float h) {
      if (!(f < 0.0F) && !(f > 100.0F)) {
         float var3 = h - g;
         return f / 100.0F * var3 + g;
      } else {
         return 0.0F;
      }
   }

   public static double O000000000000(double d, double e) {
      return e + (d - e) * O0000000000.nextDouble();
   }

   public static BigDecimal O000000000(float f, int i) {
      BigDecimal var2 = new BigDecimal(Float.toString(f));
      return var2.setScale(i, 4);
   }

   public static int O00000000(int i, int j) {
      return (int)(j + (i - j) * O0000000000.nextDouble());
   }

   public static boolean O000000000(int i) {
      return i % 2 == 0;
   }

   public static double O0000000000(double d, int i) {
      if (i < 0) {
         throw new IllegalArgumentException();
      } else {
         BigDecimal var3 = new BigDecimal(d);
         var3 = var3.setScale(i, RoundingMode.HALF_UP);
         return var3.doubleValue();
      }
   }

   public static double O0000000000000(double d, double e) {
      double var4 = Math.pow(10.0, e);
      return Math.round(d * var4) / var4;
   }

   public static double O000000000000O(double d, double e) {
      return Math.random() * (d - e) + e;
   }

   public static int O000000000(int i, int j) {
      return -j + (int)(Math.random() * (i - -j + 1));
   }

   public static float O0000000000(float f, float g) {
      return f != g && !(g - f <= 0.0F) ? (float)(f + (g - f) * Math.random()) : f;
   }

   public static int O0000000000(int i, int j) {
      return O0000000000.nextInt(j - i) + i;
   }

   public static double O00000000000O(double d, double e) {
      double var4 = 1.0 / e;
      return Math.round(d * var4) / var4;
   }

   public static boolean O00000000(Double double_) {
      return double_ == Math.floor(double_) && !Double.isInfinite(double_);
   }

   public static float[] O00000000(float[] fs) {
      fs[0] %= 360.0F;
      fs[1] %= 360.0F;

      while (fs[0] <= -180.0F) {
         fs[0] += 360.0F;
      }

      while (fs[1] <= -180.0F) {
         fs[1] += 360.0F;
      }

      while (fs[0] > 180.0F) {
         fs[0] -= 360.0F;
      }

      while (fs[1] > 180.0F) {
         fs[1] -= 360.0F;
      }

      return fs;
   }

   public static double O00000000000O0(double d, double e) {
      Random var4 = new Random();
      double var5 = e - d;
      double var7 = var4.nextDouble() * var5;
      if (var7 > e) {
         var7 = e;
      }

      double var9;
      if ((var9 = var7 + d) > e) {
         var9 = e;
      }

      return var9;
   }

   public static float O00000000(float f, float g, float h, float i) {
      float var4 = O000000000000(i, 0.0F, h);
      return O000000000000O(f, g, var4);
   }

   public static float O0000000000000(float f, float g, float h) {
      float var3 = f + h / 2.0F;
      if (var3 > g) {
         var3 = g;
      }

      return var3;
   }

   public static float O000000000000O(float f, float g, float h) {
      return f + h * (g - f);
   }

   public static float O000000000(float f, float g, float h, float i) {
      float var4 = (g - f) * (i / 2.0F) > 0.0F
         ? Math.max(i, Math.min(g - f, (g - f) * (i / 2.0F)))
         : Math.max(g - f, Math.min(-(i / 2.0F), (g - f) * (i / 2.0F)));
      return h + var4;
   }

   public static float O00000000000O(float f, float g, float h) {
      float var3 = (g - f) * (h / 2.0F) > 0.0F
         ? Math.max(h, Math.min(g - f, (g - f) * (h / 2.0F)))
         : Math.max(g - f, Math.min(-(h / 2.0F), (g - f) * (h / 2.0F)));
      return f + var3;
   }

   public static double O00000000000OO(double d, double e) {
      double var4 = e / 2.0;
      double var6 = Math.floor(d / e) * e;
      return d >= var6 + var4
         ? new BigDecimal(Math.ceil(d / e) * e, MathContext.DECIMAL64).stripTrailingZeros().doubleValue()
         : new BigDecimal(var6, MathContext.DECIMAL64).stripTrailingZeros().doubleValue();
   }

   public static float O0000000000(float f, float g, float h, float i) {
      Random var4 = new Random();
      float var5 = var4.nextFloat() * i;
      return f + h * var5 * (g - f);
   }

   public static int O00000000(int i, int j, int k) {
      if (i <= j) {
         i = j;
      }

      if (i >= k) {
         i = k;
      }

      return i;
   }

   public static float O00000000000O0(float f, float g, float h) {
      if (f <= g) {
         f = g;
      }

      if (f >= h) {
         f = h;
      }

      return f;
   }

   public static String O00000000(long l) {
      long var2 = l / 3600000L;
      long var4 = l % 3600000L / 60000L;
      long var6 = l % 360000L % 60000L / 1000L;
      return String.format("%02d:%02d:%02d", var2, var4, var6);
   }

   public static float O00000000000OO(float f, float g, float h) {
      if (f < g) {
         return g;
      } else {
         return f > h ? h : f;
      }
   }

   public static double O0000000000(double d, double e, double f) {
      return e + (d - e) * f;
   }

   public static float O00000000(float f, float g, double d) {
      return (float)O0000000000((double)f, (double)g, d);
   }

   public static int O00000000(int i, int j, double d) {
      return (int)O0000000000((double)i, (double)j, d);
   }

   public static Vector3d O00000000(Vector3d vector3d, Vector3d vector3d2, float f) {
      return new Vector3d(
         O0000000000(vector3d.x, vector3d2.x, (double)f), O0000000000(vector3d.y, vector3d2.y, (double)f), O0000000000(vector3d.z, vector3d2.z, (double)f)
      );
   }

   public static double O0000000000O(double d, double e) {
      double var4 = Math.round(d / e) * e;
      BigDecimal var6 = new BigDecimal(var4);
      var6 = var6.setScale(2, RoundingMode.HALF_UP);
      return var6.doubleValue();
   }

   public static int O00000000000(int i, int j) {
      return (int)(Math.random() * (j - i + 1) + i);
   }

   public static double O0000000000O0(double d, double e) {
      return Math.random() * (e - d) + d;
   }

   public static Vector3d O000000000(Vector3d vector3d, Vector3d vector3d2, float f) {
      return new Vector3d(
         O0000000000O((float)vector3d.x, (float)vector3d2.x, f),
         O0000000000O((float)vector3d.y, (float)vector3d2.y, f),
         O0000000000O((float)vector3d.z, (float)vector3d2.z, f)
      );
   }

   public static float O0000000000O(float f, float g, float h) {
      return (1.0F - O00000000000OO((float)(O0000000000() * h), 0.0F, 1.0F)) * f + O00000000000OO((float)(O0000000000() * h), 0.0F, 1.0F) * g;
   }

   public static double O0000000000() {
      return O0000O00O0O000.O00000000().O0000000000();
   }

   public static double O0000000000000(double d) {
      double var2 = Math.max(0.0, Math.min(1.0, d));
      double var4 = Math.max(0.0, Math.min(60.0, O0000000000() * 240.0));
      return 1.0 - Math.pow(1.0 - var2, var4);
   }

   public static double O000000000000O(double d) {
      double var2 = Math.max(0.0, Math.min(1.0, d));
      double var4 = Math.max(0.0, Math.min(60.0, O0000000000() * 240.0));
      return Math.pow(var2, var4);
   }

   public static int O00000000000O(double d) {
      int var2 = (int)d;
      return d > var2 ? var2 + 1 : var2;
   }

   public static double O00000000000(double d, double e, double f) {
      return Math.max(e, Math.min(f, d));
   }

   public static float O0000000000(float f, float g, float h, float i, float j) {
      return i + (j - i) * (f - g) / (h - g);
   }

   public static float O00000000000(float f, float g) {
      return (float)(Math.random() * (f - g) + g);
   }

   public static float O0000000000O0(float f, float g, float h) {
      return f + (g - f) * O00000000000OO(h, 0.0F, 1.0F);
   }

   public static double O000000000000(double d, double e, double f) {
      return d + (e - d) * O00000000000OO((float)f, 0.0F, 1.0F);
   }

   public static double O00000000000(double d, int i) {
      if (i < 0) {
         throw new IllegalArgumentException();
      } else {
         BigDecimal var3 = new BigDecimal(d);
         var3 = var3.setScale(i, RoundingMode.HALF_UP);
         return var3.doubleValue();
      }
   }

   public static int O000000000000(int i, int j) {
      return i / 2 - j / 2;
   }

   public static float O000000000000(float f, float g) {
      SecureRandom var2 = new SecureRandom();
      return var2.nextFloat() * (g - f) + f;
   }

   public static float O000000000(float f, float g, double d) {
      return O0000000000O0(f, g, (float)d);
   }

   public static float O0000000000000(float f, float g) {
      double var2 = 3.141592653;
      double var4 = 1.0 / Math.sqrt(2.0 * var2 * (g * g));
      return (float)(var4 * Math.exp(-(f * f) / (2.0 * (g * g))));
   }

   public static double O00000000000O0(double d) {
      return Math.round(d * 2.0) / 2.0;
   }

   public static float O000000000000O(float f, float g) {
      SecureRandom var2 = new SecureRandom();
      return var2.nextFloat() * (f - g) + g;
   }

   public static int O0000000000000(int i, int j) {
      return (i + j) / 2;
   }

   public static int O000000000000O(int i, int j) {
      return (int)(Math.random() * (i - j)) + j;
   }

   public static float O0000000000O00(float f, float g, float h) {
      float var3 = O000000000000O(f - g);
      if (var3 < -h) {
         var3 = -h;
      }

      if (var3 >= h) {
         var3 = h;
      }

      return f - var3;
   }

   public static float O00000000000O(float f) {
      return (float)O0000000000000(0.0, 1.0, (double)f);
   }

   public static double O0000000000000(double d, double e, double f) {
      return Math.max(d, Math.min(e, f));
   }
}
