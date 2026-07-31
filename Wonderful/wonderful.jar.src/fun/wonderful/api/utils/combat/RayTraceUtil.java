package fun.wonderful.api.utils.combat;

import fun.wonderful.api.QClient;
import java.util.Objects;
import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import org.joml.Vector3f;

public final class RayTraceUtil
implements QClient {
    public static HitResult rayTrace(double rayTraceDistance, float yaw, float pitch, Entity entity) {
        Vec3d startVec = RayTraceUtil.mc.player.getEyePos();
        Vec3d directionVec = RayTraceUtil.getVectorForRotation(pitch, yaw);
        Vec3d endVec = startVec.add(directionVec.x * rayTraceDistance, directionVec.y * rayTraceDistance, directionVec.z * rayTraceDistance);
        return RayTraceUtil.mc.world.raycast(new RaycastContext(startVec, endVec, RaycastContext.class_3960.OUTLINE, RaycastContext.class_242.NONE, entity));
    }

    public static BlockHitResult raycast(Vec3d start, Vec3d end, RaycastContext.class_3960 shapeType) {
        return RayTraceUtil.raycast(start, end, shapeType, (Entity)RayTraceUtil.mc.player);
    }

    public static BlockHitResult raycast(Vec3d start, Vec3d end, RaycastContext.class_3960 shapeType, Entity entity) {
        return RayTraceUtil.mc.world.raycast(new RaycastContext(start, end, shapeType, RaycastContext.class_242.NONE, entity));
    }

    public static boolean rayTrace(Vec3d clientVec, double range, Box box) {
        Vec3d cameraVec = Objects.requireNonNull(RayTraceUtil.mc.player).getEyePos();
        return box.contains(cameraVec) || box.raycast(cameraVec, cameraVec.add(clientVec.multiply(range))).isPresent();
    }

    public static boolean isViewEntity(LivingEntity target, float yaw, float pitch, float distance, boolean ignoreWalls) {
        Entity entity = mc.getCameraEntity();
        if (entity == null || RayTraceUtil.mc.world == null) {
            return false;
        }
        double reachDistanceSquared = distance * distance;
        Vec3d startVec = entity.getEyePos();
        Vector3f directionVec = RayTraceUtil.calculateViewVector(yaw, pitch);
        directionVec.mul(distance, distance, distance);
        Vec3d endVec = startVec.add((double)directionVec.x, (double)directionVec.y, (double)directionVec.z);
        Box aabb = target.getBoundingBox();
        EntityHitResult result = ProjectileUtil.raycast((Entity)entity, (Vec3d)startVec, (Vec3d)endVec, (Box)aabb, entityIn -> !entityIn.isSpectator() && entityIn.isAlive() && entityIn == target, (double)reachDistanceSquared);
        return result != null;
    }

    public static Vector3f calculateViewVector(float yaw, float pitch) {
        float pitchRad = pitch * ((float)Math.PI / 180);
        float yawRad = -yaw * ((float)Math.PI / 180);
        float cosYaw = MathHelper.cos((float)yawRad);
        float sinYaw = MathHelper.sin((float)yawRad);
        float cosPitch = MathHelper.cos((float)pitchRad);
        float sinPitch = MathHelper.sin((float)pitchRad);
        return new Vector3f(sinYaw * cosPitch, -sinPitch, cosYaw * cosPitch);
    }

    public static Vec3d getVectorForRotation(float pitch, float yaw) {
        float yawRadians = -yaw * ((float)Math.PI / 180) - (float)Math.PI;
        float pitchRadians = -pitch * ((float)Math.PI / 180);
        float cosYaw = MathHelper.cos((float)yawRadians);
        float sinYaw = MathHelper.sin((float)yawRadians);
        float cosPitch = -MathHelper.cos((float)pitchRadians);
        float sinPitch = MathHelper.sin((float)pitchRadians);
        return new Vec3d((double)(sinYaw * cosPitch), (double)sinPitch, (double)(cosYaw * cosPitch));
    }

    public static boolean rayTraceSingleEntity(float yaw, float pitch, double distance, Entity entity) {
        Vec3d eyeVec = RayTraceUtil.mc.player.getEyePos();
        Vec3d lookVec = RayTraceUtil.mc.player.getRotationVector(pitch, yaw);
        Vec3d extendedVec = eyeVec.add(lookVec.multiply(distance));
        Box AABB = entity.getBoundingBox();
        return AABB.contains(eyeVec) || AABB.raycast(eyeVec, extendedVec).isPresent();
    }

    @Generated
    private RayTraceUtil() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}