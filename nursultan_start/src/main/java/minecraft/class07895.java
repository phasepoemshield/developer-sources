/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class07079
 *  minecraft.class07435
 *  minecraft.class07438
 *  minecraft.class07458
 */
package minecraft;

import minecraft.class00737;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class07079;
import minecraft.class07435;
import minecraft.class07438;
import minecraft.class07458;
import minecraft.class07872;

class class07895
extends class07458 {
    private final class07872 N;

    class07895(class07872 class078722) {
        super((class07079)class078722);
        this.N = class078722;
    }

    private void B() {
        if (this.N.method_5799()) {
            this.N.method_18799(this.N.method_18798().y(0.0, 0.005, 0.0));
            if (!this.N.L.method_19769((class00737)this.N.method_73189(), 16.0)) {
                this.N.method_6125(Math.max(this.N.method_6029() / 2.0f, 0.08f));
            }
            if (this.N.method_6109()) {
                this.N.method_6125(Math.max(this.N.method_6029() / 3.0f, 0.06f));
            }
        } else if (this.N.method_24828()) {
            this.N.method_6125(Math.max(this.N.method_6029() / 2.0f, 0.06f));
        }
    }

    public void N() {
        double d;
        double d2;
        this.B();
        if (this.E != class07435.field_6378 || this.N.f().U()) {
            this.N.method_6125(0.0f);
            return;
        }
        double d3 = this.R - this.N.method_23317();
        double d4 = Math.sqrt(d3 * d3 + (d2 = this.M - this.N.method_23318()) * d2 + (d = this.B - this.N.method_23321()) * d);
        if (d4 < (double)1.0E-5f) {
            this.i.method_6125(0.0f);
            return;
        }
        d2 /= d4;
        float f = (float)(class04995.u((double)d, (double)d3) * 57.2957763671875) - 90.0f;
        this.N.method_36456(this.y(this.N.method_36454(), f, 90.0f));
        ((class07438)this.N).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.N.method_36454());
        float f2 = (float)(this.Z * this.N.method_45325(class05298.l));
        this.N.method_6125(class04995.B((float)0.125f, (float)this.N.method_6029(), (float)f2));
        this.N.method_18799(this.N.method_18798().y(0.0, (double)this.N.method_6029() * d2 * 0.1, 0.0));
    }
}

