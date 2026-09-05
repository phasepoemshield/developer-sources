/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class07079
 *  minecraft.class07435
 *  minecraft.class07438
 *  minecraft.class07458
 *  minecraft.class07541
 */
package Nursultan;

import minecraft.class04995;
import minecraft.class05298;
import minecraft.class07079;
import minecraft.class07435;
import minecraft.class07438;
import minecraft.class07458;
import minecraft.class07541;

public class class10764
extends class07458 {
    private final class07541 N;

    public class10764(class07541 class075412) {
        super((class07079)class075412);
        this.N = class075412;
    }

    public void N() {
        class07438 class074382 = this.N.T();
        if (this.N.v() && this.N.method_5799()) {
            if (class074382 != null && class074382.method_23318() > this.N.method_23318() || this.N.y) {
                this.N.method_18799(this.N.method_18798().y(0.0, 0.002, 0.0));
            }
            if (this.E != class07435.field_6378 || this.N.f().U()) {
                this.N.method_6125(0.0f);
                return;
            }
            double d = this.R - this.N.method_23317();
            double d2 = this.M - this.N.method_23318();
            double d3 = this.B - this.N.method_23321();
            double d4 = Math.sqrt(d * d + d2 * d2 + d3 * d3);
            d2 /= d4;
            float f = (float)(class04995.u((double)d3, (double)d) * 57.2957763671875) - 90.0f;
            this.N.method_36456(this.y(this.N.method_36454(), f, 90.0f));
            this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.N.method_36454());
            float f2 = (float)(this.Z * this.N.method_45325(class05298.l));
            float f3 = class04995.B((float)0.125f, (float)this.N.method_6029(), (float)f2);
            this.N.method_6125(f3);
            this.N.method_18799(this.N.method_18798().y((double)f3 * d * 0.005, (double)f3 * d2 * 0.1, (double)f3 * d3 * 0.005));
        } else {
            if (!this.N.method_24828()) {
                this.N.method_18799(this.N.method_18798().y(0.0, -0.008, 0.0));
            }
            super.N();
        }
    }
}

