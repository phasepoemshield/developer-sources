/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11940
 *  Nursultan.class11951
 *  Nursultan.class11952
 *  Nursultan.class11959
 *  Nursultan.class11964
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.util.internal.logging.InternalLogger
 *  io.netty.util.internal.logging.InternalLoggerFactory
 */
package Nursultan;

import Nursultan.class11940;
import Nursultan.class11951;
import Nursultan.class11952;
import Nursultan.class11959;
import Nursultan.class11964;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.List;

public class class09370
extends ByteToMessageDecoder {
    public Object N_0;
    public static Object y_0;

    public class09370(class11964 class119642) {
        this.u();
        this.N_0 = class119642;
    }

    static {
        class09370.R();
        y_0 = InternalLoggerFactory.getInstance(String.class);
    }

    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        if (!byteBuf.isReadable()) {
            return;
        }
        class11959 class119592 = (class11959)channelHandlerContext.channel().attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2).get();
        if (class119592 == null) {
            throw new IllegalStateException("ProtocolType unknown for inbound frame");
        }
        int n = class09370.N(channelHandlerContext);
        int n2 = -1;
        try {
            n2 = class11952.N((ByteBuf)byteBuf);
            class11951 var7 = class119592.N((class11964)this.N_0, n2, n);
            if (var7 == null) {
                ((InternalLogger)y_0).warn("Skipping unsupported packet id {} ({}/{}, protocol version {})", new Object[]{n2, class119592.name(), (class11964)this.N_0, n});
                byteBuf.skipBytes(byteBuf.readableBytes());
                return;
            }
            var7.y(new class11940(byteBuf, (short)n));
            int n3 = byteBuf.readableBytes();
            if (n3 > 0) {
                ((InternalLogger)y_0).warn("Packet {}/{} ({}) left {} extra bytes, skipping tail", new Object[]{class119592.name(), n2, var7.getClass().getSimpleName(), n3});
                byteBuf.skipBytes(n3);
            }
            list.add(var7);
        }
        catch (Exception exception) {
            ((InternalLogger)y_0).error("Failed to decode packet id {} ({}/{}, protocol version {}), skipping frame", new Object[]{n2, class119592.name(), (class11964)this.N_0, n, exception});
            byteBuf.skipBytes(byteBuf.readableBytes());
        }
    }

    private void u() {
    }

    private static int N(ChannelHandlerContext channelHandlerContext) {
        Short s = (Short)channelHandlerContext.channel().attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_3).get();
        return s != null ? (int)s.shortValue() : 16;
    }

    private static void R() {
        y_0 = null;
    }
}

