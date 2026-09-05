/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06212
 *  minecraft.class06391
 *  minecraft.class06662
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07784
 *  minecraft.class07830
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06212;
import minecraft.class06391;
import minecraft.class06662;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07784;
import minecraft.class07830;
import minecraft.class08092;

public class class03087
extends class06391<class06212> {
    private static final class00500 NE = (class00500)((class00500)((class00500)class00869.mx.W().y((class08092)class07784.y, (Comparable)Integer.valueOf(1))).y((class08092)class07784.L, (Comparable)class06662.field_12469)).y((class08092)class07784.u, (Comparable)Integer.valueOf(0));
    private static final class00500 NW = (class00500)((class00500)NE.y((class08092)class07784.L, (Comparable)class06662.field_12468)).y((class08092)class07784.u, (Comparable)Integer.valueOf(1));
    private static final class00500 Nm = (class00500)NE.y((class08092)class07784.L, (Comparable)class06662.field_12468);
    private static final class00500 NP = (class00500)NE.y((class08092)class07784.L, (Comparable)class06662.field_12466);

    public class03087(Codec<class06212> codec) {
        super(codec);
    }

    public boolean N(class06058<class06212> class060582) {
        int n = 0;
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        class06212 class062122 = (class06212)class060582.R();
        class07218 class072182 = class072092.method_25503();
        class07218 class072183 = class072092.method_25503();
        if (class059742.R((class07209)class072182)) {
            if (class00869.mx.W().N((class05487)class059742, (class07209)class072182)) {
                int n2;
                int n3 = class060692.y(12) + 5;
                if (class060692.z() < class062122.y) {
                    n2 = class060692.y(4) + 1;
                    for (int i = class072092.method_10263() - n2; i <= class072092.method_10263() + n2; ++i) {
                        for (int j = class072092.method_10260() - n2; j <= class072092.method_10260() + n2; ++j) {
                            int n4;
                            int n5 = i - class072092.method_10263();
                            if (n5 * n5 + (n4 = j - class072092.method_10260()) * n4 > n2 * n2) continue;
                            class072183.N(i, class059742.method_8624(class07830.field_13202, i, j) - 1, j);
                            if (!class03087.y((class00500)class059742.method_8320((class07209)class072183))) continue;
                            class059742.method_8652((class07209)class072183, class00869.E.W(), 2);
                        }
                    }
                }
                for (n2 = 0; n2 < n3 && class059742.R((class07209)class072182); ++n2) {
                    class059742.method_8652((class07209)class072182, NE, 2);
                    class072182.N(class07211.field_11036, 1);
                }
                if (class072182.method_10264() - class072092.method_10264() >= 3) {
                    class059742.method_8652((class07209)class072182, NW, 2);
                    class059742.method_8652((class07209)class072182.N(class07211.field_11033, 1), Nm, 2);
                    class059742.method_8652((class07209)class072182.N(class07211.field_11033, 1), NP, 2);
                }
            }
            ++n;
        }
        return n > 0;
    }
}

