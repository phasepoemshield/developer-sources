/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06363
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class04361;
import minecraft.class06363;

public final class class04380<T>
extends Record
implements class04361<T> {
    private final List<T> values;
    private final Codec<T> codec;

    public List<T> L() {
        return this.values;
    }

    public class04380(List<T> list, Codec<T> codec) {
        this.values = list;
        this.codec = codec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04380.class, "values;codec", "values", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04380.class, "values;codec", "values", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04380.class, "values;codec", "values", "codec"}, this);
    }

    @Override
    public Optional<T> u(T t) {
        return this.values.contains(t) ? Optional.of(t) : Optional.empty();
    }

    @Override
    public Codec<T> y() {
        return this.codec;
    }

    @Override
    public class06363<T> N() {
        return class06363.N(this.values);
    }
}

