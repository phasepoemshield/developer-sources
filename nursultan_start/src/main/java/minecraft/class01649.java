/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01231
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class04453
 *  minecraft.class04688
 *  minecraft.class06202
 *  minecraft.class06715
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class00457;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01231;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class04453;
import minecraft.class04688;
import minecraft.class06202;
import minecraft.class06715;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;

public class class01649
implements class01857 {
    private final class06202 N;

    public class01649(class06202 class062022) {
        this.N = class062022;
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class04688 class046882;
        class07209 class072092 = ((class04453)this.N.T_4).method_24515();
        class07299 class072992 = ((class04453)this.N.T_4).method_73183();
        for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-10, -10, -10), (class07209)class072092.method_10069(10, 10, 10))) {
            class046882 = class072992.method_8316(class072093);
            if (!class046882.N(class01231.N)) continue;
            double d4 = (float)class072093.method_10264() + class046882.N((class07290)class072992, class072093);
            class06724.N((class00734)new class00734((double)((float)class072093.method_10263() + 0.01f), (double)((float)class072093.method_10264() + 0.01f), (double)((float)class072093.method_10260() + 0.01f), (double)((float)class072093.method_10263() + 0.99f), d4, (double)((float)class072093.method_10260() + 0.99f)), (class06747)class06747.y((int)class02566.N((float)0.15f, (float)0.0f, (float)1.0f, (float)0.0f)));
        }
        for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-10, -10, -10), (class07209)class072092.method_10069(10, 10, 10))) {
            class046882 = class072992.method_8316(class072093);
            if (!class046882.N(class01231.N)) continue;
            class06724.N((String)String.valueOf(class046882.R()), (class06889)class06889.N((class00753)class072093, (double)0.5, (double)class046882.N((class07290)class072992, class072093), (double)0.5), (class06715)class06715.N((int)-16777216));
        }
    }
}

