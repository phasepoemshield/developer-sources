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

public class class08417
extends class06786
implements class00873 {
    public static final MapCodec<class08417> N = class08417.y(class08417::new);
    private static final class00494 L = class00891.y((double)12.0, (double)0.0, (double)10.0);

    public class08417(class01362 class013622) {
        super(class013622);
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class047822.method_8501(class072092, class00869.yI.W());
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public MapCodec<class08417> N() {
        return N;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class08402.y(class072992, class072092, class060692);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return L;
    }
}

