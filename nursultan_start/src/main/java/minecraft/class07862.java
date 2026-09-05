/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10714
 *  Nursultan.class10847
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01312
 *  minecraft.class01317
 *  minecraft.class01325
 *  minecraft.class01328
 *  minecraft.class02131
 *  minecraft.class02145
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02523
 *  minecraft.class02607
 *  minecraft.class02961
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03969
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05188
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07067
 *  minecraft.class07070
 *  minecraft.class07072
 *  minecraft.class07075
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07107
 *  minecraft.class07109
 *  minecraft.class07126
 *  minecraft.class07134
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07322
 *  minecraft.class07323
 *  minecraft.class07427
 *  minecraft.class07431
 *  minecraft.class07434
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07459
 *  minecraft.class07468
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07610
 *  minecraft.class07633
 *  minecraft.class07752
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07959
 *  minecraft.class07960
 *  minecraft.class07962
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  minecraft.class08725
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10714;
import Nursultan.class10847;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01312;
import minecraft.class01317;
import minecraft.class01325;
import minecraft.class01328;
import minecraft.class02131;
import minecraft.class02145;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02523;
import minecraft.class02607;
import minecraft.class02961;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03969;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05188;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07067;
import minecraft.class07070;
import minecraft.class07072;
import minecraft.class07075;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07107;
import minecraft.class07109;
import minecraft.class07126;
import minecraft.class07134;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07322;
import minecraft.class07323;
import minecraft.class07427;
import minecraft.class07431;
import minecraft.class07434;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07459;
import minecraft.class07468;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07610;
import minecraft.class07633;
import minecraft.class07752;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07959;
import minecraft.class07960;
import minecraft.class07962;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import minecraft.class08725;
import org.jspecify.annotations.Nullable;

