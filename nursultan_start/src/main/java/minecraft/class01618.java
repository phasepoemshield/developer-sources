/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09480
 *  Nursultan.class09483
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.local.LocalAddress
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00501
 *  minecraft.class00606
 *  minecraft.class00642
 *  minecraft.class02796
 *  minecraft.class03041
 *  minecraft.class05216
 *  minecraft.class07080
 *  minecraft.class07878
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09480;
import Nursultan.class09483;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.local.LocalAddress;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00501;
import minecraft.class00606;
import minecraft.class00642;
import minecraft.class02796;
import minecraft.class03041;
import minecraft.class05216;
import minecraft.class07080;
import minecraft.class07878;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01618 {
    private static final Logger u = LogUtils.getLogger();
    public final class02796 N;
    public volatile boolean y;
    private final List<ChannelFuture> i = Collections.synchronizedList(Lists.newArrayList());
    public final List<class00642> L = Collections.synchronizedList(Lists.newArrayList());

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void L() {
        List<class00642> var1 = this.L;
        synchronized (var1) {
            Iterator<class00642> var2 = this.L.iterator();
            while (var2.hasNext()) {
                class00642 class006422 = var2.next();
                if (class006422.method_10772()) continue;
                if (class006422.method_10758()) {
                    try {
                        class006422.method_10754();
                    }
                    catch (Exception exception) {
                        if (class006422.method_10756()) {
                            throw new class07878(class07080.N((Throwable)exception, (String)"Ticking memory connection"));
                        }
                        u.warn("Failed to handle packet for {}", (Object)class006422.method_52909(this.N.NN()), (Object)exception);
                        class05216 class052162 = class00392.y((String)"Internal server error");
                        class006422.method_10752((class00381)new class00501((class00392)class052162), class03041.N(() -> class01618.N(class006422, (class00392)class052162)));
                        class006422.method_10757();
                    }
                    continue;
                }
                var2.remove();
                class006422.method_10768();
            }
        }
    }

    public class01618(class02796 class027962) {
        this.N = class027962;
        this.y = true;
    }

    public List<class00642> i() {
        return this.L;
    }

    public class02796 u() {
        return this.N;
    }

    public void y() {
        this.y = false;
        for (ChannelFuture channelFuture : this.i) {
            try {
                channelFuture.channel().close().sync();
            }
            catch (InterruptedException interruptedException) {
                u.error("Interrupted whilst closing channel");
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SocketAddress N() {
        ChannelFuture channelFuture;
        List<ChannelFuture> var2 = this.i;
        synchronized (var2) {
            channelFuture = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(class00606.N().i())).childHandler((ChannelHandler)new class09483(this)).group(class00606.N().L()).localAddress((SocketAddress)LocalAddress.ANY)).bind().syncUninterruptibly();
            this.i.add(channelFuture);
        }
        return channelFuture.channel().localAddress();
    }

    private static /* synthetic */ void N(class00642 class006422, class00392 class003922) {
        class006422.method_10747(class003922);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(@Nullable InetAddress inetAddress, int n) throws IOException {
        List<ChannelFuture> var3 = this.i;
        synchronized (var3) {
            class00606 class006062 = class00606.N((boolean)this.N.E());
            this.i.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(class006062.i())).childHandler((ChannelHandler)new class09480(this)).group(class006062.L()).localAddress(inetAddress, n)).bind().syncUninterruptibly());
        }
    }
}

