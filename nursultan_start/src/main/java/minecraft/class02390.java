/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class01657
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import minecraft.class01657;
import minecraft.class02362;

class class02390<T>
implements class02362<ByteBuf, T> {
    final /* synthetic */ IntFunction N;
    final /* synthetic */ ToIntFunction y;

    class02390(IntFunction intFunction, ToIntFunction toIntFunction) {
        this.N = intFunction;
        this.y = toIntFunction;
    }

    public T decode(ByteBuf byteBuf) {
        int n = class01657.N((ByteBuf)byteBuf);
        return (T)this.N.apply(n);
    }

    public void encode(ByteBuf byteBuf, T t) {
        int n = this.y.applyAsInt(t);
        class01657.N((ByteBuf)byteBuf, (int)n);
    }
}

