/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10286
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00381
 *  minecraft.class00500
 *  minecraft.class01001
 *  minecraft.class01178
 *  minecraft.class01187
 *  minecraft.class01289
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01599
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03481
 *  minecraft.class03485
 *  minecraft.class03493
 *  minecraft.class03502
 *  minecraft.class03508
 *  minecraft.class03616
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04396
 *  minecraft.class04425
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05378
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06244
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class07042
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07055
 *  minecraft.class07063
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07105
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07276
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07623
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10286;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import minecraft.class00381;
import minecraft.class00500;
import minecraft.class01001;
import minecraft.class01178;
import minecraft.class01187;
import minecraft.class01289;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01599;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03481;
import minecraft.class03485;
import minecraft.class03493;
import minecraft.class03502;
import minecraft.class03508;
import minecraft.class03616;
import minecraft.class03696;
import minecraft.class03984;
import minecraft.class03987;
import minecraft.class03992;
import minecraft.class04009;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04396;
import minecraft.class04425;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05378;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06244;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class07042;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07055;
import minecraft.class07063;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07276;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07623;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension;
import org.jspecify.annotations.Nullable;

public class class04003
extends class07150
implements class03502 {
    private static final int W = 40;
    private static final int T = 200;
    private static final int b = 500;
    private static final float X = 0.3f;
    private static final float a = 1.0f;
    private static final float p = 1.5f;
    private static final int F = 30;
    private static final int A = 24;
    private static final class02131<Integer> f = class03289.N(class04003.class, (class04383)class02154.y);
    private static final int C = 200;
    private static final int S = 260;
    private static final int x = 20;
    private static final int D = 120;
    private static final int h = 20;
    private static final int r = 35;
    private static final int NN = 10;
    private static final int Ny = 20;
    private static final int NL = 100;
    private static final int NE = 20;
    private static final int NW = 30;
    private static final float Nm = 4.5f;
    private static final float NP = 0.7f;
    private static final int Ns = 30;
    private int NT;
    private int Nb;
    private int Nj;
    private int Nv;
    public class04396 N = new class04396();
    public class04396 y = new class04396();
    public class04396 L = new class04396();
    public class04396 u = new class04396();
    public class04396 i = new class04396();
    public class04396 R = new class04396();
    private final class01178<class03485> Nn;
    private final class03481 Nt;
    private class03508 NG;
    class03987 M = new class03987(this::L, Collections.emptyList());

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean L(@Nullable class07049 class070492) {
        if (!(class070492 instanceof class07438)) return false;
        class07438 class074382 = (class07438)class070492;
        if (this.method_73183() != class070492.method_73183()) return false;
        if (!class07042.i.test(class070492)) return false;
        if (this.method_5722(class070492)) return false;
        if (class074382.method_5864() == class07078.B) return false;
        if (class074382.method_5864() == class07078.yX) return false;
        if (class074382.method_5655()) return false;
        if (class074382.method_29504()) return false;
        if (!this.method_73183().method_8621().N(class074382.method_5829())) return false;
        return true;
    }

    public class03508 L() {
        return this.NG;
    }

    boolean M() {
        return this.method_41328(class01312.field_38100) || this.method_41328(class01312.field_38099);
    }

    public @Nullable class07438 T() {
        return this.S();
    }

    public boolean method_5659(class07307 class073072) {
        return this.M();
    }

    public void method_5674(class02131<?> class021312) {
        if (field_18064.equals(class021312)) {
            switch (this.method_18376()) {
                case field_38097: {
                    this.N.N(this.field_6012);
                    break;
                }
                case field_38098: {
                    this.y.N(this.field_6012);
                    break;
                }
                case field_38099: {
                    this.L.N(this.field_6012);
                    break;
                }
                case field_38100: {
                    this.u.N(this.field_6012);
                }
            }
        }
        super.method_5674(class021312);
    }

    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        if (class072762.W() == 1) {
            this.method_18380(class01312.field_38099);
        }
    }

    public class00381<class07280> method_18002(class01599 class015992) {
        return new class07276((class07049)this, class015992, this.method_41328(class01312.field_38099) ? 1 : 0);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(f, (Object)0);
    }

    public void method_5773() {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class03493.N((class07299)((class04782)class072992), (class03508)this.NG, (class03481)this.Nt);
            if (this.Nm() || this.Nu()) {
                class03984.N((class07438)this);
            }
        }
        super.method_5773();
        if (this.method_73183().method_8608()) {
            if (this.field_6012 % this.t() == 0) {
                this.Nj = 10;
                if (!this.method_5701()) {
                    this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.IM, this.method_5634(), 5.0f, this.method_6017(), false);
                }
            }
            this.Nb = this.NT;
            if (this.NT > 0) {
                --this.NT;
            }
            this.Nv = this.Nj;
            if (this.Nj > 0) {
                --this.Nj;
            }
            switch (this.method_18376()) {
                case field_38099: {
                    this.N(this.L);
                    break;
                }
                case field_38100: {
                    this.N(this.u);
                }
            }
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        boolean bl = super.method_64397(class047822, class070722, f);
        if (!this.Nt() && !this.M()) {
            class07049 class070492 = class070722.u();
            this.N(class070492, class04009.field_38122.N() + 20, false);
            if (((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.s).isEmpty() && class070492 instanceof class07438) {
                class07438 class074382 = (class07438)class070492;
                if (class070722.y() || this.method_24516((class07049)class074382, 5.0)) {
                    this.N(class074382);
                }
            }
        }
        return bl;
    }

    protected float method_5867() {
        return this.field_5994 + 0.55f;
    }

    public boolean method_33189() {
        return true;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.Ib, 10.0f, 1.0f);
    }

    public boolean method_5810() {
        return !this.M() && super.method_5810();
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("anger", class03987.N(this::L), (Object)this.M);
        class083292.N("listener", class03508.N, (Object)this.NG);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.M = class082992.N("anger", class03987.N(this::L)).orElseGet(() -> new class03987(this::L, Collections.emptyList()));
        this.n();
        this.NG = class082992.N("listener", class03508.N).orElseGet(class03508::new);
    }

    protected boolean method_5860(class07049 class070492) {
        return false;
    }

    public void method_5711(byte by) {
        if (by == 4) {
            this.N.N();
            this.i.N(this.field_6012);
        } else if (by == 61) {
            this.NT = 10;
        } else if (by == 62) {
            this.R.N(this.field_6012);
        } else {
            super.method_5711(by);
        }
    }

    public void method_42147(BiConsumer<class01178<?>, class04782> biConsumer) {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            biConsumer.accept(this.Nn, class047822);
        }
    }

    public class04003(class07078<? extends class07150> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.Nt = new class03992(this);
        this.NG = new class03508();
        this.Nn = new class01178((class01187)new class03485((class03502)this));
        this.J = 5;
        this.f().N(true);
        this.N(class04425.field_25418, 0.0f);
        this.N(class04425.field_17, 8.0f);
        this.N(class04425.field_33534, 8.0f);
        this.N(class04425.field_14, 8.0f);
        this.N(class04425.field_3, 0.0f);
        this.N(class04425.field_9, 0.0f);
    }

    public static class05300 B() {
        return class07150.Y().N(class05298.n, 500.0).N(class05298.l, (double)0.3f).N(class05298.b, 1.0).N(class05298.i, 1.5).N(class05298.u, 30.0).N(class05298.P, 24.0);
    }

    public float i(float f) {
        return class04995.B((float)f, (float)this.Nv, (float)this.Nj) / 10.0f;
    }

    public void i(@Nullable class07049 class070492) {
        this.N(class070492, 35, true);
    }

    protected @Nullable class04891 s() {
        if (this.method_41328(class01312.field_38097) || this.M()) {
            return null;
        }
        return this.W().y();
    }

    private void n() {
        this.field_6011.N(f, (Object)this.l());
    }

    private int l() {
        return this.M.y((class07049)this.T());
    }

    public Optional<class07438> m() {
        if (this.W().u()) {
            return this.M.N();
        }
        return Optional.empty();
    }

    private int t() {
        float f = (float)this.E() / (float)class04009.field_38122.N();
        return 40 - class04995.y((float)(class04995.N((float)f, (float)0.0f, (float)1.0f) * 30.0f));
    }

    public class03987 v() {
        return this.M;
    }

    public void u(class07049 class070492) {
        this.M.N(class070492);
    }

    public class03481 u() {
        return this.Nt;
    }

    public float u(float f) {
        return class04995.B((float)f, (float)this.Nb, (float)this.NT) / 10.0f;
    }

    public int E() {
        return (Integer)this.field_6011.N(f);
    }

    public boolean N(double d) {
        return false;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        this.method_18868().N(class05378.Na, (Object)class06244.field_17274, 1200L);
        if (class061132 == class06113.field_16461) {
            this.method_18380(class01312.field_38099);
            this.method_18868().N(class05378.Nc, (Object)class06244.field_17274, (long)class03984.N);
            this.method_5783(class04909.gr, 5.0f, 1.0f);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    protected class07623 N(class07299 class072992) {
        return new class10286(this, (class07079)this, class072992);
    }

    public void N(@Nullable class07049 class070492, int n, boolean bl) {
        if (!this.Nt() && this.L(class070492)) {
            class03984.N((class07438)this);
            boolean bl2 = !(this.T() instanceof class08036);
            int n2 = this.M.N(class070492, n);
            if (class070492 instanceof class08036 && bl2 && class04009.N(n2).u()) {
                this.method_18868().y(class05378.s);
            }
            if (bl) {
                this.G();
            }
        }
    }

    static /* synthetic */ class01289 N(class04003 class040032) {
        return ((class07438)class040032).fields_12212a028292fd3c078969e3ee4c71d9e8_1;
    }

    public void N(class07438 class074382) {
        this.method_18868().y(class05378.NK);
        this.method_18868().N(class05378.s, (Object)class074382);
        this.method_18868().y(class05378.I);
        class03616.N((class07438)this, (int)200);
    }

    private void N(class04396 class043962) {
        if ((float)class043962.N((float)this.field_6012) < 4500.0f) {
            class06069 class060692 = this.method_59922();
            class00500 class005002 = this.method_25936();
            if (class005002.b() != class06898.field_11455) {
                for (int i = 0; i < 30; ++i) {
                    double d = this.method_23317() + (double)class04995.y((class06069)class060692, (float)-0.7f, (float)0.7f);
                    double d2 = this.method_23318();
                    double d3 = this.method_23321() + (double)class04995.y((class06069)class060692, (float)-0.7f, (float)0.7f);
                    this.method_73183().method_8406((class07126)this.N(new class07105(class07107.y, class005002)), d, d2, d3, 0.0, 0.0, 0.0);
                }
            }
        }
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("wardenBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        super.N(class047822);
        if ((this.field_6012 + this.method_5628()) % 120 == 0) {
            class04003.N(class047822, this.method_73189(), (class07049)this, 20);
        }
        if (this.field_6012 % 20 == 0) {
            this.M.N(class047822, this::L);
            this.n();
        }
        class03984.N(this);
    }

    public boolean N(class05487 class054872) {
        return super.N(class054872) && class054872.method_8587((class07049)this, this.method_5864().E().N(this.method_73189()));
    }

    public static void N(class04782 class047822, class06889 class068892, @Nullable class07049 class070492, int n) {
        class07055 class070552 = new class07055(class07047.J, 260, 0, false, false);
        class07063.N((class04782)class047822, (class07049)class070492, (class06889)class068892, (double)n, (class07055)class070552, (int)200);
    }

    public float N(class07209 class072092, class05487 class054872) {
        return 0.0f;
    }

    private class07105 N(class07105 class071052) {
        ((BlockStateParticleEffectExtension)class071052).fabric_setBlockPos(this.method_23312());
        return class071052;
    }

    public class04009 W() {
        return class04009.N(this.l());
    }

    private void G() {
        if (!this.method_41328(class01312.field_38097)) {
            this.method_5783(this.W().L(), 10.0f, this.method_6017());
        }
    }

    public void method_6087(class07049 class070492) {
        if (!this.Nt() && !this.method_18868().N(class05378.NA)) {
            this.method_18868().N(class05378.NA, (Object)class06244.field_17274, 20L);
            this.i(class070492);
            class03984.N(this, class070492.method_24515());
        }
        super.method_6087(class070492);
    }

    public boolean method_5679(class04782 class047822, class07072 class070722) {
        if (this.M() && !class070722.N(class03696.u)) {
            return true;
        }
        return super.method_5679(class047822, class070722);
    }

    public class04891 method_6002() {
        return class04909.Iu;
    }

    public float method_6107() {
        return 4.0f;
    }

    public class01325 method_55694(class01312 class013122) {
        class01325 class013252 = super.method_55694(class013122);
        if (this.M()) {
            return class01325.L((float)class013252.N(), (float)1.0f);
        }
        return class013252;
    }

    public class01289<class04003> method_18868() {
        return super.method_18868();
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        class047822.method_8421((class07049)this, (byte)4);
        this.method_5783(class04909.IL, 10.0f, this.method_6017());
        class03616.N((class07438)this, (int)40);
        return super.method_6121(class047822, class070492);
    }

    public float method_67125() {
        return 5.0f;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.IB;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class03984.N(this, dynamic);
    }
}

