/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class01164
 *  minecraft.class01187
 *  minecraft.class01190
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class00737;
import minecraft.class01164;
import minecraft.class01187;
import minecraft.class01190;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class03630;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07209;

class class03632
implements class01187 {
    private final class01190 y;
    private final int L;
    final /* synthetic */ class03630 N;

    public class03632(class03630 class036302, class01190 class011902, int n) {
        this.N = class036302;
        this.y = class011902;
        this.L = n;
    }

    public int y() {
        return this.L;
    }

    public class01190 N() {
        return this.y;
    }

    public boolean N(class04782 class047822, class03556<class01194> class035562, class01164 class011642, class06889 class068892) {
        if (class035562.N((class03556)class01194.g)) {
            this.N.N(class07209.method_49638((class00737)class068892), true);
            return true;
        }
        if (class035562.N((class03556)class01194.I)) {
            this.N.N(class07209.method_49638((class00737)class068892), false);
            return true;
        }
        return false;
    }
}

