/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06761
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06761;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;

public class class00635
extends class00864
implements class00873 {
    public static final MapCodec<class00635> N = class00635.y(class00635::new);
    private static final class00494 y = class00891.y((double)12.0, (double)0.0, (double)13.0);

    public class00635(class01362 class013622) {
        super(class013622);
    }

    private static class06761 U(class00500 class005002) {
        return (class06761)(class005002.N(class00869.yY) ? class00869.zk : class00869.zw);
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class06761.N((class07284)class047822, (class00500)class00635.U(class005002).W(), (class07209)class072092, (int)2);
    }

    public MapCodec<class00635> N() {
        return N;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class00635.U(class005002).W().N(class054872, class072092) && class054872.R(class072092.method_10084());
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }
}

