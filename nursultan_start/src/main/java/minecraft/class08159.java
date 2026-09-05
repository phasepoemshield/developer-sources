/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class08190
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class08190;

public interface class08159 {
    public static final Codec<class08159> N = class04206.Ne.T().dispatch(class08159::N, mapCodec -> mapCodec);
    public static final Codec<class08159> y = Codec.either(N, (Codec)class01894.N).xmap(either -> (class08159)either.map(class081592 -> class081592, class08190::N), class081592 -> class081592 instanceof class08190 ? Either.right((Object)((class08190)class081592).y()) : Either.left((Object)class081592));

    public MapCodec<? extends class08159> N();
}

