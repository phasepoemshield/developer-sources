/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07473
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00753;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class07452
extends class07473 {
    protected final class07475 N;
    private double y;
    private double L;
    private double u;
    private final double i;
    private final class07299 R;

    public void L() {
        this.N.f().N(this.y, this.L, this.u, this.i);
    }

    protected boolean M() {
        class06889 class068892 = this.Z();
        if (class068892 == null) {
            return false;
        }
        this.y = class068892.M;
        this.L = class068892.B;
        this.u = class068892.Z;
        return true;
    }

    public class07452(class07475 class074752, double d) {
        this.N = class074752;
        this.i = d;
        this.R = class074752.method_73183();
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    protected @Nullable class06889 Z() {
        class06069 class060692 = this.N.method_59922();
        class07209 class072092 = this.N.method_24515();
        for (int i = 0; i < 10; ++i) {
            class07209 class072093 = class072092.method_10069(class060692.y(20) - 10, class060692.y(6) - 3, class060692.y(20) - 10);
            if (this.R.N_17(class072093) || !(this.N.u(class072093) < 0.0f)) continue;
            return class06889.L((class00753)class072093);
        }
        return null;
    }

    public boolean y() {
        return !this.N.f().U();
    }

    public boolean N() {
        if (this.N.T() != null) {
            return false;
        }
        if (!this.R.method_8530()) {
            return false;
        }
        if (!this.N.method_5809()) {
            return false;
        }
        if (!this.R.N_17(this.N.method_24515())) {
            return false;
        }
        if (!this.N.method_6118(class07085.field_6169).R()) {
            return false;
        }
        return this.M();
    }
}

