package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.player.MoveInputEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.eventbus.EventPriority;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

import java.util.concurrent.ThreadLocalRandom;

@FunctionAdd(
        name = "ClanUpgrade",
        alias = "Clan Upgrade",
        category = Category.Player,
        description = "Автоматическое улучшение клана с использованием редстоуновой пыли",
        key = 0,
        needPremium = false
)
public class ClanUpgrade extends Function {
    private final BooleanSetting checkInventory = new BooleanSetting("Проверять инвентарь", true);
    private final BooleanSetting notifyUser = new BooleanSetting("Уведомления", true);

    private final StopWatch clickTimer = new StopWatch();
    private boolean isUpgrading = false;
    private boolean rotationSet = false;
    private boolean slotSwapped = false;
    private boolean movementStopped = false;
    private boolean isPlacing = true;
    private int originalSlot = -1;
    private BlockPos targetBlock = null;
    private float targetYaw = 0;
    private float targetPitch = 90.0f;

    public ClanUpgrade() {
        addSettings(checkInventory, notifyUser);
    }

    @Override
    public void onEnable() {
        super.onEnable();

        if (nullCheck()) {
            mc.execute(() -> { if (isState()) setState(false); });
            return;
        }

        if (checkInventory.get()) {
            Slot redstoneSlotObj = PlayerInventoryUtil.getSlot(Items.REDSTONE);
            if (redstoneSlotObj == null) {
                if (notifyUser.get()) {
                    sendMessage("§c[ClanUpgrade] Редстоуновая пыль не найдена в инвентаре!");
                }
                mc.execute(() -> { if (isState()) setState(false); });
                return;
            }
        }

        RotationTask.create("clanupgrade", 999);

        originalSlot = mc.player.getInventory().getSelectedSlot();

        if (notifyUser.get()) {
            sendMessage("§a[ClanUpgrade] Начинаю улучшение клана...");
        }

        startUpgrade();
    }

    @Override
    public void onDisable() {
        super.onDisable();

        RotationTask.remove("clanupgrade");

        RotationTask.rotationState = RotationTask.RotationState.RESET;
        RotationTask.returnStartTime = System.currentTimeMillis() - 460;
        RotationTask.rotationPriority = 0;
        RotationTask.inactiveMs = 0L;
        RotationTask.needSmoothReset = true;
        RotationTask.resetDelayMs = 10;

        stopUpgrade();

        if (originalSlot != -1 && mc.player != null) {
            PlayerInventoryUtil.setSelectedSlotInstant(originalSlot);
        }

        PlayerUtils.enableMoveKeys();

        if (notifyUser.get() && mc.player != null) {
            sendMessage("§e[ClanUpgrade] Улучшение клана остановлено.");
        }

        isUpgrading = false;
        rotationSet = false;
        slotSwapped = false;
        movementStopped = false;
        isPlacing = true;
        originalSlot = -1;
        targetBlock = null;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onMoveInput(MoveInputEvent event) {
        if (!isUpgrading || !movementStopped) return;

        event.setOverrideForwardBackward(true);
        event.setForwardPressed(false);
        event.setBackwardPressed(false);
        event.setOverrideLeftRight(true);
        event.setLeft(false);
        event.setRight(false);
        event.setOverrideJump(true);
        event.setJumpPressed(false);
        event.cancel();
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck() || !isUpgrading) return;

        if (checkInventory.get()) {
            Slot redstoneSlotObj = PlayerInventoryUtil.getSlot(Items.REDSTONE);
            if (redstoneSlotObj == null) {
                if (notifyUser.get()) {
                    sendMessage("§c[ClanUpgrade] Редстоуновая пыль закончилась!");
                }
                mc.execute(() -> { if (isState()) setState(false); });
                return;
            }
        }

        if (!movementStopped) {
            PlayerUtils.disableMoveKeys();
            movementStopped = true;
            return;
        }

        if (!slotSwapped) {
            Slot redstoneSlotObj = PlayerInventoryUtil.getSlot(Items.REDSTONE);
            if (redstoneSlotObj != null) {
                if (redstoneSlotObj.id >= 36 && redstoneSlotObj.id <= 44) {
                    int hotbarSlot = redstoneSlotObj.id - 36;
                    PlayerInventoryUtil.setSelectedSlotInstant(hotbarSlot);
                } else {
                    PlayerInventoryUtil.swapHand(redstoneSlotObj, Hand.MAIN_HAND, false, true);
                }
            }
            slotSwapped = true;
            return;
        }

        if (!rotationSet) {
            targetBlock = mc.player.getBlockPos().down();

            Vec3d blockCenter = new Vec3d(
                    targetBlock.getX() + 0.5,
                    targetBlock.getY() + 0.5,
                    targetBlock.getZ() + 0.5
            );

            Vec3d playerEyes = mc.player.getEyePos();
            Vec3d direction = blockCenter.subtract(playerEyes);

            targetYaw = ThreadLocalRandom.current().nextFloat(-2, 2) + (float) Math.toDegrees(Math.atan2(direction.z, direction.x)) - 90.0f;

            double horizontalDistance = Math.sqrt(direction.x * direction.x + direction.z * direction.z);
            targetPitch = ThreadLocalRandom.current().nextFloat(-2, 2) + (float) -Math.toDegrees(Math.atan2(direction.y, horizontalDistance));

            RotationTask.setTargetRotation(targetYaw, targetPitch, 999);

            rotationSet = true;
            return;
        }

        if (clickTimer.hasReached(50)) {
            if (targetBlock == null || mc.interactionManager == null || mc.world == null) return;

            if (isPlacing) {
                placeRedstone(targetBlock);
            } else {
                breakRedstone(targetBlock);
            }

            isPlacing = !isPlacing;
            clickTimer.reset();
        }
    }

    private void placeRedstone(BlockPos pos) {
        Vec3d hitVec = new Vec3d(pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5);
        BlockHitResult hit = new BlockHitResult(hitVec, Direction.UP, pos, false);
        mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, hit);
        mc.player.swingHand(Hand.MAIN_HAND, false);
    }

    private void breakRedstone(BlockPos pos) {
        BlockPos redstonePos = pos.up();
        mc.interactionManager.attackBlock(redstonePos, Direction.UP);
        mc.player.swingHand(Hand.MAIN_HAND, false);
    }

    private void startUpgrade() {
        isUpgrading = true;
        rotationSet = false;
        slotSwapped = false;
        movementStopped = false;
        targetBlock = null;
        clickTimer.reset();
    }

    private void stopUpgrade() {
        isUpgrading = false;
        rotationSet = false;
        slotSwapped = false;
        movementStopped = false;
        targetBlock = null;

        if (mc.options != null) {
            mc.options.attackKey.setPressed(false);
            mc.options.useKey.setPressed(false);
        }
    }
}
