package Nursultan;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import minecraft.class00423;
import minecraft.class00642;
import minecraft.class01601;
import minecraft.class01604;
import minecraft.class01618;
import minecraft.class07529;

public class class09483 extends ChannelInitializer<Channel> {
   public class09483(class01618 var1) {
      this.N = var1;
   }

   protected void initChannel(Channel var1) {
      class00642 var2 = new class00642(class00423.field_11941);
      var2.method_52912(new class01604(this.N.N, var2));
      this.N.L.add(var2);
      ChannelPipeline var3 = var1.pipeline();
      class00642.method_52911(var3, class00423.field_11941);
      if (class07529.NK > 0) {
         var3.addLast("latency", new class01601(class07529.NK, class07529.NV));
      }

      var2.method_53859(var3);
   }
}
