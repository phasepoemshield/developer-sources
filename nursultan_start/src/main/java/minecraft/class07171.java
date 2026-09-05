/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class04909
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07830
 */
package minecraft;

import minecraft.class01328;
import minecraft.class04909;
import minecraft.class07142;
import minecraft.class07155;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07830;

class class07171
extends class07473 {
    private int y;
    final /* synthetic */ class07155 N;

    public void L() {
        this.y = this.N(10);
        this.N.i = class07142.field_7318;
        this.M();
    }

    private void M() {
        if (this.N.u == null) {
            return;
        }
        this.N.u = this.N.T().method_24515().method_10086(20 + class07155.E(this.N).y(20));
        if (this.N.u.method_10264() < this.N.method_73183().method_8615()) {
            this.N.u = new class07209(this.N.u.method_10263(), this.N.method_73183().method_8615() + 1, this.N.u.method_10260());
        }
    }

    class07171(class07155 class071552) {
        this.N = class071552;
    }

    public void i() {
        if (this.N.i == class07142.field_7318) {
            --this.y;
            if (this.y <= 0) {
                this.N.i = class07142.field_7317;
                this.M();
                this.y = this.N((8 + class07155.z(this.N).y(4)) * 20);
                this.N.method_5783(class04909.GE, 10.0f, 0.95f + class07155.U(this.N).z() * 0.1f);
            }
        }
    }

    public void u() {
        if (this.N.u != null) {
            this.N.u = this.N.method_73183().N(class07830.field_13197, this.N.u).method_10086(10 + class07155.Z(this.N).y(20));
        }
    }

    public boolean N() {
        class07438 class074382 = this.N.T();
        if (class074382 != null) {
            return this.N.N(class07171.N_18((class07299)this.N.method_73183()), class074382, class01328.N);
        }
        return false;
    }
}

