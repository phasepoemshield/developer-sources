/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06662
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06662;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07784;
import minecraft.class08713;

public class class07770
extends class00891
implements class00873 {
    public static final MapCodec<class07770> N = class07770.y(class07770::new);
    private static final class00494 y = class00891.y((double)8.0, (double)0.0, (double)12.0);

    public class07770(class01362 class013622) {
        super(class013622);
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class060692.y(3) == 0 && class047822.R(class072092.method_10084()) && class047822.method_22335(class072092.method_10084(), 0) >= 9) {
            this.N((class07299)class047822, class072092);
        }
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class054872.method_8320(class072092.method_10084()).P();
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return true;
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        this.N((class07299)class047822, class072092);
    }

    protected void N(class07299 class072992, class07209 class072092) {
        class072992.method_8652(class072092.method_10084(), (class00500)class00869.mx.W().y(class07784.L, (Comparable)class06662.field_12466), 3);
    }

    public MapCodec<class07770> N() {
        return N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y.method_64034(class005002.N(class072092));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        if (class072112 == class07211.field_11036 && class005003.N(class00869.mx)) {
            return class00869.mx.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return new class06584((class07310)class06570.iz);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092.method_10074()).N(class01210.NV);
    }
}

