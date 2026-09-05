/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class06069;

public interface class01809
extends class06069 {
    public static final float y = 5.9604645E-8f;
    public static final double L = (double)1.110223E-16f;

    default public int M() {
        return this.N(32);
    }

    default public long B() {
        int n = this.N(32);
        int n2 = this.N(32);
        return ((long)n << 32) + (long)n2;
    }

    default public boolean Z() {
        return this.N(1) != 0;
    }

    default public double U() {
        int n = this.N(26);
        int n2 = this.N(27);
        return (double)(((long)n << 27) + (long)n2) * (double)1.110223E-16f;
    }

    default public float z() {
        return (float)this.N(24) * 5.9604645E-8f;
    }

    default public int y(int n) {
        int n2;
        int n3;
        if (n <= 0) {
            throw new IllegalArgumentException("Bound must be positive");
        }
        if ((n & n - 1) == 0) {
            return (int)((long)n * (long)this.N(31) >> 31);
        }
        while ((n3 = this.N(31)) - (n2 = n3 % n) + (n - 1) < 0) {
        }
        return n2;
    }

    public int N(int var1);
}

