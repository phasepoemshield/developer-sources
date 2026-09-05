/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11528
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class11528;
import com.mojang.serialization.MapCodec;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08909;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public record class08914() implements class08909
{
    public static final MapCodec<class08914> N = MapCodec.unit((Object)new class08914());

    public MapCodec<class08914> N() {
        return N;
    }

    private void N(class06584 class065842, class03448 class034482, class07438 class074382, int n, class03662 class036622, CallbackInfoReturnable callbackInfoReturnable) {
        if (class074382 == (class04453)class06202.Nq().T_4 || !(class074382 instanceof class08036)) {
            return;
        }
        class08036 class080362 = (class08036)class074382;
        if (class065842.N(class06570.lo)) {
            callbackInfoReturnable.setReturnValue((Object)class11528.N((class08036)class080362, (boolean)false));
        }
    }

    public boolean method_65638(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class065842, class034482, class074382, n, class036622, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (class074382 == null) {
            return false;
        }
        return class074382.method_6115() && class074382.method_6030() == class065842;
    }
}

