/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10189
 *  it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet
 */
package minecraft;

import Nursultan.class10189;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;

public class class03340 {
    private final int N;
    private final LongLinkedOpenHashSet[] y;
    private int L;

    public class03340(int n, int n2) {
        this.N = n;
        this.y = new LongLinkedOpenHashSet[n];
        for (int i = 0; i < n; ++i) {
            this.y[i] = new class10189(this, n2, 0.5f, n2);
        }
        this.L = n;
    }

    public boolean y() {
        return this.L >= this.N;
    }

    private void N(int n) {
        int n2 = this.L;
        this.L = n;
        for (int i = n2 + 1; i < n; ++i) {
            if (this.y[i].isEmpty()) continue;
            this.L = i;
            break;
        }
    }

    public void N(long l, int n) {
        this.y[n].add(l);
        if (this.L > n) {
            this.L = n;
        }
    }

    public void N(long l, int n, int n2) {
        LongLinkedOpenHashSet longLinkedOpenHashSet = this.y[n];
        longLinkedOpenHashSet.remove(l);
        if (longLinkedOpenHashSet.isEmpty() && this.L == n) {
            this.N(n2);
        }
    }

    public long N() {
        LongLinkedOpenHashSet longLinkedOpenHashSet = this.y[this.L];
        long l = longLinkedOpenHashSet.removeFirstLong();
        if (longLinkedOpenHashSet.isEmpty()) {
            this.N(this.N);
        }
        return l;
    }
}

