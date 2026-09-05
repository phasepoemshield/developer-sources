/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class01163
 *  minecraft.class01164
 *  minecraft.class01187
 *  minecraft.class01190
 *  minecraft.class01194
 *  minecraft.class01962
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00737;
import minecraft.class01163;
import minecraft.class01164;
import minecraft.class01187;
import minecraft.class01190;
import minecraft.class01194;
import minecraft.class01962;
import minecraft.class03556;
import minecraft.class04066;
import minecraft.class04076;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08092;

public class class04080
implements class01187 {
    public static final int N = 8;
    final class04076 y;
    private final class00500 L;
    private final class01190 u;

    public class01163 L() {
        return class01163.field_40354;
    }

    public class04080(class00500 class005002, class01190 class011902) {
        this.L = class005002;
        this.u = class011902;
        this.y = class04076.N();
    }

    public class04076 u() {
        return this.y;
    }

    public int y() {
        return 8;
    }

    private void N(class04782 class047822, class07209 class072092, class00500 class005002, class06069 class060692) {
        class047822.method_8652(class072092, (class00500)class005002.y((class08092)class04066.y, (Comparable)Boolean.valueOf(true)), 3);
        class047822.N(class072092, class005002.i(), 8);
        class047822.method_65096((class07126)class07107.e, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 1.15, (double)class072092.method_10260() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
        class047822.method_8396(null, class072092, class04909.dS, class04911.field_15245, 2.0f, 0.6f + class060692.z() * 0.4f);
    }

    private void N(class07299 class072992, class07438 class074382) {
        class07438 class074383 = class074382.method_6065();
        if (class074383 instanceof class04770) {
            class04770 class047702 = (class04770)class074383;
            class07072 class070722 = class074382.method_6081() == null ? class072992.method_48963().N((class08036)class047702) : class074382.method_6081();
            class06912.Ny.N(class047702, (class07049)class074382, class070722);
        }
    }

    public boolean N(class04782 class047822, class03556<class01194> class035562, class01164 class011642, class06889 class068893) {
        class07049 class070492;
        if (class035562.N((class03556)class01194.s) && (class070492 = class011642.N()) instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            if (!class074382.method_41330()) {
                class070492 = class074382.method_6081();
                int n = class074382.method_59923(class047822, (class07049)class01962.N((Object)class070492, class07072::u));
                if (class074382.method_6054() && n > 0) {
                    this.y.N(class07209.method_49638((class00737)class068893.N(class07211.field_11036, 0.5)), n);
                    this.N((class07299)class047822, class074382);
                }
                class074382.method_41329();
                this.u.N((class07299)class047822).ifPresent(class068892 -> this.N(class047822, class07209.method_49638((class00737)class068892), this.L, class047822.method_8409()));
            }
            return true;
        }
        return false;
    }

    public class01190 N() {
        return this.u;
    }
}

