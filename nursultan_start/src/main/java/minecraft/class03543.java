/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10210
 *  com.mojang.datafixers.util.Either
 *  minecraft.class02042
 *  minecraft.class06069
 */
package minecraft;

import Nursultan.class10210;
import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class02042;
import minecraft.class03522;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class03556;
import minecraft.class06069;

public interface class03543<T>
extends Iterable<class03556<T>> {
    public boolean L();

    public Optional<class03530<T>> i();

    public Either<class03530<T>, List<class03556<T>>> u();

    public int y();

    @SafeVarargs
    public static <T> class03522<T> N(class03556<T> ... class03556Array) {
        return new class03522<T>(List.of(class03556Array));
    }

    @Deprecated
    public static <T> class03552<T> N(class02042<T> class020422, class03530<T> class035302) {
        return new class10210(class020422, class035302);
    }

    public static <E, T> class03522<T> N(Function<E, class03556<T>> function, Collection<E> collection) {
        return class03543.N(collection.stream().map(function).toList());
    }

    public static <T> class03522<T> N(List<? extends class03556<T>> list) {
        return new class03522(List.copyOf(list));
    }

    @SafeVarargs
    public static <E, T> class03522<T> N(Function<E, class03556<T>> function, E ... EArray) {
        return class03543.N(Stream.of(EArray).map(function).toList());
    }

    public Stream<class03556<T>> N();

    public Optional<class03556<T>> N(class06069 var1);

    public class03556<T> N(int var1);

    public boolean N(class03556<T> var1);

    public boolean N(class02042<T> var1);

    public static <T> class03543<T> R() {
        return class03522.N;
    }
}

