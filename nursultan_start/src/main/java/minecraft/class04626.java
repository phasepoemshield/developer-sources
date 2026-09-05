/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00429
 *  minecraft.class00433
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00729
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01251
 *  minecraft.class01279
 *  minecraft.class01517
 *  minecraft.class02131
 *  minecraft.class02135
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03530
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05473
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06761
 *  minecraft.class06889
 *  minecraft.class06918
 *  minecraft.class06990
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07086
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07427
 *  minecraft.class07434
 *  minecraft.class07438
 *  minecraft.class07459
 *  minecraft.class07460
 *  minecraft.class07467
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07623
 *  minecraft.class07633
 *  minecraft.class07650
 *  minecraft.class07960
 *  minecraft.class08036
 *  minecraft.class08059
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Optional;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00429;
import minecraft.class00433;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00729;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01251;
import minecraft.class01279;
import minecraft.class01517;
import minecraft.class02131;
import minecraft.class02135;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03530;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04598;
import minecraft.class04599;
import minecraft.class04600;
import minecraft.class04603;
import minecraft.class04605;
import minecraft.class04612;
import minecraft.class04617;
import minecraft.class04619;
import minecraft.class04620;
import minecraft.class04623;
import minecraft.class04624;
import minecraft.class04627;
import minecraft.class04629;
import minecraft.class04632;
import minecraft.class04635;
import minecraft.class04651;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05473;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06761;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06990;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07086;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07427;
import minecraft.class07434;
import minecraft.class07438;
import minecraft.class07459;
import minecraft.class07460;
import minecraft.class07467;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07623;
import minecraft.class07633;
import minecraft.class07650;
import minecraft.class07960;
import minecraft.class08036;
import minecraft.class08059;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04626
extends class07633
implements class01279,
class07650 {
    public static final float N = 120.32113f;
    public static final int y = class04995.u((float)1.4959966f);
    private static final class02131<Byte> D = class03289.N(class04626.class, (class04383)class02154.N);
    private static final class02131<Long> h = class03289.N(class04626.class, (class04383)class02154.L);
    private static final int r = 2;
    private static final int NN = 4;
    private static final int Ny = 8;
    private static final int NL = 1200;
    private static final int NE = 600;
    private static final int NW = 3600;
    private static final int Nm = 4;
    private static final int NP = 10;
    private static final int Ns = 10;
    private static final int NT = 18;
    private static final int Nb = 48;
    private static final int Nj = 2;
    private static final int Nv = 24;
    private static final int Nn = 16;
    private static final int Nt = 16;
    private static final int NG = 20;
    public static final String L = "CropsGrownSincePollination";
    public static final String u = "CannotEnterHiveTicks";
    public static final String i = "TicksSincePollination";
    public static final String R = "HasStung";
    public static final String M = "HasNectar";
    public static final String B = "flower_pos";
    public static final String Z = "hive_pos";
    public static final boolean X = false;
    private static final boolean Nl = false;
    private static final int Nd = 0;
    private static final int Nw = 0;
    private static final int Nk = 0;
    private static final class02135 NY = class01517.N((int)20, (int)39);
    private @Nullable class08372<class07438> NQ;
    private float NO;
    private float Ng;
    private int NI;
    int p = 0;
    private int NJ = 0;
    private int No = 0;
    private static final int Nq = 200;
    int F;
    private static final int NK = 200;
    private static final int NV = 20;
    private static final int Ne = 60;
    int A = class04995.N((class06069)this.field_5974, (int)20, (int)60);
    @Nullable class07209 f;
    @Nullable class07209 C;
    class04599 S;
    class04623 x;
    private class04612 NH;
    private int Nc;

    public void w() {
        this.p = 0;
    }

    static /* synthetic */ class06069 w(class04626 class046262) {
        return class046262.field_5974;
    }

    static /* synthetic */ class07623 L(class04626 class046262) {
        return class046262.V;
    }

    public static class05300 No() {
        return class07633.Ne().N(class05298.n, 10.0).N(class05298.m, (double)0.6f).N(class05298.l, (double)0.3f).N(class05298.u, 2.0);
    }

    static /* synthetic */ class07623 M(class04626 class046262) {
        return class046262.V;
    }

    private void M(boolean bl) {
        this.y(4, bl);
    }

    public boolean M(class07209 class072092) {
        class00394 class003942 = this.method_73183().method_8321(class072092);
        if (class003942 instanceof class04620) {
            return !((class04620)class003942).u();
        }
        return false;
    }

    static /* synthetic */ class07623 P(class04626 class046262) {
        return class046262.V;
    }

    static /* synthetic */ class07623 T(class04626 class046262) {
        return class046262.V;
    }

    static /* synthetic */ class06069 Q(class04626 class046262) {
        return class046262.field_5974;
    }

    public @Nullable class07209 Q() {
        return this.C;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(D, (Object)0);
        class042932.N(h, (Object)-1L);
    }

    public void method_5773() {
        super.method_5773();
        if (this.NI() && this.o() < 10 && this.field_5974.z() < 0.05f) {
            for (int i = 0; i < this.field_5974.y(2) + 1; ++i) {
                this.N(this.method_73183(), this.method_23317() - (double)0.3f, this.method_23317() + (double)0.3f, this.method_23321() - (double)0.3f, this.method_23321() + (double)0.3f, this.method_23323(0.5), (class07126)class07107.NQ);
            }
        }
        this.NV();
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.method_5679(class047822, class070722)) {
            return false;
        }
        this.S.E();
        return super.method_64397(class047822, class070722, f);
    }

    public void method_5623(double d, boolean bl, class00500 class005002, class07209 class072092) {
    }

    public boolean method_5776() {
        return this.y() && this.field_6012 % y == 0;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.y(Z, class07209.field_25064, (Object)this.C);
        class083292.y(B, class07209.field_25064, (Object)this.f);
        class083292.N(M, this.NI());
        class083292.N(R, this.NJ());
        class083292.N(i, this.p);
        class083292.N(u, this.NJ);
        class083292.N(L, this.No);
        this.N(class083292);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N(M, false));
        this.M(class082992.N(R, false));
        this.p = class082992.N(i, 0);
        this.NJ = class082992.N(u, 0);
        this.No = class082992.N(L, 0);
        this.C = class082992.N(Z, class07209.field_25064).orElse(null);
        this.f = class082992.N(B, class07209.field_25064).orElse(null);
        this.N(this.method_73183(), class082992);
    }

    public class04626(class07078<? extends class04626> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class07460((class07079)this, 20, true);
        this.o = new class04598(this, (class07079)this);
        this.N(class04425.field_9, -1.0f);
        this.N(class04425.field_18, -1.0f);
        this.N(class04425.field_4, 16.0f);
        this.N(class04425.field_21516, -1.0f);
        this.N(class04425.field_10, -1.0f);
    }

    private void B(boolean bl) {
        this.y(2, bl);
    }

    static /* synthetic */ class07623 B(class04626 class046262) {
        return class046262.V;
    }

    public class07467 I() {
        return this.e;
    }

    static /* synthetic */ class06069 I(class04626 class046262) {
        return class046262.field_5974;
    }

    static /* synthetic */ class07623 Z(class04626 class046262) {
        return class046262.V;
    }

    boolean i(class07209 class072092) {
        return !this.y(class072092, 48);
    }

    static /* synthetic */ class07623 i(class04626 class046262) {
        return class046262.V;
    }

    static /* synthetic */ class07623 b(class04626 class046262) {
        return class046262.V;
    }

    protected class04891 s() {
        return null;
    }

    static /* synthetic */ class07623 s(class04626 class046262) {
        return class046262.V;
    }

    static /* synthetic */ class06069 n(class04626 class046262) {
        return class046262.field_5974;
    }

    public int n() {
        return Math.max(this.x.L, this.NH.y);
    }

    void l() {
        this.f = null;
        this.A = class04995.N((class06069)this.field_5974, (int)20, (int)60);
    }

    static /* synthetic */ class07623 l(class04626 class046262) {
        return class046262.V;
    }

    boolean d() {
        if (this.NJ > 0 || this.S.U() || this.NJ() || this.T() != null) {
            return false;
        }
        return (this.NI() || this.NK() || (Boolean)this.method_73183().method_75728().N(class00608.X, this.method_73189()) != false) && !this.Np();
    }

    static /* synthetic */ class06069 d(class04626 class046262) {
        return class046262.field_5974;
    }

    static /* synthetic */ class07623 m(class04626 class046262) {
        return class046262.V;
    }

    public @Nullable class07209 m() {
        return this.f;
    }

    int o() {
        return this.No;
    }

    static /* synthetic */ class07623 k(class04626 class046262) {
        return class046262.V;
    }

    public List<class07209> t() {
        return this.x.u;
    }

    static /* synthetic */ class07623 t(class04626 class046262) {
        return class046262.V;
    }

    static /* synthetic */ class06069 g(class04626 class046262) {
        return class046262.field_5974;
    }

    public boolean v() {
        return this.f != null;
    }

    static /* synthetic */ class06069 v(class04626 class046262) {
        return class046262.field_5974;
    }

    static /* synthetic */ class07623 j(class04626 class046262) {
        return class046262.V;
    }

    static /* synthetic */ class07623 U(class04626 class046262) {
        return class046262.V;
    }

    static /* synthetic */ class07623 z(class04626 class046262) {
        return class046262.V;
    }

    public float u(float f) {
        return class04995.B((float)f, (float)this.Ng, (float)this.NO);
    }

    static /* synthetic */ class07623 u(class04626 class046262) {
        return class046262.V;
    }

    public void y(class07209 class072092) {
        this.f = class072092;
    }

    private boolean y(int n) {
        return ((Byte)this.field_6011.N(D) & n) != 0;
    }

    boolean y(class07209 class072092, int n) {
        return class072092.method_19771((class00753)this.method_24515(), (double)n);
    }

    static /* synthetic */ class06069 y(class04626 class046262) {
        return class046262.field_5974;
    }

    private void y(int n, boolean bl) {
        if (bl) {
            this.field_6011.N(D, (Object)((byte)((Byte)this.field_6011.N(D) | n)));
        } else {
            this.field_6011.N(D, (Object)((byte)((Byte)this.field_6011.N(D) & ~n)));
        }
    }

    public boolean y() {
        return !this.method_24828();
    }

    public long E() {
        return (Long)this.field_6011.N(h);
    }

    static /* synthetic */ class07623 E(class04626 class046262) {
        return class046262.V;
    }

    protected void N(class04782 class047822) {
        boolean bl = this.NJ();
        this.Nc = this.method_5799() ? ++this.Nc : 0;
        if (this.Nc > 20) {
            this.method_64397(class047822, this.method_48923().Z(), 1.0f);
        }
        if (bl) {
            ++this.NI;
            if (this.NI % 5 == 0 && this.field_5974.y(class04995.N((int)(1200 - this.NI), (int)1, (int)1200)) == 0) {
                this.method_64397(class047822, this.method_48923().s(), this.method_6032());
            }
        }
        if (!this.NI()) {
            ++this.p;
        }
        this.N(class047822, false);
    }

    public void N(int n) {
        this.NJ = n;
    }

    void N(class07209 class072092) {
        class06889 class068892;
        class06889 class068893 = class06889.L((class00753)class072092);
        int n = 0;
        class07209 class072093 = this.method_24515();
        int n2 = (int)class068893.B - class072093.method_10264();
        if (n2 > 2) {
            n = 4;
        } else if (n2 < -2) {
            n = -4;
        }
        int n3 = 6;
        int n4 = 8;
        int n5 = class072093.method_19455((class00753)class072092);
        if (n5 < 15) {
            n3 = n5 / 2;
            n4 = n5 / 2;
        }
        if ((class068892 = class05473.N((class07475)this, (int)n3, (int)n4, (int)n, (class06889)class068893, (double)0.3141592741012573)) == null) {
            return;
        }
        this.V.y(0.5f);
        this.V.N(class068892.M, class068892.B, class068892.Z, 1.0);
    }

    private void N(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
            callbackInfoReturnable.setReturnValue((Object)super.N(class080362, class070502));
        }
    }

    static /* synthetic */ class07623 N(class04626 class046262) {
        return class046262.V;
    }

    public void N(@Nullable class08372<class07438> class083722) {
        this.NQ = class083722;
    }

    private void N(class07299 class072992, double d, double d2, double d3, double d4, double d5, class07126 class071262) {
        class072992.method_8406(class071262, class04995.u((double)class072992.field_9229.U(), (double)d, (double)d2), d5, class04995.u((double)class072992.field_9229.U(), (double)d3, (double)d4), 0.0, 0.0, 0.0);
    }

    public void N(long l) {
        this.field_6011.N(h, (Object)l);
    }

    public float N(class07209 class072092, class05487 class054872) {
        if (class054872.method_8320(class072092).P()) {
            return 10.0f;
        }
        return 0.0f;
    }

    void N(boolean bl) {
        if (bl) {
            this.w();
        }
        this.y(8, bl);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06581 class065812;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class080362, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class06584 class065842 = class080362.method_5998(class070502);
        if (this.N(class065842) && (class065812 = class065842.B()) instanceof class06918 && (class065812 = ((class06918)class065812).L()) instanceof class00729 && (class065812 = ((class00729)class065812).y()) != null) {
            this.N(class080362, class070502, class065842);
            if (!this.method_73183().method_8608()) {
                this.method_6092((class07055)class065812);
            }
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    protected class07623 N(class07299 class072992) {
        class04632 class046322 = new class04632(this, (class07079)this, class072992);
        class046322.y(false);
        class046322.N(false);
        class046322.N(48.0f);
        return class046322;
    }

    public static boolean N(class00500 class005002) {
        if (class005002.N(class01210.Nb)) {
            if (((Boolean)class005002.N((class08092)class06665.q, (Comparable)Boolean.valueOf(false))).booleanValue()) {
                return false;
            }
            if (class005002.N(class00869.zt)) {
                return class005002.L((class08092)class06761.y) == class08059.field_12609;
            }
            return true;
        }
        return false;
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.Nb);
    }

    public @Nullable class04626 y(class04782 class047822, class07077 class070772) {
        return (class04626)class07078.m.N((class07299)class047822, class06113.field_16466);
    }

    private boolean NA() {
        return this.y(2);
    }

    static /* synthetic */ class07623 W(class04626 class046262) {
        return class046262.V;
    }

    public @Nullable class08372<class07438> W() {
        return this.NQ;
    }

    public void R(class07209 class072092) {
        this.C = class072092;
    }

    static /* synthetic */ class07623 R(class04626 class046262) {
        return class046262.V;
    }

    static /* synthetic */ class06069 O(class04626 class046262) {
        return class046262.field_5974;
    }

    void G() {
        this.C = null;
        this.F = 200;
    }

    static /* synthetic */ class06069 G(class04626 class046262) {
        return class046262.field_5974;
    }

    public boolean Y() {
        return this.C != null;
    }

    static /* synthetic */ class06069 Y(class04626 class046262) {
        return class046262.field_5974;
    }

    @Nullable class04620 NO() {
        if (this.C == null) {
            return null;
        }
        if (this.i(this.C)) {
            return null;
        }
        return this.method_73183().N(this.C, class00404.field_20431).orElse(null);
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.5f * this.method_5751()), (double)(this.method_17681() * 0.2f));
    }

    public void method_74589(class04782 class047822, class06990 class069902) {
        super.method_74589(class047822, class069902);
        class069902.N(class00429.y, () -> new class00433(Optional.ofNullable(this.Q()), Optional.ofNullable(this.m()), this.n(), this.t()));
    }

    protected void l_() {
        this.e.N(0, (class07473)new class04624(this, (class07475)this, 1.4f, true));
        this.e.N(1, (class07473)new class04635(this));
        this.e.N(2, (class07473)new class07434((class07633)this, 1.0));
        this.e.N(3, (class07473)new class07960((class07475)this, 1.25, class065842 -> class065842.N(class01226.Nb), false));
        this.e.N(3, (class07473)new class04600(this));
        this.e.N(3, (class07473)new class04629(this));
        this.S = new class04599(this);
        this.e.N(4, (class07473)this.S);
        this.e.N(5, (class07473)new class07459((class07633)this, 1.25));
        this.e.N(5, (class07473)new class04619(this));
        this.x = new class04623(this);
        this.e.N(5, (class07473)this.x);
        this.NH = new class04612(this);
        this.e.N(6, (class07473)this.NH);
        this.e.N(7, (class07473)new class04605(this));
        this.e.N(8, (class07473)new class04627(this));
        this.e.N(9, (class07473)new class07427((class07079)this));
        this.H.N(1, (class07473)new class04603(this, this).N(new Class[0]));
        this.H.N(2, (class07473)new class04617(this));
        this.H.N(3, (class07473)new class01251((class07079)this, true));
    }

    void NQ() {
        ++this.No;
    }

    private boolean NK() {
        return this.p > 3600;
    }

    private boolean Np() {
        class04620 class046202 = this.NO();
        return class046202 != null && class046202.N();
    }

    private void NF() {
        this.No = 0;
    }

    boolean Ng() {
        return this.NO() != null;
    }

    public boolean NJ() {
        return this.y(4);
    }

    public boolean NI() {
        return this.y(8);
    }

    private void NV() {
        this.Ng = this.NO;
        this.NO = this.NA() ? Math.min(1.0f, this.NO + 0.2f) : Math.max(0.0f, this.NO - 0.24f);
    }

    public void Nq() {
        this.N(false);
        this.NF();
    }

    public class04891 method_6002() {
        return class04909.LN;
    }

    public float method_6107() {
        return 0.4f;
    }

    public void method_6007() {
        super.method_6007();
        if (!this.method_73183().method_8608()) {
            if (this.NJ > 0) {
                --this.NJ;
            }
            if (this.F > 0) {
                --this.F;
            }
            if (this.A > 0) {
                --this.A;
            }
            boolean bl = this.P_() && !this.NJ() && this.T() != null && this.T().method_5858((class07049)this) < 4.0;
            this.B(bl);
            if (this.field_6012 % 20 == 0 && !this.Ng()) {
                this.C = null;
            }
        }
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        class07072 class070722 = this.method_48923().N((class07438)this);
        boolean bl = class070492.method_64397(class047822, class070722, (float)((int)this.method_45325(class05298.u)));
        if (bl) {
            class07323.N((class04782)class047822, (class07049)class070492, (class07072)class070722);
            if (class070492 instanceof class07438) {
                class07438 class074382 = (class07438)class070492;
                class074382.method_21755(class074382.method_21753() + 1);
                int n = 0;
                if (this.method_73183().y() == class07086.field_5802) {
                    n = 10;
                } else if (this.method_73183().y() == class07086.field_5807) {
                    n = 18;
                }
                if (n > 0) {
                    class074382.method_37222(new class07055(class07047.j, n * 20, 0), (class07049)this);
                }
            }
            this.M(true);
            this.R_();
            this.method_5783(class04909.Li, 1.0f, 1.0f);
        }
        return bl;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Ly;
    }

    public void method_6010(class03530<class04651> class035302) {
        this.method_18799(this.method_18798().y(0.0, 0.01, 0.0));
    }

    public void W_() {
        this.y(NY.N(this.field_5974));
    }
}

