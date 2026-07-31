package fun.nexisdlc.modules.impl.movement;

import fun.nexisdlc.client.events.impl.client.PostEvent;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.player.JumpEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

@FunctionAdd(name = "Spider", alias = "Spider", category = Category.Movement, description = "Позволяет забираться по стенам")
public class Spider extends Function {
    private final ModeSetting mode = new ModeSetting("Mode", "FunTime", "FunTime", "Громоотводы", "SpookyTime", "Blocks");

    private final StopWatch climbTimer = new StopWatch();
    private final StopWatch lightningTimer = new StopWatch();
    private int lastSlot;
    private float targetYaw;

    public Spider() {
        addSettings(mode);
    }

    @Override
    public void onEnable() {
        if (mc.player != null) {
            lastSlot = mc.player.getInventory().getSelectedSlot();
            targetYaw = mc.player.getHorizontalFacing().getPositiveHorizontalDegrees();
        }
        climbTimer.reset();
        lightningTimer.reset();
        super.onEnable();
    }

    @EventHandler
    public void onPost(PostEvent event) {
        if (nullCheck()) {
            return;
        }

        if (mode.is("FunTime")) {
            handleFunTime();
        } else if (mode.is("SpookyTime")) {
            handleSpookyTime();
        } else if (mode.is("Blocks")) {
            handleBlocks();
        } else if (mode.is("Громоотводы")) {
            handleLightningRods();
        }
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck() || !mode.is("Blocks") || !hasAnySideCollision()) {
            return;
        }

        if (findBlockSlot() == -1) {
            toggle();
            return;
        }

        mc.options.jumpKey.setPressed(true);
    }

    @EventHandler
    public void onJump(JumpEvent event) {
        climbTimer.reset();
    }

    private void handleFunTime() {
        if (mc.options.jumpKey.isPressed() || !hasAnySideCollision()) {
            return;
        }

        if (climbTimer.hasReached(5)) {
            mc.player.setOnGround(true);
            mc.player.setVelocity(mc.player.getVelocity().x, 0.6F, mc.player.getVelocity().z);
        }
    }

    private void handleSpookyTime() {
        if (!hasAnySideCollision()) {
            mc.options.useKey.setPressed(false);
            return;
        }

        int waterSlot = findHotbarItem(Items.WATER_BUCKET);
        if (waterSlot == -1) {
            mc.options.useKey.setPressed(false);
            return;
        }

        mc.player.getInventory().setSelectedSlot(waterSlot);
        RotationTask.setTargetRotation(mc.player.getYaw(), 77.3F, 8);
        mc.options.sneakKey.setPressed(true);
        mc.options.forwardKey.setPressed(true);
        mc.options.jumpKey.setPressed(true);
        mc.options.useKey.setPressed(true);
    }

    private void handleBlocks() {
        if (!hasAnySideCollision()) {
            return;
        }

        int blockSlot = findBlockSlot();
        if (blockSlot == -1) {
            toggle();
            return;
        }

        mc.options.jumpKey.setPressed(true);
        RotationTask.setTargetRotation(targetYaw, 80.0F, 8);

        if (mc.player.fallDistance > 0.0F && mc.player.fallDistance < 2.0F) {
            placeBlockWithRaycast(blockSlot);
        }
    }

    private void handleLightningRods() {
        if (!mc.player.horizontalCollision || !lightningTimer.hasReached(1)) {
            return;
        }

        mc.player.setOnGround(true);
        mc.player.jump();

        int rodSlot = findHotbarItem(Items.LIGHTNING_ROD);
        if (rodSlot == -1) {
            int inventorySlotId = findInventorySlotId(Items.LIGHTNING_ROD);
            if (inventorySlotId != -1) {
                PlayerInventoryUtil.clickSlot(inventorySlotId, lastSlot, SlotActionType.SWAP);
                PlayerInventoryUtil.updateSlots();
                rodSlot = lastSlot;
            }
        }

        if (rodSlot != -1) {
            placeLightningRods(rodSlot);
            mc.player.fallDistance = 0.0F;
            lightningTimer.reset();
        }
    }

    private boolean hasAnySideCollision() {
        Box box = mc.player.getBoundingBox();
        Box sideBox = new Box(
                box.minX - 0.06, box.minY + 0.05, box.minZ - 0.06,
                box.maxX + 0.06, box.maxY - 0.05, box.maxZ + 0.06
        );

        return BlockPos.stream(sideBox).anyMatch(pos -> {
            BlockState state = mc.world.getBlockState(pos);
            return !state.getCollisionShape(mc.world, pos).isEmpty()
                    && state.getCollisionShape(mc.world, pos).getBoundingBoxes().stream()
                    .map(shapeBox -> shapeBox.offset(pos.getX(), pos.getY(), pos.getZ()))
                    .anyMatch(sideBox::intersects);
        });
    }

    private int findBlockSlot() {
        for (int i = 0; i < 9; i++) {
            Item item = mc.player.getInventory().getStack(i).getItem();
            if (item instanceof BlockItem && item != Items.TORCH) {
                return i;
            }
        }
        return -1;
    }

    private int findHotbarItem(Item item) {
        for (int i = 0; i < 9; i++) {
            if (mc.player.getInventory().getStack(i).isOf(item)) {
                return i;
            }
        }
        return -1;
    }

    private int findInventorySlotId(Item item) {
        return PlayerInventoryUtil.slots()
                .filter(slot -> slot.id >= 9 && slot.id <= 35)
                .filter(slot -> slot.getStack().isOf(item))
                .map(slot -> slot.id)
                .findFirst()
                .orElse(-1);
    }

    private void placeBlockWithRaycast(int slot) {
        int previousSlot = mc.player.getInventory().getSelectedSlot();
        mc.player.getInventory().setSelectedSlot(slot);

        BlockHitResult hitResult = PlayerUtils.raycast(4.0, targetYaw, 80.0F, false);
        if (hitResult != null && hitResult.getType() == HitResult.Type.BLOCK) {
            mc.player.swingHand(Hand.MAIN_HAND);
            mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, hitResult);
        }

        mc.player.getInventory().setSelectedSlot(previousSlot);
    }

    private void placeLightningRods(int slot) {
        int previousSlot = mc.player.getInventory().getSelectedSlot();
        mc.player.getInventory().setSelectedSlot(slot);

        BlockPos playerPos = mc.player.getBlockPos();
        for (int offset = 1; offset <= 2; offset++) {
            BlockPos target = playerPos.up(offset);
            if (mc.world.getBlockState(target).isAir()) {
                placeBlockAt(target);
            }
        }

        mc.player.getInventory().setSelectedSlot(previousSlot);
    }

    private void placeBlockAt(BlockPos pos) {
        Vec3d hitVec = Vec3d.ofCenter(pos);
        BlockHitResult hitResult = new BlockHitResult(hitVec, Direction.UP, pos.down(), false);
        mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, hitResult);
        mc.player.swingHand(Hand.MAIN_HAND);
    }

    @Override
    public void onDisable() {
        if (mc.player != null && !mode.is("FunTime") && !mode.is("Громоотводы")) {
            mc.player.getInventory().setSelectedSlot(lastSlot);
        }

        if (mc.options != null) {
            mc.options.useKey.setPressed(false);
            mc.options.forwardKey.setPressed(false);
            mc.options.sneakKey.setPressed(false);
            mc.options.jumpKey.setPressed(false);
        }

        super.onDisable();
    }
}
