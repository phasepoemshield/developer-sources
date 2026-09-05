/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class01009
 *  minecraft.class01210
 *  minecraft.class01325
 *  minecraft.class01340
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07284
 *  minecraft.class07290
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class01009;
import minecraft.class01210;
import minecraft.class01325;
import minecraft.class01340;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07136;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jspecify.annotations.Nullable;

public class class07121 {
    private static final int L = 2;
    public static final int N = 21;
    private static final int u = 3;
    public static final int y = 21;
    private static final class01340 i = (class005002, class072902, class072092) -> class005002.N(class00869.LV);
    private static final float R = 4.0f;
    private static final double M = 1.0;
    private final class07185 B;
    private final class07211 Z;
    private final int z;
    private final class07209 U;
    private final int E;
    private final int W;

    private class07121(class07185 class071852, int n, class07211 class072112, class07209 class072092, int n2, int n3) {
        this.B = class071852;
        this.z = n;
        this.Z = class072112;
        this.U = class072092;
        this.W = n2;
        this.E = n3;
    }

    private static int y(class07290 class072902, class07209 class072092, class07211 class072112) {
        class07218 class072182 = new class07218();
        for (int i = 0; i <= 21; ++i) {
            class072182.N(class072092).N(class072112, i);
            class00500 class005002 = class072902.method_8320((class07209)class072182);
            if (!class07121.N(class005002)) {
                if (!class07121.i.test(class005002, class072902, (class07209)class072182)) break;
                return i;
            }
            class00500 class005003 = class072902.method_8320((class07209)class072182.N(class07211.field_11033));
            if (!class07121.i.test(class005003, class072902, (class07209)class072182)) break;
        }
        return 0;
    }

    public boolean y() {
        return this.N() && this.z == this.W * this.E;
    }

    public static class06889 N(class06889 class068893, class04782 class047822, class07049 class070492, class01325 class013252) {
        if (class013252.N() > 4.0f || class013252.y() > 4.0f) {
            return class068893;
        }
        double d = (double)class013252.y() / 2.0;
        class06889 class068894 = class068893.y(0.0, d, 0.0);
        class00494 class004942 = class00389.N((class00734)class00734.N((class06889)class068894, (double)class013252.N(), (double)0.0, (double)class013252.N()).y(0.0, 1.0, 0.0).M(1.0E-6));
        return class047822.method_33594(class070492, class004942, class068894, (double)class013252.N(), (double)class013252.y(), (double)class013252.N()).map(class068892 -> class068892.N(0.0, d, 0.0)).orElse(class068893);
    }

    public static class06889 N(class01009 class010092, class07185 class071852, class06889 class068892, class01325 class013252) {
        class07185 class071853;
        double d;
        double d2;
        double d3 = (double)class010092.y - (double)class013252.N();
        double d4 = (double)class010092.L - (double)class013252.y();
        class07209 class072092 = class010092.N;
        if (d3 > 0.0) {
            d2 = (double)class072092.method_30558(class071852) + (double)class013252.N() / 2.0;
            d = class04995.N((double)class04995.L((double)(class068892.N(class071852) - d2), (double)0.0, (double)d3), (double)0.0, (double)1.0);
        } else {
            d = 0.5;
        }
        if (d4 > 0.0) {
            class071853 = class07185.field_11052;
            d2 = class04995.N((double)class04995.L((double)(class068892.N(class071853) - (double)class072092.method_30558(class071853)), (double)0.0, (double)d4), (double)0.0, (double)1.0);
        } else {
            d2 = 0.0;
        }
        class071853 = class071852 == class07185.field_11048 ? class07185.field_11051 : class07185.field_11048;
        double d5 = class068892.N(class071853) - ((double)class072092.method_30558(class071853) + 0.5);
        return new class06889(d, d2, d5);
    }

    public void N(class07284 class072842) {
        class00500 class005002 = (class00500)class00869.iq.W().y(class07136.y, (Comparable)((Object)this.B));
        class07209.method_10097(this.U, this.U.method_10079(class07211.field_11036, this.E - 1).method_10079(this.Z, this.W - 1)).forEach(class072092 -> class072842.method_8652(class072092, class005002, 18));
    }

    private static boolean N(class00500 class005002) {
        return class005002.P() || class005002.N(class01210.Nh) || class005002.N(class00869.iq);
    }

