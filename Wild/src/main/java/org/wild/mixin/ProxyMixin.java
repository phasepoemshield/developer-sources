package org.wild.mixin;

import io.netty.channel.Channel;
import io.netty.handler.proxy.ProxyHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.O0000O00O00OOO;

@Mixin(
   targets = {"net/minecraft/network/ClientConnection$1"}
)
public class ProxyMixin {
   @Inject(
      method = {"initChannel(Lio/netty/channel/Channel;)V"},
      at = {@At("HEAD")}
   )
   private void connect(Channel channel, CallbackInfo callbackInfo) {
      try {
         ProxyHandler var3 = O0000O00O00OOO.O00000000000();
         if (var3 != null) {
            channel.pipeline().addFirst("wild_proxy", var3);
         }
      } catch (Throwable var4) {
      }
   }
}
