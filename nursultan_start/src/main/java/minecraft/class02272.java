/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01675
 */
package minecraft;

import minecraft.class01675;

public abstract class class02272
implements class01675 {
    protected final long[] N;
    protected final long[] y;

    protected class02272(int n, long[] lArray) {
        if (lArray.length != n) {
            throw new IllegalArgumentException("defaults have incorrect length of " + lArray.length);
        }
        this.y = new long[n];
        this.N = lArray;
    }

    protected void y() {
        System.arraycopy(this.N, 0, this.y, 0, this.N.length);
    }

    public void N(long l, int n) {
        if (n < 1 || n >= this.y.length) {
            throw new IndexOutOfBoundsException(n + " out of bounds for dimensions " + this.y.length);
        }
        this.y[n] = l;
    }

    protected abstract void N();

    public void N(long[] lArray) {
        System.arraycopy(lArray, 0, this.y, 0, lArray.length);
        this.N();
        this.y();
    }

    public void N(long l) {
        this.y[0] = l;
        this.N();
        this.y();
    }
}

