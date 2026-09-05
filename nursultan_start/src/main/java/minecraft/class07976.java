/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07475
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00753;
import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;

public class class07976
extends class07473 {
    private final class07475 N;
    private double y;
    private double L;
    private double u;
    private final double i;

    public void L() {
        this.N.f().N(this.y, this.L, this.u, this.i);
    }

    public class07976(class07475 class074752, double d) {
        this.N = class074752;
        this.i = d;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public boolean y() {
        return !this.N.f().U();
    }

    public boolean N() {
        if (this.N.NP()) {
            return false;
        }
        class06889 class068892 = class05475.N((class07475)this.N, (int)16, (int)7, (class06889)class06889.L((class00753)this.N.Ns()), (double)1.5707963705062866);
        if (class068892 == null) {
            return false;
        }
        this.y = class068892.M;
        this.L = class068892.B;
        this.u = class068892.Z;
        return true;
    }
}

