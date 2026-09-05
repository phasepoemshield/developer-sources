/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class01226
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02706
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06584
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class00743;
import minecraft.class01226;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02706;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06584;
import minecraft.class07299;

public class class06490
extends class06520 {
    public class06490(class03762 class037622) {
        super(class037622);
    }

    public class00743<class06584> N(class02903 class029032) {
        class00743 class007432 = class00743.method_10213((int)class029032.N(), (Object)class06584.E);
        for (int i = 0; i < class007432.size(); ++i) {
            class06584 class065842 = class029032.N(i);
            class06584 class065843 = class065842.B().Z();
            if (!class065843.R()) {
                class007432.set(i, (Object)class065843);
                continue;
            }
            if (!class065842.L(class02484.NL)) continue;
            class007432.set(i, (Object)class065842.L(1));
            break;
        }
        return class007432;
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        class06584 class065842;
        int n = 0;
        class06584 class065843 = class06584.E;
        for (int i = 0; i < class029032.N(); ++i) {
            class065842 = class029032.N(i);
            if (class065842.R()) continue;
            if (class065842.L(class02484.NL)) {
                if (!class065843.R()) {
                    return class06584.E;
                }
                class065843 = class065842;
                continue;
            }
            if (class065842.N(class01226.LW)) {
                ++n;
                continue;
            }
            return class06584.E;
        }
        class02706 class027062 = (class02706)class065843.method_58694(class02484.NL);
        if (class065843.R() || n < 1 || class027062 == null) {
            return class06584.E;
        }
        class065842 = class027062.y();
        if (class065842 == null) {
            return class06584.E;
        }
        class06584 class065844 = class065843.L(n);
        class065844.N(class02484.NL, (Object)class065842);
        return class065844;
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
            if (class065842.L(class02484.NL)) {
                if (bl2) {
                    return false;
                }
                bl2 = true;
                continue;
            }
            if (class065842.N(class01226.LW)) {
                bl = true;
                continue;
            }
            return false;
        }
        return bl2 && bl;
    }

    public class06514<class06490> method_8119() {
        return class06514.i;
    }
}

