package fun.wonderful.client.modules.impl.combat.components.rotations;

import fun.wonderful.api.QClient;
import fun.wonderful.client.modules.impl.combat.components.RotationsSystem;
import fun.wonderful.client.modules.impl.movement.Speed;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import ru.ocz.protection.annotation.Compile;

public class РотацияХолиВорлдИИ
extends RotationsSystem
implements QClient {
    private float lastYaw;
    private float lastPitch;
    private float acceleration;
    private boolean isBack;
    private double randomOffsetX;
    private double randomOffsetY;
    private double randomOffsetZ;
    private double randomTargetOffsetX;
    private double randomTargetOffsetY;
    private double randomTargetOffsetZ;
    private long randomOffsetRetargetMs;
    private float noiseYaw;
    private float noisePitch;
    private float noiseTargetYaw;
    private float noiseTargetPitch;
    private long noiseRetargetMs;
    private float humanYawVelocity;
    private float humanPitchVelocity;
    private float yawQuantizeCarry;
    private float pitchQuantizeCarry;
    private float aimFatigue;
    private float settleWaveTicks;
    private float lockWanderTicks;
    private float mouseArcTicks;
    private float mouseArcYaw;
    private float mouseArcPitch;
    private float mouseArcTargetYaw;
    private float mouseArcTargetPitch;
    private long mouseArcRetargetMs;
    private float visualYawVelocity;
    private float visualPitchVelocity;
    private float visualHeadYaw;
    private float visualBodyYaw;
    private boolean visualRotationReady;
    private int reactionDelayTicks;
    private int lockTicks;
    private int chaseTicks;
    private double cornerOffsetX;
    private double cornerOffsetY;
    private double cornerOffsetZ;
    private double cornerTargetX;
    private double cornerTargetY;
    private double cornerTargetZ;
    private int cornerPatternIndex;
    private long cornerRetargetMs;
    private float cornerWaveTicks;
    private float cornerOrbitPhase;
    private float cornerOrbitSpeed;
    private double cornerRadiusX;
    private double cornerRadiusZ;
    private double cornerVerticalScale;
    private float microMouseTicks;
    private LivingEntity trackedTarget;

    public void reset() {
        this.trackedTarget = null;
        this.acceleration = 0.0f;
        this.isBack = false;
        this.randomOffsetZ = 0.0;
        this.randomOffsetY = 0.0;
        this.randomOffsetX = 0.0;
        this.randomTargetOffsetZ = 0.0;
        this.randomTargetOffsetY = 0.0;
        this.randomTargetOffsetX = 0.0;
        this.randomOffsetRetargetMs = 0L;
        this.noisePitch = 0.0f;
        this.noiseYaw = 0.0f;
        this.noiseTargetPitch = 0.0f;
        this.noiseTargetYaw = 0.0f;
        this.noiseRetargetMs = 0L;
        this.humanPitchVelocity = 0.0f;
        this.humanYawVelocity = 0.0f;
        this.pitchQuantizeCarry = 0.0f;
        this.yawQuantizeCarry = 0.0f;
        this.aimFatigue = 0.0f;
        this.settleWaveTicks = 0.0f;
        this.lockWanderTicks = 0.0f;
        this.resetMouseArc();
        this.visualPitchVelocity = 0.0f;
        this.visualYawVelocity = 0.0f;
        this.visualRotationReady = false;
        this.reactionDelayTicks = 0;
        this.lockTicks = 0;
        this.chaseTicks = 0;
        this.resetCornerPattern();
        if (РотацияХолиВорлдИИ.mc.player != null) {
            this.lastYaw = РотацияХолиВорлдИИ.mc.player.getYaw();
            this.lastPitch = РотацияХолиВорлдИИ.mc.player.getPitch();
        }
    }

    @Override
    @Compile
    public native void updateRotations(LivingEntity var1);

    @Compile
    private native float getMovementPressure();

    @Compile
    private native float getStrafePressure();

    private float getTurnPressure(float angularDelta, float closeTurnPressure, float strafePressure, boolean inBox) {
        float anglePressure = MathHelper.clamp((float)((angularDelta - 32.0f) / 86.0f), (float)0.0f, (float)1.0f);
        float pressure = Math.max(anglePressure, closeTurnPressure * 0.92f);
        pressure = Math.max(pressure, strafePressure * 0.62f);
        if (inBox) {
            pressure *= 0.58f;
        }
        return MathHelper.clamp((float)pressure, (float)0.0f, (float)1.0f);
    }

    @Compile
    private native void updateHumanTiming(boolean var1, float var2, boolean var3, boolean var4, boolean var5, float var6);

    private float getReactionScale(boolean inBox, boolean bothGliding) {
        int threshold;
        if (inBox) {
            return bothGliding ? 0.42f : 0.34f;
        }
        int n2 = threshold = bothGliding ? 1 : 2;
        if (this.reactionDelayTicks <= threshold) {
            return 0.34f + (float)this.reactionDelayTicks * 0.075f;
        }
        return MathHelper.clamp((float)(0.62f + (float)(this.reactionDelayTicks - threshold) * 0.07f), (float)0.0f, (float)0.92f);
    }

    @Compile
    private native float getYawStepLimit(float var1, boolean var2, boolean var3);

    private float getPitchStepLimit(float angularDelta, boolean bothGliding, boolean airStrafe) {
        float base;
        float f2 = bothGliding ? 7.4f : (base = airStrafe ? 4.2f : 2.8f);
        float range = bothGliding ? 6.2f : (airStrafe ? 5.4f : 3.8f);
        float scaled = base + MathHelper.clamp((float)(angularDelta / 86.0f), (float)0.0f, (float)1.0f) * range;
        return scaled + (float)Math.random() * (bothGliding ? 1.4f : (airStrafe ? 0.9f : 0.7f));
    }

    private float getYawAccelerationLimit(float angularDelta, boolean bothGliding, boolean airStrafe) {
        float base;
        float f2 = bothGliding ? 5.8f : (base = airStrafe ? 3.9f : 2.8f);
        float range = bothGliding ? 6.4f : (airStrafe ? 5.2f : 3.8f);
        return base + MathHelper.clamp((float)(angularDelta / 82.0f), (float)0.0f, (float)1.0f) * range;
    }

    private float getPitchAccelerationLimit(float angularDelta, boolean bothGliding, boolean airStrafe) {
        float base;
        float f2 = bothGliding ? 3.8f : (base = airStrafe ? 2.35f : 1.75f);
        float range = bothGliding ? 4.1f : (airStrafe ? 3.0f : 2.25f);
        return base + MathHelper.clamp((float)(angularDelta / 90.0f), (float)0.0f, (float)1.0f) * range;
    }

    @Compile
    private native float[] computeSettleDrift(boolean var1, float var2);

    @Compile
    private native float[] computeLockWander(float var1, float var2);

    private void resetMouseArc() {
        this.mouseArcTicks = 0.0f;
        this.mouseArcPitch = 0.0f;
        this.mouseArcYaw = 0.0f;
        this.mouseArcTargetPitch = 0.0f;
        this.mouseArcTargetYaw = 0.0f;
        this.mouseArcRetargetMs = 0L;
    }

    @Compile
    private native float[] computeMouseArc(boolean var1, float var2, float var3, boolean var4, boolean var5);

    private boolean isRotationSafe(LivingEntity target, Vec3d eyePos, float yaw, float pitch, boolean bothGliding) {
        Vec3d lookVec = this.rotationVector(yaw, pitch);
        double reach = bothGliding ? 1488.0 : Math.max(6.0, eyePos.distanceTo(target.getBoundingBox().getCenter()) + 1.0);
        Box safeBox = target.getBoundingBox().expand(bothGliding ? 0.0 : -0.08);
        return safeBox.raycast(eyePos, eyePos.add(lookVec.multiply(reach))).isPresent();
    }

    private boolean isSlothLockTrace(Box box, Vec3d eyePos, Vec3d endVec, boolean bothGliding) {
        Box lockBox = box.expand(bothGliding ? 0.0 : -0.02);
        return lockBox.raycast(eyePos, endVec).isPresent();
    }

    private void syncVisibleRotation(float yaw, float pitch, boolean inBox, boolean groundedIdle, float angularDelta) {
        if (!this.visualRotationReady) {
            this.visualHeadYaw = РотацияХолиВорлдИИ.mc.player.headYaw;
            this.visualBodyYaw = РотацияХолиВорлдИИ.mc.player.bodyYaw;
            this.visualRotationReady = true;
        }
        float[] tremor = this.computeVisualTremor(inBox, groundedIdle, angularDelta);
        float targetHeadYaw = yaw + tremor[0];
        float targetHeadPitch = pitch + tremor[1];
        float yawDiff = MathHelper.wrapDegrees((float)(targetHeadYaw - this.visualHeadYaw));
        float pitchDiff = MathHelper.clamp((float)(targetHeadPitch - РотацияХолиВорлдИИ.mc.player.getPitch()), (float)-12.0f, (float)12.0f);
        float stiffness = groundedIdle ? 0.18f : 0.24f;
        float damping = groundedIdle ? 0.64f : 0.58f;
        this.visualYawVelocity = this.visualYawVelocity * damping + yawDiff * stiffness;
        this.visualPitchVelocity = this.visualPitchVelocity * (damping * 0.92f) + pitchDiff * (stiffness * 0.48f);
        this.visualYawVelocity = MathHelper.clamp((float)this.visualYawVelocity, (float)-7.5f, (float)7.5f);
        this.visualPitchVelocity = MathHelper.clamp((float)this.visualPitchVelocity, (float)-2.2f, (float)2.2f);
        РотацияХолиВорлдИИ.mc.player.prevHeadYaw = РотацияХолиВорлдИИ.mc.player.headYaw;
        this.visualHeadYaw += this.visualYawVelocity;
        РотацияХолиВорлдИИ.mc.player.headYaw = this.visualHeadYaw;
        float bodyFollow = groundedIdle ? 0.16f : 0.24f;
        float bodyDiff = MathHelper.wrapDegrees((float)(this.visualHeadYaw - this.visualBodyYaw));
        РотацияХолиВорлдИИ.mc.player.prevBodyYaw = РотацияХолиВорлдИИ.mc.player.bodyYaw;
        this.visualBodyYaw += MathHelper.clamp((float)(bodyDiff * bodyFollow), (float)-4.2f, (float)4.2f);
        РотацияХолиВорлдИИ.mc.player.bodyYaw = this.visualBodyYaw;
    }

    @Compile
    private native float[] computeVisualTremor(boolean var1, boolean var2, float var3);

    private Vec3d rotationVector(float yaw, float pitch) {
        float yawRad = -yaw * ((float)Math.PI / 180) - (float)Math.PI;
        float pitchRad = -pitch * ((float)Math.PI / 180);
        float pitchCos = MathHelper.cos((float)pitchRad);
        return new Vec3d((double)(MathHelper.sin((float)yawRad) * pitchCos), (double)MathHelper.sin((float)pitchRad), (double)(MathHelper.cos((float)yawRad) * pitchCos));
    }

    private float snapAbsoluteToGcd(float value, float gcd) {
        if (gcd <= 0.0f) {
            return value;
        }
        return value - value % gcd;
    }

    private float normalizeYaw(float yaw, float referenceYaw) {
        return referenceYaw + MathHelper.wrapDegrees((float)(yaw - referenceYaw));
    }

    private float quantizeStep(float step, float gcd, boolean yawAxis) {
        float quantized;
        if (gcd <= 0.0f) {
            return step;
        }
        float carriedStep = step + (yawAxis ? this.yawQuantizeCarry : this.pitchQuantizeCarry);
        float carry = carriedStep - (quantized = (float)(Math.floor(Math.abs(carriedStep) / gcd) * (double)gcd * (double)Math.signum(carriedStep)));
        if (Math.abs(carry) > gcd * 1.8f) {
            carry = MathHelper.clamp((float)carry, (float)(-gcd), (float)gcd);
        }
        if (yawAxis) {
            this.yawQuantizeCarry = carry;
        } else {
            this.pitchQuantizeCarry = carry;
        }
        return quantized;
    }

    private Vec3d computeAimPoint(LivingEntity target) {
        float targetYaw = target.getYaw();
        double offset = 0.28;
        double ox = (double)(-MathHelper.sin((float)(targetYaw * ((float)Math.PI / 180)))) * offset;
        double oz = (double)MathHelper.cos((float)(targetYaw * ((float)Math.PI / 180))) * offset;
        if (Speed.INSTANCE.isEnable()) {
            return new Vec3d(target.getX() + ox, target.getY() + (double)(target.getHeight() * 0.75f), target.getZ() + oz);
        }
        return new Vec3d(target.getX(), target.getY() + (double)(target.getHeight() * 0.75f), target.getZ());
    }

    public boolean hasVisiblePoint(LivingEntity target, double range) {
        if (target == null || РотацияХолиВорлдИИ.mc.player == null || РотацияХолиВорлдИИ.mc.world == null) {
            return false;
        }
        return this.getNearestVisiblePoint(target, this.computeAimPoint(target), range) != null;
    }

    private Vec3d getNearestVisiblePoint(LivingEntity target, Vec3d preferredPoint, double range) {
        double[][] samples;
        if (target == null || РотацияХолиВорлдИИ.mc.player == null || РотацияХолиВорлдИИ.mc.world == null) {
            return preferredPoint;
        }
        if (this.isPointVisible(preferredPoint, range)) {
            return preferredPoint;
        }
        Box box = target.getBoundingBox();
        Vec3d eyePos = РотацияХолиВорлдИИ.mc.player.getEyePos();
        Vec3d bestPoint = null;
        double bestDistance = Double.MAX_VALUE;
        for (double[] sample : samples = new double[][]{{0.5, 0.82, 0.5}, {0.5, 0.65, 0.5}, {0.5, 0.45, 0.5}, {0.18, 0.62, 0.5}, {0.82, 0.62, 0.5}, {0.5, 0.62, 0.18}, {0.5, 0.62, 0.82}, {0.24, 0.78, 0.24}, {0.76, 0.78, 0.76}}) {
            double distance;
            Vec3d point = new Vec3d(MathHelper.lerp((double)sample[0], (double)box.minX, (double)box.maxX), MathHelper.lerp((double)sample[1], (double)box.minY, (double)box.maxY), MathHelper.lerp((double)sample[2], (double)box.minZ, (double)box.maxZ));
            if (!this.isPointVisible(point, range)) continue;
            double d2 = distance = preferredPoint == null ? eyePos.squaredDistanceTo(point) : preferredPoint.squaredDistanceTo(point);
            if (!(distance < bestDistance)) continue;
            bestDistance = distance;
            bestPoint = point;
        }
        return bestPoint;
    }

    private boolean isPointVisible(Vec3d point, double range) {
        if (point == null || РотацияХолиВорлдИИ.mc.player == null) {
            return false;
        }
        Vec3d eyePos = РотацияХолиВорлдИИ.mc.player.getEyePos();
        return eyePos.distanceTo(point) <= range && this.isTraceClear(eyePos, point);
    }

    private boolean isTraceClear(Vec3d from, Vec3d to) {
        if (РотацияХолиВорлдИИ.mc.world == null) {
            return false;
        }
        BlockHitResult hit = РотацияХолиВорлдИИ.mc.world.raycast(new RaycastContext(from, to, RaycastContext.class_3960.COLLIDER, RaycastContext.class_242.NONE, (Entity)РотацияХолиВорлдИИ.mc.player));
        return hit.getType() == HitResult.class_240.MISS || from.squaredDistanceTo(hit.getPos()) >= from.squaredDistanceTo(to) - 1.0E-4;
    }

    private float getCloseTurnPressure(Box box, Vec3d eyePos) {
        double nearestZ;
        double nearestX = MathHelper.clamp((double)eyePos.x, (double)box.minX, (double)box.maxX);
        double closeDistance = Math.hypot(eyePos.x - nearestX, eyePos.z - (nearestZ = MathHelper.clamp((double)eyePos.z, (double)box.minZ, (double)box.maxZ)));
        if (closeDistance >= 1.45 || РотацияХолиВорлдИИ.mc.player.isGliding()) {
            return 0.0f;
        }
        Vec3d center = box.getCenter();
        float centerYaw = (float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(center.z - eyePos.z, center.x - eyePos.x)) - 90.0));
        float yawDelta = Math.abs(MathHelper.wrapDegrees((float)(centerYaw - РотацияХолиВорлдИИ.mc.player.getYaw())));
        return MathHelper.clamp((float)((yawDelta - 35.0f) / 85.0f), (float)0.0f, (float)1.0f);
    }

    public void onAttack(LivingEntity target) {
        if (target == null) {
            return;
        }
        this.updateRandomOffset(target);
        long now = System.currentTimeMillis();
        this.randomOffsetRetargetMs = now + 70L + (long)(Math.random() * 95.0);
        this.randomOffsetX += (this.randomTargetOffsetX - this.randomOffsetX) * 0.42;
        this.randomOffsetY += (this.randomTargetOffsetY - this.randomOffsetY) * 0.36;
        this.randomOffsetZ += (this.randomTargetOffsetZ - this.randomOffsetZ) * 0.42;
        this.noiseRetargetMs = now + 45L + (long)(Math.random() * 95.0);
        this.mouseArcRetargetMs = now + 35L + (long)(Math.random() * 85.0);
        this.cornerRetargetMs = 0L;
        this.cornerPatternIndex = (this.cornerPatternIndex + 1 + (int)(Math.random() * 3.0)) % 8;
        this.settleWaveTicks += 0.35f + (float)Math.random() * 0.42f;
        this.lockWanderTicks += 0.25f + (float)Math.random() * 0.36f;
        this.humanYawVelocity += (float)(Math.random() - 0.5) * 0.34f;
        this.humanPitchVelocity += (float)(Math.random() - 0.5) * 0.16f;
    }

    private void updateFloatingRandomOffset(LivingEntity target, boolean groundedIdle, boolean groundedMove, boolean airStrafe) {
        long now = System.currentTimeMillis();
        if (now >= this.randomOffsetRetargetMs) {
            long base;
            this.updateRandomOffset(target);
            long l2 = groundedIdle ? 145L : (groundedMove ? 125L : (base = airStrafe ? 105L : 115L));
            double span = groundedIdle ? 120.0 : (airStrafe ? 95.0 : 105.0);
            this.randomOffsetRetargetMs = now + base + (long)(Math.random() * span);
        }
        double ease = groundedIdle ? 0.03 : (groundedMove ? 0.04 : (airStrafe ? 0.058 : 0.048));
        this.randomOffsetX += (this.randomTargetOffsetX - this.randomOffsetX) * ease;
        this.randomOffsetY += (this.randomTargetOffsetY - this.randomOffsetY) * (ease * 0.82);
        this.randomOffsetZ += (this.randomTargetOffsetZ - this.randomOffsetZ) * ease;
    }

    private void updateRandomOffset(LivingEntity target) {
        Box box = target.getBoundingBox();
        double boxWidth = box.maxX - box.minX;
        double boxHeight = box.maxY - box.minY;
        double boxDepth = box.maxZ - box.minZ;
        double xScale = 0.14 + Math.random() * 0.11;
        double yScale = 0.1 + Math.random() * 0.1;
        double zScale = 0.14 + Math.random() * 0.11;
        this.randomTargetOffsetX = (Math.random() - 0.5) * boxWidth * xScale;
        this.randomTargetOffsetY = (Math.random() - 0.5) * boxHeight * yScale;
        this.randomTargetOffsetZ = (Math.random() - 0.5) * boxDepth * zScale;
    }

    private void resetCornerPattern() {
        this.cornerOffsetZ = 0.0;
        this.cornerOffsetY = 0.0;
        this.cornerOffsetX = 0.0;
        this.cornerTargetZ = 0.0;
        this.cornerTargetY = 0.0;
        this.cornerTargetX = 0.0;
        this.cornerPatternIndex = (int)(Math.random() * 8.0);
        this.cornerRetargetMs = 0L;
        this.cornerWaveTicks = 0.0f;
        this.cornerOrbitPhase = (float)(Math.random() * Math.PI * 2.0);
        this.cornerOrbitSpeed = 0.02f + (float)Math.random() * 0.022f;
        this.cornerRadiusZ = 0.0;
        this.cornerRadiusX = 0.0;
        this.cornerVerticalScale = 0.0;
        this.microMouseTicks = 0.0f;
    }

    private void updateCornerPattern(LivingEntity target, float movementPressure, float strafePressure, boolean airStrafe) {
        Box box = target.getBoundingBox();
        double width = box.maxX - box.minX;
        double height = box.maxY - box.minY;
        double depth = box.maxZ - box.minZ;
        long now = System.currentTimeMillis();
        double pressureScale = 1.0 - Math.max((double)movementPressure * 0.22, (double)strafePressure * 0.34);
        if (now >= this.cornerRetargetMs) {
            this.cornerRetargetMs = now + (airStrafe ? 260L : 230L) + (long)(Math.random() * (airStrafe ? 170.0 : 210.0));
            double movementScale = (airStrafe ? 0.22 : 0.56) * pressureScale;
            this.cornerRadiusX = width * (0.05 + Math.random() * 0.048) * movementScale;
            this.cornerRadiusZ = depth * (0.05 + Math.random() * 0.048) * movementScale;
            this.cornerVerticalScale = height * (0.01 + Math.random() * 0.02) * movementScale;
            this.cornerOrbitSpeed = (airStrafe ? 0.03f : 0.022f) + (float)Math.random() * (airStrafe ? 0.026f : 0.02f);
        }
        this.cornerOrbitPhase += this.cornerOrbitSpeed;
        this.cornerWaveTicks += (airStrafe ? 0.11f : 0.085f) + (float)Math.random() * 0.012f;
        double orbitX = Math.sin(this.cornerOrbitPhase) * this.cornerRadiusX;
        double orbitZ = Math.sin(this.cornerOrbitPhase * 0.74f + 1.45f) * this.cornerRadiusZ;
        double orbitY = Math.cos(this.cornerOrbitPhase * 0.58f + 0.8f) * this.cornerVerticalScale;
        double waveScale = (airStrafe ? 0.18 : 0.34) * pressureScale;
        double waveX = Math.sin(this.cornerWaveTicks * 0.52f + 0.6f) * width * 0.0045 * waveScale;
        double waveY = Math.cos(this.cornerWaveTicks * 0.39f) * height * 0.0032 * waveScale;
        double waveZ = Math.sin(this.cornerWaveTicks * 0.47f + 1.9f) * depth * 0.0045 * waveScale;
        this.cornerTargetX = orbitX + waveX;
        this.cornerTargetY = orbitY + waveY;
        this.cornerTargetZ = orbitZ + waveZ;
        double ease = (airStrafe ? 0.052 : 0.044) + Math.random() * 0.01;
        this.cornerOffsetX += (this.cornerTargetX - this.cornerOffsetX) * ease;
        this.cornerOffsetY += (this.cornerTargetY - this.cornerOffsetY) * (ease * 0.82);
        this.cornerOffsetZ += (this.cornerTargetZ - this.cornerOffsetZ) * ease;
    }

    private float[] computeHumanNoise(float angularDelta, float turnPressure) {
        long now = System.currentTimeMillis();
        if (now >= this.noiseRetargetMs) {
            this.noiseRetargetMs = now + 58L + (long)(Math.random() * 74.0);
            float scale = (angularDelta > 1.0f ? 1.0f : 0.34f) * MathHelper.lerp((float)turnPressure, (float)0.78f, (float)0.46f);
            this.noiseTargetYaw = (float)(Math.random() - 0.5) * 0.018f * scale;
            this.noiseTargetPitch = (float)(Math.random() - 0.5) * 0.014f * scale;
        }
        float ease = 0.12f + (float)Math.random() * 0.055f;
        this.noiseYaw += (this.noiseTargetYaw - this.noiseYaw) * ease;
        this.noisePitch += (this.noiseTargetPitch - this.noisePitch) * ease;
        float[] mouseFrequency = this.computeMouseFrequencyNoise(angularDelta, turnPressure, now);
        return new float[]{this.noiseYaw + mouseFrequency[0], this.noisePitch + mouseFrequency[1]};
    }

    private float[] computeMouseFrequencyNoise(float angularDelta, float turnPressure, long now) {
        if (angularDelta < 0.65f) {
            return new float[]{0.0f, 0.0f};
        }
        int fps = mc.getCurrentFps();
        float fpsFactor = MathHelper.clamp((float)((fps <= 0 ? 60.0f : (float)fps) / 120.0f), (float)0.45f, (float)1.65f);
        float aimScale = MathHelper.clamp((float)(angularDelta / 46.0f), (float)0.16f, (float)0.82f) * MathHelper.lerp((float)turnPressure, (float)1.0f, (float)0.58f);
        double time = (double)now / 1000.0;
        double cadence = 13.5 + (double)fpsFactor * 6.8;
        this.microMouseTicks += 0.2f + (float)Math.random() * 0.03f;
        float yaw = (float)(Math.sin(time * cadence + (double)(this.microMouseTicks * 0.33f)) * (double)0.01f + Math.sin(time * (cadence * 0.61) + 1.15) * (double)0.006f + Math.sin(time * (cadence * 1.37) + 2.45) * (double)0.0035f) * aimScale;
        float pitch = (float)(Math.cos(time * (cadence * 0.82) + (double)(this.microMouseTicks * 0.24f)) * (double)0.006f + Math.sin(time * (cadence * 1.18) + 0.55) * (double)0.003f) * aimScale;
        return new float[]{yaw, pitch};
    }

    private float gcd() {
        double f2 = (Double)РотацияХолиВорлдИИ.mc.options.getMouseSensitivity().getValue() * 0.6000000228414579 + 0.20000000275023325;
        return (float)(f2 * f2 * f2 * 8.0 * 0.15000000575046338);
    }
}