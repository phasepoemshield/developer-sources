/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06570
 *  minecraft.class06924
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07150
 *  minecraft.class07172
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class06570;
import minecraft.class06924;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07150;
import minecraft.class07172;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class08038;

public class class07996<T extends class07150>
extends class07473 {
    private final T N;
    private final double y;
    private int L;
    private final float u;
    private int i = -1;
    private int R;
    private boolean M;
    private boolean B;
    private int Z = -1;

    public void L() {
        super.L();
        this.N.R(true);
    }

    public void L(int n) {
        this.L = n;
    }

    protected boolean M() {
        return this.N.method_24518(class06570.sx);
    }

    public class07996(T t, double d, int n, float f) {
        this.N = t;
        this.y = d;
        this.L = n;
        this.u = f * f;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public boolean B() {
        return true;
    }

    public void i() {
        boolean bl;
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return;
        }
        double d = this.N.method_5649(class074382.method_23317(), class074382.method_23318(), class074382.method_23321());
        boolean bl2 = this.N.C().N((class07049)class074382);
        boolean bl3 = bl = this.R > 0;
        if (bl2 != bl) {
            this.R = 0;
        }
        this.R = bl2 ? ++this.R : --this.R;
        if (d > (double)this.u || this.R < 20) {
            this.N.f().N((class07049)class074382, this.y);
            this.Z = -1;
        } else {
            this.N.f().W();
            ++this.Z;
        }
        if (this.Z >= 20) {
            if ((double)this.N.method_59922().z() < 0.3) {
                boolean bl4 = this.M = !this.M;
            }
            if ((double)this.N.method_59922().z() < 0.3) {
                this.B = !this.B;
            }
            this.Z = 0;
        }
        if (this.Z > -1) {
            if (d > (double)(this.u * 0.75f)) {
                this.B = false;
            } else if (d < (double)(this.u * 0.25f)) {
                this.B = true;
            }
            this.N.F().N(this.B ? -0.5f : 0.5f, this.M ? 0.5f : -0.5f);
            class07049 class070492 = this.N.method_49694();
            if (class070492 instanceof class07079) {
                class07079 class070792 = (class07079)class070492;
                class070792.N((class07049)class074382, 30.0f, 30.0f);
            }
            this.N.N((class07049)class074382, 30.0f, 30.0f);
        } else {
            this.N.p().N((class07049)class074382, 30.0f, 30.0f);
        }
        if (this.N.method_6115()) {
            int n;
            if (!bl2 && this.R < -60) {
                this.N.method_6021();
            } else if (bl2 && (n = this.N.method_6048()) >= 20) {
                this.N.method_6021();
                ((class07172)this.N).N(class074382, class06924.N((int)n));
                this.i = this.L;
            }
        } else if (--this.i <= 0 && this.R >= -60) {
            this.N.method_6019(class08038.N(this.N, class06570.sx));
        }
    }

    public void u() {
        super.u();
        this.N.R(false);
        this.R = 0;
        this.i = -1;
        this.N.method_6021();
    }

    public boolean y() {
        return (this.N() || !this.N.f().U()) && this.M();
    }

    public boolean N() {
        if (this.N.T() == null) {
            return false;
        }
        return this.M();
    }
}

