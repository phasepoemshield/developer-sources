/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00245
 *  minecraft.class00392
 *  minecraft.class02484
 *  minecraft.class07050
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00245;
import minecraft.class00392;
import minecraft.class02484;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07438;
import minecraft.class08036;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06550
extends class06581 {
    public class06550(class06573 class065732) {
        super(class065732);
    }

    @Override
    public class07082 N(class06584 class065842, class08036 class080362, class07438 class074382, class07050 class070502) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class065842, class080362, class074382, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class00392 class003922 = (class00392)class065842.method_58694(class02484.B);
        if (class003922 != null && class074382.method_5864().N()) {
            if (!class080362.method_73183().method_8608() && class074382.method_5805()) {
                class074382.method_5665(class003922);
                if (class074382 instanceof class07079) {
                    ((class07079)class074382).NW();
                }
                class065842.B(1);
            }
            return class07082.N;
        }
        return class07082.i;
    }

    private void N(class06584 class065842, class08036 class080362, class07438 class074382, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4) && class074382 instanceof class00245) {
            callbackInfoReturnable.setReturnValue((Object)class07082.i);
        }
    }
}

