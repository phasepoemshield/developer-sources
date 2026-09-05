/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10859
 *  com.google.common.collect.Sets
 *  com.google.common.net.HostAndPort
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.logging.LogUtils
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.handler.logging.LogLevel
 *  io.netty.handler.logging.LoggingHandler
 *  io.netty.handler.ssl.SslContext
 *  minecraft.class00448
 *  minecraft.class07393
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10859;
import com.google.common.collect.Sets;
import com.google.common.net.HostAndPort;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.ssl.SslContext;
import java.net.InetSocketAddress;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class00448;
import minecraft.class07393;
import minecraft.class07932;
import minecraft.class07934;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07911 {
    private static final Logger y = LogUtils.getLogger();
    private final HostAndPort L;
    public final class00448 N;
    private @Nullable Channel u;
    private final NioEventLoopGroup i;
    private final Set<class07934> R = Sets.newIdentityHashSet();

    public class07911(HostAndPort hostAndPort, class00448 class004482) {
        this.L = hostAndPort;
        this.N = class004482;
        this.i = new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Management server IO #%d").setDaemon(true).build());
    }

    public class07911(HostAndPort hostAndPort, class00448 class004482, NioEventLoopGroup nioEventLoopGroup) {
        this.L = hostAndPort;
        this.N = class004482;
        this.i = nioEventLoopGroup;
    }

    public int y() {
        return this.u != null ? ((InetSocketAddress)this.u.localAddress()).getPort() : this.L.getPort();
    }

    private void y(class07393 class073932, @Nullable SslContext sslContext) {
        class07932 class079322 = new class07932();
        ChannelFuture channelFuture = ((ServerBootstrap)((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().handler((ChannelHandler)new LoggingHandler(LogLevel.DEBUG))).channel(NioServerSocketChannel.class)).childHandler((ChannelHandler)new class10859(this, sslContext, class073932, class079322)).group((EventLoopGroup)this.i).localAddress(this.L.getHost(), this.L.getPort())).bind();
        this.u = channelFuture.channel();
        channelFuture.syncUninterruptibly();
        y.info("Json-RPC Management connection listening on {}:{}", (Object)this.L.getHost(), (Object)this.y());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void y(class07934 class079342) {
        Set<class07934> var2 = this.R;
        synchronized (var2) {
            this.R.remove((Object)class079342);
        }
    }

    public void N() {
        this.N(class07934::N);
    }

    public void N(boolean bl) throws InterruptedException {
        if (this.u != null) {
            this.u.close().sync();
            this.u = null;
        }
        this.R.clear();
        if (bl) {
            this.i.shutdownGracefully().sync();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void N(Consumer<class07934> consumer) {
        Set<class07934> var2 = this.R;
        synchronized (var2) {
            this.R.forEach(consumer);
        }
    }

    public void N(class07393 class073932) {
        this.y(class073932, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(class07934 class079342) {
        Set<class07934> var2 = this.R;
        synchronized (var2) {
            this.R.add(class079342);
        }
    }

    public void N(class07393 class073932, SslContext sslContext) {
        this.y(class073932, sslContext);
    }
}

