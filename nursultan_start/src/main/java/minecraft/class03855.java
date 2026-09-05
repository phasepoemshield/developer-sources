/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  minecraft.class04206
 *  minecraft.class06055
 *  minecraft.class06057
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import minecraft.class03850;
import minecraft.class03862;
import minecraft.class04206;
import minecraft.class06055;
import minecraft.class06057;
import minecraft.class06069;

public abstract class class03855 {
    private static final Codec<Either<class06055, class03855>> N = Codec.either((Codec)class06055.N, (Codec)class04206.e.T().dispatch(class03855::N, class03862::codec));
    public static final Codec<class03855> L = N.xmap(either -> (class03855)either.map(class03850::N, class038552 -> class038552), class038552 -> class038552.N() == class03862.N ? Either.left((Object)((class03850)class038552).y()) : Either.right((Object)class038552));

    public abstract int N(class06069 var1, class06057 var2);

    public abstract class03862<?> N();
}

