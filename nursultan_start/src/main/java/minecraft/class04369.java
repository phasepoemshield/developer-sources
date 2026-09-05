/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class04372;

public final class class04369
extends Record
implements class04372 {
    private final int minInclusive;
    private final int maxInclusive;
    private final boolean applyValueImmediately;

    @Override
    public int L() {
        return this.maxInclusive;
    }

    public class04369(int n, int n2) {
        this(n, n2, true);
    }

    public class04369(int n, int n2, boolean bl) {
        this.minInclusive = n;
        this.maxInclusive = n2;
        this.applyValueImmediately = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04369.class, "minInclusive;maxInclusive;applyValueImmediately", "minInclusive", "maxInclusive", "applyValueImmediately"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04369.class, "minInclusive;maxInclusive;applyValueImmediately", "minInclusive", "maxInclusive", "applyValueImmediately"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04369.class, "minInclusive;maxInclusive;applyValueImmediately", "minInclusive", "maxInclusive", "applyValueImmediately"}, this);
    }

    @Override
    public boolean u() {
        return this.applyValueImmediately;
    }

    @Override
    public Codec<Integer> y() {
        return Codec.intRange((int)this.minInclusive, (int)(this.maxInclusive + 1));
    }

    @Override
    public Optional<Integer> u(Integer n) {
        return n.compareTo(this.aA_()) >= 0 && n.compareTo(this.L()) <= 0 ? Optional.of(n) : Optional.empty();
    }

    @Override
    public int aA_() {
        return this.minInclusive;
    }
}

