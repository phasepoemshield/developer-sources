/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01210
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class07430
 *  minecraft.class07475
 *  minecraft.class07617
 *  minecraft.class07969
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class01210;
import minecraft.class05487;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07475;
import minecraft.class07617;
import minecraft.class07969;

public class class06097
extends class07969 {
    private final class07617 M;

    public void L() {
        super.L();
        this.M.B(false);
    }

    public class06097(class07617 class076172, double d, int n) {
        super((class07475)class076172, d, n, 6);
        this.M = class076172;
        this.R = -2;
        this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
    }

    public void i() {
        super.i();
        this.M.B(false);
        if (!this.W()) {
            this.M.N(false);
        } else if (!this.M.W()) {
            this.M.N(true);
        }
    }

    public void u() {
        super.u();
        this.M.N(false);
    }

    protected boolean N(class05487 class054872, class07209 class072092) {
        return class054872.R(class072092.method_10084()) && class054872.method_8320(class072092).N(class01210.F);
    }

    protected int N(class07475 class074752) {
        return 40;
    }

    public boolean N() {
        return this.M.NQ() && !this.M.NJ() && !this.M.W() && super.N();
    }
}

