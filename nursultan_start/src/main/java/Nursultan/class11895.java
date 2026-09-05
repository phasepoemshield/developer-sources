/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  minecraft.class00734
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07109
 */
package Nursultan;

import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11892;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07109;

public class class11895 {
    private static double[] Z;
    private static double[] m;
    private static double[] P;
    private static String[] s;
    private static double[] G;
    private static double[] Y;
    public static Object N_0;
    public static Object N_1;

    private static void L() {
    }

    private class11895() {
        throw new UnsupportedOperationException(s[0]);
    }

    static {
        class11895.i();
        class11895.L();
        class11895.N();
        class11895.R();
        class11895.y();
        class11895.u();
        N_0 = class06202.Nq();
    }

    private static void i() {
    }

    private static void u() {
        N_1 = P[5];
    }

    private static void y() {
        s = new String[1];
        class11895.s[0] = "This is a utility class and cannot be instantiated";
    }

    public static class06889 N(class07049 class070492, boolean bl, double d) {
        return class11895.N(class070492, class11505.N(), bl, d, class007342 -> class007342.B(P[4]));
    }

    private static double N(class11499 class114992, class06889 class068892) {
        class07109 class071092 = class11505.N((class11499)class114992, (class06889)class068892).L();
        return class071092.z * class071092.z + class071092.U * class071092.U;
    }

    private static class06889 N(class06889 class068892, class06889 class068893, class06889 class068894, double d) {
        double d2;
        class06889 class068895 = class068893.u(class068892);
        double d3 = class068895.y(class068895);
        if (d3 < m[5]) {
            return class068893;
        }
        class06889 class068896 = class068892.u(class068894);
        double d4 = Y[0] * class068896.y(class068895);
        double d5 = d4 * d4 - Y[1] * d3 * (d2 = class068896.y(class068896) - d * d);
        if (d5 < Y[2]) {
            return class068893;
        }
        double d6 = (-d4 - Math.sqrt(d5)) / (Y[3] * d3);
        return class068892.i(class068895.L(class04995.N((double)d6, (double)Y[4], (double)Y[5])));
    }

    private static void N(List<class06889> list, class07049 class070492, class06889 class068892, double d) {
        class06889 class068893;
        class06889 class068894 = ((class04453)((class06202)class11895.N_0).T_4).method_33571();
        if (class11892.N(class068894, class068893 = class11505.N((class06889)class068892).U().L(d).i(class068894), class070492)) {
            return;
        }
        list.add(class068892);
    }

    private static void N() {
        G = new double[4];
        class11895.G[0] = Double.longBitsToDouble(4576918229304087675L);
        class11895.G[1] = Double.longBitsToDouble(4587366580439587226L);
        class11895.G[2] = Double.longBitsToDouble(4587366580439587226L);
        class11895.G[3] = Double.longBitsToDouble(4547007122018943789L);
        m = new double[6];
        class11895.m[0] = Double.longBitsToDouble(4517329193108106637L);
        class11895.m[1] = Double.longBitsToDouble(0L);
        class11895.m[2] = Double.longBitsToDouble(0x7FEFFFFFFFFFFFFFL);
        class11895.m[3] = Double.longBitsToDouble(4587366580439587226L);
        class11895.m[4] = Double.longBitsToDouble(0L);
        class11895.m[5] = Double.longBitsToDouble(4472406533629990549L);
        Y = new double[8];
        class11895.Y[0] = Double.longBitsToDouble(0x4000000000000000L);
        class11895.Y[1] = Double.longBitsToDouble(0x4010000000000000L);
        class11895.Y[2] = Double.longBitsToDouble(0L);
        class11895.Y[3] = Double.longBitsToDouble(0x4000000000000000L);
        class11895.Y[4] = Double.longBitsToDouble(0L);
        class11895.Y[5] = Double.longBitsToDouble(0x3FF0000000000000L);
        class11895.Y[6] = Double.longBitsToDouble(4587366580439587226L);
        class11895.Y[7] = Double.longBitsToDouble(0x4000000000000000L);
        Z = new double[3];
        class11895.Z[0] = Double.longBitsToDouble(4603741974828149072L);
        class11895.Z[1] = Double.longBitsToDouble(0L);
        class11895.Z[2] = Double.longBitsToDouble(0x3FF0000000000000L);
        P = new double[6];
        class11895.P[0] = Double.longBitsToDouble(4602678819172646912L);
        class11895.P[1] = Double.longBitsToDouble(4576918229304087675L);
        class11895.P[2] = Double.longBitsToDouble(4576918229304087675L);
        class11895.P[3] = Double.longBitsToDouble(4576918229304087675L);
        class11895.P[4] = Double.longBitsToDouble(4576918229304087675L);
        class11895.P[5] = Double.longBitsToDouble(4587366580439587226L);
    }

