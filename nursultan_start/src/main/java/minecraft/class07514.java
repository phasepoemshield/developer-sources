/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00869
 *  minecraft.class04782
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class07042
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07234
 *  minecraft.class07252
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class08044
 *  minecraft.class08080
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00869;
import minecraft.class04782;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class07042;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07234;
import minecraft.class07252;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07477;
import minecraft.class07478;
import minecraft.class07482;
import minecraft.class08044;
import minecraft.class08080;
import minecraft.class08299;
import minecraft.class08329;

public class class07514
extends class07477
implements class07252 {
    private static final boolean y = true;
    private boolean u = true;
    private boolean B = false;

    public void L(boolean bl) {
        this.u = bl;
    }

    public double T() {
        return this.method_23317();
    }

    @Override
    public class06584 method_31480() {
        return new class06584((class07310)class06570.sW);
    }

    @Override
    public void method_5773() {
        this.B = false;
        super.method_5773();
        this.d();
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Enabled", this.u);
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.u = class082992.N("Enabled", true);
    }

    public class07514(class07078<? extends class07514> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    @Override
    public int B() {
        return 1;
    }

    public double b() {
        return this.method_23318() + 0.5;
    }

    public boolean s() {
        return this.u;
    }

    public boolean n() {
        if (class07234.N((class07299)this.method_73183(), (class07252)this)) {
            return true;
        }
        for (class00717 class007172 : this.method_73183().N(class00717.class, this.method_5829().L(0.25, 0.0, 0.25), class07042.N)) {
            if (!class07234.N((class06695)this, (class00717)class007172)) continue;
            return true;
        }
        return false;
    }

    private void d() {
        if (!this.method_73183().method_8608() && this.method_5805() && this.s() && !this.B && this.n()) {
            this.B = true;
            this.method_5431();
        }
    }

    public boolean v() {
        return false;
    }

    public double j() {
        return this.method_23321();
    }

    protected class06581 z() {
        return class06570.sW;
    }

    @Override
    public void N(class04782 class047822, int n, int n2, int n3, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = !bl;
        if (bl2 != this.s()) {
            this.L(bl2);
        }
    }

    @Override
    public class07482 N(int n, class08044 class080442) {
        return new class07478(n, class080442, (class06695)this);
    }

    @Override
    protected double N(class07209 class072092, class08080 class080802, double d) {
        double d2 = super.N(class072092, class080802, d);
        this.d();
        return d2;
    }

    @Override
    public class00500 R() {
        return class00869.Bf.W();
    }

    public int method_5439() {
        return 5;
    }
}

