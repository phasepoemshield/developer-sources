/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JavaOps
 *  minecraft.class01929
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import minecraft.class00191;
import minecraft.class00203;
import minecraft.class01929;

class class00216
implements class00203 {
    final /* synthetic */ class00191 N;

    class00216(class00191 class001912) {
        this.N = class001912;
    }

    @Override
    public <T> DataResult<T> N(Codec<T> codec, T t, class01929 class019292) {
        return codec.encodeStart(this.N.N(JavaOps.INSTANCE), t).flatMap(object -> codec.parse((DynamicOps)class019292.N((DynamicOps)JavaOps.INSTANCE), object));
    }
}

