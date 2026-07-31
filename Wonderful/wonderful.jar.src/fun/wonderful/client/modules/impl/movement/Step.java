package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.BlockState;

public class Step
extends Module {
    public static Step INSTANCE = new Step();
    public ModeSetting mode = new ModeSetting("Режим", "Vanilla", "Vanilla", "NCP", "Motion");
    public FloatSetting height = new FloatSetting("Высота", 1.0f, 1.0f, 10.0f, 0.5f);
    public BooleanSetting reverse = new BooleanSetting("Reverse", false);
    public FloatSetting reverseHeight = new FloatSetting("Высота Reverse", 1.0f, 1.0f, 10.0f, 0.5f);
    private int timer = 0;

    public Step() {
        super("Step", "Моментально взбирается на блок", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.mode, this.height, this.reverse, this.reverseHeight);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.timer = 0;
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        float fallDistance;
        if (Step.mc.player == null || Step.mc.world == null) {
            return;
        }
        if (this.reverse.isState() && Step.mc.player.isOnGround() && !Step.mc.options.jumpKey.isPressed() && !Step.mc.player.isSneaking() && !this.isBlockAbove() && this.canFall(fallDistance = this.reverseHeight.get())) {
            Vec3d vel = Step.mc.player.getVelocity();
            Step.mc.player.setVelocity(vel.x, (double)(-fallDistance), vel.z);
        }
        if (!Step.mc.player.horizontalCollision || !Step.mc.player.isOnGround() || Step.mc.options.jumpKey.isPressed()) {
            this.timer = 0;
            return;
        }
        float stepHeight = this.getStepHeight();
        if (stepHeight > 0.6f && stepHeight <= this.height.get()) {
            if (this.mode.is("Vanilla")) {
                this.handleVanillaStep(stepHeight);
            }
            if (this.mode.is("NCP")) {
                this.handleNCPStep(stepHeight);
            }
            if (this.mode.is("Motion")) {
                this.handleMotionStep(stepHeight);
            }
        }
    }

    private void handleVanillaStep(float stepHeight) {
        Step.mc.player.setPosition(Step.mc.player.getX(), Step.mc.player.getY() + (double)stepHeight, Step.mc.player.getZ());
    }

    private void handleNCPStep(float stepHeight) {
        double[] offsets = null;
        double baseY = Step.mc.player.getY();
        if (stepHeight <= 1.0f) {
            offsets = new double[]{0.42, 0.753};
        } else if (stepHeight <= 1.5f) {
            offsets = new double[]{0.42, 0.75, 1.0, 1.16, 1.23, 1.2};
        } else if (stepHeight <= 2.0f) {
            offsets = new double[]{0.42, 0.78, 0.63, 0.51, 0.9, 1.21, 1.45, 1.43};
        } else if (stepHeight <= 2.5f) {
            offsets = new double[]{0.425, 0.821, 0.699, 0.599, 1.022, 1.372, 1.652, 1.869, 2.019, 1.907};
        } else if (stepHeight <= 3.0f) {
            offsets = new double[]{0.42, 0.78, 0.63, 0.51, 0.9, 1.21, 1.45, 1.43, 1.78, 2.1, 2.4, 2.7};
        }
        if (offsets != null) {
            for (double offset : offsets) {
                Step.mc.player.setPosition(Step.mc.player.getX(), baseY + offset, Step.mc.player.getZ());
            }
        }
    }

    private void handleMotionStep(float stepHeight) {
        Vec3d velocity = Step.mc.player.getVelocity();
        double motionY = 0.42;
        if (stepHeight <= 1.0f) {
            motionY = 0.42;
        } else if (stepHeight <= 1.5f) {
            motionY = 0.52;
        } else if (stepHeight <= 2.0f) {
            motionY = 0.62;
        } else if (stepHeight <= 2.5f) {
            motionY = 0.72;
        } else if (stepHeight <= 3.0f) {
            motionY = 0.82;
        }
        Step.mc.player.setVelocity(velocity.x, motionY, velocity.z);
    }

    private float getStepHeight() {
        Box box = Step.mc.player.getBoundingBox();
        float maxY = 0.0f;
        double checkDistance = 0.3;
        double playerYaw = Math.toRadians(Step.mc.player.getYaw());
        double offsetX = -Math.sin(playerYaw) * checkDistance;
        double offsetZ = Math.cos(playerYaw) * checkDistance;
        for (double y2 = 0.6; y2 <= (double)this.height.get() + 0.6; y2 += 0.1) {
            Box testBox = box.offset(offsetX, y2, offsetZ);
            for (BlockPos pos : BlockPos.iterate((int)((int)Math.floor(testBox.minX)), (int)((int)Math.floor(testBox.minY)), (int)((int)Math.floor(testBox.minZ)), (int)((int)Math.floor(testBox.maxX)), (int)((int)Math.floor(testBox.maxY)), (int)((int)Math.floor(testBox.maxZ)))) {
                VoxelShape shape;
                BlockState state = Step.mc.world.getBlockState(pos);
                if (state.isAir() || (shape = state.getCollisionShape((BlockView)Step.mc.world, pos)).isEmpty()) continue;
                for (Box collisionBox : shape.getBoundingBoxes()) {
                    Box offsetBox = collisionBox.offset(pos);
                    float blockHeight = (float)(offsetBox.maxY - Step.mc.player.getY());
                    if (!(blockHeight > 0.6f) || !(blockHeight <= this.height.get())) continue;
                    maxY = Math.max(maxY, blockHeight);
                }
            }
        }
        return maxY;
    }

    private boolean isBlockAbove() {
        Box box = Step.mc.player.getBoundingBox().offset(0.0, 1.0, 0.0);
        for (BlockPos pos : BlockPos.iterate((int)((int)Math.floor(box.minX)), (int)((int)Math.floor(box.minY)), (int)((int)Math.floor(box.minZ)), (int)((int)Math.floor(box.maxX)), (int)((int)Math.floor(box.maxY)), (int)((int)Math.floor(box.maxZ)))) {
            if (Step.mc.world.getBlockState(pos).isAir()) continue;
            return true;
        }
        return false;
    }

    private boolean canFall(float distance) {
        Box box = Step.mc.player.getBoundingBox();
        for (double y2 = 0.1; y2 <= (double)distance; y2 += 0.1) {
            Box testBox = box.offset(0.0, -y2, 0.0);
            for (BlockPos pos : BlockPos.iterate((int)((int)Math.floor(testBox.minX)), (int)((int)Math.floor(testBox.minY)), (int)((int)Math.floor(testBox.minZ)), (int)((int)Math.floor(testBox.maxX)), (int)((int)Math.floor(testBox.maxY)), (int)((int)Math.floor(testBox.maxZ)))) {
                if (Step.mc.world.getBlockState(pos).isAir()) continue;
                return false;
            }
        }
        return true;
    }
}