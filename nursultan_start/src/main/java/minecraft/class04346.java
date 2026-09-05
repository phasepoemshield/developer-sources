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
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class04361;
import minecraft.class06363;

public final class class04346<T>
extends Record
implements class04361<T> {
    private final Supplier<List<T>> values;
    private final Function<T, Optional<T>> validateValue;
    private final Codec<T> codec;

    public Supplier<List<T>> L() {
        return this.values;
    }

    public class04346(Supplier<List<T>> supplier, Function<T, Optional<T>> function, Codec<T> codec) {
        this.values = supplier;
        this.validateValue = function;
        this.codec = codec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04346.class, "values;validateValue;codec", "values", "validateValue", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04346.class, "values;validateValue;codec", "values", "validateValue", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04346.class, "values;validateValue;codec", "values", "validateValue", "codec"}, this);
    }

    public Function<T, Optional<T>> u() {
        return this.validateValue;
    }

    @Override
    public Optional<T> u(T t) {
        return this.validateValue.apply(t);
    }

    @Override
    public Codec<T> y() {
        return this.codec;
    }

    @Override
    public class06363<T> N() {
        return class06363.N((Collection)this.values.get());
    }
}

