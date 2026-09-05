/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Lists
 *  com.viaversion.viafabricplus.features.entity.r1_8_boat.PositionInterpolator1_8
 *  com.viaversion.viafabricplus.features.entity.riding_offset.EntityRidingOffsetsPre1_20_2
 *  com.viaversion.viafabricplus.injection.access.entity.r1_8_boat.IAbstractBoat
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00274
 *  minecraft.class00381
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00643
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01009
 *  minecraft.class01129
 *  minecraft.class01194
 *  minecraft.class01217
 *  minecraft.class01231
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01720
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02592
 *  minecraft.class02607
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05188
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07003
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07062
 *  minecraft.class07065
 *  minecraft.class07067
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07322
 *  minecraft.class07377
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class07633
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08382
 *  minecraft.class08605
 *  net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate
 *  net.caffeinemc.mods.lithium.common.world.WorldHelper
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.viaversion.viafabricplus.features.entity.r1_8_boat.PositionInterpolator1_8;
import com.viaversion.viafabricplus.features.entity.riding_offset.EntityRidingOffsetsPre1_20_2;
import com.viaversion.viafabricplus.injection.access.entity.r1_8_boat.IAbstractBoat;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class00274;
import minecraft.class00381;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00643;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01009;
import minecraft.class01129;
import minecraft.class01194;
import minecraft.class01217;
import minecraft.class01231;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01720;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02592;
import minecraft.class02607;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05188;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07003;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07062;
import minecraft.class07065;
import minecraft.class07067;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07322;
import minecraft.class07377;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class07633;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08382;
import minecraft.class08605;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class00250
extends class01720
implements class02607,
IAbstractBoat {
    private static final class02131<Boolean> B = class03289.N(class00250.class, (class04383)class02154.U);
    private static final class02131<Boolean> Z = class03289.N(class00250.class, (class04383)class02154.U);
    private static final class02131<Integer> W = class03289.N(class00250.class, (class04383)class02154.y);
    public static final int N = 0;
    public static final int y = 1;
    private static final int m = 60;
    private static final float P = 0.3926991f;
    public static final double L = 0.7853981852531433;
    public static final int u = 60;
    private final float[] s;
    private float T;
    private float b;
    private final class08382 j;
    private boolean v;
    private boolean n;
    private boolean t;
    private boolean G;
    private double l;
    private float d;
    private class00274 w;
    private class00274 k;
    private double Y;
    private boolean Q;
    private boolean O;
    private float g;
    private float I;
    private float J;
    private @Nullable class02592 o;
    private final Supplier<class06581> q;
    private final class08382 K = new PositionInterpolator1_8(this);
    private double V = 0.07;
    private int e;
    private class06889 H = class06889.L;

    private void w() {
        if (!this.method_5782()) {
            return;
        }
        float f = 0.0f;
        if (this.v) {
            this.b -= 1.0f;
        }
        if (this.n) {
            this.b += 1.0f;
        }
        if (this.n != this.v && !this.t && !this.G) {
            f += 0.005f;
        }
        this.method_36456(this.method_36454() + this.b);
        if (this.t) {
            f += 0.04f;
        }
        if (this.G) {
            f -= 0.005f;
        }
        this.method_18799(this.method_18798().y((double)(class04995.m((double)(-this.method_36454() * ((float)Math.PI / 180))) * f), 0.0, (double)(class04995.P((double)(this.method_36454() * ((float)Math.PI / 180))) * f)));
        this.N(this.n && !this.v || this.t, this.v && !this.n || this.t);
    }

    public float M() {
        class00734 class007342 = this.method_5829();
        class00734 class007343 = new class00734(class007342.N, class007342.y - 0.001, class007342.L, class007342.u, class007342.y, class007342.R);
        int n = class04995.N((double)class007343.N) - 1;
        int n2 = class04995.L((double)class007343.u) + 1;
        int n3 = class04995.N((double)class007343.y) - 1;
        int n4 = class04995.L((double)class007343.i) + 1;
        int n5 = class04995.N((double)class007343.L) - 1;
        int n6 = class04995.L((double)class007343.R) + 1;
        class00494 class004942 = class00389.N((class00734)class007343);
        float f = 0.0f;
        int n7 = 0;
        class07218 class072182 = new class07218();
        for (int i = n; i < n2; ++i) {
            for (int j = n5; j < n6; ++j) {
                int n8 = (i == n || i == n2 - 1 ? 1 : 0) + (j == n5 || j == n6 - 1 ? 1 : 0);
                if (n8 == 2) continue;
                for (int k = n3; k < n4; ++k) {
                    if (n8 > 0 && (k == n3 || k == n4 - 1)) continue;
                    class072182.N(i, k, j);
                    class00500 class005002 = this.method_73183().method_8320((class07209)class072182);
                    if (class005002.i() instanceof class00643 || !class00389.L((class00494)class005002.M((class07290)this.method_73183(), (class07209)class072182).method_66507((class00753)class072182), (class00494)class004942, (class07003)class07003.Z)) continue;
                    f += class005002.i().Z();
                    ++n7;
                }
            }
        }
        return f / (float)n7;
    }

    private class00274 T() {
        class00274 class002742 = this.n();
        if (class002742 != null) {
            this.l = this.method_5829().i;
            return class002742;
        }
        if (this.v()) {
            return class00274.field_7718;
        }
        float f = this.M();
        if (f > 0.0f) {
            this.d = f;
            return class00274.field_7719;
        }
        return class00274.field_7720;
    }

    public class06889 method_30633(class07185 class071852, class01009 class010092) {
        return class07438.method_31079((class06889)super.method_30633(class071852, class010092));
    }

    public class06889 method_24829(class07438 class074382) {
        class06889 class068892 = class00250.method_24826((double)(this.method_17681() * class04995.M), (double)class074382.method_17681(), (float)class074382.method_36454());
        double d = this.method_23317() + class068892.M;
        double d2 = this.method_23321() + class068892.Z;
        class07209 class072092 = class07209.method_49637((double)d, (double)this.method_5829().i, (double)d2);
        class07209 class072093 = class072092.method_10074();
        if (!this.method_73183().z(class072093)) {
            double d3;
            ArrayList arrayList = Lists.newArrayList();
            double d4 = this.method_73183().L(class072092);
            if (class05188.N((double)d4)) {
                arrayList.add(new class06889(d, (double)class072092.method_10264() + d4, d2));
            }
            if (class05188.N((double)(d3 = this.method_73183().L(class072093)))) {
                arrayList.add(new class06889(d, (double)class072093.method_10264() + d3, d2));
            }
            for (class01312 class013122 : class074382.method_24831()) {
                for (class06889 class068893 : arrayList) {
                    if (!class05188.N((class07322)this.method_73183(), (class06889)class068893, (class07438)class074382, (class01312)class013122)) continue;
                    class074382.method_18380(class013122);
                    return class068893;
                }
            }
        }
        return super.method_24829(class074382);
    }

    public class07211 method_5755() {
        return this.method_5735().R();
    }

    public final class06584 method_31480() {
        return new class06584((class07310)this.q.get());
    }

    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(B, (Object)false);
        class042932.N(Z, (Object)false);
        class042932.N(W, (Object)0);
    }

    public void method_5773() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.k = this.w;
        this.w = this.T();
        this.T = this.w == class00274.field_7717 || this.w == class00274.field_7716 ? (this.T += 1.0f) : 0.0f;
        if (!this.method_73183().method_8608() && this.T >= 60.0f) {
            this.method_5772();
        }
        if (this.G() > 0) {
            this.y(this.G() - 1);
        }
        if (this.t() > 0.0f) {
            this.y(this.t() - 1.0f);
        }
        super.method_5773();
        this.j.method_66271();
        if (this.method_66247()) {
            if (!(this.method_31483() instanceof class08036)) {
                this.N(false, false);
            }
            this.d();
            if (this.method_73183().method_8608()) {
                this.w();
                this.method_73183().method_8522((class00381)new class07377(this.N(0), this.N(1)));
            }
            this.method_5784(class07451.field_6308, this.method_18798());
        } else {
            this.method_18799(class06889.L);
        }
        this.method_61409();
        this.method_61409();
        this.s();
        for (int i = 0; i <= 1; ++i) {
            if (this.N(i)) {
                class04891 class048912;
                if (!this.method_5701() && (double)(this.s[i] % ((float)Math.PI * 2)) <= 0.7853981852531433 && (double)((this.s[i] + 0.3926991f) % ((float)Math.PI * 2)) >= 0.7853981852531433 && (class048912 = this.N()) != null) {
                    class06889 class068892 = this.method_5828(1.0f);
                    double d = i == 1 ? -class068892.Z : class068892.Z;
                    double d2 = i == 1 ? class068892.M : -class068892.M;
                    this.method_73183().method_43128(null, this.method_23317() + d, this.method_23318(), this.method_23321() + d2, class048912, this.method_5634(), 1.0f, 0.8f + 0.4f * this.field_5974.z());
                }
                int n = i;
                this.s[n] = this.s[n] + 0.3926991f;
                continue;
            }
            this.s[i] = 0.0f;
        }
        Predicate var12 = class07042.N((class07049)this);
        class00734 class007342 = this.method_5829().L((double)0.2f, (double)-0.01f, (double)0.2f);
        class00250 class002502 = this;
        class07299 class072992 = this.method_73183();
        List list = this.N(class072992, (class07049)class002502, class007342, var12);
        if (!list.isEmpty()) {
            boolean bl = !this.method_73183().method_8608() && !(this.method_5642() instanceof class08036);
            for (class07049 class070492 : list) {
                if (class070492.method_5626((class07049)this)) continue;
                if (bl && this.method_5685().size() < this.Z() && !class070492.method_5765() && this.N(class070492) && class070492 instanceof class07438 && !class070492.method_5864().N(class01217.a)) {
                    class070492.method_5804((class07049)this);
                    continue;
                }
                this.method_5697(class070492);
            }
        }
    }

    public void method_5650(class07062 class070622) {
        if (!this.method_73183().method_8608() && class070622.N() && this.g_()) {
            this.yU();
        }
        super.method_5650(class070622);
    }

    public void method_5644(class07049 class070492) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.y(class070492, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.y(class070492);
    }

    public void method_5623(double d, boolean bl, class00500 class005002, class07209 class072092) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(d, bl, class005002, class072092, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.Y = this.method_18798().B;
        if (this.method_5765()) {
            return;
        }
        if (bl) {
            this.method_38785();
        } else if (!this.method_73183().method_8316(this.method_24515().method_10074()).N(class01231.N) && d < 0.0) {
            this.field_6017 -= (double)((float)d);
        }
    }

    protected class07065 method_33570() {
        return class07065.field_28632;
    }

    public @Nullable class07438 method_5642() {
        class07049 class070492 = this.method_31483();
        return class070492 instanceof class07438 ? (class07438)class070492 : super.method_5642();
    }

    public boolean method_5869() {
        return this.w == class00274.field_7717 || this.w == class00274.field_7716;
    }

    protected double method_7490() {
        return 0.04;
    }

    public void method_5697(class07049 class070492) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class070492, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (class070492 instanceof class00250) {
            if (class070492.method_5829().y < this.method_5829().i) {
                super.method_5697(class070492);
            }
        } else if (class070492.method_5829().y <= this.method_5829().y) {
            super.method_5697(class070492);
        }
    }

    public boolean method_5810() {
        return true;
    }

    protected void method_5652(class08329 class083292) {
        this.N(class083292, this.o);
    }

    public boolean method_5863() {
        return !this.method_31481();
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        class00250 class002502 = this;
        class08036 class080363 = class080362;
        class07050 class070503 = class070502;
        class07082 class070822 = this.N(class002502, class080363, class070503);
        if (class070822 != class07082.i) {
            return class070822;
        }
        if (!class080362.method_21823() && this.T < 60.0f && (this.method_73183().method_8608() || class080362.method_5804((class07049)this))) {
            return class07082.N;
        }
        return class07082.i;
    }

    protected void method_5749(class08299 class082992) {
        this.N(class082992);
    }

    public boolean method_30948(@Nullable class07049 class070492) {
        return true;
    }

    public boolean method_30949(class07049 class070492) {
        return class00250.N((class07049)this, class070492);
    }

    protected class06889 method_52533(class07049 class070492, class01325 class013252, float f) {
        float f2 = this.B();
        if (this.method_5685().size() > 1) {
            f2 = this.method_5685().indexOf(class070492) == 0 ? 0.2f : -0.6f;
            if (class070492 instanceof class07633) {
                f2 += 0.2f;
            }
        }
        return new class06889(0.0, this.N(class013252), (double)f2).y(-this.method_36454() * ((float)Math.PI / 180));
    }

    protected boolean method_5818(class07049 class070492) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class070492, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.method_5685().size() < this.Z() && !this.method_5777(class01231.N);
    }

    protected void method_5865(class07049 class070492, class07067 class070672) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class070492, class070672, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        super.method_5865(class070492, class070672);
        if (class070492.method_5864().N(class01217.v)) {
            return;
        }
        class070492.method_36456(class070492.method_36454() + this.b);
        class070492.method_5847(class070492.method_5791() + this.b);
        this.y(class070492);
        if (class070492 instanceof class07633 && this.method_5685().size() == this.Z()) {
            int n = class070492.method_5628() % 2 == 0 ? 90 : 270;
            class070492.method_5636(((class07633)class070492).fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue() + (float)n);
            class070492.method_5847(class070492.method_5791() + (float)n);
        }
    }

    public class08382 method_66233() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class08382)callbackInfoReturnable.getReturnValue();
        }
        return this.j;
    }

    public void method_5750(class06889 class068892) {
        super.method_5750(class068892);
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            this.H = class068892;
        }
    }

    public void method_5879(float f) {
        this.L(-this.l());
        this.y(10);
        this.y(this.t() * 11.0f);
    }

    public void method_5700(boolean bl, class07209 class072092) {
        if (this.method_73183() instanceof class04782) {
            this.Q = true;
            this.O = bl;
            if (this.k() == 0) {
                this.u(60);
            }
        }
        if (!this.method_5869() && this.field_5974.y(100) == 0) {
            this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), this.method_5625(), this.method_5634(), 1.0f, 0.8f + 0.4f * this.field_5974.z(), false);
            this.method_73183().method_8406((class07126)class07107.NT, this.method_23317() + (double)this.field_5974.z(), this.method_23318() + 0.7, this.method_23321() + (double)this.field_5974.z(), 0.0, 0.0, 0.0);
            this.method_32875((class03556)class01194.X, (class07049)this.method_5642());
        }
    }

    public class00250(class07078<? extends class00250> class070782, class07299 class072992, Supplier<class06581> supplier) {
        super(class070782, class072992);
        this.s = new float[2];
        this.j = new class08382((class07049)this, 3);
        this.q = supplier;
        this.field_23807 = true;
    }

    protected float B() {
        return 0.0f;
    }

    protected int Z() {
        return 2;
    }

    private void s() {
        if (this.method_73183().method_8608()) {
            int n = this.k();
            this.g = n > 0 ? (this.g += 0.05f) : (this.g -= 0.1f);
            this.g = class04995.N((float)this.g, (float)0.0f, (float)1.0f);
            this.J = this.I;
            this.I = 10.0f * (float)Math.sin(0.5 * (double)this.field_6012) * this.g;
        } else {
            int n;
            if (!this.Q) {
                this.u(0);
            }
            if ((n = this.k()) > 0) {
                this.u(--n);
                if (60 - n - 1 > 0 && n == 0) {
                    this.u(0);
                    class06889 class068892 = this.method_18798();
                    if (this.O) {
                        this.method_18799(class068892.y(0.0, -0.7, 0.0));
                        this.method_5772();
                    } else {
                        this.method_18800(class068892.M, this.method_5703(class070492 -> class070492 instanceof class08036) ? 2.7 : 0.6, class068892.Z);
                    }
                }
                this.Q = false;
            }
        }
    }

    private @Nullable class00274 n() {
        class00734 class007342 = this.method_5829();
        double d = class007342.i + 0.001;
        int n = class04995.N((double)class007342.N);
        int n2 = class04995.L((double)class007342.u);
        int n3 = class04995.N((double)class007342.i);
        int n4 = class04995.L((double)d);
        int n5 = class04995.N((double)class007342.L);
        int n6 = class04995.L((double)class007342.R);
        boolean bl = false;
        class07218 class072182 = new class07218();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    class072182.N(i, j, k);
                    class04688 class046882 = this.method_73183().method_8316((class07209)class072182);
                    if (!class046882.N(class01231.N) || !(d < (double)((float)class072182.method_10264() + class046882.N((class07290)this.method_73183(), (class07209)class072182)))) continue;
                    if (class046882.u()) {
                        bl = true;
                        continue;
                    }
                    return class00274.field_7716;
                }
            }
        }
        return bl ? class00274.field_7717 : null;
    }

    private void d() {
        double d = -this.method_56989();
        double d2 = 0.0;
        float f = 0.05f;
        if (this.k == class00274.field_7720 && this.w != class00274.field_7720 && this.w != class00274.field_7719) {
            this.l = this.method_23323(1.0);
            double d3 = (double)(this.R() - this.method_17682()) + 0.101;
            class00734 class007342 = this.method_5829().u(0.0, d3 - this.method_23318(), 0.0);
            class00250 class002502 = this;
            class07299 class072992 = this.method_73183();
            if (this.N(class072992, (class07049)class002502, class007342)) {
                this.method_5814(this.method_23317(), d3, this.method_23321());
                this.method_18799(this.method_18798().u(1.0, 0.0, 1.0));
                this.Y = 0.0;
            }
            this.w = class00274.field_7718;
        } else {
            if (this.w == class00274.field_7718) {
                d2 = (this.l - this.method_23318()) / (double)this.method_17682();
                f = 0.9f;
            } else if (this.w == class00274.field_7716) {
                d = -7.0E-4;
                f = 0.9f;
            } else if (this.w == class00274.field_7717) {
                d2 = 0.01f;
                f = 0.45f;
            } else if (this.w == class00274.field_7720) {
                f = 0.9f;
            } else if (this.w == class00274.field_7719) {
                f = this.d;
                if (this.method_5642() instanceof class08036) {
                    this.d /= 2.0f;
                }
            }
            class06889 class068892 = this.method_18798();
            this.method_18800(class068892.M * (double)f, class068892.B + d, class068892.Z * (double)f);
            this.b *= f;
            if (d2 > 0.0) {
                class06889 class068893 = this.method_18798();
                this.method_18800(class068893.M, (class068893.B + d2 * (this.method_7490() / 0.65)) * 0.75, class068893.Z);
            }
        }
    }

    private int k() {
        return (Integer)this.field_6011.N(W);
    }

    private boolean v() {
        class00734 class007342 = this.method_5829();
        int n = class04995.N((double)class007342.N);
        int n2 = class04995.L((double)class007342.u);
        int n3 = class04995.N((double)class007342.y);
        int n4 = class04995.L((double)(class007342.y + 0.001));
        int n5 = class04995.N((double)class007342.L);
        int n6 = class04995.L((double)class007342.R);
        boolean bl = false;
        this.l = -1.7976931348623157E308;
        class07218 class072182 = new class07218();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    class072182.N(i, j, k);
                    class04688 class046882 = this.method_73183().method_8316((class07209)class072182);
                    if (!class046882.N(class01231.N)) continue;
                    float f = (float)j + class046882.N((class07290)this.method_73183(), (class07209)class072182);
                    this.l = Math.max((double)f, this.l);
                    bl |= class007342.y < (double)f;
                }
            }
        }
        return bl;
    }

    protected final class06581 z() {
        return this.q.get();
    }

    private void u(int n) {
        this.field_6011.N(W, (Object)n);
    }

    protected void y(class07049 class070492) {
        class070492.method_5636(this.method_36454());
        float f = class04995.R((float)(class070492.method_36454() - this.method_36454()));
        float f2 = class04995.N((float)f, (float)-105.0f, (float)105.0f);
        class070492.field_5982 += f2 - f;
        class070492.method_36456(class070492.method_36454() + f2 - f);
        class070492.method_5847(class070492.method_36454());
    }

    private void y(class07049 class070492, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            callbackInfo.cancel();
            super.method_5644(class070492);
        }
    }

    public static boolean N(class07049 class070492, class07049 class070493) {
        return (class070493.method_30948(class070492) || class070493.method_5810()) && !class070492.method_5794(class070493);
    }

    private List N(class07299 class072992, class07049 class070492, class00734 class007342, Predicate predicate) {
        if (predicate == Predicates.alwaysFalse()) {
            return Collections.emptyList();
        }
        if (predicate instanceof EntityPushablePredicate) {
            EntityPushablePredicate entityPushablePredicate = (EntityPushablePredicate)predicate;
            class01129 var6 = WorldHelper.getEntityCacheOrNull((class07299)class072992);
            if (var6 != null) {
                return WorldHelper.getPushableEntities((class07299)class072992, (class01129)var6, (class07049)class070492, (class00734)class007342, (EntityPushablePredicate)entityPushablePredicate);
            }
        }
        return class072992.method_8333(class070492, class007342, predicate);
    }

    private void N(class07049 class070492, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            callbackInfo.cancel();
            super.method_5697(class070492);
        }
    }

    private class07082 N(class01720 class017202, class08036 class080362, class07050 class070502) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
            return class07082.i;
        }
        return super.method_5688(class080362, class070502);
    }

    private void N(class07049 class070492, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            callbackInfoReturnable.setReturnValue((Object)super.method_5818(class070492));
        }
    }

    private void N(class07049 class070492, class07067 class070672, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            class06889 class068892 = EntityRidingOffsetsPre1_20_2.getMountedHeightOffset((class07049)this, (class07049)class070492).i(this.method_73189());
            class070672.accept(class070492, class068892.M, class068892.B + EntityRidingOffsetsPre1_20_2.getHeightOffset((class07049)class070492), class068892.Z);
            callbackInfo.cancel();
        }
    }

    private boolean N(class07299 class072992, class07049 class070492, class00734 class007342) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
            return true;
        }
        return class072992.method_8587(class070492, class007342);
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            callbackInfoReturnable.setReturnValue((Object)this.K);
        }
    }

    public void N(double d, double d2, double d3) {
        this.method_5814(d, d2, d3);
        this.field_6014 = d;
        this.field_6036 = d2;
        this.field_5969 = d3;
    }

    private void N(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            double d;
            double d2;
            double d3;
            int n;
            double d4;
            double d5;
            double d6;
            callbackInfo.cancel();
            super.method_5773();
            if (this.G() > 0) {
                this.y(this.G() - 1);
            }
            if (this.t() > 0.0f) {
                this.y(this.t() - 1.0f);
            }
            this.field_6014 = this.method_23317();
            this.field_6036 = this.method_23318();
            this.field_5969 = this.method_23321();
            int n2 = 5;
            double d7 = 0.0;
            for (int i = 0; i < 5; ++i) {
                double d8 = this.method_5829().y + this.method_5829().L() * (double)i / 5.0 - 0.125;
                class00734 class007342 = new class00734(this.method_5829().N, d8, this.method_5829().L, this.method_5829().u, d6 = this.method_5829().y + this.method_5829().L() * (double)(i + 1) / 5.0 - 0.125, this.method_5829().R);
                if (!class07209.method_29715((class00734)class007342).anyMatch(class072092 -> this.method_73183().method_8316(class072092).N(class01231.N))) continue;
                d7 += 0.2;
            }
            double d9 = this.method_18798().Z();
            double d10 = ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6) ? 0.2625 : 0.2975;
            if (d9 > d10) {
                d5 = Math.cos((double)this.method_36454() * Math.PI / 180.0);
                d4 = Math.sin((double)this.method_36454() * Math.PI / 180.0);
                n = 0;
                while ((double)n < 1.0 + d9 * 60.0) {
                    d3 = this.field_5974.z() * 2.0f - 1.0f;
                    d2 = (double)(this.field_5974.y(2) * 2 - 1) * 0.7;
                    if (this.field_5974.Z()) {
                        d = this.method_23317() - d5 * d3 * 0.8 + d4 * d2;
                        var18_29 = this.method_23321() - d4 * d3 * 0.8 - d5 * d2;
                        this.method_73183().method_8406((class07126)class07107.NT, d, this.method_23318() - 0.125, var18_29, this.method_18798().M, this.method_18798().B, this.method_18798().Z);
                    } else {
                        d = this.method_23317() + d5 + d4 * d3 * 0.7;
                        var18_29 = this.method_23321() + d4 - d5 * d3 * 0.7;
                        this.method_73183().method_8406((class07126)class07107.NT, d, this.method_23318() - 0.125, var18_29, this.method_18798().M, this.method_18798().B, this.method_18798().Z);
                    }
                    ++n;
                }
            }
            if (this.method_73183().method_8608() && !this.method_5782()) {
                if (this.e > 0) {
                    class08605 class086052 = this.K.field_55666;
                    d6 = this.method_23317() + (class086052.y.M - this.method_23317()) / (double)this.e;
                    double d11 = this.method_23318() + (class086052.y.B - this.method_23318()) / (double)this.e;
                    d3 = this.method_23321() + (class086052.y.Z - this.method_23321()) / (double)this.e;
                    d2 = this.method_36454() + class04995.R((float)(class086052.L - this.method_36454())) / (float)this.e;
                    d = this.method_36455() + (class086052.u - this.method_36455()) / (float)this.e;
                    --this.e;
                    this.method_5814(d6, d11, d3);
                    this.method_5710((float)d2, (float)d);
                } else {
                    this.method_5814(this.method_23317() + this.method_18798().M, this.method_23318() + this.method_18798().B, this.method_23321() + this.method_18798().Z);
                    if (this.method_24828()) {
                        this.method_18799(this.method_18798().L(0.5));
                    }
                    this.method_18799(this.method_18798().u(0.99, 0.95, 0.99));
                }
            } else {
                double d12;
                if (d7 < 1.0) {
                    d5 = d7 * 2.0 - 1.0;
                    this.method_18799(this.method_18798().y(0.0, 0.04 * d5, 0.0));
                } else {
                    if (this.method_18798().B < 0.0) {
                        this.method_18799(this.method_18798().u(1.0, 0.5, 1.0));
                    }
                    this.method_18799(this.method_18798().y(0.0, 0.007, 0.0));
                }
                if (this.method_5642() != null) {
                    class07438 class074382 = this.method_5642();
                    if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_5_2)) {
                        d6 = class074382.method_18798().M * this.V;
                        double d13 = class074382.method_18798().Z * this.V;
                        this.method_18799(this.method_18798().y(d6, 0.0, d13));
                    } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_6_4)) {
                        if (class074382.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() > 0.0f) {
                            d6 = -Math.sin((double)class074382.method_36454() * Math.PI / 180.0) * this.V * 0.05;
                            double d14 = Math.cos((double)class074382.method_36454() * Math.PI / 180.0) * this.V * 0.05;
                            this.method_18799(this.method_18798().y(d6, 0.0, d14));
                        }
                    } else {
                        float f = class074382.method_36454() - class074382.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue() * 90.0f;
                        d4 = -Math.sin((double)f * Math.PI / 180.0) * this.V * (double)class074382.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() * 0.05;
                        double d15 = Math.cos((double)f * Math.PI / 180.0) * this.V * (double)class074382.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() * 0.05;
                        this.method_18799(this.method_18798().y(d4, 0.0, d15));
                    }
                }
                if ((d12 = this.method_18798().Z()) > 0.35) {
                    d4 = 0.35 / d12;
                    this.method_18799(this.method_18798().u(d4, 1.0, d4));
                    d12 = 0.35;
                }
                if (d12 > d9 && this.V < 0.35) {
                    this.V += (0.35 - this.V) / 35.0;
                    if (this.V > 0.35) {
                        this.V = 0.35;
                    }
                } else {
                    this.V -= (this.V - 0.07) / 35.0;
                    if (this.V < 0.07) {
                        this.V = 0.07;
                    }
                }
                if (ProtocolTranslator.getTargetVersion().newerThan(LegacyProtocolVersion.r1_6_4)) {
                    for (int i = 0; i < 4; ++i) {
                        int n3 = class04995.N((double)(this.method_23317() + ((double)(i % 2) - 0.5) * 0.8));
                        n = class04995.N((double)(this.method_23321() + ((double)(i / 2) - 0.5) * 0.8));
                        for (int j = 0; j < 2; ++j) {
                            int n4 = class04995.N((double)this.method_23318()) + j;
                            class07209 class072093 = new class07209(n3, n4, n);
                            class00891 class008912 = this.method_73183().method_8320(class072093).i();
                            if (class008912 == class00869.is) {
                                this.method_73183().method_8501(class072093, class00869.N.W());
                                this.field_5976 = false;
                                continue;
                            }
                            if (class008912 != class00869.RS) continue;
                            this.method_73183().N(class072093, true);
                            this.field_5976 = false;
                        }
                    }
                }
                if (this.method_24828()) {
                    this.method_18799(this.method_18798().L(0.5));
                }
                this.method_5784(class07451.field_6308, this.method_18798());
                if (!this.field_5976 || d9 <= 0.2975) {
                    this.method_18799(this.method_18798().u(0.99, 0.95, 0.99));
                }
                this.method_36457(0.0f);
                double d16 = this.field_6014 - this.method_23317();
                double d17 = this.field_5969 - this.method_23321();
                if (d16 * d16 + d17 * d17 > 0.001) {
                    double d18 = class04995.N((double)class04995.i((double)(class04995.u((double)d17, (double)d16) * 180.0 / Math.PI - (double)this.method_36454())), (double)-20.0, (double)20.0);
                    this.method_36456((float)((double)this.method_36454() + d18));
                }
            }
        }
    }

    private void N(double d, boolean bl, class00500 class005002, class07209 class072092, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_6_4)) {
            callbackInfo.cancel();
            super.method_5623(d, bl, class005002, class072092);
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            this.w = class00274.field_7719;
        }
    }

    public float N(float f) {
        return class04995.B((float)f, (float)this.J, (float)this.I);
    }

    public boolean N(int n) {
        return (Boolean)this.field_6011.N(n == 0 ? B : Z) != false && this.method_5642() != null;
    }

    public float N(int n, float f) {
        if (this.N(n)) {
            return class04995.y((float)f, (float)(this.s[n] - 0.3926991f), (float)this.s[n]);
        }
        return 0.0f;
    }

    public void N(@Nullable class02592 class025922) {
        this.o = class025922;
    }

    public boolean N(class07049 class070492) {
        return class070492.method_17681() < this.method_17681();
    }

    protected abstract double N(class01325 var1);

    public void N(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.v = bl;
        this.n = bl2;
        this.t = bl3;
        this.G = bl4;
    }

    public void N(boolean bl, boolean bl2) {
        this.field_6011.N(B, (Object)bl);
        this.field_6011.N(Z, (Object)bl2);
    }

    protected @Nullable class04891 N() {
        return switch (this.T().ordinal()) {
            case 0, 1, 2 -> class04909.Ld;
            case 3 -> class04909.Ll;
            default -> null;
        };
    }

    public class06889 viaFabricPlus$getBoatVelocity() {
        return this.H;
    }

    public void viaFabricPlus$setBoatVelocity(class06889 class068892) {
        this.H = class068892;
    }

    public float R() {
        class00734 class007342 = this.method_5829();
        int n = class04995.N((double)class007342.N);
        int n2 = class04995.L((double)class007342.u);
        int n3 = class04995.N((double)class007342.i);
        int n4 = class04995.L((double)(class007342.i - this.Y));
        int n5 = class04995.N((double)class007342.L);
        int n6 = class04995.L((double)class007342.R);
        class07218 class072182 = new class07218();
        block0: for (int i = n3; i < n4; ++i) {
            float f = 0.0f;
            for (int j = n; j < n2; ++j) {
                for (int k = n5; k < n6; ++k) {
                    class072182.N(j, i, k);
                    class04688 class046882 = this.method_73183().method_8316((class07209)class072182);
                    if (class046882.N(class01231.N)) {
                        f = Math.max(f, class046882.N((class07290)this.method_73183(), (class07209)class072182));
                    }
                    if (f >= 1.0f) continue block0;
                }
            }
            if (!(f < 1.0f)) continue;
            return (float)class072182.method_10264() + f;
        }
        return n4 + 1;
    }

    public boolean aa_() {
        return true;
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.88f * this.method_17682()), (double)(0.64f * this.method_17681()));
    }

    public class06889[] ab_() {
        return class02607.N((class07049)this, (double)0.0, (double)0.64, (double)0.382, (double)0.88);
    }

    public @Nullable class02592 S_() {
        return this.o;
    }

    public void viaFabricPlus$setBoatInterpolationSteps(int n) {
        this.e = n;
    }
}

