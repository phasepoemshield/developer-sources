/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00865
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04823
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08397
 *  minecraft.class08400
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00865;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04823;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08397;
import minecraft.class08400;

public class class01126
extends class00865 {
    public static final MapCodec<class01126> u = class01126.y(class01126::new);
    private static final class00494 i = class00891.y((double)12.0, (double)4.0, (double)15.0);
    private static final class00494 R = class00389.N((class00494)class00865.y, (class00494)i);

    public class01126(class01362 class013622) {
        super(class013622, class04823.i);
    }

    protected double U(class00500 class005002) {
        return 0.9375;
    }

    public boolean E(class00500 class005002) {
        return true;
    }

    public MapCodec<class01126> N() {
        return u;
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        return 3;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        class084002.N(class08397.field_61896);
        class084002.N(class08397.field_56644);
        class084002.y(class08397.field_56644, class07049::method_5730);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class07049 class070492) {
        return R;
    }
}

