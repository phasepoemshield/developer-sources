/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00429
 *  minecraft.class00457
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 */
package minecraft;

import minecraft.class00429;
import minecraft.class00457;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;

public class class01778
implements class01857 {
    private static final int N = class02566.y((int)255, (int)255, (int)100, (int)255);
    private static final int y = class02566.y((int)255, (int)100, (int)255, (int)255);
    private static final int L = class02566.y((int)255, (int)0, (int)255, (int)0);
    private static final int u = class02566.y((int)255, (int)255, (int)165, (int)0);
    private static final int i = class02566.y((int)255, (int)255, (int)0, (int)0);
    private final class06202 R;

    public class01778(class06202 class062022) {
        this.R = class062022;
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class03448 class034482 = (class03448)this.R.T_3;
        class004572.L(class00429.u, (class070493, class004642) -> {
            class004642.N().map(arg_0 -> ((class03448)class034482).method_8469(arg_0)).map(class070492 -> class070492.method_30950(this.R.NK().N(true))).ifPresent(class068892 -> {
                class06724.y((class06889)class070493.method_73189(), (class06889)class068892, (int)y);
                class06889 class068893 = class068892.y(0.0, (double)0.01f, 0.0);
                class06724.N((class06889)class068893, (float)4.0f, (class06747)class06747.N((int)L));
                class06724.N((class06889)class068893, (float)8.0f, (class06747)class06747.N((int)u));
                class06724.N((class06889)class068893, (float)24.0f, (class06747)class06747.N((int)i));
            });
            class004642.y().ifPresent(class072092 -> {
                class06724.y((class06889)class070493.method_73189(), (class06889)class072092.method_46558(), (int)N);
                class06724.N((class00734)class00734.N((class06889)class06889.N((class00753)class072092)), (class06747)class06747.y((int)class02566.N((float)1.0f, (float)1.0f, (float)0.0f, (float)0.0f)));
            });
        });
    }
}