    private static void N(List<class06889> list, class06889 class068892, class00734 class007342, int n, double d, double d2) {
        double[] dArray;
        double[] dArray2;
        if (n == 0) {
            dArray2 = class11895.N(class007342.y, class007342.i);
            dArray = class11895.N(class007342.L, class007342.R);
        } else if (n == 1) {
            dArray2 = class11895.N(class007342.N, class007342.u);
            dArray = class11895.N(class007342.L, class007342.R);
        } else {
            dArray2 = class11895.N(class007342.N, class007342.u);
            dArray = class11895.N(class007342.y, class007342.i);
        }
        int n2 = 4;
        for (int i = 0; i < n2; ++i) {
            double d3 = dArray2[0] + (dArray2[1] - dArray2[0]) * (double)i / (double)(n2 - 1);
            for (int j = 0; j < n2; ++j) {
                double d4 = dArray[0] + (dArray[1] - dArray[0]) * (double)j / (double)(n2 - 1);
                class06889 class068893 = class11895.N(class11895.N(n, d, d3, d4), class068892, n, d, dArray2, dArray, d2);
                class11895.N(list, class068892, class068893);
            }
        }
    }

    public static class06889 N(class07049 class070492, class11499 class114992, boolean bl, double d, Function<class00734, class00734> function) {
        double d2;
        int n;
        ArrayList<class06889> arrayList = new ArrayList<class06889>();
        class00734 class007342 = function.apply(class070492.method_5829());
        int n2 = 10;
        int n3 = 10;
        int n4 = 10;
        double d3 = class007342.L() / (double)n2;
        double d4 = class007342.y() / (double)n3;
        double d5 = class007342.u() / (double)n4;
        class06889 class068892 = ((class04453)((class06202)class11895.N_0).T_4).method_33571();
        double d6 = class068892.L();
        double d7 = class068892.N();
        double d8 = class068892.y();
        boolean bl2 = d7 >= class007342.N && d7 < class007342.u && d6 >= class007342.L && d6 < class007342.R;
        boolean bl3 = bl2 || d6 > class007342.R;
        boolean bl4 = bl2 || d6 < class007342.L;
        boolean bl5 = bl2 || d7 > class007342.u;
        boolean bl6 = bl2 || d7 < class007342.N;
        boolean bl7 = bl2 || d8 > class007342.i;
        boolean bl8 = bl2 || d8 < class007342.y;
        for (n = 0; n <= n2; ++n) {
            class06889 class068893;
            int n5;
            double d9 = class007342.y + (double)n * d3;
            class11895.N(arrayList, class070492, new class06889(class070492.method_23317(), d9, class070492.method_23321()), d);
            for (n5 = 0; n5 <= n3; ++n5) {
                d2 = class007342.N + (double)n5 * d4;
                if (bl3) {
                    class068893 = new class06889(d2, d9, class007342.R);
                    class11895.N(arrayList, class070492, class068893, d);
                }
                if (!bl4) continue;
                class068893 = new class06889(d2, d9, class007342.L);
                class11895.N(arrayList, class070492, class068893, d);
            }
            for (n5 = 0; n5 <= n4; ++n5) {
                d2 = class007342.L + (double)n5 * d5;
                if (bl5) {
                    class068893 = new class06889(class007342.u, d9, d2);
                    class11895.N(arrayList, class070492, class068893, d);
                }
                if (!bl6) continue;
                class068893 = new class06889(class007342.N, d9, d2);
                class11895.N(arrayList, class070492, class068893, d);
            }
        }
        for (n = 0; n <= n4; ++n) {
            for (int i = 0; i <= n3; ++i) {
                double d10 = class007342.N + (double)i * d4;
                d2 = class007342.L + (double)n * d5;
                if (bl8) {
                    class11895.N(arrayList, class070492, new class06889(d10, class007342.y, d2), d);
                }
                if (!bl7) continue;
                class11895.N(arrayList, class070492, new class06889(d10, class007342.i, d2), d);
            }
        }
        return class11895.N(arrayList, class114992, class070492.method_33571(), bl);
    }

    public static class06889 N(class07049 class070492, double d) {
        return class11895.N(class070492, class11505.N(), d, class007342 -> class007342.B(P[2]));
    }

