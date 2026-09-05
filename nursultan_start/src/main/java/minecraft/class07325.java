/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02708
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06920
 */
package minecraft;

import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02708;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06920;
import minecraft.class07299;

public class class07325
extends class06520 {
    public class07325(class03762 class037622) {
        super(class037622);
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        class06584 class065842 = class06584.E;
        class06584 class065843 = class06584.E;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065844 = class029032.N(i);
            if (class065844.R()) continue;
            if (class065844.B() instanceof class06920) {
                class065842 = class065844;
                continue;
            }
            if (!class065844.N(class06570.lo)) continue;
            class065843 = class065844.t();
        }
        if (class065843.R()) {
            return class065843;
        }
        class065843.N(class02484.Nv, (Object)((class02708)class065842.method_58694(class02484.Nv)));
        class065843.N(class02484.Nn, (Object)((class06920)class065842.B()).N());
        return class065843;
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        if (class029032.i() != 2) {
            return false;
        }
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (class065842.R()) continue;
            if (class065842.B() instanceof class06920) {
                if (bl2) {
                    return false;
                }
                bl2 = true;
                continue;
            }
            if (class065842.N(class06570.lo)) {
                if (bl) {
                    return false;
                }
                if (!((class02708)class065842.a_(class02484.Nv, (Object)class02708.L)).y().isEmpty()) {
                    return false;
                }
                bl = true;
                continue;
            }
            return false;
        }
        return bl && bl2;
    }

    public class06514<class07325> method_8119() {
        return class06514.W;
    }
}

