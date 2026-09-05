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
 *  minecraft.class06898
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
import minecraft.class06898;
import minecraft.class07209;
import minecraft.class07290;

public class class07712
extends class00891 {
    public static final MapCodec<class07712> N = class07712.y(class07712::new);
    private static final class00494 y = class00891.N((double)6.0);

    public class07712(class01362 class013622) {
        super(class013622);
    }

    protected float y(class00500 class005002, class07290 class072902, class07209 class072092) {
        return 1.0f;
    }

    public MapCodec<class07712> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }

    protected class06898 d_(class00500 class005002) {
        return class06898.field_11455;
    }
}

