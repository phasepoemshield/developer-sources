/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01226
 *  minecraft.class03530
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06842
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07086
 *  minecraft.class07150
 *  minecraft.class07172
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07452
 *  minecraft.class07625
 *  minecraft.class07872
 *  minecraft.class07894
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07962
 *  minecraft.class07981
 *  minecraft.class07989
 *  minecraft.class07996
 *  minecraft.class07999
 *  minecraft.class08005
 *  minecraft.class08007
 *  minecraft.class08036
 *  minecraft.class08038
 *  minecraft.class08299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01226;
import minecraft.class03530;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06842;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07086;
import minecraft.class07150;
import minecraft.class07172;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07452;
import minecraft.class07464;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07562;
import minecraft.class07625;
import minecraft.class07872;
import minecraft.class07894;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07981;
import minecraft.class07989;
import minecraft.class07996;
import minecraft.class07999;
import minecraft.class08005;
import minecraft.class08007;
import minecraft.class08036;
import minecraft.class08038;
import minecraft.class08299;
import org.jspecify.annotations.Nullable;

public abstract class class07528
extends class07150
implements class07172 {
    private static final int L = 20;
    private static final int u = 40;
    protected static final int N = 50;
    protected static final int y = 70;
    private final class07996<class07528> i = new class07996((class07150)this, 1.0, 20, 15.0f);
    private final class07999 R = new class07562(this, (class07475)((Object)this), 1.2, false);

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(this.B(), 0.15f, 1.0f);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.v();
    }

    public void method_5842() {
        super.method_5842();
        class07049 class070492 = this.method_49694();
        if (class070492 instanceof class07475) {
            class07475 class074752 = (class07475)class070492;
            ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(((class07438)class074752).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
        }
    }

    public class07528(class07078<? extends class07528> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.v();
    }

    abstract class04891 B();

    public boolean n() {
        return this.method_32314();
    }

    public static class05300 m() {
        return class07150.Y().N(class05298.l, 0.25);
    }

    public void v() {
        if (this.method_73183() == null || this.method_73183().method_8608()) {
            return;
        }
        this.e.N((class07473)this.R);
        this.e.N((class07473)this.i);
        if (this.method_5998(class08038.N((class07438)this, (class06581)class06570.sx)).N(class06570.sx)) {
            int n = this.E();
            if (this.method_73183().y() != class07086.field_5807) {
                n = this.W();
            }
            this.i.L(n);
            this.e.N(4, (class07473)this.i);
        } else {
            this.e.N(4, (class07473)this.R);
        }
    }

    public boolean y(class04782 class047822, class06584 class065842) {
        if (class065842.N(class01226.LR)) {
            return false;
        }
        return super.y(class047822, class065842);
    }

    public boolean y(class06584 class065842) {
        return class065842.B() == class06570.sx;
    }

    protected int E() {
        return 20;
    }

    protected void N(class06069 class060692, class07052 class070522) {
        super.N(class060692, class070522);
        this.method_5673(class07085.field_6173, new class06584((class07310)class06570.sx));
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class074462 = super.N(class010012, class070522, class061132, class074462);
        class06069 class060692 = class010012.method_8409();
        this.N(class060692, class070522);
        this.N(class010012, class060692, class070522);
        this.v();
        this.L(class060692.z() < 0.55f * class070522.u());
        if (this.method_6118(class07085.field_6169).R() && class06842.y() && class060692.z() < 0.25f) {
            this.method_5673(class07085.field_6169, new class06584((class07310)(class060692.z() < 0.1f ? class00869.iV : class00869.iK)));
            this.N(class07085.field_6169, 0.0f);
        }
        return class074462;
    }

    public class08007 N(class06584 class065842, float f, @Nullable class06584 class065843) {
        return class08038.N((class07438)this, (class06584)class065842, (float)f, (class06584)class065843);
    }

    public void N(class07438 class074382, float f) {
        class06584 class065842 = this.method_5998(class08038.N((class07438)this, (class06581)class06570.sx));
        class06584 class065843 = this.method_18808(class065842);
        class08007 class080072 = this.N(class065843, f, class065842);
        double d = class074382.method_23317() - this.method_23317();
        double d2 = class074382.method_23323(0.3333333333333333) - class080072.method_23318();
        double d3 = class074382.method_23321() - this.method_23321();
        double d4 = Math.sqrt(d * d + d3 * d3);
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class08005.N((class08005)class080072, (class04782)class047822, (class06584)class065843, (double)d, (double)(d2 + d4 * (double)0.2f), (double)d3, (float)1.6f, (float)(14 - class047822.y().N() * 4));
        }
        this.method_5783(class04909.kn, 1.0f, 1.0f / (this.method_59922().z() * 0.4f + 0.8f));
    }

    protected int W() {
        return 40;
    }

    protected void l_() {
        this.e.N(2, (class07473)new class07981((class07475)((Object)this)));
        this.e.N(3, (class07473)new class07452((class07475)((Object)this), 1.0));
        this.e.N(3, new class07464<class07894>((class07475)((Object)this), class07894.class, 6.0f, 1.0, 1.2));
        this.e.N(5, (class07473)new class07957((class07475)((Object)this), 1.0));
        this.e.N(6, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(6, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07989((class07475)((Object)this), new Class[0]));
        this.H.N(2, (class07473)new class07952((class07079)this, class08036.class, true));
        this.H.N(3, (class07473)new class07952((class07079)this, class07625.class, true));
        this.H.N(3, (class07473)new class07952((class07079)this, class07872.class, 10, true, false, class07872.y));
    }

    public class03530<class06581> NL() {
        return class01226.Lm;
    }

    public void method_6116(class07085 class070852, class06584 class065842, class06584 class065843) {
        super.method_6116(class070852, class065842, class065843);
        if (!this.method_73183().method_8608()) {
            this.v();
        }
    }
}

