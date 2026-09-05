/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class04206
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import minecraft.class02139;
import minecraft.class02151;
import minecraft.class04206;
import minecraft.class06069;

public abstract class class02142 {
    private static final Codec<Either<Integer, class02142>> N = Codec.either((Codec)Codec.INT, (Codec)class04206.V.T().dispatch(class02142::u, class02139::codec));
    public static final Codec<class02142> L = N.xmap(either -> (class02142)either.map(class02151::N, class021422 -> class021422), class021422 -> class021422.u() == class02139.N ? Either.left((Object)((class02151)class021422).N()) : Either.right((Object)class021422));
    public static final Codec<class02142> u = class02142.N(0, Integer.MAX_VALUE);
    public static final Codec<class02142> i = class02142.N(1, Integer.MAX_VALUE);

    public abstract int L();

    public abstract class02139<?> u();

    public abstract int y();

    public abstract int N(class06069 var1);

    private static <T extends class02142> DataResult<T> N(int n, int n2, T t) {
        if (t.y() < n) {
            return DataResult.error(() -> "Value provider too low: " + n + " [" + t.y() + "-" + t.L() + "]");
        }
        if (t.L() > n2) {
            return DataResult.error(() -> "Value provider too high: " + n2 + " [" + t.y() + "-" + t.L() + "]");
        }
        return DataResult.success(t);
    }

    public static <T extends class02142> Codec<T> N(int n, int n2, Codec<T> codec) {
        return codec.validate(class021422 -> class02142.N(n, n2, class021422));
    }

    public static Codec<class02142> N(int n, int n2) {
        return class02142.N(n, n2, L);
    }
}

