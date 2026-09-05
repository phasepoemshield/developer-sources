/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00748
 *  minecraft.class01118
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06237
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00748;
import minecraft.class01118;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class06098;
import minecraft.class06237;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06103
extends class00748 {
    public static final MapCodec<class06103> L = class06103.y(class06103::new);

    public class06103(class01362 class013622) {
        super(class013622);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (!((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return;
        }
        double d = (double)class072092.method_10263() + 0.5;
        double d2 = class072092.method_10264();
        double d3 = (double)class072092.method_10260() + 0.5;
        if (class060692.U() < 0.1) {
            class072992.method_8486(d, d2, d3, class04909.YQ, class04911.field_15245, 1.0f, 1.0f, false);
        }
        class072992.method_8406((class07126)class07107.NZ, d, d2 + 1.1, d3, 0.0, 0.0, 0.0);
    }

    protected void N(class07299 class072992, class07209 class072092, class08036 class080362) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class06098) {
            class080362.method_17355((class06237)class003942);
            class080362.method_7281(class01235.Nt);
        }
    }

    public MapCodec<class06103> N() {
        return L;
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class06103.N((class07299)class072992, class004042, (class00404)class00404.field_16414);
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class06098(class072092, class005002);
    }
}

