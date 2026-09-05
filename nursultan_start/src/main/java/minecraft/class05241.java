/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01458
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01458;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;

public class class05241
extends class06391<class01458> {
    public class05241(Codec<class01458> codec) {
        super(codec);
    }

    private void N(class07284 class072842, class07209 class072092, class06069 class060692, class01458 class014582) {
        if (class072842.R(class072092) && this.N(class072842, class072092, class060692)) {
            class072842.method_8652(class072092, class014582.y.N(class060692, class072092), 260);
        }
    }

    private boolean N(class07284 class072842, class07209 class072092, class06069 class060692) {
        class07209 class072093 = class072092.method_10074();
        class00500 class005002 = class072842.method_8320(class072093);
        if (class005002.N(class00869.Ek)) {
            return class060692.Z();
        }
        return class005002.L((class07290)class072842, class072093, class07211.field_11036);
    }

    public boolean N(class06058<class01458> class060582) {
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        class01458 class014582 = (class01458)class060582.R();
        if (class072092.method_10264() < class059742.method_31607() + 5) {
            return false;
        }
        int n = 2 + class060692.y(2);
        int n2 = 2 + class060692.y(2);
        for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-n, 0, -n2), (class07209)class072092.method_10069(n, 1, n2))) {
            int n3;
            int n4 = class072092.method_10263() - class072093.method_10263();
            if ((float)(n4 * n4 + (n3 = class072092.method_10260() - class072093.method_10260()) * n3) <= class060692.z() * 10.0f - class060692.z() * 6.0f) {
                this.N((class07284)class059742, class072093, class060692, class014582);
                continue;
            }
            if (!((double)class060692.z() < 0.031)) continue;
            this.N((class07284)class059742, class072093, class060692, class014582);
        }
        return true;
    }
}

