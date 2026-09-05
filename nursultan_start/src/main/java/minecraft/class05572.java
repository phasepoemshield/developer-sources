/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class05583;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;

public class class05572
extends class06391<class05583> {
    private static boolean L(class00500 class005002) {
        return class005002.P() || class005002.N(class00869.K);
    }

    public class05572(Codec<class05583> codec) {
        super(codec);
    }

    public boolean N(class06058<class05583> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class06069 class060692 = class060582.u();
        class05583 class055832 = (class05583)class060582.R();
        if (!class05572.L(class059742.method_8320(class072092))) {
            return false;
        }
        List<class07211> var6 = class055832.N(class060692);
        if (class05572.N(class059742, class072092, class059742.method_8320(class072092), class055832, class060692, var6)) {
            return true;
        }
        class07218 class072182 = class072092.method_25503();
        block0: for (class07211 class072112 : var6) {
            class072182.N((class00753)class072092);
            List<class07211> var10 = class055832.N(class060692, class072112.b());
            for (int i = 0; i < class055832.L; ++i) {
                class072182.N((class00753)class072092, class072112);
                class00500 class005002 = class059742.method_8320((class07209)class072182);
                if (!class05572.L(class005002) && !class005002.N((class00891)class055832.y)) continue block0;
                if (!class05572.N(class059742, (class07209)class072182, class005002, class055832, class060692, var10)) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean N(class05974 class059742, class07209 class072092, class00500 class005002, class05583 class055832, class06069 class060692, List<class07211> list) {
        class07218 class072182 = class072092.method_25503();
        for (class07211 class072112 : list) {
            if (!class059742.method_8320((class07209)class072182.N((class00753)class072092, class072112)).N(class055832.Z)) continue;
            class00500 class005003 = class055832.y.y(class005002, (class07290)class059742, class072092, class072112);
            if (class005003 == null) {
                return false;
            }
            class059742.method_8652(class072092, class005003, 3);
            class059742.method_8500(class072092).u(class072092);
            if (class060692.z() < class055832.B) {
                class055832.y.y().N(class005003, (class07284)class059742, class072092, class072112, class060692, true);
            }
            return true;
        }
        return false;
    }
}

