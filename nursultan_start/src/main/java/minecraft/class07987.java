/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00379
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class05487
 *  minecraft.class05659
 *  minecraft.class06637
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07475
 *  minecraft.class07617
 *  minecraft.class07789
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00379;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class05487;
import minecraft.class05659;
import minecraft.class06637;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07475;
import minecraft.class07617;
import minecraft.class07789;
import minecraft.class07969;
import minecraft.class08092;

public class class07987
extends class07969 {
    private final class07617 M;

    @Override
    public void L() {
        super.L();
        this.M.B(false);
    }

    public class07987(class07617 class076172, double d) {
        super((class07475)class076172, d, 8);
        this.M = class076172;
    }

    @Override
    public void i() {
        super.i();
        this.M.B(this.W());
    }

    public void u() {
        super.u();
        this.M.B(false);
    }

    @Override
    protected boolean N(class05487 class054872, class07209 class072092) {
        if (!class054872.R(class072092.method_10084())) {
            return false;
        }
        class00500 class005002 = class054872.method_8320(class072092);
        if (class005002.N(class00869.LA)) {
            return class00379.N((class07290)class054872, (class07209)class072092) < 1;
        }
        if (class005002.N(class00869.uN) && ((Boolean)class005002.L((class08092)class05659.y)).booleanValue()) {
            return true;
        }
        return class005002.N(class01210.F, class013392 -> class013392.u((class08092)class07789.y).map(class066372 -> class066372 != class06637.field_12560).orElse(true));
    }

    @Override
    public boolean N() {
        return this.M.NQ() && !this.M.NJ() && super.N();
    }
}

