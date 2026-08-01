package l;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector3d;

public final class Helper147 implements Helper160 {
   public static double PI2 = Math.PI * 2;

   public static boolean method1224(double var0, double var2, double var4, double var6, double var8, double var10) {
      return var0 >= var4 && var0 <= var4 + var8 && var2 >= var6 && var2 <= var6 + var10;
   }

   public static float method1225(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : Math.min(var0, var2);
   }

   public static double method1226() {
      return Math.pow(mc.options.getMouseSensitivity().getValue() * 0.6 + 0.2, 3.0) * 1.2;
   }

   public static int method1227(int var0, int var1) {
      return (int)method1228(var0, var1 + 1.0F);
   }

   public static float method1228(float var0, float var1) {
      return (float)method1229(var0, var1);
   }

   public static double method1229(double var0, double var2) {
      if (var0 == var2) {
         return var0;
      } else {
         if (var0 > var2) {
            double var4 = var0;
            var0 = var2;
            var2 = var4;
         }

         return ThreadLocalRandom.current().nextDouble(var0, var2);
      }
   }

   public static void method1230(MatrixStack var0, float var1, float var2, float var3, Runnable var4) {
      if (var3 != 1.0F) {
         float var5 = 0.5F + var3 / 2.0F;
         var0.push();
         var0.translate(var1, var2, 0.0F);
         var0.scale(var5, var5, 1.0F);
         var0.translate(-var1, -var2, 0.0F);
         method1233(var3, var4);
         var0.pop();
      } else {
         var4.run();
      }
   }

   public static void method1231(MatrixStack var0, float var1, float var2, float var3, float var4, Runnable var5) {
      float var6 = var3 * var4;
      if (var6 != 1.0F) {
         var0.push();
         var0.translate(var1, var2, 0.0F);
         var0.scale(var3, var4, 1.0F);
         var0.translate(-var1, -var2, 0.0F);
         method1233(var6, var5);
         var0.pop();
      } else {
         var5.run();
      }
   }

   public static float method1232(float var0) {
      int var1 = (int)(var0 * 75.0F);
      return (float)MathHelper.clamp(System.currentTimeMillis() % var1 * Math.PI / var1, 0.0, 1.0) * var0;
   }

   public static void method1233(float var0, Runnable var1) {
      method1234(1.0F, 1.0F, 1.0F, var0, var1);
   }

   public static void method1234(float var0, float var1, float var2, float var3, Runnable var4) {
      RenderSystem.setShaderColor(
         MathHelper.clamp(var0, 0.0F, 1.0F), MathHelper.clamp(var1, 0.0F, 1.0F), MathHelper.clamp(var2, 0.0F, 1.0F), MathHelper.clamp(var3, 0.0F, 1.0F)
      );
      var4.run();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static double method1235(double var0, double var2) {
      double var4 = Math.round(var0 / var2) * var2;
      return Math.round(var4 * 100.0) / 100.0;
   }

   public static int method1236(int var0, int var1) {
      return var1 * (int)Math.floor((double)var0 / var1);
   }

   public static int method1237(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int method1238(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int method1239(int var0) {
      return var0 & 0xFF;
   }

   public static int method1240(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static int method1241(int var0, float var1) {
      return ColorHelper.getArgb((int)(method1240(var0) * var1 / 255.0F), method1237(var0), method1238(var0), method1239(var0));
   }

   public static Vec3d method1242(int var0, int var1, double var2) {
      int var4 = Math.min(var0, var1);
      float var5 = (float)(Math.cos(var4 * PI2 / var1) * var2);
      float var6 = (float)(-Math.sin(var4 * PI2 / var1) * var2);
      return new Vec3d(var5, 0.0, var6);
   }

   public static double method1243(double var0) {
      return Math.abs(1.0 + Math.sin(var0)) / 2.0;
   }

   public static Vector3d method1244(Vector3d var0, Vector3d var1) {
      return new Vector3d(method1249(var0.x, var1.x), method1249(var0.y, var1.y), method1249(var0.z, var1.z));
   }

   public static float method1245(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   public static Vec3d method1246(Vec3d var0, Vec3d var1) {
      return new Vec3d(method1249(var0.x, var1.x), method1249(var0.y, var1.y), method1249(var0.z, var1.z));
   }

   public static Vec3d method1247(Entity var0) {
      return var0 == null
         ? Vec3d.ZERO
         : new Vec3d(method1249(var0.prevX, var0.getX()), method1249(var0.prevY, var0.getY()), method1249(var0.prevZ, var0.getZ()));
   }

   public static float method1248(float var0, float var1) {
      return MathHelper.lerp(tickCounter.getTickDelta(false), var0, var1);
   }

   public static double method1249(double var0, double var2) {
      return MathHelper.lerp((double)tickCounter.getTickDelta(false), var0, var2);
   }

   public static float method1250(double var0, float var2, float var3) {
      return (float)MathHelper.lerp(tickCounter.getLastDuration() / var0, (double)var2, (double)var3);
   }

   private Helper147() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
