/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01210
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
 *  minecraft.class07504
 *  minecraft.class07760
 *  minecraft.class08080
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01210;
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
import minecraft.class07504;
import minecraft.class07760;
import minecraft.class08080;
import minecraft.class08092;

public class class00238
extends class07206 {
    private final class07206 N = new class07206();
    private final class07078<? extends class07504> u;

    public class00238(class07078<? extends class07504> class070782) {
        this.u = class070782;
    }

    protected void N(class07210 class072102) {
        class072102.y().N(1000, class072102.L(), 0);
    }

    private static class08080 N(class00500 class005002) {
        class08080 class080802;
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07760) {
            class07760 class077602 = (class07760)class008912;
            class080802 = (class08080)class005002.L(class077602.L());
        } else {
            class080802 = class08080.field_12665;
        }
        return class080802;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public class06584 N(class07210 class072102, class06584 class065842) {
        class00500 class005002;
        double d;
        class07211 class072112 = (class07211)class072102.u().L((class08092)class06758.y);
        class04782 class047822 = class072102.y();
        class06889 class068892 = class072102.N();
        double d2 = class068892.N() + (double)class072112.P() * 1.125;
        double d3 = Math.floor(class068892.y()) + (double)class072112.s();
        double d4 = class068892.L() + (double)class072112.T() * 1.125;
        class07209 class072092 = class072102.L().method_10093(class072112);
        class00500 class005003 = class047822.method_8320(class072092);
        if (class005003.N(class01210.e)) {
            d = class00238.N(class005003).y() ? 0.6 : 0.1;
        } else {
            if (!class005003.P()) return this.N.dispense(class072102, class065842);
            class005002 = class047822.method_8320(class072092.method_10074());
            if (!class005002.N(class01210.e)) return this.N.dispense(class072102, class065842);
            d = class072112 == class07211.field_11033 || !class00238.N(class005002).y() ? -0.9 : -0.4;
        }
        class005002 = new class06889(d2, d3 + d, d4);
        class07504 class075042 = class07504.N((class07299)class047822, (double)class005002.M, (double)class005002.B, (double)class005002.Z, this.u, (class06113)class06113.field_16470, (class06584)class065842, null);
        if (class075042 == null) return class065842;
        class047822.method_8649((class07049)class075042);
        class065842.B(1);
        return class065842;
    }
}

