/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10987
 *  Nursultan.class11938
 *  minecraft.class00696
 *  minecraft.class01237
 *  minecraft.class01383
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01894
 *  minecraft.class04453
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06579
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07070
 *  minecraft.class07311
 *  minecraft.class08036
 *  minecraft.class08491
 *  minecraft.class08800
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10987;
import Nursultan.class11938;
import minecraft.class00696;
import minecraft.class01237;
import minecraft.class01383;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01894;
import minecraft.class04453;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06579;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07070;
import minecraft.class07311;
import minecraft.class08036;
import minecraft.class08491;
import minecraft.class08800;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03817
extends class04507<class00696, class08491> {
    private static final class01894 N = class01894.y((String)"textures/entity/fishing_hook.png");
    private static final class07311 y = class06851.R((class01894)N);
    private static final double L = 960.0;

    public class03817(class04832 class048322) {
        super(class048322);
    }

    public class08491 method_55269() {
        return new class08491();
    }

    public void method_62354(class00696 class006962, class08491 class084912, float f) {
        super.method_62354((class07049)class006962, (class08800)class084912, f);
        class08036 class080362 = class006962.L();
        if (class080362 == null) {
            class084912.N = class06889.L;
            return;
        }
        float f2 = class04995.m((double)(class04995.N((float)class080362.method_6055(f)) * (float)Math.PI));
        class06889 class068892 = this.N(class080362, f2, f);
        class06889 class068893 = class006962.method_30950(f).y(0.0, 0.25, 0.0);
        class084912.N = class068892.u(class068893);
    }

    protected boolean method_62406(class00696 class006962) {
        return false;
    }

    private void N(class00696 class006962, class01383 class013832, double d, double d2, double d3, CallbackInfoReturnable callbackInfoReturnable) {
        class10987 class109872 = class10987.N((class00696)class006962);
        class11938.L().L((Object)class109872);
        if (class109872.y()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    public boolean method_3933(class00696 class006962, class01383 class013832, double d, double d2, double d3) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class006962, class013832, d, d2, d3, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return super.method_3933((class07049)class006962, class013832, d, d2, d3) && class006962.L() != null;
    }

    private class06889 N(class08036 class080362, float f, float f2) {
        int n;
        int n2 = n = class03817.N(class080362) == class07070.field_6183 ? 1 : -1;
        if (!this.field_4676.u.NS().N() || class080362 != (class04453)class06202.Nq().T_4) {
            float f3 = class04995.B((float)f2, (float)class080362.fields_4212a028292fd3c078969e3ee4c71d9e8_1.floatValue(), (float)class080362.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue()) * ((float)Math.PI / 180);
            double d = class04995.m((double)f3);
            double d2 = class04995.P((double)f3);
            float f4 = class080362.method_55693();
            double d3 = (double)n * 0.35 * (double)f4;
            double d4 = 0.8 * (double)f4;
            float f5 = class080362.method_18276() ? -0.1875f : 0.0f;
            return class080362.method_5836(f2).y(-d2 * d3 - d * d4, (double)f5 - 0.45 * (double)f4, -d * d3 + d2 * d4);
        }
        double d = 960.0 / (double)((Integer)this.field_4676.u.Nw().method_41753()).intValue();
        class06889 class068892 = this.field_4676.y.E().N((float)n * 0.525f, -0.1f).L(d).y(f * 0.5f).N(-f * 0.7f);
        return class080362.method_5836(f2).i(class068892);
    }

    public static class07070 N(class08036 class080362) {
        return class080362.method_6047().B() instanceof class06579 ? class080362.method_6068() : class080362.method_6068().N();
    }

    public void method_3936(class08491 class084912, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.N();
        class014212.y(0.5f, 0.5f, 0.5f);
        class014212.N((Quaternionfc)class069592.i);
        class012372.N(class014212, y, (class014232, class013912) -> {
            class03817.N(class013912, class014232, class084912.G, 0.0f, 0, 0, 1);
            class03817.N(class013912, class014232, class084912.G, 1.0f, 0, 1, 1);
            class03817.N(class013912, class014232, class084912.G, 1.0f, 1, 1, 0);
            class03817.N(class013912, class014232, class084912.G, 0.0f, 1, 0, 0);
        });
        class014212.y();
        float f = (float)class084912.N.M;
        float f2 = (float)class084912.N.B;
        float f3 = (float)class084912.N.Z;
        float f4 = class06202.Nq().Nt().t();
        class012372.N(class014212, class06851.b(), (class014232, class013912) -> {
            int n = 16;
            for (int i = 0; i < 16; ++i) {
                float f5 = class03817.N(i, 16);
                float f6 = class03817.N(i + 1, 16);
                class03817.N(f, f2, f3, class013912, class014232, f5, f6, f4);
                class03817.N(f, f2, f3, class013912, class014232, f6, f5, f4);
            }
        });
        class014212.y();
        super.method_3936((class08800)class084912, class014212, class012372, class069592);
    }

    private static void N(float f, float f2, float f3, class01391 class013912, class01423 class014232, float f4, float f5, float f6) {
        float f7 = f * f4;
        float f8 = f2 * (f4 * f4 + f4) * 0.5f + 0.25f;
        float f9 = f3 * f4;
        float f10 = f * f5 - f7;
        float f11 = f2 * (f5 * f5 + f5) * 0.5f + 0.25f - f8;
        float f12 = f3 * f5 - f9;
        float f13 = class04995.N((float)(f10 * f10 + f11 * f11 + f12 * f12));
        class013912.N(class014232, f7, f8, f9).method_39415(-16777216).y(class014232, f10 /= f13, f11 /= f13, f12 /= f13).method_75298(f6);
    }

    private static void N(class01391 class013912, class01423 class014232, int n, float f, int n2, int n3, int n4) {
        class013912.N(class014232, f - 0.5f, (float)n2 - 0.5f, 0.0f).method_39415(-1).method_22913((float)n3, (float)n4).method_22922(class01384.u).method_60803(n).y(class014232, 0.0f, 1.0f, 0.0f);
    }

    private static float N(int n, int n2) {
        return (float)n / (float)n2;
    }
}

