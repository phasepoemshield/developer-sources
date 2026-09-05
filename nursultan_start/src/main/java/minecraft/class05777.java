/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class06069;

public class class05777 {
    private static final int N = 40;
    private static final int y = 80;
    private static final int L = 400;
    private final class06069 u;
    private long i;
    private long R;
    private int M;

    public boolean L(long l) {
        return l >= this.R;
    }

    class05777(class06069 class060692, long l) {
        this.u = class060692;
        this.N(l);
    }

    public String toString() {
        return "RetryMarker{, previousAttemptAt=" + this.i + ", nextScheduledAttemptAt=" + this.R + ", currentDelay=" + this.M + "}";
    }

    public boolean y(long l) {
        return l - this.i < 400L;
    }

    public void N(long l) {
        this.i = l;
        int n = this.M + this.u.y(40) + 40;
        this.M = Math.min(n, 400);
        this.R = l + (long)this.M;
    }
}

