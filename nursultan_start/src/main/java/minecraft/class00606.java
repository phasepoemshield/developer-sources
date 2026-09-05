/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.viaversion.viafabricplus.injection.access.base.bedrock.IEventLoopGroupHolder
 *  io.netty.channel.Channel
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.IoHandlerFactory
 *  io.netty.channel.MultiThreadIoEventLoopGroup
 *  io.netty.channel.ServerChannel
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollServerSocketChannel
 *  io.netty.channel.epoll.EpollSocketChannel
 *  io.netty.channel.kqueue.KQueue
 *  io.netty.channel.kqueue.KQueueServerSocketChannel
 *  io.netty.channel.kqueue.KQueueSocketChannel
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  minecraft.class06819
 *  minecraft.class06821
 *  minecraft.class06855
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IEventLoopGroupHolder;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.IoHandlerFactory;
import io.netty.channel.MultiThreadIoEventLoopGroup;
import io.netty.channel.ServerChannel;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.kqueue.KQueue;
import io.netty.channel.kqueue.KQueueServerSocketChannel;
import io.netty.channel.kqueue.KQueueSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.util.concurrent.ThreadFactory;
import minecraft.class00615;
import minecraft.class06819;
import minecraft.class06821;
import minecraft.class06855;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class00606
implements IEventLoopGroupHolder {
    private static final class00606 N = new class00615("NIO", NioSocketChannel.class, NioServerSocketChannel.class);
    private static final class00606 y = new class06821("Epoll", EpollSocketChannel.class, EpollServerSocketChannel.class);
    private static final class00606 L = new class06855("Kqueue", KQueueSocketChannel.class, KQueueServerSocketChannel.class);
    private static final class00606 u = new class06819("Local", LocalChannel.class, LocalServerChannel.class);
    private final String i;
    private final Class<? extends Channel> R;
    private final Class<? extends ServerChannel> M;
    private volatile @Nullable EventLoopGroup B;
    private boolean Z = false;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public EventLoopGroup L() {
        EventLoopGroup eventLoopGroup = this.B;
        if (eventLoopGroup == null) {
            class00606 class006062 = this;
            synchronized (class006062) {
                eventLoopGroup = this.B;
                if (eventLoopGroup == null) {
                    this.B = eventLoopGroup = this.M();
                }
            }
        }
        return eventLoopGroup;
    }

    private EventLoopGroup M() {
        return new MultiThreadIoEventLoopGroup(this.R(), this.y());
    }

    class00606(String string, Class<? extends Channel> clazz, Class<? extends ServerChannel> clazz2) {
        this.i = string;
        this.R = clazz;
        this.M = clazz2;
    }

    public Class<? extends ServerChannel> i() {
        return this.M;
    }

    public Class<? extends Channel> u() {
        return this.R;
    }

    protected abstract IoHandlerFactory y();

    private static void N(CallbackInfoReturnable callbackInfoReturnable) {
        ((IEventLoopGroupHolder)callbackInfoReturnable.getReturnValue()).viaFabricPlus$setConnecting(false);
    }

    public static class00606 N() {
        return u;
    }

    public static class00606 N(boolean bl) {
        if (bl) {
            if (KQueue.isAvailable()) {
                class00606 class006062 = L;
                class00606 class006063 = class006062;
                class006063 = new CallbackInfoReturnable("", false, (Object)class006063);
                class00606.N((CallbackInfoReturnable)class006063);
                return class006062;
            }
            if (Epoll.isAvailable()) {
                class00606 class006064 = y;
                class00606 class006065 = class006064;
                class006065 = new CallbackInfoReturnable("", false, (Object)class006065);
                class00606.N((CallbackInfoReturnable)class006065);
                return class006064;
            }
        }
        class00606 class006066 = N;
        class00606 class006067 = class006066;
        class006067 = new CallbackInfoReturnable("", false, (Object)class006067);
        class00606.N((CallbackInfoReturnable)class006067);
        return class006066;
    }

    private ThreadFactory R() {
        return new ThreadFactoryBuilder().setNameFormat("Netty " + this.i + " IO #%d").setDaemon(true).build();
    }

    public void viaFabricPlus$setConnecting(boolean bl) {
        this.Z = bl;
    }

    public boolean viaFabricPlus$isConnecting() {
        return this.Z;
    }
}

