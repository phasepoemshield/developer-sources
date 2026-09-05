/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class05543
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05543;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08713;

public class class00288
extends class00891
implements class00873 {
    public static final MapCodec<class00288> N = class00288.y(class00288::new);
    private static final class00494 L = class00891.y((double)14.0, (double)0.0, (double)16.0);
    private static final class00494 u = class00891.y((double)14.0, (double)2.0, (double)16.0);
    public static final class06667 y = class06665.I;

    public class00288(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(true)));
    }

    private boolean U(class00500 class005002) {
        return class005002.P();
    }

    private boolean y(class07290 class072902, class07209 class072092) {
        class00500 class005002;
        class07209 class072093 = class072092.method_10093(class07211.field_11036);
        return class05543.N((class07290)class072902, (class07211)class07211.field_11036, (class07209)class072093, (class00500)(class005002 = class072902.method_8320(class072093))) || class005002.N(class00869.nS);
    }

    protected boolean y(class00500 class005002) {
        return true;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return this.U(class054872.method_8320(this.N((class07290)class054872, class072092).method_10074()));
    }

    public class07209 N(class07290 class072902, class07209 class072092) {
        class07218 class072182 = class072092.method_25503();
        do {
            class072182.N(class07211.field_11033);
        } while (class072902.method_8320((class07209)class072182).N((class00891)this));
        return class072182.method_10093(class07211.field_11036).method_10062();
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class07209 class072093 = this.N((class07290)class047822, class072092).method_10074();
        if (!this.U(class047822.method_8320(class072093))) {
            return;
        }
        class047822.method_8501(class072093, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(true)));
    }

    public MapCodec<class00288> N() {
        return N;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class00500 class005003;
        if (class060692.y(500) == 0 && ((class005003 = class072992.method_8320(class072092.method_10084())).N(class01210.v) || class005003.N(class00869.NF))) {
            class072992.method_8486((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), class04909.nx, class04911.field_15256, 1.0f, 1.0f, false);
        }
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return (Boolean)class005002.L((class08092)y) != false ? u : L;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!this.y((class07290)class054872, class072092)) {
            class087132.N(class072092, (class00891)this, 1);
        }
        return (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(!class054872.method_8320(class072092.method_10074()).N((class00891)this)));
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!this.y((class07290)class047822, class072092)) {
            class047822.N(class072092, true);
        }
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return this.y((class07290)class054872, class072092);
    }
}

