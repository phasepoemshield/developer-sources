/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  minecraft.class06541
 */
package ru.fiw.proxyserver;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import minecraft.class06541;
import ru.fiw.proxyserver.Proxy;
import ru.fiw.proxyserver.TestPing$1;

public class TestPing {
    private static final EventLoopGroup GROUP = new NioEventLoopGroup();
    public volatile String state = "";

    public void run(String string, int n, Proxy proxy) {
        Executors.newSingleThreadExecutor().submit(() -> this.lambda$run$0(proxy, string, n));
    }

    private void lambda$run$0(Proxy proxy, String string, int n) {
        try {
            this.state = String.valueOf(class06541.field_1054) + "Connecting...";
            String[] stringArray = proxy.ipPort.split(":");
            InetSocketAddress inetSocketAddress = new InetSocketAddress(stringArray[0], Integer.parseInt(stringArray[1]));
            ((Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(GROUP)).channel(NioSocketChannel.class)).option(ChannelOption.CONNECT_TIMEOUT_MILLIS, (Object)5000)).handler((ChannelHandler)new TestPing$1(this, proxy, inetSocketAddress))).connect(string, n).sync();
        }
        catch (Exception exception) {
            this.state = String.valueOf(class06541.field_1061) + "Error: " + exception.getMessage();
        }
    }
}

