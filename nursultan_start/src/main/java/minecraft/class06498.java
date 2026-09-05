/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02708
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06563
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06920
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class00743;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02708;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06563;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06920;
import minecraft.class07299;

public class class06498
extends class06520 {
    public class06498(class03762 class037622) {
        super(class037622);
    }

    public class00743<class06584> N(class02903 class029032) {
        class00743 class007432 = class00743.method_10213((int)class029032.N(), (Object)class06584.E);
        for (int i = 0; i < class007432.size(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (class065842.R()) continue;
            class06584 class065843 = class065842.B().Z();
            if (!class065843.R()) {
                class007432.set(i, (Object)class065843);
                continue;
            }
            if (((class02708)class065842.a_(class02484.Nv, (Object)class02708.L)).y().isEmpty()) continue;
            class007432.set(i, (Object)class065842.L(1));
        }
        return class007432;
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        for (int i = 0; i < class029032.N(); ++i) {
            int n;
            class06584 class065842 = class029032.N(i);
            if (class065842.R() || (n = ((class02708)class065842.a_(class02484.Nv, (Object)class02708.L)).y().size()) <= 0 || n > 6) continue;
            return class065842.L(1);
        }
        return class06584.E;
    }

    public boolean method_8115(class02903 class029032, class07299 class072992) {
        if (class029032.i() != 2) {
            return false;
        }
        class06563 class065632 = null;
        boolean bl = false;
        boolean bl2 = false;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065842 = class029032.N(i);
            if (class065842.R()) continue;
            class06581 class065812 = class065842.B();
            if (class065812 instanceof class06920) {
                class06920 class069202 = (class06920)class065812;
                if (class065632 == null) {
                    class065632 = class069202.N();
                } else if (class065632 != class069202.N()) {
                    return false;
                }
            } else {
                return false;
            }
            int n = ((class02708)class065842.a_(class02484.Nv, (Object)class02708.L)).y().size();
            if (n > 6) {
                return false;
            }
            if (n > 0) {
                if (bl2) {
                    return false;
                }
                bl2 = true;
                continue;
            }
            if (bl) {
                return false;
            }
            bl = true;
        }
        return bl2 && bl;
    }

    public class06514<class06498> method_8119() {
        return class06514.E;
    }
}

