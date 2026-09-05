/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06273
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08092
 */
package minecraft;

import java.util.function.ToIntFunction;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06273;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08092;

public interface class05568 {
    public static final class00494 N = class00891.y((double)14.0, (double)0.0, (double)16.0);
    public static final class06667 x_ = class06665.y;

    public static class07082 N(class07049 class070492, class00500 class005002, class07299 class072992, class07209 class072092) {
        if (((Boolean)class005002.L((class08092)x_)).booleanValue()) {
            if (class072992 instanceof class04782) {
                class04782 class047823 = (class04782)class072992;
                class00891.N((class04782)class047823, (class05946)class06273.Ne, (class00500)class005002, (class00394)class072992.method_8321(class072092), null, (class07049)class070492, (class047822, class065842) -> class00891.N_21((class07299)class047822, (class07209)class072092, (class06584)class065842));
                float f = class04995.y((class06069)class047823.field_9229, (float)0.8f, (float)1.2f);
                class047823.method_8396(null, class072092, class04909.iI, class04911.field_15245, 1.0f, f);
                class00500 class005003 = (class00500)class005002.y((class08092)x_, (Comparable)Boolean.valueOf(false));
                class047823.method_8652(class072092, class005003, 2);
                class047823.N((class03556)class01194.L, class072092, class01164.N((class07049)class070492, (class00500)class005003));
            }
            return class07082.N;
        }
        return class07082.i;
    }

    public static boolean j_(class00500 class005002) {
        return class005002.y((class08092)x_) && (Boolean)class005002.L((class08092)x_) != false;
    }

    public static ToIntFunction<class00500> e_(int n) {
        return class005002 -> (Boolean)class005002.L((class08092)class06665.y) != false ? n : 0;
    }
}

