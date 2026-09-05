/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06069
 *  minecraft.class07536
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import minecraft.class06069;
import minecraft.class07536;

public class class04531 {
    private class04531() {
    }

    public static <T> Optional<T> N(class06069 class060692, List<T> list, ToIntFunction<T> toIntFunction) {
        return class04531.N(class060692, list, class04531.N(list, toIntFunction), toIntFunction);
    }

    public static <T> Optional<T> N(List<T> list, int n, ToIntFunction<T> toIntFunction) {
        for (T t : list) {
            if ((n -= toIntFunction.applyAsInt(t)) >= 0) continue;
            return Optional.of(t);
        }
        return Optional.empty();
    }

    public static <T> Optional<T> N(class06069 class060692, List<T> list, int n, ToIntFunction<T> toIntFunction) {
        if (n < 0) {
            throw (IllegalArgumentException)class07536.y((Throwable)new IllegalArgumentException("Negative total weight in getRandomItem"));
        }
        if (n == 0) {
            return Optional.empty();
        }
        int n2 = class060692.y(n);
        return class04531.N(list, n2, toIntFunction);
    }

    public static <T> int N(List<T> list, ToIntFunction<T> toIntFunction) {
        long l = 0L;
        for (T t : list) {
            l += (long)toIntFunction.applyAsInt(t);
        }
        if (l > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Sum of weights must be <= 2147483647");
        }
        return (int)l;
    }
}

