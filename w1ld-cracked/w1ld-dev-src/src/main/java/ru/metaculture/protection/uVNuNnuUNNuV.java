package ru.metaculture.protection;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class uVNuNnuUNNuV {
   private final Queue<String> UuUVuuUu = new ConcurrentLinkedQueue<>();
   volatile uVvUnNnVN C00OOC00oO = uVvUnNnVN.OFFLINE;
   volatile Channel uUnuvNvvNU;
   volatile boolean vVvUvVVuuNvV = true;
   volatile String uNNnnnuuuN = "";
   private EventLoopGroup nuUnNvnuUu;
   private UNvUnNVUUuv VVuuUN;
   unuUNUU vNUvnnVnUvu;
   long uVUuuVnNVU = 1000L;

   public void UuUVuuUu(UNvUnNVUUuv var1, unuUNUU var2) {
      this.UuUVuuUu();
      this.VVuuUN = var1;
      this.vNUvnnVnUvu = var2;
      this.vVvUvVVuuNvV = false;
      this.uVUuuVnNVU = 1000L;
      this.uNNnnnuuuN = "";
      this.nuUnNvnuUu = new NioEventLoopGroup(1, vuuuNvNuv());
      this.vNUvnnVnUvu();
   }

   public void UuUVuuUu() {
      this.vVvUvVVuuNvV = true;
      this.C00OOC00oO = uVvUnNnVN.OFFLINE;
      Channel var1 = this.uUnuvNvvNU;
      this.uUnuvNvvNU = null;
      if (var1 != null) {
         var1.close();
      }

      if (this.nuUnNvnuUu != null) {
         this.nuUnNvnuUu.shutdownGracefully(0L, 200L, TimeUnit.MILLISECONDS);
         this.nuUnNvnuUu = null;
      }

      this.UuUVuuUu.clear();
   }

   public boolean UuUVuuUu(String var1) {
      Channel var2 = this.uUnuvNvvNU;
      if (var2 != null && var2.isActive()) {
         var2.writeAndFlush(vnNUnunnuvn.UuUVuuUu(var2.alloc().buffer(), var1));
         return true;
      } else {
         return false;
      }
   }

   public String C00OOC00oO() {
      return this.UuUVuuUu.poll();
   }

   public uVvUnNnVN uUnuvNvvNU() {
      return this.C00OOC00oO;
   }

   public boolean vVvUvVVuuNvV() {
      return this.C00OOC00oO == uVvUnNnVN.ONLINE;
   }

   public String uNNnnnuuuN() {
      return this.uNNnnnuuuN;
   }

   public UNvUnNVUUuv nuUnNvnuUu() {
      return this.VVuuUN;
   }

   public unuUNUU VVuuUN() {
      return this.vNUvnnVnUvu;
   }

   private void vNUvnnVnUvu() {
      if (!this.vVvUvVVuuNvV && this.nuUnNvnuUu != null) {
         this.C00OOC00oO = uVvUnNnVN.CONNECTING;
         ((Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(this.nuUnNvnuUu)).channel(NioSocketChannel.class))
                     .option(ChannelOption.TCP_NODELAY, true))
                  .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 8000))
               .handler(new ChannelInitializer<SocketChannel>() {
                  protected void UuUVuuUu(SocketChannel var1) {
                     var1.pipeline().addLast(new ChannelHandler[]{new vnNUnunnuvn()}).addLast(new ChannelHandler[]{uVNuNnuUNNuV.this.new NVnVnNnN()});
                  }
               }))
            .connect(this.VVuuUN.C00OOC00oO(), this.VVuuUN.uUnuvNvvNU())
            .addListener(var1 -> {
               if (!var1.isSuccess()) {
                  this.uNNnnnuuuN = UuUVuuUu(var1.cause());
                  this.uVUuuVnNVU();
               }
            });
      }
   }

   void uVUuuVnNVU() {
      if (!this.vVvUvVVuuNvV && this.nuUnNvnuUu != null) {
         this.C00OOC00oO = uVvUnNnVN.RETRYING;
         long var1 = this.uVUuuVnNVU;
         this.uVUuuVnNVU = Math.min(30000L, this.uVUuuVnNVU * 2L);
         this.nuUnNvnuUu.schedule(this::vNUvnnVnUvu, var1, TimeUnit.MILLISECONDS);
      } else {
         this.C00OOC00oO = uVvUnNnVN.OFFLINE;
      }
   }

   void C00OOC00oO(String var1) {
      while (this.UuUVuuUu.size() >= 512) {
         this.UuUVuuUu.poll();
      }

      this.UuUVuuUu.add(var1);
   }

   static String UuUVuuUu(Throwable var0) {
      if (var0 == null) {
         return "";
      } else {
         String var1 = var0.getMessage();
         return var1 != null && !var1.isBlank() ? var1 : var0.getClass().getSimpleName();
      }
   }

   private static ThreadFactory vuuuNvNuv() {
      return var0 -> {
         Thread var1 = new Thread(var0, "Wild-Net");
         var1.setDaemon(true);
         return var1;
      };
   }

   final class NVnVnNnN extends SimpleChannelInboundHandler<String> {
      public void channelActive(ChannelHandlerContext var1) {
         uVNuNnuUNNuV.this.uUnuvNvvNU = var1.channel();
         uVNuNnuUNNuV.this.C00OOC00oO = uVvUnNnVN.ONLINE;
         uVNuNnuUNNuV.this.uVUuuVnNVU = 1000L;
         uVNuNnuUNNuV.this.uNNnnnuuuN = "";
         var1.writeAndFlush(vnNUnunnuvn.UuUVuuUu(var1.alloc().buffer(), vuVNUUvUuuun.UuUVuuUu(uVNuNnuUNNuV.this.vNUvnnVnUvu)));
      }

      protected void UuUVuuUu(ChannelHandlerContext var1, String var2) {
         uVNuNnuUNNuV.this.C00OOC00oO(var2);
      }

      public void channelInactive(ChannelHandlerContext var1) {
         uVNuNnuUNNuV.this.uUnuvNvvNU = null;
         if (uVNuNnuUNNuV.this.vVvUvVVuuNvV) {
            uVNuNnuUNNuV.this.C00OOC00oO = uVvUnNnVN.OFFLINE;
         } else {
            uVNuNnuUNNuV.this.uVUuuVnNVU();
         }
      }

      public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
         uVNuNnuUNNuV.this.uNNnnnuuuN = uVNuNnuUNNuV.UuUVuuUu(var2);
         var1.close();
      }
   }
}
