/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01001
 *  minecraft.class01226
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02607
 *  minecraft.class03810
 *  minecraft.class03831
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07427
 *  minecraft.class07446
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07862
 *  minecraft.class07960
 *  minecraft.class08004
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.DoubleSupplier;
import minecraft.class01001;
import minecraft.class01226;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02607;
import minecraft.class03810;
import minecraft.class03831;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07427;
import minecraft.class07446;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07862;
import minecraft.class07960;
import minecraft.class08004;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class00673
extends class07862 {
    private static final float f = 42.16f;
    private static final double C = 0.5;
    private static final double S = 0.06666666666666667;
    private static final double x = 9.0;
    private static final double D = 1.0;
    private static final class01325 h = class07078.yD.E().N(class03810.N().N(class03831.field_47743, 0.0f, class07078.yD.U() - 0.03125f, 0.0f)).N(0.5f);

    private static double L(DoubleSupplier doubleSupplier) {
        return 0.5 + doubleSupplier.getAsDouble() * 0.06666666666666667 + doubleSupplier.getAsDouble() * 0.06666666666666667 + doubleSupplier.getAsDouble() * 0.06666666666666667;
    }

    protected void Q() {
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(3, (class07473)new class07960((class07475)this, 1.25, class065842 -> class065842.N(class01226.NV), false));
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        this.NW();
        return super.method_5688(class080362, class070502);
    }

    public class00673(class07078<? extends class00673> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_5, -1.0f);
        this.N(class04425.field_17, -1.0f);
    }

    public boolean B() {
        return this.method_31483() instanceof class07079;
    }

    protected class07085 J() {
        return class07085.field_48824;
    }

    protected class04891 s() {
        return class04909.JX;
    }

    public boolean g() {
        return this.I() || !this.B();
    }

    private static double u(DoubleSupplier doubleSupplier) {
        return (9.0 + doubleSupplier.getAsDouble() * 1.0 + doubleSupplier.getAsDouble() * 1.0 + doubleSupplier.getAsDouble() * 1.0) / (double)42.16f;
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        return null;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class08004 class080042;
        if (class061132 == class06113.field_16459 && (class080042 = (class08004)class07078.yx.N(this.method_73183(), class06113.field_16460)) != null) {
            class080042.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0f);
            class080042.N(class010012, class070522, class061132, null);
            class080042.method_5673(class07085.field_6173, new class06584((class07310)class06570.le));
            class080042.method_5873((class07049)this, false, false);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        boolean bl;
        boolean bl2 = bl = !this.method_6109() && this.I() && class080362.method_21823();
        if (this.method_5782() || bl) {
            return super.N(class080362, class070502);
        }
        class06584 class065842 = class080362.method_5998(class070502);
        if (!class065842.R()) {
            if (this.N(class065842)) {
                return this.y(class080362, class065842);
            }
            if (!this.I()) {
                this.NC();
                return class07082.N;
            }
        }
        return super.N(class080362, class070502);
    }

    protected void N(class06069 class060692) {
        this.method_5996(class05298.T).N(class00673.L(() -> ((class06069)class060692).U()));
        this.method_5996(class05298.l).N(class00673.u(() -> ((class06069)class060692).U()));
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.NV);
    }

    public boolean N(double d) {
        return true;
    }

    public static class05300 W() {
        return class00673.NK().N(class05298.n, 25.0);
    }

    protected class04891 G() {
        return class04909.JF;
    }

    public class06889[] ab_() {
        return class02607.N((class07049)this, (double)0.04, (double)0.41, (double)0.18, (double)0.73);
    }

    public float K_() {
        return 1.4f;
    }

    public class04891 method_6002() {
        return class04909.Jp;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? h : super.method_55694(class013122);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.JA;
    }

    public boolean method_56991(class07085 class070852) {
        return true;
    }

    public boolean T_() {
        return false;
    }

    protected class04891 M_() {
        return class04909.Ja;
    }
}

