/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class01001
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05310
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06273
 *  minecraft.class06563
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07434
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07459
 *  minecraft.class07465
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07633
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07960
 *  minecraft.class07962
 *  minecraft.class07993
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08416
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00717;
import minecraft.class01001;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05310;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06273;
import minecraft.class06563;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07434;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07459;
import minecraft.class07465;
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
import minecraft.class08416;
import org.jspecify.annotations.Nullable;

public class class07881
extends class07633
implements class05310 {
    private static final int N = 40;
    private static final class02131<Byte> y = class03289.N(class07881.class, (class04383)class02154.N);
    private static final class06563 L = class06563.field_7952;
    private static final boolean u = false;
    private int i;
    private class07465 R;

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.Nr);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(y, (Object)0);
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.wl, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Sheared", this.m());
        class083292.N("Color", class06563.field_56666, (Object)this.W());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.Nr) {
            return (T)class07881.method_66651(class024772, (Object)this.W());
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("Sheared", false));
        this.N(class082992.N("Color", class06563.field_56666).orElse(L));
    }

    public void method_5711(byte by) {
        if (by == 10) {
            this.i = 40;
        } else {
            super.method_5711(by);
        }
    }

    public class07881(class07078<? extends class07881> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public static class05300 B() {
        return class07633.Ne().N(class05298.n, 8.0).N(class05298.l, (double)0.23f);
    }

    public float i(float f) {
        if (this.i > 4 && this.i <= 36) {
            float f2 = ((float)(this.i - 4) - f) / 32.0f;
            return 0.62831855f + 0.21991149f * class04995.m((double)(f2 * 28.7f));
        }
        if (this.i > 0) {
            return 0.62831855f;
        }
        return this.method_61414(f) * ((float)Math.PI / 180);
    }

    public void x() {
        super.x();
        this.N(false);
        if (this.method_6109()) {
            this.L(60);
        }
    }

    protected class04891 s() {
        return class04909.wv;
    }

    public boolean d() {
        return this.method_5805() && !this.m() && !this.method_6109();
    }

    public boolean m() {
        return ((Byte)this.field_6011.N(y) & 0x10) != 0;
    }

    public float u(float f) {
        if (this.i <= 0) {
            return 0.0f;
        }
        if (this.i >= 4 && this.i <= 36) {
            return 1.0f;
        }
        if (this.i < 4) {
            return ((float)this.i - f) / 4.0f;
        }
        return -((float)(this.i - 40) - f) / 4.0f;
    }

    public void N(boolean bl) {
        byte by = (Byte)this.field_6011.N(y);
        if (bl) {
            this.field_6011.N(y, (Object)((byte)(by | 0x10)));
        } else {
            this.field_6011.N(y, (Object)((byte)(by & 0xFFFFFFEF)));
        }
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        this.N(class07881.N(class010012, this.method_24515()));
        return super.N(class010012, class070522, class061132, class074462);
    }

    public static class06563 N(class01001 class010012, class07209 class072092) {
        return class08416.N((class03556)class010012.i(class072092), (class06069)class010012.method_8409());
    }

    public @Nullable class07881 y(class04782 class047822, class07077 class070772) {
        class07881 class078812 = (class07881)class07078.yz.N((class07299)class047822, class06113.field_16466);
        if (class078812 != null) {
            class06563 class065632 = this.W();
            class06563 class065633 = ((class07881)class070772).W();
            class078812.N(class06563.N((class04782)class047822, (class06563)class065632, (class06563)class065633));
        }
        return class078812;
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.N(class06570.vr)) {
            class07299 class072992 = this.method_73183();
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                if (this.d()) {
                    this.N(class047822, class04911.field_15248, class065842);
                    this.method_32875((class03556)class01194.H, (class07049)class080362);
                    class065842.N(1, (class07438)class080362, class070502.N());
                    return class07082.y;
                }
            }
            return class07082.L;
        }
        return super.N(class080362, class070502);
    }

    public void N(class06563 class065632) {
        byte by = (Byte)this.field_6011.N(y);
        this.field_6011.N(y, (Object)((byte)(by & 0xF0 | class065632.N() & 0xF)));
    }

    protected void N(class04782 class047822) {
        this.i = this.R.M();
        super.N(class047822);
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.NJ);
    }

    public void N(class04782 class047823, class04911 class049112, class06584 class065843) {
        class047823.method_43129(null, (class07049)this, class04909.wG, class049112, 1.0f, 1.0f);
        this.method_61419(class047823, class06273.yy, class065843, (class047822, class065842) -> {
            for (int i = 0; i < class065842.c(); ++i) {
                class00717 class007172 = this.method_5699((class04782)class047822, class065842.L(1), 1.0f);
                if (class007172 == null) continue;
                class007172.method_18799(class007172.method_18798().y((double)((this.field_5974.z() - this.field_5974.z()) * 0.1f), (double)(this.field_5974.z() * 0.05f), (double)((this.field_5974.z() - this.field_5974.z()) * 0.1f)));
            }
        });
        this.N(true);
    }

    public class06563 W() {
        return class06563.N((int)((Byte)this.field_6011.N(y) & 0xF));
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.Nr) {
            this.N((class06563)class07881.method_66651((class02477)class02484.Nr, t));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    protected void l_() {
        this.R = new class07465((class07079)this);
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class07993((class07475)this, 1.25));
        this.e.N(2, (class07473)new class07434((class07633)this, 1.0));
        this.e.N(3, (class07473)new class07960((class07475)this, 1.1, class065842 -> class065842.N(class01226.NJ), false));
        this.e.N(4, (class07473)new class07459((class07633)this, 1.1));
        this.e.N(5, (class07473)this.R);
        this.e.N(6, (class07473)new class07957((class07475)this, 1.0));
        this.e.N(7, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(8, (class07473)new class07956((class07079)this));
    }

    public class04891 method_6002() {
        return class04909.wn;
    }

    public void method_6007() {
        if (this.method_73183().method_8608()) {
            this.i = Math.max(0, this.i - 1);
        }
        super.method_6007();
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.wt;
    }
}

