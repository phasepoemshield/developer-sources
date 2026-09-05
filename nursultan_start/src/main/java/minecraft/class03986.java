/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10993
 *  Nursultan.class11938
 *  minecraft.class03556
 *  minecraft.class04798
 *  minecraft.class07049
 *  minecraft.class07084
 *  minecraft.class07438
 *  minecraft.class09005
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10993;
import Nursultan.class11938;
import minecraft.class03556;
import minecraft.class04798;
import minecraft.class07049;
import minecraft.class07084;
import minecraft.class07438;
import minecraft.class09005;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class03986
extends class09005 {
    public abstract class03556<class07084> L();

    public boolean y() {
        return true;
    }

    public boolean N() {
        return false;
    }

    public boolean N(@Nullable class04798 class047982, class07049 class070492) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class03986.N(class047982, class070492, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return class070492 instanceof class07438 && ((class07438)class070492).method_6059(this.L());
    }

    private static void N(class04798 class047982, class07049 class070492, CallbackInfoReturnable callbackInfoReturnable) {
        class10993 class109932 = class10993.L();
        class11938.L().L((Object)class109932);
        if (class109932.y()) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}

