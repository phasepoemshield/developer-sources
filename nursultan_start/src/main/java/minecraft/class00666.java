/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  minecraft.class07740
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;
import minecraft.class07740;

public class class00666
extends MessageToByteEncoder<ByteBuf> {
    private final class07740 N;

    public class00666(Cipher cipher) {
        this.N = new class07740(cipher);
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        this.N.N(byteBuf, byteBuf2);
    }
}

