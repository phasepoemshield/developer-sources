/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class06456;

class class06471 {
    public final Class<? extends class06456> N;
    public final int y;
    public int L;
    public final int u;
    public final boolean i;

    public class06471(Class<? extends class06456> clazz, int n, int n2, boolean bl) {
        this.N = clazz;
        this.y = n;
        this.u = n2;
        this.i = bl;
    }

    public class06471(Class<? extends class06456> clazz, int n, int n2) {
        this(clazz, n, n2, false);
    }

    public boolean N() {
        return this.u == 0 || this.L < this.u;
    }

    public boolean N(int n) {
        return this.u == 0 || this.L < this.u;
    }
}

