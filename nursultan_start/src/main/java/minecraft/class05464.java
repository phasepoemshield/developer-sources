/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class05464 {
    private static final int N = 10;

    public static class07209 N(class07209 class072092, int n, int n2, Predicate<class07209> predicate) {
        if (n < 0) {
            throw new IllegalArgumentException("aboveSolidAmount was " + n + ", expected >= 0");
        }
        if (predicate.test(class072092)) {
            class07218 class072182 = class072092.method_25503().N(class07211.field_11036);
            while (class072182.method_10264() <= n2 && predicate.test((class07209)class072182)) {
                class072182.N(class07211.field_11036);
            }
            int n3 = class072182.method_10264();
            while (class072182.method_10264() <= n2 && class072182.method_10264() - n3 < n) {
                class072182.N(class07211.field_11036);
                if (!predicate.test((class07209)class072182)) continue;
                class072182.N(class07211.field_11033);
                break;
            }
            return class072182.method_10062();
        }
        return class072092;
    }

    public static @Nullable class06889 N(class07475 class074752, Supplier<@Nullable class07209> supplier) {
        return class05464.N(supplier, arg_0 -> ((class07475)class074752).u(arg_0));
    }

    public static @Nullable class06889 N(Supplier<@Nullable class07209> supplier, ToDoubleFunction<class07209> toDoubleFunction) {
        double d = Double.NEGATIVE_INFINITY;
        class07209 class072092 = null;
        for (int i = 0; i < 10; ++i) {
            double d2;
            class07209 class072093 = supplier.get();
            if (class072093 == null || !((d2 = toDoubleFunction.applyAsDouble(class072093)) > d)) continue;
            d = d2;
            class072092 = class072093;
        }
        return class072092 != null ? class06889.L(class072092) : null;
    }

    public static class07209 N(class07475 class074752, double d, class06069 class060692, class07209 class072092) {
        double d2 = class072092.method_10263();
        double d3 = class072092.method_10260();
        if (class074752.Nj() && d > 1.0) {
            class07209 class072093 = class074752.Ns();
            d2 = class074752.method_23317() > (double)class072093.method_10263() ? (d2 -= class060692.U() * d / 2.0) : (d2 += class060692.U() * d / 2.0);
            d3 = class074752.method_23321() > (double)class072093.method_10260() ? (d3 -= class060692.U() * d / 2.0) : (d3 += class060692.U() * d / 2.0);
        }
        return class07209.method_49637((double)(d2 + class074752.method_23317()), (double)((double)class072092.method_10264() + class074752.method_23318()), (double)(d3 + class074752.method_23321()));
    }

    public static class07209 N(class07209 class072092, int n, Predicate<class07209> predicate) {
        if (predicate.test(class072092)) {
            class07218 class072182 = class072092.method_25503().N(class07211.field_11036);
            while (class072182.method_10264() <= n && predicate.test((class07209)class072182)) {
                class072182.N(class07211.field_11036);
            }
            return class072182.method_10062();
        }
        return class072092;
    }

    public static @Nullable class07209 N(class06069 class060692, double d, double d2, int n, int n2, double d3, double d4, double d5) {
        double d6 = class04995.u((double)d4, (double)d3) - 1.5707963705062866 + (double)(2.0f * class060692.z() - 1.0f) * d5;
        double d7 = class04995.u((double)Math.sqrt(class060692.U()), (double)d, (double)d2) * (double)class04995.M;
        double d8 = -d7 * Math.sin(d6);
        double d9 = d7 * Math.cos(d6);
        if (Math.abs(d8) > d2 || Math.abs(d9) > d2) {
            return null;
        }
        int n3 = class060692.y(2 * n + 1) - n + n2;
        return class07209.method_49637((double)d8, (double)n3, (double)d9);
    }

    public static class07209 N(class06069 class060692, int n, int n2) {
        int n3 = class060692.y(2 * n + 1) - n;
        int n4 = class060692.y(2 * n2 + 1) - n2;
        int n5 = class060692.y(2 * n + 1) - n;
        return new class07209(n3, n4, n5);
    }
}

