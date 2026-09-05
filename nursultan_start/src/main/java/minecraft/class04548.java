/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import minecraft.class06338;

public final class class04548<T extends Comparable<T>>
extends Record {
    private final T minInclusive;
    private final T maxInclusive;
    public static final Codec<class04548<Integer>> N = class04548.N(Codec.INT);

    public class04548(T t, T t2) {
        if (t.compareTo(t2) > 0) {
            throw new IllegalArgumentException("min_inclusive must be less than or equal to max_inclusive");
        }
        this.minInclusive = t;
        this.maxInclusive = t2;
    }

    public class04548(T t) {
        this(t, t);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04548.class, "minInclusive;maxInclusive", "minInclusive", "maxInclusive"}, this, object);
    }

    public String toString() {
        return "[" + String.valueOf(this.minInclusive) + ", " + String.valueOf(this.maxInclusive) + "]";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04548.class, "minInclusive;maxInclusive", "minInclusive", "maxInclusive"}, this);
    }

    public T y() {
        return this.maxInclusive;
    }

    public static <T extends Comparable<T>> Codec<class04548<T>> N(Codec<T> codec) {
        return class06338.N(codec, (String)"min_inclusive", (String)"max_inclusive", class04548::N, class04548::N, class04548::y);
    }

    public static <T extends Comparable<T>> DataResult<class04548<T>> N(T t, T t2) {
        if (t.compareTo(t2) <= 0) {
            return DataResult.success(new class04548<T>(t, t2));
        }
        return DataResult.error(() -> "min_inclusive must be less than or equal to max_inclusive");
    }

    public <S extends Comparable<S>> class04548<S> N(Function<? super T, ? extends S> function) {
        return new class04548<Comparable>((Comparable)function.apply(this.minInclusive), (Comparable)function.apply(this.maxInclusive));
    }

    public boolean N(T t) {
        return t.compareTo(this.minInclusive) >= 0 && t.compareTo(this.maxInclusive) <= 0;
    }

    public boolean N(class04548<T> class045482) {
        return class045482.N().compareTo(this.minInclusive) >= 0 && class045482.maxInclusive.compareTo(this.maxInclusive) <= 0;
    }

    public static <T extends Comparable<T>> Codec<class04548<T>> N(Codec<T> codec, T t, T t2) {
        return class04548.N(codec).validate(class045482 -> {
            if (class045482.N().compareTo(t) < 0) {
                return DataResult.error(() -> "Range limit too low, expected at least " + String.valueOf(t) + " [" + String.valueOf(class045482.N()) + "-" + String.valueOf(class045482.y()) + "]");
            }
            if (class045482.y().compareTo(t2) > 0) {
                return DataResult.error(() -> "Range limit too high, expected at most " + String.valueOf(t2) + " [" + String.valueOf(class045482.N()) + "-" + String.valueOf(class045482.y()) + "]");
            }
            return DataResult.success((Object)class045482);
        });
    }

    public T N() {
        return this.minInclusive;
    }
}

