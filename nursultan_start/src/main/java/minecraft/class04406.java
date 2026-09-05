/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class03063
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class06064
 *  minecraft.class06069
 *  minecraft.class06166
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07299
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class00734;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class06064;
import minecraft.class06069;
import minecraft.class06166;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07299;

public abstract class class04406 {
    private static final class00734 field_3860 = new class00734(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    private static final double field_36193 = class04995.E((double)100.0);
    protected final class03448 field_3851;
    protected double field_3858;
    protected double field_3838;
    protected double field_3856;
    protected double field_3874;
    protected double field_3854;
    protected double field_3871;
    protected double field_3852;
    protected double field_3869;
    protected double field_3850;
    private class00734 field_3872 = field_3860;
    protected boolean field_3845;
    protected boolean field_3862 = true;
    private boolean field_21507;
    protected boolean field_3843;
    protected float field_3849 = 0.6f;
    protected float field_3867 = 1.8f;
    protected final class06069 field_3840 = class06069.u();
    protected int field_3866;
    public int field_3847;
    public float field_3844;
    protected float field_28786 = 0.98f;
    protected boolean field_28787 = false;

    protected class04406(class03448 class034482, double d, double d2, double d3) {
        this.field_3851 = class034482;
        this.method_3080(0.2f, 0.2f);
        this.method_3063(d, d2, d3);
        this.field_3858 = d;
        this.field_3838 = d2;
        this.field_3856 = d3;
        this.field_3847 = (int)(4.0f / (this.field_3840.z() * 0.9f + 0.1f));
    }

    public class04406(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6) {
        this(class034482, d, d2, d3);
        this.field_3852 = d4 + (double)((this.field_3840.z() * 2.0f - 1.0f) * 0.4f);
        this.field_3869 = d5 + (double)((this.field_3840.z() * 2.0f - 1.0f) * 0.4f);
        this.field_3850 = d6 + (double)((this.field_3840.z() * 2.0f - 1.0f) * 0.4f);
        double d7 = (this.field_3840.z() + this.field_3840.z() + 1.0f) * 0.15f;
        double d8 = Math.sqrt(this.field_3852 * this.field_3852 + this.field_3869 * this.field_3869 + this.field_3850 * this.field_3850);
        this.field_3852 = this.field_3852 / d8 * d7 * (double)0.4f;
        this.field_3869 = this.field_3869 / d8 * d7 * (double)0.4f + (double)0.1f;
        this.field_3850 = this.field_3850 / d8 * d7 * (double)0.4f;
    }

    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.field_3874 + "," + this.field_3854 + "," + this.field_3871 + "), Age " + this.field_3866;
    }

    public class04406 method_3087(float f) {
        this.method_3080(0.2f * f, 0.2f * f);
        return this;
    }

    public class04406 method_3075(float f) {
        this.field_3852 *= (double)f;
        this.field_3869 = (this.field_3869 - (double)0.1f) * (double)f + (double)0.1f;
        this.field_3850 *= (double)f;
        return this;
    }

    public void method_3077(int n) {
        this.field_3847 = n;
    }

    public void method_3063(double d, double d2, double d3) {
        this.field_3874 = d;
        this.field_3854 = d2;
        this.field_3871 = d3;
        float f = this.field_3849 / 2.0f;
        float f2 = this.field_3867;
        this.method_3067(new class00734(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)f2, d3 + (double)f));
    }

    public int method_3082() {
        return this.field_3847;
    }

    public void method_3085() {
        this.field_3843 = true;
    }

    public class00734 method_3064() {
        return this.field_3872;
    }

    public void method_3069(double d, double d2, double d3) {
        if (this.field_21507) {
            return;
        }
        double d4 = d;
        double d5 = d2;
        double d6 = d3;
        if (this.field_3862 && (d != 0.0 || d2 != 0.0 || d3 != 0.0) && d * d + d2 * d2 + d3 * d3 < field_36193) {
            class06889 class068892 = class07049.method_20736(null, (class06889)new class06889(d, d2, d3), (class00734)this.method_3064(), (class07299)this.field_3851, List.of());
            d = class068892.M;
            d2 = class068892.B;
            d3 = class068892.Z;
        }
        if (d != 0.0 || d2 != 0.0 || d3 != 0.0) {
            this.method_3067(this.method_3064().u(d, d2, d3));
            this.method_3072();
        }
        if (Math.abs(d5) >= (double)1.0E-5f && Math.abs(d2) < (double)1.0E-5f) {
            this.field_21507 = true;
        }
        boolean bl = this.field_3845 = d5 != d2 && d5 < 0.0;
        if (d4 != d) {
            this.field_3852 = 0.0;
        }
        if (d6 != d3) {
            this.field_3850 = 0.0;
        }
    }

    public void method_34753(double d, double d2, double d3) {
        this.field_3852 = d;
        this.field_3869 = d2;
        this.field_3850 = d3;
    }

    protected void method_3072() {
        class00734 class007342 = this.method_3064();
        this.field_3874 = (class007342.N + class007342.u) / 2.0;
        this.field_3854 = class007342.y;
        this.field_3871 = (class007342.L + class007342.R) / 2.0;
    }

    public boolean method_3086() {
        return !this.field_3843;
    }

    protected void method_3080(float f, float f2) {
        if (f != this.field_3849 || f2 != this.field_3867) {
            this.field_3849 = f;
            this.field_3867 = f2;
            class00734 class007342 = this.method_3064();
            double d = (class007342.N + class007342.u - (double)f) / 2.0;
            double d2 = (class007342.L + class007342.R - (double)f) / 2.0;
            this.method_3067(new class00734(d, class007342.y, d2, d + (double)this.field_3849, class007342.y + (double)this.field_3867, d2 + (double)this.field_3849));
        }
    }

    public Optional<class06064> method_34019() {
        return Optional.empty();
    }

    protected int method_3068(float f) {
        class07209 class072092 = class07209.method_49637((double)this.field_3874, (double)this.field_3854, (double)this.field_3871);
        if (this.field_3851.E(class072092)) {
            return class03063.N((class07295)this.field_3851, (class07209)class072092);
        }
        return 0;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        this.field_3869 -= 0.04 * (double)this.field_3844;
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        if (this.field_28787 && this.field_3854 == this.field_3838) {
            this.field_3852 *= 1.1;
            this.field_3850 *= 1.1;
        }
        this.field_3852 *= (double)this.field_28786;
        this.field_3869 *= (double)this.field_28786;
        this.field_3850 *= (double)this.field_28786;
        if (this.field_3845) {
            this.field_3852 *= (double)0.7f;
            this.field_3850 *= (double)0.7f;
        }
    }

    public void method_3067(class00734 class007342) {
        this.field_3872 = class007342;
    }

    public abstract class06166 method_74274();
}

