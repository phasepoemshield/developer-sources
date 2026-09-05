/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00980
 *  minecraft.class01127
 *  minecraft.class01138
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class04802
 *  minecraft.class04811
 *  minecraft.class04995
 *  minecraft.class05911
 *  minecraft.class05913
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07264
 *  minecraft.class08097
 *  minecraft.class08141
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00980;
import minecraft.class01127;
import minecraft.class01138;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class03358;
import minecraft.class04802;
import minecraft.class04811;
import minecraft.class04995;
import minecraft.class05911;
import minecraft.class05913;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07264;
import minecraft.class08097;
import minecraft.class08141;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03369
implements class03358<class07264, class00980> {
    public static final class05913 N = class05911.P.N("enchanting_table_book");
    private final class08097 y;
    private final class01127 L;

    public class03369(class04811 class048112) {
        this.y = class048112.B();
        this.L = new class01127(class048112.N(class04802.J));
    }

    public void N(class00980 class009802, class01421 class014212, class01237 class012372, class06959 class069592, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().renderSettings.enchantingTableBook) {
            callbackInfo.cancel();
        }
    }

    @Override
    public class00980 i() {
        return new class00980();
    }

    @Override
    public void N(class07264 class072642, class00980 class009802, float f, class06889 class068892, @Nullable class08141 class081412) {
        float f2;
        class03358.super.N(class072642, class009802, f, class068892, class081412);
        class009802.L = class04995.B((float)f, (float)class072642.L, (float)class072642.y);
        class009802.u = class04995.B((float)f, (float)class072642.M, (float)class072642.R);
        class009802.N = (float)class072642.N + f;
        for (f2 = class072642.B - class072642.Z; f2 >= (float)Math.PI; f2 -= (float)Math.PI * 2) {
        }
        while (f2 < (float)(-Math.PI)) {
            f2 += (float)Math.PI * 2;
        }
        class009802.y = class072642.Z + f2 * f;
    }

    @Override
    public void N(class00980 class009802, class01421 class014212, class01237 class012372, class06959 class069592) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class009802, class014212, class012372, class069592, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class014212.N();
        class014212.N(0.5f, 0.75f, 0.5f);
        class014212.N(0.0f, 0.1f + class04995.m((double)(class009802.N * 0.1f)) * 0.01f, 0.0f);
        float f = class009802.y;
        class014212.N((Quaternionfc)class02058.u.rotation(-f));
        class014212.N((Quaternionfc)class02058.R.N(80.0f));
        float f2 = class04995.M((float)(class009802.L + 0.25f)) * 1.6f - 0.3f;
        float f3 = class04995.M((float)(class009802.L + 0.75f)) * 1.6f - 0.3f;
        class01138 class011382 = new class01138(class009802.N, class04995.N((float)f2, (float)0.0f, (float)1.0f), class04995.N((float)f3, (float)0.0f, (float)1.0f), class009802.u);
        class012372.N((class06271)this.L, (Object)class011382, class014212, N.N(class06851::u), class009802.Z, class01384.u, -1, this.y.N(N), 0, class009802.z);
        class014212.y();
    }
}

