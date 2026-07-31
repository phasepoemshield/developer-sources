package fun.wonderful.client.modules.impl.misc;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventBinding;
import fun.wonderful.api.events.implement.EventGameUpdate;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.RotationStorage;
import fun.wonderful.api.utils.rotate.Rotation;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import net.minecraft.util.Hand;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;

public class EcOpen
extends Module {
    public static EcOpen INSTANCE = new EcOpen();
    private final BindSetting openKey = new BindSetting("Открыть", -1);
    private final FloatSetting range = new FloatSetting("Дистанция", 6.0f, 3.0f, 6.0f, 0.1f);
    private BlockPos targetChest = null;
    private boolean shouldRotate = false;
    private int rotationTicks = 0;
    private float currentYaw;
    private float currentPitch;

    public EcOpen() {
        super("EcOpen", "Открывает эндер сундук по бинду", Module.ModuleCategory.MISC);
        this.addSettings(this.openKey, this.range);
    }

    @Override
    public void onEnable() {
        this.reset();
        super.onEnable();
    }

    @Override
    public void onDisable() {
        this.reset();
        super.onDisable();
    }

    @EventLink
    public void onBinding(EventBinding event) {
        if (EcOpen.mc.currentScreen != null || EcOpen.mc.player == null || EcOpen.mc.world == null) {
            return;
        }
        if (event.getKey() == this.openKey.getKey()) {
            this.findEnderChest();
        }
    }

    @EventLink
    public void onGameUpdate(EventGameUpdate event) {
        if (!this.shouldRotate || this.targetChest == null || EcOpen.mc.player == null) {
            return;
        }
        if (!EcOpen.mc.world.getBlockState(this.targetChest).isOf(Blocks.ENDER_CHEST)) {
            this.reset();
            return;
        }
        Vec3d target = Vec3d.ofCenter((Vec3i)this.targetChest);
        float[] rotations = this.calculateRotation(target);
        float deltaYaw = MathHelper.wrapDegrees((float)(rotations[0] - this.currentYaw));
        float deltaPitch = rotations[1] - this.currentPitch;
        this.currentYaw += deltaYaw * 0.8f;
        this.currentPitch = MathHelper.clamp((float)(this.currentPitch + deltaPitch * 0.8f), (float)-90.0f, (float)90.0f);
        RotationStorage.update(new Rotation(this.currentYaw, this.currentPitch), 360.0f, 360.0f, 360.0f, 360.0f, 1, 1, false);
        ++this.rotationTicks;
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (!this.shouldRotate || this.targetChest == null || EcOpen.mc.player == null) {
            return;
        }
        if (this.rotationTicks >= 2) {
            Vec3d hitVec = Vec3d.ofCenter((Vec3i)this.targetChest).add(0.0, 0.5, 0.0);
            BlockHitResult hitResult = new BlockHitResult(hitVec, Direction.UP, this.targetChest, false);
            EcOpen.mc.interactionManager.interactBlock(EcOpen.mc.player, Hand.MAIN_HAND, hitResult);
            EcOpen.mc.player.swingHand(Hand.MAIN_HAND);
            this.reset();
        }
        if (this.rotationTicks > 20) {
            this.reset();
        }
    }

    private void findEnderChest() {
        BlockPos playerPos = EcOpen.mc.player.getBlockPos();
        int r2 = this.range.getValue().intValue();
        double maxDist = this.range.getValue().floatValue() * this.range.getValue().floatValue();
        double closestDist = Double.MAX_VALUE;
        BlockPos closest = null;
        for (int x2 = -r2; x2 <= r2; ++x2) {
            for (int y2 = -r2; y2 <= r2; ++y2) {
                for (int z2 = -r2; z2 <= r2; ++z2) {
                    double dist;
                    BlockPos pos = playerPos.add(x2, y2, z2);
                    if (!EcOpen.mc.world.getBlockState(pos).isOf(Blocks.ENDER_CHEST) || !((dist = EcOpen.mc.player.getEyePos().squaredDistanceTo(Vec3d.ofCenter((Vec3i)pos))) < closestDist) || !(dist <= maxDist)) continue;
                    closestDist = dist;
                    closest = pos;
                }
            }
        }
        if (closest != null) {
            this.targetChest = closest;
            this.shouldRotate = true;
            this.rotationTicks = 0;
            this.currentYaw = EcOpen.mc.player.getYaw();
            this.currentPitch = EcOpen.mc.player.getPitch();
        }
    }

    private float[] calculateRotation(Vec3d target) {
        Vec3d eye = EcOpen.mc.player.getEyePos();
        double dx = target.x - eye.x;
        double dy = target.y - eye.y;
        double dz = target.z - eye.z;
        double dist = Math.sqrt(dx * dx + dz * dz);
        float yaw = (float)Math.toDegrees(Math.atan2(dz, dx)) - 90.0f;
        float pitch = (float)(-Math.toDegrees(Math.atan2(dy, dist)));
        return new float[]{yaw, MathHelper.clamp((float)pitch, (float)-90.0f, (float)90.0f)};
    }

    private void reset() {
        this.targetChest = null;
        this.shouldRotate = false;
        this.rotationTicks = 0;
    }
}