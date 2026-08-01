package fun.wonderful.mixin;

import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.utils.network.NetworkUtils;
import io.netty.channel.ChannelHandlerContext;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.packet.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ClientConnection.class})
public abstract class ClientConnectionMixin {
    @Inject(method={"channelRead0"}, at={@At(value="HEAD")}, cancellable=true)
    public void channelRead0(ChannelHandlerContext channelHandlerContext, Packet<?> packet, CallbackInfo ci) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        EventPacket eventReceive = new EventPacket(packet, EventPacket.Type.RECEIVE);
        EventInvoker.invoke(eventReceive);
        if (eventReceive.isCancelled()) {
            ci.cancel();
        }
    }

    @Inject(method={"send"}, at={@At(value="HEAD")}, cancellable=true)
    public void send(Packet<?> packet, CallbackInfo ci) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        if (NetworkUtils.getSilentPackets().contains(packet)) {
            NetworkUtils.getSilentPackets().remove(packet);
            return;
        }
        EventPacket eventSend = new EventPacket(packet, EventPacket.Type.SEND);
        EventInvoker.invoke(eventSend);
        if (eventSend.isCancelled()) {
            ci.cancel();
        }
    }
}