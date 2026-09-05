/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 *  minecraft.class00381
 *  minecraft.class03276
 */
package minecraft;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;
import minecraft.class00381;
import minecraft.class03276;

public class class03258
extends MessageToMessageEncoder<class00381<?>> {
    private final class03276 N;

    public class03258(class03276 class032762) {
        this.N = class032762;
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, class00381<?> class003812, List<Object> list) throws Exception {
        this.N.N(class003812, list::add);
        if (class003812.R()) {
            channelHandlerContext.pipeline().remove(channelHandlerContext.name());
        }
    }
}

