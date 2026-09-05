/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.channel.ChannelFutureListener
 *  minecraft.class00381
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFutureListener;
import java.util.function.Supplier;
import minecraft.class00381;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03041 {
    private static final Logger N = LogUtils.getLogger();

    public static ChannelFutureListener N(Runnable runnable) {
        return channelFuture -> {
            runnable.run();
            if (!channelFuture.isSuccess()) {
                channelFuture.channel().pipeline().fireExceptionCaught(channelFuture.cause());
            }
        };
    }

    public static ChannelFutureListener N(Supplier<@Nullable class00381<?>> supplier) {
        return channelFuture -> {
            if (!channelFuture.isSuccess()) {
                class00381 class003812 = (class00381)supplier.get();
                if (class003812 != null) {
                    N.warn("Failed to deliver packet, sending fallback {}", (Object)class003812.method_65080(), (Object)channelFuture.cause());
                    channelFuture.channel().writeAndFlush((Object)class003812, channelFuture.channel().voidPromise());
                } else {
                    channelFuture.channel().pipeline().fireExceptionCaught(channelFuture.cause());
                }
            }
        };
    }
}

