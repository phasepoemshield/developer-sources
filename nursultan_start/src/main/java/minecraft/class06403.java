/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00651
 *  minecraft.class00753
 *  minecraft.class00807
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06225
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00651;
import minecraft.class00753;
import minecraft.class00807;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class08092;

public class class06403
extends class06391<class06225> {
    public static final int NE = 4;
    public static final int NW = 4;
    public static final int Nm = 1;
    public static final float NP = 0.5f;
    private static final class07209 Ns = class07209.field_10980;
    private final boolean NT;

    public class06403(boolean bl) {
        super(class06225.y);
        this.NT = bl;
    }

    private void N(class05974 class059742, class07209 class072092, class00891 class008912) {
        if (!class059742.method_8320(class072092).N(class008912)) {
            class059742.N(class072092, true, null);
            this.N((class00807)class059742, class072092, class008912.W());
        }
    }

    public static class07209 N(class07209 class072092) {
        return Ns.method_10081((class00753)class072092);
    }

    @Override
    public boolean N(class06058<class06225> class060582) {
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        for (class07209 class072093 : class07209.method_10097((class07209)new class07209(class072092.method_10263() - 4, class072092.method_10264() - 1, class072092.method_10260() - 4), (class07209)new class07209(class072092.method_10263() + 4, class072092.method_10264() + 32, class072092.method_10260() + 4))) {
            boolean bl = class072093.method_19771((class00753)class072092, 2.5);
            if (!bl && !class072093.method_19771((class00753)class072092, 3.5)) continue;
            if (class072093.method_10264() < class072092.method_10264()) {
                if (bl) {
                    this.N((class00807)class059742, class072093, class00869.q.W());
                    continue;
                }
                if (class072093.method_10264() >= class072092.method_10264()) continue;
                if (this.NT) {
                    this.N(class059742, class072093, class00869.MP);
                    continue;
                }
                this.N((class00807)class059742, class072093, class00869.MP.W());
                continue;
            }
            if (class072093.method_10264() > class072092.method_10264()) {
                if (this.NT) {
                    this.N(class059742, class072093, class00869.N);
                    continue;
                }
                this.N((class00807)class059742, class072093, class00869.N.W());
                continue;
            }
            if (!bl) {
                this.N((class00807)class059742, class072093, class00869.q.W());
                continue;
            }
            if (this.NT) {
                this.N(class059742, new class07209((class00753)class072093), class00869.MW);
                continue;
            }
            this.N((class00807)class059742, new class07209((class00753)class072093), class00869.N.W());
        }
        for (int i = 0; i < 4; ++i) {
            this.N((class00807)class059742, class072092.method_10086(i), class00869.q.W());
        }
        class07209 class072094 = class072092.method_10086(2);
        for (class07211 class072112 : class07221.field_11062) {
            this.N((class00807)class059742, class072094.method_10093(class072112), (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class072112));
        }
        return true;
    }
}

