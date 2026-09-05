/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class05487
 *  minecraft.class06092
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06918
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class05487;
import minecraft.class06092;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public class class06502
extends class06918 {
    protected final class00891 N;
    private final class07211 y;

    public class06502(class00891 class008912, class00891 class008913, class07211 class072112, class06573 class065732) {
        super(class008912, class065732);
        this.N = class008913;
        this.y = class072112;
    }

    public @Nullable class00500 u(class06942 class069422) {
        class00500 class005002 = this.N.N(class069422);
        class00500 class005003 = null;
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        for (class07211 class072112 : class069422.i()) {
            class00500 class005004;
            if (class072112 == this.y.b()) continue;
            class00500 class005005 = class005004 = class072112 == this.y ? this.L().N(class069422) : class005002;
            if (class005004 == null || !this.N((class05487)class072992, class005004, class072092)) continue;
            class005003 = class005004;
            break;
        }
        return class005003 != null && class072992.method_8628(class005003, class072092, class06092.N()) ? class005003 : null;
    }

    protected boolean N(class05487 class054872, class00500 class005002, class07209 class072092) {
        return class005002.N(class054872, class072092);
    }

    public void N(Map<class00891, class06581> map, class06581 class065812) {
        super.N(map, class065812);
        map.put(this.N, class065812);
    }
}

