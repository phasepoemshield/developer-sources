/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class01524
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05293
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class05487
 *  minecraft.class05781
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06584
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
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07542
 *  minecraft.class07633
 *  minecraft.class08036
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class01524;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05293;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class05487;
import minecraft.class05781;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06584;
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
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07542;
import minecraft.class07633;
import minecraft.class08036;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import org.jspecify.annotations.Nullable;

public class class06018
extends class07633
implements class05293,
class07542 {
    private static final class02131<Boolean> R = class03289.N(class06018.class, (class04383)class02154.U);
    private static final int M = 40;
    private static final float B = 0.3f;
    private static final int Z = 1;
    private static final float X = 0.6f;
    private static final int p = 6;
    private static final float F = 0.5f;
    private static final boolean A = false;
    private static final int f = 0;
    private static final boolean C = false;
    public static final int N = 300;
    private int S;
    private int x = 0;
    private boolean D = false;
    protected static final ImmutableList<? extends class05340<? extends class05355<? super class06018>>> y = ImmutableList.of((Object)class05340.L, (Object)class05340.u, (Object)class05340.P, (Object)class05340.m);
    protected static final ImmutableList<? extends class05378<?>> L = ImmutableList.of((Object)class05378.j, (Object)class05378.M, (Object)class05378.B, (Object)class05378.U, (Object)class05378.E, (Object)class05378.P, (Object)class05378.m, (Object)class05378.I, (Object)class05378.n, (Object)class05378.s, (Object)class05378.T, (Object)class05378.NY, (Object[])new class05378[]{class05378.k, class05378.NO, class05378.Ng, class05378.Nk, class05378.e, class05378.No, class05378.Nq, class05378.NN});

    protected void M() {
        if (this.method_6109()) {
            this.J = 3;
            this.method_5996(class05298.u).N(0.5);
        } else {
            this.J = 5;
            this.method_5996(class05298.u).N(6.0);
        }
    }

    private void M(boolean bl) {
        this.D = bl;
    }

    public @Nullable class07438 T() {
        return this.S();
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(R, (Object)false);
    }

    public class04911 method_5634() {
        return class04911.field_15251;
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class07049 class070492;
        boolean bl = super.method_64397(class047822, class070722, f);
        if (bl && (class070492 = class070722.u()) instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            class01524.N((class04782)class047822, (class06018)this, (class07438)class074382);
        }
        return bl;
    }

    protected class04891 method_5737() {
        return class04909.PD;
    }

    protected class04891 method_5625() {
        return class04909.Px;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.Pv, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("IsImmuneToZombification", this.G());
        class083292.N("TimeInOverworld", this.x);
        class083292.N("CannotBeHunted", this.D);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("IsImmuneToZombification", false));
        this.x = class082992.N("TimeInOverworld", 0);
        this.M(class082992.N("CannotBeHunted", false));
    }

    public void method_5711(byte by) {
        if (by == 4) {
            this.S = 10;
            this.method_56078(class04909.PP);
        } else {
            super.method_5711(by);
        }
    }

    public class06018(class07078<? extends class06018> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 5;
    }

    public static class05300 B() {
        return class07150.Y().N(class05298.n, 40.0).N(class05298.l, (double)0.3f).N(class05298.b, (double)0.6f).N(class05298.i, 1.0).N(class05298.u, 6.0);
    }

    protected class04891 s() {
        if (this.method_73183().method_8608()) {
            return null;
        }
        return class01524.y((class06018)this).orElse(null);
    }

    public boolean n() {
        return this.m() && !this.D;
    }

    public boolean m() {
        return !this.method_6109();
    }

    private void t() {
        this.N(class07078.yS, class08234.N((class07079)this, (boolean)true, (boolean)false), class052922 -> class052922.method_6092(new class07055(class07047.Z, 200, 0)));
    }

    public boolean g() {
        return true;
    }

    public boolean v() {
        return !this.G() && !this.Nt() && (Boolean)this.method_73183().method_75728().N(class00608.K, this.method_73189()) != false;
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        class06018 class060182 = (class06018)class07078.NP.N((class07299)class047822, class06113.field_16466);
        if (class060182 != null) {
            class060182.NW();
        }
        return class060182;
    }

    public void N(boolean bl) {
        this.method_5841().N(R, (Object)bl);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (class010012.method_8409().z() < 0.2f) {
            this.y(true);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public void N(int n) {
        this.x = n;
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class07082 class070822 = super.N(class080362, class070502);
        if (class070822.N()) {
            this.NW();
        }
        return class070822;
    }

    public float N(class07209 class072092, class05487 class054872) {
        if (class01524.N((class06018)this, (class07209)class072092)) {
            return -1.0f;
        }
        if (class054872.method_8320(class072092.method_10074()).N(class00869.sn)) {
            return 10.0f;
        }
        return 0.0f;
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.NC);
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("hoglinBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        class01524.N((class06018)this);
        if (this.v()) {
            ++this.x;
            if (this.x > 300) {
                this.method_56078(class04909.Ps);
                this.t();
            }
        } else {
            this.x = 0;
        }
    }

    public boolean N(double d) {
        return true;
    }

    public static boolean N(class07078<class06018> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return !class072842.method_8320(class072092.method_10074()).N(class00869.EJ);
    }

    public int W() {
        return this.S;
    }

    private boolean G() {
        return (Boolean)this.method_5841().N(R);
    }

    public int method_6110(class04782 class047822) {
        return this.J;
    }

    public class05781<class06018> method_28306() {
        return class01289.N(L, y);
    }

    public class04891 method_6002() {
        return class04909.PT;
    }

    public void method_6007() {
        if (this.S > 0) {
            --this.S;
        }
        super.method_6007();
    }

    public boolean method_6054() {
        return true;
    }

    public class01289<class06018> method_18868() {
        return super.method_18868();
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        if (!(class070492 instanceof class07438)) {
            return false;
        }
        class07438 class074382 = (class07438)class070492;
        this.S = 10;
        this.method_73183().method_8421((class07049)this, (byte)4);
        this.method_56078(class04909.PP);
        class01524.N((class06018)this, (class07438)class074382);
        return class05293.N((class04782)class047822, (class07438)this, (class07438)class074382);
    }

    public void method_6060(class07438 class074382) {
        if (this.m()) {
            class05293.N((class07438)this, (class07438)class074382);
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Pb;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class01524.N((class01289)this.method_28306().N(dynamic));
    }

    public boolean T_() {
        return !class01524.L((class06018)this) && super.T_();
    }
}

