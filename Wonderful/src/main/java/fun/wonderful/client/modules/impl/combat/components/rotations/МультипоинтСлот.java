package fun.wonderful.client.modules.impl.combat.components.rotations;

import fun.wonderful.api.QClient;
import fun.wonderful.api.utils.combat.RaytracingUtil;
import fun.wonderful.api.utils.combat.rotation.Rotation;
import fun.wonderful.api.utils.combat.rotation.RotationUtil;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;

public final class МультипоинтСлот
implements QClient {
    private static Vec3d rotationPoint;
    private static Vec3d rotationMotion;
    private static int lastTargetId;

    public static Vec3d getNearestPoint(Entity target, double distance) {
        Vec3d centerOffset = target.getBoundingBox().getCenter().subtract(target.getPos());
        Vec3d point = МультипоинтСлот.findRaytracePoint(target, distance, centerOffset);
        return point == null ? target.getBoundingBox().getCenter() : point;
    }

    public static Vec3d getMultipoint(Entity var0, double var1) {
        return null;
    }


    private static Vec3d findRaytracePoint(Entity target, double distance, Vec3d preferredOffset) {
        double lenghtX = target.getBoundingBox().getLengthX();
        double lenghtY = target.getBoundingBox().getLengthY();
        double lenghtZ = target.getBoundingBox().getLengthZ();
        double safeX = Math.max(0.03, (lenghtX - 0.1) / 2.0);
        double safeZ = Math.max(0.03, (lenghtZ - 0.1) / 2.0);
        double[] xs = new double[]{-safeX, -safeX * 0.5, 0.0, safeX * 0.5, safeX};
        double[] ys = new double[]{lenghtY * 0.32, lenghtY * 0.42, lenghtY * 0.52, lenghtY * 0.62, lenghtY * 0.72};
        double[] zs = new double[]{-safeZ, -safeZ * 0.5, 0.0, safeZ * 0.5, safeZ};
        Vec3d centerOffset = new Vec3d(0.0, lenghtY * 0.52, 0.0);
        Vec3d bestPoint = null;
        double bestScore = Double.POSITIVE_INFINITY;
        Vec3d preferredPoint = target.getPos().add(preferredOffset);
        if (МультипоинтСлот.canRaytracePoint(target, distance, preferredPoint)) {
            bestPoint = preferredPoint;
            bestScore = preferredOffset.squaredDistanceTo(centerOffset) * 0.2;
        }
        for (double x2 : xs) {
            for (double y2 : ys) {
                for (double z2 : zs) {
                    double score;
                    Vec3d offset = new Vec3d(x2, y2, z2);
                    Vec3d point = target.getPos().add(offset);
                    if (!МультипоинтСлот.canRaytracePoint(target, distance, point) || !((score = offset.squaredDistanceTo(preferredOffset) * 0.58 + offset.squaredDistanceTo(centerOffset) * 0.42) < bestScore)) continue;
                    bestScore = score;
                    bestPoint = point;
                }
            }
        }
        return bestPoint;
    }

    private static boolean canRaytracePoint(Entity target, double distance, Vec3d point) {
        Vec3d eyePos = МультипоинтСлот.mc.player.getEyePos();
        if (eyePos.squaredDistanceTo(point) > distance * distance) {
            return false;
        }
        RaycastContext context = new RaycastContext(eyePos, point, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)МультипоинтСлот.mc.player);
        BlockHitResult result = МультипоинтСлот.mc.world.raycast(context);
        if (result.getType() == HitResult.Type.BLOCK) {
            return false;
        }
        Rotation rotation = RotationUtil.fromVec3d(point.subtract(eyePos));
        return RaytracingUtil.rayTrace(rotation.toVector(), distance, target.getBoundingBox());
    }

    private static Vec3d clampOffset(Vec3d point, double safeX, double safeZ, double minY, double maxY) {
        return new Vec3d(Math.max(-safeX, Math.min(safeX, point.x)), Math.max(minY, Math.min(maxY, point.y)), Math.max(-safeZ, Math.min(safeZ, point.z)));
    }

    static {
        lastTargetId = -1;
        rotationPoint = Vec3d.ZERO;
        rotationMotion = Vec3d.ZERO;
    }
}