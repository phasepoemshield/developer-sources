/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class07209
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00667;
import minecraft.class02334;
import minecraft.class02362;
import minecraft.class07209;

class class02360
implements class02362<ByteBuf, class02334> {
    class02360() {
    }

    public class02334 decode(ByteBuf byteBuf) {
        return new class02334(class00667.L((ByteBuf)byteBuf), class00667.L((ByteBuf)byteBuf));
    }

    public void encode(ByteBuf byteBuf, class02334 class023342) {
        class00667.N((ByteBuf)byteBuf, (class07209)class023342.R());
        class00667.N((ByteBuf)byteBuf, (class07209)class023342.M());
    }
}

