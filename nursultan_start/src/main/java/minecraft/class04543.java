/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class01657
 *  minecraft.class02362
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.OptionalInt;
import minecraft.class01657;
import minecraft.class02362;

class class04543
implements class02362<ByteBuf, OptionalInt> {
    class04543() {
    }

    public OptionalInt decode(ByteBuf byteBuf) {
        int n = class01657.N((ByteBuf)byteBuf);
        return n == 0 ? OptionalInt.empty() : OptionalInt.of(n - 1);
    }

    public void encode(ByteBuf byteBuf, OptionalInt optionalInt) {
        class01657.N((ByteBuf)byteBuf, (int)(optionalInt.orElse(-1) + 1));
    }
}

