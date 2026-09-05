/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00672
 *  minecraft.class01001
 *  minecraft.class01042
 *  minecraft.class01226
 *  minecraft.class01332
 *  minecraft.class01361
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05946
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
 *  minecraft.class07086
 *  minecraft.class07182
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07434
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07459
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07960
 *  minecraft.class07962
 *  minecraft.class07993
 *  minecraft.class08036
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08577
 *  minecraft.class08579
 *  minecraft.class08638
 *  minecraft.class08642
 *  minecraft.class08725
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00672;
import minecraft.class01001;
import minecraft.class01042;
import minecraft.class01226;
import minecraft.class01332;
import minecraft.class01361;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05946;
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
import minecraft.class07086;
import minecraft.class07182;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07434;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07459;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07633;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07960;
import minecraft.class07962;
import minecraft.class07993;
import minecraft.class08036;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08577;
import minecraft.class08579;
import minecraft.class08638;
import minecraft.class08642;
import minecraft.class08725;
import org.jspecify.annotations.Nullable;

public class class07627
extends class07633
implements class01361 {
    private static final class02131<Integer> N = class03289.N(class07627.class, (class04383)class02154.y);
    private static final class02131<class03556<class08642>> y = class03289.N(class07627.class, (class04383)class02154.Q);
    private final class01332 L;

    public void method_5674(class02131<?> class021312) {
        if (N.equals(class021312) && this.method_73183().method_8608()) {
            this.L.N();
        }
        super.method_5674(class021312);
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.NX);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)0);
        class042932.N(y, (Object)class08577.N((class01042)this.method_56673(), (class05946)class08638.u));
    }

    public @Nullable class07438 method_5642() {
        class08036 class080362;
        class07049 class070492;
        if (this.Nz() && (class070492 = this.method_31483()) instanceof class08036 && (class080362 = (class08036)class070492).method_24518(class06570.sm)) {
            return class080362;
        }
        return super.method_5642();
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.GT, 0.15f, 1.0f);
    }

    @Override
    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class08577.N((class08329)class083292, this.m());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.NX) {
            return (T)class07627.method_66651(class024772, this.m());
        }
        return (T)super.method_58694(class024772);
    }

    @Override
    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class08577.N((class08299)class082992, (class05946)class04227.yP).ifPresent(this::N);
    }

    public void method_5800(class04782 class047822, class00672 class006722) {
        if (class047822.y() != class07086.field_5801) {
            if ((class07182)this.N(class07078.LN, class08234.N((class07079)this, (boolean)false, (boolean)true), class071822 -> {
                class071822.N(this.method_59922(), class047822.method_8404(this.method_24515()));
                class071822.NW();
            }) == null) {
                super.method_5800(class047822, class006722);
            }
        } else {
            super.method_5800(class047822, class006722);
        }
    }

    public class07627(class07078<? extends class07627> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.L = new class01332(this.field_6011, N);
    }

    public static class05300 B() {
        return class07633.Ne().N(class05298.n, 10.0).N(class05298.l, 0.25);
    }

    protected class04891 s() {
        return class04909.GW;
    }

    public class03556<class08642> m() {
        return (class03556)this.field_6011.N(y);
    }

    public @Nullable class07627 y(class04782 class047822, class07077 class070772) {
        class07627 class076272 = (class07627)class07078.Nh.N((class07299)class047822, class06113.field_16466);
        if (class076272 != null && class070772 instanceof class07627) {
            class07627 class076273 = (class07627)class070772;
            class076272.N(this.field_5974.Z() ? this.m() : class076273.m());
        }
        return class076272;
    }

    private void N(class03556<class08642> class035562) {
        this.field_6011.N(y, class035562);
    }

    @Override
    public boolean N(class06584 class065842) {
        return class065842.N(class01226.yN);
    }

    @Override
    public class07082 N(class08036 class080362, class07050 class070502) {
        if (!this.N(class080362.method_5998(class070502)) && this.Nz() && !this.method_5782() && !class080362.method_21823()) {
            if (!this.method_73183().method_8608()) {
                class080362.method_5804((class07049)this);
            }
            return class07082.N;
        }
        class07082 class070822 = super.N(class080362, class070502);
        if (!class070822.N()) {
            class06584 class065842 = class080362.method_5998(class070502);
            if (this.method_63623(class065842, class07085.field_55946)) {
                return class065842.N(class080362, (class07438)this, class070502);
            }
            return class07082.i;
        }
        return class070822;
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class08577.N((class08579)class08579.N((class01001)class010012, (class07209)this.method_24515()), (class05946)class04227.yP).ifPresent(this::N);
        return super.N(class010012, class070522, class061132, class074462);
    }

    public boolean W() {
        return this.L.N(this.method_59922());
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.6f * this.method_5751()), (double)(this.method_17681() * 0.4f));
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.NX) {
            this.N((class03556<class08642>)((class03556)class07627.method_66651((class02477)class02484.NX, t)));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    protected void l_() {
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class07993((class07475)this, 1.25));
        this.e.N(3, (class07473)new class07434((class07633)this, 1.0));
        this.e.N(4, (class07473)new class07960((class07475)this, 1.2, class065842 -> class065842.N(class06570.sm), false));
        this.e.N(4, (class07473)new class07960((class07475)this, 1.2, class065842 -> class065842.N(class01226.yN), false));
        this.e.N(5, (class07473)new class07459((class07633)this, 1.1));
        this.e.N(6, (class07473)new class07957((class07475)this, 1.0));
        this.e.N(7, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(8, (class07473)new class07956((class07079)this));
    }

    public float method_49485(class08036 class080362) {
        return (float)(this.method_45325(class05298.l) * 0.225 * (double)this.L.L());
    }

    public class04891 method_6002() {
        return class04909.Gm;
    }

    public void method_49481(class08036 class080362, class06889 class068892) {
        super.method_49481(class080362, class068892);
        this.method_5710(class080362.method_36454(), class080362.method_36455() * 0.5f);
        float f = this.method_36454();
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f);
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f);
        this.field_5982 = f;
        this.L.y();
    }

    public boolean method_63626(class07085 class070852) {
        return class070852 == class07085.field_55946 || super.method_63626(class070852);
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.GP;
    }

    public class03556<class04891> method_66667(class07085 class070852, class06584 class065842, class08725 class087252) {
        if (class070852 == class07085.field_55946) {
            return class04909.Gs;
        }
        return super.method_66667(class070852, class065842, class087252);
    }

    public class06889 method_49482(class08036 class080362, class06889 class068892) {
        return new class06889(0.0, 0.0, 1.0);
    }

    public boolean method_56991(class07085 class070852) {
        if (class070852 == class07085.field_55946) {
            return this.method_5805() && !this.method_6109();
        }
        return super.method_56991(class070852);
    }
}

