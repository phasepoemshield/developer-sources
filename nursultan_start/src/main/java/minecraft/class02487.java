/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02470;
import minecraft.class02477;
import minecraft.class02481;
import minecraft.class02500;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public interface class02487<T extends class02500> {
    public static final Codec<class02487<?>> N = Codec.either((Codec)class04206.Ns.T(), (Codec)class04206.NW.T()).xmap(class02487::N, class02487::N);
    public static final class02362<class04247, class02487<?>> y = class02389.N((class02362)class02389.N((class05946)class04227.T), (class02362)class02389.N((class05946)class04227.b)).N_10(class02487::N, class02487::N);

    public Codec<T> L();

    public class02362<class04247, class02470<T>> i();

    public MapCodec<class02470<T>> u();

    private static class02487<?> N(Either<class02487<?>, class02477<?>> either) {
        return (class02487)either.map(class024872 -> class024872, class02481::N);
    }

    private static <T extends class02487<?>> Either<T, class02477<?>> N(T t) {
        return t instanceof class02481 ? Either.right(((class02481)t).y()) : Either.left(t);
    }
}

