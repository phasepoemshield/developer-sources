/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06506
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07206
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07310
 *  minecraft.class08092
 */
package Nursultan;

import minecraft.class00869;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07310;
import minecraft.class08092;

public class class09392
extends class07206 {
    private final class07206 N = new class07206();

    public class06584 N(class07210 class072102, class06584 class065842) {
        if (!((class06517)class065842.a_(class02484.h, (Object)class06517.N)).N(class06506.N)) {
            return this.N.dispense(class072102, class065842);
        }
        class04782 class047822 = class072102.y();
        class07209 class072092 = class072102.L();
        class07209 class072093 = class072102.L().method_10093((class07211)class072102.u().L((class08092)class06758.y));
        if (class047822.method_8320(class072093).N(class01210.Lw)) {
            if (!class047822.method_8608()) {
                for (int i = 0; i < 5; ++i) {
                    class047822.method_65096((class07126)class07107.NT, (double)class072092.method_10263() + class047822.field_9229.U(), (double)(class072092.method_10264() + 1), (double)class072092.method_10260() + class047822.field_9229.U(), 1, 0.0, 0.0, 0.0, 1.0);
                }
            }
            class047822.method_8396(null, class072092, class04909.Lc, class04911.field_15245, 1.0f, 1.0f);
            class047822.N(null, (class03556)class01194.w, class072092);
            class047822.method_8501(class072093, class00869.nB.W());
            return this.N(class072102, class065842, new class06584((class07310)class06570.nP));
        }
        return this.N.dispense(class072102, class065842);
    }
}

