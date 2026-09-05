/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  org.joml.Quaternionfc
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00667;
import minecraft.class02362;
import org.joml.Quaternionfc;

class class02378
implements class02362<ByteBuf, Quaternionfc> {
    class02378() {
    }

    public Quaternionfc decode(ByteBuf byteBuf) {
        return class00667.R((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, Quaternionfc quaternionfc) {
        class00667.N((ByteBuf)byteBuf, (Quaternionfc)quaternionfc);
    }
}

