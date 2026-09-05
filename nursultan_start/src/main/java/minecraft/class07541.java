/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10764
 *  minecraft.class00143
 *  minecraft.class01001
 *  minecraft.class01226
 *  minecraft.class01231
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03557
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class05538
 *  minecraft.class05573
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06171
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07086
 *  minecraft.class07172
 *  minecraft.class07182
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07451
 *  minecraft.class07623
 *  minecraft.class07625
 *  minecraft.class07872
 *  minecraft.class07952
 *  minecraft.class07978
 *  minecraft.class07989
 *  minecraft.class08004
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08187
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10764;
import minecraft.class00143;
import minecraft.class01001;
import minecraft.class01226;
import minecraft.class01231;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03557;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class05538;
import minecraft.class05573;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06171;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07086;
import minecraft.class07172;
import minecraft.class07182;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07451;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07517;
import minecraft.class07522;
import minecraft.class07532;
import minecraft.class07537;
import minecraft.class07554;
import minecraft.class07566;
import minecraft.class07623;
import minecraft.class07625;
import minecraft.class07872;
import minecraft.class07952;
import minecraft.class07978;
import minecraft.class07989;
import minecraft.class08004;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08187;
import org.jspecify.annotations.Nullable;

public class class07541
extends class08004
implements class07172 {
    public static final float N = 0.03f;
    private static final float M = 0.5f;
    public boolean y;

    public static class05300 M() {
        return class08004.l().N(class05298.O, 1.0);
    }

    public boolean method_5675() {
        return !this.method_5681();
    }

    public void method_5790() {
        if (!this.method_73183().method_8608()) {
            this.method_5796(this.method_6034() && this.method_5869() && this.v());
        }
    }

    protected class04891 method_5737() {
        return class04909.zv;
    }

    public void method_5842() {
        super.method_5842();
        class07049 class070492 = this.method_49694();
        if (class070492 instanceof class07475) {
            class07475 class074752 = (class07475)class070492;
            ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(((class07438)class074752).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
        }
    }

    public boolean method_20232() {
        return this.method_5681() && !this.method_5765();
    }

    public class07541(class07078<? extends class07541> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class10764(this);
        this.N(class04425.field_18, 0.0f);
    }

    protected void B() {
        this.e.N(1, new class07522((class07475)((Object)this), 1.0));
        this.e.N(2, (class07473)((Object)new class07532(this, 1.0, 40, 10.0f)));
        this.e.N(2, (class07473)((Object)new class07566(this, 1.0, false)));
        this.e.N(5, (class07473)((Object)new class07537(this, 1.0)));
        this.e.N(6, new class07554(this, 1.0, this.method_73183().method_8615()));
        this.e.N(7, (class07473)new class07978((class07475)((Object)this), 1.0));
        this.H.N(1, (class07473)new class07989((class07475)((Object)this), new Class[]{class07541.class}).N(new Class[]{class07182.class}));
        this.H.N(2, (class07473)new class07952((class07079)this, class08036.class, 10, true, false, (class074382, class047822) -> this.N(class074382)));
        this.H.N(3, (class07473)new class07952((class07079)this, class06171.class, false));
        this.H.N(3, (class07473)new class07952((class07079)this, class07625.class, true));
        this.H.N(3, (class07473)new class07952((class07079)this, class05538.class, true, false));
        this.H.N(5, (class07473)new class07952((class07079)this, class07872.class, 10, true, false, class07872.y));
    }

    protected class04891 s() {
        if (this.method_5799()) {
            return class04909.zW;
        }
        return class04909.zE;
    }

    protected boolean n() {
        class07209 class072092;
        class00143 class001432 = this.f().Z();
        return class001432 != null && (class072092 = class001432.E()) != null && this.method_5649(class072092.method_10263(), class072092.method_10264(), class072092.method_10260()) < 4.0;
    }

    protected boolean m() {
        return false;
    }

    public boolean v() {
        if (this.y) {
            return true;
        }
        class07438 class074382 = this.T();
        return class074382 != null && class074382.method_5799();
    }

    public boolean y(class04782 class047822, class06584 class065842) {
        if (class065842.N(class01226.LR)) {
            return false;
        }
        return super.y(class047822, class065842);
    }

    private static boolean N(class07284 class072842, class07209 class072092) {
        return class072092.method_10264() < class072842.method_8615() - 5;
    }

    public static boolean N(class07078<class07541> class070782, class01001 class010012, class06113 class061132, class07209 class072092, class06069 class060692) {
        boolean bl;
        if (!class010012.method_8316(class072092.method_10074()).N(class01231.N) && !class06113.N((class06113)class061132)) {
            return false;
        }
        class03556 class035562 = class010012.i(class072092);
        boolean bl2 = bl = !(class010012.y() == class07086.field_5801 || !class06113.y((class06113)class061132) && !class07541.N((class01001)class010012, (class07209)class072092, (class06069)class060692) || !class06113.N((class06113)class061132) && !class010012.method_8316(class072092).N(class01231.N));
        if (bl && (class06113.N((class06113)class061132) || class061132 == class06113.field_16463)) {
            return true;
        }
        if (class035562.N(class03557.NW)) {
            return class060692.y(15) == 0 && bl;
        }
        return class060692.y(40) == 0 && class07541.N((class07284)class010012, class072092) && bl;
    }

    protected class07623 N(class07299 class072992) {
        return new class05573((class07079)this, class072992);
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class08187 class081872;
        class074462 = super.N(class010012, class070522, class061132, class074462);
        if (this.method_6118(class07085.field_6171).R() && class010012.method_8409().z() < 0.03f) {
            this.method_5673(class07085.field_6171, new class06584((class07310)class06570.dj));
            this.N(class07085.field_6171);
        }
        if ((class061132 == class06113.field_16459 || class061132 == class06113.field_16474) && this.method_6047().N(class06570.db) && class010012.method_8409().z() < 0.5f && !this.method_6109() && !class010012.i(this.method_24515()).N(class03557.NW) && (class081872 = (class08187)class07078.yh.N(this.method_73183(), class06113.field_16460)) != null) {
            if (class061132 == class06113.field_16474) {
                class081872.NW();
            }
            class081872.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0f);
            class081872.N(class010012, class070522, class061132, null);
            this.method_5873((class07049)class081872, false, false);
            class010012.method_8649((class07049)class081872);
        }
        return class074462;
    }

    public void N(class07438 class074382, float f) {
        class06584 class065842 = this.method_6047();
        class06584 class065843 = class065842.N(class06570.db) ? class065842 : new class06584((class07310)class06570.db);
        class07517 class075172 = new class07517(this.method_73183(), (class07438)this, class065843);
        double d = class074382.method_23317() - this.method_23317();
        double d2 = class074382.method_23323(0.3333333333333333) - class075172.method_23318();
        double d3 = class074382.method_23321() - this.method_23321();
        double d4 = Math.sqrt(d * d + d3 * d3);
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class08005.N((class08005)class075172, (class04782)class047822, (class06584)class065843, (double)d, (double)(d2 + d4 * (double)0.2f), (double)d3, (float)1.6f, (float)(14 - this.method_73183().y().N() * 4));
        }
        this.method_5783(class04909.zb, 1.0f, 1.0f / (this.method_59922().z() * 0.4f + 0.8f));
    }

    public void N(boolean bl) {
        this.y = bl;
    }

    protected boolean N(class06584 class065842, class06584 class065843, class07085 class070852) {
        if (class065843.N(class06570.dj)) {
            return false;
        }
        return super.N(class065842, class065843, class070852);
    }

    public boolean N(class05487 class054872) {
        return class054872.method_8606((class07049)this);
    }

    public boolean N(@Nullable class07438 class074382) {
        if (class074382 != null) {
            return !this.method_73183().method_8530() || class074382.method_5799();
        }
        return false;
    }

    protected void N(class06069 class060692, class07052 class070522) {
        if ((double)class060692.z() > 0.9) {
            if (class060692.y(16) < 10) {
                this.method_5673(class07085.field_6173, new class06584((class07310)class06570.db));
            } else {
                this.method_5673(class07085.field_6173, new class06584((class07310)class06570.jr));
            }
        }
    }

    public class03530<class06581> NL() {
        return class01226.LP;
    }

    public class04891 method_6002() {
        if (this.method_5799()) {
            return class04909.zP;
        }
        return class04909.zm;
    }

    public class04891 method_6011(class07072 class070722) {
        if (this.method_5799()) {
            return class04909.zT;
        }
        return class04909.zs;
    }

    public void method_76087(class06889 class068892, double d, boolean bl, double d2) {
        if (this.method_5869() && this.v()) {
            this.method_5724(0.01f, class068892);
            this.method_5784(class07451.field_6308, this.method_18798());
            this.method_18799(this.method_18798().L(0.9));
        } else {
            super.method_76087(class068892, d, bl, d2);
        }
    }

    protected class04891 X_() {
        return class04909.zj;
    }

    protected boolean Y_() {
        return true;
    }
}

