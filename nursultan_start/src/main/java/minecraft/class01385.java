/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  minecraft.class08019
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Predicate;
import minecraft.class01401;
import minecraft.class01432;
import minecraft.class08019;

interface class01385
extends Predicate<class08019> {
    public static final Codec<class01385> y = Codec.either(class01401.N, class01432.N).xmap(Either::unwrap, class013852 -> {
        if (class013852 instanceof class01401) {
            return Either.left((Object)((class01401)class013852));
        }
        if (class013852 instanceof class01432) {
            return Either.right((Object)((class01432)class013852));
        }
        throw new UnsupportedOperationException();
    });
}

