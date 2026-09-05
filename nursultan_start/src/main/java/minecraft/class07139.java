/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07047
 *  minecraft.class07430
 *  minecraft.class07458
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07047;
import minecraft.class07143;
import minecraft.class07162;
import minecraft.class07430;
import minecraft.class07458;
import minecraft.class07473;

class class07139
extends class07473 {
    private final class07162 N;
    private float y;
    private int L;

    public class07139(class07162 class071622) {
        this.N = class071622;
        this.N_71(EnumSet.of(class07430.field_18406));
    }

    public void i() {
        class07458 class074582;
        if (--this.L <= 0) {
            this.L = this.N(40 + this.N.method_59922().y(60));
            this.y = this.N.method_59922().y(360);
        }
        if ((class074582 = this.N.F()) instanceof class07143) {
            ((class07143)class074582).N(this.y, false);
        }
    }

    public boolean N() {
        return this.N.T() == null && (this.N.method_24828() || this.N.method_5799() || this.N.method_5771() || this.N.method_6059(class07047.d)) && this.N.F() instanceof class07143;
    }
}

