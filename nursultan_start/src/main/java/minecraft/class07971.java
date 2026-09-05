/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class07971
extends class07473 {
    private final class07475 N;
    private @Nullable class07438 y;
    private double L;
    private double u;
    private double i;
    private final double R;
    private final float M;

    public void L() {
        this.N.f().N(this.L, this.u, this.i, this.R);
    }

    public class07971(class07475 class074752, double d, float f) {
        this.N = class074752;
        this.R = d;
        this.M = f;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void u() {
        this.y = null;
    }

    public boolean y() {
        return !this.N.f().U() && this.y.method_5805() && this.y.method_5858((class07049)this.N) < (double)(this.M * this.M);
    }

    public boolean N() {
        this.y = this.N.T();
        if (this.y == null) {
            return false;
        }
        if (this.y.method_5858((class07049)this.N) > (double)(this.M * this.M)) {
            return false;
        }
        class06889 class068892 = class05475.N((class07475)this.N, (int)16, (int)7, (class06889)this.y.method_73189(), (double)1.5707963705062866);
        if (class068892 == null) {
            return false;
        }
        this.L = class068892.M;
        this.u = class068892.B;
        this.i = class068892.Z;
        return true;
    }
}

