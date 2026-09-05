/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00864
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class03707
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00864;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class03707;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08791;

public class class05555
extends class00864
implements class00873 {
    public static final MapCodec<class05555> N = class05555.y(class05555::new);
    private static final class00494 y = class00389.N((class00494)class00891.y((double)16.0, (double)8.0, (double)16.0), (class00494)class00891.y((double)4.0, (double)0.0, (double)8.0));

    public class05555(class01362 class013622) {
        super(class013622);
    }

    public void N(class04782 class047822, class06069 class060692, class07209 class072092, class00500 class005002) {
        class03707.i.N(class047822, class047822.method_14178().U(), class072092, class005002, class060692);
    }

    public boolean N(class07299 class072992, class06069 class060692, class07209 class072092, class00500 class005002) {
        return (double)class072992.field_9229.z() < 0.45;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public MapCodec<class05555> N() {
        return N;
    }

    public boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class054872.method_8316(class072092.method_10084()).W();
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class00869.in) || super.N(class005002, class072902, class072092);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }
}

