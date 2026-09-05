/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class06165
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import java.util.List;
import minecraft.class00717;
import minecraft.class06165;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07430;
import minecraft.class07473;

class class01308
extends class07473 {
    final /* synthetic */ class06165 N;

    public void L() {
        List var1 = this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class06165.u);
        if (!var1.isEmpty()) {
            this.N.f().N((class07049)var1.get(0), (double)1.2f);
        }
    }

    public class01308(class06165 class061652) {
        this.N = class061652;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void i() {
        List var1 = this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class06165.u);
        if (this.N.method_6118(class07085.field_6173).R() && !var1.isEmpty()) {
            this.N.f().N((class07049)var1.get(0), (double)1.2f);
        }
    }

    public boolean N() {
        if (!this.N.method_6118(class07085.field_6173).R()) {
            return false;
        }
        if (this.N.T() != null || this.N.method_6065() != null) {
            return false;
        }
        if (!this.N.Q()) {
            return false;
        }
        if (this.N.method_59922().y(class01308.y((int)10)) != 0) {
            return false;
        }
        return !this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class06165.u).isEmpty() && this.N.method_6118(class07085.field_6173).R();
    }
}

