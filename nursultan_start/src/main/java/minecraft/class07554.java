/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05475
 *  minecraft.class06889
 */
package minecraft;

import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07541;

class class07554
extends class07473 {
    private final class07541 N;
    private final double y;
    private final int L;
    private boolean u;

    @Override
    public void L() {
        this.N.N(true);
        this.u = false;
    }

    public class07554(class07541 class075412, double d, int n) {
        this.N = class075412;
        this.y = d;
        this.L = n;
    }

    @Override
    public void i() {
        if (this.N.method_23318() < (double)(this.L - 1) && (this.N.f().U() || this.N.n())) {
            class06889 class068892 = class05475.N((class07475)((Object)this.N), (int)4, (int)8, (class06889)new class06889(this.N.method_23317(), (double)(this.L - 1), this.N.method_23321()), (double)1.5707963705062866);
            if (class068892 == null) {
                this.u = true;
                return;
            }
            this.N.f().N(class068892.M, class068892.B, class068892.Z, this.y);
        }
    }

    @Override
    public void u() {
        this.N.N(false);
    }

    @Override
    public boolean y() {
        return this.N() && !this.u;
    }

    @Override
    public boolean N() {
        return !this.N.method_73183().method_8530() && this.N.method_5799() && this.N.method_23318() < (double)(this.L - 2);
    }
}

