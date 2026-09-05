/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06760
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06760;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08713;

public class class06869
extends class06760 {
    public static final MapCodec<class06869> N = class06869.y(class06869::new);
    public static final class06667 L = class06665.k;

    public class06869(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)class07211.field_11035)).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return class005002.N(class072902, class072092, class072112);
    }

    protected void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class07211 class072112 = (class07211)class005002.L((class08092)y);
        class07209 class072093 = class072092.method_10093(class072112.b());
        class02733 class027332 = class02752.N((class07299)class072992, (class07211)class072112.b(), null);
        class072992.method_8492(class072093, (class00891)this, class027332);
        class072992.method_8508(class072093, (class00891)this, class072112, class027332);
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue() && class005002.L((class08092)y) == class072112) {
            return 15;
        }
        return 0;
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005002.N(class005003.i())) {
            return;
        }
        if (!class072992.method_8608() && ((Boolean)class005002.L((class08092)L)).booleanValue() && !class072992.method_8397().N(class072092, (Object)this)) {
            class00500 class005004 = (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(false));
            class072992.method_8652(class072092, class005004, 18);
            this.N(class072992, class072092, class005004);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue() && class047822.method_14196().N(class072092, (Object)this)) {
            this.N((class07299)class047822, class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(false)));
        }
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y((class08092)y, (Comparable)class069422.L().b().b());
    }

    public MapCodec<class06869> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y((class08092)y, (Comparable)class069932.N((class07211)class005002.L((class08092)y)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L((class08092)y)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(false)), 2);
        } else {
            class047822.method_8652(class072092, (class00500)class005002.y((class08092)L, (Comparable)Boolean.valueOf(true)), 2);
            class047822.N(class072092, (class00891)this, 2);
        }
        this.N((class07299)class047822, class072092, class005002);
    }

    private void N(class05487 class054872, class08713 class087132, class07209 class072092) {
        if (!class054872.method_8608() && !class087132.method_8397().N(class072092, (Object)this)) {
            class087132.N(class072092, (class00891)this, 2);
        }
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class005002.L((class08092)y) == class072112 && !((Boolean)class005002.L((class08092)L)).booleanValue()) {
            this.N(class054872, class087132, class072092);
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

