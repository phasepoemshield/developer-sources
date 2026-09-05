/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09175
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  minecraft.class00381
 *  minecraft.class01671
 *  minecraft.class01834
 *  minecraft.class02897
 *  minecraft.class04275
 *  net.fabricmc.fabric.mixin.networking.accessor.PacketDecoderAccessor
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09175;
import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import minecraft.class00381;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class01671;
import minecraft.class01834;
import minecraft.class02897;
import minecraft.class04275;
import net.fabricmc.fabric.mixin.networking.accessor.PacketDecoderAccessor;
import org.slf4j.Logger;

public class class00658<T extends class00638>
extends ByteToMessageDecoder
implements class01671,
PacketDecoderAccessor {
    private static final Logger N = LogUtils.getLogger();
    private final class04275<T> y;

    public class00658(class04275<T> class042752) {
        this.y = class042752;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        class00381 class003812;
        int n = byteBuf.readableBytes();
        try {
            class003812 = (class00381)this.y.L().decode((Object)byteBuf);
        }
        catch (Exception exception) {
            if (exception instanceof class09175) {
                byteBuf.skipBytes(byteBuf.readableBytes());
            }
            throw exception;
        }
        class02897 class028972 = class003812.method_65080();
        class01834.M.N(this.y.N(), class028972, channelHandlerContext.channel().remoteAddress(), n);
        if (byteBuf.readableBytes() > 0) {
            throw new IOException("Packet " + this.y.N().N() + "/" + String.valueOf(class028972) + " (" + class003812.getClass().getSimpleName() + ") was larger than I expected, found " + byteBuf.readableBytes() + " bytes extra whilst reading packet " + String.valueOf(class028972));
        }
        list.add(class003812);
        if (N.isDebugEnabled()) {
            N.debug(class00642.field_36379, " IN: [{}:{}] {} -> {} bytes", new Object[]{this.y.N().N(), class028972, class003812.getClass().getName(), n});
        }
        class01671.N((ChannelHandlerContext)channelHandlerContext, (class00381)class003812);
    }

    public /* synthetic */ void fabric_decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) {
        this.decode(channelHandlerContext, byteBuf, list);
    }
}