public abstract class class07862
extends class07633
implements class02145,
class03969,
class07431 {
    public static final int N = 499;
    public static final int y = 500;
    public static final double L = 0.15;
    private static final float f = (float)class07862.y(() -> 0.0);
    private static final float C = (float)class07862.y(() -> 1.0);
    private static final float S = (float)class07862.N(() -> 0.0);
    private static final float x = (float)class07862.N(() -> 1.0);
    private static final float D = class07862.N_85(n -> 0);
    private static final float h = class07862.N_85(n -> n - 1);
    private static final float r = 0.25f;
    private static final float NN = 0.5f;
    private static final class01317 Ny = (class074382, class047822) -> class074382 instanceof class07862 && ((class07862)class074382).NO();
    private static final class01328 NL = class01328.y().N(16.0).u().N(Ny);
    private static final class02131<Byte> NE = class03289.N(class07862.class, (class04383)class02154.N);
    private static final int NW = 2;
    private static final int Nm = 8;
    private static final int NP = 16;
    private static final int Ns = 32;
    private static final int NT = 64;
    public static final int u = 3;
    private static final int Nb = 0;
    private static final boolean Nj = false;
    private static final boolean Nv = false;
    private static final boolean Nn = false;
    private int Nt;
    private int NG;
    private int Nl;
    public int i;
    public int R;
    protected class07075 M;
    protected int B = 0;
    protected float Z;
    protected boolean X;
    private float Nd;
    private float Nw;
    private float Nk;
    public float p;
    private float NY;
    private float NQ;
    protected boolean F = true;
    protected int A;
    private @Nullable class08372<class07438> NO;

    protected boolean L(class08036 class080362, class06584 class065842) {
        boolean bl = false;
        float f = 0.0f;
        int n = 0;
        int n2 = 0;
        if (class065842.N(class06570.bL)) {
            f = 2.0f;
            n = 20;
            n2 = 3;
        } else if (class065842.N(class06570.vg)) {
            f = 1.0f;
            n = 30;
            n2 = 3;
        } else if (class065842.N(class00869.zy.B())) {
            f = 20.0f;
            n = 180;
        } else if (class065842.N(class06570.sS)) {
            f = 3.0f;
            n = 60;
            n2 = 3;
        } else if (class065842.N(class06570.uX)) {
            f = 3.0f;
            n = 0;
            n2 = 3;
        } else if (class065842.N(class06570.Gb)) {
            f = 3.0f;
            n = 60;
            n2 = 3;
        } else if (class065842.N(class06570.GG)) {
            f = 4.0f;
            n = 60;
            n2 = 5;
            if (!this.method_73183().method_8608() && this.I() && this.K() == 0 && !this.NX()) {
                bl = true;
                this.i(class080362);
            }
        } else if (class065842.N(class06570.bV) || class065842.N(class06570.be)) {
            f = 10.0f;
            n = 240;
            n2 = 10;
            if (!this.method_73183().method_8608() && this.I() && this.K() == 0 && !this.NX()) {
                bl = true;
                this.i(class080362);
            }
        }
        if (this.method_6032() < this.method_6063() && f > 0.0f) {
            this.method_6025(f);
            bl = true;
        }
        if (this.method_6109() && n > 0) {
            this.method_73183().method_8406((class07126)class07107.F, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), 0.0, 0.0, 0.0);
            if (!this.method_73183().method_8608()) {
                this.L(n);
                bl = true;
            }
        }
        if (!(n2 <= 0 || !bl && this.I() || this.Ng() >= this.NV() || this.method_73183().method_8608())) {
            this.z(n2);
            bl = true;
        }
        if (bl) {
            this.W();
            this.method_32876((class03556)class01194.W);
        }
        return bl;
    }

    protected void L(class04782 class047822) {
        class07438 class074382;
        if (this.NO() && this.method_6109() && !this.o() && (class074382 = class047822.N(class07862.class, NL, (class07438)this, this.method_23317(), this.method_23318(), this.method_23321(), this.method_5829().M(16.0))) != null && this.method_5858((class07049)class074382) > 4.0) {
            this.V.N((class07049)class074382, 0);
        }
    }

    protected void No() {
        class07075 class070752 = this.M;
        this.M = new class07075(this.NJ());
        if (class070752 != null) {
            int n = Math.min(class070752.method_5439(), this.M.method_5439());
            for (int i = 0; i < n; ++i) {
                class06584 class065842 = class070752.method_5438(i);
                if (class065842.R()) continue;
                this.M.method_5447(i, class065842.t());
            }
        }
    }

    public void M(boolean bl) {
        this.y(2, bl);
    }

    protected void Q() {
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(3, (class07473)new class07960((class07475)this, 1.25, class065842 -> class065842.N(class01226.Ne), false));
    }

    public class06889 method_24829(class07438 class074382) {
        class06889 class068892 = class07862.method_24826((double)this.method_17681(), (double)class074382.method_17681(), (float)(this.method_36454() + (class074382.method_6068() == class07070.field_6183 ? 90.0f : -90.0f)));
        class06889 class068893 = this.N(class068892, class074382);
        if (class068893 != null) {
            return class068893;
        }
        class06889 class068894 = class07862.method_24826((double)this.method_17681(), (double)class074382.method_17681(), (float)(this.method_36454() + (class074382.method_6068() == class07070.field_6182 ? 90.0f : -90.0f)));
        class06889 class068895 = this.N(class068894, class074382);
        if (class068895 != null) {
            return class068895;
        }
        return this.method_73189();
    }

    public @Nullable class04803 method_32318(int n) {
        int n2 = n - 500;
        if (n2 >= 0 && n2 < this.M.method_5439()) {
            return this.M.method_32318(n2);
        }
        return super.method_32318(n);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(NE, (Object)0);
    }

    public void method_5773() {
        super.method_5773();
        if (this.NG > 0 && ++this.NG > 30) {
            this.NG = 0;
            this.y(64, false);
        }
        if (this.Nl > 0 && --this.Nl <= 0) {
            this.NF();
        }
        if (this.i > 0 && ++this.i > 8) {
            this.i = 0;
        }
        if (this.R > 0) {
            ++this.R;
            if (this.R > 300) {
                this.R = 0;
            }
        }
        this.Nw = this.Nd;
        if (this.o()) {
            this.Nd += (1.0f - this.Nd) * 0.4f + 0.05f;
            if (this.Nd > 1.0f) {
                this.Nd = 1.0f;
            }
        } else {
            this.Nd += (0.0f - this.Nd) * 0.4f - 0.05f;
            if (this.Nd < 0.0f) {
                this.Nd = 0.0f;
            }
        }
        this.p = this.Nk;
        if (this.NQ()) {
            this.Nw = this.Nd = 0.0f;
            this.Nk += (1.0f - this.Nk) * 0.4f + 0.05f;
            if (this.Nk > 1.0f) {
                this.Nk = 1.0f;
            }
        } else {
            this.X = false;
            this.Nk += (0.8f * this.Nk * this.Nk * this.Nk - this.Nk) * 0.6f - 0.05f;
            if (this.Nk < 0.0f) {
                this.Nk = 0.0f;
            }
        }
        this.NQ = this.NY;
        if (this.B(64)) {
            this.NY += (1.0f - this.NY) * 0.7f + 0.05f;
            if (this.NY > 1.0f) {
                this.NY = 1.0f;
            }
        } else {
            this.NY += (0.0f - this.NY) * 0.7f - 0.05f;
            if (this.NY < 0.0f) {
                this.NY = 0.0f;
            }
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        boolean bl = super.method_64397(class047822, class070722, f);
        if (bl && this.field_5974.y(3) == 0) {
            this.Nf();
        }
        return bl;
    }

    public boolean method_5747(double d, float f, class07072 class070722) {
        int n;
        if (d > 1.0) {
            this.method_5783(class04909.PX, 0.4f, 1.0f);
        }
        if ((n = this.method_23329(d, f)) <= 0) {
            return false;
        }
        this.method_64419(class070722, n);
        this.method_67345(d, f, class070722);
        this.method_23328();
        return true;
    }

    public @Nullable class07438 method_5642() {
        class07049 class070492;
        if (this.Nz() && (class070492 = this.method_31483()) instanceof class08036) {
            return (class08036)class070492;
        }
        return super.method_5642();
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        if (class005002.T()) {
            return;
        }
        class00500 class005003 = this.method_73183().method_8320(class072092.method_10084());
        class07752 class077522 = class005002.O();
        if (class005003.N(class00869.is)) {
            class077522 = class005003.O();
        }
        if (this.method_5782() && this.F) {
            ++this.A;
            if (this.A > 5 && this.A % 3 == 0) {
                this.N(class077522);
            } else if (this.A <= 5) {
                this.method_5783(class04909.PF, class077522.N() * 0.15f, class077522.y());
            }
        } else if (this.y(class077522)) {
            this.method_5783(class04909.PF, class077522.N() * 0.15f, class077522.y());
        } else {
            this.method_5783(class04909.Pp, class077522.N() * 0.15f, class077522.y());
        }
    }

    public boolean method_5810() {
        return !this.method_5782();
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("EatingHaystack", this.o());
        class083292.N("Bred", this.NO());
        class083292.N("Temper", this.Ng());
        class083292.N("Tame", this.I());
        class08372.N(this.NO, (class08329)class083292, (String)"Owner");
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.Z(class082992.N("EatingHaystack", false));
        this.B(class082992.N("Bred", false));
        this.Z(class082992.N("Temper", 0));
        this.M(class082992.N("Tame", false));
        this.NO = class08372.N((class08299)class082992, (String)"Owner", (class07299)this.method_73183());
    }

    protected class06889 method_52533(class07049 class070492, class01325 class013252, float f) {
        return super.method_52533(class070492, class013252, f).i(new class06889(0.0, 0.15 * (double)this.p * (double)f, -0.7 * (double)this.p * (double)f).y(-this.method_36454() * ((float)Math.PI / 180)));
    }

    public void method_5865(class07049 class070492, class07067 class070672) {
        super.method_5865(class070492, class070672);
        if (class070492 instanceof class07438) {
            ((class07438)class070492).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue());
        }
    }

    protected void method_5627(class07049 class070492) {
        block0: {
            super.method_5627(class070492);
            float f = this.method_5695(0.0f);
            float f2 = this.method_5705(0.0f);
            class07049 class070493 = class070492;
            if (!this.y(class070493, f2, f)) break block0;
            class070493.method_60608(f2, f);
        }
    }

    public void method_5711(byte by) {
        if (by == 7) {
            this.z(true);
        } else if (by == 6) {
            this.z(false);
        } else {
            super.method_5711(by);
        }
    }

    public class07862(class07078<? extends class07862> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.No();
    }

    public void B(boolean bl) {
        this.y(8, bl);
    }

    protected boolean B(int n) {
        return ((Byte)this.field_6011.N(NE) & n) != 0;
    }

    public boolean B() {
        return false;
    }

    public boolean I() {
        return this.B(2);
    }

    public void Z(int n) {
        this.B = n;
    }

    public void Z(boolean bl) {
        this.y(16, bl);
    }

    public float i(float f) {
        return class04995.B((float)f, (float)this.p, (float)this.Nk);
    }

    private void l() {
        if (!this.method_73183().method_8608()) {
            this.NG = 1;
            this.y(64, true);
        }
    }

    public boolean m() {
        return this.Nz();
    }

    public boolean o() {
        return this.B(16);
    }

    public void t() {
    }

    private void v() {
        this.i = 1;
    }

    public void U(int n) {
        this.Z(false);
        this.y(32, true);
        this.Nl = n;
    }

    public int z(int n) {
        int n2 = class04995.N((int)(this.Ng() + n), (int)0, (int)this.NV());
        this.Z(n2);
        return n2;
    }

    protected void z(boolean bl) {
        class07134 class071342 = bl ? class07107.f : class07107.NZ;
        for (int i = 0; i < 7; ++i) {
            double d = this.field_5974.E() * 0.02;
            double d2 = this.field_5974.E() * 0.02;
            double d3 = this.field_5974.E() * 0.02;
            this.method_73183().method_8406((class07126)class071342, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d, d2, d3);
        }
    }

    public class07109 u(class07438 class074382) {
        return new class07109(class074382.method_36455() * 0.5f, class074382.method_36454());
    }

    public boolean u(class08036 class080362) {
        this.N((class07438)class080362);
        this.M(true);
        if (class080362 instanceof class04770) {
            class06912.d.N((class04770)class080362, (class07633)this);
        }
        this.method_73183().method_8421((class07049)this, (byte)7);
        return true;
    }

    public float u(float f) {
        return class04995.B((float)f, (float)this.Nw, (float)this.Nd);
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        return null;
    }

    private boolean y(class07049 class070492, float f, float f2) {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_7);
    }

    protected static double y(DoubleSupplier doubleSupplier) {
        return ((double)0.45f + doubleSupplier.getAsDouble() * 0.3 + doubleSupplier.getAsDouble() * 0.3 + doubleSupplier.getAsDouble() * 0.3) * 0.25;
    }

    private boolean y(class07752 class077522) {
        return class077522 == class07752.y || class077522 == class07752.Nx || class077522 == class07752.Y || class077522 == class07752.ND || class077522 == class07752.NS;
    }

    public void y(int n) {
        this.X = true;
        this.Nf();
        this.Y();
    }

    protected void y(int n, boolean bl) {
        byte by = (Byte)this.field_6011.N(NE);
        if (bl) {
            this.field_6011.N(NE, (Object)((byte)(by | n)));
        } else {
            this.field_6011.N(NE, (Object)((byte)(by & ~n)));
        }
    }

    public class07082 y(class08036 class080362, class06584 class065842) {
        class07862 class078622 = this;
        class08036 class080363 = class080362;
        class06584 class065843 = class065842;
        boolean bl = this.N(class078622, class080363, class065843);
        if (bl) {
            class065842.N(1, (class07438)class080362);
        }
        return bl || this.method_73183().method_8608() ? class07082.y : class07082.i;
    }

    protected void y(class08036 class080362) {
        this.Z(false);
        this.NF();
        if (!this.method_73183().method_8608()) {
            class080362.method_36456(this.method_36454());
            class080362.method_36457(this.method_36455());
            class080362.method_5804((class07049)this);
        }
    }

    public void N(int n) {
        if (!this.Nz()) {
            return;
        }
        if (n < 0) {
            n = 0;
        } else {
            this.X = true;
            this.Nf();
        }
        this.Z = this.d_(n);
    }

    protected void N(float f, class06889 class068892) {
        double d = this.method_56994(f);
        class06889 class068893 = this.method_18798();
        this.method_18800(class068893.M, d, class068893.Z);
        this.field_64356 = true;
        if (class068892.Z > 0.0) {
            float f2 = class04995.m((double)(this.method_36454() * ((float)Math.PI / 180)));
            float f3 = class04995.P((double)(this.method_36454() * ((float)Math.PI / 180)));
            this.method_18799(this.method_18798().y((double)(-0.4f * f2 * f), 0.0, (double)(0.4f * f3 * f)));
        }
    }

    protected void N(class07077 class070772, class07862 class078622) {
        this.N(class070772, class078622, (class03556<class07468>)class05298.n, D, h);
        this.N(class070772, class078622, (class03556<class07468>)class05298.T, S, x);
        this.N(class070772, class078622, (class03556<class07468>)class05298.l, f, C);
    }

    public boolean N(class07633 class076332) {
        return false;
    }

    private void N(class07077 class070772, class07862 class078622, class03556<class07468> class035562, double d, double d2) {
        double d3 = class07862.N(this.method_45326(class035562), class070772.method_45326(class035562), d, d2, this.field_5974);
        class078622.method_5996(class035562).N(d3);
    }

    static double N(double d, double d2, double d3, double d4, class06069 class060692) {
        double d5;
        if (d4 <= d3) {
            throw new IllegalArgumentException("Incorrect range for an attribute");
        }
        d = class04995.N((double)d, (double)d3, (double)d4);
        d2 = class04995.N((double)d2, (double)d3, (double)d4);
        double d6 = 0.15 * (d4 - d3);
        double d7 = (d + d2) / 2.0;
        double d8 = Math.abs(d - d2) + d6 * 2.0;
        double d9 = d7 + d8 * (d5 = (class060692.U() + class060692.U() + class060692.U()) / 3.0 - 0.5);
        if (d9 > d4) {
            double d10 = d9 - d4;
            return d4 - d10;
        }
        if (d9 < d3) {
            double d11 = d3 - d9;
            return d3 + d11;
        }
        return d9;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (class074462 == null) {
            class074462 = new class10714(0.2f);
        }
        this.N(class010012.method_8409());
        return super.N(class010012, class070522, class061132, class074462);
    }

    public boolean N(class06695 class066952) {
        return this.M != class066952;
    }

    public void N(@Nullable class07438 class074382) {
        this.NO = class08372.N((class08636)class074382);
    }

    private boolean N(class07862 class078622, class08036 class080362, class06584 class065842) {
        return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2) || this.L(class080362, class065842);
    }

    public void N(class08036 class080362, class06584 class065842) {
        if (this.method_63623(class065842, class07085.field_48824)) {
            this.u(class065842.y(1, (class07438)class080362));
        }
    }

    protected static float N_85(IntUnaryOperator intUnaryOperator) {
        return 15.0f + (float)intUnaryOperator.applyAsInt(8) + (float)intUnaryOperator.applyAsInt(9);
    }

    protected static double N(DoubleSupplier doubleSupplier) {
        return (double)0.4f + doubleSupplier.getAsDouble() * 0.2 + doubleSupplier.getAsDouble() * 0.2 + doubleSupplier.getAsDouble() * 0.2;
    }

    private @Nullable class06889 N(class06889 class068892, class07438 class074382) {
        double d = this.method_23317() + class068892.M;
        double d2 = this.method_5829().y;
        double d3 = this.method_23321() + class068892.Z;
        class07218 class072182 = new class07218();
        block0: for (class01312 class013122 : class074382.method_24831()) {
            class072182.N(d, d2, d3);
            double d4 = this.method_5829().i + 0.75;
            do {
                double d5 = this.method_73183().L((class07209)class072182);
                if ((double)class072182.method_10264() + d5 > d4) continue block0;
                if (class05188.N((double)d5)) {
                    class00734 class007342 = class074382.method_24833(class013122);
                    class06889 class068893 = new class06889(d, (double)class072182.method_10264() + d5, d3);
                    if (class05188.N((class07322)this.method_73183(), (class07438)class074382, (class00734)class007342.L(class068893))) {
                        class074382.method_18380(class013122);
                        return class068893;
                    }
                }
                class072182.N(class07211.field_11036);
            } while ((double)class072182.method_10264() < d4);
        }
        return null;
    }

    protected void N(class06069 class060692) {
    }

    protected void N(class07752 class077522) {
        this.method_5783(class04909.Pe, class077522.N() * 0.15f, class077522.y());
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.NK);
    }

    public void N(class08036 class080362) {
        if (!this.method_73183().method_8608() && (!this.method_5782() || this.method_5626((class07049)class080362)) && this.I()) {
            class080362.method_7291(this, (class06695)this.M);
        }
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        if (this.method_5782() || this.method_6109()) {
            return super.N(class080362, class070502);
        }
        if (this.I() && class080362.method_21823()) {
            this.N(class080362);
            return class07082.N;
        }
        class06584 class065842 = class080362.method_5998(class070502);
        if (!class065842.R()) {
            class07082 class070822 = class065842.N(class080362, (class07438)this, class070502);
            if (class070822.N()) {
                return class070822;
            }
            if (this.method_63623(class065842, class07085.field_48824) && !this.NU()) {
                this.N(class080362, class065842);
                return class07082.N;
            }
        }
        this.y(class080362);
        return class07082.N;
    }

    public @Nullable class04891 NA() {
        return this.s();
    }

    private void W() {
        class04891 class048912;
        this.l();
        if (!this.method_5701() && (class048912 = this.G()) != null) {
            this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class048912, this.method_5634(), 1.0f, 1.0f + (this.field_5974.z() - this.field_5974.z()) * 0.2f);
        }
    }

    public float R(float f) {
        return class04995.B((float)f, (float)this.NQ, (float)this.NY);
    }

    protected @Nullable class04891 G() {
        return null;
    }

    public void Y() {
        this.method_5783(class04909.Pc, 0.4f, 1.0f);
    }

    public boolean NO() {
        return this.B(8);
    }

    public boolean aa_() {
        return true;
    }

    public class06889[] ab_() {
        return class02607.N((class07049)this, (double)0.04, (double)0.52, (double)0.23, (double)0.87);
    }

    public int m_() {
        return 400;
    }

    protected void l_() {
        this.e.N(1, (class07473)new class10847(this, 1.2));
        this.e.N(1, (class07473)new class07959(this, 1.2));
        this.e.N(2, (class07473)new class07434((class07633)this, 1.0, class07862.class));
        this.e.N(4, (class07473)new class07459((class07633)this, 1.0));
        this.e.N(6, (class07473)new class07957((class07475)this, 0.7));
        this.e.N(7, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(8, (class07473)new class07956((class07079)this));
        if (this.Nq()) {
            this.e.N(9, (class07473)new class02961(this));
        }
        this.Q();
    }

    public int n_() {
        return 6;
    }

    public int N_() {
        return 0;
    }

    public int Nx() {
        return this.m_();
    }

    public boolean NQ() {
        return this.B(32);
    }

    public static class05300 NK() {
        return class07633.Ne().N(class05298.T, 0.7).N(class05298.n, 53.0).N(class05298.l, (double)0.225f).N(class05298.O, 1.0).N(class05298.w, 6.0).N(class05298.W, 0.5);
    }

    public void o_() {
        super.o_();
        if (this.o()) {
            this.Z(false);
        }
    }

    public void Nf() {
        if (this.Nq() && (this.method_6034() || !this.method_73183().method_8608())) {
            this.U(20);
        }
    }

    protected boolean NS() {
        return !this.method_5782() && !this.method_5765() && this.I() && !this.method_6109() && this.method_6032() >= this.method_6063() && this.NX();
    }

    public boolean Np() {
        return true;
    }

    public void NF() {
        this.y(32, false);
        this.Nl = 0;
    }

    public int Ng() {
        return this.B;
    }

    public final int NJ() {
        return class07610.N((int)this.N_());
    }

    public @Nullable class08372<class07438> NI() {
        return this.NO;
    }

    public int NV() {
        return 100;
    }

    protected boolean Nq() {
        return true;
    }

    public void NC() {
        if (!this.NQ() && !this.method_73183().method_8608()) {
            this.Nf();
            this.method_56078(this.M_());
        }
    }

    public void method_16078(class04782 class047822) {
        super.method_16078(class047822);
        if (this.M == null) {
            return;
        }
        for (int i = 0; i < this.M.method_5439(); ++i) {
            class06584 class065842 = this.M.method_5438(i);
            if (class065842.R() || class07323.N((class06584)class065842, (class02477)class02523.g)) continue;
            this.method_5775(class047822, class065842);
        }
    }

    public float method_49485(class08036 class080362) {
        return (float)this.method_45325(class05298.l);
    }

    public float method_6107() {
        return 0.8f;
    }

    public void method_6007() {
        class04782 class047822;
        block9: {
            block8: {
                if (this.field_5974.y(200) == 0) {
                    this.v();
                }
                super.method_6007();
                class07299 class072992 = this.method_73183();
                if (!(class072992 instanceof class04782)) break block8;
                class047822 = (class04782)class072992;
                if (this.method_5805()) break block9;
            }
            return;
        }
        if (this.field_5974.y(900) == 0 && ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 == 0) {
            this.method_6025(1.0f);
        }
        if (this.Np()) {
            if (!this.o() && !this.method_5782() && this.field_5974.y(300) == 0 && class047822.method_8320(this.method_24515().method_10074()).N(class00869.Z)) {
                this.Z(true);
            }
            if (this.o() && ++this.Nt > 50) {
                this.Nt = 0;
                this.Z(false);
            }
        }
        this.L(class047822);
    }

    public void method_49481(class08036 class080362, class06889 class068892) {
        super.method_49481(class080362, class068892);
        class07109 class071092 = this.u((class07438)class080362);
        this.method_5710(class071092.U, class071092.z);
        float f = this.method_36454();
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f);
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f);
        this.field_5982 = f;
        if (this.method_66247()) {
            if (class068892.Z <= 0.0) {
                this.A = 0;
            }
            if (this.method_24828()) {
                if (this.Z > 0.0f && !this.method_70673()) {
                    this.N(this.Z, class068892);
                }
                this.Z = 0.0f;
            }
        }
    }

    public boolean method_63626(class07085 class070852) {
        return (class070852 == class07085.field_48824 || class070852 == class07085.field_55946) && this.I() || super.method_63626(class070852);
    }

    public boolean method_6101() {
        return false;
    }

    public class03556<class04891> method_66667(class07085 class070852, class06584 class065842, class08725 class087252) {
        if (class070852 == class07085.field_55946) {
            return class04909.Pa;
        }
        return super.method_66667(class070852, class065842, class087252);
    }

    public class06889 method_49482(class08036 class080362, class06889 class068892) {
        if (this.method_24828() && this.Z == 0.0f && this.NQ() && !this.X) {
            return class06889.L;
        }
        float f = class080362.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * 0.5f;
        float f2 = class080362.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue();
        if (f2 <= 0.0f) {
            f2 *= 0.25f;
        }
        return new class06889((double)f, 0.0, (double)f2);
    }

    public boolean method_56991(class07085 class070852) {
        if (class070852 == class07085.field_55946) {
            return this.method_5805() && !this.method_6109() && this.I();
        }
        return super.method_56991(class070852);
    }

    public boolean method_6062() {
        return super.method_6062() && this.method_5782() && this.Nz() || this.o() || this.NQ();
    }

    protected @Nullable class04891 M_() {
        return null;
    }
}

