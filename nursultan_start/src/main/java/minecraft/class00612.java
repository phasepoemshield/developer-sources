/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  minecraft.class02566
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import minecraft.class00589;
import minecraft.class00607;
import minecraft.class00610;
import minecraft.class02566;
import minecraft.class06338;

@FunctionalInterface
public interface class00612
extends class00589<Integer> {
    @Override
    default public Codec<Integer> argumentCodec(class00607<Integer> class006072) {
        return Codec.either((Codec)class06338.P, (Codec)class06338.E).xmap(Either::unwrap, n -> class02566.y((int)n) == 255 ? Either.right((Object)n) : Either.left((Object)n));
    }

    @Override
    default public class00610<Integer> argumentKeyframeLerp(class00607<Integer> class006072) {
        return class00610.L();
    }
}

