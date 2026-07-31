package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.EventSync;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.player.MoveInputEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.eventbus.EventPriority;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.util.PlayerInput;
import net.minecraft.world.World;

@FunctionAdd(name = "FreeCamera", alias = "Free Camera", category = Category.Movement, description = "Свободная камера")
public class FreeCamera extends Function {
    public SliderSetting xSpeed = new SliderSetting("Скорость по X", 0.5f, 0.1f, 2f, 0.1f);
    public SliderSetting ySpeed = new SliderSetting("Скорость по Y", 0.5f, 0.1f, 2f, 0.1f);

    private float savedYaw;
    private float savedPitch;
    private double fakeX;
    private double fakeY;
    private double fakeZ;
    private double prevFakeX;
    private double prevFakeY;
    private double prevFakeZ;
    private World lastWorld;
    private boolean sneaking;

    public FreeCamera() {
        addSettings(xSpeed, ySpeed);
    }

    @Override
    public void onEnable() {
        if (mc.player == null || mc.world == null) {
            setState(false);
            return;
        }
        mc.chunkCullingEnabled = false;
        savedYaw = mc.player.getYaw();
        savedPitch = mc.player.getPitch();
        fakeX = prevFakeX = mc.player.getX();
        fakeY = prevFakeY = mc.player.getY() + mc.player.getEyeHeight(mc.player.getPose());
        fakeZ = prevFakeZ = mc.player.getZ();
        sneaking = mc.player.isSneaking();
        lastWorld = mc.world;

        RotationTask.create("freecamera", 998);

        super.onEnable();
    }

    @Override
    public void onDisable() {
        mc.chunkCullingEnabled = true;
        lastWorld = null;

        RotationTask.rotationState = RotationTask.RotationState.RESET;
        RotationTask.returnStartTime = System.currentTimeMillis() - 460;
        RotationTask.rotationPriority = 0;
        RotationTask.inactiveMs = 0L;
        RotationTask.needSmoothReset = true;
        RotationTask.resetDelayMs = 10;

        RotationTask.remove("freecamera");

        super.onDisable();
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck() || mc.world != lastWorld) {
            setState(false);
            return;
        }

        if (this.isState()) {
            RotationTask.setTargetRotation(savedYaw, savedPitch, 4);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onSync(EventSync event) {
        if (mc.player == null) return;
        float forward = 0;
        float side = 0;
        if (mc.options.forwardKey.isPressed()) forward++;
        if (mc.options.backKey.isPressed()) forward--;
        if (mc.options.leftKey.isPressed()) side++;
        if (mc.options.rightKey.isPressed()) side--;

        double[] motion = calculateMotion(forward, side, xSpeed.get());
        prevFakeX = fakeX;
        prevFakeY = fakeY;
        prevFakeZ = fakeZ;
        fakeX += motion[0];
        fakeZ += motion[1];
        if (mc.options.jumpKey.isPressed()) fakeY += ySpeed.get();
        if (mc.options.sneakKey.isPressed()) fakeY -= ySpeed.get();
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onMoveInput(MoveInputEvent event) {
        event.setOverrideForwardBackward(true);
        event.setForwardPressed(false);
        event.setBackwardPressed(false);
        event.setOverrideLeftRight(true);
        event.setLeft(false);
        event.setRight(false);
        event.setOverrideJump(true);
        event.setJumpPressed(false);
        event.setOverrideSneak(true);
        event.setSneakPressed(sneaking);
        event.cancel();
        mc.player.input.playerInput = new PlayerInput(false, false, false, false, false, sneaking, false);
    }

    private double[] calculateMotion(float forward, float side, double speed) {
        float yaw = mc.player.getYaw();
        if (forward != 0.0f) {
            if (side > 0.0f) yaw += forward > 0.0f ? -45 : 45;
            else if (side < 0.0f) yaw += forward > 0.0f ? 45 : -45;
            side = 0.0f;
            forward = forward > 0.0f ? 1.0f : -1.0f;
        }
        double sin = Math.sin(Math.toRadians(yaw + 90.0f));
        double cos = Math.cos(Math.toRadians(yaw + 90.0f));
        return new double[]{forward * speed * cos + side * speed * sin, forward * speed * sin - side * speed * cos};
    }

    public float getFakeYaw() {
        return mc.player != null ? mc.player.getYaw() : savedYaw;
    }

    public float getFakePitch() {
        return mc.player != null ? mc.player.getPitch() : savedPitch;
    }

    public double getFakeX(float tickDelta) {
        return prevFakeX + (fakeX - prevFakeX) * tickDelta;
    }

    public double getFakeY(float tickDelta) {
        return prevFakeY + (fakeY - prevFakeY) * tickDelta;
    }

    public double getFakeZ(float tickDelta) {
        return prevFakeZ + (fakeZ - prevFakeZ) * tickDelta;
    }
}
