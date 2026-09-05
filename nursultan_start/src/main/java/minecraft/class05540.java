/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01008
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05584
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07101
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01008;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05474;
import minecraft.class05487;
import minecraft.class05584;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07101;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class08092;
import minecraft.class08713;

public class class05540
extends class07101
implements class00873,
class06084 {
    public static final MapCodec<class05540> N = class05540.y(class05540::new);
    private static final class06667 y = class06665.q;
    private static final Map<class07211, class00494> L = class00389.L((class00494)class00891.y((double)6.0, (double)0.0, (double)16.0).method_1096(0.0, 0.0, 0.25).method_1097());

    public class05540(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)R, (Comparable)class07211.field_11043));
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class005002.N((class05487)class047822, class072092)) {
            class047822.N(class072092, true);
        }
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        Optional var4 = class01008.N((class07290)class054872, (class07209)class072092, (class00891)class005002.i(), (class07211)class07211.field_11036, (class00891)class00869.nL);
        if (var4.isEmpty()) {
            return false;
        }
        class07209 class072093 = ((class07209)var4.get()).method_10084();
        class00500 class005003 = class054872.method_8320(class072093);
        return class05584.N((class05474)((Object)class054872), (class07209)class072093, (class00500)class005003);
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        Optional var5 = class01008.N((class07290)class047822, (class07209)class072092, (class00891)class005002.i(), (class07211)class07211.field_11036, (class00891)class00869.nL);
        if (var5.isEmpty()) {
            return;
        }
        class07209 class072093 = (class07209)var5.get();
        class07209 class072094 = class072093.method_10084();
        class07211 class072112 = (class07211)class005002.L((class08092)R);
        class05540.N((class07284)class047822, class072093, class047822.method_8316(class072093), class072112);
        class05584.N((class07284)class047822, (class07209)class072094, (class04688)class047822.method_8316(class072094), (class07211)class072112);
    }

    public MapCodec<class05540> N() {
        return N;
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)class00869.nL);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, R});
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return L.get(class005002.L((class08092)R));
    }

    protected static boolean N(class07284 class072842, class07209 class072092, class04688 class046882, class07211 class072112) {
        class00500 class005002 = (class00500)((class00500)class00869.nu.W().y((class08092)y, (Comparable)Boolean.valueOf(class046882.N((class04651)class04684.L)))).y((class08092)R, (Comparable)class072112);
        return class072842.method_8652(class072092, class005002, 3);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!(class072112 != class07211.field_11033 && class072112 != class07211.field_11036 || class005002.N(class054872, class072092))) {
            class087132.N(class072092, (class00891)this, 1);
        }
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        class00500 class005003 = class054872.method_8320(class072093);
        class00500 class005004 = class054872.method_8320(class072092.method_10084());
        return !(!class005003.N((class00891)this) && !class005003.N(class01210.ye) || !class005004.N((class00891)this) && !class005004.N(class00869.nL));
    }
}

