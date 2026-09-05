/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07211
 *  minecraft.class08064
 *  minecraft.class08071
 *  minecraft.class08092
 */
package minecraft;

import java.util.Map;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class07211;
import minecraft.class08064;
import minecraft.class08071;
import minecraft.class08092;

public interface class08614 {
    public static final int u = 1;
    public static final int i = 4;
    public static final class08071 R = class06665.S;

    default public double L() {
        return 1.0;
    }

    default public class08071 u() {
        return R;
    }

    default public Function<class00500, class00494> N(class08064<class07211> class080642, class08071 class080712) {
        Map map = class00389.L((class00494)class00891.N((double)0.0, (double)0.0, (double)0.0, (double)8.0, (double)this.L(), (double)8.0));
        return class005002 -> {
            class00494 class004942 = class00389.N();
            class07211 class072112 = (class07211)class005002.L((class08092)class080642);
            int n = (Integer)class005002.L((class08092)class080712);
            for (int i = 0; i < n; ++i) {
                class004942 = class00389.N((class00494)class004942, (class00494)((class00494)map.get(class072112)));
                class072112 = class072112.M();
            }
            return class004942.method_52620();
        };
    }

    default public class00500 N(class06942 class069422, class00891 class008912, class08071 class080712, class08064<class07211> class080642) {
        class00500 class005002 = class069422.method_8045().method_8320(class069422.method_8037());
        if (class005002.N(class008912)) {
            return (class00500)class005002.y((class08092)class080712, (Comparable)Integer.valueOf(Math.min(4, (Integer)class005002.L((class08092)class080712) + 1)));
        }
        return (class00500)class008912.W().y(class080642, (Comparable)class069422.method_8042().b());
    }

    default public boolean N(class00500 class005002, class06942 class069422, class08071 class080712) {
        return !class069422.method_8046() && class069422.method_8041().N(class005002.i().B()) && (Integer)class005002.L((class08092)class080712) < 4;
    }
}

