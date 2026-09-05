/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  org.joml.Vector3fc
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00667;
import minecraft.class02362;
import org.joml.Vector3fc;

class class02404
implements class02362<ByteBuf, Vector3fc> {
    class02404() {
    }

    public Vector3fc decode(ByteBuf byteBuf) {
        return class00667.i((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, Vector3fc vector3fc) {
        class00667.N((ByteBuf)byteBuf, (Vector3fc)vector3fc);
    }
}

