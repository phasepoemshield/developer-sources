package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.player.MoveInputEvent;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.client.utils.client.IMinecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class BotTask implements IMinecraft {
    private BlockPos target;
    private Vec3d targetPos;
    private final Random random = new Random();
    private float aimYaw;
    private float aimPitch;
    private float yawOffset;
    private float pitchOffset;
    private boolean stopBeforeAttack;
    private float randomYawOffset;
    private float randomPitchOffset;
    private float visualYawJitter;
    private float visualPitchJitter;
    private long nextRandomizeMs;
    private boolean rotationInitialized;
    private boolean jumpPressed;
    private long nextJumpMs;
    private long nextAttackReleaseMs;
    private long attackReleaseUntilMs;
    private double lastDistanceSq;
    private long lastProgressMs;
    private long rerouteUntilMs;
    private boolean rerouteStrafeLeft;
    private boolean jumpDisabledByMining;
    private double stopDistanceSq = 2.25;
    private long blockedStartMs;

    public void setStopDistanceSq(double stopDistanceSq) {
        this.stopDistanceSq = stopDistanceSq;
    }

    public void tick(BlockPos target, boolean canMine) {
        tick(target, canMine, true);
    }

    public void tick(BlockPos target, boolean canMine, boolean attackEnabled) {
        tick(target != null ? target.toCenterPos() : null, target, canMine, attackEnabled);
    }

    public void tick(Vec3d targetPos, boolean canMine, boolean attackEnabled) {
        tick(targetPos, targetPos != null ? BlockPos.ofFloored(targetPos) : null, canMine, attackEnabled);
    }

    private void tick(Vec3d targetPos, BlockPos targetBlock, boolean canMine, boolean attackEnabled) {
        if (mc.player == null || mc.world == null || targetPos == null) {
            reset();
            return;
        }

        boolean targetChanged = this.targetPos == null || !this.targetPos.equals(targetPos);
        this.target = targetBlock;
        this.targetPos = targetPos;

        if (targetChanged) {
            yawOffset = microOffset() * 0.25f;
            pitchOffset = 0f;
            rerouteUntilMs = 0L;
        }

        if (!rotationInitialized) {
            aimYaw = mc.player.getYaw();
            aimPitch = mc.player.getPitch();
            rotationInitialized = true;
        }

        long now = System.currentTimeMillis();
        jumpDisabledByMining = canMine && attackEnabled;

        float targetYaw = getYawToTarget(targetPos) + yawOffset;
        float targetPitch = getPitchToTarget(targetPos) + pitchOffset;

        aimYaw = smoothAngle(aimYaw, targetYaw, 0.75f);
        aimPitch = smoothAngle(aimPitch, targetPitch, 0.75f);
        RotationTask.setTargetRotation(aimYaw, aimPitch, 3);

        stopBeforeAttack = isStopDistanceReached(targetPos);
        boolean needJump = targetBlock != null && targetBlock.getY() > mc.player.getBlockY() + 1;

        boolean stuckInBlock = mc.world != null && !mc.world.getBlockState(mc.player.getBlockPos()).isAir();
        if (stuckInBlock && mc.player.isOnGround()) {
            nextJumpMs = Math.min(nextJumpMs, now);
        }

        if (jumpDisabledByMining) {
            jumpPressed = false;
            nextJumpMs = now + 200L;
        } else if (stuckInBlock && mc.player.isOnGround() && now >= nextJumpMs) {
            jumpPressed = true;
            nextJumpMs = now + 100L;
        } else if (needJump && mc.player.isOnGround() && now >= nextJumpMs) {
            jumpPressed = true;
            nextJumpMs = now + 500L;
        } else if (now >= nextJumpMs) {
            jumpPressed = false;
        }

        if (mc.options != null) {
            double distSq = mc.player.squaredDistanceTo(targetPos);
            updateStuckState(distSq, now);
            updateMovementKeys(distSq, now);
            updateAttackKey(attackEnabled, now);
        }
    }

    public void onMoveInput(MoveInputEvent event) {
        if (mc.player == null || targetPos == null) return;
        event.setYaw(aimYaw);
        event.setNeedFix(true);
        event.setOverrideForwardBackward(true);
        event.setForwardPressed(!stopBeforeAttack);
        event.setBackwardPressed(false);
        event.setOverrideLeftRight(true);
        boolean rerouting = rerouteUntilMs > System.currentTimeMillis();
        if (rerouting) {
            event.setLeft(rerouteStrafeLeft);
            event.setRight(!rerouteStrafeLeft);
        } else {
            event.setLeft(false);
            event.setRight(false);
        }
        event.setOverrideJump(true);
        event.setJumpPressed(jumpPressed);
    }

    public void reset() {
        reset(true);
    }

    public void softReset() {
        reset(false);
    }

    private void reset(boolean resetRotation) {
        target = null;
        targetPos = null;
        yawOffset = 0.0f;
        pitchOffset = 0.0f;
        randomYawOffset = 0.0f;
        randomPitchOffset = 0.0f;
        visualYawJitter = 0.0f;
        visualPitchJitter = 0.0f;
        nextRandomizeMs = 0L;
        nextJumpMs = 0L;
        nextAttackReleaseMs = 0L;
        attackReleaseUntilMs = 0L;
        lastDistanceSq = Double.MAX_VALUE;
        lastProgressMs = 0L;
        rerouteUntilMs = 0L;
        rerouteStrafeLeft = false;
        jumpDisabledByMining = false;
        rotationInitialized = false;
        stopBeforeAttack = false;
        jumpPressed = false;
        setAttackState(false);

        if (mc.options != null) {
            mc.options.forwardKey.setPressed(false);
        mc.player.setSprinting(false);
            mc.options.jumpKey.setPressed(false);
        }

        if (!resetRotation) return;

        RotationTask.rotationState = RotationTask.RotationState.RESET;
        RotationTask.returnStartTime = System.currentTimeMillis() - 100L;
        RotationTask.rotationPriority = 0;
        RotationTask.inactiveMs = 0L;
        RotationTask.needSmoothReset = true;
        RotationTask.resetDelayMs = 400L;
    }

    private void setAttackState(boolean state) {
        if (mc.options == null) return;
        mc.options.attackKey.setPressed(state);
    }

    private void updateAttackKey(boolean attackEnabled, long now) {
        if (!attackEnabled) {
            setAttackState(false);
            return;
        }

        if (nextAttackReleaseMs == 0L) {
            nextAttackReleaseMs = now + 1500L;
            setAttackState(true);
            return;
        }

        if (attackReleaseUntilMs > now) {
            setAttackState(false);
            return;
        }

        if (now >= nextAttackReleaseMs) {
            attackReleaseUntilMs = now + 200L;
            nextAttackReleaseMs = attackReleaseUntilMs + 1500L;
            setAttackState(false);
            return;
        }

        setAttackState(true);
    }

    private boolean isBlockedAhead() {
        if (mc.world == null || mc.player == null) return false;
        float yaw = aimYaw;
        float rad = yaw * MathHelper.RADIANS_PER_DEGREE;
        double dx = -MathHelper.sin(rad);
        double dz = MathHelper.cos(rad);

        for (double range : new double[]{0.6, 1.0}) {
            for (double height : new double[]{0.0, 0.9, 1.8}) {
                BlockPos check = BlockPos.ofFloored(
                    mc.player.getX() + dx * range,
                    mc.player.getY() + height,
                    mc.player.getZ() + dz * range
                );
                if (!mc.world.getBlockState(check).isAir()) return true;
            }
        }
        return false;
    }

    private void updateStuckState(double distSq, long now) {
        if (lastProgressMs == 0L) {
            lastProgressMs = now;
            lastDistanceSq = distSq;
            return;
        }

        if (distSq + 0.05 < lastDistanceSq) {
            lastDistanceSq = distSq;
            lastProgressMs = now;
            return;
        }

        if (now - lastProgressMs < 500L) {
            return;
        }

        rerouteUntilMs = now + 500L;
        rerouteStrafeLeft = !rerouteStrafeLeft;
        yawOffset = microOffset();
        pitchOffset = microOffset();
        randomYawOffset = microOffset() * 0.18f;
        randomPitchOffset = microOffset() * 0.12f;
        nextRandomizeMs = now;
        nextJumpMs = now;
        jumpPressed = false;
        rotationInitialized = false;
        lastProgressMs = now;
        lastDistanceSq = distSq;
    }

    private void updateMovementKeys(double distSq, long now) {
        boolean rerouting = rerouteUntilMs > now;

        if (!rerouting && !stopBeforeAttack && mc.player.isOnGround() && isBlockedAhead()) {
            if (blockedStartMs == 0L) {
                blockedStartMs = now;
            }
            if (now - blockedStartMs > 100L) {
                rerouteUntilMs = now + 400L;
                rerouteStrafeLeft = !rerouteStrafeLeft;
                yawOffset = microOffset();
                pitchOffset = microOffset();
                randomYawOffset = microOffset() * 0.18f;
                randomPitchOffset = microOffset() * 0.12f;
                nextRandomizeMs = now;
                nextJumpMs = now;
                jumpPressed = false;
                rotationInitialized = false;
                lastProgressMs = now;
                lastDistanceSq = distSq;
                rerouting = true;
                blockedStartMs = 0L;
            }
            double py = mc.player.getY() + 1.0;
            int bx = mc.player.getBlockX() + (int)Math.round(-MathHelper.sin(aimYaw * MathHelper.RADIANS_PER_DEGREE));
            int bz = mc.player.getBlockZ() + (int)Math.round(MathHelper.cos(aimYaw * MathHelper.RADIANS_PER_DEGREE));
            BlockPos aheadFeet = new BlockPos(bx, mc.player.getBlockY(), bz);
            if (!jumpDisabledByMining && mc.world.getBlockState(aheadFeet).isAir()) {
                jumpPressed = true;
                nextJumpMs = now + 500L;
            }
        } else {
            blockedStartMs = 0L;
        }

        mc.options.forwardKey.setPressed(!stopBeforeAttack && !rerouting);
        mc.options.sprintKey.setPressed(false);
        mc.options.jumpKey.setPressed(jumpPressed);

        if (rerouting) {
            jumpPressed = false;
            mc.options.leftKey.setPressed(rerouteStrafeLeft);
            mc.options.rightKey.setPressed(!rerouteStrafeLeft);
            return;
        }

        mc.options.leftKey.setPressed(false);
        mc.options.rightKey.setPressed(false);
    }

    private boolean isStopDistanceReached(Vec3d targetPos) {
        if (mc.player == null || targetPos == null) return false;
        double dx = targetPos.x - mc.player.getX();
        double dz = targetPos.z - mc.player.getZ();
        return dx * dx + dz * dz <= stopDistanceSq;
    }

    private float getYawToTarget(Vec3d targetPos) {
        double dx = targetPos.x - mc.player.getX();
        double dz = targetPos.z - mc.player.getZ();
        return (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(dz, dx)) - 90.0);
    }

    private float getPitchToTarget(Vec3d targetPos) {
        Vec3d eye = mc.player.getEyePos();
        double dx = targetPos.x - eye.x;
        double dy = targetPos.y - eye.y;
        double dz = targetPos.z - eye.z;
        double horizontal = Math.sqrt(dx * dx + dz * dz);
        return (float) MathHelper.clamp(Math.toDegrees(-Math.atan2(dy, horizontal)), -89.0, 89.0);
    }

    private float microOffset() {
        return (random.nextFloat() * 8.0f) - 4.0f;
    }

    private float smoothAngle(float current, float target, float speed) {
        return current + MathHelper.wrapDegrees(target - current) * speed;
    }
}
