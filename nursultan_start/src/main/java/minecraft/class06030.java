/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public class class06030 {
    private final long[] N;
    private int y;
    private int L;

    public class06030(int n) {
        this.N = new long[n];
    }

    public long N(long l) {
        if (this.y < this.N.length) {
            ++this.y;
        }
        this.N[this.L] = l;
        this.L = (this.L + 1) % this.N.length;
        long l2 = Long.MAX_VALUE;
        long l3 = Long.MIN_VALUE;
        long l4 = 0L;
        for (int i = 0; i < this.y; ++i) {
            long l5 = this.N[i];
            l4 += l5;
            l2 = Math.min(l2, l5);
            l3 = Math.max(l3, l5);
        }
        if (this.y > 2) {
            return (l4 -= l2 + l3) / (long)(this.y - 2);
        }
        if (l4 > 0L) {
            return (long)this.y / l4;
        }
        return 0L;
    }
}

