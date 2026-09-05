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
 *  minecraft.class07209
 *  minecraft.class07749
 *  minecraft.class07830
 *  minecraft.class08059
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
import minecraft.class07209;
import minecraft.class07749;
import minecraft.class07830;
import minecraft.class08059;
import minecraft.class08092;

public class class05594
extends class06391<class06212> {
    public class05594(Codec<class06212> codec) {
        super(codec);
    }

    public boolean N(class06058<class06212> class060582) {
        boolean bl = false;
        class06069 class060692 = class060582.u();
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class06212 class062122 = (class06212)class060582.R();
        int n = class060692.y(8) - class060692.y(8);
        int n2 = class060692.y(8) - class060692.y(8);
        int n3 = class059742.method_8624(class07830.field_13200, class072092.method_10263() + n, class072092.method_10260() + n2);
        class07209 class072093 = new class07209(class072092.method_10263() + n, n3, class072092.method_10260() + n2);
        if (class059742.method_8320(class072093).N(class00869.K)) {
            class00500 class005002;
            boolean bl2 = class060692.U() < (double)class062122.y;
            class00500 class005003 = class005002 = bl2 ? class00869.yo.W() : class00869.yJ.W();
            if (class005002.N((class05487)class059742, class072093)) {
                if (bl2) {
                    class00500 class005004 = (class00500)class005002.y((class08092)class07749.u, (Comparable)class08059.field_12609);
                    class07209 class072094 = class072093.method_10084();
                    if (class059742.method_8320(class072094).N(class00869.K)) {
                        class059742.method_8652(class072093, class005002, 2);
                        class059742.method_8652(class072094, class005004, 2);
                    }
                } else {
                    class059742.method_8652(class072093, class005002, 2);
                }
                bl = true;
            }
        }
        return bl;
    }
}

