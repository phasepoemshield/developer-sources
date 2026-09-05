/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.class11087;
import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;

public class class11064 {
    private static double[] y;
    private static double[] L;
    public static Object N_0;
    public static Object N_1;

    public static class00734 L(class07049 class070492) {
        return class070492.method_5829();
    }

    private class11064() {
    }

    static {
        class11064.i();
        class11064.y();
    }

    private static void i() {
        L = new double[8];
        class11064.L[0] = Double.longBitsToDouble(4585925428558828667L);
        class11064.L[1] = Double.longBitsToDouble(0L);
        class11064.L[2] = Double.longBitsToDouble(4593311331947716280L);
        class11064.L[3] = Double.longBitsToDouble(4585925428558828667L);
        class11064.L[4] = Double.longBitsToDouble(0L);
        class11064.L[5] = Double.longBitsToDouble(4593311331947716280L);
        class11064.L[6] = Double.longBitsToDouble(4581421828931458171L);
        class11064.L[7] = Double.longBitsToDouble(0L);
        y = new double[6];
        class11064.y[0] = Double.longBitsToDouble(4585925428558828667L);
        class11064.y[1] = Double.longBitsToDouble(0x4000000000000000L);
        class11064.y[2] = Double.longBitsToDouble(0x4000000000000000L);
        class11064.y[3] = Double.longBitsToDouble(0x4000000000000000L);
        class11064.y[4] = Double.longBitsToDouble(4585925428558828667L);
        class11064.y[5] = Double.longBitsToDouble(4581421828931458171L);
    }

    public static class00734 u(class07049 class070492) {
        class00734 class007342 = class11064.L(class070492);
        double d = Math.min(L[0], Math.max(L[1], (class007342.u - class007342.N) * L[2]));
        double d2 = Math.min(L[3], Math.max(L[4], (class007342.R - class007342.L) * L[5]));
        double d3 = Math.min(L[6], Math.max(L[7], (class007342.i - class007342.y) * y[0]));
        if (class007342.u - class007342.N <= d * y[1] || class007342.i - class007342.y <= d3 * y[2] || class007342.R - class007342.L <= d2 * y[3]) {
            return class007342;
        }
        return new class00734(class007342.N + d, class007342.y + d3, class007342.L + d2, class007342.u - d, class007342.i - d3, class007342.R - d2);
    }

    private static void y() {
        N_0 = y[4];
        N_1 = y[5];
    }

    public static class06889 y(class07049 class070492) {
        return class11064.L(class070492).R();
    }

    public static class06889 y(class07049 class070492, class06889 class068892) {
        class00734 class007342 = class11064.L(class070492);
        return new class06889(class04995.N((double)class068892.M, (double)class007342.N, (double)class007342.u), class04995.N((double)class068892.B, (double)class007342.y, (double)class007342.i), class04995.N((double)class068892.Z, (double)class007342.L, (double)class007342.R));
    }

    public static class06889 N(class07049 class070492, class06889 class068892) {
        class00734 class007342 = class11064.L(class070492);
        return new class06889(class04995.N((double)class068892.M, (double)class007342.N, (double)class007342.u), class04995.N((double)class068892.B, (double)class007342.y, (double)class007342.i), class04995.N((double)class068892.Z, (double)class007342.L, (double)class007342.R));
    }

    public static class06889 N(class07049 class070492) {
        return class11064.N(class070492, ((class04453)((class06202)class11087.N_0).T_4).method_33571());
    }
}

