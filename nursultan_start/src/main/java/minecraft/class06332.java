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
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06329;
import minecraft.class06340;
import minecraft.class06348;
import minecraft.class06353;

public class class06332 {
    private static final Codec<class06348> u = class04206.q.T().dispatch(class06348::N, class06353::N);
    public static final Codec<class06348> N = Codec.lazyInitialized(() -> Codec.either(class06340.y, u).xmap(Either::unwrap, class063482 -> class063482 instanceof class06340 ? Either.left((Object)((class06340)class063482)) : Either.right((Object)class063482)));
    public static final class06353 y = class06332.N("fixed", class06329.N);
    public static final class06353 L = class06332.N("context", class06340.N);

    private static class06353 N(String string, MapCodec<? extends class06348> mapCodec) {
        return (class06353)((Object)class00751.N((class00751)class04206.q, (class01894)class01894.y((String)string), (Object)((Object)new class06353(mapCodec))));
    }
}

