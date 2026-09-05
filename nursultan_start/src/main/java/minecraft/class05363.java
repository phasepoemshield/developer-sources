/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09305
 *  Nursultan.class09316
 *  Nursultan.class09329
 *  Nursultan.class11938
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00023
 *  minecraft.class00579
 *  minecraft.class00737
 *  minecraft.class00869
 *  minecraft.class01231
 *  minecraft.class02726
 *  minecraft.class04688
 *  minecraft.class04798
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05630
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07518
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09305;
import Nursultan.class09316;
import Nursultan.class09329;
import Nursultan.class11938;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import java.util.Arrays;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00023;
import minecraft.class00579;
import minecraft.class00737;
import minecraft.class00869;
import minecraft.class01231;
import minecraft.class02726;
import minecraft.class04688;
import minecraft.class04798;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05343;
import minecraft.class05630;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07518;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05363
implements class00023 {
    private static final float N = 4.0f;
    private static final Vector3f y = new Vector3f(0.0f, 0.0f, -1.0f);
    private static final Vector3f L = new Vector3f(0.0f, 1.0f, 0.0f);
    private static final Vector3f u = new Vector3f(-1.0f, 0.0f, 0.0f);
    private boolean i;
    private class07299 R;
    private class07049 M;
    private class06889 B = class06889.L;
    private final class07218 Z = new class07218();
    private final Vector3f z = new Vector3f((Vector3fc)y);
    private final Vector3f U = new Vector3f((Vector3fc)L);
    private final Vector3f E = new Vector3f((Vector3fc)u);
    private float W;
    private float m;
    private final Quaternionf P = new Quaternionf();
    private boolean s;
    private float T;
    private float b;
    private float j;
    private final class00579 v = new class00579();

    public void L() {
        this.N((CallbackInfo)null);
        if (this.M != null) {
            this.b = this.T;
            this.T += (this.M.method_5751() - this.T) * 0.5f;
            this.y(null);
            this.v.N(this.R, this.B);
        }
    }

    public Quaternionf M() {
        return this.P;
    }

    public Vector3fc P() {
        return this.U;
    }

    public void T() {
        this.R = null;
        this.M = null;
        this.v.N();
        this.i = false;
    }

    public class07049 B() {
        return this.M;
    }

    public boolean Z() {
        return this.i;
    }

    public float i() {
        return this.W;
    }

    public float b() {
        return this.j;
    }

    public Vector3fc s() {
        return this.E;
    }

    public Vector3fc m() {
        return this.z;
    }

    public class00579 U() {
        return this.v;
    }

    public boolean z() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.s;
    }

    public class07209 u() {
        return this.Z;
    }

    private void y(CallbackInfo callbackInfo) {
        if (VisualSettings.INSTANCE.sneakInstantly.isEnabled()) {
            this.T = this.b = this.M.method_5751();
        }
    }

    public class06889 y() {
        return this.B;
    }

    public class05343 E() {
        class06202 class062022 = class06202.Nq();
        double d = (double)class062022.Nt().U() / (double)class062022.Nt().E();
        double d2 = Math.tan((double)((float)((Integer)((class05630)class062022.i_7).Nw().method_41753()).intValue() * ((float)Math.PI / 180)) / 2.0) * (double)0.05f;
        double d3 = d2 * d;
        class06889 class068892 = new class06889((Vector3fc)this.z).L((double)0.05f);
        class06889 class068893 = new class06889((Vector3fc)this.E).L(d3);
        class06889 class068894 = new class06889((Vector3fc)this.U).L(d2);
        return new class05343(class068892, class068893, class068894);
    }

    public void N(class07299 class072992, class07049 class070492, boolean bl, boolean bl2, float f) {
        class02726 class027262;
        class07518 class075182;
        class07049 class070493;
        this.i = true;
        this.R = class072992;
        this.M = class070492;
        this.s = bl;
        this.j = f;
        if (class070492.method_5765() && (class070493 = class070492.method_5854()) instanceof class07518 && (class070493 = (class075182 = (class07518)class070493).N()) instanceof class02726 && (class027262 = (class02726)class070493).P()) {
            class070493 = class075182.method_52538(class070492).u(class075182.method_73189()).u(class070492.method_55668((class07049)class075182)).i(new class06889(0.0, (double)class04995.B((float)f, (float)this.b, (float)this.T), 0.0));
            this.N(class070492.method_5705(f), class070492.method_5695(f));
            this.N(class027262.i(f).i((class06889)class070493));
        } else {
            this.N(class070492.method_5705(f), class070492.method_5695(f));
            this.N(class04995.u((double)f, (double)class070492.field_6014, (double)class070492.method_23317()), class04995.u((double)f, (double)class070492.field_6036, (double)class070492.method_23318()) + (double)class04995.B((float)f, (float)this.b, (float)this.T), class04995.u((double)f, (double)class070492.field_5969, (double)class070492.method_23321()));
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.N(class072992, class070492, bl, bl2, f, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
        }
        if (bl) {
            class07049 class070494;
            if (bl2) {
                this.N(this.m + 180.0f, -this.W);
            }
            float f2 = 4.0f;
            float f3 = 1.0f;
            if (class070492 instanceof class07438) {
                class070493 = (class07438)class070492;
                f3 = class070493.method_55693();
                f2 = (float)class070493.method_45325(class05298.z);
            }
            float f4 = f3;
            float f5 = f2;
            if (class070492.method_5765() && (class070494 = class070492.method_5854()) instanceof class07438) {
                class07438 class074382 = (class07438)class070494;
                f4 = class074382.method_55693();
                f5 = (float)class074382.method_45325(class05298.z);
            }
            float f6 = Math.max(f3 * f2, f4 * f5);
            class05363 class053632 = this;
            this.N(-this.N(class053632, f6), 0.0f, 0.0f);
        } else if (class070492 instanceof class07438 && ((class07438)class070492).method_6113()) {
            class075182 = ((class07438)class070492).method_18401();
            this.N(class075182 != null ? class075182.U() - 180.0f : 0.0f, 0.0f);
            this.N(0.0f, 0.3f, 0.0f);
        }
    }

    private void N(class07299 class072992, class07049 class070492, boolean bl, boolean bl2, float f, CallbackInfo callbackInfo) {
        class09316 class093162 = class09316.N((float)class070492.method_5705(f), (float)class070492.method_5695(f), (double)class04995.u((double)f, (double)class070492.field_6014, (double)class070492.method_23317()), (double)(class04995.u((double)f, (double)class070492.field_6036, (double)class070492.method_23318()) + (double)class04995.B((float)f, (float)this.b, (float)this.T)), (double)class04995.u((double)f, (double)class070492.field_5969, (double)class070492.method_23321()));
        class11938.L().L((Object)class093162);
        if (class093162.y()) {
            callbackInfo.cancel();
        }
        this.N(class093162.i(), class093162.M());
        this.N(class093162.R(), class093162.L(), class093162.u());
    }

    public final float N(float f) {
        float f2 = 0.1f;
        for (int i = 0; i < 8; ++i) {
            float f3;
            class06889 class068892;
            float f4 = (i & 1) * 2 - 1;
            float f5 = (i >> 1 & 1) * 2 - 1;
            float f6 = (i >> 2 & 1) * 2 - 1;
            class06889 class068893 = this.B.y((double)(f4 * 0.1f), (double)(f5 * 0.1f), (double)(f6 * 0.1f));
            class06183 class061832 = this.R.N(new class05862(class068893, class068892 = class068893.i(new class06889((Vector3fc)this.z).L((double)(-f))), class05849.field_23142, class05835.field_1348, this.M));
            if (class061832.N() == class07113.field_1333 || !((f3 = (float)class061832.y().M(this.B)) < class04995.z((float)f))) continue;
            f = class04995.N((float)f3);
        }
        return f;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        class09305 class093052 = class09305.y((boolean)this.s);
        class11938.L().L((Object)class093052);
        callbackInfoReturnable.setReturnValue((Object)class093052.N());
    }

    private float N(class05363 class053632, float f) {
        class09329 class093292 = class09329.y((float)f);
        class11938.L().L((Object)class093292);
        f = class093292.y();
        if (!class093292.N()) {
            return f;
        }
        return class053632.N(f);
    }

    public void N(CallbackInfo callbackInfo) {
        if (SodiumExtraClientMod.options().extraSettings.instantSneak && this.M != null) {
            this.T = this.M.method_5751();
        }
    }

    protected void N(double d, double d2, double d3) {
        this.N(new class06889(d, d2, d3));
    }

    protected void N(float f, float f2) {
        this.W = f2;
        this.m = f;
        this.P.rotationYXZ((float)Math.PI - f * ((float)Math.PI / 180), -f2 * ((float)Math.PI / 180), 0.0f);
        y.rotate((Quaternionfc)this.P, this.z);
        L.rotate((Quaternionfc)this.P, this.U);
        u.rotate((Quaternionfc)this.P, this.E);
    }

    public float N() {
        return class04995.R((float)this.R());
    }

    protected void N(float f, float f2, float f3) {
        Vector3f vector3f = new Vector3f(f3, f2, -f).rotate((Quaternionfc)this.P);
        this.N(new class06889(this.B.M + (double)vector3f.x, this.B.B + (double)vector3f.y, this.B.Z + (double)vector3f.z));
    }

    protected void N(class06889 class068892) {
        this.B = class068892;
        this.Z.N(class068892.M, class068892.B, class068892.Z);
    }

    public class04798 W() {
        if (!this.i) {
            return class04798.field_27888;
        }
        class04688 class046882 = this.R.method_8316((class07209)this.Z);
        if (class046882.N(class01231.N) && this.B.B < (double)((float)this.Z.method_10264() + class046882.N((class07290)this.R, (class07209)this.Z))) {
            return class04798.field_27886;
        }
        class05343 class053432 = this.E();
        for (class06889 class068892 : Arrays.asList(class053432.N, class053432.N(), class053432.y(), class053432.L(), class053432.u())) {
            class06889 class068893 = this.B.i(class068892);
            class07209 class072092 = class07209.method_49638((class00737)class068893);
            class04688 class046883 = this.R.method_8316(class072092);
            if (class046883.N(class01231.y)) {
                if (!(class068893.B <= (double)(class046883.N((class07290)this.R, class072092) + (float)class072092.method_10264()))) continue;
                return class04798.field_27885;
            }
            if (!this.R.method_8320(class072092).N(class00869.ba)) continue;
            return class04798.field_27887;
        }
        return class04798.field_27888;
    }

    public float R() {
        return this.m;
    }
}

