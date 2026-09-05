/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10719
 *  Nursultan.class10725
 *  minecraft.class01231
 *  minecraft.class01317
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03683
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07065
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07150
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class07623
 *  minecraft.class07639
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07962
 *  minecraft.class07976
 *  minecraft.class07978
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10719;
import Nursultan.class10725;
import java.util.EnumSet;
import minecraft.class01231;
import minecraft.class01317;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03683;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07150;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07559;
import minecraft.class07623;
import minecraft.class07639;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07962;
import minecraft.class07976;
import minecraft.class07978;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07549
extends class07150 {
    protected static final int y = 80;
    private static final class02131<Boolean> N = class03289.N(class07549.class, (class04383)class02154.U);
    private static final class02131<Integer> u = class03289.N(class07549.class, (class04383)class02154.y);
    private float i;
    private float R;
    private float M;
    private float B;
    private float Z;
    private @Nullable class07438 W;
    private int T;
    private boolean b;
    protected @Nullable class07978 L;

    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (u.equals(class021312)) {
            this.T = 0;
            this.W = null;
        }
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)false);
        class042932.N(u, (Object)0);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class07049 class070492;
        if (!this.m() && !class070722.N(class03696.G) && !class070722.N(class03683.p) && (class070492 = class070722.L()) instanceof class07438) {
            ((class07438)class070492).method_64397(class047822, this.method_48923().u((class07049)this), 2.0f);
        }
        if (this.L != null) {
            this.L.Z();
        }
        return super.method_64397(class047822, class070722, f);
    }

    protected class07065 method_33570() {
        return class07065.field_28632;
    }

    public class07549(class07078<? extends class07549> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 10;
        this.N(class04425.field_18, 0.0f);
        this.q = new class10725(this);
        this.R = this.i = this.field_5974.z();
    }

    public int B() {
        return 80;
    }

    public float i(float f) {
        return class04995.B((float)f, (float)this.Z, (float)this.B);
    }

    protected class04891 s() {
        return this.method_5799() ? class04909.mM : class04909.mB;
    }

    public @Nullable class07438 n() {
        if (!this.v()) {
            return null;
        }
        if (this.method_73183().method_8608()) {
            if (this.W != null) {
                return this.W;
            }
            class07049 class070492 = this.method_73183().method_8469(((Integer)this.field_6011.N(u)).intValue());
            if (class070492 instanceof class07438) {
                this.W = (class07438)class070492;
                return this.W;
            }
            return null;
        }
        return this.T();
    }

    public boolean m() {
        return (Boolean)this.field_6011.N(N);
    }

    public float t() {
        return this.T;
    }

    public boolean v() {
        return (Integer)this.field_6011.N(u) != 0;
    }

    public float u(float f) {
        return class04995.B((float)f, (float)this.R, (float)this.i);
    }

    protected class04891 E() {
        return class04909.mE;
    }

    public float N(class07209 class072092, class05487 class054872) {
        if (class054872.method_8316(class072092).N(class01231.N)) {
            return 10.0f + class054872.B(class072092);
        }
        return super.N(class072092, class054872);
    }

    public boolean N(class05487 class054872) {
        return class054872.method_8606((class07049)this);
    }

    void N(int n) {
        this.field_6011.N(u, (Object)n);
    }

    protected class07623 N(class07299 class072992) {
        return new class07639((class07079)this, class072992);
    }

    public void N(boolean bl) {
        this.field_6011.N(N, (Object)bl);
    }

    public static boolean N(class07078<? extends class07549> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return !(class060692.y(20) != 0 && class072842.M(class072092) || class072842.y() == class07086.field_5801 || !class06113.N((class06113)class061132) && !class072842.method_8316(class072092).N(class01231.N) || !class072842.method_8316(class072092.method_10074()).N(class01231.N));
    }

    public static class05300 W() {
        return class07150.Y().N(class05298.u, 6.0).N(class05298.l, 0.5).N(class05298.n, 30.0);
    }

    public float R(float f) {
        return ((float)this.T + f) / (float)this.B();
    }

    public int Ni() {
        return 180;
    }

    public int m_() {
        return 160;
    }

    protected void l_() {
        class07976 class079762 = new class07976((class07475)((Object)this), 1.0);
        this.L = new class07978((class07475)((Object)this), 1.0, 80);
        this.e.N(4, new class07559(this));
        this.e.N(5, (class07473)class079762);
        this.e.N(7, (class07473)this.L);
        this.e.N(8, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(8, (class07473)new class07962((class07079)this, class07549.class, 12.0f, 0.01f));
        this.e.N(9, (class07473)new class07956((class07079)this));
        this.L.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
        class079762.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
        this.H.N(1, (class07473)new class07952((class07079)this, class07438.class, 10, true, false, (class01317)new class10719(this)));
    }

    public class04891 method_6002() {
        return this.method_5799() ? class04909.mz : class04909.mU;
    }

    public void method_6007() {
        if (this.method_5805()) {
            if (this.method_73183().method_8608()) {
                class06889 class068892;
                this.R = this.i;
                if (!this.method_5799()) {
                    this.M = 2.0f;
                    class068892 = this.method_18798();
                    if (class068892.B > 0.0 && this.b && !this.method_5701()) {
                        this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), this.E(), this.method_5634(), 1.0f, 1.0f, false);
                    }
                    this.b = class068892.B < 0.0 && this.method_73183().method_8515(this.method_24515().method_10074(), (class07049)this);
                } else {
                    this.M = this.m() ? (this.M < 0.5f ? 4.0f : (this.M += (0.5f - this.M) * 0.1f)) : (this.M += (0.125f - this.M) * 0.2f);
                }
                this.i += this.M;
                this.Z = this.B;
                this.B = !this.method_5799() ? this.field_5974.z() : (this.m() ? (this.B += (0.0f - this.B) * 0.25f) : (this.B += (1.0f - this.B) * 0.06f));
                if (this.m() && this.method_5799()) {
                    class068892 = this.method_5828(0.0f);
                    for (int i = 0; i < 2; ++i) {
                        this.method_73183().method_8406((class07126)class07107.u, this.method_23322(0.5) - class068892.M * 1.5, this.method_23319() - class068892.B * 1.5, this.method_23325(0.5) - class068892.Z * 1.5, 0.0, 0.0, 0.0);
                    }
                }
                if (this.v()) {
                    if (this.T < this.B()) {
                        ++this.T;
                    }
                    if ((class068892 = this.n()) != null) {
                        this.p().N((class07049)class068892, 90.0f, 90.0f);
                        this.p().N();
                        double d = this.R(0.0f);
                        double d2 = class068892.method_23317() - this.method_23317();
                        double d3 = class068892.method_23323(0.5) - this.method_23320();
                        double d4 = class068892.method_23321() - this.method_23321();
                        double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
                        d2 /= d5;
                        d3 /= d5;
                        d4 /= d5;
                        double d6 = this.field_5974.U();
                        while (d6 < d5) {
                            this.method_73183().method_8406((class07126)class07107.u, this.method_23317() + d2 * (d6 += 1.8 - d + this.field_5974.U() * (1.7 - d)), this.method_23320() + d3 * d6, this.method_23321() + d4 * d6, 0.0, 0.0, 0.0);
                        }
                    }
                }
            }
            if (this.method_5799()) {
                this.method_5855(300);
            } else if (this.method_24828()) {
                this.method_18799(this.method_18798().y((double)((this.field_5974.z() * 2.0f - 1.0f) * 0.4f), 0.5, (double)((this.field_5974.z() * 2.0f - 1.0f) * 0.4f)));
                this.method_36456(this.field_5974.z() * 360.0f);
                this.method_24830(false);
                this.field_64356 = true;
            }
            if (this.v()) {
                this.method_36456(((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue());
            }
        }
        super.method_6007();
    }

    public class04891 method_6011(class07072 class070722) {
        return this.method_5799() ? class04909.mW : class04909.mm;
    }

    public void method_76087(class06889 class068892, double d, boolean bl, double d2) {
        this.method_5724(0.1f, class068892);
        this.method_5784(class07451.field_6308, this.method_18798());
        this.method_18799(this.method_18798().L(0.9));
        if (!this.m() && this.T() == null) {
            this.method_18799(this.method_18798().y(0.0, -0.005, 0.0));
        }
    }
}

