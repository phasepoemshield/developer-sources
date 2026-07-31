package fun.wonderful.client.modules.impl.misc;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventBinding;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.math.TimerUtils;
import fun.wonderful.api.utils.player.InventoryUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;

public class ClickPearl
extends Module {
    public static ClickPearl INSTANCE = new ClickPearl();
    private final BindSetting keyToPearl = new BindSetting("Кнопка", -1);
    private final ModeSetting mode = new ModeSetting("Режим", "Обычный", "Обычный", "Легит");
    private final FloatSetting delay = new FloatSetting("Задержка", 75.0f, 30.0f, 250.0f, 5.0f).visible(() -> this.mode.is("Легит"));
    private final TimerUtils timer = new TimerUtils();
    private boolean use;
    private boolean throwing;
    private int stage;
    private int pearlSlot;
    private int previousSlot;

    public ClickPearl() {
        super("ClickPearl", "Кидает перку по внутреннему бинду", Module.ModuleCategory.MISC);
        this.addSettings(this.keyToPearl, this.mode, this.delay);
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
    public void onEvent(EventBinding event) {
        if (ClickPearl.mc.currentScreen != null) {
            return;
        }
        if (event.getKey() == this.keyToPearl.getKey()) {
            this.use = true;
        }
    }

    @EventLink
    public void onEvent(EventUpdate event) {
        if (ClickPearl.mc.player == null || ClickPearl.mc.world == null) {
            this.reset();
            return;
        }
        if (this.throwing) {
            this.tickLegit();
            return;
        }
        if (!this.use) {
            return;
        }
        this.use = false;
        if (this.mode.is("Легит")) {
            this.startLegit();
        } else {
            this.throwInstant();
        }
    }

    private void throwInstant() {
        if (ClickPearl.mc.player == null || ClickPearl.mc.interactionManager == null || ClickPearl.mc.player.networkHandler == null) {
            return;
        }
        if (ClickPearl.mc.player.getOffHandStack().isOf(Items.ENDER_PEARL)) {
            ClickPearl.mc.interactionManager.interactItem((PlayerEntity)ClickPearl.mc.player, Hand.OFF_HAND);
            return;
        }
        int selectedSlot = ClickPearl.mc.player.getInventory().selectedSlot;
        if (ClickPearl.mc.player.getMainHandStack().isOf(Items.ENDER_PEARL)) {
            ClickPearl.mc.interactionManager.interactItem((PlayerEntity)ClickPearl.mc.player, Hand.MAIN_HAND);
            return;
        }
        int hotbarSlot = InventoryUtils.find(Items.ENDER_PEARL, 0, 8);
        if (hotbarSlot != -1) {
            ClickPearl.mc.player.getInventory().selectedSlot = hotbarSlot;
            ClickPearl.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(hotbarSlot));
            ClickPearl.mc.interactionManager.interactItem((PlayerEntity)ClickPearl.mc.player, Hand.MAIN_HAND);
            ClickPearl.mc.player.getInventory().selectedSlot = selectedSlot;
            ClickPearl.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(selectedSlot));
            return;
        }
        int inventorySlot = InventoryUtils.find(Items.ENDER_PEARL, 9, 35);
        if (inventorySlot == -1) {
            return;
        }
        int swapSlot = 8;
        ClickPearl.mc.interactionManager.clickSlot(0, inventorySlot, swapSlot, SlotActionType.SWAP, (PlayerEntity)ClickPearl.mc.player);
        ClickPearl.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
        ClickPearl.mc.player.getInventory().selectedSlot = swapSlot;
        ClickPearl.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(swapSlot));
        ClickPearl.mc.interactionManager.interactItem((PlayerEntity)ClickPearl.mc.player, Hand.MAIN_HAND);
        ClickPearl.mc.player.getInventory().selectedSlot = selectedSlot;
        ClickPearl.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(selectedSlot));
        ClickPearl.mc.interactionManager.clickSlot(0, inventorySlot, swapSlot, SlotActionType.SWAP, (PlayerEntity)ClickPearl.mc.player);
        ClickPearl.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
    }

    private void startLegit() {
        int slot = this.findHotbarPearl();
        if (slot == -1) {
            return;
        }
        this.previousSlot = ClickPearl.mc.player.getInventory().selectedSlot;
        this.pearlSlot = slot;
        this.stage = 0;
        this.throwing = true;
        this.timer.reset();
    }

    private void tickLegit() {
        if (ClickPearl.mc.currentScreen != null) {
            this.reset();
            return;
        }
        switch (this.stage) {
            case 0: {
                ClickPearl.mc.player.getInventory().selectedSlot = this.pearlSlot;
                this.stage = 1;
                this.timer.reset();
                break;
            }
            case 1: {
                if (!this.timer.finished((long)this.delay.get())) break;
                ClickPearl.mc.interactionManager.interactItem((PlayerEntity)ClickPearl.mc.player, Hand.MAIN_HAND);
                ClickPearl.mc.player.swingHand(Hand.MAIN_HAND);
                this.stage = 2;
                this.timer.reset();
                break;
            }
            default: {
                if (!this.timer.finished((long)this.delay.get())) break;
                ClickPearl.mc.player.getInventory().selectedSlot = this.previousSlot;
                this.reset();
            }
        }
    }

    private int findHotbarPearl() {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (ClickPearl.mc.player.getInventory().getStack(i2).getItem() != Items.ENDER_PEARL) continue;
            return i2;
        }
        return -1;
    }

    private void reset() {
        this.use = false;
        this.throwing = false;
        this.stage = 0;
    }
}