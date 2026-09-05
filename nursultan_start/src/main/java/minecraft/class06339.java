/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02183
 *  minecraft.class02226
 *  minecraft.class04206
 *  minecraft.class04711
 *  minecraft.class06142
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02183;
import minecraft.class02226;
import minecraft.class04206;
import minecraft.class04711;
import minecraft.class06142;
import minecraft.class06341;
import minecraft.class06345;
import minecraft.class06362;
import minecraft.class06378;

public class class06339 {
    private static final Codec<class06378> B = class04206.J.T().dispatch(class06378::N, class06341::N);
    public static final Codec<class06378> N = Codec.lazyInitialized(() -> {
        Codec var0 = Codec.withAlternative(B, (Codec)class06345.N.codec());
        return Codec.either((Codec)class04711.y, (Codec)var0).xmap(Either::unwrap, class063782 -> class063782 instanceof class04711 ? Either.left((Object)((class04711)class063782)) : Either.right((Object)class063782));
    });
    public static final class06341 y = class06339.N("constant", (MapCodec<? extends class06378>)class04711.N);
    public static final class06341 L = class06339.N("uniform", class06345.N);
    public static final class06341 u = class06339.N("binomial", (MapCodec<? extends class06378>)class06142.N);
    public static final class06341 i = class06339.N("score", class06362.N);
    public static final class06341 R = class06339.N("storage", (MapCodec<? extends class06378>)class02183.N);
    public static final class06341 M = class06339.N("enchantment_level", (MapCodec<? extends class06378>)class02226.N);

    private static class06341 N(String string, MapCodec<? extends class06378> mapCodec) {
        return (class06341)((Object)class00751.N((class00751)class04206.J, (class01894)class01894.y((String)string), (Object)((Object)new class06341(mapCodec))));
    }
}

