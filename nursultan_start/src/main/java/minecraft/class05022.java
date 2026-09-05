/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class04995;
import minecraft.class06069;

public class class05022 {
    protected static final int[][] N = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}, {1, 1, 0}, {0, -1, 1}, {-1, 1, 0}, {0, -1, -1}};
    private static final double i = Math.sqrt(3.0);
    private static final double R = 0.5 * (i - 1.0);
    private static final double M = (3.0 - i) / 6.0;
    private final int[] B = new int[512];
    public final double y;
    public final double L;
    public final double u;

    public class05022(class06069 class060692) {
        int n;
        this.y = class060692.U() * 256.0;
        this.L = class060692.U() * 256.0;
        this.u = class060692.U() * 256.0;
        for (n = 0; n < 256; ++n) {
            this.B[n] = n;
        }
        for (n = 0; n < 256; ++n) {
            int n2 = class060692.y(256 - n);
            int n3 = this.B[n];
            this.B[n] = this.B[n2 + n];
            this.B[n2 + n] = n3;
        }
    }

    private double N(int n, double d, double d2, double d3, double d4) {
        double d5;
        double d6 = d4 - d * d - d2 * d2 - d3 * d3;
        if (d6 < 0.0) {
            d5 = 0.0;
        } else {
            d6 *= d6;
            d5 = d6 * d6 * class05022.N(N[n], d, d2, d3);
        }
        return d5;
    }

    public double N(double d, double d2, double d3) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        double d4 = 0.3333333333333333;
        double d5 = (d + d2 + d3) * 0.3333333333333333;
        int n7 = class04995.N(d + d5);
        int n8 = class04995.N(d2 + d5);
        int n9 = class04995.N(d3 + d5);
        double d6 = 0.16666666666666666;
        double d7 = (double)(n7 + n8 + n9) * 0.16666666666666666;
        double d8 = (double)n7 - d7;
        double d9 = (double)n8 - d7;
        double d10 = (double)n9 - d7;
        double d11 = d - d8;
        double d12 = d2 - d9;
        double d13 = d3 - d10;
        if (d11 >= d12) {
            if (d12 >= d13) {
                n6 = 1;
                n5 = 0;
                n4 = 0;
                n3 = 1;
                n2 = 1;
                n = 0;
            } else if (d11 >= d13) {
                n6 = 1;
                n5 = 0;
                n4 = 0;
                n3 = 1;
                n2 = 0;
                n = 1;
            } else {
                n6 = 0;
                n5 = 0;
                n4 = 1;
                n3 = 1;
                n2 = 0;
                n = 1;
            }
        } else if (d12 < d13) {
            n6 = 0;
            n5 = 0;
            n4 = 1;
            n3 = 0;
            n2 = 1;
            n = 1;
        } else if (d11 < d13) {
            n6 = 0;
            n5 = 1;
            n4 = 0;
            n3 = 0;
            n2 = 1;
            n = 1;
        } else {
            n6 = 0;
            n5 = 1;
            n4 = 0;
            n3 = 1;
            n2 = 1;
            n = 0;
        }
        double d14 = d11 - (double)n6 + 0.16666666666666666;
        double d15 = d12 - (double)n5 + 0.16666666666666666;
        double d16 = d13 - (double)n4 + 0.16666666666666666;
        double d17 = d11 - (double)n3 + 0.3333333333333333;
        double d18 = d12 - (double)n2 + 0.3333333333333333;
        double d19 = d13 - (double)n + 0.3333333333333333;
        double d20 = d11 - 1.0 + 0.5;
        double d21 = d12 - 1.0 + 0.5;
        double d22 = d13 - 1.0 + 0.5;
        int n10 = n7 & 0xFF;
        int n11 = n8 & 0xFF;
        int n12 = n9 & 0xFF;
        int n13 = this.N(n10 + this.N(n11 + this.N(n12))) % 12;
        int n14 = this.N(n10 + n6 + this.N(n11 + n5 + this.N(n12 + n4))) % 12;
        int n15 = this.N(n10 + n3 + this.N(n11 + n2 + this.N(n12 + n))) % 12;
        int n16 = this.N(n10 + 1 + this.N(n11 + 1 + this.N(n12 + 1))) % 12;
        double d23 = this.N(n13, d11, d12, d13, 0.6);
        double d24 = this.N(n14, d14, d15, d16, 0.6);
        double d25 = this.N(n15, d17, d18, d19, 0.6);
        double d26 = this.N(n16, d20, d21, d22, 0.6);
        return 32.0 * (d23 + d24 + d25 + d26);
    }

    public double N(double d, double d2) {
        int n;
        int n2;
        double d3;
        double d4;
        int n3;
        double d5;
        double d6 = (d + d2) * R;
        int n4 = class04995.N(d + d6);
        double d7 = (double)n4 - (d5 = (double)(n4 + (n3 = class04995.N(d2 + d6))) * M);
        double d8 = d - d7;
        if (d8 > (d4 = d2 - (d3 = (double)n3 - d5))) {
            n2 = 1;
            n = 0;
        } else {
            n2 = 0;
            n = 1;
        }
        double d9 = d8 - (double)n2 + M;
        double d10 = d4 - (double)n + M;
        double d11 = d8 - 1.0 + 2.0 * M;
        double d12 = d4 - 1.0 + 2.0 * M;
        int n5 = n4 & 0xFF;
        int n6 = n3 & 0xFF;
        int n7 = this.N(n5 + this.N(n6)) % 12;
        int n8 = this.N(n5 + n2 + this.N(n6 + n)) % 12;
        int n9 = this.N(n5 + 1 + this.N(n6 + 1)) % 12;
        double d13 = this.N(n7, d8, d4, 0.0, 0.5);
        double d14 = this.N(n8, d9, d10, 0.0, 0.5);
        double d15 = this.N(n9, d11, d12, 0.0, 0.5);
        return 70.0 * (d13 + d14 + d15);
    }

    private int N(int n) {
        return this.B[n & 0xFF];
    }

    protected static double N(int[] nArray, double d, double d2, double d3) {
        return (double)nArray[0] * d + (double)nArray[1] * d2 + (double)nArray[2] * d3;
    }
}

