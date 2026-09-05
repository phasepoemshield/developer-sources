/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00394
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00956
 *  minecraft.class00985
 *  minecraft.class00986
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02566
 *  minecraft.class03358
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class08141
 *  minecraft.class08618
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import java.util.Objects;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00394;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00956;
import minecraft.class00985;
import minecraft.class00986;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02566;
import minecraft.class03358;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class08141;
import minecraft.class08618;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03575<T extends class00394>
implements class03358<T, class00956> {
    public static final class01894 N = class01894.y((String)"textures/entity/beacon_beam.png");
    public static final int y = 2048;
    private static final float i = 96.0f;
    public static final float L = 0.2f;
    public static final float u = 0.25f;
    private class00956 R;

    private void y(class01421 class014212, class01237 class012372, float f, float f2, int n, int n2, int n3) {
        if (n2 == 2048 && SodiumExtraClientMod.options().renderSettings.limitBeaconBeamHeight) {
            int n4 = this.R.R.method_10264() + n;
            n2 = Objects.requireNonNull((class03448)class06202.Nq().T_3).method_31600() - n4;
        }
        class03575.N(class014212, class012372, f, f2, n, n2, n3);
    }

    public boolean N(T t, class06889 class068892) {
        return class06889.y((class00753)t.d()).u(1.0, 0.0, 1.0).N((class00737)class068892.u(1.0, 0.0, 1.0), (double)this.u_());
    }

    private static void N(class01421 class014212, class01237 class012372, class01894 class018942, float f, float f2, int n, int n2, int n3, float f3, float f4, CallbackInfo callbackInfo) {
        if (ShadowRenderingState.areShadowsCurrentlyBeingRendered()) {
            callbackInfo.cancel();
        }
    }

    public void N(class00956 class009562, class01421 class014212, class01237 class012372, class06959 class069592, CallbackInfo callbackInfo) {
        this.R = class009562;
        if (!SodiumExtraClientMod.options().renderSettings.beaconBeam) {
            callbackInfo.cancel();
        }
    }

    public static void N(class01421 class014212, class01237 class012372, class01894 class018942, float f, float f2, int n, int n2, int n3, float f3, float f4) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class03575.N(class014212, class012372, class018942, f, f2, n, n2, n3, f3, f4, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        int n4 = n + n2;
        class014212.N();
        class014212.N(0.5, 0.0, 0.5);
        float f5 = n2 < 0 ? f2 : -f2;
        float f6 = class04995.M((float)(f5 * 0.2f - (float)class04995.y((float)(f5 * 0.1f))));
        class014212.N();
        class014212.N((Quaternionfc)class02058.u.N(f2 * 2.25f - 45.0f));
        float f7 = 0.0f;
        float f8 = f3;
        float f9 = f3;
        float f10 = 0.0f;
        float f11 = -f3;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = -f3;
        float f15 = 0.0f;
        float f16 = 1.0f;
        float f17 = -1.0f + f6;
        float f18 = (float)n2 * f * (0.5f / f3) + f17;
        class012372.N(class014212, class06851.i((class01894)class018942, (boolean)false), (class014232, class013912) -> class03575.N(class014232, class013912, n3, n, n4, 0.0f, f8, f9, 0.0f, f11, 0.0f, 0.0f, f14, 0.0f, 1.0f, f18, f17));
        class014212.y();
        f7 = -f4;
        f8 = -f4;
        f9 = f4;
        f10 = -f4;
        f11 = -f4;
        f12 = f4;
        f13 = f4;
        f14 = f4;
        f15 = 0.0f;
        f16 = 1.0f;
        f17 = -1.0f + f6;
        f18 = (float)n2 * f + f17;
        class012372.N(class014212, class06851.i((class01894)class018942, (boolean)true), (class014232, class013912) -> class03575.N(class014232, class013912, class02566.R((int)32, (int)n3), n, n4, f7, f8, f9, f10, f11, f12, f13, f14, 0.0f, 1.0f, f18, f17));
        class014212.y();
    }

    public class00956 i() {
        return new class00956();
    }

    public void N(class00956 class009562, class01421 class014212, class01237 class012372, class06959 class069592) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class009562, class014212, class012372, class069592, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        int n = 0;
        for (int i = 0; i < class009562.L.size(); ++i) {
            class00986 class009862 = (class00986)class009562.L.get(i);
            int n2 = class009862.N();
            int n3 = i == class009562.L.size() - 1 ? 2048 : class009862.y();
            int n4 = n;
            float f = class009562.N;
            float f2 = class009562.y;
            class01237 class012373 = class012372;
            class01421 class014213 = class014212;
            this.y(class014213, class012373, f2, f, n4, n3, n2);
            n += class009862.y();
        }
    }

    public static <T extends class00394> void N(T t, class00956 class009562, float f, class06889 class068892) {
        class009562.N = t.G() != null ? (float)Math.floorMod(t.G().N(), 40) + f : 0.0f;
        class009562.L = ((class08618)t).N().stream().map(class086332 -> new class00986(class086332.y(), class086332.L())).toList();
        float f2 = (float)class068892.u(class009562.R.method_46558()).Z();
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        class009562.y = class044532 != null && class044532.method_31550() ? 1.0f : Math.max(1.0f, f2 / 96.0f);
    }

    public void N(T t, class00956 class009562, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N(t, (class00985)class009562, f, class068892, class081412);
        class03575.N(t, class009562, f, class068892);
    }

    private static void N(class01421 class014212, class01237 class012372, float f, float f2, int n, int n2, int n3) {
        class03575.N(class014212, class012372, N, 1.0f, f2, n, n2, n3, 0.2f * f, 0.25f * f);
    }

    private static void N(class01423 class014232, class01391 class013912, int n, int n2, float f, float f2, float f3, float f4) {
        class013912.N(class014232, f, (float)n2, f2).method_39415(n).method_22913(f3, f4).method_22922(class01384.u).method_60803(0xF000F0).y(class014232, 0.0f, 1.0f, 0.0f);
    }

    private static void N(class01423 class014232, class01391 class013912, int n, int n2, int n3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        class03575.N(class014232, class013912, n, n3, f, f2, f6, f7);
        class03575.N(class014232, class013912, n, n2, f, f2, f6, f8);
        class03575.N(class014232, class013912, n, n2, f3, f4, f5, f8);
        class03575.N(class014232, class013912, n, n3, f3, f4, f5, f7);
    }

    private static void N(class01423 class014232, class01391 class013912, int n, int n2, int n3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        class03575.N(class014232, class013912, n, n2, n3, f, f2, f3, f4, f9, f10, f11, f12);
        class03575.N(class014232, class013912, n, n2, n3, f7, f8, f5, f6, f9, f10, f11, f12);
        class03575.N(class014232, class013912, n, n2, n3, f3, f4, f7, f8, f9, f10, f11, f12);
        class03575.N(class014232, class013912, n, n2, n3, f5, f6, f, f2, f9, f10, f11, f12);
    }

    public int u_() {
        return ((class05630)class06202.Nq().i_7).Nh() * 16;
    }

    public boolean t_() {
        return true;
    }
}

