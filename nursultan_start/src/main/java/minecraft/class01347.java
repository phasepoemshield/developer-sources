/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class04329
 *  minecraft.class04983
 *  minecraft.class04995
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class04329;
import minecraft.class04983;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class08092;

public class class01347
extends class06391<class04329> {
    public class01347(Codec<class04329> codec) {
        super(codec);
    }

    private static boolean N(class07284 class072842, class07209 class072092) {
        if (!class072842.R(class072092)) {
            return true;
        }
        class00500 class005002 = class072842.method_8320(class072092.method_10074());
        return !class005002.N(class00869.id) && !class005002.N(class00869.sE) && !class005002.N(class00869.sm);
    }

    public static void N(class07284 class072842, class06069 class060692, class07218 class072182, int n, int n2, int n3) {
        for (int i = 1; i <= n; ++i) {
            if (class072842.R((class07209)class072182)) {
                if (i == n || !class072842.R(class072182.method_10084())) {
                    class072842.method_8652((class07209)class072182, (class00500)class00869.sw.W().y((class08092)class04983.i, (Comparable)Integer.valueOf(class04995.N((class06069)class060692, (int)n2, (int)n3))), 2);
                    break;
                }
                class072842.method_8652((class07209)class072182, class00869.sk.W(), 2);
            }
            class072182.N(class07211.field_11036);
        }
    }

    private static boolean N(class07284 class072842, class07218 class072182) {
        do {
            class072182.y(0, -1, 0);
            if (!class072842.method_31606((class07209)class072182)) continue;
            return false;
        } while (class072842.method_8320((class07209)class072182).P());
        class072182.y(0, 1, 0);
        return true;
    }

    public boolean N(class06058<class04329> class060582) {
        class07209 class072092;
        class05974 class059742 = class060582.y();
        if (class01347.N((class07284)class059742, class072092 = class060582.i())) {
            return false;
        }
        class06069 class060692 = class060582.u();
        class04329 class043292 = (class04329)class060582.R();
        int n = class043292.N();
        int n2 = class043292.y();
        int n3 = class043292.L();
        class07218 class072182 = new class07218();
        for (int i = 0; i < n * n; ++i) {
            class072182.N((class00753)class072092).y(class04995.N((class06069)class060692, (int)(-n), (int)n), class04995.N((class06069)class060692, (int)(-n2), (int)n2), class04995.N((class06069)class060692, (int)(-n), (int)n));
            if (!class01347.N((class07284)class059742, class072182) || class01347.N((class07284)class059742, (class07209)class072182)) continue;
            int n4 = class04995.N((class06069)class060692, (int)1, (int)n3);
            if (class060692.y(6) == 0) {
                n4 *= 2;
            }
            if (class060692.y(5) == 0) {
                n4 = 1;
            }
            int n5 = 17;
            int n6 = 25;
            class01347.N((class07284)class059742, class060692, class072182, n4, 17, 25);
        }
        return true;
    }
}

