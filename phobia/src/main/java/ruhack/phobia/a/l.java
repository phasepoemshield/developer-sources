/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelPipeline
 *  io.netty.handler.proxy.Socks4ProxyHandler
 *  io.netty.handler.proxy.Socks5ProxyHandler
 *  net.minecraft.class_2535
 *  net.minecraft.class_2547
 *  net.minecraft.class_2596
 *  net.minecraft.class_2598
 *  net.minecraft.class_8762
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_8762;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.an;
import ruhack.phobia.ax;
import ruhack.phobia.cr;
import ruhack.phobia.cr$Type;
import ruhack.phobia.cs;
import ruhack.phobia.oh;
import ruhack.phobia.oh$ProxyType;

@Mixin(value={class_2535.class})
public class l {
    @Inject(method={"method_10759"}, at={@At(value="HEAD")}, cancellable=true)
    private static <T extends class_2547> void handlePacketPre(class_2596<T> packet, class_2547 listener, CallbackInfo info) {
        cr packetEvent = new cr(packet, cr$Type.RECEIVE);
        ax.callEvent(packetEvent);
        if (packetEvent.isCancelled()) {
            info.cancel();
        }
    }

    @Inject(method={"method_10743"}, at={@At(value="HEAD")}, cancellable=true)
    private void sendPre(class_2596<?> packet, CallbackInfo info) {
        cr packetEvent = new cr(packet, cr$Type.SEND);
        ax.callEvent(packetEvent);
        if (packetEvent.isCancelled()) {
            info.cancel();
        }
    }

    @Inject(method={"method_10743"}, at={@At(value="RETURN")})
    private void sendPost(class_2596<?> packet, CallbackInfo info) {
        ax.callEvent(new cs(packet));
    }

    @Inject(method={"method_48311"}, at={@At(value="RETURN")})
    private static void addHandlersHook(ChannelPipeline pipeline, class_2598 side, boolean local, class_8762 packetSizeLogger, CallbackInfo ci2) {
        an config = an.getInstance();
        oh proxy = config.getDefaultProxy();
        if (proxy != null && config.isProxyEnabled() && !proxy.isEmpty() && side == class_2598.field_11942 && !local) {
            InetSocketAddress proxyAddress = new InetSocketAddress(proxy.getIp(), proxy.getPort());
            if (proxy.type == oh$ProxyType.SOCKS4) {
                pipeline.addFirst("rich_socks4_proxy", (ChannelHandler)new Socks4ProxyHandler((SocketAddress)proxyAddress, proxy.username));
            } else {
                pipeline.addFirst("rich_socks5_proxy", (ChannelHandler)new Socks5ProxyHandler((SocketAddress)proxyAddress, proxy.username, proxy.password));
            }
            config.setLastUsedProxy(new oh(proxy));
        }
    }
}

