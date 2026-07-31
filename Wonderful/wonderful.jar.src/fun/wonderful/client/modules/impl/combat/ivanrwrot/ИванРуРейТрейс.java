package fun.wonderful.client.modules.impl.combat.ivanrwrot;

import fun.wonderful.api.QClient;
import java.util.Optional;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import ru.ocz.protection.annotation.Compile;

public final class ИванРуРейТрейс
implements QClient {
    private ИванРуРейТрейс() {
    }

    public static HitResult rayTrace(double distance, float yaw, float pitch, Entity entity) {
        Vec3d start = ИванРуРейТрейс.mc.player.getEyePos();
        Vec3d direction = ИванРуРейТрейс.getVectorForRotation(pitch, yaw);
        Vec3d end = start.add(direction.x * distance, direction.y * distance, direction.z * distance);
        return ИванРуРейТрейс.mc.world.raycast(new RaycastContext(start, end, RaycastContext.class_3960.OUTLINE, RaycastContext.class_242.NONE, entity));
    }

    public static boolean rayTraceWithBlock(double distance, float yaw, float pitch, Entity entity, Entity target) {
        if (entity == null || target == null || ИванРуРейТрейс.mc.world == null || ИванРуРейТрейс.mc.player == null) {
            return false;
        }
        HitResult blockHit = ИванРуРейТрейс.rayTrace(distance, yaw, pitch, entity);
        Vec3d start = entity.getEyePos();
        double maxDistanceSq = distance * distance;
        if (blockHit != null && blockHit.getType() != HitResult.class_240.MISS) {
            maxDistanceSq = blockHit.getPos().squaredDistanceTo(start);
        }
        Vec3d direction = ИванРуРейТрейс.getVectorForRotation(pitch, yaw);
        Vec3d end = start.add(direction.multiply(distance));
        Box searchBox = entity.getBoundingBox().stretch(direction.multiply(distance)).expand(1.0, 1.0, 1.0);
        return ИванРуРейТрейс.tracedTo(entity, start, end, searchBox, checked -> !checked.isSpectator() && checked.isAlive(), maxDistanceSq, target);
    }

    public static boolean rayTraceEntityBox(double distance, float yaw, float pitch, Entity entity, Entity target) {
        if (entity == null || target == null || ИванРуРейТрейс.mc.world == null) {
            return false;
        }
        Vec3d start = entity.getEyePos();
        Vec3d direction = ИванРуРейТрейс.getVectorForRotation(pitch, yaw);
        Vec3d end = start.add(direction.multiply(distance));
        Box targetBox = target.getBoundingBox().expand(0.1);
        return targetBox.contains(start) || targetBox.raycast(start, end).isPresent();
    }

    public static double strictDistance(Entity entity, Entity target) {
        if (entity == null || target == null) {
            return Double.MAX_VALUE;
        }
        Vec3d eyes = entity.getEyePos();
        Box box = target.getBoundingBox();
        double x2 = Math.max(box.minX, Math.min(eyes.x, box.maxX));
        double y2 = Math.max(box.minY, Math.min(eyes.y, box.maxY));
        double z2 = Math.max(box.minZ, Math.min(eyes.z, box.maxZ));
        return eyes.distanceTo(new Vec3d(x2, y2, z2));
    }

    private static boolean tracedTo(Entity shooter, Vec3d start, Vec3d end, Box box, Predicate<Entity> filter, double distanceSq, Entity target) {
        double bestDistance = distanceSq;
        for (Entity entity : shooter.getWorld().getOtherEntities(shooter, box, filter)) {
            Vec3d hitPos;
            double hitDistance;
            Box entityBox = entity.getBoundingBox().expand(0.1);
            Optional hit = entityBox.raycast(start, end);
            if (entityBox.contains(start)) {
                if (!(bestDistance >= 0.0)) continue;
                if (entity == target) {
                    return true;
                }
                bestDistance = 0.0;
                continue;
            }
            if (!hit.isPresent() || !((hitDistance = start.squaredDistanceTo(hitPos = (Vec3d)hit.get())) <= bestDistance) && bestDistance != 0.0) continue;
            if (entity.getRootVehicle() == shooter.getRootVehicle()) {
                if (bestDistance != 0.0 || entity != target) continue;
                return true;
            }
            if (entity == target) {
                return true;
            }
            bestDistance = hitDistance;
        }
        return false;
    }

    @Compile
    public static native Vec3d getVectorForRotation(float var0, float var1);
}