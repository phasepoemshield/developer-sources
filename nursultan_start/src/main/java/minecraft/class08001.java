/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class08042;

class class08001
extends class07473 {
    final /* synthetic */ class08042 N;

    public class08001(class08042 class080422) {
        this.N = class080422;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void i() {
        class07209 class072092 = this.N.E();
        if (class072092 == null) {
            class072092 = this.N.method_24515();
        }
        for (int i = 0; i < 3; ++i) {
            class07209 class072093 = class072092.method_10069(class08042.i(this.N).y(15) - 7, class08042.R(this.N).y(11) - 5, class08042.M(this.N).y(15) - 7);
            if (!this.N.method_73183().R(class072093)) continue;
            class08042.B(this.N).N((double)class072093.method_10263() + 0.5, (double)class072093.method_10264() + 0.5, (double)class072093.method_10260() + 0.5, 0.25);
            if (this.N.T() != null) break;
            this.N.p().N((double)class072093.method_10263() + 0.5, (double)class072093.method_10264() + 0.5, (double)class072093.method_10260() + 0.5, 180.0f, 20.0f);
            break;
        }
    }

    public boolean y() {
        return false;
    }

    public boolean N() {
        return !this.N.F().y() && class08042.u(this.N).y(class08001.y((int)7)) == 0;
    }
}

