/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import org.jspecify.annotations.Nullable;

public interface class00750<T>
extends Iterable<T> {
    public static final int N = -1;

    public int L();

    default public int L(T t) {
        int n = this.N(t);
        if (n == -1) {
            throw new IllegalArgumentException("Can't find id for '" + String.valueOf(t) + "' in map " + String.valueOf(this));
        }
        return n;
    }

    default public T y(int n) {
        T t = this.N(n);
        if (t == null) {
            throw new IllegalArgumentException("No value with id " + n);
        }
        return t;
    }

    public @Nullable T N(int var1);

    public int N(T var1);
}

