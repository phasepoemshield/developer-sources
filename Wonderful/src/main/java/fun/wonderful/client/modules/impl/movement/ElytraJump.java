package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventFireworkMotion;
import fun.wonderful.api.events.implement.EventMotion;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.math.TimerUtils;
import fun.wonderful.api.utils.player.InventoryUtils;
import fun.wonderful.api.utils.player.MoveUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.combat.Aura;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Items;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;

public class ElytraJump
extends Module {
    public static final ElytraJump INSTANCE = new ElytraJump();
    private final TimerUtils timer = new TimerUtils();
    private final BooleanSetting autoEquip = new BooleanSetting("AutoEquip", false);
    private boolean wasFlying;
    private boolean jumpPressed;
    private boolean autoEquipped;
    private int grimPauseTicks;
    private SwapAction pendingSwap = SwapAction.NONE;

    public ElytraJump() {
        super("ElytraJump", "Поднимает вверх с авто-взлётом и прыжком", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.autoEquip);
    }

    @EventLink
    public void onMoveInput(EventMoveInput event) {
        if (this.grimPauseTicks <= 0) {
            return;
        }
        event.setForward(0.0f);
        event.setStrafe(0.0f);
        event.setJump(false);
        event.setSneak(false);
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        boolean inFluid;
        if (ElytraJump.mc.player == null || ElytraJump.mc.world == null) {
            return;
        }
        this.handlePendingSwap();
        boolean hasElytra = ElytraJump.mc.player.getEquippedStack(EquipmentSlot.CHEST).isOf(Items.ELYTRA);
        boolean bl = inFluid = ElytraJump.mc.player.isTouchingWater() || ElytraJump.mc.player.isInLava();
        if (this.autoEquip.isState() && !hasElytra && this.pendingSwap == SwapAction.NONE && !ElytraJump.mc.player.isCreative() && !ElytraJump.mc.player.isSpectator()) {
            if (!MoveUtils.isMoving() && InventoryUtils.findBestElytraSlot() != -1) {
                this.startGrimSwap(SwapAction.EQUIP_ELYTRA);
            }
            this.resetFlightState();
            return;
        }
        if (!hasElytra || ElytraJump.mc.player.isCreative() || ElytraJump.mc.player.isSpectator()) {
            this.resetFlightState();
            return;
        }
        if (ElytraJump.mc.player.isOnGround() || inFluid) {
            if (this.wasFlying || this.jumpPressed) {
                this.resetFlightState();
            }
            if (!inFluid && !ElytraJump.mc.options.jumpKey.isPressed() && this.timer.finished(300L)) {
                ElytraJump.mc.player.jump();
                this.timer.reset();
            }
            return;
        }
        if (!ElytraJump.mc.player.isGliding()) {
            ElytraJump.mc.player.networkHandler.sendPacket((Packet)new ClientCommandC2SPacket((Entity)ElytraJump.mc.player, ClientCommandC2SPacket.Mode.START_FALL_FLYING));
        }
        if (ElytraJump.mc.player.isGliding()) {
            this.wasFlying = true;
            if (!MoveUtils.isMoving()) {
                MoveUtils.setMotion(0.0);
            }
            if (!this.jumpPressed) {
                ElytraJump.mc.options.jumpKey.setPressed(true);
                this.jumpPressed = true;
            }
            Vec3d velocity = ElytraJump.mc.player.getVelocity();
            double lift = ThreadLocalRandom.current().nextDouble(0.033, 0.037);
            ElytraJump.mc.player.setVelocity(velocity.x, velocity.y + lift, velocity.z);
        } else if (this.jumpPressed) {
            this.releaseJump();
        }
    }

    @EventLink
    public void onMotion(EventMotion event) {
        if (ElytraJump.mc.player == null || !ElytraJump.mc.player.isGliding()) {
            return;
        }
        Aura aura = Aura.INSTANCE;
        if (aura == null || !aura.isEnable() || aura.getTarget() == null) {
            return;
        }
        Vec2f rotations = aura.getTargetRotations();
        if (rotations == null) {
            return;
        }
        float yaw = rotations.x;
        event.setYaw(yaw);
        event.setPitch(0.0f);
        ElytraJump.mc.player.setYaw(yaw);
        ElytraJump.mc.player.setPitch(0.0f);
        ElytraJump.mc.player.headYaw = yaw;
        ElytraJump.mc.player.bodyYaw = yaw;
    }

    @EventLink
    public void onFireworkMotion(EventFireworkMotion event) {
        if (ElytraJump.mc.player == null || event.getEntity() != ElytraJump.mc.player || !ElytraJump.mc.player.isGliding()) {
            return;
        }
        event.setVector3d(event.getVector3d().multiply(0.06));
        event.cancel();
    }

    @Override
    public void onEnable() {
        this.wasFlying = false;
        this.jumpPressed = false;
        this.autoEquipped = false;
        this.grimPauseTicks = 0;
        this.pendingSwap = SwapAction.NONE;
        this.timer.reset();
        super.onEnable();
    }

    @Override
    public void onDisable() {
        this.resetFlightState();
        if (this.autoEquip.isState() && this.autoEquipped && ElytraJump.mc.player != null && ElytraJump.mc.player.getEquippedStack(EquipmentSlot.CHEST).isOf(Items.ELYTRA)) {
            this.releaseMovementKeys();
            this.performChestplateSwap();
        }
        this.autoEquipped = false;
        this.grimPauseTicks = 0;
        this.pendingSwap = SwapAction.NONE;
        super.onDisable();
    }

    private void handlePendingSwap() {
        if (this.pendingSwap == SwapAction.NONE || ElytraJump.mc.player == null) {
            return;
        }
        ElytraJump.mc.player.setSprinting(false);
        if (this.grimPauseTicks > 1) {
            --this.grimPauseTicks;
            return;
        }
        SwapAction action = this.pendingSwap;
        this.pendingSwap = SwapAction.NONE;
        this.grimPauseTicks = 0;
        if (action == SwapAction.EQUIP_ELYTRA) {
            this.performElytraSwap();
        } else if (action == SwapAction.RESTORE_CHESTPLATE) {
            this.performChestplateSwap();
        }
    }

    private void startGrimSwap(SwapAction action) {
        if (this.pendingSwap != SwapAction.NONE || ElytraJump.mc.player == null) {
            return;
        }
        this.pendingSwap = action;
        this.grimPauseTicks = 3;
        this.releaseMovementKeys();
    }

    private void releaseMovementKeys() {
        ElytraJump.mc.options.forwardKey.setPressed(false);
        ElytraJump.mc.options.backKey.setPressed(false);
        ElytraJump.mc.options.leftKey.setPressed(false);
        ElytraJump.mc.options.rightKey.setPressed(false);
        ElytraJump.mc.options.jumpKey.setPressed(false);
        ElytraJump.mc.options.sprintKey.setPressed(false);
        ElytraJump.mc.player.setSprinting(false);
    }

    private void performElytraSwap() {
        int elytraSlot = InventoryUtils.findBestElytraSlot();
        if (elytraSlot == -1 || ElytraJump.mc.interactionManager == null || ElytraJump.mc.player == null) {
            return;
        }
        this.doChestSlotSwap(elytraSlot);
        this.autoEquipped = true;
        this.timer.reset();
        ElytraJump.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
    }

    private void performChestplateSwap() {
        int chestplateSlot = InventoryUtils.findBestChestplateSlot();
        if (chestplateSlot == -1 || ElytraJump.mc.interactionManager == null || ElytraJump.mc.player == null) {
            return;
        }
        this.doChestSlotSwap(chestplateSlot);
        ElytraJump.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
    }

    private void doChestSlotSwap(int inventorySlot) {
        if (inventorySlot < 9) {
            ElytraJump.mc.interactionManager.clickSlot(0, 6, inventorySlot, SlotActionType.SWAP, (PlayerEntity)ElytraJump.mc.player);
            return;
        }
        ElytraJump.mc.interactionManager.clickSlot(0, inventorySlot, 0, SlotActionType.PICKUP, (PlayerEntity)ElytraJump.mc.player);
        ElytraJump.mc.interactionManager.clickSlot(0, 6, 0, SlotActionType.PICKUP, (PlayerEntity)ElytraJump.mc.player);
        ElytraJump.mc.interactionManager.clickSlot(0, inventorySlot, 0, SlotActionType.PICKUP, (PlayerEntity)ElytraJump.mc.player);
    }

    private void resetFlightState() {
        this.releaseJump();
        this.wasFlying = false;
        this.timer.reset();
    }

    private void releaseJump() {
        if (this.jumpPressed) {
            ElytraJump.mc.options.jumpKey.setPressed(false);
            this.jumpPressed = false;
        }
    }

    private static enum SwapAction {
        NONE,
        EQUIP_ELYTRA,
        RESTORE_CHESTPLATE;

    }
}