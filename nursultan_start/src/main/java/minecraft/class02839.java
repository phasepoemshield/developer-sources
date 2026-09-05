/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01194
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05310
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07528
 *  minecraft.class08007
 *  minecraft.class08036
 *  minecraft.class08037
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01194;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05310;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07528;
import minecraft.class08007;
import minecraft.class08036;
import minecraft.class08037;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class02839
extends class07528
implements class05310 {
    private static final class02131<Boolean> L = class03289.N(class02839.class, (class04383)class02154.U);
    private static final String u = "sheared";
    private static final boolean i = false;

    private void L(class04782 class047823, class06584 class065843) {
        this.method_61419(class047823, class06273.Nx, class065843, (class047822, class065842) -> this.method_5699((class04782)class047822, (class06584)class065842, this.method_17682()));
    }

    public static class05300 M() {
        return class07528.m().N(class05298.n, 16.0);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(L, (Object)false);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N(u, this.t());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N(u, false));
    }

    public class02839(class07078<? extends class02839> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected class04891 B() {
        return class04909.LO;
    }

    protected class04891 s() {
        return class04909.Lw;
    }

    public boolean d() {
        return !this.t() && this.method_5805();
    }

    public boolean t() {
        return (Boolean)this.field_6011.N(L);
    }

    protected int E() {
        return 50;
    }

    public void N(class04782 class047822, class04911 class049112, class06584 class065842) {
        class047822.method_43129(null, (class07049)this, class04909.LQ, class049112, 1.0f, 1.0f);
        this.L(class047822, class065842);
        this.N(true);
    }

    protected class08007 N(class06584 class065842, float f, @Nullable class06584 class065843) {
        class08007 class080072 = super.N(class065842, f, class065843);
        if (class080072 instanceof class08037) {
            ((class08037)class080072).N(new class07055(class07047.j, 100));
        }
        return class080072;
    }

    protected class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.N(class06570.vr) && this.d()) {
            class07299 class072992 = this.method_73183();
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                this.N(class047822, class04911.field_15248, class065842);
                this.method_32875((class03556)class01194.H, (class07049)class080362);
                class065842.N(1, (class07438)class080362, class070502.N());
            }
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    public void N(boolean bl) {
        this.field_6011.N(L, (Object)bl);
    }

    protected int W() {
        return 70;
    }

    public class04891 method_6002() {
        return class04909.Lk;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.LY;
    }
}

