/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05298
 *  minecraft.class07079
 *  minecraft.class07435
 *  minecraft.class07438
 *  minecraft.class07458
 */
package minecraft;

import minecraft.class05298;
import minecraft.class07079;
import minecraft.class07162;
import minecraft.class07435;
import minecraft.class07438;
import minecraft.class07458;

class class07143
extends class07458 {
    private float N;
    private int W;
    private final class07162 m;
    private boolean P;

    public class07143(class07162 class071622) {
        super((class07079)class071622);
        this.m = class071622;
        this.N = 180.0f * class071622.method_36454() / (float)Math.PI;
    }

    public void N() {
        this.i.method_36456(this.y(this.i.method_36454(), this.N, 90.0f));
        this.i.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(this.i.method_36454());
        this.i.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.i.method_36454());
        if (this.E != class07435.field_6378) {
            this.i.N(0.0f);
            return;
        }
        this.E = class07435.field_6377;
        if (this.i.method_24828()) {
            this.i.method_6125((float)(this.Z * this.i.method_45325(class05298.l)));
            if (this.W-- <= 0) {
                this.W = this.m.Z();
                if (this.P) {
                    this.W /= 3;
                }
                this.m.A().y();
                if (this.m.l()) {
                    this.m.method_5783(this.m.n(), this.m.method_6107(), this.m.d());
                }
            } else {
                ((class07438)this.m).fields_7212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(0.0f);
                ((class07438)this.m).fields_7212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(0.0f);
                this.i.method_6125(0.0f);
            }
        } else {
            this.i.method_6125((float)(this.Z * this.i.method_45325(class05298.l)));
        }
    }

    public void N(double d) {
        this.Z = d;
        this.E = class07435.field_6378;
    }

    public void N(float f, boolean bl) {
        this.N = f;
        this.P = bl;
    }
}

