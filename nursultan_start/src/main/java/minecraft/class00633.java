/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 *  minecraft.class07740
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;
import minecraft.class07740;

public class class00633
extends MessageToMessageDecoder<ByteBuf> {
    private final class07740 N;

    public class00633(Cipher cipher) {
        this.N = new class07740(cipher);
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        list.add(this.N.N(channelHandlerContext, byteBuf));
    }
}

