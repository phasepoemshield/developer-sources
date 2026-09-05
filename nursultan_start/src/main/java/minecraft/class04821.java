/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04831
 *  minecraft.class04837
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04791;
import minecraft.class04794;
import minecraft.class04831;
import minecraft.class04837;

public class class04821 {
    private static final Codec<class04794> u = class04206.o.T().dispatch(class04794::N, class04837::N);
    public static final Codec<class04794> N = Codec.lazyInitialized(() -> Codec.either(class04791.y, u).xmap(Either::unwrap, class047942 -> class047942 instanceof class04791 ? Either.left((Object)((class04791)class047942)) : Either.right((Object)class047942)));
    public static final class04837 y = class04821.N("storage", (MapCodec<? extends class04794>)class04831.N);
    public static final class04837 L = class04821.N("context", class04791.N);

    private static class04837 N(String string, MapCodec<? extends class04794> mapCodec) {
        return (class04837)class00751.N((class00751)class04206.o, (class01894)class01894.y((String)string), (Object)new class04837(mapCodec));
    }
}

