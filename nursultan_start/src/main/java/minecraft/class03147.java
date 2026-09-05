/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class03967
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class03967;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;

public class class03147
extends class06391<class03967> {
    public class03147(Codec<class03967> codec) {
        super(codec);
    }

    public boolean N(class06058<class03967> class060582) {
        class00500 class005002;
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        class03967 class039672 = (class03967)class060582.R();
        while (class072092.method_10264() > class059742.method_31607() + 3 && (class059742.R(class072092.method_10074()) || !class03147.y((class00500)(class005002 = class059742.method_8320(class072092.method_10074()))) && !class03147.N((class00500)class005002))) {
            class072092 = class072092.method_10074();
        }
        if (class072092.method_10264() <= class059742.method_31607() + 3) {
            return false;
        }
        for (int i = 0; i < 3; ++i) {
            int n = class060692.y(2);
            int n2 = class060692.y(2);
            int n3 = class060692.y(2);
            float f = (float)(n + n2 + n3) * 0.333f + 0.5f;
            for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-n, -n2, -n3), (class07209)class072092.method_10069(n, n2, n3))) {
                if (!(class072093.method_10262((class00753)class072092) <= (double)(f * f))) continue;
                class059742.method_8652(class072093, class039672.y, 3);
            }
            class072092 = class072092.method_10069(-1 + class060692.y(2), -class060692.y(2), -1 + class060692.y(2));
        }
        return true;
    }
}

