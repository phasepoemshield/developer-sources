/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01042
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01231
 *  minecraft.class01251
 *  minecraft.class01279
 *  minecraft.class01517
 *  minecraft.class01894
 *  minecraft.class02131
 *  minecraft.class02135
 *  minecraft.class02154
 *  minecraft.class02251
 *  minecraft.class02484
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03696
 *  minecraft.class04160
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06506
 *  minecraft.class06517
 *  minecraft.class06551
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07427
 *  minecraft.class07438
 *  minecraft.class07463
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07962
 *  minecraft.class07989
 *  minecraft.class07999
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class01042;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01231;
import minecraft.class01251;
import minecraft.class01279;
import minecraft.class01517;
import minecraft.class01894;
import minecraft.class02131;
import minecraft.class02135;
import minecraft.class02154;
import minecraft.class02251;
import minecraft.class02484;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03696;
import minecraft.class04160;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06551;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07427;
import minecraft.class07438;
import minecraft.class07463;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07486;
import minecraft.class07526;
import minecraft.class07527;
import minecraft.class07556;
import minecraft.class07558;
import minecraft.class07560;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07989;
import minecraft.class07999;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;

public class class07525
extends class07150
implements class01279 {
    private static final class01894 N = class01894.y((String)"attacking");
    private static final class07471 y = new class07471(N, 0.15f, class07463.field_6328);
    private static final int L = 400;
    private static final int u = 600;
    private static final class02131<Optional<class00500>> i = class03289.N(class07525.class, (class04383)class02154.z);
    private static final class02131<Boolean> R = class03289.N(class07525.class, (class04383)class02154.U);
    private static final class02131<Boolean> M = class03289.N(class07525.class, (class04383)class02154.U);
    private int B = Integer.MIN_VALUE;
    private int Z;
    private static final class02135 W = class01517.N((int)20, (int)39);
    private long T;
    private @Nullable class08372<class07438> b;

    boolean L(class07049 class070492) {
        class06889 class068892 = new class06889(this.method_23317() - class070492.method_23317(), this.method_23323(0.5) - class070492.method_23320(), this.method_23321() - class070492.method_23321());
        class068892 = class068892.u();
        double d = 16.0;
        double d2 = this.method_23317() + (this.field_5974.U() - 0.5) * 8.0 - class068892.M * 16.0;
        double d3 = this.method_23318() + (double)(this.field_5974.y(16) - 8) - class068892.B * 16.0;
        double d4 = this.method_23321() + (this.field_5974.U() - 0.5) * 8.0 - class068892.Z * 16.0;
        return this.N(d2, d3, d4);
    }

    public static class05300 M() {
        return class07150.Y().N(class05298.n, 40.0).N(class05298.l, (double)0.3f).N(class05298.u, 7.0).N(class05298.P, 64.0).N(class05298.O, 1.0);
    }

    public void method_5674(class02131<?> class021312) {
        if (R.equals(class021312) && this.G() && this.method_73183().method_8608()) {
            this.m();
        }
        super.method_5674(class021312);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(i, Optional.empty());
        class042932.N(R, (Object)false);
        class042932.N(M, (Object)false);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class07486 class074862;
        class07486 class074863;
        if (this.method_5679(class047822, class070722)) {
            return false;
        }
        class07049 class070492 = class070722.L();
        class07486 class074864 = class074863 = class070492 instanceof class07486 ? (class074862 = (class07486)class070492) : null;
        if (class070722.N(class03696.z) || class074863 != null) {
            boolean bl = class074863 != null && this.N(class047822, class070722, class074863, f);
            for (int i = 0; i < 64; ++i) {
                if (!this.v()) continue;
                return true;
            }
            return bl;
        }
        boolean bl = super.method_64397(class047822, class070722, f);
        if (!(class070722.u() instanceof class07438) && this.field_5974.y(10) != 0) {
            this.v();
        }
        return bl;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class00500 class005002 = this.n();
        if (class005002 != null) {
            class083292.N("carriedBlockState", class00500.N, (Object)class005002);
        }
        this.N(class083292);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N((class00500)class082992.N("carriedBlockState", class00500.N).filter(class005002 -> !class005002.P()).orElse(null));
        this.N(this.method_73183(), class082992);
    }

    public class07525(class07078<? extends class07525> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_18, -1.0f);
    }

    protected class04891 s() {
        return this.t() ? class04909.zC : class04909.zF;
    }

    public @Nullable class00500 n() {
        return ((Optional)this.field_6011.N(i)).orElse(null);
    }

    public void l() {
        this.field_6011.N(M, (Object)true);
    }

    public void m() {
        if (this.field_6012 >= this.B + 400) {
            this.B = this.field_6012;
            if (!this.method_5701()) {
                this.method_73183().method_8486(this.method_23317(), this.method_23320(), this.method_23321(), class04909.zS, this.method_5634(), 2.5f, 1.0f, false);
            }
        }
    }

    public boolean t() {
        return (Boolean)this.field_6011.N(R);
    }

    protected boolean v() {
        if (this.method_73183().method_8608() || !this.method_5805()) {
            return false;
        }
        double d = this.method_23317() + (this.field_5974.U() - 0.5) * 64.0;
        double d2 = this.method_23318() + (double)(this.field_5974.y(64) - 32);
        double d3 = this.method_23321() + (this.field_5974.U() - 0.5) * 64.0;
        return this.N(d, d2, d3);
    }

    public void y(@Nullable class07438 class074382) {
        super.y(class074382);
        class07469 class074692 = this.method_5996(class05298.l);
        if (class074382 == null) {
            this.Z = 0;
            this.field_6011.N(R, (Object)false);
            this.field_6011.N(M, (Object)false);
            class074692.L(N);
        } else {
            this.Z = this.field_6012;
            this.field_6011.N(R, (Object)true);
            if (!class074692.y(N)) {
                class074692.y(y);
            }
        }
    }

    public long E() {
        return this.T;
    }

    public void N(@Nullable class08372<class07438> class083722) {
        this.b = class083722;
    }

    public void N(@Nullable class00500 class005002) {
        this.field_6011.N(i, Optional.ofNullable(class005002));
    }

    private boolean N(class04782 class047822, class07072 class070722, class07486 class074862, float f) {
        if (((class06517)class074862.L().a_(class02484.h, (Object)class06517.N)).N(class06506.N)) {
            return super.method_64397(class047822, class070722, f);
        }
        return false;
    }

    protected void N(class04782 class047822) {
        float f;
        if (class047822.method_8530() && this.field_6012 >= this.Z + 600 && (f = this.method_5718()) > 0.5f && class047822.N_17(this.method_24515()) && this.field_5974.z() * 30.0f < (f - 0.4f) * 2.0f) {
            this.y(null);
            this.v();
        }
        super.N(class047822);
    }

    public float N(class07209 class072092, class05487 class054872) {
        return 0.0f;
    }

    boolean N(class08036 class080362) {
        if (!class07438.staticFields_7212a028292fd3c078969e3ee4c71d9e8_5.test(class080362)) {
            return false;
        }
        return this.method_64619((class07438)class080362, 0.025, true, false, new double[]{this.method_23320()});
    }

    public void N(long l) {
        this.T = l;
    }

    private boolean N(double d, double d2, double d3) {
        class07218 class072182 = new class07218(d, d2, d3);
        while (class072182.method_10264() > this.method_73183().method_31607() && !this.method_73183().method_8320((class07209)class072182).M()) {
            class072182.N(class07211.field_11033);
        }
        class00500 class005002 = this.method_73183().method_8320((class07209)class072182);
        boolean bl = class005002.M();
        boolean bl2 = class005002.Y().N(class01231.N);
        if (!bl || bl2) {
            return false;
        }
        class06889 class068892 = this.method_73189();
        boolean bl3 = this.method_6082(d, d2, d3, true);
        if (bl3) {
            this.method_73183().method_32888((class03556)class01194.F, class068892, class01164.N((class07049)this));
            if (!this.method_5701()) {
                this.method_73183().method_43128(null, this.field_6014, this.field_6036, this.field_5969, class04909.zx, this.method_5634(), 1.0f, 1.0f);
                this.method_5783(class04909.zx, 1.0f, 1.0f);
            }
        }
        return bl3;
    }

    public @Nullable class08372<class07438> W() {
        return this.b;
    }

    public boolean Nu() {
        return super.Nu() || this.n() != null;
    }

    public boolean G() {
        return (Boolean)this.field_6011.N(M);
    }

    protected void l_() {
        this.e.N(0, (class07473)new class07427((class07079)this));
        this.e.N(1, new class07527(this));
        this.e.N(2, (class07473)new class07999((class07475)((Object)this), 1.0, false));
        this.e.N(7, (class07473)new class07957((class07475)((Object)this), 1.0, 0.0f));
        this.e.N(8, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(8, (class07473)new class07956((class07079)this));
        this.e.N(10, new class07526(this));
        this.e.N(11, new class07558(this));
        this.H.N(1, (class07473)((Object)new class07556(this, (arg_0, arg_1) -> ((class07525)this).N(arg_0, arg_1))));
        this.H.N(2, (class07473)new class07989((class07475)((Object)this), new Class[0]));
        this.H.N(3, (class07473)new class07952((class07079)this, class07560.class, true, false));
        this.H.N(4, (class07473)new class01251((class07079)this, false));
    }

    public class04891 method_6002() {
        return class04909.zA;
    }

    public void method_6007() {
        if (this.method_73183().method_8608()) {
            for (int i = 0; i < 2; ++i) {
                this.method_73183().method_8406((class07126)class07107.NM, this.method_23322(0.5), this.method_23319() - 0.25, this.method_23325(0.5), (this.field_5974.U() - 0.5) * 2.0, -this.field_5974.U(), (this.field_5974.U() - 0.5) * 2.0);
            }
        }
        ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_4 = false;
        if (!this.method_73183().method_8608()) {
            this.N((class04782)this.method_73183(), true);
        }
        super.method_6007();
    }

    public boolean method_29503() {
        return true;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.zf;
    }

    public void method_6099(class04782 class047822, class07072 class070722, boolean bl) {
        super.method_6099(class047822, class070722, bl);
        class00500 class005002 = this.n();
        if (class005002 != null) {
            class06584 class065842 = new class06584((class07310)class06570.Ta);
            class07323.N((class06584)class065842, (class01042)class047822.method_30349(), (class05946)class02251.M, (class07052)class047822.method_8404(this.method_24515()), (class06069)this.method_59922());
            class04160 class041602 = new class04160((class04782)this.method_73183()).N(class06551.B, (Object)this.method_73189()).N(class06551.U, (Object)class065842).y(class06551.N, (Object)this);
            for (class06584 class065843 : class005002.N(class041602)) {
                this.method_5775(class047822, class065843);
            }
        }
    }

    public void W_() {
        this.y(W.N(this.field_5974));
    }
}

