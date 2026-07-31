package fun.wonderful.client.modules.impl.combat.ivanrwrot;

import fun.wonderful.api.QClient;
import fun.wonderful.api.utils.rotate.Rotation;
import fun.wonderful.client.modules.impl.combat.components.rotations.ивангейелитра;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import ru.ocz.protection.annotation.Compile;

public class ИванРвРотация
implements QClient {
    private static final float ELYTRA_YAW_SPEED = 300.0f;
    private static final float ELYTRA_PITCH_SPEED = 300.0f;
    private static final float BASE_STIFFNESS = 0.24f;
    private static final float BASE_DAMPING = 0.6f;
    private static final float MAX_VEL_YAW = 150.0f;
    private static final float MAX_VEL_PITCH = 78.0f;
    private static final float NOISE_AMPLITUDE = 1.4f;
    private float yaw;
    private float pitch;
    private boolean initialized;
    private LivingEntity lastTarget;
    private int snapTicks;
    private float velocityYaw;
    private float velocityPitch;
    private float smoothYaw;
    private float smoothPitch;
    private float lastSentYaw;
    private float lastSentPitch;
    private float noiseAngle;
    private double aimPointX;
    private double aimPointY;
    private double aimPointZ;

    public float getRotateYaw() {
        return this.yaw;
    }

    public float getRotatePitch() {
        return this.pitch;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public void initReallyWorld() {
        if (ИванРвРотация.mc.player == null) {
            return;
        }
        this.initialized = true;
        this.yaw = ИванРвРотация.mc.player.getYaw();
        this.pitch = ИванРвРотация.mc.player.getPitch();
        this.resetSpring();
    }

    public void resetReallyWorld() {
        this.initialized = false;
        this.yaw = 0.0f;
        this.pitch = 0.0f;
        this.resetSpring();
        this.lastTarget = null;
    }

    @Compile
    public native Rotation update(LivingEntity var1);

    private float getElytraYawSpeed() {
        return иванелитра.blockPos ? 9999.0f : 300.0f;
    }

    private float getElytraPitchSpeed() {
        return иванелитра.blockPos ? 9999.0f : 300.0f;
    }

    private Vec3d getTargetVector(LivingEntity target) {
        if (ИванРвРотация.mc.player.isGliding() && target.isGliding() && !иванелитра.vector.equals((Object)Vec3d.ZERO)) {
            return иванелитра.vector;
        }
        Vec3d eyePos = ИванРвРотация.mc.player.getEyePos();
        Vec3d targetPoint = ИванРвРотация.mc.player.isGliding() ? this.getElytraTargetPoint(target) : this.getGroundTargetPoint(target, eyePos);
        return targetPoint.subtract(eyePos);
    }

    private Vec3d getGroundTargetPoint(LivingEntity target, Vec3d eyePos) {
        boolean close;
        Box box = target.getBoundingBox();
        Box aimBox = box.expand(0.035, 0.02, 0.035);
        Box safeBox = box.expand(-0.025);
        Vec3d predicted = this.predictGroundPosition(target);
        Vec3d current = target.getPos();
        Vec3d lead = predicted.subtract(current);
        boolean bl = close = target.distanceTo((Entity)Ивансынпидора.mc.player) < 2.35f;
        if (close) {
            lead = lead.multiply(0.25);
        }
        double maxLead = close ? 0.08 : 0.18;
        lead = new Vec3d(MathHelper.clamp((double)lead.x, (double)(-maxLead), (double)maxLead), 0.0, MathHelper.clamp((double)lead.z, (double)(-maxLead), (double)maxLead));
        Vec3d center = box.getCenter();
        Vec3d desired = this.clampToBox(center.add(lead).add(close ? Vec3d.ZERO : new Vec3d(this.aimPointX, this.aimPointY, this.aimPointZ)), safeBox, 0.035);
        Vec3d best = this.selectReachablePoint(eyePos, target, aimBox, desired);
        if (best != null) {
            return best;
        }
        return this.clampToBox(center, safeBox, 0.035);
    }

    private Vec3d predictGroundPosition(LivingEntity target) {
        Vec3d motion = target.getVelocity();
        double factor = target.isOnGround() ? 0.24 : 0.42;
        double speed = motion.length();
        if (speed > 0.3) {
            factor = Math.min(factor + speed * 0.28, 0.72);
        }
        if (target.distanceTo((Entity)ИванРвРотация.mc.player) < 2.0f) {
            factor *= 0.55;
        }
        return target.getPos().add(motion.multiply(factor));
    }

    private Vec3d selectReachablePoint(Vec3d eyePos, LivingEntity target, Box hitBox, Vec3d desired) {
        Vec3d center = hitBox.getCenter();
        Vec3d[] points = new Vec3d[]{desired, new Vec3d(center.x, MathHelper.lerp((double)0.62, (double)hitBox.minY, (double)hitBox.maxY), center.z), new Vec3d(center.x, MathHelper.lerp((double)0.48, (double)hitBox.minY, (double)hitBox.maxY), center.z), new Vec3d(center.x, MathHelper.lerp((double)0.76, (double)hitBox.minY, (double)hitBox.maxY), center.z), this.closestPoint(eyePos, hitBox, 0.045), this.clampToBox(desired.add(target.getVelocity().multiply(-0.12)), hitBox, 0.045)};
        Vec3d best = null;
        double bestScore = Double.MAX_VALUE;
        for (Vec3d point : points) {
            double score;
            if (point == null || !this.isPointHitable(eyePos, hitBox, point) || !this.isVisiblePoint(eyePos, point) || !((score = point.squaredDistanceTo(desired) + this.rotationCost(point) * 0.0025) < bestScore)) continue;
            bestScore = score;
            best = point;
        }
        return best;
    }

    private boolean isPointHitable(Vec3d eyePos, Box box, Vec3d point) {
        return box.contains(eyePos) || box.raycast(eyePos, point).isPresent();
    }

    private double rotationCost(Vec3d point) {
        Vec3d diff = point.subtract(ИванРвРотация.mc.player.getEyePos());
        float targetYaw = (float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(diff.z, diff.x)) - 90.0));
        float targetPitch = (float)MathHelper.clamp((double)(-Math.toDegrees(Math.atan2(diff.y, Math.hypot(diff.x, diff.z)))), (double)-89.0, (double)89.0);
        float yawDiff = MathHelper.wrapDegrees((float)(targetYaw - this.yaw));
        float pitchDiff = targetPitch - this.pitch;
        return yawDiff * yawDiff + pitchDiff * pitchDiff;
    }

    private Vec3d closestPoint(Vec3d point, Box box, double margin) {
        return new Vec3d(this.clampAxis(point.x, box.minX, box.maxX, margin), this.clampAxis(point.y, box.minY, box.maxY, margin), this.clampAxis(point.z, box.minZ, box.maxZ, margin));
    }

    private Vec3d clampToBox(Vec3d point, Box box, double margin) {
        return new Vec3d(this.clampAxis(point.x, box.minX, box.maxX, margin), this.clampAxis(point.y, box.minY, box.maxY, margin), this.clampAxis(point.z, box.minZ, box.maxZ, margin));
    }

    private double clampAxis(double value, double min, double max, double margin) {
        double low = min + margin;
        double high = max - margin;
        if (low > high) {
            double center;
            low = high = (center = (min + max) * 0.5);
        }
        return MathHelper.clamp((double)value, (double)low, (double)high);
    }

    private boolean isVisiblePoint(Vec3d eyePos, Vec3d point) {
        if (ИванРвРотация.mc.world == null) {
            return true;
        }
        RaycastContext context = new RaycastContext(eyePos, point, RaycastContext.class_3960.OUTLINE, RaycastContext.class_242.NONE, (Entity)ИванРвРотация.mc.player);
        return ИванРуРотация.mc.world.raycast(context).getType() == HitResult.class_240.MISS;
    }

    private Vec3d getElytraTargetPoint(LivingEntity target) {
        double y2 = target.getY() + (double)target.getHeight() / 2.0;
        if (!target.isGliding()) {
            double yDiff = y2 - ИванРвРотация.mc.player.getEyeY();
            y2 = (double)ИванРвРотация.mc.player.distanceTo((Entity)target) <= 2.0 ? ИванРвРотация.mc.player.getEyeY() + MathHelper.clamp((double)yDiff, (double)-2.0, (double)2.0) : y2;
        }
        return new Vec3d(target.getX(), y2, target.getZ());
    }

    @Compile
    private native void applyRotation(float var1, float var2, float var3, float var4);

    @Compile
    private native void applySpringRotation(LivingEntity var1, float var2, float var3);

    private float springInterp(float current, float target, float velocity, float stiffness, float damping) {
        float diff = target - current;
        float acceleration = diff * stiffness - velocity * damping;
        return velocity + acceleration;
    }

    private float smoothLerp(float from, float to, float alpha) {
        alpha = MathHelper.clamp((float)alpha, (float)0.0f, (float)1.0f);
        float delta = MathHelper.wrapDegrees((float)(to - from));
        return from + delta * alpha;
    }

    @Compile
    private native float[] generateNoise(float var1);

    @Compile
    private native void pickAimPoint(LivingEntity var1);

    private void resetSpring() {
        this.velocityYaw = 0.0f;
        this.velocityPitch = 0.0f;
        this.smoothYaw = this.yaw;
        this.smoothPitch = this.pitch;
        this.lastSentYaw = this.yaw;
        this.lastSentPitch = this.pitch;
        this.noiseAngle = (float)(Math.random() * Math.PI * 2.0);
        this.snapTicks = 0;
        this.aimPointX = 0.0;
        this.aimPointY = 0.0;
        this.aimPointZ = 0.0;
    }

    private double getGcd() {
        double sensitivity = (Double)ИванРвРотация.mc.options.getMouseSensitivity().getValue();
        double value = sensitivity * 0.6 + 0.2;
        double result = Math.pow(value, 1.5) * 0.8;
        return result * 0.15;
    }

    public void attacked() {
    }

    public void reset() {
        this.resetReallyWorld();
    }
}