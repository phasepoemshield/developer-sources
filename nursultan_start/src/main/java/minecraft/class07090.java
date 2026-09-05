/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07310
 *  minecraft.class08071
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07310;
import minecraft.class08071;
import minecraft.class08092;

public class class07090
extends class00864 {
    public static final MapCodec<class07090> N = class07090.y(class07090::new);
    public static final int y = 3;
    public static final class08071 L = class06665.NG;
    private static final class00494[] u = class00891.N((int)3, n -> class00891.y((double)16.0, (double)0.0, (double)(5 + n * 3)));

    public class07090(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0)));
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        int n = (Integer)class005002.L((class08092)L);
        if (n < 3 && class060692.y(10) == 0) {
            class005002 = (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n + 1));
            class047822.method_8652(class072092, class005002, 2);
        }
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return u[(Integer)class005002.L((class08092)L)];
    }

    public MapCodec<class07090> N() {
        return N;
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)class06570.nm);
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class00869.iw);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    protected boolean e_(class00500 class005002) {
        return (Integer)class005002.L((class08092)L) < 3;
    }
}

