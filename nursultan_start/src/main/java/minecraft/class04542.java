/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2DoubleMap
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2DoubleMap;

public class class04542 {
    private final Int2DoubleMap N;
    private final int y;
    private final int L;

    public class04542(int n, int n2, Int2DoubleMap int2DoubleMap) {
        this.y = n;
        this.L = n2;
        this.N = int2DoubleMap;
    }

    public int y() {
        return this.L;
    }

    public double N(int n) {
        return this.N.get(n);
    }

    public int N() {
        return this.y;
    }
}

