package sky.core.util.render;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4d;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;

public final class ProjectionUtil {
    private static final MinecraftClient CLIENT = MinecraftClient.getInstance();

    private ProjectionUtil() {
    }

    public static Vec3d interpolate(Entity entity, float tickDelta) {
        return new Vec3d(
                MathHelper.lerp(tickDelta, entity.lastRenderX, entity.getX()),
                MathHelper.lerp(tickDelta, entity.lastRenderY, entity.getY()),
                MathHelper.lerp(tickDelta, entity.lastRenderZ, entity.getZ())
        );
    }

    public static Vec3d worldSpaceToScreenSpace(Vec3d pos) {
        if (!WorldProjectionCapture.isCaptured() || CLIENT.gameRenderer == null) {
            return new Vec3d(0.0D, 0.0D, -1.0D);
        }

        Vector3f delta = pos.subtract(CLIENT.gameRenderer.getCamera().getPos()).toVector3f();
        int[] viewport = new int[4];
        GL11.glGetIntegerv(GL11.GL_VIEWPORT, viewport);

        Vector3f target = new Vector3f();
        Vector4f transformed = new Vector4f(delta.x, delta.y, delta.z, 1.0F)
                .mul(WorldProjectionCapture.getWorldSpace());
        Matrix4f matrixProj = new Matrix4f(WorldProjectionCapture.getProjection());
        matrixProj.project(transformed.x(), transformed.y(), transformed.z(), viewport, target);

        double guiX = target.x / CLIENT.getWindow().getScaleFactor();
        double guiY = (CLIENT.getWindow().getHeight() - target.y) / CLIENT.getWindow().getScaleFactor();
        return new Vec3d(ScreenScale.toHudX(guiX), ScreenScale.toHudY(guiY), target.z);
    }

    public static Vector4d getVector4D(Entity entity, float tickDelta) {
        Vector4d position = null;
        for (Vec3d corner : getBoundingCorners(entity, interpolate(entity, tickDelta))) {
            Vec3d projected = worldSpaceToScreenSpace(corner);
            if (projected.z <= 0.0D || projected.z >= 1.0D) {
                continue;
            }

            if (position == null) {
                position = new Vector4d(projected.x, projected.y, projected.z, 0.0D);
            }

            position.x = Math.min(projected.x, position.x);
            position.y = Math.min(projected.y, position.y);
            position.z = Math.max(projected.x, position.z);
            position.w = Math.max(projected.y, position.w);
        }

        return position;
    }

    private static Vec3d[] getBoundingCorners(Entity entity, Vec3d pos) {
        Box box = entity.getBoundingBox();
        double inset = 0.1D;
        Box shifted = new Box(
                box.minX - entity.getX() + pos.x - inset,
                box.minY - entity.getY() + pos.y - inset,
                box.minZ - entity.getZ() + pos.z - inset,
                box.maxX - entity.getX() + pos.x + inset,
                box.maxY - entity.getY() + pos.y + inset,
                box.maxZ - entity.getZ() + pos.z + inset
        );
        return new Vec3d[] {
                new Vec3d(shifted.minX, shifted.minY, shifted.minZ),
                new Vec3d(shifted.minX, shifted.maxY, shifted.minZ),
                new Vec3d(shifted.maxX, shifted.minY, shifted.minZ),
                new Vec3d(shifted.maxX, shifted.maxY, shifted.minZ),
                new Vec3d(shifted.minX, shifted.minY, shifted.maxZ),
                new Vec3d(shifted.minX, shifted.maxY, shifted.maxZ),
                new Vec3d(shifted.maxX, shifted.minY, shifted.maxZ),
                new Vec3d(shifted.maxX, shifted.maxY, shifted.maxZ)
        };
    }
}
