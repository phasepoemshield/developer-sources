/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelDuplexHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPromise
 *  io.netty.handler.codec.DecoderException
 *  io.netty.util.ReferenceCountUtil
 *  minecraft.class00381
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.DecoderException;
import io.netty.util.ReferenceCountUtil;
import minecraft.class00381;
import minecraft.class02403;

public class class02372
extends ChannelDuplexHandler {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) throws Exception {
        if (object instanceof class02403) {
            class02403 class024032 = (class02403)object;
            try {
                class024032.run(channelHandlerContext);
            }
            finally {
                ReferenceCountUtil.release((Object)object);
            }
            channelPromise.setSuccess();
        } else {
            channelHandlerContext.write(object, channelPromise);
        }
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        if (object instanceof ByteBuf || object instanceof class00381) {
            ReferenceCountUtil.release((Object)object);
            throw new DecoderException("Pipeline has no inbound protocol configured, can't process packet " + String.valueOf(object));
        }
        channelHandlerContext.fireChannelRead(object);
    }
}

