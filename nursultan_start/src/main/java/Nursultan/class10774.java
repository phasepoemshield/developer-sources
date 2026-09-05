/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class07079
 *  minecraft.class07435
 *  minecraft.class07458
 *  minecraft.class07629
 */
package Nursultan;

import minecraft.class01231;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class07079;
import minecraft.class07435;
import minecraft.class07458;
import minecraft.class07629;

public class class10774
extends class07458 {
    private final class07629 N;

    public class10774(class07629 class076292) {
        super((class07079)class076292);
        this.N = class076292;
    }

    public void N() {
        if (this.N.method_5777(class01231.N)) {
            this.N.method_18799(this.N.method_18798().y(0.0, 0.005, 0.0));
        }
        if (this.E != class07435.field_6378 || this.N.f().U()) {
            this.N.method_6125(0.0f);
            return;
        }
        float f = (float)(this.Z * this.N.method_45325(class05298.l));
        this.N.method_6125(class04995.B((float)0.125f, (float)this.N.method_6029(), (float)f));
        double d = this.R - this.N.method_23317();
        double d2 = this.M - this.N.method_23318();
        double d3 = this.B - this.N.method_23321();
        if (d2 != 0.0) {
            double d4 = Math.sqrt(d * d + d2 * d2 + d3 * d3);
            this.N.method_18799(this.N.method_18798().y(0.0, (double)this.N.method_6029() * (d2 / d4) * 0.1, 0.0));
        }
        if (d != 0.0 || d3 != 0.0) {
            float f2 = (float)(class04995.u((double)d3, (double)d) * 57.2957763671875) - 90.0f;
            this.N.method_36456(this.y(this.N.method_36454(), f2, 90.0f));
            this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.N.method_36454());
        }
    }
}

