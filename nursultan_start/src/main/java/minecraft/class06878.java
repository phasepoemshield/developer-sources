/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;

public class class06878
extends class00891 {
    public static final MapCodec<class06878> N = class06878.y(class06878::new);

    public class06878(class01362 class013622) {
        super(class013622);
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return 15;
    }

    public MapCodec<class06878> N() {
        return N;
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

