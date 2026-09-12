package Nursultan;

import io.netty.channel.Channel;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.ssl.SslHandler;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11842 {
   public static Object N_0 = LogManager.getLogger(String.class);

   static {
      N();
      u();
   }

   private static void u() {
      N_0 = null;
   }

   public boolean N(ChannelPipeline var1, Channel var2, class11436 var3) {
      try {
         SSLEngine var4 = class11881.N().newEngine(var2.alloc(), var3.M(), var3.y());
         SSLParameters var5 = var4.getSSLParameters();
         var5.setEndpointIdentificationAlgorithm("HTTPS");
         var4.setSSLParameters(var5);
         var4.setUseClientMode(true);
         SslHandler var6 = new SslHandler(var4);
         var1.addFirst("ssl", var6);
         var6.handshakeFuture().addListener(var0 -> {
            if (!var0.isSuccess()) {
               ((Logger)N_0).error("SSL handshake FAILED", var0.cause());
            }
         });
         return true;
      } catch (Exception var7) {
         ((Logger)N_0).error("Failed to initialize SSL context", var7);
         return false;
      }
   }

   private static void N() {
   }
}
