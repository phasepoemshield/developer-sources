/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01020
 *  minecraft.class01362
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01020;
import minecraft.class01362;
import minecraft.class06092;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;

public class class08425
extends class00864 {
    public static final MapCodec<class08425> N = class08425.y(class08425::new);
    private static final class00494 y = class00891.y((double)14.0, (double)0.0, (double)12.0);

    public class08425(class01362 class013622) {
        super(class013622);
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        class00500 class005003 = class072902.method_8320(class072092);
        return class005003.N(class00869.ij) || class005003.N(class00869.Lr) || class005003.N(class072902, class072092, class07211.field_11036, class01020.field_25823);
    }

    public MapCodec<? extends class08425> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }
}

