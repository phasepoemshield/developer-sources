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
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class07110
 *  minecraft.class07209
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
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07110;
import minecraft.class07209;
import minecraft.class07830;
import minecraft.class08092;

public class class01536
extends class06391<class06225> {
    public class01536(Codec<class06225> codec) {
        super(codec);
    }

    public boolean N(class06058<class06225> class060582) {
        int n = 0;
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class06069 class060692 = class060582.u();
        int n2 = class059742.method_8624(class07830.field_13200, class072092.method_10263(), class072092.method_10260());
        class07209 class072093 = new class07209(class072092.method_10263(), n2, class072092.method_10260());
        if (class059742.method_8320(class072093).N(class00869.K)) {
            class00500 class005002 = class00869.Wh.W();
            class00500 class005003 = class00869.Wr.W();
            int n3 = 1 + class060692.y(10);
            for (int i = 0; i <= n3; ++i) {
                if (class059742.method_8320(class072093).N(class00869.K) && class059742.method_8320(class072093.method_10084()).N(class00869.K) && class005003.N((class05487)class059742, class072093)) {
                    if (i == n3) {
                        class059742.method_8652(class072093, (class00500)class005002.y((class08092)class07110.i, (Comparable)Integer.valueOf(class060692.y(4) + 20)), 2);
                        ++n;
                    } else {
                        class059742.method_8652(class072093, class005003, 2);
                    }
                } else if (i > 0) {
                    class07209 class072094 = class072093.method_10074();
                    if (!class005002.N((class05487)class059742, class072094) || class059742.method_8320(class072094.method_10074()).N(class00869.Wh)) break;
                    class059742.method_8652(class072094, (class00500)class005002.y((class08092)class07110.i, (Comparable)Integer.valueOf(class060692.y(4) + 20)), 2);
                    ++n;
                    break;
                }
                class072093 = class072093.method_10084();
            }
        }
        return n > 0;
    }
}

