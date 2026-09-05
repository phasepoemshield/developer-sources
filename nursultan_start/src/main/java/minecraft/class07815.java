/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00803
 *  minecraft.class01001
 *  minecraft.class01235
 *  minecraft.class04688
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05975
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07078
 *  minecraft.class07155
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07446
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00803;
import minecraft.class01001;
import minecraft.class01235;
import minecraft.class04688;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05975;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07078;
import minecraft.class07155;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07446;

public class class07815
implements class05975 {
    private int N;

    public void N(class04782 class047822, boolean bl) {
        if (!bl) {
            return;
        }
        if (!((Boolean)class047822.method_64395().N(class07305.h)).booleanValue()) {
            return;
        }
        class06069 class060692 = class047822.field_9229;
        --this.N;
        if (this.N > 0) {
            return;
        }
        this.N += (60 + class060692.y(60)) * 20;
        if (class047822.method_8594() < 5 && class047822.method_8597().i()) {
            return;
        }
        for (class04770 class047702 : class047822.method_18456()) {
            class04688 class046882;
            class00500 class005002;
            class07209 class072092;
            class07052 class070522;
            if (class047702.method_7325()) continue;
            class07209 class072093 = class047702.method_24515();
            if (class047822.method_8597().i() && (class072093.method_10264() < class047822.method_8615() || !class047822.N_17(class072093)) || !(class070522 = class047822.method_8404(class072093)).N(class060692.z() * 3.0f)) continue;
            int n = class04995.N((int)class047702.method_14248().N(class01235.Z.y((Object)class01235.m)), (int)1, (int)Integer.MAX_VALUE);
            int n2 = 24000;
            if (class060692.y(n) < 72000 || !class00803.N((class07290)class047822, (class07209)(class072092 = class072093.method_10086(20 + class060692.y(15)).method_10089(-10 + class060692.y(21)).method_10077(-10 + class060692.y(21))), (class00500)(class005002 = class047822.method_8320(class072092)), (class04688)(class046882 = class047822.method_8316(class072092)), (class07078)class07078.ND)) continue;
            class07446 class074462 = null;
            int n3 = 1 + class060692.y(class070522.N().N() + 1);
            for (int i = 0; i < n3; ++i) {
                class07155 class071552 = (class07155)class07078.ND.N((class07299)class047822, class06113.field_16459);
                if (class071552 == null) continue;
                class071552.method_5725(class072092, 0.0f, 0.0f);
                class074462 = class071552.N((class01001)class047822, class070522, class06113.field_16459, class074462);
                class047822.y((class07049)class071552);
            }
        }
    }
}

