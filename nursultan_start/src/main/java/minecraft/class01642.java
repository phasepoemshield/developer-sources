/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00457
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class01383
 *  minecraft.class01857
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 */
package minecraft;

import java.util.Iterator;
import minecraft.class00457;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class01383;
import minecraft.class01857;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;

public class class01642
implements class01857 {
    private final class06202 N;

    public class01642(class06202 class062022) {
        this.N = class062022;
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class07299 class072992 = ((class04453)this.N.T_4).method_73183();
        class07209 class072092 = class07209.method_49637((double)d, (double)d2, (double)d3);
        for (class07209 class072093 : class07209.method_10097((class07209)class072092.method_10069(-6, -6, -6), (class07209)class072092.method_10069(6, 6, 6))) {
            class00500 class005002 = class072992.method_8320(class072093);
            if (class005002.N(class00869.N)) continue;
            Iterator var16 = class005002.R((class07290)class072992, class072093).method_1090().iterator();
            while (var16.hasNext()) {
                class00734 class007342 = ((class00734)var16.next()).N(class072093).M(0.002);
                int n = -2130771968;
                class06889 class068892 = class007342.B();
                class06889 class068893 = class007342.Z();
                class01642.N(class072093, class005002, (class07290)class072992, class07211.field_11039, class068892, class068893, -2130771968);
                class01642.N(class072093, class005002, (class07290)class072992, class07211.field_11035, class068892, class068893, -2130771968);
                class01642.N(class072093, class005002, (class07290)class072992, class07211.field_11034, class068892, class068893, -2130771968);
                class01642.N(class072093, class005002, (class07290)class072992, class07211.field_11043, class068892, class068893, -2130771968);
                class01642.N(class072093, class005002, (class07290)class072992, class07211.field_11033, class068892, class068893, -2130771968);
                class01642.N(class072093, class005002, (class07290)class072992, class07211.field_11036, class068892, class068893, -2130771968);
            }
        }
    }

    private static void N(class07209 class072092, class00500 class005002, class07290 class072902, class07211 class072112, class06889 class068892, class06889 class068893, int n) {
        if (class005002.L(class072902, class072092, class072112)) {
            class06724.N((class06889)class068892, (class06889)class068893, (class07211)class072112, (class06747)class06747.y((int)n));
        }
    }
}

