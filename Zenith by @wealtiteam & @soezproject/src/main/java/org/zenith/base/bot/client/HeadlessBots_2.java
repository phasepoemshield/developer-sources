package org.zenith.base.bot.client;

import org.zenith.module.Bot;

import org.zenith.core.BotFeatureRegistry;














import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.proxy.ProxyHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;

class HeadlessBots_2 extends ChannelInitializer<Channel> {
   public final ProxyHandler val_proxyHandler;
   HeadlessBots_2(ProxyHandler var1) {
      this.val_proxyHandler = var1;
   }

   @Override
   protected void initChannel(Channel var1) {
      var1.pipeline().addLast("timeout", new ReadTimeoutHandler((int)Math.ceil(5.0)));
      var1.pipeline().addLast("proxy", this.val_proxyHandler);
   }
}
