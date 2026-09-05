/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05543
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class04063;
import minecraft.class04072;
import minecraft.class04082;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05543;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;

class class04081
extends class04082 {
    private final class04072[] y;

    public class04081(class04063 class040632, class04072 ... class04072Array) {
        super((class05543)class040632);
        this.y = class04072Array;
    }

    @Override
    public boolean N(class00500 class005002) {
        return !class005002.N(class00869.bf);
    }

    @Override
    public class04072[] N() {
        return this.y;
    }

    @Override
    public boolean N(class07290 class072902, class07209 class072092, class07209 class072093, class07211 class072112, class00500 class005002) {
        class04688 class046882;
        class00500 class005003 = class072902.method_8320(class072093.method_10093(class072112));
        if (class005003.N(class00869.bA) || class005003.N(class00869.bC) || class005003.N(class00869.LN)) {
            return false;
        }
        if (class072092.method_19455((class00753)class072093) == 2 && class072902.method_8320((class07209)(class046882 = class072092.method_10093(class072112.b()))).L(class072902, (class07209)class046882, class072112)) {
            return false;
        }
        class046882 = class005002.Y();
        if (!class046882.W() && !class046882.y((class04651)class04684.L)) {
            return false;
        }
        if (class005002.N(class01210.Nh)) {
            return false;
        }
        return class005002.d() || super.N(class072902, class072092, class072093, class072112, class005002);
    }
}

