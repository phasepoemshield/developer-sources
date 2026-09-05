/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class06889
 *  minecraft.class07079
 *  minecraft.class07435
 *  minecraft.class07442
 *  minecraft.class07458
 *  minecraft.class07549
 */
package Nursultan;

import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06889;
import minecraft.class07079;
import minecraft.class07435;
import minecraft.class07442;
import minecraft.class07458;
import minecraft.class07549;

public class class10725
extends class07458 {
    private final class07549 N;

    public class10725(class07549 class075492) {
        super((class07079)class075492);
        this.N = class075492;
    }

    public void N() {
        if (this.E != class07435.field_6378 || this.N.f().U()) {
            this.N.method_6125(0.0f);
            this.N.N(false);
            return;
        }
        class06889 class068892 = new class06889(this.R - this.N.method_23317(), this.M - this.N.method_23318(), this.B - this.N.method_23321());
        double d = class068892.M();
        double d2 = class068892.M / d;
        double d3 = class068892.B / d;
        double d4 = class068892.Z / d;
        float f = (float)(class04995.u((double)class068892.Z, (double)class068892.M) * 57.2957763671875) - 90.0f;
        this.N.method_36456(this.y(this.N.method_36454(), f, 90.0f));
        this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.N.method_36454());
        float f2 = (float)(this.Z * this.N.method_45325(class05298.l));
        float f3 = class04995.B((float)0.125f, (float)this.N.method_6029(), (float)f2);
        this.N.method_6125(f3);
        double d5 = Math.sin((double)(this.N.field_6012 + this.N.method_5628()) * 0.5) * 0.05;
        double d6 = Math.cos(this.N.method_36454() * ((float)Math.PI / 180));
        double d7 = Math.sin(this.N.method_36454() * ((float)Math.PI / 180));
        double d8 = Math.sin((double)(this.N.field_6012 + this.N.method_5628()) * 0.75) * 0.05;
        this.N.method_18799(this.N.method_18798().y(d5 * d6, d8 * (d7 + d6) * 0.25 + (double)f3 * d3 * 0.1, d5 * d7));
        class07442 class074422 = this.N.p();
        double d9 = this.N.method_23317() + d2 * 2.0;
        double d10 = this.N.method_23320() + d3 / d;
        double d11 = this.N.method_23321() + d4 * 2.0;
        double d12 = class074422.i();
        double d13 = class074422.R();
        double d14 = class074422.M();
        if (!class074422.u()) {
            d12 = d9;
            d13 = d10;
            d14 = d11;
        }
        this.N.p().N(class04995.u((double)0.125, (double)d12, (double)d9), class04995.u((double)0.125, (double)d13, (double)d10), class04995.u((double)0.125, (double)d14, (double)d11), 10.0f, 40.0f);
        this.N.N(true);
    }
}

