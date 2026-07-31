package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;

@FunctionAdd(name = "AutoTool", alias = "Auto Tool", category = Category.Player, description = "Автоматически выбирает лучший инструмент из хотбара")
public class AutoTool extends Function {
    public final BooleanSetting invisible = new BooleanSetting("Незаметный", false);
    private int oldSlot = -1;
    private int swappedInventorySlotId = -1;
    private boolean swapped;
    private ItemStack visualStack = ItemStack.EMPTY;
    private int visualResetTicks = 0;
    private int attackHoldTicks = 0;

    public AutoTool() {
        addSettings(invisible);
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (mc.options.attackKey.isPressed()) {
            attackHoldTicks++;
        } else {
            attackHoldTicks = 0;
            if (!swapped) {
                if (visualResetTicks > 0) {
                    visualResetTicks--;
                } else {
                    visualStack = ItemStack.EMPTY;
                }
            }
        }

        if (mc.player == null || mc.world == null || mc.player.isCreative()
                || (NexisClient.getFunctionManager().getAttackAura() != null && NexisClient.getFunctionManager().getAttackAura().isState())) {
            restoreTool();
            return;
        }

        if (mc.crosshairTarget instanceof BlockHitResult hit && mc.options.attackKey.isPressed()) {
            if (attackHoldTicks >= 1) {
                if (swappedInventorySlotId != -1) {
                    if (oldSlot != -1 && mc.player.getInventory().getSelectedSlot() != oldSlot) {
                        PlayerInventoryUtil.setSelectedSlotInstant(oldSlot);
                    }
                    return;
                }

                BlockPos pos = hit.getBlockPos();
                BlockState state = mc.world.getBlockState(pos);
                Slot bestSlot = findBestToolSlot(state);
                if (bestSlot != null) {
                    useToolSlot(bestSlot);
                }
            }
        } else {
            restoreTool();
        }
    }

    private Slot findBestToolSlot(BlockState state) {
        if (mc.player == null || mc.player.currentScreenHandler == null) {
            return null;
        }

        // сначала ищем лучший инструмент в хотбаре
        Slot bestHotbar = null;
        float bestHotbarSpeed = 1.0f;

        for (Slot slot : PlayerInventoryUtil.slots().toList()) {
            if (!isHotbarSlot(slot.id)) {
                continue;
            }

            float speed = slot.getStack().getMiningSpeedMultiplier(state);
            if (speed > bestHotbarSpeed) {
                bestHotbarSpeed = speed;
                bestHotbar = slot;
            }
        }

        // если в хотбаре нашелся подходящий инструмент — используем его
        if (bestHotbar != null) {
            return bestHotbar;
        }

        // иначе ищем во всем инвентаре (9-35, кроме хотбара)
        Slot bestSlot = null;
        float bestSpeed = 1.0f;

        for (Slot slot : PlayerInventoryUtil.slots().toList()) {
            if (!isPlayerMainInventorySlot(slot.id) || isHotbarSlot(slot.id)) {
                continue;
            }

            float speed = slot.getStack().getMiningSpeedMultiplier(state);
            if (speed > bestSpeed) {
                bestSpeed = speed;
                bestSlot = slot;
            }
        }

        return bestSlot;
    }

    private void useToolSlot(Slot slot) {
        if (mc.player == null || slot == null) {
            return;
        }

        int currentSelected = mc.player.getInventory().getSelectedSlot();
        if (oldSlot == -1) {
            oldSlot = currentSelected;
            visualStack = mc.player.getInventory().getStack(currentSelected).copy();
            visualResetTicks = 0;
        }

        if (isHotbarSlot(slot.id)) {
            int hotbarSlot = slot.id - 36;
            if (swappedInventorySlotId != -1) {
                restoreInventoryTool();
            }
            if (mc.player.getInventory().getSelectedSlot() != hotbarSlot) {
                PlayerInventoryUtil.setSelectedSlotInstant(hotbarSlot);
            }
            swapped = true;
            return;
        }

        if (swappedInventorySlotId == slot.id) {
            if (mc.player.getInventory().getSelectedSlot() != oldSlot) {
                PlayerInventoryUtil.setSelectedSlotInstant(oldSlot);
            }
            swapped = true;
            return;
        }

        if (swappedInventorySlotId != -1) {
            restoreInventoryTool();
        }

        PlayerInventoryUtil.setSelectedSlotInstant(oldSlot);
        PlayerInventoryUtil.swapHand(slot, Hand.MAIN_HAND, true, true);
        swappedInventorySlotId = slot.id;
        swapped = true;
    }

    private void restoreTool() {
        if (!swapped) {
            oldSlot = -1;
            swappedInventorySlotId = -1;
            return;
        }

        restoreInventoryTool();

        if (mc.player != null && oldSlot != -1) {
            PlayerInventoryUtil.setSelectedSlotInstant(oldSlot);
        }

        swapped = false;
        visualResetTicks = 5;
        oldSlot = -1;
        swappedInventorySlotId = -1;
    }

    private void restoreInventoryTool() {
        if (mc.player == null || swappedInventorySlotId == -1) {
            return;
        }

        Slot slot = getSlotById(swappedInventorySlotId);
        if (slot != null) {
            PlayerInventoryUtil.setSelectedSlotInstant(oldSlot);
            PlayerInventoryUtil.swapHand(slot, Hand.MAIN_HAND, true, true);
        }
        swappedInventorySlotId = -1;
    }

    private Slot getSlotById(int id) {
        if (mc.player == null || mc.player.currentScreenHandler == null) {
            return null;
        }
        if (id < 0 || id >= mc.player.currentScreenHandler.slots.size()) {
            return null;
        }
        return mc.player.currentScreenHandler.slots.get(id);
    }

    private boolean isPlayerMainInventorySlot(int id) {
        return id >= 9 && id <= 44;
    }

    private boolean isHotbarSlot(int id) {
        return id >= 36 && id <= 44;
    }

    public ItemStack getVisualStack() {
        return visualStack;
    }

    @Override
    public void onDisable() {
        restoreTool();
        super.onDisable();
    }
}
