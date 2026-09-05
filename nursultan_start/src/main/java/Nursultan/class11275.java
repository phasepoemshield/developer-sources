/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11303
 *  Nursultan.class11921
 *  Nursultan.class12020
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.group.ChannelGroup
 *  io.netty.channel.group.DefaultChannelGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.handler.codec.http.websocketx.TextWebSocketFrame
 *  io.netty.util.concurrent.EventExecutor
 *  io.netty.util.concurrent.GlobalEventExecutor
 *  minecraft.class05021
 *  minecraft.class06202
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11161;
import Nursultan.class11303;
import Nursultan.class11921;
import Nursultan.class12020;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.GlobalEventExecutor;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
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
    public static Object y_0;

    public boolean L() {
        return this.N() && !((ChannelGroup)this.N_0).isEmpty();
    }

    public class11275() {
        this.E();
        this.N_0 = new DefaultChannelGroup((EventExecutor)GlobalEventExecutor.INSTANCE);
        this.N_1 = new AtomicBoolean(false);
    }

    static {
        class11275.U();
        y_0 = LogManager.getLogger(String.class);
    }

    public void i() {
        if (!((AtomicBoolean)this.N_1).compareAndSet(true, false)) {
            ((Logger)y_0).warn("AutoBuy server is not running - stop has been skipped");
            return;
        }
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
        }
        catch (Exception exception) {
            class11303.y((Object)class11921.N((String)"auto-buy-error", (Object[])new Object[]{exception.getMessage()}));
            ((Logger)y_0).error("AutoBuy server error during stop: {}", (Object)exception.getMessage(), (Object)exception);
        }
    }

    private static void U() {
        y_0 = null;
    }

    public void u() {
        if (!((AtomicBoolean)this.N_1).compareAndSet(false, true)) {
            ((Logger)y_0).warn("AutoBuy server is already running - start has been skipped");
            return;
        }
        Thread thread = new Thread(() -> {
            this.N_3 = new NioEventLoopGroup(1);
            this.N_4 = new NioEventLoopGroup();
            try {
                ServerBootstrap serverBootstrap = new ServerBootstrap();
                ((ServerBootstrap)((ServerBootstrap)serverBootstrap.group((EventLoopGroup)this.N_3, (EventLoopGroup)this.N_4).channel(NioServerSocketChannel.class)).option(ChannelOption.SO_BACKLOG, (Object)16)).childOption(ChannelOption.SO_KEEPALIVE, (Object)true).childHandler((ChannelHandler)new class11161(this));
                ChannelFuture channelFuture = serverBootstrap.bind("127.0.0.1", ((Integer)this.N_2).intValue()).sync();
                this.N_5 = channelFuture.channel();
                class11303.y((Object)class11921.N((String)"auto-buy-server-started", (Object[])new Object[]{(int)((Integer)this.N_2)}));
                ((Logger)y_0).info("AutoBuy server started on port: {}", (Object)((Integer)this.N_2));
                ((Channel)this.N_5).closeFuture().sync();
            }
            catch (InterruptedException interruptedException) {
                ((Logger)y_0).error("AutoBuy server interrupted: {}", (Object)interruptedException.getMessage(), (Object)interruptedException);
            }
            catch (Exception exception) {
                class11303.y((Object)class11921.N((String)"auto-buy-server-error", (Object[])new Object[]{exception.getMessage()}));
                ((Logger)y_0).error("AutoBuy server error during start: {}", (Object)exception.getMessage(), (Object)exception);
            }
            finally {
                ((AtomicBoolean)this.N_1).set(false);
                if ((EventLoopGroup)this.N_3 != null) {
                    ((EventLoopGroup)this.N_3).shutdownGracefully();
                }
                if ((EventLoopGroup)this.N_4 != null) {
                    ((EventLoopGroup)this.N_4).shutdownGracefully();
                }
            }
        }, "AutoBuy-WebSocket-Server");
        thread.setDaemon(true);
        thread.start();
    }

    public void y() {
        if (this.N()) {
            ((Logger)y_0).warn("AutoBuy server is already running on port {}", (Object)((Integer)this.N_2));
            return;
        }
        try {
            this.N_2 = class05021.N();
            class11275.N((Integer)this.N_2);
        }
        catch (IOException iOException) {
            class11303.y((Object)iOException.getMessage());
            return;
        }
        this.u();
    }

    private void E() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0;
        }
    }

    public void N(Channel channel, String string) {
        if (channel != null && channel.isActive()) {
            channel.writeAndFlush((Object)new TextWebSocketFrame(string));
        }
    }

    private static void N(int n) throws IOException {
        try {
            Path path;
            File file = (File)class06202.Nq().l_1;
            Path path2 = file.toPath().resolve("port.tmp");
            if (!Files.exists(path2, new LinkOption[0])) {
                Files.createFile(path2, new FileAttribute[0]);
            }
            if ((path = path2.getParent()) != null && !Files.exists(path, new LinkOption[0])) {
                Files.createDirectories(path, new FileAttribute[0]);
            }
            Files.writeString(path2, (CharSequence)Integer.toString(n), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
        }
        catch (IOException iOException) {
            ((Logger)y_0).error("Failed to write port to file: {}", (Object)iOException.getMessage(), (Object)iOException);
            throw new IOException(class12020.N((String)"auto-buy-error").formatted(new Object[]{iOException.getMessage()}));
        }
    }

    public void N(String string) {
        ((ChannelGroup)this.N_0).forEach(channel -> this.N((Channel)channel, string));
    }

    public boolean N() {
        return ((AtomicBoolean)this.N_1).get() && (Channel)this.N_5 != null && ((Channel)this.N_5).isOpen() && ((Channel)this.N_5).isActive();
    }
}

