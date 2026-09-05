/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04909
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class04909;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class08042;

class class08032
extends class07473 {
    final /* synthetic */ class08042 N;

    public void L() {
        class07438 class074382 = this.N.T();
        if (class074382 != null) {
            class06889 class068892 = class074382.method_33571();
            class08042.y(this.N).N(class068892.M, class068892.B, class068892.Z, 1.0);
        }
        this.N.N(true);
        this.N.method_5783(class04909.gB, 1.0f, 1.0f);
    }

    public class08032(class08042 class080422) {
        this.N = class080422;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public boolean B() {
        return true;
    }

    public void i() {
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return;
        }
        if (this.N.method_5829().L(class074382.method_5829())) {
            this.N.method_6121(class08032.N_18((class07299)this.N.method_73183()), (class07049)class074382);
            this.N.N(false);
        } else if (this.N.method_5858((class07049)class074382) < 9.0) {
            class06889 class068892 = class074382.method_33571();
            class08042.L(this.N).N(class068892.M, class068892.B, class068892.Z, 1.0);
        }
    }

    public void u() {
        this.N.N(false);
    }

    public boolean y() {
        return this.N.F().y() && this.N.W() && this.N.T() != null && this.N.T().method_5805();
    }

    public boolean N() {
        class07438 class074382 = this.N.T();
        if (class074382 != null && class074382.method_5805() && !this.N.F().y() && class08042.N(this.N).y(class08032.y((int)7)) == 0) {
            return this.N.method_5858((class07049)class074382) > 4.0;
        }
        return false;
    }
}

