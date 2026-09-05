/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import minecraft.class06046;
import minecraft.class06048;
import minecraft.class06057;
import minecraft.class06063;

public interface class06055 {
    public static final Codec<class06055> N = Codec.xor(class06046.u, (Codec)Codec.xor(class06048.u, class06063.u)).xmap(class06055::N, class06055::N);
    public static final class06055 y = class06055.y(0);
    public static final class06055 L = class06055.L(0);

    public static class06055 L(int n) {
        return new class06063(n);
    }

    public static class06055 y() {
        return L;
    }

    public static class06055 y(int n) {
        return new class06048(n);
    }

    private static Either<class06046, Either<class06048, class06063>> N(class06055 class060552) {
        if (class060552 instanceof class06046) {
            return Either.left((Object)((class06046)class060552));
        }
        return Either.right((Object)(class060552 instanceof class06048 ? Either.left((Object)((class06048)class060552)) : Either.right((Object)((class06063)class060552))));
    }

    public int N(class06057 var1);

    public static class06055 N(int n) {
        return new class06046(n);
    }

    private static class06055 N(Either<class06046, Either<class06048, class06063>> either) {
        return (class06055)either.map(Function.identity(), Either::unwrap);
    }

    public static class06055 N() {
        return y;
    }
}

