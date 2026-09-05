/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07473
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07872;

class class07867
extends class07473 {
    private final class07872 N;
    private final double y;
    private boolean L;
    private int u;
    private static final int i = 600;

    public void L() {
        this.N.i = true;
        this.L = false;
        this.u = 0;
    }

    class07867(class07872 class078722, double d) {
        this.N = class078722;
        this.y = d;
    }

    public void i() {
        class07209 class072092 = this.N.L;
        boolean bl = class072092.method_19769((class00737)this.N.method_73189(), 16.0);
        if (bl) {
            ++this.u;
        }
        if (this.N.f().U()) {
            class06889 class068892 = class06889.L((class00753)class072092);
            class06889 class068893 = class05475.N((class07475)this.N, (int)16, (int)3, (class06889)class068892, (double)0.3141592741012573);
            if (class068893 == null) {
                class068893 = class05475.N((class07475)this.N, (int)8, (int)7, (class06889)class068892, (double)1.5707963705062866);
            }
            if (class068893 != null && !bl && !this.N.method_73183().method_8320(class07209.method_49638((class00737)class068893)).N(class00869.K)) {
                class068893 = class05475.N((class07475)this.N, (int)16, (int)5, (class06889)class068892, (double)1.5707963705062866);
            }
            if (class068893 == null) {
                this.L = true;
                return;
            }
            this.N.f().N(class068893.M, class068893.B, class068893.Z, this.y);
        }
    }

    public void u() {
        this.N.i = false;
    }

    public boolean y() {
        return !this.N.L.method_19769((class00737)this.N.method_73189(), 7.0) && !this.L && this.u <= this.N(600);
    }

    public boolean N() {
        if (this.N.method_6109()) {
            return false;
        }
        if (this.N.B()) {
            return true;
        }
        if (this.N.method_59922().y(class07867.y((int)700)) != 0) {
            return false;
        }
        return !this.N.L.method_19769((class00737)this.N.method_73189(), 64.0);
    }
}

