/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00245
 *  minecraft.class00703
 *  minecraft.class01001
 *  minecraft.class04782
 *  minecraft.class04882
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06113
 *  minecraft.class06171
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07427
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07464
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07625
 *  minecraft.class07952
 *  minecraft.class07962
 *  minecraft.class07978
 *  minecraft.class07989
 *  minecraft.class07996
 *  minecraft.class08005
 *  minecraft.class08007
 *  minecraft.class08036
 *  minecraft.class08038
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00245;
import minecraft.class00703;
import minecraft.class01001;
import minecraft.class04782;
import minecraft.class04882;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06113;
import minecraft.class06171;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07148;
import minecraft.class07150;
import minecraft.class07163;
import minecraft.class07167;
import minecraft.class07172;
import minecraft.class07179;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07427;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07464;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07625;
import minecraft.class07952;
import minecraft.class07962;
import minecraft.class07978;
import minecraft.class07989;
import minecraft.class07996;
import minecraft.class08005;
import minecraft.class08007;
import minecraft.class08036;
import minecraft.class08038;
import org.jspecify.annotations.Nullable;

public class class07149
extends class07148
implements class07172 {
    private static final int R = 4;
    private static final int M = 3;
    public static final int N = 3;
    private int B;
    private final class06889[][] Z;

    @Override
    public class00703 M() {
        if (this.n()) {
            return class00703.field_7212;
        }
        if (this.Nl()) {
            return class00703.field_7208;
        }
        return class00703.field_7207;
    }

    public class07149(class07078<? extends class07149> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 5;
        this.Z = new class06889[2][4];
        for (int i = 0; i < 4; ++i) {
            this.Z[0][i] = class06889.L;
            this.Z[1][i] = class06889.L;
        }
    }

    public static class05300 B() {
        return class07150.Y().N(class05298.l, 0.5).N(class05298.P, 18.0).N(class05298.n, 32.0);
    }

    protected class04891 s() {
        return class04909.su;
    }

    @Override
    protected class04891 m() {
        return class04909.si;
    }

    public class06889[] u(float f) {
        if (this.B <= 0) {
            return this.Z[1];
        }
        double d = ((float)this.B - f) / 3.0f;
        d = Math.pow(d, 0.25);
        class06889[] class06889Array = new class06889[4];
        for (int i = 0; i < 4; ++i) {
            class06889Array[i] = this.Z[1][i].L(1.0 - d).i(this.Z[0][i].L(d));
        }
        return class06889Array;
    }

    public class04891 E() {
        return class04909.su;
    }

    @Override
    public void N(class07438 class074382, float f) {
        class06584 class065842 = this.method_5998(class08038.N((class07438)this, (class06581)class06570.sx));
        class06584 class065843 = this.method_18808(class065842);
        class08007 class080072 = class08038.N((class07438)this, (class06584)class065843, (float)f, (class06584)class065842);
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

    public void N(class04782 class047822, int n, boolean bl) {
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        this.method_5673(class07085.field_6173, new class06584((class07310)class06570.sx));
        return super.N(class010012, class070522, class061132, class074462);
    }

    protected void l_() {
        super.l_();
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class07163(this));
        this.e.N(3, (class07473)new class07464((class07475)this, class00245.class, 8.0f, 1.0, 1.2));
        this.e.N(4, (class07473)new class07167(this));
        this.e.N(5, (class07473)new class07179(this));
        this.e.N(6, (class07473)new class07996((class07150)((Object)this), 0.5, 20, 15.0f));
        this.e.N(8, (class07473)new class07978((class07475)this, 0.6));
        this.e.N(9, (class07473)new class07962((class07079)this, class08036.class, 3.0f, 1.0f));
        this.e.N(10, (class07473)new class07962((class07079)this, class07079.class, 8.0f));
        this.H.N(1, (class07473)new class07989((class07475)this, new Class[]{class04882.class}).N(new Class[0]));
        this.H.N(2, (class07473)new class07952((class07079)this, class08036.class, true).L(300));
        this.H.N(3, (class07473)new class07952((class07079)this, class06171.class, false).L(300));
        this.H.N(3, (class07473)new class07952((class07079)this, class07625.class, false).L(300));
    }

    public class04891 method_6002() {
        return class04909.sR;
    }

    public void method_6007() {
        super.method_6007();
        if (this.method_73183().method_8608() && this.method_5767()) {
            --this.B;
            if (this.B < 0) {
                this.B = 0;
            }
            if (((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_0 == 1 || this.field_6012 % 1200 == 0) {
                int n;
                this.B = 3;
                float f = -6.0f;
                int n2 = 13;
                for (n = 0; n < 4; ++n) {
                    this.Z[0][n] = this.Z[1][n];
                    this.Z[1][n] = new class06889((double)(-6.0f + (float)this.field_5974.y(13)) * 0.5, (double)Math.max(0, this.field_5974.y(6) - 4), (double)(-6.0f + (float)this.field_5974.y(13)) * 0.5);
                }
                for (n = 0; n < 16; ++n) {
                    this.method_73183().method_8406((class07126)class07107.i, this.method_23322(0.5), this.method_23319(), this.method_23324(0.5), 0.0, 0.0, 0.0);
                }
                this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.sB, this.method_5634(), 1.0f, 1.0f, false);
            } else if (((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_0 == ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_1 - 1) {
                this.B = 3;
                for (int i = 0; i < 4; ++i) {
                    this.Z[0][i] = this.Z[1][i];
                    this.Z[1][i] = new class06889(0.0, 0.0, 0.0);
                }
            }
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.sM;
    }
}

