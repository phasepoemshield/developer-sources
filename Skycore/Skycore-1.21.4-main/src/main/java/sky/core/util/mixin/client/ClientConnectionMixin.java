package sky.core.util.mixin.client;

import com.darkmagician6.eventapi.EventManager;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.packet.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sky.core.events.EventPacket;

@Mixin(ClientConnection.class)
public class ClientConnectionMixin {
    @Inject(method = "send(Lnet/minecraft/network/packet/Packet;)V", at = @At("HEAD"), cancellable = true)
    private void skycore$onSendPacket(Packet<?> packet, CallbackInfo ci) {
        EventPacket event = new EventPacket(packet, EventPacket.PacketType.SEND);
        EventManager.call(event);
        if (event.isCancel()) {
            ci.cancel();
        }
    }

    @Inject(method = "channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;)V", at = @At("HEAD"), cancellable = true)
    private void skycore$onReceivePacket(ChannelHandlerContext context, Packet<?> packet, CallbackInfo ci) {
        EventPacket event = new EventPacket(packet, EventPacket.PacketType.RECEIVE);
        EventManager.call(event);
        if (event.isCancel()) {
            ci.cancel();
        }
    }
}
