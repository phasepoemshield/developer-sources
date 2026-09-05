/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00864
 *  minecraft.class00873
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00864;
import minecraft.class00873;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07830;

public class class08422
extends class00864
implements class00873 {
    private static final double y = 0.7;
    private static final double L = 10.0;
    private static final double u = 5.0;
    private static final int i = 13;
    private static final int R = 30;
    public static final MapCodec<class08422> N = class08422.y(class08422::new);

    public class08422(class01362 class013622) {
        super(class013622);
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072093, class00500 class005002) {
        class00873.N((class07299)class047822, (class07209)class072093, (class00500)class005002).ifPresent(class072092 -> class047822.method_8501(class072092, this.W()));
    }

    protected MapCodec<? extends class08422> N() {
        return N;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class00873.a_((class05487)class054872, (class07209)class072092, (class00500)class005002);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (class060692.y(30) == 0 && ((Boolean)class072992.method_75728().N(class00608.d, class072092)).booleanValue() && class072992.y(class07830.field_13203, class072092) <= class072092.method_10264()) {
            class072992.method_45446(class072092, class04909.Ud, class04911.field_15256, 1.0f, 1.0f, false);
        }
        if (class072992.U(class072092) <= 13 && class060692.U() <= 0.7) {
            double d = (double)class072092.method_10263() + class060692.U() * 10.0 - 5.0;
            double d2 = (double)class072092.method_10264() + class060692.U() * 5.0;
            double d3 = (double)class072092.method_10260() + class060692.U() * 10.0 - 5.0;
            class072992.method_8406((class07126)class07107.yU, d, d2, d3, 0.0, 0.0, 0.0);
        }
    }
}

