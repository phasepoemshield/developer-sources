/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10084
 *  Nursultan.class10086
 *  Nursultan.class10088
 *  com.mojang.serialization.Dynamic
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class01001
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02607
 *  minecraft.class03289
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04396
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05781
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06889
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07067
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07107
 *  minecraft.class07109
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07472
 *  minecraft.class07633
 *  minecraft.class07655
 *  minecraft.class07862
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  minecraft.class08725
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10084;
import Nursultan.class10086;
import Nursultan.class10088;
import com.mojang.serialization.Dynamic;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00500;
import minecraft.class01001;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02607;
import minecraft.class02954;
import minecraft.class03289;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04396;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05781;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06889;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07067;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07107;
import minecraft.class07109;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07472;
import minecraft.class07633;
import minecraft.class07655;
import minecraft.class07862;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import minecraft.class08725;
import org.jspecify.annotations.Nullable;

public class class02976
extends class07862 {
    public static final float f = 0.45f;
    public static final int C = 55;
    public static final int S = 30;
    private static final float NE = 0.1f;
    private static final float NW = 1.4285f;
    private static final float Nm = 22.2222f;
    private static final int NP = 5;
    private static final int Ns = 40;
    private static final int NT = 52;
    private static final int Nb = 80;
    private static final float Nj = 1.43f;
    private static final long Nv = 0L;
    public static final class02131<Boolean> x = class03289.N(class02976.class, (class04383)class02154.U);
    public static final class02131<Long> D = class03289.N(class02976.class, (class04383)class02154.L);
    public final class04396 h = new class04396();
    public final class04396 r = new class04396();
    public final class04396 NN = new class04396();
    public final class04396 Ny = new class04396();
    public final class04396 NL = new class04396();
    private static final class01325 Nn = class01325.y((float)class07078.t.z(), (float)(class07078.t.U() - 1.43f)).y(0.845f);
    private int Nt = 0;
    private int NG = 0;

    protected class03529<class04891> w() {
        return class04909.ii;
    }

    private void L(class07049 class070492) {
        class070492.method_5636(this.method_36454());
        float f = class070492.method_36454();
        float f2 = class04995.R((float)(f - this.method_36454()));
        float f3 = class04995.N((float)f2, (float)-160.0f, (float)160.0f);
        class070492.field_5982 += f3 - f2;
        float f4 = f + f3 - f2;
        class070492.method_36456(f4);
        class070492.method_5847(f4);
    }

    protected boolean L(class08036 class080362, class06584 class065842) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        if (!this.N(class065842)) {
            return false;
        }
        boolean bl4 = bl3 = this.method_6032() < this.method_6063();
        if (bl3) {
            this.method_6025(2.0f);
        }
        boolean bl5 = bl2 = this.I() && this.K() == 0 && this.T_();
        if (bl2) {
            this.i(class080362);
        }
        if (bl = this.method_6109()) {
            this.method_73183().method_8406((class07126)class07107.F, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), 0.0, 0.0, 0.0);
            if (!this.method_73183().method_8608()) {
                this.L(10);
            }
        }
        if (bl3 || bl2 || bl) {
            class04891 class048912;
            if (!this.method_5701() && (class048912 = this.G()) != null) {
                this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class048912, this.method_5634(), 1.0f, 1.0f + (this.field_5974.z() - this.field_5974.z()) * 0.2f);
            }
            this.method_32876((class03556)class01194.W);
            return true;
        }
        return false;
    }

    public class06889 M(float f) {
        class01325 class013252 = this.method_18377(this.method_18376());
        float f2 = this.method_17825();
        return new class06889(0.0, this.N(true, f, class013252, f2) - (double)(0.2f * f2), (double)(class013252.N() * 0.56f));
    }

    public void method_5674(class02131<?> class021312) {
        if (!this.field_5953 && x.equals(class021312)) {
            this.Nt = this.Nt == 0 ? 55 : this.Nt;
        }
        super.method_5674(class021312);
    }

    public boolean method_48155() {
        return true;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(x, (Object)false);
        class042932.N(D, (Object)0L);
    }

    public void method_5773() {
        super.method_5773();
        if (this.Nr() && this.Nt < 50 && (this.method_24828() || this.method_52535() || this.method_5765())) {
            this.N(false);
        }
        if (this.Nt > 0) {
            --this.Nt;
            if (this.Nt == 0) {
                this.method_73183().method_8396(null, this.method_24515(), this.v(), class04911.field_15254, 1.0f, 1.0f);
            }
        }
        if (this.method_73183().method_8608()) {
            this.ym();
        }
        if (this.Nh()) {
            this.NM();
        }
        if (this.yy() && this.method_5799()) {
            this.yM();
        }
    }

    public void method_5644(class07049 class070492) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20) && this.method_5642() != class070492) {
            this.L(class070492);
        }
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        if (class005002.N(class01210.yQ)) {
            this.method_5783(class04909.iZ, 1.0f, 1.0f);
        } else {
            this.method_5783(class04909.iB, 1.0f, 1.0f);
        }
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("LastPoseTick", ((Long)this.field_6011.N(D)).longValue());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        long l = class082992.N("LastPoseTick", 0L);
        if (l < 0L) {
            this.method_18380(class01312.field_40118);
        }
        this.N(l);
    }

    protected class06889 method_52533(class07049 class070492, class01325 class013252, float f) {
        boolean bl = Math.max(this.method_5685().indexOf(class070492), 0) == 0;
        float f2 = 0.5f;
        float f3 = (float)(this.method_31481() ? (double)0.01f : this.N(bl, 0.0f, class013252, f));
        if (this.method_5685().size() > 1) {
            if (!bl) {
                f2 = -0.7f;
            }
            if (class070492 instanceof class07633) {
                f2 += 0.2f;
            }
        }
        return new class06889(0.0, (double)f3, (double)(f2 * f)).y(-this.method_36454() * ((float)Math.PI / 180));
    }

    protected boolean method_5818(class07049 class070492) {
        return this.method_5685().size() <= 2;
    }

    protected void method_5865(class07049 class070492, class07067 class070672) {
        super.method_5865(class070492, class070672);
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20)) {
            this.L(class070492);
        }
    }

    public class02976(class07078<? extends class02976> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class10086(this);
        this.o = new class10088(this);
        class07655 class076552 = (class07655)this.f();
        class076552.N(true);
        class076552.u(true);
    }

    public boolean I() {
        return true;
    }

    protected class04891 s() {
        return class04909.uh;
    }

    public int n() {
        return this.Nt;
    }

    protected class04891 l() {
        return class04909.iM;
    }

    protected class04891 d() {
        return class04909.iR;
    }

    public boolean m() {
        return !this.Nh() && super.m();
    }

    public void t() {
    }

    protected class04891 v() {
        return class04909.iN;
    }

    protected class07109 u(class07438 class074382) {
        if (this.Nh()) {
            return new class07109(this.method_36455(), this.method_36454());
        }
        return super.u(class074382);
    }

    public void y(int n) {
        this.method_56078(this.W());
        this.method_32876((class03556)class01194.n);
        this.N(true);
    }

    private void y(long l) {
        this.N(Math.max(0L, l - 52L - 1L));
    }

    public void N(class08036 class080362) {
        if (!this.method_73183().method_8608()) {
            class080362.method_7291((class07862)this, (class06695)this.M);
        }
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("camelBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        class046432.N("camelActivityUpdate");
        class02954.N(this);
        class046432.L();
        super.N(class047822);
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.Na);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class080362.method_21823() && !this.method_6109()) {
            this.N(class080362);
            return class07082.N;
        }
        class07082 class070822 = class065842.N(class080362, (class07438)this, class070502);
        if (class070822.N()) {
            return class070822;
        }
        if (this.N(class065842)) {
            return this.y(class080362, class065842);
        }
        if (this.method_5685().size() < 2 && !this.method_6109()) {
            this.y(class080362);
        }
        return this.ys();
    }

    public @Nullable class02976 N(class04782 class047822, class07077 class070772) {
        return (class02976)class07078.t.N((class07299)class047822, class06113.field_16466);
    }

    public final double N(boolean bl, float f, class01325 class013252, float f2) {
        double d = class013252.y() - 0.375f * f2;
        float f3 = f2 * 1.43f;
        float f4 = f3 - f2 * 0.2f;
        float f5 = f3 - f4;
        boolean bl2 = this.yu();
        boolean bl3 = this.yy();
        if (bl2) {
            float f6;
            int n;
            int n2;
            int n3 = n2 = bl3 ? 40 : 52;
            if (bl3) {
                n = 28;
                f6 = bl ? 0.5f : 0.1f;
            } else {
                n = bl ? 24 : 32;
                f6 = bl ? 0.6f : 0.35f;
            }
            float f7 = class04995.N((float)((float)this.yB() + f), (float)0.0f, (float)n2);
            boolean bl4 = f7 < (float)n;
            float f8 = bl4 ? f7 / (float)n : (f7 - (float)n) / (float)(n2 - n);
            float f9 = f3 - f6 * f4;
            d += bl3 ? (double)class04995.B((float)f8, (float)(bl4 ? f3 : f9), (float)(bl4 ? f9 : f5)) : (double)class04995.B((float)f8, (float)(bl4 ? f5 - f3 : f5 - f9), (float)(bl4 ? f5 - f9 : 0.0f));
        }
        if (bl3 && !bl2) {
            d += (double)f5;
        }
        return d;
    }

    public void N(long l) {
        this.field_6011.N(D, (Object)l);
    }

    public static boolean N(class07078<class02976> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.method_8320(class072092.method_10074()).N(class01210.Ll) && class02976.N((class07295)class072842, (class07209)class072092);
    }

    public void N(boolean bl) {
        this.field_6011.N(x, (Object)bl);
    }

    protected void N(float f, class06889 class068892) {
        double d = this.method_6106();
        this.method_45319(this.method_5720().u(1.0, 0.0, 1.0).u().L((double)(22.2222f * f) * this.method_45325(class05298.l) * (double)this.method_23326()).y(0.0, (double)(1.4285f * f) * d, 0.0));
        this.Nt = 55;
        this.N(true);
        this.field_64356 = true;
    }

    public void N(int n) {
        if (!this.Nz() || this.Nt > 0 || !this.method_24828()) {
            return;
        }
        super.N(n);
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class02954.N(this, class010012.method_8409());
        this.y(class010012.method_8410().N());
        return super.N(class010012, class070522, class061132, class074462);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean N(class07633 class076332) {
        if (class076332 == this) return false;
        if (!(class076332 instanceof class02976)) return false;
        class02976 class029762 = (class02976)class076332;
        if (!this.NS()) return false;
        if (!class029762.NS()) return false;
        return true;
    }

    public void yi() {
        if (this.yy()) {
            return;
        }
        this.method_56078(this.d());
        this.method_18380(class01312.field_40118);
        this.method_32876((class03556)class01194.n);
        this.N(-this.method_73183().N());
    }

    protected class04891 W() {
        return class04909.ur;
    }

    public boolean yu() {
        return this.yB() < (long)(this.yy() ? 40 : 52);
    }

    public static class05300 ND() {
        return class02976.NK().N(class05298.n, 32.0).N(class05298.l, (double)0.09f).N(class05298.T, (double)0.42f).N(class05298.O, 1.5);
    }

    private boolean yP() {
        return this.yy() && this.yB() < 40L && this.yB() >= 0L;
    }

    public void yM() {
        this.method_18380(class01312.field_18076);
        this.method_32876((class03556)class01194.n);
        this.y(this.method_73183().N());
    }

    public long yB() {
        return this.method_73183().N() - Math.abs((Long)this.field_6011.N(D));
    }

    protected class04891 G() {
        return class04909.iL;
    }

    public int NR() {
        return 30;
    }

    public void yR() {
        if (!this.yy()) {
            return;
        }
        this.method_56078(this.l());
        this.method_18380(class01312.field_18076);
        this.method_32876((class03556)class01194.n);
        this.N(this.method_73183().N());
    }

    private class07041 ys() {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_9)) {
            return class07082.N;
        }
        return class07082.L;
    }

    public class06889[] ab_() {
        return class02607.N((class07049)this, (double)0.02, (double)0.48, (double)0.25, (double)0.82);
    }

    protected class07472 Z_() {
        return new class10084(this, this);
    }

    protected void l_() {
    }

    public boolean Nr() {
        return (Boolean)this.field_6011.N(x);
    }

    public boolean Nh() {
        return this.yy() || this.yu();
    }

    public void o_() {
        super.o_();
        if (this.yy() && !this.yu() && this.yN()) {
            this.yR();
        }
    }

    public boolean yL() {
        return this.yB() < 0L != this.yy();
    }

    public boolean yy() {
        return (Long)this.field_6011.N(D) < 0L;
    }

    private void ym() {
        if (this.NG <= 0) {
            this.NG = this.field_5974.y(40) + 80;
            this.Ny.N(this.field_6012);
        } else {
            --this.NG;
        }
        if (this.yL()) {
            this.NN.N();
            this.NL.N();
            if (this.yP()) {
                this.h.y(this.field_6012);
                this.r.N();
            } else {
                this.h.N();
                this.r.y(this.field_6012);
            }
        } else {
            this.h.N();
            this.r.N();
            this.NL.N(this.Nr(), this.field_6012);
            this.NN.N(this.yu() && this.yB() >= 0L, this.field_6012);
        }
    }

    public boolean yN() {
        return this.method_52542(this.yy() ? class01312.field_18076 : class01312.field_40118);
    }

    protected boolean Nq() {
        return false;
    }

    public class05781<class02976> method_28306() {
        return class02954.N();
    }

    public float method_49485(class08036 class080362) {
        float f = class080362.method_5624() && this.n() == 0 ? 0.1f : 0.0f;
        return (float)this.method_45325(class05298.l) + f;
    }

    public class04891 method_6002() {
        return class04909.iy;
    }

    public class01325 method_55694(class01312 class013122) {
        return class013122 == class01312.field_40118 ? Nn.N(this.method_17825()) : super.method_55694(class013122);
    }

    public void method_48565(float f) {
        float f2 = this.method_18376() == class01312.field_18076 && !this.NL.y() ? Math.min(f * 6.0f, 1.0f) : 0.0f;
        ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_3.N(f2, 0.2f, this.method_6109() ? 3.0f : 1.0f);
    }

    public float method_17825() {
        return this.method_6109() ? 0.45f : 1.0f;
    }

    public void method_6074(class04782 class047822, class07072 class070722, float f) {
        this.yM();
        super.method_6074(class047822, class070722, f);
    }

    public void method_6091(class06889 class068892) {
        if (this.Nh() && this.method_24828()) {
            this.method_18799(this.method_18798().u(0.0, 1.0, 0.0));
            class068892 = class068892.u(0.0, 1.0, 0.0);
        }
        super.method_6091(class068892);
    }

    public void method_49481(class08036 class080362, class06889 class068892) {
        super.method_49481(class080362, class068892);
        if (class080362.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() > 0.0f && this.yy() && !this.yu()) {
            this.yR();
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.iu;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class02954.N((class01289<class02976>)this.method_28306().N(dynamic));
    }

    public class03556<class04891> method_66667(class07085 class070852, class06584 class065842, class08725 class087252) {
        if (class070852 == class07085.field_55946) {
            return this.w();
        }
        return super.method_66667(class070852, class065842, class087252);
    }

    public class06889 method_49482(class08036 class080362, class06889 class068892) {
        if (this.Nh()) {
            return class06889.L;
        }
        return super.method_49482(class080362, class068892);
    }
}

