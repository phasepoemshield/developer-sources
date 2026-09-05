/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00653
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06092
 *  minecraft.class07030
 *  minecraft.class07032
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00653;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06092;
import minecraft.class07030;
import minecraft.class07032;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08092;

public class class04202
extends class00653 {
    public static final MapCodec<class04202> y = class04202.y(class04202::new);
    private static final Map<class07211, class00494> i = class00389.L((class00494)class00891.y((double)10.0, (double)8.0, (double)8.0, (double)16.0));

    public class04202(class01362 class013622) {
        super((class07030)class07032.field_41313, class013622);
    }

    public MapCodec<class04202> N() {
        return y;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return i.get(class005002.L((class08092)u));
    }
}

