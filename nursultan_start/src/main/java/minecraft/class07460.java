/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class07079
 */
package minecraft;

import minecraft.class04995;
import minecraft.class05298;
import minecraft.class07079;
import minecraft.class07435;
import minecraft.class07458;

public class class07460
extends class07458 {
    private final int N;
    private final boolean W;

    public class07460(class07079 class070792, int n, boolean bl) {
        super(class070792);
        this.N = n;
        this.W = bl;
    }

    @Override
    public void N() {
        if (this.E == class07435.field_6378) {
            this.E = class07435.field_6377;
            this.i.method_5875(true);
            double d = this.R - this.i.method_23317();
            double d2 = this.M - this.i.method_23318();
            double d3 = this.B - this.i.method_23321();
            if (d * d + d2 * d2 + d3 * d3 < 2.500000277905201E-7) {
                this.i.y(0.0f);
                this.i.N(0.0f);
                return;
            }
            float f = (float)(class04995.u((double)d3, (double)d) * 57.2957763671875) - 90.0f;
            this.i.method_36456(this.y(this.i.method_36454(), f, 90.0f));
            float f2 = this.i.method_24828() ? (float)(this.Z * this.i.method_45325(class05298.l)) : (float)(this.Z * this.i.method_45325(class05298.m));
            this.i.method_6125(f2);
            double d4 = Math.sqrt(d * d + d3 * d3);
            if (Math.abs(d2) > (double)1.0E-5f || Math.abs(d4) > (double)1.0E-5f) {
                float f3 = (float)(-(class04995.u((double)d2, (double)d4) * 57.2957763671875));
                this.i.method_36457(this.y(this.i.method_36455(), f3, this.N));
                this.i.y(d2 > 0.0 ? f2 : -f2);
            }
        } else {
            if (!this.W) {
                this.i.method_5875(false);
            }
            this.i.y(0.0f);
            this.i.N(0.0f);
        }
    }
}

