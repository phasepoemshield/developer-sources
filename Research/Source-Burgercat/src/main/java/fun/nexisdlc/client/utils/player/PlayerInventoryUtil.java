package fun.nexisdlc.client.utils.player;

import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.mixins.accessors.ClientPlayerInteractionManagerAccessor;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import fun.nexisdlc.modules.impl.utils.ServerAssistant;
import fun.nexisdlc.ui.hud.NotificationsOverlay;
import lombok.experimental.UtilityClass;
import net.minecraft.client.util.InputUtil;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import org.lwjgl.glfw.GLFW;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@UtilityClass
public class PlayerInventoryUtil implements IMinecraft {
    public static final int MOUSE_WHEEL_UP = 10001;
    public static final int MOUSE_WHEEL_DOWN = 10002;
    private static final long WHEEL_PRESS_WINDOW_MS = 120L;
    private static long lastWheelUpAt;
    private static long lastWheelDownAt;

    public void clickSlot(int slotId, int buttonId, SlotActionType clickType) {
        if (mc.player == null || mc.interactionManager == null) return;
        int syncId = mc.player.currentScreenHandler.syncId;
        mc.interactionManager.clickSlot(syncId, slotId, buttonId, clickType, mc.player);
    }

    public void moveItem(int from, int to, boolean task, boolean updateInventory) {
        if (from == to || from == -1) return;

        if (task) {
            PlayerUtils.addTask(() -> moveItemLogic(from, to, updateInventory));
        } else {
            moveItemLogic(from, to, updateInventory);
        }
    }

    private void moveItemLogic(int from, int to, boolean updateInventory) {
        clickSlot(from, 0, SlotActionType.PICKUP);
        clickSlot(to, 0, SlotActionType.PICKUP);
        clickSlot(from, 0, SlotActionType.PICKUP);
        if (updateInventory) updateSlots();
    }

    // Прямой свап двух слотов внутри инвентаря через PICKUP.
    // Не трогает выбранный хотбар-слот, не ждёт тики. Один тик, мгновенно.
    // Подходит для брони (slot 6 = нагрудник): курсор берёт предмет из from,
    // кладёт в to (забирая старый), и кладёт старый обратно в from.
    public static void swapItemsDirect(int from, int to, boolean updateInventory) {
        if (mc.player == null || mc.interactionManager == null) return;
        if (from == to || from == -1 || to == -1) return;

        clickSlot(from, 0, SlotActionType.PICKUP);
        clickSlot(to, 0, SlotActionType.PICKUP);
        clickSlot(from, 0, SlotActionType.PICKUP);

        if (updateInventory) updateSlots();
    }

    public void swapHand(Slot slot, Hand hand, boolean task, boolean updateInventory) {
        if (slot == null || mc.player == null) return;
        int button = hand.equals(Hand.MAIN_HAND) ? mc.player.getInventory().getSelectedSlot() : 40;

        if (task) {
            PlayerUtils.addTask(() -> {
                clickSlot(slot.id, button, SlotActionType.SWAP);
                if (updateInventory) updateSlots();
            });
        } else {
            clickSlot(slot.id, button, SlotActionType.SWAP);
            if (updateInventory) updateSlots();
        }
    }

    public void swapHand(Slot slot, Hand hand, boolean updateInventory) {
        swapHand(slot, hand, false, updateInventory);
    }

    public void swapAndUse(Item item) {
        Slot slot = getSlot(item);
        if (slot == null) return;
        if (isItemOnCooldown(slot.getStack())) return;

        NotificationsOverlay.push(Text.literal("Успешно использовано: ").append(slot.getStack().getName()), 1200, NotificationsOverlay.Kind.INFORMATION, slot.getStack());
        swapAndUseFromHotbar(item);
    }


    private static boolean isSwapping = false;
    private static int swapPhase = 0;
    private static Slot swapTargetSlot = null;
    private static int swapOriginalSlot = -1;
    private static int savedSlotBeforeUse = -1;
    private static boolean swapLockMoves = true;
    private static SwapMode swapMode = SwapMode.USE;
    private static int swapMoveFromId = -1;
    private static int swapMoveToId = -1;
    private static boolean swapMoveDirect = false;
    private static ItemStack swapOriginalSelectedSnapshot = ItemStack.EMPTY;
    private static ItemStack swapUsedHandSnapshot = ItemStack.EMPTY;
    private static ItemStack swapMoveFromSnapshot = ItemStack.EMPTY;
    private static ItemStack swapMoveToSnapshot = ItemStack.EMPTY;
    private static boolean isInstantSwap = false;
    private static Float queuedUseYaw;
    private static Float queuedUsePitch;

    private enum SwapMode {
        USE,
        MOVE
    }

