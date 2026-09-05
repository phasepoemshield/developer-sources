/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class03530
 *  minecraft.class03689
 *  minecraft.class03696
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import java.util.function.Function;
import minecraft.class01231;
import minecraft.class03530;
import minecraft.class03689;
import minecraft.class03696;
import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import org.jspecify.annotations.Nullable;

public class class07993
extends class07473 {
    public static final int y = 1;
    protected final class07475 L;
    protected final double u;
    protected double i;
    protected double R;
    protected double M;
    protected boolean B;
    private final Function<class07475, class03530<class03689>> N;

    public void L() {
        this.L.f().N(this.i, this.R, this.M, this.u);
        this.B = true;
    }

    protected boolean M() {
        return this.L.method_6081() != null && this.L.method_6081().N(this.N.apply(this.L));
    }

    public class07993(class07475 class074752, double d) {
        this(class074752, d, (class03530<class03689>)class03696.I);
    }

    public class07993(class07475 class074752, double d, Function<class07475, class03530<class03689>> function) {
        this.L = class074752;
        this.u = d;
        this.N = function;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public class07993(class07475 class074753, double d, class03530<class03689> class035302) {
        this(class074753, d, (class07475 class074752) -> class035302);
    }

    protected boolean Z() {
        class06889 class068892 = class05475.N((class07475)this.L, (int)5, (int)4);
        if (class068892 == null) {
            return false;
        }
        this.i = class068892.M;
        this.R = class068892.B;
        this.M = class068892.Z;
        return true;
    }

    public boolean U() {
        return this.B;
    }

    public void u() {
        this.B = false;
    }

    public boolean y() {
        return !this.L.f().U();
    }

    protected @Nullable class07209 N(class07290 class072902, class07049 class070492, int n) {
        class07209 class072093 = class070492.method_24515();
        if (!class072902.method_8320(class072093).M(class072902, class072093).method_1110()) {
            return null;
        }
        return class07209.method_25997((class07209)class070492.method_24515(), (int)n, (int)1, class072092 -> class072902.method_8316(class072092).N(class01231.N)).orElse(null);
    }

    public boolean N() {
        class07209 class072092;
        if (!this.M()) {
            return false;
        }
        if (this.L.method_5809() && (class072092 = this.N((class07290)this.L.method_73183(), (class07049)this.L, 5)) != null) {
            this.i = class072092.method_10263();
            this.R = class072092.method_10264();
            this.M = class072092.method_10260();
            return true;
        }
        return this.Z();
    }
}

