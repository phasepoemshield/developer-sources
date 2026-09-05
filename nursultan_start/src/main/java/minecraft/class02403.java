/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 */
package minecraft;

import io.netty.channel.ChannelHandlerContext;

@FunctionalInterface
public interface class02403 {
    public void run(ChannelHandlerContext var1);

    default public class02403 N(class02403 class024032) {
        return channelHandlerContext -> {
            this.run(channelHandlerContext);
            class024032.run(channelHandlerContext);
        };
    }
}

