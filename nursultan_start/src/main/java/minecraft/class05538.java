/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10519
 *  Nursultan.class10520
 *  Nursultan.class10521
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01001
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02595
 *  minecraft.class02666
 *  minecraft.class02837
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class05549
 *  minecraft.class05552
 *  minecraft.class05558
 *  minecraft.class05573
 *  minecraft.class05781
 *  minecraft.class05970
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07451
 *  minecraft.class07586
 *  minecraft.class07623
 *  minecraft.class07633
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10519;
import Nursultan.class10520;
import Nursultan.class10521;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import minecraft.class01001;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02595;
import minecraft.class02666;
import minecraft.class02837;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class05487;
import minecraft.class05541;
import minecraft.class05549;
import minecraft.class05552;
import minecraft.class05558;
import minecraft.class05573;
import minecraft.class05781;
import minecraft.class05970;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07451;
import minecraft.class07586;
import minecraft.class07623;
import minecraft.class07633;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class05538
extends class07633
implements class05549 {
    public static final int N = 200;
    private static final int p = 10;
    protected static final ImmutableList<? extends class05340<? extends class05355<? super class05538>>> y = ImmutableList.of((Object)class05340.L, (Object)class05340.P, (Object)class05340.R, (Object)class05340.T, (Object)class05340.b);
    protected static final ImmutableList<? extends class05378<?>> L = ImmutableList.of((Object)class05378.j, (Object)class05378.M, (Object)class05378.B, (Object)class05378.U, (Object)class05378.E, (Object)class05378.P, (Object)class05378.m, (Object)class05378.I, (Object)class05378.n, (Object)class05378.s, (Object)class05378.T, (Object)class05378.e, (Object[])new class05378[]{class05378.w, class05378.X, class05378.Q, class05378.a, class05378.p, class05378.A, class05378.S, class05378.NN});
    private static final class02131<Integer> F = class03289.N(class05538.class, (class04383)class02154.y);
    private static final class02131<Boolean> A = class03289.N(class05538.class, (class04383)class02154.U);
    private static final class02131<Boolean> f = class03289.N(class05538.class, (class04383)class02154.U);
    public static final double u = 20.0;
    public static final int i = 1200;
    private static final int C = 6000;
    public static final String R = "Variant";
    private static final int S = 1800;
    private static final int x = 2400;
    private static final boolean D = false;
    public final class02595 M = new class02595(10, class07586.l);
    public final class02595 B = new class02595(10, class07586.l);
    public final class02595 Z = new class02595(10, class07586.l);
    public final class02595 X = new class02595(10, class07586.l);
    private static final int h = 100;

    public void M(boolean bl) {
        this.field_6011.N(A, (Object)bl);
    }

    public @Nullable class07438 T() {
        return this.S();
    }

    public boolean method_5675() {
        return false;
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.Nx);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(F, (Object)0);
        class042932.N(A, (Object)false);
        class042932.N(f, (Object)false);
    }

    public int method_5748() {
        return 6000;
    }

    public void method_5670() {
        class07299 class072992;
        int n = this.method_5669();
        super.method_5670();
        if (!this.Nt() && (class072992 = this.method_73183()) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N(class047822, n);
        }
        if (this.method_73183().method_8608()) {
            this.t();
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        float f2 = this.method_6032();
        if (!this.Nt() && this.method_73183().field_9229.y(3) == 0 && ((float)this.method_73183().field_9229.y(3) < f || f2 / this.method_6063() < 0.5f) && f < f2 && this.method_5799() && (class070722.u() != null || class070722.L() != null) && !this.v()) {
            ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.X, (Object)200);
        }
        return super.method_64397(class047822, class070722, f);
    }

    protected class04891 method_5737() {
        return class04909.Nf;
    }

    protected class04891 method_5625() {
        return class04909.NA;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N(R, class05541.field_56659, (Object)this.m());
        class083292.N("FromBucket", this.B());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.Nx) {
            return (T)class05538.method_66651(class024772, (Object)((Object)this.m()));
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N(R, class05541.field_56659).orElse(class05541.field_57623));
        this.N(class082992.N("FromBucket", false));
    }

    public class05538(class07078<? extends class05538> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_18, 0.0f);
        this.q = new class10519(this);
        this.o = new class10521(this, this, 20);
    }

    public boolean B() {
        return (Boolean)this.field_6011.N(f);
    }

    public void D() {
        if (this.v()) {
            return;
        }
        super.D();
    }

    protected @Nullable class04891 s() {
        return this.method_5799() ? class04909.NF : class04909.Np;
    }

    public static class05300 n() {
        return class07633.Ne().N(class05298.n, 14.0).N(class05298.l, 1.0).N(class05298.u, 2.0).N(class05298.O, 1.0);
    }

    public class05541 m() {
        return class05541.N((Integer)this.field_6011.N(F));
    }

    private void t() {
        class05558 class055582 = this.v() ? class05558.field_52483 : (this.method_5799() ? class05558.field_52484 : (this.method_24828() ? class05558.field_52485 : class05558.field_52486));
        this.M.N(class055582 == class05558.field_52483);
        this.B.N(class055582 == class05558.field_52484);
        this.Z.N(class055582 == class05558.field_52485);
        boolean bl = ((class07438)this).fields_3212a028292fd3c078969e3ee4c71d9e8_3.u() || this.method_36455() != this.field_6004 || this.method_36454() != this.field_5982;
        this.X.N(bl);
    }

    public boolean g() {
        return true;
    }

    public boolean v() {
        return (Boolean)this.field_6011.N(A);
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        class05538 class055382 = (class05538)class07078.z.N((class07299)class047822, class06113.field_16466);
        if (class055382 != null) {
            class05541 class055412 = class05538.N(this.field_5974) ? class05541.y(this.field_5974) : (this.field_5974.Z() ? this.m() : ((class05538)class070772).m());
            class055382.N(class055412);
            class055382.NW();
        }
        return class055382;
    }

    public class04891 E() {
        return class04909.uG;
    }

    public void N(class07001 class070012) {
        class05549.N((class07079)this, (class07001)class070012);
        this.u(class070012.y("Age", 0));
        class070012.R("HuntingCooldown").ifPresentOrElse(l -> this.method_18868().N(class05378.S, (Object)true, class070012.y("HuntingCooldown", 0L)), () -> this.method_18868().N(class05378.S, Optional.empty()));
    }

    public static void N(class04782 class047822, class05538 class055382, class07438 class074382) {
        class07049 class070492;
        class07072 class070722;
        if (class074382.method_29504() && (class070722 = class074382.method_6081()) != null && (class070492 = class070722.u()) != null && class070492.method_5864() == class07078.Ly) {
            class08036 class080362 = (class08036)class070492;
            if (class047822.N(class08036.class, class055382.method_5829().M(20.0)).contains(class080362)) {
                class055382.N(class080362);
            }
        }
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        return class05549.N((class08036)class080362, (class07050)class070502, (class07438)this).orElse(super.N(class080362, class070502));
    }

    public static boolean N(class07078<? extends class07438> class070782, class01001 class010012, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class010012.method_8320(class072092.method_10074()).N(class01210.Lm);
    }

    public boolean N(double d) {
        return !this.B() && !this.method_16914();
    }

    protected void N(class08036 class080362, class07050 class070502, class06584 class065842) {
        if (class065842.N(class06570.jn)) {
            class06584 class065843 = new class06584((class07310)class06570.jE);
            class08036 class080363 = class080362;
            class06584 class065844 = class065842;
            class080362.method_6122(class070502, this.N(class065844, class080363, class065843));
        } else {
            super.N(class080362, class070502, class065842);
        }
    }

    public void N(class08036 class080362) {
        class07055 class070552 = class080362.method_6112(class07047.z);
        if (class070552 == null || class070552.N(2399)) {
            int n = class070552 != null ? class070552.u() : 0;
            int n2 = Math.min(2400, 100 + n);
            class080362.method_37222(new class07055(class07047.z, n2, 0), (class07049)this);
        }
        class080362.method_6016(class07047.u);
    }

    protected class07623 N(class07299 class072992) {
        return new class05573((class07079)this, class072992);
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("axolotlBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        class046432.N("axolotlActivityUpdate");
        class05552.N((class05538)this);
        class046432.L();
        if (!this.Nt()) {
            Optional var3 = this.method_18868().L(class05378.X);
            this.M(var3.isPresent() && (Integer)var3.get() > 0);
        }
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.yB);
    }

    public void N(boolean bl) {
        this.field_6011.N(f, (Object)bl);
    }

    private void N(class05541 class055412) {
        this.field_6011.N(F, (Object)class055412.N());
    }

    private static boolean N(class06069 class060692) {
        return class060692.y(1200) == 0;
    }

    public float N(class07209 class072092, class05487 class054872) {
        return 0.0f;
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        boolean bl = false;
        if (class061132 == class06113.field_16473) {
            return class074462;
        }
        class06069 class060692 = class010012.method_8409();
        if (class074462 instanceof class10520) {
            if (((class10520)class074462).N() >= 2) {
                bl = true;
            }
        } else {
            class074462 = new class10520(new class05541[]{class05541.N(class060692), class05541.N(class060692)});
        }
        this.N(((class10520)class074462).N(class060692));
        if (bl) {
            this.u(-24000);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public boolean N(class05487 class054872) {
        return class054872.method_8606((class07049)this);
    }

    private class06584 N(class06584 class065842, class08036 class080362, class06584 class065843) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
            return class065843;
        }
        return class05970.N((class06584)class065842, (class08036)class080362, (class06584)class065843);
    }

    protected void N(class04782 class047822, int n) {
        if (this.method_5805() && !this.method_5721()) {
            this.method_5855(n - 1);
            if (this.method_74092()) {
                this.method_5855(0);
                this.method_64397(class047822, this.method_48923().v(), 2.0f);
            }
        } else {
            this.method_5855(this.method_5748());
        }
    }

    public void W() {
        int n = this.method_5669() + 1800;
        this.method_5855(Math.min(n, this.method_5748()));
    }

    public int Ni() {
        return 1;
    }

    public boolean Nu() {
        return super.Nu() || this.B();
    }

    public int NR() {
        return 1;
    }

    public class06584 Y() {
        return new class06584((class07310)class06570.jt);
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.Nx) {
            this.N((class05541)((Object)class05538.method_66651((class02477)class02484.Nx, t)));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    public void e_(class06584 class065842) {
        class05549.N((class07079)this, (class06584)class065842);
        class065842.N(class02484.Nx, (class02666)this);
        class02837.N((class02477)class02484.NM, (class06584)class065842, (T class070012) -> {
            class070012.N("Age", this.K());
            class01289<class05538> var2 = this.method_18868();
            if (var2.N(class05378.S)) {
                class070012.N("HuntingCooldown", var2.i(class05378.S));
            }
        });
    }

    public class05781<class05538> method_28306() {
        return class01289.N(L, y);
    }

    public @Nullable class04891 method_6002() {
        return class04909.NX;
    }

    public void method_59928() {
        this.method_5783(class04909.Nc, 1.0f, 1.0f);
    }

    public class01289<class05538> method_18868() {
        return super.method_18868();
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Na;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class05552.N((class01289)this.method_28306().N(dynamic));
    }

    public boolean method_33190() {
        return !this.v() && super.method_33190();
    }

    public void method_76087(class06889 class068892, double d, boolean bl, double d2) {
        this.method_5724(this.method_6029(), class068892);
        this.method_5784(class07451.field_6308, this.method_18798());
        this.method_18799(this.method_18798().L(0.9));
    }
}

