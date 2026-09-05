/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00608
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;

public class class00420
extends class00891 {
    public static final MapCodec<class00420> N = class00420.y(class00420::new);

    public class00420(class01362 class013622) {
        super(class013622);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class07211 class072112 = class07211.y((class06069)class060692);
        if (class072112 == class07211.field_11036) {
            return;
        }
        class07209 class072093 = class072092.method_10093(class072112);
        class00500 class005003 = class072992.method_8320(class072093);
        if (class005002.G() && class005003.L((class07290)class072992, class072093, class072112.b())) {
            return;
        }
        double d = class072092.method_10263();
        double d2 = class072092.method_10264();
        double d3 = class072092.method_10260();
        if (class072112 == class07211.field_11033) {
            d2 -= 0.05;
            d += class060692.U();
            d3 += class060692.U();
        } else {
            d2 += class060692.U() * 0.8;
            if (class072112.z() == class07185.field_11048) {
                d3 += class060692.U();
                d = class072112 == class07211.field_11034 ? (d += 1.1) : (d += 0.05);
            } else {
                d += class060692.U();
                d3 = class072112 == class07211.field_11035 ? (d3 += 1.1) : (d3 += 0.05);
            }
        }
        class072992.method_8406((class07126)class07107.W, d, d2, d3, 0.0, 0.0, 0.0);
    }

    public MapCodec<class00420> N() {
        return N;
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (((Boolean)class072992.method_75728().N(class00608.Y, class072092)).booleanValue()) {
            class072992.method_8652(class072092, class00869.NS.W(), 3);
            class072992.N(2009, class072092, 0);
            class072992.method_8396(null, class072092, class04909.II, class04911.field_15245, 1.0f, (1.0f + class072992.method_8409().z() * 0.2f) * 0.7f);
        }
    }
}

