/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00392
 *  minecraft.class01359
 *  minecraft.class01590
 *  minecraft.class04927
 *  minecraft.class06626
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package Nursultan;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00392;
import minecraft.class01359;
import minecraft.class01590;
import minecraft.class04927;
import minecraft.class06626;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class09469
extends class04927 {
    final /* synthetic */ class01359 N;

    public class09469(class01359 class013592, class01590 class015902, int n, int n2, int n3, int n4, class00392 class003922) {
        this.N = class013592;
        super(class015902, n, n2, n3, n4, class003922);
    }

    private void N(class06626 class066262, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            callbackInfoReturnable.setReturnValue((Object)super.method_25400(class066262));
        }
    }

    public boolean method_25400(class06626 class066262) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class066262, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (!class01359.N((class01359)this.N, (String)this.method_1882(), (int)class066262.L(), (int)this.method_1881())) {
            return false;
        }
        return super.method_25400(class066262);
    }
}

