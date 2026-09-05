/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00741
 *  minecraft.class01362
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00741;
import minecraft.class01362;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;

public class class07031
extends class00741 {
    public static final MapCodec<class07031> N = class07031.y(class07031::new);

    public class07031(class01362 class013622) {
        super(class013622);
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, class07049 class070492) {
        double d = Math.abs(class070492.method_18798().B);
        if (d < 0.1 && !class070492.method_21749()) {
            double d2 = 0.4 + d * 0.2;
            class070492.method_18799(class070492.method_18798().u(d2, 1.0, d2));
        }
        super.N(class072992, class072092, class005002, class070492);
    }

    private void N(class07049 class070492) {
        class06889 class068892 = class070492.method_18798();
        if (class068892.B < 0.0) {
            double d = class070492 instanceof class07438 ? 1.0 : 0.8;
            class070492.method_18800(class068892.M, -class068892.B * d, class068892.Z);
        }
    }

    public MapCodec<class07031> N() {
        return N;
    }

    public void N(class07290 class072902, class07049 class070492) {
        if (class070492.method_21750()) {
            super.N(class072902, class070492);
        } else {
            this.N(class070492);
        }
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, class07049 class070492, double d) {
        if (!class070492.method_21750()) {
            class070492.method_5747(d, 0.0f, class072992.method_48963().E());
        }
    }
}

