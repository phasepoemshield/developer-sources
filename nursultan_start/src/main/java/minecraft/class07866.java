/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class04995
 *  minecraft.class05475
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07473
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class00753;
import minecraft.class04995;
import minecraft.class05475;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07872;

class class07866
extends class07473 {
    private final class07872 N;
    private final double y;
    private boolean L;

    public void L() {
        int n = 512;
        int n2 = 4;
        class06069 class060692 = class07872.N(this.N);
        int n3 = class060692.y(1025) - 512;
        int n4 = class060692.y(9) - 4;
        int n5 = class060692.y(1025) - 512;
        if ((double)n4 + this.N.method_23318() > (double)(this.N.method_73183().method_8615() - 1)) {
            n4 = 0;
        }
        this.N.u = class07209.method_49637((double)((double)n3 + this.N.method_23317()), (double)((double)n4 + this.N.method_23318()), (double)((double)n5 + this.N.method_23321()));
        this.L = false;
    }

    class07866(class07872 class078722, double d) {
        this.N = class078722;
        this.y = d;
    }

    public void i() {
        if (this.N.u == null) {
            this.L = true;
            return;
        }
        if (this.N.f().U()) {
            class06889 class068892 = class06889.L((class00753)this.N.u);
            class06889 class068893 = class05475.N((class07475)this.N, (int)16, (int)3, (class06889)class068892, (double)0.3141592741012573);
            if (class068893 == null) {
                class068893 = class05475.N((class07475)this.N, (int)8, (int)7, (class06889)class068892, (double)1.5707963705062866);
            }
            if (class068893 != null) {
                int n = class04995.N((double)class068893.M);
                int n2 = class04995.N((double)class068893.Z);
                int n3 = 34;
                if (!this.N.method_73183().N(n - 34, n2 - 34, n + 34, n2 + 34)) {
                    class068893 = null;
                }
            }
            if (class068893 == null) {
                this.L = true;
                return;
            }
            this.N.f().N(class068893.M, class068893.B, class068893.Z, this.y);
        }
    }

    public void u() {
        this.N.u = null;
        super.u();
    }

    public boolean y() {
        return !this.N.f().U() && !this.L && !this.N.i && !this.N.NX() && !this.N.B();
    }

    public boolean N() {
        return !this.N.i && !this.N.B() && this.N.method_5799();
    }
}

