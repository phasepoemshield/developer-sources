/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.ToDoubleFunction;
import minecraft.class05459;
import minecraft.class05464;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class05456 {
    public static @Nullable class06889 y(class07475 class074752, int n, int n2, class06889 class068892) {
        return class05456.N(class074752, 0.0, n, n2, class068892);
    }

    public static @Nullable class07209 N(class07475 class074752, class07209 class072093) {
        if (class05459.N(class074752, class072093 = class05464.N(class072093, class074752.method_73183().method_31600(), class072092 -> class05459.L(class074752, class072092))) || class05459.y(class074752, class072093)) {
            return null;
        }
        return class072093;
    }

    public static @Nullable class07209 N(class07475 class074752, double d, boolean bl, class07209 class072092) {
        class07209 class072093 = class05464.N(class074752, d, class074752.method_59922(), class072092);
        if (class05459.N(class072093, class074752) || class05459.N(bl, class074752, class072093) || class05459.N(class074752.f(), class072093)) {
            return null;
        }
        return class072093;
    }

    public static @Nullable class06889 N(class07475 class074752, int n, int n2) {
        return class05456.N(class074752, n, n2, arg_0 -> ((class07475)class074752).u(arg_0));
    }

    public static @Nullable class06889 N(class07475 class074752, int n, int n2, ToDoubleFunction<class07209> toDoubleFunction) {
        boolean bl = class05459.N(class074752, n);
        return class05464.N(() -> {
            class07209 class072092 = class05464.N(class074752.method_59922(), n, n2);
            class07209 class072093 = class05456.N(class074752, (double)n, bl, class072092);
            if (class072093 == null) {
                return null;
            }
            return class05456.N(class074752, class072093);
        }, toDoubleFunction);
    }

    public static @Nullable class06889 N(class07475 class074752, int n, int n2, class06889 class068892) {
        class06889 class068893 = class068892.N(class074752.method_23317(), class074752.method_23318(), class074752.method_23321());
        boolean bl = class05459.N(class074752, n);
        return class05456.N(class074752, 0.0, n, n2, class068893, bl);
    }

    public static @Nullable class06889 N(class07475 class074752, double d, double d2, int n, class06889 class068892) {
        class06889 class068893 = class074752.method_73189().u(class068892);
        if (class068893.M() == 0.0) {
            class068893 = new class06889(class074752.method_59922().U() - 0.5, 0.0, class074752.method_59922().U() - 0.5);
        }
        boolean bl = class05459.N(class074752, d2);
        return class05456.N(class074752, d, d2, n, class068893, bl);
    }

    private static @Nullable class06889 N(class07475 class074752, double d, double d2, int n, class06889 class068892, boolean bl) {
        return class05464.N(class074752, () -> {
            class07209 class072092 = class05464.N(class074752.method_59922(), d, d2, n, 0, class068892.M, class068892.Z, 1.5707963705062866);
            if (class072092 == null) {
                return null;
            }
            class07209 class072093 = class05456.N(class074752, d2, bl, class072092);
            if (class072093 == null) {
                return null;
            }
            return class05456.N(class074752, class072093);
        });
    }
}

