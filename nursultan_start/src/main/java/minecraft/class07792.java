/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07290
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06092;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07797;

public class class07792
extends class07797 {
    public static final MapCodec<class07792> N = class07792.y(class07792::new);
    private static final class00494 y = class00891.y((double)12.0, (double)0.0, (double)15.0);

    public class07792(class01362 class013622) {
        super(class013622);
    }

    public MapCodec<class07792> N() {
        return N;
    }

    @Override
    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }
}

