package Nursultan;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.timeout.ReadTimeoutHandler;
import minecraft.class00423;
import minecraft.class00642;
import minecraft.class01025;
import minecraft.class01589;
import minecraft.class01602;
import minecraft.class01618;

public class class09480 extends ChannelInitializer<Channel> {
   public class09480(class01618 var1) {
      this.N = var1;
   }

   protected void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var5) {
      }

      ChannelPipeline var2 = var1.pipeline().addLast("timeout", new ReadTimeoutHandler(30));
      if (this.N.N.A()) {
         var2.addLast("legacy_query", new class01602(this.N.u()));
      }

      class00642.method_48311(var2, class00423.field_11941, false, null);
      int var3 = this.N.N.U();
      Object var4 = var3 > 0 ? new class01025(var3) : new class00642(class00423.field_11941);
      this.N.L.add(var4);
      var4.method_53859(var2);
      var4.method_52912(new class01589(this.N.N, (class00642)var4));
   }
}
