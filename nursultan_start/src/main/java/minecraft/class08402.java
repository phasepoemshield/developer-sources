/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07299
 *  minecraft.class07830
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07299;
import minecraft.class07830;

public class class08402 {
    private static final int N = 2100;
    private static final int y = 200;
    private static final int L = 130;
    private static final int u = 3;
    private static final int i = 3;
    private static final int R = 8;
    private static final int M = 5;
    private static final int B = 4;

    public static void L(class07299 class072992, class07209 class072092, class06069 class060692) {
        if (class060692.y(130) == 0) {
            class00500 class005002 = class072992.method_8320(class072092.method_10074());
            if ((class005002.N(class00869.c) || class005002.N(class01210.NR)) && class060692.y(3) != 0) {
                return;
            }
            if (class08402.N(class072992, class072092.method_10074())) {
                class072992.method_8486((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class04909.Bf, class04911.field_15256, 1.0f, 1.0f, false);
            }
        }
    }

    private static boolean y(class07299 class072992, class07209 class072092) {
        int n = 0;
        int n2 = 0;
        class07218 class072182 = class072092.method_25503();
        for (class07211 class072112 : class07221.field_11062) {
            class072182.N((class00753)class072092).N(class072112, 8);
            if (class08402.N(class072992, class072182) && n++ >= 3) {
                return true;
            }
            if (4 - ++n2 + n >= 3) continue;
            return false;
        }
        return false;
    }

    public static void y(class07299 class072992, class07209 class072092, class06069 class060692) {
        if (class060692.y(200) == 0 && class08402.N(class072992, class072092.method_10074())) {
            class072992.method_67392(class04909.Zh, class04911.field_15256, 1.0f, 1.0f);
        }
    }

    private static boolean N(class00500 class005002) {
        return class005002.N(class01210.LA);
    }

    private static boolean N(class07299 class072992, class07218 class072182) {
        int n = class072992.y(class07830.field_13202, (class07209)class072182) - 1;
        if (Math.abs(n - class072182.method_10264()) <= 5) {
            boolean bl = class072992.method_8320((class07209)class072182.method_10099(n + 1)).P();
            return bl && class08402.N(class072992.method_8320((class07209)class072182.method_10099(n)));
        }
        class072182.N(class07211.field_11036, 6);
        class00500 class005002 = class072992.method_8320((class07209)class072182);
        class072182.N(class07211.field_11033);
        for (int i = 0; i < 10; ++i) {
            class00500 class005003 = class072992.method_8320((class07209)class072182);
            if (class005002.P() && class08402.N(class005003)) {
                return true;
            }
            class005002 = class005003;
            class072182.N(class07211.field_11033);
        }
        return false;
    }

    public static boolean N(class07299 class072992, class07209 class072092) {
        return class072992.method_8320(class072092).N(class01210.Lf) && class072992.method_8320(class072092.method_10074()).N(class01210.Lf);
    }

    public static void N(class07299 class072992, class07209 class072092, class06069 class060692) {
        if (!class072992.method_8320(class072092.method_10084()).N(class00869.N)) {
            return;
        }
        if (class060692.y(2100) == 0 && class08402.y(class072992, class072092)) {
            class072992.method_8486((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class04909.dq, class04911.field_15256, 1.0f, 1.0f, false);
        }
    }
}

