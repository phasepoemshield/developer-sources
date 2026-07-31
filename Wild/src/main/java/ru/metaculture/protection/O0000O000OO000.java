package ru.metaculture.protection;

import java.awt.Color;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lombok.Generated;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public final class O0000O000OO000 {
   private static final long O000000000000O = 60000L;
   private static final ConcurrentHashMap<O0000O000OO000.W354, O0000O000OO000.W353> O00000000000O = new ConcurrentHashMap<>();
   private static final ScheduledExecutorService O00000000000O0 = Executors.newSingleThreadScheduledExecutor(runnable -> {
      Thread var1 = new Thread(runnable, "ColorUtil-CacheCleaner");
      var1.setDaemon(true);
      return var1;
   });
   private static final DelayQueue<O0000O000OO000.W353> O00000000000OO = new DelayQueue<>();
   private static final double[] O0000000000O = O0000000000();
   private static final ThreadLocal<float[]> O0000000000O0 = ThreadLocal.withInitial(() -> new float[3]);
   public static final int O00000000 = O000000000(255, 0, 0);
   public static final int O000000000 = O000000000(0, 255, 0);
   public static final int O0000000000 = O000000000(0, 0, 255);
   public static final int O00000000000 = O000000000(255, 255, 0);
   public static final int O000000000000 = O000000000O00(255);
   public static final int O0000000000000 = O000000000O00(0);

   public static int O00000000(int i, int j, float f) {
      return O0000000000(i, j, f);
   }

   public static int O00000000(int i, int j) {
      return MathHelper.clamp(j, 0, 255) << 24 | i & 16777215;
   }

   public static int O00000000(int i, int j, double d) {
      return O00000000((double)i, (double)j, (double)((float)d)).intValue();
   }

   public static Double O00000000(double d, double e, double f) {
      return d + (e - d) * f;
   }

   public static int O00000000(int i) {
      return i >>> 24;
   }

   public static int O000000000(int i) {
      return i >> 16 & 0xFF;
   }

   public static int O0000000000(int i) {
      return i >> 8 & 0xFF;
   }

   public static int O00000000000(int i) {
      return i & 0xFF;
   }

   public static int O000000000(int i, int j) {
      int var2 = O000000000(i);
      int var3 = O0000000000(i);
      int var4 = O00000000000(i);
      var2 = Math.max(0, var2 - j);
      var3 = Math.max(0, var3 - j);
      var4 = Math.max(0, var4 - j);
      return 0xFF000000 | var2 << 16 | var3 << 8 | var4;
   }

   public static int O000000000000(int i) {
      float var1 = (i >> 24 & 0xFF) / 255.0F;
      float var2 = (i >> 16 & 0xFF) / 255.0F;
      float var3 = (i >> 8 & 0xFF) / 255.0F;
      float var4 = (i & 0xFF) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1);
      return i;
   }

   public static int O0000000000(int i, int j) {
      double var2 = (int)((System.currentTimeMillis() / i + j) % 360L);
      double var4;
      return Color.getHSBColor((var4 = var2 % 360.0) / 360.0 < 0.5 ? -((float)(var4 / 360.0)) : (float)(var4 / 360.0), 0.5F, 1.0F).hashCode();
   }

   public static int O00000000(float f, int i, int j, int k) {
      long var4 = System.currentTimeMillis() + i;
      double var6 = (Math.sin(var4 * 0.001 * f) + 1.0) / 2.0;
      return O00000000000(j, k, (float)var6);
   }

   public static int O000000000(int i, int j, float f) {
      return O0000000000(i, j, f);
   }

   public static int O000000000(int i, int j, double d) {
      return O0000000000(i, j, (float)d);
   }

   public static int O0000000000(int i, int j, float f) {
      float var3 = O00000000(f);
      if (var3 <= 0.0F) {
         return i;
      } else if (var3 >= 1.0F) {
         return j;
      } else {
         int var4 = i >>> 24 & 0xFF;
         int var5 = j >>> 24 & 0xFF;
         int var6 = Math.round(var4 + (var5 - var4) * var3);
         return O00000000(i, j, var3, var6);
      }
   }

   public static int O0000000000(int i, int j, double d) {
      return O00000000000(i, j, (float)d);
   }

   public static int O00000000000(int i, int j, float f) {
      float var3 = O00000000(f);
      if (var3 <= 0.0F) {
         return i & 16777215;
      } else {
         return var3 >= 1.0F ? j & 16777215 : O00000000(i, j, var3, 0) & 16777215;
      }
   }

   private static int O00000000(int i, int j, float f, int k) {
      double var4 = O0000000000O[i >>> 16 & 0xFF];
      double var6 = O0000000000O[i >>> 8 & 0xFF];
      double var8 = O0000000000O[i & 0xFF];
      double var10 = O0000000000O[j >>> 16 & 0xFF];
      double var12 = O0000000000O[j >>> 8 & 0xFF];
      double var14 = O0000000000O[j & 0xFF];
      double var16 = 0.4122214708 * var4 + 0.5363325363 * var6 + 0.0514459929 * var8;
      double var18 = 0.2119034982 * var4 + 0.6806995451 * var6 + 0.1073969566 * var8;
      double var20 = 0.0883024619 * var4 + 0.2817188376 * var6 + 0.6299787005 * var8;
      double var22 = Math.cbrt(var16);
      double var24 = Math.cbrt(var18);
      double var26 = Math.cbrt(var20);
      double var28 = 0.2104542553 * var22 + 0.793617785 * var24 - 0.0040720468 * var26;
      double var30 = 1.9779984951 * var22 - 2.428592205 * var24 + 0.4505937099 * var26;
      double var32 = 0.0259040371 * var22 + 0.7827717662 * var24 - 0.808675766 * var26;
      double var34 = 0.4122214708 * var10 + 0.5363325363 * var12 + 0.0514459929 * var14;
      double var36 = 0.2119034982 * var10 + 0.6806995451 * var12 + 0.1073969566 * var14;
      double var38 = 0.0883024619 * var10 + 0.2817188376 * var12 + 0.6299787005 * var14;
      double var40 = Math.cbrt(var34);
      double var42 = Math.cbrt(var36);
      double var44 = Math.cbrt(var38);
      double var46 = 0.2104542553 * var40 + 0.793617785 * var42 - 0.0040720468 * var44;
      double var48 = 1.9779984951 * var40 - 2.428592205 * var42 + 0.4505937099 * var44;
      double var50 = 0.0259040371 * var40 + 0.7827717662 * var42 - 0.808675766 * var44;
      double var52 = var28 + (var46 - var28) * f;
      double var54 = var30 + (var48 - var30) * f;
      double var56 = var32 + (var50 - var32) * f;
      double var58 = var52 + 0.3963377774 * var54 + 0.2158037573 * var56;
      double var60 = var52 - 0.1055613458 * var54 - 0.0638541728 * var56;
      double var62 = var52 - 0.0894841775 * var54 - 1.291485548 * var56;
      double var64 = var58 * var58 * var58;
      double var66 = var60 * var60 * var60;
      double var68 = var62 * var62 * var62;
      int var70 = O00000000(4.0767416621 * var64 - 3.3077115913 * var66 + 0.2309699292 * var68);
      int var71 = O00000000(-1.2684380046 * var64 + 2.6097574011 * var66 - 0.3413193965 * var68);
      int var72 = O00000000(-0.0041960863 * var64 - 0.7034186147 * var66 + 1.707614701 * var68);
      return (k & 0xFF) << 24 | var70 << 16 | var71 << 8 | var72;
   }

   private static double[] O0000000000() {
      double[] var0 = new double[256];

      for (int var1 = 0; var1 < var0.length; var1++) {
         double var2 = var1 / 255.0;
         var0[var1] = var2 <= 0.04045 ? var2 / 12.92 : Math.pow((var2 + 0.055) / 1.055, 2.4);
      }

      return var0;
   }

   private static int O00000000(double d) {
      double var2 = d <= 0.0 ? 0.0 : Math.min(1.0, d);
      double var4 = var2 <= 0.0031308 ? var2 * 12.92 : 1.055 * Math.pow(var2, 0.4166666666666667) - 0.055;
      int var6 = (int)Math.round(var4 * 255.0);
      if (var6 < 0) {
         return 0;
      } else {
         return var6 > 255 ? 255 : var6;
      }
   }

   private static float O00000000(float f) {
      if (f < 0.0F) {
         return 0.0F;
      } else {
         return f > 1.0F ? 1.0F : f;
      }
   }

   public static float[] O0000000000000(int i) {
      return new float[]{(i >> 16 & 0xFF) / 255.0F, (i >> 8 & 0xFF) / 255.0F, (i & 0xFF) / 255.0F, (i >> 24 & 0xFF) / 255.0F};
   }

   public static int[] O000000000000O(int i) {
      return new int[]{(int)((i >> 16 & 0xFF) / 255.0F), (int)((i >> 8 & 0xFF) / 255.0F), (int)((i & 0xFF) / 255.0F), (int)((i >> 24 & 0xFF) / 255.0F)};
   }

   public static int O00000000000O(int i) {
      return i >> 16 & 0xFF;
   }

   public static int O00000000000O0(int i) {
      return i >> 8 & 0xFF;
   }

   public static int O00000000000OO(int i) {
      return i & 0xFF;
   }

   public static int O0000000000O(int i) {
      return i >> 24 & 0xFF;
   }

   public static float O0000000000O0(int i) {
      return O00000000000O(i) / 255.0F;
   }

   public static float O0000000000O00(int i) {
      return O00000000000O0(i) / 255.0F;
   }

   public static float O0000000000O0O(int i) {
      return O00000000000OO(i) / 255.0F;
   }

   public static float O0000000000OO(int i) {
      return O0000000000O(i) / 255.0F;
   }

   public static int[] O0000000000OO0(int i) {
      return new int[]{O00000000000O(i), O00000000000O0(i), O00000000000OO(i), O0000000000O(i)};
   }

   public static int[] O0000000000OOO(int i) {
      return new int[]{O00000000000O(i), O00000000000O0(i), O00000000000OO(i)};
   }

   public static float[] O000000000O(int i) {
      return new float[]{O0000000000O0(i), O0000000000O00(i), O0000000000O0O(i), O0000000000OO(i)};
   }

   public static float[] O000000000O0(int i) {
      return new float[]{O0000000000O0(i), O0000000000O00(i), O0000000000O0O(i)};
   }

   public static int O00000000(float f, float g, float h, float i) {
      return O0000000000(Math.round(f * 255.0F), Math.round(g * 255.0F), Math.round(h * 255.0F), Math.round(i * 255.0F));
   }

   public static int O00000000(int i, int j, int k, float f) {
      return O0000000000(i, j, k, Math.round(f * 255.0F));
   }

   public static int O00000000(float f, float g, float h) {
      return O00000000(f, g, h, 1.0F);
   }

   public static int O00000000000(int i, int j) {
      return O0000000000(i, i, i, j);
   }

   public static int O00000000(int i, float f) {
      return O00000000000(i, Math.round(f * 255.0F));
   }

   public static int O000000000O00(int i) {
      return O000000000(i, i, i);
   }

   public static int O000000000000(int i, int j) {
      return O0000000000(O00000000000O(i), O00000000000O0(i), O00000000000OO(i), j);
   }

   public static int O000000000(int i, float f) {
      return O00000000(O00000000000O(i), O00000000000O0(i), O00000000000OO(i), f);
   }

   public static int O0000000000(int i, float f) {
      return O0000000000(O00000000000O(i), O00000000000O0(i), O00000000000OO(i), Math.round(O0000000000O(i) * f));
   }

   public static int O00000000000(int i, float f) {
      int var2 = O0000000000O(i);
      int var3 = O0000000000(i, var2 << 24 | 8421504, f);
      int var4 = O00000000000O(var3);
      int var5 = O00000000000O0(var3);
      int var6 = O00000000000OO(var3);
      float var7 = f / 2.0F;
      var4 = Math.round(var4 * var7);
      var5 = Math.round(var5 * var7);
      var6 = Math.round(var6 * var7);
      return O0000000000(var4, var5, var6, var2);
   }

   public static int O000000000000(int i, float f) {
      return O0000000000(Math.round(O00000000000O(i) * f), Math.round(O00000000000O0(i) * f), Math.round(O00000000000OO(i) * f), O0000000000O(i));
   }

   public static int O0000000000000(int i, float f) {
      return O0000000000(
         Math.min(255, Math.round(O00000000000O(i) / f)),
         Math.min(255, Math.round(O00000000000O0(i) / f)),
         Math.min(255, Math.round(O00000000000OO(i) / f)),
         O0000000000O(i)
      );
   }

   public static int O000000000000(int i, int j, float f) {
      return O0000000000(i, j, f);
   }

   public static int O0000000000000(int i, int j) {
      return O000000000000(i, j, 0.5F);
   }

   public static int[] O00000000(int i, int j, int k) {
      int[] var3 = new int[k];

      for (int var4 = 0; var4 < k; var4++) {
         float var5 = (float)var4 / (k - 1);
         var3[var4] = O000000000000(i, j, var5);
      }

      return var3;
   }

   public static int O00000000000(int i, int j, double d) {
      return O000000000(i, j, d);
   }

   public static int O00000000(int i, int j, float f, float g, float h) {
      int var5 = (int)((System.currentTimeMillis() / i + j) % 360L);
      float var6 = var5 / 360.0F;
      int var7 = Color.HSBtoRGB(var6, f, g);
      return O0000000000(O00000000000O(var7), O00000000000O0(var7), O00000000000OO(var7), Math.round(h * 255.0F));
   }

   public static int O00000000(int i, int j, int k, int l) {
      int var4 = (int)((System.currentTimeMillis() / i + j) % 360L);
      var4 = var4 >= 180 ? 360 - var4 : var4;
      return O000000000000(k, l, var4 / 180.0F);
   }

   public static int O000000000O000(int i) {
      return O00000000(10, i, O00000000(), O000000000000(O00000000(), 0.5F));
   }

   public static int O00000000() {
      return RenderManager.W382.O00000000();
   }

   public static int O000000000(int i, int j, int k, int l) {
      int var4 = (int)((System.currentTimeMillis() / l + k) % 360L);
      var4 = (var4 > 180 ? 360 - var4 : var4) + 180;
      int var5 = O00000000000(i, j, (double)MathHelper.clamp(var4 / 180.0F - 1.0F, 0.0F, 1.0F));
      float[] var6 = Color.RGBtoHSB(O00000000000O(var5), O00000000000O0(var5), O00000000000OO(var5), O0000000000O0.get());
      var6[1] *= 1.5F;
      var6[1] = Math.min(var6[1], 1.0F);
      return Color.HSBtoRGB(var6[0], var6[1], var6[2]);
   }

   public static int O0000000000(int i, int j, int k, int l) {
      O0000O000OO000.W354 var4 = new O0000O000OO000.W354(i, j, k, l);
      O0000O000OO000.W353 var5 = O00000000000O.computeIfAbsent(var4, o000000000 -> {
         O0000O000OO000.W353 var5x = new O0000O000OO000.W353(o000000000, O00000000000(i, j, k, l), 60000L);
         O00000000000OO.offer(var5x);
         return var5x;
      });
      return var5.O0000000000();
   }

   public static int O000000000(int i, int j, int k) {
      return O0000000000(i, j, k, 255);
   }

   private static int O00000000000(int i, int j, int k, int l) {
      return MathHelper.clamp(l, 0, 255) << 24 | MathHelper.clamp(i, 0, 255) << 16 | MathHelper.clamp(j, 0, 255) << 8 | MathHelper.clamp(k, 0, 255);
   }

   private static String O000000000000(int i, int j, int k, int l) {
      return i + "," + j + "," + k + "," + l;
   }

   public static void O000000000() {
      O00000000000O0.shutdown();
   }

   @Generated
   private O0000O000OO000() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      O00000000000O0.scheduleWithFixedDelay(() -> {
         for (O0000O000OO000.W353 var0 = O00000000000OO.poll(); var0 != null; var0 = O00000000000OO.poll()) {
            if (var0.O00000000()) {
               O00000000000O.remove(var0.O000000000());
            }
         }
      }, 0L, 1L, TimeUnit.SECONDS);
   }

   static class W353 implements Delayed {
      private final O0000O000OO000.W354 O00000000;
      private final int O000000000;
      private final long O0000000000;

      W353(O0000O000OO000.W354 o000000000, int i, long l) {
         this.O00000000 = o000000000;
         this.O000000000 = i;
         this.O0000000000 = System.currentTimeMillis() + l;
      }

      @Override
      public long getDelay(TimeUnit timeUnit) {
         long var2 = this.O0000000000 - System.currentTimeMillis();
         return timeUnit.convert(var2, TimeUnit.MILLISECONDS);
      }

      @Override
      public int compareTo(Delayed delayed) {
         return delayed instanceof O0000O000OO000.W353 ? Long.compare(this.O0000000000, ((O0000O000OO000.W353)delayed).O0000000000) : 0;
      }

      public boolean O00000000() {
         return System.currentTimeMillis() > this.O0000000000;
      }

      @Generated
      public O0000O000OO000.W354 O000000000() {
         return this.O00000000;
      }

      @Generated
      public int O0000000000() {
         return this.O000000000;
      }

      @Generated
      public long O00000000000() {
         return this.O0000000000;
      }
   }

   static class W354 {
      final int O00000000;
      final int O000000000;
      final int O0000000000;
      final int O00000000000;

      @Generated
      public int O00000000() {
         return this.O00000000;
      }

      @Generated
      public int O000000000() {
         return this.O000000000;
      }

      @Generated
      public int O0000000000() {
         return this.O0000000000;
      }

      @Generated
      public int O00000000000() {
         return this.O00000000000;
      }

      @Generated
      public W354(int i, int j, int k, int l) {
         this.O00000000 = i;
         this.O000000000 = j;
         this.O0000000000 = k;
         this.O00000000000 = l;
      }

      @Generated
      @Override
      public boolean equals(Object object) {
         if (object == this) {
            return true;
         } else if (!(object instanceof O0000O000OO000.W354 var2)) {
            return false;
         } else if (!var2.O00000000(this)) {
            return false;
         } else if (this.O00000000() != var2.O00000000()) {
            return false;
         } else if (this.O000000000() != var2.O000000000()) {
            return false;
         } else {
            return this.O0000000000() != var2.O0000000000() ? false : this.O00000000000() == var2.O00000000000();
         }
      }

      @Generated
      protected boolean O00000000(Object object) {
         return object instanceof O0000O000OO000.W354;
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         var2 = var2 * 59 + this.O00000000();
         var2 = var2 * 59 + this.O000000000();
         var2 = var2 * 59 + this.O0000000000();
         return var2 * 59 + this.O00000000000();
      }
   }
}
