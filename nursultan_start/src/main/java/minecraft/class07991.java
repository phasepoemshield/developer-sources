/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00143
 *  minecraft.class04525
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07068
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07623
 */
package minecraft;

import minecraft.class00143;
import minecraft.class04525;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07068;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07623;

public class class07991
extends class07623 {
    protected class06889 L() {
        return this.y.method_73189();
    }

    public class07991(class07079 class070792, class07299 class072992) {
        super(class070792, class072992);
    }

    public boolean u() {
        return false;
    }

    protected boolean y() {
        return this.s() && this.y.method_52535() || !this.y.method_5765();
    }

    public boolean N(class07209 class072092) {
        return this.L.method_8320(class072092).y((class07290)this.L, class072092, (class07049)this.y);
    }

    public void N() {
        class06889 class068892;
        ++this.R;
        if (this.m) {
            this.B();
        }
        if (this.U()) {
            return;
        }
        if (this.y()) {
            this.z();
        } else if (this.u != null && !this.u.L()) {
            class068892 = this.u.N((class07049)this.y);
            if (this.y.method_31477() == class04995.N((double)class068892.M) && this.y.method_31478() == class04995.N((double)class068892.B) && this.y.method_31479() == class04995.N((double)class068892.Z)) {
                this.u.N();
            }
        }
        if (this.U()) {
            return;
        }
        class068892 = this.u.N((class07049)this.y);
        this.y.F().N(class068892.M, class068892.B, class068892.Z, this.i);
    }

    protected boolean N(class06889 class068892, class06889 class068893) {
        return class07991.N((class07079)this.y, (class06889)class068892, (class06889)class068893, (boolean)true);
    }

    public class00143 N(class07049 class070492, int n) {
        return this.N(class070492.method_24515(), n);
    }

    protected class07068 N(int n) {
        this.s = new class04525();
        return new class07068(this.s, n);
    }
}

