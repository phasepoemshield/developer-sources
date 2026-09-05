/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class04995
 *  minecraft.class05974
 *  minecraft.class06337
 *  minecraft.class06342
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class08092
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06337;
import minecraft.class06342;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class08092;

public class class01175 {
    protected static boolean L(class07284 class072842, class07209 class072092) {
        if (class072842.method_8320(class072092).N(class01210.yI)) {
            class072842.method_8652(class072092, class00869.vF.W(), 2);
            return true;
        }
        return false;
    }

    public static boolean L(class00500 class005002) {
        return class005002.P() || class005002.N(class00869.K);
    }

    public static boolean i(class00500 class005002) {
        return class005002.P() || class005002.N(class00869.K) || class005002.N(class00869.V);
    }

    public static boolean u(class00500 class005002) {
        return !class005002.P() && !class005002.N(class00869.K);
    }

    protected static boolean y(class07284 class072842, class07209 class072092) {
        return class072842.method_16358(class072092, class01175::i);
    }

    public static boolean y(class00500 class005002) {
        return class005002.N(class00869.vF) || class005002.N(class01210.yI);
    }

    public static boolean N(class00500 class005002) {
        return class01175.y(class005002) || class005002.N(class00869.V);
    }

    protected static double N(double d, double d2, double d3, double d4) {
        if (d < d4) {
            d = d4;
        }
        double d5 = 0.384;
        double d6 = d / d2 * 0.384;
        double d7 = 0.75 * Math.pow(d6, 1.3333333333333333);
        double d8 = Math.pow(d6, 0.6666666666666666);
        double d9 = 0.3333333333333333 * Math.log(d6);
        double d10 = d3 * (d7 - d8 - d9);
        d10 = Math.max(d10, 0.0);
        return d10 / 0.384 * d2;
    }

    protected static boolean N(class07284 class072842, class07209 class072092) {
        return class072842.method_16358(class072092, class01175::L);
    }

    protected static void N(class07211 class072112, int n, boolean bl, Consumer<class00500> consumer) {
        if (n >= 3) {
            consumer.accept(class01175.N(class072112, class06337.field_28068));
            for (int i = 0; i < n - 3; ++i) {
                consumer.accept(class01175.N(class072112, class06337.field_28067));
            }
        }
        if (n >= 2) {
            consumer.accept(class01175.N(class072112, class06337.field_28066));
        }
        if (n >= 1) {
            consumer.accept(class01175.N(class072112, bl ? class06337.field_28064 : class06337.field_28065));
        }
    }

    protected static void N(class07284 class072842, class07209 class072092, class07211 class072112, int n, boolean bl) {
        if (!class01175.y(class072842.method_8320(class072092.method_10093(class072112.b())))) {
            return;
        }
        class07218 class072182 = class072092.method_25503();
        class01175.N(class072112, n, bl, (class00500 class005002) -> {
            if (class005002.N(class00869.vp)) {
                class005002 = (class00500)class005002.y((class08092)class06342.u, (Comparable)Boolean.valueOf(class072842.z((class07209)class072182)));
            }
            class072842.method_8652((class07209)class072182, class005002, 2);
            class072182.N(class072112);
        });
    }

    protected static boolean N(class05974 class059742, class07209 class072092, int n) {
        if (class01175.y((class07284)class059742, class072092)) {
            return false;
        }
        float f = 6.0f;
        float f2 = 6.0f / (float)n;
        for (float f3 = 0.0f; f3 < (float)Math.PI * 2; f3 += f2) {
            int n2;
            int n3 = (int)(class04995.P((double)f3) * (float)n);
            if (!class01175.y((class07284)class059742, class072092.method_10069(n3, 0, n2 = (int)(class04995.m((double)f3) * (float)n)))) continue;
            return false;
        }
        return true;
    }

    private static class00500 N(class07211 class072112, class06337 class063372) {
        return (class00500)((class00500)class00869.vp.W().y((class08092)class06342.y, (Comparable)class072112)).y((class08092)class06342.L, (Comparable)class063372);
    }
}

