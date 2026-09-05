/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01001
 *  minecraft.class01042
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01929
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02204
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05946
 *  minecraft.class06113
 *  minecraft.class06273
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07067
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
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
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08423
 *  minecraft.class08427
 *  minecraft.class08577
 *  minecraft.class08579
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class01001;
import minecraft.class01042;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01929;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02204;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05946;
import minecraft.class06113;
import minecraft.class06273;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07067;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
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
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08423;
import minecraft.class08427;
import minecraft.class08577;
import minecraft.class08579;
import org.jspecify.annotations.Nullable;

public class class07628
extends class07633 {
    private static final class01325 B = class07078.Q.E().N(0.5f).y(0.2975f);
    private static final class02131<class03556<class08423>> Z = class03289.N(class07628.class, (class04383)class02154.l);
    private static final boolean X = false;
    public float N;
    public float y;
    public float L;
    public float u;
    public float i = 1.0f;
    private float p = 1.0f;
    public int R = this.field_5974.y(6000) + 6000;
    public boolean M = false;

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.Np);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(Z, (Object)class08577.N((class01042)this.method_56673(), (class05946)class08427.N));
    }

    protected void method_5801() {
        this.p = this.field_28627 + this.y / 2.0f;
    }

    protected boolean method_5776() {
        return this.field_28627 > this.p;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.RG, 0.15f, 1.0f);
    }

    @Override
    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("IsChickenJockey", this.M);
        class083292.N("EggLayTime", this.R);
        class08577.N((class08329)class083292, this.W());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.Np) {
            return (T)class07628.method_66651(class024772, (Object)new class02204(this.W()));
        }
        return (T)super.method_58694(class024772);
    }

    @Override
    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.M = class082992.N("IsChickenJockey", false);
        class082992.i("EggLayTime").ifPresent(n -> {
            this.R = n;
        });
        class08577.N((class08299)class082992, (class05946)class04227.NS).ifPresent(this::N);
    }

    protected void method_5865(class07049 class070492, class07067 class070672) {
        super.method_5865(class070492, class070672);
        if (class070492 instanceof class07438) {
            ((class07438)class070492).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
        }
    }

    public class07628(class07078<? extends class07628> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_18, 0.0f);
    }

    public static class05300 B() {
        return class07633.Ne().N(class05298.n, 4.0).N(class05298.l, 0.25);
    }

    protected class04891 s() {
        return class04909.Rj;
    }

    public boolean m() {
        return this.M;
    }

    public void N(boolean bl) {
        this.M = bl;
    }

    public @Nullable class07628 y(class04782 class047822, class07077 class070772) {
        class07628 class076282 = (class07628)class07078.Q.N((class07299)class047822, class06113.field_16466);
        if (class076282 != null && class070772 instanceof class07628) {
            class07628 class076283 = (class07628)class070772;
            class076282.N(this.field_5974.Z() ? this.W() : class076283.W());
        }
        return class076282;
    }

    @Override
    public boolean N(double d) {
        return this.m();
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class08577.N((class08579)class08579.N((class01001)class010012, (class07209)this.method_24515()), (class05946)class04227.NS).ifPresent(this::N);
        return super.N(class010012, class070522, class061132, class074462);
    }

    @Override
    public boolean N(class06584 class065842) {
        return class065842.N(class01226.NA);
    }

    public void N(class03556<class08423> class035562) {
        this.field_6011.N(Z, class035562);
    }

    public class03556<class08423> W() {
        return (class03556)this.field_6011.N(Z);
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.Np) {
            Optional var3 = ((class02204)class07628.method_66651((class02477)class02484.Np, t)).N((class01929)this.method_56673());
            if (var3.isPresent()) {
                this.N((class03556<class08423>)((class03556)var3.get()));
                return true;
            }
            return false;
        }
        return super.method_66654(class024772, t);
    }

    protected void l_() {
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class07993((class07475)this, 1.4));
        this.e.N(2, (class07473)new class07434((class07633)this, 1.0));
        this.e.N(3, (class07473)new class07960((class07475)this, 1.0, class065842 -> class065842.N(class01226.NA), false));
        this.e.N(4, (class07473)new class07459((class07633)this, 1.1));
        this.e.N(5, (class07473)new class07957((class07475)this, 1.0));
        this.e.N(6, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(7, (class07473)new class07956((class07079)this));
    }

    @Override
    public int method_6110(class04782 class047822) {
        if (this.m()) {
            return 10;
        }
        return super.method_6110(class047822);
    }

    public class04891 method_6002() {
        return class04909.Rv;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? B : super.method_55694(class013122);
    }

    @Override
    public void method_6007() {
        super.method_6007();
        this.u = this.N;
        this.L = this.y;
        this.y += (this.method_24828() ? -1.0f : 4.0f) * 0.3f;
        this.y = class04995.N((float)this.y, (float)0.0f, (float)1.0f);
        if (!this.method_24828() && this.i < 1.0f) {
            this.i = 1.0f;
        }
        this.i *= 0.9f;
        class06889 class068892 = this.method_18798();
        if (!this.method_24828() && class068892.B < 0.0) {
            this.method_18799(class068892.u(1.0, 0.6, 1.0));
        }
        this.N += this.i * 2.0f;
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (this.method_5805() && !this.method_6109() && !this.m() && --this.R <= 0) {
                if (this.method_64169(class047822, class06273.Nq, (arg_0, arg_1) -> ((class07628)this).method_5775(arg_0, arg_1))) {
                    this.method_5783(class04909.Rn, 1.0f, (this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f);
                    this.method_32876((class03556)class01194.v);
                }
                this.R = this.field_5974.y(6000) + 6000;
            }
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Rt;
    }
}

