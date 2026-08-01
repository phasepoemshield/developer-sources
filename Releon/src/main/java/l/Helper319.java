package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Helper319 {
   private static final Random random = new Random();
   private static final Helper339 pointTimer = new Helper339();
   private static final Helper339 updateTimer = new Helper339();
   private static List<Vec3d> cachedPoints = new ArrayList<>();
   private static int currentPointIndex = 0;

   public Helper319() {
   }

   public static Vec3d method3161(Entity var0, float var1, float var2, float var3, float var4) {
      double var5 = var0.getWidth() / var4;
      double var7 = MathHelper.clamp(var0.getEyeY() - var0.getY(), 0.0, (double)var0.getHeight());
      double var9 = MathHelper.clamp(Helper160.mc.player.getX() - var0.getX(), -var5, var5);
      double var11 = MathHelper.clamp(Helper160.mc.player.getZ() - var0.getZ(), -var5, var5);
      return new Vec3d(var0.getX() + var9 / var1, var0.getY() + var7 / var2, var0.getZ() + var11 / var3);
   }

   public static Vec3d method3162(Entity var0, float var1, float var2) {
      double var3 = Helper160.mc.player.getPos().distanceTo(var0.getPos());
      double var5 = MathHelper.clamp((var3 - var1) / (var2 - var1), 0.0, 1.0);
      double var9 = 0.2;
      double var11 = 0.8;
      double var13 = var9 + (var11 - var9) * var5;
      double var15 = var0.getY() + var0.getHeight() * var13;
      return new Vec3d(var0.getX(), var15, var0.getZ());
   }

   public static Vec3d method3163(Entity var0, int var1, float var2) {
      if (updateTimer.method3357(1000.0) || cachedPoints.isEmpty()) {
         method3164(var0, var1);
         currentPointIndex = 0;
         pointTimer.method3358();
      }

      if (pointTimer.method3356(var2)) {
         currentPointIndex = (currentPointIndex + 1) % cachedPoints.size();
         pointTimer.method3358();
      }

      return cachedPoints.isEmpty() ? var0.getPos() : cachedPoints.get(currentPointIndex);
   }

   private static void method3164(Entity var0, int var1) {
      cachedPoints.clear();
      double var2 = var0.getWidth();
      double var4 = var0.getHeight();
      Vec3d var6 = var0.getPos();

      for (int var7 = 0; var7 < var1; var7++) {
         double var8 = var6.x + (random.nextDouble() - 0.5) * var2;
         double var10 = var6.y + random.nextDouble() * var4;
         double var12 = var6.z + (random.nextDouble() - 0.5) * var2;
         cachedPoints.add(new Vec3d(var8, var10, var12));
      }
   }

   public static List<Vec3d> method3165() {
      return new ArrayList<>(cachedPoints);
   }

   public static int method3166() {
      return currentPointIndex;
   }

   public static long method3167() {
      return pointTimer.method3359();
   }

   public static void method3168() {
      cachedPoints.clear();
      currentPointIndex = 0;
      pointTimer.method3358();
      updateTimer.method3358();
   }

   public static void method3169(Entity var0, int var1) {
      method3164(var0, var1);
      currentPointIndex = 0;
      pointTimer.method3358();
      updateTimer.method3358();
   }
}
