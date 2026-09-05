/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class05022
 *  minecraft.class06038
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class04995;
import minecraft.class05022;
import minecraft.class06038;
import minecraft.class06069;

public final class class04860 {
    private static final float u = 1.0E-7f;
    private final byte[] i;
    public final double N;
    public final double y;
    public final double L;

    public class04860(class06069 class060692) {
        int n;
        this.N = class060692.U() * 256.0;
        this.y = class060692.U() * 256.0;
        this.L = class060692.U() * 256.0;
        this.i = new byte[256];
        for (n = 0; n < 256; ++n) {
            this.i[n] = (byte)n;
        }
        for (n = 0; n < 256; ++n) {
            int n2 = class060692.y(256 - n);
            byte by = this.i[n];
            this.i[n] = this.i[n + n2];
            this.i[n + n2] = by;
        }
    }

    private int N(int n) {
        return this.i[n & 0xFF] & 0xFF;
    }

    private double N(int n, int n2, int n3, double d, double d2, double d3, double d4) {
        int n4 = this.N(n);
        int n5 = this.N(n + 1);
        int n6 = this.N(n4 + n2);
        int n7 = this.N(n4 + n2 + 1);
        int n8 = this.N(n5 + n2);
        int n9 = this.N(n5 + n2 + 1);
        double d5 = class04860.N(this.N(n6 + n3), d, d2, d3);
        double d6 = class04860.N(this.N(n8 + n3), d - 1.0, d2, d3);
        double d7 = class04860.N(this.N(n7 + n3), d, d2 - 1.0, d3);
        double d8 = class04860.N(this.N(n9 + n3), d - 1.0, d2 - 1.0, d3);
        double d9 = class04860.N(this.N(n6 + n3 + 1), d, d2, d3 - 1.0);
        double d10 = class04860.N(this.N(n8 + n3 + 1), d - 1.0, d2, d3 - 1.0);
        double d11 = class04860.N(this.N(n7 + n3 + 1), d, d2 - 1.0, d3 - 1.0);
        double d12 = class04860.N(this.N(n9 + n3 + 1), d - 1.0, d2 - 1.0, d3 - 1.0);
        double d13 = class04995.Z((double)d);
        double d14 = class04995.Z((double)d4);
        double d15 = class04995.Z((double)d3);
        return class04995.N((double)d13, (double)d14, (double)d15, (double)d5, (double)d6, (double)d7, (double)d8, (double)d9, (double)d10, (double)d11, (double)d12);
    }

