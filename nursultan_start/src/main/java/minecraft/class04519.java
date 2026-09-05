/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07134
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class07209;
import minecraft.class07299;

interface class04519 {
    public static final class04519 N = (class072992, class060692, class072092, bl) -> {};
    public static final class04519 y = (class072992, class060692, class072092, bl) -> {
        if (class060692.y(2) == 0) {
            class06889 class068892 = class072092.method_46558().N(class060692, 0.9f);
            class04519.N(bl ? class07107.X : class07107.Nc, class068892, class072992);
        }
    };
    public static final class04519 L = (class072992, class060692, class072092, bl) -> {
        class06889 class068892 = class072092.method_46558().N(class060692, 1.0f);
        class04519.N(class07107.NZ, class068892, class072992);
        class04519.N(bl ? class07107.X : class07107.J, class068892, class072992);
    };
    public static final class04519 u = (class072992, class060692, class072092, bl) -> {
        class06889 class068892 = class072092.method_46558().N(class060692, 0.9f);
        if (class060692.y(3) == 0) {
            class04519.N(class07107.NZ, class068892, class072992);
        }
        if (class072992.N() % 20L == 0L) {
            class06889 class068893 = class072092.method_46558().y(0.0, 0.5, 0.0);
            int n = class072992.method_8409().y(4) + 20;
            for (int i = 0; i < n; ++i) {
                class04519.N(class07107.NZ, class068893, class072992);
            }
        }
    };

    private static void N(class07134 class071342, class06889 class068892, class07299 class072992) {
        class072992.method_8406((class07126)class071342, class068892.N(), class068892.y(), class068892.L(), 0.0, 0.0, 0.0);
    }

    public void emit(class07299 var1, class06069 var2, class07209 var3, boolean var4);
}

