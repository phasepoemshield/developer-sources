/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelOutboundHandlerAdapter
 *  io.netty.channel.ChannelPromise
 *  io.netty.handler.codec.EncoderException
 *  io.netty.util.ReferenceCountUtil
 *  minecraft.class00381
 *  minecraft.class02400
 */
package Nursultan;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ReferenceCountUtil;
import minecraft.class00381;
import minecraft.class02400;

public class class09700
extends ChannelOutboundHandlerAdapter {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) throws Exception {
        if (object instanceof class00381) {
            ReferenceCountUtil.release((Object)object);
            throw new EncoderException("Pipeline has no outbound protocol configured, can't process packet " + String.valueOf(object));
        }
        if (object instanceof class02400) {
            class02400 class024002 = (class02400)object;
            try {
                class024002.run(channelHandlerContext);
            }
            finally {
                ReferenceCountUtil.release((Object)object);
            }
            channelPromise.setSuccess();
        } else {
            channelHandlerContext.write(object, channelPromise);
        }
    }
}

