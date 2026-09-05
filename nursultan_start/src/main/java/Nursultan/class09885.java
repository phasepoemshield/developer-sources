/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02418
 */
package Nursultan;

import minecraft.class02418;

public final class class09885<T>
implements AutoCloseable {
    public final class02418<T> N;
    public final T y;
    public int L;

    public class09885(class02418<T> class024182, T t, int n) {
        this.N = class024182;
        this.y = t;
        this.L = n;
    }

    @Override
    public void close() {
        this.N.N(this.y);
    }
}

