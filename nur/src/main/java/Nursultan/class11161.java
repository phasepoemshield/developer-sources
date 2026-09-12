package Nursultan;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;

public class class11161 extends ChannelInitializer<Channel> {
   private static String[] R;
   public Object N_0;

   private static void L() {
      R = new String[1];
      R[0] = "/autobuy";
   }

   public class11161(class11275 var1) {
      this.y();
      this.N_0 = var1;
   }

   static {
      L();
   }

   private void y() {
   }

   public void initChannel(Channel var1) {
      ChannelPipeline var2 = var1.pipeline();
      var2.addLast(new ChannelHandler[]{new HttpServerCodec()});
      var2.addLast(new ChannelHandler[]{new HttpObjectAggregator(65536)});
      var2.addLast(new ChannelHandler[]{new WebSocketServerProtocolHandler(R[0], null, true)});
      var2.addLast(new ChannelHandler[]{new class11219((ChannelGroup)((class11275)this.N_0).N_0)});
   }
}
