/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  minecraft.class01657
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.function.BiFunction;
import minecraft.class01657;
import minecraft.class02362;

class class02384<B, V>
implements class02362<B, V> {
    final /* synthetic */ int N;
    final /* synthetic */ BiFunction y;
    final /* synthetic */ class02362 L;

    class02384(int n, BiFunction biFunction, class02362 class023622) {
        this.N = n;
        this.y = biFunction;
        this.L = class023622;
    }

    public V decode(B b) {
        int n = class01657.N(b);
        if (n > this.N) {
            throw new DecoderException("Buffer size " + n + " is larger than allowed limit of " + this.N);
        }
        int n2 = b.readerIndex();
        ByteBuf byteBuf = (ByteBuf)this.y.apply(b, b.slice(n2, n));
        b.readerIndex(n2 + n);
        return (V)this.L.decode(byteBuf);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void encode(B b, V v) {
        ByteBuf byteBuf = (ByteBuf)this.y.apply(b, b.alloc().buffer());
        try {
            this.L.encode(byteBuf, v);
            int n = byteBuf.readableBytes();
            if (n > this.N) {
                throw new EncoderException("Buffer size " + n + " is  larger than allowed limit of " + this.N);
            }
            class01657.N(b, (int)n);
            b.writeBytes(byteBuf);
        }
        finally {
            byteBuf.release();
        }
    }
}

