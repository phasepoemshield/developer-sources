/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01226
 *  minecraft.class01929
 *  minecraft.class02816
 *  minecraft.class02903
 *  minecraft.class03762
 *  minecraft.class06514
 *  minecraft.class06520
 *  minecraft.class06559
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07299
 */
package minecraft;

import java.util.ArrayList;
import minecraft.class01226;
import minecraft.class01929;
import minecraft.class02816;
import minecraft.class02903;
import minecraft.class03762;
import minecraft.class06514;
import minecraft.class06520;
import minecraft.class06559;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07299;

public class class06496
extends class06520 {
    public class06496(class03762 class037622) {
        super(class037622);
    }

    public class06584 method_8116(class02903 class029032, class01929 class019292) {
        ArrayList<class06559> arrayList = new ArrayList<class06559>();
        class06584 class065842 = class06584.E;
        for (int i = 0; i < class029032.N(); ++i) {
            class06584 class065843 = class029032.N(i);
            if (class065843.R()) continue;
            if (class065843.N(class01226.Lz)) {
                if (!class065842.R()) {
                    return class06584.E;
                }
                class065842 = class065843.t();
                continue;
            }
            class06581 class065812 = class065843.B();
            if (class065812 instanceof class06559) {
                class06559 class065592 = (class06559)class065812;
                arrayList.add(class065592);
                continue;
            }
            return class06584.E;
        }
        if (class065842.R() || arrayList.isEmpty()) {
            return class06584.E;
        }
        return class02816.N((class06584)class065842, arrayList);
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
            if (class065842.N(class01226.Lz)) {
                if (bl) {
                    return false;
                }
                bl = true;
                continue;
            }
            if (class065842.B() instanceof class06559) {
                bl2 = true;
                continue;
            }
            return false;
        }
        return bl2 && bl;
    }

    public class06514<class06496> method_8119() {
        return class06514.u;
    }
}

