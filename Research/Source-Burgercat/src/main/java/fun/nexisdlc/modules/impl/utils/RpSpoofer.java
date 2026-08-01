package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket;
import net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket;

@FunctionAdd(name = "RpSpoofer", alias = "Rp Spoofer", category = Category.Utilities, description = "Подтверждает ресурспак без загрузки")
public class RpSpoofer extends Function {
    private boolean pending;
    private boolean accepted;
    private int ticks;

    @EventHandler
    public void onPacket(EventPacket event) {
        if (event.isReceive() && event.getPacket() instanceof ResourcePackSendS2CPacket) {
            pending = true;
            accepted = false;
            ticks = 0;
            event.cancel();
        }
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (!pending || mc.getNetworkHandler() == null || mc.player == null) return;
        ticks++;
        if (!accepted && ticks > 20) {
            mc.getNetworkHandler().sendPacket(new ResourcePackStatusC2SPacket(mc.player.getUuid(), ResourcePackStatusC2SPacket.Status.ACCEPTED));
            accepted = true;
        }
        if (accepted && ticks > 45) {
            mc.getNetworkHandler().sendPacket(new ResourcePackStatusC2SPacket(mc.player.getUuid(), ResourcePackStatusC2SPacket.Status.SUCCESSFULLY_LOADED));
            pending = false;
        }
    }
}
