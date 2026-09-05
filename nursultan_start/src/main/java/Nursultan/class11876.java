/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 */
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
        return (AtomicReference)this.y_1;
    }

    public class11876(IntFunction<EventLoopGroup> intFunction) {
        this.W();
        this.y_1 = new AtomicReference();
        this.y_0 = intFunction;
    }

    public class11876() {
        this(n -> new NioEventLoopGroup(n, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build()));
    }

    static {
        class11876.z();
    }

    public EventLoopGroup i() {
        return (EventLoopGroup)((AtomicReference)this.y_1).get();
    }

    private static void z() {
        N_0 = 150L;
        N_1 = 2000L;
    }

    public EventLoopGroup u() {
        EventLoopGroup eventLoopGroup = (EventLoopGroup)((IntFunction)this.y_0).apply(0);
        if (!((AtomicReference)this.y_1).compareAndSet(null, eventLoopGroup)) {
            eventLoopGroup.shutdownGracefully(0L, 0L, TimeUnit.MILLISECONDS);
            throw new IllegalStateException("EventLoopGroup already started");
        }
        return eventLoopGroup;
    }

    public boolean y() {
        EventLoopGroup eventLoopGroup = (EventLoopGroup)((AtomicReference)this.y_1).get();
        return eventLoopGroup != null && !eventLoopGroup.isShuttingDown() && !eventLoopGroup.isShutdown();
    }

    public CompletableFuture<Void> N() {
        return this.N(150L, 2000L);
    }

    public CompletableFuture<Void> N(long l, long l2) {
        EventLoopGroup eventLoopGroup = ((AtomicReference)this.y_1).getAndSet(null);
        CompletableFuture<Void> completableFuture = new CompletableFuture<Void>();
        if (eventLoopGroup == null || eventLoopGroup.isShuttingDown() || eventLoopGroup.isShutdown()) {
            completableFuture.complete(null);
            return completableFuture;
        }
        eventLoopGroup.shutdownGracefully(l, l2, TimeUnit.MILLISECONDS).addListener(future -> {
            if (future.isSuccess()) {
                completableFuture.complete(null);
            } else {
                completableFuture.completeExceptionally(future.cause());
            }
        });
        return completableFuture;
    }

    private void W() {
    }

    public IntFunction<EventLoopGroup> R() {
        return (IntFunction)this.y_0;
    }
}

