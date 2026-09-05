/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10285
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01296
 *  minecraft.class01818
 *  minecraft.class01835
 *  minecraft.class01837
 *  minecraft.class03866
 *  minecraft.class03875
 *  minecraft.class03877
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07376
 *  minecraft.class07529
 *  org.apache.commons.lang3.mutable.MutableDouble
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10285;
import java.util.Arrays;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01296;
import minecraft.class01818;
import minecraft.class01835;
import minecraft.class01837;
import minecraft.class03421;
import minecraft.class03430;
import minecraft.class03460;
import minecraft.class03866;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07376;
import minecraft.class07529;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.jspecify.annotations.Nullable;

public class class03435
implements class03460 {
    private static final int N = 10;
    private static final int y = 9;
    private static final int L = 10;
    private static final int u = 6;
    private static final int i = 3;
    private static final int R = 6;
    private static final int M = 16;
    private static final int B = 12;
    private static final int Z = 16;
    private static final int z = 4;
    private static final int U = 4;
    private static final int E = 11;
    private static final double W = class03435.N(class04995.Z((int)10), class04995.Z((int)12));
    private static final int m = -5;
    private static final int P = 1;
    private static final int s = -5;
    private static final int T = 0;
    private static final int b = -1;
    private static final int j = 0;
    private static final int v = 1;
    private static final int n = 1;
    private static final int t = 1;
    private final class01837 G;
    private final class03877 l;
    private final class03877 d;
    private final class03877 w;
    private final class03877 k;
    private final class01818 Y;
    private final @Nullable class03430[] Q;
    private final long[] O;
    private final class03421 g;
    private final class03877 I;
    private final class03877 J;
    private boolean o;
    private final int q;
    private final int K;
    private final int V;
    private final int e;
    private final int H;
    private final int c;
    private static final int[][] X = new int[][]{{0, 0}, {-2, -1}, {-1, -1}, {0, -1}, {1, -1}, {-3, 0}, {-2, 0}, {-1, 0}, {1, 0}, {-2, 1}, {-1, 1}, {0, 1}, {1, 1}};

    private static int L(int n, int n2) {
        return n * 12 + n2;
    }

    private static int L(int n) {
        return n >> 4;
    }

    class03435(class01837 class018372, class07321 class073212, class03866 class038662, class01818 class018182, int n, int n2, class03421 class034212) {
        this.G = class018372;
        this.l = class038662.N();
        this.d = class038662.y();
        this.w = class038662.L();
        this.k = class038662.u();
        this.I = class038662.B();
        this.J = class038662.Z();
        this.Y = class018182;
        this.K = class03435.N(class073212.i() + -5) + 0;
        this.g = class034212;
        int n3 = class03435.N(class073212.M() + -5) + 1;
        this.H = n3 - this.K + 1;
        this.V = class03435.y(n + 1) + -1;
        int n4 = class03435.y(n + n2 + 1) + 1 - this.V + 1;
        this.e = class03435.L(class073212.R() + -5) + 0;
        int n5 = class03435.L(class073212.B() + -5) + 1;
        this.c = n5 - this.e + 1;
        int n6 = this.H * n4 * this.c;
        this.Q = new class03430[n6];
        this.O = new long[n6];
        Arrays.fill(this.O, Long.MAX_VALUE);
        int n7 = class03435.y(this.i(class018372.N(class03435.y(this.K, 0), class03435.u(this.e, 0), class03435.y(n3, 9), class03435.u(n5, 9))) + 12) - -1;
        this.q = class03435.L(n7, 11) - 1;
    }

    private int i(int n) {
        return n + 8;
    }

    private static int u(int n, int n2) {
        return (n << 4) + n2;
    }

    private class03430 u(int n) {
        class03430 class034302;
        class03430 class034303 = this.Q[n];
        if (class034303 != null) {
            return class034303;
        }
        long l = this.O[n];
        this.Q[n] = class034302 = this.y(class07209.method_10061((long)l), class07209.method_10071((long)l), class07209.method_10083((long)l));
        return class034302;
    }

    private class03430 y(int n, int n2, int n3) {
        class03430 class034302 = this.g.computeFluid(n, n2, n3);
        int n4 = Integer.MAX_VALUE;
        int n5 = n2 + 12;
        int n6 = n2 - 12;
        boolean bl = false;
        for (int[] nArray : X) {
            class03430 class034303;
            boolean bl2;
            boolean bl3;
            int n7 = n + class01296.L((int)nArray[0]);
            int n8 = n3 + class01296.L((int)nArray[1]);
            int n9 = this.G.N(n7, n8);
            int n10 = this.i(n9);
            boolean bl4 = bl3 = nArray[0] == 0 && nArray[1] == 0;
            if (bl3 && n6 > n10) {
                return class034302;
            }
            boolean bl5 = bl2 = n5 > n10;
            if ((bl2 || bl3) && !(class034303 = this.g.computeFluid(n7, n10, n8)).N(n10).P()) {
                if (bl3) {
                    bl = true;
                }
                if (bl2) {
                    return class034303;
                }
            }
            n4 = Math.min(n4, n9);
        }
        int n11 = this.N(n, n2, n3, class034302, n4, bl);
        return new class03430(n11, this.N(n, n2, n3, class034302, n11));
    }

    private static int y(int n) {
        return Math.floorDiv(n, 12);
    }

    private static int y(int n, int n2) {
        return (n << 4) + n2;
    }

    private static double N(int n, int n2) {
        double d = 25.0;
        return 1.0 - (double)(n2 - n) / 25.0;
    }

    private int N(int n, int n2, int n3, class03430 class034302, int n4, boolean bl) {
        int n5;
        double d;
        double d2;
        class10285 class102852 = new class10285(n, n2, n3);
        if (class01835.N((class03877)this.I, (class03877)this.J, (class03875)class102852)) {
            d2 = -1.0;
            d = -1.0;
        } else {
            n5 = n4 + 8 - n2;
            int n6 = 64;
            double d3 = bl ? class04995.N((double)n5, (double)0.0, (double)64.0, (double)1.0, (double)0.0) : 0.0;
            double d4 = class04995.N((double)this.d.N((class03875)class102852), (double)-1.0, (double)1.0);
            double d5 = class04995.y((double)d3, (double)1.0, (double)0.0, (double)-0.3, (double)0.8);
            double d6 = class04995.y((double)d3, (double)1.0, (double)0.0, (double)-0.8, (double)0.4);
            d2 = d4 - d6;
            d = d4 - d5;
        }
        n5 = d > 0.0 ? class034302.N() : (d2 > 0.0 ? this.N(n, n2, n3, n4) : class07376.M);
        return n5;
    }

    private int N(int n, int n2, int n3, int n4) {
        int n5 = 16;
        int n6 = 40;
        int n7 = Math.floorDiv(n, 16);
        int n8 = Math.floorDiv(n2, 40);
        int n9 = Math.floorDiv(n3, 16);
        int n10 = n8 * 40 + 20;
        int n11 = 10;
        int n12 = class04995.N((double)(this.w.N((class03875)new class10285(n7, n8, n9)) * 10.0), (int)3);
        int n13 = n10 + n12;
        return Math.min(n4, n13);
    }

    private class00500 N(int n, int n2, int n3, class03430 class034302, int n4) {
        class00500 class005002 = class034302.y();
        if (n4 <= -10 && n4 != class07376.M && class034302.y() != class00869.V.W()) {
            int n5 = 64;
            int n6 = 40;
            int n7 = Math.floorDiv(n, 64);
            int n8 = Math.floorDiv(n2, 40);
            int n9 = Math.floorDiv(n3, 64);
            class10285 class102852 = new class10285(n7, n8, n9);
            if (Math.abs(this.k.N((class03875)class102852)) > 0.3) {
                class005002 = class00869.V.W();
            }
        }
        return class005002;
    }

    @Override
    public boolean N() {
        return this.o;
    }

    @Override
    public @Nullable class00500 N(class03875 class038752, double d) {
        boolean bl;
        double d2;
        double d3;
        class00500 class005002;
        if (d > 0.0) {
            this.o = false;
            return null;
        }
        int n = class038752.y();
        int n2 = class038752.L();
        int n3 = class038752.u();
        class03430 class034302 = this.g.computeFluid(n, n2, n3);
        if (n2 > this.q) {
            this.o = false;
            return class034302.N(n2);
        }
        if (class034302.N(n2).N(class00869.V)) {
            this.o = false;
            return class07529.Nd ? class00869.N.W() : class00869.V.W();
        }
        int n4 = class03435.N(n + -5);
        int n5 = class03435.y(n2 + 1);
        int n6 = class03435.L(n3 + -5);
        int n7 = Integer.MAX_VALUE;
        int n8 = Integer.MAX_VALUE;
        int n9 = Integer.MAX_VALUE;
        int n10 = Integer.MAX_VALUE;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        for (int i = 0; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = 0; k <= 1; ++k) {
                    long l;
                    int n15 = n4 + i;
                    int n16 = n5 + j;
                    int n17 = n6 + k;
                    int n18 = this.N(n15, n16, n17);
                    long l2 = this.O[n18];
                    if (l2 != Long.MAX_VALUE) {
                        l = l2;
                    } else {
                        class06069 class060692 = this.Y.N(n15, n16, n17);
                        this.O[n18] = l = class07209.method_10064((int)class03435.y(n15, class060692.y(10)), (int)class03435.L(n16, class060692.y(9)), (int)class03435.u(n17, class060692.y(10)));
                    }
                    int n19 = class07209.method_10061((long)l) - n;
                    int n20 = class07209.method_10071((long)l) - n2;
                    int n21 = class07209.method_10083((long)l) - n3;
                    int n22 = n19 * n19 + n20 * n20 + n21 * n21;
                    if (n7 >= n22) {
                        n14 = n13;
                        n13 = n12;
                        n12 = n11;
                        n11 = n18;
                        n10 = n9;
                        n9 = n8;
                        n8 = n7;
                        n7 = n22;
                        continue;
                    }
                    if (n8 >= n22) {
                        n14 = n13;
                        n13 = n12;
                        n12 = n18;
                        n10 = n9;
                        n9 = n8;
                        n8 = n22;
                        continue;
                    }
                    if (n9 >= n22) {
                        n14 = n13;
                        n13 = n18;
                        n10 = n9;
                        n9 = n22;
                        continue;
                    }
                    if (n10 < n22) continue;
                    n14 = n18;
                    n10 = n22;
                }
            }
        }
        class03430 class034303 = this.u(n11);
        double d4 = class03435.N(n7, n8);
        class00500 class005003 = class034303.N(n2);
        class00500 class005004 = class005002 = class07529.Nd ? class00869.N.W() : class005003;
        if (d4 <= 0.0) {
            class03430 class034304;
            this.o = d4 >= W ? !class034303.equals((Object)(class034304 = this.u(n12))) : false;
            return class005002;
        }
        if (class005003.N(class00869.K) && this.g.computeFluid(n, n2 - 1, n3).N(n2 - 1).N(class00869.V)) {
            this.o = true;
            return class005002;
        }
        MutableDouble mutableDouble = new MutableDouble(Double.NaN);
        class03430 class034305 = this.u(n12);
        double d5 = d4 * this.N(class038752, mutableDouble, class034303, class034305);
        if (d + d5 > 0.0) {
            this.o = false;
            return null;
        }
        class03430 class034306 = this.u(n13);
        double d6 = class03435.N(n7, n9);
        if (d6 > 0.0 && d + (d3 = d4 * d6 * this.N(class038752, mutableDouble, class034303, class034306)) > 0.0) {
            this.o = false;
            return null;
        }
        double d7 = class03435.N(n8, n9);
        if (d7 > 0.0 && d + (d2 = d4 * d7 * this.N(class038752, mutableDouble, class034305, class034306)) > 0.0) {
            this.o = false;
            return null;
        }
        boolean bl2 = !class034303.equals((Object)class034305);
        boolean bl3 = d7 >= W && !class034305.equals((Object)class034306);
        boolean bl4 = bl = d6 >= W && !class034303.equals((Object)class034306);
        this.o = bl2 || bl3 || bl ? true : d6 >= W && class03435.N(n7, n10) >= W && !class034303.equals((Object)this.u(n14));
        return class005002;
    }

    private int N(int n, int n2, int n3) {
        int n4 = n - this.K;
        int n5 = n2 - this.V;
        int n6 = n3 - this.e;
        return (n5 * this.c + n6) * this.H + n4;
    }

    private static int N(int n) {
        return n >> 4;
    }

    private double N(class03875 class038752, MutableDouble mutableDouble, class03430 class034302, class03430 class034303) {
        double d;
        double d2;
        int n = class038752.L();
        class00500 class005002 = class034302.N(n);
        class00500 class005003 = class034303.N(n);
        if (class005002.N(class00869.V) && class005003.N(class00869.K) || class005002.N(class00869.K) && class005003.N(class00869.V)) {
            return 2.0;
        }
        int n2 = Math.abs(class034302.N() - class034303.N());
        if (n2 == 0) {
            return 0.0;
        }
        double d3 = 0.5 * (double)(class034302.N() + class034303.N());
        double d4 = (double)n + 0.5 - d3;
        double d5 = (double)n2 / 2.0;
        double d6 = 0.0;
        double d7 = 2.5;
        double d8 = 1.5;
        double d9 = 3.0;
        double d10 = 10.0;
        double d11 = 3.0;
        double d12 = d5 - Math.abs(d4);
        double d13 = d4 > 0.0 ? ((d2 = 0.0 + d12) > 0.0 ? d2 / 1.5 : d2 / 2.5) : ((d2 = 3.0 + d12) > 0.0 ? d2 / 3.0 : d2 / 10.0);
        d2 = 2.0;
        if (d13 < -2.0 || d13 > 2.0) {
            d = 0.0;
        } else {
            double d14 = mutableDouble.doubleValue();
            if (Double.isNaN(d14)) {
                double d15 = this.l.N(class038752);
                mutableDouble.setValue(d15);
                d = d15;
            } else {
                d = d14;
            }
        }
        return 2.0 * (d + d13);
    }
}

