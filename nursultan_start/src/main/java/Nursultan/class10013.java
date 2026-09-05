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

public final class class10013<T>
extends Record
implements class02818<T> {
    private final Supplier<String> error;

    public Supplier<String> L() {
        return this.error;
    }

    public class10013(Supplier<String> supplier) {
        this.error = supplier;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10013.class, "error", "error"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10013.class, "error", "error"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10013.class, "error", "error"}, this);
    }

    public <E extends Throwable> T y(Supplier<E> supplier) throws E {
        throw (Throwable)supplier.get();
    }

    public String y() {
        return this.error.get();
    }

    public @Nullable T y(@Nullable T t) {
        return t;
    }

    public <R> class02818<R> N_11(Function<T, R> function) {
        return new class10013<T>(this.error);
    }

    public boolean N() {
        return false;
    }

    public class02818<T> N_36(Consumer<T> consumer) {
        return this;
    }
}

