/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00864
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08402
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00864;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08402;

public class class06786
extends class00864 {
    public static final MapCodec<class06786> y = class06786.y(class06786::new);
    private static final class00494 N = class00891.y((double)12.0, (double)0.0, (double)13.0);

    public class06786(class01362 class013622) {
        super(class013622);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class08402.L((class07299)class072992, (class07209)class072092, (class06069)class060692);
    }

    public MapCodec<? extends class06786> N() {
        return y;
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class01210.LQ);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return N;
    }
}

