package sg.mx;

import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.PacketCallbacks;
import net.minecraft.network.packet.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.event.PacketDirection;
import ru.destra.event.PacketEvent;

@Mixin(value = ClientConnection.class)
public abstract class NetworkManagerMixin {
   @Shadow
   public abstract boolean isOpen();

    @Inject(method = "channelRead0", at = @At("HEAD"), cancellable = true)
   public void receive(ChannelHandlerContext var1, Packet<?> var2, CallbackInfo var3) {
      if (this.isOpen()) {
         PacketEvent var4 = new PacketEvent(var2, PacketDirection.Receive);
         DestraClient.getInstance().getEventBus().post(var4);
          if (ru.destra.misc.ModuleHelper.isEnabled(var4)) {
            var3.cancel();
         }
      }
   }

    @Inject(method = "send(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;Z)V", at = @At("HEAD"), cancellable = true)
    public void send(Packet<?> var1, PacketCallbacks var2, boolean var3, CallbackInfo var4) {
       if (this.isOpen()) {
          PacketEvent var5 = new PacketEvent(var1, PacketDirection.Send);
          DestraClient.getInstance().getEventBus().post(var5);
          if (ru.destra.misc.ModuleHelper.isEnabled(var5)) {
             var4.cancel();
          }
       }
    }
}
