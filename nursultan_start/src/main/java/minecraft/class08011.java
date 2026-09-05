/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09385
 *  Nursultan.class10474
 *  minecraft.class00245
 *  minecraft.class00392
 *  minecraft.class00675
 *  minecraft.class00703
 *  minecraft.class01001
 *  minecraft.class01042
 *  minecraft.class02251
 *  minecraft.class04782
 *  minecraft.class04877
 *  minecraft.class04882
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05459
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06171
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07086
 *  minecraft.class07150
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07427
 *  minecraft.class07446
 *  minecraft.class07464
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07625
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09385;
import Nursultan.class10474;
import java.util.function.Predicate;
import minecraft.class00245;
import minecraft.class00392;
import minecraft.class00675;
import minecraft.class00703;
import minecraft.class01001;
import minecraft.class01042;
import minecraft.class02251;
import minecraft.class04782;
import minecraft.class04877;
import minecraft.class04882;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05459;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06171;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07086;
import minecraft.class07150;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07427;
import minecraft.class07446;
import minecraft.class07464;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07625;
import minecraft.class07952;
import minecraft.class07962;
import minecraft.class07978;
import minecraft.class07989;
import minecraft.class07999;
import minecraft.class08010;
import minecraft.class08036;
import minecraft.class08046;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class08011
extends class00675 {
    private static final String R = "Johnny";
    static final Predicate<class07086> N = class070862 -> class070862 == class07086.field_5802 || class070862 == class07086.field_5807;
    private static final boolean M = false;
    boolean y = false;

    public class00703 M() {
        if (this.Nl()) {
            return class00703.field_7211;
        }
        if (this.Ng()) {
            return class00703.field_19012;
        }
        return class00703.field_7207;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        if (this.y) {
            class083292.N(R, true);
        }
    }

    public void method_5665(@Nullable class00392 class003922) {
        super.method_5665(class003922);
        if (!this.y && class003922 != null && class003922.getString().equals(R)) {
            this.y = true;
        }
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.y = class082992.N(R, false);
    }

    public class08011(class07078<? extends class08011> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public static class05300 B() {
        return class07150.Y().N(class05298.l, (double)0.35f).N(class05298.P, 12.0).N(class05298.n, 24.0).N(class05298.u, 5.0);
    }

    protected class04891 s() {
        return class04909.gg;
    }

    public class04891 E() {
        return class04909.gI;
    }

    public void N(class04782 class047822, int n, boolean bl) {
        class06584 class065842 = new class06584((class07310)class06570.TV);
        class04877 class048772 = this.K();
        if (this.field_5974.z() <= class048772.b()) {
            class05946 var7 = n > class048772.N(class07086.field_5802) ? class02251.R : class02251.i;
            class07323.N((class06584)class065842, (class01042)class047822.method_30349(), (class05946)var7, (class07052)class047822.method_8404(this.method_24515()), (class06069)this.field_5974);
        }
        this.method_5673(class07085.field_6173, class065842);
    }

    protected void N(class06069 class060692, class07052 class070522) {
        if (this.K() == null) {
            this.method_5673(class07085.field_6173, new class06584((class07310)class06570.TV));
        }
    }

    static /* synthetic */ class06069 N(class08011 class080112) {
        return class080112.field_5974;
    }

    protected void N(class04782 class047822) {
        if (!this.Nt() && class05459.N((class07079)this)) {
            boolean bl = class047822.method_19503(this.method_24515());
            this.f().y(bl);
        }
        super.N(class047822);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class07446 class074463 = super.N(class010012, class070522, class061132, class074462);
        this.f().y(true);
        class06069 class060692 = class010012.method_8409();
        this.N(class060692, class070522);
        this.N(class010012, class060692, class070522);
        return class074463;
    }

    protected void l_() {
        super.l_();
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class07464((class07475)this, class00245.class, 8.0f, 1.0, 1.2));
        this.e.N(2, (class07473)new class08010((class07079)this));
        this.e.N(3, (class07473)new class09385((class00675)this, (class04882)this));
        this.e.N(4, (class07473)new class10474((class00675)this, 10.0f));
        this.e.N(5, (class07473)new class07999((class07475)this, 1.0, false));
        this.H.N(1, (class07473)new class07989((class07475)this, class04882.class).N(new Class[0]));
        this.H.N(2, new class07952<class08036>((class07079)this, class08036.class, true));
        this.H.N(3, new class07952<class06171>((class07079)this, class06171.class, true));
        this.H.N(3, new class07952<class07625>((class07079)this, class07625.class, true));
        this.H.N(4, (class07473)new class08046(this));
        this.e.N(8, (class07473)new class07978((class07475)this, 0.6));
        this.e.N(9, (class07473)new class07962((class07079)this, class08036.class, 3.0f, 1.0f));
        this.e.N(10, (class07473)new class07962((class07079)this, class07079.class, 8.0f));
    }

    public class04891 method_6002() {
        return class04909.gJ;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.go;
    }
}

