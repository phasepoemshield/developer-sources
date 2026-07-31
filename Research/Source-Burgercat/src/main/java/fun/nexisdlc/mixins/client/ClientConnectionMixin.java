package fun.nexisdlc.mixins.client;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.EventPacket;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.AcknowledgeChunksC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientConnection.class)
public class ClientConnectionMixin {

    @Inject(method = "handlePacket", at = @At("HEAD"), cancellable = true)
    private static <T extends PacketListener> void handlePacketPre(Packet<T> packet, PacketListener listener, CallbackInfo info) {
        EventPacket eventPacket = new EventPacket(packet, true);
        NexisClient.getEventBus().post(eventPacket);
        if (eventPacket.isCancelled()) {
            info.cancel();
        }
    }

    @Inject(method = "send(Lnet/minecraft/network/packet/Packet;)V", at = @At("HEAD"), cancellable = true)
    public void sendPre(Packet<?> packet, CallbackInfo info) {
        EventPacket eventPacket = new EventPacket(packet, false);
        NexisClient.getEventBus().post(eventPacket);
        if (eventPacket.isCancelled()) {
            info.cancel();
            return;
        }

        if (packet instanceof AcknowledgeChunksC2SPacket) {
            ClientConnection conn = (ClientConnection) (Object) this;
            PacketListener listener = conn.getPacketListener();
            if (!(listener instanceof ClientPlayNetworkHandler)) {
                info.cancel();
            }
        }
    }
}
