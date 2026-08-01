package fun.wonderful.client.modules.impl.combat.components.rotations;

import fun.wonderful.api.utils.combat.rotation.Rotation;
import fun.wonderful.api.utils.math.MathUtils;
import fun.wonderful.client.modules.impl.combat.components.RotationsSystem;
import fun.wonderful.client.modules.impl.combat.components.rotations.КомпонентЭлитры;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;

public class РотацияЭлитры
extends RotationsSystem {
    private double lastSpeed = 0.0;
    private double prevSpeed = 0.0;
    private static Vec2f lastRotation = Vec2f.ZERO;

    @Override
    public void updateRotations(LivingEntity target) {
        if (РотацияЭлитры.mc.player == null || target == null) {
            return;
        }
        this.prevSpeed = this.lastSpeed;
        this.lastSpeed = MathUtils.getBps((Entity)target);
        this.rotate = РотацияЭлитры.mc.player.isGliding() && target.isGliding() ? this.computeFromVector(КомпонентЭлитры.vector) : this.computeGroundRotation(target);
        lastRotation = this.rotate;
    }

    private Vec2f computeFromVector(Vec3d vec3d) {
        if (vec3d.equals((Object)Vec3d.ZERO)) {
            return new Vec2f(РотацияЭлитры.mc.player.getYaw(), РотацияЭлитры.mc.player.getPitch());
        }
        float rawYaw = (float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(vec3d.z, vec3d.x)) - 90.0));
        float rawPitch = (float)MathHelper.wrapDegrees((double)Math.toDegrees(-Math.atan2(vec3d.y, Math.hypot(vec3d.x, vec3d.z))));
        Vec2f current = РотацияЭлитры.getCurrentRotation();
        float currentYaw = current.x;
        float currentPitch = current.y;
        float yawDelta = MathHelper.wrapDegrees((float)(rawYaw - currentYaw));
        float pitchDelta = MathHelper.wrapDegrees((float)(rawPitch - currentPitch));
        float speed = КомпонентЭлитры.blockPos ? 9999.0f : 150.0f;
        float newYaw = currentYaw + MathHelper.clamp((float)yawDelta, (float)(-speed), (float)speed);
        float newPitch = MathHelper.clamp((float)(currentPitch + MathHelper.clamp((float)pitchDelta, (float)(-speed), (float)speed)), (float)-89.9f, (float)89.9f);
        float gcd = Rotation.gcd();
        newYaw -= (newYaw - currentYaw) % gcd;
        newPitch -= (newPitch - currentPitch) % gcd;
        return new Vec2f(newYaw, newPitch);
    }

    private Vec2f computeGroundRotation(LivingEntity target) {
        Vec3d eyePos = РотацияЭлитры.mc.player.getEyePos();
        Vec3d closest = new Vec3d(MathHelper.clamp((double)eyePos.x, (double)target.getBoundingBox().minX, (double)target.getBoundingBox().maxX), MathHelper.clamp((double)eyePos.y, (double)target.getBoundingBox().minY, (double)target.getBoundingBox().maxY), MathHelper.clamp((double)eyePos.z, (double)target.getBoundingBox().minZ, (double)target.getBoundingBox().maxZ));
        Vec3d diff = closest.subtract(eyePos);
        double distXZ = Math.hypot(diff.x, diff.z);
        float yaw = (float)Math.toDegrees(Math.atan2(diff.z, diff.x)) - 90.0f;
        float pitch = (float)(-Math.toDegrees(Math.atan2(diff.y, distXZ)));
        if (РотацияЭлитры.mc.player.isGliding() && !target.isGliding() && pitch < 0.0f) {
            float verticalDrop = (float)(eyePos.y - target.getEyeY());
            float maxDive = 35.0f;
            if (verticalDrop > 1.5f && distXZ > 0.001) {
                float glideRatio = (float)((double)verticalDrop / Math.max(distXZ, 0.001));
                maxDive = MathHelper.clamp((float)(15.0f + glideRatio * 12.0f), (float)18.0f, (float)42.0f);
            }
            pitch = MathHelper.clamp((float)pitch, (float)(-maxDive), (float)90.0f);
        }
        yaw += ThreadLocalRandom.current().nextFloat(-0.5f, 0.5f);
        pitch += ThreadLocalRandom.current().nextFloat(-0.3f, 0.3f);
        pitch = MathHelper.clamp((float)pitch, (float)-90.0f, (float)90.0f);
        float gcd = Rotation.gcd();
        yaw -= yaw % gcd;
        pitch -= pitch % gcd;
        return new Vec2f(yaw, pitch);
    }

    public void attacked() {
    }

    public static void reset() {
        lastRotation = Vec2f.ZERO;
    }

    private static Vec2f getCurrentRotation() {
        if (lastRotation == Vec2f.ZERO || Float.isNaN(РотацияЭлитры.lastRotation.x) || Float.isNaN(РотацияЭлитры.lastRotation.y)) {
            return new Vec2f(РотацияЭлитры.mc.player.getYaw(), РотацияЭлитры.mc.player.getPitch());
        }
        return lastRotation;
    }

    @Generated
    public double getLastSpeed() {
        return this.lastSpeed;
    }

    @Generated
    public double getPrevSpeed() {
        return this.prevSpeed;
    }
}