    private static int N(class07290 class072902, class07209 class072092, class07211 class072112, int n, MutableInt mutableInt) {
        class07218 class072182 = new class07218();
        int n2 = class07121.N(class072902, class072092, class072112, class072182, n, mutableInt);
        if (n2 < 3 || n2 > 21 || !class07121.N(class072902, class072092, class072112, class072182, n, n2)) {
            return 0;
        }
        return n2;
    }

    private static int N(class07290 class072902, class07209 class072092, class07211 class072112) {
        int n = class07121.y(class072902, class072092, class072112);
        if (n < 2 || n > 21) {
            return 0;
        }
        return n;
    }

    private static @Nullable class07209 N(class07290 class072902, class07211 class072112, class07209 class072092) {
        int n = Math.max(class072902.method_31607(), class072092.method_10264() - 21);
        while (class072092.method_10264() > n && class07121.N(class072902.method_8320(class072092.method_10074()))) {
            class072092 = class072092.method_10074();
        }
        class07211 class072113 = class072112.b();
        int n2 = class07121.y(class072902, class072092, class072113) - 1;
        if (n2 < 0) {
            return null;
        }
        return class072092.method_10079(class072113, n2);
    }

    public static class07121 N(class07290 class072902, class07209 class072092, class07185 class071852) {
        class07211 class072112 = class071852 == class07185.field_11048 ? class07211.field_11039 : class07211.field_11035;
        class07209 class072093 = class07121.N(class072902, class072112, class072092);
        if (class072093 == null) {
            return new class07121(class071852, 0, class072112, class072092, 0, 0);
        }
        int n = class07121.N(class072902, class072093, class072112);
        if (n == 0) {
            return new class07121(class071852, 0, class072112, class072093, 0, 0);
        }
        MutableInt mutableInt = new MutableInt();
        int n2 = class07121.N(class072902, class072093, class072112, n, mutableInt);
        return new class07121(class071852, mutableInt.intValue(), class072112, class072093, n, n2);
    }

    public static Optional<class07121> N(class07284 class072842, class07209 class072092, Predicate<class07121> predicate, class07185 class071852) {
        Optional<class07121> optional = Optional.of(class07121.N((class07290)class072842, class072092, class071852)).filter(predicate);
        if (optional.isPresent()) {
            return optional;
        }
        class07185 class071853 = class071852 == class07185.field_11048 ? class07185.field_11051 : class07185.field_11048;
        return Optional.of(class07121.N((class07290)class072842, class072092, class071853)).filter(predicate);
    }

    public boolean N() {
        return this.W >= 2 && this.W <= 21 && this.E >= 3 && this.E <= 21;
    }

    public static Optional<class07121> N(class07284 class072842, class07209 class072092, class07185 class071852) {
        return class07121.N(class072842, class072092, (class07121 class071212) -> class071212.N() && class071212.z == 0, class071852);
    }

    private static int N(class07290 class072902, class07209 class072092, class07211 class072112, class07218 class072182, int n, MutableInt mutableInt) {
        for (int i = 0; i < 21; ++i) {
            class072182.N(class072092).N(class07211.field_11036, i).N(class072112, -1);
            if (!class07121.i.test(class072902.method_8320((class07209)class072182), class072902, (class07209)class072182)) {
                return i;
            }
            class072182.N(class072092).N(class07211.field_11036, i).N(class072112, n);
            if (!class07121.i.test(class072902.method_8320((class07209)class072182), class072902, (class07209)class072182)) {
                return i;
            }
            for (int j = 0; j < n; ++j) {
                class072182.N(class072092).N(class07211.field_11036, i).N(class072112, j);
                class00500 class005002 = class072902.method_8320((class07209)class072182);
                if (!class07121.N(class005002)) {
                    return i;
                }
                if (!class005002.N(class00869.iq)) continue;
                mutableInt.increment();
            }
        }
        return 21;
    }

    private static boolean N(class07290 class072902, class07209 class072092, class07211 class072112, class07218 class072182, int n, int n2) {
        for (int i = 0; i < n; ++i) {
            class07218 class072183 = class072182.N(class072092).N(class07211.field_11036, n2).N(class072112, i);
            if (class07121.i.test(class072902.method_8320((class07209)class072183), class072902, (class07209)class072183)) continue;
            return false;
        }
        return true;
    }
}

