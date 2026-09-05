/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00155
 *  minecraft.class04453
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class00044;
import minecraft.class00155;
import minecraft.class04453;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;

public class class00141
extends class00155 {
    public static final int m = 20;
    private final class04453 P;
    private int s;

    public void P() {
        ++this.s;
        if (this.P.method_31481() || this.s > 20 && !this.P.method_6128()) {
            this.y();
            return;
        }
        this.R = (float)this.P.method_23317();
        this.M = (float)this.P.method_23318();
        this.B = (float)this.P.method_23321();
        float f = (float)this.P.method_18798().B();
        this.u = (double)f >= 1.0E-7 ? class04995.N((float)(f / 4.0f), (float)0.0f, (float)1.0f) : 0.0f;
        if (this.s < 20) {
            this.u = 0.0f;
        } else if (this.s < 40) {
            this.u *= (float)(this.s - 20) / 20.0f;
        }
        float f2 = 0.8f;
        this.i = this.u > 0.8f ? 1.0f + (this.u - 0.8f) : 1.0f;
    }

    public class00141(class04453 class044532) {
        super(class04909.zg, class04911.field_15248, class00044.v());
        this.P = class044532;
        this.Z = true;
        this.z = 0;
        this.u = 0.1f;
    }
}