    public static void swapAndUseFromHotbar(Item item) {
        Slot slot = getSlot(item);
        if (slot == null) return;
        if (isItemOnCooldown(slot.getStack())) return;

        if (isSwapping) return;

        // Сохраняем текущий слот перед использованием
        savedSlotBeforeUse = mc.player.getInventory().getSelectedSlot();

        if (isHotbarSlotId(slot.id)) {
            swapAndUseHotbarFast(slot, item != Items.FIREWORK_ROCKET);
            return;
        }

        isSwapping = true;
        isInstantSwap = false;
        swapPhase = 1;
        swapTargetSlot = slot;
        swapOriginalSlot = mc.player.getInventory().getSelectedSlot();
        swapLockMoves = !isHotbarSlotId(slot.id) && !isInstantSwapMode();
        swapMode = SwapMode.USE;
        swapOriginalSelectedSnapshot = mc.player.getInventory().getStack(swapOriginalSlot).copy();
        swapUsedHandSnapshot = ItemStack.EMPTY;

        processSwapPhase();
    }

    private static void swapAndUseHotbarFast(Slot slot, boolean swing) {
        if (mc.player == null) {
            return;
        }

        int originalSlot = savedSlotBeforeUse != -1 ? savedSlotBeforeUse : mc.player.getInventory().getSelectedSlot();
        int targetSlot = hotbarIndexFromSlotId(slot.id);

        setSelectedSlotSynced(targetSlot);
        applyQueuedUseRotation();
        useMainHandItem(swing);

        PlayerUtils.postScript.addTickStep(4, () -> {
            setSelectedSlotSynced(originalSlot);
            updateSlots();
        });
    }

    public static void queueNextUseRotation(float yaw, float pitch) {
        queuedUseYaw = yaw;
        queuedUsePitch = pitch;
    }

    private static void applyQueuedUseRotation() {
        if (queuedUseYaw != null && queuedUsePitch != null) {
            PlayerUtils.setNextInteractRotation(queuedUseYaw, queuedUsePitch);
        }
        queuedUseYaw = null;
        queuedUsePitch = null;
    }

    public static void swapAndUseInstant(Item item) {
        Slot slot = getSlot(item);
        if (slot == null) return;
        if (isItemOnCooldown(slot.getStack())) return;

        NotificationsOverlay.push(Text.literal("Успешно использовано: ").append(slot.getStack().getName()), 1200, NotificationsOverlay.Kind.INFORMATION, slot.getStack());

        if (isSwapping) return;

        // Сохраняем текущий слот перед использованием
        savedSlotBeforeUse = mc.player.getInventory().getSelectedSlot();

        isSwapping = true;
        isInstantSwap = true;
        swapPhase = 1;
        swapTargetSlot = slot;
        swapOriginalSlot = mc.player.getInventory().getSelectedSlot();
        swapLockMoves = false;
        swapMode = SwapMode.USE;
        swapOriginalSelectedSnapshot = mc.player.getInventory().getStack(swapOriginalSlot).copy();
        swapUsedHandSnapshot = ItemStack.EMPTY;

        processSwapPhase();
    }

    public static void swapItemsPhased(int from, int to, boolean updateInventory) {
        if (isSwapping) return;
        if (from == to || from == -1) return;

        isSwapping = true;
        isInstantSwap = false;
        swapPhase = 1;
        swapTargetSlot = null;
        swapOriginalSlot = mc.player.getInventory().getSelectedSlot();
        swapMode = SwapMode.MOVE;
        swapMoveFromId = from;
        swapMoveToId = to;
        swapMoveFromSnapshot = getSlotStackCopy(from);
        swapMoveToSnapshot = getSlotStackCopy(to);
        swapUpdateInventory = updateInventory;
        swapLockMoves = !isInstantSwapMode();

        processSwapPhase();
    }

    // Фазовый прямой свап двух слотов (напр. инвентарь <-> слот брони 6).
    // Использует тот же автомат и те же тики (стоп/свап/возврат), что и юз-айтемы,
    // но сам свап делает атомарно через PICKUP — без прогона через выбранный хотбар-слот.
    public static void swapItemsPhasedDirect(int from, int to, boolean updateInventory) {
        if (isSwapping) return;
        if (from == to || from == -1 || to == -1) return;

        isSwapping = true;
        isInstantSwap = false;
        swapPhase = 1;
        swapTargetSlot = null;
        swapOriginalSlot = mc.player.getInventory().getSelectedSlot();
        swapMode = SwapMode.MOVE;
        swapMoveDirect = true;
        swapMoveFromId = from;
        swapMoveToId = to;
        swapMoveFromSnapshot = getSlotStackCopy(from);
        swapMoveToSnapshot = getSlotStackCopy(to);
        swapUpdateInventory = updateInventory;
        swapLockMoves = !isInstantSwapMode();

        processSwapPhase();
    }

