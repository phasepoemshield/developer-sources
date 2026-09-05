/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01362
 *  minecraft.class02142
 *  minecraft.class02151
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class06858
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01362;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class04007;
import minecraft.class04065;
import minecraft.class04076;
import minecraft.class04083;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class06858;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class08092;

public class class04094
extends class06858
implements class04065 {
    public static final MapCodec<class04094> y = class04094.y(class04094::new);

    public class04094(class01362 class013622) {
        super((class02142)class02151.N((int)1), class013622);
    }

    @Override
    public boolean u() {
        return false;
    }

    private static boolean N(class07284 class072842, class07209 class072092) {
        class00500 class005002 = class072842.method_8320(class072092.method_10084());
        if (!(class005002.P() || class005002.N(class00869.K) && class005002.Y().y((class04651)class04684.L))) {
            return false;
        }
        int n = 0;
        for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-4, 0, -4), (class07209)class072092.method_10069(4, 2, 4))) {
            class00500 class005003 = class072842.method_8320(class072093);
            if (class005003.N(class00869.bp) || class005003.N(class00869.bS)) {
                ++n;
            }
            if (n <= 2) continue;
            return false;
        }
        return true;
    }

    public MapCodec<class04094> N() {
        return y;
    }

    private class00500 N(class07284 class072842, class07209 class072092, class06069 class060692, boolean bl) {
        class00500 class005002 = class060692.y(11) == 0 ? (class00500)class00869.bS.W().y((class08092)class04007.u, (Comparable)Boolean.valueOf(bl)) : class00869.bp.W();
        if (class005002.y((class08092)class06665.q) && !class072842.method_8316(class072092).W()) {
            return (class00500)class005002.y((class08092)class06665.q, (Comparable)Boolean.valueOf(true));
        }
        return class005002;
    }

    private static int N(class04076 class040762, class07209 class072092, class07209 class072093, int n) {
        int n2 = class040762.i();
        float f = class04995.z((float)((float)Math.sqrt(class072092.method_10262((class00753)class072093)) - (float)n2));
        int n3 = class04995.Z((int)(24 - n2));
        float f2 = Math.min(1.0f, f / (float)n3);
        return Math.max(1, (int)((float)n * f2 * 0.5f));
    }

    @Override
    public int N(class04083 class040832, class07284 class072842, class07209 class072092, class06069 class060692, class04076 class040762, boolean bl) {
        int n = class040832.y();
        if (n == 0 || class060692.y(class040762.R()) != 0) {
            return n;
        }
        class07209 class072093 = class040832.N();
        boolean bl2 = class072093.method_19771((class00753)class072092, (double)class040762.i());
        if (bl2 || !class04094.N(class072842, class072093)) {
            if (class060692.y(class040762.M()) != 0) {
                return n;
            }
            return n - (bl2 ? 1 : class04094.N(class040762, class072093, class072092, n));
        }
        int n2 = class040762.u();
        if (class060692.y(n2) < n) {
            class07209 class072094 = class072093.method_10084();
            class00500 class005002 = this.N(class072842, class072094, class060692, class040762.B());
            class072842.method_8652(class072094, class005002, 3);
            class072842.method_8396(null, class072093, class005002.O().i(), class04911.field_15245, 1.0f, 1.0f);
        }
        return Math.max(0, n - n2);
    }
}

