/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00869
 *  minecraft.class01164
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
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05310
 *  minecraft.class05487
 *  minecraft.class06273
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07172
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07542
 *  minecraft.class07649
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07962
 *  minecraft.class07984
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08045
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00869;
import minecraft.class01164;
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
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05310;
import minecraft.class05487;
import minecraft.class06273;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07172;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07542;
import minecraft.class07649;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07984;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08045;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07888
extends class07649
implements class05310,
class07172 {
    private static final class02131<Byte> N = class03289.N(class07888.class, (class04383)class02154.N);
    private static final byte y = 16;
    private static final boolean L = true;

    public static class05300 M() {
        return class07079.H().N(class05298.n, 4.0).N(class05298.l, (double)0.2f);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)16);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Pumpkin", this.B());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("Pumpkin", true));
    }

    public class07888(class07078<? extends class07888> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public boolean B() {
        return ((Byte)this.field_6011.N(N) & 0x10) != 0;
    }

    protected @Nullable class04891 s() {
        return class04909.YS;
    }

    public boolean d() {
        return this.method_5805() && this.B();
    }

    public void N(class07438 class074382, float f) {
        double d = class074382.method_23317() - this.method_23317();
        double d2 = class074382.method_23320() - (double)1.1f;
        double d3 = class074382.method_23321() - this.method_23321();
        double d4 = Math.sqrt(d * d + d3 * d3) * (double)0.2f;
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class072992 = new class06584((class07310)class06570.jP);
            class08005.N((class08005)new class08045((class07299)class047822, (class07438)this, (class06584)class072992), (class04782)class047822, (class06584)class072992, class080452 -> class080452.N(d, d2 + d4 - class080452.method_23318(), d3, 1.6f, 12.0f));
        }
        this.method_5783(class04909.Yh, 1.0f, 0.4f / (this.method_59922().z() * 0.4f + 0.8f));
    }

    public void N(boolean bl) {
        byte by = (Byte)this.field_6011.N(N);
        if (bl) {
            this.field_6011.N(N, (Object)((byte)(by | 0x10)));
        } else {
            this.field_6011.N(N, (Object)((byte)(by & 0xFFFFFFEF)));
        }
    }

    public void N(class04782 class047823, class04911 class049112, class06584 class065843) {
        class047823.method_43129(null, (class07049)this, class04909.Yr, class049112, 1.0f, 1.0f);
        this.N(false);
        this.method_61419(class047823, class06273.yN, class065843, (class047822, class065842) -> this.method_5699((class04782)class047822, (class06584)class065842, this.method_5751()));
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
        return class07082.i;
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.75f * this.method_5751()), (double)(this.method_17681() * 0.4f));
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07984((class07172)this, 1.25, 20, 10.0f));
        this.e.N(2, (class07473)new class07957((class07475)this, 1.0, 1.0000001E-5f));
        this.e.N(3, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(4, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07952((class07079)this, class07079.class, 10, true, false, (class074382, class047822) -> class074382 instanceof class07542));
    }

    public @Nullable class04891 method_6002() {
        return class04909.Yx;
    }

    public void method_6007() {
        super.method_6007();
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (((Boolean)class047822.method_75728().N(class00608.V, this.method_73189())).booleanValue()) {
                this.method_64397(class047822, this.method_48923().u(), 1.0f);
            }
            if (!((Boolean)class047822.method_64395().N(class07305.I)).booleanValue()) {
                return;
            }
            class072992 = class00869.is.W();
            for (int i = 0; i < 4; ++i) {
                int n = class04995.N((double)(this.method_23317() + (double)((float)(i % 2 * 2 - 1) * 0.25f)));
                int n2 = class04995.N((double)this.method_23318());
                int n3 = class04995.N((double)(this.method_23321() + (double)((float)(i / 2 % 2 * 2 - 1) * 0.25f)));
                class07209 class072092 = new class07209(n, n2, n3);
                if (!this.method_73183().method_8320(class072092).P() || !class072992.N((class05487)this.method_73183(), class072092)) continue;
                this.method_73183().method_8501(class072092, (class00500)class072992);
                this.method_73183().N((class03556)class01194.Z, class072092, class01164.N((class07049)this, (class00500)class072992));
            }
        }
    }

    public boolean method_29503() {
        return true;
    }

    public @Nullable class04891 method_6011(class07072 class070722) {
        return class04909.YD;
    }
}

