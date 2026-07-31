package fun.wonderful.api.storages.implement;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventKeyboardInput;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.FreeLookStorage;
import fun.wonderful.api.utils.rotate.Rotation;
import fun.wonderful.client.modules.impl.combat.components.gcd.GCDUtil;
import lombok.Generated;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class RotationStorage
implements QClient {
    public static RotationStorage instance;
    private RotationTask currentTask = RotationTask.IDLE;
    private float currentYawSpeed;
    private float currentPitchSpeed;
    private float currentYawReturnSpeed;
    private float currentPitchReturnSpeed;
    private int currentPriority;
    private int currentTimeout;
    private int idleTicks;
    private boolean useRealGcd;
    private Rotation targetRotation;

    public RotationStorage() {
        instance = this;
        EventInvoker.register(this);
    }

    public static double direction(float rotationYaw, float moveForward, float moveStrafing) {
        if (moveForward < 0.0f) {
            rotationYaw += 180.0f;
        }
        float forward = 1.0f;
        if (moveForward < 0.0f) {
            forward = -0.5f;
        }
        if (moveForward > 0.0f) {
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

    public static void fixMovement(EventKeyboardInput event, float yaw) {
        float forward = event.getMovementForward();
        float strafe = event.getMovementSideways();
        if (forward == 0.0f && strafe == 0.0f) {
            return;
        }
        double targetAngle = MathHelper.wrapDegrees((double)Math.toDegrees(RotationStorage.direction(yaw, forward, strafe)));
        float bestForward = 0.0f;
        float bestStrafe = 0.0f;
        float smallestDifference = Float.MAX_VALUE;
        for (float testForward = -1.0f; testForward <= 1.0f; testForward += 1.0f) {
            for (float testStrafe = -1.0f; testStrafe <= 1.0f; testStrafe += 1.0f) {
                double testAngle;
                float difference;
                if (testForward == 0.0f && testStrafe == 0.0f || !((difference = Math.abs(MathHelper.wrapDegrees((float)((float)(targetAngle - (testAngle = MathHelper.wrapDegrees((double)Math.toDegrees(RotationStorage.direction(yaw, testForward, testStrafe))))))))) < smallestDifference)) continue;
                smallestDifference = difference;
                bestForward = testForward;
                bestStrafe = testStrafe;
            }
        }
        event.setMovementForward(bestForward);
        event.setMovementSideways(bestStrafe);
    }

    @EventLink
    public void onInput(EventKeyboardInput event) {
        if (this.isRotating() && !this.isWaterMovement()) {
            RotationStorage.fixMovement(event, MathHelper.wrapDegrees((float)RotationStorage.mc.gameRenderer.getCamera().getYaw()));
        }
    }

    private boolean isWaterMovement() {
        return RotationStorage.mc.player != null && (RotationStorage.mc.player.isTouchingWater() || RotationStorage.mc.player.isSubmergedInWater() || RotationStorage.mc.player.isSwimming());
    }

    private void resetRotation() {
        Rotation targetRotation = new Rotation(FreeLookStorage.getFreeYaw(), FreeLookStorage.getFreePitch());
        if (this.updateRotation(targetRotation, this.currentYawReturnSpeed(), this.currentPitchReturnSpeed())) {
            this.stopRotation();
        }
    }

    @EventLink
    public void onEventTick(EventUpdate event) {
        if (this.currentTask().equals((Object)RotationTask.AIM) && this.idleTicks() > this.currentTimeout()) {
            this.currentTask(RotationTask.RESET);
        }
        if (this.currentTask().equals((Object)RotationTask.RESET)) {
            this.resetRotation();
        }
        ++this.idleTicks;
    }

    public static void update(Rotation target, float yawSpeed, float pitchSpeed, float yawReturnSpeed, float pitchReturnSpeed, int timeout, int priority, boolean clientRotation) {
        RotationStorage.update(target, yawSpeed, pitchSpeed, yawReturnSpeed, pitchReturnSpeed, timeout, priority, clientRotation, false);
    }

    public static void update(Rotation target, float yawSpeed, float pitchSpeed, float yawReturnSpeed, float pitchReturnSpeed, int timeout, int priority, boolean clientRotation, boolean realGcd) {
        RotationStorage instance = RotationStorage.instance;
        if (RotationStorage.mc.player == null) {
            return;
        }
        if (instance.currentPriority() > priority) {
            return;
        }
        if (instance.currentTask().equals((Object)RotationTask.IDLE) && !clientRotation) {
            FreeLookStorage.setActive(true);
        }
        instance.useRealGcd = realGcd;
        instance.currentYawSpeed(yawSpeed);
        instance.currentPitchSpeed(pitchSpeed);
        instance.currentYawReturnSpeed(yawReturnSpeed);
        instance.currentPitchReturnSpeed(pitchReturnSpeed);
        instance.currentTimeout(timeout);
        instance.currentPriority(priority);
        instance.currentTask(RotationTask.AIM);
        instance.targetRotation(target);
        instance.updateRotation(target, yawSpeed, pitchSpeed);
    }

    public static void update(Rotation targetRotation, float turnSpeed, float returnSpeed, int timeout, int priority) {
        RotationStorage.update(targetRotation, turnSpeed, turnSpeed, returnSpeed, returnSpeed, timeout, priority, false);
    }

    public static void update(Rotation targetRotation, float yawSpeed, float pitchSpeed, float returnSpeed, int timeout, int priority) {
        RotationStorage.update(targetRotation, yawSpeed, pitchSpeed, returnSpeed, returnSpeed, timeout, priority, false);
    }

    private boolean updateRotation(Rotation targetRotation, float yawSpeed, float pitchSpeed) {
        if (RotationStorage.mc.player == null) {
            return false;
        }
        Rotation currentRotation = new Rotation((Entity)RotationStorage.mc.player);
        float yawDelta = MathHelper.wrapDegrees((float)(targetRotation.getYaw() - currentRotation.getYaw()));
        float pitchDelta = targetRotation.getPitch() - currentRotation.getPitch();
        float clampedYaw = Math.min(Math.abs(yawDelta), yawSpeed);
        float clampedPitch = Math.min(Math.abs(pitchDelta), pitchSpeed);
        if (this.useRealGcd) {
            float steppedYaw = RotationStorage.mc.player.getYaw() + MathHelper.clamp((float)yawDelta, (float)(-clampedYaw), (float)clampedYaw);
            float steppedPitch = MathHelper.clamp((float)(RotationStorage.mc.player.getPitch() + MathHelper.clamp((float)pitchDelta, (float)(-clampedPitch), (float)clampedPitch)), (float)-90.0f, (float)90.0f);
            float[] patched = RotationStorage.applyRealSensitivity(steppedYaw, steppedPitch, RotationStorage.mc.player.getYaw(), RotationStorage.mc.player.getPitch());
            RotationStorage.mc.player.setYaw(patched[0]);
            RotationStorage.mc.player.setPitch(MathHelper.clamp((float)patched[1], (float)-90.0f, (float)90.0f));
            this.idleTicks(0);
            return new Rotation((Entity)RotationStorage.mc.player).getDelta(targetRotation) < 1.0f;
        }
        float yaw = RotationStorage.mc.player.getYaw();
        RotationStorage.mc.player.setYaw(yaw += GCDUtil.getFixedRotation(MathHelper.clamp((float)yawDelta, (float)(-clampedYaw), (float)clampedYaw)));
        RotationStorage.mc.player.setPitch(MathHelper.clamp((float)(RotationStorage.mc.player.getPitch() + GCDUtil.getFixedRotation(MathHelper.clamp((float)pitchDelta, (float)(-clampedPitch), (float)clampedPitch))), (float)-90.0f, (float)90.0f));
        this.idleTicks(0);
        return new Rotation((Entity)RotationStorage.mc.player).getDelta(targetRotation) < 1.0f;
    }

    private static float[] applyRealSensitivity(float yaw, float pitch, float prevYaw, float prevPitch) {
        double sens = (Double)RotationStorage.mc.options.getMouseSensitivity().getValue();
        double gcd = Math.pow(sens * (double)0.6f + (double)0.2f, 3.0) * 8.0;
        double step = gcd * (double)0.15f;
        double newYaw = (double)prevYaw + (double)Math.round((double)(yaw - prevYaw) / step) * step;
        double newPitch = (double)prevPitch + (double)Math.round((double)(pitch - prevPitch) / step) * step;
        return new float[]{(float)newYaw, (float)newPitch};
    }

    public void stopRotation() {
        if (RotationStorage.mc.player != null && FreeLookStorage.isActive()) {
            RotationStorage.mc.player.setYaw(FreeLookStorage.getFreeYaw());
            RotationStorage.mc.player.setPitch(FreeLookStorage.getFreePitch());
        }
        this.currentTask(RotationTask.IDLE);
        this.currentPriority(0);
        FreeLookStorage.setActive(false);
    }

    public boolean isRotating() {
        return !this.currentTask.equals((Object)RotationTask.IDLE);
    }

    @Generated
    public RotationTask currentTask() {
        return this.currentTask;
    }

    @Generated
    public float currentYawSpeed() {
        return this.currentYawSpeed;
    }

    @Generated
    public float currentPitchSpeed() {
        return this.currentPitchSpeed;
    }

    @Generated
    public float currentYawReturnSpeed() {
        return this.currentYawReturnSpeed;
    }

    @Generated
    public float currentPitchReturnSpeed() {
        return this.currentPitchReturnSpeed;
    }

    @Generated
    public int currentPriority() {
        return this.currentPriority;
    }

    @Generated
    public int currentTimeout() {
        return this.currentTimeout;
    }

    @Generated
    public int idleTicks() {
        return this.idleTicks;
    }

    @Generated
    public boolean useRealGcd() {
        return this.useRealGcd;
    }

    @Generated
    public Rotation targetRotation() {
        return this.targetRotation;
    }

    @Generated
    public RotationStorage currentTask(RotationTask currentTask) {
        this.currentTask = currentTask;
        return this;
    }

    @Generated
    public RotationStorage currentYawSpeed(float currentYawSpeed) {
        this.currentYawSpeed = currentYawSpeed;
        return this;
    }

    @Generated
    public RotationStorage currentPitchSpeed(float currentPitchSpeed) {
        this.currentPitchSpeed = currentPitchSpeed;
        return this;
    }

    @Generated
    public RotationStorage currentYawReturnSpeed(float currentYawReturnSpeed) {
        this.currentYawReturnSpeed = currentYawReturnSpeed;
        return this;
    }

    @Generated
    public RotationStorage currentPitchReturnSpeed(float currentPitchReturnSpeed) {
        this.currentPitchReturnSpeed = currentPitchReturnSpeed;
        return this;
    }

    @Generated
    public RotationStorage currentPriority(int currentPriority) {
        this.currentPriority = currentPriority;
        return this;
    }

    @Generated
    public RotationStorage currentTimeout(int currentTimeout) {
        this.currentTimeout = currentTimeout;
        return this;
    }

    @Generated
    public RotationStorage idleTicks(int idleTicks) {
        this.idleTicks = idleTicks;
        return this;
    }

    @Generated
    public RotationStorage useRealGcd(boolean useRealGcd) {
        this.useRealGcd = useRealGcd;
        return this;
    }

    @Generated
    public RotationStorage targetRotation(Rotation targetRotation) {
        this.targetRotation = targetRotation;
        return this;
    }

    public static enum RotationTask {
        AIM,
        RESET,
        IDLE;

    }
}