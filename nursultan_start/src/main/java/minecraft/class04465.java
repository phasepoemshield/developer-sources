/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 */
package minecraft;

import minecraft.class06889;

public class class04465 {
    private static final double N = 4096.0;
    private class06889 y = class06889.L;

    public long L(class06889 class068892) {
        return class04465.N(class068892.Z) - class04465.N(this.y.Z);
    }

    public void i(class06889 class068892) {
        this.y = class068892;
    }

    public class06889 u(class06889 class068892) {
        return class068892.u(this.y);
    }

    public long y(class06889 class068892) {
        return class04465.N(class068892.B) - class04465.N(this.y.B);
    }

    public class06889 N() {
        return this.y;
    }

    static long N(double d) {
        return Math.round(d * 4096.0);
    }

    static double N(long l) {
        return (double)l / 4096.0;
    }

    public class06889 N(long l, long l2, long l3) {
        if (l == 0L && l2 == 0L && l3 == 0L) {
            return this.y;
        }
        double d = l == 0L ? this.y.M : class04465.N(class04465.N(this.y.M) + l);
        double d2 = l2 == 0L ? this.y.B : class04465.N(class04465.N(this.y.B) + l2);
        double d3 = l3 == 0L ? this.y.Z : class04465.N(class04465.N(this.y.Z) + l3);
        return new class06889(d, d2, d3);
    }

    public long N(class06889 class068892) {
        return class04465.N(class068892.M) - class04465.N(this.y.M);
    }
}

