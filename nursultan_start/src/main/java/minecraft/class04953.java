/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06069
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06069;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;

public class class04953
extends class00891 {
    public static final MapCodec<class04953> N = class04953.y(class04953::new);

    public class04953(class01362 class013622) {
        super(class013622);
    }

    public MapCodec<class04953> N() {
        return N;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (class060692.y(5) != 0) {
            return;
        }
        class07211 class072112 = class07211.y((class06069)class060692);
        if (class072112 == class07211.field_11036) {
            return;
        }
        class07209 class072093 = class072092.method_10093(class072112);
        class00500 class005003 = class072992.method_8320(class072093);
        if (class005002.G() && class005003.L((class07290)class072992, class072093, class072112.b())) {
            return;
        }
        double d = class072112.P() == 0 ? class060692.U() : 0.5 + (double)class072112.P() * 0.6;
        double d2 = class072112.s() == 0 ? class060692.U() : 0.5 + (double)class072112.s() * 0.6;
        double d3 = class072112.T() == 0 ? class060692.U() : 0.5 + (double)class072112.T() * 0.6;
        class072992.method_8406((class07126)class07107.Nq, (double)class072092.method_10263() + d, (double)class072092.method_10264() + d2, (double)class072092.method_10260() + d3, 0.0, 0.0, 0.0);
    }
}

