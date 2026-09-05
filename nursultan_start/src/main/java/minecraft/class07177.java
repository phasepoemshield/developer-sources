/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class04995
 *  minecraft.class06889
 */
package minecraft;

import minecraft.class00753;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07142;
import minecraft.class07155;
import minecraft.class07168;

class class07177
extends class07168 {
    private float L;
    private float u;
    private float i;
    private float R;
    final /* synthetic */ class07155 N;

    public void L() {
        this.u = 5.0f + class07155.N(this.N).z() * 10.0f;
        this.i = -4.0f + class07155.y(this.N).z() * 9.0f;
        this.R = class07155.L(this.N).Z() ? 1.0f : -1.0f;
        this.Z();
    }

    class07177(class07155 class071552) {
        this.N = class071552;
        super(class071552);
    }

    private void Z() {
        if (this.N.u == null) {
            this.N.u = this.N.method_24515();
        }
        this.L += this.R * 15.0f * ((float)Math.PI / 180);
        this.N.L = class06889.N((class00753)this.N.u).y((double)(this.u * class04995.P((double)this.L)), (double)(-4.0f + this.i), (double)(this.u * class04995.m((double)this.L)));
    }

    public void i() {
        if (class07155.u(this.N).y(this.N(350)) == 0) {
            this.i = -4.0f + class07155.i(this.N).z() * 9.0f;
        }
        if (class07155.R(this.N).y(this.N(250)) == 0) {
            this.u += 1.0f;
            if (this.u > 15.0f) {
                this.u = 5.0f;
                this.R = -this.R;
            }
        }
        if (class07155.M(this.N).y(this.N(450)) == 0) {
            this.L = class07155.B(this.N).z() * 2.0f * (float)Math.PI;
            this.Z();
        }
        if (this.M()) {
            this.Z();
        }
        if (this.N.L.B < this.N.method_23318() && !this.N.method_73183().R(this.N.method_24515().method_10087(1))) {
            this.i = Math.max(1.0f, this.i);
            this.Z();
        }
        if (this.N.L.B > this.N.method_23318() && !this.N.method_73183().R(this.N.method_24515().method_10086(1))) {
            this.i = Math.min(-1.0f, this.i);
            this.Z();
        }
    }

    public boolean N() {
        return this.N.T() == null || this.N.i == class07142.field_7318;
    }
}

