/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02818
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class02818;
import org.jspecify.annotations.Nullable;

public final class class10015<T>
extends Record
implements class02818<T> {
    private final T value;

    public T L() {
        return this.value;
    }

    public class10015(T t) {
        this.value = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10015.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10015.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10015.class, "value", "value"}, this);
    }

    public <E extends Throwable> T y(Supplier<E> supplier) throws E {
        return this.value;
    }

    public @Nullable String y() {
        return null;
    }

    public T y(@Nullable T t) {
        return this.value;
    }

    public <R> class02818<R> N_11(Function<T, R> function) {
        return new class10015<R>(function.apply(this.value));
    }

    public boolean N() {
        return true;
    }

    public class02818<T> N_36(Consumer<T> consumer) {
        consumer.accept(this.value);
        return this;
    }
}

