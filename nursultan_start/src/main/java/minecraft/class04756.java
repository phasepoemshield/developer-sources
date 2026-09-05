/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class06994
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07830
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class06994;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07830;
import minecraft.class08092;

public class class04756
extends class06391<class06225> {
    public class04756(Codec<class06225> codec) {
        super(codec);
    }

    public boolean N(class06058<class06225> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class07218 class072182 = new class07218();
        class07218 class072183 = new class07218();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n = class072092.method_10263() + i;
                int n2 = class072092.method_10260() + j;
                int n3 = class059742.method_8624(class07830.field_13197, n, n2);
                class072182.N(n, n3, n2);
                class072183.N((class00753)class072182).N(class07211.field_11033, 1);
                class00780 class007802 = (class00780)class059742.i((class07209)class072182).N();
                if (class007802.N((class05487)class059742, (class07209)class072183, false)) {
                    class059742.method_8652((class07209)class072183, class00869.iT.W(), 2);
                }
                if (!class007802.y((class05487)class059742, (class07209)class072182)) continue;
                class059742.method_8652((class07209)class072182, class00869.is.W(), 2);
                class00500 class005002 = class059742.method_8320((class07209)class072183);
                if (!class005002.y((class08092)class06994.L)) continue;
                class059742.method_8652((class07209)class072183, (class00500)class005002.y((class08092)class06994.L, (Comparable)Boolean.valueOf(true)), 2);
            }
        }
        return true;
    }
}