    private static int waitTicks = 0;
    private static boolean swapUpdateInventory = true;

    public static void processSwapPhase() {
        if (!isSwapping || mc.player == null) return;

        if (isInstantSwap) {
            processInstantSwap();
            return;
        }

        if (swapPhase < 6 && swapLockMoves) {
            PlayerUtils.disableMoveKeys();
        }

        if (waitTicks > 0) {
            waitTicks--;
            return;
        }

        switch (swapPhase) {
            case 1:
                waitTicks = getWaitStopTicks();
                swapPhase = 2;
                break;

            case 2:
                if (swapMode == SwapMode.MOVE) {
                    performMoveSwapStep(1);
                } else {
                    if (swapTargetSlot.id < 36 || swapTargetSlot.id > 44) {
                        clickSlot(swapTargetSlot.id, swapOriginalSlot, SlotActionType.SWAP);
                    } else {
                        setSelectedSlotSynced(swapTargetSlot.id - 36);
                    }
                }

                waitTicks = getWaitSwapTicks();
                swapPhase = 3;
                break;

            case 3:
                if (swapMode == SwapMode.MOVE) {
                    performMoveSwapStep(2);
                } else {
                    applyQueuedUseRotation();
                    useMainHandItem(true);
                    swapUsedHandSnapshot = mc.player.getMainHandStack().copy();
                }

                waitTicks = getWaitUseTicks();
                swapPhase = 4;
                break;

            case 4:
                if (swapMode == SwapMode.MOVE) {
                    performMoveSwapStep(3);
                } else {
                    setSelectedSlotSynced(swapOriginalSlot);

                    if (swapTargetSlot.id < 36 || swapTargetSlot.id > 44) {
                        clickSlot(swapTargetSlot.id, swapOriginalSlot, SlotActionType.SWAP);
                    }
                }

                waitTicks = getWaitReturnTicks();
                swapPhase = 5;
                break;

            case 5:
                if (swapUpdateInventory) {
                    updateSlots();
                }

                waitTicks = 1;
                swapPhase = 6;
                break;

            case 6:
                if (swapUpdateInventory) {
                    updateSlots();
                }

                if (swapMode == SwapMode.USE) {
                    reconcileClientUseState();
                } else if (swapMode == SwapMode.MOVE) {
                    correctClientMoveSwapState();
                }

                if (swapLockMoves) {
                    PlayerUtils.enableMoveKeys();
                }

                isSwapping = false;
                isInstantSwap = false;
                swapPhase = 0;
                swapTargetSlot = null;
                swapOriginalSlot = -1;
                swapLockMoves = true;
                swapMode = SwapMode.USE;
                swapMoveDirect = false;
                swapMoveFromId = -1;
                swapMoveToId = -1;
                swapOriginalSelectedSnapshot = ItemStack.EMPTY;
                swapUsedHandSnapshot = ItemStack.EMPTY;
                swapMoveFromSnapshot = ItemStack.EMPTY;
                swapMoveToSnapshot = ItemStack.EMPTY;
                queuedUseYaw = null;
                queuedUsePitch = null;
                swapUpdateInventory = true;
                waitTicks = 0;
                break;
        }
    }

    private static void processInstantSwap() {
        switch (swapPhase) {
            case 1:
                swapPhase = 2;
                break;

            case 2:
                if (swapTargetSlot.id < 36 || swapTargetSlot.id > 44) {
                    clickSlot(swapTargetSlot.id, swapOriginalSlot, SlotActionType.SWAP);
                } else {
                    setSelectedSlotSynced(swapTargetSlot.id - 36);
                }
                swapPhase = 3;
                break;

            case 3:
                applyQueuedUseRotation();
                useMainHandItem(true);
                swapUsedHandSnapshot = mc.player.getMainHandStack().copy();
                swapPhase = 4;
                break;

            case 4:
                setSelectedSlotSynced(swapOriginalSlot);

                if (swapTargetSlot.id < 36 || swapTargetSlot.id > 44) {
                    clickSlot(swapTargetSlot.id, swapOriginalSlot, SlotActionType.SWAP);
                }

                swapPhase = 5;
                break;

            case 5:
                updateSlots();
                reconcileClientUseState();

                isSwapping = false;
                isInstantSwap = false;
                swapPhase = 0;
                swapTargetSlot = null;
                swapOriginalSlot = -1;
                swapLockMoves = true;
                swapMode = SwapMode.USE;
                swapOriginalSelectedSnapshot = ItemStack.EMPTY;
                swapUsedHandSnapshot = ItemStack.EMPTY;
                queuedUseYaw = null;
                queuedUsePitch = null;
                swapUpdateInventory = true;
                break;
        }
    }

