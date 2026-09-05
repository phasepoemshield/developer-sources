/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.api;

import java.util.Objects;
import java.util.function.Supplier;

public final class LazyResettable<T>
implements Supplier<T> {
    private final Supplier<T> supplier;
    private T value = null;
    private boolean supplied = false;

    public LazyResettable(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public void reset() {
        this.supplied = false;
        this.value = null;
    }

    @Override
    public T get() {
        if (!this.supplied) {
            this.value = this.supplier.get();
            this.supplied = true;
        }
        return this.value;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        LazyResettable lazyResettable = (LazyResettable)object;
        return Objects.equals(this.get(), lazyResettable.get());
    }

    public int hashCode() {
        T t = this.get();
        return t != null ? t.hashCode() : 0;
    }
}

