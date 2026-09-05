/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06165
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class06165;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;

class class01306
extends class07473 {
    final /* synthetic */ class06165 N;

    public void L() {
        this.N.N(false);
        this.N.M(false);
    }

    public class01306(class06165 class061652) {
        this.N = class061652;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public void i() {
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return;
        }
        this.N.p().N((class07049)class074382, (float)this.N.NR(), (float)this.N.Ni());
        if (this.N.method_5858((class07049)class074382) <= 36.0) {
            this.N.E(true);
            this.N.U(true);
            this.N.f().W();
        } else {
            this.N.f().N((class07049)class074382, 1.5);
        }
    }

    public void u() {
        class07438 class074382 = this.N.T();
        if (class074382 != null && class06165.N((class06165)this.N, (class07438)class074382)) {
            this.N.E(true);
            this.N.U(true);
            this.N.f().W();
            this.N.p().N((class07049)class074382, (float)this.N.NR(), (float)this.N.Ni());
        } else {
            this.N.E(false);
            this.N.U(false);
        }
    }

    public boolean N() {
        if (this.N.method_6113()) {
            return false;
        }
        class07438 class074382 = this.N.T();
        return class074382 != null && class074382.method_5805() && class06165.i.test(class074382) && this.N.method_5858((class07049)class074382) > 36.0 && !this.N.method_18276() && !this.N.d() && !class06165.N((class06165)this.N);
    }
}

