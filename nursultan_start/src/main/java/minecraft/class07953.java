/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00143
 *  minecraft.class00502
 *  minecraft.class01328
 *  minecraft.class01763
 *  minecraft.class05298
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07438
 *  minecraft.class07473
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00143;
import minecraft.class00502;
import minecraft.class01328;
import minecraft.class01763;
import minecraft.class05298;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07438;
import minecraft.class07473;
import org.jspecify.annotations.Nullable;

public abstract class class07953
extends class07473 {
    private static final int N = 0;
    private static final int y = 1;
    private static final int L = 2;
    protected final class07079 i;
    protected final boolean R;
    private final boolean u;
    private int Z;
    private int z;
    private int U;
    protected @Nullable class07438 M;
    protected int B = 60;

    public class07953 L(int n) {
        this.B = n;
        return this;
    }

    public void L() {
        this.Z = 0;
        this.z = 0;
        this.U = 0;
    }

    public class07953(class07079 class070792, boolean bl) {
        this(class070792, bl, false);
    }

    public class07953(class07079 class070792, boolean bl, boolean bl2) {
        this.i = class070792;
        this.R = bl;
        this.u = bl2;
    }

    protected double Z() {
        return this.i.method_45325(class05298.P);
    }

    public void u() {
        this.i.y(null);
        this.M = null;
    }

    public boolean y() {
        class07438 class074382 = this.i.T();
        if (class074382 == null) {
            class074382 = this.M;
        }
        if (class074382 == null) {
            return false;
        }
        if (!this.i.method_18395(class074382)) {
            return false;
        }
        class00502 class005022 = this.i.method_5781();
        class00502 class005023 = class074382.method_5781();
        if (class005022 != null && class005023 == class005022) {
            return false;
        }
        double d = this.Z();
        if (this.i.method_5858((class07049)class074382) > d * d) {
            return false;
        }
        if (this.R) {
            if (this.i.C().N((class07049)class074382)) {
                this.U = 0;
            } else if (++this.U > class07953.y((int)this.B)) {
                return false;
            }
        }
        this.i.y(class074382);
        return true;
    }

    private boolean N(class07438 class074382) {
        int n;
        this.z = class07953.y((int)(10 + this.i.method_59922().y(5)));
        class00143 class001432 = this.i.f().N((class07049)class074382, 0);
        if (class001432 == null) {
            return false;
        }
        class01763 class017632 = class001432.u();
        if (class017632 == null) {
            return false;
        }
        int n2 = class017632.N - class074382.method_31477();
        return (double)(n2 * n2 + (n = class017632.L - class074382.method_31479()) * n) <= 2.25;
    }

    protected boolean N(@Nullable class07438 class074382, class01328 class013282) {
        if (class074382 == null) {
            return false;
        }
        if (!class013282.N(class07953.N((class07049)this.i), (class07438)this.i, class074382)) {
            return false;
        }
        if (!this.i.L(class074382.method_24515())) {
            return false;
        }
        if (this.u) {
            if (--this.z <= 0) {
                this.Z = 0;
            }
            if (this.Z == 0) {
                int n = this.Z = this.N(class074382) ? 1 : 2;
            }
            if (this.Z == 2) {
                return false;
            }
        }
        return true;
    }
}

