/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class07211;

public class class02113 {
    private final int N;
    private final int y;
    private final float L;
    private final float u;

    public int L(int n) {
        return n & this.N;
    }

    public class02113(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Precision cannot be less than 2 bits");
        }
        if (n > 30) {
            throw new IllegalArgumentException("Precision cannot be greater than 30 bits");
        }
        int n2 = 1 << n;
        this.N = n2 - 1;
        this.y = n;
        this.L = (float)n2 / 360.0f;
        this.u = 360.0f / (float)n2;
    }

    public int y(float f) {
        return this.L(this.N(f));
    }

    public float y(int n) {
        float f = this.N(this.L(n));
        return f >= 180.0f ? f - 360.0f : f;
    }

    public int N() {
        return this.N;
    }

    public boolean N(int n, int n2) {
        int n3 = this.N() >> 1;
        return (n & n3) == (n2 & n3);
    }

    public int N(class07211 class072112) {
        if (class072112.z().y()) {
            return 0;
        }
        return class072112.u() << this.y - 2;
    }

    public float N(int n) {
        return (float)n * this.u;
    }

    public int N(float f) {
        return Math.round(f * this.L);
    }
}

