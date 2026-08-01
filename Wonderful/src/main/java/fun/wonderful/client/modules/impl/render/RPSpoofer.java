package fun.wonderful.client.modules.impl.render;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.utils.bot.BotSessionManager;
import fun.wonderful.client.modules.Module;
import java.util.UUID;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket;

public class RPSpoofer
extends Module {
    public static RPSpoofer INSTANCE = new RPSpoofer();

    public RPSpoofer() {
        super("RPSpoofer", "Убирает ресурс-пак сервера", Module.ModuleCategory.PLAYER);
    }

    @EventLink
    public void onReceivePacket(EventPacket e2) {
        Packet<?> class_25962 = e2.getPacket();
        if (class_25962 instanceof ResourcePackSendS2CPacket) {
            ResourcePackSendS2CPacket packet = (ResourcePackSendS2CPacket)class_25962;
            if (this.isEnable() || BotSessionManager.shouldBypassResourcePacks()) {
                UUID packId = packet.id();
                mc.getNetworkHandler().sendPacket((Packet)new ResourcePackStatusC2SPacket(packId, ResourcePackStatusC2SPacket.Status.ACCEPTED));
                mc.getNetworkHandler().sendPacket((Packet)new ResourcePackStatusC2SPacket(packId, ResourcePackStatusC2SPacket.Status.SUCCESSFULLY_LOADED));
                e2.setCancelled(true);
            }
        }
    }
}