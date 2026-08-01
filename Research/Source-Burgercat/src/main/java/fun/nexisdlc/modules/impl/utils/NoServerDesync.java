package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.mixins.accessors.ClientPlayerInteractionManagerAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;

@FunctionAdd(
        name = "NoServerDesync",
        alias = "No Server Desync",
        category = Category.Utilities,
        description = "Синхронизирует слоты клиента с сервером"
)
public class NoServerDesync extends Function {
    private long lastSyncMs = 0L;

    @EventHandler
    public void onPacket(EventPacket event) {
        if (!event.isReceive()) return;
        if (event.getPacket() instanceof InventoryS2CPacket
                || event.getPacket() instanceof ScreenHandlerSlotUpdateS2CPacket) {
            event.uncancel();
        }
    }

    @EventHandler
    public void onTick(UpdateEvent event) {
        if (nullCheck()) return;
        if (mc.interactionManager == null || mc.player == null) return;

        long now = System.currentTimeMillis();
        if (now - lastSyncMs < 400L) return;
        lastSyncMs = now;

        ((ClientPlayerInteractionManagerAccessor) mc.interactionManager).nexis$syncSelectedSlot();

    }
}
