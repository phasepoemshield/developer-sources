/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class01190
 *  minecraft.class01192
 *  minecraft.class01194
 *  minecraft.class03508
 *  minecraft.class03556
 *  minecraft.class03978
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07321
 */
package minecraft;

import minecraft.class00737;
import minecraft.class01190;
import minecraft.class01192;
import minecraft.class01194;
import minecraft.class03481;
import minecraft.class03485;
import minecraft.class03508;
import minecraft.class03556;
import minecraft.class03978;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07321;

public interface class03493 {
    private static void y(class04782 class047822, class03508 class035082, class03481 class034812) {
        double d;
        double d2;
        int n;
        double d3;
        double d4;
        if (!class035082.i()) {
            return;
        }
        if (class035082.L == null) {
            class035082.N(false);
            return;
        }
        class06889 class068892 = class035082.L.L();
        class01190 class011902 = class034812.y();
        class06889 class068893 = class011902.N((class07299)class047822).orElse(class068892);
        int n2 = class035082.L();
        if (class047822.method_65096((class07126)new class01192(class011902, n2), d4 = class04995.u((double)(d3 = 1.0 - (double)n2 / (double)(n = class034812.N(class035082.L.y()))), (double)class068892.M, (double)class068893.M), d2 = class04995.u((double)d3, (double)class068892.B, (double)class068893.B), d = class04995.u((double)d3, (double)class068892.Z, (double)class068893.Z), 1, 0.0, 0.0, 0.0, 0.0) > 0) {
            class035082.N(false);
        }
    }

    private static boolean N(class04782 class047822, class03508 class035082, class03481 class034812, class03978 class039782) {
        class07209 class072092 = class07209.method_49638((class00737)class039782.L());
        class07209 class072093 = class034812.y().N((class07299)class047822).map(class07209::method_49638).orElse(class072092);
        if (class034812.i() && !class03493.N((class07299)class047822, class072093)) {
            return false;
        }
        class034812.N(class047822, class072092, (class03556<class01194>)class039782.N(), class039782.N(class047822).orElse(null), class039782.y(class047822).orElse(null), class03485.N(class072092, class072093));
        class035082.N(null);
        return true;
    }

    private static boolean N(class07299 class072992, class07209 class072092) {
        class07321 class073212 = new class07321(class072092);
        for (int i = class073212.B - 1; i <= class073212.B + 1; ++i) {
            for (int j = class073212.Z - 1; j <= class073212.Z + 1; ++j) {
                if (class072992.method_39425(class07321.u((int)i, (int)j)) && class072992.method_8398().N(i, j) != null) continue;
                return false;
            }
        }
        return true;
    }

    private static void N(class04782 class047822, class03508 class035082, class03481 class034812) {
        class035082.N().N(class047822.N()).ifPresent(class039782 -> {
            class035082.N(class039782);
            class06889 class068892 = class039782.L();
            class035082.N(class034812.N(class039782.y()));
            class047822.method_65096((class07126)new class01192(class034812.y(), class035082.L()), class068892.M, class068892.B, class068892.Z, 1, 0.0, 0.0, 0.0, 0.0);
            class034812.u();
            class035082.N().N();
        });
    }

    public static void N(class07299 class072992, class03508 class035082, class03481 class034812) {
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        if (class035082.L == null) {
            class03493.N(class047822, class035082, class034812);
        }
        if (class035082.L == null) {
            return;
        }
        boolean bl = class035082.L() > 0;
        class03493.y(class047822, class035082, class034812);
        class035082.u();
        if (class035082.L() <= 0) {
            bl = class03493.N(class047822, class035082, class034812, class035082.L);
        }
        if (bl) {
            class034812.u();
        }
    }
}

