/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JavaOps
 *  minecraft.class01929
 *  minecraft.class03519
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import minecraft.class01929;
import minecraft.class03519;

public class class01801<T> {
    private final Codec<T> N;

    class01801(Codec<T> codec) {
        this.N = codec;
    }

    public T N(T t, class01929 class019292, class01929 class019293) {
        class03519 class035192 = class019292.N((DynamicOps)JavaOps.INSTANCE);
        class03519 class035193 = class019293.N((DynamicOps)JavaOps.INSTANCE);
        Object object = this.N.encodeStart((DynamicOps)class035192, t).getOrThrow(string -> new IllegalStateException("Failed to encode: " + string));
        return (T)this.N.parse((DynamicOps)class035193, object).getOrThrow(string -> new IllegalStateException("Failed to decode: " + string));
    }
}

