/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00491
 *  minecraft.class00957
 *  minecraft.class00995
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class03575
 *  minecraft.class04995
 *  minecraft.class06563
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07299
 *  minecraft.class07311
 *  minecraft.class08141
 *  net.irisshaders.iris.Iris
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import minecraft.class00491;
import minecraft.class00957;
import minecraft.class00995;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class03334;
import minecraft.class03575;
import minecraft.class04995;
import minecraft.class06563;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07299;
import minecraft.class07311;
import minecraft.class08141;
import net.irisshaders.iris.Iris;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03363
extends class03334<class00491, class00957> {
    private static final class01894 L = class01894.y((String)"textures/entity/end_gateway_beam.png");

    @Override
    protected class07311 M() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class03363.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07311)callbackInfoReturnable.getReturnValue();
        }
        return class06851.T();
    }

    @Override
    protected float u() {
        return 1.0f;
    }

    @Override
    public class00957 i() {
        return new class00957();
    }

    @Override
    public void N(class00491 class004912, class00957 class009572, float f, class06889 class068892, @Nullable class08141 class081412) {
        super.N(class004912, class009572, f, class068892, class081412);
        class07299 class072992 = class004912.G();
        if (class004912.N() || class004912.L() && class072992 != null) {
            class009572.y = class004912.N() ? class004912.N(f) : class004912.y(f);
            double d = class004912.N() ? (double)class004912.G().method_31600() : 50.0;
            class009572.y = class04995.m((double)(class009572.y * (float)Math.PI));
            class009572.N = class04995.N((double)((double)class009572.y * d));
            class009572.L = class004912.N() ? class06563.field_7958.L() : class06563.field_7945.L();
            class009572.u = class004912.G() != null ? (float)Math.floorMod(class004912.G().N(), 40) + f : 0.0f;
        } else {
            class009572.N = 0;
        }
    }

    @Override
    public void N(class00957 class009572, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (class009572.N > 0) {
            class03575.N((class01421)class014212, (class01237)class012372, (class01894)L, (float)class009572.y, (float)class009572.u, (int)(-class009572.N), (int)(class009572.N * 2), (int)class009572.L, (float)0.15f, (float)0.175f);
        }
        super.N(class009572, class014212, class012372, class069592);
    }

    private static void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (Iris.getCurrentPack().isPresent()) {
            callbackInfoReturnable.setReturnValue((Object)class06851.u((class01894)class00995.y));
        }
    }

    @Override
    protected float R() {
        return 0.0f;
    }

    @Override
    public int u_() {
        return 256;
    }
}

