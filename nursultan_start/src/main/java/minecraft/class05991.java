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
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07290
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class06092;
import minecraft.class07209;
import minecraft.class07290;

public class class05991
extends class00864 {
    public static final MapCodec<class05991> N = class05991.y(class05991::new);
    private static final class00494 y = class00891.y((double)12.0, (double)0.0, (double)13.0);

    public class05991(class01362 class013622) {
        super(class013622);
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class01210.Nr) || class005002.N(class00869.ik) || super.N(class005002, class072902, class072092);
    }

    public MapCodec<class05991> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }
}

