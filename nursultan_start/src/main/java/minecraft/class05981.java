/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class01210
 *  minecraft.class04316
 *  minecraft.class05487
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class01210;
import minecraft.class04316;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;

public class class05981
extends class06391<class04316> {
    public class05981(Codec<class04316> codec) {
        super(codec);
    }

    public boolean N(class06058<class04316> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class00500 class005002 = class059742.method_8320(class072092.method_10074());
        class04316 class043162 = (class04316)class060582.R();
        class06069 class060692 = class060582.u();
        if (!class005002.N(class01210.Nr)) {
            return false;
        }
        int n = class072092.method_10264();
        if (n < class059742.method_31607() + 1 || n + 1 > class059742.method_31600()) {
            return false;
        }
        int n2 = 0;
        for (int i = 0; i < class043162.u * class043162.u; ++i) {
            class07209 class072093 = class072092.method_10069(class060692.y(class043162.u) - class060692.y(class043162.u), class060692.y(class043162.i) - class060692.y(class043162.i), class060692.y(class043162.u) - class060692.y(class043162.u));
            class00500 class005003 = class043162.y.N(class060692, class072093);
            if (!class059742.R(class072093) || class072093.method_10264() <= class059742.method_31607() || !class005003.N((class05487)class059742, class072093)) continue;
            class059742.method_8652(class072093, class005003, 2);
            ++n2;
        }
        return n2 > 0;
    }
}

