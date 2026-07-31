package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.RotationStorage;
import fun.wonderful.api.utils.rotate.Rotation;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.TridentItem;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;

public class Spider
extends Module {
    public static Spider INSTANCE = new Spider();
    private final ModeSetting mode = new ModeSetting("Мод", "Вода", "Вода", "СпукиТайм");
    private final BooleanSetting legit = new BooleanSetting("Легит", false);
    private int lastSlot = -1;
    private boolean isClimbing = false;
    private int swapBackSlot = -1;
    private int spookyTicks;
    private int chargeSlot = -1;
    private boolean charging;

    public Spider() {
        super("Spider", "Позволяет взбираться по стенам", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.mode, this.legit);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        if (Spider.mc.player == null) {
            return;
        }
        if (this.lastSlot != -1 && this.legit.isState()) {
            Spider.mc.player.getInventory().selectedSlot = this.lastSlot;
        }
        this.lastSlot = -1;
        this.swapBackSlot = -1;
        this.isClimbing = false;
        this.spookyTicks = 0;
        this.chargeSlot = -1;
        this.charging = false;
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (Spider.mc.player == null || Spider.mc.world == null) {
            return;
        }
        if (!Spider.mc.player.horizontalCollision) {
            this.stopClimbing();
            return;
        }
        this.isClimbing = true;
        RotationStorage.update(new Rotation(Spider.mc.player.getYaw(), 0.0f), 360.0f, 360.0f, 360.0f, 360.0f, 1, 1, false);
        if (this.mode.is("СпукиТайм")) {
            this.processSpookyTime();
            return;
        }
        int bucketSlot = this.getBucketSlot(false);
        if (bucketSlot == -1) {
            return;
        }
        this.useBucket(bucketSlot, this.legit.isState());
        Spider.mc.player.setVelocity(Spider.mc.player.getVelocity().x, 0.36, Spider.mc.player.getVelocity().z);
    }

    private void stopClimbing() {
        if (this.lastSlot != -1 && this.legit.isState()) {
            Spider.mc.player.getInventory().selectedSlot = this.lastSlot;
            this.lastSlot = -1;
        }
        if (this.swapBackSlot != -1) {
            Spider.mc.interactionManager.clickSlot(0, this.swapBackSlot, 0, SlotActionType.QUICK_MOVE, (PlayerEntity)Spider.mc.player);
            this.swapBackSlot = -1;
        }
        this.isClimbing = false;
        this.spookyTicks = 0;
        this.chargeSlot = -1;
        this.charging = false;
    }

    private void processSpookyTime() {
        int bucketSlot = this.getBucketSlot(true);
        boolean bucketPulse = this.spookyTicks % 5 == 0;
        boolean boostPulse = this.spookyTicks % 4 != 3;
        this.keepChargeHeld();
        if (bucketSlot != -1 && bucketPulse) {
            this.useBucket(bucketSlot, false);
            this.keepChargeHeld();
        }
        double y2 = boostPulse ? 0.18 : 0.03;
        Spider.mc.player.setVelocity(Spider.mc.player.getVelocity().x, y2, Spider.mc.player.getVelocity().z);
        ++this.spookyTicks;
    }

    private void useBucket(int bucketSlot, boolean legitMode) {
        boolean isInventorySwap;
        if (!legitMode) {
            boolean isInventorySwap2;
            int currentSlot = Spider.mc.player.getInventory().selectedSlot;
            boolean bl = isInventorySwap2 = bucketSlot >= 9 && bucketSlot <= 35;
            if (isInventorySwap2) {
                Spider.mc.interactionManager.clickSlot(0, bucketSlot, currentSlot, SlotActionType.SWAP, (PlayerEntity)Spider.mc.player);
                Spider.mc.interactionManager.interactItem((PlayerEntity)Spider.mc.player, Hand.MAIN_HAND);
                Spider.mc.interactionManager.clickSlot(0, bucketSlot, currentSlot, SlotActionType.SWAP, (PlayerEntity)Spider.mc.player);
            } else {
                Spider.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(bucketSlot));
                Spider.mc.interactionManager.interactItem((PlayerEntity)Spider.mc.player, Hand.MAIN_HAND);
                Spider.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(currentSlot));
            }
            return;
        }
        boolean bl = isInventorySwap = bucketSlot >= 9 && bucketSlot <= 35;
        if (isInventorySwap) {
            Spider.mc.interactionManager.clickSlot(0, bucketSlot, Spider.mc.player.getInventory().selectedSlot, SlotActionType.SWAP, (PlayerEntity)Spider.mc.player);
            this.swapBackSlot = bucketSlot;
        } else if (Spider.mc.player.getInventory().selectedSlot != bucketSlot) {
            if (this.lastSlot == -1) {
                this.lastSlot = Spider.mc.player.getInventory().selectedSlot;
            }
            Spider.mc.player.getInventory().selectedSlot = bucketSlot;
        }
        Spider.mc.interactionManager.interactItem((PlayerEntity)Spider.mc.player, Hand.MAIN_HAND);
    }

    private void keepChargeHeld() {
        if (this.isChargeItem(Spider.mc.player.getOffHandStack())) {
            if (!this.charging || this.spookyTicks % 12 == 0) {
                this.sendChargeUsePacket(Hand.OFF_HAND);
            }
            this.charging = true;
            return;
        }
        if (this.chargeSlot == -1 || !this.isChargeItem(Spider.mc.player.getInventory().getStack(this.chargeSlot))) {
            this.chargeSlot = this.getChargeHotbarSlot();
            this.charging = false;
        }
        if (this.chargeSlot == -1) {
            return;
        }
        if (Spider.mc.player.getInventory().selectedSlot != this.chargeSlot) {
            Spider.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(this.chargeSlot));
            Spider.mc.player.getInventory().selectedSlot = this.chargeSlot;
            this.charging = false;
        }
        if (!this.charging || this.spookyTicks % 12 == 0) {
            this.sendChargeUsePacket(Hand.MAIN_HAND);
        }
        this.charging = true;
    }

    private void sendChargeUsePacket(Hand hand) {
        Spider.mc.player.networkHandler.sendPacket((Packet)new PlayerInteractItemC2SPacket(hand, 0, Spider.mc.player.getYaw(), Spider.mc.player.getPitch()));
    }

    private int getBucketSlot(boolean allowLava) {
        ItemStack stack;
        int i2;
        for (i2 = 0; i2 < 9; ++i2) {
            stack = Spider.mc.player.getInventory().getStack(i2);
            if (!this.isBucket(stack, allowLava)) continue;
            return i2;
        }
        if (!this.legit.isState() || this.mode.is("СпукиТайм")) {
            for (i2 = 9; i2 < 36; ++i2) {
                stack = Spider.mc.player.getInventory().getStack(i2);
                if (!this.isBucket(stack, allowLava)) continue;
                return i2;
            }
        }
        return -1;
    }

    private int getChargeHotbarSlot() {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (!this.isChargeItem(Spider.mc.player.getInventory().getStack(i2))) continue;
            return i2;
        }
        return -1;
    }

    private boolean isBucket(ItemStack stack, boolean allowLava) {
        return stack.getItem() == Items.WATER_BUCKET || allowLava && stack.getItem() == Items.LAVA_BUCKET;
    }

    private boolean isChargeItem(ItemStack stack) {
        return stack.getItem() instanceof BowItem || stack.getItem() instanceof TridentItem;
    }
}