/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06137
 *  minecraft.class06165
 *  minecraft.class07430
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class06137;
import minecraft.class06165;
import minecraft.class07430;

class class01330
extends class06137 {
    private double L;
    private double u;
    private int i;
    private int R;
    final /* synthetic */ class06165 y;

    public void L() {
        this.U();
        this.R = 2 + this.y.method_59922().y(3);
        this.y.N(true);
        this.y.f().W();
    }

    public class01330(class06165 class061652) {
        this.y = class061652;
        super(class061652);
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public void i() {
        --this.i;
        if (this.i <= 0) {
            --this.R;
            this.U();
        }
        this.y.p().N(this.y.method_23317() + this.L, this.y.method_23320(), this.y.method_23321() + this.u, (float)this.y.NR(), (float)this.y.Ni());
    }

    private void U() {
        double d = Math.PI * 2 * this.y.method_59922().U();
        this.L = Math.cos(d);
        this.u = Math.sin(d);
        this.i = this.N(80 + this.y.method_59922().y(20));
    }

    public void u() {
        this.y.N(false);
    }

    public boolean y() {
        return this.R > 0;
    }

    public boolean N() {
        return this.y.method_6065() == null && this.y.method_59922().z() < 0.02f && !this.y.method_6113() && this.y.T() == null && this.y.f().U() && !this.Z() && !this.y.G() && !this.y.method_18276();
    }
}

