/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07536
 */
package minecraft;

import minecraft.class07536;

public class class05113 {
    private volatile long N;
    private volatile long y;
    private long L = class07536.L();
    private long u;
    private long i;

    public long L() {
        return this.N;
    }

    public void M() {
        long l = class07536.L();
        long l2 = l - this.L;
        if (l2 < 1000L) {
            return;
        }
        long l3 = this.N;
        this.i = 1000L * (l3 - this.u) / l2;
        this.u = l3;
        this.L = l;
    }

    public long B() {
        return this.i;
    }

    public boolean i() {
        return this.N >= this.y;
    }

    public boolean u() {
        return this.N > 0L;
    }

    public void y(long l) {
        this.N = l;
    }

    public long y() {
        return this.y;
    }

    public void N(long l) {
        this.y = l;
    }

    public void N() {
        this.N = 0L;
        this.L = class07536.L();
        this.u = 0L;
        this.i = 0L;
    }

    public double R() {
        return Math.min((double)this.L() / (double)this.y(), 1.0);
    }
}

