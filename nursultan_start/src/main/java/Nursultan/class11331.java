/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09230
 *  Nursultan.class11921
 *  Nursultan.class12020
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.handler.codec.http.websocketx.TextWebSocketFrame
 *  minecraft.class06202
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09230;
import Nursultan.class11303;
import Nursultan.class11921;
import Nursultan.class12020;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicBoolean;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11331 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;

    public void L() {
        if (((AtomicBoolean)this.y_0).get()) {
            ((Logger)N_0).warn("AutoBuy client already connected");
            return;
        }
        Thread thread = new Thread(() -> {
            this.y_1 = new NioEventLoopGroup();
            try {
                int n = class11331.B();
                URI uRI = new URI("ws://127.0.0.1:" + n + "/autobuy");
                Bootstrap bootstrap = new Bootstrap();
                ((Bootstrap)((Bootstrap)((Bootstrap)bootstrap.group((EventLoopGroup)this.y_1)).channel(NioSocketChannel.class)).option(ChannelOption.TCP_NODELAY, (Object)true)).handler((ChannelHandler)new class09230(this, uRI));
                this.y_2 = bootstrap.connect(uRI.getHost(), uRI.getPort()).sync().channel();
                ((Channel)this.y_2).closeFuture().sync();
            }
            catch (Exception exception) {
                class11303.y(class11921.N((String)"auto-buy-error", (Object[])new Object[]{exception.getMessage()}));
                ((Logger)N_0).error("AutoBuy error during start: {}", (Object)exception.getMessage(), (Object)exception);
            }
            finally {
                ((AtomicBoolean)this.y_0).set(false);
                if ((EventLoopGroup)this.y_1 != null) {
                    ((EventLoopGroup)this.y_1).shutdownGracefully();
                }
            }
        }, "AutoBuy-WebSocket-Client");
        thread.setDaemon(true);
        thread.start();
    }

    public class11331() {
        this.E();
        this.y_0 = new AtomicBoolean(false);
    }

    static {
        class11331.U();
        N_0 = LogManager.getLogger(String.class);
    }

    private static int B() throws Exception {
        Path path = ((File)class06202.Nq().l_1).toPath().resolve("port.tmp");
        if (!Files.exists(path, new LinkOption[0])) {
            throw new IllegalStateException(class12020.N((String)"auto-buy-port-file-empty"));
        }
        String string = Files.readString(path).trim();
        if (string.isBlank()) {
            throw new IllegalStateException(class12020.N((String)"auto-buy-port-file-empty"));
        }
        return Integer.parseInt(string);
    }

    private static void U() {
        N_0 = null;
    }

    public void u() {
        if (!((AtomicBoolean)this.y_0).get()) {
            ((Logger)N_0).warn("AutoBuy client is not connected - stop has been skipped");
            return;
        }
        try {
            if ((Channel)this.y_2 != null && ((Channel)this.y_2).isOpen()) {
                ((Channel)this.y_2).close();
            }
            if ((EventLoopGroup)this.y_1 != null) {
                ((EventLoopGroup)this.y_1).shutdownGracefully();
            }
        }
        catch (Exception exception) {
            class11303.y(class11921.N((String)"auto-buy-error", (Object[])new Object[]{exception.getMessage()}));
            ((Logger)N_0).error("AutoBuy error during stop: {}", (Object)exception.getMessage(), (Object)exception);
        }
        finally {
            ((AtomicBoolean)this.y_0).set(false);
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

    public void N(String string) {
        if (this.y()) {
            class11303.y(class11921.N((String)"auto-buy-error", (Object[])new Object[]{"Not connected to server, and trying to send packet"}));
            ((Logger)N_0).error("Not connected to server, and trying to send packet: {}", (Object)string);
            return;
        }
        Channel channel = (Channel)this.y_2;
        if (channel != null && channel.isActive()) {
            channel.writeAndFlush((Object)new TextWebSocketFrame(string));
        } else {
            class11303.y(class11921.N((String)"auto-buy-error", (Object[])new Object[]{"Channel is not active, and trying to send packet"}));
            ((Logger)N_0).error("Channel is not active, and trying to send packet: {}", (Object)string);
        }
    }
}

