/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07862
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07862;
import minecraft.class08036;

public class class07959
extends class07473 {
    private final class07862 N;
    private final double y;
    private double L;
    private double u;
    private double i;

    public void L() {
        this.N.f().N(this.L, this.u, this.i, this.y);
    }

    public class07959(class07862 class078622, double d) {
        this.N = class078622;
        this.y = d;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void i() {
        if (!this.N.I() && this.N.method_59922().y(this.N(50)) == 0) {
            class07049 class070492 = this.N.method_31483();
            if (class070492 == null) {
                return;
            }
            if (class070492 instanceof class08036) {
                class08036 class080362 = (class08036)class070492;
                int n = this.N.Ng();
                int n2 = this.N.NV();
                if (n2 > 0 && this.N.method_59922().y(n2) < n) {
                    this.N.u(class080362);
                    return;
                }
                this.N.z(5);
            }
            this.N.method_5772();
            this.N.NC();
            this.N.method_73183().method_8421((class07049)this.N, (byte)6);
        }
    }

    public boolean y() {
        return !this.N.I() && !this.N.f().U() && this.N.method_5782();
    }

    public boolean N() {
        if (this.N.B() || this.N.I() || !this.N.method_5782()) {
            return false;
        }
        class06889 class068892 = class05475.N((class07475)this.N, (int)5, (int)4);
        if (class068892 == null) {
            return false;
        }
        this.L = class068892.M;
        this.u = class068892.B;
        this.i = class068892.Z;
        return true;
    }
}

