/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class01001
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class03289
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04293
 *  minecraft.class04425
 *  minecraft.class04456
 *  minecraft.class04473
 *  minecraft.class04643
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05378
 *  minecraft.class05781
 *  minecraft.class05970
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07446
 *  minecraft.class07633
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.ai.brain.SensorHelper
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class01001;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02133;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04293;
import minecraft.class04425;
import minecraft.class04456;
import minecraft.class04473;
import minecraft.class04643;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05378;
import minecraft.class05781;
import minecraft.class05970;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07446;
import minecraft.class07633;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.ai.brain.SensorHelper;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02148
extends class07633 {
    public static final class01325 N = class01325.y((float)0.9f, (float)1.3f).N(0.7f);
    private static final int M = 2;
    private static final int B = 1;
    protected static final ImmutableList<class05340<? extends class05355<? super class02148>>> y = ImmutableList.of((Object)class05340.L, (Object)class05340.u, (Object)class05340.y, (Object)class05340.P, (Object)class05340.R, (Object)class05340.b);
    protected static final ImmutableList<class05378<?>> L = ImmutableList.of((Object)class05378.P, (Object)class05378.B, (Object)class05378.m, (Object)class05378.I, (Object)class05378.n, (Object)class05378.NJ, (Object)class05378.j, (Object)class05378.f, (Object)class05378.C, (Object)class05378.a, (Object)class05378.e, (Object)class05378.p, (Object[])new class05378[]{class05378.A, class05378.x, class05378.D, class05378.NN});
    public static final int u = 10;
    public static final double i = 0.02;
    public static final double R = (double)0.1f;
    private static final class02131<Boolean> Z = class03289.N(class02148.class, class02154.U);
    private static final class02131<Boolean> X = class03289.N(class02148.class, class02154.U);
    private static final class02131<Boolean> p = class03289.N(class02148.class, class02154.U);
    private static final boolean F = false;
    private static final boolean A = true;
    private static final boolean f = true;
    private boolean C;
    private int S;

    public float w() {
        return (float)this.S / 20.0f * 30.0f * ((float)Math.PI / 180);
    }

    protected void M() {
        if (this.method_6109()) {
            this.method_5996(class05298.u).N(1.0);
            this.l();
        } else {
            this.method_5996(class05298.u).N(2.0);
            this.G();
        }
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(Z, (Object)false);
        class042932.N(X, (Object)true);
        class042932.N(p, (Object)true);
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.Wf, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("IsScreamingGoat", this.d());
        class083292.N("HasLeftHorn", this.v());
        class083292.N("HasRightHorn", this.n());
    }

    public void method_5847(float f) {
        int n = this.NR();
        float f2 = class04995.N((float)class04995.u((float)((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), (float)f), (float)(-n), (float)n);
        super.method_5847(((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() + f2);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.N(class082992.N("IsScreamingGoat", false));
        this.field_6011.N(X, (Object)class082992.N("HasLeftHorn", true));
        this.field_6011.N(p, (Object)class082992.N("HasRightHorn", true));
    }

    public void method_5711(byte by) {
        if (by == 58) {
            this.C = true;
        } else if (by == 59) {
            this.C = false;
        } else {
            super.method_5711(by);
        }
    }

    public class02148(class07078<? extends class02148> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.f().N(true);
        this.N(class04425.field_33534, -1.0f);
        this.N(class04425.field_36432, -1.0f);
        this.N((CallbackInfo)null);
    }

    public class06584 B() {
        class06069 class060692 = class06069.y((long)this.method_5667().hashCode());
        class03530 var2 = this.d() ? class04456.y : class04456.N;
        return this.method_73183().method_30349().L(class04227.yZ).N(var2, class060692).map(class035562 -> class04473.N((class06581)class06570.dH, (class03556)class035562)).orElseGet(() -> new class06584((class07310)class06570.dH));
    }

    protected class04891 s() {
        if (this.d()) {
            return class04909.We;
        }
        return class04909.WQ;
    }

    public boolean n() {
        return (Boolean)this.field_6011.N(p);
    }

    public void l() {
        this.field_6011.N(X, (Object)false);
        this.field_6011.N(p, (Object)false);
    }

    public boolean d() {
        return (Boolean)this.field_6011.N(Z);
    }

    protected class04891 m() {
        if (this.d()) {
            return class04909.Wp;
        }
        return class04909.Wo;
    }

    public boolean t() {
        boolean bl = this.v();
        boolean bl2 = this.n();
        if (!bl && !bl2) {
            return false;
        }
        class02131<Boolean> var3 = !bl ? p : (!bl2 ? X : (this.field_5974.Z() ? X : p));
        this.field_6011.N(var3, (Object)false);
        class06889 class068892 = this.method_73189();
        class06584 class065842 = this.B();
        double d = class04995.y((class06069)this.field_5974, (float)-0.2f, (float)0.2f);
        double d2 = class04995.y((class06069)this.field_5974, (float)0.3f, (float)0.7f);
        double d3 = class04995.y((class06069)this.field_5974, (float)-0.2f, (float)0.2f);
        class00717 class007172 = new class00717(this.method_73183(), class068892.N(), class068892.y(), class068892.L(), class065842, d, d2, d3);
        this.method_73183().method_8649((class07049)class007172);
        return true;
    }

    public boolean v() {
        return (Boolean)this.field_6011.N(X);
    }

    public static boolean N(class07078<? extends class07633> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.method_8320(class072092.method_10074()).N(class01210.LP) && class02148.N((class07295)class072842, (class07209)class072092);
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.method_73183().method_8608()) {
            return;
        }
        SensorHelper.disableSensor((class07438)this, (class05340)class05340.y);
    }

    public void N(boolean bl) {
        this.field_6011.N(Z, (Object)bl);
    }

    protected void N(class04782 class047822) {
        class04643 class046432 = class08700.N();
        class046432.N("goatBrain");
        this.method_18868().N(class047822, (class07438)this);
        class046432.L();
        class046432.N("goatActivityUpdate");
        class02133.N(this);
        class046432.L();
        super.N(class047822);
    }

    public @Nullable class02148 y(class04782 class047822, class07077 class070772) {
        class02148 class021482 = (class02148)class07078.NW.N((class07299)class047822, class06113.field_16466);
        if (class021482 != null) {
            class02133.N(class021482, class047822.method_8409());
            class02148 class021483 = class047822.method_8409().Z() ? this : class070772;
            boolean bl = class021483 instanceof class02148 && class021483.d() || class047822.method_8409().U() < 0.02;
            class021482.N(bl);
        }
        return class021482;
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (class065842.N(class06570.jU) && !this.method_6109()) {
            class080362.method_5783(this.m(), 1.0f, 1.0f);
            class06584 class065843 = class05970.N((class06584)class065842, (class08036)class080362, (class06584)class06570.jT.E());
            class080362.method_6122(class070502, class065843);
            return class07082.N;
        }
        class07082 class070822 = super.N(class080362, class070502);
        if (class070822.N() && this.N(class065842)) {
            this.O();
        }
        return class070822;
    }

    public class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class06069 class060692 = class010012.method_8409();
        class02133.N(this, class060692);
        this.N(class060692.U() < 0.02);
        this.M();
        if (!this.method_6109() && (double)class060692.z() < (double)0.1f) {
            class02131<Boolean> var6 = class060692.Z() ? X : p;
            this.field_6011.N(var6, (Object)false);
        }
        return super.N(class010012, class070522, class061132, class074462);
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.NI);
    }

    public static class05300 W() {
        return class07633.Ne().N(class05298.n, 10.0).N(class05298.l, (double)0.2f).N(class05298.u, 2.0);
    }

    protected void O() {
        this.method_73183().method_43129(null, (class07049)this, this.d() ? class04909.Wc : class04909.Wg, class04911.field_15254, 1.0f, class04995.y((class06069)this.method_73183().field_9229, (float)0.8f, (float)1.2f));
    }

    public void G() {
        this.field_6011.N(X, (Object)true);
        this.field_6011.N(p, (Object)true);
    }

    public int NR() {
        return 15;
    }

    public class05781<class02148> method_28306() {
        return class01289.N(L, y);
    }

    public int method_23329(double d, float f) {
        return super.method_23329(d, f) - 10;
    }

    public class04891 method_6002() {
        if (this.d()) {
            return class04909.WH;
        }
        return class04909.WO;
    }

    public class01325 method_55694(class01312 class013122) {
        return class013122 == class01312.field_30095 ? N.N(this.method_17825()) : super.method_55694(class013122);
    }

    public void method_6007() {
        this.S = this.C ? ++this.S : (this.S -= 2);
        this.S = class04995.N((int)this.S, (int)0, (int)20);
        super.method_6007();
    }

    public class01289<class02148> method_18868() {
        return super.method_18868();
    }

    public class04891 method_6011(class07072 class070722) {
        if (this.d()) {
            return class04909.WX;
        }
        return class04909.WI;
    }

    public class01289<?> method_18867(Dynamic<?> dynamic) {
        return class02133.N((class01289<class02148>)this.method_28306().N(dynamic));
    }
}

