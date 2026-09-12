package Nursultan;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicBoolean;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11331 {
   public static Object N_0 = LogManager.getLogger(String.class);
   public Object y_0;
   public Object y_1;
   public Object y_2;

   public void L() {
      if (((AtomicBoolean)this.y_0).get()) {
         ((Logger)N_0).warn("AutoBuy client already connected");
      } else {
         Thread var1 = new Thread(
            () -> {
               this.y_1 = new NioEventLoopGroup();

               try {
                  int var1x = B();
                  URI var2 = new URI("ws://127.0.0.1:" + var1x + "/autobuy");
                  Bootstrap var3 = new Bootstrap();
                  ((Bootstrap)((Bootstrap)((Bootstrap)var3.group((EventLoopGroup)this.y_1)).channel(NioSocketChannel.class))
                        .option(ChannelOption.TCP_NODELAY, true))
                     .handler(new class09230(this, var2));
                  this.y_2 = var3.connect(var2.getHost(), var2.getPort()).sync().channel();
                  ((Channel)this.y_2).closeFuture().sync();
               } catch (Exception var7) {
                  class11303.y(class11921.N("auto-buy-error", var7.getMessage()));
                  ((Logger)N_0).error("AutoBuy error during start: {}", var7.getMessage(), var7);
               } finally {
                  ((AtomicBoolean)this.y_0).set(false);
                  if ((EventLoopGroup)this.y_1 != null) {
                     ((EventLoopGroup)this.y_1).shutdownGracefully();
                  }
               }
            },
            "AutoBuy-WebSocket-Client"
         );
         var1.setDaemon(true);
         var1.start();
      }
   }

   public class11331() {
      this.E();
      this.y_0 = new AtomicBoolean(false);
   }

   static {
      U();
   }

   private static int B() throws Exception {
      Path var1 = ((File)class06202.Nq().l_1).toPath().resolve("port.tmp");
      if (!Files.exists(var1)) {
         throw new IllegalStateException(class12020.N("auto-buy-port-file-empty"));
      } else {
         String var2 = Files.readString(var1).trim();
         if (var2.isBlank()) {
            throw new IllegalStateException(class12020.N("auto-buy-port-file-empty"));
         } else {
            return Integer.parseInt(var2);
         }
      }
   }

   private static void U() {
      N_0 = null;
   }

   public void u() {
      if (!((AtomicBoolean)this.y_0).get()) {
         ((Logger)N_0).warn("AutoBuy client is not connected - stop has been skipped");
      } else {
         try {
            if ((Channel)this.y_2 != null && ((Channel)this.y_2).isOpen()) {
               ((Channel)this.y_2).close();
            }

            if ((EventLoopGroup)this.y_1 != null) {
               ((EventLoopGroup)this.y_1).shutdownGracefully();
            }
         } catch (Exception var5) {
            class11303.y(class11921.N("auto-buy-error", var5.getMessage()));
            ((Logger)N_0).error("AutoBuy error during stop: {}", var5.getMessage(), var5);
         } finally {
            ((AtomicBoolean)this.y_0).set(false);
         }
      }
   }

   public boolean y() {
      return !((AtomicBoolean)this.y_0).get() || (Channel)this.y_2 == null || !((Channel)this.y_2).isOpen() || !((Channel)this.y_2).isActive();
   }

   private void E() {
   }

   public AtomicBoolean N() {
      return (AtomicBoolean)this.y_0;
   }

   public void N(String var1) {
      if (this.y()) {
         class11303.y(class11921.N("auto-buy-error", "Not connected to server, and trying to send packet"));
         ((Logger)N_0).error("Not connected to server, and trying to send packet: {}", var1);
      } else {
         Channel var2 = (Channel)this.y_2;
         if (var2 != null && var2.isActive()) {
            var2.writeAndFlush(new TextWebSocketFrame(var1));
         } else {
            class11303.y(class11921.N("auto-buy-error", "Channel is not active, and trying to send packet"));
            ((Logger)N_0).error("Channel is not active, and trying to send packet: {}", var1);
         }
      }
   }
}
