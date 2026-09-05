/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class03874
 *  minecraft.class03875
 *  minecraft.class03912
 *  minecraft.class04844
 *  minecraft.class04890
 *  minecraft.class04932
 *  minecraft.class04995
 *  minecraft.class05163
 *  minecraft.class05236
 *  minecraft.class05246
 *  minecraft.class05324
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import minecraft.class03874;
import minecraft.class03875;
import minecraft.class03912;
import minecraft.class04844;
import minecraft.class04890;
import minecraft.class04932;
import minecraft.class04995;
import minecraft.class05163;
import minecraft.class05236;
import minecraft.class05246;
import minecraft.class05324;
import minecraft.class06040;
import minecraft.class06053;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class06051
implements class03874 {
    public static final int N = 12;
    private static final int M = 24;
    private static final float[] B = (float[])class07536.N((Object)new float[13824], (T fArray) -> {
        for (int i = 0; i < 24; ++i) {
            for (int j = 0; j < 24; ++j) {
                for (int k = 0; k < 24; ++k) {
                    fArray[i * 24 * 24 + j * 24 + k] = (float)class06051.N(j - 12, k - 12, i - 12);
                }
            }
        }
    });
    public static final class06051 y = new class06051(List.of(), List.of(), null);
    private final List<class06053> Z;
    private final List<class04844> z;
    private final @Nullable class05163 U;

    public class06051(List<class06053> list, List<class04844> list2, @Nullable class05163 class051632) {
        this.Z = list;
        this.z = list2;
        this.U = class051632;
    }

    public double y() {
        return Double.POSITIVE_INFINITY;
    }

    private static double N(int n, double d, int n2) {
        double d2 = class04995.R((double)n, (double)d, (double)n2);
        return Math.pow(Math.E, -d2 / 16.0);
    }

    private static double N(int n, int n2, int n3) {
        return class06051.N(n, (double)n2 + 0.5, n3);
    }

    private static boolean N(int n) {
        return n >= 0 && n < 24;
    }

    public static class06051 N(class05324 class053242, class07321 class073212) {
        List var2 = class053242.N(class073212, (T class047482) -> class047482.i() != class06040.field_28922);
        if (var2.isEmpty()) {
            return y;
        }
        int n = class073212.i();
        int n2 = class073212.R();
        ArrayList<class06053> arrayList = new ArrayList<class06053>();
        ArrayList<class04844> arrayList2 = new ArrayList<class04844>();
        class05163 class051632 = null;
        for (class04932 class049322 : var2) {
            class06040 class060402 = class049322.B().i();
            for (class04890 class048902 : class049322.Z()) {
                if (!class048902.N(class073212, 12)) continue;
                if (class048902 instanceof class05236) {
                    class05236 class052362 = (class05236)class048902;
                    if (class052362.y().M() == class05246.field_16687) {
                        arrayList.add(new class06053(class052362.L(), class060402, class052362.z()));
                        class051632 = class06051.N(class051632, class048902.L());
                    }
                    for (class04844 class048442 : class052362.U()) {
                        int n3 = class048442.N();
                        int n4 = class048442.L();
                        if (n3 <= n - 12 || n4 <= n2 - 12 || n3 >= n + 15 + 12 || n4 >= n2 + 15 + 12) continue;
                        arrayList2.add(class048442);
                        class05163 class051633 = new class05163(new class07209(n3, class048442.y(), n4));
                        class051632 = class06051.N(class051632, class051633);
                    }
                    continue;
                }
                arrayList.add(new class06053(class048902.L(), class060402, 0));
                class051632 = class06051.N(class051632, class048902.L());
            }
        }
        if (class051632 == null) {
            return y;
        }
        class05163 class051634 = class051632.N(24);
        return new class06051(List.copyOf(arrayList), List.copyOf(arrayList2), class051634);
    }

    private static class05163 N(@Nullable class05163 class051632, class05163 class051633) {
        if (class051632 == null) {
            return class051633;
        }
        return class05163.N((class05163)class051632, (class05163)class051633);
    }

    public void N(double[] dArray, class03912 class039122) {
        if (this.U == null) {
            Arrays.fill(dArray, 0.0);
        } else {
            super.N(dArray, class039122);
        }
    }

    public double N(class03875 class038752) {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.U == null) {
            return 0.0;
        }
        int n5 = class038752.y();
        if (!this.U.u(n5, n4 = class038752.L(), n3 = class038752.u())) {
            return 0.0;
        }
        double d = 0.0;
        for (class06053 class060532 : this.Z) {
            class05163 class051632 = class060532.N();
            n2 = class060532.L();
            n = Math.max(0, Math.max(class051632.B() - n5, n5 - class051632.U()));
            int n6 = Math.max(0, Math.max(class051632.z() - n3, n3 - class051632.W()));
            int n7 = class051632.Z() + n2;
            int n8 = n4 - n7;
            int n9 = switch (class060532.y()) {
                default -> throw new MatchException(null, null);
                case class06040.field_28922 -> 0;
                case class06040.field_28923, class06040.field_38431 -> n8;
                case class06040.field_38432 -> Math.max(0, Math.max(n7 - n4, n4 - class051632.E()));
                case class06040.field_51413 -> Math.max(0, Math.max(class051632.Z() - n4, n4 - class051632.E()));
            };
            d += (switch (class060532.y()) {
                default -> throw new MatchException(null, null);
                case class06040.field_28922 -> 0.0;
                case class06040.field_28923 -> class06051.N((double)n, (double)n9 / 2.0, (double)n6);
                case class06040.field_38431, class06040.field_38432 -> class06051.N(n, n9, n6, n8) * 0.8;
                case class06040.field_51413 -> class06051.N((double)n / 2.0, (double)n9 / 2.0, (double)n6 / 2.0) * 0.8;
            });
        }
        for (class04844 class048442 : this.z) {
            int n10 = n5 - class048442.N();
            n2 = n4 - class048442.y();
            n = n3 - class048442.L();
            d += class06051.N(n10, n2, n, n2) * 0.4;
        }
        return d;
    }

    public double N() {
        return Double.NEGATIVE_INFINITY;
    }

    private static double N(double d, double d2, double d3) {
        return class04995.N((double)class04995.M((double)d, (double)d2, (double)d3), (double)0.0, (double)6.0, (double)1.0, (double)0.0);
    }

    private static double N(int n, int n2, int n3, int n4) {
        int n5 = n + 12;
        int n6 = n2 + 12;
        int n7 = n3 + 12;
        if (!(class06051.N(n5) && class06051.N(n6) && class06051.N(n7))) {
            return 0.0;
        }
        double d = (double)n4 + 0.5;
        double d2 = class04995.R((double)n, (double)d, (double)n3);
        return -d * class04995.B((double)(d2 / 2.0)) / 2.0 * (double)B[n7 * 24 * 24 + n5 * 24 + n6];
    }
}

