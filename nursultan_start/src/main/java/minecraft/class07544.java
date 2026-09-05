/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00502
 *  minecraft.class01001
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01328
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06113
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07145
 *  minecraft.class07148
 *  minecraft.class07156
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08042
 */
package minecraft;

import minecraft.class00502;
import minecraft.class01001;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01328;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06113;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07145;
import minecraft.class07148;
import minecraft.class07156;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07538;
import minecraft.class08042;

class class07544
extends class07145 {
    private final class01328 i;
    final /* synthetic */ class07538 N;

    protected int M() {
        return 100;
    }

    class07544(class07538 class075382) {
        this.N = class075382;
        super((class07148)class075382);
        this.i = class01328.y().N(16.0).u().i();
    }

    protected int Z() {
        return 340;
    }

    protected void U() {
        class04782 class047822 = (class04782)this.N.method_73183();
        class00502 class005022 = this.N.method_5781();
        for (int i = 0; i < 3; ++i) {
            class07209 class072092 = this.N.method_24515().method_10069(-2 + class07538.y(this.N).y(5), 1, -2 + class07538.L(this.N).y(5));
            class08042 class080422 = (class08042)class07078.yV.N(this.N.method_73183(), class06113.field_16471);
            if (class080422 == null) continue;
            class080422.method_5725(class072092, 0.0f, 0.0f);
            class080422.N((class01001)class047822, class047822.method_8404(class072092), class06113.field_16471, null);
            class080422.N((class07079)this.N);
            class080422.N(class072092);
            class080422.N(20 * (30 + class07538.u(this.N).y(90)));
            if (class005022 != null) {
                class047822.method_14170().N(class080422.method_5820(), class005022);
            }
            class047822.y((class07049)class080422);
            class047822.N((class03556)class01194.v, class072092, class01164.N((class07049)this.N));
        }
    }

    protected class04891 E() {
        return class04909.UW;
    }

    public boolean N() {
        if (!super.N()) {
            return false;
        }
        int n = class07544.N_18((class07299)this.N.method_73183()).N(class08042.class, this.i, (class07438)this.N, this.N.method_5829().M(16.0)).size();
        return class07538.N(this.N).y(8) + 1 > n;
    }

    protected class07156 W() {
        return class07156.field_7379;
    }
}

