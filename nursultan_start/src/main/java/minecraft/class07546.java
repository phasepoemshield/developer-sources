/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07145
 *  minecraft.class07148
 *  minecraft.class07156
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07438
 *  minecraft.class08009
 */
package minecraft;

import minecraft.class00494;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07145;
import minecraft.class07148;
import minecraft.class07156;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07438;
import minecraft.class07538;
import minecraft.class08009;

class class07546
extends class07145 {
    final /* synthetic */ class07538 N;

    protected int M() {
        return 40;
    }

    class07546(class07538 class075382) {
        this.N = class075382;
        super((class07148)class075382);
    }

    protected int Z() {
        return 100;
    }

    protected void U() {
        class07438 class074382 = this.N.T();
        double d = Math.min(class074382.method_23318(), this.N.method_23318());
        double d2 = Math.max(class074382.method_23318(), this.N.method_23318()) + 1.0;
        float f = (float)class04995.u((double)(class074382.method_23321() - this.N.method_23321()), (double)(class074382.method_23317() - this.N.method_23317()));
        if (this.N.method_5858((class07049)class074382) < 9.0) {
            float f2;
            int n;
            for (n = 0; n < 5; ++n) {
                f2 = f + (float)n * (float)Math.PI * 0.4f;
                this.N(this.N.method_23317() + (double)class04995.P((double)f2) * 1.5, this.N.method_23321() + (double)class04995.m((double)f2) * 1.5, d, d2, f2, 0);
            }
            for (n = 0; n < 8; ++n) {
                f2 = f + (float)n * (float)Math.PI * 2.0f / 8.0f + 1.2566371f;
                this.N(this.N.method_23317() + (double)class04995.P((double)f2) * 2.5, this.N.method_23321() + (double)class04995.m((double)f2) * 2.5, d, d2, f2, 3);
            }
        } else {
            for (int i = 0; i < 16; ++i) {
                double d3 = 1.25 * (double)(i + 1);
                int n = 1 * i;
                this.N(this.N.method_23317() + (double)class04995.P((double)f) * d3, this.N.method_23321() + (double)class04995.m((double)f) * d3, d, d2, f, n);
            }
        }
    }

    protected class04891 E() {
        return class04909.UE;
    }

    private void N(double d, double d2, double d3, double d4, float f, int n) {
        class07209 class072092 = class07209.method_49637((double)d, (double)d4, (double)d2);
        boolean bl = false;
        double d5 = 0.0;
        do {
            class00494 class004942;
            class07209 class072093 = class072092.method_10074();
            if (!this.N.method_73183().method_8320(class072093).L((class07290)this.N.method_73183(), class072093, class07211.field_11036)) continue;
            if (!this.N.method_73183().R(class072092) && !(class004942 = this.N.method_73183().method_8320(class072092).M((class07290)this.N.method_73183(), class072092)).method_1110()) {
                d5 = class004942.method_1105(class07185.field_11052);
            }
            bl = true;
            break;
        } while ((class072092 = class072092.method_10074()).method_10264() >= class04995.N((double)d3) - 1);
        if (bl) {
            this.N.method_73183().method_8649((class07049)new class08009(this.N.method_73183(), d, (double)class072092.method_10264() + d5, d2, f, n, (class07438)this.N));
            this.N.method_73183().method_32888((class03556)class01194.v, new class06889(d, (double)class072092.method_10264() + d5, d2), class01164.N((class07049)this.N));
        }
    }

    protected class07156 W() {
        return class07156.field_7380;
    }
}

