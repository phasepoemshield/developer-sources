/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01657
 *  minecraft.class02362
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01657;
import minecraft.class02362;

class class03419
implements class02362<ByteBuf, Optional<class00500>> {
    class03419() {
    }

    public void encode(ByteBuf byteBuf, Optional<class00500> optional) {
        if (optional.isPresent()) {
            class01657.N((ByteBuf)byteBuf, (int)class00891.W((class00500)optional.get()));
        } else {
            class01657.N((ByteBuf)byteBuf, (int)0);
        }
    }

    public Optional<class00500> decode(ByteBuf byteBuf) {
        int n = class01657.N((ByteBuf)byteBuf);
        if (n == 0) {
            return Optional.empty();
        }
        return Optional.of(class00891.N((int)n));
    }
}

