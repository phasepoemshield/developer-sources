package fun.wonderful.client.modules.impl.misc;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventBinding;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.api.utils.player.InventoryUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.movement.Sprint;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import net.minecraft.util.Formatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import ru.ocz.protection.annotation.Compile;

public class ElytraSwap
extends Module {
    public static ElytraSwap INSTANCE = new ElytraSwap();
    private final BindSetting elytraBind = new BindSetting("Бинд элитры", -1);
    private final BindSetting fireworkBind = new BindSetting("Бинд фейерверка", -1);
    private final BooleanSetting autofly = new BooleanSetting("Авто-взлёт", true);
    private final BooleanSetting bypassgrim = new BooleanSetting("Обходить Grim", true);
    private final BooleanSetting bypassGround = new BooleanSetting("Обходить Граунд", true);
    private boolean swapElytraQueued;
    private boolean useFirework;
    private int bypassTicks;
    private boolean sprintPaused;
    private int swapCooldown;
    private int fireworkReturnSlot = -1;
    private int fireworkReturnTicks = -1;
    private boolean packetSwapActive;
    private int packetSwapStage;
    private int packetSwapSlot;
    private int lastElytraSlot = -1;

    public ElytraSwap() {
        super("ElytraSwap", "Автоматический свап элитр", Module.ModuleCategory.MISC);
        this.addSettings(this.elytraBind, this.fireworkBind, this.autofly, this.bypassgrim, this.bypassGround);
    }

    @EventLink
    public void onInput(EventMoveInput e2) {
        if (this.bypassgrim.isState() && this.bypassTicks > 0) {
            if (ElytraSwap.mc.player == null) {
                return;
            }
            ElytraSwap.mc.player.setSprinting(false);
            e2.setForward(0.0f);
            e2.setStrafe(0.0f);
            e2.setJump(false);
            e2.setSneak(false);
        }
    }

    @EventLink
    public void onEvent(EventUpdate ignored) {
        if (ElytraSwap.mc.player == null) {
            return;
        }
        if (this.swapCooldown > 0) {
            --this.swapCooldown;
        }
        this.handleFireworkReturn();
        this.handlePacketSwap();
        if (this.bypassTicks > 0) {
            ElytraSwap.mc.player.setSprinting(false);
            --this.bypassTicks;
            if (this.bypassTicks == 1) {
                this.performSwap();
            }
            if (this.bypassTicks == 0) {
                this.restoreSprint();
            }
            return;
        }
        if (this.swapElytraQueued) {
            if (this.swapCooldown > 0) {
                this.swapElytraQueued = false;
                return;
            }
            if (this.bypassgrim.isState()) {
                this.disableSprint();
                this.bypassTicks = 3;
                this.swapCooldown = 1;
            } else {
                this.performSwap();
                this.swapCooldown = 1;
            }
            this.swapElytraQueued = false;
        }
        if (this.useFirework) {
            int slotFirework = InventoryUtils.getItemSlot(Items.FIREWORK_ROCKET);
            if (ElytraSwap.mc.player.isGliding()) {
                if (slotFirework != -1) {
                    if (this.bypassGround.isState()) {
                        this.executePacketFireworkSwap(slotFirework);
                    } else {
                        InventoryUtils.swapAndUseHvH(Items.FIREWORK_ROCKET);
                    }
                } else {
                    ChatUtils.sendMessage(String.valueOf(Formatting.RED) + String.valueOf(Formatting.BOLD) + "Нет Фейерверков!");
                }
            }
            this.useFirework = false;
        }
        if (this.autofly.isState() && this.bypassTicks == 0) {
            ItemStack chestStack = ElytraSwap.mc.player.getEquippedStack(EquipmentSlot.CHEST);
            if (chestStack.isOf(Items.ELYTRA) && !ElytraSwap.mc.player.isTouchingWater() && !ElytraSwap.mc.player.isInLava() && ElytraSwap.mc.player.isOnGround() && !ElytraSwap.mc.options.jumpKey.isPressed()) {
                ElytraSwap.mc.player.jump();
            } else if (chestStack.isOf(Items.ELYTRA) && this.isElytraUsable(chestStack) && !ElytraSwap.mc.player.isGliding() && !ElytraSwap.mc.player.isOnGround()) {
                ElytraSwap.mc.player.startGliding();
                ElytraSwap.mc.player.networkHandler.sendPacket((Packet)new ClientCommandC2SPacket((Entity)ElytraSwap.mc.player, ClientCommandC2SPacket.class_2849.START_FALL_FLYING));
            }
        }
    }

    @Compile
    private native void handlePacketSwap();

    @Compile
    private native void executePacketFireworkSwap(int var1);

    @Compile
    private native void performSwap();

    @Compile
    private native void doSwap(int var1);

    private boolean unequipElytraToStoredSlot() {
        int targetSlot;
        int n2 = targetSlot = this.isStoredElytraSlotFree() ? this.lastElytraSlot : this.findEmptyInventorySlot();
        if (targetSlot == -1) {
            return false;
        }
        if (targetSlot < 9) {
            ElytraSwap.mc.interactionManager.clickSlot(0, 6, targetSlot, SlotActionType.SWAP, (PlayerEntity)ElytraSwap.mc.player);
            this.lastElytraSlot = -1;
            return true;
        }
        int screenSlot = this.inventoryToScreenSlot(targetSlot);
        ElytraSwap.mc.interactionManager.clickSlot(0, 6, 0, SlotActionType.PICKUP, (PlayerEntity)ElytraSwap.mc.player);
        ElytraSwap.mc.interactionManager.clickSlot(0, screenSlot, 0, SlotActionType.PICKUP, (PlayerEntity)ElytraSwap.mc.player);
        this.lastElytraSlot = -1;
        return true;
    }

    private boolean isStoredElytraSlotFree() {
        return this.lastElytraSlot >= 0 && this.lastElytraSlot < 36 && ElytraSwap.mc.player.getInventory().getStack(this.lastElytraSlot).isEmpty();
    }

    private int findEmptyInventorySlot() {
        for (int slot = 0; slot < 36; ++slot) {
            if (!ElytraSwap.mc.player.getInventory().getStack(slot).isEmpty()) continue;
            return slot;
        }
        return -1;
    }

    private int inventoryToScreenSlot(int inventorySlot) {
        return inventorySlot < 9 ? 36 + inventorySlot : inventorySlot;
    }

    private void handleFireworkReturn() {
        if (this.fireworkReturnTicks < 0) {
            return;
        }
        if (this.fireworkReturnTicks > 0) {
            --this.fireworkReturnTicks;
            return;
        }
        if (this.fireworkReturnSlot != -1) {
            this.swapSlotToOffhand(this.fireworkReturnSlot);
            ElytraSwap.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
        }
        this.fireworkReturnSlot = -1;
        this.fireworkReturnTicks = -1;
    }

    private int findScreenSlot(Item item) {
        for (int slot = 9; slot < 45; ++slot) {
            ItemStack stack = ElytraSwap.mc.player.playerScreenHandler.getSlot(slot).getStack();
            if (!stack.isOf(item)) continue;
            return slot;
        }
        return -1;
    }

    private void swapSlotToOffhand(int slot) {
        if (slot >= 36 && slot <= 44) {
            ElytraSwap.mc.interactionManager.clickSlot(0, 45, slot - 36, SlotActionType.SWAP, (PlayerEntity)ElytraSwap.mc.player);
            return;
        }
        ElytraSwap.mc.interactionManager.clickSlot(0, slot, 0, SlotActionType.SWAP, (PlayerEntity)ElytraSwap.mc.player);
        ElytraSwap.mc.interactionManager.clickSlot(0, 45, 0, SlotActionType.SWAP, (PlayerEntity)ElytraSwap.mc.player);
        ElytraSwap.mc.interactionManager.clickSlot(0, slot, 0, SlotActionType.SWAP, (PlayerEntity)ElytraSwap.mc.player);
    }

    private void disableSprint() {
        if (this.sprintPaused) {
            return;
        }
        Sprint.pushPause(1000L);
        this.sprintPaused = true;
    }

    private void restoreSprint() {
        if (!this.sprintPaused) {
            return;
        }
        this.sprintPaused = false;
        Sprint.popPause();
    }

    private boolean isElytraUsable(ItemStack stack) {
        return stack.getDamage() < stack.getMaxDamage() - 1;
    }

    @EventLink
    public void onEvent(EventBinding event) {
        if (event.getKey() == this.elytraBind.getKey()) {
            this.swapElytraQueued = true;
        }
        if (event.getKey() == this.fireworkBind.getKey()) {
            this.useFirework = true;
        }
    }

    @Override
    public void onDisable() {
        this.bypassTicks = 0;
        this.swapCooldown = 0;
        this.fireworkReturnSlot = -1;
        this.fireworkReturnTicks = -1;
        this.packetSwapActive = false;
        this.packetSwapStage = 0;
        this.restoreSprint();
        super.onDisable();
    }

        return string + string2 + "No inventory space!";
    }

        return string + string2 + "Нет нагрудника!";
    }

        return string + string2 + "Нет элитры!";
    }
}