/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05298
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class08029
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class05298;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07530;
import minecraft.class08029;

class class07565
extends class07473 {
    private final class07530 N;
    private int y;
    private int L;
    private int u;

    @Override
    public void L() {
        this.y = 0;
    }

    private double M() {
        return this.N.method_45325(class05298.P);
    }

    public class07565(class07530 class075302) {
        this.N = class075302;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    @Override
    public boolean B() {
        return true;
    }

    @Override
    public void i() {
        --this.L;
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return;
        }
        boolean bl = this.N.C().N((class07049)class074382);
        this.u = bl ? 0 : ++this.u;
        double d = this.N.method_5858((class07049)class074382);
        if (d < 4.0) {
            if (!bl) {
                return;
            }
            if (this.L <= 0) {
                this.L = 20;
                this.N.method_6121(class07565.N((class07049)this.N), (class07049)class074382);
            }
            this.N.F().N(class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), 1.0);
        } else if (d < this.M() * this.M() && bl) {
            double d2 = class074382.method_23317() - this.N.method_23317();
            double d3 = class074382.method_23323(0.5) - this.N.method_23323(0.5);
            double d4 = class074382.method_23321() - this.N.method_23321();
            if (this.L <= 0) {
                ++this.y;
                if (this.y == 1) {
                    this.L = 60;
                    this.N.N(true);
                } else if (this.y <= 4) {
                    this.L = 6;
                } else {
                    this.L = 100;
                    this.y = 0;
                    this.N.N(false);
                }
                if (this.y > 1) {
                    double d5 = Math.sqrt(Math.sqrt(d)) * 0.5;
                    if (!this.N.method_5701()) {
                        this.N.method_73183().method_8444(null, 1018, this.N.method_24515(), 0);
                    }
                    for (int i = 0; i < 1; ++i) {
                        class06889 class068892 = new class06889(this.N.method_59922().N(d2, 2.297 * d5), d3, this.N.method_59922().N(d4, 2.297 * d5));
                        class08029 class080292 = new class08029(this.N.method_73183(), (class07438)this.N, class068892.u());
                        class080292.method_5814(class080292.method_23317(), this.N.method_23323(0.5) + 0.5, class080292.method_23321());
                        this.N.method_73183().method_8649((class07049)class080292);
                    }
                }
            }
            this.N.p().N((class07049)class074382, 10.0f, 10.0f);
        } else if (this.u < 5) {
            this.N.F().N(class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), 1.0);
        }
        super.i();
    }

    @Override
    public void u() {
        this.N.N(false);
        this.u = 0;
    }

    @Override
    public boolean N() {
        class07438 class074382 = this.N.T();
        return class074382 != null && class074382.method_5805() && this.N.method_18395(class074382);
    }
}

