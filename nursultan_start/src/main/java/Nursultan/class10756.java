/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01226
 *  minecraft.class01894
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07489
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package Nursultan;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class01226;
import minecraft.class01894;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07489;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class10756
extends class06937 {
    public class01894 L() {
        return class07489.N;
    }

    public class10756(class06695 class066952, int n, int n2, int n3) {
        super(class066952, n, n2, n3);
    }

    public static boolean y(class06584 class065842) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class10756.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return class065842.N(class01226.Nd);
    }

    public boolean N() {
        return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_8);
    }

    private static void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    public boolean N(class06584 class065842) {
        return class10756.y(class065842);
    }
}

