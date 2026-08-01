package fun.wonderful.client.modules.impl.combat.components.rotations;

import fun.wonderful.api.QClient;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.combat.rotation.Rotation;
import fun.wonderful.api.utils.math.Timer;
import fun.wonderful.client.modules.impl.combat.ElytraTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

public class КомпонентЭлитры
implements QClient {
    private static final MinecraftClient mc = MinecraftClient.getInstance();
    private static final double MAX_DOWN_PITCH = 32.0;
    private static final double MAX_CHASE_DOWN_PITCH = 48.0;
    private static final double MAX_UP_PITCH = 56.0;
    public static boolean predictCondition = false;
    private static int movementTicks = 0;
    private static boolean prePredictCondition = false;
    private static final Timer tickStopWatch = new Timer();
    public static boolean blockPos = false;
    public static Vec3d pos = Vec3d.ZERO;
    public static double value2 = 0.0;
    public static Vec3d vector = Vec3d.ZERO;
    private static Vec3d lastVector = Vec3d.ZERO;
    private static Vec3d lastFireworkVector = Vec3d.ZERO;
    private static LivingEntity target;

    public static void setTarget(LivingEntity t2) {
        if (target != t2) {
            lastVector = Vec3d.ZERO;
            lastFireworkVector = Vec3d.ZERO;
        }
        target = t2;
    }

    public static void processTargetLogic(ElytraTarget elytraTarget) {
        if (target == null || КомпонентЭлитры.mc.player == null || elytraTarget == null || !elytraTarget.isEnable()) {
            pos = Vec3d.ZERO;
            value2 = 0.0;
            blockPos = false;
            return;
        }
        float distanceValue = elytraTarget.distance.getValue().floatValue();
        float forwardDist = distanceValue < 4.0f ? 0.0f : distanceValue - 3.0f;
        Vec3d eyePos = target.getEyePos();
        Vec3d resol = target.getRotationVector();
        Vec3d forwardNorm = resol.lengthSquared() > 1.0E-6 ? resol.normalize() : Vec3d.ZERO;
        pos = eyePos.add(forwardNorm.multiply((double)distanceValue));
        Vec3d distanceCheckPos = eyePos.add(forwardNorm.multiply((double)forwardDist));
        КомпонентЭлитры.updateDistances(distanceCheckPos);
    }

    public static void setVector(Vec3d vector1) {
        vector = vector1;
    }

    public static void updateDistances(Vec3d var1) {
        if (target == null || КомпонентЭлитры.mc.player == null) {
            return;
        }
        float var2 = (float)var1.distanceTo(КомпонентЭлитры.mc.player.getEyePos());
        float var3 = КомпонентЭлитры.mc.player.distanceTo((Entity)target);
        value2 = blockPos ? (double)var2 : (double)var3;
    }

    public static void smartPredict() {
        if (tickStopWatch.finished(50L)) {
            if (target != null) {
                float z2;
                float y2;
                float x2 = (float)(target.getX() - КомпонентЭлитры.target.prevX);
                float dist = (float)Math.sqrt(x2 * x2 + (y2 = (float)(target.getY() - КомпонентЭлитры.target.prevY)) * y2 + (z2 = (float)(target.getZ() - КомпонентЭлитры.target.prevZ)) * z2);
                float finalSpeed = (float)((double)dist * 20.0);
                if (finalSpeed > 20.0f) {
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
            }
            tickStopWatch.reset();
        }
    }

    public static void updateRotation(Vec2f current) {
        if (КомпонентЭлитры.mc.player == null) {
            return;
        }
        Vec3d vec3d = vector;
        float rawYaw = (float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(vec3d.z, vec3d.x)) - 90.0));
        float rawPitch = (float)MathHelper.wrapDegrees((double)Math.toDegrees(-Math.atan2(vec3d.y, Math.hypot(vec3d.x, vec3d.z))));
        float currentYaw = current.x;
        float currentPitch = current.y;
        float yawDelta = MathHelper.wrapDegrees((float)(rawYaw - currentYaw));
        float pitchDelta = MathHelper.wrapDegrees((float)(rawPitch - currentPitch));
        if (Math.abs(yawDelta) > 180.0f && КомпонентЭлитры.mc.player.isSwimming()) {
            yawDelta -= Math.signum(yawDelta) * 360.0f;
        }
        float speedYaw = blockPos ? 9999.0f : 150.0f;
        float speedPitch = blockPos ? 9999.0f : 150.0f;
        float finalDeltaYaw = MathHelper.clamp((float)yawDelta, (float)(-speedYaw), (float)speedYaw);
        float finalDeltaPitch = MathHelper.clamp((float)pitchDelta, (float)(-speedPitch), (float)speedPitch);
        float newYaw = currentYaw + finalDeltaYaw;
        float newPitch = MathHelper.clamp((float)(currentPitch + finalDeltaPitch), (float)-89.9f, (float)89.9f);
        float gcd = Rotation.gcd();
        newYaw -= (newYaw - currentYaw) % gcd;
        newPitch -= (newPitch - currentPitch) % gcd;
        ElytraRotationResult.yaw = newYaw;
        ElytraRotationResult.pitch = newPitch;
        ElytraRotationResult.speedYaw = speedYaw;
        ElytraRotationResult.speedPitch = speedPitch;
    }

    public static Vec3d getVector3d(LivingEntity me, LivingEntity to) {
        Vec3d fenal;
        boolean shouldPredict;
        if (me == null || to == null) {
            return Vec3d.ZERO;
        }
        ElytraTarget elytraTarget = ModuleClass.elytraTarget;
        boolean bl = shouldPredict = elytraTarget != null && elytraTarget.isEnable() && elytraTarget.prediction.isState() && (predictCondition || elytraTarget.predictMode.is("Reallyworld")) && КомпонентЭлитры.mc.player.isGliding() && to.isGliding() && !ModuleClass.freeCam.isEnable();
        if (shouldPredict) {
            float distanceValue = elytraTarget.distance.getValue().floatValue();
            Vec3d eyePos = to.getEyePos();
            Vec3d resol = to.getRotationVector();
            Vec3d forwardNorm = resol.lengthSquared() > 1.0E-6 ? resol.normalize() : Vec3d.ZERO;
            Vec3d basePos = pos.equals((Object)Vec3d.ZERO) ? eyePos.add(forwardNorm.multiply((double)distanceValue)) : pos;
            Vec3d pedik = basePos.add(forwardNorm.multiply(2.0));
            if (elytraTarget.getFull().isState()) {
                pedik = КомпонентЭлитры.AICompensateLatency(to, pedik);
                pedik = КомпонентЭлитры.AILockFullPursuit(me, to, pedik);
            }
            fenal = new Vec3d(pedik.x - me.getX(), pedik.y - me.getY(), pedik.z - me.getZ());
        } else {
            double wHalf = to.getWidth() / 2.0f;
            double yExpand = MathHelper.clamp((double)(to.getEyeY() - to.getY()), (double)0.0, (double)((double)to.getHeight() - (double)(КомпонентЭлитры.mc.player.isGliding() ? 0.0f : 0.5f)));
            double xExpand = MathHelper.clamp((double)(КомпонентЭлитры.mc.player.getX() - to.getX()), (double)(-wHalf), (double)wHalf);
            double zExpand = MathHelper.clamp((double)(КомпонентЭлитры.mc.player.getZ() - to.getZ()), (double)(-wHalf), (double)wHalf);
            double strictDist = КомпонентЭлитры.getStrictDistance(to);
            double yLerpFactor = strictDist / 3.0;
            Vec3d vec = to.getPos().add(0.0, MathHelper.clamp((double)(КомпонентЭлитры.mc.player.getEyePos().y - to.getY()), (double)0.0, (double)((double)to.getHeight() * yLerpFactor)), 0.0).subtract(КомпонентЭлитры.mc.player.getEyePos()).normalize();
            Vec3d VanillaChestLootTableGenerator = fenal = elytraTarget.getTargetMode().is("Обычная") || elytraTarget.getTargetMode().is("Ноги") && !КомпонентЭлитры.mc.player.isGliding() ? new Vec3d(to.getX() - КомпонентЭлитры.mc.player.getX() + xExpand, to.getY() - КомпонентЭлитры.mc.player.getEyeY() + yExpand, to.getZ() - КомпонентЭлитры.mc.player.getZ() + zExpand) : vec;
            if (elytraTarget != null && elytraTarget.getFull().isState() && КомпонентЭлитры.mc.player.isGliding() && to.isGliding()) {
                Vec3d worldPoint = new Vec3d(me.getX() + fenal.x, me.getEyeY() + fenal.y, me.getZ() + fenal.z);
                Vec3d locked = КомпонентЭлитры.AILockFullPursuit(me, to, worldPoint);
                fenal = new Vec3d(locked.x - me.getX(), locked.y - me.getEyeY(), locked.z - me.getZ());
            }
        }
        blockPos = shouldPredict;
        return fenal;
    }

    private static Vec3d AICompensateLatency(LivingEntity to, Vec3d point) {
        int ping = 0;
        try {
            if (КомпонентЭлитры.mc.player != null && mc.getNetworkHandler() != null && mc.getNetworkHandler().getPlayerListEntry(КомпонентЭлитры.mc.player.getUuid()) != null) {
                ping = mc.getNetworkHandler().getPlayerListEntry(КомпонентЭлитры.mc.player.getUuid()).getLatency();
            }
        }
        catch (Throwable throwable) {
            
        }
        ping = MathHelper.clamp((int)ping, (int)0, (int)300);
        double ticks = (double)ping / 50.0;
        Vec3d motion = to.getVelocity();
        double speed = motion.length();
        if (speed < 0.05 || ticks <= 0.0) {
            return point;
        }
        double scale = MathHelper.clamp((double)(ticks * 0.85), (double)0.0, (double)4.5);
        return point.add(motion.multiply(scale));
    }

    private static Vec3d AILockFullPursuit(LivingEntity me, LivingEntity to, Vec3d point) {
        boolean divingToLowerTarget;
        double directPitch;
        double keepPitch;
        double heightDiff = me.getEyeY() - to.getEyeY();
        double motionY = to.getVelocity().y;
        double pointX = point.x;
        double pointZ = point.z;
        Vec3d myMotionFlat = new Vec3d(me.getVelocity().x, 0.0, me.getVelocity().z);
        double mySpeedSq = myMotionFlat.lengthSquared();
        double horizDist = Math.hypot(to.getX() - me.getX(), to.getZ() - me.getZ());
        boolean aboveTarget = horizDist < 2.0 && heightDiff > 1.2;
        boolean closeRange = horizDist < 4.0 && Math.abs(heightDiff) < 2.5;
        double align = 0.0;
        if (mySpeedSq > 0.02 && horizDist > 0.3) {
            Vec3d mDir = myMotionFlat.normalize();
            Vec3d tFlat = new Vec3d(to.getX() - me.getX(), 0.0, to.getZ() - me.getZ());
            align = mDir.dotProduct(tFlat.normalize());
        }
        if (closeRange) {
            pointX = to.getX();
            pointZ = to.getZ();
        } else if (horizDist < 1.5 && Math.abs(heightDiff) > 2.0) {
            if (heightDiff > 2.0) {
                pointX = to.getX();
                pointZ = to.getZ();
            } else {
                Vec3d dir;
                dir = mySpeedSq > 0.01 ? myMotionFlat.normalize() : new Vec3d(-Math.sin(Math.toRadians(me.getYaw())), 0.0, Math.cos(Math.toRadians(me.getYaw())));
                pointX = to.getX() + dir.x * 3.0;
                pointZ = to.getZ() + dir.z * 3.0;
            }
        } else if (horizDist < 6.0 && mySpeedSq > 0.16) {
            dir = myMotionFlat.normalize();
            double forward = align < -0.2 ? 2.8 : 1.6;
            pointX = to.getX() + dir.x * forward;
            pointZ = to.getZ() + dir.z * forward;
        } else if (horizDist < 10.0 && mySpeedSq > 0.16) {
            dir = myMotionFlat.normalize();
            double forward = align < -0.2 ? 3.0 : 2.0;
            pointX = to.getX() + dir.x * forward;
            pointZ = to.getZ() + dir.z * forward;
        } else if (align < -0.55 && mySpeedSq > 0.04) {
            Vec3d myDir = myMotionFlat.normalize();
            pointX = to.getX() + myDir.x * 4.0;
            pointZ = to.getZ() + myDir.z * 4.0;
        }
        double targetY = closeRange ? to.getY() + (double)to.getHeight() * 0.5 : (aboveTarget ? to.getY() + (double)to.getHeight() * 0.65 + MathHelper.clamp((double)(motionY * 0.6), (double)-0.5, (double)1.0) : (align < -0.2 && mySpeedSq > 0.04 ? Math.max(to.getEyeY(), me.getEyeY() + 0.45) : (horizDist < 6.0 ? to.getY() + (double)to.getHeight() * 0.55 + MathHelper.clamp((double)(motionY * 0.7), (double)-0.6, (double)1.0) : to.getEyeY() + 0.25 + MathHelper.clamp((double)(motionY * 2.0), (double)-2.0, (double)3.0))));
        double relativeY = motionY - me.getVelocity().y;
        if (!closeRange && (heightDiff < -0.2 || relativeY > 0.08)) {
            targetY += MathHelper.clamp((double)(-heightDiff * 0.55 + relativeY * 2.4), (double)0.0, (double)2.4);
        }
        double mySpeed = me.getVelocity().length();
        double targetSpeed = to.getVelocity().length();
        if (!closeRange && (heightDiff < 0.4 || motionY > 0.08 || relativeY > 0.06)) {
            double leadTicks = MathHelper.clamp((double)(horizDist / Math.max(mySpeed, 0.35) + targetSpeed * 1.5), (double)2.0, (double)8.0);
            double predictedY = to.getEyeY() + motionY * leadTicks + MathHelper.clamp((double)(relativeY * leadTicks * 0.45), (double)0.0, (double)2.0);
            targetY = Math.max(targetY, predictedY + MathHelper.clamp((double)(-heightDiff * 0.2), (double)0.0, (double)0.8));
        }
        double horizontal = Math.max(1.0, Math.hypot(pointX - me.getX(), pointZ - me.getZ()));
        double d2 = align < 0.0 ? (me.getVelocity().y < -0.03 ? 7.0 : 4.0) : (keepPitch = horizDist < 6.0 ? 3.0 : 2.0);
        if (!aboveTarget && !closeRange && (heightDiff < 2.5 || align < 0.0)) {
            targetY = Math.max(targetY, me.getEyeY() + Math.tan(Math.toRadians(keepPitch)) * horizontal);
        }
        if (!aboveTarget && !closeRange && align > -0.15 && horizDist > 6.0 && heightDiff < 1.2) {
            double speedPitch = MathHelper.clamp((double)((horizDist - 6.0) * 2.0 + 18.0), (double)18.0, (double)32.0);
            targetY = Math.max(targetY, me.getEyeY() + Math.tan(Math.toRadians(speedPitch)) * horizontal);
        }
        if (horizDist > 12.0 && Math.abs(directPitch = -Math.toDegrees(Math.atan2(targetY - me.getEyeY(), horizontal))) > 4.0 && Math.abs(directPitch) < 55.0) {
            double optimal = directPitch < 0.0 ? -42.0 : 42.0;
            double blend = MathHelper.clamp((double)((horizDist - 12.0) / 25.0), (double)0.1, (double)0.5);
            targetY = me.getEyeY() - Math.tan(Math.toRadians(directPitch + (optimal - directPitch) * blend)) * horizontal;
        }
        double fallSavePitch = align < 0.0 ? (me.getVelocity().y < -0.03 ? 7.0 : 4.0) : (horizDist < 6.0 ? 3.0 : 3.0);
        boolean bl = divingToLowerTarget = heightDiff > 1.6 && align >= 0.0 || aboveTarget;
        if (!divingToLowerTarget && (me.getVelocity().y < -0.08 || heightDiff < 0.6 || relativeY > 0.08)) {
            targetY = Math.max(targetY, me.getEyeY() + Math.tan(Math.toRadians(fallSavePitch)) * horizontal);
        }
        double maxDown = heightDiff > 2.0 && align >= 0.0 ? 72.0 : (heightDiff > 2.0 ? 60.0 : 30.0);
        double maxUp = heightDiff < -2.0 ? 50.0 : 30.0;
        double minY = me.getEyeY() - Math.tan(Math.toRadians(maxDown)) * horizontal;
        double maxY = me.getEyeY() + Math.tan(Math.toRadians(maxUp)) * horizontal;
        return new Vec3d(pointX, MathHelper.clamp((double)targetY, (double)minY, (double)maxY), pointZ);
    }

    public static Vec3d AIComputePursuitVector(LivingEntity me, LivingEntity to, ElytraTarget elytraTarget) {
        if (me == null || to == null || elytraTarget == null) {
            return Vec3d.ZERO;
        }
        Vec3d eyes = me.getEyePos();
        Vec3d targetMotion = to.getVelocity();
        double distance = eyes.distanceTo(to.getBoundingBox().getCenter());
        double lead = MathHelper.clamp((double)(distance / 18.0), (double)0.45, (double)2.6);
        Vec3d forward = КомпонентЭлитры.AIHorizontalForward(to);
        double forwardLead = elytraTarget.prediction.isState() ? MathHelper.clamp((double)elytraTarget.distance.getValue().doubleValue(), (double)1.2, (double)3.2) : 0.9;
        double targetY = to.getY() + (double)to.getHeight() * КомпонентЭлитры.AIPredictAimHeight(me, to);
        Vec3d point = new Vec3d(to.getX(), targetY, to.getZ()).add(targetMotion.multiply(lead)).add(forward.multiply(forwardLead));
        Vec3d vec = point.subtract(eyes);
        return КомпонентЭлитры.AIStabilizeVector(vec);
    }

    private static Vec3d AIComputeCombatVector(LivingEntity me, LivingEntity to, ElytraTarget elytraTarget) {
        Vec3d eyes = me.getEyePos();
        double strict = КомпонентЭлитры.getStrictDistance(to);
        if (strict > 5.2) {
            return КомпонентЭлитры.AISmoothPursuit(КомпонентЭлитры.AIComputePursuitVector(me, to, elytraTarget), false);
        }
        Vec3d motion = to.getVelocity();
        double lead = MathHelper.clamp((double)(strict / 12.0), (double)0.12, (double)0.45);
        Vec3d predicted = motion.multiply(lead);
        double grow = MathHelper.clamp((double)((5.2 - strict) * 0.035), (double)0.03, (double)0.12);
        double minX = to.getBoundingBox().minX + predicted.x - grow;
        double maxX = to.getBoundingBox().maxX + predicted.x + grow;
        double minY = to.getBoundingBox().minY + predicted.y + 0.1;
        double maxY = to.getBoundingBox().maxY + predicted.y - 0.05;
        double minZ = to.getBoundingBox().minZ + predicted.z - grow;
        double maxZ = to.getBoundingBox().maxZ + predicted.z + grow;
        double x2 = MathHelper.clamp((double)eyes.x, (double)minX, (double)maxX);
        double z2 = MathHelper.clamp((double)eyes.z, (double)minZ, (double)maxZ);
        double y2 = MathHelper.clamp((double)eyes.y, (double)minY, (double)maxY);
        if (КомпонентЭлитры.AITargetBelow()) {
            double lowPoint = to.getBoundingBox().minY + predicted.y + (double)to.getHeight() * КомпонентЭлитры.AIPredictAimHeight(me, to);
            y2 = Math.min(y2, MathHelper.clamp((double)lowPoint, (double)minY, (double)maxY));
        }
        return new Vec3d(x2, y2, z2).subtract(eyes);
    }

    public static Vec3d AIComputeFireworkVector(LivingEntity me, LivingEntity to, ElytraTarget elytraTarget) {
        Vec3d stable = КомпонентЭлитры.AIComputePursuitVector(me, to, elytraTarget);
        return КомпонентЭлитры.AISmoothPursuit(stable, true);
    }

    private static Vec3d AISmoothPursuit(Vec3d current, boolean firework) {
        Vec3d previous;
        if (current.equals((Object)Vec3d.ZERO)) {
            return current;
        }
        Vec3d VanillaChestLootTableGenerator = previous = firework ? lastFireworkVector : lastVector;
        if (previous.equals((Object)Vec3d.ZERO)) {
            if (firework) {
                lastFireworkVector = current;
            } else {
                lastVector = current;
            }
            return current;
        }
        double strict = target == null || КомпонентЭлитры.mc.player == null ? 6.0 : КомпонентЭлитры.getStrictDistance(target);
        double factor = MathHelper.clamp((double)(strict / 7.0), (double)0.28, (double)0.62);
        if (firework) {
            factor = MathHelper.clamp((double)(factor + 0.1), (double)0.35, (double)0.72);
        }
        Vec3d smoothed = previous.add(current.subtract(previous).multiply(factor));
        if (firework) {
            lastFireworkVector = smoothed;
        } else {
            lastVector = smoothed;
        }
        return smoothed;
    }

    public static Vec3d AIStabilizeVector(Vec3d vec) {
        double strict;
        if (vec.equals((Object)Vec3d.ZERO)) {
            return vec;
        }
        double horizontal = Math.hypot(vec.x, vec.z);
        if (horizontal < 1.0E-4) {
            return new Vec3d(vec.x, 0.0, vec.z);
        }
        boolean targetBelow = КомпонентЭлитры.AITargetBelow();
        double downPitch = targetBelow ? 48.0 : 32.0;
        double minY = -Math.tan(Math.toRadians(downPitch)) * horizontal;
        double maxY = Math.tan(Math.toRadians(56.0)) * horizontal;
        double y2 = MathHelper.clamp((double)vec.y, (double)minY, (double)maxY);
        double d2 = strict = target == null ? horizontal : КомпонентЭлитры.getStrictDistance(target);
        if (strict < 4.0 && !targetBelow) {
            double closeDown = -0.45 - strict * 0.1;
            double closeUp = 0.7 + strict * 0.18;
            y2 = MathHelper.clamp((double)y2, (double)closeDown, (double)closeUp);
        }
        if (!targetBelow && КомпонентЭлитры.mc.player != null && КомпонентЭлитры.mc.player.getVelocity().y < -0.16 && y2 < 0.0) {
            y2 = Math.max(y2, horizontal * 0.025);
        }
        return new Vec3d(vec.x, y2, vec.z);
    }

    private static double AIPredictAimHeight(LivingEntity me, LivingEntity to) {
        double above = me.getEyePos().y - to.getEyeY();
        if (above > 2.2) {
            return 0.3;
        }
        if (above > 1.0) {
            return 0.42;
        }
        return 0.62;
    }

    private static boolean AITargetBelow() {
        if (КомпонентЭлитры.mc.player == null || target == null) {
            return false;
        }
        double above = КомпонентЭлитры.mc.player.getEyePos().y - target.getEyeY();
        return above > 0.75;
    }

    private static Vec3d AIHorizontalForward(LivingEntity entity) {
        Vec3d look = entity.getRotationVector();
        Vec3d horizontal = new Vec3d(look.x, 0.0, look.z);
        if (horizontal.lengthSquared() > 1.0E-6) {
            return horizontal.normalize();
        }
        double yaw = Math.toRadians(entity.getYaw());
        return new Vec3d(-Math.sin(yaw), 0.0, Math.cos(yaw));
    }

    private static double getStrictDistance(LivingEntity entity) {
        Vec3d eyePos = КомпонентЭлитры.mc.player.getEyePos();
        double cx = MathHelper.clamp((double)eyePos.x, (double)entity.getBoundingBox().minX, (double)entity.getBoundingBox().maxX);
        double cy = MathHelper.clamp((double)eyePos.y, (double)entity.getBoundingBox().minY, (double)entity.getBoundingBox().maxY);
        double cz = MathHelper.clamp((double)eyePos.z, (double)entity.getBoundingBox().minZ, (double)entity.getBoundingBox().maxZ);
        return eyePos.distanceTo(new Vec3d(cx, cy, cz));
    }

    public static void resetState() {
        target = null;
        predictCondition = false;
        movementTicks = 0;
        prePredictCondition = false;
        blockPos = false;
        pos = Vec3d.ZERO;
        value2 = 0.0;
        vector = Vec3d.ZERO;
        lastVector = Vec3d.ZERO;
        lastFireworkVector = Vec3d.ZERO;
    }

    public static class ElytraRotationResult {
        public static float yaw = 0.0f;
        public static float pitch = 0.0f;
        public static float speedYaw = 150.0f;
        public static float speedPitch = 150.0f;
    }
}