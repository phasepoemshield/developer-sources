/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class02362
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import minecraft.class00667;
import minecraft.class02362;

class class01516
implements class02362<ByteBuf, UUID> {
    class01516() {
    }

    public UUID decode(ByteBuf byteBuf) {
        return class00667.B((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, UUID uUID) {
        class00667.N((ByteBuf)byteBuf, (UUID)uUID);
    }
}

