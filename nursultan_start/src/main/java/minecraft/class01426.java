/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00522
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import minecraft.class00522;
import minecraft.class01416;
import minecraft.class01420;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class08092;

interface class01426 {
    public static final Codec<class01426> L = Codec.either(class01416.N, class01420.N).xmap(Either::unwrap, class014262 -> {
        if (class014262 instanceof class01416) {
            return Either.left((Object)((class01416)class014262));
        }
        if (class014262 instanceof class01420) {
            return Either.right((Object)((class01420)class014262));
        }
        throw new UnsupportedOperationException();
    });
    public static final class02362<ByteBuf, class01426> u = class02389.N(class01416.y, class01420.y).N_10(Either::unwrap, class014262 -> {
        if (class014262 instanceof class01416) {
            return Either.left((Object)((class01416)class014262));
        }
        if (class014262 instanceof class01420) {
            return Either.right((Object)((class01420)class014262));
        }
        throw new UnsupportedOperationException();
    });

    public <T extends Comparable<T>> boolean N(class00522<?, ?> var1, class08092<T> var2);
}

