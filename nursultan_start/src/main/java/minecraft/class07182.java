/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class01251
 *  minecraft.class01279
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01517
 *  minecraft.class01894
 *  minecraft.class02135
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07086
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07463
 *  minecraft.class07469
 *  minecraft.class07471
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07952
 *  minecraft.class07957
 *  minecraft.class07972
 *  minecraft.class07989
 *  minecraft.class08004
 *  minecraft.class08036
 *  minecraft.class08161
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00734;
import minecraft.class00869;
import minecraft.class01251;
import minecraft.class01279;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01517;
import minecraft.class01894;
import minecraft.class02135;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07086;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07463;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07952;
import minecraft.class07957;
import minecraft.class07972;
import minecraft.class07989;
import minecraft.class08004;
import minecraft.class08036;
import minecraft.class08161;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;

public class class07182
extends class08004
implements class01279 {
    private static final class01325 N = class07078.LN.E().N(0.5f).y(0.97f);
    private static final class01894 y = class01894.y((String)"attacking");
    private static final class07471 M = new class07471(y, 0.05, class07463.field_6328);
    private static final class02135 B = class01517.N((int)0, (int)1);
    private int Z;
    private static final class02135 W = class01517.N((int)20, (int)39);
    private long T;
    private @Nullable class08372<class07438> b;
    private static final int X = 10;
    private static final class02135 a = class01517.N((int)4, (int)6);
    private int p;

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        this.N(class083292);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(this.method_73183(), class082992);
    }

    public class07182(class07078<? extends class07182> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_14, 8.0f);
    }

    protected void B() {
        this.e.N(1, (class07473)new class08161((class07150)((Object)this), 1.0, 1.0, 10.0f, 2.0f));
        this.e.N(2, (class07473)new class07972((class08004)this, 1.0, false));
        this.e.N(7, (class07473)new class07957((class07475)this, 1.0));
        this.H.N(1, (class07473)new class07989((class07475)this, new Class[0]).N(new Class[0]));
        this.H.N(2, (class07473)new class07952((class07079)this, class08036.class, 10, true, false, (arg_0, arg_1) -> ((class07182)this).N(arg_0, arg_1)));
        this.H.N(3, (class07473)new class01251((class07079)this, true));
    }

    private void I() {
        this.method_5783(class04909.oZ, this.method_6107() * 2.0f, this.method_6017() * 1.8f);
    }

    protected class04891 s() {
        return this.P_() ? class04909.oZ : class04909.oB;
    }

    protected boolean m() {
        return false;
    }

    private void t() {
        if (this.Z > 0) {
            --this.Z;
            if (this.Z == 0) {
                this.I();
            }
        }
    }

    public static class05300 v() {
        return class08004.l().N(class05298.Q, 0.0).N(class05298.l, (double)0.23f).N(class05298.u, 5.0);
    }

    public boolean y(class04782 class047822, class06584 class065842) {
        return this.L(class065842);
    }

    public void y(@Nullable class07438 class074382) {
        if (this.T() == null && class074382 != null) {
            this.Z = B.N(this.field_5974);
            this.p = a.N(this.field_5974);
        }
        super.y(class074382);
    }

    public long E() {
        return this.T;
    }

    public void N(long l) {
        this.T = l;
    }

    public void N(class06069 class060692, class07052 class070522) {
        this.method_5673(class07085.field_6173, new class06584((class07310)(class060692.y(20) == 0 ? class06570.lH : class06570.TQ)));
    }

    public boolean N(class04782 class047822, class08036 class080362) {
        return this.N((class07438)class080362, class047822);
    }

    public static boolean N(class07078<class07182> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.y() != class07086.field_5801 && !class072842.method_8320(class072092.method_10074()).N(class00869.EJ);
    }

    protected void N(class04782 class047822) {
        class07469 class074692 = this.method_5996(class05298.l);
        if (this.P_()) {
            if (!this.method_6109() && !class074692.y(y)) {
                class074692.y(M);
            }
            this.t();
        } else if (class074692.y(y)) {
            class074692.L(y);
        }
        this.N(class047822, true);
        if (this.T() != null) {
            this.G();
        }
        super.N(class047822);
    }

    public void N(@Nullable class08372<class07438> class083722) {
        this.b = class083722;
    }

    public boolean N(class05487 class054872) {
        return class054872.method_8606((class07049)this) && !class054872.u(this.method_5829());
    }

    public @Nullable class08372<class07438> W() {
        return this.b;
    }

    private void O() {
        double d = this.method_45325(class05298.P);
        class00734 class007342 = class00734.N((class06889)this.method_73189()).L(d, 10.0, d);
        this.method_73183().N(class07182.class, class007342, class07042.R).stream().filter(class071822 -> class071822 != this).filter(class071822 -> class071822.T() == null).filter(class071822 -> !class071822.method_5722((class07049)this.T())).forEach(class071822 -> class071822.y(this.T()));
    }

    private void G() {
        if (this.p > 0) {
            --this.p;
            return;
        }
        if (this.C().N((class07049)this.T())) {
            this.O();
        }
        this.p = a.N(this.field_5974);
    }

    public class04891 method_6002() {
        return class04909.oz;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? N : super.method_55694(class013122);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.oU;
    }

    public void W_() {
        this.y(W.N(this.field_5974));
    }

    protected void V_() {
        this.method_5996(class05298.Q).N(0.0);
    }
}

