/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class02998
 */
package minecraft;

import minecraft.class02131;
import minecraft.class02998;

public class class04016<T> {
    final class02131<T> N;
    T y;
    private final T L;
    private boolean u;

    public boolean L() {
        return this.u;
    }

    public class04016(class02131<T> class021312, T t) {
        this.N = class021312;
        this.L = t;
        this.y = t;
    }

    public class02998<T> i() {
        return class02998.N(this.N, this.y);
    }

    public boolean u() {
        return this.L.equals(this.y);
    }

    public T y() {
        return this.y;
    }

    public void N(T t) {
        this.y = t;
    }

    public void N(boolean bl) {
        this.u = bl;
    }

    public class02131<T> N() {
        return this.N;
    }
}

