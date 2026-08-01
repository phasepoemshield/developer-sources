package fun.wonderful.api.utils.combat;

import fun.wonderful.api.QClient;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.network.PlayerListEntry;

public class PredictUtils
implements QClient {
    private static final Map<UUID, PositionData> positionCache = new ConcurrentHashMap<UUID, PositionData>();
    private static final double MAX_DOWN_PITCH = 32.0;
    private static final double MAX_CHASE_DOWN_PITCH = 48.0;
    private static final double MAX_UP_PITCH = 56.0;
    private static boolean predictCondition;
    private static int movementTicks;
    private static boolean prePredictCondition;
    private static long lastSmartPredictMs;
    private static boolean blockPos;
    private static Vec3d cachedAimPoint;
    private static int cachedAimTick;
    private static LivingEntity cachedAimTarget;
    private static Vec3d lastAimWorldPoint;

    public static void updateEntity(LivingEntity entity) {
        PositionData data = positionCache.computeIfAbsent(entity.getUuid(), k2 -> new PositionData());
        data.update(entity.getX(), entity.getY(), entity.getZ());
    }

    public static PositionData getData(LivingEntity entity) {
        return positionCache.get(entity.getUuid());
    }

    public static Vec3d predict(LivingEntity entity, int ticks, float extraForward, boolean isMeFlying) {
        PositionData data = PredictUtils.getData(entity);
        Vec3d pos = new Vec3d(entity.getX(), entity.getY() + (double)(entity.getStandingEyeHeight() / 2.0f), entity.getZ());
        if (data == null) {
            return PredictUtils.predictElytraPhysics(entity, pos, ticks);
        }
        Vec3d forward = data.getResolvedForward();
        double speed = data.getLastSpeed();
        boolean isHighSpeed = data.isSpeedChanged();
        if (entity.isGliding()) {
            double horizontalSpeed = Math.hypot(forward.x, forward.z) * 20.0;
            double verticalSpeed = Math.abs(forward.y) * 20.0;
            if (horizontalSpeed <= 5.0 && verticalSpeed <= 5.0) {
                return pos;
            }
            boolean shouldPredict = isMeFlying && entity.isGliding() && isHighSpeed;
            float predictMultiplier = shouldPredict ? (float)(ticks + 2) + extraForward : (float)ticks;
            Vec3d linearPredict = pos.add(forward.multiply((double)predictMultiplier, (double)predictMultiplier, (double)predictMultiplier));
            Vec3d physicsPredict = PredictUtils.predictElytraPhysics(entity, pos, ticks);
            double weight = MathHelper.clamp((double)(speed / 50.0), (double)0.3, (double)0.9);
            return new Vec3d(MathHelper.lerp((double)weight, (double)physicsPredict.x, (double)linearPredict.x), MathHelper.lerp((double)weight, (double)physicsPredict.y, (double)linearPredict.y), MathHelper.lerp((double)weight, (double)physicsPredict.z, (double)linearPredict.z));
        }
        if (speed > 1.0) {
            return pos.add(forward.multiply((double)ticks, (double)ticks, (double)ticks));
        }
        return pos;
    }

    public static Vec3d predict(LivingEntity entity, Vec3d pos, int ticks) {
        PositionData data = PredictUtils.getData(entity);
        if (data != null && entity.isGliding()) {
            Vec3d forward = data.getResolvedForward();
            double horizontalSpeed = Math.hypot(forward.x, forward.z) * 20.0;
            double verticalSpeed = Math.abs(forward.y) * 20.0;
            if (horizontalSpeed <= 5.0 && verticalSpeed <= 5.0) {
                return pos;
            }
            return pos.add(forward.multiply((double)ticks, (double)ticks, (double)ticks));
        }
        return PredictUtils.predictElytraPhysics(entity, pos, ticks);
    }

    public static Vec3d predictElytraPhysics(LivingEntity entity, Vec3d pos, int ticks) {
        Vec3d velocity = entity.getVelocity();
        if (!entity.isGliding()) {
            return pos.add(velocity.multiply((double)ticks, (double)ticks, (double)ticks));
        }
        double horizontalDelta = Math.hypot(entity.prevX - entity.getX(), entity.prevZ - entity.getZ()) * 20.0;
        double verticalDelta = Math.abs(entity.getY() - entity.prevY) * 20.0;
        if (horizontalDelta <= 5.0 && verticalDelta <= 5.0) {
            return pos;
        }
        for (int i2 = 0; i2 < ticks; ++i2) {
            Vec3d rotation = entity.getRotationVector();
            float pitchRad = (float)Math.toRadians(entity.getPitch());
            double horizontalSpeed = Math.sqrt(velocity.x * velocity.x + velocity.z * velocity.z);
            double velocityLength = velocity.length();
            float cos = MathHelper.cos((float)pitchRad);
            cos = (float)((double)(cos * cos) * Math.min(1.0, rotation.length() / 0.4));
            velocity = velocity.add(0.0, -0.08 * (-1.0 + (double)cos * 0.75), 0.0);
            if (velocity.y < 0.0 && horizontalSpeed > 0.0) {
                double d5 = velocity.y * -0.1 * (double)cos;
                velocity = velocity.add(rotation.x * d5 / horizontalSpeed, d5, rotation.z * d5 / horizontalSpeed);
            }
            if (pitchRad < 0.0f && horizontalSpeed > 0.0) {
                double lift = velocityLength * (double)(-MathHelper.sin((float)pitchRad)) * 0.04;
                velocity = velocity.add(-rotation.x * lift / horizontalSpeed, lift * 3.2, -rotation.z * lift / horizontalSpeed);
            }
            if (horizontalSpeed > 0.0) {
                velocity = velocity.add((rotation.x / horizontalSpeed * velocityLength - velocity.x) * 0.1, 0.0, (rotation.z / horizontalSpeed * velocityLength - velocity.z) * 0.1);
            }
            velocity = velocity.multiply(0.99, 0.98, 0.99);
            pos = pos.add(velocity);
        }
        return pos;
    }

    public static Vec3d bypasselytrahacking(LivingEntity target) {
        Vec3d result;
        Vec3d aimPoint;
        if (PredictUtils.mc.player == null || target == null) {
            blockPos = false;
            lastAimWorldPoint = Vec3d.ZERO;
            return Vec3d.ZERO;
        }
        int currentTick = PredictUtils.mc.player.age;
        if (cachedAimTick == currentTick && cachedAimTarget == target && !cachedAimPoint.equals((Object)Vec3d.ZERO)) {
            return cachedAimPoint;
        }
        Vec3d eyePos = PredictUtils.mc.player.getEyePos();
        PredictUtils.updateSmartPredictState(target);
        boolean shouldPredict = PredictUtils.shouldUseIvanPredict(target);
        boolean fullEnabled = PredictUtils.shouldUseFullPursuit(target);
        blockPos = shouldPredict;
        if (shouldPredict) {
            double distanceValue = ModuleClass.elytraTarget != null ? ModuleClass.elytraTarget.distance.getValue().doubleValue() : 3.0;
            Vec3d forward = PredictUtils.resolveHorizontalForward(target);
            Vec3d basePos = target.getEyePos().add(forward.multiply(distanceValue));
            Vec3d pedik = basePos.add(forward.multiply(2.0));
            pedik = PredictUtils.compensateLatencyPoint(target, pedik);
            if (fullEnabled) {
                pedik = PredictUtils.lockFullPursuitPoint(target, pedik);
            }
            aimPoint = pedik;
        } else {
            Vec3d fenal;
            double widthHalf = (double)target.getWidth() / 2.0;
            double yExpand = MathHelper.clamp((double)(target.getEyeY() - target.getY()), (double)0.0, (double)((double)target.getHeight() - (PredictUtils.mc.player.isGliding() ? 0.0 : 0.5)));
            double xExpand = MathHelper.clamp((double)(PredictUtils.mc.player.getX() - target.getX()), (double)(-widthHalf), (double)widthHalf);
            double zExpand = MathHelper.clamp((double)(PredictUtils.mc.player.getZ() - target.getZ()), (double)(-widthHalf), (double)widthHalf);
            double strictDist = PredictUtils.getStrictDistance(target);
            double yLerpFactor = strictDist / 3.0;
            Vec3d rawVec = target.getPos().add(0.0, MathHelper.clamp((double)(PredictUtils.mc.player.getEyeY() - target.getY()), (double)0.0, (double)((double)target.getHeight() * yLerpFactor)), 0.0).subtract(eyePos);
            Vec3d normalizedVec = rawVec.lengthSquared() > 1.0E-6 ? rawVec.normalize() : Vec3d.ZERO;
            boolean ordinaryAim = ModuleClass.elytraTarget == null || ModuleClass.elytraTarget.getTargetMode().is("Обычная") || ModuleClass.elytraTarget.getTargetMode().is("Ноги") && !PredictUtils.mc.player.isGliding();
            Vec3d VanillaChestLootTableGenerator = fenal = ordinaryAim ? new Vec3d(target.getX() - PredictUtils.mc.player.getX() + xExpand, target.getY() - PredictUtils.mc.player.getEyeY() + yExpand, target.getZ() - PredictUtils.mc.player.getZ() + zExpand) : normalizedVec;
            if (fullEnabled) {
                Vec3d worldPoint = new Vec3d(PredictUtils.mc.player.getX() + fenal.x, PredictUtils.mc.player.getEyeY() + fenal.y, PredictUtils.mc.player.getZ() + fenal.z);
                Vec3d locked = PredictUtils.lockFullPursuitPoint(target, worldPoint);
                fenal = new Vec3d(locked.x - PredictUtils.mc.player.getX(), locked.y - PredictUtils.mc.player.getEyeY(), locked.z - PredictUtils.mc.player.getZ());
            }
            aimPoint = eyePos.add(fenal);
        }
        if (shouldPredict || fullEnabled) {
            lastAimWorldPoint = aimPoint;
            cachedAimPoint = aimPoint;
            cachedAimTick = currentTick;
            cachedAimTarget = target;
            return aimPoint;
        }
        Vec3d stabilizedVector = PredictUtils.stabilizeElytraVector(target, aimPoint.subtract(eyePos));
        lastAimWorldPoint = result = eyePos.add(stabilizedVector);
        cachedAimPoint = result;
        cachedAimTick = currentTick;
        cachedAimTarget = target;
        return result;
    }

    public static float getElytraRotationSpeed() {
        return blockPos ? 9999.0f : 150.0f;
    }

    public static float getElytraYawSpeed() {
        return blockPos ? 9999.0f : 150.0f;
    }

    public static float getElytraPitchSpeed() {
        return blockPos ? 9999.0f : 150.0f;
    }

    public static boolean isBlockPos() {
        return blockPos;
    }

    private static boolean shouldUseIvanPredict(LivingEntity target) {
        return !(PredictUtils.mc.player == null || target == null || ModuleClass.elytraTarget == null || !ModuleClass.elytraTarget.isEnable() || !ModuleClass.elytraTarget.prediction.isState() || !predictCondition && !ModuleClass.elytraTarget.predictMode.is("Reallyworld") || !PredictUtils.mc.player.isGliding() || !target.isGliding() || ModuleClass.freeCam != null && ModuleClass.freeCam.isEnable());
    }

    public static void updateSmartPredictState(LivingEntity target) {
        double z2;
        double y2;
        if (target == null) {
            return;
        }
        long now = System.currentTimeMillis();
        if (now - lastSmartPredictMs < 50L) {
            return;
        }
        double x2 = target.getX() - target.prevX;
        double dist = Math.sqrt(x2 * x2 + (y2 = target.getY() - target.prevY) * y2 + (z2 = target.getZ() - target.prevZ) * z2);
        double finalSpeed = dist * 20.0;
        if (finalSpeed > 20.0) {
            movementTicks = 0;
            prePredictCondition = false;
            predictCondition = true;
        } else {
            ++movementTicks;
            if (predictCondition) {
                prePredictCondition = true;
            }
            if (movementTicks >= 3) {
                predictCondition = false;
                movementTicks = 0;
                prePredictCondition = false;
            } else {
                predictCondition = prePredictCondition;
            }
        }
        lastSmartPredictMs = now;
    }

    private static boolean shouldUseFullPursuit(LivingEntity target) {
        return PredictUtils.mc.player != null && target != null && PredictUtils.mc.player.isGliding() && target.isGliding() && ModuleClass.elytraTarget != null && ModuleClass.elytraTarget.isEnable() && ModuleClass.elytraTarget.getFull().isState();
    }

    private static Vec3d compensateLatencyPoint(LivingEntity target, Vec3d point) {
        if (PredictUtils.mc.player == null || target == null) {
            return point;
        }
        int ping = 0;
        try {
            PlayerListEntry entry;
            if (mc.getNetworkHandler() != null && (entry = mc.getNetworkHandler().getPlayerListEntry(PredictUtils.mc.player.getUuid())) != null) {
                ping = entry.getLatency();
            }
        }
        catch (Throwable entry) {
            
        }
        ping = MathHelper.clamp((int)ping, (int)0, (int)300);
        double ticks = (double)ping / 50.0;
        Vec3d motion = target.getVelocity();
        double speed = motion.length();
        if (speed < 0.05 || ticks <= 0.0) {
            return point;
        }
        double scale = MathHelper.clamp((double)(ticks * 0.85), (double)0.0, (double)4.5);
        return point.add(motion.multiply(scale));
    }

    private static Vec3d lockFullPursuitPoint(LivingEntity target, Vec3d point) {
        boolean divingToLowerTarget;
        double directPitch;
        double keepPitch;
        if (PredictUtils.mc.player == null) {
            return point;
        }
        double meEyeY = PredictUtils.mc.player.getEyeY();
        double targetEyeY = target.getEyeY();
        double heightDiff = meEyeY - targetEyeY;
        double motionY = target.getVelocity().y;
        double pointX = point.x;
        double pointZ = point.z;
        Vec3d myMotionFlat = new Vec3d(PredictUtils.mc.player.getVelocity().x, 0.0, PredictUtils.mc.player.getVelocity().z);
        double mySpeedSq = myMotionFlat.lengthSquared();
        double horizDist = Math.hypot(target.getX() - PredictUtils.mc.player.getX(), target.getZ() - PredictUtils.mc.player.getZ());
        boolean aboveTarget = horizDist < 2.0 && heightDiff > 1.2;
        boolean closeRange = horizDist < 4.0 && Math.abs(heightDiff) < 2.5;
        double align = 0.0;
        if (mySpeedSq > 0.02 && horizDist > 0.3) {
            Vec3d mDir = myMotionFlat.normalize();
            Vec3d tFlat = new Vec3d(target.getX() - PredictUtils.mc.player.getX(), 0.0, target.getZ() - PredictUtils.mc.player.getZ());
            align = mDir.dotProduct(tFlat.normalize());
        }
        if (closeRange) {
            pointX = target.getX();
            pointZ = target.getZ();
        } else if (horizDist < 1.5 && Math.abs(heightDiff) > 2.0) {
            if (heightDiff > 2.0) {
                pointX = target.getX();
                pointZ = target.getZ();
            } else {
                Vec3d dir;
                dir = mySpeedSq > 0.01 ? myMotionFlat.normalize() : new Vec3d(-Math.sin(Math.toRadians(PredictUtils.mc.player.getYaw())), 0.0, Math.cos(Math.toRadians(PredictUtils.mc.player.getYaw())));
                pointX = target.getX() + dir.x * 3.0;
                pointZ = target.getZ() + dir.z * 3.0;
            }
        } else if (horizDist < 6.0 && mySpeedSq > 0.16) {
            dir = myMotionFlat.normalize();
            double forward = align < -0.2 ? 2.8 : 1.6;
            pointX = target.getX() + dir.x * forward;
            pointZ = target.getZ() + dir.z * forward;
        } else if (horizDist < 10.0 && mySpeedSq > 0.16) {
            dir = myMotionFlat.normalize();
            double forward = align < -0.2 ? 3.0 : 2.0;
            pointX = target.getX() + dir.x * forward;
            pointZ = target.getZ() + dir.z * forward;
        } else if (align < -0.55 && mySpeedSq > 0.04) {
            Vec3d myDir = myMotionFlat.normalize();
            pointX = target.getX() + myDir.x * 4.0;
            pointZ = target.getZ() + myDir.z * 4.0;
        }
        double targetY = closeRange ? target.getY() + (double)target.getHeight() * 0.5 : (aboveTarget ? target.getY() + (double)target.getHeight() * 0.65 + MathHelper.clamp((double)(motionY * 0.6), (double)-0.5, (double)1.0) : (align < -0.2 && mySpeedSq > 0.04 ? Math.max(targetEyeY, meEyeY + 0.45) : (horizDist < 6.0 ? target.getY() + (double)target.getHeight() * 0.55 + MathHelper.clamp((double)(motionY * 0.7), (double)-0.6, (double)1.0) : targetEyeY + 0.25 + MathHelper.clamp((double)(motionY * 2.0), (double)-2.0, (double)3.0))));
        double relativeY = motionY - PredictUtils.mc.player.getVelocity().y;
        if (!closeRange && (heightDiff < -0.2 || relativeY > 0.08)) {
            targetY += MathHelper.clamp((double)(-heightDiff * 0.55 + relativeY * 2.4), (double)0.0, (double)2.4);
        }
        double mySpeed = PredictUtils.mc.player.getVelocity().length();
        double targetSpeed = target.getVelocity().length();
        if (!closeRange && (heightDiff < 0.4 || motionY > 0.08 || relativeY > 0.06)) {
            double leadTicks = MathHelper.clamp((double)(horizDist / Math.max(mySpeed, 0.35) + targetSpeed * 1.5), (double)2.0, (double)8.0);
            double predictedY = targetEyeY + motionY * leadTicks + MathHelper.clamp((double)(relativeY * leadTicks * 0.45), (double)0.0, (double)2.0);
            targetY = Math.max(targetY, predictedY + MathHelper.clamp((double)(-heightDiff * 0.2), (double)0.0, (double)0.8));
        }
        double horizontal = Math.max(1.0, Math.hypot(pointX - PredictUtils.mc.player.getX(), pointZ - PredictUtils.mc.player.getZ()));
        double d2 = align < 0.0 ? (PredictUtils.mc.player.getVelocity().y < -0.03 ? 7.0 : 4.0) : (keepPitch = horizDist < 6.0 ? 3.0 : 2.0);
        if (!aboveTarget && !closeRange && (heightDiff < 2.5 || align < 0.0)) {
            targetY = Math.max(targetY, meEyeY + Math.tan(Math.toRadians(keepPitch)) * horizontal);
        }
        if (!aboveTarget && !closeRange && align > -0.15 && horizDist > 6.0 && heightDiff < 1.2) {
            double speedPitch = MathHelper.clamp((double)((horizDist - 6.0) * 2.0 + 18.0), (double)18.0, (double)32.0);
            targetY = Math.max(targetY, meEyeY + Math.tan(Math.toRadians(speedPitch)) * horizontal);
        }
        if (horizDist > 12.0 && Math.abs(directPitch = -Math.toDegrees(Math.atan2(targetY - meEyeY, horizontal))) > 4.0 && Math.abs(directPitch) < 55.0) {
            double optimal = directPitch < 0.0 ? -42.0 : 42.0;
            double blend = MathHelper.clamp((double)((horizDist - 12.0) / 25.0), (double)0.1, (double)0.5);
            targetY = meEyeY - Math.tan(Math.toRadians(directPitch + (optimal - directPitch) * blend)) * horizontal;
        }
        double fallSavePitch = align < 0.0 ? (PredictUtils.mc.player.getVelocity().y < -0.03 ? 7.0 : 4.0) : (horizDist < 6.0 ? 3.0 : 3.0);
        boolean bl = divingToLowerTarget = heightDiff > 1.6 && align >= 0.0 || aboveTarget;
        if (!divingToLowerTarget && (PredictUtils.mc.player.getVelocity().y < -0.08 || heightDiff < 0.6 || relativeY > 0.08)) {
            targetY = Math.max(targetY, meEyeY + Math.tan(Math.toRadians(fallSavePitch)) * horizontal);
        }
        double maxDown = heightDiff > 2.0 && align >= 0.0 ? 72.0 : (heightDiff > 2.0 ? 60.0 : 30.0);
        double maxUp = heightDiff < -2.0 ? 50.0 : 30.0;
        double minY = meEyeY - Math.tan(Math.toRadians(maxDown)) * horizontal;
        double maxY = meEyeY + Math.tan(Math.toRadians(maxUp)) * horizontal;
        return new Vec3d(pointX, MathHelper.clamp((double)targetY, (double)minY, (double)maxY), pointZ);
    }

    private static Vec3d stabilizeElytraVector(LivingEntity target, Vec3d vec) {
        if (PredictUtils.mc.player == null || vec.equals((Object)Vec3d.ZERO)) {
            return vec;
        }
        double horizontal = Math.hypot(vec.x, vec.z);
        if (horizontal < 1.0E-4) {
            return new Vec3d(vec.x, 0.0, vec.z);
        }
        boolean targetBelow = PredictUtils.isTargetBelow(target);
        double downPitch = targetBelow ? 48.0 : 32.0;
        double minY = -Math.tan(Math.toRadians(downPitch)) * horizontal;
        double maxY = Math.tan(Math.toRadians(56.0)) * horizontal;
        double y2 = MathHelper.clamp((double)vec.y, (double)minY, (double)maxY);
        double strictDistance = PredictUtils.getStrictDistance(target);
        if (strictDistance < 4.0 && !targetBelow) {
            double closeDown = -0.45 - strictDistance * 0.1;
            double closeUp = 0.7 + strictDistance * 0.18;
            y2 = MathHelper.clamp((double)y2, (double)closeDown, (double)closeUp);
        }
        if (!targetBelow && PredictUtils.mc.player.getVelocity().y < -0.16 && y2 < 0.0) {
            y2 = Math.max(y2, horizontal * 0.025);
        }
        return new Vec3d(vec.x, y2, vec.z);
    }

    private static boolean isTargetBelow(LivingEntity target) {
        return PredictUtils.mc.player != null && target != null && PredictUtils.mc.player.getEyeY() - target.getEyeY() > 0.75;
    }

    private static Vec3d resolveHorizontalForward(LivingEntity entity) {
        Vec3d look = entity.getRotationVector();
        Vec3d horizontalLook = new Vec3d(look.x, 0.0, look.z);
        if (horizontalLook.lengthSquared() > 1.0E-6) {
            return horizontalLook.normalize();
        }
        double yaw = Math.toRadians(entity.getYaw());
        return new Vec3d(-Math.sin(yaw), 0.0, Math.cos(yaw));
    }

    private static double getStrictDistance(LivingEntity entity) {
        if (PredictUtils.mc.player == null || entity == null) {
            return 6.0;
        }
        Vec3d eyePos = PredictUtils.mc.player.getEyePos();
        Box box = entity.getBoundingBox();
        double clampedX = MathHelper.clamp((double)eyePos.x, (double)box.minX, (double)box.maxX);
        double clampedY = MathHelper.clamp((double)eyePos.y, (double)box.minY, (double)box.maxY);
        double clampedZ = MathHelper.clamp((double)eyePos.z, (double)box.minZ, (double)box.maxZ);
        return eyePos.distanceTo(new Vec3d(clampedX, clampedY, clampedZ));
    }

    public static void cleanup() {
        long now = System.currentTimeMillis();
        positionCache.entrySet().removeIf(e2 -> now - ((PositionData)e2.getValue()).getLastUpdate() > 10000L);
    }

    public static void clear() {
        positionCache.clear();
        predictCondition = false;
        movementTicks = 0;
        prePredictCondition = false;
        lastSmartPredictMs = 0L;
        blockPos = false;
        cachedAimPoint = Vec3d.ZERO;
        cachedAimTick = -1;
        cachedAimTarget = null;
        lastAimWorldPoint = Vec3d.ZERO;
    }

    @Generated
    public static Vec3d getLastAimWorldPoint() {
        return lastAimWorldPoint;
    }

    static {
        cachedAimPoint = Vec3d.ZERO;
        cachedAimTick = -1;
        cachedAimTarget = null;
        lastAimWorldPoint = Vec3d.ZERO;
    }

    public static class PositionData {
        private double serverX;
        private double serverY;
        private double serverZ;
        private double prevServerX;
        private double prevServerY;
        private double prevServerZ;
        private double backUpX;
        private double backUpY;
        private double backUpZ;
        private double lastSpeed;
        private double prevSpeed;
        private long lastUpdate;

        public Vec3d getResolvedPos() {
            return new Vec3d(this.serverX, this.serverY, this.serverZ);
        }

        public Vec3d getResolvedForward() {
            return new Vec3d(this.serverX - this.prevServerX, this.serverY - this.prevServerY, this.serverZ - this.prevServerZ);
        }

        public void update(double x2, double y2, double z2) {
            this.backUpX = this.prevServerX;
            this.backUpY = this.prevServerY;
            this.backUpZ = this.prevServerZ;
            this.prevServerX = this.serverX;
            this.prevServerY = this.serverY;
            this.prevServerZ = this.serverZ;
            this.serverX = x2;
            this.serverY = y2;
            this.serverZ = z2;
            this.prevSpeed = this.lastSpeed;
            this.lastSpeed = this.getResolvedForward().length() * 20.0;
            this.lastUpdate = System.currentTimeMillis();
        }

        public boolean isSpeedChanged() {
            return this.lastSpeed >= 20.0 || this.lastSpeed != this.prevSpeed && this.lastSpeed == 0.0;
        }

        @Generated
        public double getServerX() {
            return this.serverX;
        }

        @Generated
        public double getServerY() {
            return this.serverY;
        }

        @Generated
        public double getServerZ() {
            return this.serverZ;
        }

        @Generated
        public double getPrevServerX() {
            return this.prevServerX;
        }

        @Generated
        public double getPrevServerY() {
            return this.prevServerY;
        }

        @Generated
        public double getPrevServerZ() {
            return this.prevServerZ;
        }

        @Generated
        public double getBackUpX() {
            return this.backUpX;
        }

        @Generated
        public double getBackUpY() {
            return this.backUpY;
        }

        @Generated
        public double getBackUpZ() {
            return this.backUpZ;
        }

        @Generated
        public double getLastSpeed() {
            return this.lastSpeed;
        }

        @Generated
        public double getPrevSpeed() {
            return this.prevSpeed;
        }

        @Generated
        public long getLastUpdate() {
            return this.lastUpdate;
        }
    }
}