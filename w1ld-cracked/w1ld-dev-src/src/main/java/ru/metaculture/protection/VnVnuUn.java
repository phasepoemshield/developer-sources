package ru.metaculture.protection;

import java.awt.Color;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lombok.Generated;
import net.minecraft.class_3532;
import org.lwjgl.opengl.GL11;

public final class VnVnuUn {
   private static final long VVuuUN = 60000L;
   private static final ConcurrentHashMap<VnVnuUn.nvnNNunvv, VnVnuUn.NVnVnNnN> vNUvnnVnUvu = new ConcurrentHashMap<>();
   private static final ScheduledExecutorService uVUuuVnNVU = Executors.newSingleThreadScheduledExecutor(var0 -> {
      Thread var1 = new Thread(var0, "ColorUtil-CacheCleaner");
      var1.setDaemon(true);
      return var1;
   });
   private static final DelayQueue<VnVnuUn.NVnVnNnN> vuuuNvNuv = new DelayQueue<>();
   private static final double[] nvUVNnuu = uUnuvNvvNU();
   private static final ThreadLocal<float[]> UuuNnUvUuv = ThreadLocal.withInitial(() -> new float[3]);
   public static final int UuUVuuUu = C00OOC00oO(255, 0, 0);
   public static final int C00OOC00oO = C00OOC00oO(0, 255, 0);
   public static final int uUnuvNvvNU = C00OOC00oO(0, 0, 255);
   public static final int vVvUvVVuuNvV = C00OOC00oO(255, 255, 0);
   public static final int uNNnnnuuuN = UNnVVNvvnVvU(255);
   public static final int nuUnNvnuUu = UNnVVNvvnVvU(0);

   public static int UuUVuuUu(int var0, int var1, float var2) {
      return uUnuvNvvNU(var0, var1, var2);
   }

   public static int UuUVuuUu(int var0, int var1) {
      return class_3532.method_15340(var1, 0, 255) << 24 | var0 & 16777215;
   }

   public static int UuUVuuUu(int var0, int var1, double var2) {
      return UuUVuuUu((double)var0, (double)var1, (double)((float)var2)).intValue();
   }

