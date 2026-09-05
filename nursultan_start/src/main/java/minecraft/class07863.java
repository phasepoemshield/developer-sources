/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07079
 *  minecraft.class07435
 *  minecraft.class07458
 */
package minecraft;

import minecraft.class07079;
import minecraft.class07435;
import minecraft.class07458;
import minecraft.class07873;
import minecraft.class07879;

class class07863
extends class07458 {
    private final class07879 N;
    private double W;

    public class07863(class07879 class078792) {
        super((class07079)class078792);
        this.N = class078792;
    }

    public void N() {
        if (this.N.method_24828() && !class07879.N(this.N) && !((class07873)class07879.y(this.N)).L()) {
            this.N.L(0.0);
        } else if (this.y() || this.E == class07435.field_6379) {
            this.N.L(this.W);
        }
        super.N();
    }

    public void N(double d, double d2, double d3, double d4) {
        if (this.N.method_5799()) {
            d4 = 1.5;
        }
        super.N(d, d2, d3, d4);
        if (d4 > 0.0) {
            this.W = d4;
        }
    }
}

