/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class00067;

@FunctionalInterface
public interface class00077<T> {
    public static <T> class00077<T> N(List<T> list, Function<T, Stream<String>> function) {
        if (list.isEmpty()) {
            return class00077.N();
        }
        class00067 class000672 = new class00067();
        for (Object t : list) {
            function.apply(t).forEach(string -> class000672.N(t, string.toLowerCase(Locale.ROOT)));
        }
        class000672.N();
        return class000672::N;
    }

    public static <T> class00077<T> N() {
        return string -> List.of();
    }

    public List<T> method_4810(String var1);
}

