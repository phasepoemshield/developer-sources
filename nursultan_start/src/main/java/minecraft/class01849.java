/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.util.concurrent.GenericFutureListener
 *  minecraft.class03420
 *  minecraft.class04169
 *  minecraft.class04995
 */
package minecraft;

import com.google.common.base.Splitter;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.List;
import minecraft.class01876;
import minecraft.class03420;
import minecraft.class04169;
import minecraft.class04995;

public class class01849
extends SimpleChannelInboundHandler<ByteBuf> {
    private static final Splitter N = Splitter.on((char)'\u0000').limit(6);
    private final class03420 y;
    private final class01876 L;

    public class01849(class03420 class034202, class01876 class018762) {
        this.y = class034202;
        this.L = class018762;
    }

    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        String string;
        List var5;
        if (byteBuf.readUnsignedByte() == 255 && "\u00a71".equals((var5 = N.splitToList((CharSequence)(string = class04169.N((ByteBuf)byteBuf)))).get(0))) {
            int n = class04995.N((String)((String)var5.get(1)), (int)0);
            String string2 = (String)var5.get(2);
            String string3 = (String)var5.get(3);
            int n2 = class04995.N((String)((String)var5.get(4)), (int)-1);
            int n3 = class04995.N((String)((String)var5.get(5)), (int)-1);
            this.L.handleResponse(n, string2, string3, n2, n3);
        }
        channelHandlerContext.close();
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        channelHandlerContext.close();
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        ByteBuf byteBuf = channelHandlerContext.alloc().buffer();
        try {
            byteBuf.writeByte(254);
            byteBuf.writeByte(1);
            byteBuf.writeByte(250);
            class04169.N((ByteBuf)byteBuf, (String)"MC|PingHost");
            int n = byteBuf.writerIndex();
            byteBuf.writeShort(0);
            int n2 = byteBuf.writerIndex();
            byteBuf.writeByte(127);
            class04169.N((ByteBuf)byteBuf, (String)this.y.N());
            byteBuf.writeInt(this.y.y());
            int n3 = byteBuf.writerIndex() - n2;
            byteBuf.setShort(n, n3);
            channelHandlerContext.channel().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
        }
        catch (Exception exception) {
            byteBuf.release();
            throw exception;
        }
    }
}

