/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  org.apache.commons.lang3.Validate
 */
package minecraft;

import minecraft.class04995;
import org.apache.commons.lang3.Validate;

public class class05945 {
    private static final int N = 6;
    private final long[] y;
    private final int L;
    private final long u;
    private final int i;

    public class05945(int n, int n2) {
        this(n, n2, new long[class04995.i((int)(n2 * n), (int)64) / 64]);
    }

    public class05945(int n, int n2, long[] lArray) {
        Validate.inclusiveBetween((long)1L, (long)32L, (long)n);
        this.i = n2;
        this.L = n;
        this.y = lArray;
        this.u = (1L << n) - 1L;
        int n3 = class04995.i((int)(n2 * n), (int)64) / 64;
        if (lArray.length != n3) {
            throw new IllegalArgumentException("Invalid length given for storage, got: " + lArray.length + " but expected: " + n3);
        }
    }

    public int y() {
        return this.L;
    }

    public void N(int n, int n2) {
        Validate.inclusiveBetween((long)0L, (long)(this.i - 1), (long)n);
        Validate.inclusiveBetween((long)0L, (long)this.u, (long)n2);
        int n3 = n * this.L;
        int n4 = n3 >> 6;
        int n5 = (n + 1) * this.L - 1 >> 6;
        int n6 = n3 ^ n4 << 6;
        this.y[n4] = this.y[n4] & (this.u << n6 ^ 0xFFFFFFFFFFFFFFFFL) | ((long)n2 & this.u) << n6;
        if (n4 != n5) {
            int n7 = 64 - n6;
            int n8 = this.L - n7;
            this.y[n5] = this.y[n5] >>> n8 << n8 | ((long)n2 & this.u) >> n7;
        }
    }

    public long[] N() {
        return this.y;
    }

    public int N(int n) {
        Validate.inclusiveBetween((long)0L, (long)(this.i - 1), (long)n);
        int n2 = n * this.L;
        int n3 = n2 >> 6;
        int n4 = (n + 1) * this.L - 1 >> 6;
        int n5 = n2 ^ n3 << 6;
        if (n3 == n4) {
            return (int)(this.y[n3] >>> n5 & this.u);
        }
        int n6 = 64 - n5;
        return (int)((this.y[n3] >>> n5 | this.y[n4] << n6) & this.u);
    }
}

