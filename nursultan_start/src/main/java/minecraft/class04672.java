/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00869
 *  minecraft.class01231
 *  minecraft.class03530
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class05787
 *  minecraft.class05989
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07049
 *  minecraft.class07107
 *  minecraft.class07117
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class08092
 *  minecraft.class08397
 *  minecraft.class08400
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00869;
import minecraft.class01231;
import minecraft.class03530;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05787;
import minecraft.class05989;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07117;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class08092;
import minecraft.class08397;
import minecraft.class08400;
import org.jspecify.annotations.Nullable;

public abstract class class04672
extends class05787 {
    public static final float i = 0.44444445f;

    protected float L() {
        return 100.0f;
    }

    public int L(class05487 class054872) {
        return class04672.u(class054872) ? 1 : 2;
    }

    public @Nullable class07126 B() {
        return class07107.z;
    }

    protected boolean Z() {
        return true;
    }

    public class04651 i() {
        return class04684.i;
    }

    public Optional<class04891> z() {
        return Optional.of(class04909.ud);
    }

    private static boolean u(class05487 class054872) {
        return (Boolean)class054872.method_75598().N(class00608.I);
    }

    public class04651 u() {
        return class04684.u;
    }

    public class00500 y(class04688 class046882) {
        return (class00500)class00869.V.W().y((class08092)class07117.y, (Comparable)Integer.valueOf(class04672.i((class04688)class046882)));
    }

    public int y(class05487 class054872) {
        return class04672.u(class054872) ? 4 : 2;
    }

    private boolean y(class05487 class054872, class07209 class072092) {
        if (class054872.L(class072092.method_10264()) && !class054872.E(class072092)) {
            return false;
        }
        return class054872.method_8320(class072092).s();
    }

    protected void N(class07284 class072842, class07209 class072092, class00500 class005002, class07211 class072112, class04688 class046882) {
        if (class072112 == class07211.field_11033) {
            class04688 class046883 = class072842.method_8316(class072092);
            if (this.N(class01231.y) && class046883.N((class03530<class04651>)class01231.N)) {
                if (class005002.i() instanceof class07117) {
                    class072842.method_8652(class072092, class00869.y.W(), 3);
                }
                this.N(class072842, class072092);
                return;
            }
        }
        super.N(class072842, class072092, class005002, class072112, class046882);
    }

    protected boolean N(class04782 class047822) {
        return (Boolean)class047822.method_64395().N(class07305.v);
    }

    private void N(class07284 class072842, class07209 class072092) {
        class072842.N(1501, class072092, 0);
    }

    public void N(class07299 class072992, class07209 class072092, class04688 class046882, class06069 class060692) {
        class07209 class072093 = class072092.method_10084();
        if (class072992.method_8320(class072093).P() && !class072992.method_8320(class072093).t()) {
            if (class060692.y(100) == 0) {
                double d = (double)class072092.method_10263() + class060692.U();
                double d2 = (double)class072092.method_10264() + 1.0;
                double d3 = (double)class072092.method_10260() + class060692.U();
                class072992.method_8406((class07126)class07107.NL, d, d2, d3, 0.0, 0.0, 0.0);
                class072992.method_8486(d, d2, d3, class04909.sS, class04911.field_15256, 0.2f + class060692.z() * 0.2f, 0.9f + class060692.z() * 0.15f, false);
            }
            if (class060692.y(200) == 0) {
                class072992.method_8486((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class04909.sf, class04911.field_15256, 0.2f + class060692.z() * 0.2f, 0.9f + class060692.z() * 0.15f, false);
            }
        }
    }

    public class06581 N() {
        return class06570.jW;
    }

    public int N(class05487 class054872) {
        return class04672.u(class054872) ? 10 : 30;
    }

    public void N(class04782 class047822, class07209 class072092, class04688 class046882, class06069 class060692) {
        if (!class047822.method_76058(class072092)) {
            return;
        }
        int n = class060692.y(3);
        if (n > 0) {
            class07209 class072093 = class072092;
            for (int i = 0; i < n; ++i) {
                if (!class047822.method_8477(class072093 = class072093.method_10069(class060692.y(3) - 1, 1, class060692.y(3) - 1))) {
                    return;
                }
                class00500 class005002 = class047822.method_8320(class072093);
                if (class005002.P()) {
                    if (!this.N((class05487)class047822, class072093)) continue;
                    class047822.method_8501(class072093, class05989.y((class07290)class047822, (class07209)class072093));
                    return;
                }
                if (!class005002.M()) continue;
                return;
            }
        } else {
            for (int i = 0; i < 3; ++i) {
                class07209 class072094 = class072092.method_10069(class060692.y(3) - 1, 0, class060692.y(3) - 1);
                if (!class047822.method_8477(class072094)) {
                    return;
                }
                if (!class047822.R(class072094.method_10084()) || !this.y((class05487)class047822, class072094)) continue;
                class047822.method_8501(class072094.method_10084(), class05989.y((class07290)class047822, (class07209)class072094));
            }
        }
    }

    public boolean N(class04651 class046512) {
        return class046512 == class04684.i || class046512 == class04684.u;
    }

    protected void N(class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002) {
        class084002.N(class08397.field_61896);
        class084002.N(class08397.field_56644);
        class084002.y(class08397.field_56644, class07049::method_5730);
    }

    protected void N(class07284 class072842, class07209 class072092, class00500 class005002) {
        this.N(class072842, class072092);
    }

    public boolean N(class04688 class046882, class07290 class072902, class07209 class072092, class04651 class046512, class07211 class072112) {
        return class046882.N(class072902, class072092) >= 0.44444445f && class046512.N((class03530<class04651>)class01231.N);
    }

    private boolean N(class05487 class054872, class07209 class072092) {
        for (class07211 class072112 : class07211.values()) {
            if (!this.y(class054872, class072092.method_10093(class072112))) continue;
            return true;
        }
        return false;
    }

    public int N(class07299 class072992, class07209 class072092, class04688 class046882, class04688 class046883) {
        int n = this.N((class05487)class072992);
        if (!(class046882.W() || class046883.W() || ((Boolean)class046882.L((class08092)N)).booleanValue() || ((Boolean)class046883.L((class08092)N)).booleanValue() || !(class046883.N((class07290)class072992, class072092) > class046882.N((class07290)class072992, class072092)) || class072992.method_8409().y(4) == 0)) {
            n *= 4;
        }
        return n;
    }
}

