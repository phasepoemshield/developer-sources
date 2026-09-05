/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 */
package minecraft;

import io.netty.channel.ChannelHandlerContext;

@FunctionalInterface
public interface class02400 {
    public void run(ChannelHandlerContext var1);

    default public class02400 N(class02400 class024002) {
        return channelHandlerContext -> {
            this.run(channelHandlerContext);
            class024002.run(channelHandlerContext);
        };
    }
}

