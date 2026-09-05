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

import minecraft.class05459;
import minecraft.class05464;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class05475 {
    private static @Nullable class07209 N(class07475 class074752, int n, boolean bl, class07209 class072092) {
        class07209 class072093 = class05464.N(class074752, (double)n, class074752.method_59922(), class072092);
        if (class05459.N(class072093, class074752) || class05459.N(bl, class074752, class072093) || class05459.N(class074752.f(), class072093) || class05459.y(class074752, class072093)) {
            return null;
        }
        return class072093;
    }

    public static @Nullable class06889 N(class07475 class074752, int n, int n2, class06889 class068892) {
        class06889 class068893 = class074752.method_73189().u(class068892);
        boolean bl = class05459.N(class074752, n);
        return class05464.N(class074752, () -> {
            class07209 class072092 = class05464.N(class074752.method_59922(), 0.0, n, n2, 0, class068892.M, class068892.Z, 1.5707963705062866);
            if (class072092 == null) {
                return null;
            }
            return class05475.N(class074752, n, bl, class072092);
        });
    }

    public static @Nullable class06889 N(class07475 class074752, int n, int n2, class06889 class068892, double d) {
        class06889 class068893 = class068892.N(class074752.method_23317(), class074752.method_23318(), class074752.method_23321());
        boolean bl = class05459.N(class074752, n);
        return class05464.N(class074752, () -> {
            class07209 class072092 = class05464.N(class074752.method_59922(), 0.0, n, n2, 0, class068892.M, class068892.Z, d);
            if (class072092 == null) {
                return null;
            }
            return class05475.N(class074752, n, bl, class072092);
        });
    }

    public static @Nullable class06889 N(class07475 class074752, int n, int n2) {
        boolean bl = class05459.N(class074752, n);
        return class05464.N(class074752, () -> {
            class07209 class072092 = class05464.N(class074752.method_59922(), n, n2);
            return class05475.N(class074752, n, bl, class072092);
        });
    }
}

