/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00461
 *  minecraft.class06889
 *  minecraft.class07068
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import minecraft.class00461;
import minecraft.class06889;
import minecraft.class07068;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07623;

public class class07639
extends class07623 {
    private boolean N;

    @Override
    protected class06889 L() {
        return new class06889(this.y.method_23317(), this.y.method_23323(0.5), this.y.method_23321());
    }

    public class07639(class07079 class070792, class07299 class072992) {
        super(class070792, class072992);
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    protected boolean y() {
        return this.N || this.y.method_52535();
    }

    @Override
    public boolean N(class07209 class072092) {
        return !this.L.method_8320(class072092).t();
    }

    @Override
    public void N(boolean bl) {
    }

    @Override
    protected double N(class06889 class068892) {
        return class068892.B;
    }

    @Override
    protected boolean N(class06889 class068892, class06889 class068893) {
        return class07639.N(this.y, class068892, class068893, false);
    }

    @Override
    protected class07068 N(int n) {
        this.N = this.y.method_5864() == class07078.e;
        this.s = new class00461(this.N);
        this.s.N(false);
        return new class07068(this.s, n);
    }
}

