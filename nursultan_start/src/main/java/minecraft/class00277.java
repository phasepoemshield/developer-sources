/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class03283
 *  minecraft.class04654
 *  minecraft.class04897
 *  minecraft.class05043
 *  minecraft.class05306
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 *  minecraft.class06923
 *  minecraft.class06937
 *  minecraft.class07510
 *  minecraft.class08044
 */
package minecraft;

import minecraft.class00265;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class03283;
import minecraft.class04654;
import minecraft.class04897;
import minecraft.class05043;
import minecraft.class05306;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;
import minecraft.class06923;
import minecraft.class06937;
import minecraft.class07510;
import minecraft.class08044;

public abstract class class00277<T extends class06923>
extends class01463<T>
implements class05043 {
    private final class05306<?> N;
    private boolean y;

    protected boolean L() {
        return true;
    }

    public class00277(T t, class05306<?> class053062, class08044 class080442, class00392 class003922) {
        super(t, class080442, class003922);
        this.N = class053062;
    }

    public void i() {
        this.N.Z();
    }

    public void u() {
        super.u();
        this.N.i();
    }

    protected void y() {
    }

    protected boolean N(int n, int n2, int n3, int n4, double d, double d2) {
        return (!this.y || !this.N.u()) && super.N(n, n2, n3, n4, d, d2);
    }

    protected boolean N(double d, double d2, int n, int n2) {
        boolean bl = d < (double)n || d2 < (double)n2 || d >= (double)(n + this.B) || d2 >= (double)(n2 + this.Z);
        return this.N.N(d, d2, this.T, this.b, this.B, this.Z) && bl;
    }

    protected void N(class06937 class069372, int n, int n2, class07510 class075102) {
        super.N(class069372, n, n2, class075102);
        this.N.y(class069372);
    }

    public void N(class00265 class002652) {
        this.N.N(class002652);
    }

    protected abstract class03283 N();

    protected void N(class01054 class010542, int n, int n2) {
        super.N(class010542, n, n2);
        this.N.N(class010542, this.L());
    }

    public void method_25426() {
        super.method_25426();
        this.y = this.field_22789 < 379;
        this.N.N(this.field_22789, this.field_22790, this.field_22787, this.y);
        this.T = this.N.N(this.field_22789, this.B);
        this.R();
    }

    public boolean method_25404(class06601 class066012) {
        if (this.N.method_25404(class066012)) {
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (this.N.u() && this.y) {
            this.method_25420(class010542, n, n2, f);
        } else {
            super.N(class010542, n, n2, f);
        }
        class010542.L();
        this.N.method_25394(class010542, n, n2, f);
        class010542.L();
        this.L(class010542, n, n2);
        this.N(class010542);
        this.a_(class010542, n, n2);
        this.N.N(class010542, n, n2, this.s);
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (this.N.method_25403(class066132, d, d2)) {
            return true;
        }
        return super.method_25403(class066132, d, d2);
    }

    public boolean method_25400(class06626 class066262) {
        if (this.N.method_25400(class066262)) {
            return true;
        }
        return super.method_25400(class066262);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.N.method_25402(class066132, bl)) {
            this.method_25395((class04654)this.N);
            return true;
        }
        if (this.y && this.N.u()) {
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    private void R() {
        class03283 class032832 = this.N();
        this.method_37063((class04654)new class04897(class032832.N(), class032832.y(), 20, 18, class05306.N, class053622 -> {
            this.N.L();
            this.T = this.N.N(this.field_22789, this.B);
            class03283 class032832 = this.N();
            class053622.y(class032832.N(), class032832.y());
            this.y();
        }));
        this.method_25429((class04654)this.N);
    }
}

