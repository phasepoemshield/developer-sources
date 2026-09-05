/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06092
 *  minecraft.class06570
 *  minecraft.class06772
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07310
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06092;
import minecraft.class06570;
import minecraft.class06772;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07310;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06883
extends class06772 {
    public static final MapCodec<class06883> N = class06883.y(class06883::new);
    private static final class00494[] y = class00891.N((int)7, n -> class00891.y((double)16.0, (double)0.0, (double)(2 + n)));
    private static final class00494 L;

    public class06883(class01362 class013622) {
        super(class013622);
    }

    protected class07310 i() {
        return class06570.Gj;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (DebugSettings.INSTANCE.legacyCropOutlines.isEnabled()) {
            callbackInfoReturnable.setReturnValue((Object)L);
        }
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return y[this.U(class005002)];
    }

    public MapCodec<class06883> N() {
        return N;
    }
}

