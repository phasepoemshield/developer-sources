/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09767
 *  com.mojang.serialization.Codec
 */
package minecraft;

import Nursultan.class09767;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class02641;
import minecraft.class02656;

public interface class02638<T, P extends Predicate<T>>
extends Predicate<Iterable<T>> {
    public static <T, P extends Predicate<T>> class02638<T, P> N(List<P> list) {
        return switch (list.size()) {
            case 0 -> new class09767();
            case 1 -> new class02656((Predicate)list.getFirst());
            default -> new class02641(list);
        };
    }

    @SafeVarargs
    public static <T, P extends Predicate<T>> class02638<T, P> N(P ... PArray) {
        return class02638.N(List.of(PArray));
    }

    public static <T, P extends Predicate<T>> Codec<class02638<T, P>> N(Codec<P> codec) {
        return codec.listOf().xmap(class02638::N, class02638::N);
    }

    public List<P> N();
}

