package fun.wonderful.client.modules.impl.player;

import fun.wonderful.Wonderful;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventBinding;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.math.TimerUtils;
import fun.wonderful.api.utils.player.InventoryUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import java.util.Comparator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ItemConvertible;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;

public class TargetPearl
extends Module {
    private static final double MAX_TRACK_DISTANCE = 256.0;
    private static final double MIN_LANDING_DISTANCE = 11.0;
    private static final long LOCAL_THROW_COOLDOWN_MS = 2500L;
    private static final float DIRECT_MIN_PITCH = -25.0f;
    private static final float DIRECT_MAX_PITCH = 35.0f;
    private static final float PITCH_STEP = 0.25f;
    public static final TargetPearl INSTANCE = new TargetPearl();
    private final ModeSetting mode = new ModeSetting("Тип", "Автоматический", "По бинду", "Автоматический");
    private final BindSetting bind = new BindSetting("Бинд", -1).visible(() -> this.mode.is("По бинду"));
    private final BooleanSetting onlyTarget = new BooleanSetting("Только за противником", false);
    private final BooleanSetting ignoreFriends = new BooleanSetting("Игнорировать друзей", true);
    private final TimerUtils timer = new TimerUtils();
    private EnderPearlEntity targetPearl;
    private int lastHandledPearlId = -1;
    private long nextThrowAt;
    private boolean isThrowing;
    private Vec2f serverRotation;

    public TargetPearl() {
        super("TargetPearl", "Автоматически бросает жемчуг в цель", Module.ModuleCategory.PLAYER);
        this.addSettings(this.mode, this.bind, this.onlyTarget, this.ignoreFriends);
    }

    @EventLink
    public void onBinding(EventBinding event) {
        if (TargetPearl.mc.player == null || TargetPearl.mc.world == null || TargetPearl.mc.currentScreen != null) {
            return;
        }
        if (!this.mode.is("По бинду") || event.getKey() != this.bind.getKey()) {
            return;
        }
        if (this.canThrowNow()) {
            this.aimAndThrowPearl();
        }
    }

    @EventLink
    public void onUpdate(EventUpdate var1) {
    }

    @EventLink
    public void onMoveInput(EventMoveInput event) {
        if (!this.isEnable() || !this.isThrowing || this.serverRotation == null) {
            return;
        }
        float forward = event.getForward();
        float strafe = event.getStrafe();
        if (forward == 0.0f && strafe == 0.0f) {
            return;
        }
        double targetAngle = MathHelper.wrapDegrees((double)Math.toDegrees(TargetPearl.direction(this.serverRotation.x, forward, strafe)));
        float bestForward = 0.0f;
        float bestStrafe = 0.0f;
        float smallestDifference = Float.MAX_VALUE;
        for (float testForward = -1.0f; testForward <= 1.0f; testForward += 1.0f) {
            for (float testStrafe = -1.0f; testStrafe <= 1.0f; testStrafe += 1.0f) {
                double testAngle;
                float difference;
                if (testForward == 0.0f && testStrafe == 0.0f || !((difference = Math.abs(MathHelper.wrapDegrees((float)((float)(targetAngle - (testAngle = MathHelper.wrapDegrees((double)Math.toDegrees(TargetPearl.direction(this.serverRotation.x, testForward, testStrafe))))))))) < smallestDifference)) continue;
                smallestDifference = difference;
                bestForward = testForward;
                bestStrafe = testStrafe;
            }
        }
        event.setForward(bestForward);
        event.setStrafe(bestStrafe);
    }

    @Override
    public void onDisable() {
        this.resetThrowState();
        this.lastHandledPearlId = -1;
        this.nextThrowAt = 0L;
        this.timer.reset();
        super.onDisable();
    }

    private boolean canThrowNow() {
        if (System.currentTimeMillis() < this.nextThrowAt) {
            return false;
        }
        return !TargetPearl.mc.player.getItemCooldownManager().isCoolingDown(new ItemStack((ItemConvertible)Items.ENDER_PEARL)) && this.timer.finished(1000L);
    }

    private void aimAndThrowPearl() {
        Vec3d landingPosition = this.getTargetPearlLandingPosition();
        if (landingPosition == null) {
            this.resetThrowState();
            return;
        }
        float[] rotations = this.calculateYawPitch(landingPosition);
        if (rotations == null || Float.isNaN(rotations[0]) || Float.isNaN(rotations[1])) {
            this.resetThrowState();
            return;
        }
        Vec3d trajectoryLanding = this.checkTrajectory(rotations[0], rotations[1]);
        double allowedError = Math.max(3.0, TargetPearl.mc.player.getPos().distanceTo(landingPosition) * 0.12);
        if (trajectoryLanding == null || landingPosition.distanceTo(trajectoryLanding) > allowedError) {
            this.resetThrowState();
            return;
        }
        if (!this.hasPearl()) {
            this.resetThrowState();
            return;
        }
        float previousYaw = TargetPearl.mc.player.getYaw();
        float previousPitch = TargetPearl.mc.player.getPitch();
        this.isThrowing = true;
        this.serverRotation = new Vec2f(rotations[0], rotations[1]);
        try {
            TargetPearl.mc.player.setYaw(rotations[0]);
            TargetPearl.mc.player.setPitch(rotations[1]);
            TargetPearl.mc.player.networkHandler.sendPacket((Packet)new PlayerMoveC2SPacket.LookAndOnGround(rotations[0], rotations[1], TargetPearl.mc.player.isOnGround(), TargetPearl.mc.player.horizontalCollision));
            InventoryUtils.swapAndUseHvH(Items.ENDER_PEARL);
            this.timer.reset();
            this.nextThrowAt = System.currentTimeMillis() + 2500L;
            if (this.targetPearl != null) {
                this.lastHandledPearlId = this.targetPearl.getId();
            }
        }
        finally {
            TargetPearl.mc.player.setYaw(previousYaw);
            TargetPearl.mc.player.setPitch(previousPitch);
            this.resetThrowState();
        }
    }

    private Vec3d getTargetPearlLandingPosition() {
        this.targetPearl = this.getTargetPearl();
        if (this.targetPearl == null || !this.targetPearl.isAlive()) {
            return null;
        }
        Vec3d landingPos = this.predictPearlLanding(this.targetPearl);
        if (landingPos == null || !this.isWithinRange(landingPos)) {
            return null;
        }
        return landingPos;
    }

    private EnderPearlEntity getTargetPearl() {
        Box searchBox = TargetPearl.mc.player.getBoundingBox().expand(256.0);
        LivingEntity auraTarget = ModuleClass.INSTANCE != null ? ModuleClass.aura.getTarget() : null;
        return TargetPearl.mc.world.getOtherEntities((Entity)TargetPearl.mc.player, searchBox, entity -> {
            EnderPearlEntity pearl;
            return entity instanceof EnderPearlEntity && (pearl = (EnderPearlEntity)entity).isAlive() && pearl.getOwner() != TargetPearl.mc.player && pearl.getId() != this.lastHandledPearlId && !this.isIgnoredFriend(pearl.getOwner()) && (!this.onlyTarget.isState() || auraTarget != null && pearl.getOwner() == auraTarget);
        }).stream().map(entity -> (EnderPearlEntity)entity).filter(pearl -> this.getHorizontalDistanceTo((EnderPearlEntity)pearl) <= 256.0).min(Comparator.comparingDouble(this::getHorizontalDistanceTo)).orElse(null);
    }

    private boolean isIgnoredFriend(Entity owner) {
        if (!this.ignoreFriends.isState() || !(owner instanceof PlayerEntity)) {
            return false;
        }
        PlayerEntity player = (PlayerEntity)owner;
        return Wonderful.INSTANCE != null && Wonderful.INSTANCE.friendStorage != null && Wonderful.INSTANCE.friendStorage.isFriend(player.getName().getString());
    }

    private double getHorizontalDistanceTo(EnderPearlEntity pearl) {
        Vec3d playerPos = TargetPearl.mc.player.getPos();
        Vec3d pearlPos = pearl.getPos();
        double dx = pearlPos.x - playerPos.x;
        double dz = pearlPos.z - playerPos.z;
        return Math.sqrt(dx * dx + dz * dz);
    }

    private Vec3d predictPearlLanding(EnderPearlEntity pearl) {
        Vec3d position = pearl.getPos();
        Vec3d velocity = pearl.getVelocity();
        Vec3d lastPosition = position;
        for (int i2 = 0; i2 < 200; ++i2) {
            lastPosition = position;
            if (this.hitsBlock(lastPosition, position = position.add(velocity)) || position.y <= (double)TargetPearl.mc.world.getBottomY()) {
                return new Vec3d((double)MathHelper.floor((double)lastPosition.x) + 0.5, (double)MathHelper.floor((double)lastPosition.y), (double)MathHelper.floor((double)lastPosition.z) + 0.5);
            }
            velocity = this.updatePearlMotion(velocity, position);
        }
        return new Vec3d((double)MathHelper.floor((double)lastPosition.x) + 0.5, (double)MathHelper.floor((double)lastPosition.y), (double)MathHelper.floor((double)lastPosition.z) + 0.5);
    }

    private Vec3d updatePearlMotion(Vec3d motion, Vec3d position) {
        BlockPos blockPos = BlockPos.ofFloored((Position)position);
        if (TargetPearl.mc.world.getBlockState(blockPos).isOf(Blocks.WATER)) {
            return motion.multiply(0.8).add(0.0, -0.03, 0.0);
        }
        return motion.multiply(0.99).add(0.0, -0.03, 0.0);
    }

    private boolean isWithinRange(Vec3d landingPos) {
        double distanceToLanding = TargetPearl.mc.player.getPos().distanceTo(landingPos);
        return distanceToLanding >= 11.0 && distanceToLanding <= 256.0;
    }

    private float[] calculateYawPitch(Vec3d targetPosition) {
        Vec3d playerPosition = TargetPearl.mc.player.getPos();
        double dx = targetPosition.x - playerPosition.x;
        double dy = targetPosition.y - TargetPearl.mc.player.getEyeY();
        double dz = targetPosition.z - playerPosition.z;
        float yaw = (float)Math.toDegrees(Math.atan2(dz, dx)) - 90.0f;
        double horizontalDistance = Math.sqrt(dx * dx + dz * dz);
        double allowedError = Math.max(1.5, TargetPearl.mc.player.getPos().distanceTo(targetPosition) * 0.08);
        TrajectoryCandidate directCandidate = this.findBestCandidate(targetPosition, yaw, -25.0f, 35.0f, allowedError, true);
        if (directCandidate != null) {
            return new float[]{yaw, MathHelper.clamp((float)directCandidate.pitch, (float)-90.0f, (float)90.0f)};
        }
        TrajectoryCandidate fallbackCandidate = this.findBestCandidate(targetPosition, yaw, -85.0f, 85.0f, allowedError, false);
        if (fallbackCandidate == null) {
            double fallbackPitch = -Math.toDegrees(Math.atan2(dy, horizontalDistance)) + 5.0;
            return new float[]{yaw, MathHelper.clamp((float)((float)fallbackPitch), (float)-90.0f, (float)90.0f)};
        }
        return new float[]{yaw, MathHelper.clamp((float)fallbackCandidate.pitch, (float)-90.0f, (float)90.0f)};
    }

    private TrajectoryCandidate findBestCandidate(Vec3d targetPosition, float yaw, float minPitch, float maxPitch, double allowedError, boolean preferDirect) {
        Vec3d playerPosition = TargetPearl.mc.player.getPos();
        double velocity = 1.5;
        TrajectoryCandidate bestCandidate = null;
        block0: for (float pitch = minPitch; pitch <= maxPitch; pitch += 0.25f) {
            float pitchRad = (float)Math.toRadians(pitch);
            double vx = (double)(-MathHelper.sin((float)((float)Math.toRadians(yaw))) * MathHelper.cos((float)pitchRad)) * velocity;
            double vy = (double)(-MathHelper.sin((float)pitchRad)) * velocity;
            double vz = (double)(MathHelper.cos((float)((float)Math.toRadians(yaw))) * MathHelper.cos((float)pitchRad)) * velocity;
            Vec3d pos = new Vec3d(playerPosition.x, TargetPearl.mc.player.getEyeY(), playerPosition.z);
            Vec3d motion = new Vec3d(vx, vy, vz);
            int ticks = 0;
            for (int i2 = 0; i2 < 200; ++i2) {
                Vec3d previous = pos;
                pos = pos.add(motion);
                motion = this.updatePearlMotion(motion, pos);
                ++ticks;
                if (this.hitsEntity(previous, pos)) continue block0;
                if (!this.hitsBlock(previous, pos) && pos.y > (double)TargetPearl.mc.world.getBottomY()) continue;
                double distanceToTarget = pos.distanceTo(targetPosition);
                TrajectoryCandidate candidate = new TrajectoryCandidate(pitch, distanceToTarget, ticks, pos);
                if (!this.isBetterCandidate(candidate, bestCandidate, allowedError, preferDirect)) continue block0;
                bestCandidate = candidate;
                continue block0;
            }
        }
        if (bestCandidate == null || bestCandidate.distanceToTarget > allowedError) {
            return null;
        }
        return bestCandidate;
    }

    private boolean isBetterCandidate(TrajectoryCandidate candidate, TrajectoryCandidate currentBest, double allowedError, boolean preferDirect) {
        boolean bestAccurate;
        if (currentBest == null) {
            return true;
        }
        boolean candidateAccurate = candidate.distanceToTarget <= allowedError;
        boolean bl = bestAccurate = currentBest.distanceToTarget <= allowedError;
        if (candidateAccurate != bestAccurate) {
            return candidateAccurate;
        }
        if (preferDirect && candidateAccurate && bestAccurate) {
            float bestPitchAbs;
            float candidatePitchAbs = Math.abs(candidate.pitch);
            if (Math.abs(candidatePitchAbs - (bestPitchAbs = Math.abs(currentBest.pitch))) > 0.01f) {
                return candidatePitchAbs < bestPitchAbs;
            }
            if (candidate.ticks != currentBest.ticks) {
                return candidate.ticks < currentBest.ticks;
            }
        }
        if (Math.abs(candidate.distanceToTarget - currentBest.distanceToTarget) > 0.01) {
            return candidate.distanceToTarget < currentBest.distanceToTarget;
        }
        if (candidate.ticks != currentBest.ticks) {
            return candidate.ticks < currentBest.ticks;
        }
        if (!preferDirect) {
            return Math.abs(candidate.pitch) < Math.abs(currentBest.pitch);
        }
        return false;
    }

    private Vec3d checkTrajectory(float yaw, float pitch) {
        float yawRad = (float)Math.toRadians(yaw);
        float pitchRad = (float)Math.toRadians(pitch);
        double velocity = 1.5;
        double x2 = TargetPearl.mc.player.getX() - (double)(MathHelper.cos((float)yawRad) * 0.16f);
        double y2 = TargetPearl.mc.player.getY() + (double)TargetPearl.mc.player.getEyeHeight(TargetPearl.mc.player.getPose()) - 0.1;
        double z2 = TargetPearl.mc.player.getZ() - (double)(MathHelper.sin((float)yawRad) * 0.16f);
        double motionX = (double)(-MathHelper.sin((float)yawRad) * MathHelper.cos((float)pitchRad)) * velocity;
        double motionY = (double)(-MathHelper.sin((float)pitchRad)) * velocity;
        double motionZ = (double)(MathHelper.cos((float)yawRad) * MathHelper.cos((float)pitchRad)) * velocity;
        Vec3d position = new Vec3d(x2, y2, z2);
        Vec3d motion = new Vec3d(motionX, motionY, motionZ);
        for (int i2 = 0; i2 <= 200; ++i2) {
            Vec3d previous = position;
            position = position.add(motion);
            motion = this.updatePearlMotion(motion, position);
            if (this.hitsEntity(previous, position)) {
                return null;
            }
            if (!this.hitsBlock(previous, position) && !(position.y <= (double)TargetPearl.mc.world.getBottomY())) continue;
            return new Vec3d((double)MathHelper.floor((double)position.x) + 0.5, (double)MathHelper.floor((double)position.y), (double)MathHelper.floor((double)position.z) + 0.5);
        }
        return null;
    }

    private boolean hitsBlock(Vec3d from, Vec3d to) {
        return TargetPearl.mc.world.raycast(new RaycastContext(from, to, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)TargetPearl.mc.player)).getType() == HitResult.Type.BLOCK;
    }

    private boolean hitsEntity(Vec3d from, Vec3d to) {
        Box searchBox = new Box(from, to).expand(0.3);
        for (Entity entity2 : TargetPearl.mc.world.getOtherEntities((Entity)TargetPearl.mc.player, searchBox, entity -> {
            if (!entity.isAlive() || entity.isSpectator() || entity.noClip) {
                return false;
            }
            if (entity == this.targetPearl) {
                return false;
            }
            return !(entity instanceof EnderPearlEntity);
        })) {
            if (!entity2.getBoundingBox().expand(0.25).raycast(from, to).isPresent()) continue;
            return true;
        }
        return false;
    }

    private boolean hasPearl() {
        return TargetPearl.mc.player.getMainHandStack().isOf(Items.ENDER_PEARL) || TargetPearl.mc.player.getOffHandStack().isOf(Items.ENDER_PEARL) || InventoryUtils.find(Items.ENDER_PEARL, 0, 8) != -1 || InventoryUtils.find(Items.ENDER_PEARL, 9, 45) != -1;
    }

    private void resetThrowState() {
        this.isThrowing = false;
        this.targetPearl = null;
        this.serverRotation = null;
    }

    private static double direction(float rotationYaw, float moveForward, float moveStrafing) {
        if (moveForward < 0.0f) {
            rotationYaw += 180.0f;
        }
        float forward = 1.0f;
        if (moveForward < 0.0f) {
            forward = -0.5f;
        } else if (moveForward > 0.0f) {
            forward = 0.5f;
        }
        if (moveStrafing > 0.0f) {
            rotationYaw -= 90.0f * forward;
        }
        if (moveStrafing < 0.0f) {
            rotationYaw += 90.0f * forward;
        }
        return Math.toRadians(rotationYaw);
    }

    private static final class TrajectoryCandidate {
        private final float pitch;
        private final double distanceToTarget;
        private final int ticks;
        private final Vec3d landingPos;

        private TrajectoryCandidate(float pitch, double distanceToTarget, int ticks, Vec3d landingPos) {
            this.pitch = pitch;
            this.distanceToTarget = distanceToTarget;
            this.ticks = ticks;
            this.landingPos = landingPos;
        }
    }
}