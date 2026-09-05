/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04359
 *  minecraft.class04372
 *  minecraft.class04995
 *  minecraft.class06363
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.Optional;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import minecraft.class04359;
import minecraft.class04372;
import minecraft.class04995;
import minecraft.class06363;

public final class class04343
extends Record
implements class04359<Integer>,
class04372 {
    private final int minInclusive;
    private final IntSupplier maxSupplier;
    private final int encodableMaxInclusive;

    public int L() {
        return this.maxSupplier.getAsInt();
    }

    public IntSupplier M() {
        return this.maxSupplier;
    }

    public class04343(int n, IntSupplier intSupplier, int n2) {
        this.minInclusive = n;
        this.maxSupplier = intSupplier;
        this.encodableMaxInclusive = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04343.class, "minInclusive;maxSupplier;encodableMaxInclusive", "minInclusive", "maxSupplier", "encodableMaxInclusive"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04343.class, "minInclusive;maxSupplier;encodableMaxInclusive", "minInclusive", "maxSupplier", "encodableMaxInclusive"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04343.class, "minInclusive;maxSupplier;encodableMaxInclusive", "minInclusive", "maxSupplier", "encodableMaxInclusive"}, this);
    }

    public int B() {
        return this.encodableMaxInclusive;
    }

    public boolean i() {
        return true;
    }

    public Codec<Integer> y() {
        return Codec.INT.validate(n -> {
            int n2 = this.encodableMaxInclusive + 1;
            if (n.compareTo(this.minInclusive) >= 0 && n.compareTo(n2) <= 0) {
                return DataResult.success((Object)n);
            }
            return DataResult.error(() -> "Value " + n + " outside of range [" + this.minInclusive + ":" + n2 + "]", (Object)n);
        });
    }

    public Optional<Integer> u(Integer n) {
        return Optional.of(class04995.N((int)n, (int)this.aA_(), (int)this.L()));
    }

    public class06363<Integer> N() {
        return class06363.N((Collection)IntStream.range(this.minInclusive, this.L() + 1).boxed().toList());
    }

    public int aA_() {
        return this.minInclusive;
    }
}

