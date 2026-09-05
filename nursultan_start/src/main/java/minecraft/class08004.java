/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10866
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01226
 *  minecraft.class01231
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01894
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06171
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06842
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07086
 *  minecraft.class07150
 *  minecraft.class07182
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07448
 *  minecraft.class07463
 *  minecraft.class07466
 *  minecraft.class07469
 *  minecraft.class07471
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07625
 *  minecraft.class07628
 *  minecraft.class07872
 *  minecraft.class08161
 *  minecraft.class08234
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10866;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01226;
import minecraft.class01231;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01894;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06171;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06842;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07086;
import minecraft.class07150;
import minecraft.class07182;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07448;
import minecraft.class07463;
import minecraft.class07466;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07625;
import minecraft.class07628;
import minecraft.class07872;
import minecraft.class07952;
import minecraft.class07954;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07972;
import minecraft.class07989;
import minecraft.class08018;
import minecraft.class08020;
import minecraft.class08036;
import minecraft.class08041;
import minecraft.class08161;
import minecraft.class08234;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class08004
extends class07150 {
    private static final class01894 N = class01894.y((String)"baby");
    private static final class07471 y = new class07471(N, 0.5, class07463.field_6330);
    private static final class01894 M = class01894.y((String)"reinforcement_caller_charge");
    private static final class07471 B = new class07471(class01894.y((String)"reinforcement_callee_charge"), (double)-0.05f, class07463.field_6328);
    private static final class01894 Z = class01894.y((String)"leader_zombie_bonus");
    private static final class01894 W = class01894.y((String)"zombie_random_spawn_bonus");
    private static final class02131<Boolean> T = class03289.N(class08004.class, (class04383)class02154.U);
    private static final class02131<Integer> b = class03289.N(class08004.class, (class04383)class02154.y);
    private static final class02131<Boolean> X = class03289.N(class08004.class, (class04383)class02154.U);
    public static final float L = 0.05f;
    public static final int u = 50;
    public static final int i = 40;
    public static final int R = 7;
    private static final int a = -1;
    private static final class01325 p = class07078.yx.E().N(0.5f).y(0.93f);
    private static final float F = 0.1f;
    private static final Predicate<class07086> A = class070862 -> class070862 == class07086.field_5807;
    private static final boolean f = false;
    private static final boolean C = false;
    private static final int S = 0;
    private final class07466 x = new class07466((class07079)this, A);
    private boolean D = false;
    private int h = 0;
    private int r;

    public void L(int n) {
        this.h = n;
    }

    protected void L(class04782 class047822) {
        this.N(class047822, (class07078<? extends class08004>)class07078.X);
        if (!this.method_5701()) {
            class047822.method_8444(null, 1040, this.method_24515(), 0);
        }
    }

    public boolean L(class06584 class065842) {
        if (class065842.N(class01226.Nw) && this.method_6109() && this.method_5765()) {
            return false;
        }
        return super.L(class065842);
    }

    public void M(boolean bl) {
        if (this.V.u()) {
            if (this.D != bl) {
                this.D = bl;
                this.V.y(bl);
                if (bl) {
                    this.e.N(1, (class07473)this.x);
                } else {
                    this.e.N((class07473)this.x);
                }
            }
        } else if (this.D) {
            this.e.N((class07473)this.x);
            this.D = false;
        }
    }

    public boolean Q() {
        return this.D;
    }

    public void method_5674(class02131<?> class021312) {
        if (T.equals(class021312)) {
            this.method_18382();
        }
        super.method_5674(class021312);
    }

    public class07078<? extends class08004> method_5864() {
        return super.method_5864();
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(T, (Object)false);
        class042932.N(b, (Object)0);
        class042932.N(X, (Object)false);
    }

    public void method_5773() {
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (this.method_5805() && !this.Nt()) {
                if (this.d()) {
                    --this.r;
                    if (this.r < 0) {
                        this.L(class047822);
                    }
                } else if (this.m()) {
                    if (this.method_5777(class01231.N)) {
                        ++this.h;
                        if (this.h >= 600) {
                            this.N(300);
                        }
                    } else {
                        this.h = -1;
                    }
                }
            }
        }
        super.method_5773();
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (!super.method_64397(class047822, class070722, f)) {
            return false;
        }
        class07438 class074382 = this.T();
        if (class074382 == null && class070722.u() instanceof class07438) {
            class074382 = (class07438)class070722.u();
        }
        if (class074382 != null && class047822.y() == class07086.field_5807 && (double)this.field_5974.z() < this.method_45325(class05298.Q) && class047822.method_74962()) {
            int n = class04995.N((double)this.method_23317());
            int n2 = class04995.N((double)this.method_23318());
            int n3 = class04995.N((double)this.method_23321());
            class07078<? extends class08004> var8 = this.method_5864();
            class08004 class080042 = (class08004)var8.N((class07299)class047822, class06113.field_16463);
            if (class080042 == null) {
                return true;
            }
            for (int i = 0; i < 50; ++i) {
                int n4;
                int n5;
                int n6 = n + class04995.N((class06069)this.field_5974, (int)7, (int)40) * class04995.N((class06069)this.field_5974, (int)-1, (int)1);
                class07209 class072092 = new class07209(n6, n5 = n2 + class04995.N((class06069)this.field_5974, (int)7, (int)40) * class04995.N((class06069)this.field_5974, (int)-1, (int)1), n4 = n3 + class04995.N((class06069)this.field_5974, (int)7, (int)40) * class04995.N((class06069)this.field_5974, (int)-1, (int)1));
                if (!class07448.N(var8, (class05487)class047822, (class07209)class072092) || !class07448.N(var8, (class01001)class047822, (class06113)class06113.field_16463, (class07209)class072092, (class06069)class047822.field_9229)) continue;
                class080042.method_5814(n6, n5, n4);
                if (class047822.N((double)n6, (double)n5, (double)n4, 7.0) || !class047822.method_8606((class07049)class080042) || !class047822.N((class07049)class080042) || !class080042.Y_() && class047822.u(class080042.method_5829())) continue;
                class080042.y(class074382);
                class080042.N((class01001)class047822, class047822.method_8404(class080042.method_24515()), class06113.field_16463, null);
                class047822.y((class07049)class080042);
                class07469 class074692 = this.method_5996(class05298.Q);
                class07471 class074712 = class074692.N(M);
                double d = class074712 != null ? class074712.y() : 0.0;
                class074692.L(M);
                class074692.u(new class07471(M, d - 0.05, class07463.field_6328));
                class080042.method_5996(class05298.Q).u(B);
                break;
            }
        }
        return true;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(this.X_(), 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("IsBaby", this.method_6109());
        class083292.N("CanBreakDoors", this.Q());
        class083292.N("InWaterTime", this.method_5799() ? this.h : -1);
        class083292.N("DrownedConversionTime", this.d() ? this.r : -1);
    }

    public boolean method_6109() {
        return (Boolean)this.method_5841().N(T);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.y(class082992.N("IsBaby", false));
        this.M(class082992.N("CanBreakDoors", false));
        this.h = class082992.N("InWaterTime", 0);
        int n = class082992.N("DrownedConversionTime", -1);
        if (n != -1) {
            this.N(n);
        } else {
            this.method_5841().N(X, (Object)false);
        }
    }

    public boolean method_5874(class04782 class047822, class07438 class074382, class07072 class070722) {
        boolean bl = super.method_5874(class047822, class074382, class070722);
        if ((class047822.y() == class07086.field_5802 || class047822.y() == class07086.field_5807) && class074382 instanceof class08041) {
            class08041 class080412 = (class08041)class074382;
            if (class047822.y() != class07086.field_5807 && this.field_5974.Z()) {
                return bl;
            }
            if (this.N(class047822, class080412)) {
                bl = false;
            }
        }
        return bl;
    }

    public class08004(class07299 class072992) {
        this((class07078<? extends class08004>)class07078.yx, class072992);
    }

    public class08004(class07078<? extends class08004> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected void B() {
        this.e.N(2, (class07473)new class08161((class07150)this, 1.0, 1.0, 10.0f, 2.0f));
        this.e.N(3, (class07473)new class07972(this, 1.0, false));
        this.e.N(6, (class07473)new class07954((class07475)this, 1.0, true, 4, this::Q));
        this.e.N(7, (class07473)new class07957((class07475)this, 1.0));
        this.H.N(1, (class07473)new class07989((class07475)this, new Class[0]).N(class07182.class));
        this.H.N(2, new class07952<class08036>((class07079)this, class08036.class, true));
        this.H.N(3, new class07952<class06171>((class07079)this, class06171.class, false));
        this.H.N(3, new class07952<class07625>((class07079)this, class07625.class, true));
        this.H.N(5, new class07952<class07872>((class07079)this, class07872.class, 10, true, false, class07872.y));
    }

    protected class04891 s() {
        return class04909.Jo;
    }

    public static class05300 l() {
        return class07150.Y().N(class05298.P, 35.0).N(class05298.l, (double)0.23f).N(class05298.u, 3.0).N(class05298.y, 2.0).N(class05298.Q);
    }

    public boolean d() {
        return (Boolean)this.method_5841().N(X);
    }

    protected boolean m() {
        return true;
    }

    protected void u(float f) {
        this.V_();
        this.method_5996(class05298.b).L(new class07471(k, this.field_5974.U() * (double)0.05f, class07463.field_6328));
        double d = this.field_5974.U() * 1.5 * (double)f;
        if (d > 1.0) {
            this.method_5996(class05298.P).L(new class07471(W, d, class07463.field_6331));
        }
        if (this.field_5974.z() < f * 0.05f) {
            this.method_5996(class05298.Q).L(new class07471(Z, this.field_5974.U() * 0.25 + 0.5, class07463.field_6328));
            this.method_5996(class05298.n).L(new class07471(Z, this.field_5974.U() * 3.0 + 1.0, class07463.field_6331));
            this.M(true);
        }
    }

    public void u(int n) {
        this.r = n;
    }

    public void y(boolean bl) {
        this.method_5841().N(T, (Object)bl);
        if (this.method_73183() != null && !this.method_73183().method_8608()) {
            class07469 class074692 = this.method_5996(class05298.l);
            class074692.L(N);
            if (bl) {
                class074692.y(y);
            }
        }
    }

    public boolean y(class04782 class047822, class06584 class065842) {
        if (class065842.N(class06570.vU)) {
            return false;
        }
        return super.y(class047822, class065842);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class06069 class060692 = class010012.method_8409();
        class074462 = super.N(class010012, class070522, class061132, class074462);
        float f = class070522.u();
        if (class061132 != class06113.field_16468) {
            this.L(class060692.z() < 0.55f * f);
        }
        if (class074462 == null) {
            class074462 = new class10866(class08004.N(class060692), true);
        }
        if (class074462 instanceof class10866) {
            class10866 class108662 = (class10866)class074462;
            if (class108662.y) {
                this.y(true);
                if (class108662.L) {
                    class07628 class076282;
                    if ((double)class060692.z() < 0.05) {
                        List var8 = class010012.N(class07628.class, this.method_5829().L(5.0, 3.0, 5.0), class07042.L);
                        if (!var8.isEmpty()) {
                            class07628 class076283 = (class07628)var8.get(0);
                            class076283.N(true);
                            this.method_5873((class07049)class076283, false, false);
                        }
                    } else if ((double)class060692.z() < 0.05 && (class076282 = (class07628)class07078.Q.N(this.method_73183(), class06113.field_16460)) != null) {
                        class076282.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0f);
                        class076282.N(class010012, class070522, class06113.field_16460, null);
                        class076282.N(true);
                        this.method_5873((class07049)class076282, false, false);
                        class010012.method_8649((class07049)class076282);
                    }
                }
            }
            this.M(class060692.z() < f * 0.1f);
            if (class061132 != class06113.field_16468) {
                this.N(class060692, class070522);
                this.N(class010012, class060692, class070522);
            }
        }
        if (this.method_6118(class07085.field_6169).R() && class06842.y() && class060692.z() < 0.25f) {
            this.method_5673(class07085.field_6169, new class06584((class07310)(class060692.z() < 0.1f ? class00869.iV : class00869.iK)));
            this.N(class07085.field_6169, 0.0f);
        }
        this.u(f);
        return class074462;
    }

    public static boolean N(class06069 class060692) {
        return class060692.z() < 0.05f;
    }

    static /* synthetic */ class06069 N(class08004 class080042) {
        return class080042.field_5974;
    }

    private void N(int n) {
        this.r = n;
        this.method_5841().N(X, (Object)true);
    }

    protected void N(class04782 class047822, class07078<? extends class08004> class070782) {
        this.N(class070782, class08234.N((class07079)this, (boolean)true, (boolean)true), class080042 -> class080042.u(class047822.method_8404(class080042.method_24515()).u()));
    }

    protected void N(class06069 class060692, class07052 class070522) {
        super.N(class060692, class070522);
        float f = class060692.z();
        float f2 = this.method_73183().y() == class07086.field_5807 ? 0.05f : 0.01f;
        if (f < f2) {
            int n = class060692.y(6);
            if (n == 0) {
                this.method_5673(class07085.field_6173, new class06584((class07310)class06570.To));
            } else if (n == 1) {
                this.method_5673(class07085.field_6173, new class06584((class07310)class06570.le));
            } else {
                this.method_5673(class07085.field_6173, new class06584((class07310)class06570.Tq));
            }
        }
    }

    public boolean N(class04782 class047822, class08041 class080412) {
        return (class08018)class080412.N(class07078.yr, class08234.N((class07079)class080412, (boolean)true, (boolean)true), class080182 -> {
            class080182.N((class01001)class047822, class047822.method_8404(class080182.method_24515()), class06113.field_16468, (class07446)new class10866(false, true));
            class080182.N(class080412.t());
            class080182.N(class080412.O().u());
            class080182.N(class080412.y().N());
            class080182.y(class080412.u());
            if (!this.method_5701()) {
                class047822.method_8444(null, 1026, this.method_24515(), 0);
            }
        }) != null;
    }

    protected void l_() {
        this.e.N(4, (class07473)new class08020(this, (class07475)this, 1.0, 3));
        this.e.N(8, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(8, (class07473)new class07956((class07079)this));
        this.B();
    }

    public int method_6110(class04782 class047822) {
        if (this.method_6109()) {
            this.J = (int)((double)this.J * 2.5);
        }
        return super.method_6110(class047822);
    }

    public class04891 method_6002() {
        return class04909.JH;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? p : super.method_55694(class013122);
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        boolean bl = super.method_6121(class047822, class070492);
        if (bl) {
            float f = class047822.method_8404(this.method_24515()).y();
            if (this.method_6047().R() && this.method_5809() && this.field_5974.z() < f * 0.3f) {
                class070492.method_5639((float)(2 * (int)f));
            }
        }
        return bl;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Jf;
    }

    protected class04891 X_() {
        return class04909.oE;
    }

    protected void V_() {
        this.method_5996(class05298.Q).N(this.field_5974.U() * (double)0.1f);
    }

    protected boolean Y_() {
        return false;
    }

    protected boolean U_() {
        return true;
    }
}

