/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09775;
import java.util.Objects;
import java.util.function.Supplier;

public final class class09804<T> {
    private final Supplier<T> N;
    private final boolean y;

    class09804(Supplier<T> supplier) {
        this.N = Objects.requireNonNull(supplier, "defaultValue");
        this.y = true;
    }

    class09804(T t) {
        this.N = () -> t;
        this.y = true;
    }

    class09804() {
        this.N = null;
        this.y = false;
    }

    public T y() {
        if (!this.y) {
            throw new class09775("Context has no default value: " + String.valueOf(this));
        }
        return this.N.get();
    }

    public boolean N() {
        return this.y;
    }
}

