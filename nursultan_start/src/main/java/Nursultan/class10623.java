/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  io.netty.handler.codec.DecoderException
 *  minecraft.class02362
 *  minecraft.class02636
 *  minecraft.class03519
 *  minecraft.class04247
 *  minecraft.class06584
 */
package Nursultan;

import com.mojang.serialization.DynamicOps;
import io.netty.handler.codec.DecoderException;
import minecraft.class02362;
import minecraft.class02636;
import minecraft.class03519;
import minecraft.class04247;
import minecraft.class06584;

public class class10623
implements class02362<class04247, class06584> {
    final /* synthetic */ class02362 N;

    public class10623(class02362 class023622) {
        this.N = class023622;
    }

    public class06584 decode(class04247 class042472) {
        class06584 class065842 = (class06584)this.N.decode((Object)class042472);
        if (!class065842.R()) {
            class03519 class035192 = class042472.J().N((DynamicOps)class02636.N);
            class06584.y.encodeStart((DynamicOps)class035192, (Object)class065842).getOrThrow(DecoderException::new);
        }
        return class065842;
    }

    public void encode(class04247 class042472, class06584 class065842) {
        this.N.encode((Object)class042472, (Object)class065842);
    }
}

