/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00737;
import minecraft.class06163;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07473;

class class06182
extends class07473 {
    final class06163 N;
    final double y;
    final double L;
    final /* synthetic */ class06163 u;

    class06182(class06163 class061632, class06163 class061633, double d, double d2) {
        this.u = class061632;
        this.N = class061633;
        this.y = d;
        this.L = d2;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void i() {
        class07209 class072092 = this.N.E();
        if (class072092 != null && class06163.y(this.u).U()) {
            if (this.N(class072092, 10.0)) {
                class06889 class068892 = new class06889((double)class072092.method_10263() - this.N.method_23317(), (double)class072092.method_10264() - this.N.method_23318(), (double)class072092.method_10260() - this.N.method_23321()).u().L(10.0).y(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
                class06163.L(this.u).N(class068892.M, class068892.B, class068892.Z, this.L);
            } else {
                class06163.u(this.u).N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), this.L);
            }
        }
    }

    public void u() {
        this.N.N((class07209)null);
        class06163.N(this.u).W();
    }

    private boolean N(class07209 class072092, double d) {
        return !class072092.method_19769((class00737)this.N.method_73189(), d);
    }

    public boolean N() {
        class07209 class072092 = this.N.E();
        return class072092 != null && this.N(class072092, this.y);
    }
}

