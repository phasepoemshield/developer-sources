/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00864
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00864;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;

public class class08434
extends class00864
implements class00873 {
    public static final MapCodec<class08434> N = class08434.y(class08434::new);
    private static final class00494 y = class00891.y((double)16.0, (double)0.0, (double)13.0);

    public class08434(class01362 class013622) {
        super(class013622);
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072093, class00500 class005002) {
        class00873.N((class07299)class047822, (class07209)class072093, (class00500)class005002).ifPresent(class072092 -> class047822.method_8501(class072092, this.W()));
    }

    public MapCodec<class08434> N() {
        return N;
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class00873.a_((class05487)class054872, (class07209)class072092, (class00500)class005002);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }
}

