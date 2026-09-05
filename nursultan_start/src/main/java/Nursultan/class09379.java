/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.ChannelPipeline
 *  io.netty.handler.proxy.Socks4ProxyHandler
 *  io.netty.handler.proxy.Socks5ProxyHandler
 *  io.netty.handler.timeout.ReadTimeoutHandler
 *  minecraft.class00392
 *  minecraft.class00423
 *  minecraft.class00642
 *  minecraft.class03706
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  ru.fiw.proxyserver.Proxy
 *  ru.fiw.proxyserver.Proxy$ProxyType
 *  ru.fiw.proxyserver.ProxyServer
 */
package Nursultan;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import minecraft.class00392;
import minecraft.class00423;
import minecraft.class00642;
import minecraft.class03706;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.fiw.proxyserver.Proxy;
import ru.fiw.proxyserver.ProxyServer;

public class class09379
extends ChannelInitializer<Channel> {
    final /* synthetic */ class00642 N;

    public class09379(class00642 class006422) {
        this.N = class006422;
    }

    private void y(Channel channel, CallbackInfo callbackInfo) {
        ProtocolTranslator.injectViaPipeline((class00642)this.N, (Channel)channel);
    }

    private void N(Channel channel, CallbackInfo callbackInfo) {
        Proxy proxy = ProxyServer.proxy;
        if (ProxyServer.proxyEnabled) {
            ProxyServer.lastUsedProxy = proxy;
            if (proxy.type == Proxy.ProxyType.SOCKS5) {
                channel.pipeline().addFirst(new ChannelHandler[]{new Socks5ProxyHandler((SocketAddress)new InetSocketAddress(proxy.getIp(), proxy.getPort()), proxy.username.isEmpty() ? null : proxy.username, proxy.password.isEmpty() ? null : proxy.password)});
            } else {
                channel.pipeline().addFirst(new ChannelHandler[]{new Socks4ProxyHandler((SocketAddress)new InetSocketAddress(proxy.getIp(), proxy.getPort()), proxy.username.isEmpty() ? null : proxy.username)});
            }
        } else {
            ProxyServer.lastUsedProxy = new Proxy();
        }
        if (ProxyServer.proxyMenuButton != null) {
            ProxyServer.proxyMenuButton.method_25355((class00392)class00392.y((String)("Proxy: " + ProxyServer.getLastUsedProxyIp())));
        }
    }

    protected void initChannel(Channel channel) {
        this.N(channel, null);
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        ChannelPipeline channelPipeline = channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30));
        class00642.method_48311((ChannelPipeline)channelPipeline, (class00423)class00423.field_11942, (boolean)false, (class03706)this.N.field_45955);
        this.N.method_53859(channelPipeline);
        this.y(channel, null);
    }
}

