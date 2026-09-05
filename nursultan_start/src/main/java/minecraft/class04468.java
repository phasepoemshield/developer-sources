/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10398
 *  Nursultan.class10400
 *  minecraft.class00067
 *  minecraft.class01894
 */
package minecraft;

import Nursultan.class10398;
import Nursultan.class10400;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class00067;
import minecraft.class01894;

public interface class04468<T> {
    public List<T> y(String var1);

    public List<T> N(String var1);

    public static <T> class04468<T> N(List<T> list, Function<T, Stream<class01894>> function) {
        if (list.isEmpty()) {
            return class04468.N();
        }
        class00067 class000672 = new class00067();
        class00067 class000673 = new class00067();
        for (Object t : list) {
            function.apply(t).forEach(class018942 -> {
                class000672.N(t, class018942.y().toLowerCase(Locale.ROOT));
                class000673.N(t, class018942.N().toLowerCase(Locale.ROOT));
            });
        }
        class000672.N();
        class000673.N();
        return new class10398(class000672, class000673);
    }

    public static <T> class04468<T> N() {
        return new class10400();
    }
}

