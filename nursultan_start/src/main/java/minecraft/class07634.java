/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import java.util.List;
import minecraft.class00717;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07637;

class class07634
extends class07473 {
    private int y;
    final /* synthetic */ class07637 N;

    public void L() {
        if (this.N.method_6118(class07085.field_6173).R()) {
            List var1 = this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class07637::N);
            if (!var1.isEmpty()) {
                this.N.f().N((class07049)var1.getFirst(), (double)1.2f);
            }
        } else {
            this.N.NJ();
        }
        this.y = 0;
    }

    public class07634(class07637 class076372) {
        this.N = class076372;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void i() {
        if (!this.N.m() && !this.N.method_6118(class07085.field_6173).R()) {
            this.N.NJ();
        }
    }

    public void u() {
        class06584 class065842 = this.N.method_6118(class07085.field_6173);
        if (!class065842.R()) {
            this.N.method_5775(class07634.N_18((class07299)this.N.method_73183()), class065842);
            this.N.method_5673(class07085.field_6173, class06584.E);
            int n = this.N.Q() ? class07637.M(this.N).y(50) + 10 : class07637.B(this.N).y(150) + 10;
            this.y = this.N.field_6012 + n * 20;
        }
        this.N.N(false);
    }

    public boolean y() {
        if (this.N.method_5799() || !this.N.Q() && class07637.i(this.N).y(class07634.y((int)600)) == 1) {
            return false;
        }
        return class07637.R(this.N).y(class07634.y((int)2000)) != 1;
    }

    public boolean N() {
        if (this.y > this.N.field_6012 || this.N.method_6109() || this.N.method_5799() || !this.N.No() || this.N.B() > 0) {
            return false;
        }
        if (!this.N.method_6118(class07085.field_6173).R()) {
            return true;
        }
        return !this.N.method_73183().N(class00717.class, this.N.method_5829().L(6.0, 6.0, 6.0), class07637::N).isEmpty();
    }
}

