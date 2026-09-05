/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class02135
 *  minecraft.class02615
 *  minecraft.class02752
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07215
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07830
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class02135;
import minecraft.class02615;
import minecraft.class02752;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07215;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07830;
import minecraft.class08092;
import minecraft.class08713;

public class class01111
extends class07215
implements class06084 {
    public static final MapCodec<class01111> L = class01111.y(class01111::new);
    public static final class06667 u = class06665.q;
    public static final class06667 i = class06665.k;
    private static final int N = 8;
    public static final int R = 128;
    private static final int M = 200;

    public void L(class00500 class005002, class07299 class072992, class07209 class072092) {
        class072992.method_8652(class072092, (class00500)class005002.y((class08092)i, (Comparable)Boolean.valueOf(true)), 3);
        this.u(class005002, class072992, class072092);
        class072992.N(class072092, (class00891)this, 8);
        class072992.N(3002, class072092, ((class07211)class005002.L((class08092)y)).z().ordinal());
    }

    public class01111(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)class07211.field_11036)).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)i, (Comparable)Boolean.valueOf(false)));
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    private void u(class00500 class005002, class07299 class072992, class07209 class072092) {
        class07211 class072112 = ((class07211)class005002.L((class08092)y)).b();
        class072992.method_8452(class072092.method_10093(class072112), (class00891)this, class02752.N((class07299)class072992, (class07211)class072112, null));
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue() && class005002.L((class08092)y) == class072112) {
            return 15;
        }
        return 0;
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (class005002.N(class005003.i())) {
            return;
        }
        if (((Boolean)class005002.L((class08092)i)).booleanValue() && !class072992.method_8397().N(class072092, (Object)this)) {
            class072992.N(class072092, (class00891)this, 8);
        }
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            this.u(class005002, (class07299)class047822, class072092);
        }
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        if (!class072992.method_8546() || (long)class072992.field_9229.y(200) > class072992.N() % 200L || class072092.method_10264() != class072992.method_8624(class07830.field_13202, class072092.method_10263(), class072092.method_10260()) - 1) {
            return;
        }
        class02615.N((class07185)((class07211)class005002.L((class08092)y)).z(), (class07299)class072992, (class07209)class072092, (double)0.125, (class07126)class07107.ND, (class02135)class02135.y((int)1, (int)2));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, i, u});
    }

    public MapCodec<? extends class01111> N() {
        return L;
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return (Boolean)class005002.L((class08092)i) != false ? 15 : 0;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class00500 N(class06942 class069422) {
        boolean bl = class069422.method_8045().method_8316(class069422.method_8037()).N() == class04684.L;
        return (class00500)((class00500)this.W().y((class08092)y, (Comparable)class069422.method_8038())).y((class08092)u, (Comparable)Boolean.valueOf(bl));
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class047822.method_8652(class072092, (class00500)class005002.y((class08092)i, (Comparable)Boolean.valueOf(false)), 3);
        this.u(class005002, (class07299)class047822, class072092);
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

