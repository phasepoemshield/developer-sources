package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.movement.Sprint;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.client.network.ClientPlayerEntity;

public class AutoEat
extends Module {
    public static final AutoEat INSTANCE = new AutoEat();
    private static final String BARITONE_API_CLASS = "baritone.api.BaritoneAPI";
    private final FloatSetting hungerBars = new FloatSetting("Плашки голода", 6.0f, 1.0f, 10.0f, 1.0f);
    private boolean eating;
    private boolean sprintPaused;
    private boolean swappedFromInventory;
    private int originalSlot = -1;
    private int swappedInventorySlot = -1;

    public AutoEat() {
        super("AutoEat", "Автоматически ест при низком голоде", Module.ModuleCategory.PLAYER);
        this.addSettings(this.hungerBars);
    }

    public static boolean shouldSuppressCombat() {
        return INSTANCE != null && INSTANCE.isEnable() && AutoEat.INSTANCE.eating;
    }

    @Override
    public void onDisable() {
        this.stopEating();
        super.onDisable();
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (AutoEat.mc.player == null || AutoEat.mc.world == null || AutoEat.mc.interactionManager == null) {
            this.stopEating();
            return;
        }
        if (AutoEat.mc.currentScreen != null) {
            this.stopEating();
            return;
        }
        if (AutoEat.mc.player.getAbilities().creativeMode || AutoEat.mc.player.isSpectator()) {
            this.stopEating();
            return;
        }
        if (!this.eating) {
            if (!this.shouldStartEating()) {
                return;
            }
            this.eating = true;
            this.originalSlot = AutoEat.mc.player.getInventory().selectedSlot;
        }
        this.tickEating();
    }

    private void tickEating() {
        ClientPlayerEntity player = AutoEat.mc.player;
        if (player == null) {
            this.stopEating();
            return;
        }
        this.pauseBaritone();
        if (!this.sprintPaused) {
            Sprint.pushPause(0L);
            this.sprintPaused = true;
        }
        AutoEat.mc.options.attackKey.setPressed(false);
        if (!this.needsFood()) {
            if (!player.isUsingItem()) {
                this.stopEating();
            }
            return;
        }
        if (!this.ensureFoodReady()) {
            this.stopEating();
            return;
        }
        Hand eatingHand = this.getEatingHand(player);
        if (eatingHand == null) {
            this.stopEating();
            return;
        }
        AutoEat.mc.options.useKey.setPressed(true);
        if (!player.isUsingItem() || player.getActiveHand() != eatingHand) {
            AutoEat.mc.interactionManager.interactItem((PlayerEntity)player, eatingHand);
        }
    }

    private boolean shouldStartEating() {
        return this.needsFood() && !AutoEat.mc.player.isUsingItem() && (this.isValidFood(AutoEat.mc.player.getOffHandStack()) || this.findFoodSlot() != -1);
    }

    private boolean needsFood() {
        return AutoEat.mc.player != null && AutoEat.mc.player.getHungerManager().getFoodLevel() < 20 && AutoEat.mc.player.getHungerManager().getFoodLevel() <= this.getFoodThreshold();
    }

    private int getFoodThreshold() {
        return Math.round(this.hungerBars.get()) * 2;
    }

    private boolean ensureFoodReady() {
        ClientPlayerEntity player = AutoEat.mc.player;
        if (player == null) {
            return false;
        }
        if (this.isValidFood(player.getOffHandStack())) {
            return true;
        }
        if (this.isValidFood(player.getMainHandStack())) {
            return true;
        }
        int foodSlot = this.findFoodSlot();
        if (foodSlot == -1) {
            return false;
        }
        if (foodSlot < 9) {
            this.swappedFromInventory = false;
            this.swappedInventorySlot = -1;
            this.selectHotbarSlot(foodSlot);
            return this.isValidFood(player.getMainHandStack());
        }
        this.selectHotbarSlot(this.originalSlot == -1 ? player.getInventory().selectedSlot : this.originalSlot);
        this.swapInventorySlotWithHotbar(foodSlot, player.getInventory().selectedSlot);
        this.swappedFromInventory = true;
        this.swappedInventorySlot = foodSlot;
        return this.isValidFood(player.getMainHandStack());
    }

    private Hand getEatingHand(ClientPlayerEntity player) {
        if (player == null) {
            return null;
        }
        if (this.isValidFood(player.getOffHandStack())) {
            return Hand.OFF_HAND;
        }
        if (this.isValidFood(player.getMainHandStack())) {
            return Hand.MAIN_HAND;
        }
        return null;
    }

    private int findFoodSlot() {
        int slot;
        ClientPlayerEntity player = AutoEat.mc.player;
        if (player == null) {
            return -1;
        }
        int selected = player.getInventory().selectedSlot;
        if (this.isValidFood(player.getInventory().getStack(selected))) {
            return selected;
        }
        for (slot = 0; slot < 9; ++slot) {
            if (slot == selected || !this.isValidFood(player.getInventory().getStack(slot))) continue;
            return slot;
        }
        for (slot = 9; slot < 36; ++slot) {
            if (!this.isValidFood(player.getInventory().getStack(slot))) continue;
            return slot;
        }
        return -1;
    }

    private boolean isValidFood(ItemStack stack) {
        if (stack == null || stack.isEmpty()) {
            return false;
        }
        if (stack.isOf(Items.GOLDEN_APPLE) || stack.isOf(Items.ENCHANTED_GOLDEN_APPLE) || stack.isOf(Items.CHORUS_FRUIT)) {
            return false;
        }
        return stack.getUseAction() == UseAction.EAT;
    }

    private void selectHotbarSlot(int slot) {
        if (AutoEat.mc.player == null || slot < 0 || slot > 8 || AutoEat.mc.player.getInventory().selectedSlot == slot) {
            return;
        }
        AutoEat.mc.player.getInventory().selectedSlot = slot;
        if (mc.getNetworkHandler() != null) {
            mc.getNetworkHandler().sendPacket((Packet)new UpdateSelectedSlotC2SPacket(slot));
        }
    }

    private void swapInventorySlotWithHotbar(int inventorySlot, int hotbarSlot) {
        if (AutoEat.mc.player == null || AutoEat.mc.interactionManager == null || inventorySlot < 9 || inventorySlot > 35 || hotbarSlot < 0 || hotbarSlot > 8) {
            return;
        }
        AutoEat.mc.interactionManager.clickSlot(0, inventorySlot, hotbarSlot, SlotActionType.SWAP, (PlayerEntity)AutoEat.mc.player);
        if (mc.getNetworkHandler() != null) {
            mc.getNetworkHandler().sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
        }
    }

    private void stopEating() {
        if (AutoEat.mc.options != null) {
            AutoEat.mc.options.useKey.setPressed(false);
        }
        if (this.sprintPaused) {
            Sprint.popPause();
            this.sprintPaused = false;
        }
        this.restoreHeldItem();
        this.eating = false;
    }

    private void restoreHeldItem() {
        if (AutoEat.mc.player == null || AutoEat.mc.interactionManager == null) {
            this.resetSwapState();
            return;
        }
        if (this.swappedFromInventory && this.swappedInventorySlot != -1) {
            int hotbarSlot = this.originalSlot == -1 ? AutoEat.mc.player.getInventory().selectedSlot : this.originalSlot;
            this.selectHotbarSlot(hotbarSlot);
            this.swapInventorySlotWithHotbar(this.swappedInventorySlot, hotbarSlot);
        }
        if (this.originalSlot != -1) {
            this.selectHotbarSlot(this.originalSlot);
        }
        this.resetSwapState();
    }

    private void resetSwapState() {
        this.swappedFromInventory = false;
        this.swappedInventorySlot = -1;
        this.originalSlot = -1;
    }

    private void pauseBaritone() {
        try {
            Object baritone = AutoEat.getPrimaryBaritone();
            if (baritone == null) {
                this.cancelVanillaBreaking();
                return;
            }
            Object pathing = AutoEat.invoke(baritone, "getPathingBehavior");
            if (pathing == null || !Boolean.TRUE.equals(AutoEat.invoke(pathing, "hasPath"))) {
                this.cancelVanillaBreaking();
                return;
            }
            Object input = AutoEat.invoke(baritone, "getInputOverrideHandler");
            if (input != null) {
                input.getClass().getMethod("clearAllKeys", new Class[0]).invoke(input, new Object[0]);
                Object blockBreakHelper = input.getClass().getMethod("getBlockBreakHelper", new Class[0]).invoke(input, new Object[0]);
                if (blockBreakHelper != null) {
                    blockBreakHelper.getClass().getMethod("stopBreakingBlock", new Class[0]).invoke(blockBreakHelper, new Object[0]);
                }
            }
            pathing.getClass().getMethod("requestPause", new Class[0]).invoke(pathing, new Object[0]);
            this.cancelVanillaBreaking();
        }
        catch (Throwable ignored) {
            this.cancelVanillaBreaking();
        }
    }

    private void cancelVanillaBreaking() {
        try {
            if (AutoEat.mc.interactionManager != null) {
                AutoEat.mc.interactionManager.cancelBlockBreaking();
            }
        }
        catch (Throwable throwable) {
            
        }
    }

    private static Object getPrimaryBaritone() throws ReflectiveOperationException {
        Class<?> apiClass = Class.forName(BARITONE_API_CLASS);
        Object provider = apiClass.getMethod("getProvider", new Class[0]).invoke(null, new Object[0]);
        return provider == null ? null : provider.getClass().getMethod("getPrimaryBaritone", new Class[0]).invoke(provider, new Object[0]);
    }

    private static Object invoke(Object target, String methodName) throws ReflectiveOperationException {
        return target.getClass().getMethod(methodName, new Class[0]).invoke(target, new Object[0]);
    }
}