/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01328
 *  minecraft.class05298
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import java.util.function.Predicate;
import minecraft.class01328;
import minecraft.class05298;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07960
extends class07473 {
    private static final class01328 u = class01328.y().u();
    private static final double i = 2.5;
    private final class01328 R;
    protected final class07079 N;
    protected final double y;
    private double M;
    private double B;
    private double Z;
    private double z;
    private double U;
    protected @Nullable class08036 L;
    private int E;
    private boolean W;
    private final Predicate<class06584> m;
    private final boolean P;
    private final double s;

    public void L() {
        this.M = this.L.method_23317();
        this.B = this.L.method_23318();
        this.Z = this.L.method_23321();
        this.W = true;
    }

    protected boolean M() {
        return this.P;
    }

    public class07960(class07475 class074752, double d, Predicate<class06584> predicate, boolean bl) {
        this((class07079)class074752, d, predicate, bl, 2.5);
    }

    public class07960(class07475 class074752, double d, Predicate<class06584> predicate, boolean bl, double d2) {
        this((class07079)class074752, d, predicate, bl, d2);
    }

    class07960(class07079 class070792, double d, Predicate<class06584> predicate, boolean bl, double d2) {
        this.N = class070792;
        this.y = d;
        this.m = predicate;
        this.P = bl;
        this.s = d2;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
        this.R = u.L().N((class074382, class047822) -> this.N(class074382));
    }

    protected void Z() {
        this.N.f().W();
    }

    public void i() {
        this.N.p().N((class07049)this.L, (float)(this.N.NR() + 20), (float)this.N.Ni());
        if (this.N.method_5858((class07049)this.L) < this.s * this.s) {
            this.Z();
        } else {
            this.N(this.L);
        }
    }

    public boolean U() {
        return this.W;
    }

    public void u() {
        this.L = null;
        this.Z();
        this.E = class07960.y((int)100);
        this.W = false;
    }

    public boolean y() {
        if (this.M()) {
            if (this.N.method_5858((class07049)this.L) < 36.0) {
                if (this.L.method_5649(this.M, this.B, this.Z) > 0.010000000000000002) {
                    return false;
                }
                if (Math.abs((double)this.L.method_36455() - this.z) > 5.0 || Math.abs((double)this.L.method_36454() - this.U) > 5.0) {
                    return false;
                }
            } else {
                this.M = this.L.method_23317();
                this.B = this.L.method_23318();
                this.Z = this.L.method_23321();
            }
            this.z = this.L.method_36455();
            this.U = this.L.method_36454();
        }
        return this.N();
    }

    public boolean N() {
        if (this.E > 0) {
            --this.E;
            return false;
        }
        this.L = class07960.N((class07049)this.N).N(this.R.N(this.N.method_45325(class05298.J)), (class07438)this.N);
        return this.L != null;
    }

    protected void N(class08036 class080362) {
        this.N.f().N((class07049)class080362, this.y);
    }

    private boolean N(class07438 class074382) {
        return this.m.test(class074382.method_6047()) || this.m.test(class074382.method_6079());
    }
}

