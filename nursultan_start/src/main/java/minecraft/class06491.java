/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02813
 *  minecraft.class02827
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07310
 */
package minecraft;

import java.util.ArrayList;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02813;
import minecraft.class02827;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07310;

public class class06491
extends class06520 {
    private static final class06510 N = class06510.method_8101((class07310)class06570.jk);
    private static final class06510 y = class06510.method_8101((class07310)class06570.bN);
    private static final class06510 L = class06510.method_8101((class07310)class06570.Go);

    public class06491(class03762 class037622) {
        super(class037622);
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        ArrayList<class02827> arrayList = new ArrayList<class02827>();
        int n = 0;
        for (int i = 0; i < class029032.N(); ++i) {
            class02827 class028272;
            class06584 class065842 = class029032.N(i);
            if (class065842.R()) continue;
            if (y.method_8093(class065842)) {
                ++n;
                continue;
            }
            if (!L.method_8093(class065842) || (class028272 = (class02827)class065842.method_58694(class02484.Ns)) == null) continue;
            arrayList.add(class028272);
        }
        class06584 class065843 = new class06584((class07310)class06570.GJ, 3);
        class065843.N(class02484.NT, (Object)new class02813(n, arrayList));
        return class065843;
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        if (class029032.i() < 2) {
            return false;
        }
        boolean bl = false;
        int n = 0;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (class065842.R()) continue;
            if (N.method_8093(class065842)) {
                if (bl) {
                    return false;
                }
                bl = true;
                continue;
            }
            if (!(y.method_8093(class065842) ? ++n > 3 : !L.method_8093(class065842))) continue;
            return false;
        }
        return bl && n >= 1;
    }

    public class06514<class06491> method_8119() {
        return class06514.B;
    }
}

