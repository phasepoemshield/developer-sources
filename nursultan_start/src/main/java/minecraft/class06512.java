/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02827
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class07299
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02827;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06559;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07299;

public class class06512
extends class06520 {
    private static final class06510 N = class06510.method_8101(class06570.Go);

    public class06512(class03762 class037622) {
        super(class037622);
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        IntArrayList intArrayList = new IntArrayList();
        class06584 class065842 = null;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065843 = class029032.N(i);
            class06581 class065812 = class065843.B();
            if (class065812 instanceof class06559) {
                class06559 class065592 = (class06559)class065812;
                intArrayList.add(class065592.N().i());
                continue;
            }
            if (!N.method_8093(class065843)) continue;
            class065842 = class065843.L(1);
        }
        if (class065842 == null || intArrayList.isEmpty()) {
            return class06584.E;
        }
        class065842.N(class02484.Ns, class02827.N, intArrayList, class02827::N);
        return class065842;
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
            if (class065842.B() instanceof class06559) {
                bl = true;
                continue;
            }
            if (N.method_8093(class065842)) {
                if (bl2) {
                    return false;
                }
                bl2 = true;
                continue;
            }
            return false;
        }
        return bl2 && bl;
    }

    public class06514<class06512> method_8119() {
        return class06514.z;
    }
}

