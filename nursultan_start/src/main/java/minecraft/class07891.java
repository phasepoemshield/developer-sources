/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class00899
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class05487
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07475
 *  minecraft.class07969
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class00899;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class05487;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07475;
import minecraft.class07879;
import minecraft.class07969;
import minecraft.class08092;

class class07891
extends class07969 {
    private final class07879 M;
    private boolean B;
    private boolean Z;

    public class07891(class07879 class078792) {
        super((class07475)class078792, (double)0.7f, 16);
        this.M = class078792;
    }

    public void i() {
        super.i();
        this.M.p().N((double)this.i.method_10263() + 0.5, (double)(this.i.method_10264() + 1), (double)this.i.method_10260() + 0.5, 10.0f, (float)this.M.Ni());
        if (this.W()) {
            class07299 class072992 = this.M.method_73183();
            class07209 class072092 = this.i.method_10084();
            class00500 class005002 = class072992.method_8320(class072092);
            class00891 class008912 = class005002.i();
            if (this.Z && class008912 instanceof class00899) {
                int n = (Integer)class005002.L((class08092)class00899.R);
                if (n == 0) {
                    class072992.method_8652(class072092, class00869.N.W(), 2);
                    class072992.N(class072092, true, (class07049)this.M);
                } else {
                    class072992.method_8652(class072092, (class00500)class005002.y((class08092)class00899.R, (Comparable)Integer.valueOf(n - 1)), 2);
                    class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)this.M));
                    class072992.N(2001, class072092, class00891.W((class00500)class005002));
                }
                this.M.R = 40;
            }
            this.Z = false;
            this.L = 10;
        }
    }

    public boolean y() {
        return this.Z && super.y();
    }

    public boolean N() {
        if (this.L <= 0) {
            if (!((Boolean)class07891.N((class07049)this.M).method_64395().N(class07305.I)).booleanValue()) {
                return false;
            }
            this.Z = false;
            this.B = this.M.n();
        }
        return super.N();
    }

    protected boolean N(class05487 class054872, class07209 class072092) {
        class00500 class005002 = class054872.method_8320(class072092);
        if (class005002.N(class00869.Lr) && this.B && !this.Z && (class005002 = class054872.method_8320(class072092.method_10084())).i() instanceof class00899 && ((class00899)class005002.i()).E(class005002)) {
            this.Z = true;
            return true;
        }
        return false;
    }
}