    private static class06889 N(class11499 class114992, class06889 class068892, class06889 class068893) {
        class06889 class068894 = class068893.u(class068892);
        double d = Z[0];
        double d2 = Z[1];
        double d3 = Z[2];
        double d4 = d3 - d * (d3 - d2);
        double d5 = d2 + d * (d3 - d2);
        double d6 = class11895.N(class114992, class068892.i(class068894.L(d4)));
        double d7 = class11895.N(class114992, class068892.i(class068894.L(d5)));
        for (int i = 0; i < 8; ++i) {
            if (d6 < d7) {
                d3 = d5;
                d5 = d4;
                d7 = d6;
                d4 = d3 - d * (d3 - d2);
                d6 = class11895.N(class114992, class068892.i(class068894.L(d4)));
                continue;
            }
            d2 = d4;
            d4 = d5;
            d6 = d7;
            d5 = d2 + d * (d3 - d2);
            d7 = class11895.N(class114992, class068892.i(class068894.L(d5)));
        }
        class06889 class068895 = class068892.i(class068894.L((d2 + d3) * P[0]));
        double d8 = class11895.N(class114992, class068895);
        double d9 = class11895.N(class114992, class068892);
        if (d9 < d8) {
            d8 = d9;
            class068895 = class068892;
        }
        if (class11895.N(class114992, class068893) < d8) {
            class068895 = class068893;
        }
        return class068895;
    }

    public static class06889 N(class00734 class007342) {
        class06889 class068892 = ((class04453)((class06202)class11895.N_0).T_4).method_33571();
        return new class06889(class04995.N((double)class068892.M, (double)class007342.N, (double)class007342.u), class04995.N((double)class068892.B, (double)class007342.y, (double)class007342.i), class04995.N((double)class068892.Z, (double)class007342.L, (double)class007342.R));
    }

    private static double[] N(double d, double d2) {
        double d3 = Math.min(Y[6], (d2 - d) / Y[7]);
        return new double[]{d + d3, d2 - d3};
    }

    public static class06889 N(class07049 class070492, class11499 class114992, double d, Function<class00734, class00734> function) {
        class00734 class007342 = function.apply(class070492.method_5829());
        class06889 class068894 = ((class04453)((class06202)class11895.N_0).T_4).method_33571();
        double d2 = class068894.N();
        double d3 = class068894.y();
        double d4 = class068894.L();
        boolean bl = d2 >= class007342.N && d2 < class007342.u && d4 >= class007342.L && d4 < class007342.R;
        boolean bl2 = bl || d2 > class007342.u;
        boolean bl3 = bl || d2 < class007342.N;
        boolean bl4 = bl || d3 > class007342.i;
        boolean bl5 = bl || d3 < class007342.y;
        boolean bl6 = bl || d4 > class007342.R;
        boolean bl7 = bl || d4 < class007342.L;
        ArrayList<class06889> arrayList = new ArrayList<class06889>();
        if (bl2) {
            class11895.N(arrayList, class068894, class114992, class007342, 0, class007342.u, d);
        }
        if (bl3) {
            class11895.N(arrayList, class068894, class114992, class007342, 0, class007342.N, d);
        }
        if (bl4) {
            class11895.N(arrayList, class068894, class114992, class007342, 1, class007342.i, d);
        }
        if (bl5) {
            class11895.N(arrayList, class068894, class114992, class007342, 1, class007342.y, d);
        }
        if (bl6) {
            class11895.N(arrayList, class068894, class114992, class007342, 2, class007342.R, d);
        }
        if (bl7) {
            class11895.N(arrayList, class068894, class114992, class007342, 2, class007342.L, d);
        }
        if (arrayList.isEmpty()) {
            if (bl2) {
                class11895.N(arrayList, class068894, class007342, 0, class007342.u, d);
            }
            if (bl3) {
                class11895.N(arrayList, class068894, class007342, 0, class007342.N, d);
            }
            if (bl4) {
                class11895.N(arrayList, class068894, class007342, 1, class007342.i, d);
            }
            if (bl5) {
                class11895.N(arrayList, class068894, class007342, 1, class007342.y, d);
            }
            if (bl6) {
                class11895.N(arrayList, class068894, class007342, 2, class007342.R, d);
            }
            if (bl7) {
                class11895.N(arrayList, class068894, class007342, 2, class007342.L, d);
            }
        }
        double d5 = (d - G[1]) * (d - G[2]) + G[3];
        return arrayList.stream().min(Comparator.comparingInt(class068893 -> class068893.M(class068894) <= d5 ? 0 : 1).thenComparingDouble(class068892 -> class11895.N(class114992, class068892))).orElseGet(() -> class11895.N(class007342));
    }

    private static void N(List<class06889> list, class06889 class068892, class11499 class114992, class00734 class007342, int n, double d, double d2) {
        class06889 class068893 = class11895.N(class068892, class114992, class007342, n, d, d2);
        class11895.N(list, class068892, class068893);
    }

    private static class06889 N(int n, double d, double d2, double d3) {
        if (n == 0) {
            return new class06889(d, d2, d3);
        }
        if (n == 1) {
            return new class06889(d2, d, d3);
        }
        return new class06889(d2, d3, d);
    }

    public static class06889 N(class07049 class070492, class11499 class114992, boolean bl, double d) {
        return class11895.N(class070492, class114992, bl, d, class007342 -> class007342.B(P[3]));
    }

