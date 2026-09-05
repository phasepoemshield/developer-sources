/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

class class05004 {
    private static final long N = 20L;
    private static final long y = 20L;
    private static final long L = 10L;
    private int u;
    private int i;
    private long R;
    private long M;

    public class05004(int n) {
        this.i = n;
        this.u = n;
    }

    public boolean N(long l) {
        return this.M > l && (this.M - l) % 6L >= 3L;
    }

    public int N() {
        return this.i;
    }

    public void N(int n, long l) {
        if (n != this.u) {
            long l2 = n < this.u ? 20L : 10L;
            this.M = l + l2;
            this.u = n;
            this.R = l;
        }
        if (l - this.R > 20L) {
            this.i = n;
        }
    }
}

