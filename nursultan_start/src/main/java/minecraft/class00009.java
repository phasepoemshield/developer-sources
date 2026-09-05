/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00032
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06889
 *  minecraft.class06942
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07101
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00032;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06889;
import minecraft.class06942;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07101;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class00009
extends class07101
implements class06084 {
    public static final MapCodec<class00009> N = class00009.y(class00009::new);
    public static final int y = 3;
    public static final class08071 L = class06665.yi;
    public static final class06667 u = class06665.q;
    public static final int i = 5000;
    private static final class00494 M = class00891.N((double)10.0, (double)10.0, (double)0.0, (double)10.0);

    public int L(class00500 class005002) {
        return (Integer)class005002.L((class08092)L);
    }

    private void L(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!this.U(class005002)) {
            class047822.method_8396(null, class072092, class04909.ZA, class04911.field_15245, 1.0f, 1.0f);
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(this.L(class005002) + 1)), 2);
            class047822.N((class03556)class01194.L, class072092, class01164.N((class00500)class005002));
        } else {
            this.N(class047822, class072092, class005002);
        }
    }

    public class00009(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)R, (Comparable)class07211.field_11043)).y((class08092)L, (Comparable)Integer.valueOf(0))).y((class08092)u, (Comparable)Boolean.valueOf(false)));
    }

    private boolean U(class00500 class005002) {
        return this.L(class005002) == 3;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if ((((Boolean)class005002.L((class08092)u)).booleanValue() || (Integer)class005002.L((class08092)L) > 0) && !class047822.method_14196().N(class072092, (Object)this)) {
            class047822.N(class072092, (class00891)this, 5000);
        }
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        super.N(class072992, class072092, class005002, class074382, class065842);
        class072992.method_8396(null, class072092, (Boolean)class005002.L((class08092)u) != false ? class04909.ZF : class04909.Zp, class04911.field_15245, 1.0f, 1.0f);
    }

    public class00500 N(class06942 class069422) {
        boolean bl = class069422.method_8045().method_8316(class069422.method_8037()).N() == class04684.L;
        return (class00500)((class00500)super.N(class069422).y((class08092)u, (Comparable)Boolean.valueOf(bl))).y((class08092)R, (Comparable)class069422.method_8042().b());
    }

    public MapCodec<class00009> N() {
        return N;
    }

    public boolean N(class07284 class072842, class07209 class072092, class00500 class005002, class04688 class046882) {
        if (((Boolean)class005002.L((class08092)class06665.q)).booleanValue() || class046882.N() != class04684.L) {
            return false;
        }
        if (!class072842.method_8608()) {
            class072842.method_8652(class072092, (class00500)class005002.y((class08092)class06665.q, (Comparable)Boolean.valueOf(true)), 3);
            class072842.N(class072092, class046882.N(), class046882.N().N((class05487)class072842));
            class072842.method_8396(null, class072092, class04909.ZF, class04911.field_15245, 1.0f, 1.0f);
        }
        return true;
    }

    public boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, L, u});
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return M;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            this.L(class005002, class047822, class072092, class060692);
            return;
        }
        int n = this.L(class005002);
        if (n > 0) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n - 1)), 2);
            class047822.N((class03556)class01194.L, class072092, class01164.N((class00500)class005002));
        }
    }

    private void N(class04782 class047822, class07209 class072092, class00500 class005002) {
        class047822.method_8650(class072092, false);
        class00032 class000322 = (class00032)class07078.NZ.N((class07299)class047822, class06113.field_16466);
        if (class000322 != null) {
            class06889 class068892 = class072092.method_61082();
            class000322.y(true);
            float f = class07211.N((class07211)((class07211)class005002.L((class08092)R)));
            class000322.method_5847(f);
            class000322.method_5808(class068892.N(), class068892.y(), class068892.L(), f, 0.0f);
            class047822.method_8649((class07049)class000322);
            class047822.method_43129(null, (class07049)class000322, class04909.WB, class04911.field_15245, 1.0f, 1.0f);
        }
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        double d = (double)class072092.method_10263() + 0.5;
        double d2 = (double)class072092.method_10264() + 0.5;
        double d3 = (double)class072092.method_10260() + 0.5;
        if (!((Boolean)class005002.L((class08092)u)).booleanValue()) {
            if (class060692.y(40) == 0 && class072992.method_8320(class072092.method_10074()).N(class01210.LC)) {
                class072992.method_8486(d, d2, d3, class04909.ZX, class04911.field_15245, 1.0f, 1.0f, false);
            }
            if (class060692.y(6) == 0) {
                class072992.method_8406((class07126)class07107.Nz, d, d2, d3, 0.0, 0.02, 0.0);
            }
        } else {
            if (class060692.y(40) == 0) {
                class072992.method_8486(d, d2, d3, class04909.Za, class04911.field_15245, 1.0f, 1.0f, false);
            }
            if (class060692.y(6) == 0) {
                class072992.method_8406((class07126)class07107.F, d + (double)((class060692.z() * 2.0f - 1.0f) / 3.0f), d2 + 0.4, d3 + (double)((class060692.z() * 2.0f - 1.0f) / 3.0f), 0.0, (double)class060692.z(), 0.0);
            }
        }
    }
}

