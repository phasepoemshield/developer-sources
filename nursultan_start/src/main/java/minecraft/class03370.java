/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00483
 *  minecraft.class00500
 *  minecraft.class00510
 *  minecraft.class00513
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class00976
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class03556
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07942
 *  minecraft.class08083
 *  minecraft.class08092
 *  minecraft.class08141
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00483;
import minecraft.class00500;
import minecraft.class00510;
import minecraft.class00513;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class00976;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class03358;
import minecraft.class03556;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07942;
import minecraft.class08083;
import minecraft.class08092;
import minecraft.class08141;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03370
implements class03358<class00510, class00976> {
    public void N(class00976 class009762, class01421 class014212, class01237 class012372, class06959 class069592, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().renderSettings.piston) {
            callbackInfo.cancel();
        }
    }

    @Override
    public class00976 i() {
        return new class00976();
    }

    @Override
    public void N(class00510 class005102, class00976 class009762, float f, class06889 class068892, @Nullable class08141 class081412) {
        class03358.super.N(class005102, class009762, f, class068892, class081412);
        class009762.L = class005102.y(f);
        class009762.u = class005102.L(f);
        class009762.i = class005102.u(f);
        class009762.N = null;
        class009762.y = null;
        class00500 class005002 = class005102.M();
        class07299 class072992 = class005102.G();
        if (class072992 != null && !class005002.P()) {
            class07209 class072092 = class005102.d().method_10093(class005102.R().b());
            class03556 var9 = class072992.i(class072092);
            if (class005002.N(class00869.yK) && class005102.N(f) <= 4.0f) {
                class005002 = (class00500)class005002.y((class08092)class00483.u, (Comparable)Boolean.valueOf(class005102.N(f) <= 0.5f));
                class009762.N = class03370.N(class072092, class005002, (class03556<class00780>)var9, class072992);
            } else if (class005102.u() && !class005102.N()) {
                class08083 class080832 = class005002.N(class00869.yd) ? class08083.field_12634 : class08083.field_12637;
                class00500 class005003 = (class00500)((class00500)class00869.yK.W().y((class08092)class00483.L, (Comparable)class080832)).y((class08092)class00483.y, (Comparable)((class07211)class005002.L((class08092)class00513.y)));
                class005003 = (class00500)class005003.y((class08092)class00483.u, (Comparable)Boolean.valueOf(class005102.N(f) >= 0.5f));
                class009762.N = class03370.N(class072092, class005003, (class03556<class00780>)var9, class072992);
                class07209 class072093 = class072092.method_10093(class005102.R());
                class005002 = (class00500)class005002.y((class08092)class00513.L, (Comparable)Boolean.valueOf(true));
                class009762.y = class03370.N(class072093, class005002, (class03556<class00780>)var9, class072992);
            } else {
                class009762.N = class03370.N(class072092, class005002, (class03556<class00780>)var9, class072992);
            }
        }
    }

    @Override
    public void N(class00976 class009762, class01421 class014212, class01237 class012372, class06959 class069592) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class009762, class014212, class012372, class069592, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (class009762.N == null) {
            return;
        }
        class014212.N();
        class014212.N(class009762.L, class009762.u, class009762.i);
        class012372.N(class014212, class009762.N);
        class014212.y();
        if (class009762.y != null) {
            class012372.N(class014212, class009762.y);
        }
    }

    private static class07942 N(class07209 class072092, class00500 class005002, class03556<class00780> class035562, class07299 class072992) {
        class07942 class079422 = new class07942();
        class079422.N = class072092;
        class079422.y = class072092;
        class079422.L = class005002;
        class079422.u = class035562;
        class079422.i = class072992;
        return class079422;
    }

    @Override
    public int u_() {
        return 68;
    }
}