    private static void reconcileClientUseState() {
        if (mc.player == null || swapTargetSlot == null) {
            return;
        }
        if (isHotbarSlotId(swapTargetSlot.id)) {
            return;
        }
        if (swapOriginalSlot < 0 || swapOriginalSlot > 8) {
            return;
        }
        int selectedSlotId = 36 + swapOriginalSlot;
        Slot selectedSlot = getScreenSlot(selectedSlotId);
        Slot targetSlot = getScreenSlot(swapTargetSlot.id);
        if (selectedSlot == null || targetSlot == null) {
            return;
        }

        // Hard client-side reconciliation: after swap->use->swap-back these are the expected stacks.
        selectedSlot.setStack(swapOriginalSelectedSnapshot.copy());
        targetSlot.setStack(swapUsedHandSnapshot.copy());
        mc.player.currentScreenHandler.setCursorStack(ItemStack.EMPTY);
        mc.player.getInventory().markDirty();
        mc.player.currentScreenHandler.sendContentUpdates();
    }

    private static void correctClientMoveSwapState() {
        if (swapMoveFromId < 0 || swapMoveToId < 0) {
            return;
        }
        Slot fromSlot = getScreenSlot(swapMoveFromId);
        Slot toSlot = getScreenSlot(swapMoveToId);
        if (fromSlot == null || toSlot == null) {
            return;
        }
        if (swapMoveFromSnapshot.isEmpty() && swapMoveToSnapshot.isEmpty()) {
            return;
        }

        ItemStack expectedFrom = swapMoveToSnapshot.copy();
        ItemStack expectedTo = swapMoveFromSnapshot.copy();

        boolean reversed = ItemStack.areItemsAndComponentsEqual(fromSlot.getStack(), expectedTo)
                && ItemStack.areItemsAndComponentsEqual(toSlot.getStack(), expectedFrom);
        if (reversed) {
            fromSlot.setStack(expectedFrom);
            toSlot.setStack(expectedTo);
        }
    }

    private static ItemStack getSlotStackCopy(int slotId) {
        Slot slot = getScreenSlot(slotId);
        return slot == null ? ItemStack.EMPTY : slot.getStack().copy();
    }

    private static Slot getScreenSlot(int slotId) {
        if (mc.player == null || mc.player.currentScreenHandler == null) {
            return null;
        }
        if (slotId < 0 || slotId >= mc.player.currentScreenHandler.slots.size()) {
            return null;
        }
        return mc.player.currentScreenHandler.slots.get(slotId);
    }

    private static void performMoveSwapStep(int step) {
        boolean fromHotbar = isHotbarSlotId(swapMoveFromId);
        boolean toHotbar = isHotbarSlotId(swapMoveToId);
        int tempHotbarIndex = swapOriginalSlot;

        // Прямой свап: 3 PICKUP атомарно в фазе свапа (step 1), хотбар не трогаем.
        if (swapMoveDirect) {
            if (step == 1) {
                clickSlot(swapMoveFromId, 0, SlotActionType.PICKUP);
                clickSlot(swapMoveToId, 0, SlotActionType.PICKUP);
                clickSlot(swapMoveFromId, 0, SlotActionType.PICKUP);
            }
            return;
        }

        if (fromHotbar && toHotbar) {
            if (step == 1) {
                clickSlot(swapMoveFromId, hotbarIndexFromSlotId(swapMoveToId), SlotActionType.SWAP);
            }
            return;
        }

        if (fromHotbar) {
            if (step == 1) {
                clickSlot(swapMoveToId, hotbarIndexFromSlotId(swapMoveFromId), SlotActionType.SWAP);
            }
            return;
        }

        if (toHotbar) {
            if (step == 1) {
                clickSlot(swapMoveFromId, hotbarIndexFromSlotId(swapMoveToId), SlotActionType.SWAP);
            }
            return;
        }

        if (step == 1) {
            clickSlot(swapMoveFromId, tempHotbarIndex, SlotActionType.SWAP);
        } else if (step == 2) {
            clickSlot(swapMoveToId, tempHotbarIndex, SlotActionType.SWAP);
        } else if (step == 3) {
            clickSlot(swapMoveFromId, tempHotbarIndex, SlotActionType.SWAP);
        }
    }

    private static boolean isHotbarSlotId(int slotId) {
        return slotId >= 36 && slotId <= 44;
    }


    private static int hotbarIndexFromSlotId(int slotId) {
        return slotId - 36;
    }

    private static boolean shouldUseLegitSwap() {
        if (ServerUtil.isFunTime()) {
            return true;
        }
        return isCustomServer() && ServerAssistant.legitUse.get();
    }

