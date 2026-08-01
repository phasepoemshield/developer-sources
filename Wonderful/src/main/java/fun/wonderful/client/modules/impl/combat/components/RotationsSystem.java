package fun.wonderful.client.modules.impl.combat.components;

import fun.wonderful.api.QClient;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.combat.PredictUtils;
import fun.wonderful.client.modules.impl.combat.components.gcd.GCDUtil;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;

public abstract class RotationsSystem
implements QClient {
    public Vec2f rotate = Vec2f.ZERO;

    public abstract void updateRotations(LivingEntity var1);

    public static Vec2f correctRotation(float yaw, float pitch) {
        if (yaw == -90.0f && pitch == 90.0f || yaw == -180.0f) {
            return new Vec2f(RotationsSystem.mc.player.getYaw(), RotationsSystem.mc.player.getPitch());
        }
        float gcd = GCDUtil.getGCD();
        yaw -= yaw % gcd;
        pitch -= pitch % gcd;
        return new Vec2f(yaw, pitch);
    }

    protected boolean shouldUseElytraPredict(LivingEntity target) {
        return RotationsSystem.mc.player != null && target != null && RotationsSystem.mc.player.isGliding() && target.isGliding() && ModuleClass.elytraTarget != null && ModuleClass.elytraTarget.isEnable();
    }

    protected int getElytraPredictTicks() {
        if (ModuleClass.elytraTarget == null) {
            return 0;
        }
        return Math.max(0, (int)ModuleClass.elytraTarget.getElytraForward());
    }

    protected Vec3d getPredictedPoint(LivingEntity target, Vec3d point) {
        if (!this.shouldUseElytraPredict(target)) {
            return point;
        }
        return PredictUtils.bypasselytrahacking(target);
    }

    protected Box getPredictedBox(LivingEntity target) {
        Box box = target.getBoundingBox();
        if (!this.shouldUseElytraPredict(target)) {
            return box;
        }
        Vec3d currentCenter = box.getCenter();
        Vec3d predictedCenter = this.getPredictedPoint(target, currentCenter);
        return box.offset(predictedCenter.subtract(currentCenter));
    }
}