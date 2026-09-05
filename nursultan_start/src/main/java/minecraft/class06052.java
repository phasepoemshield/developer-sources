/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  minecraft.class03621
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import minecraft.class03621;
import minecraft.class04206;
import minecraft.class06042;
import minecraft.class06061;

public abstract class class06052
implements class03621 {
    private static final Codec<Either<Float, class06052>> N = Codec.either((Codec)Codec.FLOAT, (Codec)class04206.K.T().dispatch(class06052::L, class06061::codec));
    public static final Codec<class06052> L = N.xmap(either -> (class06052)either.map(class06042::N, class060522 -> class060522), class060522 -> class060522.L() == class06061.N ? Either.left((Object)Float.valueOf(((class06042)class060522).u())) : Either.right((Object)class060522));

    public abstract class06061<?> L();

    public abstract float y();

    public abstract float N();

    public static Codec<class06052> N(float f, float f2) {
        return L.validate(class060522 -> {
            if (class060522.N() < f) {
                return DataResult.error(() -> "Value provider too low: " + f + " [" + class060522.N() + "-" + class060522.y() + "]");
            }
            if (class060522.y() > f2) {
                return DataResult.error(() -> "Value provider too high: " + f2 + " [" + class060522.N() + "-" + class060522.y() + "]");
            }
            return DataResult.success((Object)class060522);
        });
    }
}

