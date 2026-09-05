/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09459
 *  Nursultan.class09463
 *  Nursultan.class09465
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01287
 *  minecraft.class01290
 *  minecraft.class01297
 *  minecraft.class01298
 *  minecraft.class01300
 *  minecraft.class01302
 *  minecraft.class01305
 *  minecraft.class01306
 *  minecraft.class01308
 *  minecraft.class01312
 *  minecraft.class01319
 *  minecraft.class01324
 *  minecraft.class01325
 *  minecraft.class01326
 *  minecraft.class01330
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03559
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06136
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07092
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07464
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07628
 *  minecraft.class07629
 *  minecraft.class07633
 *  minecraft.class07643
 *  minecraft.class07869
 *  minecraft.class07872
 *  minecraft.class07879
 *  minecraft.class07894
 *  minecraft.class07952
 *  minecraft.class07957
 *  minecraft.class07982
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09459;
import Nursultan.class09463;
import Nursultan.class09465;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01287;
import minecraft.class01290;
import minecraft.class01297;
import minecraft.class01298;
import minecraft.class01300;
import minecraft.class01302;
import minecraft.class01305;
import minecraft.class01306;
import minecraft.class01308;
import minecraft.class01312;
import minecraft.class01319;
import minecraft.class01324;
import minecraft.class01325;
import minecraft.class01326;
import minecraft.class01330;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03559;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06136;
import minecraft.class06152;
import minecraft.class06167;
import minecraft.class06177;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07092;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07464;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07628;
import minecraft.class07629;
import minecraft.class07633;
import minecraft.class07643;
import minecraft.class07869;
import minecraft.class07872;
import minecraft.class07879;
import minecraft.class07894;
import minecraft.class07952;
import minecraft.class07957;
import minecraft.class07982;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public class class06165
extends class07633 {
    private static final class02131<Integer> B = class03289.N(class06165.class, (class04383)class02154.y);
    private static final class02131<Byte> Z = class03289.N(class06165.class, (class04383)class02154.N);
    private static final int X = 1;
    public static final int N = 4;
    public static final int y = 8;
    public static final int L = 16;
    private static final int p = 32;
    private static final int F = 64;
    private static final int A = 128;
    private static final class02131<Optional<class08372<class07438>>> f = class03289.N(class06165.class, (class04383)class02154.b);
    private static final class02131<Optional<class08372<class07438>>> C = class03289.N(class06165.class, (class04383)class02154.b);
    static final Predicate<class00717> u = class007172 -> !class007172.R() && class007172.method_5805();
    private static final Predicate<class07049> S = class070492 -> {
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            return class074382.method_6052() != null && class074382.method_6083() < class074382.field_6012 + 600;
        }
        return false;
    };
    static final Predicate<class07049> i = class070492 -> class070492 instanceof class07628 || class070492 instanceof class07879;
    private static final Predicate<class07049> x = class070492 -> !class070492.method_21751() && class07042.i.test(class070492);
    private static final int D = 600;
    private static final class01325 h = class07078.Ni.E().N(0.5f).y(0.2975f);
    private static final Codec<List<class08372<class07438>>> r = class08372.N().listOf();
    private static final boolean NN = false;
    private static final boolean Ny = false;
    private static final boolean NL = false;
    private class07473 NE;
    private class07473 NW;
    private class07473 Nm;
    private float NP;
    private float Ns;
    float R;
    float M;
    private int NT;

    void w() {
        this.Z(false);
    }

    public boolean L(class06584 class065842) {
        class06584 class065843 = this.method_6118(class07085.field_6173);
        return class065843.R() || this.NT > 0 && this.R(class065842) && !this.R(class065843);
    }

    static /* synthetic */ class06069 L(class06165 class061652) {
        return class061652.field_5974;
    }

    private void M(class06584 class065842) {
        if (class065842.R() || this.method_73183().method_8608()) {
            return;
        }
        class00717 class007172 = new class00717(this.method_73183(), this.method_23317() + this.method_5720().M, this.method_23318() + 1.0, this.method_23321() + this.method_5720().Z, class065842);
        class007172.N(40);
        class007172.N((class07049)this);
        this.method_5783(class04909.EL, 1.0f, 1.0f);
        this.method_73183().method_8649((class07049)class007172);
    }

    void M(boolean bl) {
        this.y(64, bl);
    }

    public boolean Q() {
        return !this.method_6113() && !this.v() && !this.n();
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.NJ);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(f, Optional.empty());
        class042932.N(C, Optional.empty());
        class042932.N(B, (Object)class01319.field_57610.N());
        class042932.N(Z, (Object)0);
    }

    public void method_5773() {
        super.method_5773();
        if (this.method_6034()) {
            boolean bl = this.method_5799();
            if (bl || this.T() != null || this.method_73183().method_8546()) {
                this.w();
            }
            if (bl || this.method_6113()) {
                this.N(false);
            }
            if (this.n() && this.method_73183().field_9229.z() < 0.2f) {
                class07209 class072092 = this.method_24515();
                class00500 class005002 = this.method_73183().method_8320(class072092);
                this.method_73183().N(2001, class072092, class00891.W((class00500)class005002));
            }
        }
        this.Ns = this.NP;
        this.NP = this.d() ? (this.NP += (1.0f - this.NP) * 0.4f) : (this.NP += (0.0f - this.NP) * 0.4f);
        this.M = this.R;
        if (this.method_18276()) {
            this.R += 0.2f;
            if (this.R > 3.0f) {
                this.R = 3.0f;
            }
        } else {
            this.R = 0.0f;
        }
    }

    public boolean method_18276() {
        return this.N(4);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("Trusted", r, (Object)this.m().toList());
        class083292.N("Sleeping", this.method_6113());
        class083292.N("Type", (Codec)class01319.field_41548, (Object)this.W());
        class083292.N("Sitting", this.v());
        class083292.N("Crouching", this.method_18276());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.NJ) {
            return (T)class06165.method_66651(class024772, (Object)this.W());
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.o();
        class082992.N("Trusted", r).orElse(List.of()).forEach(this::N);
        this.Z(class082992.N("Sleeping", false));
        this.N(class082992.N("Type", (Codec)class01319.field_41548).orElse(class01319.field_57610));
        this.N(class082992.N("Sitting", false));
        this.U(class082992.N("Crouching", false));
        if (this.method_73183() instanceof class04782) {
            this.I();
        }
    }

    public void method_5711(byte by) {
        if (by == 45) {
            class06584 class065842 = this.method_6118(class07085.field_6173);
            if (!class065842.R()) {
                for (int i = 0; i < 8; ++i) {
                    class06889 class068892 = new class06889(((double)this.field_5974.z() - 0.5) * 0.1, (double)this.field_5974.z() * 0.1 + 0.1, 0.0).N(-this.method_36455() * ((float)Math.PI / 180)).y(-this.method_36454() * ((float)Math.PI / 180));
                    this.method_73183().method_8406((class07126)new class07092(class07107.S, class065842), this.method_23317() + this.method_5720().M / 2.0, this.method_23318(), this.method_23321() + this.method_5720().Z / 2.0, class068892.M, class068892.B + 0.05, class068892.Z);
                }
            }
        } else {
            super.method_5711(by);
        }
    }

    public class06165(class07078<? extends class06165> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.o = new class01297(this);
        this.q = new class09463(this);
        this.N(class04425.field_5, 0.0f);
        this.N(class04425.field_17, 0.0f);
        this.L(true);
        this.f().N(32.0f);
    }

    public static class05300 B() {
        return class07633.Ne().N(class05298.l, (double)0.3f).N(class05298.n, 10.0).N(class05298.u, 2.0).N(class05298.w, 5.0).N(class05298.P, 32.0);
    }

    private void B(class06584 class065842) {
        class00717 class007172 = new class00717(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321(), class065842);
        this.method_73183().method_8649((class07049)class007172);
    }

    void B(boolean bl) {
        this.y(128, bl);
    }

    public void D() {
        class04891 class048912 = this.s();
        if (class048912 == class04909.Ur) {
            this.method_5783(class048912, 2.0f, this.method_6017());
        } else {
            super.D();
        }
    }

    private void I() {
        if (this.W() == class01319.field_17996) {
            this.H.N(4, this.NE);
            this.H.N(4, this.NW);
            this.H.N(6, this.Nm);
        } else {
            this.H.N(4, this.Nm);
            this.H.N(6, this.NE);
            this.H.N(6, this.NW);
        }
    }

    void Z(boolean bl) {
        this.y(32, bl);
    }

    private boolean i(class06584 class065842) {
        return this.R(class065842) && this.T() == null && this.method_24828() && !this.method_6113();
    }

    public float i(float f) {
        return class04995.B((float)f, (float)this.M, (float)this.R);
    }

    protected @Nullable class04891 s() {
        if (this.method_6113()) {
            return class04909.EN;
        }
        if (!this.method_73183().method_8530() && this.field_5974.z() < 0.1f && this.method_73183().N(class08036.class, this.method_5829().L(16.0, 16.0, 16.0), class07042.R).isEmpty()) {
            return class04909.Ur;
        }
        return class04909.UC;
    }

    public boolean n() {
        return this.N(64);
    }

    public boolean l() {
        return this.R == 3.0f;
    }

    public boolean d() {
        return this.N(8);
    }

    Stream<class08372<class07438>> m() {
        return Stream.concat(((Optional)this.field_6011.N(f)).stream(), ((Optional)this.field_6011.N(C)).stream());
    }

    private void o() {
        this.field_6011.N(f, Optional.empty());
        this.field_6011.N(C, Optional.empty());
    }

    public boolean t() {
        return this.N(128);
    }

    public boolean v() {
        return this.N(1);
    }

    public void U(boolean bl) {
        this.y(4, bl);
    }

    public void z(boolean bl) {
        this.y(16, bl);
    }

    public boolean u(class07438 class074382) {
        return this.m().anyMatch(class083722 -> class083722.y((class08636)class074382));
    }

    static /* synthetic */ class06069 u(class06165 class061652) {
        return class061652.field_5974;
    }

    public float u(float f) {
        return class04995.B((float)f, (float)this.Ns, (float)this.NP) * 0.11f * (float)Math.PI;
    }

    public void y(@Nullable class07438 class074382) {
        if (this.t() && class074382 == null) {
            this.B(false);
        }
        super.y(class074382);
    }

    static /* synthetic */ class06069 y(class06165 class061652) {
        return class061652.field_5974;
    }

    private void y(int n, boolean bl) {
        if (bl) {
            this.field_6011.N(Z, (Object)((byte)((Byte)this.field_6011.N(Z) | n)));
        } else {
            this.field_6011.N(Z, (Object)((byte)((Byte)this.field_6011.N(Z) & ~n)));
        }
    }

    public void E(boolean bl) {
        this.y(8, bl);
    }

    protected void N(class06069 class060692, class07052 class070522) {
        if (class060692.z() < 0.2f) {
            float f = class060692.z();
            class06584 class065842 = f < 0.05f ? new class06584((class07310)class06570.Ty) : (f < 0.2f ? new class06584((class07310)class06570.jO) : (f < 0.4f ? (class060692.Z() ? new class06584((class07310)class06570.Gp) : new class06584((class07310)class06570.GF)) : (f < 0.6f ? new class06584((class07310)class06570.bL) : (f < 0.8f ? new class06584((class07310)class06570.js) : new class06584((class07310)class06570.Tr)))));
            this.method_5673(class07085.field_6173, class065842);
        }
    }

    protected void N(class04782 class047822, class00717 class007172) {
        class06584 class065842 = class007172.N();
        if (this.L(class065842)) {
            int n = class065842.c();
            if (n > 1) {
                this.B(class065842.N(n - 1));
            }
            this.M(this.method_6118(class07085.field_6173));
            this.method_29499(class007172);
            this.method_5673(class07085.field_6173, class065842.N(1));
            this.N(class07085.field_6173);
            this.method_6103((class07049)class007172, class065842.c());
            class007172.method_31472();
            this.NT = 0;
        }
    }

    public static boolean N(class06165 class061652, class07438 class074382) {
        double d = class074382.method_23321() - class061652.method_23321();
        double d2 = class074382.method_23317() - class061652.method_23317();
        double d3 = d / d2;
        int n = 6;
        for (int i = 0; i < 6; ++i) {
            double d4 = d3 == 0.0 ? 0.0 : d * (double)((float)i / 6.0f);
            double d5 = d3 == 0.0 ? d2 * (double)((float)i / 6.0f) : d4 / d3;
            for (int j = 1; j < 4; ++j) {
                if (class061652.method_73183().method_8320(class07209.method_49637((double)(class061652.method_23317() + d5), (double)(class061652.method_23318() + (double)j), (double)(class061652.method_23321() + d4))).d()) continue;
                return false;
            }
        }
        return true;
    }

    static /* synthetic */ boolean N(class06165 class061652) {
        return ((class07438)class061652).fields_6212a028292fd3c078969e3ee4c71d9e8_4;
    }

    private void N(class08372<class07438> class083722) {
        if (((Optional)this.field_6011.N(f)).isPresent()) {
            this.field_6011.N(C, Optional.of(class083722));
        } else {
            this.field_6011.N(f, Optional.of(class083722));
        }
    }

    protected void N(class08036 class080362, class07079 class070792) {
        ((class06165)class070792).N((class07438)class080362);
    }

    public void N(boolean bl) {
        this.y(1, bl);
    }

    public @Nullable class06165 y(class04782 class047822, class07077 class070772) {
        class06165 class061652 = (class06165)class07078.Ni.N((class07299)class047822, class06113.field_16466);
        if (class061652 != null) {
            class061652.N(this.field_5974.Z() ? this.W() : ((class06165)class070772).W());
        }
        return class061652;
    }

    public static boolean N(class07078<class06165> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.method_8320(class072092.method_10074()).N(class01210.Lv) && class06165.N((class07295)class072842, (class07209)class072092);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class01319 class013192 = class01319.N((class03556)class010012.i(this.method_24515()));
        boolean bl = false;
        if (class074462 instanceof class09465) {
            class09465 class094652 = (class09465)class074462;
            class013192 = class094652.N;
            if (class094652.N() >= 2) {
                bl = true;
            }
        } else {
            class074462 = new class09465(class013192);
        }
        this.N(class013192);
        if (bl) {
            this.u(-24000);
        }
        if (class010012 instanceof class04782) {
            this.I();
        }
        this.N(class010012.method_8409(), class070522);
        return super.N(class010012, class070522, class061132, class074462);
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.NO);
    }

    private void N(class01319 class013192) {
        this.field_6011.N(B, (Object)class013192.N());
    }

    private boolean N(int n) {
        return ((Byte)this.field_6011.N(Z) & n) != 0;
    }

    void N(class07438 class074382) {
        this.N((class08372<class07438>)class08372.N((class08636)class074382));
    }

    public class01319 W() {
        return class01319.N((int)((Integer)this.field_6011.N(B)));
    }

    private boolean R(class06584 class065842) {
        return class065842.L(class02484.d) && class065842.L(class02484.w);
    }

    protected void O() {
        this.method_5783(class04909.UD, 1.0f, 1.0f);
    }

    public boolean G() {
        return this.N(16);
    }

    void Y() {
        this.E(false);
        this.U(false);
        this.N(false);
        this.Z(false);
        this.B(false);
        this.M(false);
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.55f * this.method_5751()), (double)(this.method_17681() * 0.4f));
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.NJ) {
            this.N((class01319)class06165.method_66651((class02477)class02484.NJ, t));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    public boolean method_6113() {
        return this.N(32);
    }

    protected void l_() {
        this.NE = new class07952((class07079)this, class07633.class, 10, false, false, (class074382, class047822) -> class074382 instanceof class07628 || class074382 instanceof class07879);
        this.NW = new class07952((class07079)this, class07872.class, 10, false, false, class07872.y);
        this.Nm = new class07952((class07079)this, class07629.class, 20, false, false, (class074382, class047822) -> class074382 instanceof class07643);
        this.e.N(0, (class07473)new class01298(this));
        this.e.N(0, (class07473)new class03559((class07079)this, this.method_73183()));
        this.e.N(1, (class07473)new class06152(this));
        this.e.N(2, (class07473)new class09459(this, 2.2));
        this.e.N(3, (class07473)new class06167(this, 1.0));
        this.e.N(4, (class07473)new class07464((class07475)this, class08036.class, 16.0f, 1.6, 1.4, class074382 -> x.test((class07049)class074382) && !this.u((class07438)class074382) && !this.t()));
        this.e.N(4, (class07473)new class07464((class07475)this, class07894.class, 8.0f, 1.6, 1.4, class074382 -> !((class07894)class074382).NQ() && !this.t()));
        this.e.N(4, (class07473)new class07464((class07475)this, class07869.class, 8.0f, 1.6, 1.4, class074382 -> !this.t()));
        this.e.N(5, (class07473)new class01306(this));
        this.e.N(6, (class07473)new class01287(this));
        this.e.N(6, (class07473)new class01305(this, 1.25));
        this.e.N(7, (class07473)new class01326(this, (double)1.2f, true));
        this.e.N(7, (class07473)new class01290(this));
        this.e.N(8, (class07473)new class01300(this, 1.25));
        this.e.N(9, (class07473)new class01302(this, 32, 200));
        this.e.N(10, (class07473)new class06177(this, 1.2f, 12, 1));
        this.e.N(10, (class07473)new class07982((class07079)this, 0.4f));
        this.e.N(11, (class07473)new class07957((class07475)this, 1.0));
        this.e.N(11, (class07473)new class01308(this));
        this.e.N(12, (class07473)new class01324(this, (class07079)this, class08036.class, 24.0f));
        this.e.N(13, (class07473)new class01330(this));
        this.H.N(3, (class07473)new class06136(this, class07438.class, false, false, (class074382, class047822) -> S.test((class07049)class074382) && !this.u(class074382)));
    }

    public @Nullable class04891 method_6002() {
        return class04909.Ux;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? h : super.method_55694(class013122);
    }

    public void method_6007() {
        if (!this.method_73183().method_8608() && this.method_5805() && this.method_6034()) {
            class07438 class074382;
            ++this.NT;
            class06584 class065842 = this.method_6118(class07085.field_6173);
            if (this.i(class065842)) {
                if (this.NT > 600) {
                    class074382 = class065842.N(this.method_73183(), (class07438)this);
                    if (!class074382.R()) {
                        this.method_5673(class07085.field_6173, (class06584)class074382);
                    }
                    this.NT = 0;
                } else if (this.NT > 560 && this.field_5974.z() < 0.1f) {
                    this.O();
                    this.method_73183().method_8421((class07049)this, (byte)45);
                }
            }
            if ((class074382 = this.T()) == null || !class074382.method_5805()) {
                this.U(false);
                this.E(false);
            }
        }
        if (this.method_6113() || this.method_6062()) {
            ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_4 = false;
            ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(0.0f);
            ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(0.0f);
        }
        super.method_6007();
        if (this.t() && this.field_5974.z() < 0.05f) {
            this.method_5783(class04909.Uf, 1.0f, 1.0f);
        }
    }

    public void method_16080(class04782 class047822, class07072 class070722) {
        class06584 class065842 = this.method_6118(class07085.field_6173);
        if (!class065842.R()) {
            this.method_5775(class047822, class065842);
            this.method_5673(class07085.field_6173, class06584.E);
        }
        super.method_16080(class047822, class070722);
    }

    public boolean method_63626(class07085 class070852) {
        return class070852 == class07085.field_6173 && this.method_5936();
    }

    public @Nullable class04891 method_6011(class07072 class070722) {
        return class04909.Uh;
    }

    public boolean method_6062() {
        return this.method_29504();
    }
}

