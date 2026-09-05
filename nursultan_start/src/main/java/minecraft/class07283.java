/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class06514
 *  minecraft.class06517
 *  minecraft.class06520
 *  minecraft.class06570
 *  minecraft.class06584
 */
package minecraft;

import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class06514;
import minecraft.class06517;
import minecraft.class06520;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07310;

public class class07283
extends class06520 {
    public class07283(class03762 class037622) {
        super(class037622);
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        class06584 class065842 = class029032.N(1, 1);
        if (!class065842.N(class06570.lJ)) {
            return class06584.E;
        }
        class06584 class065843 = new class06584((class07310)class06570.lI, 8);
        class065843.N(class02484.h, (Object)((class06517)class065842.method_58694(class02484.h)));
        return class065843;
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        if (class029032.R() != 3 || class029032.M() != 3 || class029032.i() != 9) {
            return false;
        }
        for (int i = 0; i < class029032.M(); ++i) {
            for (int j = 0; j < class029032.R(); ++j) {
                class06584 class065842 = class029032.N(j, i);
                if (class065842.R()) {
                    return false;
                }
                if (!(j == 1 && i == 1 ? !class065842.N(class06570.lJ) : !class065842.N(class06570.sD))) continue;
                return false;
            }
        }
        return true;
    }

    public class06514<class07283> method_8119() {
        return class06514.U;
    }
}

