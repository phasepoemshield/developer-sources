/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class07211;

public class class06433 {
    final int N;
    public final class06433[] y = new class06433[6];
    public final boolean[] L = new boolean[6];
    public boolean u;
    boolean i;
    private int R;

    public int L() {
        int n = 0;
        for (int i = 0; i < 6; ++i) {
            if (!this.L[i]) continue;
            ++n;
        }
        return n;
    }

    public class06433(int n) {
        this.N = n;
    }

    public boolean y() {
        return this.N >= 75;
    }

    public boolean N(int n) {
        if (this.i) {
            return true;
        }
        this.R = n;
        for (int i = 0; i < 6; ++i) {
            if (this.y[i] == null || !this.L[i] || this.y[i].R == n || !this.y[i].N(n)) continue;
            return true;
        }
        return false;
    }

    public void N() {
        for (int i = 0; i < 6; ++i) {
            this.L[i] = this.y[i] != null;
        }
    }

    public void N(class07211 class072112, class06433 class064332) {
        this.y[class072112.L()] = class064332;
        class064332.y[class072112.b().L()] = this;
    }
}

