/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07107
 *  minecraft.class07113
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08400
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07107;
import minecraft.class07113;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class08005;
import minecraft.class08038;
import minecraft.class08400;

public abstract class class08031
extends class08005 {
    private static final float N = 12.25f;

    @Override
    public void method_5773() {
        this.u();
        this.method_56990();
        this.y();
        class07089 class070892 = class08038.N((class07049)this, this::N);
        class06889 class068892 = class070892.N() != class07113.field_1333 ? class070892.y() : this.method_73189().i(this.method_18798());
        this.method_33574(class068892);
        this.T();
        this.method_61409();
        super.method_5773();
        if (class070892.N() != class07113.field_1333 && this.method_5805()) {
            this.y(class070892);
        }
    }

    protected double method_7490() {
        return 0.03;
    }

    public boolean method_5640(double d) {
        if (this.field_6012 < 2 && d < 12.25) {
            return false;
        }
        double d2 = this.method_5829().N() * 4.0;
        if (Double.isNaN(d2)) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    public boolean method_5822(boolean bl) {
        return true;
    }

    protected class08031(class07078<? extends class08031> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class08031(class07078<? extends class08031> class070782, double d, double d2, double d3, class07299 class072992) {
        this(class070782, class072992);
        this.method_5814(d, d2, d3);
    }

    private void u() {
        if (this.field_5953) {
            for (class07209 class072092 : class07209.method_62671((class00734)this.method_5829())) {
                class00500 class005002 = this.method_73183().method_8320(class072092);
                if (!class005002.N(class00869.PN)) continue;
                class005002.N(this.method_73183(), class072092, (class07049)this, class08400.N, true);
            }
        }
    }

    private void y() {
        float f;
        class06889 class068892 = this.method_18798();
        class06889 class068893 = this.method_73189();
        if (this.method_5799()) {
            for (int i = 0; i < 4; ++i) {
                float f2 = 0.25f;
                this.method_73183().method_8406((class07126)class07107.u, class068893.M - class068892.M * 0.25, class068893.B - class068892.B * 0.25, class068893.Z - class068892.Z * 0.25, class068892.M, class068892.B, class068892.Z);
            }
            f = 0.8f;
        } else {
            f = 0.99f;
        }
        this.method_18799(class068892.L((double)f));
    }
}

