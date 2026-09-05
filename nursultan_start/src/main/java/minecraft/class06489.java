/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07299;

public class class06489
extends class06520 {
    public class06489(class03762 class037622) {
        super(class037622);
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        int n = 0;
        class06584 class065842 = class06584.E;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065843 = class029032.N(i);
            if (class065843.R()) continue;
            if (class065843.L(class02484.f)) {
                if (!class065842.R()) {
                    return class06584.E;
                }
                class065842 = class065843;
                continue;
            }
            if (class065843.N(class06570.Gt)) {
                ++n;
                continue;
            }
            return class06584.E;
        }
        if (class065842.R() || n < 1) {
            return class06584.E;
        }
        return class065842.L(n + 1);
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        if (class029032.i() < 2) {
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (class065842.R()) continue;
            if (class065842.L(class02484.f)) {
                if (bl2) {
                    return false;
                }
                bl2 = true;
                continue;
            }
            if (class065842.N(class06570.Gt)) {
                bl = true;
                continue;
            }
            return false;
        }
        return bl2 && bl;
    }

    public class06514<class06489> method_8119() {
        return class06514.R;
    }
}

