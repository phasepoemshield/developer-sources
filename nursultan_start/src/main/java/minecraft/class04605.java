/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00873
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class04782
 *  minecraft.class05253
 *  minecraft.class05487
 *  minecraft.class06772
 *  minecraft.class07209
 *  minecraft.class07728
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00873;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class04596;
import minecraft.class04626;
import minecraft.class04782;
import minecraft.class05253;
import minecraft.class05487;
import minecraft.class06772;
import minecraft.class07209;
import minecraft.class07728;
import minecraft.class08092;

class class04605
extends class04596 {
    static final int y = 30;
    final /* synthetic */ class04626 L;

    @Override
    public boolean M() {
        if (this.L.o() >= 10) {
            return false;
        }
        if (class04626.Y(this.L).z() < 0.3f) {
            return false;
        }
        return this.L.NI() && this.L.Ng();
    }

    class04605(class04626 class046262) {
        this.L = class046262;
        super(class046262);
    }

    @Override
    public boolean Z() {
        return this.M();
    }

    public void i() {
        if (class04626.Q(this.L).y(this.N(30)) != 0) {
            return;
        }
        for (int i = 1; i <= 2; ++i) {
            class00873 class008732;
            class07209 class072092 = this.L.method_24515().method_10087(i);
            class00500 class005002 = this.L.method_73183().method_8320(class072092);
            class00891 class008912 = class005002.i();
            class00500 class005003 = null;
            if (!class005002.N(class01210.Nx)) continue;
            if (class008912 instanceof class06772) {
                class06772 class067722 = (class06772)class008912;
                if (!class067722.E(class005002)) {
                    class005003 = class067722.y(class067722.U(class005002) + 1);
                }
            } else if (class008912 instanceof class07728) {
                int n = (Integer)class005002.L((class08092)class07728.L);
                if (n < 7) {
                    class005003 = (class00500)class005002.y((class08092)class07728.L, (Comparable)Integer.valueOf(n + 1));
                }
            } else if (class005002.N(class00869.sM)) {
                int n = (Integer)class005002.L((class08092)class05253.L);
                if (n < 3) {
                    class005003 = (class00500)class005002.y((class08092)class05253.L, (Comparable)Integer.valueOf(n + 1));
                }
            } else if ((class005002.N(class00869.vA) || class005002.N(class00869.vf)) && (class008732 = (class00873)class005002.i()).N((class05487)this.L.method_73183(), class072092, class005002)) {
                class008732.N((class04782)this.L.method_73183(), class04626.O(this.L), class072092, class005002);
                class005003 = this.L.method_73183().method_8320(class072092);
            }
            if (class005003 == null) continue;
            this.L.method_73183().N(2011, class072092, 15);
            this.L.method_73183().method_8501(class072092, class005003);
            this.L.NQ();
        }
    }
}

