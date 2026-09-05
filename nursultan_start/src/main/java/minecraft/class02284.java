/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08092
 */
package minecraft;

import java.util.Set;
import java.util.UUID;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class02264;
import minecraft.class02271;
import minecraft.class02274;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08092;

public final class class02284 {
    private static final int N = 20;
    private static final float y = 0.5f;
    private static final float L = 0.02f;
    private static final int u = 20;
    private static final int i = 20;

    private static class06889 y(class07209 class072092, class06069 class060692) {
        return class06889.N((class00753)class072092).y(class04995.N((class06069)class060692, (double)0.1, (double)0.9), class04995.N((class06069)class060692, (double)0.25, (double)0.75), class04995.N((class06069)class060692, (double)0.1, (double)0.9));
    }

    private static boolean N(class07209 class072092, class02274 class022742, class08036 class080362) {
        return class080362.method_24515().method_10262((class00753)class072092) <= class04995.E((double)class022742.i());
    }

    private static void N(class07299 class072992, class07209 class072092, class02274 class022742) {
        if (!class02284.N(class022742)) {
            return;
        }
        class06069 class060692 = class072992.method_8409();
        if (class060692.z() <= 0.02f) {
            class072992.method_45446(class072092, class04909.Of, class04911.field_15245, class060692.z() * 0.25f + 0.75f, class060692.z() + 0.5f, false);
        }
    }

    public static boolean N(class02274 class022742) {
        return class022742.y();
    }

    private static class06889 N(class07209 class072092, class06069 class060692) {
        return class06889.N((class00753)class072092).y(class04995.N((class06069)class060692, (double)0.4, (double)0.6), class04995.N((class06069)class060692, (double)0.4, (double)0.6), class04995.N((class06069)class060692, (double)0.4, (double)0.6));
    }

    private static class06889 N(class07209 class072092, class07211 class072112) {
        return class06889.L((class00753)class072092).y((double)class072112.P() * 0.5, 1.75, (double)class072112.T() * 0.5);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class02264 class022642, class02274 class022742) {
        class022642.L();
        if (class072992.N() % 20L == 0L) {
            class02284.N(class072992, class072092, class005002, class022742);
        }
        class02284.N(class072992, class072092, class022742, (class07126)((Boolean)class005002.L((class08092)class02271.u) != false ? class07107.X : class07107.Nc));
        class02284.N(class072992, class072092, class022742);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class02274 class022742, class07126 class071262) {
        class02284.N(class072992, class072092, class005002, class022742);
        class06069 class060692 = class072992.field_9229;
        for (int i = 0; i < 20; ++i) {
            class06889 class068892 = class02284.y(class072092, class060692);
            class072992.method_8406((class07126)class07107.NZ, class068892.N(), class068892.y(), class068892.L(), 0.0, 0.0, 0.0);
            class072992.method_8406(class071262, class068892.N(), class068892.y(), class068892.L(), 0.0, 0.0, 0.0);
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class07126 class071262) {
        class06069 class060692 = class072992.field_9229;
        for (int i = 0; i < 20; ++i) {
            class06889 class068892 = class02284.N(class072092, class060692);
            class06889 class068893 = new class06889(class060692.E() * 0.02, class060692.E() * 0.02, class060692.E() * 0.02);
            class072992.method_8406(class071262, class068892.N(), class068892.y(), class068892.L(), class068893.N(), class068893.y(), class068893.L());
        }
    }

    private static void N(class07299 class072992, class07209 class072092, class02274 class022742, class07126 class071262) {
        class06069 class060692 = class072992.method_8409();
        if (class060692.z() <= 0.5f) {
            class06889 class068892 = class02284.y(class072092, class060692);
            class072992.method_8406((class07126)class07107.NZ, class068892.N(), class068892.y(), class068892.L(), 0.0, 0.0, 0.0);
            if (class02284.N(class022742)) {
                class072992.method_8406(class071262, class068892.N(), class068892.y(), class068892.L(), 0.0, 0.0, 0.0);
            }
        }
    }

    private static void N(class07299 class072992, class06889 class068892, class08036 class080362) {
        class06069 class060692 = class072992.field_9229;
        class06889 class068893 = class068892.N(class080362.method_73189().y(0.0, (double)(class080362.method_17682() / 2.0f), 0.0));
        int n = class04995.N((class06069)class060692, (int)2, (int)5);
        for (int i = 0; i < n; ++i) {
            class06889 class068894 = class068893.N(class060692, 1.0f);
            class072992.method_8406((class07126)class07107.yi, class068892.N(), class068892.y(), class068892.L(), class068894.N(), class068894.y(), class068894.L());
        }
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class02274 class022742) {
        Set<UUID> var4 = class022742.u();
        if (var4.isEmpty()) {
            return;
        }
        class06889 class068892 = class02284.N(class072092, (class07211)class005002.L(class02271.L));
        for (UUID uUID : var4) {
            class08036 class080362 = class072992.N(uUID);
            if (class080362 == null || !class02284.N(class072092, class022742, class080362)) continue;
            class02284.N(class072992, class068892, class080362);
        }
    }
}

