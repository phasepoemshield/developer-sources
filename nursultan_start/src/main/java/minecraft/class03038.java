/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00250
 *  minecraft.class01231
 *  minecraft.class04782
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06758
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07206
 *  minecraft.class07209
 *  minecraft.class07210
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00250;
import minecraft.class01231;
import minecraft.class04782;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;

public class class03038
extends class07206 {
    private final class07206 N = new class07206();
    private final class07078<? extends class00250> u;

    public class03038(class07078<? extends class00250> class070782) {
        this.u = class070782;
    }

    public class06584 N(class07210 class072102, class06584 class065842) {
        double d;
        class07211 class072112 = (class07211)class072102.u().L((class08092)class06758.y);
        class04782 class047822 = class072102.y();
        class06889 class068892 = class072102.N();
        double d2 = 0.5625 + (double)this.u.z() / 2.0;
        double d3 = class068892.N() + (double)class072112.P() * d2;
        double d4 = class068892.y() + (double)((float)class072112.s() * 1.125f);
        double d5 = class068892.L() + (double)class072112.T() * d2;
        class07209 class072092 = class072102.L().method_10093(class072112);
        if (class047822.method_8316(class072092).N(class01231.N)) {
            d = 1.0;
        } else if (class047822.method_8320(class072092).P() && class047822.method_8316(class072092.method_10074()).N(class01231.N)) {
            d = 0.0;
        } else {
            return this.N.dispense(class072102, class065842);
        }
        class00250 class002502 = (class00250)this.u.N((class07299)class047822, class06113.field_16470);
        if (class002502 != null) {
            class002502.N(d3, d4 + d, d5);
            class07078.N((class07299)class047822, (class06584)class065842, null).accept(class002502);
            class002502.method_36456(class072112.U());
            class047822.method_8649((class07049)class002502);
            class065842.B(1);
        }
        return class065842;
    }

    protected void N(class07210 class072102) {
        class072102.y().N(1000, class072102.L(), 0);
    }
}

