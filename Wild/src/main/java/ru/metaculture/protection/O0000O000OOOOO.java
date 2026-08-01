package ru.metaculture.protection;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;

public final class O0000O000OOOOO implements MinecraftAccessor {
   public static final Matrix4f O00000000 = new Matrix4f();
   public static final Matrix4f O000000000 = new Matrix4f();
   public static final Matrix4f O0000000000 = new Matrix4f();

   public static float O00000000(float f, float g) {
      return f - g / 2.0F;
   }

   public static float O00000000(float f) {
      f %= 360.0F;
      if (f >= 180.0F) {
         f -= 360.0F;
      }

      if (f < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   public static Vec3d O00000000(Vec3d vec3d) {
      Camera var1 = a_.gameRenderer == null ? null : a_.gameRenderer.getCamera();
      if (var1 == null && a_.getEntityRenderDispatcher() != null) {
         var1 = a_.getEntityRenderDispatcher().camera;
      }

      if (vec3d != null && var1 != null && a_.getWindow() != null) {
         int var2 = a_.getWindow().getHeight();
         int[] var3 = new int[4];
         GL11.glGetIntegerv(2978, var3);
         Vector3f var4 = new Vector3f();
         double var5 = vec3d.x - var1.getPos().x;
         double var7 = vec3d.y - var1.getPos().y;
         double var9 = vec3d.z - var1.getPos().z;
         Vector4f var11 = new Vector4f((float)var5, (float)var7, (float)var9, 1.0F).mul(O0000000000);
         Matrix4f var12 = new Matrix4f(O00000000);
         Matrix4f var13 = new Matrix4f(O000000000);
         var12.mul(var13).project(var11.x(), var11.y(), var11.z(), var3, var4);
         return new Vec3d(var4.x, var2 - var4.y, var4.z);
      } else {
         return new Vec3d(0.0, 0.0, 2.0);
      }
   }

   public static double O00000000() {
      return a_.getWindow().getScaleFactor();
   }

   public static float O00000000(float f, float g, float h, float i, float j) {
      return h - g == 0.0F ? i : i + (j - i) * ((f - g) / (h - g));
   }

   private static void O0000000000000(double d, double e) {
      if (e < d) {
         throw new IllegalArgumentException("max не может быть меньше min.");
      }
   }

   public static double O00000000(double d, int i) {
      return Math.round(d * Math.pow(10.0, i)) / Math.pow(10.0, i);
   }

   public static float O00000000(float f, float g, float h) {
      return (f - g) / (h - g);
   }

   public static Vector2f O00000000(Entity entity) {
      Vec3d var1 = entity.getPos().subtract(MinecraftClient.getInstance().player.getPos());
      double var2 = Math.hypot(var1.x, var1.z);
      return new Vector2f((float)Math.toDegrees(Math.atan2(var1.z, var1.x)) - 90.0F, (float)(-Math.toDegrees(Math.atan2(var1.y, var2))));
   }

   static float O000000000(float f) {
      if ((f = f % 360.0F) >= 180.0F) {
         f -= 360.0F;
      }

      if (f < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   public static float O0000000000(float f) {
      return (f > 0.5 ? 1.0F - f : f) * 2.0F;
   }

   public static double O00000000(double d, double e, double f) {
      return d + f * (e - d);
   }

   public static int O00000000(int i, int j, float f) {
      return i + (int)(f * (j - i));
   }

   public static float O000000000(float f, float g, float h) {
      return f + h * (g - f);
   }

   public static boolean O00000000(double d, double e, float f, float g, float h, float i) {
      return d >= f && d <= f + h && e >= g && e <= g + i;
   }

   public static double O000000000(double d, double e, double f) {
      return e + (d - e) * f;
   }

   public static Vec3d O00000000(Vec3d vec3d, Vec3d vec3d2, float f) {
      return new Vec3d(
         O000000000(vec3d.getX(), vec3d2.getX(), (double)f),
         O000000000(vec3d.getY(), vec3d2.getY(), (double)f),
         O000000000(vec3d.getZ(), vec3d2.getZ(), (double)f)
      );
   }

   public static double O0000000000(double d, double e, double f) {
      return e + d * (f - e);
   }

   public static int O00000000(int i, int j) {
      return i + (int)(Math.random() * (j - i + 1));
   }

   public static boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f > h && f < h + j && g > i && g < i + k;
   }

   public static float O000000000(float f, float g) {
      return (float)(Math.random() * (g - f) + f);
   }

   public static double O00000000(double d, double e, long l, O0000O00O0000 o0000O00O0000) {
      double var7 = 0.0;
      if (o0000O00O0000.O00000000(l)) {
         var7 = O000000000((float)d, (float)e);
         o0000O00O0000.O00000000();
      }

      return var7;
   }

   public static float O0000000000(float f, float g, float h) {
      return (1.0F - MathHelper.clamp(O000000000() * h, 0.0F, 1.0F)) * f + MathHelper.clamp(O000000000() * h, 0.0F, 1.0F) * g;
   }

   public static double O00000000(double d, double e) {
      if (d == e) {
         return d;
      } else {
         if (d > e) {
            double var4 = d;
            d = e;
            e = var4;
         }

         return ThreadLocalRandom.current().nextDouble() * (e - d) + d;
      }
   }

   public static float O0000000000(float f, float g) {
      return (float)(Math.random() * (g - f) + f);
   }

   public static double O000000000(double d, double e) {
      O0000000000000(d, e);
      return d + ThreadLocalRandom.current().nextDouble() * (e - d);
   }

   public static float O00000000000(float f, float g) {
      O0000000000000(f, g);
      return f + ThreadLocalRandom.current().nextFloat() * (g - f);
   }

   public static double O0000000000(double d, double e) {
      return d - e;
   }

   public static float O000000000() {
      float var0 = a_.getCurrentFps();
      return var0 > 0.0F ? 1.0F / var0 : 1.0F;
   }

   public static String O00000000(long l) {
      long var2 = l / 3600000L;
      long var4 = l % 3600000L / 60000L;
      long var6 = l % 360000L % 60000L / 1000L;
      return String.format("%02d:%02d:%02d", var2, var4, var6);
   }

   public static double O000000000(double d, int i) {
      double var3 = Math.pow(10.0, i);
      return Math.round(d * var3) / var3;
   }

   public static double O00000000000(double d, double e) {
      double var4 = Math.round(d / e) * e;
      BigDecimal var6 = new BigDecimal(var4);
      var6 = var6.setScale(2, RoundingMode.HALF_UP);
      return var6.doubleValue();
   }

   public static double O00000000(double d) {
      return Math.round(d * 100.0) / 100.0;
   }

   public static double O000000000000(double d, double e) {
      double var4 = Math.round(d / e) * e;
      return Math.round(var4 * 100.0) / 100.0;
   }

   public static double O00000000000(double d, double e, double f) {
      return Math.max(d, Math.min(e, f));
   }

   public static float O00000000000(float f, float g, float h) {
      return Math.max(f, Math.min(g, h));
   }

   public static int O00000000(int i, int j, int k) {
      return Math.max(i, Math.min(j, k));
   }

   public static double O000000000(double d) {
      return O00000000000(0.0, 1.0, d);
   }

   public static float O00000000000(float f) {
      return O00000000000(0.0F, 1.0F, f);
   }

   public static double O00000000(double d, double e, double f, double g, double h, double i) {
      double var12 = O0000000000(g, d);
      double var14 = O0000000000(h, e);
      double var16 = O0000000000(i, f);
      return MathHelper.sqrt((float)(var12 * var12 + var14 * var14 + var16 * var16));
   }

   public static double O00000000(BlockPos blockPos, BlockPos blockPos2) {
      double var2 = O0000000000((double)blockPos.getX(), (double)blockPos2.getX());
      double var4 = O0000000000((double)blockPos.getY(), (double)blockPos2.getY());
      double var6 = O0000000000((double)blockPos.getZ(), (double)blockPos2.getZ());
      return MathHelper.sqrt((float)(var2 * var2 + var4 * var4 + var6 * var6));
   }

   public static float O000000000(float f, float g, float h, float i, float j) {
      f = O00000000000(g, h, f);
      float var5 = (f - g) / (h - g);
      return O0000O0O00000.O00000000(i, j, var5);
   }

   @Generated
   private O0000O000OOOOO() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
