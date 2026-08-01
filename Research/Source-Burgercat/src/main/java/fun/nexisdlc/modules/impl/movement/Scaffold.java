package fun.nexisdlc.modules.impl.movement;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.player.MoveInputEvent;
import fun.nexisdlc.client.events.impl.player.RotationEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.eventbus.EventPriority;
import fun.nexisdlc.client.utils.player.rotation.CorrectionType;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

@FunctionAdd(name = "Scaffold", alias = "Scaffold", category = Category.Movement, description = "Легитный мост с пресетными углами")
public class Scaffold extends Function {
    private final ModeSetting bridgeMode = new ModeSetting("Режим", "Ниндзя", "Ниндзя", "Бризли", "Годбридж", "Мунволк");
    private final SliderSetting cps = new SliderSetting("КПС", 10f, 4f, 80f, 1f);
    private final BooleanSetting autoSelectBlock = new BooleanSetting("Авто блок", true);
    private final BooleanSetting lockPitch = new BooleanSetting("Фиксировать питч", true);
    private final BooleanSetting requireUseKey = new BooleanSetting("Только при ПКМ", false);
    private int oldSlot = -1;
    private long lastPlaceMs;
    private float stableYaw = 180.0f;

    public Scaffold() {
        addSettings(bridgeMode, cps, autoSelectBlock, lockPitch, requireUseKey);
    }

    @Override
    public void onEnable() {
        if (!nullCheck()) {
            oldSlot = mc.player.getInventory().getSelectedSlot();
            stableYaw = resolveEdgeBasedYaw();
            int slot = findBestHotbarBlockSlot();
            if (slot >= 0) mc.player.getInventory().setSelectedSlot(slot);
        }
        lastPlaceMs = 0L;
        super.onEnable();
    }

    @Override
    public void onDisable() {
        if (!nullCheck() && oldSlot >= 0 && oldSlot < 9) {
            mc.player.getInventory().setSelectedSlot(oldSlot);
        }
        oldSlot = -1;
        if (mc.options != null) mc.options.jumpKey.setPressed(false);
        super.onDisable();
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) return;
        if (requireUseKey.get() && !mc.options.useKey.isPressed()) return;
        if (autoSelectBlock.get()) {
            int slot = findBestHotbarBlockSlot();
            if (slot >= 0) mc.player.getInventory().setSelectedSlot(slot);
        }
        float yaw = getTargetYaw();
        float pitch = getPresetPitch();
        if (lockPitch.get()) {
            mc.player.setPitch(pitch);
        } else {
            RotationTask.setTargetRotation(yaw, pitch, 4);
        }
        tryPlace(yaw, pitch);
    }

    @EventHandler
    public void onRotation(RotationEvent event) {
        if (!nullCheck()) {
            event.rotate(getTargetYaw(), getPresetPitch(), CorrectionType.FREE);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onMoveInput(MoveInputEvent event) {
        if (nullCheck()) return;
        if (!bridgeMode.is("Бризли") && !bridgeMode.is("Мунволк") && !bridgeMode.is("Ниндзя") && !bridgeMode.is("Годбридж")) return;
        event.setOverrideForwardBackward(true);
        event.setForwardPressed(false);
        event.setBackwardPressed(true);
        event.setOverrideLeftRight(true);
        event.setLeft(bridgeMode.is("Бризли"));
        event.setRight(!bridgeMode.is("Бризли"));
        event.setSneaking(bridgeMode.is("Ниндзя"));
    }

    private void tryPlace(float yaw, float pitch) {
        int slot = getBlockSlot();
        if (slot < 0 || mc.interactionManager == null || mc.player.isUsingItem()) return;
        mc.player.getInventory().setSelectedSlot(slot);

        long delay = Math.max(1L, (long) (1000f / Math.max(1f, cps.get())));
        long now = System.currentTimeMillis();
        if (now - lastPlaceMs < delay) return;

        BlockHitResult hit = findPlaceHit(yaw, pitch);
        if (hit == null) return;
        ActionResult result = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, hit);
        if (result != null && result.isAccepted()) {
            mc.player.swingHand(Hand.MAIN_HAND);
            lastPlaceMs = now;
        }
    }

    private BlockHitResult findPlaceHit(float yaw, float pitch) {
        Vec3d eye = mc.player.getEyePos();
        Vec3d look = Vec3d.fromPolar(pitch, yaw);
        BlockHitResult hit = mc.world.raycast(new RaycastContext(eye, eye.add(look.multiply(5.0)), RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, mc.player));
        if (hit.getType() != HitResult.Type.BLOCK) return null;
        BlockPos placePos = hit.getBlockPos().offset(hit.getSide());
        return mc.world.getBlockState(placePos).isReplaceable() ? hit : null;
    }

    private int getBlockSlot() {
        ItemStack selected = mc.player.getInventory().getSelectedStack();
        if (selected.getItem() instanceof BlockItem) return mc.player.getInventory().getSelectedSlot();
        return autoSelectBlock.get() ? findBestHotbarBlockSlot() : -1;
    }

    private int findBestHotbarBlockSlot() {
        int bestSlot = -1;
        int bestCount = -1;
        for (int i = 0; i < 9; i++) {
            ItemStack stack = mc.player.getInventory().getStack(i);
            if (stack.getItem() instanceof BlockItem && stack.getCount() > bestCount) {
                bestCount = stack.getCount();
                bestSlot = i;
            }
        }
        return bestSlot;
    }

    private float getPresetPitch() {
        float pitch = bridgeMode.is("Годбридж") ? 75.55f : bridgeMode.is("Бризли") ? 79.9f : bridgeMode.is("Мунволк") ? 77f : 78f;
        return MathHelper.clamp(pitch, -89.0f, 89.0f);
    }

    private float getTargetYaw() {
        return bridgeMode.is("Ниндзя") || bridgeMode.is("Годбридж") ? MathHelper.wrapDegrees(stableYaw + 45.0f) : stableYaw;
    }

    private float resolveEdgeBasedYaw() {
        BlockPos standing = BlockPos.ofFloored(mc.player.getX(), mc.player.getY() - 1.0, mc.player.getZ());
        double localX = mc.player.getX() - standing.getX();
        double localZ = mc.player.getZ() - standing.getZ();
        double min = localX;
        Direction edge = Direction.WEST;
        if (1.0 - localX < min) { min = 1.0 - localX; edge = Direction.EAST; }
        if (localZ < min) { min = localZ; edge = Direction.NORTH; }
        if (1.0 - localZ < min) { edge = Direction.SOUTH; }
        return switch (edge) {
            case NORTH -> 180.0f;
            case SOUTH -> 0.0f;
            case WEST -> 90.0f;
            case EAST -> -90.0f;
            default -> stableYaw;
        };
    }
}
