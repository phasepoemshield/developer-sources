/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10848
 *  Nursultan.class10850
 *  Nursultan.class10853
 *  minecraft.class00143
 *  minecraft.class00392
 *  minecraft.class01001
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01894
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03557
 *  minecraft.class03559
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07434
 *  minecraft.class07438
 *  minecraft.class07440
 *  minecraft.class07446
 *  minecraft.class07463
 *  minecraft.class07471
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07536
 *  minecraft.class07633
 *  minecraft.class07952
 *  minecraft.class07957
 *  minecraft.class07960
 *  minecraft.class07962
 *  minecraft.class07989
 *  minecraft.class07999
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10848;
import Nursultan.class10850;
import Nursultan.class10853;
import minecraft.class00143;
import minecraft.class00392;
import minecraft.class01001;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01894;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03557;
import minecraft.class03559;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07434;
import minecraft.class07438;
import minecraft.class07440;
import minecraft.class07446;
import minecraft.class07463;
import minecraft.class07471;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07536;
import minecraft.class07633;
import minecraft.class07863;
import minecraft.class07873;
import minecraft.class07891;
import minecraft.class07894;
import minecraft.class07897;
import minecraft.class07952;
import minecraft.class07957;
import minecraft.class07960;
import minecraft.class07962;
import minecraft.class07989;
import minecraft.class07999;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07879
extends class07633 {
    public static final double N = 0.6;
    public static final double y = 0.8;
    public static final double L = 1.0;
    public static final double u = 2.2;
    public static final double i = 1.4;
    private static final class02131<Integer> M = class03289.N(class07879.class, (class04383)class02154.y);
    private static final int B = 0;
    private static final class01894 Z = class01894.y((String)"killer_bunny");
    private static final int X = 3;
    private static final int p = 5;
    private static final class01894 F = class01894.y((String)"evil");
    private static final int A = 8;
    private static final int f = 40;
    private int C;
    private int S;
    private boolean x;
    private int D;
    int R = 0;

    public void L(double d) {
        this.f().N(d);
        this.q.N(this.q.u(), this.q.i(), this.q.R(), d);
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.Nc);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(M, (Object)class07897.field_57617.field_41570);
    }

    public class04911 method_5634() {
        return this.v() == class07897.field_41567 ? class04911.field_15251 : class04911.field_15254;
    }

    public boolean method_27298() {
        return false;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("RabbitType", class07897.field_56654, (Object)this.v());
        class083292.N("MoreCarrotTicks", this.R);
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.Nc) {
            return (T)class07879.method_66651(class024772, (Object)((Object)this.v()));
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("RabbitType", class07897.field_56654).orElse(class07897.field_57617));
        this.R = class082992.N("MoreCarrotTicks", 0);
    }

    public void method_5711(byte by) {
        if (by == 1) {
            this.method_5839();
            this.S = 10;
            this.C = 0;
        } else {
            super.method_5711(by);
        }
    }

    public class07879(class07078<? extends class07879> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.K = new class07873(this);
        this.q = new class07863(this);
        this.L(0.0);
    }

    public void B() {
        this.method_6100(true);
        this.S = 10;
        this.C = 0;
    }

    protected class04891 s() {
        return class04909.lq;
    }

    boolean n() {
        return this.R <= 0;
    }

    private void l() {
        this.D = this.q.L() < 2.2 ? 10 : 1;
    }

    private void d() {
        this.l();
        this.G();
    }

    protected class04891 m() {
        return class04909.lH;
    }

    private void t() {
        ((class07873)this.K).N(true);
    }

    public class07897 v() {
        return class07897.N((Integer)this.field_6011.N(M));
    }

    public float u(float f) {
        if (this.S == 0) {
            return 0.0f;
        }
        return ((float)this.C + f) / (float)this.S;
    }

    static /* synthetic */ class07440 y(class07879 class078792) {
        return class078792.K;
    }

    public static boolean N(class07078<class07879> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.method_8320(class072092.method_10074()).N(class01210.Lj) && class07879.N((class07295)class072842, (class07209)class072092);
    }

    private void N(class07897 class078972) {
        if (class078972 == class07897.field_41567) {
            this.method_5996(class05298.y).N(8.0);
            this.e.N(4, (class07473)new class07999((class07475)this, 1.4, true));
            this.H.N(1, (class07473)new class07989((class07475)this, new Class[0]).N(new Class[0]));
            this.H.N(2, (class07473)new class07952((class07079)this, class08036.class, true));
            this.H.N(2, (class07473)new class07952((class07079)this, class07894.class, true));
            this.method_5996(class05298.u).N(new class07471(F, 5.0, class07463.field_6328));
            if (!this.method_16914()) {
                this.method_5665((class00392)class00392.L((String)class07536.N((String)"entity", (class01894)Z)));
            }
        } else {
            this.method_5996(class05298.u).L(F);
        }
        this.field_6011.N(M, (Object)class078972.field_41570);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class07897 class078972 = class07879.N((class07284)class010012, this.method_24515());
        if (class074462 instanceof class10848) {
            class078972 = ((class10848)class074462).N;
        } else {
            class074462 = new class10848(class078972);
        }
        this.N(class078972);
        return super.N(class010012, class070522, class061132, class074462);
    }

    static /* synthetic */ boolean N(class07879 class078792) {
        return ((class07438)class078792).fields_6212a028292fd3c078969e3ee4c71d9e8_4;
    }

    private static class07897 N(class07284 class072842, class07209 class072092) {
        class03556 var2 = class072842.i(class072092);
        int n = class072842.method_8409().y(100);
        if (var2.N(class03557.NZ)) {
            return n < 80 ? class07897.field_41562 : class07897.field_41564;
        }
        if (var2.N(class03557.NB)) {
            return class07897.field_41565;
        }
        return n < 50 ? class07897.field_41561 : (n < 90 ? class07897.field_41566 : class07897.field_41563);
    }

    private void N(double d, double d2) {
        this.method_36456((float)(class04995.u((double)(d2 - this.method_23321()), (double)(d - this.method_23317())) * 57.2957763671875) - 90.0f);
    }

    public void N(class04782 class047822) {
        if (this.D > 0) {
            --this.D;
        }
        if (this.R > 0) {
            this.R -= this.field_5974.y(3);
            if (this.R < 0) {
                this.R = 0;
            }
        }
        if (this.method_24828()) {
            class07873 class078732;
            if (!this.x) {
                this.method_6100(false);
                this.d();
            }
            if (this.v() == class07897.field_41567 && this.D == 0 && (class078732 = this.T()) != null && this.method_5858((class07049)class078732) < 16.0) {
                this.N(class078732.method_23317(), class078732.method_23321());
                this.q.N(class078732.method_23317(), class078732.method_23318(), class078732.method_23321(), this.q.L());
                this.B();
                this.x = true;
            }
            if (!(class078732 = (class07873)this.K).L()) {
                if (this.q.y() && this.D == 0) {
                    class00143 class001432 = this.V.Z();
                    class06889 class068892 = new class06889(this.q.u(), this.q.i(), this.q.R());
                    if (class001432 != null && !class001432.L()) {
                        class068892 = class001432.N((class07049)this);
                    }
                    this.N(class068892.M, class068892.Z);
                    this.B();
                }
            } else if (!class078732.u()) {
                this.t();
            }
        }
        this.x = this.method_24828();
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.yy);
    }

    /*
     * Unable to fully structure code
     */
    public @Nullable class07879 y(class04782 var1_1, class07077 var2_2) {
        block2: {
            block3: {
                var3_3 = (class07879)class07078.yM.N((class07299)var1_1, class06113.field_16466);
                if (var3_3 == null) break block2;
                var4_4 = class07879.N((class07284)var1_1, this.method_24515());
                if (this.field_5974.y(20) == 0) break block3;
                if (!(var2_2 instanceof class07879)) ** GOTO lbl-1000
                var5_5 = (class07879)var2_2;
                if (this.field_5974.Z()) {
                    var4_4 = var5_5.v();
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = this.v();
                }
            }
            var3_3.N(var4_4);
        }
        return var3_3;
    }

    public static class05300 W() {
        return class07633.Ne().N(class05298.n, 3.0).N(class05298.l, (double)0.3f).N(class05298.u, 3.0);
    }

    private void G() {
        ((class07873)this.K).N(false);
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.6f * this.method_5751()), (double)(this.method_17681() * 0.4f));
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.Nc) {
            this.N((class07897)((Object)class07879.method_66651((class02477)class02484.Nc, t)));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class03559((class07079)this, this.method_73183()));
        this.e.N(1, (class07473)new class10850(this, 2.2));
        this.e.N(2, (class07473)new class07434((class07633)this, 0.8));
        this.e.N(3, (class07473)new class07960((class07475)this, 1.0, class065842 -> class065842.N(class01226.yy), false));
        this.e.N(4, (class07473)new class10853(this, class08036.class, 8.0f, 2.2, 2.2));
        this.e.N(4, (class07473)new class10853(this, class07894.class, 10.0f, 2.2, 2.2));
        this.e.N(4, (class07473)new class10853(this, class07150.class, 4.0f, 2.2, 2.2));
        this.e.N(5, (class07473)new class07891(this));
        this.e.N(6, (class07473)new class07957((class07475)this, 0.6));
        this.e.N(11, (class07473)new class07962((class07079)this, class08036.class, 10.0f));
    }

    public float method_6106() {
        class00143 class001432;
        float f = 0.3f;
        if (this.q.L() <= 0.6) {
            f = 0.2f;
        }
        if ((class001432 = this.V.Z()) != null && !class001432.L() && class001432.N((class07049)this).B > this.method_23318() + 0.5) {
            f = 0.5f;
        }
        if (this.field_5976 || ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_4.booleanValue() && this.q.i() > this.method_23318() + 0.5) {
            f = 0.5f;
        }
        return super.method_56994(f / 0.42f);
    }

    public class04891 method_6002() {
        return class04909.lV;
    }

    public void method_59928() {
        if (this.v() == class07897.field_41567) {
            this.method_5783(class04909.lK, 1.0f, (this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f);
        }
    }

    public void method_6007() {
        super.method_6007();
        if (this.C != this.S) {
            ++this.C;
        } else if (this.S != 0) {
            this.C = 0;
            this.S = 0;
            this.method_6100(false);
        }
    }

    public void method_6100(boolean bl) {
        super.method_6100(bl);
        if (bl) {
            this.method_5783(this.m(), this.method_6107(), ((this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f) * 0.8f);
        }
    }

    public void method_6043() {
        super.method_6043();
        if (this.q.L() > 0.0 && this.method_18798().z() < 0.01) {
            this.method_5724(0.1f, new class06889(0.0, 0.0, 1.0));
        }
        if (!this.method_73183().method_8608()) {
            this.method_73183().method_8421((class07049)this, (byte)1);
        }
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.le;
    }
}

