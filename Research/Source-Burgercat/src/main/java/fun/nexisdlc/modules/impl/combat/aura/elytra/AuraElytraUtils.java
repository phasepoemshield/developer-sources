package fun.nexisdlc.modules.impl.combat.aura.elytra;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.modules.impl.combat.AuraModule;
import fun.nexisdlc.modules.impl.player.ElytraFunctional;
import lombok.experimental.UtilityClass;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

@UtilityClass
public class AuraElytraUtils extends AuraModule {
    public boolean shouldMovePredict(LivingEntity entity) {
        return targetBPS(entity) >= 26 && !isStanding(entity) && isLeaving(entity) && entity.isGliding();
    }

    public boolean isLeaving(LivingEntity entity) {
        if (entity == null)
            return false;
        return elytraTargetTimer.finished(1000) && entity.isGliding();
    }

    public boolean isLeaving(LivingEntity entity, int time) {
        if (entity == null)
            return false;
        return elytraTargetTimer.finished(time);
    }

    float targetBPS(LivingEntity entity) {
        if (entity == null)
            return 1.47f;
        double distance = Math.sqrt(
                Math.pow(entity.getX() - entity.lastRenderX, 2.0D) + Math.pow(entity.getY() - entity.lastRenderY, 2.0D)
                        + Math.pow(entity.getZ() - entity.lastRenderZ, 2.0D));
        float bps = (float) (distance * 20.0D);
        return (float) Math.round(bps * 10.0F) / 10.2F;
    }

    public Vec3d getEntityVelocity(LivingEntity entity) {
        if (entity == null)
            return null;

        if (shouldMovePredict(entity)) {
            return calcGlidingVelocity(entity, entity.getVelocity());
        } else {
            return entity.getVelocity();
        }
    }

    public Vec3d calcGlidingVelocity(LivingEntity entity, Vec3d oldVelocity) {
        Vec3d vec3d = entity.getRotationVector();
        float f = entity.getPitch() * (float) (Math.PI / 180.0);
        double d = Math.sqrt(vec3d.x * vec3d.x + vec3d.z * vec3d.z);
        double e = oldVelocity.horizontalLength();
        double g = entity.getEffectiveGravity();
        double h = MathHelper.square(Math.cos((double) f));

        oldVelocity = oldVelocity.add(0.0, g * (-1.0 + h * 0.75), 0.0);

        if (oldVelocity.y < 0.0 && d > 0.0) {
            double i = oldVelocity.y * -0.1 * h;
            oldVelocity = oldVelocity.add(vec3d.x * i / d, i, vec3d.z * i / d);
        }

        if (f < 0.0F && d > 0.0) {
            double i = e * (double) (-MathHelper.sin(f)) * 0.04;
            oldVelocity = oldVelocity.add(-vec3d.x * i / d, i * 3.2, -vec3d.z * i / d);
        }

        if (d > 0.0) {
            oldVelocity = oldVelocity.add((vec3d.x / d * e - oldVelocity.x) * 0.1, 0.0,
                    (vec3d.z / d * e - oldVelocity.z) * 0.1);
        }

        Vec3d horizontalDirection = new Vec3d(vec3d.x, 0.0, vec3d.z).normalize();

        double boost = getPredictValue();
        oldVelocity = oldVelocity.add(horizontalDirection.multiply(boost));

        return oldVelocity.multiply(0.99F, 0.98F, 0.99F);
    }

    public Vec3d calcGlidingVelocityPredicted(LivingEntity entity, Vec3d oldVelocity, float predict) {
        Vec3d vec3d = entity.getRotationVector();
        float f = entity.getPitch() * (float) (Math.PI / 180.0);
        double d = Math.sqrt(vec3d.x * vec3d.x + vec3d.z * vec3d.z);
        double e = oldVelocity.horizontalLength();
        double g = entity.getEffectiveGravity();
        double h = MathHelper.square(Math.cos((double) f));

        oldVelocity = oldVelocity.add(0.0, g * (-1.0 + h * 0.75), 0.0);

        if (oldVelocity.y < 0.0 && d > 0.0) {
            double i = oldVelocity.y * -0.1 * h;
            oldVelocity = oldVelocity.add(vec3d.x * i / d, i, vec3d.z * i / d);
        }

        if (f < 0.0F && d > 0.0) {
            double i = e * (double) (-MathHelper.sin(f)) * 0.04;
            oldVelocity = oldVelocity.add(-vec3d.x * i / d, i * 3.2, -vec3d.z * i / d);
        }

        if (d > 0.0) {
            oldVelocity = oldVelocity.add((vec3d.x / d * e - oldVelocity.x) * 0.1, 0.0,
                    (vec3d.z / d * e - oldVelocity.z) * 0.1);
        }

        Vec3d horizontalDirection = new Vec3d(vec3d.x, vec3d.y, vec3d.z).normalize();
        oldVelocity = oldVelocity.add(horizontalDirection.multiply(predict, 0.5f, predict));

        return oldVelocity.multiply(0.99F, 0.98F, 0.99F);
    }

    boolean isStanding(LivingEntity entity) {
        if (entity == null)
            return false;

        double motionX = target.getX() - target.lastX;
        double motionZ = target.getZ() - target.lastZ;

        double speed = Math.sqrt(motionX * motionX + motionZ * motionZ);

        return speed < 0.001;
    }

    float getPredictValue() {
        var boost = (target != null && target.isGliding() && Nexis.getFunctionManager().getElytraMotion().isState())
                ? 0.5f
                : 0;
        var result = ElytraFunctional.predict.get() ? ElytraFunctional.predictValue.get() : 1.56f;

        return result + boost;
    }
}
