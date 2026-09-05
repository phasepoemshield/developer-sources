/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01517
 *  minecraft.class02135
 *  minecraft.class02484
 *  minecraft.class02820
 *  minecraft.class04854
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class07049
 *  minecraft.class07150
 *  minecraft.class07172
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class01517;
import minecraft.class02135;
import minecraft.class02484;
import minecraft.class02820;
import minecraft.class04854;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class07049;
import minecraft.class07150;
import minecraft.class07172;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07964;
import minecraft.class08038;

public class class07966<T extends class07150 & class04854>
extends class07473 {
    public static final class02135 N = class01517.N((int)1, (int)2);
    private final T y;
    private class07964 L = class07964.field_16534;
    private final double u;
    private final float i;
    private int R;
    private int M;
    private int B;

    private boolean M() {
        return this.y.method_24518(class06570.dw);
    }

    public class07966(T t, double d, float f) {
        this.y = t;
        this.u = d;
        this.i = f * f;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public boolean B() {
        return true;
    }

    private boolean Z() {
        return this.y.T() != null && this.y.T().method_5805();
    }

    public void i() {
        boolean bl;
        boolean bl2;
        class07438 class074382 = this.y.T();
        if (class074382 == null) {
            return;
        }
        boolean bl3 = this.y.C().N((class07049)class074382);
        boolean bl4 = bl2 = this.R > 0;
        if (bl3 != bl2) {
            this.R = 0;
        }
        this.R = bl3 ? ++this.R : --this.R;
        boolean bl5 = bl = (this.y.method_5858((class07049)class074382) > (double)this.i || this.R < 5) && this.M == 0;
        if (bl) {
            --this.B;
            if (this.B <= 0) {
                this.y.f().N((class07049)class074382, this.U() ? this.u : this.u * 0.5);
                this.B = N.N(this.y.method_59922());
            }
        } else {
            this.B = 0;
            this.y.f().W();
        }
        this.y.p().N((class07049)class074382, 30.0f, 30.0f);
        if (this.L == class07964.field_16534) {
            if (!bl) {
                this.y.method_6019(class08038.N(this.y, class06570.dw));
                this.L = class07964.field_16530;
                ((class04854)this.y).N(true);
            }
        } else if (this.L == class07964.field_16530) {
            class06584 class065842;
            int n;
            if (!this.y.method_6115()) {
                this.L = class07964.field_16534;
            }
            if ((n = this.y.method_6048()) >= class06593.y((class06584)(class065842 = this.y.method_6030()), this.y)) {
                this.y.method_6075();
                this.L = class07964.field_16532;
                this.M = 20 + this.y.method_59922().y(20);
                ((class04854)this.y).N(false);
            }
        } else if (this.L == class07964.field_16532) {
            --this.M;
            if (this.M == 0) {
                this.L = class07964.field_16533;
            }
        } else if (this.L == class07964.field_16533 && bl3) {
            ((class07172)this.y).N(class074382, 1.0f);
            this.L = class07964.field_16534;
        }
    }

    private boolean U() {
        return this.L == class07964.field_16534;
    }

    public void u() {
        super.u();
        this.y.R(false);
        this.y.y(null);
        this.R = 0;
        if (this.y.method_6115()) {
            this.y.method_6021();
            ((class04854)this.y).N(false);
            this.y.method_6030().N(class02484.x, (Object)class02820.N);
        }
    }

    public boolean y() {
        return this.Z() && (this.N() || !this.y.f().U()) && this.M();
    }

    public boolean N() {
        return this.Z() && this.M();
    }
}

