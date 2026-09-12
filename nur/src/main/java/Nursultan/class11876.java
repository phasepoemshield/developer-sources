package Nursultan;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntFunction;

public class class11876 {
   public static Object N_0;
   public static Object N_1;
   public Object y_0;
   public Object y_1;

   public AtomicReference<EventLoopGroup> L() {
      return (AtomicReference<EventLoopGroup>)this.y_1;
   }

   public class11876(IntFunction<EventLoopGroup> var1) {
      this.W();
      this.y_1 = new AtomicReference();
      this.y_0 = var1;
   }

   public class11876() {
      this(var0 -> new NioEventLoopGroup(var0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build()));
   }

   static {
      z();
   }

   public EventLoopGroup i() {
      return (EventLoopGroup)((AtomicReference)this.y_1).get();
   }

   private static void z() {
      N_0 = 150L;
      N_1 = 2000L;
   }

   public EventLoopGroup u() {
      EventLoopGroup var1 = (EventLoopGroup)((IntFunction)this.y_0).apply(0);
      if (!((AtomicReference)this.y_1).compareAndSet(null, var1)) {
         var1.shutdownGracefully(0L, 0L, TimeUnit.MILLISECONDS);
         throw new IllegalStateException("EventLoopGroup already started");
      } else {
         return var1;
      }
   }

   public boolean y() {
      EventLoopGroup var1 = (EventLoopGroup)((AtomicReference)this.y_1).get();
      return var1 != null && !var1.isShuttingDown() && !var1.isShutdown();
   }

   public CompletableFuture<Void> N() {
      return this.N(150L, 2000L);
   }

   public CompletableFuture<Void> N(long var1, long var3) {
      EventLoopGroup var5 = (EventLoopGroup)((AtomicReference)this.y_1).getAndSet(null);
      CompletableFuture var6 = new CompletableFuture();
      if (var5 != null && !var5.isShuttingDown() && !var5.isShutdown()) {
         var5.shutdownGracefully(var1, var3, TimeUnit.MILLISECONDS).addListener(var1x -> {
            if (var1x.isSuccess()) {
               var6.complete(null);
            } else {
               var6.completeExceptionally(var1x.cause());
            }
         });
         return var6;
      } else {
         var6.complete(null);
         return var6;
      }
   }

   private void W() {
   }

   public IntFunction<EventLoopGroup> R() {
      return (IntFunction<EventLoopGroup>)this.y_0;
   }
}
