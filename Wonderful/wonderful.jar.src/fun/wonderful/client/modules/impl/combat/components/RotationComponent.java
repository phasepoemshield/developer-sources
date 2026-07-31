package fun.wonderful.client.modules.impl.combat.components;

import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.FreeLookStorage;
import fun.wonderful.api.utils.input.MovingUtil;
import fun.wonderful.api.utils.rotate.Rotation;
import lombok.Generated;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.MathHelper;
import ru.ocz.protection.annotation.Compile;

public class RotationComponent
implements QClient {
    public static RotationComponent instance = new RotationComponent();
    private RotationTask currentTask = RotationTask.IDLE;
    private float currentYawSpeed;
    private float currentPitchSpeed;
    private float currentYawReturnSpeed;
    private float currentPitchReturnSpeed;
    private int currentPriority;
    private int currentTimeout;
    private int idleTicks;
    private Rotation targetRotation = new Rotation(0.0f, 0.0f);

    public RotationComponent() {
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

    @EventLink
    public void onInput(EventMoveInput event) {
        if (this.isRotating() && !this.isWaterMovement()) {
            MovingUtil.fixMovementFocus(event, MathHelper.wrapDegrees((float)RotationComponent.mc.gameRenderer.getCamera().getYaw()));
        }
    }

    private boolean isWaterMovement() {
        return RotationComponent.mc.player != null && (RotationComponent.mc.player.isTouchingWater() || RotationComponent.mc.player.isSubmergedInWater() || RotationComponent.mc.player.isSwimming());
    }

    private void resetRotation() {
        Rotation targetRotation = new Rotation(FreeLookStorage.getFreeYaw(), FreeLookStorage.getFreePitch());
        if (this.updateRotation(targetRotation, this.currentYawReturnSpeed(), this.currentPitchReturnSpeed())) {
            this.stopRotation();
        }
    }

    @EventLink
    @Compile
    public native void onEventTick(EventUpdate var1);

    @Compile
    public static native Vec2f applySensitivityPatch(Vec2f var0, Vec2f var1);

    public static void update(Rotation target, float yawSpeed, float pitchSpeed, float yawReturnSpeed, float pitchReturnSpeed, int timeout, int priority, boolean clientRotation) {
        RotationComponent instance = RotationComponent.instance;
        if (instance.currentPriority() <= priority) {
            if (instance.currentTask().equals((Object)RotationTask.IDLE) && !clientRotation) {
                FreeLookStorage.setActive(true);
            }
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
    }

    public static void update(Rotation targetRotation, float turnSpeed, float returnSpeed, int timeout, int priority) {
        RotationComponent.update(targetRotation, turnSpeed, turnSpeed, returnSpeed, returnSpeed, timeout, priority, false);
    }

    public static void update(Rotation targetRotation, float yawSpeed, float pitchSpeed, float returnSpeed, int timeout, int priority) {
        RotationComponent.update(targetRotation, yawSpeed, pitchSpeed, returnSpeed, returnSpeed, timeout, priority, false);
    }

    @Compile
    private native boolean updateRotation(Rotation var1, float var2, float var3);

    public void stopRotation() {
        if (RotationComponent.mc.player != null && FreeLookStorage.isActive()) {
            RotationComponent.mc.player.setYaw(FreeLookStorage.getFreeYaw());
            RotationComponent.mc.player.setPitch(FreeLookStorage.getFreePitch());
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
    public Rotation targetRotation() {
        return this.targetRotation;
    }

    @Generated
    public RotationComponent currentTask(RotationTask currentTask) {
        this.currentTask = currentTask;
        return this;
    }

    @Generated
    public RotationComponent currentYawSpeed(float currentYawSpeed) {
        this.currentYawSpeed = currentYawSpeed;
        return this;
    }

    @Generated
    public RotationComponent currentPitchSpeed(float currentPitchSpeed) {
        this.currentPitchSpeed = currentPitchSpeed;
        return this;
    }

    @Generated
    public RotationComponent currentYawReturnSpeed(float currentYawReturnSpeed) {
        this.currentYawReturnSpeed = currentYawReturnSpeed;
        return this;
    }

    @Generated
    public RotationComponent currentPitchReturnSpeed(float currentPitchReturnSpeed) {
        this.currentPitchReturnSpeed = currentPitchReturnSpeed;
        return this;
    }

    @Generated
    public RotationComponent currentPriority(int currentPriority) {
        this.currentPriority = currentPriority;
        return this;
    }

    @Generated
    public RotationComponent currentTimeout(int currentTimeout) {
        this.currentTimeout = currentTimeout;
        return this;
    }

    @Generated
    public RotationComponent idleTicks(int idleTicks) {
        this.idleTicks = idleTicks;
        return this;
    }

    @Generated
    public RotationComponent targetRotation(Rotation targetRotation) {
        this.targetRotation = targetRotation;
        return this;
    }

    public static final class RotationTask
    extends Enum<RotationTask> {
        public static final RotationTask AIM = new RotationTask();
        public static final RotationTask RESET = new RotationTask();
        public static final RotationTask IDLE = new RotationTask();

        public static RotationTask[] values() {
            return (RotationTask[])$VALUES.clone();
        }

        public static RotationTask valueOf(String name) {
            return Enum.valueOf(RotationTask.class, name);
        }

        private static RotationTask[] $values() {
            return new RotationTask[]{AIM, RESET, IDLE};
        }

            return new RotationTask[]{AIM, RESET, IDLE};
        }

        static {
            $VALUES = RotationTask.$values$();
        }
    }
}