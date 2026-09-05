/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00502
 *  minecraft.class00608
 *  minecraft.class01001
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03557
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07062
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07473
 *  minecraft.class07542
 *  minecraft.class07625
 *  minecraft.class07836
 *  minecraft.class07952
 *  minecraft.class08036
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08731
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00502;
import minecraft.class00608;
import minecraft.class01001;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03557;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07062;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07139;
import minecraft.class07143;
import minecraft.class07158;
import minecraft.class07161;
import minecraft.class07174;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07473;
import minecraft.class07542;
import minecraft.class07625;
import minecraft.class07836;
import minecraft.class07952;
import minecraft.class08036;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08731;
import org.jspecify.annotations.Nullable;

public class class07162
extends class07079
implements class07542 {
    private static final class02131<Integer> M = class03289.N(class07162.class, (class04383)class02154.y);
    public static final int N = 1;
    public static final int y = 127;
    public static final int L = 4;
    private static final boolean B = false;
    public float u;
    public float i;
    public float R;
    private boolean Z = false;

    public static boolean L(class07078<class07162> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        if (class072842.y() != class07086.field_5801) {
            boolean bl;
            if (class06113.N((class06113)class061132)) {
                return class07162.y(class070782, (class07284)class072842, (class06113)class061132, (class07209)class072092, (class06069)class060692);
            }
            if (class072842.i(class072092).N(class03557.Nm) && class072092.method_10264() > 50 && class072092.method_10264() < 70) {
                float f = ((Float)class072842.method_75598().N(class00608.H, class072092)).floatValue();
                if (class060692.z() < f && class072842.U(class072092) <= class060692.y(8)) {
                    return class07162.y(class070782, (class07284)class072842, (class06113)class061132, (class07209)class072092, (class06069)class060692);
                }
            }
            if (!(class072842 instanceof class05974)) {
                return false;
            }
            class07321 class073212 = new class07321(class072092);
            boolean bl2 = bl = class07836.N((int)class073212.B, (int)class073212.Z, (long)((class05974)class072842).method_8412(), (long)987234911L).y(10) == 0;
            if (class060692.y(10) == 0 && bl && class072092.method_10264() < 40) {
                return class07162.y(class070782, (class07284)class072842, (class06113)class061132, (class07209)class072092, (class06069)class060692);
            }
        }
        return false;
    }

    public void method_18382() {
        double d = this.method_23317();
        double d2 = this.method_23318();
        double d3 = this.method_23321();
        super.method_18382();
        this.method_5814(d, d2, d3);
    }

    public void method_5674(class02131<?> class021312) {
        if (M.equals(class021312)) {
            this.method_18382();
            this.method_36456(((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue());
            ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue());
            if (this.method_5799() && this.field_5974.y(20) == 0) {
                this.method_5746();
            }
        }
        super.method_5674(class021312);
    }

    public class07078<? extends class07162> method_5864() {
        return super.method_5864();
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(M, (Object)1);
    }

    public void method_5773() {
        this.R = this.i;
        this.i += (this.u - this.i) * 0.5f;
        super.method_5773();
        if (this.method_24828() && !this.Z) {
            float f = this.method_18377(this.method_18376()).N() * 2.0f;
            float f2 = f / 2.0f;
            int n = 0;
            while ((float)n < f * 16.0f) {
                float f3 = this.field_5974.z() * ((float)Math.PI * 2);
                float f4 = this.field_5974.z() * 0.5f + 0.5f;
                float f5 = class04995.m((double)f3) * f2 * f4;
                float f6 = class04995.P((double)f3) * f2 * f4;
                this.method_73183().method_8406(this.B(), this.method_23317() + (double)f5, this.method_23318(), this.method_23321() + (double)f6, 0.0, 0.0, 0.0);
                ++n;
            }
            this.method_5783(this.v(), this.method_6107(), ((this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f) / 0.8f);
            this.u = -0.5f;
        } else if (!this.method_24828() && this.Z) {
            this.u = 1.0f;
        }
        this.Z = this.method_24828();
        this.E();
    }

    public void method_5650(class07062 class070622) {
        int n = this.t();
        if (!this.method_73183().method_8608() && n > 1 && this.method_29504()) {
            float f = this.method_18377(this.method_18376()).N() / 2.0f;
            int n2 = n / 2;
            int n3 = 2 + this.field_5974.y(3);
            class00502 class005022 = this.method_5781();
            for (int i = 0; i < n3; ++i) {
                float f2 = ((float)(i % 2) - 0.5f) * f;
                float f3 = ((float)(i / 2) - 0.5f) * f;
                this.N(this.method_5864(), new class08234(class08731.field_54081, false, false, class005022), class06113.field_16461, class071622 -> {
                    class071622.N(n2, true);
                    class071622.method_5808(this.method_23317() + (double)f2, this.method_23318() + 0.5, this.method_23321() + (double)f3, this.field_5974.z() * 360.0f, 0.0f);
                });
            }
        }
        super.method_5650(class070622);
    }

    public class04911 method_5634() {
        return class04911.field_15251;
    }

    public void method_5697(class07049 class070492) {
        super.method_5697(class070492);
        if (class070492 instanceof class07625 && this.W()) {
            this.N((class07438)class070492);
        }
    }

    public void method_5694(class08036 class080362) {
        if (this.W()) {
            this.N((class07438)class080362);
        }
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Size", this.t() - 1);
        class083292.N("wasOnGround", this.Z);
    }

    public void method_5749(class08299 class082992) {
        this.N(class082992.N("Size", 0) + 1, false);
        super.method_5749(class082992);
        this.Z = class082992.N("wasOnGround", false);
    }

    protected class06889 method_52533(class07049 class070492, class01325 class013252, float f) {
        return new class06889(0.0, (double)class013252.y() - 0.015625 * (double)this.t() * (double)f, 0.0);
    }

    public class07162(class07078<? extends class07162> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.method_46396();
        this.q = new class07143(this);
    }

    protected class07126 B() {
        return class07107.h;
    }

    protected int Z() {
        return this.field_5974.y(20) + 10;
    }

    protected class04891 n() {
        return this.G() ? class04909.Yw : class04909.kw;
    }

    protected boolean l() {
        return this.t() > 0;
    }

    float d() {
        float f = this.G() ? 1.4f : 0.8f;
        return ((this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f) * f;
    }

    protected float m() {
        return (float)this.method_45325(class05298.u);
    }

    public int t() {
        return (Integer)this.field_6011.N(M);
    }

    protected class04891 v() {
        if (this.G()) {
            return class04909.Yk;
        }
        return class04909.kk;
    }

    protected void E() {
        this.u *= 0.6f;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class06069 class060692 = class010012.method_8409();
        int n = class060692.y(3);
        if (n < 2 && class060692.z() < 0.5f * class070522.u()) {
            ++n;
        }
        int n2 = 1 << n;
        this.N(n2, true);
        return super.N(class010012, class070522, class061132, class074462);
    }

    public void N(int n, boolean bl) {
        int n2 = class04995.N((int)n, (int)1, (int)127);
        this.field_6011.N(M, (Object)n2);
        this.method_23311();
        this.method_18382();
        this.method_5996(class05298.n).N((double)(n2 * n2));
        this.method_5996(class05298.l).N((double)(0.2f + 0.1f * (float)n2));
        this.method_5996(class05298.u).N((double)n2);
        if (bl) {
            this.method_6033(this.method_6063());
        }
        this.J = n2;
    }

    protected void N(class07438 class074382) {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (this.method_5805() && this.L(class074382) && this.method_6057((class07049)class074382) && class074382.method_64397(class047822, (class07072)(class072992 = this.method_48923().y((class07438)this)), this.m())) {
                this.method_5783(class04909.kG, 1.0f, (this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f);
                class07323.N((class04782)class047822, (class07049)class074382, (class07072)class072992);
            }
        }
    }

    protected boolean W() {
        return !this.G() && this.method_6034();
    }

    public int Ni() {
        return 0;
    }

    public boolean G() {
        return this.t() <= 1;
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07161(this));
        this.e.N(2, (class07473)new class07158(this));
        this.e.N(3, (class07473)new class07139(this));
        this.e.N(5, (class07473)new class07174(this));
        this.H.N(1, (class07473)new class07952((class07079)this, class08036.class, 10, true, false, (class074382, class047822) -> Math.abs(class074382.method_23318() - this.method_23318()) <= 4.0));
        this.H.N(3, (class07473)new class07952((class07079)this, class07625.class, true));
    }

    public class04891 method_6002() {
        if (this.G()) {
            return class04909.Yl;
        }
        return class04909.kl;
    }

    public float method_6107() {
        return 0.4f * (float)this.t();
    }

    public class01325 method_55694(class01312 class013122) {
        return super.method_55694(class013122).N((float)this.t());
    }

    public void method_6043() {
        class06889 class068892 = this.method_18798();
        this.method_18800(class068892.M, this.method_6106(), class068892.Z);
        this.field_64356 = true;
    }

    public class04891 method_6011(class07072 class070722) {
        if (this.G()) {
            return class04909.Yd;
        }
        return class04909.kd;
    }
}