   public static Double UuUVuuUu(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static int UuUVuuUu(int var0) {
      return var0 >>> 24;
   }

   public static int C00OOC00oO(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int uUnuvNvvNU(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int vVvUvVVuuNvV(int var0) {
      return var0 & 0xFF;
   }

   public static int C00OOC00oO(int var0, int var1) {
      int var2 = C00OOC00oO(var0);
      int var3 = uUnuvNvvNU(var0);
      int var4 = vVvUvVVuuNvV(var0);
      var2 = Math.max(0, var2 - var1);
      var3 = Math.max(0, var3 - var1);
      var4 = Math.max(0, var4 - var1);
      return 0xFF000000 | var2 << 16 | var3 << 8 | var4;
   }

   public static int uNNnnnuuuN(int var0) {
      float var1 = (var0 >> 24 & 0xFF) / 255.0F;
      float var2 = (var0 >> 16 & 0xFF) / 255.0F;
      float var3 = (var0 >> 8 & 0xFF) / 255.0F;
      float var4 = (var0 & 0xFF) / 255.0F;
      GL11.glColor4f(var2, var3, var4, var1);
      return var0;
   }

   public static int uUnuvNvvNU(int var0, int var1) {
      double var2 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
      double var4;
      return Color.getHSBColor((var4 = var2 % 360.0) / 360.0 < 0.5 ? -((float)(var4 / 360.0)) : (float)(var4 / 360.0), 0.5F, 1.0F).hashCode();
   }

   public static int UuUVuuUu(float var0, int var1, int var2, int var3) {
      long var4 = System.currentTimeMillis() + var1;
      double var6 = (Math.sin(var4 * 0.001 * var0) + 1.0) / 2.0;
      return vVvUvVVuuNvV(var2, var3, (float)var6);
   }

   public static int C00OOC00oO(int var0, int var1, float var2) {
      return uUnuvNvvNU(var0, var1, var2);
   }

   public static int C00OOC00oO(int var0, int var1, double var2) {
      return uUnuvNvvNU(var0, var1, (float)var2);
   }

   public static int uUnuvNvvNU(int var0, int var1, float var2) {
      float var3 = UuUVuuUu(var2);
      if (var3 <= 0.0F) {
         return var0;
      } else if (var3 >= 1.0F) {
         return var1;
      } else {
         int var4 = var0 >>> 24 & 0xFF;
         int var5 = var1 >>> 24 & 0xFF;
         int var6 = Math.round(var4 + (var5 - var4) * var3);
         return UuUVuuUu(var0, var1, var3, var6);
      }
   }

   public static int uUnuvNvvNU(int var0, int var1, double var2) {
      return vVvUvVVuuNvV(var0, var1, (float)var2);
   }

   public static int vVvUvVVuuNvV(int var0, int var1, float var2) {
      float var3 = UuUVuuUu(var2);
      if (var3 <= 0.0F) {
         return var0 & 16777215;
      } else {
         return var3 >= 1.0F ? var1 & 16777215 : UuUVuuUu(var0, var1, var3, 0) & 16777215;
      }
   }

   private static int UuUVuuUu(int var0, int var1, float var2, int var3) {
      double var4 = nvUVNnuu[var0 >>> 16 & 0xFF];
      double var6 = nvUVNnuu[var0 >>> 8 & 0xFF];
      double var8 = nvUVNnuu[var0 & 0xFF];
      double var10 = nvUVNnuu[var1 >>> 16 & 0xFF];
      double var12 = nvUVNnuu[var1 >>> 8 & 0xFF];
      double var14 = nvUVNnuu[var1 & 0xFF];
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
      double var52 = var28 + (var46 - var28) * var2;
      double var54 = var30 + (var48 - var30) * var2;
      double var56 = var32 + (var50 - var32) * var2;
      double var58 = var52 + 0.3963377774 * var54 + 0.2158037573 * var56;
      double var60 = var52 - 0.1055613458 * var54 - 0.0638541728 * var56;
      double var62 = var52 - 0.0894841775 * var54 - 1.291485548 * var56;
      double var64 = var58 * var58 * var58;
      double var66 = var60 * var60 * var60;
      double var68 = var62 * var62 * var62;
      int var70 = UuUVuuUu(4.0767416621 * var64 - 3.3077115913 * var66 + 0.2309699292 * var68);
      int var71 = UuUVuuUu(-1.2684380046 * var64 + 2.6097574011 * var66 - 0.3413193965 * var68);
      int var72 = UuUVuuUu(-0.0041960863 * var64 - 0.7034186147 * var66 + 1.707614701 * var68);
      return (var3 & 0xFF) << 24 | var70 << 16 | var71 << 8 | var72;
   }

   private static double[] uUnuvNvvNU() {
      double[] var0 = new double[256];

      for (int var1 = 0; var1 < var0.length; var1++) {
         double var2 = var1 / 255.0;
         var0[var1] = var2 <= 0.04045 ? var2 / 12.92 : Math.pow((var2 + 0.055) / 1.055, 2.4);
      }

      return var0;
   }

   private static int UuUVuuUu(double var0) {
      double var2 = var0 <= 0.0 ? 0.0 : Math.min(1.0, var0);
      double var4 = var2 <= 0.0031308 ? var2 * 12.92 : 1.055 * Math.pow(var2, 0.4166666666666667) - 0.055;
      int var6 = (int)Math.round(var4 * 255.0);
      if (var6 < 0) {
         return 0;
      } else {
         return var6 > 255 ? 255 : var6;
      }
   }

   private static float UuUVuuUu(float var0) {
      if (var0 < 0.0F) {
         return 0.0F;
      } else {
         return var0 > 1.0F ? 1.0F : var0;
      }
   }

   public static float[] nuUnNvnuUu(int var0) {
      return new float[]{(var0 >> 16 & 0xFF) / 255.0F, (var0 >> 8 & 0xFF) / 255.0F, (var0 & 0xFF) / 255.0F, (var0 >> 24 & 0xFF) / 255.0F};
   }

   public static int[] VVuuUN(int var0) {
      return new int[]{
         (int)((var0 >> 16 & 0xFF) / 255.0F), (int)((var0 >> 8 & 0xFF) / 255.0F), (int)((var0 & 0xFF) / 255.0F), (int)((var0 >> 24 & 0xFF) / 255.0F)
      };
   }

   public static int vNUvnnVnUvu(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int uVUuuVnNVU(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int vuuuNvNuv(int var0) {
      return var0 & 0xFF;
   }

   public static int nvUVNnuu(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static float UuuNnUvUuv(int var0) {
      return vNUvnnVnUvu(var0) / 255.0F;
   }

   public static float nUUVuvU(int var0) {
      return uVUuuVnNVU(var0) / 255.0F;
   }

   public static float UnUNVVVNuv(int var0) {
      return vuuuNvNuv(var0) / 255.0F;
   }

   public static float vNVuvnUUnuUn(int var0) {
      return nvUVNnuu(var0) / 255.0F;
   }

   public static int[] UvnvNVnnnnNU(int var0) {
      return new int[]{vNUvnnVnUvu(var0), uVUuuVnNVU(var0), vuuuNvNuv(var0), nvUVNnuu(var0)};
   }

   public static int[] uVUVnuvnuVuv(int var0) {
      return new int[]{vNUvnnVnUvu(var0), uVUuuVnNVU(var0), vuuuNvNuv(var0)};
   }

   public static float[] NVNnnvnuunNv(int var0) {
      return new float[]{UuuNnUvUuv(var0), nUUVuvU(var0), UnUNVVVNuv(var0), vNVuvnUUnuUn(var0)};
   }

   public static float[] uVunuUNVVUUV(int var0) {
      return new float[]{UuuNnUvUuv(var0), nUUVuvU(var0), UnUNVVVNuv(var0)};
   }

   public static int UuUVuuUu(float var0, float var1, float var2, float var3) {
      return uUnuvNvvNU(Math.round(var0 * 255.0F), Math.round(var1 * 255.0F), Math.round(var2 * 255.0F), Math.round(var3 * 255.0F));
   }

   public static int UuUVuuUu(int var0, int var1, int var2, float var3) {
      return uUnuvNvvNU(var0, var1, var2, Math.round(var3 * 255.0F));
   }

   public static int UuUVuuUu(float var0, float var1, float var2) {
      return UuUVuuUu(var0, var1, var2, 1.0F);
   }

   public static int vVvUvVVuuNvV(int var0, int var1) {
      return uUnuvNvvNU(var0, var0, var0, var1);
   }

   public static int UuUVuuUu(int var0, float var1) {
      return vVvUvVVuuNvV(var0, Math.round(var1 * 255.0F));
   }

   public static int UNnVVNvvnVvU(int var0) {
      return C00OOC00oO(var0, var0, var0);
   }

   public static int uNNnnnuuuN(int var0, int var1) {
      return uUnuvNvvNU(vNUvnnVnUvu(var0), uVUuuVnNVU(var0), vuuuNvNuv(var0), var1);
   }

   public static int C00OOC00oO(int var0, float var1) {
      return UuUVuuUu(vNUvnnVnUvu(var0), uVUuuVnNVU(var0), vuuuNvNuv(var0), var1);
   }

   public static int uUnuvNvvNU(int var0, float var1) {
      return uUnuvNvvNU(vNUvnnVnUvu(var0), uVUuuVnNVU(var0), vuuuNvNuv(var0), Math.round(nvUVNnuu(var0) * var1));
   }

   public static int vVvUvVVuuNvV(int var0, float var1) {
      int var2 = nvUVNnuu(var0);
      int var3 = uUnuvNvvNU(var0, var2 << 24 | 8421504, var1);
      int var4 = vNUvnnVnUvu(var3);
      int var5 = uVUuuVnNVU(var3);
      int var6 = vuuuNvNuv(var3);
      float var7 = var1 / 2.0F;
      var4 = Math.round(var4 * var7);
      var5 = Math.round(var5 * var7);
      var6 = Math.round(var6 * var7);
      return uUnuvNvvNU(var4, var5, var6, var2);
   }

   public static int uNNnnnuuuN(int var0, float var1) {
      return uUnuvNvvNU(Math.round(vNUvnnVnUvu(var0) * var1), Math.round(uVUuuVnNVU(var0) * var1), Math.round(vuuuNvNuv(var0) * var1), nvUVNnuu(var0));
   }

   public static int nuUnNvnuUu(int var0, float var1) {
      return uUnuvNvvNU(
         Math.min(255, Math.round(vNUvnnVnUvu(var0) / var1)),
         Math.min(255, Math.round(uVUuuVnNVU(var0) / var1)),
         Math.min(255, Math.round(vuuuNvNuv(var0) / var1)),
         nvUVNnuu(var0)
      );
   }

   public static int uNNnnnuuuN(int var0, int var1, float var2) {
      return uUnuvNvvNU(var0, var1, var2);
   }

   public static int nuUnNvnuUu(int var0, int var1) {
      return uNNnnnuuuN(var0, var1, 0.5F);
   }

   public static int[] UuUVuuUu(int var0, int var1, int var2) {
      int[] var3 = new int[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         float var5 = (float)var4 / (var2 - 1);
         var3[var4] = uNNnnnuuuN(var0, var1, var5);
      }

      return var3;
   }

   public static int vVvUvVVuuNvV(int var0, int var1, double var2) {
      return C00OOC00oO(var0, var1, var2);
   }

   public static int UuUVuuUu(int var0, int var1, float var2, float var3, float var4) {
      int var5 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
      float var6 = var5 / 360.0F;
      int var7 = Color.HSBtoRGB(var6, var2, var3);
      return uUnuvNvvNU(vNUvnnVnUvu(var7), uVUuuVnNVU(var7), vuuuNvNuv(var7), Math.round(var4 * 255.0F));
   }

   public static int UuUVuuUu(int var0, int var1, int var2, int var3) {
      int var4 = (int)((System.currentTimeMillis() / var0 + var1) % 360L);
      var4 = var4 >= 180 ? 360 - var4 : var4;
      return uNNnnnuuuN(var2, var3, var4 / 180.0F);
   }

   public static int uNnUnnuNUnNu(int var0) {
      return UuUVuuUu(10, var0, UuUVuuUu(), uNNnnnuuuN(UuUVuuUu(), 0.5F));
   }

   public static int UuUVuuUu() {
      return UnVNvNnU.VvunVVUvUNnv.UuUVuuUu();
   }

   public static int C00OOC00oO(int var0, int var1, int var2, int var3) {
      int var4 = (int)((System.currentTimeMillis() / var3 + var2) % 360L);
      var4 = (var4 > 180 ? 360 - var4 : var4) + 180;
      int var5 = vVvUvVVuuNvV(var0, var1, (double)class_3532.method_15363(var4 / 180.0F - 1.0F, 0.0F, 1.0F));
      float[] var6 = Color.RGBtoHSB(vNUvnnVnUvu(var5), uVUuuVnNVU(var5), vuuuNvNuv(var5), UuuNnUvUuv.get());
      var6[1] *= 1.5F;
      var6[1] = Math.min(var6[1], 1.0F);
      return Color.HSBtoRGB(var6[0], var6[1], var6[2]);
   }

   public static int uUnuvNvvNU(int var0, int var1, int var2, int var3) {
      VnVnuUn.nvnNNunvv var4 = new VnVnuUn.nvnNNunvv(var0, var1, var2, var3);
      VnVnuUn.NVnVnNnN var5 = vNUvnnVnUvu.computeIfAbsent(var4, var4x -> {
         VnVnuUn.NVnVnNnN var5x = new VnVnuUn.NVnVnNnN(var4x, vVvUvVVuuNvV(var0, var1, var2, var3), 60000L);
         vuuuNvNuv.offer(var5x);
         return var5x;
      });
      return var5.uUnuvNvvNU();
   }

   public static int C00OOC00oO(int var0, int var1, int var2) {
      return uUnuvNvvNU(var0, var1, var2, 255);
   }

   private static int vVvUvVVuuNvV(int var0, int var1, int var2, int var3) {
      return class_3532.method_15340(var3, 0, 255) << 24
         | class_3532.method_15340(var0, 0, 255) << 16
         | class_3532.method_15340(var1, 0, 255) << 8
         | class_3532.method_15340(var2, 0, 255);
   }

   private static String uNNnnnuuuN(int var0, int var1, int var2, int var3) {
      return var0 + "," + var1 + "," + var2 + "," + var3;
   }

   public static void C00OOC00oO() {
      uVUuuVnNVU.shutdown();
   }

   @Generated
   private VnVnuUn() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      uVUuuVnNVU.scheduleWithFixedDelay(() -> {
         for (VnVnuUn.NVnVnNnN var0 = vuuuNvNuv.poll(); var0 != null; var0 = vuuuNvNuv.poll()) {
            if (var0.UuUVuuUu()) {
               vNUvnnVnUvu.remove(var0.C00OOC00oO());
            }
         }
      }, 0L, 1L, TimeUnit.SECONDS);
   }

   static class NVnVnNnN implements Delayed {
      private final VnVnuUn.nvnNNunvv UuUVuuUu;
      private final int C00OOC00oO;
      private final long uUnuvNvvNU;

      NVnVnNnN(VnVnuUn.nvnNNunvv var1, int var2, long var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = System.currentTimeMillis() + var3;
      }

      @Override
      public long getDelay(TimeUnit var1) {
         long var2 = this.uUnuvNvvNU - System.currentTimeMillis();
         return var1.convert(var2, TimeUnit.MILLISECONDS);
      }

      public int UuUVuuUu(Delayed var1) {
         return var1 instanceof VnVnuUn.NVnVnNnN ? Long.compare(this.uUnuvNvvNU, ((VnVnuUn.NVnVnNnN)var1).uUnuvNvvNU) : 0;
      }

      public boolean UuUVuuUu() {
         return System.currentTimeMillis() > this.uUnuvNvvNU;
      }

      @Generated
      public VnVnuUn.nvnNNunvv C00OOC00oO() {
         return this.UuUVuuUu;
      }

      @Generated
      public int uUnuvNvvNU() {
         return this.C00OOC00oO;
      }

      @Generated
      public long vVvUvVVuuNvV() {
         return this.uUnuvNvvNU;
      }
   }

   static class nvnNNunvv {
      final int UuUVuuUu;
      final int C00OOC00oO;
      final int uUnuvNvvNU;
      final int vVvUvVVuuNvV;

      @Generated
      public int UuUVuuUu() {
         return this.UuUVuuUu;
      }

      @Generated
      public int C00OOC00oO() {
         return this.C00OOC00oO;
      }

      @Generated
      public int uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      @Generated
      public int vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }

      @Generated
      public nvnNNunvv(int var1, int var2, int var3, int var4) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
      }

      @Generated
      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof VnVnuUn.nvnNNunvv var2)) {
            return false;
         } else if (!var2.UuUVuuUu(this)) {
            return false;
         } else if (this.UuUVuuUu() != var2.UuUVuuUu()) {
            return false;
         } else if (this.C00OOC00oO() != var2.C00OOC00oO()) {
            return false;
         } else {
            return this.uUnuvNvvNU() != var2.uUnuvNvvNU() ? false : this.vVvUvVVuuNvV() == var2.vVvUvVVuuNvV();
         }
      }

      @Generated
      protected boolean UuUVuuUu(Object var1) {
         return var1 instanceof VnVnuUn.nvnNNunvv;
      }

      @Generated
      @Override
      public int hashCode() {
         byte var1 = 59;
         int var2 = 1;
         var2 = var2 * 59 + this.UuUVuuUu();
         var2 = var2 * 59 + this.C00OOC00oO();
         var2 = var2 * 59 + this.uUnuvNvvNU();
         return var2 * 59 + this.vVvUvVVuuNvV();
      }
   }
}
