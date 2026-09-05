/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07430
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

class class07522
extends class07473 {
    private final class07475 N;
    private double y;
    private double L;
    private double u;
    private final double i;
    private final class07299 R;

    @Override
    public void L() {
        this.N.f().N(this.y, this.L, this.u, this.i);
    }

    private @Nullable class06889 M() {
        class06069 class060692 = this.N.method_59922();
        class07209 class072092 = this.N.method_24515();
        for (int i = 0; i < 10; ++i) {
            class07209 class072093 = class072092.method_10069(class060692.y(20) - 10, 2 - class060692.y(8), class060692.y(20) - 10);
            if (!this.R.method_8320(class072093).N(class00869.K)) continue;
            return class06889.L((class00753)class072093);
        }
        return null;
    }

    public class07522(class07475 class074752, double d) {
        this.N = class074752;
        this.i = d;
        this.R = class074752.method_73183();
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    @Override
    public boolean y() {
        return !this.N.f().U();
    }

    @Override
    public boolean N() {
        if (!this.R.method_8530()) {
            return false;
        }
        if (this.N.method_5799()) {
            return false;
        }
        class06889 class068892 = this.M();
        if (class068892 == null) {
            return false;
        }
        this.y = class068892.M;
        this.L = class068892.B;
        this.u = class068892.Z;
        return true;
    }
}

