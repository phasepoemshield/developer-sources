/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  minecraft.class02362
 *  minecraft.class04247
 */
package minecraft;

import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class06584;

class class06557
implements class02362<class04247, class06584> {
    class06557() {
    }

    public class06584 decode(class04247 class042472) {
        class06584 class065842 = (class06584)class06584.B.decode((Object)class042472);
        if (class065842.R()) {
            throw new DecoderException("Empty ItemStack not allowed");
        }
        return class065842;
    }

    public void encode(class04247 class042472, class06584 class065842) {
        if (class065842.R()) {
            throw new EncoderException("Empty ItemStack not allowed");
        }
        class06584.B.encode((Object)class042472, (Object)class065842);
    }
}

