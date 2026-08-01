package l;

import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Frustum;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4d;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;

public final class Helper148 implements Helper160 {
   @NotNull
   public static Vec3d method1251(Vec3d var0) {
      Vector3f var1 = var0.toVector3f();
      int[] var2 = new int[4];
      GL11.glGetIntegerv(2978, var2);
      Vector3f var3 = new Vector3f();
      Vector4f var4 = new Vector4f(var1.x, var1.y, var1.z, 1.0F).mul(Helper183.lastWorldSpaceMatrix.getPositionMatrix());
      Matrix4f var5 = new Matrix4f(Helper183.lastProjMat);
      var5.project(var4.x(), var4.y(), var4.z(), var2, var3);
      return new Vec3d(var3.x / mc.getWindow().getScaleFactor(), (mc.getWindow().getHeight() - var3.y) / mc.getWindow().getScaleFactor(), var3.z);
   }

   public static double method1252() {
      for (double var0 = mc.player.getY(); var0 > 0.0; var0 -= 0.1) {
         if (!mc.world.getBlockState(mc.player.getBlockPos().down((int)(mc.player.getY() - var0 + 1.0))).isAir()) {
            return mc.player.getY() - var0;
         }
      }

      return 256.0;
   }

   public static Vector4d method1253(Entity var0) {
      Vector4d var1 = null;
      if (var0 != null) {
         for (Vec3d var5 : method1254(var0, Helper147.method1247(var0))) {
            var5 = method1251(new Vec3d(var5.x, var5.y, var5.z));
            if (var5.z > 0.0 && var5.z < 1.0) {
               if (var1 == null) {
                  var1 = new Vector4d(var5.x, var5.y, var5.z, 0.0);
               }

               var1.x = Math.min(var5.x, var1.x);
               var1.y = Math.min(var5.y, var1.y);
               var1.z = Math.max(var5.x, var1.z);
               var1.w = Math.max(var5.y, var1.w);
            }
         }
      }

      return var1;
   }

   @NotNull
   public static Vec3d[] method1254(Entity var0, Vec3d var1) {
      Box var2 = var0.getBoundingBox();
      Box var3 = new Box(
         var2.minX - var0.getX() + var1.x - 0.1F,
         var2.minY - var0.getY() + var1.y - 0.1F,
         var2.minZ - var0.getZ() + var1.z - 0.1F,
         var2.maxX - var0.getX() + var1.x + 0.1F,
         var2.maxY - var0.getY() + var1.y + 0.1F,
         var2.maxZ - var0.getZ() + var1.z + 0.1F
      );
      return new Vec3d[]{
         new Vec3d(var3.minX, var3.minY, var3.minZ),
         new Vec3d(var3.minX, var3.maxY, var3.minZ),
         new Vec3d(var3.maxX, var3.minY, var3.minZ),
         new Vec3d(var3.maxX, var3.maxY, var3.minZ),
         new Vec3d(var3.minX, var3.minY, var3.maxZ),
         new Vec3d(var3.minX, var3.maxY, var3.maxZ),
         new Vec3d(var3.maxX, var3.minY, var3.maxZ),
         new Vec3d(var3.maxX, var3.maxY, var3.maxZ)
      };
   }

   public static boolean method1255(Vec3d var0) {
      Camera var1 = mc.getEntityRenderDispatcher().camera;
      Helper336 var2 = Helper349.method3469(var0.subtract(var1.getPos()));
      return Math.abs(MathHelper.wrapDegrees(var2.method3333() - var1.getYaw())) < 90.0F
            && Math.abs(MathHelper.wrapDegrees(var2.method3334() - var1.getPitch())) < 60.0F
         || method1256(new Box(BlockPos.ofFloored(var0)));
   }

   public static boolean method1256(Box var0) {
      Frustum var1 = mc.worldRenderer.frustum;
      return var0 != null && var1 != null && var1.isVisible(var0);
   }

   public static boolean method1257(Vector4d var0) {
      return var0 == null || var0.x < 0.0 && var0.z < 1.0 || var0.y < 0.0 && var0.w < 1.0;
   }

   public static double method1258(Vector4d var0) {
      return var0.x + (var0.z - var0.x) / 2.0;
   }

   private Helper148() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
