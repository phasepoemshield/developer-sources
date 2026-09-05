/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01231
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07473
 */
package minecraft;

import minecraft.class00500;
import minecraft.class01231;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07883;

class class07900
extends class07473 {
    private static final float y = 3.0f;
    private static final float L = 5.0f;
    private static final float u = 10.0f;
    private int i;
    final /* synthetic */ class07883 N;

    public void L() {
        this.i = 0;
    }

    class07900(class07883 class078832) {
        this.N = class078832;
    }

    public boolean B() {
        return true;
    }

    public void i() {
        ++this.i;
        class07438 class074382 = this.N.method_6065();
        if (class074382 == null) {
            return;
        }
        class06889 class068892 = new class06889(this.N.method_23317() - class074382.method_23317(), this.N.method_23318() - class074382.method_23318(), this.N.method_23321() - class074382.method_23321());
        class00500 class005002 = this.N.method_73183().method_8320(class07209.method_49637((double)(this.N.method_23317() + class068892.M), (double)(this.N.method_23318() + class068892.B), (double)(this.N.method_23321() + class068892.Z)));
        if (this.N.method_73183().method_8316(class07209.method_49637((double)(this.N.method_23317() + class068892.M), (double)(this.N.method_23318() + class068892.B), (double)(this.N.method_23321() + class068892.Z))).N(class01231.N) || class005002.P()) {
            double d = class068892.M();
            if (d > 0.0) {
                class068892.u();
                double d2 = 3.0;
                if (d > 5.0) {
                    d2 -= (d - 5.0) / 5.0;
                }
                if (d2 > 0.0) {
                    class068892 = class068892.L(d2);
                }
            }
            if (class005002.P()) {
                class068892 = class068892.N(0.0, class068892.B, 0.0);
            }
            this.N.Z = new class06889(class068892.M / 20.0, class068892.B / 20.0, class068892.Z / 20.0);
        }
        if (this.i % 10 == 5) {
            this.N.method_73183().method_8406((class07126)class07107.u, this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), 0.0, 0.0, 0.0);
        }
    }

    public boolean N() {
        class07438 class074382 = this.N.method_6065();
        if (this.N.method_5799() && class074382 != null) {
            return this.N.method_5858((class07049)class074382) < 100.0;
        }
        return false;
    }
}

