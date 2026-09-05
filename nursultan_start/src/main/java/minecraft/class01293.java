/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05010
 */
package minecraft;

import minecraft.class01296;
import minecraft.class05010;

public abstract class class01293
extends class05010 {
    protected class01293(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    protected int y(long l, long l2, int n) {
        if (this.N(l)) {
            return this.y(l2);
        }
        return n + 1;
    }

    protected abstract int y(long var1);

    public void y(long l, int n, boolean bl) {
        this.N(Long.MAX_VALUE, l, n, bl);
    }

    protected int N(long l, long l2, int n) {
        int n2 = n;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    long l3 = class01296.N(l, i, j, k);
                    if (l3 == l) {
                        l3 = Long.MAX_VALUE;
                    }
                    if (l3 == l2) continue;
                    int n3 = this.y(l3, l, this.L(l3));
                    if (n2 > n3) {
                        n2 = n3;
                    }
                    if (n2 != 0) continue;
                    return n2;
                }
            }
        }
        return n2;
    }

    protected void N(long l, int n, boolean bl) {
        if (bl && n >= this.R - 2) {
            return;
        }
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    long l2 = class01296.N(l, i, j, k);
                    if (l2 == l) continue;
                    this.y(l, l2, n, bl);
                }
            }
        }
    }
}

