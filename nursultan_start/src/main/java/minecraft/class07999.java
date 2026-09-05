/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00143
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07475
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00143;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class08036;

public class class07999
extends class07473 {
    protected final class07475 N;
    private final double y;
    private final boolean L;
    private class00143 u;
    private double i;
    private double R;
    private double M;
    private int B;
    private int Z;
    private final int z;
    private long U;
    private static final long E = 20L;

    public void L() {
        this.N.f().N(this.u, this.y);
        this.N.R(true);
        this.B = 0;
        this.Z = 0;
    }

    protected void M() {
        this.Z = this.N(20);
    }

    public class07999(class07475 class074752, double d, boolean bl) {
        this.z = 20;
        this.N = class074752;
        this.y = d;
        this.L = bl;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public boolean B() {
        return true;
    }

    protected boolean Z() {
        return this.Z <= 0;
    }

    public void i() {
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return;
        }
        this.N.p().N((class07049)class074382, 30.0f, 30.0f);
        this.B = Math.max(this.B - 1, 0);
        if ((this.L || this.N.C().N((class07049)class074382)) && this.B <= 0 && (this.i == 0.0 && this.R == 0.0 && this.M == 0.0 || class074382.method_5649(this.i, this.R, this.M) >= 1.0 || this.N.method_59922().z() < 0.05f)) {
            this.i = class074382.method_23317();
            this.R = class074382.method_23318();
            this.M = class074382.method_23321();
            this.B = 4 + this.N.method_59922().y(7);
            double d = this.N.method_5858((class07049)class074382);
            if (d > 1024.0) {
                this.B += 10;
            } else if (d > 256.0) {
                this.B += 5;
            }
            if (!this.N.f().N((class07049)class074382, this.y)) {
                this.B += 15;
            }
            this.B = this.N(this.B);
        }
        this.Z = Math.max(this.Z - 1, 0);
        this.N(class074382);
    }

    protected int U() {
        return this.Z;
    }

    public void u() {
        class07438 class074382 = this.N.T();
        if (!class07042.i.test(class074382)) {
            this.N.y(null);
        }
        this.N.R(false);
        this.N.f().W();
    }

    protected boolean y(class07438 class074382) {
        return this.Z() && this.N.L(class074382) && this.N.C().N((class07049)class074382);
    }

    public boolean y() {
        class08036 class080362;
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return false;
        }
        if (!class074382.method_5805()) {
            return false;
        }
        if (!this.L) {
            return !this.N.f().U();
        }
        if (!this.N.L(class074382.method_24515())) {
            return false;
        }
        return !(class074382 instanceof class08036) || !(class080362 = (class08036)class074382).method_7325() && !class080362.method_68878();
    }

    protected int E() {
        return this.N(20);
    }

    protected void N(class07438 class074382) {
        if (this.y(class074382)) {
            this.M();
            this.N.method_6104(class07050.field_5808);
            this.N.method_6121(class07999.N((class07049)this.N), (class07049)class074382);
        }
    }

    public boolean N() {
        long l = this.N.method_73183().N();
        if (l - this.U < 20L) {
            return false;
        }
        this.U = l;
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return false;
        }
        if (!class074382.method_5805()) {
            return false;
        }
        this.u = this.N.f().N((class07049)class074382, 0);
        if (this.u != null) {
            return true;
        }
        return this.N.L(class074382);
    }
}

