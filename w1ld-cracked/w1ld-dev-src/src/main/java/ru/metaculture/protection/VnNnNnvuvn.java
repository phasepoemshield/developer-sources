package ru.metaculture.protection;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;

public final class VnNnNnvuvn implements O000c0oocoo {
   public static final Matrix4f UuUVuuUu = new Matrix4f();
   public static final Matrix4f C00OOC00oO = new Matrix4f();
   public static final Matrix4f uUnuvNvvNU = new Matrix4f();

   public static float UuUVuuUu(float var0, float var1) {
      return var0 - var1 / 2.0F;
   }

   public static float UuUVuuUu(float var0) {
      var0 %= 360.0F;
      if (var0 >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   public static class_243 UuUVuuUu(class_243 var0) {
      class_4184 var1 = a_.field_1773 == null ? null : a_.field_1773.method_19418();
      if (var1 == null && a_.method_1561() != null) {
         var1 = a_.method_1561().field_4686;
      }

      if (var0 != null && var1 != null && a_.method_22683() != null) {
         int var2 = a_.method_22683().method_4507();
         int[] var3 = new int[4];
         GL11.glGetIntegerv(2978, var3);
         Vector3f var4 = new Vector3f();
         double var5 = var0.field_1352 - var1.method_19326().field_1352;
         double var7 = var0.field_1351 - var1.method_19326().field_1351;
         double var9 = var0.field_1350 - var1.method_19326().field_1350;
         Vector4f var11 = new Vector4f((float)var5, (float)var7, (float)var9, 1.0F).mul(uUnuvNvvNU);
         Matrix4f var12 = new Matrix4f(UuUVuuUu);
         Matrix4f var13 = new Matrix4f(C00OOC00oO);
         var12.mul(var13).project(var11.x(), var11.y(), var11.z(), var3, var4);
         return new class_243(var4.x, var2 - var4.y, var4.z);
      } else {
         return new class_243(0.0, 0.0, 2.0);
      }
   }

   public static double UuUVuuUu() {
      return a_.method_22683().method_4495();
   }

   public static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4) {
      return var2 - var1 == 0.0F ? var3 : var3 + (var4 - var3) * ((var0 - var1) / (var2 - var1));
   }

   private static void nuUnNvnuUu(double var0, double var2) {
      if (var2 < var0) {
         throw new IllegalArgumentException("max не может быть меньше min.");
      }
   }

   public static double UuUVuuUu(double var0, int var2) {
      return Math.round(var0 * Math.pow(10.0, var2)) / Math.pow(10.0, var2);
   }

   public static float UuUVuuUu(float var0, float var1, float var2) {
      return (var0 - var1) / (var2 - var1);
   }

   public static Vector2f UuUVuuUu(class_1297 var0) {
      class_243 var1 = var0.method_19538().method_1020(class_310.method_1551().field_1724.method_19538());
      double var2 = Math.hypot(var1.field_1352, var1.field_1350);
      return new Vector2f(
         (float)Math.toDegrees(Math.atan2(var1.field_1350, var1.field_1352)) - 90.0F, (float)(-Math.toDegrees(Math.atan2(var1.field_1351, var2)))
      );
   }

   static float C00OOC00oO(float var0) {
      if ((var0 = var0 % 360.0F) >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   public static float uUnuvNvvNU(float var0) {
      return (var0 > 0.5 ? 1.0F - var0 : var0) * 2.0F;
   }

   public static double UuUVuuUu(double var0, double var2, double var4) {
      return var0 + var4 * (var2 - var0);
   }

   public static int UuUVuuUu(int var0, int var1, float var2) {
      return var0 + (int)(var2 * (var1 - var0));
   }

   public static float C00OOC00oO(float var0, float var1, float var2) {
      return var0 + var2 * (var1 - var0);
   }

   public static boolean UuUVuuUu(double var0, double var2, float var4, float var5, float var6, float var7) {
      return var0 >= var4 && var0 <= var4 + var6 && var2 >= var5 && var2 <= var5 + var7;
   }

   public static double C00OOC00oO(double var0, double var2, double var4) {
      return var2 + (var0 - var2) * var4;
   }

   public static class_243 UuUVuuUu(class_243 var0, class_243 var1, float var2) {
      return new class_243(
         C00OOC00oO(var0.method_10216(), var1.method_10216(), (double)var2),
         C00OOC00oO(var0.method_10214(), var1.method_10214(), (double)var2),
         C00OOC00oO(var0.method_10215(), var1.method_10215(), (double)var2)
      );
   }

   public static double uUnuvNvvNU(double var0, double var2, double var4) {
      return var2 + var0 * (var4 - var2);
   }

   public static int UuUVuuUu(int var0, int var1) {
      return var0 + (int)(Math.random() * (var1 - var0 + 1));
   }

   public static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 > var2 && var0 < var2 + var4 && var1 > var3 && var1 < var3 + var5;
   }

   public static float C00OOC00oO(float var0, float var1) {
      return (float)(Math.random() * (var1 - var0) + var0);
   }

   public static double UuUVuuUu(double var0, double var2, long var4, VuNvNNvVV var6) {
      double var7 = 0.0;
      if (var6.UuUVuuUu(var4)) {
         var7 = C00OOC00oO((float)var0, (float)var2);
         var6.UuUVuuUu();
      }

      return var7;
   }

   public static float uUnuvNvvNU(float var0, float var1, float var2) {
      return (1.0F - class_3532.method_15363(C00OOC00oO() * var2, 0.0F, 1.0F)) * var0 + class_3532.method_15363(C00OOC00oO() * var2, 0.0F, 1.0F) * var1;
   }

   public static double UuUVuuUu(double var0, double var2) {
      if (var0 == var2) {
         return var0;
      } else {
         if (var0 > var2) {
            double var4 = var0;
            var0 = var2;
            var2 = var4;
         }

         return ThreadLocalRandom.current().nextDouble() * (var2 - var0) + var0;
      }
   }

   public static float uUnuvNvvNU(float var0, float var1) {
      return (float)(Math.random() * (var1 - var0) + var0);
   }

   public static double C00OOC00oO(double var0, double var2) {
      nuUnNvnuUu(var0, var2);
      return var0 + ThreadLocalRandom.current().nextDouble() * (var2 - var0);
   }

   public static float vVvUvVVuuNvV(float var0, float var1) {
      nuUnNvnuUu(var0, var1);
      return var0 + ThreadLocalRandom.current().nextFloat() * (var1 - var0);
   }

   public static double uUnuvNvvNU(double var0, double var2) {
      return var0 - var2;
   }

   public static float C00OOC00oO() {
      float var0 = a_.method_47599();
      return var0 > 0.0F ? 1.0F / var0 : 1.0F;
   }

   public static String UuUVuuUu(long var0) {
      long var2 = var0 / 3600000L;
      long var4 = var0 % 3600000L / 60000L;
      long var6 = var0 % 360000L % 60000L / 1000L;
      return String.format("%02d:%02d:%02d", var2, var4, var6);
   }

   public static double C00OOC00oO(double var0, int var2) {
      double var3 = Math.pow(10.0, var2);
      return Math.round(var0 * var3) / var3;
   }

   public static double vVvUvVVuuNvV(double var0, double var2) {
      double var4 = Math.round(var0 / var2) * var2;
      BigDecimal var6 = new BigDecimal(var4);
      var6 = var6.setScale(2, RoundingMode.HALF_UP);
      return var6.doubleValue();
   }

   public static double UuUVuuUu(double var0) {
      return Math.round(var0 * 100.0) / 100.0;
   }

   public static double uNNnnnuuuN(double var0, double var2) {
      double var4 = Math.round(var0 / var2) * var2;
      return Math.round(var4 * 100.0) / 100.0;
   }

   public static double vVvUvVVuuNvV(double var0, double var2, double var4) {
      return Math.max(var0, Math.min(var2, var4));
   }

   public static float vVvUvVVuuNvV(float var0, float var1, float var2) {
      return Math.max(var0, Math.min(var1, var2));
   }

   public static int UuUVuuUu(int var0, int var1, int var2) {
      return Math.max(var0, Math.min(var1, var2));
   }

   public static double C00OOC00oO(double var0) {
      return vVvUvVVuuNvV(0.0, 1.0, var0);
   }

   public static float vVvUvVVuuNvV(float var0) {
      return vVvUvVVuuNvV(0.0F, 1.0F, var0);
   }

   public static double UuUVuuUu(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = uUnuvNvvNU(var6, var0);
      double var14 = uUnuvNvvNU(var8, var2);
      double var16 = uUnuvNvvNU(var10, var4);
      return class_3532.method_15355((float)(var12 * var12 + var14 * var14 + var16 * var16));
   }

   public static double UuUVuuUu(class_2338 var0, class_2338 var1) {
      double var2 = uUnuvNvvNU((double)var0.method_10263(), (double)var1.method_10263());
      double var4 = uUnuvNvvNU((double)var0.method_10264(), (double)var1.method_10264());
      double var6 = uUnuvNvvNU((double)var0.method_10260(), (double)var1.method_10260());
      return class_3532.method_15355((float)(var2 * var2 + var4 * var4 + var6 * var6));
   }

   public static float C00OOC00oO(float var0, float var1, float var2, float var3, float var4) {
      var0 = vVvUvVVuuNvV(var1, var2, var0);
      float var5 = (var0 - var1) / (var2 - var1);
      return nNUuNuVuuv.UuUVuuUu(var3, var4, var5);
   }

   @Generated
   private VnNnNnvuvn() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
