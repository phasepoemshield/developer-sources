/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
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
import minecraft.class00869;
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

public class class01947
extends class06772 {
    public static final MapCodec<class01947> N = class01947.y(class01947::new);
    public static final int y = 1;
    public static final class08071 L = class06665.Nn;
    private static final class00494[] M = class00891.N((int)1, n -> class00891.y((double)6.0, (double)0.0, (double)(6 + n * 4)));
    private static final int B = 1;

    protected class08071 L() {
        return L;
    }

    public class01947(class01362 class013622) {
        super(class013622);
    }

    protected class07310 i() {
        return class06570.ll;
    }

    public int u() {
        return 2;
    }

    public void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class060692.y(3) != 0) {
            super.y_2(class005002, class047822, class072092, class060692);
        }
    }

    public class00500 y(int n) {
        if (n == 2) {
            return class00869.LL.W();
        }
        return super.y(n);
    }

    public MapCodec<class01947> N() {
        return N;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    protected int N(class07299 class072992) {
        return 1;
    }

    public class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return M[this.U(class005002)];
    }
}

