/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  minecraft.class00667
 *  minecraft.class06997
 *  minecraft.class07709
 *  minecraft.class07726
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.function.Supplier;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class06997;
import minecraft.class07709;
import minecraft.class07726;

class class02367
implements class02362<ByteBuf, class07709> {
    final /* synthetic */ Supplier N;

    class02367(Supplier supplier) {
        this.N = supplier;
    }

    public class07709 decode(ByteBuf byteBuf) {
        class07709 class077092 = class00667.N((ByteBuf)byteBuf, (class07726)((class07726)this.N.get()));
        if (class077092 == null) {
            throw new DecoderException("Expected non-null compound tag");
        }
        return class077092;
    }

    public void encode(ByteBuf byteBuf, class07709 class077092) {
        if (class077092 == class06997.y) {
            throw new EncoderException("Expected non-null compound tag");
        }
        class00667.N((ByteBuf)byteBuf, (class07709)class077092);
    }
}