    private static class06889 N(class06889 class068892, class06889 class068893, int n, double d, double[] dArray, double[] dArray2, double d2) {
        double d3 = d2 - m[3];
        double d4 = n == 0 ? class068893.M : (n == 1 ? class068893.B : class068893.Z);
        double d5 = d - d4;
        double d6 = n == 0 ? class068893.B : class068893.M;
        double d7 = n == 2 ? class068893.B : class068893.Z;
        class06889 class068894 = class11895.N(n, d, d6, d7);
        class06889 class068895 = class11895.N(n, d, class04995.N((double)d6, (double)dArray[0], (double)dArray[1]), class04995.N((double)d7, (double)dArray2[0], (double)dArray2[1]));
        double d8 = d3 * d3 - d5 * d5;
        if (d8 <= m[4]) {
            return class068895;
        }
        if (class068892.M(class068894) <= d8) {
            return class068892;
        }
        if (class068895.M(class068894) > d8) {
            return class068895;
        }
        return class11895.N(class068892, class068895, class068894, Math.sqrt(d8));
    }

    private static class06889 N(class06889 class068892, class11499 class114992, class00734 class007342, int n, double d, double d2) {
        double d3;
        class06889 class068893;
        double d4;
        double d5;
        double d6;
        double[] dArray;
        double[] dArray2;
        if (n == 0) {
            dArray2 = class11895.N(class007342.y, class007342.i);
            dArray = class11895.N(class007342.L, class007342.R);
        } else if (n == 1) {
            dArray2 = class11895.N(class007342.N, class007342.u);
            dArray = class11895.N(class007342.L, class007342.R);
        } else {
            dArray2 = class11895.N(class007342.N, class007342.u);
            dArray = class11895.N(class007342.y, class007342.i);
        }
        class06889 class068894 = class114992.U();
        class06889 class068895 = null;
        double d7 = n == 0 ? class068894.M : (d6 = n == 1 ? class068894.B : class068894.Z);
        if (Math.abs(d6) > m[0] && (d5 = (d - (d4 = n == 0 ? class068892.M : (n == 1 ? class068892.B : class068892.Z))) / d6) >= m[1]) {
            double d8;
            class068893 = class068892.i(class068894.L(d5));
            d3 = n == 0 ? class068893.B : class068893.M;
            double d9 = d8 = n == 2 ? class068893.B : class068893.Z;
            if (d3 >= dArray2[0] && d3 <= dArray2[1] && d8 >= dArray[0] && d8 <= dArray[1]) {
                class068895 = class068893;
            }
        }
        if (class068895 == null) {
            class06889 class068896 = class11895.N(n, d, dArray2[0], dArray[0]);
            class06889 class068897 = class11895.N(n, d, dArray2[1], dArray[0]);
            class06889 class068898 = class11895.N(n, d, dArray2[1], dArray[1]);
            class06889 class068899 = class11895.N(n, d, dArray2[0], dArray[1]);
            class068893 = new class06889[][]{{class068896, class068897}, {class068897, class068898}, {class068898, class068899}, {class068899, class068896}};
            class068895 = class068896;
            d3 = m[2];
            for (class06889 class0688910 : class068893) {
                class06889 class0688911 = class11895.N(class114992, class0688910[0], class0688910[1]);
                double d10 = class11895.N(class114992, class0688911);
                if (!(d10 < d3)) continue;
                d3 = d10;
                class068895 = class0688911;
            }
        }
        return class11895.N(class068895, class068892, n, d, dArray2, dArray, d2);
    }

    private static class06889 N(List<class06889> list, class11499 class114992, class06889 class068894, boolean bl) {
        return list.stream().filter(class068892 -> !bl || class11892.N(class068892, class05849.field_17559, class05835.field_1348)).min(Comparator.comparingDouble(class068893 -> {
            double d = class068893.M - class068892.M;
            double d2 = class068893.Z - class068892.Z;
            return d * d + d2 * d2;
        }).thenComparing(class068892 -> {
            class07109 class071092 = class11505.N((class11499)class114992, (class06889)class068892).L();
            return Math.hypot(class071092.z, class071092.U);
        })).orElse(class068894);
    }

    public static class06889 N(class07049 class070492, class11499 class114992, double d) {
        return class11895.N(class070492, class114992, d, class007342 -> class007342.B(P[1]));
    }

    private static void N(List<class06889> list, class06889 class068892, class06889 class068893) {
        if (!class11892.N(class068892, class068893, class05849.field_17559, class05835.field_1348)) {
            return;
        }
        list.add(class068893);
    }

    public static class06889 N(class07049 class070492) {
        return class11895.N(class070492.method_5829().B(G[0]));
    }

    private static void R() {
    }
}

