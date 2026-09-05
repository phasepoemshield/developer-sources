/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.MessageToMessageDecoder
 *  minecraft.class00381
 *  minecraft.class03257
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import minecraft.class00381;
import minecraft.class03257;
import minecraft.class03276;
import org.jspecify.annotations.Nullable;

public class class03288
extends MessageToMessageDecoder<class00381<?>> {
    private final class03276 N;
    private @Nullable class03257 y;

    public class03288(class03276 class032762) {
        this.N = class032762;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, class00381<?> class003812, List<Object> list) throws Exception {
        if (this.y != null) {
            class03288.N(class003812);
            class00381 var4 = this.y.N(class003812);
            if (var4 != null) {
                this.y = null;
                list.add(var4);
            }
        } else {
            class03257 class032572 = this.N.N(class003812);
            if (class032572 != null) {
                class03288.N(class003812);
                this.y = class032572;
            } else {
                list.add(class003812);
                if (class003812.R()) {
                    channelHandlerContext.pipeline().remove(channelHandlerContext.name());
                }
            }
        }
    }

    private static void N(class00381<?> class003812) {
        if (class003812.R()) {
            throw new DecoderException("Terminal message received in bundle");
        }
    }
}

