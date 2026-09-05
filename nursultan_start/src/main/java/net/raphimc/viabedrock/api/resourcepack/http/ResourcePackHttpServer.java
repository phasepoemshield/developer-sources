/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.handler.codec.http.HttpServerCodec
 *  io.netty.handler.stream.ChunkedWriteHandler
 *  net.raphimc.viabedrock.ViaBedrock
 */
package net.raphimc.viabedrock.api.resourcepack.http;

import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.stream.ChunkedWriteHandler;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.raphimc.viabedrock.ViaBedrock;

public class ResourcePackHttpServer {
    private final InetSocketAddress bindAddress;
    private final ChannelFuture channelFuture;
    private final Map<UUID, UserConnection> connections = new HashMap<UUID, UserConnection>();

    public String getUrl() {
        String overrideUrl = ViaBedrock.getConfig().getResourcePackUrl();
        if (!overrideUrl.isEmpty()) {
            return overrideUrl;
        }
        InetSocketAddress bindAddress = (InetSocketAddress)this.channelFuture.channel().localAddress();
        return "http://" + this.bindAddress.getHostString() + ":" + bindAddress.getPort() + "/";
    }

    public ResourcePackHttpServer(InetSocketAddress bindAddress) {
        this.bindAddress = bindAddress;
        this.channelFuture = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().group((EventLoopGroup)new NioEventLoopGroup(0)).channel(NioServerSocketChannel.class)).option(ChannelOption.SO_BACKLOG, (Object)128)).childOption(ChannelOption.TCP_NODELAY, (Object)true).childOption(ChannelOption.SO_KEEPALIVE, (Object)true).childHandler((ChannelHandler)new ChannelInitializer<Channel>(){

            protected void initChannel(Channel channel) {
                channel.pipeline().addLast("http_codec", (ChannelHandler)new HttpServerCodec());
                channel.pipeline().addLast("chunked_writer", (ChannelHandler)new ChunkedWriteHandler());
                channel.pipeline().addLast("http_handler", (ChannelHandler)new /* Unavailable Anonymous Inner Class!! */);
            }
        }).bind((SocketAddress)bindAddress).syncUninterruptibly();
    }

    public void stop() {
        if (this.channelFuture != null) {
            this.channelFuture.channel().close();
        }
    }

    public Channel getChannel() {
        return this.channelFuture.channel();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addConnection(UUID uuid, UserConnection connection) {
        Map<UUID, UserConnection> map = this.connections;
        synchronized (map) {
            this.connections.put(uuid, connection);
        }
        connection.getChannel().closeFuture().addListener(future -> {
            Map<UUID, UserConnection> map = this.connections;
            synchronized (map) {
                this.connections.remove(uuid);
            }
        });
    }
}

