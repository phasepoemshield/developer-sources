/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00429
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class06715
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class00429;
import minecraft.class00457;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class01144;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07209;

public class class01149
implements class01857 {
    private static final float N = 1.0f;

    private void N(class00457 class004572, class01144 class011442) {
        class004572.y(class00429.m, (class072092, class004542) -> class011442.accept(class072092.method_46558(), class004542.N()));
        class004572.L(class00429.m, (class070492, class004542) -> class011442.accept(class070492.method_73189(), class004542.N()));
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        this.N(class004572, (class068892, n) -> {
            double d = (double)n * 2.0;
            class06724.N((class00734)class00734.N((class06889)class068892, (double)d, (double)d, (double)d), (class06747)class06747.y((int)class02566.N((float)0.35f, (float)1.0f, (float)1.0f, (float)0.0f)));
        });
        this.N(class004572, (class068892, n) -> class06724.N((class00734)class00734.N((class06889)class068892, (double)0.5, (double)1.0, (double)0.5).u(0.0, 0.5, 0.0), (class06747)class06747.y((int)class02566.N((float)0.35f, (float)1.0f, (float)1.0f, (float)0.0f))));
        this.N(class004572, (class068892, n) -> {
            class06724.N((String)"Listener Origin", (class06889)class068892.y(0.0, 1.8, 0.0), (class06715)class06715.N().N(0.4f));
            class06724.N((String)class07209.method_49638((class00737)class068892).toString(), (class06889)class068892.y(0.0, 1.5, 0.0), (class06715)class06715.N((int)-6959665).N(0.4f));
        });
        class004572.N(class00429.s, (class004352, n, n2) -> {
            class06889 class068892 = class004352.y();
            double d = 0.4;
            class06724.N((class00734)class00734.N((class06889)class068892.y(0.0, 0.5, 0.0), (double)0.4, (double)0.9, (double)0.4), (class06747)class06747.y((int)class02566.N((float)0.2f, (float)1.0f, (float)1.0f, (float)1.0f)));
            class06724.N((String)class004352.N().M(), (class06889)class068892.y(0.0, 0.85, 0.0), (class06715)class06715.N((int)-7564911).N(0.12f));
        });
    }
}

