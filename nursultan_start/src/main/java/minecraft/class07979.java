/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class04995
 *  minecraft.class07209
 *  minecraft.class07473
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class01231;
import minecraft.class04995;
import minecraft.class07209;
import minecraft.class07473;
import minecraft.class07475;

public class class07979
extends class07473 {
    private final class07475 N;

    public void L() {
        class07209 class072092 = null;
        for (class07209 class072093 : class07209.method_10094((int)class04995.N((double)(this.N.method_23317() - 2.0)), (int)class04995.N((double)(this.N.method_23318() - 2.0)), (int)class04995.N((double)(this.N.method_23321() - 2.0)), (int)class04995.N((double)(this.N.method_23317() + 2.0)), (int)this.N.method_31478(), (int)class04995.N((double)(this.N.method_23321() + 2.0)))) {
            if (!this.N.method_73183().method_8316(class072093).N(class01231.N)) continue;
            class072092 = class072093;
            break;
        }
        if (class072092 != null) {
            this.N.F().N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), 1.0);
        }
    }

    public class07979(class07475 class074752) {
        this.N = class074752;
    }

    public boolean N() {
        return this.N.method_24828() && !this.N.method_73183().method_8316(this.N.method_24515()).N(class01231.N);
    }
}

