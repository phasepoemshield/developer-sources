/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01178
 *  minecraft.class01187
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02523
 *  minecraft.class03289
 *  minecraft.class03481
 *  minecraft.class03485
 *  minecraft.class03493
 *  minecraft.class03502
 *  minecraft.class03508
 *  minecraft.class03618
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04391
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05781
 *  minecraft.class06113
 *  minecraft.class06293
 *  minecraft.class06517
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07075
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07460
 *  minecraft.class07475
 *  minecraft.class07623
 *  minecraft.class07991
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01178;
import minecraft.class01187;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class03289;
import minecraft.class03481;
import minecraft.class03485;
import minecraft.class03493;
import minecraft.class03502;
import minecraft.class03508;
import minecraft.class03618;
import minecraft.class03632;
import minecraft.class03645;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04391;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05781;
import minecraft.class06113;
import minecraft.class06293;
import minecraft.class06517;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07075;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07460;
import minecraft.class07475;
import minecraft.class07623;
import minecraft.class07991;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class03630
extends class07475
implements class03502,
class04391 {
    private static final class00753 i = new class00753(1, 1, 1);
    private static final int R = 5;
    private static final float W = 55.0f;
    private static final float m = 15.0f;
    private static final int P = 0;
    private static final int s = 6000;
    private static final int T = 3;
    public static final int N = 1024;
    private static final class02131<Boolean> b = class03289.N(class03630.class, (class04383)class02154.U);
    private static final class02131<Boolean> X = class03289.N(class03630.class, (class04383)class02154.U);
    protected static final ImmutableList<class05340<? extends class05355<? super class03630>>> y = ImmutableList.of((Object)class05340.L, (Object)class05340.u, (Object)class05340.R, (Object)class05340.y);
    protected static final ImmutableList<class05378<?>> L = ImmutableList.of((Object)class05378.n, (Object)class05378.P, (Object)class05378.B, (Object)class05378.m, (Object)class05378.I, (Object)class05378.d, (Object)class05378.H, (Object)class05378.ND, (Object)class05378.Nh, (Object)class05378.Nr, (Object)class05378.yN, (Object)class05378.NN, (Object[])new class05378[0]);
    public static final ImmutableList<Float> u = ImmutableList.of((Object)Float.valueOf(0.5625f), (Object)Float.valueOf(0.625f), (Object)Float.valueOf(0.75f), (Object)Float.valueOf(0.9375f), (Object)Float.valueOf(1.0f), (Object)Float.valueOf(1.0f), (Object)Float.valueOf(1.125f), (Object)Float.valueOf(1.25f), (Object)Float.valueOf(1.5f), (Object)Float.valueOf(1.875f), (Object)Float.valueOf(2.0f), (Object)Float.valueOf(2.25f), (Object[])new Float[]{Float.valueOf(2.5f), Float.valueOf(3.0f), Float.valueOf(3.75f), Float.valueOf(4.0f)});
    private final class01178<class03485> a;
    private class03508 p;
    private final class03481 F;
    private final class01178<class03632> A;
    private final class07075 f = new class07075(1);
    private @Nullable class07209 C;
    private long S = 0L;
    private float x;
    private float D;
    private float h;
    private float r;
    private float NN;

    private void w() {
        double d = this.field_5974.E() * 0.02;
        double d2 = this.field_5974.E() * 0.02;
        double d3 = this.field_5974.E() * 0.02;
        this.method_73183().method_8406((class07126)class07107.f, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d, d2, d3);
    }

    private boolean L(class06584 class065842, class06584 class065843) {
        class06517 class065172;
        class06517 class065173 = (class06517)class065842.method_58694(class02484.h);
        return !Objects.equals(class065173, class065172 = (class06517)class065843.method_58694(class02484.h));
    }

    private boolean L(@Nullable class07049 class070492) {
        if (class070492 instanceof class08036) {
            class08036 class080362 = (class08036)class070492;
            Optional var3 = this.method_18868().L(class05378.ND);
            return var3.isPresent() && class080362.method_5667().equals(var3.get());
        }
        return false;
    }

    public class03508 L() {
        return this.p;
    }

    public static class05300 M() {
        return class07079.H().N(class05298.n, 20.0).N(class05298.m, (double)0.1f).N(class05298.l, (double)0.1f).N(class05298.u, 2.0);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(b, (Object)false);
        class042932.N(X, (Object)true);
    }

    public void method_5773() {
        super.method_5773();
        if (this.method_73183().method_8608()) {
            this.D = this.x;
            this.x = this.B() ? class04995.N((float)(this.x + 1.0f), (float)0.0f, (float)5.0f) : class04995.N((float)(this.x - 1.0f), (float)0.0f, (float)5.0f);
            if (this.E()) {
                this.h += 1.0f;
                this.NN = this.r;
                this.r = this.W() ? (this.r += 1.0f) : (this.r -= 1.0f);
                this.r = class04995.N((float)this.r, (float)0.0f, (float)15.0f);
            } else {
                this.h = 0.0f;
                this.r = 0.0f;
                this.NN = 0.0f;
            }
        } else {
            class03493.N((class07299)this.method_73183(), (class03508)this.p, (class03481)this.F);
            if (this.Nk()) {
                this.N(false);
            }
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.L(class070722.u())) {
            return false;
        }
        return super.method_64397(class047822, class070722, f);
    }

    public void method_5623(double d, boolean bl, class00500 class005002, class07209 class072092) {
    }

    public boolean method_5776() {
        return !this.method_24828();
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        this.N(class083292);
        class083292.N("listener", class03508.N, (Object)this.p);
        class083292.N("DuplicationCooldown", this.S);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.b_(class082992);
        this.p = class082992.N("listener", class03508.N).orElseGet(class03508::new);
        this.N(class082992.N("DuplicationCooldown", 0));
    }

    public void method_5711(byte by) {
        if (by == 18) {
            for (int i = 0; i < 3; ++i) {
                this.w();
            }
        } else {
            super.method_5711(by);
        }
    }

    public void method_42147(BiConsumer<class01178<?>, class04782> biConsumer) {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            biConsumer.accept(this.a, class047822);
            biConsumer.accept(this.A, class047822);
        }
    }

    protected boolean method_61416(class07049 class070492) {
        return this.L(class070492) || super.method_61416(class070492);
    }

    public class03630(class07078<? extends class03630> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class07460((class07079)this, 20, true);
        this.L(this.method_5936());
        this.F = new class03618(this);
        this.p = new class03508();
        this.a = new class01178((class01187)new class03485((class03502)this));
        this.A = new class01178((class01187)new class03632(this, this.F.y(), ((class01194)class01194.g.N()).N()));
    }

    public boolean B() {
        return !this.method_5998(class07050.field_5808).R();
    }

    public float i(float f) {
        return class04995.B((float)f, (float)this.NN, (float)this.r) / 15.0f;
    }

    protected class04891 s() {
        return this.method_6084(class07085.field_6173) ? class04909.N : class04909.y;
    }

    public class07075 n() {
        return this.f;
    }

    private void l() {
        this.N(6000L);
    }

    private boolean d() {
        return (Boolean)this.field_6011.N(X);
    }

    private boolean m() {
        return this.method_18868().N_22(class05378.yN, class05367.field_18456);
    }

    private void t() {
        if (!this.method_73183().method_8608() && this.S > 0L) {
            this.N(this.S - 1L);
        }
    }

    private boolean v() {
        return this.C == null || !this.C.method_19769((class00737)this.method_73189(), (double)((class01194)class01194.g.N()).N()) || !this.method_73183().method_8320(this.C).N(class00869.iG);
    }

    public class03481 u() {
        return this.F;
    }

    public float u(float f) {
        return class04995.B((float)f, (float)this.D, (float)this.x) / 5.0f;
    }

    private boolean y(class06584 class065842, class06584 class065843) {
        return class06584.y((class06584)class065842, (class06584)class065843) && !this.L(class065842, class065843);
    }

    public boolean y(class04782 class047822, class06584 class065842) {
        class06584 class065843 = this.method_5998(class07050.field_5808);
        return !class065843.R() && (Boolean)class047822.method_64395().N(class07305.I) != false && this.f.L(class065842) && this.y(class065843, class065842);
    }

    public boolean E() {
        return (Boolean)this.field_6011.N(b);
    }

    public boolean N(double d) {
        return false;
    }

    protected class07623 N(class07299 class072992) {
        class07991 class079912 = new class07991((class07079)this, class072992);
        class079912.y(false);
        class079912.N(true);
        class079912.N(48.0f);
        return class079912;
    }

    protected class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        class06584 class065843 = this.method_5998(class07050.field_5808);
        if (this.E() && class065842.N(class01226.Nl) && this.d()) {
            this.G();
            this.method_73183().method_8421((class07049)this, (byte)18);
            this.method_73183().method_43129((class07049)class080362, (class07049)this, class04909.g, class04911.field_15254, 2.0f, 1.0f);
            this.N(class080362, class065842);
            return class07082.N;
        }
        if (class065843.R() && !class065842.R()) {
            class06584 class065844 = class065842.L(1);
            this.method_6122(class07050.field_5808, class065844);
            this.N(class080362, class065842);
            this.method_73183().method_43129((class07049)class080362, (class07049)this, class04909.i, class04911.field_15254, 2.0f, 1.0f);
            this.method_18868().N(class05378.ND, (Object)class080362.method_5667());
            return class07082.N;
        }
        if (!class065843.R() && class070502 == class07050.field_5808 && class065842.R()) {
            this.method_5673(class07085.field_6173, class06584.E);
            this.method_73183().method_43129((class07049)class080362, (class07049)this, class04909.R, class04911.field_15254, 2.0f, 1.0f);
            this.method_6104(class07050.field_5808);
            for (class06584 class065845 : this.n().N()) {
                class06293.N((class07438)this, (class06584)class065845, (class06889)this.method_73189());
            }
            this.method_18868().y(class05378.ND);
            class080362.method_7270(class065843);
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    private void N(class08036 class080362, class06584 class065842) {
        class065842.N(1, (class07438)class080362);
    }

    public void N(class07209 class072092, boolean bl) {
        if (bl) {
            if (!this.E()) {
                this.C = class072092;
                this.N(true);
            }
        } else if (class072092.equals((Object)this.C) || this.C == null) {
            this.C = null;
            this.N(false);
        }
    }

    private void N(long l) {
        this.S = l;
        this.field_6011.N(X, (Object)(l == 0L ? 1 : 0));
    }

    public void N(boolean bl) {
        if (this.method_73183().method_8608() || !this.method_6034() || bl && this.Nk()) {
            return;
        }
        this.field_6011.N(b, (Object)bl);
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("allayBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        class046432.N("allayActivityUpdate");
        class03645.N(this);
        class046432.L();
        super.N(class047822);
    }

    protected void N(class04782 class047822, class00717 class007172) {
        class04391.N((class04782)class047822, (class07079)this, (class04391)this, (class00717)class007172);
    }

    public boolean W() {
        return this.h % 55.0f < 15.0f;
    }

    private void G() {
        class03630 class036302 = (class03630)class07078.i.N(this.method_73183(), class06113.field_16466);
        if (class036302 != null) {
            class036302.method_29495(this.method_73189());
            class036302.NW();
            class036302.l();
            this.l();
            this.method_73183().method_8649((class07049)class036302);
        }
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)this.method_5751() * 0.6, (double)this.method_17681() * 0.1);
    }

    protected class00753 Ny() {
        return i;
    }

    public void method_16078(class04782 class047822) {
        super.method_16078(class047822);
        this.f.N().forEach(class065842 -> this.method_5775(class047822, (class06584)class065842));
        class06584 class065843 = this.method_6118(class07085.field_6173);
        if (!class065843.R() && !class07323.N((class06584)class065843, (class02477)class02523.g)) {
            this.method_5775(class047822, class065843);
            this.method_5673(class07085.field_6173, class06584.E);
        }
    }

    public class05781<class03630> method_28306() {
        return class01289.N(L, y);
    }

    public class04891 method_6002() {
        return class04909.L;
    }

    public float method_6107() {
        return 0.4f;
    }

    public void method_6007() {
        super.method_6007();
        if (!this.method_73183().method_8608() && this.method_5805() && this.field_6012 % 10 == 0) {
            this.method_6025(1.0f);
        }
        if (this.E() && this.v() && this.field_6012 % 20 == 0) {
            this.N(false);
            this.C = null;
        }
        this.t();
    }

    public class01289<class03630> method_18868() {
        return super.method_18868();
    }

    public void method_6091(class06889 class068892) {
        this.method_70670(class068892, this.method_6029());
    }

    public boolean method_45324(class06584 class065842, class06584 class065843) {
        return !this.y(class065842, class065843);
    }

    public boolean method_63626(class07085 class070852) {
        return false;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.u;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class03645.N((class01289<class03630>)this.method_28306().N(dynamic));
    }

    public boolean method_5936() {
        return !this.m() && this.B();
    }

    protected boolean k_() {
        return false;
    }
}

