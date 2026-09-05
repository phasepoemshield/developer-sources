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

public class class03863
extends class06391<class06225> {
    public class03863(Codec<class06225> codec) {
        super(codec);
    }

    public boolean N(class06058<class06225> class060582) {
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        if (class072092.method_10264() > class059742.method_8615() - 1) {
            return false;
        }
        if (!class059742.method_8320(class072092).N(class00869.K) && !class059742.method_8320(class072092.method_10074()).N(class00869.K)) {
            return false;
        }
        boolean bl = false;
        for (class07211 class072112 : class07211.values()) {
            if (class072112 == class07211.field_11033 || !class059742.method_8320(class072092.method_10093(class072112)).N(class00869.zn)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return false;
        }
        class059742.method_8652(class072092, class00869.mf.W(), 2);
        block1: for (int i = 0; i < 200; ++i) {
            class00500 class005002;
            class07211 class072112;
            int n = class060692.y(5) - class060692.y(6);
            int n2 = 3;
            if (n < 2) {
                n2 += n / 2;
            }
            if (n2 < 1 || !(class005002 = class059742.method_8320((class07209)(class072112 = class072092.method_10069(class060692.y(n2) - class060692.y(n2), n, class060692.y(n2) - class060692.y(n2))))).P() && !class005002.N(class00869.K) && !class005002.N(class00869.zn) && !class005002.N(class00869.iT)) continue;
            for (class07211 class072113 : class07211.values()) {
                if (!class059742.method_8320(class072112.method_10093(class072113)).N(class00869.mf)) continue;
                class059742.method_8652((class07209)class072112, class00869.mf.W(), 2);
                continue block1;
            }
        }
        return true;
    }
}

