/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08713;

public class class06077
extends class00891 {
    public static final MapCodec<class06077> N = class06077.y(class06077::new);
    private static final class00494 y = class00891.y((double)12.0, (double)13.0, (double)16.0);
    private static final int L = 14;
    private static final int u = 10;
    private static final int i = 10;

    public class06077(class01362 class013622) {
        super(class013622);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return y;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        double d = (double)n + class060692.U();
        double d2 = (double)n2 + 0.7;
        double d3 = (double)n3 + class060692.U();
        class072992.method_8406((class07126)class07107.NO, d, d2, d3, 0.0, 0.0, 0.0);
        class07218 class072182 = new class07218();
        for (int i = 0; i < 14; ++i) {
            class072182.N(n + class04995.N((class06069)class060692, (int)-10, (int)10), n2 - class060692.y(10), n3 + class04995.N((class06069)class060692, (int)-10, (int)10));
            if (class072992.method_8320((class07209)class072182).W((class07290)class072992, (class07209)class072182)) continue;
            class072992.method_8406((class07126)class07107.No, (double)class072182.method_10263() + class060692.U(), (double)class072182.method_10264() + class060692.U(), (double)class072182.method_10260() + class060692.U(), 0.0, 0.0, 0.0);
        }
    }

    public MapCodec<class06077> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class072112 == class07211.field_11036 && !this.a_(class005002, class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        return class00891.N_6((class05487)class054872, (class07209)class072092.method_10084(), (class07211)class07211.field_11033) && !class054872.z(class072092);
    }
}

