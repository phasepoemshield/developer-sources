/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05487
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07969
 */
package minecraft;

import minecraft.class05487;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07475;
import minecraft.class07541;
import minecraft.class07969;

class class07537
extends class07969 {
    private final class07541 M;

    public void L() {
        this.M.N(false);
        super.L();
    }

    public class07537(class07541 class075412, double d) {
        super((class07475)((Object)class075412), d, 8, 2);
        this.M = class075412;
    }

    public void u() {
        super.u();
    }

    public boolean y() {
        return super.y();
    }

    public boolean N() {
        return super.N() && !this.M.method_73183().method_8530() && this.M.method_5799() && this.M.method_23318() >= (double)(this.M.method_73183().method_8615() - 3);
    }

    protected boolean N(class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10084();
        if (!class054872.R(class072093) || !class054872.R(class072093.method_10084())) {
            return false;
        }
        return class054872.method_8320(class072092).y((class07290)class054872, class072092, (class07049)this.M);
    }
}

