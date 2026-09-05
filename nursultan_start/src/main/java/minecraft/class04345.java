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
import java.util.function.BooleanSupplier;
import minecraft.class04356;
import minecraft.class04361;
import minecraft.class06363;

public final class class04345<T>
extends Record
implements class04361<T> {
    private final List<T> values;
    private final List<T> altValues;
    private final BooleanSupplier altCondition;
    private final class04356<T> valueSetter;
    private final Codec<T> codec;

    public List<T> L() {
        return this.values;
    }

    public class04345(List<T> list, List<T> list2, BooleanSupplier booleanSupplier, class04356<T> class043562, Codec<T> codec) {
        this.values = list;
        this.altValues = list2;
        this.altCondition = booleanSupplier;
        this.valueSetter = class043562;
        this.codec = codec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04345.class, "values;altValues;altCondition;valueSetter;codec", "values", "altValues", "altCondition", "valueSetter", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04345.class, "values;altValues;altCondition;valueSetter;codec", "values", "altValues", "altCondition", "valueSetter", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04345.class, "values;altValues;altCondition;valueSetter;codec", "values", "altValues", "altCondition", "valueSetter", "codec"}, this);
    }

    public BooleanSupplier i() {
        return this.altCondition;
    }

    public List<T> u() {
        return this.altValues;
    }

    @Override
    public Optional<T> u(T t) {
        return (this.altCondition.getAsBoolean() ? this.altValues : this.values).contains(t) ? Optional.of(t) : Optional.empty();
    }

    @Override
    public Codec<T> y() {
        return this.codec;
    }

    @Override
    public class06363<T> N() {
        return class06363.N((BooleanSupplier)this.altCondition, this.values, this.altValues);
    }

    @Override
    public class04356<T> R() {
        return this.valueSetter;
    }
}

