/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04995
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class04352;
import minecraft.class04995;

public final class class04362<T>
extends Record
implements class04352<T> {
    private final List<T> values;
    private final Codec<T> codec;

    @Override
    public Optional<T> L(T t) {
        int n = class04995.N((int)(this.values.indexOf(t) - 1), (int)0, (int)(this.values.size() - 1));
        return Optional.of(this.values.get(n));
    }

    public class04362(List<T> list, Codec<T> codec) {
        this.values = list;
        this.codec = codec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04362.class, "values;codec", "values", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04362.class, "values;codec", "values", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04362.class, "values;codec", "values", "codec"}, this);
    }

    @Override
    public Optional<T> u(T t) {
        return this.values.indexOf(t) > -1 ? Optional.of(t) : Optional.empty();
    }

    @Override
    public Codec<T> y() {
        return this.codec;
    }

    @Override
    public Optional<T> y(T t) {
        int n = class04995.N((int)(this.values.indexOf(t) + 1), (int)0, (int)(this.values.size() - 1));
        return Optional.of(this.values.get(n));
    }

    public List<T> N() {
        return this.values;
    }

    @Override
    public T N(double d) {
        if (d >= 1.0) {
            d = 0.99999f;
        }
        int n = class04995.N((double)class04995.y((double)d, (double)0.0, (double)1.0, (double)0.0, (double)this.values.size()));
        return this.values.get(class04995.N((int)n, (int)0, (int)(this.values.size() - 1)));
    }

    @Override
    public double N(T t) {
        if (t == this.values.getFirst()) {
            return 0.0;
        }
        if (t == this.values.getLast()) {
            return 1.0;
        }
        return class04995.y((double)this.values.indexOf(t), (double)0.0, (double)(this.values.size() - 1), (double)0.0, (double)1.0);
    }
}

