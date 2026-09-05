/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00169
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00884
 *  minecraft.class04453
 *  minecraft.class04909
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00169;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00884;
import minecraft.class04453;
import minecraft.class04909;
import minecraft.class08092;

public class class05684
implements class00169 {
    private final class04453 N;
    private boolean y;
    private boolean L = true;

    public class05684(class04453 class044532) {
        this.N = class044532;
    }

    public void N() {
        class00500 class005003 = this.N.method_73183().L(this.N.method_5829().L(0.0, (double)-0.4f, 0.0).B(1.0E-6)).filter(class005002 -> class005002.N(class00869.PN)).findFirst().orElse(null);
        if (class005003 != null) {
            if (!this.y && !this.L && class005003.N(class00869.PN) && !this.N.method_7325()) {
                if (((Boolean)class005003.L((class08092)class00884.y)).booleanValue()) {
                    this.N.method_5783(class04909.um, 1.0f, 1.0f);
                } else {
                    this.N.method_5783(class04909.uE, 1.0f, 1.0f);
                }
            }
            this.y = true;
        } else {
            this.y = false;
        }
        this.L = false;
    }
}

