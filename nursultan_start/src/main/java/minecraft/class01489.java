/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01226
 *  minecraft.class01238
 *  minecraft.class01289
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01894
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02523
 *  minecraft.class03289
 *  minecraft.class03530
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04391
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04854
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class05781
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07075
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07463
 *  minecraft.class07469
 *  minecraft.class07471
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01226;
import minecraft.class01238;
import minecraft.class01289;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01484;
import minecraft.class01514;
import minecraft.class01894;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02523;
import minecraft.class03289;
import minecraft.class03530;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04391;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04854;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class05781;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07075;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07463;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class01489
extends class01238
implements class04391,
class04854 {
    private static final class02131<Boolean> R = class03289.N(class01489.class, (class04383)class02154.U);
    private static final class02131<Boolean> B = class03289.N(class01489.class, (class04383)class02154.U);
    private static final class02131<Boolean> Z = class03289.N(class01489.class, (class04383)class02154.U);
    private static final class01894 W = class01894.y((String)"baby");
    private static final class07471 T = new class07471(W, (double)0.2f, class07463.field_6330);
    private static final int b = 16;
    private static final float X = 0.35f;
    private static final int a = 5;
    private static final float p = 0.1f;
    private static final int F = 3;
    private static final float A = 0.2f;
    private static final class01325 f = class07078.Nr.E().N(0.5f).y(0.97f);
    private static final double C = 0.5;
    private static final boolean S = false;
    private static final boolean x = false;
    private final class07075 D = new class07075(8);
    private boolean h = false;
    protected static final ImmutableList<class05340<? extends class05355<? super class01489>>> N = ImmutableList.of((Object)class05340.L, (Object)class05340.u, (Object)class05340.y, (Object)class05340.R, (Object)class05340.E);
    protected static final ImmutableList<class05378<?>> y = ImmutableList.of((Object)class05378.P, (Object)class05378.G, (Object)class05378.M, (Object)class05378.B, (Object)class05378.U, (Object)class05378.E, (Object)class05378.Nw, (Object)class05378.Nd, (Object)class05378.H, (Object)class05378.yN, (Object)class05378.d, (Object)class05378.w, (Object[])new class05378[]{class05378.m, class05378.I, class05378.s, class05378.T, class05378.b, class05378.n, class05378.NW, class05378.Nm, class05378.k, class05378.NP, class05378.Ns, class05378.Nb, class05378.NT, class05378.Nv, class05378.Nn, class05378.Nj, class05378.NG, class05378.c, class05378.NQ, class05378.v, class05378.NO, class05378.Ng, class05378.Nt, class05378.Nl, class05378.NI, class05378.NJ, class05378.No, class05378.NB, class05378.NZ, class05378.Nz, class05378.NU, class05378.NE});

    protected void L(class04782 class047822) {
        class01514.N(class047822, this);
        this.D.N().forEach(class065842 -> this.method_5775(class047822, (class06584)class065842));
        super.L(class047822);
    }

    protected void M(class06584 class065842) {
        if (class065842.N(class01514.L)) {
            this.method_5673(class07085.field_6171, class065842);
            this.N(class07085.field_6171);
        } else {
            this.N(class07085.field_6171, class065842);
        }
    }

    public void M(boolean bl) {
        this.field_6011.N(Z, (Object)bl);
    }

    public static class05300 M() {
        return class07150.Y().N(class05298.n, 16.0).N(class05298.l, (double)0.35f).N(class05298.u, 5.0);
    }

    private class06584 Q() {
        if ((double)this.field_5974.z() < 0.5) {
            return new class06584((class07310)class06570.dw);
        }
        return new class06584((class07310)(this.field_5974.y(10) == 0 ? class06570.lH : class06570.TQ));
    }

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (R.equals(class021312)) {
            this.method_18382();
        }
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(R, (Object)false);
        class042932.N(B, (Object)false);
        class042932.N(Z, (Object)false);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class07049 class070492;
        boolean bl = super.method_64397(class047822, class070722, f);
        if (bl && (class070492 = class070722.u()) instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            class01514.N(class047822, this, class074382);
        }
        return bl;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.Gw, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("IsBaby", this.method_6109());
        class083292.N("CannotHunt", this.h);
        this.N(class083292);
    }

    public boolean method_6109() {
        return (Boolean)this.method_5841().N(R);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.y(class082992.N("IsBaby", false));
        this.Z(class082992.N("CannotHunt", false));
        this.b_(class082992);
    }

    public boolean method_5873(class07049 class070492, boolean bl, boolean bl2) {
        if (this.method_6109() && class070492.method_5864() == class07078.NP) {
            class070492 = this.N(class070492, 3);
        }
        return super.method_5873(class070492, bl, bl2);
    }

    public class01489(class07078<? extends class01238> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 5;
    }

    protected boolean B(class06584 class065842) {
        class07085 class070852 = this.method_32326(class065842);
        class06584 class065843 = this.method_6118(class070852);
        return this.N(class065842, class065843, class070852);
    }

    protected boolean B() {
        return !this.h;
    }

    private void Z(boolean bl) {
        this.h = bl;
    }

    protected boolean i(class06584 class065842) {
        return this.D.L(class065842);
    }

    protected @Nullable class04891 s() {
        if (this.method_73183().method_8608()) {
            return null;
        }
        return class01514.y(this).orElse(null);
    }

    public class07075 n() {
        return this.D;
    }

    public void m() {
        ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
    }

    protected void v() {
        this.method_56078(class04909.Gk);
    }

    public boolean y(class04782 class047822, class06584 class065842) {
        return (Boolean)class047822.method_64395().N(class07305.I) != false && this.method_5936() && class01514.N(this, class065842);
    }

    public void y(boolean bl) {
        this.method_5841().N(R, (Object)bl);
        if (!this.method_73183().method_8608()) {
            class07469 class074692 = this.method_5996(class05298.l);
            class074692.L(T.N());
            if (bl) {
                class074692.y(T);
            }
        }
    }

    public boolean y(class06584 class065842) {
        return class065842.B() == class06570.dw || class065842.L(class02484.X);
    }

    public class01484 E() {
        if (this.W()) {
            return class01484.field_25166;
        }
        if (class01514.N(this.method_6079())) {
            return class01484.field_22385;
        }
        if (this.Nl() && this.d()) {
            return class01484.field_25165;
        }
        if (this.O()) {
            return class01484.field_22384;
        }
        if (this.method_24518(class06570.dw) && class06593.u((class06584)this.method_59958())) {
            return class01484.field_22383;
        }
        return class01484.field_22386;
    }

    public void N(class07438 class074382, float f) {
        this.y((class07438)this, 1.6f);
    }

    public static boolean N(class07078<class01489> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return !class072842.method_8320(class072092.method_10074()).N(class00869.EJ);
    }

    private class07049 N(class07049 class070492, int n) {
        List var3 = class070492.method_5685();
        if (n == 1 || var3.isEmpty()) {
            return class070492;
        }
        return this.N((class07049)var3.getFirst(), n - 1);
    }

    protected class06584 N(class06584 class065842) {
        return this.D.N(class065842);
    }

    protected void N(class04782 class047822, class00717 class007172) {
        this.method_29499(class007172);
        class01514.N(class047822, this, class007172);
    }

    protected boolean N(class06584 class065842, class06584 class065843, class07085 class070852) {
        boolean bl;
        if (class07323.N((class06584)class065843, (class02477)class02523.I)) {
            return false;
        }
        class03530<class06581> var4 = this.NL();
        boolean bl2 = class01514.N(class065842) || var4 != null && class065842.N(var4);
        boolean bl3 = bl = class01514.N(class065843) || var4 != null && class065843.N(var4);
        if (bl2 && !bl) {
            return true;
        }
        if (!bl2 && bl) {
            return false;
        }
        return super.N(class065842, class065843, class070852);
    }

    public boolean N(double d) {
        return !this.Nm();
    }

    protected void N(class06069 class060692, class07052 class070522) {
        if (this.l()) {
            this.N(class07085.field_6169, new class06584((class07310)class06570.bd), class060692);
            this.N(class07085.field_6174, new class06584((class07310)class06570.bw), class060692);
            this.N(class07085.field_6172, new class06584((class07310)class06570.bk), class060692);
            this.N(class07085.field_6166, new class06584((class07310)class06570.bY), class060692);
        }
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("piglinBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        class01514.N(this);
        super.N(class047822);
    }

    private void N(class07085 class070852, class06584 class065842, class06069 class060692) {
        if (class060692.z() < 0.1f) {
            this.method_5673(class070852, class065842);
        }
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class07082 class070822 = super.N(class080362, class070502);
        if (class070822.N()) {
            return class070822;
        }
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            return class01514.N(class047822, this, class080362, class070502);
        }
        boolean bl = class01514.y(this, class080362.method_5998(class070502)) && this.E() != class01484.field_22385;
        return bl ? class07082.N : class07082.i;
    }

    public void N(boolean bl) {
        this.field_6011.N(B, (Object)bl);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class06069 class060692 = class010012.method_8409();
        if (class061132 != class06113.field_16474) {
            if (class060692.z() < 0.2f) {
                this.y(true);
            } else if (this.l()) {
                this.method_5673(class07085.field_6173, this.Q());
            }
        }
        class01514.N(this, class010012.method_8409());
        this.N(class060692, class070522);
        this.N(class010012, class060692, class070522);
        return super.N(class010012, class070522, class061132, class074462);
    }

    public boolean W() {
        return (Boolean)this.field_6011.N(Z);
    }

    protected void R(class06584 class065842) {
        this.N(class07085.field_6173, class065842);
    }

    private boolean O() {
        return (Boolean)this.field_6011.N(B);
    }

    public @Nullable class03530<class06581> NL() {
        if (this.method_6109()) {
            return null;
        }
        return class01226.Ls;
    }

    public int method_6110(class04782 class047822) {
        return this.J;
    }

    public class05781<class01489> method_28306() {
        return class01289.N(y, N);
    }

    public class04891 method_6002() {
        return class04909.Gt;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? f : super.method_55694(class013122);
    }

    public class01289<class01489> method_18868() {
        return super.method_18868();
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Gl;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class01514.N(this, (class01289<class01489>)this.method_28306().N(dynamic));
    }

    public void method_6099(class04782 class047822, class07072 class070722, boolean bl) {
        super.method_6099(class047822, class070722, bl);
        this.D.N().forEach(class065842 -> this.method_5775(class047822, (class06584)class065842));
    }
}

