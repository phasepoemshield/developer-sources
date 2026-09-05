/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00250
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00674
 *  minecraft.class00741
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class04770
 *  minecraft.class04909
 *  minecraft.class06092
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
 *  minecraft.class07105
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07504
 *  minecraft.class08400
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00250;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00674;
import minecraft.class00741;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04770;
import minecraft.class04909;
import minecraft.class06092;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07504;
import minecraft.class08400;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01451
extends class00741 {
    public static final MapCodec<class01451> N = class01451.y(class01451::new);
    private static final double y = 0.13;
    private static final double L = 0.08;
    private static final double i = 0.05;
    private static final int R = 20;
    private static final class00494 M = class00891.y((double)14.0, (double)0.0, (double)15.0);
    private static final class00494 B;

    private static boolean L(class07049 class070492) {
        return class070492 instanceof class07438 || class070492 instanceof class07504 || class070492 instanceof class00674 || class070492 instanceof class00250;
    }

    private static double L(double d) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class01451.N(d, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueD();
        }
        return (d - 0.08) * (double)0.98f;
    }

    public class01451(class01362 class013622) {
        super(class013622);
    }

    public float Z() {
        return ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest) ? 0.8f : super.Z();
    }

    public float U() {
        return ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest) ? 0.6f : super.U();
    }

    public float z() {
        return ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest) ? 1.0f : super.z();
    }

    private void u(class07049 class070492) {
        class06889 class068892 = class070492.method_18798();
        if (class01451.y(class070492.method_18798().B) < -0.13) {
            double d = -0.05 / class01451.y(class070492.method_18798().B);
            class070492.method_18799(new class06889(class068892.M * d, class01451.L(-0.05), class068892.Z * d));
        } else {
            class070492.method_18799(new class06889(class068892.M, class01451.L(-0.05), class068892.Z));
        }
        class070492.method_38785();
    }

    public static void y(class07049 class070492) {
        class01451.N(class070492, 10);
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        class00494 class004942 = M;
        class00494 class004943 = class004942;
        class004943 = new CallbackInfoReturnable("", true, (Object)class004943);
        this.N(class005002, class072902, class072092, class060922, (CallbackInfoReturnable)class004943);
        if (class004943.isCancelled()) {
            return (class00494)class004943.getReturnValue();
        }
        return class004942;
    }

    private static double y(double d) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class01451.N(d, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueD();
        }
        return d / (double)0.98f + 0.08;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            callbackInfoReturnable.setReturnValue((Object)B);
        }
    }

    private static void N(double d, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            callbackInfoReturnable.setReturnValue((Object)d);
        }
    }

    private void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl, CallbackInfo callbackInfo) {
        if (!ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return;
        }
        callbackInfo.cancel();
        if (this.N(class072092, class070492)) {
            this.N(class072992, class070492);
        }
        class06889 class068892 = class070492.method_18798();
        class070492.method_18799(new class06889(class068892.M * (double)0.4f, Math.max((double)-0.12f, class068892.B), class068892.Z * (double)0.4f));
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, class07049 class070492) {
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            double d = Math.abs(class070492.method_18798().B);
            if (d < 0.1 && !class070492.method_21749()) {
                double d2 = 0.4 + d * 0.2;
                class070492.method_18799(class070492.method_18798().u(d2, 1.0, d2));
            }
        } else {
            super.N(class072992, class072092, class005002, class070492);
        }
    }

    private boolean N(class07209 class072092, class07049 class070492) {
        if (class070492.method_24828()) {
            return false;
        }
        if (class070492.method_23318() > (double)class072092.method_10264() + 0.9375 - 1.0E-7) {
            return false;
        }
        if (class01451.y(class070492.method_18798().B) >= -0.08) {
            return false;
        }
        double d = Math.abs((double)class072092.method_10263() + 0.5 - class070492.method_23317());
        double d2 = Math.abs((double)class072092.method_10260() + 0.5 - class070492.method_23321());
        double d3 = 0.4375 + (double)(class070492.method_17681() / 2.0f);
        return d + 1.0E-7 > d3 || d2 + 1.0E-7 > d3;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class005002, class072992, class072092, class070492, class084002, bl, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (this.N(class072092, class070492)) {
            this.N(class070492, class072092);
            this.u(class070492);
            this.N(class072992, class070492);
        }
        super.N(class005002, class072992, class072092, class070492, class084002, bl);
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, class07049 class070492, double d) {
        class070492.method_5783(class04909.Pd, 1.0f, 1.0f);
        if (!class072992.method_8608()) {
            class072992.method_8421(class070492, (byte)54);
        }
        if (class070492.method_5747(d, 0.2f, class072992.method_48963().E())) {
            class070492.method_5783(this.q.M(), this.q.N() * 0.5f, this.q.y() * 0.75f);
        }
    }

    public MapCodec<class01451> N() {
        return N;
    }

    private static void N(class07049 class070492, int n) {
        if (!class070492.method_73183().method_8608()) {
            return;
        }
        class00500 class005002 = class00869.TM.W();
        for (int i = 0; i < n; ++i) {
            class070492.method_73183().method_8406((class07126)new class07105(class07107.y, class005002), class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), 0.0, 0.0, 0.0);
        }
    }

    public static void N(class07049 class070492) {
        class01451.N(class070492, 5);
    }

    private void N(class07299 class072992, class07049 class070492) {
        if (class01451.L(class070492)) {
            if (class072992.field_9229.y(5) == 0) {
                class070492.method_5783(class04909.Pd, 1.0f, 1.0f);
            }
            if (!class072992.method_8608() && class072992.field_9229.y(5) == 0) {
                class072992.method_8421(class070492, (byte)53);
            }
        }
    }

    private void N(class07049 class070492, class07209 class072092) {
        if (class070492 instanceof class04770 && class070492.method_73183().N() % 20L == 0L) {
            class06912.e.N((class04770)class070492, class070492.method_73183().method_8320(class072092));
        }
    }
}

