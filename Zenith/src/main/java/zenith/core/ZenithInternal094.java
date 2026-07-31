package zenith;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Frustum;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4d;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;

public final class ZenithInternal094 implements ZenithInternal076 {
   public static net.minecraft.util.math.Vec3d ListHolder_6(net.minecraft.util.math.Vec3d Vec3d) {
      Vector3f vector3f = Vec3d.subtract(l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera.getPos()).toVector3f();
      int[] aint = new int[4];
      GL11.glGetIntegerv(2978, aint);
      Vector3f vector3f1 = new Vector3f();
      Vector4f vector4f = new Vector4f(vector3f.x, vector3f.y, vector3f.z, 1.0F).mul(ListHolder_2.l1lI1IIllIIl());
      Matrix4f matrix4f = new Matrix4f(ListHolder_2.l1lIIII11lI1Il1111IllII1II1lI());
      matrix4f.project(vector4f.x(), vector4f.y(), vector4f.z(), aint, vector3f1);
      return new net.minecraft.util.math.Vec3d(
         (double)vector3f1.x / l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaleFactor(),
         (double)((float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getHeight() - vector3f1.y) / l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaleFactor(),
         (double)vector3f1.z
      );
   }

   public static boolean SecureRandomHolder_2(net.minecraft.util.math.Vec3d Vec3d) {
      Camera Camera = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera;
      floatHolder_6 il1ll111liili1ll11liil = ZenithInternal131.longHolder_6(Vec3d);
      return Math.abs(MathHelper.wrapDegrees(il1ll111liili1ll11liil.AutoBrewing() - Camera.getYaw())) < 90.0F
            && Math.abs(MathHelper.wrapDegrees(il1ll111liili1ll11liil.Basefinder() - Camera.getPitch())) < 60.0F
         || EventImpl_24(new net.minecraft.util.math.Box(BlockPos.ofFloored(Vec3d)));
   }

   public static boolean EventImpl_24(net.minecraft.util.math.Box Box) {
      Frustum Frustum = l11I1I1ll1Illll1I1l1111l1II.worldRenderer.frustum;
      return Box != null && Frustum != null && Frustum.isVisible(Box);
   }

   public static boolean StringHolder_8(Vector4d vector4d) {
      return vector4d == null || vector4d.x < 0.0 && vector4d.z < 1.0 || vector4d.y < 0.0 && vector4d.w < 1.0;
   }

   public static double EventBus(Vector4d vector4d) {
      return vector4d.x + (vector4d.z - vector4d.x) / 2.0;
   }

   public static net.minecraft.util.math.Vec3d[] StringHolder_8(Entity Entity, net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.util.math.Box Boxx = Entity.getBoundingBox();
      net.minecraft.util.math.Box Boxx = new net.minecraft.util.math.Box(
         Boxx.minX - Entity.getX() + Vec3d.x - 0.1F,
         Boxx.minY - Entity.getY() + Vec3d.y - 0.1F,
         Boxx.minZ - Entity.getZ() + Vec3d.z - 0.1F,
         Boxx.maxX - Entity.getX() + Vec3d.x + 0.1F,
         Boxx.maxY - Entity.getY() + Vec3d.y + 0.1F,
         Boxx.maxZ - Entity.getZ() + Vec3d.z + 0.1F
      );
      return new net.minecraft.util.math.Vec3d[]{
         new net.minecraft.util.math.Vec3d(Boxx.minX, Boxx.minY, Boxx.minZ),
         new net.minecraft.util.math.Vec3d(Boxx.minX, Boxx.maxY, Boxx.minZ),
         new net.minecraft.util.math.Vec3d(Boxx.maxX, Boxx.minY, Boxx.minZ),
         new net.minecraft.util.math.Vec3d(Boxx.maxX, Boxx.maxY, Boxx.minZ),
         new net.minecraft.util.math.Vec3d(Boxx.minX, Boxx.minY, Boxx.maxZ),
         new net.minecraft.util.math.Vec3d(Boxx.minX, Boxx.maxY, Boxx.maxZ),
         new net.minecraft.util.math.Vec3d(Boxx.maxX, Boxx.minY, Boxx.maxZ),
         new net.minecraft.util.math.Vec3d(Boxx.maxX, Boxx.maxY, Boxx.maxZ)
      };
   }

   public static Vector4d ZenithException_2(Entity Entity) {
      Vector4d vector4d = null;

      for (net.minecraft.util.math.Vec3d Vec3d : StringHolder_8(Entity, doubleHolder_3.ZenithInternal021(Entity))) {
         Vec3d = ListHolder_6(new net.minecraft.util.math.Vec3d(Vec3d.x, Vec3d.y, Vec3d.z));
         if (Vec3d.z > 0.0 && Vec3d.z < 1.0) {
            if (vector4d == null) {
               vector4d = new Vector4d(Vec3d.x, Vec3d.y, Vec3d.z, 0.0);
            }

            vector4d.x = Math.min(Vec3d.x, vector4d.x);
            vector4d.y = Math.min(Vec3d.y, vector4d.y);
            vector4d.z = Math.max(Vec3d.x, vector4d.z);
            vector4d.w = Math.max(Vec3d.y, vector4d.w);
         }
      }

      return vector4d;
   }

   private ZenithInternal094() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
