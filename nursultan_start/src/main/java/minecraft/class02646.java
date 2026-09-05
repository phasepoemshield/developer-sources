/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09766
 *  com.mojang.serialization.Codec
 *  minecraft.class02664
 */
package minecraft;

import Nursultan.class09766;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class02620;
import minecraft.class02633;
import minecraft.class02664;

public interface class02646<T, P extends Predicate<T>>
extends Predicate<Iterable<T>> {
    public static <T, P extends Predicate<T>> class02646<T, P> N(List<class02620<T, P>> list) {
        return switch (list.size()) {
            case 0 -> new class09766();
            case 1 -> new class02664((class02620)((Object)list.getFirst()));
            default -> new class02633<T, P>(list);
        };
    }

    @SafeVarargs
    public static <T, P extends Predicate<T>> class02646<T, P> N(class02620<T, P> ... class02620Array) {
        return class02646.N(List.of(class02620Array));
    }

    public static <T, P extends Predicate<T>> Codec<class02646<T, P>> N(Codec<P> codec) {
        return class02620.N(codec).listOf().xmap(class02646::N, class02646::N);
    }

    public List<class02620<T, P>> N();
}

