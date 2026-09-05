/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  minecraft.class00494
 *  minecraft.class00500
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

public class class00899
extends class06772 {
    public static final MapCodec<class00899> N = class00899.y(class00899::new);
    private static final class00494[] y = class00891.N(7, n -> class00891.y(16.0, 0.0, 2 + n));
    private static final class00494 L;

    public class00899(class01362 class013622) {
        super(class013622);
    }

    protected class07310 i() {
        return class06570.Gb;
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

    public MapCodec<class00899> N() {
        return N;
    }
}