    private static boolean isCustomServer() {
        return ServerAssistant.isCustomServer();
    }

    private static boolean isInstantCustomSwapMode() {
        if (!isCustomServer()) {
            return false;
        }
        return ServerAssistant.tickToRunAction.get().intValue() == 0
                && ServerAssistant.tickToReturnKeys.get().intValue() == 0;
    }

    private static boolean isInstantSwapMode() {
        return isInstantCustomSwapMode() || isZeroLegitSwapDelays();
    }

    private static boolean isZeroLegitSwapDelays() {
        if (!isCustomServer() || !ServerAssistant.legitUse.get()) {
            return false;
        }

        int extra = ServerAssistant.getDynamicExtraDelayTicks();
        return ServerAssistant.waitStopTicks.get().intValue() == 0
                && ServerAssistant.waitSwapTicks.get().intValue() == 0
                && ServerAssistant.waitUseTicks.get().intValue() == 0
                && ServerAssistant.waitReturnTicks.get().intValue() == 0
                && extra == 0;
    }

    private static int getWaitStopTicks() {
        if (isInstantCustomSwapMode()) {
            return 0;
        }
        int extra = ServerAssistant.getDynamicExtraDelayTicks();
        return isCustomServer() && ServerAssistant.legitUse.get()
                ? ServerAssistant.waitStopTicks.get().intValue() + extra
                : 1;
    }

    private static int getWaitSwapTicks() {
        if (isInstantCustomSwapMode()) {
            return 0;
        }
        int extra = ServerAssistant.getDynamicExtraDelayTicks();
        return isCustomServer() && ServerAssistant.legitUse.get()
                ? ServerAssistant.waitSwapTicks.get().intValue() + extra
                : 0;
    }

    private static int getWaitUseTicks() {
        if (isInstantCustomSwapMode()) {
            return 0;
        }
        int extra = ServerAssistant.getDynamicExtraDelayTicks();
        return isCustomServer() && ServerAssistant.legitUse.get()
                ? ServerAssistant.waitUseTicks.get().intValue() + extra
                : 0;
    }

    private static int getWaitReturnTicks() {
        if (isInstantCustomSwapMode()) {
            return 0;
        }
        int extra = ServerAssistant.getDynamicExtraDelayTicks();
        return isCustomServer() && ServerAssistant.legitUse.get()
                ? ServerAssistant.waitReturnTicks.get().intValue() + extra
                : 0;
    }

    /*

       public void updateSlots() {
        if (mc.player == null || mc.interactionManager == null) return;

        int syncId = mc.player.currentScreenHandler.syncId;

        if (mc.player.currentScreenHandler.getCursorStack().isEmpty()) {
            mc.interactionManager.clickSlot(syncId, 0, 0, SlotActionType.PICKUP, mc.player);
        } else {
        }
    }

     */

    public void updateSlots() {
        if (mc.player == null || mc.interactionManager == null) return;
        syncSelectedSlotNow();
        mc.player.getInventory().markDirty();
        mc.player.currentScreenHandler.sendContentUpdates();
    }

    private static void syncSelectedSlotNow() {
        if (mc.interactionManager instanceof ClientPlayerInteractionManagerAccessor accessor) {
            accessor.nexis$syncSelectedSlot();
        }
    }

    public static void useMainHandItem(boolean swing) {
        if (mc.player == null || mc.interactionManager == null) {
            return;
        }

        ItemStack stack = mc.player.getMainHandStack();
        if (!stack.isEmpty() && mc.player.getItemCooldownManager().isCoolingDown(stack)) {
            float cooldownSeconds = PlayerUtils.getCooldownProgress(stack.getItem());
            NotificationsOverlay.push("Кулдаун предмета: (" + cooldownSeconds + " сек)", 1200, stack, "(" + cooldownSeconds + " сек)");
            return;
        }

        syncSelectedSlotNow();
        PlayerUtils.interactItem(Hand.MAIN_HAND, swing);
        mc.player.currentScreenHandler.sendContentUpdates();
    }

    public static boolean isItemOnCooldown(ItemStack stack) {
        if (mc.player == null || stack == null || stack.isEmpty()) {
            return false;
        }

        if (!mc.player.getItemCooldownManager().isCoolingDown(stack)) {
            return false;
        }

        float cooldownSeconds = PlayerUtils.getCooldownProgress(stack.getItem());
        NotificationsOverlay.push("Кулдаун предмета: (" + cooldownSeconds + " сек)", 1200, stack, "(" + cooldownSeconds + " сек)");
        return true;
    }

    private static void setSelectedSlotSynced(int slot) {
        if (mc.player == null) {
            return;
        }
        if (slot < 0 || slot > 8) {
            return;
        }
        if (mc.player.getInventory().getSelectedSlot() != slot) {
            mc.player.getInventory().setSelectedSlot(slot);
        }
        syncSelectedSlotNow();
    }

