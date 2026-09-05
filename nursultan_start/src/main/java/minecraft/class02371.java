/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  minecraft.class03519
 *  minecraft.class04247
 *  minecraft.class07709
 *  minecraft.class07713
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import minecraft.class02362;
import minecraft.class03519;
import minecraft.class04247;
import minecraft.class07709;
import minecraft.class07713;

class class02371<T>
implements class02362<class04247, T> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ Codec y;

    class02371(class02362 class023622, Codec codec) {
        this.N = class023622;
        this.y = codec;
    }

    public T decode(class04247 class042472) {
        class07709 class077092 = (class07709)this.N.decode(class042472);
        class03519 class035192 = class042472.J().N((DynamicOps)class07713.N);
        return (T)this.y.parse((DynamicOps)class035192, (Object)class077092).getOrThrow(string -> new DecoderException("Failed to decode: " + string + " " + String.valueOf(class077092)));
    }

    public void encode(class04247 class042472, T t) {
        class03519 class035192 = class042472.J().N((DynamicOps)class07713.N);
        class07709 class077092 = (class07709)this.y.encodeStart((DynamicOps)class035192, t).getOrThrow(string -> new EncoderException("Failed to encode: " + string + " " + String.valueOf(t)));
        this.N.encode(class042472, class077092);
    }
}

