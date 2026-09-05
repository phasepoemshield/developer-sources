/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05668
 *  minecraft.class06145
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07092
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07530
 */
package minecraft;

import minecraft.class05668;
import minecraft.class06145;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07092;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07530;

public class class08045
extends class05668 {
    public void method_5711(byte by) {
        if (by == 3) {
            class07126 class071262 = this.y();
            for (int i = 0; i < 8; ++i) {
                this.method_73183().method_8406(class071262, this.method_23317(), this.method_23318(), this.method_23321(), 0.0, 0.0, 0.0);
            }
        }
    }

    public class08045(class07299 class072992, double d, double d2, double d3, class06584 class065842) {
        super(class07078.yj, d, d2, d3, class072992, class065842);
    }

    public class08045(class07299 class072992, class07438 class074382, class06584 class065842) {
        super(class07078.yj, class074382, class072992, class065842);
    }

    public class08045(class07078<? extends class08045> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    private class07126 y() {
        class06584 class065842 = this.L();
        return class065842.R() ? class07107.NN : new class07092(class07107.S, class065842);
    }

    protected class06581 N() {
        return class06570.jP;
    }

    protected void N(class06145 class061452) {
        super.N(class061452);
        class07049 class070492 = class061452.L();
        int n = class070492 instanceof class07530 ? 3 : 0;
        class070492.method_64419(this.method_48923().y((class07049)this, this.z()), (float)n);
    }

    protected void N(class07089 class070892) {
        super.N(class070892);
        if (!this.method_73183().method_8608()) {
            this.method_73183().method_8421((class07049)this, (byte)3);
            this.method_31472();
        }
    }
}