    public void setSelectedSlotInstant(int slot) {
        setSelectedSlotSynced(slot);
    }

    public static void sendSelectedSlotPacket(int slot) {
        if (mc.player == null) return;
        if (slot < 0 || slot > 8) return;
        int previousSlot = mc.player.getInventory().getSelectedSlot();
        if (previousSlot != slot) {
            mc.player.getInventory().setSelectedSlot(slot);
            syncSelectedSlotNow();
            mc.player.getInventory().setSelectedSlot(previousSlot);
        } else {
            syncSelectedSlotNow();
        }
    }

    public Slot getSlot(Item item) {
        Slot hotbarSlot = getHotbarSlot(item);
        if (hotbarSlot != null) return hotbarSlot;
        return slots().filter(s -> s.getStack().getItem().equals(item)).findFirst().orElse(null);
    }

    public Slot getHotbarSlot(Item item) {
        return slots()
                .filter(s -> isHotbarSlotId(s.id))
                .filter(s -> s.getStack().getItem().equals(item))
                .findFirst()
                .orElse(null);
    }

    public Slot getInventorySlot(Item item) {
        return slots()
                .filter(s -> s.id >= 9 && s.id <= 44)
                .filter(s -> s.getStack().getItem().equals(item))
                .findFirst()
                .orElse(null);
    }

    public boolean hasItemInInventory(Item item, boolean allowInventory) {
        return (allowInventory ? getInventorySlot(item) : getHotbarSlot(item)) != null;
    }

    public boolean runWithItemInMainHand(Item item, boolean allowInventory, Runnable action) {
        if (mc.player == null || mc.interactionManager == null || action == null) {
            return false;
        }

        Slot slot = allowInventory ? getInventorySlot(item) : getHotbarSlot(item);
        if (slot == null) {
            return false;
        }

        int selectedSlot = mc.player.getInventory().getSelectedSlot();
        boolean sameHotbarSlot = isHotbarSlotId(slot.id) && hotbarIndexFromSlotId(slot.id) == selectedSlot;
        if (sameHotbarSlot) {
            action.run();
            return true;
        }

        if (isHotbarSlotId(slot.id)) {
            int hotbarSlot = hotbarIndexFromSlotId(slot.id);
            setSelectedSlotSynced(hotbarSlot);
            try {
                action.run();
            } finally {
                setSelectedSlotSynced(selectedSlot);
                updateSlots();
            }
            return true;
        }

        clickSlot(slot.id, selectedSlot, SlotActionType.SWAP);
        updateSlots();

        try {
            setSelectedSlotSynced(selectedSlot);
            action.run();
        } finally {
            clickSlot(slot.id, selectedSlot, SlotActionType.SWAP);
            setSelectedSlotSynced(selectedSlot);
            updateSlots();
        }

        return true;
    }

    public Slot getSlot(Item item, Comparator<Slot> comparator, Predicate<Slot> filter) {
        return slots().filter(s -> s.getStack().getItem().equals(item)).filter(filter).max(comparator).orElse(null);
    }

    public Stream<Slot> slots() {
        return mc.player.currentScreenHandler.slots.stream();
    }

    public boolean isServerScreen() {
        if (mc.player == null) return false;
        return mc.player.currentScreenHandler.slots.size() != 46;
    }

    public void closeScreen(boolean packet) {
        mc.player.currentScreenHandler.sendContentUpdates();
        syncSelectedSlotNow();

        if (packet)
            mc.player.networkHandler.sendPacket(new CloseHandledScreenC2SPacket(mc.player.currentScreenHandler.syncId));
        else mc.player.closeHandledScreen();
    }

    public boolean isKey(BindSetting setting) {
        int key = setting.get();
        return mc.currentScreen == null && setting.isVisible() && isKey(getKeyType(key), key);
    }

