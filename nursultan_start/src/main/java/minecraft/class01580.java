/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;

public class class01580
extends class06391<class06225> {
    public class01580(Codec<class06225> codec) {
        super(codec);
    }

    public boolean N(class06058<class06225> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class06069 class060692 = class060582.u();
        if (!class059742.R(class072092)) {
            return false;
        }
        class00500 class005002 = class059742.method_8320(class072092.method_10084());
        if (!(class005002.N(class00869.id) || class005002.N(class00869.iY) || class005002.N(class00869.Tb))) {
            return false;
        }
        class059742.method_8652(class072092, class00869.io.W(), 2);
        for (int i = 0; i < 1500; ++i) {
            class07209 class072093 = class072092.method_10069(class060692.y(8) - class060692.y(8), -class060692.y(12), class060692.y(8) - class060692.y(8));
            if (!class059742.method_8320(class072093).P()) continue;
            int n = 0;
            for (class07211 class072112 : class07211.values()) {
                if (class059742.method_8320(class072093.method_10093(class072112)).N(class00869.io)) {
                    ++n;
                }
                if (n > 1) break;
            }
            if (n != true) continue;
            class059742.method_8652(class072093, class00869.io.W(), 2);
        }
        return true;
    }
}

