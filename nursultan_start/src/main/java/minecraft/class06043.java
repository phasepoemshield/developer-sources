/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05584
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06761
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08059
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05584;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06761;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08059;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class06043
extends class06761
implements class00873,
class06084 {
    public static final MapCodec<class06043> L = class06043.y(class06043::new);
    private static final class06667 i = class06665.q;
    public static final class08064<class07211> u = class06665.f;
    private static final class00494 R = class00891.y((double)12.0, (double)0.0, (double)13.0);

    public class06043(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)class08059.field_12607)).y((class08092)i, (Comparable)Boolean.valueOf(false))).y(u, (Comparable)class07211.field_11043));
    }

    protected float l() {
        return 0.1f;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        if (class005002.L((class08092)class06761.y) == class08059.field_12607) {
            class07209 class072093 = class072092.method_10084();
            class047822.method_8652(class072093, class047822.method_8316(class072093).B(), 18);
            class05584.N((class07284)class047822, (class06069)class060692, (class07209)class072092, (class07211)((class07211)class005002.L(u)));
        } else {
            class07209 class072094 = class072092.method_10074();
            this.N(class047822, class060692, class072094, class047822.method_8320(class072094));
        }
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(u, (Comparable)class069932.N((class07211)class005002.L(u)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(u)));
    }

    public MapCodec<class06043> N() {
        return L;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        if (!class072992.method_8608()) {
            class07209 class072093 = class072092.method_10084();
            class00500 class005003 = class06761.y((class05487)class072992, (class07209)class072093, (class00500)((class00500)((class00500)this.W().y((class08092)y, (Comparable)class08059.field_12609)).y(u, (Comparable)((class07211)class005002.L(u)))));
            class072992.method_8652(class072093, class005003, 3);
        }
    }

    public @Nullable class00500 N(class06942 class069422) {
        class00500 class005002 = super.N(class069422);
        if (class005002 != null) {
            return class06043.y((class05487)class069422.method_8045(), (class07209)class069422.method_8037(), (class00500)((class00500)class005002.y(u, (Comparable)class069422.method_8042().b())));
        }
        return null;
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class01210.yV) || class072902.method_8316(class072092.method_10084()).N((class04651)class04684.L) && super.N(class005002, class072902, class072092);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return R;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, i, u});
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        if (class005002.L((class08092)y) == class08059.field_12609) {
            return super.a_(class005002, class054872, class072092);
        }
        class07209 class072093 = class072092.method_10074();
        class00500 class005003 = class054872.method_8320(class072093);
        return this.N(class005003, (class07290)class054872, class072093);
    }
}

