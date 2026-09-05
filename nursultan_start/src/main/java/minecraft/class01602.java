/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.util.concurrent.GenericFutureListener
 *  minecraft.class04169
 *  minecraft.class04184
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.SocketAddress;
import java.util.Locale;
import minecraft.class04169;
import minecraft.class04184;
import org.slf4j.Logger;

public class class01602
extends ChannelInboundHandlerAdapter {
    private static final Logger N = LogUtils.getLogger();
    private final class04184 y;

    public class01602(class04184 class041842) {
        this.y = class041842;
    }

    private static String y(class04184 class041842) {
        return String.format(Locale.ROOT, "\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, class041842.w(), class041842.x(), class041842.Q(), class041842.t());
    }

    private static void N(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        channelHandlerContext.pipeline().firstContext().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE);
    }

    private static ByteBuf N(ByteBufAllocator byteBufAllocator, String string) {
        ByteBuf byteBuf = byteBufAllocator.buffer();
        byteBuf.writeByte(255);
        class04169.N((ByteBuf)byteBuf, (String)string);
        return byteBuf;
    }

    private static boolean N(ByteBuf byteBuf) {
        if (byteBuf.readUnsignedByte() != 250) {
            return false;
        }
        String string = class04169.N((ByteBuf)byteBuf);
        if (!"MC|PingHost".equals(string)) {
            return false;
        }
        int n = byteBuf.readUnsignedShort();
        if (byteBuf.readableBytes() != n) {
            return false;
        }
        if (byteBuf.readUnsignedByte() < 73) {
            return false;
        }
        String string2 = class04169.N((ByteBuf)byteBuf);
        return byteBuf.readInt() <= 65535;
    }

    private static String N(class04184 class041842) {
        return String.format(Locale.ROOT, "%s\u00a7%d\u00a7%d", class041842.x(), class041842.Q(), class041842.t());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        ByteBuf byteBuf = (ByteBuf)object;
        byteBuf.markReaderIndex();
        boolean bl = true;
        try {
            if (byteBuf.readUnsignedByte() != 254) {
                return;
            }
            SocketAddress socketAddress = channelHandlerContext.channel().remoteAddress();
            if (byteBuf.readableBytes() == 0) {
                N.debug("Ping: (<1.3.x) from {}", (Object)socketAddress);
                String string = class01602.N(this.y);
                class01602.N(channelHandlerContext, class01602.N(channelHandlerContext.alloc(), string));
            } else {
                if (byteBuf.readUnsignedByte() != 1) {
                    return;
                }
                if (byteBuf.isReadable()) {
                    if (!class01602.N(byteBuf)) {
                        return;
                    }
                    N.debug("Ping: (1.6) from {}", (Object)socketAddress);
                } else {
                    N.debug("Ping: (1.4-1.5.x) from {}", (Object)socketAddress);
                }
                String string = class01602.y(this.y);
                class01602.N(channelHandlerContext, class01602.N(channelHandlerContext.alloc(), string));
            }
            byteBuf.release();
            bl = false;
        }
        catch (RuntimeException runtimeException) {
        }
        finally {
            if (bl) {
                byteBuf.resetReaderIndex();
                channelHandlerContext.channel().pipeline().remove((ChannelHandler)this);
                channelHandlerContext.fireChannelRead(object);
            }
        }
    }
}

