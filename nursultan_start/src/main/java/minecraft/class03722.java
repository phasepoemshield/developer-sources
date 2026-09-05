/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07536
 */
package minecraft;

import minecraft.class04995;
import minecraft.class07536;

public class class03722 {
    private static final int N = 49;
    private static final int y = 3;
    private double L = 2000000.0;
    private int u = 1;
    private volatile long i = class07536.u();

    public float y() {
        return (float)(7000000.0 / this.L);
    }

    public void N() {
        this.i = class07536.u();
    }

    public void N(int n) {
        if (n > 0) {
            double d = class04995.N((double)((double)(class07536.u() - this.i) / (double)n), (double)(this.L / 3.0), (double)(this.L * 3.0));
            this.L = (this.L * (double)this.u + d) / (double)(this.u + 1);
            this.u = Math.min(49, this.u + 1);
        }
    }
}

