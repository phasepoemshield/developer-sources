/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10723
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01128
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01894
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06563
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07276
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07451
 *  minecraft.class07463
 *  minecraft.class07471
 *  minecraft.class07472
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07536
 *  minecraft.class07542
 *  minecraft.class07649
 *  minecraft.class07956
 *  minecraft.class07962
 *  minecraft.class07989
 *  minecraft.class08007
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08382
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10723;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01128;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01894;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06563;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07152;
import minecraft.class07159;
import minecraft.class07169;
import minecraft.class07170;
import minecraft.class07181;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07276;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07451;
import minecraft.class07463;
import minecraft.class07471;
import minecraft.class07472;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07536;
import minecraft.class07542;
import minecraft.class07649;
import minecraft.class07956;
import minecraft.class07962;
import minecraft.class07989;
import minecraft.class08007;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08382;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class class07144
extends class07649
implements class07542 {
    private static final class01894 i = class01894.y((String)"covered");
    private static final class07471 R = new class07471(i, 20.0, class07463.field_6328);
    protected static final class02131<class07211> N = class03289.N(class07144.class, (class04383)class02154.T);
    protected static final class02131<Byte> y = class03289.N(class07144.class, (class04383)class02154.N);
    protected static final class02131<Byte> L = class03289.N(class07144.class, (class04383)class02154.N);
    private static final int M = 6;
    private static final byte B = 16;
    private static final byte Z = 16;
    private static final int W = 8;
    private static final int T = 8;
    private static final int b = 5;
    private static final float X = 0.05f;
    private static final byte a = 0;
    private static final class07211 p = class07211.field_11033;
    static final Vector3f u = (Vector3f)class07536.N(() -> {
        class00753 class007532 = class07211.field_11035.E();
        return new Vector3f((float)class007532.method_10263(), (float)class007532.method_10264(), (float)class007532.method_10260());
    });
    private static final float F = 3.0f;
    private float A;
    private float f;
    private @Nullable class07209 C;
    private int S;
    private static final float x = 1.0f;

    static /* synthetic */ class06069 L(class07144 class071442) {
        return class071442.field_5974;
    }

    public static class05300 M() {
        return class07079.H().N(class05298.n, 30.0);
    }

    public void method_5674(class02131<?> class021312) {
        if (N.equals(class021312)) {
            this.method_5857(this.method_33332());
        }
        super.method_5674(class021312);
    }

    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(0.0f);
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_1 = Float.valueOf(0.0f);
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.yN);
        super.method_66649(class026662);
    }

    public void method_5848() {
        super.method_5848();
        if (this.method_73183().method_8608()) {
            this.C = this.method_24515();
        }
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_1 = Float.valueOf(0.0f);
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(0.0f);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)p);
        class042932.N(y, (Object)0);
        class042932.N(L, (Object)16);
    }

    public void method_5814(double d, double d2, double d3) {
        class07209 class072092 = this.method_24515();
        if (this.method_5765()) {
            super.method_5814(d, d2, d3);
        } else {
            super.method_5814((double)class04995.N((double)d) + 0.5, (double)class04995.N((double)(d2 + 0.5)), (double)class04995.N((double)d3) + 0.5);
        }
        if (this.field_6012 == 0) {
            return;
        }
        class07209 class072093 = this.method_24515();
        if (!class072093.equals((Object)class072092)) {
            this.field_6011.N(y, (Object)0);
            this.field_64356 = true;
            if (this.method_73183().method_8608() && !this.method_5765() && !class072093.equals((Object)this.C)) {
                this.C = class072092;
                this.S = 6;
                this.field_6038 = this.method_23317();
                this.field_5971 = this.method_23318();
                this.field_5989 = this.method_23321();
            }
        }
    }

    protected class00734 method_65341(class06889 class068892) {
        float f = class07144.R(this.f);
        class07211 class072112 = this.E().b();
        return class07144.N(this.method_55693(), class072112, f, class068892);
    }

    public void method_5773() {
        super.method_5773();
        if (!(this.method_73183().method_8608() || this.method_5765() || this.N(this.method_24515(), this.E()))) {
            this.v();
        }
        if (this.n()) {
            this.t();
        }
        if (this.method_73183().method_8608()) {
            if (this.S > 0) {
                --this.S;
            } else {
                this.C = null;
            }
        }
    }

    public void method_18799(class06889 class068892) {
    }

    public class04911 method_5634() {
        return class04911.field_15251;
    }

    public void method_5784(class07451 class074512, class06889 class068892) {
        if (class074512 == class07451.field_6306) {
            this.B();
        } else {
            super.method_5784(class074512, class068892);
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class07049 class070492;
        if (this.G() && (class070492 = class070722.L()) instanceof class08007) {
            return false;
        }
        if (super.method_64397(class047822, class070722, f)) {
            if ((double)this.method_6032() < (double)this.method_6063() * 0.5 && this.field_5974.y(4) == 0) {
                this.B();
            } else if (class070722.N(class03696.z) && (class070492 = class070722.L()) != null && class070492.method_5864() == class07078.yE) {
                this.l();
            }
            return true;
        }
        return false;
    }

    protected class07065 method_33570() {
        return class07065.field_28630;
    }

    public class06889 method_18798() {
        return class06889.L;
    }

    public void method_5697(class07049 class070492) {
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("AttachFace", class07211.field_57037, (Object)this.E());
        class083292.N("Peek", ((Byte)this.field_6011.N(y)).byteValue());
        class083292.N("Color", ((Byte)this.field_6011.N(L)).byteValue());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.yN) {
            return (T)class07144.method_66651(class024772, (Object)this.m());
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("AttachFace", class07211.field_57037).orElse(p));
        this.field_6011.N(y, (Object)class082992.N("Peek", (byte)0));
        this.field_6011.N(L, (Object)class082992.N("Color", (byte)16));
    }

    public boolean method_30948(@Nullable class07049 class070492) {
        return this.method_5805();
    }

    public boolean method_5873(class07049 class070492, boolean bl, boolean bl2) {
        if (this.method_73183().method_8608()) {
            this.C = null;
            this.S = 0;
        }
        this.N(class07211.field_11033);
        return super.method_5873(class070492, bl, bl2);
    }

    public class08382 method_66233() {
        return null;
    }

    public class07144(class07078<? extends class07144> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 5;
        this.o = new class07152(this, (class07079)this);
    }

    protected boolean B() {
        if (this.Nt() || !this.method_5805()) {
            return false;
        }
        class07209 class072092 = this.method_24515();
        for (int i = 0; i < 5; ++i) {
            class07211 class072112;
            class07209 class072093 = class072092.method_10069(class04995.y((class06069)this.field_5974, (int)-8, (int)8), class04995.y((class06069)this.field_5974, (int)-8, (int)8), class04995.y((class06069)this.field_5974, (int)-8, (int)8));
            if (class072093.method_10264() <= this.method_73183().method_31607() || !this.method_73183().R(class072093) || !this.method_73183().method_8621().N(class072093) || !this.method_73183().method_8587((class07049)this, new class00734(class072093).B(1.0E-6)) || (class072112 = this.N(class072093)) == null) continue;
            this.method_18375();
            this.N(class072112);
            this.method_5783(class04909.ku, 1.0f, 1.0f);
            this.method_5814((double)class072093.method_10263() + 0.5, class072093.method_10264(), (double)class072093.method_10260() + 0.5);
            this.method_73183().N((class03556)class01194.F, class072092, class01164.N((class07049)this));
            this.field_6011.N(y, (Object)0);
            this.y((class07438)null);
            return true;
        }
        return false;
    }

    public void D() {
        if (!this.G()) {
            super.D();
        }
    }

    public @Nullable class06889 i(float f) {
        if (this.C == null || this.S <= 0) {
            return null;
        }
        double d = (double)((float)this.S - f) / 6.0;
        d *= d;
        class07209 class072092 = this.method_24515();
        double d2 = (double)(class072092.method_10263() - this.C.method_10263()) * (d *= (double)this.method_55693());
        double d3 = (double)(class072092.method_10264() - this.C.method_10264()) * d;
        double d4 = (double)(class072092.method_10260() - this.C.method_10260()) * d;
        return new class06889(-d2, -d3, -d4);
    }

    static /* synthetic */ class06069 i(class07144 class071442) {
        return class071442.field_5974;
    }

    protected class04891 s() {
        return class04909.wA;
    }

    private boolean n() {
        this.A = this.f;
        float f = (float)this.d() * 0.01f;
        if (this.f == f) {
            return false;
        }
        this.f = this.f > f ? class04995.N((float)(this.f - 0.05f), (float)f, (float)1.0f) : class04995.N((float)(this.f + 0.05f), (float)0.0f, (float)f);
        return true;
    }

    private void l() {
        class06889 class068892 = this.method_73189();
        class00734 class007342 = this.method_5829();
        if (this.G() || !this.B()) {
            return;
        }
        float f = (float)(this.method_73183().method_18023((class01128)class07078.yU, class007342.M(8.0), class07049::method_5805).size() - 1) / 5.0f;
        if (this.method_73183().field_9229.z() < f) {
            return;
        }
        class07144 class071442 = (class07144)class07078.yU.N(this.method_73183(), class06113.field_16466);
        if (class071442 != null) {
            class071442.N(this.W());
            class071442.method_29495(class068892);
            this.method_73183().method_8649((class07049)class071442);
        }
    }

    private int d() {
        return ((Byte)this.field_6011.N(y)).byteValue();
    }

    public @Nullable class06563 m() {
        byte by = (Byte)this.field_6011.N(L);
        if (by == 16 || by > 15) {
            return null;
        }
        return class06563.N((int)by);
    }

    private void t() {
        this.method_23311();
        float f = class07144.R(this.f);
        float f2 = class07144.R(this.A);
        class07211 class072112 = this.E().b();
        float f3 = (f - f2) * this.method_55693();
        if (f3 <= 0.0f) {
            return;
        }
        for (class07049 class070493 : this.method_73183().method_8333((class07049)this, class07144.N(this.method_55693(), class072112, f2, f, this.method_73189()), class07042.R.and(class070492 -> !class070492.method_5794((class07049)this)))) {
            if (class070493 instanceof class07144 || class070493.field_5960) continue;
            class070493.method_5784(class07451.field_6309, new class06889((double)(f3 * (float)class072112.P()), (double)(f3 * (float)class072112.s()), (double)(f3 * (float)class072112.T())));
        }
    }

    private void v() {
        class07211 class072112 = this.N(this.method_24515());
        if (class072112 != null) {
            this.N(class072112);
        } else {
            this.B();
        }
    }

    public float u(float f) {
        return class04995.B((float)f, (float)this.A, (float)this.f);
    }

    static /* synthetic */ class06069 u(class07144 class071442) {
        return class071442.field_5974;
    }

    private boolean y(class07209 class072092) {
        class00500 class005002 = this.method_73183().method_8320(class072092);
        if (class005002.P()) {
            return false;
        }
        return !(class005002.N(class00869.LN) && class072092.equals((Object)this.method_24515()));
    }

    static /* synthetic */ class06069 y(class07144 class071442) {
        return class071442.field_5974;
    }

    public class07211 E() {
        return (class07211)((Object)this.field_6011.N(N));
    }

    private void N(Optional<class06563> optional) {
        this.field_6011.N(L, (Object)optional.map(class065632 -> (byte)class065632.N()).orElse((byte)16));
    }

    static /* synthetic */ class06069 N(class07144 class071442) {
        return class071442.field_5974;
    }

    private void N(class07211 class072112) {
        this.field_6011.N(N, (Object)class072112);
    }

    protected @Nullable class07211 N(class07209 class072092) {
        for (class07211 class072112 : class07211.values()) {
            if (!this.N(class072092, class072112)) continue;
            return class072112;
        }
        return null;
    }

    boolean N(class07209 class072092, class07211 class072112) {
        if (this.y(class072092)) {
            return false;
        }
        class07211 class072113 = class072112.b();
        if (!this.method_73183().method_24368(class072092.method_10093(class072112), (class07049)this, class072113)) {
            return false;
        }
        class00734 class007342 = class07144.N(this.method_55693(), class072113, 1.0f, class072092.method_61082()).B(1.0E-6);
        return this.method_73183().method_8587((class07049)this, class007342);
    }

    public static class00734 N(float f, class07211 class072112, float f2, class06889 class068892) {
        return class07144.N(f, class072112, -1.0f, f2, class068892);
    }

    public static class00734 N(float f, class07211 class072112, float f2, float f3, class06889 class068892) {
        class00734 class007342 = new class00734((double)(-f) * 0.5, 0.0, (double)(-f) * 0.5, (double)f * 0.5, (double)f, (double)f * 0.5);
        double d = Math.max(f2, f3);
        double d2 = Math.min(f2, f3);
        return class007342.y((double)class072112.P() * d * (double)f, (double)class072112.s() * d * (double)f, (double)class072112.T() * d * (double)f).N((double)(-class072112.P()) * (1.0 + d2) * (double)f, (double)(-class072112.s()) * (1.0 + d2) * (double)f, (double)(-class072112.T()) * (1.0 + d2) * (double)f).u(class068892.M, class068892.B, class068892.Z);
    }

    void N(int n) {
        if (!this.method_73183().method_8608()) {
            this.method_5996(class05298.y).L(i);
            if (n == 0) {
                this.method_5996(class05298.y).u(R);
                this.method_5783(class04909.wD, 1.0f, 1.0f);
                this.method_32876((class03556)class01194.z);
            } else {
                this.method_5783(class04909.ky, 1.0f, 1.0f);
                this.method_32876((class03556)class01194.U);
            }
        }
        this.field_6011.N(y, (Object)((byte)n));
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        this.method_36456(0.0f);
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(this.method_36454());
        this.method_22862();
        return super.N(class010012, class070522, class061132, class074462);
    }

    public Optional<class06563> W() {
        return Optional.ofNullable(this.m());
    }

    private static float R(float f) {
        return 0.5f - class04995.m((double)((0.5f + f) * (float)Math.PI)) * 0.5f;
    }

    public int Ni() {
        return 180;
    }

    private boolean G() {
        return this.d() == 0;
    }

    public int NR() {
        return 180;
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.yN) {
            this.N(Optional.of((class06563)class07144.method_66651((class02477)class02484.yN, t)));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    protected class07472 Z_() {
        return new class10723((class07079)this);
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07962((class07079)this, class08036.class, 8.0f, 0.02f, true));
        this.e.N(4, (class07473)new class07170(this));
        this.e.N(7, (class07473)new class07159(this));
        this.e.N(8, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07989((class07475)this, new Class[]{((Object)((Object)this)).getClass()}).N(new Class[0]));
        this.H.N(2, (class07473)new class07169(this, this));
        this.H.N(3, (class07473)new class07181(this));
    }

    public float method_56077(float f) {
        return Math.min(f, 3.0f);
    }

    public class04891 method_6002() {
        return class04909.wh;
    }

    public class04891 method_6011(class07072 class070722) {
        if (this.G()) {
            return class04909.kN;
        }
        return class04909.wr;
    }
}

