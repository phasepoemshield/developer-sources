/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class07475
 *  minecraft.class07969
 */
package minecraft;

import minecraft.class00869;
import minecraft.class05487;
import minecraft.class07209;
import minecraft.class07475;
import minecraft.class07872;
import minecraft.class07969;

class class07868
extends class07969 {
    private static final int M = 1200;
    private final class07872 B;

    class07868(class07872 class078722, double d) {
        super((class07475)class078722, class078722.method_6109() ? 2.0 : d, 24);
        this.B = class078722;
        this.R = -1;
    }

    public boolean y() {
        return !this.B.method_5799() && this.u <= 1200 && this.N((class05487)this.B.method_73183(), this.i);
    }

    public boolean E() {
        return this.u % 160 == 0;
    }

    protected boolean N(class05487 class054872, class07209 class072092) {
        return class054872.method_8320(class072092).N(class00869.K);
    }

    public boolean N() {
        if (this.B.method_6109() && !this.B.method_5799()) {
            return super.N();
        }
        if (!(this.B.i || this.B.method_5799() || this.B.B())) {
            return super.N();
        }
        return false;
    }
}

