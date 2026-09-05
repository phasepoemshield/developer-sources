/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import minecraft.class02362;

class class02385<B, V>
implements class02362<B, V> {
    final /* synthetic */ class02362 N;
    final /* synthetic */ Codec y;
    final /* synthetic */ DynamicOps L;

    class02385(class02362 class023622, Codec codec, DynamicOps dynamicOps) {
        this.N = class023622;
        this.y = codec;
        this.L = dynamicOps;
    }

    public void encode(B b, V v) {
        Object object = this.y.encodeStart(this.L, v).getOrThrow(string -> new EncoderException("Failed to encode: " + string + " " + String.valueOf(v)));
        this.N.encode(b, object);
    }

    public V decode(B b) {
        Object object = this.N.decode(b);
        return (V)this.y.parse(this.L, object).getOrThrow(string -> new DecoderException("Failed to decode: " + string + " " + String.valueOf(object)));
    }
}

