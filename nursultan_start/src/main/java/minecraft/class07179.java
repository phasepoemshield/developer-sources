/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07086
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class04891;
import minecraft.class04909;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07086;
import minecraft.class07145;
import minecraft.class07149;
import minecraft.class07156;
import minecraft.class07438;

class class07179
extends class07145 {
    private int i;
    final /* synthetic */ class07149 N;

    @Override
    public void L() {
        super.L();
        class07438 class074382 = this.N.T();
        if (class074382 != null) {
            this.i = class074382.method_5628();
        }
    }

    @Override
    protected int M() {
        return 20;
    }

    class07179(class07149 class071492) {
        this.N = class071492;
        super(class071492);
    }

    @Override
    protected int Z() {
        return 180;
    }

    @Override
    protected void U() {
        this.N.T().method_37222(new class07055(class07047.P, 400), (class07049)this.N);
    }

    @Override
    protected class04891 E() {
        return class04909.sZ;
    }

    @Override
    public boolean N() {
        if (!super.N()) {
            return false;
        }
        if (this.N.T() == null) {
            return false;
        }
        if (this.N.T().method_5628() == this.i) {
            return false;
        }
        return class07179.N((class07049)this.N).method_8404(this.N.method_24515()).N((float)class07086.field_5802.ordinal());
    }

    @Override
    protected class07156 W() {
        return class07156.field_7378;
    }
}

