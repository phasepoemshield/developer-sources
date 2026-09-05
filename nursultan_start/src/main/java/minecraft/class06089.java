/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00701
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00701;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;

public class class06089
extends class00891
implements class06084 {
    public static final MapCodec<class06089> N = class06089.y(class06089::new);
    private static final int R = 1;
    private static final class00494 M = class00389.N((class00494)class00891.y((double)16.0, (double)14.0, (double)16.0), (class00494)class00389.L((class00494)class00891.N((double)0.0, (double)0.0, (double)0.0, (double)2.0, (double)16.0, (double)2.0)).values().stream().reduce(class00389.N(), class00389::N));
    private static final class00494 B = class00891.y((double)16.0, (double)0.0, (double)2.0);
    private static final class00494 Z = class00389.N((class00494)M, (class00494[])new class00494[]{B, class00389.L((class00494)class00891.N((double)16.0, (double)0.0, (double)2.0, (double)0.0, (double)2.0)).values().stream().reduce(class00389.N(), class00389::N)});
    private static final class00494 O = class00389.y().method_1096(0.0, -1.0, 0.0).method_1097();
    public static final int y = 7;
    public static final class08071 L = class06665.yN;
    public static final class06667 u = class06665.q;
    public static final class06667 i = class06665.u;

    public class06089(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(7))).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)i, (Comparable)Boolean.valueOf(false)));
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (class060922.i()) {
            return class00389.N();
        }
        if (!class060922.N(class00389.y(), class072092, true) || class060922.L()) {
            if ((Integer)class005002.L((class08092)L) != 0 && ((Boolean)class005002.L((class08092)i)).booleanValue() && class060922.N(O, class072092, true)) {
                return B;
            }
            return class00389.N();
        }
        return M;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)u)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (!class054872.method_8608()) {
            class087132.N(class072092, (class00891)this, 1);
        }
        return class005002;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        int n = class06089.N((class07290)class047822, class072092);
        class00500 class005003 = (class00500)((class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n))).y((class08092)i, (Comparable)Boolean.valueOf(this.N((class07290)class047822, class072092, n)));
        if ((Integer)class005003.L((class08092)L) == 7) {
            if ((Integer)class005002.L((class08092)L) == 7) {
                class00701.N((class07299)class047822, (class07209)class072092, (class00500)class005003);
            } else {
                class047822.N(class072092, true);
            }
        } else if (class005002 != class005003) {
            class047822.method_8652(class072092, class005003, 3);
        }
    }

    private boolean N(class07290 class072902, class07209 class072092, int n) {
        return n > 0 && !class072902.method_8320(class072092.method_10074()).N((class00891)this);
    }

    public static int N(class07290 class072902, class07209 class072092) {
        class07211 class072112;
        class00500 class005002;
        class07218 class072182 = class072092.method_25503().N(class07211.field_11033);
        class00500 class005003 = class072902.method_8320((class07209)class072182);
        int n = 7;
        if (class005003.N(class00869.Pa)) {
            n = (Integer)class005003.L((class08092)L);
        } else if (class005003.L(class072902, (class07209)class072182, class07211.field_11036)) {
            return 0;
        }
        Iterator var5 = class07221.field_11062.iterator();
        while (var5.hasNext() && (!(class005002 = class072902.method_8320((class07209)class072182.N((class00753)class072092, class072112 = (class07211)var5.next()))).N(class00869.Pa) || (n = Math.min(n, (Integer)class005002.L((class08092)L) + 1)) != 1)) {
        }
        return n;
    }

    public MapCodec<class06089> N() {
        return N;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, u, i});
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        if (!class060922.N(class005002.i().B())) {
            return (Boolean)class005002.L((class08092)i) != false ? Z : M;
        }
        return class00389.y();
    }

    protected boolean N(class00500 class005002, class06942 class069422) {
        return class069422.method_8041().N(this.B());
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        if (!class072992.method_8608()) {
            class072992.N(class072092, (class00891)this, 1);
        }
    }

    public class00500 N(class06942 class069422) {
        class07209 class072092 = class069422.method_8037();
        class07299 class072992 = class069422.method_8045();
        int n = class06089.N((class07290)class072992, class072092);
        return (class00500)((class00500)((class00500)this.W().y((class08092)u, (Comparable)Boolean.valueOf(class072992.method_8316(class072092).N() == class04684.L))).y((class08092)L, (Comparable)Integer.valueOf(n))).y((class08092)i, (Comparable)Boolean.valueOf(this.N((class07290)class072992, class072092, n)));
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class06089.N((class07290)class054872, class072092) < 7;
    }

    protected class00494 b_(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class00389.y();
    }
}

