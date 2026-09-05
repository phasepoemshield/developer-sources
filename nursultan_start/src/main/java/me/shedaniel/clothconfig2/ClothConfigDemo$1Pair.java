/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2;

import java.util.Objects;

class ClothConfigDemo$1Pair<T, R> {
    final T t;
    final R r;

    public ClothConfigDemo$1Pair(T t, R r) {
        this.t = t;
        this.r = r;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ClothConfigDemo$1Pair clothConfigDemo$1Pair = (ClothConfigDemo$1Pair)object;
        if (!Objects.equals(this.t, clothConfigDemo$1Pair.t)) {
            return false;
        }
        return Objects.equals(this.r, clothConfigDemo$1Pair.r);
    }

    public int hashCode() {
        int n = this.t != null ? this.t.hashCode() : 0;
        n = 31 * n + (this.r != null ? this.r.hashCode() : 0);
        return n;
    }

    public T getLeft() {
        return this.t;
    }

    public R getRight() {
        return this.r;
    }
}

