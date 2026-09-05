/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10774
 *  Nursultan.class10779
 *  minecraft.class00500
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05549
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07042
 *  minecraft.class07050
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class07464
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07874
 *  minecraft.class07993
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import Nursultan.class10774;
import Nursultan.class10779;
import minecraft.class00500;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05549;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07042;
import minecraft.class07050;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class07464;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07623;
import minecraft.class07639;
import minecraft.class07874;
import minecraft.class07993;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;

public abstract class class07629
extends class07874
implements class05549 {
    private static final class02131<Boolean> N = class03289.N(class07629.class, (class04383)class02154.U);
    private static final boolean y = false;

    public static class05300 M() {
        return class07079.H().N(class05298.n, 3.0);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)false);
    }

    protected class04891 method_5737() {
        return class04909.UK;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("FromBucket", this.B());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("FromBucket", false));
    }

    public class07629(class07078<? extends class07629> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class10774(this);
    }

    public boolean B() {
        return (Boolean)this.field_6011.N(N);
    }

    protected abstract class04891 m();

    public class04891 E() {
        return class04909.ul;
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        return class05549.N((class08036)class080362, (class07050)class070502, (class07438)this).orElse(super.N(class080362, class070502));
    }

    protected class07623 N(class07299 class072992) {
        return new class07639((class07079)this, class072992);
    }

    public void N(class07001 class070012) {
        class05549.N((class07079)this, (class07001)class070012);
    }

    public boolean N(double d) {
        return !this.B() && !this.method_16914();
    }

    public void N(boolean bl) {
        this.field_6011.N(N, (Object)bl);
    }

    public boolean W() {
        return true;
    }

    public boolean Nu() {
        return super.Nu() || this.B();
    }

    protected void l_() {
        super.l_();
        this.e.N(0, (class07473)new class07993((class07475)this, 1.25));
        this.e.N(2, (class07473)new class07464((class07475)this, class08036.class, 8.0f, 1.6, 1.4, class07042.R));
        this.e.N(4, (class07473)new class10779(this));
    }

    public int n_() {
        return 8;
    }

    public void e_(class06584 class065842) {
        class05549.N((class07079)this, (class06584)class065842);
    }

    public void method_6007() {
        if (!this.method_5799() && this.method_24828() && this.field_5992) {
            this.method_18799(this.method_18798().y((double)((this.field_5974.z() * 2.0f - 1.0f) * 0.05f), (double)0.4f, (double)((this.field_5974.z() * 2.0f - 1.0f) * 0.05f)));
            this.method_24830(false);
            this.field_64356 = true;
            this.method_56078(this.m());
        }
        super.method_6007();
    }

    public void method_76087(class06889 class068892, double d, boolean bl, double d2) {
        this.method_5724(0.01f, class068892);
        this.method_5784(class07451.field_6308, this.method_18798());
        this.method_18799(this.method_18798().L(0.9));
        if (this.T() == null) {
            this.method_18799(this.method_18798().y(0.0, -0.005, 0.0));
        }
    }
}

