/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07079
 *  minecraft.class07155
 *  minecraft.class07458
 */
package Nursultan;

import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07079;
import minecraft.class07155;
import minecraft.class07458;

public class class10722
extends class07458 {
    private float W;
    final /* synthetic */ class07155 N;

    public class10722(class07155 class071552, class07079 class070792) {
        this.N = class071552;
        super(class070792);
        this.W = 0.1f;
    }

    public void N() {
        if (this.N.field_5976) {
            this.N.method_36456(this.N.method_36454() + 180.0f);
            this.W = 0.1f;
        }
        double d = this.N.L.M - this.N.method_23317();
        double d2 = this.N.L.B - this.N.method_23318();
        double d3 = this.N.L.Z - this.N.method_23321();
        double d4 = Math.sqrt(d * d + d3 * d3);
        if (Math.abs(d4) > (double)1.0E-5f) {
            double d5 = 1.0 - Math.abs(d2 * (double)0.7f) / d4;
            d4 = Math.sqrt((d *= d5) * d + (d3 *= d5) * d3);
            double d6 = Math.sqrt(d * d + d3 * d3 + d2 * d2);
            float f = this.N.method_36454();
            float f2 = (float)class04995.u((double)d3, (double)d);
            float f3 = class04995.R((float)(this.N.method_36454() + 90.0f));
            float f4 = class04995.R((float)(f2 * 57.295776f));
            this.N.method_36456(class04995.i((float)f3, (float)f4, (float)4.0f) - 90.0f);
            this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.N.method_36454());
            this.W = class04995.i((float)f, (float)this.N.method_36454()) < 3.0f ? class04995.u((float)this.W, (float)1.8f, (float)(0.005f * (1.8f / this.W))) : class04995.u((float)this.W, (float)0.2f, (float)0.025f);
            float f5 = (float)(-(class04995.u((double)(-d2), (double)d4) * 57.2957763671875));
            this.N.method_36457(f5);
            float f6 = this.N.method_36454() + 90.0f;
            double d7 = (double)(this.W * class04995.P((double)(f6 * ((float)Math.PI / 180)))) * Math.abs(d / d6);
            double d8 = (double)(this.W * class04995.m((double)(f6 * ((float)Math.PI / 180)))) * Math.abs(d3 / d6);
            double d9 = (double)(this.W * class04995.m((double)(f5 * ((float)Math.PI / 180)))) * Math.abs(d2 / d6);
            class06889 class068892 = this.N.method_18798();
            this.N.method_18799(class068892.i(new class06889(d7, d9, d8).u(class068892).L(0.2)));
        }
    }
}

