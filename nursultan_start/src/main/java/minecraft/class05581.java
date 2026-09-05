/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class07079
 *  minecraft.class07435
 *  minecraft.class07458
 */
package minecraft;

import minecraft.class04995;
import minecraft.class05298;
import minecraft.class07079;
import minecraft.class07435;
import minecraft.class07458;

public class class05581
extends class07458 {
    private static final float N = 10.0f;
    private static final float W = 60.0f;
    private final int m;
    private final int P;
    private final float s;
    private final float T;
    private final boolean b;

    public class05581(class07079 class070792, int n, int n2, float f, float f2, boolean bl) {
        super(class070792);
        this.m = n;
        this.P = n2;
        this.s = f;
        this.T = f2;
        this.b = bl;
    }

    public void N() {
        double d;
        double d2;
        if (this.b && this.i.method_5799()) {
            this.i.method_18799(this.i.method_18798().y(0.0, 0.005, 0.0));
        }
        if (this.E != class07435.field_6378 || this.i.f().U()) {
            this.i.method_6125(0.0f);
            this.i.L(0.0f);
            this.i.y(0.0f);
            this.i.N(0.0f);
            return;
        }
        double d3 = this.R - this.i.method_23317();
        if (d3 * d3 + (d2 = this.M - this.i.method_23318()) * d2 + (d = this.B - this.i.method_23321()) * d < 2.500000277905201E-7) {
            this.i.N(0.0f);
            return;
        }
        float f = (float)(class04995.u((double)d, (double)d3) * 57.2957763671875) - 90.0f;
        this.i.method_36456(this.y(this.i.method_36454(), f, this.P));
        this.i.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.i.method_36454());
        this.i.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(this.i.method_36454());
        float f2 = (float)(this.Z * this.i.method_45325(class05298.l));
        if (this.i.method_5799()) {
            float f3;
            this.i.method_6125(f2 * this.s);
            double d4 = Math.sqrt(d3 * d3 + d * d);
            if (Math.abs(d2) > (double)1.0E-5f || Math.abs(d4) > (double)1.0E-5f) {
                f3 = -((float)(class04995.u((double)d2, (double)d4) * 57.2957763671875));
                f3 = class04995.N((float)class04995.R((float)f3), (float)(-this.m), (float)this.m);
                this.i.method_36457(this.N(this.i.method_36455(), f3, 5.0f));
            }
            f3 = class04995.P((double)(this.i.method_36455() * ((float)Math.PI / 180)));
            float f4 = class04995.m((double)(this.i.method_36455() * ((float)Math.PI / 180)));
            this.i.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f3 * f2);
            this.i.fields_7212a028292fd3c078969e3ee4c71d9e8_1 = Float.valueOf(-f4 * f2);
        } else {
            float f5 = Math.abs(class04995.R((float)(this.i.method_36454() - f)));
            float f6 = class05581.N(f5);
            this.i.method_6125(f2 * this.T * f6);
        }
    }

    private static float N(float f) {
        return 1.0f - class04995.N((float)((f - 10.0f) / 50.0f), (float)0.0f, (float)1.0f);
    }
}

