/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00780
 *  minecraft.class03202
 *  minecraft.class07209
 *  minecraft.class07295
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00780;
import minecraft.class03202;
import minecraft.class07209;
import minecraft.class07295;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06229 {
    public static final class03202 N = class00780::N;
    public static final class03202 y = (class007802, d, d2) -> class007802.u();
    public static final class03202 L = (class007802, d, d2) -> class007802.u();
    public static final class03202 u = (class007802, d, d2) -> class007802.B();

    public static int L(class07295 class072952, class07209 class072092) {
        return class06229.N(class072952, class072092, L);
    }

    private static /* synthetic */ int L(class00780 class007802, double d, double d2) {
        return class007802.Z();
    }

    private static void L(CallbackInfoReturnable callbackInfoReturnable) {
        if (!SodiumExtraClientMod.options().detailSettings.biomeColors) {
            callbackInfoReturnable.setReturnValue((Object)5877296);
        }
    }

    public static int u(class07295 class072952, class07209 class072092) {
        int n = class06229.N(class072952, class072092, u);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, n);
        class06229.y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return n;
    }

    private static void y(CallbackInfoReturnable callbackInfoReturnable) {
        if (!SodiumExtraClientMod.options().detailSettings.biomeColors) {
            callbackInfoReturnable.setReturnValue((Object)4159204);
        }
    }

    public static int y(class07295 class072952, class07209 class072092) {
        int n = class06229.N(class072952, class072092, y);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, n);
        class06229.L(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return n;
    }

    private static void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (!SodiumExtraClientMod.options().detailSettings.biomeColors) {
            callbackInfoReturnable.setReturnValue((Object)9551193);
        }
    }

    private static int N(class07295 class072952, class07209 class072092, class03202 class032022) {
        return class072952.method_23752(class072092, class032022);
    }

    public static int N(class07295 class072952, class07209 class072092) {
        int n = class06229.N(class072952, class072092, N);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, n);
        class06229.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return n;
    }
}

