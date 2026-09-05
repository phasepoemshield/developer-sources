/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class06165
 *  minecraft.class07209
 *  minecraft.class07452
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class04782;
import minecraft.class06165;
import minecraft.class07209;
import minecraft.class07452;
import minecraft.class07475;

class class01305
extends class07452 {
    private int L;
    final /* synthetic */ class06165 y;

    public void L() {
        this.y.Y();
        super.L();
    }

    public class01305(class06165 class061652, double d) {
        this.y = class061652;
        super((class07475)class061652, d);
        this.L = class01305.y((int)100);
    }

    public boolean N() {
        if (this.y.method_6113() || this.N.T() != null) {
            return false;
        }
        if (this.y.method_73183().method_8546() && this.y.method_73183().N_17(this.N.method_24515())) {
            return this.M();
        }
        if (this.L > 0) {
            --this.L;
            return false;
        }
        this.L = 100;
        class07209 class072092 = this.N.method_24515();
        return this.y.method_73183().method_8530() && this.y.method_73183().N_17(class072092) && !((class04782)this.y.method_73183()).method_19500(class072092) && this.M();
    }
}