    public boolean isKey(InputUtil.Type type, int keyCode) {
        if (keyCode == -1) {
            return false;
        }
        if (isWheelCode(keyCode)) {
            return isWheelCodeDown(keyCode);
        }
        if (isMouseButtonCode(keyCode)) {
            return GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), toGlfwMouseButton(keyCode)) == GLFW.GLFW_PRESS;
        }
        switch (type) {
            case InputUtil.Type.KEYSYM:
                return GLFW.glfwGetKey(mc.getWindow().getHandle(), keyCode) == GLFW.GLFW_PRESS;
            case InputUtil.Type.MOUSE:
                return GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), toGlfwMouseButton(keyCode)) == GLFW.GLFW_PRESS;
        }
        return false;
    }

    public InputUtil.Type getKeyType(int key) {
        return isMouseButtonCode(key) ? InputUtil.Type.MOUSE : InputUtil.Type.KEYSYM;
    }

    public boolean isKeyCodeDown(int keyCode) {
        if (keyCode <= 0) {
            return false;
        }
        return isKey(getKeyType(keyCode), keyCode);
    }

    public boolean isMouseButtonCode(int keyCode) {
        int button = toGlfwMouseButton(keyCode);
        return button > GLFW.GLFW_MOUSE_BUTTON_LEFT && button <= GLFW.GLFW_MOUSE_BUTTON_LAST;
    }

    public int toGlfwMouseButton(int keyCode) {
        return keyCode >= 1000 && keyCode < 1000 + GLFW.GLFW_MOUSE_BUTTON_LAST + 1 ? keyCode - 1000 : keyCode;
    }

    public boolean isWheelCode(int keyCode) {
        return keyCode == MOUSE_WHEEL_UP || keyCode == MOUSE_WHEEL_DOWN;
    }

    public int wheelCode(double vertical) {
        return vertical > 0.0 ? MOUSE_WHEEL_UP : MOUSE_WHEEL_DOWN;
    }

    public void recordMouseScroll(double vertical) {
        if (vertical > 0.0) {
            lastWheelUpAt = System.currentTimeMillis();
        } else if (vertical < 0.0) {
            lastWheelDownAt = System.currentTimeMillis();
        }
    }

    public String getBindName(int keyCode) {
        if (keyCode <= 0) {
            return "NONE";
        }
        if (keyCode == MOUSE_WHEEL_UP) {
            return "WHEEL UP";
        }
        if (keyCode == MOUSE_WHEEL_DOWN) {
            return "WHEEL DOWN";
        }
        if (isMouseButtonCode(keyCode)) {
            return switch (toGlfwMouseButton(keyCode)) {
                case GLFW.GLFW_MOUSE_BUTTON_RIGHT -> "RMB";
                case GLFW.GLFW_MOUSE_BUTTON_MIDDLE -> "MMB";
                case GLFW.GLFW_MOUSE_BUTTON_4 -> "M4";
                case GLFW.GLFW_MOUSE_BUTTON_5 -> "M5";
                case GLFW.GLFW_MOUSE_BUTTON_6 -> "M6";
                case GLFW.GLFW_MOUSE_BUTTON_7 -> "M7";
                case GLFW.GLFW_MOUSE_BUTTON_8 -> "M8";
                default -> "M" + (toGlfwMouseButton(keyCode) + 1);
            };
        }
        String name = GLFW.glfwGetKeyName(keyCode, 0);
        if (name != null && !name.isBlank()) {
            return name.toUpperCase();
        }
        return switch (keyCode) {
            case GLFW.GLFW_KEY_RIGHT_SHIFT -> "RSHIFT";
            case GLFW.GLFW_KEY_LEFT_SHIFT -> "LSHIFT";
            case GLFW.GLFW_KEY_LEFT_CONTROL -> "LCTRL";
            case GLFW.GLFW_KEY_RIGHT_CONTROL -> "RCTRL";
            case GLFW.GLFW_KEY_LEFT_ALT -> "LALT";
            case GLFW.GLFW_KEY_RIGHT_ALT -> "RALT";
            case GLFW.GLFW_KEY_LEFT_SUPER -> "LSUPER";
            case GLFW.GLFW_KEY_RIGHT_SUPER -> "RSUPER";
            case GLFW.GLFW_KEY_ESCAPE -> "ESC";
            case GLFW.GLFW_KEY_SPACE -> "SPC";
            case GLFW.GLFW_KEY_ENTER -> "ENTER";
            case GLFW.GLFW_KEY_TAB -> "TAB";
            case GLFW.GLFW_KEY_BACKSPACE -> "BS";
            case GLFW.GLFW_KEY_INSERT -> "INS";
            case GLFW.GLFW_KEY_DELETE -> "DEL";
            case GLFW.GLFW_KEY_HOME -> "HOME";
            case GLFW.GLFW_KEY_END -> "END";
            case GLFW.GLFW_KEY_PAGE_UP -> "PGUP";
            case GLFW.GLFW_KEY_PAGE_DOWN -> "PGDN";
            case GLFW.GLFW_KEY_UP -> "UP";
            case GLFW.GLFW_KEY_DOWN -> "DOWN";
            case GLFW.GLFW_KEY_LEFT -> "LEFT";
            case GLFW.GLFW_KEY_RIGHT -> "RIGHT";
            case GLFW.GLFW_KEY_CAPS_LOCK -> "CAPS";
            case GLFW.GLFW_KEY_SCROLL_LOCK -> "SCRLK";
            case GLFW.GLFW_KEY_NUM_LOCK -> "NUMLK";
            case GLFW.GLFW_KEY_PRINT_SCREEN -> "PRTSC";
            case GLFW.GLFW_KEY_PAUSE -> "PAUSE";
            case GLFW.GLFW_KEY_MENU -> "MENU";
            case GLFW.GLFW_KEY_KP_0 -> "KP_0";
            case GLFW.GLFW_KEY_KP_1 -> "KP_1";
            case GLFW.GLFW_KEY_KP_2 -> "KP_2";
            case GLFW.GLFW_KEY_KP_3 -> "KP_3";
            case GLFW.GLFW_KEY_KP_4 -> "KP_4";
            case GLFW.GLFW_KEY_KP_5 -> "KP_5";
            case GLFW.GLFW_KEY_KP_6 -> "KP_6";
            case GLFW.GLFW_KEY_KP_7 -> "KP_7";
            case GLFW.GLFW_KEY_KP_8 -> "KP_8";
            case GLFW.GLFW_KEY_KP_9 -> "KP_9";
            case GLFW.GLFW_KEY_KP_DECIMAL -> "KP_DEC";
            case GLFW.GLFW_KEY_KP_DIVIDE -> "KP_DIV";
            case GLFW.GLFW_KEY_KP_MULTIPLY -> "KP_MUL";
            case GLFW.GLFW_KEY_KP_SUBTRACT -> "KP_SUB";
            case GLFW.GLFW_KEY_KP_ADD -> "KP_ADD";
            case GLFW.GLFW_KEY_KP_ENTER -> "KP_ENTER";
            case GLFW.GLFW_KEY_KP_EQUAL -> "KP_EQ";
            case GLFW.GLFW_KEY_F1 -> "F1";
            case GLFW.GLFW_KEY_F2 -> "F2";
            case GLFW.GLFW_KEY_F3 -> "F3";
            case GLFW.GLFW_KEY_F4 -> "F4";
            case GLFW.GLFW_KEY_F5 -> "F5";
            case GLFW.GLFW_KEY_F6 -> "F6";
            case GLFW.GLFW_KEY_F7 -> "F7";
            case GLFW.GLFW_KEY_F8 -> "F8";
            case GLFW.GLFW_KEY_F9 -> "F9";
            case GLFW.GLFW_KEY_F10 -> "F10";
            case GLFW.GLFW_KEY_F11 -> "F11";
            case GLFW.GLFW_KEY_F12 -> "F12";
            case GLFW.GLFW_KEY_F13 -> "F13";
            case GLFW.GLFW_KEY_F14 -> "F14";
            case GLFW.GLFW_KEY_F15 -> "F15";
            case GLFW.GLFW_KEY_F16 -> "F16";
            case GLFW.GLFW_KEY_F17 -> "F17";
            case GLFW.GLFW_KEY_F18 -> "F18";
            case GLFW.GLFW_KEY_F19 -> "F19";
            case GLFW.GLFW_KEY_F20 -> "F20";
            case GLFW.GLFW_KEY_F21 -> "F21";
            case GLFW.GLFW_KEY_F22 -> "F22";
            case GLFW.GLFW_KEY_F23 -> "F23";
            case GLFW.GLFW_KEY_F24 -> "F24";
            case GLFW.GLFW_KEY_F25 -> "F25";
            default -> "K" + keyCode;
        };
    }

    private boolean isWheelCodeDown(int keyCode) {
        long now = System.currentTimeMillis();
        if (keyCode == MOUSE_WHEEL_UP) {
            return now - lastWheelUpAt <= WHEEL_PRESS_WINDOW_MS;
        }
        if (keyCode == MOUSE_WHEEL_DOWN) {
            return now - lastWheelDownAt <= WHEEL_PRESS_WINDOW_MS;
        }
        return false;
    }


    public Slot getPotionFromCategory(StatusEffectCategory category) {
        return slots().filter(s -> {
            ItemStack stack = s.getStack();
            PotionContentsComponent component = stack.get(DataComponentTypes.POTION_CONTENTS);
            if (!stack.getItem().equals(Items.SPLASH_POTION) || component == null) return false;
            StatusEffectCategory category2 = category.equals(StatusEffectCategory.BENEFICIAL) ? StatusEffectCategory.HARMFUL : StatusEffectCategory.BENEFICIAL;
            long effects = StreamSupport.stream(component.getEffects().spliterator(), false).filter(e -> e.getEffectType().value().getCategory().equals(category)).count();
            long effects2 = StreamSupport.stream(component.getEffects().spliterator(), false).filter(e -> e.getEffectType().value().getCategory().equals(category2)).count();
            return effects >= effects2;
        }).findFirst().orElse(null);
    }
}
