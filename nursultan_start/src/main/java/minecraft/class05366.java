/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00429
 *  minecraft.class00452
 *  minecraft.class00457
 *  minecraft.class00753
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class03386
 *  minecraft.class06202
 *  minecraft.class06715
 *  minecraft.class06724
 *  minecraft.class06889
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class00429;
import minecraft.class00452;
import minecraft.class00457;
import minecraft.class00753;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class03386;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06889;
import minecraft.class07209;

public class class05366
implements class01857 {
    private static final int N = 160;
    private final class06202 y;

    public class05366(class06202 class062022) {
        this.y = class062022;
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class05363 class053632 = ((class03386)this.y.i_5).s();
        class07209 class072092 = class07209.method_49637((double)class053632.y().M, (double)0.0, (double)class053632.y().Z);
        class004572.L(class00429.i, (class070492, class004322) -> {
            if (class072092.method_19771((class00753)class070492.method_24515(), 160.0)) {
                for (int i = 0; i < class004322.N().size(); ++i) {
                    class00452 class004522 = (class00452)class004322.N().get(i);
                    double d = (double)class070492.method_31477() + 0.5;
                    double d2 = class070492.method_23318() + 2.0 + (double)i * 0.25;
                    double d3 = (double)class070492.method_31479() + 0.5;
                    int n = class004522.y() ? -16711936 : -3355444;
                    class06724.N((String)class004522.L(), (class06889)new class06889(d, d2, d3), (class06715)class06715.N((int)n));
                }
            }
        });
    }
}

