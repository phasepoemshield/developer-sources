package Nursultan;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicBoolean;
import minecraft.class05021;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11275 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;
   public static Object y_0 = LogManager.getLogger(String.class);

   public boolean L() {
      return this.N() && !((ChannelGroup)this.N_0).isEmpty();
   }

   public class11275() {
      this.E();
      this.N_0 = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
      this.N_1 = new AtomicBoolean(false);
   }

   static {
      U();
   }

   public void i() {
      if (!((AtomicBoolean)this.N_1).compareAndSet(true, false)) {
         ((Logger)y_0).warn("AutoBuy server is not running - stop has been skipped");
      } else {
         ((Logger)y_0).info("AutoBuy server stopped");

         try {
            if ((Channel)this.N_5 != null && ((Channel)this.N_5).isOpen()) {
               ((Channel)this.N_5).close();
            }

            if ((EventLoopGroup)this.N_3 != null) {
               ((EventLoopGroup)this.N_3).shutdownGracefully();
            }

            if ((EventLoopGroup)this.N_4 != null) {
               ((EventLoopGroup)this.N_4).shutdownGracefully();
            }
         } catch (Exception var2) {
            class11303.y(class11921.N("auto-buy-error", var2.getMessage()));
            ((Logger)y_0).error("AutoBuy server error during stop: {}", var2.getMessage(), var2);
         }
      }
   }

   private static void U() {
      y_0 = null;
   }

   public void u() {
      if (!((AtomicBoolean)this.N_1).compareAndSet(false, true)) {
         ((Logger)y_0).warn("AutoBuy server is already running - start has been skipped");
      } else {
         Thread var1 = new Thread(
            () -> {
               this.N_3 = new NioEventLoopGroup(1);
               this.N_4 = new NioEventLoopGroup();

               try {
                  ServerBootstrap var1x = new ServerBootstrap();
                  ((ServerBootstrap)((ServerBootstrap)var1x.group((EventLoopGroup)this.N_3, (EventLoopGroup)this.N_4).channel(NioServerSocketChannel.class))
                        .option(ChannelOption.SO_BACKLOG, 16))
                     .childOption(ChannelOption.SO_KEEPALIVE, true)
                     .childHandler(new class11161(this));
                  ChannelFuture var2 = var1x.bind("127.0.0.1", (Integer)this.N_2).sync();
                  this.N_5 = var2.channel();
                  class11303.y(class11921.N("auto-buy-server-started", (Integer)this.N_2));
                  ((Logger)y_0).info("AutoBuy server started on port: {}", (Integer)this.N_2);
                  ((Channel)this.N_5).closeFuture().sync();
               } catch (InterruptedException var7) {
                  ((Logger)y_0).error("AutoBuy server interrupted: {}", var7.getMessage(), var7);
               } catch (Exception var8) {
                  class11303.y(class11921.N("auto-buy-server-error", var8.getMessage()));
                  ((Logger)y_0).error("AutoBuy server error during start: {}", var8.getMessage(), var8);
               } finally {
                  ((AtomicBoolean)this.N_1).set(false);
                  if ((EventLoopGroup)this.N_3 != null) {
                     ((EventLoopGroup)this.N_3).shutdownGracefully();
                  }

                  if ((EventLoopGroup)this.N_4 != null) {
                     ((EventLoopGroup)this.N_4).shutdownGracefully();
                  }
               }
            },
            "AutoBuy-WebSocket-Server"
         );
         var1.setDaemon(true);
         var1.start();
      }
   }

   public void y() {
      if (this.N()) {
         ((Logger)y_0).warn("AutoBuy server is already running on port {}", (Integer)this.N_2);
      } else {
         try {
            this.N_2 = class05021.N();
            N((Integer)this.N_2);
         } catch (IOException var1) {
            class11303.y(var1.getMessage());
            return;
         }

         this.u();
      }
   }

   private void E() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_2 = 0;
      }
   }

   public void N(Channel var1, String var2) {
      if (var1 != null && var1.isActive()) {
         var1.writeAndFlush(new TextWebSocketFrame(var2));
      }
   }

   private static void N(int var0) throws IOException {
      try {
         File var1 = (File)class06202.Nq().l_1;
         Path var2 = var1.toPath().resolve("port.tmp");
         if (!Files.exists(var2)) {
            Files.createFile(var2);
         }

         Path var3 = var2.getParent();
         if (var3 != null && !Files.exists(var3)) {
            Files.createDirectories(var3);
         }

         Files.writeString(var2, Integer.toString(var0), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
      } catch (IOException var4) {
         ((Logger)y_0).error("Failed to write port to file: {}", var4.getMessage(), var4);
         throw new IOException(class12020.N("auto-buy-error").formatted(var4.getMessage()));
      }
   }

   public void N(String var1) {
      ((ChannelGroup)this.N_0).forEach(var2 -> this.N(var2, var1));
   }

   public boolean N() {
      return ((AtomicBoolean)this.N_1).get() && (Channel)this.N_5 != null && ((Channel)this.N_5).isOpen() && ((Channel)this.N_5).isActive();
   }
}
