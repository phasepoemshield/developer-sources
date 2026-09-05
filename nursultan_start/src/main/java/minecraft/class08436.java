/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06786
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08402
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06786;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08402;

public class class08436
extends class06786
implements class00873 {
    public static final MapCodec<class08436> N = class08436.y(class08436::new);
    private static final class00494 L = class00891.y((double)14.0, (double)0.0, (double)16.0);

    public class08436(class01362 class013622) {
        super(class013622);
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072093, class00500 class005002) {
        class00873.N((class07299)class047822, (class07209)class072093, (class00500)class00869.yg.W()).ifPresent(class072092 -> class047822.method_8501(class072092, class00869.yg.W()));
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public MapCodec<class08436> N() {
        return N;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class00873.a_((class05487)class054872, (class07209)class072092, (class00500)class00869.yg.W());
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class08402.y((class07299)class072992, (class07209)class072092, (class06069)class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return L;
    }
}

