/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00628
 *  minecraft.class00737
 *  minecraft.class00869
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07475
 *  minecraft.class07969
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00628;
import minecraft.class00737;
import minecraft.class00869;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07475;
import minecraft.class07872;
import minecraft.class07969;
import minecraft.class08092;

class class07893
extends class07969 {
    private final class07872 M;

    class07893(class07872 class078722, double d) {
        super((class07475)class078722, d, 16);
        this.M = class078722;
    }

    public void i() {
        super.i();
        class07209 class072092 = this.M.method_24515();
        if (!this.M.method_5799() && this.W()) {
            if (this.M.N < 1) {
                this.M.M(true);
            } else if (this.M.N > this.N(200)) {
                class07299 class072992 = this.M.method_73183();
                class072992.method_8396(null, class072092, class04909.OI, class04911.field_15245, 0.3f, 0.9f + class072992.field_9229.z() * 0.2f);
                class07209 class072093 = this.i.method_10084();
                class00500 class005002 = (class00500)class00869.my.W().y((class08092)class00628.L, (Comparable)Integer.valueOf(class07872.y(this.M).y(4) + 1));
                class072992.method_8652(class072093, class005002, 3);
                class072992.N((class03556)class01194.Z, class072093, class01164.N((class07049)this.M, (class00500)class005002));
                this.M.N(false);
                this.M.M(false);
                this.M.M(600);
            }
            if (this.M.W()) {
                ++this.M.N;
            }
        }
    }

    public boolean y() {
        return super.y() && this.M.B() && this.M.L.method_19769((class00737)this.M.method_73189(), 9.0);
    }

    public boolean N() {
        if (this.M.B() && this.M.L.method_19769((class00737)this.M.method_73189(), 9.0)) {
            return super.N();
        }
        return false;
    }

    protected boolean N(class05487 class054872, class07209 class072092) {
        if (!class054872.R(class072092.method_10084())) {
            return false;
        }
        return class00628.y((class07290)class054872, (class07209)class072092);
    }
}

