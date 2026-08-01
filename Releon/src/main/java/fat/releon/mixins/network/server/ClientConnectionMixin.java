package fat.releon.mixins.network.server;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.net.InetSocketAddress;
import l.Helper124;
import l.Helper301;
import l.Helper29;
import l.Helper385;
import l.Helper386;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.NetworkSide;
import net.minecraft.network.handler.PacketSizeLogger;
import net.minecraft.network.listener.PacketListener;
import net.minecraft.network.packet.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClientConnection.class})
public class ClientConnectionMixin {
   public ClientConnectionMixin() {
   }

   @Inject(
      method = {"handlePacket"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static <T extends PacketListener> void handlePacketPre(Packet<T> var0, PacketListener var1, CallbackInfo var2) {
      Helper386 var3 = new Helper386(var0, Helper385.RECEIVE);
      Helper124.method1026(var3);
      if (var3.method581()) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"send(Lnet/minecraft/network/packet/Packet;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendPre(Packet<?> var1, CallbackInfo var2) {
      Helper386 var3 = new Helper386(var1, Helper385.SEND);
      Helper124.method1026(var3);
      if (var3.method581()) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"addHandlers"},
      at = {@At("RETURN")}
   )
   private static void addHandlersHook(ChannelPipeline var0, NetworkSide var1, boolean var2, PacketSizeLogger var3, CallbackInfo var4) {
      Helper29 var5 = Helper301.proxy;
      if (var5 != null && Helper301.proxyEnabled && var1 == NetworkSide.CLIENTBOUND && !var2) {
         var0.addFirst(new ChannelHandler[]{new Socks5ProxyHandler(new InetSocketAddress(var5.method476(), var5.method475()), var5.username, var5.password)});
      }
   }
}
