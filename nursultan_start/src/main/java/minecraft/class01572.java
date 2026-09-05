/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00807
 *  minecraft.class00869
 *  minecraft.class04995
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00807;
import minecraft.class00869;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07209;

public class class01572
extends class06391<class06225> {
    public class01572(Codec<class06225> codec) {
        super(codec);
    }

    public boolean N(class06058<class06225> class060582) {
        int n;
        int n2;
        class07209 class072092 = class060582.i();
        class06069 class060692 = class060582.u();
        class05974 class059742 = class060582.y();
        while (class059742.R(class072092) && class072092.method_10264() > class059742.method_31607() + 2) {
            class072092 = class072092.method_10074();
        }
        if (!class059742.method_8320(class072092).N(class00869.ib)) {
            return false;
        }
        class072092 = class072092.method_10086(class060692.y(4));
        int n3 = class060692.y(4) + 7;
        int n4 = n3 / 4 + class060692.y(2);
        if (n4 > 1 && class060692.y(60) == 0) {
            class072092 = class072092.method_10086(10 + class060692.y(30));
        }
        for (n2 = 0; n2 < n3; ++n2) {
            float f = (1.0f - (float)n2 / (float)n3) * (float)n4;
            n = class04995.u((float)f);
            for (int i = -n; i <= n; ++i) {
                float f2 = (float)class04995.N((int)i) - 0.25f;
                for (int j = -n; j <= n; ++j) {
                    float f3 = (float)class04995.N((int)j) - 0.25f;
                    if ((i != 0 || j != 0) && f2 * f2 + f3 * f3 > f * f || (i == -n || i == n || j == -n || j == n) && class060692.z() > 0.75f) continue;
                    class00500 class005002 = class059742.method_8320(class072092.method_10069(i, n2, j));
                    if (class005002.P() || class01572.y((class00500)class005002) || class005002.N(class00869.ib) || class005002.N(class00869.iT)) {
                        this.N((class00807)class059742, class072092.method_10069(i, n2, j), class00869.zn.W());
                    }
                    if (n2 == 0 || n <= 1 || !(class005002 = class059742.method_8320(class072092.method_10069(i, -n2, j))).P() && !class01572.y((class00500)class005002) && !class005002.N(class00869.ib) && !class005002.N(class00869.iT)) continue;
                    this.N((class00807)class059742, class072092.method_10069(i, -n2, j), class00869.zn.W());
                }
            }
        }
        n2 = n4 - 1;
        if (n2 < 0) {
            n2 = 0;
        } else if (n2 > 1) {
            n2 = 1;
        }
        for (int i = -n2; i <= n2; ++i) {
            for (n = -n2; n <= n2; ++n) {
                class00500 class005003;
                class07209 class072093 = class072092.method_10069(i, -1, n);
                int n5 = 50;
                if (Math.abs(i) == 1 && Math.abs(n) == 1) {
                    n5 = class060692.y(5);
                }
                while (class072093.method_10264() > 50 && ((class005003 = class059742.method_8320(class072093)).P() || class01572.y((class00500)class005003) || class005003.N(class00869.ib) || class005003.N(class00869.iT) || class005003.N(class00869.zn))) {
                    this.N((class00807)class059742, class072093, class00869.zn.W());
                    class072093 = class072093.method_10074();
                    if (--n5 > 0) continue;
                    class072093 = class072093.method_10087(class060692.y(5) + 1);
                    n5 = class060692.y(5);
                }
            }
        }
        return true;
    }
}

