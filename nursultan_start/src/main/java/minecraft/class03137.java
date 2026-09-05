/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00741
 *  minecraft.class01362
 *  minecraft.class06092
 *  minecraft.class07209
 *  minecraft.class07290
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00741;
import minecraft.class01362;
import minecraft.class06092;
import minecraft.class07209;
import minecraft.class07290;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03137
extends class00741 {
    public static final MapCodec<class03137> y = class03137.y(class03137::new);

    protected class00494 L(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return class00389.N();
    }

    public class03137(class01362 class013622) {
        super(class013622);
    }

    protected boolean y(class00500 class005002) {
        return true;
    }

    protected float y(class00500 class005002, class07290 class072902, class07209 class072092) {
        return 1.0f;
    }

    protected MapCodec<? extends class03137> N() {
        return y;
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            callbackInfoReturnable.setReturnValue((Object)this.y_4(class005002, class072902, class072092, class060922));
        }
    }
}

