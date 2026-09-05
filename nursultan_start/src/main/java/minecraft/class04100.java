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
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class04007;
import minecraft.class04059;
import minecraft.class04065;
import minecraft.class04076;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class08092;

public class class04100
extends class06391<class04059> {
    public class04100(Codec<class04059> codec) {
        super(codec);
    }

    public boolean N(class06058<class04059> class060582) {
        int n;
        int n2;
        class07209 class072092;
        class05974 class059742 = class060582.y();
        if (!this.N((class07284)class059742, class072092 = class060582.i())) {
            return false;
        }
        class04059 class040592 = (class04059)class060582.R();
        class06069 class060692 = class060582.u();
        class04076 class040762 = class04076.y();
        int n3 = class040592.R() + class040592.i();
        for (int i = 0; i < n3; ++i) {
            for (n2 = 0; n2 < class040592.N(); n2 += 1) {
                class040762.N(class072092, class040592.y());
            }
            n2 = i < class040592.R() ? 1 : 0;
            for (n = 0; n < class040592.L(); ++n) {
                class040762.N((class07284)class059742, class072092, class060692, n2 != 0);
            }
            class040762.z();
        }
        class07209 class072093 = class072092.method_10074();
        if (class060692.z() <= class040592.B() && class059742.method_8320(class072093).W((class07290)class059742, class072093)) {
            class059742.method_8652(class072092, class00869.bC.W(), 3);
        }
        n2 = class040592.M().N(class060692);
        for (n = 0; n < n2; ++n) {
            class07209 class072094 = class072092.method_10069(class060692.y(5) - 2, 0, class060692.y(5) - 2);
            if (!class059742.method_8320(class072094).P() || !class059742.method_8320(class072094.method_10074()).L((class07290)class059742, class072094.method_10074(), class07211.field_11036)) continue;
            class059742.method_8652(class072094, (class00500)class00869.bS.W().y((class08092)class04007.u, (Comparable)Boolean.valueOf(true)), 3);
        }
        return true;
    }

    private boolean N(class07284 class072842, class07209 class072093) {
        block5: {
            block4: {
                class00500 class005002 = class072842.method_8320(class072093);
                if (class005002.i() instanceof class04065) {
                    return true;
                }
                if (class005002.P()) break block4;
                if (!class005002.N(class00869.K) || !class005002.Y().u()) break block5;
            }
            return class07211.N().map(arg_0 -> ((class07209)class072093).method_10093(arg_0)).anyMatch(class072092 -> class072842.method_8320(class072092).W((class07290)class072842, class072092));
        }
        return false;
    }
}

