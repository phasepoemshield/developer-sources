/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06570
 *  minecraft.class06665
 *  minecraft.class06772
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08071
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06570;
import minecraft.class06665;
import minecraft.class06772;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08071;
import minecraft.class08092;

public class class07803
extends class06772 {
    public static final MapCodec<class07803> N = class07803.y(class07803::new);
    public static final int y = 3;
    public static final class08071 L = class06665.NG;
    private static final class00494[] M = class00891.N((int)3, n -> class00891.y((double)16.0, (double)0.0, (double)(2 + n * 2)));

    protected class08071 L() {
        return L;
    }

    public class07803(class01362 class013622) {
        super(class013622);
    }

    protected class07310 i() {
        return class06570.lk;
    }

    public int u() {
        return 3;
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class060692.y(3) != 0) {
            super.y_2(class005002, class047822, class072092, class060692);
        }
    }

    public MapCodec<class07803> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return M[this.U(class005002)];
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    protected int N(class07299 class072992) {
        return super.N(class072992) / 3;
    }
}

