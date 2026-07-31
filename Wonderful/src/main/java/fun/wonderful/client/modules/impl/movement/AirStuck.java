package fun.wonderful.client.modules.impl.movement;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventMove;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.utils.network.NetworkUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

public class AirStuck
extends Module {
    public static AirStuck INSTANCE = new AirStuck();
    private final ModeSetting mode = new ModeSetting("Мод", "Обычный", "Обычный", "LonyGrief");
    private final BooleanSetting cancelPackets = new BooleanSetting("Отменять пакеты", true);
    private final BooleanSetting swapElytra = new BooleanSetting("Свапать элитру", true);
    private Vec3d freezePosition = Vec3d.ZERO;
    private boolean frozen = false;

    public AirStuck() {
        super("AirStuck", "Зависает в воздухе", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.mode, this.cancelPackets, this.swapElytra);
    }

    @Override
    public void onEnable() {
        this.frozen = false;
        if (AirStuck.mc.player != null && this.swapElytra.isState()) {
            this.swapChestEquipment();
        }
        if (AirStuck.mc.player != null && this.mode.is("Обычный")) {
            this.freezePosition = AirStuck.mc.player.getPos();
            this.frozen = true;
        }
        super.onEnable();
    }

    @Override
    public void onDisable() {
        this.frozen = false;
        super.onDisable();
    }

    private void swapChestEquipment() {
    }


    private void doSwap(int slot) {
        if (slot >= 0 && slot < 9) {
            AirStuck.mc.interactionManager.clickSlot(0, 6, slot, SlotActionType.SWAP, (PlayerEntity)AirStuck.mc.player);
        } else {
            AirStuck.mc.interactionManager.clickSlot(0, slot, 0, SlotActionType.SWAP, (PlayerEntity)AirStuck.mc.player);
            AirStuck.mc.interactionManager.clickSlot(0, 6, 0, SlotActionType.SWAP, (PlayerEntity)AirStuck.mc.player);
            AirStuck.mc.interactionManager.clickSlot(0, slot, 0, SlotActionType.SWAP, (PlayerEntity)AirStuck.mc.player);
        }
        AirStuck.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(0));
    }

    @EventLink
    public void onMove(EventMove var1) {
    }

    @EventLink
    public void onPacket(EventPacket e2) {
        if (!this.isEnable() || !this.frozen || e2.getType() != EventPacket.Type.SEND) {
            return;
        }
        Packet<?> class_25962 = e2.getPacket();
        if (class_25962 instanceof PlayerMoveC2SPacket) {
            PlayerMoveC2SPacket packet = (PlayerMoveC2SPacket)class_25962;
            if (this.cancelPackets.isState()) {
                e2.cancel();
            } else {
                e2.cancel();
                NetworkUtils.sendSilentPacket(this.createFrozenPacket(packet));
            }
        }
    }

    private PlayerMoveC2SPacket createFrozenPacket(PlayerMoveC2SPacket packet) {
        boolean onGround = packet.isOnGround();
        boolean horizontalCollision = packet.horizontalCollision();
        if (packet.changesPosition() && packet.changesLook()) {
            return new PlayerMoveC2SPacket.Full(this.freezePosition.x, this.freezePosition.y, this.freezePosition.z, packet.getYaw(AirStuck.mc.player.getYaw()), packet.getPitch(AirStuck.mc.player.getPitch()), onGround, horizontalCollision);
        }
        if (packet.changesPosition()) {
            return new PlayerMoveC2SPacket.PositionAndOnGround(this.freezePosition.x, this.freezePosition.y, this.freezePosition.z, onGround, horizontalCollision);
        }
        if (packet.changesLook()) {
            return new PlayerMoveC2SPacket.LookAndOnGround(packet.getYaw(AirStuck.mc.player.getYaw()), packet.getPitch(AirStuck.mc.player.getPitch()), onGround, horizontalCollision);
        }
        return new PlayerMoveC2SPacket.OnGroundOnly(onGround, horizontalCollision);
    }
}