    private double N(int n, int n2, int n3, double d, double d2, double d3, double[] dArray) {
        int n4 = this.N(n);
        int n5 = this.N(n + 1);
        int n6 = this.N(n4 + n2);
        int n7 = this.N(n4 + n2 + 1);
        int n8 = this.N(n5 + n2);
        int n9 = this.N(n5 + n2 + 1);
        int n10 = this.N(n6 + n3);
        int n11 = this.N(n8 + n3);
        int n12 = this.N(n7 + n3);
        int n13 = this.N(n9 + n3);
        int n14 = this.N(n6 + n3 + 1);
        int n15 = this.N(n8 + n3 + 1);
        int n16 = this.N(n7 + n3 + 1);
        int n17 = this.N(n9 + n3 + 1);
        int[] nArray = class05022.N[n10 & 0xF];
        int[] nArray2 = class05022.N[n11 & 0xF];
        int[] nArray3 = class05022.N[n12 & 0xF];
        int[] nArray4 = class05022.N[n13 & 0xF];
        int[] nArray5 = class05022.N[n14 & 0xF];
        int[] nArray6 = class05022.N[n15 & 0xF];
        int[] nArray7 = class05022.N[n16 & 0xF];
        int[] nArray8 = class05022.N[n17 & 0xF];
        double d4 = class05022.N((int[])nArray, (double)d, (double)d2, (double)d3);
        double d5 = class05022.N((int[])nArray2, (double)(d - 1.0), (double)d2, (double)d3);
        double d6 = class05022.N((int[])nArray3, (double)d, (double)(d2 - 1.0), (double)d3);
        double d7 = class05022.N((int[])nArray4, (double)(d - 1.0), (double)(d2 - 1.0), (double)d3);
        double d8 = class05022.N((int[])nArray5, (double)d, (double)d2, (double)(d3 - 1.0));
        double d9 = class05022.N((int[])nArray6, (double)(d - 1.0), (double)d2, (double)(d3 - 1.0));
        double d10 = class05022.N((int[])nArray7, (double)d, (double)(d2 - 1.0), (double)(d3 - 1.0));
        double d11 = class05022.N((int[])nArray8, (double)(d - 1.0), (double)(d2 - 1.0), (double)(d3 - 1.0));
        double d12 = class04995.Z((double)d);
        double d13 = class04995.Z((double)d2);
        double d14 = class04995.Z((double)d3);
        double d15 = class04995.N((double)d12, (double)d13, (double)d14, (double)nArray[0], (double)nArray2[0], (double)nArray3[0], (double)nArray4[0], (double)nArray5[0], (double)nArray6[0], (double)nArray7[0], (double)nArray8[0]);
        double d16 = class04995.N((double)d12, (double)d13, (double)d14, (double)nArray[1], (double)nArray2[1], (double)nArray3[1], (double)nArray4[1], (double)nArray5[1], (double)nArray6[1], (double)nArray7[1], (double)nArray8[1]);
        double d17 = class04995.N((double)d12, (double)d13, (double)d14, (double)nArray[2], (double)nArray2[2], (double)nArray3[2], (double)nArray4[2], (double)nArray5[2], (double)nArray6[2], (double)nArray7[2], (double)nArray8[2]);
        double d18 = class04995.N((double)d13, (double)d14, (double)(d5 - d4), (double)(d7 - d6), (double)(d9 - d8), (double)(d11 - d10));
        double d19 = class04995.N((double)d14, (double)d12, (double)(d6 - d4), (double)(d10 - d8), (double)(d7 - d5), (double)(d11 - d9));
        double d20 = class04995.N((double)d12, (double)d13, (double)(d8 - d4), (double)(d9 - d5), (double)(d10 - d6), (double)(d11 - d7));
        double d21 = class04995.z((double)d);
        double d22 = class04995.z((double)d2);
        double d23 = class04995.z((double)d3);
        double d24 = d15 + d21 * d18;
        double d25 = d16 + d22 * d19;
        double d26 = d17 + d23 * d20;
        dArray[0] = dArray[0] + d24;
        dArray[1] = dArray[1] + d25;
        dArray[2] = dArray[2] + d26;
        return class04995.N((double)d12, (double)d13, (double)d14, (double)d4, (double)d5, (double)d6, (double)d7, (double)d8, (double)d9, (double)d10, (double)d11);
    }

    public void N(StringBuilder stringBuilder) {
        class06038.N((StringBuilder)stringBuilder, (double)this.N, (double)this.y, (double)this.L, (byte[])this.i);
    }

    public double N(double d, double d2, double d3) {
        return this.N(d, d2, d3, 0.0, 0.0);
    }

    @Deprecated
    public double N(double d, double d2, double d3, double d4, double d5) {
        double d6;
        double d7 = d + this.N;
        double d8 = d2 + this.y;
        double d9 = d3 + this.L;
        int n = class04995.N((double)d7);
        int n2 = class04995.N((double)d8);
        int n3 = class04995.N((double)d9);
        double d10 = d7 - (double)n;
        double d11 = d8 - (double)n2;
        double d12 = d9 - (double)n3;
        if (d4 != 0.0) {
            double d13 = d5 >= 0.0 && d5 < d11 ? d5 : d11;
            d6 = (double)class04995.N((double)(d13 / d4 + (double)1.0E-7f)) * d4;
        } else {
            d6 = 0.0;
        }
        return this.N(n, n2, n3, d10, d11 - d6, d12, d11);
    }

    public double N(double d, double d2, double d3, double[] dArray) {
        double d4 = d + this.N;
        double d5 = d2 + this.y;
        double d6 = d3 + this.L;
        int n = class04995.N((double)d4);
        int n2 = class04995.N((double)d5);
        int n3 = class04995.N((double)d6);
        double d7 = d4 - (double)n;
        double d8 = d5 - (double)n2;
        double d9 = d6 - (double)n3;
        return this.N(n, n2, n3, d7, d8, d9, dArray);
    }

    private static double N(int n, double d, double d2, double d3) {
        return class05022.N((int[])class05022.N[n & 0xF], (double)d, (double)d2, (double)d3);
    }
}

