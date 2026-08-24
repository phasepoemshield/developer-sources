package org.zenith.base.bot.net;

import org.zenith.module.Bot;

import org.zenith.base.bot.via.BotVia;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;














import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.proxy.ProxyHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;

class BotConnection_1 extends ChannelInitializer<Channel> {
   public BotConnection this_0;
   public ProxyHandler val_proxyHandler;

   BotConnection_1(BotConnection var1, ProxyHandler var2) {
      super();
      this.this_0 = var1;
      this.val_proxyHandler = var2;
   }

   @Override
   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException channelexception) {
      }

      ChannelPipeline channelpipeline = var1.pipeline();
      channelpipeline.addLast("timeout", new ReadTimeoutHandler(30));
      if (this.val_proxyHandler != null) {
         channelpipeline.addLast("proxy", this.val_proxyHandler);
      }

      BotConnection.addClientHandlers(channelpipeline);
      this.this_0.addFlowControlHandler(channelpipeline);
      if (this.this_0.viaProtocolVersion > 0) {
         BotVia.injectPipeline(var1, this.this_0.viaProtocolVersion);
      }
   }
}
