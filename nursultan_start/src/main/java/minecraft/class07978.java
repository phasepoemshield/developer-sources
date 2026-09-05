/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class07978
extends class07473 {
    public static final int N = 120;
    protected final class07475 y;
    protected double L;
    protected double u;
    protected double i;
    protected final double R;
    protected int M;
    protected boolean B;
    private final boolean Z;

    public void L(int n) {
        this.M = n;
    }

    public void L() {
        this.y.f().N(this.L, this.u, this.i, this.R);
    }

    protected @Nullable class06889 M() {
        return class05475.N((class07475)this.y, (int)10, (int)7);
    }

    public class07978(class07475 class074752, double d) {
        this(class074752, d, 120);
    }

    public class07978(class07475 class074752, double d, int n) {
        this(class074752, d, n, true);
    }

    public class07978(class07475 class074752, double d, int n, boolean bl) {
        this.y = class074752;
        this.R = d;
        this.M = n;
        this.Z = bl;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void Z() {
        this.B = true;
    }

    public void u() {
        this.y.f().W();
        super.u();
    }

    public boolean y() {
        return !this.y.f().U() && !this.y.method_42148();
    }

    public boolean N() {
        class06889 class068892;
        if (this.y.method_42148()) {
            return false;
        }
        if (!this.B) {
            if (this.Z && this.y.method_6131() >= 100) {
                return false;
            }
            if (this.y.method_59922().y(class07978.y((int)this.M)) != 0) {
                return false;
            }
        }
        if ((class068892 = this.M()) == null) {
            return false;
        }
        this.L = class068892.M;
        this.u = class068892.B;
        this.i = class068892.Z;
        this.B = false;
        return true;
    }
}

