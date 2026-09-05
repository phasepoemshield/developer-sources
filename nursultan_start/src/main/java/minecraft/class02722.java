/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01231
 *  minecraft.class04336
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01231;
import minecraft.class02673;
import minecraft.class04336;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class08088;

public class class02722
extends class06391<class02673> {
    public class02722(Codec<class02673> codec) {
        super(codec);
    }

    private static void N(class07209 class072092, int n, class05974 class059742, class02673 class026732, class06069 class060692) {
        int n2 = class072092.method_10263();
        int n3 = class072092.method_10260();
        class07218 class072182 = class072092.method_25503();
        for (int i = class072092.method_10264(); i < n; ++i) {
            class02722.N(class059742, class026732, class060692, n2, n3, class072182.N(n2, i, n3));
        }
    }

    private static void N(class05974 class059742, class02673 class026732, class06069 class060692, int n, int n2, class07218 class072182) {
        int n3 = class026732.u;
        Predicate<class00500> predicate = class005002 -> class005002.N(class026732.i);
        for (int i = 0; i < class026732.B; ++i) {
            class072182.N((class00753)class072182, class060692.y(n3) - class060692.y(n3), 0, class060692.y(n3) - class060692.y(n3));
            if (predicate.test(class059742.method_8320((class07209)class072182))) {
                class059742.method_8652((class07209)class072182, class026732.M.N(class060692, (class07209)class072182), 2);
            }
            class072182.method_20787(n);
            class072182.method_20788(n2);
        }
    }

    private static void N(class05974 class059742, class02673 class026732, class06069 class060692, class07209 class072092, class07218 class072182) {
        int n = class026732.z;
        int n2 = class026732.U;
        for (int i = 0; i < class026732.W; ++i) {
            class00500 class005002;
            class072182.N((class00753)class072092, class060692.y(n) - class060692.y(n), class060692.y(n2) - class060692.y(n2), class060692.y(n) - class060692.y(n));
            if (!class059742.R((class07209)class072182) || !(class005002 = class026732.E.N(class060692, (class07209)class072182)).N((class05487)class059742, (class07209)class072182) || !class059742.method_8320(class072182.method_10084()).L((class07290)class059742, (class07209)class072182, class07211.field_11033)) continue;
            class059742.method_8652((class07209)class072182, class005002, 2);
        }
    }

    public boolean N(class06058<class02673> class060582) {
        class07209 class072092;
        class05974 class059742 = class060582.y();
        if (!class059742.method_8320(class072092 = class060582.i()).P()) {
            return false;
        }
        class06069 class060692 = class060582.u();
        class07209 class072093 = class060582.i();
        class02673 class026732 = (class02673)class060582.R();
        class07218 class072182 = class072093.method_25503();
        if (class02722.N(class059742, class060582.L(), class026732, class060692, class072182, class072093)) {
            class02722.N(class059742, class026732, class060692, class072093, class072182);
        }
        return true;
    }

    private static boolean N(class05974 class059742, class02673 class026732, class07209 class072092) {
        class07218 class072182 = class072092.method_25503();
        for (int i = 1; i <= class026732.L; ++i) {
            class072182.N(class07211.field_11036);
            if (class02722.N(class059742.method_8320((class07209)class072182), i, class026732.m)) continue;
            return false;
        }
        return true;
    }

    private static boolean N(class00500 class005002, int n, int n2) {
        if (class005002.P()) {
            return true;
        }
        return n + 1 <= n2 && class005002.Y().N(class01231.N);
    }

    private static boolean N(class05974 class059742, class08088 class080882, class02673 class026732, class06069 class060692, class07218 class072182, class07209 class072092) {
        for (int i = 0; i < class026732.Z; ++i) {
            class072182.N(class07211.field_11036);
            if (!class026732.P.test((Object)class059742, (Object)class072182) || !class02722.N(class059742, class026732, (class07209)class072182)) continue;
            class07209 class072093 = class072182.method_10074();
            if (class059742.method_8316(class072093).N(class01231.y) || !class059742.method_8320(class072093).B()) {
                return false;
            }
            if (!((class04336)class026732.y.N()).N(class059742, class080882, class060692, (class07209)class072182)) continue;
            class02722.N(class072092, class072092.method_10264() + i, class059742, class026732, class060692);
            return true;
        }
        return false;
    }
}

