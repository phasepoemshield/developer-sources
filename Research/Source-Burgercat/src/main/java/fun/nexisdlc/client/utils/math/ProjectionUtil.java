package fun.nexisdlc.client.utils.math;

import fun.nexisdlc.client.utils.client.IMinecraft;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.joml.*;
import org.lwjgl.opengl.GL11;

import java.lang.Math;

import static net.minecraft.util.math.MathHelper.lerp;

public class ProjectionUtil implements IMinecraft {
    public static Matrix4f previousProjectionMatrix = new Matrix4f();
    public static Matrix4f lastProjMat = new Matrix4f();
    public static MatrixStack.Entry lastWorldSpaceMatrix = new MatrixStack().peek();
    public static float currentAspectMultiplier = 1.0f;

    public static Vector3d toScreen(Vector3d vec) {
        return toScreen(vec.x, vec.y, vec.z);
    }

    public static Vector3d toScreen(double x, double y, double z) {
        Camera camera = mc.getEntityRenderDispatcher().camera;
        if (camera == null) return new Vector3d(-1, -1, -1);

        Vec3d camPos = camera.getCameraPos();
        double relX = x - camPos.x;
        double relY = y - camPos.y;
        double relZ = z - camPos.z;

        Quaternionf rotation = new Quaternionf(camera.getRotation()).conjugate();
        Vector3f pos = new Vector3f((float) relX, (float) relY, (float) relZ);
        pos.rotate(rotation);

        if (pos.z > -0.001f) {
            pos.z = -0.001f;
        }

        double fov = mc.gameRenderer.getFov(camera, mc.getRenderTickCounter().getTickProgress(true), true);

        float w = mc.getWindow().getWidth();
        float h = mc.getWindow().getHeight();
        float halfW = w / 2f;
        float halfH = h / 2f;

        double tanHalfFov = Math.tan(Math.toRadians(fov) * 0.5);
        float factor = (float) (halfH / (tanHalfFov * -pos.z));

        float screenX = halfW + pos.x * factor * currentAspectMultiplier;
        float screenY = halfH - pos.y * factor;

        double depth = Math.abs(pos.z);
        float zOut = (float) Math.min(depth / 5000.0, 1.0);

        return new Vector3d(screenX, screenY, zOut);
    }

    public static boolean noNeedRender(Vector3d screenPos) {
        final int screenW = mc.getWindow().getWidth();
        final int screenH = mc.getWindow().getHeight();

        if (screenPos.z < 0 || screenPos.x < 0 || screenPos.x > screenW + 100 || screenPos.y < 0 || screenPos.y > screenH) {
            return true;
        }

        return false;
    }

    static void applyViewBobbing(PlayerEntity player, Vector3f pos) {
        // View bobbing disabled for compatibility
    }

    public static Vec3d getInterpolatedPos(Entity entity, float tickDelta) {
        return new Vec3d(MathHelper.lerp((double)tickDelta, (double)entity.lastX, (double)entity.getX()), MathHelper.lerp((double)tickDelta, (double)entity.lastY, (double)entity.getY()), MathHelper.lerp((double)tickDelta, (double)entity.lastZ, (double)entity.getZ()));
    }

    public static @NotNull Vec3d worldSpaceToScreenSpace(Vec3d pos) {
        Vector3f delta = pos.toVector3f();
        int[] viewport = new int[4];
        GL11.glGetIntegerv(GL11.GL_VIEWPORT, viewport);
        Vector3f target = new Vector3f();

        Vector4f transformedCoordinates = new Vector4f(delta.x, delta.y, delta.z, 1.f).mul(lastWorldSpaceMatrix.getPositionMatrix());
        Matrix4f matrixProj = new Matrix4f(lastProjMat);
        matrixProj.project(transformedCoordinates.x(), transformedCoordinates.y(), transformedCoordinates.z(), viewport, target);

        return new Vec3d(target.x / mc.getWindow().getScaleFactor(), (mc.getWindow().getHeight() - target.y) / mc.getWindow().getScaleFactor(), target.z);
    }
    public static @NotNull Vec3d[] getVec3ds(Entity ent, Vec3d pos) {
        Box axisAlignedBB2 = ent.getBoundingBox();
        Box axisAlignedBB = new Box(axisAlignedBB2.minX - ent.getX() + pos.x - 0.1F, axisAlignedBB2.minY - ent.getY() + pos.y - 0.1F, axisAlignedBB2.minZ - ent.getZ() + pos.z - 0.1F, axisAlignedBB2.maxX - ent.getX() + pos.x + 0.1F, axisAlignedBB2.maxY - ent.getY() + pos.y + 0.1F, axisAlignedBB2.maxZ - ent.getZ() + pos.z + 0.1F);
        return new Vec3d[]{new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ), new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.minZ), new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.minZ), new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.minZ), new Vec3d(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.maxZ), new Vec3d(axisAlignedBB.minX, axisAlignedBB.maxY, axisAlignedBB.maxZ), new Vec3d(axisAlignedBB.maxX, axisAlignedBB.minY, axisAlignedBB.maxZ), new Vec3d(axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ)};
    }
    public static Vector4d getVector4D(Entity ent) {
        Vector4d position = null;
        if (ent != null) {
            for (Vec3d vector : getVec3ds(ent, interpolate(ent))) {
                vector = worldSpaceToScreenSpace(new Vec3d(vector.x, vector.y, vector.z));
                if (vector.z > 0 && vector.z < 1) {
                    if (position == null) position = new Vector4d(vector.x, vector.y, vector.z, 0);
                    position.x = Math.min(vector.x, position.x);
                    position.y = Math.min(vector.y, position.y);
                    position.z = Math.max(vector.x, position.z);
                    position.w = Math.max(vector.y, position.w);
                }
            }
        }
        return position;
    }

    public static float interpolate(float prev, float to, float value) {
        return prev + (to - prev) * value;
    }

    public Vec3d interpolate(Vec3d prevPos, Vec3d pos) {
        return new Vec3d(interpolate(prevPos.x, pos.x), interpolate(prevPos.y, pos.y), interpolate(prevPos.z, pos.z));
    }

    public static Vec3d interpolate(Entity entity) {
        if (entity == null) return Vec3d.ZERO;
        return new Vec3d(interpolate(entity.lastX, entity.getX()), interpolate(entity.lastY, entity.getY()), interpolate(entity.lastZ, entity.getZ()));
    }

    public float interpolate(float prev, float orig) {
        return lerp(mc.getRenderTickCounter().getTickProgress(false), prev, orig);
    }

    public static double interpolate(double prev, double orig) {
        return lerp(mc.getRenderTickCounter().getTickProgress(false), prev, orig);
    }
    public static boolean cantSee(Vector4d vec) {
        return vec == null || (vec.x < 0 && vec.z < 1) || (vec.y < 0 && vec.w < 1);
    }

    public static Vec3d getInterpolatedPos(Vec3d prev, Vec3d pos, float tickDelta) {
        return new Vec3d(MathHelper.lerp((double)tickDelta, (double)prev.x, (double)pos.getX()), MathHelper.lerp((double)tickDelta, (double)prev.y, (double)pos.getY()), MathHelper.lerp((double)tickDelta, (double)prev.z, (double)pos.getZ()));
    }
}
