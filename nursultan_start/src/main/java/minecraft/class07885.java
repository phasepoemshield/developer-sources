/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01235
 *  minecraft.class04770
 *  minecraft.class06069
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07057
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07434
 *  minecraft.class07633
 */
package minecraft;

import minecraft.class01235;
import minecraft.class04770;
import minecraft.class06069;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07057;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07434;
import minecraft.class07633;
import minecraft.class07872;

class class07885
extends class07434 {
    private final class07872 u;

    class07885(class07872 class078722, double d) {
        super((class07633)class078722, d);
        this.u = class078722;
    }

    public boolean N() {
        return super.N() && !this.u.B();
    }

    protected void R() {
        class04770 class047702 = this.N.Nc();
        if (class047702 == null && this.L.Nc() != null) {
            class047702 = this.L.Nc();
        }
        if (class047702 != null) {
            class047702.method_7281(class01235.F);
            class06912.s.N(class047702, this.N, this.L, null);
        }
        this.u.N(true);
        this.N.u(6000);
        this.L.u(6000);
        this.N.Na();
        this.L.Na();
        class06069 class060692 = this.N.method_59922();
        if (((Boolean)class07885.N_18((class07299)this.y).method_64395().N(class07305.O)).booleanValue()) {
            this.y.method_8649((class07049)new class07057((class07299)this.y, this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), class060692.y(7) + 1));
        }
    }
}

