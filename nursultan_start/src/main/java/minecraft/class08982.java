/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00672
 *  minecraft.class00860
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01114
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02774
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04396
 *  minecraft.class04425
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05310
 *  minecraft.class05378
 *  minecraft.class05781
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06293
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06638
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07649
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Dynamic;
import java.util.UUID;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00672;
import minecraft.class00860;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01114;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02774;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04396;
import minecraft.class04425;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05310;
import minecraft.class05378;
import minecraft.class05781;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06293;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06638;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07649;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import minecraft.class08965;
import minecraft.class08971;
import minecraft.class08973;
import minecraft.class08978;
import minecraft.class08979;
import minecraft.class08981;
import minecraft.class08988;
import org.jspecify.annotations.Nullable;

public class class08982
extends class07649
implements class05310,
class08978 {
    private static final long y = -2L;
    private static final long L = -1L;
    private static final int u = 504000;
    private static final int i = 552000;
    private static final int R = 200;
    private static final int M = 240;
    private static final float B = 10.0f;
    private static final float Z = 0.0058f;
    private static final int W = 60;
    private static final int m = 100;
    private static final class02131<class02774> P = class03289.N(class08982.class, (class04383)class02154.o);
    private static final class02131<class08979> s = class03289.N(class08982.class, (class04383)class02154.q);
    private @Nullable class07209 T;
    private @Nullable UUID b;
    private long X = -1L;
    private int a = 0;
    private final class04396 p = new class04396();
    private final class04396 F = new class04396();
    private final class04396 A = new class04396();
    private final class04396 f = new class04396();
    private final class04396 C = new class04396();
    public static final class07085 N = class07085.field_55946;

    private void w() {
        switch (this.B()) {
            case field_61292: {
                this.A.N();
                this.F.N();
                this.f.N();
                this.C.N();
                if (this.a == this.field_6012) {
                    this.p.N(this.field_6012);
                } else if (this.a == 0) {
                    this.a = this.field_6012 + this.field_5974.y(200, 240);
                }
                if ((float)this.field_6012 != (float)this.a + 10.0f) break;
                this.Y();
                this.a = 0;
                break;
            }
            case field_61293: {
                this.p.N();
                this.a = 0;
                this.A.N();
                this.f.N();
                this.C.N();
                this.F.y(this.field_6012);
                break;
            }
            case field_61294: {
                this.p.N();
                this.a = 0;
                this.F.N();
                this.C.N();
                this.f.N();
                this.A.y(this.field_6012);
                break;
            }
            case field_61295: {
                this.p.N();
                this.a = 0;
                this.F.N();
                this.A.N();
                this.C.N();
                this.f.y(this.field_6012);
                break;
            }
            case field_61296: {
                this.p.N();
                this.a = 0;
                this.F.N();
                this.A.N();
                this.f.N();
                this.C.y(this.field_6012);
            }
        }
    }

    private void L(class04782 class047822) {
        class07209 class072092 = this.method_24515();
        class047822.method_8652(class072092, (class00500)((class00500)class00869.vO.W().y(class08981.L, (Comparable)((Object)class08973.values()[this.field_5974.y(0, class08973.values().length)]))).y(class08981.y, (Comparable)class07211.N((double)this.method_36454())), 3);
        class00394 class003942 = class047822.method_8321(class072092);
        if (class003942 instanceof class08965) {
            ((class08965)class003942).N(this);
            this.y_3(class047822);
            this.method_31472();
            this.method_43077(class04909.MH);
            if (this.g_()) {
                if (((Boolean)class047822.method_64395().N(class07305.U)).booleanValue()) {
                    this.yU();
                } else {
                    this.yE();
                }
            }
        }
    }

    public static class05300 M() {
        return class07079.H().N(class05298.l, (double)0.2f).N(class05298.O, 1.0).N(class05298.n, 12.0);
    }

    private class04891 Q() {
        return class08971.N(this.E()).N();
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(P, (Object)class02774.field_28704);
        class042932.N(s, (Object)class08979.field_61292);
    }

    public void method_5773() {
        super.method_5773();
        if (this.method_73183().method_8608()) {
            if (!this.Nt()) {
                this.w();
            }
        } else {
            this.N((class04782)this.method_73183(), this.method_73183().method_8409(), this.method_73183().N());
        }
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class08971.N(this.E()).u(), 1.0f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("next_weather_age", this.X);
        class083292.N("weather_state", class02774.field_46493, (Object)this.E());
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.X = class082992.N("next_weather_age", -1L);
        this.N(class082992.N("weather_state", class02774.field_46493).orElse(class02774.field_28704));
    }

    public void method_5800(class04782 class047822, class00672 class006722) {
        super.method_5800(class047822, class006722);
        UUID uUID = class006722.method_5667();
        if (!uUID.equals(this.b)) {
            this.b = uUID;
            class02774 class027742 = this.E();
            if (class027742 != class02774.field_28704) {
                this.X = -1L;
                this.field_6011.N(P, (Object)class027742.y(), true);
            }
        }
    }

    public class08982(class07078<? extends class07649> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.f().N(48.0f);
        this.f().y(true);
        this.NW();
        this.N(class08979.field_61292);
        this.N(class04425.field_9, 16.0f);
        this.N(class04425.field_5, 16.0f);
        this.N(class04425.field_3, -1.0f);
        this.method_18868().N(class05378.Ni, (Object)this.method_59922().y(60, 100));
    }

    public class08979 B() {
        return (class08979)((Object)this.field_6011.N(s));
    }

    public class04396 n() {
        return this.A;
    }

    public void l() {
        this.method_43077(class04909.MA);
    }

    public boolean d() {
        return this.method_5805() && this.method_6118(N).N(class01226.Lj);
    }

    public class04396 m() {
        return this.p;
    }

    public class04396 t() {
        return this.f;
    }

    public class04396 v() {
        return this.F;
    }

    private boolean y(class07299 class072992) {
        return class072992.method_8320(this.method_24515()).P() && class072992.field_9229.z() <= 0.0058f;
    }

    public void y(class02774 class027742) {
        this.N(class027742);
        this.l();
    }

    public class02774 E() {
        return (class02774)this.field_6011.N(P);
    }

    public void N(class02774 class027742) {
        this.field_6011.N(P, (Object)class027742);
    }

    public void N(class04782 class047822, class04911 class049112, class06584 class065842) {
        class047822.method_43129(null, (class07049)this, class04909.Mf, class049112, 1.0f, 1.0f);
        class06584 class065843 = this.method_6118(N);
        this.method_5673(N, class06584.E);
        this.method_5699(class047822, class065843, 1.5f);
    }

    public void N(class08979 class089792) {
        this.field_6011.N(s, (Object)class089792);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class02774 class027742;
        class06584 class065842;
        class06584 class065843 = class080362.method_5998(class070502);
        if (class065843.R() && !(class065842 = this.method_6047()).R()) {
            class06293.N((class07438)this, (class06584)class065842, (class06889)class080362.method_73189());
            this.method_6122(class07050.field_5808, class06584.E);
            return class07082.N;
        }
        class065842 = this.method_73183();
        if (class065843.N(class06570.vr) && this.d()) {
            if (class065842 instanceof class04782) {
                class04782 class047822 = (class04782)class065842;
                this.N(class047822, class04911.field_15248, class065843);
                this.method_32875((class03556)class01194.H, (class07049)class080362);
                class065843.N(1, (class07438)class080362, class070502);
            }
            return class07082.N;
        }
        if (class065842.method_8608()) {
            return class07082.i;
        }
        if (class065843.N(class06570.wR) && this.X != -2L) {
            class065842.method_8444((class07049)this, 3003, this.method_24515(), 0);
            this.X = -2L;
            this.N(class080362, class070502, class065843);
            return class07082.y;
        }
        if (class065843.N(class01226.Ly) && this.X == -2L) {
            class065842.method_43129(null, (class07049)this, class04909.Ne, this.method_5634(), 1.0f, 1.0f);
            class065842.method_8444((class07049)this, 3004, this.method_24515(), 0);
            this.X = -1L;
            class065843.N(1, (class07438)class080362, class070502.N());
            return class07082.y;
        }
        if (class065843.N(class01226.Ly) && (class027742 = this.E()) != class02774.field_28704) {
            class065842.method_43129(null, (class07049)this, class04909.Ne, this.method_5634(), 1.0f, 1.0f);
            class065842.method_8444((class07049)this, 3005, this.method_24515(), 0);
            this.X = -1L;
            this.field_6011.N(P, (Object)class027742.y(), true);
            class065843.N(1, (class07438)class080362, class070502.N());
            return class07082.y;
        }
        return super.N(class080362, class070502);
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("copperGolemBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        class046432.N("copperGolemActivityUpdate");
        class08988.N(this);
        class046432.L();
        super.N(class047822);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        this.l();
        return super.N(class010012, class070522, class061132, class074462);
    }

    public void N(class07209 class072092) {
        this.T = class072092;
    }

    private void N(class04782 class047822, class06069 class060692, long l) {
        if (this.X == -2L) {
            return;
        }
        if (this.X == -1L) {
            this.X = l + (long)class060692.N(504000, 552000);
            return;
        }
        class02774 class027742 = (class02774)this.field_6011.N(P);
        boolean bl = class027742.equals((Object)class02774.field_28707);
        if (l >= this.X && !bl) {
            class02774 class027743 = class027742.N();
            boolean bl2 = class027743.equals((Object)class02774.field_28707);
            this.N(class027743);
            long l2 = this.X = bl2 ? 0L : this.X + (long)class060692.N(504000, 552000);
        }
        if (bl && this.y((class07299)class047822)) {
            this.L(class047822);
        }
    }

    public void W() {
        this.T = null;
    }

    public class04396 G() {
        return this.C;
    }

    private void Y() {
        if (!this.method_5701()) {
            this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), this.Q(), this.method_5634(), 1.0f, 1.0f, false);
        }
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.75f * this.method_5751()), 0.0);
    }

    public void method_16078(class04782 class047822) {
        super.method_16078(class047822);
        this.y_3(class047822);
    }

    public class05781<class08982> method_28306() {
        return class08988.N();
    }

    public class04891 method_6002() {
        return class08971.N(this.E()).L();
    }

    public class01289<class08982> method_18868() {
        return super.method_18868();
    }

    public void method_6074(class04782 class047822, class07072 class070722, float f) {
        super.method_6074(class047822, class070722, f);
        this.N(class08979.field_61292);
    }

    public class04891 method_6011(class07072 class070722) {
        return class08971.N(this.E()).y();
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class08988.N((class01289<class08982>)this.method_28306().N(dynamic));
    }

    @Override
    public double method_72381() {
        return 3.0;
    }

    @Override
    public boolean method_72380(class01114 class011142, class07209 class072092) {
        if (this.T == null) {
            return false;
        }
        class00500 class005002 = this.method_73183().method_8320(this.T);
        return this.T.equals((Object)class072092) || class005002.i() instanceof class00860 && class005002.L((class08092)class00860.i) != class06638.field_12569 && class00860.y((class07209)this.T, (class00500)class005002).equals((Object)class072092);
    }
}

