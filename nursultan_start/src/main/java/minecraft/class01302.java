/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06135
 *  minecraft.class06165
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class06135;
import minecraft.class06165;
import minecraft.class07475;

class class01302
extends class06135 {
    final /* synthetic */ class06165 N;

    public void L() {
        this.N.Y();
        super.L();
    }

    private boolean M() {
        return !this.N.method_6113() && !this.N.v() && !this.N.t() && this.N.T() == null;
    }

    public class01302(class06165 class061652, int n, int n2) {
        this.N = class061652;
        super((class07475)class061652, n2);
    }

    public boolean y() {
        return super.y() && this.M();
    }

    public boolean N() {
        return super.N() && this.M();
    }
}

