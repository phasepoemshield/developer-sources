/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09805;
import java.util.Objects;
import java.util.function.Supplier;

final class class09848<T> {
    private T N;
    T y;
    Supplier<T> L;
    class09805<T> u;

    class09848(T t, Supplier<T> supplier, class09805<T> class098052) {
        this.N = t;
        this.y = t;
        this.L = Objects.requireNonNull(supplier, "snapshotSupplier");
        this.u = Objects.requireNonNull(class098052, "changeDetector");
    }

    void y() {
        this.N = this.y;
    }

    boolean N() {
        T t = this.L.get();
        return this.u.changed(this.N, t);
    }
}

