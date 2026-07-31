package fun.nexisdlc.modules.impl.movement;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;

@FunctionAdd(name = "NoSlow", alias = "No Slow", category = Category.Movement, description = "Отключает замедление при использовании предметов")
public class NoSlow extends Function {
    private final ModeSetting mode = new ModeSetting("Режим", "Grim Latest", "HvH", "Grim Latest", "SpookyTime", "FunTime");
    private final BooleanSetting onlyThrowables = new BooleanSetting("Только с арбалетом", true);
    private final BooleanSetting onlyAir = new BooleanSetting("Только в воздухе", true);

    private int useTicks;
    private boolean swappedCrossbow;
    private int crossbowSlotId = -1;

    public NoSlow() {
        addSettings(mode, onlyThrowables, onlyAir);
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) {
            resetCrossbowSwap();
            return;
        }

        if ((mode.is("Grim Latest") || mode.is("SpookyTime")) && !mc.player.isGliding()) {
            useTicks = mc.player.isUsingItem() && !(mode.is("SpookyTime") && isUsingShield())
                    ? useTicks + 1
                    : 0;
        }

        if (mode.is("FunTime")) {
            handleFunTimeCrossbow();
        } else if (swappedCrossbow) {
            restoreCrossbow();
        }
    }

    public boolean shouldCancelSlowdown() {
        if (!isState() || mc.player == null || !mc.player.isUsingItem() || mc.player.isGliding()) {
            return false;
        }

        if (mode.is("SpookyTime") && isUsingShield()) {
            useTicks = 0;
            return false;
        }

        boolean airOnlyBlocked = mode.is("HvH") && onlyAir.get() && mc.player.isOnGround();
        if (airOnlyBlocked) {
            return false;
        }

        boolean airborneOutsideWater = !mc.player.isTouchingWater() && !mc.player.isOnGround();
        boolean throwablesBlocked = mode.is("HvH")
                && onlyThrowables.get()
                && (isHoldingConsumable() || airborneOutsideWater || !(mc.player.getMainHandStack().getItem() instanceof CrossbowItem));

        if (throwablesBlocked) {
            return false;
        }

        mc.player.setSprinting(
                mc.player.getHungerManager().getFoodLevel() > 6
                        && !mc.player.horizontalCollision
                        && mc.player.input.hasForwardMovement()
                        && !mc.player.isSneaking()
        );

        if (mode.is("Grim Latest") || mode.is("SpookyTime")) {
            if (useTicks >= 2) {
                useTicks = 0;
                return true;
            }
            return false;
        }

        return mode.is("HvH") || mode.is("FunTime");
    }

    private boolean isUsingShield() {
        return mc.player != null
                && mc.player.getActiveItem().getItem() == Items.SHIELD;
    }

    private void handleFunTimeCrossbow() {
        if (mc.player == null || mc.interactionManager == null) {
            resetCrossbowSwap();
            return;
        }

        if (mc.player.isUsingItem()) {
            if (!swappedCrossbow) {
                equipCrossbowToOffhand();
            }
        } else if (swappedCrossbow) {
            restoreCrossbow();
        }
    }

    private void equipCrossbowToOffhand() {
        if (mc.player.getOffHandStack().getItem() instanceof CrossbowItem) {
            return;
        }

        Slot crossbowSlot = PlayerInventoryUtil.getSlot(Items.CROSSBOW);
        if (crossbowSlot == null) {
            return;
        }

        crossbowSlotId = crossbowSlot.id;
        PlayerInventoryUtil.clickSlot(crossbowSlot.id, 40, SlotActionType.SWAP);
        PlayerInventoryUtil.updateSlots();
        swappedCrossbow = true;
    }

    private void restoreCrossbow() {
        if (mc.player == null || mc.interactionManager == null) {
            resetCrossbowSwap();
            return;
        }

        if (crossbowSlotId >= 0 && mc.player.getOffHandStack().getItem() instanceof CrossbowItem) {
            PlayerInventoryUtil.clickSlot(crossbowSlotId, 40, SlotActionType.SWAP);
            PlayerInventoryUtil.updateSlots();
        }

        resetCrossbowSwap();
    }

    private void resetCrossbowSwap() {
        swappedCrossbow = false;
        crossbowSlotId = -1;
    }

    private boolean isHoldingConsumable() {
        ItemStack mainHand = mc.player.getMainHandStack();
        ItemStack offHand = mc.player.getOffHandStack();

        return hasConsumableComponent(mainHand) || hasConsumableComponent(offHand);
    }

    private boolean hasConsumableComponent(ItemStack stack) {
        return stack.getComponents().contains(DataComponentTypes.FOOD)
                || stack.getComponents().contains(DataComponentTypes.POTION_CONTENTS);
    }

    @Override
    public void onDisable() {
        if (swappedCrossbow) {
            restoreCrossbow();
        }
        useTicks = 0;
        super.onDisable();
    }
}
