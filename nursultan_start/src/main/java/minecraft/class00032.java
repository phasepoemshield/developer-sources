/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09047
 *  Nursultan.class09048
 *  Nursultan.class09049
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00008
 *  minecraft.class00269
 *  minecraft.class00381
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00801
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02607
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class05781
 *  minecraft.class06113
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07109
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07442
 *  minecraft.class07460
 *  minecraft.class07472
 *  minecraft.class07473
 *  minecraft.class07535
 *  minecraft.class07547
 *  minecraft.class07623
 *  minecraft.class07633
 *  minecraft.class07970
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.entity.NavigatingEntity
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09047;
import Nursultan.class09048;
import Nursultan.class09049;
import com.mojang.serialization.Dynamic;
import minecraft.class00008;
import minecraft.class00029;
import minecraft.class00269;
import minecraft.class00381;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00801;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02607;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class05781;
import minecraft.class06113;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07109;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07442;
import minecraft.class07460;
import minecraft.class07472;
import minecraft.class07473;
import minecraft.class07535;
import minecraft.class07547;
import minecraft.class07623;
import minecraft.class07633;
import minecraft.class07970;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.entity.NavigatingEntity;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00032
extends class07633 {
    public static final float N = 0.2375f;
    public static final int y = 16;
    public static final int L = 32;
    public static final int u = 64;
    public static final int i = 16;
    public static final int R = 20;
    public static final int M = 600;
    public static final int B = 4;
    private static final int X = 60;
    private static final int p = 10;
    public static final float Z = 2.0f;
    private int F = 0;
    private int A;
    private static final class02131<Boolean> f = class03289.N(class00032.class, (class04383)class02154.U);
    private static final class02131<Boolean> C = class03289.N(class00032.class, (class04383)class02154.U);
    private static final float S = 1.0f;

    private void w() {
        this.field_6011.N(C, (Object)(this.A > 0 ? 1 : 0));
    }

    protected void M() {
        if (this.method_6109()) {
            this.t();
        } else {
            this.n();
        }
        super.M();
    }

    public class06889 method_24829(class07438 class074382) {
        return new class06889(this.method_23317(), this.method_5829().i, this.method_23321());
    }

    public boolean method_70986() {
        return true;
    }

    public class06889[] method_70985() {
        return class02607.N((class07049)this, (double)-0.03125, (double)0.4375, (double)0.46875, (double)0.03125);
    }

    public void method_70980(class02607 class026072) {
        if (class026072.aa_()) {
            this.F = 5;
        }
    }

    public boolean method_70987() {
        return !this.method_6109();
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(f, (Object)false);
        class042932.N(C, (Object)false);
    }

    public void method_5773() {
        super.method_5773();
        if (this.method_73183().method_8608()) {
            return;
        }
        if (this.F > 0) {
            --this.F;
        }
        this.N(this.F > 0);
        if (this.A > 0) {
            if (this.field_6012 > 60) {
                --this.A;
            }
            this.N(this.A);
        }
        if (this.Y()) {
            this.N(10);
        }
    }

    public class04911 method_5634() {
        return class04911.field_15254;
    }

    public void method_5623(double d, boolean bl, class00500 class005002, class07209 class072092) {
    }

    public @Nullable class07438 method_5642() {
        class07049 class070492 = this.method_31483();
        if (this.NU() && !this.v() && class070492 instanceof class08036) {
            return (class08036)class070492;
        }
        return super.method_5642();
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("still_timeout", this.A);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("still_timeout", 0));
    }

    public boolean method_30948(@Nullable class07049 class070492) {
        if (this.method_6109() || !this.method_5805()) {
            return false;
        }
        if (this.method_73183().method_8608() && class070492 instanceof class08036 && class070492.method_73189().B >= this.method_5829().i) {
            return true;
        }
        if (this.method_5782() && class070492 instanceof class00032) {
            return true;
        }
        return this.v();
    }

    protected void method_5793(class07049 class070492) {
        super.method_5793(class070492);
        if (!this.method_73183().method_8608()) {
            this.N(10);
        }
        if (!this.method_5782()) {
            this.Nb();
            this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.Pz, this.method_5634(), 1.0f, 1.0f);
        }
    }

    protected boolean method_5818(class07049 class070492) {
        return this.method_5685().size() < 4;
    }

    protected void method_5627(class07049 class070492) {
        if (!this.method_5782()) {
            this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.PU, this.method_5634(), 1.0f, 1.0f);
        }
        super.method_5627(class070492);
        if (!this.method_73183().method_8608()) {
            if (!this.Y()) {
                this.N(0);
            } else if (this.A > 10) {
                this.N(10);
            }
        }
    }

    public class00032(class07078<? extends class00032> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.q = new class07547((class07079)this, true, this::v);
        this.o = new class00029(this);
    }

    public static class05300 B() {
        return class07633.Ne().N(class05298.n, 20.0).N(class05298.J, 16.0).N(class05298.m, 0.05).N(class05298.l, 0.05).N(class05298.P, 16.0).N(class05298.z, 8.0);
    }

    protected class04891 s() {
        return this.method_6109() ? class04909.Wi : class04909.md;
    }

    private void n() {
        this.q = new class07547((class07079)this, true, this::v);
        this.o = new class00029(this);
        this.V = this.N(this.method_73183());
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N((T class074732) -> true);
            this.l_();
            ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.y(class047822, (class07438)this);
            ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.y();
        }
        this.N((CallbackInfo)null);
    }

    private void l() {
        if (this.g_() || this.method_5782()) {
            return;
        }
        int n = this.G();
        if (this.Nj() && this.Ns().method_19771((class00753)this.method_24515(), (double)(n + 16)) && n == this.NT()) {
            return;
        }
        this.N(this.method_24515(), n);
    }

    private void d() {
        class04782 class047822;
        block5: {
            block4: {
                class07299 class072992 = this.method_73183();
                if (!(class072992 instanceof class04782)) break block4;
                class047822 = (class04782)class072992;
                if (this.method_5805() && ((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_2 == 0 && this.method_6063() != this.method_6032()) break block5;
            }
            return;
        }
        boolean bl = this.method_70668() || class047822.method_70745(this.method_24515()) != class00801.field_9384;
        if (this.field_6012 % (bl ? 20 : 600) == 0) {
            this.method_6025(1.0f);
        }
    }

    public boolean m() {
        return (Boolean)this.field_6011.N(C);
    }

    private void t() {
        this.q = new class07460((class07079)this, 180, true);
        this.o = new class07442((class07079)this);
        this.V = this.y(this.method_73183());
        this.N(0);
        this.N((T class074732) -> true);
        this.y((CallbackInfo)null);
    }

    public boolean v() {
        return this.m() || this.A > 0;
    }

    private void y(CallbackInfo callbackInfo) {
        ((NavigatingEntity)this).lithium$updateNavigationRegistration();
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        return (class07077)class07078.NZ.N((class07299)class047822, class06113.field_16466);
    }

    private class07623 y(class07299 class072992) {
        return new class09049(this, class072992);
    }

    protected void N(class04782 class047822) {
        if (this.method_6109()) {
            class04643 class046432 = class08700.N();
            class046432.N("happyGhastBrain");
            ((class07438)this).fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class047822, (class07438)this);
            class046432.L();
            class046432.N("happyGhastActivityUpdate");
            class00008.N((class00032)this);
            class046432.L();
        }
        this.l();
        super.N(class047822);
    }

    private void N(int n) {
        class07299 class072992;
        if (this.A <= 0 && n > 0 && (class072992 = this.method_73183()) instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.method_43391(this.method_23317(), this.method_23318(), this.method_23321());
            class047822.method_14178().L.N((class07049)this, (class00381)class00269.N((class07049)this));
        }
        this.A = n;
        this.w();
    }

    private void N(boolean bl) {
        this.field_6011.N(f, (Object)bl);
    }

    private void N(class08036 class080362) {
        if (!this.method_73183().method_8608()) {
            class080362.method_5804((class07049)this);
        }
    }

    public float N(class07209 class072092, class05487 class054872) {
        if (!class054872.R(class072092)) {
            return 0.0f;
        }
        if (class054872.R(class072092.method_10074()) && !class054872.R(class072092.method_10087(2))) {
            return 10.0f;
        }
        return 5.0f;
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class07082 class070822;
        if (this.method_6109()) {
            return super.N(class080362, class070502);
        }
        class06584 class065842 = class080362.method_5998(class070502);
        if (!class065842.R() && (class070822 = class065842.N(class080362, (class07438)this, class070502)).N()) {
            return class070822;
        }
        if (this.NU() && !class080362.method_21823()) {
            this.N(class080362);
            return class07082.N;
        }
        return super.N(class080362, class070502);
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.Nc);
    }

    protected class07109 N(class07438 class074382) {
        return new class07109(class074382.method_36455() * 0.5f, class074382.method_36454());
    }

    private void N(CallbackInfo callbackInfo) {
        ((NavigatingEntity)this).lithium$updateNavigationRegistration();
    }

    public boolean W() {
        return (Boolean)this.field_6011.N(f);
    }

    private int G() {
        if (!this.method_6109() && this.method_6118(class07085.field_48824).R()) {
            return 64;
        }
        return 32;
    }

    private boolean Y() {
        class00734 class007342 = this.method_5829();
        class00734 class007343 = new class00734(class007342.N - 1.0, class007342.i - (double)1.0E-5f, class007342.L - 1.0, class007342.u + 1.0, class007342.i + class007342.L() / 2.0, class007342.R + 1.0);
        for (class08036 class080362 : this.method_73183().method_18456()) {
            class07049 class070492;
            if (class080362.method_7325() || (class070492 = class080362.method_5668()) instanceof class00032 || !class007343.u(class070492.method_73189())) continue;
            return true;
        }
        return false;
    }

    public class06889 ac_() {
        return class06889.L;
    }

    public int m_() {
        int n = super.m_();
        if (this.method_5782()) {
            return n * 6;
        }
        return n;
    }

    protected class07472 Z_() {
        return new class09048(this);
    }

    protected void l_() {
        this.e.N(3, (class07473)new class09047(this));
        this.e.N(4, (class07473)new class07970((class07079)this, 1.0, class065842 -> this.NU() || this.method_6109() ? class065842.N(class01226.Nc) : class065842.N(class01226.NX), false, 7.0));
        this.e.N(5, (class07473)new class07535((class07079)this, 16));
    }

    public int n_() {
        return 1;
    }

    public double p_() {
        return 16.0;
    }

    public void o_() {
        super.o_();
        this.F().M();
    }

    public double q_() {
        return 10.0;
    }

    public float method_56077(float f) {
        return Math.min(f, 1.0f);
    }

    public class05781<class00032> method_28306() {
        return class00008.N();
    }

    public class04891 method_6002() {
        return this.method_6109() ? class04909.WR : class04909.mw;
    }

    public float method_6107() {
        return this.method_6109() ? 1.0f : 4.0f;
    }

    public void method_6007() {
        if (!this.method_73183().method_8608()) {
            this.method_70669(this.v());
        }
        super.method_6007();
        this.d();
    }

    public float method_17825() {
        return this.method_6109() ? 0.2375f : 1.0f;
    }

    public void method_6091(class06889 class068892) {
        float f = (float)this.method_45325(class05298.m) * 5.0f / 3.0f;
        this.method_70671(class068892, f, f, f);
    }

    public boolean method_6094() {
        if (this.method_6109()) {
            return true;
        }
        return super.method_6094();
    }

    public void method_49481(class08036 class080362, class06889 class068892) {
        super.method_49481(class080362, class068892);
        class07109 class071092 = this.N((class07438)class080362);
        float f = this.method_36454();
        float f2 = class04995.R((float)(class071092.U - f));
        float f3 = 0.08f;
        this.method_5710(f += f2 * 0.08f, class071092.z);
        float f4 = f;
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(f4);
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(f4);
        this.field_5982 = f4;
    }

    public boolean method_63626(class07085 class070852) {
        return class070852 == class07085.field_48824;
    }

    public boolean method_6101() {
        return false;
    }

    public class04891 method_6011(class07072 class070722) {
        return this.method_6109() ? class04909.WM : class04909.mk;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class00008.N((class01289)this.method_28306().N(dynamic));
    }

    public float method_6017() {
        return 1.0f;
    }

    public class06889 method_49482(class08036 class080362, class06889 class068892) {
        float f = class080362.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue();
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (class080362.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() != 0.0f) {
            float f4 = class04995.P((double)(class080362.method_36455() * ((float)Math.PI / 180)));
            float f5 = -class04995.m((double)(class080362.method_36455() * ((float)Math.PI / 180)));
            if (class080362.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() < 0.0f) {
                f4 *= -0.5f;
                f5 *= -0.5f;
            }
            f3 = f5;
            f2 = f4;
        }
        if (class080362.method_70673()) {
            f3 += 0.5f;
        }
        return new class06889((double)f, (double)f3, (double)f2).L((double)3.9f * this.method_45325(class05298.m));
    }

    public boolean method_56991(class07085 class070852) {
        if (class070852 == class07085.field_48824) {
            return this.method_5805() && !this.method_6109();
        }
        return super.method_56991(class070852);
    }

    public boolean T_() {
        return false;
    }

    protected boolean k_() {
        return false;
    }
}

