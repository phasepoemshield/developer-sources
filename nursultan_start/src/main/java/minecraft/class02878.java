/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00679
 *  minecraft.class01083
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02058
 *  minecraft.class02265
 *  minecraft.class02730
 *  minecraft.class03662
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class07311
 *  minecraft.class07769
 *  minecraft.class08469
 *  minecraft.class08541
 *  minecraft.class08626
 *  minecraft.class08800
 *  minecraft.class08887
 *  minecraft.class08943
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00679;
import minecraft.class01083;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02058;
import minecraft.class02265;
import minecraft.class02730;
import minecraft.class03662;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class07311;
import minecraft.class07769;
import minecraft.class08469;
import minecraft.class08541;
import minecraft.class08626;
import minecraft.class08800;
import minecraft.class08887;
import minecraft.class08943;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class02878<T extends class00679>
extends class04507<T, class08469> {
    public static final int N = 5;
    public static final int y = 30;
    private final class08943 L;
    private final class01083 u;
    private final class01999 i;

    public class02878(class04832 class048322) {
        super(class048322);
        this.L = class048322.y();
        this.u = class048322.L();
        this.i = class048322.u();
    }

    private void N(class01237 class012372, class01421 class014212, class07311 class073112, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3, class00500 class005002) {
        class012372.submitBlockStateModel(class014212, class087432 -> class073112, class088872, f, f2, f3, n, n2, n3, (class07295)class02730.field_52611, class07209.field_10980, class005002);
    }

    private void N(class01237 class012372, class01421 class014212, class07311 class073112, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3, LocalRef localRef) {
        this.N(class012372, class014212, class073112, class088872, f, f2, f3, n, n2, n3, (class00500)localRef.get());
    }

    public void method_62354(T t, class08469 class084692, float f) {
        class07769 class077692;
        class02265 class022652;
        super.method_62354(t, (class08800)class084692, f);
        class084692.N = t.method_5735();
        class06584 class065842 = t.Z();
        this.L.N(class084692.y, class065842, class03662.field_4319, t);
        class084692.L = t.E();
        class084692.u = t.method_5864() == class07078.NU;
        class084692.i = null;
        if (!class065842.R() && (class022652 = t.N(class065842)) != null && (class077692 = t.method_73183().method_17891(class022652)) != null) {
            this.u.N(class022652, class077692, class084692.R);
            class084692.i = class022652;
        }
    }

    public class08469 method_55269() {
        return new class08469();
    }

    public void N(class08469 class084692, class01421 class014212, class01237 class012372, class06959 class069592, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().renderSettings.itemFrame) {
            callbackInfo.cancel();
        }
    }

    private void N(class00679 class006792, double d, CallbackInfoReturnable callbackInfoReturnable) {
        if (!SodiumExtraClientMod.options().renderSettings.itemFrameNameTag) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    protected int method_24087(T t, class07209 class072092) {
        if (t.method_5864() == class07078.NU) {
            return Math.max(5, super.method_24087(t, class072092));
        }
        return super.method_24087(t, class072092);
    }

    public void method_3936(class08469 class084692, class01421 class014212, class01237 class012372, class06959 class069592) {
        float f;
        float f2;
        super.method_3936((class08800)class084692, class014212, class012372, class069592);
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class084692, class014212, class012372, class069592, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class014212.N();
        class07211 class072112 = class084692.N;
        class06889 class068892 = this.method_23169(class084692);
        class014212.N(-class068892.N(), -class068892.y(), -class068892.L());
        double d = 0.46875;
        class014212.N((double)class072112.P() * 0.46875, (double)class072112.s() * 0.46875, (double)class072112.T() * 0.46875);
        if (class072112.z().L()) {
            f2 = 0.0f;
            f = 180.0f - class072112.U();
        } else {
            f2 = -90 * class072112.i().N();
            f = 180.0f;
        }
        class014212.N((Quaternionfc)class02058.y.N(f2));
        class014212.N((Quaternionfc)class02058.u.N(f));
        if (!class084692.v) {
            class00500 class005002 = class08541.N((boolean)class084692.u, (class084692.i != null ? 1 : 0) != 0);
            class08887 class088872 = this.i.N(class005002);
            class014212.N();
            class014212.N(-0.5f, -0.5f, -0.5f);
            int n = class084692.l;
            int n2 = class01384.u;
            int n3 = class084692.G;
            float f3 = 1.0f;
            float f4 = 1.0f;
            float f5 = 1.0f;
            class08887 class088873 = class088872;
            class07311 class073112 = class06851.i((class01894)class08626.N);
            class01421 class014213 = class014212;
            class01237 class012373 = class012372;
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init((Object)class005002);
            this.N(class012373, class014213, class073112, class088873, f5, f4, f3, n3, n2, n, (LocalRef)localRefImpl);
            class005002 = (class00500)localRefImpl.dispose();
            class014212.y();
        }
        if (class084692.v) {
            class014212.N(0.0f, 0.0f, 0.5f);
        } else {
            class014212.N(0.0f, 0.0f, 0.4375f);
        }
        if (class084692.i != null) {
            int n = class084692.L % 4 * 2;
            class014212.N((Quaternionfc)class02058.R.N((float)n * 360.0f / 8.0f));
            class014212.N((Quaternionfc)class02058.R.N(180.0f));
            float f6 = 0.0078125f;
            class014212.y(0.0078125f, 0.0078125f, 0.0078125f);
            class014212.N(-64.0f, -64.0f, 0.0f);
            class014212.N(0.0f, 0.0f, -1.0f);
            int n4 = this.N(class084692.u, 15728850, class084692.G);
            this.u.N(class084692.R, class014212, class012372, true, n4);
        } else if (!class084692.y.i()) {
            class014212.N((Quaternionfc)class02058.R.N((float)class084692.L * 360.0f / 8.0f));
            int n = this.N(class084692.u, 0xF000F0, class084692.G);
            class014212.y(0.5f, 0.5f, 0.5f);
            class084692.y.N(class014212, class012372, n, class01384.u, class084692.l);
        }
        class014212.y();
    }

    private int N(boolean bl, int n, int n2) {
        return bl ? n : n2;
    }

    public class06889 method_23169(class08469 class084692) {
        return new class06889((double)((float)class084692.N.P() * 0.3f), -0.25, (double)((float)class084692.N.T() * 0.3f));
    }

    protected class00392 method_62426(T t) {
        return t.Z().d();
    }

    protected boolean method_3921(T t, double d) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N((class00679)t, d, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return class06202.NB() && this.field_4676.L == t && t.Z().w() != null;
    }
}

